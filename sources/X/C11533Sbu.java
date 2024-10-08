package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.Sbu  reason: case insensitive filesystem */
public final class C11533Sbu implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C11533Sbu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        switch (this.A00) {
            case 0:
                C7419QCi qCi = ((QKL) this.A01).A0C;
                if (qCi != null) {
                    z = true;
                    if ((keyEvent == null || keyEvent.getAction() != 0) && i != 6) {
                        return false;
                    }
                    if (qCi.A03.A02() == REK.ValidInput) {
                        qCi.A0E();
                        return true;
                    }
                } else {
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            case 1:
                C7420QCj qCj = ((QKE) this.A01).A0D;
                if (qCj != null) {
                    z = true;
                    if ((keyEvent == null || keyEvent.getAction() != 0) && i != 6) {
                        return false;
                    }
                    if (qCj.A07.A02() == REL.ValidInput) {
                        qCj.A0E();
                        return true;
                    }
                } else {
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            case 2:
                return ((C52703GbF) this.A01).A02.onEditorAction(textView, i, keyEvent);
            default:
                C7421QCk qCk = ((QCL) this.A01).A08;
                if (qCk != null) {
                    z = true;
                    if ((keyEvent != null && keyEvent.getAction() == 0) || i == 6) {
                        if (qCk.A08.A02() == RER.ValidInput) {
                            qCk.A0E();
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    C51965G9l.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
        }
        return z;
    }
}
