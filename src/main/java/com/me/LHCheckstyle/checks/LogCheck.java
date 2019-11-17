package com.me.LHCheckstyle.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileText;

public class LogCheck extends AbstractCheck {

    @Override
    public int[] getDefaultTokens() {
        return new int[0];
    }

    @Override
    public int[] getAcceptableTokens() {
        return new int[0];
    }

    @Override
    public int[] getRequiredTokens() {
        return new int[0];
    }

    @Override
    public void beginTree(DetailAST rootAST) {
        int lineNo = 0;
        FileText fileText = getFileContents().getText();
        for (int index = 0; index < fileText.size(); index++) {
            final String line = fileText.get(index);
            lineNo++;
            log(lineNo, "hihi");
        }
    }

    @Override
    public void visitToken(DetailAST ast) {
        throw new IllegalStateException("visitToken() shouldn't be called.");
    }
}
