package X;

import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.Ifh  reason: case insensitive filesystem */
public final /* synthetic */ class C57740Ifh implements Runnable {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ C57740Ifh(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r0 = r23
            com.instagram.profile.fragment.UserDetailFragment r0 = r0.A00
            X.6wc r8 = r0.A12
            com.instagram.common.session.UserSession r7 = r8.A03
            X.7Pr r6 = X.DbS.A0W(r7)
            com.instagram.user.model.User r3 = r8.A07
            if (r3 == 0) goto L_0x014e
            boolean r0 = r3.A1q()
            if (r0 != 0) goto L_0x014e
        L_0x0016:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0018:
            r8.A00 = r0
            int r0 = r0.intValue()
            r9 = 1
            r10 = 0
            if (r0 == r10) goto L_0x010c
            if (r0 != r9) goto L_0x002c
            if (r3 == 0) goto L_0x002d
            boolean r0 = r3.A2P()
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            return
        L_0x002d:
            X.0Tu r11 = X.DbS.A0J(r7, r10)
            r4 = 36891969482064793(0x83110d000b0399, double:3.393968280270707E-306)
            java.lang.String r0 = X.182.A04(r11, r7, r4)
            java.util.List r22 = X.C322916wc.A01(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r20
            X.1Av r0 = r8.A04
            X.0xa r13 = r0.A01
            java.lang.String r12 = "h2g_last_shown_nux_time_epoch"
            r0 = 0
            long r18 = r13.getLong(r12, r0)
            int r14 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x0060
            long r16 = r2 - r18
            r14 = 43200(0xa8c0, double:2.13436E-319)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            return
        L_0x0060:
            java.util.Iterator r16 = r22.iterator()
        L_0x0064:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x002c
            int r14 = X.AnonymousClass7TG.A0F(r16)
            long r0 = (long) r14
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 > 0) goto L_0x0064
            java.lang.String r0 = "has-seen-highlights-to-grid-forced-conversion-conversion-nux-"
            java.lang.String r1 = X.002.A0O(r0, r14)
            X.0qQ.A0B(r1, r10)
            boolean r0 = r13.getBoolean(r1, r10)
            if (r0 != 0) goto L_0x002c
            X.DbX.A1V(r13, r1, r9)
            X.0xY r0 = r13.AR4()
            r0.E5c(r12, r2)
            r0.apply()
            X.C322916wc.A02(r8)
            r6.A1J = r9
            android.content.Context r2 = r8.A01
            r0 = 2131963468(0x7f132e4c, float:1.956369E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0g = r0
            r0 = 21
            X.ICz r0 = X.C56802ICz.A00(r8, r0)
            r6.A0K = r0
            X.4mX r0 = r8.A06
            r6.A0U = r0
            java.lang.String r0 = X.182.A04(r11, r7, r4)
            java.util.List r0 = X.C322916wc.A01(r0)
            int r0 = r0.size()
            if (r0 == r9) goto L_0x00cc
            r6.A1N = r9
            r0 = 2131963469(0x7f132e4d, float:1.9563692E38)
            java.lang.String r0 = r2.getString(r0)
            r6.A0h = r0
            r0 = 22
            X.ICz r0 = X.C56802ICz.A00(r8, r0)
            r6.A0L = r0
        L_0x00cc:
            X.7Pu r4 = r6.A00()
            r0 = 36610494505162761(0x82110d00081809, double:3.215962371469104E-306)
            long r5 = X.182.A01(r11, r7, r0)
            long r5 = r5 * r20
            java.util.Locale r3 = X.13s.A06
            r0 = 2360(0x938, float:3.307E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = r1.format(r0)
            android.os.Bundle r1 = X.DbV.A0B(r3, r9)
            X.C227642jf.A04(r1, r7)
            r0 = 3602(0xe12, float:5.047E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putString(r0, r3)
            X.HDD r0 = new X.HDD
            r0.<init>()
            r0.setArguments(r1)
            r4.A03(r2, r0)
            return
        L_0x010c:
            X.1Av r0 = r8.A04
            X.0xa r5 = r0.A01
            java.lang.String r4 = "h2g_nux_has_seen_self_profile"
            boolean r0 = r5.getBoolean(r4, r10)
            if (r0 != 0) goto L_0x002c
            X.C322916wc.A02(r8)
            r6.A1J = r9
            android.content.Context r3 = r8.A01
            r0 = 2131963467(0x7f132e4b, float:1.9563688E38)
            java.lang.String r0 = r3.getString(r0)
            r6.A0g = r0
            r0 = 20
            X.ICz r0 = X.C56802ICz.A00(r8, r0)
            r6.A0K = r0
            X.4mX r0 = r8.A06
            r6.A0U = r0
            X.7Pu r2 = r6.A00()
            android.os.Bundle r1 = X.DbV.A0B(r7, r10)
            X.C227642jf.A04(r1, r7)
            X.HDC r0 = new X.HDC
            r0.<init>()
            r0.setArguments(r1)
            r2.A03(r3, r0)
            X.DbX.A1V(r5, r4, r9)
            return
        L_0x014e:
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x0016
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r7)
            r0 = 36329019528789739(0x81110d000d3eeb, double:3.037956463002049E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0016
            r0 = 36329019528986350(0x81110d00103eee, double:3.037956463126387E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0016
            r0 = 36329019528593129(0x81110d000a3ee9, double:3.037956462877712E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57740Ifh.run():void");
    }
}
