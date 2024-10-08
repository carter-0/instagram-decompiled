package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.Mrr  reason: case insensitive filesystem */
public final class C67661Mrr extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C74309Psj A01;
    public final /* synthetic */ C67010Mgi A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67661Mrr(View view, C74309Psj psj, C67010Mgi mgi, Integer num, long j, long j2, boolean z, boolean z2) {
        super(j, j2);
        this.A02 = mgi;
        this.A03 = num;
        this.A05 = z;
        this.A00 = view;
        this.A04 = z2;
        this.A01 = psj;
    }

    public final void onFinish() {
        C67010Mgi mgi = this.A02;
        mgi.A02 = null;
        C67010Mgi.A01(mgi);
        TextView textView = mgi.A0A;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.A00.setVisibility(8);
        Integer num = this.A03;
        if (this.A05) {
            0nY.A00().ATE(new C68658NRp(mgi, num));
        }
        if (this.A04) {
            View view = mgi.A08;
            view.setVisibility(0);
            C71392co r0 = C315596kB.A02;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A05 = new PQI(this, 0);
            A012.A0M(1.0f, 0.0f);
            A012.A0H();
        }
        this.A01.D6O();
    }

    public final void onTick(long j) {
        C67010Mgi mgi = this.A02;
        Integer num = this.A03;
        boolean z = this.A05;
        if (num.intValue() == 0) {
            long j2 = j;
            if (j != 0) {
                0nY.A00().ATE(new NSO(mgi, num, j2, z));
            }
        }
    }
}
