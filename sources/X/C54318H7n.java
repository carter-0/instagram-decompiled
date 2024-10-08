package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.H7n  reason: case insensitive filesystem */
public final class C54318H7n extends AnonymousClass3NK implements C284715Nq {
    public final /* synthetic */ C53389GnL A00;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ C53921GwR A02;

    public C54318H7n(C53389GnL gnL, AnonymousClass3Y5 r2, C53921GwR gwR) {
        this.A00 = gnL;
        this.A02 = gwR;
        this.A01 = r2;
    }

    public final void DsM(MotionEvent motionEvent, View view) {
        C53389GnL gnL = this.A00;
        View view2 = view;
        if (C51966G9m.A1Y(gnL.A06)) {
            this.A02.A04.A05(view, (C238863Ds) null, (Integer) null);
        }
        if (motionEvent.getAction() == 0 && gnL.A08) {
            C53921GwR gwR = this.A02;
            C53921GwR.A04(C51967G9n.A09(this.A01), view2, gwR, motionEvent.getX(), motionEvent.getY(), AnonymousClass7TF.A1Q(motionEvent.getAction()));
        }
    }
}
