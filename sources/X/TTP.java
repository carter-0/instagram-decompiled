package X;

public final class TTP extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTP(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.3zt] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.lang.Object, X.3zt] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if ((r1.A00 instanceof X.C13945Tlr) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x02bf;
                case 1: goto L_0x02a8;
                case 2: goto L_0x027c;
                case 3: goto L_0x027c;
                case 4: goto L_0x026e;
                case 5: goto L_0x0260;
                case 6: goto L_0x0256;
                case 7: goto L_0x0242;
                case 8: goto L_0x020d;
                case 9: goto L_0x01ff;
                case 10: goto L_0x01f1;
                case 11: goto L_0x01e3;
                case 12: goto L_0x01d5;
                case 13: goto L_0x01bf;
                case 14: goto L_0x01a9;
                case 15: goto L_0x019b;
                case 16: goto L_0x018d;
                case 17: goto L_0x017f;
                case 18: goto L_0x0171;
                case 19: goto L_0x0163;
                case 20: goto L_0x0155;
                case 21: goto L_0x0147;
                case 22: goto L_0x010d;
                case 23: goto L_0x00ce;
                case 24: goto L_0x00b8;
                case 25: goto L_0x0085;
                case 26: goto L_0x0005;
                case 27: goto L_0x0028;
                case 28: goto L_0x0005;
                case 29: goto L_0x0028;
                case 30: goto L_0x0005;
                case 31: goto L_0x0028;
                case 32: goto L_0x0005;
                case 33: goto L_0x0028;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0028;
                case 38: goto L_0x0005;
                case 39: goto L_0x0028;
                case 40: goto L_0x0005;
                case 41: goto L_0x0028;
                case 42: goto L_0x0005;
                case 43: goto L_0x0028;
                case 44: goto L_0x0005;
                case 45: goto L_0x0028;
                case 46: goto L_0x0005;
                case 47: goto L_0x0028;
                case 48: goto L_0x005b;
                case 49: goto L_0x004c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0027
        L_0x0011:
            java.lang.Object r0 = r7.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0049
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0049
            X.2YQ r2 = r1.getDefaultViewModelCreationExtras()
        L_0x0027:
            return r2
        L_0x0028:
            java.lang.Object r0 = r7.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0040
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0040
            X.2YM r2 = r1.getDefaultViewModelProviderFactory()
            if (r2 != 0) goto L_0x0027
        L_0x0040:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r2 = r0.getDefaultViewModelProviderFactory()
            return r2
        L_0x0049:
            X.2YP r2 = X.AnonymousClass2YP.A00
            return r2
        L_0x004c:
            java.lang.Object r0 = r7.A02
            X.LCW r0 = (X.LCW) r0
            android.net.ConnectivityManager r1 = r0.A00
            java.lang.Object r0 = r7.A01
            android.net.ConnectivityManager$NetworkCallback r0 = (android.net.ConnectivityManager.NetworkCallback) r0
            r1.unregisterNetworkCallback(r0)
            goto L_0x02ca
        L_0x005b:
            java.lang.Object r0 = r7.A02
            X.LAs r0 = (X.C63889LAs) r0
            X.S4u r3 = r0.A01
            if (r3 == 0) goto L_0x02ca
            java.lang.Object r2 = r7.A01
            X.Rrh r1 = r3.A02
            java.util.Set r0 = r1.A01
            r0.remove(r2)
            X.SHY r2 = r3.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007b
            X.TaB r0 = r1.A00
            boolean r1 = r0 instanceof X.C13945Tlr
            r0 = 1
            if (r1 == 0) goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            boolean r0 = X.C66581MXm.A1a(r0)
            r2.A01(r0)
            goto L_0x02ca
        L_0x0085:
            java.lang.Object r4 = r7.A01
            java.lang.Object r3 = r7.A02
            X.0lg r3 = (X.0lg) r3
            r0 = 0
            if (r4 == 0) goto L_0x00a3
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.RQE> r2 = X.RQE.class
            r1 = 27
            X.TVx r0 = new X.TVx
            r0.<init>(r4, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.RQE r0 = (X.RQE) r0
            X.3zi r2 = r0.A00
            return r2
        L_0x00a3:
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.RxG> r2 = X.C10737RxG.class
            r1 = 33
            X.TVx r0 = new X.TVx
            r0.<init>(r3, r1)
            java.lang.Object r0 = r3.A01(r2, r0)
            X.RxG r0 = (X.C10737RxG) r0
            X.3zi r2 = r0.A00
            return r2
        L_0x00b8:
            X.02m r1 = X.C51965G9l.A0l()
            java.lang.Object r0 = r7.A02
            X.Ryr r0 = (X.C10831Ryr) r0
            X.0eM r0 = r0.A0A
            r0.getValue()
            r0 = 424096228(0x194731e4, float:1.0298134E-23)
            X.3zy r2 = new X.3zy
            r2.<init>(r1, r0)
            return r2
        L_0x00ce:
            java.lang.Object r0 = r7.A02
            X.Ryr r0 = (X.C10831Ryr) r0
            X.0eM r1 = r0.A0A
            java.lang.Object r0 = r1.getValue()
            X.94N r0 = (X.AnonymousClass94N) r0
            java.lang.Double r6 = r0.A01
            java.lang.Object r0 = r1.getValue()
            X.94N r0 = (X.AnonymousClass94N) r0
            java.lang.Double r5 = r0.A00
            java.lang.Object r4 = r7.A01
            X.0lg r4 = (X.0lg) r4
            X.02m r1 = X.C51965G9l.A0l()
            r0 = 424086240(0x19470ae0, float:1.0290255E-23)
            X.3zy r3 = new X.3zy
            r3.<init>(r1, r0)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.lang.Class<X.A7a> r0 = X.C39734A7a.class
            r2 = 6
            X.IoC r1 = new X.IoC
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r0 = r4.A01(r0, r1)
            X.A7a r0 = (X.C39734A7a) r0
            X.0eM r0 = r0.A03
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x010d:
            java.lang.Object r3 = r7.A02
            X.A7a r3 = (X.C39734A7a) r3
            X.3zt r6 = r3.A00
            X.So5 r5 = new X.So5
            r5.<init>()
            java.lang.Double r2 = r3.A02
            java.lang.String r1 = "TargetSpeedSource"
            java.lang.String r0 = "222"
            X.So3 r4 = new X.So3
            r4.<init>(r2, r1, r0)
            java.lang.Double r3 = r3.A01
            java.lang.String r2 = "MultiplierCapSource"
            java.lang.String r0 = "333"
            X.So3 r1 = new X.So3
            r1.<init>(r3, r2, r0)
            X.So4 r0 = new X.So4
            r0.<init>()
            X.3zt[] r0 = new X.C258943zt[]{r6, r5, r4, r1, r0}
            java.util.List r3 = X.0sr.A1P(r0)
            java.lang.Object r1 = r7.A01
            X.3zy r1 = (X.C258993zy) r1
            java.lang.String r0 = "ScrollSpeedAggregated"
            X.3zz r2 = new X.3zz
            r2.<init>(r1, r0, r3)
            return r2
        L_0x0147:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            X.3Dw r0 = (X.C238903Dw) r0
            X.T7F r2 = new X.T7F
            r2.<init>(r0, r1)
            return r2
        L_0x0155:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94Z r2 = new X.94Z
            r2.<init>(r1, r0)
            return r2
        L_0x0163:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.RyT r2 = new X.RyT
            r2.<init>(r1, r0)
            return r2
        L_0x0171:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.Rz1 r2 = new X.Rz1
            r2.<init>(r1, r0)
            return r2
        L_0x017f:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94u r2 = new X.94u
            r2.<init>(r1, r0)
            return r2
        L_0x018d:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94U r2 = new X.94U
            r2.<init>(r1, r0)
            return r2
        L_0x019b:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.3zX r2 = new X.3zX
            r2.<init>(r1, r0)
            return r2
        L_0x01a9:
            java.lang.Object r0 = r7.A02
            X.RzJ r0 = (X.C10858RzJ) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            X.3zu r1 = (X.C258953zu) r1
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.So6 r2 = new X.So6
            r2.<init>(r0, r1)
            return r2
        L_0x01bf:
            java.lang.Object r0 = r7.A02
            X.RzJ r0 = (X.C10858RzJ) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            X.3zu r1 = (X.C258953zu) r1
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.So7 r2 = new X.So7
            r2.<init>(r0, r1)
            return r2
        L_0x01d5:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.RzJ r2 = new X.RzJ
            r2.<init>(r1, r0)
            return r2
        L_0x01e3:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94S r2 = new X.94S
            r2.<init>(r1, r0)
            return r2
        L_0x01f1:
            java.lang.Object r1 = r7.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r7.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94M r2 = new X.94M
            r2.<init>(r1, r0)
            return r2
        L_0x01ff:
            java.lang.Object r1 = r7.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            X.94V r2 = new X.94V
            r2.<init>(r1, r0)
            return r2
        L_0x020d:
            java.lang.Object r3 = r7.A02
            X.TpD r3 = (X.C14065TpD) r3
            java.lang.Object r2 = r7.A01
            X.WJn r2 = (X.WJn) r2
            X.VLa r1 = r2.A0S
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r3.A00
            r0.remove(r1)
            r0 = 0
            r2.A0I = r0
            r2.A0H = r0
            X.2cs r0 = r2.A0G
            if (r0 == 0) goto L_0x023d
            r0.A0B(r2)
            X.2cs r0 = r2.A0F
            if (r0 == 0) goto L_0x0238
            r0.A0B(r2)
            X.WJn.A01(r2)
            goto L_0x02ca
        L_0x0238:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x023d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0242:
            java.lang.Object r2 = r7.A01
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r7.A02
            X.IIS r0 = (X.IIS) r0
            X.2V1 r1 = r0.A00
            X.7et r0 = new X.7et
            r0.<init>(r1)
            java.lang.Object r2 = r2.invoke(r0)
            return r2
        L_0x0256:
            java.lang.Object r1 = r7.A02
            X.7gh r1 = (X.C337657gh) r1
            X.7gW r0 = X.C336767f9.A01
            r1.A0H()
            goto L_0x02ca
        L_0x0260:
            java.lang.Object r0 = r7.A02
            X.7h8 r0 = (X.C337927h8) r0
            X.2Wg r1 = r0.A0A
            java.lang.Object r0 = r7.A01
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1.FIe(r0)
            goto L_0x02ca
        L_0x026e:
            java.lang.Object r1 = r7.A01
            X.2Wh r1 = (X.2Wh) r1
            java.lang.Object r0 = r7.A02
            X.7h8 r0 = (X.C337927h8) r0
            X.2lf r0 = r0.A09
            X.C337407gI.A03(r0, r1)
            goto L_0x02ca
        L_0x027c:
            java.lang.Object r0 = r7.A02
            X.7h8 r0 = (X.C337927h8) r0
            java.util.List r0 = r0.A0C
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r3 = r7.A01
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            java.util.Iterator r2 = r0.iterator()
        L_0x028c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ca
            java.lang.Object r1 = r2.next()
            X.3B3 r1 = (X.AnonymousClass3B3) r1
            r3.A12(r1)
            boolean r0 = r1 instanceof X.QEf
            if (r0 == 0) goto L_0x028c
            X.QEf r1 = (X.QEf) r1
            r0 = 0
            X.C245983dn.A02(r0)
            r1.A00 = r0
            goto L_0x028c
        L_0x02a8:
            java.lang.Object r3 = r7.A01
            X.07V r3 = (X.AnonymousClass07V) r3
            java.lang.Object r2 = r7.A02
            X.07Y r2 = (X.AnonymousClass07Y) r2
            r3.A09(r2)
            r1 = 0
            X.TTP r0 = new X.TTP
            r0.<init>(r1, r3, r2)
            X.3dj r2 = new X.3dj
            r2.<init>(r0)
            return r2
        L_0x02bf:
            java.lang.Object r1 = r7.A01
            X.07V r1 = (X.AnonymousClass07V) r1
            java.lang.Object r0 = r7.A02
            X.07Y r0 = (X.AnonymousClass07Y) r0
            r1.A0A(r0)
        L_0x02ca:
            X.0gF r2 = X.C60340gF.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTP.invoke():java.lang.Object");
    }
}
