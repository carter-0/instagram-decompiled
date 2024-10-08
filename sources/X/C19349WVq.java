package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WVq  reason: case insensitive filesystem */
public final class C19349WVq implements C21052XBu, C20950X6d {
    public final int A00;
    public final Object A01;

    public C19349WVq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DKY(N3M n3m) {
        FragmentActivity fragmentActivity;
        UserSession userSession;
        String str;
        switch (this.A00) {
            case 0:
                String str2 = n3m.A02;
                if (str2 == null || str2.isEmpty()) {
                    C71874OsH osH = (C71874OsH) this.A01;
                    fragmentActivity = osH.A0A.requireActivity();
                    userSession = osH.A0D;
                    break;
                } else {
                    0kR.A0F(((C71874OsH) this.A01).A07, 0cp.A03(str2));
                    return;
                }
            case 1:
                0qQ.A0B(n3m, 0);
                ((Tw5) this.A01).A01.DKY(n3m);
                return;
            case 2:
                0qQ.A0B(n3m, 0);
                String str3 = n3m.A02;
                if (str3 == null || str3.length() == 0) {
                    C15381Ube ube = (C15381Ube) this.A01;
                    fragmentActivity = ube.requireActivity();
                    userSession = AnonymousClass7TE.A0l(ube.A0i);
                    break;
                } else {
                    C15381Ube ube2 = (C15381Ube) this.A01;
                    C15381Ube.A07(ube2, str3);
                    String str4 = n3m.A05;
                    if (str4 != null || n3m.A06 != null) {
                        0wc r0 = ube2.A04;
                        if (r0 == null) {
                            str = "logger";
                        } else {
                            1Ln A0G = 1Ln.A0G(r0);
                            if (DbT.A1Y(A0G)) {
                                C13989Tnp.A1J(A0G, n3m, str4);
                                Hashtag hashtag = C15381Ube.A01(ube2).A01;
                                String id = hashtag.getId();
                                if (id != null && id.length() == 0) {
                                    A0G.A0Q("hashtag_id", AnonymousClass7TE.A10(id));
                                }
                                C13990Tnq.A13(A0G, hashtag);
                                HAI hai = ube2.A08;
                                if (hai == null) {
                                    str = "dataSource";
                                } else {
                                    C13992Tns.A0l(A0G, hai, hashtag);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    return;
                }
                break;
            case 3:
                0qQ.A0B(n3m, 0);
                String str5 = n3m.A02;
                if (str5 == null || str5.length() == 0) {
                    C14138TqY tqY = (C14138TqY) this.A01;
                    fragmentActivity = tqY.requireActivity();
                    userSession = (UserSession) tqY.A0t.getValue();
                    break;
                } else {
                    C14138TqY tqY2 = (C14138TqY) this.A01;
                    1Ln A0G2 = 1Ln.A0G(tqY2.A02);
                    if (DbT.A1Y(A0G2)) {
                        C13989Tnp.A1J(A0G2, n3m, n3m.A05);
                        A0G2.A0R("query_text", tqY2.A0k.E4p());
                        A0G2.A0R("search_session_id", ((C14137TqX) tqY2).A09);
                        A0G2.A0R("rank_token", tqY2.A0i.E4z());
                        A0G2.Cgf();
                    }
                    FragmentActivity activity = tqY2.getActivity();
                    if (activity != null) {
                        AnonymousClass0eM r2 = tqY2.A0t;
                        if (!FH7.A0B(activity, (UserSession) r2.getValue(), str5, tqY2.getModuleName())) {
                            FHB.A04(activity, (UserSession) r2.getValue(), 2EG.A3J, str5, tqY2.getModuleName());
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                0qQ.A0B(n3m, 0);
                C15286UZq.A01(n3m, (C15286UZq) this.A01, n3m.A02, false);
                return;
        }
        C13990Tnq.A0y(fragmentActivity, userSession);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        r0 = "dataSource";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Di2(X.N3M r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x00e3;
                case 2: goto L_0x006e;
                case 3: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A01
            X.UZq r2 = (X.C15286UZq) r2
            X.0wc r0 = r2.A02
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "typedLogger"
        L_0x0013:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001b:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.TqY r3 = (X.C14138TqY) r3
            X.Trl r2 = r3.A08
            if (r2 == 0) goto L_0x006b
            java.lang.String r0 = r6.A05
            r1 = r0
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r6.A06
        L_0x002e:
            r2.A02(r0)
            X.Trf r0 = r3.A07
            if (r0 == 0) goto L_0x00bd
            X.C14488TxA.A00(r0, r3)
            X.0wc r0 = r3.A02
            X.1Ln r2 = X.1Ln.A0H(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x006a
            X.C13989Tnp.A1J(r2, r6, r1)
            X.X4b r0 = r3.A0k
            java.lang.String r1 = r0.E4p()
            java.lang.String r0 = "query_text"
            r2.A0R(r0, r1)
            r0 = r3
            X.TqX r0 = (X.C14137TqX) r0
            java.lang.String r1 = r0.A09
            java.lang.String r0 = "search_session_id"
            r2.A0R(r0, r1)
            X.X6r r0 = r3.A0i
            java.lang.String r1 = r0.E4z()
            java.lang.String r0 = "rank_token"
            r2.A0R(r0, r1)
            r2.Cgf()
        L_0x006a:
            return
        L_0x006b:
            java.lang.String r0 = "informModuleController"
            goto L_0x0013
        L_0x006e:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r4 = r5.A01
            X.Ube r4 = (X.C15381Ube) r4
            X.0wc r0 = r4.A04
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "logger"
            goto L_0x0013
        L_0x007d:
            X.1Ln r3 = X.1Ln.A0H(r0)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r6.A05
            X.C13989Tnp.A1J(r3, r6, r0)
            X.Vt4 r0 = X.C15381Ube.A01(r4)
            com.instagram.model.hashtag.Hashtag r2 = r0.A01
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x00a7
            int r0 = r1.length()
            if (r0 != 0) goto L_0x00a7
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            java.lang.String r0 = "hashtag_id"
            r3.A0Q(r0, r1)
        L_0x00a7:
            X.C13990Tnq.A13(r3, r2)
            X.HAI r0 = r4.A08
            if (r0 == 0) goto L_0x00bd
            X.C13992Tns.A0l(r3, r0, r2)
        L_0x00b1:
            X.HAI r0 = r4.A08
            if (r0 == 0) goto L_0x00bd
            X.TsA r0 = r4.A06
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "adapter"
            goto L_0x0013
        L_0x00bd:
            java.lang.String r0 = "dataSource"
            goto L_0x0013
        L_0x00c1:
            X.1Ln r1 = X.1Ln.A0H(r0)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = r6.A05
            X.C13989Tnp.A1J(r1, r6, r0)
            X.C13992Tns.A0n(r1, r2)
        L_0x00d3:
            X.MuC r0 = r2.A07()
            X.Ocm r3 = r0.A0C
            java.lang.String r2 = r0.A0F
            java.lang.String r1 = r0.A0G
            X.WyR r0 = X.C20754WyR.A00
            X.C71108Ocm.A03(r3, r2, r1, r0)
            return
        L_0x00e3:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r5.A01
            X.Tw5 r0 = (X.Tw5) r0
            X.XBu r0 = r0.A01
            r0.Di2(r6)
            return
        L_0x00f1:
            X.C14227TsA.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19349WVq.Di2(X.N3M):void");
    }

    public final boolean EtL(N3M n3m) {
        String str;
        switch (this.A00) {
            case 0:
                return false;
            case 1:
                if (!((Tw5) this.A01).A01.EtL(n3m) || !C70278O0i.A00(n3m).isEmpty()) {
                    return false;
                }
                return true;
            case 2:
                if (((C15381Ube) this.A01).A08 == null) {
                    str = "dataSource";
                    break;
                } else {
                    return false;
                }
            case 3:
                C14206Trl trl = ((C14138TqY) this.A01).A08;
                if (trl == null) {
                    str = "informModuleController";
                    break;
                } else {
                    return !trl.A03(n3m);
                }
            default:
                return ((C15286UZq) this.A01).A07().A06();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
