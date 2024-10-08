package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.OeR  reason: case insensitive filesystem */
public final class C71153OeR {
    public int A00;
    public long A01 = 0;
    public C69375NkF A02;
    public C67197Mjt A03;
    public C68952Nbb A04;
    public NKA A05;
    public C68497NKq A06;
    public C70497O8w A07;
    public C72686PFq A08;
    public C331157Pu A09;
    public Long A0A = 0L;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T = false;
    public C72684PFo A0U;
    public C72687PFr A0V;
    public C72685PFp A0W;
    public String A0X;
    public final Context A0Y;
    public final Handler A0Z = AnonymousClass7TF.A0D();
    public final C272124k8 A0a;
    public final AnonymousClass4DH A0b;
    public final AnonymousClass0iw A0c;
    public final 02m A0d;
    public final 0wc A0e;
    public final 1a8 A0f = new 1a8((C269794fh) null);
    public final 1a8 A0g;
    public final UserSession A0h;
    public final C74491Pvl A0i = new P3V(this);
    public final 2ED A0j;
    public final 2Dm A0k;
    public final C46483Dfm A0l;
    public final OTI A0m;
    public final C67565Mpz A0n;
    public final C69004Ncg A0o;
    public final OO9 A0p;
    public final OH3 A0q;
    public final OMH A0r;
    public final AnonymousClass4kA A0s;
    public final C322776wO A0t = new C50985FmY(this, 0);
    public final HashMap A0u = AnonymousClass7TE.A1E();
    public final HashSet A0v = AnonymousClass7TE.A1F();
    public final List A0w = AnonymousClass7TE.A1C();
    public final List A0x = AnonymousClass7TE.A1C();
    public final List A0y = AnonymousClass7TE.A1C();
    public final List A0z = AnonymousClass7TE.A1C();
    public final List A10 = AnonymousClass7TE.A1C();
    public final List A11 = AnonymousClass7TE.A1C();
    public final List A12 = Collections.synchronizedList(AnonymousClass7TE.A1C());
    public final Map A13 = AnonymousClass7TE.A1E();
    public final Map A14 = AnonymousClass7TE.A1E();
    public final Set A15 = AnonymousClass7TE.A1F();
    public final Set A16 = AnonymousClass7TE.A1F();
    public final boolean A17;
    public final 1wn A18 = new C71932OtG(this, 41);
    public final 1wn A19 = new C71932OtG(this, 42);
    public final 1wn A1A = new C71932OtG(this, 40);
    public final AnonymousClass2tB A1B = new C66905Meo(this, 0);
    public final C74398PuE A1C = new P3U(this);
    public final C74350PtQ A1D = new C72682PFm(this);
    public final C70750OJw A1E = new C70750OJw(this);
    public final C70489O8o A1F = new C70489O8o(this);
    public final C70490O8p A1G = new C70490O8p(this);
    public final C70491O8q A1H = new C70491O8q(this);
    public final C70751OJx A1I = new C70751OJx(this);
    public final C70492O8r A1J = new C70492O8r(this);
    public final C70493O8s A1K = new C70493O8s(this);
    public final C70494O8t A1L = new C70494O8t(this);
    public final OMG A1M = new OMG(this);
    public final C70496O8v A1N = new C70496O8v(this);
    public final P3T A1O = new P3T(this);
    public final C70940OSn A1P = new C70940OSn(this);
    public final C322776wO A1Q = new C67477MoX(this, 2);
    public final HashMap A1R = AnonymousClass7TE.A1E();

    public static void A0I(C71153OeR oeR) {
        oeR.A0M = true;
        oeR.A0l(false);
        OMH omh = oeR.A0r;
        NJW njw = omh.A00;
        if (njw.isResumed()) {
            NgN ngN = new NgN();
            Bundle A082 = DbY.A08(njw);
            A082.putString("IgSessionManager.SESSION_TOKEN_KEY", njw.getSession().A06);
            ngN.setArguments(A082);
            ngN.A01 = new C70499O8y(njw);
            0s1 A0C2 = DbW.A0C(njw);
            A0C2.A0I("filter_customization");
            A0C2.A07(R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out);
            A0C2.A0D(ngN, "filter_customization", R.id.thread_list_container);
            A0C2.A00();
        }
        omh.A01();
    }

    public static void A0O(C71153OeR oeR, String str, List list) {
        A0N(oeR, str, "bulk_action", (String) null, list, -1);
    }

    public final void A0k(C254743sy r16) {
        String str;
        C254743sy r7 = r16;
        C74516PwB A012 = A01(this, r7);
        if (A012 != null && !A012.CUG()) {
            UserSession userSession = this.A0h;
            AnonymousClass4DH r5 = this.A0b;
            boolean A1Z = AnonymousClass7TG.A1Z(userSession, r5);
            0qQ.A0B(r7, 3);
            Context requireContext = r5.requireContext();
            AnonymousClass170 A002 = C71097OcX.A00(A012);
            if (A002 != null) {
                boolean CXO = A002.CXO();
                int i = 2131958650;
                if (CXO) {
                    i = 2131958652;
                }
                str = requireContext.getString(i);
            } else {
                str = null;
            }
            String[] strArr = {str, AnonymousClass7TE.A16(requireContext, 2131960226)};
            C358248ab A0Y2 = DbS.A0Y(requireContext);
            A0Y2.A0e(new C71189Of8(2, r5, userSession, r7, A012), strArr);
            AnonymousClass7TH.A0a(A0Y2, A1Z);
            A0N(this, "direct_request_block_click", "swipe", (String) null, ImmutableList.of(r7), -1);
        }
    }

    public C71153OeR(AnonymousClass4DH r22, AnonymousClass0iw r23, UserSession userSession, OMH omh) {
        C69375NkF nkF;
        UserSession userSession2 = userSession;
        this.A0h = userSession2;
        C69647NpV A002 = C69991NvV.A00(userSession2);
        if (C272094k5.A0C(userSession2, true)) {
            nkF = C70889OQh.A01(AnonymousClass4iZ.A00, A002.A00.A02);
        } else {
            nkF = A002.A00;
        }
        this.A02 = nkF;
        OO9 oo9 = new OO9(userSession2);
        this.A0p = oo9;
        this.A0g = C66580MXl.A0O();
        if (C272094k5.A09(userSession2)) {
            PCX pcx = new PCX(this);
            UserSession userSession3 = this.A0h;
            C66752Mbx mbx = new C66752Mbx(userSession3, pcx, C67238MkY.A00(C67256Mkq.PENDING), -1, false);
            C66752Mbx mbx2 = new C66752Mbx(userSession3, pcx, C67238MkY.A00(C67256Mkq.SPAM), -1, false);
            1a8 r8 = this.A0g;
            1aU r0 = mbx.A05.A01;
            C66919MfD mfD = C66919MfD.A00;
            PU7.A00(r0.A0L(mfD), r8, this, 25);
            PU7.A00(mbx2.A05.A01.A0L(mfD), r8, this, 26);
            mbx.start();
            mbx2.start();
            OO9 oo92 = this.A0p;
            oo92.A01 = mbx;
            oo92.A02 = mbx2;
        }
        oo9.A05(this.A02.A01);
        AnonymousClass0iw r2 = r23;
        if (oo9.A00 != r2) {
            oo9.A00 = null;
            AnonymousClass43G r02 = oo9.A04;
            if (r02 == null) {
                0qQ.A0F("directCurrentSource");
                throw AnonymousClass00P.createAndThrow();
            }
            r02.A00 = null;
            oo9.A00 = r2;
            r02.A00 = r2;
        }
        this.A0d = 02m.A0p;
        this.A0o = O0Z.A00(userSession2);
        this.A0n = C67564Mpy.A00(userSession2);
        C68952Nbb nbb = new C68952Nbb(userSession2, JTR.A1Z(userSession2), true);
        this.A04 = nbb;
        AnonymousClass4DH r5 = r22;
        nbb.A0R(r5.requireContext(), C71342cb.A00(userSession2), r5);
        this.A0b = r5;
        Context requireContext = r5.requireContext();
        this.A0Y = requireContext;
        this.A0c = r2;
        this.A0r = omh;
        2Dr A003 = 1bJ.A00(userSession2);
        this.A0k = A003;
        this.A0j = A003.A0C;
        this.A17 = 2El.A0C(userSession2);
        this.A0e = AnonymousClass0kN.A01(r2, userSession2);
        this.A0a = new C68436NHv(userSession2, this);
        this.A0s = AnonymousClass4k9.A00(userSession2);
        this.A03 = new C67197Mjt(userSession2);
        this.A0l = C46482Dfl.A00(requireContext, r2, userSession2);
        this.A0q = new OH3(r5, r2, userSession2, new C70495O8u(this));
        this.A0m = (OTI) userSession2.A01(OTI.class, new C73667Phg(44, r2, userSession2));
        C68497NKq A004 = new 2YN(new C68541NMn(userSession2), r5.requireActivity()).A00(C68497NKq.class);
        this.A06 = A004;
        A004.A01.A06(r5.requireActivity(), new C50139FQw(this, 19));
    }

    public static int A00(C71153OeR oeR, List list) {
        int i;
        if (oeR.A0O) {
            return 0;
        }
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C74516PwB A012 = A01(oeR, (C254743sy) it.next());
            if (A012 != null) {
                boolean Cdt = A012.Cdt();
                i = 1;
                if (Cdt) {
                    i2 += i;
                }
            }
            i = 0;
            i2 += i;
        }
        return i2;
    }

    public static C74516PwB A01(C71153OeR oeR, C254743sy r2) {
        HashMap hashMap;
        if (r2 instanceof DirectThreadKey) {
            hashMap = oeR.A1R;
        } else if (!(r2 instanceof MsysThreadId)) {
            return null;
        } else {
            hashMap = oeR.A0u;
        }
        return (C74516PwB) hashMap.get(r2);
    }

    private void A08() {
        FragmentActivity activity = this.A0b.getActivity();
        if (activity != null && 1Wj.A00 != null) {
            1Wj A002 = DcL.A00();
            UserSession userSession = this.A0h;
            String str = this.A0X;
            if (str == null) {
                str = "";
            }
            A002.A00(activity, userSession, "687473233153548", DbY.A0m("nua_target_id", str));
        }
    }

    public static void A0A(ImmutableSet immutableSet, C71153OeR oeR) {
        Map map = oeR.A14;
        for (Object next : ImmutableSet.A03(map.keySet())) {
            List<2Eq> A132 = C66580MXl.A13(next, map);
            if (A132 != null) {
                ImmutableList.Builder builder = ImmutableList.builder();
                for (2Eq r1 : A132) {
                    if (!immutableSet.contains(r1.BJy())) {
                        builder.add(r1);
                    }
                }
                map.put(next, builder.build());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ad, code lost:
        if (X.C66640Ma9.A02(r8) != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.C67058MhZ r17, X.C71153OeR r18, X.C254743sy r19) {
        /*
            r1 = r19
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A04(r1)
            r0 = r18
            if (r3 == 0) goto L_0x00d0
            X.2Dm r2 = r0.A0k
            X.2Dr r2 = (X.2Dr) r2
            X.3U9 r4 = X.2Dr.A03(r2, r3)
            if (r4 == 0) goto L_0x0067
            java.util.List r3 = r4.BRZ()
        L_0x0018:
            com.instagram.common.session.UserSession r5 = r0.A0h
            X.0wc r2 = r0.A0e
            X.AnonymousClass73V.A08(r2, r5, r4, r3)
            X.PwB r8 = A01(r0, r1)
            r4 = 0
            r2 = r17
            if (r8 == 0) goto L_0x0064
            boolean r3 = r8.CUG()
            if (r3 == 0) goto L_0x0071
            boolean r7 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            android.content.Context r10 = r0.A0Y
            if (r7 == 0) goto L_0x0068
            X.PEQ r3 = new X.PEQ
            r3.<init>(r5)
        L_0x0039:
            X.0iw r6 = r0.A0c
            X.Mbo r9 = new X.Mbo
            r9.<init>(r10, r6, r5, r3)
            java.util.List r14 = r8.BkC()
            java.lang.String r13 = r8.AsX()
            int r15 = r8.BHS()
            int r16 = r8.C6a()
            boolean r18 = r8.CVr()
            X.PFc r11 = new X.PFc
            r11.<init>(r2, r0)
            r12 = r1
            r17 = r4
            r19 = r7
            boolean r3 = r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0062:
            if (r3 != 0) goto L_0x0067
        L_0x0064:
            A0C(r2, r0, r1)
        L_0x0067:
            return
        L_0x0068:
            X.0qQ.A0B(r5, r4)
            X.7Zn r3 = new X.7Zn
            r3.<init>(r5)
            goto L_0x0039
        L_0x0071:
            X.Dfm r6 = r0.A0l
            X.4DH r7 = r0.A0b
            boolean r3 = r8.CUG()
            if (r3 != 0) goto L_0x00ce
            java.util.List r3 = r8.BkC()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00ce
            java.util.List r3 = r8.BkC()
            java.lang.Object r9 = r3.get(r4)
            X.170 r9 = (X.AnonymousClass170) r9
        L_0x008f:
            boolean r14 = r8.isPending()
            boolean r15 = r8.CUG()
            java.util.List r4 = r8.AZs()
            java.lang.String r3 = r5.A06
            boolean r16 = r4.contains(r3)
            boolean r3 = r8.isPending()
            if (r3 == 0) goto L_0x00af
            boolean r3 = X.C66640Ma9.A02(r8)
            r17 = 1
            if (r3 == 0) goto L_0x00b1
        L_0x00af:
            r17 = 0
        L_0x00b1:
            int r12 = r8.C6a()
            r3 = 1
            X.PFX r8 = new X.PFX
            r8.<init>(r3, r0, r2, r1)
            java.lang.String r10 = "pending_inbox"
            r3 = 2
            X.0qQ.A0B(r1, r3)
            if (r9 == 0) goto L_0x0064
            boolean r13 = r1 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            java.lang.String r11 = X.C66647MaG.A0A(r1)
            boolean r3 = r6.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0062
        L_0x00ce:
            r9 = 0
            goto L_0x008f
        L_0x00d0:
            r4 = 0
            java.util.List r3 = java.util.Collections.emptyList()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153OeR.A0B(X.MhZ, X.OeR, X.3sy):void");
    }

    public static void A0C(C67058MhZ mhZ, C71153OeR oeR, C254743sy r9) {
        int i;
        C69004Ncg ncg = oeR.A0o;
        ncg.A02 = true;
        C67573Mq7.A00(ncg, new C73914Plp(ncg, 26));
        AnonymousClass4DH r6 = oeR.A0b;
        FragmentActivity activity = r6.getActivity();
        activity.getClass();
        oeR.A0X = oeR.A03(r9);
        A01(oeR, r9);
        oeR.A0q.A02 = true;
        UserSession userSession = oeR.A0h;
        1pE A012 = 1pE.A01(activity, oeR.A0c, userSession, "pending_inbox");
        A012.A00 = r6;
        A012.A09(r9);
        A012.A11 = true;
        A012.A0Z = oeR.A02.A01.toString();
        A012.A0G = Integer.valueOf(mhZ.A00);
        A012.A13 = true;
        A012.A0v = true;
        A012.A0Y = mhZ.A02;
        if (!oeR.A0O) {
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A06, userSession, 36314073041930633L) || (!2Ek.A03(AnonymousClass7TF.A0Q(userSession)))) {
                i = 512340;
                A012.A0F = Integer.valueOf(i);
                A012.A06();
            }
        }
        if (!oeR.A0O) {
            i = 512342;
            A012.A0F = Integer.valueOf(i);
        }
        A012.A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if ((!r3.contains(r6)) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C69375NkF r6, X.C71153OeR r7) {
        /*
            X.NkF r4 = r7.A02
            r7.A02 = r6
            com.instagram.common.session.UserSession r2 = r7.A0h
            X.NpV r0 = X.C69991NvV.A00(r2)
            r0.A00 = r6
            X.OO9 r1 = r7.A0p
            X.NkF r0 = r7.A02
            X.2Eo r0 = r0.A01
            r1.A05(r0)
            A0K(r7)
            r5 = 1
            boolean r0 = X.C272094k5.A0C(r2, r5)
            if (r0 == 0) goto L_0x003a
            java.util.Set r3 = r7.A15
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x0032
            X.Mjt r0 = r7.A03
            X.02m r2 = r0.A01
            r1 = 20125924(0x13318e4, float:3.2894966E-38)
            r0 = 2
            r2.markerEnd(r1, r0)
        L_0x0032:
            boolean r0 = r3.contains(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003e
        L_0x003a:
            r0 = 0
            r7.A0m(r0, r5)
        L_0x003e:
            X.OTI r1 = r7.A0m
            X.2ED r0 = r7.A0j
            int r6 = r0.A05()
            X.48q r0 = r4.A02
            java.lang.String r3 = r0.A00
            X.NkF r0 = r7.A02
            X.48q r0 = r0.A02
            java.lang.String r4 = r0.A00
            java.lang.String r2 = "filter_select"
            r5 = 0
            X.OTI.A00(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153OeR.A0D(X.NkF, X.OeR):void");
    }

    public static void A0F(C71153OeR oeR) {
        oeR.A0S = A0V(oeR, oeR.A0O);
    }

    public static void A0G(C71153OeR oeR) {
        OO9 oo9 = oeR.A0p;
        AnonymousClass43G r0 = oo9.A04;
        if (r0 == null) {
            0qQ.A0F("directCurrentSource");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z = r0.A03;
        C67197Mjt mjt = oeR.A03;
        if (z) {
            mjt.A01();
        } else {
            mjt.A01.markerEnd(20125924, 2);
        }
        oo9.A02(oeR.A02, (C2611948q) null);
    }

    public static void A0H(C71153OeR oeR) {
        C68952Nbb nbb = oeR.A04;
        nbb.A02.A03();
        nbb.A01.A03();
        nbb.A08.A01(oeR.A12.size());
    }

    public static void A0J(C71153OeR oeR) {
        AnonymousClass4DH r0 = oeR.A0b;
        if (r0 != null && r0.getActivity() != null) {
            A0L(oeR);
            A0K(oeR);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.182.A06(X.DbS.A0J(r6, 0), r6, 2342156176017655602L) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012e, code lost:
        if (r11.isEmpty() == false) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0K(X.C71153OeR r21) {
        /*
            r7 = r21
            X.2ED r2 = r7.A0j
            int r0 = r2.A06()
            java.util.List r4 = r7.A0w
            int r12 = r4.size()
            int r12 = r12 + r0
            X.NkF r1 = r7.A02
            X.NkF r0 = X.C69375NkF.A06
            r8 = 0
            r5 = 1
            if (r1 == r0) goto L_0x002a
            com.instagram.common.session.UserSession r6 = r7.A0h
            X.0Tu r3 = X.DbS.A0J(r6, r8)
            r0 = 2342156176017655602(0x208102a200050732, double:4.0597919096406146E-152)
            boolean r0 = X.182.A06(r3, r6, r0)
            r21 = 0
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r21 = 1
        L_0x002c:
            java.util.List r3 = r7.A10
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1D(r3)
            com.instagram.common.session.UserSession r1 = r7.A0h
            boolean r0 = X.C67015Mgo.A04(r1)
            if (r0 == 0) goto L_0x0043
            java.util.List r0 = r7.A0y
            r10.addAll(r0)
            int r12 = X.DbT.A01(r0, r12)
        L_0x0043:
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x00c6
            boolean r0 = X.C272094k5.A03(r1)
            if (r0 == 0) goto L_0x00c6
            r8 = 1
            boolean r0 = X.C272094k5.A01(r1)
            if (r0 == 0) goto L_0x00c3
            java.util.List r6 = r7.A11
        L_0x0056:
            if (r21 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00bb
            boolean r0 = X.C272094k5.A01(r1)
            r11 = r10
            if (r0 == 0) goto L_0x0062
            r11 = r3
        L_0x0062:
            boolean r0 = X.C272094k5.A07(r1)
            if (r0 == 0) goto L_0x00b9
            X.CFq r8 = r2.A01
        L_0x006a:
            X.PFr r3 = r7.A0Y()
            boolean r14 = r7.A0H
            X.NkF r13 = r7.A02
            X.Pvl r0 = r7.A0i
            X.2EM r9 = r0.Brn()
            java.util.Map r2 = r7.A13
            X.AnonymousClass7TG.A0w(r5, r13, r6, r11)
            r0 = 6
            X.0qQ.A0B(r2, r0)
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r1 = r3.A0F
            X.Otr r0 = new X.Otr
            r0.<init>(r1, r13)
            r3.A05 = r0
        L_0x008e:
            r3.A03 = r9
            r3.A08 = r14
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r6.iterator()
        L_0x009a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00c9
            X.2Ep r15 = X.C66580MXl.A0c(r16)
            X.3su r13 = X.AnonymousClass48N.A01(r15)
            com.instagram.common.session.UserSession r9 = r3.A0F
            android.content.Context r0 = r3.A0C
            X.MaI r1 = X.C66653MaM.A00(r0, r9)
            X.Mar r0 = new X.Mar
            r0.<init>(r9, r13, r15, r1)
            r14.add(r0)
            goto L_0x009a
        L_0x00b9:
            r8 = 0
            goto L_0x006a
        L_0x00bb:
            java.util.List r11 = r7.A0z
            goto L_0x0062
        L_0x00be:
            java.util.List r11 = java.util.Collections.emptyList()
            goto L_0x0062
        L_0x00c3:
            java.util.List r6 = r7.A0x
            goto L_0x0056
        L_0x00c6:
            java.util.List r6 = r7.A12
            goto L_0x0056
        L_0x00c9:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r13 = 0
            r1 = 0
        L_0x00cf:
            int r0 = r14.size()
            if (r13 >= r0) goto L_0x00ff
            int r0 = r11.size()
            if (r1 >= r0) goto L_0x00ff
            java.lang.Object r15 = r14.get(r13)
            X.PwB r15 = (X.C74516PwB) r15
            java.lang.Object r0 = r11.get(r1)
            X.PwB r0 = (X.C74516PwB) r0
            long r19 = r15.BKe()
            long r17 = r0.BKe()
            int r16 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x00f9
            r9.add(r15)
            int r13 = r13 + 1
            goto L_0x00cf
        L_0x00f9:
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x00cf
        L_0x00ff:
            int r0 = r14.size()
            if (r13 >= r0) goto L_0x010f
            java.lang.Object r0 = r14.get(r13)
            r9.add(r0)
            int r13 = r13 + 1
            goto L_0x00ff
        L_0x010f:
            int r0 = r11.size()
            if (r1 >= r0) goto L_0x011f
            java.lang.Object r0 = r11.get(r1)
            r9.add(r0)
            int r1 = r1 + 1
            goto L_0x010f
        L_0x011f:
            r3.A06 = r9
            r3.A00 = r12
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0130
            boolean r1 = r11.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0131
        L_0x0130:
            r0 = 1
        L_0x0131:
            r3.A07 = r0
            java.util.Map r0 = r3.A0K
            r0.clear()
            r0.putAll(r2)
            r3.A04 = r8
            r3.AF6()
            X.PFp r9 = r7.A0Z()
            boolean r1 = r7.A0H
            java.util.List r0 = r7.A0x
            if (r21 != 0) goto L_0x014e
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x014e:
            int r3 = X.DbW.A02(r5, r0, r10)
            r9.A03 = r1
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x015c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x017b
            X.2Ep r12 = X.C66580MXl.A0c(r14)
            X.3su r8 = X.AnonymousClass48N.A01(r12)
            com.instagram.common.session.UserSession r2 = r9.A05
            android.content.Context r0 = r9.A04
            X.MaI r1 = X.C66653MaM.A00(r0, r2)
            X.Mar r0 = new X.Mar
            r0.<init>(r2, r8, r12, r1)
            r13.add(r0)
            goto L_0x015c
        L_0x017b:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r12 = 0
            r2 = 0
        L_0x0181:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x01b1
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x01b1
            java.lang.Object r14 = r13.get(r12)
            X.PwB r14 = (X.C74516PwB) r14
            java.lang.Object r1 = r10.get(r2)
            X.PwB r1 = (X.C74516PwB) r1
            long r17 = r14.BKe()
            long r15 = r1.BKe()
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ab
            r8.add(r14)
            int r12 = r12 + 1
            goto L_0x0181
        L_0x01ab:
            r8.add(r1)
            int r2 = r2 + 1
            goto L_0x0181
        L_0x01b1:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x01c1
            java.lang.Object r0 = r13.get(r12)
            r8.add(r0)
            int r12 = r12 + 1
            goto L_0x01b1
        L_0x01c1:
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x01d1
            java.lang.Object r0 = r10.get(r2)
            r8.add(r0)
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x01d1:
            r9.A02 = r8
            r9.AF6()
            X.PFo r10 = r7.A0X()
            boolean r0 = r7.A0H
            if (r21 == 0) goto L_0x020f
            java.util.List r9 = r7.A0y
        L_0x01e0:
            X.0qQ.A0B(r4, r5)
            X.0qQ.A0B(r9, r3)
            r10.A03 = r0
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r4.iterator()
        L_0x01f0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0214
            X.2Ep r4 = X.C66580MXl.A0c(r5)
            X.3su r3 = X.AnonymousClass48N.A01(r4)
            com.instagram.common.session.UserSession r2 = r10.A05
            android.content.Context r0 = r10.A04
            X.MaI r1 = X.C66653MaM.A00(r0, r2)
            X.Mar r0 = new X.Mar
            r0.<init>(r2, r3, r4, r1)
            r13.add(r0)
            goto L_0x01f0
        L_0x020f:
            java.util.List r9 = java.util.Collections.emptyList()
            goto L_0x01e0
        L_0x0214:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r12 = 0
            r5 = 0
        L_0x021a:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x024a
            int r0 = r9.size()
            if (r5 >= r0) goto L_0x024a
            java.lang.Object r15 = r13.get(r12)
            X.PwB r15 = (X.C74516PwB) r15
            java.lang.Object r14 = r9.get(r5)
            X.PwB r14 = (X.C74516PwB) r14
            long r3 = r15.BKe()
            long r1 = r14.BKe()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0244
            r8.add(r15)
            int r12 = r12 + 1
            goto L_0x021a
        L_0x0244:
            r8.add(r14)
            int r5 = r5 + 1
            goto L_0x021a
        L_0x024a:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x025a
            java.lang.Object r0 = r13.get(r12)
            r8.add(r0)
            int r12 = r12 + 1
            goto L_0x024a
        L_0x025a:
            int r0 = r9.size()
            if (r5 >= r0) goto L_0x026a
            java.lang.Object r0 = r9.get(r5)
            r8.add(r0)
            int r5 = r5 + 1
            goto L_0x025a
        L_0x026a:
            r10.A02 = r8
            r10.AF6()
            X.PFq r10 = r7.A0a()
            if (r10 == 0) goto L_0x02fb
            boolean r0 = r7.A0H
            r10.A03 = r0
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r6.iterator()
        L_0x0281:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02a0
            X.2Ep r4 = X.C66580MXl.A0c(r5)
            X.3su r3 = X.AnonymousClass48N.A01(r4)
            com.instagram.common.session.UserSession r2 = r10.A07
            android.content.Context r0 = r10.A04
            X.MaI r1 = X.C66653MaM.A00(r0, r2)
            X.Mar r0 = new X.Mar
            r0.<init>(r2, r3, r4, r1)
            r13.add(r0)
            goto L_0x0281
        L_0x02a0:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r12 = 0
            r8 = 0
        L_0x02a6:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x02d6
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x02d6
            java.lang.Object r6 = r13.get(r12)
            X.PwB r6 = (X.C74516PwB) r6
            java.lang.Object r5 = r11.get(r8)
            X.PwB r5 = (X.C74516PwB) r5
            long r3 = r6.BKe()
            long r1 = r5.BKe()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d0
            r9.add(r6)
            int r12 = r12 + 1
            goto L_0x02a6
        L_0x02d0:
            r9.add(r5)
            int r8 = r8 + 1
            goto L_0x02a6
        L_0x02d6:
            int r0 = r13.size()
            if (r12 >= r0) goto L_0x02e6
            java.lang.Object r0 = r13.get(r12)
            r9.add(r0)
            int r12 = r12 + 1
            goto L_0x02d6
        L_0x02e6:
            int r0 = r11.size()
            if (r8 >= r0) goto L_0x02f6
            java.lang.Object r0 = r11.get(r8)
            r9.add(r0)
            int r8 = r8 + 1
            goto L_0x02e6
        L_0x02f6:
            r10.A02 = r9
            r10.AF6()
        L_0x02fb:
            boolean r0 = r7.A0O
            boolean r1 = A0V(r7, r0)
            boolean r0 = r7.A0S
            if (r1 == r0) goto L_0x030c
            r7.A0S = r1
            X.OMH r0 = r7.A0r
            r0.A01()
        L_0x030c:
            X.OMH r0 = r7.A0r
            X.NJW r0 = r0.A00
            X.NJW.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153OeR.A0K(X.OeR):void");
    }

    public static void A0L(C71153OeR oeR) {
        List list;
        Comparator comparator;
        int i;
        2Dr r2 = oeR.A0k;
        2ED r4 = r2.A0C;
        AnonymousClass43I r3 = AnonymousClass43I.A00;
        C69375NkF nkF = oeR.A02;
        List A0G2 = r4.A0G(r3, nkF.A01, nkF.A02);
        C67197Mjt mjt = oeR.A03;
        int size = A0G2.size();
        02m r42 = mjt.A01;
        r42.markerAnnotate(20125924, "thread_count", size);
        List list2 = oeR.A12;
        synchronized (list2) {
            list2.clear();
            list = oeR.A0w;
            list.clear();
            Iterator it = A0G2.iterator();
            while (it.hasNext()) {
                AnonymousClass2Ep A0c2 = C66580MXl.A0c(it);
                if (A0c2.AqP()) {
                    list.add(A0c2);
                } else {
                    list2.add(A0c2);
                }
            }
        }
        C74491Pvl pvl = oeR.A0i;
        if (pvl.Brn() != AnonymousClass43H.A00 && !oeR.A0N) {
            Map map = oeR.A14;
            if (map.containsKey(pvl.Brn()) && list.size() != ((AbstractCollection) map.get(pvl.Brn())).size()) {
                UserSession userSession = oeR.A0h;
                if (C272094k5.A08(userSession)) {
                    2EM Brn = pvl.Brn();
                    Iterator it2 = list.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        AnonymousClass2Ep A0c3 = C66580MXl.A0c(it2);
                        if (A0c3.Cdv(userSession) && A02(A0c3, oeR).booleanValue()) {
                            i2++;
                        }
                    }
                    Map map2 = oeR.A13;
                    Number A142 = C51966G9m.A14(Brn, map2);
                    if (A142 != null) {
                        i = A142.intValue() - i2;
                    } else {
                        i = 0;
                    }
                    C66580MXl.A1T(Brn, map2, Math.max(i, 0));
                    A0K(oeR);
                }
            }
        }
        Map map3 = oeR.A14;
        map3.put(pvl.Brn(), ImmutableList.copyOf((Collection) list));
        if (oeR.A0O) {
            List By2 = r2.By2(oeR.A02.A01);
            r42.markerAnnotate(20125924, "thread_count", By2.size());
            List list3 = oeR.A11;
            list3.clear();
            if (!By2.isEmpty()) {
                list3.addAll(By2);
            }
            List list4 = oeR.A0x;
            list4.clear();
            UserSession userSession2 = oeR.A0h;
            if (!C272094k5.A03(userSession2)) {
                list4.addAll(list);
            } else {
                HashSet A1F2 = AnonymousClass7TE.A1F();
                Iterator A0v2 = AnonymousClass7TF.A0v(map3);
                while (A0v2.hasNext()) {
                    Iterator A1H2 = C51966G9m.A1H(A0v2.next());
                    while (A1H2.hasNext()) {
                        AnonymousClass2Ep A0c4 = C66580MXl.A0c(A1H2);
                        if (!A1F2.contains(A0c4.BJy()) && A02(A0c4, oeR).booleanValue()) {
                            list4.add(A0c4);
                            A1F2.add(A0c4.BJy());
                        }
                    }
                }
            }
            list4.addAll(list3);
            if (oeR.A02.A02 != C2611948q.RELEVANT || !C272094k5.A0A(userSession2, true)) {
                comparator = 2Eo.A04.A01;
            } else {
                comparator = AnonymousClass2Ep.A02;
            }
            Collections.sort(list4, comparator);
        }
        HashMap hashMap = oeR.A1R;
        hashMap.putAll(oeR.A07(list2));
        hashMap.putAll(oeR.A07(list));
        hashMap.putAll(oeR.A07(oeR.A11));
    }

    public static void A0P(C71153OeR oeR, List list, List list2, List list3, int i, boolean z, boolean z2) {
        A0O(oeR, "direct_requests_delete_multiple_confirm", list);
        Context context = oeR.A0Y;
        UserSession userSession = oeR.A0h;
        C71131OdU.A02(context, userSession, AnonymousClass05K.A0u, A06(list2), list3, z);
        int size = list.size();
        boolean z3 = oeR.A0O;
        2ED r2 = oeR.A0j;
        if (z3) {
            r2.A0J(size);
        } else {
            r2.A0I(size);
        }
        r2.A0N(oeR.A0i.Brn(), i, oeR.A0O);
        if (oeR.A0O) {
            A0A(ImmutableSet.A03(list2), oeR);
        }
        list.size();
        if (list.size() == 1) {
            oeR.A03((C254743sy) AnonymousClass7TE.A13(list));
        }
        oeR.A0d.markerStart(190449529);
        C70381O4i.A00(oeR.A0b, userSession, AnonymousClass05K.A0C, oeR.A0O, z2);
        oeR.A08();
    }

    private boolean A0R() {
        UserSession userSession = this.A0h;
        if (!C272094k5.A04(userSession) || System.currentTimeMillis() - DbW.A06(AnonymousClass7TE.A0q(userSession), "last_pending_inbox_cache_update_timestamp") >= ((long) (DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36598636100914416L) * IgNetworkConsentStorage.MAX_ENTRIES))) {
            return false;
        }
        return true;
    }

    private boolean A0S() {
        UserSession userSession = this.A0h;
        0Tu A0H2 = AnonymousClass7TF.A0H(userSession);
        if (!182.A06(A0H2, userSession, 36317161123943225L) || System.currentTimeMillis() - DbW.A06(AnonymousClass7TE.A0q(userSession), "last_message_requests_prefetch_timestamp") >= ((long) (DbS.A04(A0H2, userSession, 36598636100717807L) * IgNetworkConsentStorage.MAX_ENTRIES))) {
            return false;
        }
        return true;
    }

    public static boolean A0T(C71153OeR oeR) {
        List list;
        if (oeR.A0O) {
            if (oeR.A0x.isEmpty() && oeR.A10.isEmpty()) {
                list = oeR.A0y;
            }
            return true;
        }
        if (oeR.A12.isEmpty()) {
            list = oeR.A0z;
        }
        return true;
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean A0U(C71153OeR oeR) {
        if (!2El.A02(oeR.A0h) || oeR.A02 != C69375NkF.A06) {
            return false;
        }
        return true;
    }

    public static boolean A0V(C71153OeR oeR, boolean z) {
        List list;
        List list2;
        if (z) {
            list = oeR.A0x;
            list2 = oeR.A10;
        } else {
            list = oeR.A12;
            list2 = oeR.A0z;
        }
        ArrayList A1D2 = AnonymousClass7TE.A1D(list2);
        if (C67015Mgo.A04(oeR.A0h)) {
            A1D2.addAll(oeR.A0y);
        }
        if (!list.isEmpty() || !A1D2.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass2Ep A0c2 = C66580MXl.A0c(it);
                if (!C66640Ma9.A05(A0c2.BRZ(), A0c2.CUG())) {
                    return true;
                }
            }
            Iterator it2 = A1D2.iterator();
            while (it2.hasNext()) {
                if (!C66640Ma9.A02((C74516PwB) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C67256Mkq A0W() {
        if (this.A0O) {
            return C67256Mkq.SPAM;
        }
        if (this.A0P) {
            return C67256Mkq.PENDING_STORY_REPLIES;
        }
        if (this.A0N) {
            return C67256Mkq.HIDDEN_WORDS;
        }
        return C67256Mkq.PENDING;
    }

    public final C72684PFo A0X() {
        C72684PFo pFo = this.A0U;
        if (pFo != null) {
            return pFo;
        }
        Context context = this.A0Y;
        UserSession userSession = this.A0h;
        AnonymousClass0iw r2 = this.A0c;
        boolean z = this.A0H;
        P3T p3t = this.A1O;
        C72684PFo pFo2 = new C72684PFo(context, r2, userSession, this.A1C, this.A1I, this.A1M, p3t, this.A0t, z);
        this.A0U = pFo2;
        return pFo2;
    }

    public final C72687PFr A0Y() {
        C72687PFr pFr = this.A0V;
        if (pFr != null) {
            return pFr;
        }
        Context context = this.A0Y;
        UserSession userSession = this.A0h;
        AnonymousClass0iw r40 = this.A0c;
        C70771OKr oKr = new C70771OKr(context, userSession);
        OH3 oh3 = this.A0q;
        OMG omg = this.A1M;
        P3T p3t = this.A1O;
        C74398PuE puE = this.A1C;
        C322776wO r19 = this.A1Q;
        C70940OSn oSn = this.A1P;
        boolean z = this.A0H;
        C69375NkF nkF = this.A02;
        C70496O8v o8v = this.A1N;
        C70751OJx oJx = this.A1I;
        C70750OJw oJw = this.A1E;
        boolean A022 = C272094k5.A02(userSession);
        C70489O8o o8o = this.A1F;
        C70490O8p o8p = this.A1G;
        C74350PtQ ptQ = this.A1D;
        C70492O8r o8r = this.A1J;
        AnonymousClass2tB r3 = this.A1B;
        C74491Pvl pvl = this.A0i;
        OMG omg2 = omg;
        C70496O8v o8v2 = o8v;
        P3T p3t2 = p3t;
        C70940OSn oSn2 = oSn;
        C322776wO r36 = r19;
        boolean z2 = z;
        C69375NkF nkF2 = nkF;
        OH3 oh32 = oh3;
        C74350PtQ ptQ2 = ptQ;
        C70771OKr oKr2 = oKr;
        C70750OJw oJw2 = oJw;
        C70489O8o o8o2 = o8o;
        C70490O8p o8p2 = o8p;
        C70751OJx oJx2 = oJx;
        C70492O8r o8r2 = o8r;
        Context context2 = context;
        AnonymousClass0iw r16 = r40;
        AnonymousClass2tB r17 = r3;
        UserSession userSession2 = userSession;
        C74398PuE puE2 = puE;
        C74491Pvl pvl2 = pvl;
        C72687PFr pFr2 = new C72687PFr(context2, r16, r17, userSession2, puE2, pvl2, nkF2, oh32, ptQ2, oKr2, oJw2, o8o2, o8p2, oJx2, o8r2, this.A1K, this.A1L, omg2, o8v2, p3t2, oSn2, r36, z2, A022, C272094k5.A01(userSession));
        this.A0V = pFr2;
        return pFr2;
    }

    public final C72685PFp A0Z() {
        C72685PFp pFp = this.A0W;
        if (pFp != null) {
            return pFp;
        }
        Context context = this.A0Y;
        UserSession userSession = this.A0h;
        AnonymousClass0iw r2 = this.A0c;
        boolean z = this.A0H;
        P3T p3t = this.A1O;
        C74398PuE puE = this.A1C;
        OMG omg = this.A1M;
        C72685PFp pFp2 = new C72685PFp(context, r2, userSession, puE, this.A1H, this.A1I, omg, p3t, this.A0t, z);
        this.A0W = pFp2;
        return pFp2;
    }

    public final C72686PFq A0a() {
        if (this.A08 == null) {
            UserSession userSession = this.A0h;
            if (C272094k5.A07(userSession)) {
                Context context = this.A0Y;
                AnonymousClass0iw r2 = this.A0c;
                C70771OKr oKr = new C70771OKr(context, userSession);
                OMG omg = this.A1M;
                P3T p3t = this.A1O;
                C74398PuE puE = this.A1C;
                C322776wO r11 = this.A1Q;
                C70940OSn oSn = this.A1P;
                boolean z = this.A0H;
                this.A08 = new C72686PFq(context, r2, this.A1B, userSession, puE, oKr, this.A1I, omg, p3t, oSn, r11, z);
            }
        }
        return this.A08;
    }

    public final void A0c() {
        if (this.A0O) {
            A0G(this);
        } else if (this.A0G) {
            A0G(this);
            if (!this.A0F) {
                this.A0F = true;
                A0K(this);
            }
        } else {
            this.A03.A01.markerEnd(20125924, 2);
        }
    }

    public final void A0d() {
        Integer num;
        String str;
        C69004Ncg ncg = this.A0o;
        if (ncg.A01) {
            ncg.A04("return_from_reachability_settings", (String) null);
            ncg.A01 = false;
        } else if (ncg.A00) {
            ncg.A04("return_from_enter_hidden_words_settings", (String) null);
            ncg.A00 = false;
        } else {
            if (ncg.A02) {
                ncg.A02 = false;
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            if (!C69004Ncg.A02(ncg, num)) {
                return;
            }
        }
        if (C67256Mkq.PENDING == A0W()) {
            str = "open_pending";
        } else {
            str = "open_other";
        }
        ncg.A04(str, (String) null);
    }

    public final void A0e() {
        OO9 oo9 = this.A0p;
        oo9.A00 = null;
        AnonymousClass43G r0 = oo9.A04;
        if (r0 != null) {
            r0.A00 = null;
            C272124k8 r1 = this.A0a;
            0qQ.A0B(r1, 0);
            oo9.A0F.remove(r1);
            AnonymousClass43G r02 = oo9.A04;
            if (r02 != null) {
                r02.A0C.remove(r1);
                C66752Mbx mbx = oo9.A01;
                if (mbx != null) {
                    mbx.stop();
                }
                C66752Mbx mbx2 = oo9.A02;
                if (mbx2 != null) {
                    mbx2.stop();
                }
                this.A0q.A05.onDestroyView();
                this.A0Z.removeCallbacksAndMessages((Object) null);
                return;
            }
        }
        0qQ.A0F("directCurrentSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0f() {
        this.A0n.A05();
        1Ng A002 = AnonymousClass1Nd.A00(this.A0h);
        A002.A02(this.A19, 2Kd.class);
        A002.A02(this.A1A, 2Kb.class);
        A002.A02(this.A18, C71893Osb.class);
        OO9 oo9 = this.A0p;
        C272124k8 r2 = this.A0a;
        0qQ.A0B(r2, 0);
        oo9.A0F.remove(r2);
        AnonymousClass43G r0 = oo9.A04;
        if (r0 == null) {
            0qQ.A0F("directCurrentSource");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A0C.remove(r2);
        C66752Mbx mbx = oo9.A01;
        if (mbx != null) {
            mbx.A02 = false;
        }
        C66752Mbx mbx2 = oo9.A02;
        if (mbx2 != null) {
            mbx2.A02 = false;
        }
        this.A03.A04("LEAVE_SURFACE");
        A0Y().A02.A01();
        C72686PFq pFq = this.A08;
        if (pFq != null) {
            pFq.A01.A01();
        }
        this.A0q.A05.onPause();
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.FC5] */
    /* JADX WARNING: type inference failed for: r1v41, types: [X.O0c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.F1j, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v2, types: [X.F1j, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007c, code lost:
        if (r0.A0i.Brn() == X.AnonymousClass43H.A00) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g() {
        /*
            r25 = this;
            r0 = r25
            X.Nbb r1 = r0.A04
            X.34p r6 = r1.A05
            r6.A04()
            r0.A0d()
            com.instagram.common.session.UserSession r14 = r0.A0h
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r14)
            java.lang.Class<X.2Kd> r2 = X.2Kd.class
            X.1wn r1 = r0.A19
            r3.A01(r1, r2)
            java.lang.Class<X.2Kb> r2 = X.2Kb.class
            X.1wn r1 = r0.A1A
            r3.A01(r1, r2)
            java.lang.Class<X.Osb> r2 = X.C71893Osb.class
            X.1wn r1 = r0.A18
            r3.A01(r1, r2)
            X.PFr r4 = r0.A0Y()
            X.1a8 r3 = r4.A02
            X.1aS r2 = r4.A0E
            r1 = 29
            X.PU7.A00(r2, r3, r4, r1)
            X.PFq r4 = r0.A08
            if (r4 == 0) goto L_0x0041
            X.1a8 r3 = r4.A01
            X.1aS r2 = r4.A06
            r1 = 30
            X.PU7.A00(r2, r3, r4, r1)
        L_0x0041:
            X.OH3 r3 = r0.A0q
            X.2qi r2 = r3.A01
            java.lang.String r1 = "quickPromotionPresenter"
            if (r2 != 0) goto L_0x0051
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0051:
            r2.Dh3()
            boolean r1 = r3.A02
            if (r1 == 0) goto L_0x0064
            r1 = 0
            r3.A02 = r1
            com.instagram.quickpromotion.intf.Trigger r1 = com.instagram.quickpromotion.intf.Trigger.A1Y
            java.util.Set r1 = X.JTP.A0y(r1)
            r2.AVg(r1)
        L_0x0064:
            X.4DH r13 = r0.A0b
            X.0hq r2 = r13.getChildFragmentManager()
            java.lang.String r1 = "spam_folder"
            androidx.fragment.app.Fragment r1 = r2.A0R(r1)
            r3 = 0
            if (r1 != 0) goto L_0x007e
            X.Pvl r1 = r0.A0i
            X.2EM r4 = r1.Brn()
            X.43H r2 = X.AnonymousClass43H.A00
            r1 = 0
            if (r4 != r2) goto L_0x007f
        L_0x007e:
            r1 = 1
        L_0x007f:
            r0.A0O = r1
            if (r1 == 0) goto L_0x008c
            boolean r1 = r0.A0N
            if (r1 != 0) goto L_0x008c
            X.OO9 r1 = r0.A0p
            r1.A00()
        L_0x008c:
            X.0hq r2 = r13.getChildFragmentManager()
            java.lang.String r1 = "filter_customization"
            androidx.fragment.app.Fragment r1 = r2.A0R(r1)
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            r0.A0M = r1
            X.0hq r2 = r13.getChildFragmentManager()
            java.lang.String r1 = "story_replies_folder"
            androidx.fragment.app.Fragment r1 = r2.A0R(r1)
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            r0.A0P = r1
            X.0hq r2 = r13.getChildFragmentManager()
            java.lang.String r1 = "hidden_words_folder"
            androidx.fragment.app.Fragment r1 = r2.A0R(r1)
            if (r1 == 0) goto L_0x00b9
            r3 = 1
        L_0x00b9:
            r0.A0N = r3
            X.OO9 r2 = r0.A0p
            X.4k8 r1 = r0.A0a
            r2.A01(r1)
            X.Mbx r1 = r2.A01
            if (r1 == 0) goto L_0x00c9
            r1.EIx()
        L_0x00c9:
            X.Mbx r1 = r2.A02
            if (r1 == 0) goto L_0x00d0
            r1.EIx()
        L_0x00d0:
            boolean r1 = r0.A0H
            r0.A0l(r1)
            A0J(r0)
            X.FC5 r15 = new X.FC5
            r15.<init>()
            android.content.Context r12 = r0.A0Y
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r12, r14)
            r3 = 2
            X.02m r1 = X.02m.A0p
            r7 = 190451210(0xb5a0e0a, float:4.1995835E-32)
            r1.markerStart(r7)
            r1 = 2131963341(0x7f132dcd, float:1.9563433E38)
            java.lang.String r17 = X.AnonymousClass7TE.A16(r12, r1)
            boolean r1 = X.C48885Ell.A00(r14)
            if (r1 == 0) goto L_0x0207
            X.0Tu r8 = X.0Tu.A06
            r1 = 36315404481596585(0x8104ab00000ca9, double:3.029346252333704E-306)
            boolean r1 = X.182.A06(r8, r14, r1)
            if (r1 != 0) goto L_0x0112
            r1 = 36314760238271264(0x810415001b0b20, double:3.0289388302606113E-306)
            boolean r1 = X.182.A06(r8, r14, r1)
            if (r1 == 0) goto L_0x0207
        L_0x0112:
            boolean r1 = X.F5l.A01(r14)
            if (r1 != 0) goto L_0x0207
            r20 = 2131963364(0x7f132de4, float:1.956348E38)
            r21 = 2131963362(0x7f132de2, float:1.9563475E38)
            r19 = 3
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            java.lang.String r18 = "https://help.instagram.com/700284123459336"
        L_0x0124:
            X.FC5.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0127:
            X.O0c r1 = new X.O0c
            r1.<init>()
            X.0iw r7 = r0.A0c
            X.0qQ.A0B(r12, r5)
            X.0qQ.A0B(r7, r3)
            X.1Av r9 = X.1Au.A00(r14)
            X.0s0 r10 = r9.A8O
            X.0YZ[] r8 = X.1Av.A8a
            r11 = 260(0x104, float:3.64E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r9, r10, r8, r11)
            if (r0 != 0) goto L_0x01ac
            X.0Tu r0 = X.0Tu.A05
            r2 = 36316628547277342(0x8105c80000121e, double:3.0301203563991316E-306)
            boolean r0 = X.182.A06(r0, r14, r2)
            if (r0 == 0) goto L_0x01ac
            r0 = r8[r11]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r10.Epx(r9, r3, r0)
            X.0s0 r2 = r9.A6q
            r0 = 259(0x103, float:3.63E-43)
            X.DbS.A1a(r9, r3, r2, r8, r0)
            java.lang.String r0 = "only_turn_on_verified_account_for_rs_nux_on_pending_folder"
            X.Ocn r2 = new X.Ocn
            r2.<init>(r7, r14, r0)
            X.F1j r15 = new X.F1j
            r15.<init>()
            r0 = 2131976382(0x7f1360be, float:1.9589883E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131976381(0x7f1360bd, float:1.958988E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131975588(0x7f135da4, float:1.9588273E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131968513(0x7f134201, float:1.9573923E38)
            java.lang.String r22 = X.AnonymousClass7TE.A16(r12, r0)
            X.PFU r0 = new X.PFU
            r0.<init>(r12, r14, r1, r2)
            r20 = 0
            r23 = 2131237585(0x7f081ad1, float:1.8091425E38)
            r16 = r12
            r17 = r0
            r24 = r4
            r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2.A04(r4)
        L_0x019f:
            r6.A05()
            X.0xa r1 = X.AnonymousClass7TE.A0q(r14)
            java.lang.String r0 = "direct_message_entry_count"
            X.JTS.A1S(r1, r0, r5)
            return
        L_0x01ac:
            X.1Av r9 = X.1Au.A00(r14)
            X.0s0 r3 = r9.A6q
            r2 = 259(0x103, float:3.63E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r9, r3, r8, r2)
            if (r0 != 0) goto L_0x019f
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r14)
            boolean r0 = X.2Ek.A03(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019f
            X.AnonymousClass7TF.A1J(r9, r3, r8, r2, r4)
            r2 = 0
            X.Ocn r3 = new X.Ocn
            r3.<init>(r7, r14, r2)
            r3.A04(r4)
            X.F1j r15 = new X.F1j
            r15.<init>()
            r0 = 2131971313(0x7f134cf1, float:1.9579602E38)
            java.lang.String r18 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131971312(0x7f134cf0, float:1.95796E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131971311(0x7f134cef, float:1.9579598E38)
            java.lang.String r21 = X.AnonymousClass7TE.A16(r12, r0)
            r0 = 2131971310(0x7f134cee, float:1.9579596E38)
            java.lang.String r22 = X.AnonymousClass7TE.A16(r12, r0)
            X.PFT r0 = new X.PFT
            r0.<init>(r13, r14, r1, r3)
            r23 = 2131237685(0x7f081b35, float:1.8091627E38)
            r16 = r12
            r17 = r0
            r20 = r2
            r24 = r4
            r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x019f
        L_0x0207:
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r14)
            boolean r1 = r1.A2I()
            if (r1 != 0) goto L_0x026f
            X.1Av r9 = X.1Au.A00(r14)
            X.0s0 r8 = r9.A5r
            X.0YZ[] r10 = X.1Av.A8a
            r2 = 258(0x102, float:3.62E-43)
            boolean r1 = X.AnonymousClass7TG.A1a(r9, r8, r10, r2)
            if (r1 != 0) goto L_0x026f
            r1 = r10[r2]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.Epx(r9, r2, r1)
            com.instagram.user.model.User r1 = X.AnonymousClass7TF.A0Q(r14)
            X.4Cl r1 = r1.A03
            X.16x r1 = r1.AsZ()
            if (r1 == 0) goto L_0x026f
            java.lang.Boolean r1 = r1.CQk()
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 == 0) goto L_0x026f
            X.0Tu r7 = X.0Tu.A06
            r1 = 36877022995415164(0x8303750004007c, double:3.384516061928811E-306)
            java.lang.String r18 = X.182.A04(r7, r14, r1)
            r1 = 2131963355(0x7f132ddb, float:1.9563461E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 2131963361(0x7f132de1, float:1.9563473E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r2, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            int r20 = X.C51971G9r.A0I(r1, r5)
            int r21 = X.C51971G9r.A0I(r1, r4)
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            r19 = r4
            goto L_0x0124
        L_0x026f:
            X.02m r2 = X.02m.A0p
            r1 = 4
            r2.markerEnd(r7, r1)
            goto L_0x0127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153OeR.A0g():void");
    }

    public final void A0h() {
        this.A04.A08();
        this.A0n.A05();
        this.A0O = true;
        this.A0p.A00();
        A0l(false);
        A0F(this);
        OMH omh = this.A0r;
        omh.A01();
        NJW njw = omh.A00;
        if (njw.isResumed()) {
            NJW.A00(C67256Mkq.SPAM, njw);
        }
        OTI.A00(this.A0m, "filtered_folder_clicked", this.A02.A02.A00, (String) null, (String) null, this.A0j.A05());
    }

    public final void A0i() {
        if (!2El.A0E(this.A0h)) {
            OO9 oo9 = this.A0p;
            oo9.A05(this.A02.A01);
            oo9.A01(this.A0a);
            C72687PFr A0Y2 = A0Y();
            PU7.A00(A0Y2.A0E, A0Y2.A02, A0Y2, 29);
        }
    }

    public final void A0j() {
        OTI oti = this.A0m;
        boolean z = this.A0O;
        2ED r1 = this.A0j;
        int A062 = r1.A06();
        int A052 = r1.A05();
        String obj = this.A02.A01.toString();
        int A072 = r1.A07();
        0qQ.A0B(obj, 3);
        UserSession userSession = oti.A01;
        if (z) {
            A052 = A062;
        }
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(oti.A00, userSession), "direct_requests_enter_pending_inbox");
        A0e2.A9F("total_requests", DbS.A0j(A052));
        A0e2.A9O("e_counter_channel", "");
        A0e2.A7p("is_spam", JTP.A0g(A0e2, "selected_filter", obj, z));
        if (z) {
            A072 = 0;
        }
        A0e2.A9F("unread_requests", DbS.A0j(A072));
        A0e2.Cgf();
    }

    public final void A0l(boolean z) {
        this.A0H = z;
        if (!z) {
            this.A0v.clear();
        }
        Dbb.A0u(this.A0b);
        A0K(this);
        NJW.A04(this.A0r.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r14 != false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        if (X.C272094k5.A0A(r13.A0h, true) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (X.C272094k5.A0A(r13.A0h, true) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (X.2El.A03(r13.A0h) == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0134, code lost:
        if (X.182.A06(X.DbS.A0J(r5, 0), r5, 36317161124467516L) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        A0H(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0172, code lost:
        if (X.182.A06(r5, r8, 36317161124533053L) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b0, code lost:
        if (X.182.A06(X.DbS.A0J(r4, 0), r4, 36311925559657272L) != false) goto L_0x01b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0m(boolean r14, boolean r15) {
        /*
            r13 = this;
            boolean r0 = r13.A0O
            if (r0 != 0) goto L_0x0013
            X.NkF r1 = r13.A02
            X.NkF r0 = X.C69375NkF.A06
            if (r1 != r0) goto L_0x0013
            com.instagram.common.session.UserSession r0 = r13.A0h
            boolean r1 = X.2El.A03(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            r12 = 1
            if (r14 == 0) goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            X.Nbb r6 = r13.A04
            X.9HU r0 = r6.A08
            r0.A00()
            X.Mpz r10 = r13.A0n
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.Mkq r0 = r13.A0W()
            r10.A06(r0, r1)
            X.NkF r0 = r13.A02
            java.lang.String r0 = r0.A03
            X.0qQ.A0B(r0, r7)
            java.lang.String r1 = "filter_type"
            r6.A0J(r1, r0)
            X.NkF r0 = r13.A02
            java.lang.String r0 = r0.A03
            X.0qQ.A0B(r0, r7)
            r10.A03(r1, r0)
            X.34p r0 = r6.A00
            if (r0 == 0) goto L_0x004b
            r0.A04()
        L_0x004b:
            boolean r0 = r13.A0O
            X.Ncg r4 = r13.A0o
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = "spam"
            X.Mkq r5 = X.C67256Mkq.PENDING
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r1)
        L_0x005b:
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "fetch_threads_start_pending"
        L_0x005f:
            java.lang.String r1 = "cache"
            r4.A04(r0, r1)
            java.lang.String r0 = "fetch_threads_cache_start"
            r3 = 0
            r10.A04(r0, r3)
            A0J(r13)
            r13.A0D = r2
            java.util.List r8 = r13.A12
            int r9 = r8.size()
            java.lang.String r0 = "cached_thread_count"
            r6.A0G(r0, r9)
            java.lang.String r0 = "fetch_threads_cache_end"
            r10.A04(r0, r3)
            java.lang.String r0 = "threads_rendered_cache"
            r10.A04(r0, r3)
            if (r12 == 0) goto L_0x0090
            r9 = 26
            X.Plp r0 = new X.Plp
            r0.<init>(r10, r9)
            X.C67573Mq7.A00(r10, r0)
        L_0x0090:
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x00f2
            X.Mkq r0 = X.C67256Mkq.SPAM
        L_0x0096:
            X.C69004Ncg.A01(r0, r4, r2, r7)
            X.Mkq r0 = r13.A0W()
            X.0qQ.A0B(r0, r7)
            if (r5 != r0) goto L_0x00ef
            java.lang.String r0 = "threads_rendered_pending"
        L_0x00a4:
            r4.A04(r0, r1)
            boolean r0 = r13.A0O
            if (r0 != 0) goto L_0x00bc
            X.NkF r1 = r13.A02
            X.NkF r0 = X.C69375NkF.A06
            if (r1 != r0) goto L_0x00bc
            if (r14 != 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = r13.A0h
            boolean r0 = X.C272094k5.A0A(r0, r2)
            r11 = 1
            if (r0 == 0) goto L_0x00bd
        L_0x00bc:
            r11 = 0
        L_0x00bd:
            boolean r0 = r13.A0O
            if (r0 != 0) goto L_0x00ce
            if (r14 != 0) goto L_0x00ce
            if (r15 != 0) goto L_0x00ce
            com.instagram.common.session.UserSession r0 = r13.A0h
            boolean r1 = X.C272094k5.A0A(r0, r2)
            r0 = 1
            if (r1 != 0) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            if (r12 == 0) goto L_0x0117
            X.OO9 r5 = r13.A0p
            X.2ED r4 = r13.A0j
            X.2EY r1 = X.AnonymousClass2EY.A00
            X.48q r0 = X.C2611948q.ALL
            boolean r3 = r4.A0V(r1, r0)
            java.lang.String r1 = r4.A0C(r1, r0)
            X.43G r0 = r5.A04
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "directCurrentSource"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ef:
            java.lang.String r0 = "threads_rendered_other"
            goto L_0x00a4
        L_0x00f2:
            r0 = r5
            goto L_0x0096
        L_0x00f4:
            java.lang.String r0 = "fetch_threads_start_other"
            goto L_0x005f
        L_0x00f8:
            X.Mkq r5 = X.C67256Mkq.PENDING
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r0)
            goto L_0x005b
        L_0x0102:
            r0.A03 = r3
            r0.A01 = r1
            A0H(r13)
            r13.A0Q = r2
            int r1 = r8.size()
            r0 = 10
            if (r1 >= r0) goto L_0x013b
            A0G(r13)
            return
        L_0x0117:
            if (r0 == 0) goto L_0x0175
            X.NkF r1 = r13.A02
            X.NkF r0 = X.C69375NkF.A08
            if (r1 != r0) goto L_0x013c
            boolean r0 = r13.A0S()
            if (r0 == 0) goto L_0x013c
            com.instagram.common.session.UserSession r5 = r13.A0h
            X.0Tu r4 = X.DbS.A0J(r5, r7)
            r0 = 36317161124467516(0x8106440013133c, double:3.030457160358714E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x013c
        L_0x0136:
            A0H(r13)
        L_0x0139:
            r13.A0Q = r2
        L_0x013b:
            return
        L_0x013c:
            int r1 = r8.size()
            r0 = 10
            if (r1 < r0) goto L_0x0175
            long r9 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r8 = r13.A0h
            X.0xa r1 = X.AnonymousClass7TE.A0q(r8)
            java.lang.String r0 = "last_pending_inbox_filtering_cache_update_timestamp"
            long r0 = X.DbW.A06(r1, r0)
            long r9 = r9 - r0
            X.0Tu r5 = X.DbS.A0J(r8, r7)
            r0 = 36598636101373170(0x82064400160cf2, double:3.2084630691626075E-306)
            int r0 = X.DbS.A04(r5, r8, r0)
            int r0 = r0 * 1000
            long r0 = (long) r0
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0175
            r0 = 36317161124533053(0x8106440014133d, double:3.03045716040016E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x0175
            goto L_0x0136
        L_0x0175:
            if (r11 == 0) goto L_0x0198
            boolean r0 = r13.A0S()
            if (r0 != 0) goto L_0x0183
            boolean r0 = r13.A0R()
            if (r0 == 0) goto L_0x0198
        L_0x0183:
            A0H(r13)
            boolean r0 = r13.A0R()
            if (r0 == 0) goto L_0x0139
            r13.A0Q = r7
            X.OO9 r2 = r13.A0p
            X.NkF r1 = r13.A02
            boolean r0 = r13.A0N
            r2.A03(r1, r3, r0)
            return
        L_0x0198:
            r5 = 1
            r13.A0J = r2
            r13.A0Q = r7
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x01de
            com.instagram.common.session.UserSession r4 = r13.A0h
            X.0Tu r2 = X.DbS.A0J(r4, r7)
            r0 = 36311925559657272(0x81018100180338, double:3.027146168090788E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x01de
        L_0x01b2:
            r13.A0L = r5
            r13.A0K = r5
            r13.A00 = r7
            long r0 = java.lang.System.currentTimeMillis()
            r13.A01 = r0
            X.34p r0 = r6.A02
            r0.A08(r3)
            X.34p r0 = r6.A01
            r0.A08(r3)
            X.Mjt r0 = r13.A03
            r0.A01()
            X.OO9 r2 = r13.A0p
            X.NkF r1 = r13.A02
            boolean r0 = r13.A0N
            r2.A03(r1, r3, r0)
            java.util.Set r1 = r13.A15
            X.NkF r0 = r13.A02
            r1.add(r0)
            return
        L_0x01de:
            r5 = 0
            goto L_0x01b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71153OeR.A0m(boolean, boolean):void");
    }

    public static Boolean A02(AnonymousClass2Ep r5, C71153OeR oeR) {
        boolean z;
        Set A1F2 = AnonymousClass7TE.A1F();
        C68497NKq nKq = oeR.A06;
        boolean z2 = false;
        if (nKq != null) {
            A1F2 = (Set) nKq.A04.getValue();
            z = A1F2.stream().anyMatch(new C73453Pcv(r5, 3));
        } else {
            z = false;
        }
        if (A1F2.isEmpty() || z) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    private String A03(C254743sy r3) {
        AnonymousClass17B r0;
        C74516PwB A012 = A01(this, r3);
        if (A012 == null || A012.BkC().isEmpty()) {
            return null;
        }
        if (A012.CUG()) {
            r0 = A012.BIs();
        } else {
            r0 = (AnonymousClass17B) AnonymousClass7TE.A13(A012.BkC());
        }
        if (r0 != null) {
            return r0.getId();
        }
        return null;
    }

    public static ArrayList A04(C257443xP r5, C71153OeR oeR) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        if (r5.A06() && r5.A03() != null) {
            C74549Pwi pwi = (C74549Pwi) r5.A03();
            for (int i = 0; i < pwi.getCount(); i++) {
                A1C2.add(C72583PBo.A0W.A00(oeR.A0h, pwi, i));
            }
        }
        return A1C2;
    }

    private ArrayList A05(List list) {
        List AxI;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A182 = AnonymousClass7TE.A18(it);
            0qQ.A0B(A182, 0);
            AnonymousClass3U9 A0N2 = this.A0k.A0N(A182);
            if (!(A0N2 == null || (AxI = A0N2.AxI()) == null || AxI.isEmpty())) {
                A1C2.add(A0N2.AxI());
            }
        }
        return A1C2;
    }

    public static ArrayList A06(List list) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C2.add(C66647MaG.A0B((C254743sy) it.next()));
        }
        return A1C2;
    }

    private HashMap A07(List list) {
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass2Ep A0c2 = C66580MXl.A0c(it);
            C254703su A012 = AnonymousClass48N.A01(A0c2);
            UserSession userSession = this.A0h;
            A1E2.put(A0c2.BJy(), new C66684Mar(userSession, A012, A0c2, C66653MaM.A00(this.A0Y, userSession)));
        }
        return A1E2;
    }

    public static void A09(N4G n4g, C71153OeR oeR, List list, int i) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        List list2 = list;
        A0Q(list2, A1C2, A1C3);
        C71153OeR oeR2 = oeR;
        Context context = oeR2.A0Y;
        UserSession userSession = oeR2.A0h;
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            C254743sy r1 = (C254743sy) it.next();
            C74516PwB A012 = A01(oeR2, r1);
            if (r1 != null) {
                A1C4.add(A012);
            }
        }
        int size = oeR2.A12.size() + oeR2.A0u.size();
        C69002Nce nce = new C69002Nce(oeR2, AnonymousClass05K.A00, list2);
        AnonymousClass0iw r12 = oeR2.A0c;
        String obj = oeR2.A02.A01.toString();
        ArrayList A052 = oeR2.A05(A06(A1C2));
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        Iterator it2 = A1C3.iterator();
        while (it2.hasNext()) {
            C254743sy r2 = (C254743sy) it2.next();
            C74516PwB A013 = A01(oeR2, r2);
            if (r2 != null) {
                A1C5.add(A013);
            }
        }
        0qQ.A0B(context, 0);
        N4G n4g2 = n4g;
        C51972G9s.A1B(userSession, n4g);
        0qQ.A0B(r12, 6);
        if (!A1C4.isEmpty() || !A1C5.isEmpty()) {
            ArrayList A0r2 = AnonymousClass7TG.A0r(A1C4);
            Iterator it3 = A1C4.iterator();
            while (it3.hasNext()) {
                String A0A2 = C66647MaG.A0A(((C74516PwB) it3.next()).CBV());
                if (A0A2 == null) {
                    A0A2 = "";
                }
                A0r2.add(A0A2);
            }
            int A002 = OPS.A00(userSession, A0r2);
            int size2 = A1C4.size();
            boolean A1P2 = AnonymousClass7TF.A1P(A002);
            int i2 = n4g2.A00;
            0xI A003 = 0xI.A00(r12, "direct_requests_allow_multiple_confirm");
            A003.A08(Integer.valueOf(size), "num_requests_visible");
            A003.A09("all_used", false);
            A003.A08(Integer.valueOf(size2), "num_selected");
            if (i2 != -1) {
                A003.A08(Integer.valueOf(i2), "folder");
            }
            if (obj != null) {
                A003.A0C("selected_filter", obj);
            }
            if (DbT.A1b(A052)) {
                A003.A0C("labels", A052.toString());
            }
            A003.A09("is_interop", Boolean.valueOf(A1P2));
            A003.A08(Integer.valueOf(A002), "interop_thread_count");
            int i3 = i;
            A003.A08(Integer.valueOf(i3), C273654mx.A00(3454));
            DbU.A1R(A003, userSession);
            UserSession userSession2 = userSession;
            C71131OdU.A01(context, n4g2, userSession2, nce, obj, A0r2, A1C5, i3);
            return;
        }
        0wb.A03("DirectPermissionControls", "No implementation exists to accept all threads.");
    }

    public static void A0E(C74516PwB pwB, C71153OeR oeR, C254743sy r9, int i, boolean z) {
        1pZ A002 = AnonymousClass1pc.A00();
        C71153OeR oeR2 = oeR;
        UserSession userSession = oeR.A0h;
        C254743sy r6 = r9;
        int i2 = i;
        if (!A002.Et5(userSession, C54660HMr.INBOX_DELETE) && z) {
            if (C71097OcX.A04(oeR2.A0b.requireActivity(), userSession, new C72678PFi(pwB, oeR2, r9, i), 1, oeR2.A0O)) {
                return;
            }
        }
        A0M(oeR2, r6, AnonymousClass05K.A15, i2, pwB.Cdt(), false);
    }

    public static void A0M(C71153OeR oeR, C254743sy r13, Integer num, int i, boolean z, boolean z2) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        boolean z3 = r13 instanceof DirectThreadKey;
        if (z3) {
            String A092 = C66647MaG.A09(r13);
            if (A092 != null) {
                A1C2.add(A092);
            }
        } else if (r13 instanceof MsysThreadId) {
            A1C3.add(r13);
        }
        C71153OeR oeR2 = oeR;
        A0N(oeR2, "direct_requests_delete_thread", "swipe", (String) null, ImmutableList.of(r13), i);
        Context context = oeR.A0Y;
        UserSession userSession = oeR.A0h;
        C71131OdU.A02(context, userSession, num, A1C2, A1C3, z2);
        if (z3) {
            if (!z || oeR2.A0O) {
                boolean z4 = oeR2.A0O;
                2ED r0 = oeR2.A0j;
                if (z4) {
                    r0.A0J(1);
                } else {
                    r0.A0I(1);
                }
            } else {
                oeR2.A0j.A0N(oeR2.A0i.Brn(), 1, false);
            }
            if (oeR2.A0O) {
                A0A(new SingletonImmutableSet(r13), oeR2);
            }
        }
        oeR2.A0d.markerStart(190449529);
        C70381O4i.A00(oeR2.A0b, userSession, AnonymousClass05K.A00, oeR2.A0O, false);
        oeR2.A08();
    }

    public static void A0N(C71153OeR oeR, String str, String str2, String str3, List list, int i) {
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        List list2 = list;
        A0Q(list2, A1C2, AnonymousClass7TE.A1C());
        ArrayList A062 = A06(A1C2);
        OTI oti = oeR.A0m;
        String obj = oeR.A02.A01.toString();
        ArrayList A052 = oeR.A05(A062);
        int A002 = A00(oeR, list2);
        0qQ.A0B(obj, 2);
        C3265677h.A0T(oti.A00, oti.A01, str, oti.A02, obj, str2, str3, A062, A052, i, A002);
    }

    public static void A0Q(List list, List list2, List list3) {
        for (Object next : list) {
            if (next instanceof DirectThreadKey) {
                list2.add(next);
            } else if (next instanceof MsysThreadId) {
                list3.add(next);
            }
        }
    }

    public final HashSet A0b() {
        HashSet A1F2 = AnonymousClass7TE.A1F();
        Iterator it = this.A0v.iterator();
        while (it.hasNext()) {
            C74516PwB A012 = A01(this, (C254743sy) it.next());
            if (A012 != null) {
                A1F2.add(A012);
            }
        }
        return A1F2;
    }
}
