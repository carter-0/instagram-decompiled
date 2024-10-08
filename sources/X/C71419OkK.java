package X;

import android.view.View;

/* renamed from: X.OkK  reason: case insensitive filesystem */
public final class C71419OkK implements View.OnLongClickListener {
    public final /* synthetic */ 2Er A00;
    public final /* synthetic */ C329437Iw A01;
    public final /* synthetic */ boolean A02;

    public C71419OkK(2Er r1, C329437Iw r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r2 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r14) {
        /*
            r13 = this;
            boolean r0 = r13.A02
            if (r0 != 0) goto L_0x0155
            X.7Iw r10 = r13.A01
            X.7Id r0 = r10.A07
            X.7Ia r0 = r0.A02
            X.7Hl r0 = r0.A01
            X.7Ij r0 = r0.A0b
            java.util.List r0 = r0.A02()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0155
            X.2Er r0 = r13.A00
            int r1 = r0.Bpc()
            r0 = 10
            r9 = 1
            if (r1 < r0) goto L_0x0039
            android.app.Activity r0 = r10.A02
            X.8ab r1 = X.DbS.A0X(r0)
            r0 = 2131958801(0x7f131c11, float:1.9554224E38)
            r1.A09(r0)
            r0 = 2131958800(0x7f131c10, float:1.9554222E38)
            r1.A08(r0)
            X.Dba.A1L(r1)
            return r9
        L_0x0039:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 12
            r1.add(r0, r9)
            java.util.Date r8 = r1.getTime()
            r7 = 5
            r0 = 29
            r1.add(r7, r0)
            java.util.Date r6 = r1.getTime()
            X.0qQ.A0A(r8)
            java.util.Date r0 = r10.A00
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r8.before(r0)
            if (r0 == 0) goto L_0x00f7
            java.util.Date r2 = r10.A00
        L_0x005f:
            if (r2 != 0) goto L_0x0062
        L_0x0061:
            r2 = r8
        L_0x0062:
            X.0rm r4 = X.C51965G9l.A11()
            com.instagram.common.session.UserSession r0 = r10.A05
            android.content.Context r1 = r10.A03
            X.0qQ.A07(r1)
            android.app.Activity r3 = r10.A02
            X.OLy r5 = new X.OLy
            r5.<init>(r3, r1, r0)
            r0 = 2131958799(0x7f131c0f, float:1.955422E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r5.A07 = r0
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r5.A00 = r0
            r0 = 2131958798(0x7f131c0e, float:1.9554218E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r5.A06 = r0
            r1 = 0
            X.0qQ.A0B(r8, r1)
            r5.A0A = r8
            X.0qQ.A0A(r6)
            X.0qQ.A0B(r6, r1)
            r5.A08 = r6
            X.0qQ.A0B(r2, r1)
            r5.A09 = r2
            java.util.Calendar r0 = X.C14240TsN.A02
            java.lang.String r0 = r10.A00(r2)
            r5.A05 = r0
            r5.A0B = r9
            X.P02 r0 = new X.P02
            r0.<init>(r10, r4)
            r5.A01 = r0
            r5.A0D = r9
            X.7Ps r2 = X.C51971G9r.A0h(r1)
            java.lang.String r0 = "Cancel"
            r2.A06 = r0
            r0 = 2132018616(0x7f1405b8, float:1.9675544E38)
            r2.A03 = r0
            r1 = 8
            X.Ok1 r0 = new X.Ok1
            r0.<init>((java.lang.Object) r10, (int) r1)
            r2.A05 = r0
            X.7Pt r0 = r2.A00()
            r5.A03 = r0
            r5.A0C = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r5.A04 = r0
            X.OFr r0 = r5.A00()
            r4.A00 = r0
            X.0nA.A0J(r3)
            java.lang.Object r3 = r4.A00
            X.OFr r3 = (X.C70670OFr) r3
            X.7Pr r0 = r3.A03
            X.7Pu r2 = r0.A00()
            r3.A00 = r2
            boolean r0 = r3.A04
            r2.A0Q(r0)
            android.app.Activity r1 = r3.A01
            X.UbI r0 = r3.A02
            r2.A0D(r1, r0)
            return r9
        L_0x00f7:
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r3 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            X.0eP r11 = X.AnonymousClass7TE.A1L(r1, r12)
            r0 = 17
            X.0eP r2 = X.AnonymousClass7TF.A0x(r1, r0)
            r0 = 21
            X.0eP r1 = X.AnonymousClass7TF.A0x(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r12, r11, r2, r1)
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x012a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0061
            X.0eP r2 = X.JTO.A1A(r11)
            int r0 = X.C51970G9q.A0B(r2)
            r4.add(r7, r0)
            r1 = 11
            int r0 = X.C51969G9p.A0A(r2)
            r4.set(r1, r0)
            r0 = 12
            r4.set(r0, r3)
            boolean r0 = r5.before(r4)
            if (r0 == 0) goto L_0x012a
            java.util.Date r2 = r4.getTime()
            goto L_0x005f
        L_0x0155:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71419OkK.onLongClick(android.view.View):boolean");
    }
}
