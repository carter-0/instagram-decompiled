package X;

import android.content.Context;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.List;

public final class EC8 extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public EC8(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj3;
        this.A05 = z;
        this.A03 = obj2;
        this.A01 = obj;
        this.A04 = str;
    }

    public final void onFail(C268654dm r5) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(664063619);
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                int i2 = directShareSheetFragment.A09 - 1;
                directShareSheetFragment.A09 = i2;
                if (i2 == 0) {
                    if (this.A05) {
                        DirectShareSheetFragment.A0N(directShareSheetFragment, (List) this.A03);
                    } else {
                        DirectShareSheetFragment.A0J(directShareSheetFragment, (F2P) this.A02, (List) this.A03);
                    }
                }
                i = -2062106443;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(-1634085865);
                C59689JTv.A0E((Context) this.A02, "presence_settings_failed");
                ((G7L) this.A01).DED();
                i = 1701470027;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-2054428688);
                C59689JTv.A0A((Context) this.A01, "edit_media_level_remix_setting_failed");
                i = -636750915;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e5, code lost:
        if (r9 != false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
        /*
            r20 = this;
            r6 = r20
            r8 = r21
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x015e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -184479142(0xfffffffff501125a, float:-1.636178E32)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -644579446(0xffffffffd9947f8a, float:-5.2248159E15)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r8, r5)
            X.EC8.super.onSuccess(r8)
            java.lang.Object r8 = r6.A02
            X.1Xj r8 = (X.1Xj) r8
            X.1Xy r0 = r8.A0C
            X.1s9 r0 = r0.BP1()
            r4 = 0
            if (r0 == 0) goto L_0x015b
            X.Cwa r1 = r0.AKW()
            boolean r0 = r6.A05
            r0 = r0 ^ 1
            r1.A00 = r0
            X.1s8 r1 = r1.A00()
        L_0x0039:
            X.1Xy r0 = r8.A0C
            r0.Ecm(r1)
            X.1Xy r0 = r8.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x006f
            X.5o0 r3 = r0.AKX()
            X.1Xy r0 = r8.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0066
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x0066
            X.Cwa r1 = r0.AKW()
            boolean r0 = r6.A05
            r0 = r0 ^ 1
            r1.A00 = r0
            X.1s8 r4 = r1.A00()
        L_0x0066:
            r3.A0I = r4
            X.1sP r0 = r3.A00()
            r8.A3v(r0)
        L_0x006f:
            java.lang.Object r4 = r6.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r8.AE7(r4)
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x0140
            X.AnonymousClass1pc.A00()
            java.lang.Object r3 = r6.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = r6.A04
            X.0xG r9 = X.DbS.A0O(r0)
            X.HMr r14 = X.C54660HMr.DISABLE_REMIX_CONFIRMATION_DIALOG
            X.0Tu r8 = X.0Tu.A05
            r0 = 36315224092970089(0x81048100000c69, double:3.029232173839941E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x0140
            java.lang.String r6 = X.AnonymousClass7TG.A0j()
            X.Hs7 r13 = new X.Hs7
            r13.<init>(r9, r4)
            r0 = 36315224093166698(0x81048100030c6a, double:3.0292321739642775E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 != 0) goto L_0x00e7
            X.HMp r15 = X.C54658HMp.REMIX_SETTINGS
            java.util.Map r0 = X.C56461Hyt.A00
            java.lang.Object r0 = r0.get(r15)
            X.Hre r0 = (X.C56032Hre) r0
            if (r0 == 0) goto L_0x014d
            boolean r0 = r0.A01(r4)
            if (r0 != 0) goto L_0x014d
            r0 = 36596699069811279(0x82048100020a4f, double:3.2072380826030676E-306)
            long r11 = X.182.A01(r8, r4, r0)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r8 = "remix_setting_upsells_count"
            int r0 = r0.getInt(r8, r5)
            long r0 = (long) r0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r9 = 0
            if (r10 < 0) goto L_0x00d6
            r9 = 1
        L_0x00d6:
            X.0xa r1 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r0 = "tag_setting_upsells_untag_count"
            int r0 = r1.getInt(r0, r5)
            int r0 = r0 + 1
            X.AnonymousClass7TG.A1M(r1, r8, r0)
            if (r9 == 0) goto L_0x014d
        L_0x00e7:
            X.HMp r15 = X.C54658HMp.REMIX_SETTINGS
            java.util.Map r0 = X.C56461Hyt.A00
            java.lang.Object r0 = r0.get(r15)
            X.Hre r0 = (X.C56032Hre) r0
            if (r0 == 0) goto L_0x00f6
            r0.A00(r4)
        L_0x00f6:
            X.0xY r1 = X.AnonymousClass7TF.A0N(r4)
            java.lang.String r0 = "remix_setting_upsells_count"
            r1.E5Z(r0, r5)
            r1.apply()
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            java.util.LinkedHashMap r19 = X.AnonymousClass7TE.A1H()
            r18 = r6
            r13.A00(r14, r15, r16, r17, r18, r19)
            X.7Pr r4 = X.DbS.A0W(r4)
            r1 = 4
            X.PQo r0 = new X.PQo
            r0.<init>(r14, r13, r6, r1)
            r4.A0U = r0
            X.7Pu r9 = r4.A00()
            X.UYl r8 = new X.UYl
            r8.<init>()
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            r4 = 42
            r1 = 10
            r0 = 73
            java.lang.String r0 = X.Dbn.A00(r4, r1, r0)
            r5.putString(r0, r6)
            java.lang.String r0 = "entrypoint"
            r5.putSerializable(r0, r14)
            r8.setArguments(r5)
            r9.A03(r3, r8)
        L_0x0140:
            r0 = -2058378552(0xffffffff854fa2c8, float:-9.7629914E-36)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -478556762(0xffffffffe379cda6, float:-4.6080578E21)
        L_0x0149:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x014d:
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            java.lang.Integer r17 = X.AnonymousClass05K.A07
            java.util.LinkedHashMap r19 = X.AnonymousClass7TE.A1H()
            r18 = r6
            r13.A00(r14, r15, r16, r17, r18, r19)
            goto L_0x0140
        L_0x015b:
            r1 = r4
            goto L_0x0039
        L_0x015e:
            r0 = -521719929(0xffffffffe0e72f87, float:-1.3326946E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Dvk r8 = (X.C47350Dvk) r8
            r0 = -48672512(0xfffffffffd195100, float:-1.2737029E37)
            int r7 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "disabled"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x019a
            java.lang.Object r0 = r6.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            boolean r3 = r6.A05
            r0.A1b(r3)
            java.lang.Object r1 = r6.A01
            X.G7L r1 = (X.G7L) r1
            boolean r0 = r8.A00
            r0 = r0 ^ 1
            r1.Don(r3, r0)
        L_0x0190:
            r0 = 324913687(0x135dca17, float:2.799376E-27)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1761122666(0x68f8996a, float:9.391815E24)
            goto L_0x0149
        L_0x019a:
            java.lang.String r0 = "copresence_disabled"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0190
            java.lang.Object r0 = r6.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r5 = X.1Au.A00(r0)
            boolean r4 = r6.A05
            X.0s0 r3 = r5.A62
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 200(0xc8, float:2.8E-43)
            X.AnonymousClass7TF.A1J(r5, r3, r1, r0, r4)
            java.lang.Object r1 = r6.A01
            X.G7L r1 = (X.G7L) r1
            boolean r0 = r8.A01
            r0 = r0 ^ 1
            r1.Don(r0, r4)
            goto L_0x0190
        L_0x01c1:
            r0 = -502789242(0xffffffffe2080b86, float:-6.273969E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.74W r8 = (X.AnonymousClass74W) r8
            r0 = -627121379(0xffffffffda9ee31d, float:-2.236138E16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.8wd r0 = r8.A02
            if (r0 == 0) goto L_0x023a
            java.util.List r0 = r0.A1c
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
        L_0x01db:
            X.8wd r0 = r8.A02
            r9 = 1
            if (r0 == 0) goto L_0x0237
            boolean r8 = r0.A1d
            java.lang.String r7 = r0.A1K
        L_0x01e4:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x020a
            java.util.ArrayList r5 = X.AnonymousClass48M.A01(r1)
            java.lang.String r3 = r6.A04
            X.3t0 r0 = new X.3t0
            r0.<init>(r3)
            com.instagram.model.direct.DirectShareTarget r1 = new com.instagram.model.direct.DirectShareTarget
            r1.<init>(r0, r7, r5, r8)
            java.lang.Object r0 = r6.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            java.util.HashMap r0 = r0.A16
            r0.put(r3, r1)
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
        L_0x020a:
            java.lang.Object r3 = r6.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r3 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r3
            int r0 = r3.A09
            int r0 = r0 - r9
            r3.A09 = r0
            if (r0 != 0) goto L_0x0220
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x022b
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0N(r3, r0)
        L_0x0220:
            r0 = -228085558(0xfffffffff267b0ca, float:-4.5891048E30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1138707484(0x43df4c1c, float:446.5946)
            goto L_0x0149
        L_0x022b:
            java.lang.Object r1 = r6.A02
            X.F2P r1 = (X.F2P) r1
            java.lang.Object r0 = r6.A03
            java.util.List r0 = (java.util.List) r0
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0J(r3, r1, r0)
            goto L_0x0220
        L_0x0237:
            r8 = 1
            r7 = 0
            goto L_0x01e4
        L_0x023a:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EC8.onSuccess(java.lang.Object):void");
    }
}
