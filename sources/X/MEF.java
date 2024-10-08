package X;

public final class MEF extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MEF(Object obj, String str, AnonymousClass4D7 r4, int i) {
        super(1, r4);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MEF, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MEF, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r5) {
        Object obj;
        String str;
        int i;
        switch (this.A01) {
            case 0:
                obj = this.A02;
                str = this.A03;
                i = 0;
                break;
            case 1:
                obj = this.A02;
                str = this.A03;
                i = 1;
                break;
            case 2:
                obj = this.A02;
                str = this.A03;
                i = 2;
                break;
            case 3:
                return new MEF(this.A02, this.A03, r5, 3);
            case 4:
                obj = this.A02;
                str = this.A03;
                i = 4;
                break;
            case 5:
                obj = this.A02;
                str = this.A03;
                i = 5;
                break;
            default:
                obj = this.A02;
                str = this.A03;
                i = 6;
                break;
        }
        return new MEF(obj, str, r5, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MEF) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MEF, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r0 != r4) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        X.0eS.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0194, code lost:
        if (r1 == 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019c, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x017b;
                case 1: goto L_0x0129;
                case 2: goto L_0x00fb;
                case 3: goto L_0x005e;
                case 4: goto L_0x003f;
                case 5: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r13
            X.1Hj r4 = X.1Hj.A02
            int r1 = r12.A00
            r3 = 1
            if (r1 == 0) goto L_0x0011
            X.0eS.A00(r13)
        L_0x0010:
            return r0
        L_0x0011:
            X.0eS.A00(r13)
            com.instagram.wonderwall.api.WallUserApi r2 = com.instagram.wonderwall.api.WallUserApi.A00
            java.lang.Object r0 = r12.A02
            X.L5e r0 = (X.C63746L5e) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            java.lang.String r0 = r12.A03
            r12.A00 = r3
            java.lang.Object r0 = r2.A00(r1, r0, r12)
            if (r0 != r4) goto L_0x0010
            return r4
        L_0x0027:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r12.A00
            r0 = 1
            if (r1 != 0) goto L_0x0059
            X.0eS.A00(r13)
            java.lang.Object r2 = r12.A02
            com.instagram.wonderwall.repository.WallFeedRepository r2 = (com.instagram.wonderwall.repository.WallFeedRepository) r2
            java.lang.String r1 = r12.A03
            r12.A00 = r0
            r0 = 0
            java.lang.Object r0 = com.instagram.wonderwall.repository.WallFeedRepository.A00(r2, r1, r12, r0, r0)
            goto L_0x0056
        L_0x003f:
            X.1Hj r4 = X.1Hj.A02
            int r1 = r12.A00
            r0 = 1
            if (r1 != 0) goto L_0x0059
            X.0eS.A00(r13)
            java.lang.Object r2 = r12.A02
            com.instagram.wonderwall.repository.AggregatedWallFeedRepository r2 = (com.instagram.wonderwall.repository.AggregatedWallFeedRepository) r2
            java.lang.String r1 = r12.A03
            r12.A00 = r0
            r0 = 0
            java.lang.Object r0 = com.instagram.wonderwall.repository.AggregatedWallFeedRepository.A00(r2, r1, r12, r0, r0)
        L_0x0056:
            if (r0 != r4) goto L_0x019a
            return r4
        L_0x0059:
            X.0eS.A00(r13)
            goto L_0x019a
        L_0x005e:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r12.A00
            r3 = 1
            if (r0 == 0) goto L_0x00d9
            X.0eS.A00(r13)
        L_0x0068:
            X.3Ii r13 = (X.C239803Ii) r13
            java.lang.Object r7 = r12.A02
            com.instagram.opal.impl.data.OpalRepository r7 = (com.instagram.opal.impl.data.OpalRepository) r7
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d0
            X.3Ih r13 = (X.C239793Ih) r13
            java.lang.Object r6 = r13.A00
            X.6zY r6 = (X.C324576zY) r6
            X.05G r5 = r7.A08
        L_0x007a:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Object r3 = r0.A02
            com.instagram.opal.impl.data.OpalProfileData r3 = (com.instagram.opal.impl.data.OpalProfileData) r3
            java.lang.Object r2 = r0.A01
            X.Jw2 r2 = (X.C61064Jw2) r2
            java.lang.Object r1 = r0.A00
            X.Jw2 r1 = (X.C61064Jw2) r1
            X.AnonymousClass7TG.A1T(r3, r2, r1)
            X.JwC r0 = new X.JwC
            r0.<init>((X.C61064Jw2) r2, (X.C61064Jw2) r1, (X.C324576zY) r6, (com.instagram.opal.impl.data.OpalProfileData) r3)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x007a
            X.3Ih r13 = X.C51967G9n.A0d()
        L_0x009f:
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f6
            X.05G r6 = r7.A08
        L_0x00a9:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.JwC r0 = (X.C61074JwC) r0
            r4 = 0
            java.lang.Object r3 = r0.A02
            com.instagram.opal.impl.data.OpalProfileData r3 = (com.instagram.opal.impl.data.OpalProfileData) r3
            java.lang.Object r2 = r0.A01
            X.Jw2 r2 = (X.C61064Jw2) r2
            java.lang.Object r1 = r0.A00
            X.Jw2 r1 = (X.C61064Jw2) r1
            X.AnonymousClass7TG.A1T(r3, r2, r1)
            X.JwC r0 = new X.JwC
            r0.<init>((X.C61064Jw2) r2, (X.C61064Jw2) r1, (X.C324576zY) r4, (com.instagram.opal.impl.data.OpalProfileData) r3)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x00a9
            X.5sO r13 = X.DbU.A0f()
        L_0x00cf:
            return r13
        L_0x00d0:
            boolean r0 = r13 instanceof X.C297815sO
            if (r0 != 0) goto L_0x009f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d9:
            X.0eS.A00(r13)
            java.lang.String r2 = r12.A03
            java.lang.Object r0 = r12.A02
            com.instagram.opal.impl.data.OpalRepository r0 = (com.instagram.opal.impl.data.OpalRepository) r0
            com.instagram.common.session.UserSession r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1OC r1 = X.1NP.A03(r1, r0, r2)
            r12.A00 = r3
            r0 = 72627069(0x454337d, float:2.4944122E-36)
            java.lang.Object r13 = r1.A00(r0, r12)
            if (r13 != r4) goto L_0x0068
            return r4
        L_0x00f6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00fb:
            X.1Hj r4 = X.1Hj.A02
            int r0 = r12.A00
            r2 = 1
            if (r0 == 0) goto L_0x0110
            X.0eS.A00(r13)
        L_0x0105:
            X.3Ii r13 = (X.C239803Ii) r13
            boolean r0 = r13 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0124
            X.3Ih r13 = (X.C239793Ih) r13
            java.lang.Object r0 = r13.A00
            return r0
        L_0x0110:
            X.0eS.A00(r13)
            java.lang.Object r0 = r12.A02
            com.instagram.igtv.repository.series.IGTVSeriesRepository r0 = (com.instagram.igtv.repository.series.IGTVSeriesRepository) r0
            com.instagram.igtv.repository.series.IGTVSeriesNetworkDataSource r1 = r0.A00
            java.lang.String r0 = r12.A03
            r12.A00 = r2
            java.lang.Object r13 = r1.A05(r0, r12)
            if (r13 != r4) goto L_0x0105
            return r4
        L_0x0124:
            java.lang.Exception r0 = X.JTU.A0T(r13)
            throw r0
        L_0x0129:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r9 = 1
            if (r1 == 0) goto L_0x0140
            X.0eS.A00(r13)
        L_0x0133:
            X.C5q r13 = (X.C43694C5q) r13
            java.lang.Object r1 = r12.A02
            com.instagram.friendmap.data.FriendMapAudienceListRepository r1 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r1
            r0 = 0
            com.instagram.friendmap.data.FriendMapAudienceListRepository.A00(r1, r13, r0, r0)
            X.0gF r13 = X.C60340gF.A00
            return r13
        L_0x0140:
            X.0eS.A00(r13)
            java.lang.Object r4 = r12.A02
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.05G r3 = r4.A06
        L_0x0149:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jve r1 = (X.C61040Jve) r1
            r6 = 0
            java.lang.Object r7 = r1.A01
            java.util.List r7 = (java.util.List) r7
            boolean r8 = r1.A04
            boolean r10 = r1.A03
            boolean r11 = r1.A06
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.Jve r5 = new X.Jve
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r1 = r3.AIY(r2, r5)
            if (r1 == 0) goto L_0x0149
            X.4A4 r1 = r4.A03
            java.lang.String r3 = r4.A00
            java.lang.String r2 = r12.A03
            r12.A00 = r9
            com.instagram.friendmap.data.FriendMapGraphQLImpl r1 = r1.A00
            java.lang.Object r13 = r1.A05(r3, r2, r12)
            if (r13 != r0) goto L_0x0133
            return r0
        L_0x017b:
            X.1Hj r0 = X.1Hj.A02
            int r1 = r12.A00
            r8 = 1
            if (r1 == 0) goto L_0x019d
            X.0eS.A00(r13)
        L_0x0185:
            X.C5q r13 = (X.C43694C5q) r13
            java.lang.Object r2 = r12.A02
            com.instagram.friendmap.data.FriendMapAudienceListRepository r2 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r2
            java.lang.String r0 = r12.A03
            if (r0 == 0) goto L_0x0196
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0197
        L_0x0196:
            r0 = 1
        L_0x0197:
            com.instagram.friendmap.data.FriendMapAudienceListRepository.A00(r2, r13, r8, r0)
        L_0x019a:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x019d:
            X.0eS.A00(r13)
            java.lang.Object r4 = r12.A02
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.05G r3 = r4.A06
        L_0x01a6:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jve r1 = (X.C61040Jve) r1
            X.0sn r7 = X.0sn.A00
            r6 = 0
            boolean r9 = r1.A05
            boolean r10 = r1.A03
            boolean r11 = r1.A06
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.Jve r5 = new X.Jve
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r1 = r3.AIY(r2, r5)
            if (r1 == 0) goto L_0x01a6
            X.4A4 r1 = r4.A03
            java.lang.String r2 = r12.A03
            r12.A00 = r8
            com.instagram.friendmap.data.FriendMapGraphQLImpl r1 = r1.A00
            java.lang.Object r13 = r1.A05(r2, r6, r12)
            if (r13 != r0) goto L_0x0185
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MEF.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
