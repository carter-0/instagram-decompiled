package X;

/* renamed from: X.ECn  reason: case insensitive filesystem */
public final class C47678ECn extends 1P0 {
    public final /* synthetic */ E3J A00;

    public C47678ECn(E3J e3j) {
        this.A00 = e3j;
    }

    public final void onFail(C268654dm r5) {
        int A03 = AnonymousClass0fD.A03(12589703);
        E3J e3j = this.A00;
        FBX.A00(e3j.A02);
        C59689JTv.A0F(e3j.getActivity(), "fail_send_confirm_email", 2131961936);
        AnonymousClass0fD.A0A(139850705, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(144325240);
        C47678ECn.super.onFinish();
        E3J e3j = this.A00;
        e3j.A05 = false;
        Dbb.A17(e3j, false);
        AnonymousClass0fD.A0A(1340933833, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(2060535815);
        C47678ECn.super.onStart();
        E3J e3j = this.A00;
        e3j.A05 = true;
        Dbb.A17(e3j, true);
        AnonymousClass0fD.A0A(-447196089, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r7.A03 == null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = -783820011(0xffffffffd147db15, float:-5.364838E10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Dw4 r10 = (X.Dw4) r10
            r0 = -163285150(0xfffffffff6447762, float:-9.962027E32)
            int r4 = X.AnonymousClass0fD.A03(r0)
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x006d
            X.E3J r7 = r9.A00
            X.FBX r0 = r7.A02
            X.02m r1 = r0.A00
            r0 = 857809457(0x33212231, float:3.751683E-8)
            r8 = 2
            r1.markerEnd(r0, r8)
            android.widget.EditText r0 = r7.A00
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r7.A03
            r0 = 1
            if (r1 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            X.17k.A0F(r0)
            X.C46447Df9.A03()
            com.instagram.common.session.UserSession r6 = r7.A01
            android.widget.EditText r0 = r7.A00
            r0.getClass()
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r2 = r7.A03
            X.AnonymousClass7TG.A1N(r6, r3)
            android.os.Bundle r1 = X.DbV.A0B(r2, r8)
            java.lang.String r0 = "key_shared_email"
            r1.putString(r0, r3)
            X.DbU.A1D(r1, r6)
            java.lang.String r0 = "send_source"
            r1.putString(r0, r2)
            X.EMR r2 = new X.EMR
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r7)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.Dbb.A12(r2, r1, r0)
        L_0x0060:
            r0 = 128821017(0x7ada719, float:2.6128358E-34)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1639489431(0x61b89f97, float:4.2571257E20)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x006d:
            java.lang.String r0 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = r10.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0097
            X.E3J r3 = r9.A00
            X.FBX r0 = r3.A02
            X.FBX.A00(r0)
            java.lang.String r1 = r10.A01
            java.lang.String r0 = r10.A00
            X.E0L r2 = X.Dbc.A09(r1, r0)
            android.os.Handler r1 = r3.A09
        L_0x008e:
            X.Fun r0 = new X.Fun
            r0.<init>(r2, r9, r10)
            r1.post(r0)
            goto L_0x0060
        L_0x0097:
            X.E3J r3 = r9.A00
            X.FBX r0 = r3.A02
            X.02m r2 = r0.A00
            r1 = 857809457(0x33212231, float:3.751683E-8)
            r0 = 2
            r2.markerEnd(r1, r0)
            android.os.Handler r1 = r3.A09
            r2 = 0
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47678ECn.onSuccess(java.lang.Object):void");
    }
}
