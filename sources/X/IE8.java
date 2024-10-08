package X;

import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.text.input.ImeAction;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

public final class IE8 implements InputConnection {
    public int A00;
    public int A01;
    public C285975Tl A02;
    public boolean A03;
    public boolean A04 = true;
    public final C52754Gc7 A05;
    public final JLK A06;
    public final C52693Gb5 A07;
    public final AnonymousClass5RG A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final boolean A0A;

    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = 0;
        if ((i & 1) == 0) {
            z = false;
        }
        this.A03 = z;
        if (z) {
            if (extractedTextRequest != null) {
                i2 = extractedTextRequest.token;
            }
            this.A01 = i2;
        }
        return C51976G9y.A09(this.A02);
    }

    public final Handler getHandler() {
        return null;
    }

    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    public static final void A00(IE8 ie8, JNY jny) {
        ie8.A00++;
        try {
            ie8.A09.add(jny);
        } finally {
            ie8.A01();
        }
    }

    private final boolean A01() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            List list = this.A09;
            if (AnonymousClass7TE.A1b(list)) {
                ((C56853IFa) this.A06).A00.A07.invoke(AnonymousClass7TE.A1D(list));
                list.clear();
            }
        }
        if (this.A00 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean beginBatchEdit() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        this.A00++;
        return true;
    }

    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final void closeConnection() {
        this.A09.clear();
        this.A00 = 0;
        this.A04 = false;
        List list = ((C56853IFa) this.A06).A00.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (0qQ.A0K(((Reference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return false;
        }
        return z;
    }

    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.A04;
        if (z) {
            return this.A0A;
        }
        return z;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C56896IGr(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C56891IGm(i, i2));
        return true;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C56892IGn(i, i2));
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.JNY, java.lang.Object] */
    public final boolean finishComposingText() {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new Object());
        return true;
    }

    public final int getCursorCapsMode(int i) {
        C285975Tl r1 = this.A02;
        return TextUtils.getCapsMode(r1.A01.A00, C285965Tk.A01(r1.A00), i);
    }

    public final CharSequence getSelectedText(int i) {
        C285975Tl r1 = this.A02;
        long j = r1.A00;
        if (C285965Tk.A03(j)) {
            return null;
        }
        return r1.A01.subSequence(C285965Tk.A01(j), C285965Tk.A00(j)).toString();
    }

    public final CharSequence getTextAfterCursor(int i, int i2) {
        return C56172Hu1.A00(this.A02, i).toString();
    }

    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return C56172Hu1.A01(this.A02, i).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        sendKeyEvent(new android.view.KeyEvent(0, r2));
        sendKeyEvent(new android.view.KeyEvent(1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performContextMenuAction(int r5) {
        /*
            r4 = this;
            boolean r3 = r4.A04
            if (r3 == 0) goto L_0x0008
            r3 = 0
            switch(r5) {
                case 16908319: goto L_0x0023;
                case 16908320: goto L_0x000f;
                case 16908321: goto L_0x000c;
                case 16908322: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r3
        L_0x0009:
            r2 = 279(0x117, float:3.91E-43)
            goto L_0x0011
        L_0x000c:
            r2 = 278(0x116, float:3.9E-43)
            goto L_0x0011
        L_0x000f:
            r2 = 277(0x115, float:3.88E-43)
        L_0x0011:
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r3, r2)
            r4.sendKeyEvent(r0)
            r1 = 1
            android.view.KeyEvent r0 = new android.view.KeyEvent
            r0.<init>(r1, r2)
            r4.sendKeyEvent(r0)
            return r3
        L_0x0023:
            X.5Tl r0 = r4.A02
            X.5Tq r0 = r0.A01
            java.lang.String r0 = r0.A00
            int r1 = r0.length()
            X.IGq r0 = new X.IGq
            r0.<init>(r3, r1)
            A00(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IE8.performContextMenuAction(int):boolean");
    }

    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", 002.A0O("IME sends unsupported Editor Action: ", i));
                    break;
            }
        }
        i2 = 1;
        ((C56853IFa) this.A06).A00.A08.invoke(new ImeAction(i2));
        return true;
    }

    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            I2B.A00(handwritingGesture, this.A05, this.A07, this.A08, executor, intConsumer, J6M.A00(this, 14));
        }
    }

    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.A04;
        if (z) {
            return true;
        }
        return z;
    }

    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return I2B.A02(cancellationSignal, previewableHandwritingGesture, this.A05, this.A07);
        }
        return false;
    }

    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.A04;
        if (!z4) {
            return z4;
        }
        boolean z5 = false;
        boolean A1P = AnonymousClass7TF.A1P(i & 1);
        boolean A1P2 = AnonymousClass7TF.A1P(i & 2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z = AnonymousClass7TF.A1P(i & 16);
            z2 = AnonymousClass7TF.A1P(i & 8);
            z3 = AnonymousClass7TF.A1P(i & 4);
            if (i2 >= 34 && (i & 32) != 0) {
                z5 = true;
            }
            if (!z && !z2 && !z3 && !z5) {
                z5 = false;
                z = true;
                z2 = true;
                z3 = true;
                if (i2 >= 34) {
                    z5 = true;
                }
            }
        } else {
            z = true;
            z2 = true;
            z3 = false;
        }
        I0D i0d = ((C56853IFa) this.A06).A00.A0B;
        synchronized (i0d.A0B) {
            i0d.A08 = z;
            i0d.A06 = z2;
            i0d.A07 = z3;
            i0d.A09 = z5;
            if (A1P) {
                i0d.A05 = true;
                if (i0d.A04 != null) {
                    I0D.A00(i0d);
                }
            }
            i0d.A0A = A1P2;
        }
        return true;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C56853IFa) this.A06).A00.A0C.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C56893IGo(i, i2));
        }
        return z;
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.A04;
        if (z) {
            A00(this, new C56894IGp(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final boolean setSelection(int i, int i2) {
        boolean z = this.A04;
        if (!z) {
            return z;
        }
        A00(this, new C56895IGq(i, i2));
        return true;
    }

    public IE8(C52754Gc7 gc7, JLK jlk, C52693Gb5 gb5, AnonymousClass5RG r5, C285975Tl r6, boolean z) {
        this.A06 = jlk;
        this.A0A = z;
        this.A05 = gc7;
        this.A07 = gb5;
        this.A08 = r5;
        this.A02 = r6;
    }

    public final boolean endBatchEdit() {
        return A01();
    }
}
