package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

public final class NHx extends C272124k8 {
    public final int A00;
    public final N4G A01;
    public final C69620Np2 A02;
    public final Integer A03;
    public final Collection A04;
    public final Context A05;

    public NHx(Context context, N4G n4g, UserSession userSession, C69620Np2 np2, Integer num, Collection collection, int i) {
        super(userSession);
        this.A05 = context;
        this.A02 = np2;
        this.A01 = n4g;
        this.A03 = num;
        this.A04 = collection;
        this.A00 = i;
    }

    public final void A01(UserSession userSession) {
        View view;
        int A0D = AnonymousClass7TG.A0D(userSession, 1561425102);
        C69620Np2 np2 = this.A02;
        if ((np2 instanceof C68999Ncb) && (view = ((C68999Ncb) np2).A02.A00.mView) != null) {
            C46445Df7.A00(view, false);
        }
        AnonymousClass0fD.A0A(1086739505, A0D);
    }

    public final void A02(UserSession userSession) {
        View view;
        int A0D = AnonymousClass7TG.A0D(userSession, 645436993);
        C69620Np2 np2 = this.A02;
        if ((np2 instanceof C68999Ncb) && (view = ((C68999Ncb) np2).A02.A00.mView) != null) {
            C46445Df7.A00(view, true);
        }
        AnonymousClass0fD.A0A(1868738506, A0D);
    }

    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        Collection collection;
        int A032 = AnonymousClass0fD.A03(1465499634);
        int A033 = AnonymousClass0fD.A03(1402473591);
        0qQ.A0B(userSession, 0);
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            collection = this.A04;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                1bJ.A00(userSession).A75(C66581MXm.A0e(A18));
                2Dm A002 = 1bJ.A00(userSession);
                AnonymousClass3U9 A0a = C66581MXm.A0a(A002, A18);
                if (A0a != null && !A0a.Cdv(userSession)) {
                    AnonymousClass7Z9 r7 = new AnonymousClass7Z9(userSession, new PCU(userSession, A0a), A002);
                    C254703su BLG = A0a.BLG();
                    C254703su BLT = A0a.BLT();
                    if (BLG == null) {
                        BLG = BLT;
                    }
                    C376509Ig r2 = null;
                    if (!(BLG == null || BLG.A0g() == null)) {
                        r2 = new C376509Ig(BLG, BLT);
                    }
                    r7.Cm2(r2, C66580MXl.A0g(A18), true);
                }
            }
        } else if (intValue == 1) {
            collection = this.A04;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                1bJ.A00(userSession).EEl(C66581MXm.A0e(AnonymousClass7TE.A18(it2)), true, false);
            }
        } else {
            C20561Wub A1K = AnonymousClass7TE.A1K();
            AnonymousClass0fD.A0A(-930892868, A033);
            throw A1K;
        }
        1bJ.A00(userSession).A0C.A0I(collection.size());
        C70841ONs oNs = new C70841ONs(userSession);
        1bJ.A00(userSession).A0C.A0N(oNs.A00(), this.A00, false);
        AnonymousClass0fD.A0A(2076160375, A033);
        AnonymousClass0fD.A0A(-56121158, A032);
    }

    public final void A05(C268654dm r7, UserSession userSession) {
        int A032 = AnonymousClass0fD.A03(1649183190);
        AnonymousClass7TG.A1N(userSession, r7);
        C69620Np2 np2 = this.A02;
        if (np2 instanceof C69002Nce) {
            C71153OeR oeR = ((C69002Nce) np2).A02;
            if (oeR.A0b.isResumed()) {
                C69904Nu6.A00(oeR.A0Y, r7 instanceof C268674do);
            }
        } else if (np2 instanceof C68999Ncb) {
            String obj = C71115Od8.A00(r7).toString();
            C59689JTv.A0D(((C68999Ncb) np2).A00, "request_error");
            C69003Ncf ncf = (C69003Ncf) userSession.A01(C69003Ncf.class, new C73914Plp(userSession, 23));
            if (ncf.A00) {
                if (obj != null) {
                    ncf.A03("error_message", obj);
                }
                C67573Mq7.A00(ncf, new C51804G2n((C67573Mq7) ncf, "fetch_threads_fail", (String) null, 28));
            }
        }
        AnonymousClass0fD.A0A(1835292165, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r3 = r3.requireActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A06(com.instagram.common.session.UserSession r13, java.lang.Object r14) {
        /*
            r12 = this;
            r0 = 698955452(0x29a936bc, float:7.5146025E-14)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.1XT r14 = (X.AnonymousClass1XT) r14
            r0 = 1920238904(0x72748538, float:4.8432252E30)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r8 = r13
            X.AnonymousClass7TG.A1N(r13, r14)
            X.Np2 r4 = r12.A02
            X.N4G r7 = r12.A01
            boolean r0 = r4 instanceof X.C68999Ncb
            if (r0 == 0) goto L_0x0098
            X.Ncb r4 = (X.C68999Ncb) r4
            r11 = 0
            r0 = 2
            r10 = 1
            X.0qQ.A0B(r7, r0)
            java.lang.Integer r0 = r4.A01
            int r0 = r0.intValue()
            if (r0 == r11) goto L_0x0058
            if (r0 != r10) goto L_0x013c
            X.7V4 r0 = r4.A02
            X.4DH r3 = r0.A00
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x004b
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            X.37D r0 = X.DbT.A0i(r3)
            if (r0 == 0) goto L_0x0048
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != 0) goto L_0x004b
        L_0x0048:
            r3.onBackPressed()
        L_0x004b:
            r0 = -41998316(0xfffffffffd7f2814, float:-2.1197577E37)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 77291950(0x49b61ae, float:3.653003E-36)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0058:
            X.7V4 r5 = r4.A02
            X.0sa r0 = r5.A07
            r0.invoke()
            android.content.Context r6 = r4.A00
            r9 = 0
            X.OPR.A01(r6, r7, r8, r9, r10, r11)
            r0 = 23
            X.Plp r3 = new X.Plp
            r3.<init>(r13, r0)
            java.lang.Class<X.Ncf> r0 = X.C69003Ncf.class
            java.lang.Object r4 = r13.A01(r0, r3)
            X.Ncf r4 = (X.C69003Ncf) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0082
            r3 = 26
            X.Plp r0 = new X.Plp
            r0.<init>(r4, r3)
            X.C67573Mq7.A00(r4, r0)
        L_0x0082:
            boolean r3 = r5.A0B
            X.0sa r0 = r5.A08
            X.7Zg r0 = X.C66580MXl.A0W(r0)
            X.7S9 r0 = r0.AvL()
            if (r3 == 0) goto L_0x0094
            r0.CgQ()
            goto L_0x004b
        L_0x0094:
            r0.EIQ(r10)
            goto L_0x004b
        L_0x0098:
            boolean r0 = r4 instanceof X.C69002Nce
            if (r0 == 0) goto L_0x00cb
            X.Nce r4 = (X.C69002Nce) r4
            java.lang.Integer r3 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x004b
            X.OeR r5 = r4.A02
            android.content.Context r6 = r5.A0Y
            if (r6 == 0) goto L_0x00b5
            java.util.Collection r0 = r4.A01
            int r10 = r0.size()
            r11 = 0
            r9 = 0
            X.OPR.A01(r6, r7, r8, r9, r10, r11)
        L_0x00b5:
            java.util.HashSet r0 = r5.A0v
            java.util.Collection r3 = r4.A01
            r0.removeAll(r3)
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x00c7
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r3)
            X.C71153OeR.A0A(r0, r5)
        L_0x00c7:
            X.C71153OeR.A0J(r5)
            goto L_0x004b
        L_0x00cb:
            boolean r0 = r4 instanceof X.C68998Nca
            if (r0 == 0) goto L_0x00eb
            X.Nca r4 = (X.C68998Nca) r4
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.2Dm r3 = X.1bJ.A00(r13)
            X.2Ep r0 = r4.A01
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJy()
            r3.A75(r0)
            X.PuC r0 = r4.A00
        L_0x00e4:
            if (r0 == 0) goto L_0x004b
            r0.DRk()
            goto L_0x004b
        L_0x00eb:
            boolean r0 = r4 instanceof X.C69001Ncd
            if (r0 == 0) goto L_0x010b
            X.Ncd r4 = (X.C69001Ncd) r4
            r0 = 2
            X.0qQ.A0B(r7, r0)
            X.MiI r0 = r4.A00
            X.0sP r0 = r0.A00
            java.lang.Object r3 = r0.invoke(r13)
            X.2Dm r3 = (X.2Dm) r3
            X.2Ep r0 = r4.A02
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJy()
            r3.A75(r0)
            X.PuC r0 = r4.A01
            goto L_0x00e4
        L_0x010b:
            X.Ncc r4 = (X.C69000Ncc) r4
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.util.Map r0 = r4.A01
            java.util.Iterator r6 = X.DbV.A16(r0)
        L_0x0117:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r5 = r6.next()
            X.3sy r5 = (X.C254743sy) r5
            X.MpG r0 = r4.A00
            X.0sP r0 = r0.A04
            java.lang.Object r3 = r0.invoke(r13)
            X.2Dm r3 = (X.2Dm) r3
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r5)
            r3.A75(r0)
            goto L_0x0117
        L_0x0135:
            X.0sa r0 = r4.A02
            r0.invoke()
            goto L_0x004b
        L_0x013c:
            java.lang.String r1 = "Unhandled pending request response"
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NHx.A06(com.instagram.common.session.UserSession, java.lang.Object):void");
    }
}
