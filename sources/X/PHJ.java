package X;

public final class PHJ implements G76 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PHJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onActionClicked() {
        if (this.A00 != 0) {
            C66736Mbh mbh = (C66736Mbh) this.A02;
            SUL A0J = Dba.A0J(mbh.A04, mbh.A0B, 2EG.A1V, "https://www.facebook.com/help/instagram/475931443650619");
            A0J.A0S = "direct_inbox_general_folder_banner";
            A0J.A0A();
            return;
        }
        ((C69664Npm) this.A01).A00();
        ((C74444Puz) this.A02).DZK();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r5 == X.C67220MkG.NEW_THREADS_THROTTLED_LIGHT_BANNER) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBannerDismissed() {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0062
            java.lang.Object r7 = r8.A02
            X.Mbh r7 = (X.C66736Mbh) r7
            java.lang.Object r5 = r8.A01
            X.MkG r5 = (X.C67220MkG) r5
            int r1 = r5.A03
            java.util.Map r0 = X.C67220MkG.A06
            java.lang.Object r0 = X.C51968G9o.A10(r0, r1)
            X.MkG r0 = (X.C67220MkG) r0
            if (r0 != 0) goto L_0x001a
            X.MkG r0 = X.C67220MkG.DEFAULT
        L_0x001a:
            r7.A01 = r0
            X.Miz r1 = r7.A0E
            X.NPD r0 = X.C66736Mbh.A00(r7, r0)
            r1.A08 = r0
            X.C66736Mbh.A04(r7)
            com.instagram.common.session.UserSession r4 = r7.A0B
            X.4kA r6 = X.AnonymousClass4k9.A00(r4)
            X.MkG r0 = r7.A01
            int r3 = r0.A02
            X.0s0 r2 = r6.A0G
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 10
            r1 = r1[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.Epx(r6, r0, r1)
            X.0iw r3 = r7.A05
            X.MkG r0 = X.C67220MkG.DEFAULT
            if (r5 == r0) goto L_0x0060
            X.MkG r0 = X.C67220MkG.GENERAL_FOLDER_RECOVERED_BANNER
            if (r5 == r0) goto L_0x0060
            X.MkG r0 = X.C67220MkG.NEW_THREADS_THROTTLED_BANNER
            if (r5 == r0) goto L_0x0053
            X.MkG r0 = X.C67220MkG.NEW_THREADS_THROTTLED_LIGHT_BANNER
            r2 = 2
            if (r5 != r0) goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            boolean r0 = r5.A04
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            java.lang.String r0 = "business_inbox_hmps_banner_dismissed"
            X.C3265677h.A0P(r3, r4, r1, r0, r2)
            return
        L_0x0060:
            r2 = 0
            goto L_0x0054
        L_0x0062:
            java.lang.Object r0 = r8.A01
            X.Npm r0 = (X.C69664Npm) r0
            r0.A00()
            java.lang.Object r0 = r8.A02
            X.Puz r0 = (X.C74444Puz) r0
            r0.D9Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PHJ.onBannerDismissed():void");
    }
}
