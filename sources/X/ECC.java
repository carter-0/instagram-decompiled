package X;

import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity;

public final class ECC extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ECC(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A06 = str;
        this.A05 = str2;
        this.A01 = obj;
        this.A04 = str3;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [android.content.Context, com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity] */
    public final void onFail(C268654dm r12) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-262668353);
            ? r6 = (PermissionsInvitationUrlHandlerActivity) this.A03;
            QP5 qp5 = (QP5) this.A01;
            String str = this.A04;
            C49919FEu.A00.A02(qp5, (UserSession) this.A02, str, "invite_is_invalid");
            r6.A00.postDelayed(new C51300Frt(FFO.A01(r6, "invite_is_invalid")), 1000);
            r6.finish();
            i = 1435788229;
        } else {
            A032 = AnonymousClass0fD.A03(-244256302);
            Dd4 dd4 = (Dd4) this.A01;
            C3265677h.A0S(dd4.A08, dd4.A0A, "open_thread_error", DbS.A0q(this.A02), this.A04, "Activity Feed - Failed to fetch media object.");
            i = -646514538;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [android.content.Context, com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010d, code lost:
        if (r4 != null) goto L_0x017e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r23) {
        /*
            r22 = this;
            r6 = r22
            r3 = r23
            int r0 = r6.A00
            if (r0 == 0) goto L_0x0115
            r0 = 1356135731(0x50d4fd33, float:2.85869076E10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r3 = (X.AnonymousClass3JC) r3
            r1 = 941931394(0x3824bb82, float:3.9275277E-5)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.Object r7 = r3.A01
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x00e3
            java.lang.Class<X.BxB> r4 = X.C43373BxB.class
            r2 = 4276(0x10b4, float:5.992E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = 824931741(0x312b759d, float:2.495063E-9)
            X.3lr r3 = r7.getOptionalTreeField(r1, r3, r4, r2)
            if (r3 == 0) goto L_0x00e3
            r2 = 3440(0xd70, float:4.82E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r8 = r3.getCoercedBooleanField(r1, r2)
        L_0x003d:
            java.lang.Object r7 = r6.A03
            com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity r7 = (com.instagram.urlhandlers.permissionsinvitation.PermissionsInvitationUrlHandlerActivity) r7
            java.lang.Object r2 = r6.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r13 = r6.A06
            java.lang.String r12 = r6.A05
            java.lang.Object r9 = r6.A01
            X.QP5 r9 = (X.QP5) r9
            java.lang.String r4 = r6.A04
            X.FEu r3 = X.C49919FEu.A00
            if (r8 == 0) goto L_0x0169
            r3.A01(r9, r2, r4)
            java.lang.String r4 = r9.A00
            java.lang.String r3 = "entry_point"
            X.0eP r10 = X.AnonymousClass7TE.A1L(r3, r4)
            java.lang.String r4 = r9.A01
            java.lang.String r3 = "flow"
            X.0eP r8 = X.AnonymousClass7TE.A1L(r3, r4)
            java.lang.String r4 = r9.A02
            java.lang.String r3 = "flow_id"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r3, r4)
            java.lang.String r4 = r9.A03
            java.lang.String r3 = "surface"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r3, r4)
            r9 = 3
            X.0eP[] r3 = new X.0eP[]{r10, r8, r6, r3}
            java.util.LinkedHashMap r11 = X.0Yt.A06(r3)
            X.2ZQ r4 = X.C71172bH.A00()
            boolean r3 = r4 instanceof androidx.fragment.app.FragmentActivity
            r14 = 0
            if (r3 == 0) goto L_0x00e1
            android.content.Context r4 = (android.content.Context) r4
        L_0x008a:
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r8 = X.DbS.A0w(r9)
            java.lang.String r15 = "ig_permissions_first_screen_query"
            java.lang.String r3 = "encrypted_shared_account_access_info_id"
            r10.put(r3, r13)
            r3 = 1
            r8.set(r3)
            java.lang.String r6 = "encrypted_secure_nonce_code"
            r10.put(r6, r12)
            r8.set(r1)
            X.0qQ.A0B(r11, r1)
            java.lang.String r6 = "logging_data"
            r10.put(r6, r11)
            r6 = 2
            r8.set(r6)
            int r6 = r8.nextClearBit(r1)
            if (r6 < r9) goto L_0x0110
            java.util.LinkedHashMap r6 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r10)
        L_0x00bf:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x00e6
            java.util.Map$Entry r11 = X.AnonymousClass7TE.A1J(r12)
            java.lang.Object r9 = r11.getKey()
            java.util.Set r8 = X.FRA.A00
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00bf
            java.lang.Object r9 = r11.getKey()
            java.lang.Object r8 = r11.getValue()
            r6.put(r9, r8)
            goto L_0x00bf
        L_0x00e1:
            r4 = r14
            goto L_0x008a
        L_0x00e3:
            r8 = 0
            goto L_0x003d
        L_0x00e6:
            java.util.Map r16 = X.0Yt.A0B(r10)
            r19 = 0
            r18 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r13 = "com.bloks.www.screen_query.ig_permissions.account_delegate.invitation_screen"
            X.ShW r12 = new X.ShW
            r17 = r6
            r21 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            r6 = r4
            if (r4 != 0) goto L_0x00fe
            r6 = r7
        L_0x00fe:
            X.6Qj r2 = X.C48721Ej6.A00(r2, r1)
            X.WF5 r1 = new X.WF5
            r1.<init>(r14, r14, r14, r14)
            X.0qQ.A0B(r2, r3)
            r12.A02(r6, r1, r2)
            if (r4 == 0) goto L_0x0181
            goto L_0x017e
        L_0x0110:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x0115:
            r0 = -2122494841(0xffffffff817d4c87, float:-4.6523667E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.1XO r3 = (X.1XO) r3
            r1 = 1673290774(0x63bc6416, float:6.9503997E21)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.String r10 = r6.A06
            java.lang.String r1 = "notification_message_button"
            boolean r1 = r10.equals(r1)
            r2 = 0
            java.lang.Object r8 = r6.A01
            X.Dd4 r8 = (X.Dd4) r8
            if (r1 == 0) goto L_0x014f
            java.lang.Object r5 = r6.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.util.List r1 = r3.A06
            X.1Xj r3 = X.DbZ.A0T(r1, r2)
            java.lang.String r2 = r6.A05
            java.lang.String r1 = r6.A04
            X.Dd4.A09(r3, r8, r5, r2, r1)
        L_0x0145:
            r1 = 1281021443(0x4c5ad603, float:5.736654E7)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1929866482(0x73076cf2, float:1.0729519E31)
            goto L_0x018a
        L_0x014f:
            java.util.List r1 = r3.A06
            java.lang.Object r7 = r1.get(r2)
            X.1Xj r7 = (X.1Xj) r7
            java.lang.Object r9 = r6.A02
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.String r11 = r6.A04
            java.lang.String r12 = r6.A05
            java.lang.Object r1 = r6.A03
            long r13 = X.AnonymousClass7TE.A0R(r1)
            X.Dd4.A0A(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0145
        L_0x0169:
            java.lang.String r1 = "invite_is_invalid"
            r3.A02(r9, r2, r4, r1)
            X.3GP r1 = X.FFO.A01(r7, r1)
            android.os.Handler r4 = r7.A00
            X.Frt r3 = new X.Frt
            r3.<init>(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r3, r1)
        L_0x017e:
            r7.finish()
        L_0x0181:
            r1 = -1351466108(0xffffffffaf724384, float:-2.2033758E-10)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 590934421(0x2338f195, float:1.0025817E-17)
        L_0x018a:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ECC.onSuccess(java.lang.Object):void");
    }
}
