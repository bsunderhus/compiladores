// Generated from hello.g4 by ANTLR 4.5.2
// jshint ignore: start
var antlr4 = require('antlr4/index');
var helloListener = require('./helloListener').helloListener;
var grammarFileName = "hello.g4";

var serializedATN = ["\u0003\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd",
    "\u0003\u0005\b\u0004\u0002\t\u0002\u0003\u0002\u0003\u0002\u0003\u0002",
    "\u0003\u0002\u0002\u0002\u0003\u0002\u0002\u0002\u0006\u0002\u0004\u0003",
    "\u0002\u0002\u0002\u0004\u0005\u0007\u0003\u0002\u0002\u0005\u0006\u0007",
    "\u0004\u0002\u0002\u0006\u0003\u0003\u0002\u0002\u0002\u0002"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'hello'" ];

var symbolicNames = [ null, null, "ID", "WS" ];

var ruleNames =  [ "r" ];

function helloParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

helloParser.prototype = Object.create(antlr4.Parser.prototype);
helloParser.prototype.constructor = helloParser;

Object.defineProperty(helloParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

helloParser.EOF = antlr4.Token.EOF;
helloParser.T__0 = 1;
helloParser.ID = 2;
helloParser.WS = 3;

helloParser.RULE_r = 0;

function RContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = helloParser.RULE_r;
    return this;
}

RContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
RContext.prototype.constructor = RContext;

RContext.prototype.ID = function() {
    return this.getToken(helloParser.ID, 0);
};

RContext.prototype.enterRule = function(listener) {
    if(listener instanceof helloListener ) {
        listener.enterR(this);
	}
};

RContext.prototype.exitRule = function(listener) {
    if(listener instanceof helloListener ) {
        listener.exitR(this);
	}
};




helloParser.RContext = RContext;

helloParser.prototype.r = function() {

    var localctx = new RContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, helloParser.RULE_r);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 2;
        this.match(helloParser.T__0);
        this.state = 3;
        this.match(helloParser.ID);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.helloParser = helloParser;
