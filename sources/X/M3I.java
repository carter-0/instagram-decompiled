package X;

import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public final class M3I implements Runnable {
    public final /* synthetic */ FollowersShareFragment A00;

    public M3I(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b5, code lost:
        if (X.0qQ.A0K(r8.CDM(r6, r7[241(0xf1, float:3.38E-43)]), "on") == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ca, code lost:
        if (X.C363558jv.A00(X.AnonymousClass7TE.A0l(r10)) == false) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r4 = r11.A00
            X.KO3 r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r4)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x018b
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L_0x018b
            android.os.Bundle r3 = r4.mArguments
            if (r3 == 0) goto L_0x003f
            X.3Q2 r1 = X.LRK.A00(r4)
            X.KNl r0 = r4.A0C
            if (r0 == 0) goto L_0x01f9
            X.28D r0 = r0.A0F
            r1.A0i = r0
            java.lang.String r1 = "UPCOMING_EVENT"
            java.lang.Object r0 = r3.get(r1)
            boolean r0 = r0 instanceof com.instagram.user.model.UpcomingEvent
            if (r0 == 0) goto L_0x003f
            X.3Q2 r2 = X.LRK.A00(r4)
            java.lang.Object r1 = r3.get(r1)
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            r0 = 0
            if (r1 == 0) goto L_0x003d
            com.instagram.user.model.UpcomingEventImpl r0 = r1.FGz(r0)
        L_0x003d:
            r2.A1p = r0
        L_0x003f:
            X.82q r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r4)
            boolean r0 = r0.CKP()
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L_0x00c6
            X.0eM r2 = r4.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            if (r0 == 0) goto L_0x00c6
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass431.A00(r0)
            if (r0 == 0) goto L_0x00c6
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.VH4.A00(r0)
            if (r0 == 0) goto L_0x00c6
            boolean r0 = X.JTP.A1Z(r4)
            if (r0 == 0) goto L_0x01d5
            X.82q r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r4)
            java.util.List r1 = r0.Co4()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00c6
            java.util.ListIterator r6 = X.C51968G9o.A18(r1)
        L_0x007f:
            boolean r0 = r6.hasPrevious()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r5 = r6.previous()
            r0 = r5
            com.instagram.creation.base.MediaSession r0 = (com.instagram.creation.base.MediaSession) r0
            java.lang.Integer r1 = r0.Bsu()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x007f
        L_0x0094:
            com.instagram.creation.base.MediaSession r5 = (com.instagram.creation.base.MediaSession) r5
            if (r5 == 0) goto L_0x00c6
            X.KO3 r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r4)
            java.lang.String r1 = r5.BbR()
            X.4cI r0 = r0.A03
            X.3Q2 r1 = r0.BbQ(r1)
            if (r1 == 0) goto L_0x00c6
            X.2sT r0 = r4.A0c
            r1.A0Y(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.KNl r0 = r4.A0C
            if (r0 == 0) goto L_0x01f9
            java.lang.String r1 = r0.A0M
            X.3Q2 r0 = X.LRK.A00(r4)
            java.lang.String r0 = r0.A3t
            X.LTQ.A0A(r4, r2, r1, r0, r3)
        L_0x00c6:
            X.0eM r10 = r4.A0f
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r10)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.LMT r0 = new X.LMT
            r0.<init>(r1, r2)
            r4.A0H = r0
            X.EZv r2 = X.C48153EZv.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            boolean r8 = r2.A07(r0)
            boolean r0 = X.LTP.A0A(r4)
            if (r0 != 0) goto L_0x0104
            X.3Q2 r0 = X.LRK.A01(r4)
            if (r0 == 0) goto L_0x0104
            X.3Q2 r0 = X.LRK.A00(r4)
            boolean r0 = r0.A5T
            if (r0 != 0) goto L_0x0104
            X.5w9 r0 = X.AnonymousClass5w8.A05
            boolean r0 = X.JTU.A1X(r4)
            X.3Q2 r5 = X.LRK.A00(r4)
            if (r0 == 0) goto L_0x01bf
            r2.A06(r5, r7)
        L_0x0104:
            X.1Ng r5 = X.JTQ.A0F(r4)
            java.lang.Class<X.Lfa> r1 = X.C64648Lfa.class
            X.1wn r0 = r4.A07
            r5.A01(r0, r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.1Av r6 = X.1Au.A00(r0)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r10)
            X.3Q2 r0 = X.LRK.A00(r4)
            boolean r0 = r2.A09(r1, r0)
            if (r0 == 0) goto L_0x0188
            java.lang.String r5 = "on"
            if (r8 != 0) goto L_0x018c
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            java.lang.Boolean r0 = r0.Ak8()
            if (r0 == 0) goto L_0x0188
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0188
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r10)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36312518263571608(0x81020b00000498, double:3.0275209964328414E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x0188
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r10)
            r0 = 36312518263702682(0x81020b0002049a, double:3.027520996515733E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x0188
            X.0s0 r9 = r6.A7j
            X.0YZ[] r8 = X.1Av.A8a
            r1 = 241(0xf1, float:3.38E-43)
            r0 = r8[r1]
            java.lang.Object r0 = r9.CDM(r6, r0)
            if (r0 == 0) goto L_0x0179
            r0 = r8[r1]
            java.lang.Object r0 = r9.CDM(r6, r0)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0188
        L_0x0179:
            X.5w9 r0 = X.AnonymousClass5w8.A05
            boolean r0 = X.JTU.A1X(r4)
            if (r0 == 0) goto L_0x01b7
            X.3Q2 r0 = X.LRK.A00(r4)
            r2.A06(r0, r7)
        L_0x0188:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0F(r4)
        L_0x018b:
            return
        L_0x018c:
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r10)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36312518263571608(0x81020b00000498, double:3.0275209964328414E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x0188
            X.0s0 r8 = r6.A7j
            X.0YZ[] r7 = X.1Av.A8a
            r1 = 241(0xf1, float:3.38E-43)
            r0 = r7[r1]
            java.lang.Object r0 = r8.CDM(r6, r0)
            if (r0 == 0) goto L_0x01b7
            r0 = r7[r1]
            java.lang.Object r0 = r8.CDM(r6, r0)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0188
        L_0x01b7:
            X.3Q2 r0 = X.LRK.A00(r4)
            r2.A06(r0, r3)
            goto L_0x0188
        L_0x01bf:
            if (r8 == 0) goto L_0x01cc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r10)
            boolean r1 = X.C363558jv.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            r2.A06(r5, r0)
            goto L_0x0104
        L_0x01d2:
            r5 = 0
            goto L_0x0094
        L_0x01d5:
            X.3Q2 r1 = X.LRK.A00(r4)
            X.2sT r0 = r4.A0c
            r1.A0Y(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.KNl r0 = r4.A0C
            if (r0 == 0) goto L_0x01f9
            java.lang.String r1 = r0.A0M
            X.3Q2 r0 = X.LRK.A00(r4)
            java.lang.String r0 = r0.A3t
            X.LTQ.A0A(r4, r2, r1, r0, r7)
            goto L_0x00c6
        L_0x01f9:
            X.JTO.A1M()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M3I.run():void");
    }
}
