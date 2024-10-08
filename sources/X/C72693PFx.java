package X;

/* renamed from: X.PFx  reason: case insensitive filesystem */
public final class C72693PFx implements C229132mt {
    public final int A00;
    public final Object A01;

    public C72693PFx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r1 = "emojiReactionsListViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ACw() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00c1;
                case 3: goto L_0x0011;
                case 4: goto L_0x00c9;
                case 5: goto L_0x0065;
                case 6: goto L_0x00d1;
                case 7: goto L_0x002f;
                case 8: goto L_0x0036;
                case 9: goto L_0x0043;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.NJW r0 = (X.NJW) r0
            X.OeR r0 = r0.A06()
            r0.A0c()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r9.A01
            X.NJj r0 = (X.C68471NJj) r0
            X.Jhj r4 = r0.A02
            if (r4 != 0) goto L_0x001c
            java.lang.String r1 = "directPollMessageOptionVotersViewModel"
            goto L_0x0093
        L_0x001c:
            r3 = 0
            com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel r0 = r0.A01
            java.lang.String r1 = "optionViewModel"
            if (r0 == 0) goto L_0x0093
            java.lang.String r2 = r0.A03
            long r0 = r0.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A00(r3, r2, r0)
            return
        L_0x002f:
            java.lang.Object r0 = r9.A01
            X.NK7 r0 = (X.NK7) r0
            X.Jhk r1 = r0.A02
            goto L_0x003c
        L_0x0036:
            java.lang.Object r0 = r9.A01
            X.Nbd r0 = (X.C68954Nbd) r0
            X.Jhk r1 = r0.A03
        L_0x003c:
            if (r1 == 0) goto L_0x0062
            r0 = 0
            r1.A00(r0)
            return
        L_0x0043:
            java.lang.Object r1 = r9.A01
            X.NKD r1 = (X.NKD) r1
            X.Jhp r2 = r1.A04
            if (r2 == 0) goto L_0x0062
            java.lang.String r3 = r1.A09
            java.lang.String r0 = "Required value was null."
            if (r3 == 0) goto L_0x00a0
            java.lang.String r4 = r1.A08
            if (r4 == 0) goto L_0x009b
            java.lang.String r5 = r1.A06
            java.lang.String r6 = X.NKD.A00(r1)
            r8 = 0
            int r7 = r1.A00
            r2.A00(r3, r4, r5, r6, r7, r8)
            return
        L_0x0062:
            java.lang.String r1 = "emojiReactionsListViewModel"
            goto L_0x0093
        L_0x0065:
            java.lang.Object r3 = r9.A01
            X.NIz r3 = (X.C68461NIz) r3
            X.0eM r2 = r3.A05
            java.lang.Object r0 = r2.getValue()
            X.Mti r0 = (X.C67729Mti) r0
            X.Ne3 r0 = r0.A00
            X.05G r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.NoW r1 = (X.C69588NoW) r1
            boolean r0 = r1 instanceof X.NW1
            if (r0 == 0) goto L_0x0010
            X.NW1 r1 = (X.NW1) r1
            java.lang.Object r0 = r1.A00
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0010
            X.2YL r5 = X.DbS.A0H(r2)
            java.lang.String r4 = r3.A02
            if (r4 != 0) goto L_0x00e2
            java.lang.String r1 = "mediaId"
        L_0x0093:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00a5:
            java.lang.Object r0 = r9.A01
            X.NKl r0 = (X.C68492NKl) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel r0 = (com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel) r0
            r0.A02()
            return
        L_0x00b5:
            java.lang.Object r0 = r9.A01
            X.NKn r0 = (X.C68494NKn) r0
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r0 = r0.A0D()
            r0.A0A()
            return
        L_0x00c1:
            java.lang.Object r0 = r9.A01
            X.NJ6 r0 = (X.NJ6) r0
            X.NJ6.A01(r0)
            return
        L_0x00c9:
            java.lang.Object r0 = r9.A01
            X.Ma2 r0 = (X.C66633Ma2) r0
            r0.A0x()
            return
        L_0x00d1:
            java.lang.Object r0 = r9.A01
            X.NKp r0 = (X.C68496NKp) r0
            X.0eM r0 = r0.A0K
            java.lang.Object r1 = r0.getValue()
            X.Mtw r1 = (X.C67743Mtw) r1
            r0 = 0
            r1.A01(r0, r0)
            return
        L_0x00e2:
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 30
            X.MFW r0 = new X.MFW
            r0.<init>(r5, r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72693PFx.ACw():void");
    }
}
