package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.SaQ  reason: case insensitive filesystem */
public final class C11462SaQ implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C11462SaQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C11462SaQ(obj, i));
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.A00) {
            case 2:
                0qQ.A0B(editable, 0);
                C8066QgI qgI = (C8066QgI) this.A01;
                C8041Qfl qfl = qgI.A04;
                if (qfl == null) {
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                qfl.A05.A0B(editable.toString());
                C8066QgI.A05(qgI);
                return;
            case 3:
                QDF qdf = ((QCU) this.A01).A01;
                qdf.A02 = editable.toString();
                qdf.A06.A0A((Object) null);
                return;
            case 4:
                ((QCI) this.A01).A01.A03(editable.toString());
                return;
            default:
                ((0sP) this.A01).invoke(String.valueOf(editable));
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
