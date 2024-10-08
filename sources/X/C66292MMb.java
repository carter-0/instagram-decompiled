package X;

/* renamed from: X.MMb  reason: case insensitive filesystem */
public final class C66292MMb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66292MMb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, 0eO r2, int i) {
        return AnonymousClass0eN.A00(r2, new C66292MMb(obj, i));
    }

    public static C66292MMb A01(Object obj, int i) {
        return new C66292MMb(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c6, code lost:
        if (r0 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        r0.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        r0 = "commentsView";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014a, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x000c;
                case 1: goto L_0x0012;
                case 2: goto L_0x001f;
                case 3: goto L_0x0029;
                case 4: goto L_0x0033;
                case 5: goto L_0x003e;
                case 6: goto L_0x0048;
                case 7: goto L_0x0052;
                case 8: goto L_0x0061;
                case 9: goto L_0x006a;
                case 10: goto L_0x0086;
                case 11: goto L_0x0097;
                case 12: goto L_0x0076;
                case 13: goto L_0x00cf;
                case 14: goto L_0x009e;
                case 15: goto L_0x00b0;
                case 16: goto L_0x00c0;
                case 17: goto L_0x000f;
                case 18: goto L_0x0005;
                case 19: goto L_0x013a;
                case 20: goto L_0x0141;
                case 21: goto L_0x0148;
                case 22: goto L_0x000f;
                case 23: goto L_0x0005;
                case 24: goto L_0x013a;
                case 25: goto L_0x014b;
                case 26: goto L_0x000f;
                case 27: goto L_0x0005;
                case 28: goto L_0x013a;
                case 29: goto L_0x015f;
                case 30: goto L_0x000f;
                case 31: goto L_0x0005;
                case 32: goto L_0x013a;
                case 33: goto L_0x000f;
                case 34: goto L_0x0005;
                case 35: goto L_0x013a;
                case 36: goto L_0x000f;
                case 37: goto L_0x000f;
                case 38: goto L_0x0005;
                case 39: goto L_0x013a;
                case 40: goto L_0x0005;
                case 41: goto L_0x013a;
                case 42: goto L_0x000f;
                case 43: goto L_0x0005;
                case 44: goto L_0x013a;
                case 45: goto L_0x000f;
                case 46: goto L_0x0005;
                case 47: goto L_0x013a;
                case 48: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x000c:
            X.02m r3 = X.02m.A0p
            return r3
        L_0x000f:
            java.lang.Object r3 = r6.A01
            return r3
        L_0x0012:
            java.lang.Object r0 = r6.A01
            X.LMy r0 = (X.C64104LMy) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r1)
            return r3
        L_0x001f:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L5N r3 = new X.L5N
            r3.<init>(r0)
            return r3
        L_0x0029:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L2m r3 = new X.L2m
            r3.<init>(r0)
            return r3
        L_0x0033:
            java.lang.Object r0 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository r0 = (com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A0A
            com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder r3 = com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder.getInstanceDistillery(r0)
            return r3
        L_0x003e:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository r3 = new com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository
            r3.<init>(r0)
            return r3
        L_0x0048:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r3 = new com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository
            r3.<init>(r0)
            return r3
        L_0x0052:
            java.lang.Object r0 = r6.A01
            X.K6W r0 = (X.K6W) r0
            X.0eM r0 = r0.A0E
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6gx r3 = X.C313746gw.A00(r0)
            return r3
        L_0x0061:
            java.lang.Object r0 = r6.A01
            X.7l2 r0 = (X.C340297l2) r0
            r0.A0E()
            goto L_0x0148
        L_0x006a:
            java.lang.Object r1 = r6.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434357(0x7f0b1b75, float:1.8490526E38)
            X.2eb r3 = X.DbY.A0T(r1, r0)
            return r3
        L_0x0076:
            java.lang.Object r0 = r6.A01
            X.K6W r0 = (X.K6W) r0
            X.Kcz r0 = r0.stateView
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "stateView"
            goto L_0x00d9
        L_0x0081:
            r0.A01()
            goto L_0x0148
        L_0x0086:
            java.lang.Object r0 = r6.A01
            X.K6W r0 = (X.K6W) r0
            X.Kcg r0 = r0.commentsView
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r0.A04()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0097:
            java.lang.Object r0 = r6.A01
            X.K6W r0 = (X.K6W) r0
            X.Kcg r0 = r0.commentsView
            goto L_0x00c6
        L_0x009e:
            java.lang.Object r2 = r6.A01
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r2 = (com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment) r2
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.6go r0 = X.C313666go.GUEST
            X.KDm r3 = new X.KDm
            r3.<init>(r2, r1, r0)
            return r3
        L_0x00b0:
            java.lang.Object r0 = r6.A01
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r0 = (com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment) r0
            X.Kce r0 = r0.commentsView
            if (r0 == 0) goto L_0x00cc
            r0.A04()
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0v()
            return r3
        L_0x00c0:
            java.lang.Object r0 = r6.A01
            com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment r0 = (com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment) r0
            X.Kce r0 = r0.commentsView
        L_0x00c6:
            if (r0 == 0) goto L_0x00cc
            r0.A03()
            goto L_0x0148
        L_0x00cc:
            java.lang.String r0 = "commentsView"
            goto L_0x00d9
        L_0x00cf:
            java.lang.Object r0 = r6.A01
            X.K6W r0 = (X.K6W) r0
            X.L7N r0 = r0.cobroadcastView
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "cobroadcastView"
        L_0x00d9:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e1:
            X.0eM r0 = r0.A02
            java.lang.Object r5 = r0.getValue()
            X.Jj0 r5 = (X.C60302Jj0) r5
            X.L9O r0 = r5.A08
            X.0Ud r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0138
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x0138
            java.util.Iterator r3 = r2.iterator()
        L_0x0100:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0136
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Jw2 r0 = (X.C61064Jw2) r0
            java.lang.String r1 = r0.A02
            com.instagram.common.session.UserSession r0 = r5.A02
            java.lang.String r0 = r0.A06
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x0100
        L_0x011a:
            X.Jw2 r2 = (X.C61064Jw2) r2
            if (r2 == 0) goto L_0x0138
            java.lang.Object r3 = r2.A01
            if (r3 == 0) goto L_0x0138
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 37
            X.MGD r0 = new X.MGD
            r0.<init>(r3, r5, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            r0 = 1
        L_0x0131:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0136:
            r2 = r4
            goto L_0x011a
        L_0x0138:
            r0 = 0
            goto L_0x0131
        L_0x013a:
            java.lang.Object r0 = r6.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0141:
            java.lang.Object r0 = r6.A01
            X.M0a r0 = (X.C65808M0a) r0
            X.C65808M0a.A00(r0)
        L_0x0148:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x014b:
            java.lang.Object r3 = r6.A01
            X.KaQ r3 = (X.C62118KaQ) r3
            X.4DH r0 = r3.A01
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r3.A02
            X.6go r0 = r3.A03
            X.KDZ r3 = new X.KDZ
            r3.<init>(r2, r1, r0)
            return r3
        L_0x015f:
            java.lang.Object r0 = r6.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KC6 r3 = new X.KC6
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66292MMb.invoke():java.lang.Object");
    }
}
