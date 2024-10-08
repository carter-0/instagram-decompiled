package X;

import android.view.ViewTreeObserver;
import com.facebookpay.widget.button.FBPayButton;

/* renamed from: X.SbX  reason: case insensitive filesystem */
public final class C11510SbX implements ViewTreeObserver.OnDrawListener {
    public final int A00;
    public final Object A01;

    public C11510SbX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDraw() {
        String str;
        if (this.A00 != 0) {
            C8131QhP qhP = (C8131QhP) this.A01;
            if (!qhP.A0S) {
                FBPayButton fBPayButton = qhP.A0Q;
                if (fBPayButton == null) {
                    str = "continueButton";
                } else {
                    fBPayButton.post(new C12983TGq(this, qhP));
                    qhP.A0S = true;
                    S9r.A00(qhP);
                    return;
                }
            } else {
                return;
            }
        } else {
            C8132QhQ qhQ = (C8132QhQ) this.A01;
            if (!qhQ.A0E) {
                QDN qdn = qhQ.A0B;
                str = "ecpViewModel";
                if (qdn != null) {
                    if (!AnonymousClass7TF.A1Y(qdn.A0y.A02(), false)) {
                        QF4 qf4 = qhQ.A07;
                        if (qf4 == null) {
                            str = "payButtonViewHolder";
                        } else {
                            qf4.A00.post(new C12982TGp(this, qhQ));
                            QDN qdn2 = qhQ.A0B;
                            if (qdn2 != null) {
                                qdn2.A0c = true;
                                qdn2.A0m();
                                qhQ.A0E = true;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
