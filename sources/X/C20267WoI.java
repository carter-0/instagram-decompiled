package X;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.WoI  reason: case insensitive filesystem */
public final class C20267WoI implements Runnable {
    public final int A00;
    public final Throwable A01;
    public final List A02;

    public final void run() {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        if (this.A00 != 1) {
            while (i < size) {
                V26 v26 = (V26) list.get(i);
                Throwable th = this.A01;
                if (v26 instanceof C14757U7o) {
                    C14757U7o u7o = (C14757U7o) v26;
                    if (th != null) {
                        0KC.A0O("EmojiCompatImpl", "EmojiCompat initialization failed", new Object[]{th.getLocalizedMessage()});
                        2Ry.A00(u7o.A00, -1, false);
                    }
                }
                i++;
            }
            return;
        }
        while (i < size) {
            V26 v262 = (V26) list.get(i);
            if (v262 instanceof C14757U7o) {
                C14757U7o u7o2 = (C14757U7o) v262;
                WTB.A01 = true;
                long currentTimeMillis = System.currentTimeMillis() - WTB.A00;
                if (currentTimeMillis >= 0) {
                    2Ry.A00(u7o2.A00, currentTimeMillis, true);
                }
                new Handler(C64021Cb.A00()).post(new C19885WhE());
            } else {
                TextView textView = (TextView) ((C14756U7n) v262).A00.get();
                if (textView != null && textView.isAttachedToWindow()) {
                    Editable editableText = textView.getEditableText();
                    int selectionStart = Selection.getSelectionStart(editableText);
                    int selectionEnd = Selection.getSelectionEnd(editableText);
                    W0M.A00().A02(editableText);
                    if (selectionStart >= 0) {
                        if (selectionEnd >= 0) {
                            Selection.setSelection(editableText, selectionStart, selectionEnd);
                        } else {
                            Selection.setSelection(editableText, selectionStart);
                        }
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(editableText, selectionEnd);
                    }
                }
            }
            i++;
        }
    }

    public C20267WoI(Throwable th, Collection collection, int i) {
        02V.A03(collection, "initCallbacks cannot be null");
        this.A02 = new ArrayList(collection);
        this.A00 = i;
        this.A01 = th;
    }
}
