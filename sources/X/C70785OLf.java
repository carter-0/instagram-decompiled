package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.OLf  reason: case insensitive filesystem */
public final class C70785OLf {
    public final Activity A00;
    public final 1wn A01 = C71932OtG.A00(this, 15);
    public final UserSession A02;
    public final C71662eb A03;
    public final AnonymousClass0eM A04 = C73923Pm3.A01(this, 41);
    public final AnonymousClass0eM A05 = C73923Pm3.A01(this, 42);
    public final C62320sa A06;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            r7 = r10
            X.0sa r0 = r10.A06
            java.lang.Object r6 = r0.invoke()
            X.OGq r6 = (X.C70695OGq) r6
            java.lang.String r0 = r6.A03
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0018
            X.3sy r0 = r6.A01
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r0 != r3) goto L_0x0018
            r4 = 1
        L_0x0018:
            X.7Zg r0 = r6.A00
            X.7SD r0 = X.C66581MXm.A0Z(r0)
            X.3Tu r2 = r0.A0H
            boolean r1 = X.C331057Pi.A02(r2)
            com.instagram.common.session.UserSession r0 = r10.A02
            boolean r0 = X.C331057Pi.A01(r0, r2)
            if (r4 != 0) goto L_0x00c6
            if (r1 != 0) goto L_0x00c6
            if (r0 != 0) goto L_0x00c6
            java.lang.Integer r5 = X.AnonymousClass05K.A00
        L_0x0032:
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x00ae
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x0038:
            boolean r0 = r6.A04
            java.lang.Integer r8 = X.C51967G9n.A0l(r0)
            X.0eM r2 = r10.A05
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 2131431810(0x7f0b1182, float:1.848536E38)
            android.widget.ImageView r4 = X.DbX.A0J(r1, r0)
            X.0eM r3 = r10.A04
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r3)
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r5.intValue()
            if (r0 == 0) goto L_0x00aa
            r0 = 2131238511(0x7f081e6f, float:1.8093303E38)
        L_0x005c:
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r1, r0)
            r4.setImageDrawable(r0)
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r3)
            android.content.Context r1 = (android.content.Context) r1
            int r0 = r9.intValue()
            switch(r0) {
                case 0: goto L_0x0096;
                case 1: goto L_0x00a6;
                case 2: goto L_0x00a2;
                case 3: goto L_0x0070;
                case 4: goto L_0x0070;
                case 5: goto L_0x009e;
                case 6: goto L_0x009a;
                default: goto L_0x0070;
            }
        L_0x0070:
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
        L_0x0073:
            X.DbX.A12(r1, r4, r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 2131431811(0x7f0b1183, float:1.8485362E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r0)
            java.lang.String r0 = X.C69929NuV.A00(r9)
            r1.setText(r0)
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            r4 = 0
            X.OjF r3 = new X.OjF
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AnonymousClass0fU.A00(r3, r0)
            return
        L_0x0096:
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            goto L_0x0073
        L_0x009a:
            r0 = 2131100628(0x7f0603d4, float:1.7813643E38)
            goto L_0x0073
        L_0x009e:
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            goto L_0x0073
        L_0x00a2:
            r0 = 2131099928(0x7f060118, float:1.7812223E38)
            goto L_0x0073
        L_0x00a6:
            r0 = 2131100230(0x7f060246, float:1.7812836E38)
            goto L_0x0073
        L_0x00aa:
            r0 = 2131238936(0x7f082018, float:1.8094165E38)
            goto L_0x005c
        L_0x00ae:
            if (r4 == 0) goto L_0x00c2
            java.lang.Boolean r1 = r6.A02
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r3)
            if (r0 == 0) goto L_0x00bc
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            goto L_0x0038
        L_0x00bc:
            if (r1 != 0) goto L_0x00c2
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            goto L_0x0038
        L_0x00c2:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x0038
        L_0x00c6:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            if (r1 == 0) goto L_0x00ce
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            goto L_0x0038
        L_0x00ce:
            if (r0 == 0) goto L_0x0032
            java.lang.Integer r9 = X.AnonymousClass05K.A0u
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70785OLf.A00():void");
    }

    public C70785OLf(Activity activity, UserSession userSession, C71662eb r4, C62320sa r5) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = r4;
        this.A06 = r5;
        A00();
    }
}
