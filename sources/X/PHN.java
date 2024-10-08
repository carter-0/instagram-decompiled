package X;

public final class PHN implements C367608rH {
    public final int A00;
    public final Object A01;

    public PHN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        X.OYY.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        r3.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 2: goto L_0x000d;
                case 3: goto L_0x0005;
                case 4: goto L_0x0035;
                case 5: goto L_0x0048;
                case 6: goto L_0x0014;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0061;
                case 10: goto L_0x0091;
                case 11: goto L_0x009c;
                case 12: goto L_0x00a7;
                case 13: goto L_0x00b5;
                case 14: goto L_0x00c1;
                case 15: goto L_0x00da;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x0009:
            r0.invoke()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r5.A01
            X.NVe r0 = (X.C68744NVe) r0
            X.0sa r0 = r0.A06
            goto L_0x0009
        L_0x0014:
            java.lang.Object r2 = r5.A01
            X.OGt r2 = (X.C70698OGt) r2
            X.OSe r1 = r2.A02
            java.lang.String r0 = "direct_inbox_options_multi_select_click"
            X.C70931OSe.A00(r1, r0)
            X.Mkx r1 = r2.A03
            X.C67263Mkx.A04(r1)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x002d
            r0 = 0
        L_0x0029:
            X.C67263Mkx.A07(r1, r0)
            return
        L_0x002d:
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x0029
        L_0x0035:
            java.lang.Object r0 = r5.A01
            X.OGt r0 = (X.C70698OGt) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = r0.A00
            X.Nml r0 = X.C69503Nml.A03
            java.lang.String r1 = r0.toString()
            r0 = 0
            X.C49951FGg.A00(r2, r0, r3, r1, r0)
            return
        L_0x0048:
            java.lang.Object r4 = r5.A01
            X.OGt r4 = (X.C70698OGt) r4
            X.OSe r1 = r4.A02
            java.lang.String r0 = "direct_inbox_options_message_settings_click"
            X.C70931OSe.A00(r1, r0)
            X.1Yi r3 = X.C48732EjH.A00()
            androidx.fragment.app.FragmentActivity r2 = r4.A00
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = "direct_inbox_setting_entrypoint"
            r3.A01(r2, r1, r0)
            return
        L_0x0061:
            java.lang.Object r4 = r5.A01
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r4 = (com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment) r4
            java.lang.String r1 = "h2g_management_overflow_remove_all_tap"
            r0 = 0
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment.A02(r4, r1, r0)
            X.8ab r3 = X.DbW.A0V(r4)
            r3.A04()
            r0 = 2131963451(0x7f132e3b, float:1.9563656E38)
            r3.A09(r0)
            r0 = 2131963450(0x7f132e3a, float:1.9563654E38)
            r3.A08(r0)
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 1
            X.Oey r0 = new X.Oey
            r0.<init>(r4, r1)
            r3.A0J(r0, r2)
            r3.A03()
            X.DbT.A1V(r3)
            return
        L_0x0091:
            java.lang.Object r0 = r5.A01
            X.PMU r0 = (X.PMU) r0
            X.OYY r1 = r0.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00b1
        L_0x009c:
            java.lang.Object r0 = r5.A01
            X.PMU r0 = (X.PMU) r0
            X.OYY r1 = r0.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00b1
        L_0x00a7:
            java.lang.Object r0 = r5.A01
            X.PMU r0 = (X.PMU) r0
            X.OYY r1 = r0.A08()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00b1:
            X.OYY.A01(r1, r0)
            return
        L_0x00b5:
            java.lang.Object r0 = r5.A01
            X.NeU r0 = (X.C69089NeU) r0
            X.0sP r1 = r0.A05
            android.content.Context r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x00c1:
            java.lang.Object r0 = r5.A01
            X.NeU r0 = (X.C69089NeU) r0
            X.Ocu r3 = r0.A03
            X.N9O r0 = r0.A00
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.A00
            if (r0 != r1) goto L_0x00d2
            r2 = 1
        L_0x00d2:
            r0 = r2 ^ 1
            X.PLb r1 = new X.PLb
            r1.<init>(r0)
            goto L_0x00e6
        L_0x00da:
            java.lang.Object r0 = r5.A01
            X.NeU r0 = (X.C69089NeU) r0
            X.Ocu r3 = r0.A03
            r0 = 1
            X.PLs r1 = new X.PLs
            r1.<init>(r0)
        L_0x00e6:
            r3.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PHN.onClick():void");
    }
}
