package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextWatcher;
import com.instagram.model.hashtag.Hashtag;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.9Sd  reason: invalid class name and case insensitive filesystem */
public final class C379029Sd implements TextWatcher {
    public final /* synthetic */ C379049Sf A00;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C379029Sd(C379049Sf r1) {
        this.A00 = r1;
    }

    public final void afterTextChanged(Editable editable) {
        C379049Sf r3;
        Class<C15915Ukf> cls = C15915Ukf.class;
        for (C15915Ukf ukf : (C15915Ukf[]) C263324Kh.A06(editable, cls)) {
            if (!A0K.A00(editable.subSequence(editable.getSpanStart(ukf), editable.getSpanEnd(ukf)))) {
                editable.removeSpan(ukf);
            }
        }
        int A002 = C379039Se.A00(editable);
        if (A002 == -1) {
            r3 = this.A00;
        } else {
            int selectionEnd = Selection.getSelectionEnd(editable);
            CharSequence subSequence = editable.subSequence(A002, selectionEnd);
            if (A0K.A00(subSequence)) {
                C15915Ukf[] ukfArr = (C15915Ukf[]) editable.getSpans(A002, selectionEnd, cls);
                for (C15915Ukf removeSpan : ukfArr) {
                    editable.removeSpan(removeSpan);
                }
                r3 = this.A00;
                if (C394789yh.A00(r3.A0F.A02)) {
                    C379049Sf.A00(editable, r3);
                    if (r3.A00 + r3.A0L.size() < 10) {
                        editable.setSpan(new C15915Ukf(r3.A09.getResources(), (Hashtag) C281965Ag.A00(subSequence.subSequence(1, subSequence.length()).toString())), A002, selectionEnd, 33);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C379049Sf.A00(editable, r3);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Editable) {
            Set set = this.A00.A0K;
            set.clear();
            Collections.addAll(set, C263324Kh.A06((Spanned) charSequence, C15915Ukf.class));
        }
    }
}
