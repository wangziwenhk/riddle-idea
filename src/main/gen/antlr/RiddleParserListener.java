// Generated from C:/Users/wangz/IdeaProjects/riddle-idea/src/main/resources/antlr/RiddleParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RiddleParser}.
 */
public interface RiddleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RiddleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#null_cnt}.
	 * @param ctx the parse tree
	 */
	void enterNull_cnt(RiddleParser.Null_cntContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#null_cnt}.
	 * @param ctx the parse tree
	 */
	void exitNull_cnt(RiddleParser.Null_cntContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#statement_ed}.
	 * @param ctx the parse tree
	 */
	void enterStatement_ed(RiddleParser.Statement_edContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#statement_ed}.
	 * @param ctx the parse tree
	 */
	void exitStatement_ed(RiddleParser.Statement_edContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RiddleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RiddleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#bodyExpr}.
	 * @param ctx the parse tree
	 */
	void enterBodyExpr(RiddleParser.BodyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#bodyExpr}.
	 * @param ctx the parse tree
	 */
	void exitBodyExpr(RiddleParser.BodyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#packStatement}.
	 * @param ctx the parse tree
	 */
	void enterPackStatement(RiddleParser.PackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#packStatement}.
	 * @param ctx the parse tree
	 */
	void exitPackStatement(RiddleParser.PackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(RiddleParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(RiddleParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#varDefineStatement}.
	 * @param ctx the parse tree
	 */
	void enterVarDefineStatement(RiddleParser.VarDefineStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#varDefineStatement}.
	 * @param ctx the parse tree
	 */
	void exitVarDefineStatement(RiddleParser.VarDefineStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#argsExpr}.
	 * @param ctx the parse tree
	 */
	void enterArgsExpr(RiddleParser.ArgsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#argsExpr}.
	 * @param ctx the parse tree
	 */
	void exitArgsExpr(RiddleParser.ArgsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#defineArgs}.
	 * @param ctx the parse tree
	 */
	void enterDefineArgs(RiddleParser.DefineArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#defineArgs}.
	 * @param ctx the parse tree
	 */
	void exitDefineArgs(RiddleParser.DefineArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#funcDefine}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefine(RiddleParser.FuncDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(RiddleParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(RiddleParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(RiddleParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(RiddleParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(RiddleParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(RiddleParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(RiddleParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(RiddleParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RiddleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RiddleParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(RiddleParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(RiddleParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(RiddleParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(RiddleParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(RiddleParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(RiddleParser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#catchExpr}.
	 * @param ctx the parse tree
	 */
	void enterCatchExpr(RiddleParser.CatchExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#catchExpr}.
	 * @param ctx the parse tree
	 */
	void exitCatchExpr(RiddleParser.CatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(RiddleParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(RiddleParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(RiddleParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(RiddleParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blendExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void enterBlendExpr(RiddleParser.BlendExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blendExpr}
	 * labeled alternative in {@link RiddleParser#exprPtr}.
	 * @param ctx the parse tree
	 */
	void exitBlendExpr(RiddleParser.BlendExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#exprPtrParser}.
	 * @param ctx the parse tree
	 */
	void enterExprPtrParser(RiddleParser.ExprPtrParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#exprPtrParser}.
	 * @param ctx the parse tree
	 */
	void exitExprPtrParser(RiddleParser.ExprPtrParserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfSubRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelfSubRightExpr(RiddleParser.SelfSubRightExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfSubRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelfSubRightExpr(RiddleParser.SelfSubRightExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndAssignExpr(RiddleParser.AndAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndAssignExpr(RiddleParser.AndAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLoadExpr(RiddleParser.LoadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLoadExpr(RiddleParser.LoadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(RiddleParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(RiddleParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(RiddleParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(RiddleParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(RiddleParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(RiddleParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLShrExpr(RiddleParser.LShrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLShrExpr(RiddleParser.LShrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExpr(RiddleParser.NegativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExpr(RiddleParser.NegativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(RiddleParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(RiddleParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulAssignExpr(RiddleParser.MulAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulAssignExpr(RiddleParser.MulAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterXorAssignExpr(RiddleParser.XorAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitXorAssignExpr(RiddleParser.XorAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(RiddleParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(RiddleParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqualExpr(RiddleParser.GreaterEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqualExpr(RiddleParser.GreaterEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddAssignExpr(RiddleParser.AddAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddAssignExpr(RiddleParser.AddAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrAssignExpr(RiddleParser.OrAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrAssignExpr(RiddleParser.OrAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitXorExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitXorExpr(RiddleParser.BitXorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitXorExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitXorExpr(RiddleParser.BitXorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ptrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPtrExpr(RiddleParser.PtrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPtrExpr(RiddleParser.PtrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(RiddleParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(RiddleParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExpr(RiddleParser.GreaterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExpr(RiddleParser.GreaterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivAssignExpr(RiddleParser.DivAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivAssignExpr(RiddleParser.DivAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(RiddleParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(RiddleParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(RiddleParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(RiddleParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfSubLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelfSubLeftExpr(RiddleParser.SelfSubLeftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfSubLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelfSubLeftExpr(RiddleParser.SelfSubLeftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(RiddleParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(RiddleParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpr(RiddleParser.BitAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitAndExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpr(RiddleParser.BitAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(RiddleParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(RiddleParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfAddRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelfAddRightExpr(RiddleParser.SelfAddRightExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfAddRightExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelfAddRightExpr(RiddleParser.SelfAddRightExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubAssignExpr(RiddleParser.SubAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubAssignExpr(RiddleParser.SubAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpr(RiddleParser.CharExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpr(RiddleParser.CharExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(RiddleParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(RiddleParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(RiddleParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(RiddleParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAShrExpr(RiddleParser.AShrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aShrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAShrExpr(RiddleParser.AShrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessExpr(RiddleParser.LessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessExpr(RiddleParser.LessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(RiddleParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(RiddleParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfAddLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSelfAddLeftExpr(RiddleParser.SelfAddLeftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfAddLeftExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSelfAddLeftExpr(RiddleParser.SelfAddLeftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLShrAssignExpr(RiddleParser.LShrAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLShrAssignExpr(RiddleParser.LShrAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqualExpr(RiddleParser.LessEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqualExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqualExpr(RiddleParser.LessEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAShrAssignExpr(RiddleParser.AShrAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aShrAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAShrAssignExpr(RiddleParser.AShrAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpr(RiddleParser.BitOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitOrExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpr(RiddleParser.BitOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(RiddleParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(RiddleParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(RiddleParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(RiddleParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shlAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShlAssignExpr(RiddleParser.ShlAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shlAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShlAssignExpr(RiddleParser.ShlAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModAssignExpr(RiddleParser.ModAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modAssignExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModAssignExpr(RiddleParser.ModAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positiveExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPositiveExpr(RiddleParser.PositiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positiveExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPositiveExpr(RiddleParser.PositiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shlExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterShlExpr(RiddleParser.ShlExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shlExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitShlExpr(RiddleParser.ShlExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpr(RiddleParser.EqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpr(RiddleParser.EqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(RiddleParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(RiddleParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBlend}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBlend(RiddleParser.ExprBlendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBlend}
	 * labeled alternative in {@link RiddleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBlend(RiddleParser.ExprBlendContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RiddleParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RiddleParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(RiddleParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(RiddleParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(RiddleParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(RiddleParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(RiddleParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(RiddleParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(RiddleParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(RiddleParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(RiddleParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(RiddleParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(RiddleParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(RiddleParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tmpleDefine}.
	 * @param ctx the parse tree
	 */
	void enterTmpleDefine(RiddleParser.TmpleDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tmpleDefine}.
	 * @param ctx the parse tree
	 */
	void exitTmpleDefine(RiddleParser.TmpleDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tmplDefineArg}.
	 * @param ctx the parse tree
	 */
	void enterTmplDefineArg(RiddleParser.TmplDefineArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tmplDefineArg}.
	 * @param ctx the parse tree
	 */
	void exitTmplDefineArg(RiddleParser.TmplDefineArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tmplUsed}.
	 * @param ctx the parse tree
	 */
	void enterTmplUsed(RiddleParser.TmplUsedContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tmplUsed}.
	 * @param ctx the parse tree
	 */
	void exitTmplUsed(RiddleParser.TmplUsedContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tmplArg}.
	 * @param ctx the parse tree
	 */
	void enterTmplArg(RiddleParser.TmplArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tmplArg}.
	 * @param ctx the parse tree
	 */
	void exitTmplArg(RiddleParser.TmplArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#tmplArgList}.
	 * @param ctx the parse tree
	 */
	void enterTmplArgList(RiddleParser.TmplArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#tmplArgList}.
	 * @param ctx the parse tree
	 */
	void exitTmplArgList(RiddleParser.TmplArgListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(RiddleParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(RiddleParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tmplType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void enterTmplType(RiddleParser.TmplTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tmplType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void exitTmplType(RiddleParser.TmplTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(RiddleParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseType}
	 * labeled alternative in {@link RiddleParser#typeUsed}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(RiddleParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(RiddleParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(RiddleParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiddleParser#propertyItem}.
	 * @param ctx the parse tree
	 */
	void enterPropertyItem(RiddleParser.PropertyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiddleParser#propertyItem}.
	 * @param ctx the parse tree
	 */
	void exitPropertyItem(RiddleParser.PropertyItemContext ctx);
}