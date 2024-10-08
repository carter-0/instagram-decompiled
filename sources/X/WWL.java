package X;

public final class WWL implements C229132mt {
    public final int A00;
    public final Object A01;

    public WWL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (((X.C19742Wej) r1.getValue()).CT5() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        if (((X.C19742Wej) r1.getValue()).A01.A05() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        ((X.C19742Wej) r1.getValue()).A01(false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011c, code lost:
        r0.ACw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACw() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00bb;
                case 2: goto L_0x001b;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00d7;
                case 5: goto L_0x002f;
                case 6: goto L_0x0036;
                case 7: goto L_0x003d;
                case 8: goto L_0x0044;
                case 9: goto L_0x00e9;
                case 10: goto L_0x00f8;
                case 11: goto L_0x0103;
                case 12: goto L_0x010e;
                case 13: goto L_0x006f;
                case 14: goto L_0x009f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.Uau r0 = (X.C15344Uau) r0
            X.0eM r0 = r0.A0R
            java.lang.Object r2 = r0.getValue()
            X.2YL r2 = (X.2YL) r2
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 19
            X.C13991Tnr.A1K(r2, r1, r0)
        L_0x001a:
            return
        L_0x001b:
            java.lang.Object r1 = r5.A01
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r1 = (com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment) r1
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L_0x001a
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x001a
            r1.CgO()
            return
        L_0x002f:
            java.lang.Object r0 = r5.A01
            X.Uaz r0 = (X.C15348Uaz) r0
            X.0eM r1 = r0.A0E
            goto L_0x004a
        L_0x0036:
            java.lang.Object r0 = r5.A01
            X.Ub0 r0 = (X.C15349Ub0) r0
            X.0eM r1 = r0.A0E
            goto L_0x004a
        L_0x003d:
            java.lang.Object r0 = r5.A01
            X.Uax r0 = (X.C15346Uax) r0
            X.0eM r1 = r0.A0E
            goto L_0x004a
        L_0x0044:
            java.lang.Object r0 = r5.A01
            X.Uay r0 = (X.C15347Uay) r0
            X.0eM r1 = r0.A0E
        L_0x004a:
            java.lang.Object r0 = r1.getValue()
            X.Wej r0 = (X.C19742Wej) r0
            boolean r0 = r0.CT5()
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r1.getValue()
            X.Wej r0 = (X.C19742Wej) r0
            X.6z9 r0 = r0.A01
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r1.getValue()
            X.Wej r1 = (X.C19742Wej) r1
            r0 = 0
            r1.A01(r0, r0)
            return
        L_0x006f:
            java.lang.Object r0 = r5.A01
            X.Uam r0 = (X.C15337Uam) r0
            X.Jhq r4 = X.C15337Uam.A01(r0)
            X.2Fk r3 = r4.A00
            java.lang.Object r0 = r3.A02()
            X.ULE r0 = (X.ULE) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A05
            if (r0 != r1) goto L_0x001a
            java.lang.Object r0 = r3.A02()
            X.ULE r0 = (X.ULE) r0
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x001a
            X.05G r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r4.A00(r0, r2, r1)
            return
        L_0x009f:
            java.lang.Object r1 = r5.A01
            com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment r1 = (com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment) r1
            X.6uX r0 = r1.A01
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x001a
            r0 = 0
            com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment.A00(r1, r0)
            return
        L_0x00b2:
            java.lang.Object r1 = r5.A01
            X.Ubn r1 = (X.C15388Ubn) r1
            r0 = 0
            X.C15388Ubn.A02(r1, r0, r0)
            return
        L_0x00bb:
            java.lang.Object r0 = r5.A01
            X.UYu r0 = (X.UYu) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Ji4 r0 = (X.C60247Ji4) r0
            r0.A00()
            return
        L_0x00cb:
            java.lang.Object r0 = r5.A01
            X.UZq r0 = (X.C15286UZq) r0
            X.MuC r0 = r0.A07()
            r0.A05()
            return
        L_0x00d7:
            java.lang.Object r0 = r5.A01
            X.Uak r0 = (X.C15335Uak) r0
            X.0eM r0 = r0.A0Q
            java.lang.Object r2 = r0.getValue()
            X.JjA r2 = (X.C60309JjA) r2
            r1 = 1
            r0 = 0
            X.C60309JjA.A02(r2, r1, r0)
            return
        L_0x00e9:
            java.lang.Object r0 = r5.A01
            X.Uah r0 = (X.C15332Uah) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.U8e r0 = (X.C14768U8e) r0
            X.Uqq r0 = r0.A03
            goto L_0x011c
        L_0x00f8:
            java.lang.Object r0 = r5.A01
            X.Uar r0 = (X.C15341Uar) r0
            X.U8q r0 = X.C13990Tnq.A0X(r0)
            X.Uqt r0 = r0.A04
            goto L_0x011c
        L_0x0103:
            java.lang.Object r0 = r5.A01
            X.Uaj r0 = (X.C15334Uaj) r0
            X.U8g r0 = X.C15334Uaj.A00(r0)
            X.Uqs r0 = r0.A05
            goto L_0x011c
        L_0x010e:
            java.lang.Object r0 = r5.A01
            X.Uai r0 = (X.C15333Uai) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.U8r r0 = (X.C14781U8r) r0
            X.Uqr r0 = r0.A03
        L_0x011c:
            r0.ACw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WWL.ACw():void");
    }
}
