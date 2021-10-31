public class Visitor extends calcBaseVisitor<Void> {
    private double nodeValue = 0.0;

    @Override
    public Void visitCalculator(calcParser.CalculatorContext ctx) {
        // 调用默认的 visit 方法即可
        return super.visitCalculator(ctx);
    }

    @Override
    public Void visitLine(calcParser.LineContext ctx) {
        // visit expr 对应的子节点，输出 nodeValue
        visit(ctx.expr());
        System.out.println(" = " + nodeValue);
        return null;
    }

    @Override
    public Void visitExpr(calcParser.ExprContext ctx) {
        switch (ctx.children.size()) {
            case 1: {
                // 有 1 个子节点，表示匹配的规则是 expr -> term，直接 visit term 对应的子节点
                visit(ctx.term());
            }
            case 3: {
                // 有 3 个子节点，表示匹配的规则是 expr -> expr ADD term | expr SUB term
                // visit expr 和 term 对应的子节点，获取节点对应的值，根据运算符是 ADD 或 SUB 进行不同运算
                double lhs = 0.0, rhs = 0.0, result = 0.0;

                visit(ctx.expr());
                lhs = nodeValue;

                visit(ctx.term());
                rhs = nodeValue;

                if (ctx.ADD() != null) {
                    result = lhs + rhs;
                } else {
                    result = lhs - rhs;
                }

                nodeValue = result;
            }
        }
        return null;
    }

    @Override
    public Void visitTerm(calcParser.TermContext ctx) {
        switch (ctx.children.size()) {
            case 1: {
                // 有 1 个子节点，表示匹配的规则是 term -> factor，直接 visit factor 对应的子节点
                visit(ctx.factor());
            }
            case 3: {
                // 有 3 个子节点，表示匹配的规则是 term -> term MUL factor | term DIV factor
                // visit term 和 factor 对应的子节点，获取节点对应的值，根据运算符是 MUL 或 DIV 进行不同运算
                double lhs = 0.0, rhs = 0.0, result = 0.0;

                visit(ctx.term());
                lhs = nodeValue;

                visit(ctx.factor());
                rhs = nodeValue;

                if (ctx.MUL() != null) {
                    result = lhs * rhs;
                } else {
                    result = lhs / rhs;
                }

                nodeValue = result;
            }
        }
        return null;
    }

    @Override
    public Void visitFactor(calcParser.FactorContext ctx) {
        switch (ctx.children.size()) {
            case 1: {
                // 有 1 个子节点，表示匹配的规则是 factor -> NUMBER，将 NUMBER 对应的字符串转换成数字
                nodeValue = Double.parseDouble(ctx.NUMBER().getText());
            }
            case 3: {
                // 有 3 个子节点，表示匹配的规则是 factor -> LPAREN expr RPAREN，直接 visit expr 对应的子节点
                visit(ctx.expr());
            }
        }
        return null;
    }
}
