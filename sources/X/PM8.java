package X;

import android.view.View;
import android.widget.TextView;

public final class PM8 implements C74361Ptb {
    public TextView A00;
    public final View A01;
    public final Runnable A02 = new C73118PWz(this);
    public final AnonymousClass0eM A03 = C73895PlW.A00(this, 36);
    public final AnonymousClass0eM A04 = C73895PlW.A00(this, 37);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r3 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADN(X.C74270Pry r7) {
        /*
            r6 = this;
            X.N9b r7 = (X.C68288N9b) r7
            r5 = 0
            X.0qQ.A0B(r7, r5)
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0034
            android.widget.TextView r0 = r6.A00
            if (r0 != 0) goto L_0x001b
            android.view.View r1 = r6.A01
            r0 = 2131428090(0x7f0b02fa, float:1.8477815E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r6.A00 = r0
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            X.DbS.A1C(r0)
        L_0x001e:
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x0033
            boolean r2 = r0.booleanValue()
            X.0eM r0 = r6.A03
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            int r0 = X.DbW.A01(r2)
            r1.setVisibility(r0)
        L_0x0033:
            return
        L_0x0034:
            java.lang.String r2 = r7.A01
            if (r2 == 0) goto L_0x001e
            boolean r4 = r7.A02
            android.widget.TextView r3 = r6.A00
            if (r3 != 0) goto L_0x004b
            android.view.View r1 = r6.A01
            r0 = 2131428090(0x7f0b02fa, float:1.8477815E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r1, r0)
            r6.A00 = r3
            if (r3 == 0) goto L_0x001e
        L_0x004b:
            r3.setText(r2)
            X.5nL r2 = X.C294975nL.A01(r3, r5)
            X.0qQ.A07(r2)
            r2.A0G()
            r1 = 2
            X.Wdb r0 = new X.Wdb
            r0.<init>(r3, r1)
            r2.A06 = r0
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A0M(r1, r0)
            r2.A0H()
            if (r4 == 0) goto L_0x001e
            android.view.View r3 = r6.A01
            java.lang.Runnable r2 = r6.A02
            r3.removeCallbacks(r2)
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.postDelayed(r2, r0)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PM8.ADN(X.Pry):void");
    }

    public PM8(View view) {
        this.A01 = view;
    }
}
