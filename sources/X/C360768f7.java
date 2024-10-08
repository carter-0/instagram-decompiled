package X;

/* renamed from: X.8f7  reason: invalid class name and case insensitive filesystem */
public final class C360768f7 extends 1P0 {
    public final /* synthetic */ C360668ex A00;

    public C360768f7(C360668ex r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r5) {
        int i;
        int A03 = AnonymousClass0fD.A03(1218492341);
        0qQ.A0B(r5, 0);
        Throwable A01 = r5.A01();
        if (A01 != null) {
            this.A00.A00.A02(new C268664dn(A01));
            i = -1560762578;
        } else {
            i = -1253958489;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-935926949);
        C360758f6 r0 = this.A00.A00.A00;
        if (r0 != null) {
            r0.A03();
        }
        AnonymousClass0fD.A0A(1921375298, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1854717920);
        C360758f6 r0 = this.A00.A00.A00;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0fD.A0A(155745495, A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = -68223720(0xfffffffffbeefd18, float:-2.4818E36)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3JC r12 = (X.AnonymousClass3JC) r12
            r0 = 2027642108(0x78db5cfc, float:3.5593717E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r12, r8)
            X.8ex r2 = r11.A00
            java.lang.Object r6 = r12.A01
            X.3lr r6 = (X.C250663lr) r6
            if (r6 != 0) goto L_0x004e
            java.lang.String r1 = "No result in IGBloksAppRootQuery response"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            X.4dn r1 = new X.4dn
            r1.<init>(r0)
        L_0x0028:
            java.lang.Object r5 = r1.A00()
            X.8ff r5 = (X.C361098ff) r5
            if (r5 == 0) goto L_0x0035
            X.8f0 r0 = r2.A00
            r0.A01(r5)
        L_0x0035:
            X.1TZ r5 = X.1TZ.A00()
            X.8fk r0 = new X.8fk
            r0.<init>(r2, r1)
            r5.A01(r0)
            r0 = -662690229(0xffffffffd880264b, float:-1.12721564E15)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1872999706(0xffffffff905c4ae6, float:-4.344505E-29)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x004e:
            X.8ew r7 = r2.A00
            java.lang.Class<X.8fR> r5 = X.C360958fR.class
            java.lang.String r1 = "bloks_app(bk_context:$bk_context,params:$params)"
            r0 = 1815895451(0x6c3c5d9b, float:9.108804E26)
            X.3lr r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
            if (r6 == 0) goto L_0x00c0
            java.lang.Class<X.8fS> r5 = X.C360968fS.class
            java.lang.String r1 = "screen_content"
            r0 = 639075374(0x2617842e, float:5.2567786E-16)
            X.3lr r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
            if (r6 == 0) goto L_0x00c0
            java.lang.Class<X.8fT> r5 = X.C360978fT.class
            java.lang.String r1 = "component"
            r0 = -127346585(0xfffffffff868d867, float:-1.8890657E34)
            X.3lr r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
            if (r6 == 0) goto L_0x00c0
            java.lang.Class<X.8fU> r5 = X.C360988fU.class
            java.lang.String r1 = "bundle"
            r0 = 701760194(0x29d402c2, float:9.4151697E-14)
            X.3lr r1 = r6.getOptionalTreeField(r8, r1, r5, r0)
            if (r1 == 0) goto L_0x00c0
            java.lang.String r0 = "bloks_bundle_tree"
            java.lang.String r5 = r1.getOptionalStringField(r8, r0)
            if (r5 == 0) goto L_0x00c0
            X.6Qo r1 = r7.A00
            r0 = 0
            X.68u r0 = X.C360998fV.A00(r1, r5, r0)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "Failed to parse bloks bundle tree"
            java.lang.Exception r5 = new java.lang.Exception
            r5.<init>(r0)
        L_0x009c:
            X.4dn r1 = new X.4dn
            r1.<init>(r5)
        L_0x00a1:
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x00c8
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r6 = r1.A00
            X.68u r6 = (X.C3034368u) r6
            r7 = 0
            X.8fe r5 = new X.8fe
            r9 = r7
            r5.<init>(r6, r7, r9)
            X.4do r1 = new X.4do
            r1.<init>(r5)
            goto L_0x0028
        L_0x00ba:
            X.4do r1 = new X.4do
            r1.<init>(r0)
            goto L_0x00a1
        L_0x00c0:
            java.lang.String r0 = "Null response from Bloks IGBloksAppRootQuery"
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r0)
            goto L_0x009c
        L_0x00c8:
            boolean r0 = r1 instanceof X.C268664dn
            if (r0 != 0) goto L_0x0028
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360768f7.onSuccessInBackground(java.lang.Object):void");
    }
}
