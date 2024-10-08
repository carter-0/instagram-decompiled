package X;

public final class ECL extends 1P0 {
    public final /* synthetic */ C47483E4i A00;

    public ECL(C47483E4i e4i) {
        this.A00 = e4i;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1991505147);
        C47483E4i.A02(this.A00);
        AnonymousClass0fD.A0A(-1690725575, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1421003028);
        ECL.super.onStart();
        C47483E4i e4i = this.A00;
        if (!e4i.A0D.isShowing()) {
            AnonymousClass0fN.A00(e4i.A0D);
        }
        AnonymousClass0fD.A0A(-2061421166, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r1 != X.EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r4 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2078298436(0x7be05144, float:2.3294455E36)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.DwS r7 = (X.DwS) r7
            r0 = -984681156(0xffffffffc54ef53c, float:-3311.3271)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.FAP r0 = r7.A00()
            if (r0 == 0) goto L_0x0079
            X.E4i r4 = r6.A00
            com.instagram.ui.text.FreeAutoCompleteTextView r0 = r4.A0E
            if (r0 == 0) goto L_0x0079
            boolean r0 = X.0nA.A0z(r0)
            if (r0 == 0) goto L_0x0079
            X.FAP r0 = r7.A00()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0046
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            X.FAP r0 = r7.A00()
            java.lang.String r0 = r0.A01
            X.EW4 r1 = X.C49198Er3.A00(r0)
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.EW4 r0 = X.EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE
            if (r1 == r0) goto L_0x0079
            X.EW4 r0 = X.EW4.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY
            if (r1 == r0) goto L_0x0079
            X.EW4 r0 = X.EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID
            if (r1 == r0) goto L_0x0079
        L_0x0046:
            X.FAP r0 = r7.A00()
            java.lang.String r0 = r0.A00
            java.lang.Integer r0 = X.C47483E4i.A00(r0)
            r4.A0H = r0
            X.FAP r0 = r7.A00()
            java.lang.String r0 = r0.A00
            r4.A0I = r0
            com.instagram.ui.text.FreeAutoCompleteTextView r1 = r4.A0E
            X.FAP r0 = r7.A00()
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            X.FAP r0 = r7.A00()
            X.C47483E4i.A04(r4, r0)
        L_0x006c:
            r0 = 1080691319(0x406a0a77, float:3.6568887)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -562957419(0xffffffffde71f395, float:-4.3586106E18)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0079:
            X.E4i r0 = r6.A00
            X.C47483E4i.A02(r0)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ECL.onSuccess(java.lang.Object):void");
    }
}
