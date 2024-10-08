package X;

import android.view.View;

/* renamed from: X.IVb  reason: case insensitive filesystem */
public final class C57266IVb implements MVB {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57266IVb(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A05 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A01 = i;
    }

    public final void onButtonClick(View view) {
        if (this.A00 != 0) {
            C46521DgO dgO = (C46521DgO) this.A02;
            C283155Gi r3 = (C283155Gi) this.A05;
            int i = this.A01;
            C46521DgO.A04(dgO, r3, "delete_notification_undo_clicked", i);
            C51152FpO fpO = (C51152FpO) this.A04;
            if (!fpO.A01) {
                C46521DgO.A0B.removeCallbacks(fpO);
            }
            C46521DgO.A0B.removeCallbacks((Runnable) this.A03);
            dgO.A06.CNU(r3, i);
            return;
        }
        C57239IUa iUa = (C57239IUa) this.A05;
        iUa.A00.C87().DkW((1Xj) this.A02, (AnonymousClass3W1) this.A03, (String) null, true, false);
        iUa.A01.A8l(this.A04, this.A01);
    }

    public final void onDismiss() {
    }

    public final void onShow() {
    }
}
