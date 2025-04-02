// Generated from C:/Users/wangz/IdeaProjects/riddle-idea/src/main/resources/antlr/RiddleParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RiddleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RiddleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#null_cnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_cnt(RiddleParser.Null_cntContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#statement_ed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_ed(RiddleParser.Statement_edContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RiddleParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#bodyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyExpr(RiddleParser.BodyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#packStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackStatement(RiddleParser.PackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(RiddleParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#varDefineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefineStatement(RiddleParser.VarDefineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#argsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExpr(RiddleParser.ArgsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#defineArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineArgs(RiddleParser.DefineArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(RiddleParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(RiddleParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(RiddleParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(RiddleParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(RiddleParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(RiddleParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(RiddleParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(RiddleParser.TryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#catchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchExpr(RiddleParser.CatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(RiddleParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(RiddleParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blendExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlendExpr(RiddleParser.BlendExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#exprPtrParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPtrParser(RiddleParser.ExprPtrParserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfSubRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfSubRightExpr(RiddleParser.SelfSubRightExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAssignExpr(RiddleParser.AndAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadExpr(RiddleParser.LoadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(RiddleParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModExpr(RiddleParser.ModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(RiddleParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLShrExpr(RiddleParser.LShrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpr(RiddleParser.NegativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(RiddleParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAssignExpr(RiddleParser.MulAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorAssignExpr(RiddleParser.XorAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(RiddleParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqualExpr(RiddleParser.GreaterEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAssignExpr(RiddleParser.AddAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAssignExpr(RiddleParser.OrAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitXorExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitXorExpr(RiddleParser.BitXorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ptrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrExpr(RiddleParser.PtrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(RiddleParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterExpr(RiddleParser.GreaterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivAssignExpr(RiddleParser.DivAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(RiddleParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualExpr(RiddleParser.NotEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfSubLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfSubLeftExpr(RiddleParser.SelfSubLeftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(RiddleParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAndExpr(RiddleParser.BitAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(RiddleParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfAddRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfAddRightExpr(RiddleParser.SelfAddRightExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAssignExpr(RiddleParser.SubAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharExpr(RiddleParser.CharExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(RiddleParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(RiddleParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAShrExpr(RiddleParser.AShrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessExpr(RiddleParser.LessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(RiddleParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfAddLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfAddLeftExpr(RiddleParser.SelfAddLeftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLShrAssignExpr(RiddleParser.LShrAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualExpr(RiddleParser.LessEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAShrAssignExpr(RiddleParser.AShrAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOrExpr(RiddleParser.BitOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(RiddleParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(RiddleParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shlAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShlAssignExpr(RiddleParser.ShlAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModAssignExpr(RiddleParser.ModAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positiveExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveExpr(RiddleParser.PositiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shlExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShlExpr(RiddleParser.ShlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpr(RiddleParser.EqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(RiddleParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBlend}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBlend(RiddleParser.ExprBlendContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(RiddleParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(RiddleParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(RiddleParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(RiddleParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(RiddleParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(RiddleParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(RiddleParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tmpleDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmpleDefine(RiddleParser.TmpleDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tmplDefineArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplDefineArg(RiddleParser.TmplDefineArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tmplUsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplUsed(RiddleParser.TmplUsedContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tmplArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplArg(RiddleParser.TmplArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#tmplArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplArgList(RiddleParser.TmplArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(RiddleParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tmplType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplType(RiddleParser.TmplTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(RiddleParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(RiddleParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiddleParser#propertyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyItem(RiddleParser.PropertyItemContext ctx);
}