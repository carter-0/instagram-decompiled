package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.IGt  reason: case insensitive filesystem */
public abstract class C56898IGt implements C59658JSc {
    public InputConnection A00;
    public final 0sP A01;

    public final boolean beginBatchEdit() {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    public final boolean clearMetaKeyStates(int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i);
        }
        return false;
    }

    public final void closeConnection() {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            inputConnection.closeConnection();
            this.A00 = null;
            this.A01.invoke(this);
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i);
        }
        return false;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i, i2);
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    public final boolean endBatchEdit() {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    public final boolean finishComposingText() {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    public final int getCursorCapsMode(int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i);
        }
        return 0;
    }

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.A00;
        if (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i)) == null) {
            return new ExtractedText();
        }
        return extractedText;
    }

    public final Handler getHandler() {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }

    public final CharSequence getSelectedText(int i) {
        CharSequence selectedText;
        InputConnection inputConnection = this.A00;
        if (inputConnection == null || (selectedText = inputConnection.getSelectedText(i)) == null) {
            return "";
        }
        return selectedText;
    }

    public final CharSequence getTextAfterCursor(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i, i2);
        }
        return null;
    }

    public final CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    public final boolean performContextMenuAction(int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i);
        }
        return false;
    }

    public final boolean performEditorAction(int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i);
        }
        return false;
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    public final boolean reportFullscreenMode(boolean z) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z);
        }
        return false;
    }

    public final boolean requestCursorUpdates(int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i);
        }
        return false;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    public final boolean setComposingRegion(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i, i2);
        }
        return false;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i);
        }
        return false;
    }

    public final boolean setSelection(int i, int i2) {
        InputConnection inputConnection = this.A00;
        if (inputConnection != null) {
            return inputConnection.setSelection(i, i2);
        }
        return false;
    }

    public C56898IGt(InputConnection inputConnection, 0sP r2) {
        this.A01 = r2;
        this.A00 = inputConnection;
    }
}
