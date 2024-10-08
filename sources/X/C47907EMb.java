package X;

/* renamed from: X.EMb  reason: case insensitive filesystem */
public class C47907EMb extends C47695EDe {
    public 0wc A00;
    public AnonymousClass6ST A01;
    public final AnonymousClass0iw A02;
    public final AnonymousClass0aP A03;
    public final String A04;
    public final boolean A05 = true;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47907EMb(androidx.fragment.app.Fragment r18, X.AnonymousClass0iw r19, X.AnonymousClass0aP r20, X.G8H r21, X.C46634DiE r22, java.lang.String r23, java.lang.String r24) {
        /*
            r17 = this;
            r2 = 1
            r3 = r18
            android.content.Context r1 = r3.getContext()
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r5 = X.0mE.A00(r1, r0)
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            android.net.Uri r6 = X.C46413Dea.A01(r3)
            r10 = 0
            r4 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r22
            r13 = r23
            r14 = r10
            r15 = r10
            r16 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A03 = r8
            r0 = r24
            r4.A04 = r0
            X.6ST r1 = X.DbW.A0Y(r3)
            r4.A01 = r1
            r0 = 2131965555(0x7f133673, float:1.9567923E38)
            X.DbU.A1L(r3, r1, r0)
            r4.A02 = r7
            r4.A05 = r2
            X.0wc r0 = X.AnonymousClass0kN.A01(r7, r8)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47907EMb.<init>(androidx.fragment.app.Fragment, X.0iw, X.0aP, X.G8H, X.DiE, java.lang.String, java.lang.String):void");
    }

    public void A04(EM4 em4) {
        int A032 = AnonymousClass0fD.A03(974862511);
        C319606qt.A01(this.A03).A0G(this.A04);
        super.A04(em4);
        AnonymousClass0fD.A0A(1779656767, A032);
    }

    public void onFail(C268654dm r9) {
        String str;
        int A032 = AnonymousClass0fD.A03(-670556778);
        if (this.A05) {
            this.A01.dismiss();
        }
        if (r9 == null || !(r9 instanceof C268674do) || (str = ((1XP) r9.A00()).mErrorType) == null) {
            str = "other";
        }
        if (!C46413Dea.A09(r9)) {
            super.onFail(r9);
            long currentTimeMillis = System.currentTimeMillis();
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "sso_failed");
            DbZ.A1E(A0e);
            DbY.A1E(A0e, currentTimeMillis, 1Q0.A00());
            DbS.A1M(A0e, "unknown");
            A0e.AAJ("login_userid", this.A04);
            DbW.A12(A0e, DbS.A00());
            FH8.A0E(A0e, "step", this.A08.A01);
            DbW.A15(A0e, this.A02);
            A0e.A7p("fallback_shown", false);
            A0e.AAJ("error", str);
            FH8.A0C(A0e, this.A03);
        } else {
            super.onFail(r9);
        }
        AnonymousClass0fD.A0A(2066800333, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1911861531);
        C47907EMb.super.onStart();
        if (this.A05) {
            AnonymousClass0fN.A00(this.A01);
        }
        AnonymousClass0fD.A0A(1370635869, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(545729823, C47695EDe.A00(this, obj, -1013902471));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47907EMb(android.net.Uri r17, androidx.fragment.app.FragmentActivity r18, X.AnonymousClass0iw r19, X.AnonymousClass0aP r20, X.G8H r21, X.C46634DiE r22, java.lang.String r23, java.lang.String r24) {
        /*
            r16 = this;
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r9 = 0
            r3 = r16
            r5 = r17
            r4 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r10 = r22
            r12 = r23
            r13 = r9
            r14 = r9
            r15 = r9
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A03 = r7
            r0 = r24
            r3.A04 = r0
            r2 = 1
            X.6ST r1 = new X.6ST
            r1.<init>(r4, r2)
            r3.A01 = r1
            java.lang.String r0 = "logging into "
            java.lang.String r0 = X.002.A0R(r0, r12)
            r1.A00(r0)
            r3.A02 = r6
            r3.A05 = r2
            X.0wc r0 = X.AnonymousClass0kN.A01(r6, r7)
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47907EMb.<init>(android.net.Uri, androidx.fragment.app.FragmentActivity, X.0iw, X.0aP, X.G8H, X.DiE, java.lang.String, java.lang.String):void");
    }
}
