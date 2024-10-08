package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: X.GUf  reason: case insensitive filesystem */
public final class C52477GUf extends C14430Tvz implements AnonymousClass0iw, C249763kK, AnonymousClass4DV, C232682uF, AnonymousClass4DR, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT {
    public static final String __redex_internal_original_name = "DiscoveryChainingFeedFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 1;
    public int A04 = 1;
    public C46329Dbx A05;
    public C227762js A06;
    public HBA A07;
    public I4C A08;
    public DiscoveryChainingItem A09;
    public C228362lW A0A;
    public GMC A0B;
    public C238133Ar A0C;
    public AnonymousClass2mA A0D;
    public C228312lJ A0E;
    public C233812wV A0F;
    public AnonymousClass6ST A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public int A0T = 4;
    public long A0U;
    public LinearLayoutManagerCompat A0V;
    public 2el A0W;
    public C55486HiU A0X;
    public C52469GTv A0Y;
    public C55628Hkn A0Z;
    public C2356130n A0a;
    public ExploreTopicCluster A0b;
    public AnonymousClass57N A0c;
    public C232692uG A0d;
    public C229332nD A0e;
    public C2372036s A0f;
    public JPT A0g;
    public C231162qy A0h;
    public C233012uo A0i;
    public HCA A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public Queue A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public final C14005To7 A0x = new C14005To7();
    public final AnonymousClass0eM A0y = C227642jf.A02(this);
    public final C55937Hq1 A0z = new C55937Hq1(this);
    public final C55484HiS A10 = new C55484HiS(this);
    public final C249383je A11 = new HC8(this, 1);
    public final C230742qA A12 = C230732q9.A00(new IWE(this), getModuleName());

    public final boolean CbJ() {
        return true;
    }

    public final 0jB E4l(1Xj r5) {
        int i;
        0qQ.A0B(r5, 0);
        0jB E4k = E4k();
        0j9 r2 = C271774jZ.A1A;
        AnonymousClass3W1 BQr = C51968G9o.A0k(this).BQr(r5);
        if (BQr.A0p()) {
            i = BQr.getPosition();
        } else {
            i = -1;
        }
        E4k.A04(r2, DbS.A0j(i));
        return E4k;
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        0qQ.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A0Y != null) {
            C51968G9o.A0k(this).notifyDataSetChangedSmart(configuration);
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4DQ, X.07g, androidx.fragment.app.Fragment, X.GUf, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewStub A0F2 = DbS.A0F(view, R.id.refreshable_container_stub);
        if (A0F2 != null) {
            view = A0F2.inflate();
        }
        C238773Dj r1 = C238773Dj.A00;
        AnonymousClass0eM r4 = this.A0y;
        List A002 = r1.A00(view, AnonymousClass7TE.A0l(r4));
        C238133Ar A003 = C238103Ao.A00((ViewGroup) view.findViewById(16908298));
        2el r6 = this.A0W;
        if (r6 == null) {
            str = "viewpointManager";
        } else {
            AnonymousClass3DZ A004 = AnonymousClass3DZ.A00(this);
            ViewGroup CEd = A003.CEd();
            AnonymousClass2eo[] r12 = (AnonymousClass2eo[]) A002.toArray(new AnonymousClass2eo[0]);
            r6.A08(CEd, A004, (AnonymousClass2eo[]) Arrays.copyOf(r12, r12.length));
            this.A0C = A003;
            view.requireViewById(R.id.refreshable_container).setEnabled(false);
            C238133Ar r0 = this.A0C;
            if (r0 != null) {
                ViewGroup CEd2 = r0.CEd();
                0qQ.A0C(CEd2, C273654mx.A00(4));
                RecyclerView recyclerView = (RecyclerView) CEd2;
                recyclerView.setLayoutManager(A00(this));
                recyclerView.A0S = true;
                recyclerView.setItemViewCacheSize(10);
                if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r4), 36323045228817166L)) {
                    recyclerView.setItemAnimator((AnonymousClass3AS) null);
                } else {
                    AnonymousClass3AS r13 = recyclerView.A0C;
                    if (r13 != null && (r13 instanceof AnonymousClass3AR)) {
                        ((AnonymousClass3AR) r13).A00 = false;
                    }
                }
                C52469GTv A052 = A05();
                AnonymousClass4DV r02 = (AnonymousClass4DV) A052.A0E;
                C238133Ar scrollingViewProxy = r02.getScrollingViewProxy();
                C227762js r3 = A052.A0F;
                r3.A06(A052.A00(), r02.getScrollingViewProxy(), A052.A08);
                r3.A02();
                scrollingViewProxy.ENw(A052.A00());
                scrollingViewProxy.AAD(A052);
                C52761GcE gcE = A052.A02;
                if (gcE != null && !scrollingViewProxy.CWN()) {
                    C238123Aq r5 = (C238123Aq) scrollingViewProxy;
                    C52476GUc A005 = A052.A00();
                    AnonymousClass2xS r03 = A052.A05;
                    if (r03 != null) {
                        gcE.A05(A005, r03, r5);
                    } else {
                        str = "videoFeedModule";
                    }
                }
                I4C i4c = this.A08;
                if (i4c == null) {
                    str = "chainingLogger";
                } else {
                    i4c.A01 = this.A0C;
                    C238833Dp.A00(AnonymousClass7TE.A0l(r4)).A05(view, C238863Ds.INSTAGRAM_EXPLORE);
                    AnonymousClass57N r32 = this.A0c;
                    if (r32 != null) {
                        C56585I2p.A00(this, new 2YN(new C53050Ghi(DbY.A05(this), AnonymousClass7TE.A0l(r4), r32), this).A00(C60100Jfg.class));
                        return;
                    }
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final LinearLayoutManagerCompat A00(C52477GUf gUf) {
        LinearLayoutManagerCompat linearLayoutManagerCompat = gUf.A0V;
        if (linearLayoutManagerCompat != null) {
            return linearLayoutManagerCompat;
        }
        LinearLayoutManagerCompat linearLayoutManagerCompat2 = new LinearLayoutManagerCompat(gUf.requireContext());
        linearLayoutManagerCompat2.A02 = true;
        gUf.A0V = linearLayoutManagerCompat2;
        return linearLayoutManagerCompat2;
    }

    public static final void A01(C52477GUf gUf) {
        Iterator it;
        1Xj A0U2;
        Queue queue = gUf.A0p;
        if (queue != null && (it = queue.iterator()) != null && it.hasNext() && (A0U2 = DbV.A0U(AnonymousClass7TE.A0l(gUf.A0y), (String) queue.poll())) != null) {
            C52476GUc A0k2 = C51968G9o.A0k(gUf);
            ((IWI) A0k2.A00).A03(AnonymousClass7TE.A1I(A0U2));
            C52476GUc.A00(A0k2);
        }
    }

    public static void A02(C52477GUf gUf, String str) {
        C52464GTq A002;
        Long l;
        if (str.equals("feed_contextual_chain") && (l = (A002 = GM4.A00(gUf.A04())).A04) != null) {
            A002.A00 += A002.A08.now() - l.longValue();
        }
    }

    public static final boolean A03(C52477GUf gUf) {
        if (gUf.A0Q) {
            GMC gmc = gUf.A0B;
            if (gmc != null) {
                1Xj A012 = gmc.A01();
                if (A012 == null) {
                    return false;
                }
                String id = A012.getId();
                DiscoveryChainingItem discoveryChainingItem = gUf.A09;
                if (discoveryChainingItem == null) {
                    0qQ.A0F("discoveryChainingItem");
                    throw AnonymousClass00P.createAndThrow();
                } else if (!0qQ.A0K(id, discoveryChainingItem.A0E)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return true;
    }

    public final UserSession A04() {
        return AnonymousClass7TE.A0l(this.A0y);
    }

    public final C52469GTv A05() {
        C52469GTv gTv = this.A0Y;
        if (gTv != null) {
            return gTv;
        }
        0qQ.A0F("viewController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C227762js BD0() {
        C227762js r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        C55889HpA hpA;
        C52758GcB gcB;
        int A0I2;
        if (this.A0Y != null) {
            C52469GTv A052 = A05();
            AnonymousClass4DH r5 = A052.A0E;
            C238133Ar scrollingViewProxy = ((AnonymousClass4DV) r5).getScrollingViewProxy();
            if (scrollingViewProxy != null) {
                C52761GcE gcE = A052.A02;
                if (!(gcE == null || (hpA = gcE.A03) == null || (gcB = gcE.A04) == null)) {
                    hpA.A01 = true;
                    C59609JQd jQd = gcB.A04;
                    if (jQd.AZO().isEmpty()) {
                        A0I2 = 0;
                    } else {
                        A0I2 = C51971G9r.A0I(jQd.AZO(), 0);
                    }
                    gcB.A00 = Math.max(0, A0I2 - 1);
                }
                scrollingViewProxy.EKm(r5);
            }
        }
    }

    public final String getModuleName() {
        String str = this.A0J;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final C238133Ar getScrollingViewProxy() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0y);
    }

    public final String getSessionId() {
        String str = this.A0k;
        if (str != null) {
            return str;
        }
        0qQ.A0F("_sessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4k() {
        String str;
        0jB A0k2 = C51965G9l.A0k();
        0j9 r1 = C271774jZ.A1C;
        I4C i4c = this.A08;
        if (i4c == null) {
            str = "chainingLogger";
        } else {
            A0k2.A04(r1, i4c.A0B);
            0j9 r12 = C271774jZ.A6S;
            DiscoveryChainingItem discoveryChainingItem = this.A09;
            if (discoveryChainingItem == null) {
                str = "discoveryChainingItem";
            } else {
                A0k2.A04(r12, discoveryChainingItem.A0E);
                A0k2.A04(C271774jZ.A1D, this.A0o);
                A0k2.A06(this.A0x.A00);
                C324636ze.A00(AnonymousClass7TE.A0l(this.A0y)).A00(A0k2);
                return A0k2;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4x() {
        String str;
        0jB A0k2 = C51965G9l.A0k();
        0j9 r1 = C271774jZ.A1C;
        I4C i4c = this.A08;
        if (i4c == null) {
            str = "chainingLogger";
        } else {
            A0k2.A04(r1, i4c.A0B);
            0j9 r12 = C271774jZ.A6S;
            DiscoveryChainingItem discoveryChainingItem = this.A09;
            if (discoveryChainingItem == null) {
                str = "discoveryChainingItem";
            } else {
                A0k2.A04(r12, discoveryChainingItem.A0E);
                C324636ze.A00(AnonymousClass7TE.A0l(this.A0y)).A00(A0k2);
                return A0k2;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r4) {
        String str;
        String str2;
        AnonymousClass2Ep r0;
        Dbb.A1I(r4);
        if (this.A0v) {
            r4.Epe();
        }
        r4.ErT(this);
        String str3 = this.A0K;
        if (str3 == null || this.A01 == 0) {
            str3 = this.A0H;
        }
        GMC gmc = this.A0B;
        if (gmc == null || (r0 = gmc.A0A) == null) {
            str = null;
        } else {
            str = r0.C6f();
        }
        r4.EfN(str3, str);
        if (this.A0w) {
            r4.AA9(new C56800ICx(this, 60), 2131960992);
        }
        UserSession A0l2 = AnonymousClass7TE.A0l(this.A0y);
        String str4 = this.A0J;
        if (str4 == null) {
            str2 = "discoveryChainingModuleName";
        } else {
            List A002 = F5p.A00(A0l2, str4);
            if (AnonymousClass7TE.A1b(A002)) {
                C227762js r02 = this.A06;
                if (r02 == null) {
                    str2 = "scrollableNavigationHelper";
                } else {
                    r02.A0A = A002;
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v1, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: X.4DJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v2, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v1, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v4, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v5, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v5, resolved type: X.3kK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v7, resolved type: X.4DU} */
    /* JADX WARNING: type inference failed for: r2v50, types: [X.3on, X.2lU, X.HBA] */
    /* JADX WARNING: type inference failed for: r41v0, types: [X.57L, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v86, types: [X.HiU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v64, types: [X.3on, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v187, types: [java.lang.Object, X.2uo] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r75) {
        /*
            r74 = this;
            r0 = -1192595748(0xffffffffb8ea6edc, float:-1.1178639E-4)
            int r16 = X.AnonymousClass0fD.A02(r0)
            r0 = r74
            android.os.Bundle r5 = r0.requireArguments()
            X.0eM r1 = r0.A0y
            r73 = r1
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r73)
            r2 = 31784993(0x1e50021, float:8.41215E-38)
            java.lang.String r1 = "feed"
            X.Dbx r3 = new X.Dbx
            r3.<init>(r4, r1, r2)
            r0.A05 = r3
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.2cc r1 = X.C71342cb.A00(r1)
            r3.A0R(r2, r1, r0)
            r1 = r75
            X.C52477GUf.super.onCreate(r1)
            java.lang.Class<com.instagram.discovery.chaining.intf.DiscoveryChainingConfig> r2 = com.instagram.discovery.chaining.intf.DiscoveryChainingConfig.class
            java.lang.String r1 = "DiscoveryChainingFeedFragment.ARGUMENT_CONFIG"
            android.os.Parcelable r1 = X.C320236s2.A00(r5, r2, r1)
            com.instagram.discovery.chaining.intf.DiscoveryChainingConfig r1 = (com.instagram.discovery.chaining.intf.DiscoveryChainingConfig) r1
            java.lang.String r2 = r1.A06
            r0.A0I = r2
            java.util.Set r3 = r1.A0G
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>(r3)
            r0.A0p = r2
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r1.A01
            r0.A09 = r2
            java.lang.String r2 = r1.A05
            r0.A0H = r2
            java.lang.String r2 = r1.A0B
            r0.A0K = r2
            com.instagram.explore.topiccluster.ExploreTopicCluster r2 = r1.A02
            r0.A0b = r2
            java.lang.String r3 = r1.A07
            r0.A0l = r3
            java.lang.String r2 = r1.A0C
            r0.A0k = r2
            boolean r2 = r1.A0R
            r0.A0S = r2
            boolean r2 = r1.A0P
            r0.A0w = r2
            boolean r2 = r1.A0K
            r0.A0Q = r2
            java.lang.String r2 = r1.A09
            r0.A0n = r2
            java.lang.String r2 = r1.A0E
            r0.A0o = r2
            java.lang.String r20 = "entryPoint"
            r19 = 0
            int r2 = r3.hashCode()
            switch(r2) {
                case -1273778139: goto L_0x096d;
                case -676534496: goto L_0x0979;
                case -383091074: goto L_0x0989;
                case -307998995: goto L_0x0995;
                case 109021055: goto L_0x09a5;
                default: goto L_0x0083;
            }
        L_0x0083:
            java.lang.String r2 = "feed_contextual_chain"
        L_0x0085:
            r0.A0J = r2
            boolean r2 = r1.A0Q
            r0.A0R = r2
            boolean r2 = r1.A0M
            r0.A0t = r2
            boolean r2 = r1.A0L
            r0.A0P = r2
            boolean r2 = r1.A0H
            r0.A0u = r2
            boolean r2 = r1.A0N
            r0.A0s = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r5 = 0
            X.0Tu r4 = X.DbS.A0J(r6, r5)
            r2 = 36317560556229977(0x8106a100101559, double:3.030709762613677E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0v = r2
            java.lang.String r2 = r1.A0D
            r71 = r2
            java.util.HashMap r11 = r1.A0F
            boolean r2 = r0.A0t
            if (r2 == 0) goto L_0x00c8
            java.lang.String r2 = r1.A08
            r0.A0m = r2
            java.lang.Integer r2 = r1.A03
            if (r2 == 0) goto L_0x0969
            int r2 = r2.intValue()
            long r2 = (long) r2
        L_0x00c6:
            r0.A0U = r2
        L_0x00c8:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            X.2lW r2 = X.AnonymousClass2lV.A00(r2)
            r0.A0A = r2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            X.1E8 r3 = X.1E7.A00(r2)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            java.lang.String r17 = "discoveryChainingItem"
            if (r2 == 0) goto L_0x0357
            java.lang.String r2 = r2.A0E
            X.1Xj r7 = r3.A02(r2)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            java.lang.Integer r3 = r2.A04
            if (r7 == 0) goto L_0x00fe
            boolean r2 = r7.A5D()
            if (r2 == 0) goto L_0x00fe
            if (r3 == 0) goto L_0x00fe
            int r2 = r3.intValue()
            X.1Xj r7 = r7.A1c(r2)
        L_0x00fe:
            java.lang.String r6 = r0.getModuleName()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r73)
            r18 = 2
            r2 = r18
            X.0qQ.A0B(r3, r2)
            X.HBA r2 = new X.HBA
            r2.<init>(r6, r3, r7)
            r0.A07 = r2
            r0.registerLifecycleListener(r2)
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r23 = r0.requireContext()
            r27 = 499004667(0x1dbe34fb, float:5.034736E-21)
            java.lang.String r3 = r0.A0J
            java.lang.String r21 = "discoveryChainingModuleName"
            if (r3 == 0) goto L_0x0964
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r73)
            r0.A04()
            X.02m r24 = X.C51965G9l.A0l()
            X.2lJ r2 = new X.2lJ
            r26 = r3
            r22 = r2
            r22.<init>(r23, r24, r25, r26, r27)
            r0.A0E = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            java.lang.String r3 = r0.A0J
            if (r3 == 0) goto L_0x0964
            X.IWF r2 = new X.IWF
            r2.<init>(r6, r0, r3)
            r0.A0g = r2
            X.2lJ r3 = r0.A0E
            java.lang.String r12 = "tailLoadLogger"
            if (r3 == 0) goto L_0x095f
            r3.A04 = r2
            X.2mA r2 = new X.2mA
            r2.<init>(r3)
            r0.A0D = r2
            r0.registerLifecycleListener(r3)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36312359349781555(0x8101e600000433, double:3.0274204987121174E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0r = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36317431707473033(0x81068300141489, double:3.030628278140953E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0M = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36317431707538570(0x8106830015148a, double:3.030628278182399E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0L = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36317431707407496(0x81068300131488, double:3.030628278099507E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0O = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36317431707341959(0x81068300121487, double:3.0306282780580614E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0N = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36600659029528516(0x82081b00000fc4, double:3.209742377073726E-306)
            int r2 = X.DbS.A04(r4, r6, r2)
            r0.A0T = r2
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 36315700834340335(0x8104f000000def, double:3.029533667002168E-306)
            boolean r2 = X.182.A06(r4, r6, r2)
            r0.A0q = r2
            android.os.Bundle r3 = r1.A00
            if (r3 == 0) goto L_0x01cf
            X.To7 r2 = r0.A0x
            r2.A00(r3)
        L_0x01cf:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            X.GXc r6 = X.C52550GXb.A00(r2)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            java.lang.String r3 = r2.A0E
            java.util.concurrent.ConcurrentMap r2 = r6.A02
            java.lang.String r48 = X.DbT.A11(r3, r2)
            X.2el r2 = X.C51969G9p.A0k()
            r0.A0W = r2
            X.57L r41 = new X.57L
            r41.<init>()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            android.content.Context r3 = r0.requireContext()
            X.2nD r2 = new X.2nD
            r2.<init>(r6, r3)
            r0.A0e = r2
            r0.registerLifecycleListener(r2)
            java.lang.String r30 = X.AnonymousClass7TG.A0j()
            com.instagram.common.session.UserSession r54 = X.AnonymousClass7TE.A0l(r73)
            X.2el r7 = r0.A0W
            java.lang.String r25 = "viewpointManager"
            if (r7 == 0) goto L_0x095a
            java.lang.String r6 = r0.A0n
            java.lang.String r24 = "priorModule"
            if (r6 == 0) goto L_0x0955
            X.2qj r57 = X.C231012qj.FEED_PRODUCT_PIVOTS
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            java.lang.String r3 = r2.A0E
            int r2 = r2.A00
            X.2qk r52 = new X.2qk
            r53 = r0
            r55 = r7
            r56 = r0
            r58 = r71
            r59 = r6
            r60 = r30
            r61 = r3
            r62 = r2
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            com.instagram.common.session.UserSession r58 = X.AnonymousClass7TE.A0l(r73)
            X.2el r8 = r0.A0W
            if (r8 == 0) goto L_0x095a
            java.lang.String r7 = r0.A0n
            if (r7 == 0) goto L_0x0955
            java.lang.Integer r55 = X.AnonymousClass05K.A01
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            java.lang.String r6 = r2.A0E
            int r3 = r2.A00
            X.2qy r2 = new X.2qy
            r56 = r2
            r57 = r0
            r59 = r8
            r60 = r0
            r61 = r19
            r62 = r55
            r63 = r7
            r64 = r19
            r65 = r71
            r66 = r19
            r67 = r30
            r68 = r6
            r69 = r3
            r56.<init>(r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
            r0.A0h = r2
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r73)
            X.6yu r2 = new X.6yu
            r2.<init>(r6, r0, r3)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            boolean r3 = r0.A0r
            r2 = r30
            X.GXr r67 = X.GXW.A00(r6, r0, r2, r3)
            android.content.Context r32 = r0.requireContext()
            com.instagram.common.session.UserSession r33 = X.AnonymousClass7TE.A0l(r73)
            X.0gy r44 = X.AnonymousClass07i.A00(r0)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            com.instagram.explore.topiccluster.ExploreTopicCluster r10 = r0.A0b
            java.lang.String r8 = r0.A0l
            if (r8 == 0) goto L_0x0950
            java.lang.String r6 = r0.A0n
            if (r6 == 0) goto L_0x0955
            boolean r9 = r0.A0s
            if (r9 == 0) goto L_0x08f7
            java.lang.String r40 = "non_personalized_media_chaining"
        L_0x02a3:
            X.IRA r31 = new X.IRA
            r34 = r2
            r35 = r10
            r36 = r0
            r37 = r67
            r38 = r30
            r39 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x02b4:
            X.HrC r40 = new X.HrC
            r42 = r40
            r43 = r32
            r45 = r33
            r46 = r31
            r47 = r0
            r49 = r11
            r50 = r9
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50)
            X.JT2 r39 = X.JT2.A00
            X.0qQ.A08(r39)
            boolean r2 = r0.A0q
            if (r2 == 0) goto L_0x02d7
            X.IY2 r2 = new X.IY2
            r2.<init>()
            r0.A0i = r2
        L_0x02d7:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r73)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.2el r8 = r0.A0W
            if (r8 == 0) goto L_0x095a
            X.2lJ r7 = r0.A0E
            if (r7 == 0) goto L_0x095f
            X.2qA r6 = r0.A12
            X.2qB r3 = new X.2qB
            r2 = r19
            r3.<init>(r2, r6, r7)
            X.57M r13 = new X.57M
            r13.<init>(r10, r8, r3, r9)
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r73)
            X.2el r2 = r0.A0W
            if (r2 == 0) goto L_0x095a
            android.content.Context r7 = r0.requireContext()
            X.2os r49 = new X.2os
            r6 = r49
            r8 = r0
            r10 = r2
            r11 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            android.content.Context r3 = r0.requireContext()
            r11 = 1
            r2 = r19
            X.2js r2 = X.C227752jr.A00(r3, r2, r11)
            r0.A06 = r2
            X.HiU r2 = new X.HiU
            r2.<init>()
            r0.A0X = r2
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r73)
            android.content.Context r6 = r0.requireContext()
            r3 = 2132017762(0x7f140262, float:1.9673812E38)
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r6, r3)
            X.2kR r32 = new X.2kR
            r3 = r32
            r3.<init>(r2, r7, r0)
            X.2js r12 = r0.A06
            java.lang.String r31 = "scrollableNavigationHelper"
            if (r12 == 0) goto L_0x08f2
            X.Hq1 r2 = r0.A0z
            r42 = r2
            X.HiS r2 = r0.A10
            r43 = r2
            X.1sy r47 = X.1sy.A0A
            com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat r34 = A00(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            X.Hkl r10 = new X.Hkl
            r10.<init>(r2, r0)
            X.2qy r9 = r0.A0h
            if (r9 != 0) goto L_0x035f
            java.lang.String r17 = "merchantHscrollController"
        L_0x0357:
            X.0qQ.A0F(r17)
        L_0x035a:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x035f:
            java.lang.Integer r56 = X.AnonymousClass05K.A1I
            X.2el r8 = r0.A0W
            if (r8 == 0) goto L_0x095a
            X.2nD r2 = r0.A0e
            r48 = r2
            X.0qQ.A0A(r48)
            boolean r2 = r1.A0J
            r61 = r2
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            X.HMv r3 = r2.A01
            X.HMv r2 = X.C54664HMv.A07
            boolean r62 = X.C51969G9p.A1a(r3, r2)
            boolean r2 = r1.A0I
            r29 = r2
            boolean r2 = r1.A0O
            r28 = r2
            int r2 = r0.A0T
            r27 = r2
            java.lang.String r7 = r0.A0l
            if (r7 == 0) goto L_0x0950
            X.2uo r2 = r0.A0i
            r26 = r2
            boolean r15 = r0.A0P
            boolean r14 = r0.A0v
            X.HBA r6 = r0.A07
            java.lang.String r23 = "feedMediaLoadingTracker"
            if (r6 == 0) goto L_0x08ed
            X.HiU r3 = r0.A0X
            java.lang.String r22 = "mDiscoveryFeedScrollPagerGestureDetectorListenerHolder"
            if (r3 == 0) goto L_0x08e8
            X.GTv r2 = new X.GTv
            r33 = r2
            r35 = r0
            r36 = r12
            r37 = r8
            r38 = r10
            r44 = r3
            r45 = r32
            r46 = r6
            r50 = r13
            r51 = r9
            r53 = r26
            r54 = r0
            r57 = r71
            r58 = r7
            r59 = r30
            r60 = r27
            r63 = r29
            r64 = r28
            r65 = r15
            r66 = r14
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r0.A0Y = r2
            boolean r2 = r0.A0u
            if (r2 == 0) goto L_0x04bc
            X.2js r2 = r0.A06
            if (r2 == 0) goto L_0x08f2
            r2.A0B = r5
        L_0x03d9:
            X.GUc r10 = X.C51968G9o.A0k(r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r73)
            r2 = 2342154346361258492(0x208100f8000001fc, double:4.058240516221262E-152)
            boolean r2 = X.182.A06(r4, r6, r2)
            if (r2 == 0) goto L_0x0400
            r0.A04()
            X.02m r6 = X.C51965G9l.A0l()
            java.lang.String r3 = r0.A0J
            if (r3 == 0) goto L_0x0964
            X.36s r2 = new X.36s
            r2.<init>(r6, r3)
            r0.A0f = r2
            r10.mViewLifecycleListener = r2
        L_0x0400:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r73)
            X.0Tu r6 = X.C51965G9l.A0Z(r7, r11)
            r2 = 36311354327630335(0x8100fc000301ff, double:3.0267849186567865E-306)
            boolean r2 = X.DbY.A1Z(r6, r7, r2)
            if (r2 == 0) goto L_0x04b8
            androidx.fragment.app.FragmentActivity r49 = r0.requireActivity()
            X.0hq r51 = r0.getParentFragmentManager()
            com.instagram.common.session.UserSession r52 = X.AnonymousClass7TE.A0l(r73)
            X.2uE r2 = new X.2uE
            r48 = r2
            r50 = r0
            r53 = r19
            r54 = r0
            r55 = r10
            r56 = r0
            r57 = r5
            r58 = r11
            r59 = r5
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
        L_0x0436:
            r0.A0d = r2
            X.2nD r3 = r0.A0e
            if (r3 == 0) goto L_0x043e
            r3.A00 = r2
        L_0x043e:
            if (r2 == 0) goto L_0x0443
            r0.registerLifecycleListener(r2)
        L_0x0443:
            boolean r2 = r0.A0q
            if (r2 == 0) goto L_0x0469
            com.instagram.common.session.UserSession r49 = X.AnonymousClass7TE.A0l(r73)
            android.content.Context r48 = r0.requireContext()
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r3 = r0.A09
            if (r3 == 0) goto L_0x0357
            X.2uo r2 = r0.A0i
            r50 = r40
            r51 = r3
            r52 = r10
            r53 = r0
            r54 = r2
            r55 = r39
            r56 = r30
            X.2wV r2 = X.I3x.A00(r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r0.A0F = r2
        L_0x0469:
            com.instagram.common.session.UserSession r36 = X.AnonymousClass7TE.A0l(r73)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            java.lang.String r3 = r2.A0E
            X.I4C r2 = new X.I4C
            r33 = r2
            r34 = r10
            r37 = r10
            r38 = r3
            r39 = r30
            r33.<init>(r34, r35, r36, r37, r38, r39)
            r0.A08 = r2
            X.GTv r2 = r0.A05()
            X.2xS r6 = r2.A05
            if (r6 == 0) goto L_0x08e4
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 == 0) goto L_0x0357
            boolean r2 = r2.A0K
            if (r2 == 0) goto L_0x04a3
            X.H5N r3 = new X.H5N
            r3.<init>()
            X.2uK r2 = r6.A0G
            java.util.List r2 = r2.A0P
            r2.add(r3)
            r0.registerLifecycleListener(r3)
        L_0x04a3:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            X.Hkn r9 = new X.Hkn
            r9.<init>(r0, r2)
            r0.A0Z = r9
            com.instagram.explore.topiccluster.ExploreTopicCluster r8 = r0.A0b
            X.I4C r7 = r0.A08
            if (r7 != 0) goto L_0x0520
            java.lang.String r17 = "chainingLogger"
            goto L_0x0357
        L_0x04b8:
            r2 = r19
            goto L_0x0436
        L_0x04bc:
            boolean r2 = r0.A0v
            if (r2 == 0) goto L_0x03d9
            X.2dY r3 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.2dZ r6 = r3.A03(r2)
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r73)
            X.0qQ.A0B(r8, r5)
            r2 = 37161985486225623(0x8406a1000e00d7, double:3.5647274885691945E-306)
            double r2 = X.182.A00(r4, r8, r2)
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            android.graphics.drawable.GradientDrawable r2 = X.GIZ.A00(r7, r8, r2)
            android.view.View r3 = r6.A0N
            r3.setBackground(r2)
            com.instagram.common.session.UserSession r51 = X.AnonymousClass7TE.A0l(r73)
            androidx.fragment.app.FragmentActivity r49 = r0.requireActivity()
            android.view.View r2 = r6.A03
            android.view.View[] r2 = new android.view.View[]{r2, r3}
            java.util.List r52 = X.0sr.A1P(r2)
            X.2js r2 = r0.A06
            if (r2 == 0) goto L_0x08f2
            int r53 = r6.AYI()
            X.HCA r3 = new X.HCA
            r48 = r3
            r50 = r2
            r54 = r5
            r48.<init>(r49, r50, r51, r52, r53, r54)
            X.GTv r2 = r0.A05()
            X.GTW r2 = r2.A0L
            r2.EBt(r3)
            X.0h9 r2 = r0.mLifecycleRegistry
            r2.A09(r3)
            r0.A0j = r3
            goto L_0x03d9
        L_0x0520:
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r3 = r0.A09
            if (r3 == 0) goto L_0x0357
            X.GTv r36 = r0.A05()
            X.HAZ r2 = new X.HAZ
            r33 = r2
            r34 = r7
            r35 = r3
            r37 = r9
            r38 = r8
            r33.<init>(r34, r35, r36, r37, r38)
            r0.A0a = r2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            boolean r2 = X.AnonymousClass2o2.A06(r2)
            if (r2 == 0) goto L_0x0556
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r73)
            X.Lip r7 = X.C54975Ha8.A00(r8)
            X.6jB r3 = X.C314986jA.A00(r8)
            com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl r2 = new com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl
            r2.<init>(r0, r8, r7, r3)
            r0.A0c = r2
        L_0x0556:
            X.0hq r29 = r0.getParentFragmentManager()
            X.GTv r2 = r0.A05()
            X.4DH r9 = r2.A0E
            X.2js r8 = r2.A0F
            X.GUc r7 = r2.A00()
            X.GTW r2 = r2.A0L
            X.2ku r3 = r2.A01
            X.2xD r28 = new X.2xD
            r2 = r28
            r2.<init>(r9, r8, r3, r7)
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r73)
            X.GUc r3 = X.C51968G9o.A0k(r0)
            X.H5M r2 = new X.H5M
            r2.<init>(r7, r3, r0)
            java.util.ArrayList r27 = X.DbV.A14(r2)
            X.2el r2 = r0.A0W
            r26 = r2
            if (r2 == 0) goto L_0x095a
            android.content.Context r7 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r73)
            X.2xP r2 = X.C234242xR.A00()
            X.2xq r15 = new X.2xq
            r15.<init>(r7, r3, r0, r2)
            java.lang.String r2 = r1.A0A
            r70 = r2
            java.lang.String r2 = r0.A0n
            r25 = r2
            if (r2 == 0) goto L_0x0955
            X.30n r14 = r0.A0a
            if (r14 != 0) goto L_0x05ab
            java.lang.String r17 = "exploreSeeLessLoggerDelegate"
            goto L_0x0357
        L_0x05ab:
            X.57N r2 = r0.A0c
            r56 = r2
            android.content.Context r12 = r0.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r73)
            java.lang.String r8 = r0.A0k
            if (r8 != 0) goto L_0x05bf
            java.lang.String r17 = "_sessionId"
            goto L_0x0357
        L_0x05bf:
            boolean r7 = r0.A0r
            X.0qQ.A0B(r9, r11)
            r2 = 36317869792827001(0x8106e900001679, double:3.0309053250828306E-306)
            boolean r13 = X.182.A06(r4, r9, r2)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            if (r7 == 0) goto L_0x05e6
            X.IYo r3 = new X.IYo
            r3.<init>(r9, r0, r8)
            X.2pc r2 = X.C230432pc.EXPLORE
            X.2y6 r3 = X.AnonymousClass2y5.A00(r9, r3, r2)
            X.2y7 r2 = new X.2y7
            r2.<init>(r3)
            r11.add(r2)
        L_0x05e6:
            if (r13 == 0) goto L_0x05f0
            X.2zm r2 = new X.2zm
            r2.<init>(r12)
            r11.add(r2)
        L_0x05f0:
            X.HBA r12 = r0.A07
            if (r12 == 0) goto L_0x08ed
            X.2js r2 = r0.A06
            r24 = r2
            if (r2 == 0) goto L_0x08f2
            X.HiU r2 = r0.A0X
            r23 = r2
            if (r2 == 0) goto L_0x08e8
            r2 = r32
            com.instagram.common.session.UserSession r9 = r2.A01
            X.4DU r8 = r2.A02
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.2xi r7 = new X.2xi
            r7.<init>(r2, r10, r9, r8)
            android.app.Activity r2 = r0.getRootActivity()
            boolean r2 = r2 instanceof X.C70952Zb
            if (r2 == 0) goto L_0x08dd
            android.app.Activity r2 = r0.getRootActivity()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.ui.widget.bouncyufibutton.SaveAnimator.PopoutAnimationOnCompleteListener"
            X.0qQ.A0C(r2, r3)
            X.2Zb r2 = (X.C70952Zb) r2
            X.30h r3 = new X.30h
            r3.<init>(r0, r8, r2)
        L_0x0627:
            X.3on r3 = (X.C252243on) r3
            boolean r2 = X.C54965HZv.A00(r9)
            if (r2 == 0) goto L_0x08d6
            X.IRS r2 = new X.IRS
            r2.<init>(r9, r8, r10)
        L_0x0634:
            X.2pm r2 = (X.C230532pm) r2
            X.30c r22 = new X.30c
            r33 = r22
            r34 = r0
            r35 = r2
            r36 = r8
            r37 = r10
            r38 = r5
            r33.<init>(r34, r35, r36, r37, r38)
            X.30e r13 = new X.30e
            r13.<init>(r9)
            X.2xI r2 = new X.2xI
            r2.<init>(r9, r13)
            android.content.Context r33 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r34 = r0.requireActivity()
            r35 = r0
            r36 = r9
            r37 = r26
            r38 = r8
            r39 = r12
            r40 = r47
            r41 = r6
            r42 = r19
            r43 = r15
            r44 = r0
            r45 = r19
            r46 = r11
            X.30S r64 = X.GU3.A00(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.30i r3 = (X.C2355630i) r3
            X.0Pk r13 = X.0Pl.A0n
            android.content.Context r11 = r0.requireContext()
            X.0Pl r62 = r13.A00(r11, r9)
            X.HAh r11 = new X.HAh
            r47 = r11
            r48 = r29
            r49 = r0
            r50 = r24
            r51 = r9
            r52 = r26
            r53 = r23
            r54 = r10
            r55 = r14
            r57 = r22
            r58 = r8
            r59 = r28
            r60 = r12
            r61 = r2
            r63 = r6
            r65 = r15
            r66 = r3
            r68 = r7
            r69 = r0
            r72 = r25
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            X.32x r8 = new X.32x
            r13 = r29
            r9 = r32
            r8.<init>(r0, r13, r10, r9)
            r8.A0G = r6
            r8.A0K = r15
            r6 = r22
            r8.A08 = r6
            r6 = r27
            r8.A0Y = r6
            r8.A0R = r0
            r6 = r28
            r8.A0C = r6
            r8.A0Q = r7
            r8.A0A = r11
            r8.A0E = r2
            r8.A0N = r3
            r8.A05 = r14
            r2 = 23605317(0x1683045, float:4.2646302E-38)
            r8.A00 = r2
            r8.A0D = r12
            X.332 r2 = r8.A00()
            java.lang.String r3 = r0.A0o
            if (r3 == 0) goto L_0x0711
            android.content.Context r23 = r0.requireContext()
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r73)
            java.lang.Integer r6 = r1.A04
            java.lang.String r1 = r0.A0l
            if (r1 == 0) goto L_0x0950
            X.GMC r7 = new X.GMC
            r22 = r7
            r24 = r0
            r26 = r10
            r27 = r19
            r28 = r6
            r29 = r3
            r31 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.GTv r1 = r0.A05()
            X.GTW r1 = r1.A0L
            r1.EBt(r7)
            r0.registerLifecycleListener(r7)
            r0.A0B = r7
        L_0x0711:
            X.GTv r1 = r0.A05()
            X.0qQ.A0B(r2, r5)
            X.GTW r1 = r1.A0L
            r1.EBt(r2)
            X.GTv r1 = r0.A05()
            X.3je r3 = r0.A11
            X.0qQ.A0B(r3, r5)
            X.GTW r1 = r1.A0L
            r1.EBt(r3)
            X.36s r3 = r0.A0f
            if (r3 == 0) goto L_0x0738
            X.GTv r1 = r0.A05()
            X.GTW r1 = r1.A0L
            r1.EBt(r3)
        L_0x0738:
            r0.registerLifecycleListener(r2)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r73)
            java.lang.String r2 = r0.A0J
            if (r2 == 0) goto L_0x0964
            X.34R r8 = new X.34R
            r1 = r19
            r8.<init>(r3, r1, r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r73)
            java.lang.String r1 = r0.A0J
            if (r1 == 0) goto L_0x0964
            X.34L r7 = new X.34L
            r7.<init>(r2, r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.1wY r3 = X.1wY.A00(r1)
            java.lang.String r2 = r0.A0J
            if (r2 == 0) goto L_0x0964
            java.lang.Integer r1 = X.1wY.A0F
            X.0qQ.A08(r1)
            r6 = -1
            r3.A07(r7, r8, r2)
            X.GTv r7 = r0.A05()
            X.3E5 r1 = X.AnonymousClass3E4.A01(r7, r5, r5)
            r7.A01 = r1
            X.4DH r9 = r7.A0E
            android.content.Context r3 = r7.A09
            com.instagram.common.session.UserSession r8 = r7.A0H
            X.Wfd r2 = new X.Wfd
            r2.<init>(r7, r5)
            X.7Q8 r1 = new X.7Q8
            r1.<init>(r3, r8, r2)
            r9.registerLifecycleListener(r1)
            X.GTW r2 = r7.A0L
            X.2js r1 = r7.A0F
            r2.EBt(r1)
            X.1GX r1 = r7.A0N
            r2.EBt(r1)
            X.4DU r1 = r7.A0M
            X.2wt r3 = new X.2wt
            r3.<init>(r9, r8, r1)
            java.lang.String r1 = r7.A0P
            r3.A05 = r1
            X.GUc r1 = r7.A00()
            r3.A00 = r1
            X.ISl r2 = new X.ISl
            r2.<init>(r7, r5)
            X.36D r1 = new X.36D
            r1.<init>(r8, r2, r5, r5)
            r7.A04 = r1
            r9.registerLifecycleListener(r1)
            r9.registerLifecycleListener(r3)
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r8)
            java.lang.Class<X.3DT> r2 = X.AnonymousClass3DT.class
            X.IO4 r1 = r7.A0D
            r3.A01(r1, r2)
            java.lang.Class<X.INf> r2 = X.C57065INf.class
            X.IO4 r1 = r7.A0C
            r3.A01(r1, r2)
            java.lang.Class<X.INT> r2 = X.INT.class
            X.IO4 r1 = r7.A0B
            r3.A01(r1, r2)
            java.lang.Class<X.3DS> r2 = X.AnonymousClass3DS.class
            X.IO4 r1 = r7.A0A
            r3.A01(r1, r2)
            java.lang.Class<X.36g> r2 = X.C2370836g.class
            X.1wn r1 = r7.A0G
            r3.A01(r1, r2)
            java.lang.String r2 = r0.A0J
            if (r2 == 0) goto L_0x0964
            java.lang.String r1 = "feed_contextual_chain"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x07ff
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.GTq r3 = X.GM4.A00(r1)
            X.0JR r1 = r3.A08
            long r1 = r1.now()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A04 = r1
        L_0x07ff:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.1E8 r2 = X.1E7.A00(r1)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r1 = r0.A09
            if (r1 == 0) goto L_0x0a06
            java.lang.String r1 = r1.A0E
            X.1Xj r5 = r2.A02(r1)
            if (r5 == 0) goto L_0x0852
            boolean r1 = r0.A0P
            if (r1 != 0) goto L_0x081e
            r8.add(r5)
        L_0x081e:
            boolean r1 = r0.A0M
            if (r1 != 0) goto L_0x0826
            boolean r1 = r0.A0L
            if (r1 == 0) goto L_0x0837
        L_0x0826:
            java.lang.String r2 = r0.A0I
            if (r2 == 0) goto L_0x0837
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.1Xj r1 = X.DbV.A0U(r1, r2)
            if (r1 == 0) goto L_0x0837
            r8.add(r1)
        L_0x0837:
            boolean r1 = r5.A4R()
            if (r1 == 0) goto L_0x0852
            java.lang.String r7 = r5.A30()
            if (r7 == 0) goto L_0x0a01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r73)
            java.lang.String r2 = "explore"
            r1 = r19
            X.1OC r1 = X.C3724090s.A05(r3, r7, r2, r1)
            X.1ES.A03(r1)
        L_0x0852:
            X.GMC r1 = r0.A0B
            if (r1 == 0) goto L_0x0859
            r1.A02(r5)
        L_0x0859:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r73)
            X.GXc r9 = X.C52550GXb.A00(r1)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r1 = r0.A09
            if (r1 == 0) goto L_0x0a06
            java.lang.String r7 = r1.A0E
            java.util.Map r2 = r9.A00
            boolean r1 = r2.containsKey(r7)
            if (r1 == 0) goto L_0x08d4
            X.Dbx r1 = r0.A05
            if (r1 == 0) goto L_0x087a
            X.34p r1 = r1.A00
            if (r1 == 0) goto L_0x087a
            r1.A02()
        L_0x087a:
            java.lang.Object r1 = r2.get(r7)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0885
            r8.addAll(r1)
        L_0x0885:
            r3 = 0
            java.util.concurrent.ConcurrentMap r1 = r9.A02
            r1.get(r7)
        L_0x088b:
            X.GTv r7 = r0.A05()
            X.GUc r2 = r7.A00()
            X.2rX r1 = r2.A00
            X.IWI r1 = (X.IWI) r1
            r1.A03(r8)
            X.C52476GUc.A00(r2)
            r7.A07 = r3
            if (r3 == 0) goto L_0x09d5
            com.instagram.common.session.UserSession r3 = r7.A0H
            r1 = 36317964282173136(0x8106ff000116d0, double:3.0309650805258044E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            X.HrC r8 = r7.A0I
            X.GUc r4 = r7.A00()
            if (r1 == 0) goto L_0x09b1
            X.JQF r3 = r8.A06
            java.lang.Class r2 = r3.getClass()
            java.lang.Class<X.IR9> r1 = X.IR9.class
            if (r2 == r1) goto L_0x09b1
            X.1FZ r3 = r3.C1c(r4)
            java.util.HashMap r1 = r8.A09
            if (r1 == 0) goto L_0x09b5
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r1)
        L_0x08ca:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x09b5
            X.C51974G9v.A1C(r3, r2)
            goto L_0x08ca
        L_0x08d4:
            r3 = 1
            goto L_0x088b
        L_0x08d6:
            X.2pq r2 = new X.2pq
            r2.<init>((com.instagram.common.session.UserSession) r9, (X.AnonymousClass4DU) r8, (X.C228402lc) r10, (X.C249763kK) r0)
            goto L_0x0634
        L_0x08dd:
            X.H5O r3 = new X.H5O
            r3.<init>()
            goto L_0x0627
        L_0x08e4:
            java.lang.String r17 = "videoFeedModule"
            goto L_0x0357
        L_0x08e8:
            X.0qQ.A0F(r22)
            goto L_0x035a
        L_0x08ed:
            X.0qQ.A0F(r23)
            goto L_0x035a
        L_0x08f2:
            X.0qQ.A0F(r31)
            goto L_0x035a
        L_0x08f7:
            boolean r3 = r2.A0K
            if (r3 == 0) goto L_0x0944
            com.instagram.videofeed.intf.VideoFeedType r3 = r2.A02
            r3.getClass()
            int r7 = r3.ordinal()
            r3 = 1
            if (r7 == r3) goto L_0x092f
            if (r7 == r5) goto L_0x0920
            r3 = r18
            if (r7 == r3) goto L_0x0920
            r3 = 4
            if (r7 == r3) goto L_0x0920
            r3 = 3
            if (r7 == r3) goto L_0x0920
            java.lang.String r1 = "Invalid VideoFeedType: "
            com.instagram.videofeed.intf.VideoFeedType r0 = r2.A02
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r1, r0)
            throw r0
        L_0x0920:
            X.IR9 r31 = new X.IR9
            r34 = r2
            r35 = r0
            r36 = r67
            r37 = r6
            r31.<init>(r32, r33, r34, r35, r36, r37)
            goto L_0x02b4
        L_0x092f:
            java.lang.String r40 = "explore_auto_play"
            X.IRA r31 = new X.IRA
            r34 = r2
            r35 = r10
            r36 = r0
            r37 = r67
            r38 = r30
            r39 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x02b4
        L_0x0944:
            java.lang.String r3 = r2.A0C
            if (r3 == 0) goto L_0x094c
            java.lang.String r40 = "interest_grid"
            goto L_0x02a3
        L_0x094c:
            java.lang.String r40 = "explore_media_grid"
            goto L_0x02a3
        L_0x0950:
            X.0qQ.A0F(r20)
            goto L_0x035a
        L_0x0955:
            X.0qQ.A0F(r24)
            goto L_0x035a
        L_0x095a:
            X.0qQ.A0F(r25)
            goto L_0x035a
        L_0x095f:
            X.0qQ.A0F(r12)
            goto L_0x035a
        L_0x0964:
            X.0qQ.A0F(r21)
            goto L_0x035a
        L_0x0969:
            r2 = 0
            goto L_0x00c6
        L_0x096d:
            java.lang.String r2 = "nudge_chaining"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = "feed_recommendation_chain"
            goto L_0x0085
        L_0x0979:
            r2 = 140(0x8c, float:1.96E-43)
            java.lang.String r2 = X.C273654mx.A00(r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = "feed_contextual_direct_chain"
            goto L_0x0085
        L_0x0989:
            java.lang.String r2 = "interest_explore"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = "explore_interest_feed"
            goto L_0x0085
        L_0x0995:
            r2 = 3398(0xd46, float:4.762E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = "feed_interest_pivot_chain"
            goto L_0x0085
        L_0x09a5:
            java.lang.String r2 = "direct_feed_reshare_chaining"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = "feed_contextual_direct_feed_reshare_chain"
            goto L_0x0085
        L_0x09b1:
            r8.A00(r4)
            goto L_0x09d5
        L_0x09b5:
            X.6z9 r7 = r8.A07
            X.6zA r1 = r7.A03
            java.lang.String r2 = r1.A07
            if (r2 == 0) goto L_0x09c2
            java.lang.String r1 = "max_id"
            r3.A9m(r1, r2)
        L_0x09c2:
            X.1GP r4 = r3.A0M()
            X.JQp r3 = r8.A01
            r3.getClass()
            X.HAu r2 = new X.HAu
            r1 = r18
            r2.<init>(r1, r8, r3)
            r7.A04(r4, r2)
        L_0x09d5:
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r1 = r0.A09
            if (r1 == 0) goto L_0x0a06
            java.lang.Integer r2 = r1.A04
            if (r5 == 0) goto L_0x09f8
            boolean r1 = r5.A5D()
            if (r1 == 0) goto L_0x09f8
            if (r2 == 0) goto L_0x09f8
            int r1 = r2.intValue()
            if (r1 == 0) goto L_0x09f8
            if (r1 == r6) goto L_0x09f8
            X.GUc r0 = X.C51968G9o.A0k(r0)
            X.3W1 r0 = r0.BQr(r5)
            r0.A0A(r1)
        L_0x09f8:
            r1 = 973590398(0x3a07cf7e, float:5.18076E-4)
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x0a01:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a06:
            X.0qQ.A0F(r17)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52477GUf.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-149560704);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_context_feed_rv, false);
        A05().A00 = A00(this);
        AnonymousClass0fD.A09(1283282232, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1612998051);
        super.onDestroy();
        C52469GTv A052 = A05();
        UserSession userSession = A052.A0H;
        C55171HdN.A00(userSession).A00.clear();
        A052.A0L.A01.A00();
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        A002.A02(A052.A0D, AnonymousClass3DT.class);
        A002.A02(A052.A0C, C57065INf.class);
        A002.A02(A052.A0B, INT.class);
        A002.A02(A052.A0A, AnonymousClass3DS.class);
        A002.A02(A052.A0G, C2370836g.class);
        1wY A003 = 1wY.A00(AnonymousClass7TE.A0l(this.A0y));
        String str = this.A0J;
        String str2 = "discoveryChainingModuleName";
        if (str != null) {
            A003.A08(str);
            GMC gmc = this.A0B;
            if (gmc != null) {
                unregisterLifecycleListener(gmc);
            }
            C229332nD r0 = this.A0e;
            if (r0 != null) {
                unregisterLifecycleListener(r0);
            }
            C233812wV r02 = this.A0F;
            if (r02 != null) {
                r02.A0B();
            }
            String str3 = this.A0J;
            if (str3 != null) {
                A02(this, str3);
                HCA hca = this.A0j;
                if (hca != null) {
                    this.mLifecycleRegistry.A0A(hca);
                }
                C232692uG r03 = this.A0d;
                if (r03 != null) {
                    unregisterLifecycleListener(r03);
                }
                HBA hba = this.A07;
                if (hba == null) {
                    str2 = "feedMediaLoadingTracker";
                } else {
                    unregisterLifecycleListener(hba);
                    AnonymousClass0fD.A09(-692814202, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(1959752715);
        C52469GTv A052 = A05();
        C238133Ar scrollingViewProxy = ((AnonymousClass4DV) A052.A0E).getScrollingViewProxy();
        if (scrollingViewProxy != null) {
            C52761GcE gcE = A052.A02;
            if (!scrollingViewProxy.CWN() && gcE != null) {
                C238123Aq r1 = (C238123Aq) scrollingViewProxy;
                AnonymousClass2xS r0 = A052.A05;
                if (r0 != null) {
                    gcE.A07(r0, r1);
                } else {
                    str = "videoFeedModule";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            scrollingViewProxy.ENw((C231272rL) null);
            scrollingViewProxy.AHq();
        }
        F5p.A01(A052.A0H, A052.A0M.getModuleName(), true);
        super.onDestroyView();
        this.A0C = null;
        I4C i4c = this.A08;
        if (i4c == null) {
            str = "chainingLogger";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        i4c.A01 = null;
        A05().A00 = null;
        this.A0V = null;
        AnonymousClass0fD.A09(-426574799, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1391858392);
        C52477GUf.super.onPause();
        C52469GTv A052 = A05();
        A052.A0F.A09(((AnonymousClass4DV) A052.A0E).getScrollingViewProxy());
        C52761GcE gcE = A052.A02;
        if (gcE != null) {
            C52761GcE.A00(gcE);
        }
        AnonymousClass3E6 r1 = A052.A01;
        if (r1 != null) {
            r1.EEH(A052.A0K);
        }
        String str = this.A0J;
        if (str == null) {
            0qQ.A0F("discoveryChainingModuleName");
            throw AnonymousClass00P.createAndThrow();
        }
        A02(this, str);
        1wY.A00(AnonymousClass7TE.A0l(this.A0y));
        11Z.A00();
        11Z.A00();
        AnonymousClass0fD.A09(863440980, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.GyF} */
    /* JADX WARNING: type inference failed for: r9v1, types: [X.3Jo] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r14 = this;
            r0 = -1046609977(0xffffffffc19dffc7, float:-19.749891)
            int r3 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.GTv r2 = r14.A05()
            X.4DH r0 = r2.A0E
            androidx.fragment.app.FragmentActivity r5 = r0.getActivity()
            com.instagram.common.session.UserSession r1 = r2.A0H
            X.4DU r4 = r2.A0M
            java.lang.String r0 = r4.getModuleName()
            java.util.List r10 = X.F5p.A00(r1, r0)
            X.2dY r0 = X.2dZ.A0t
            X.2dZ r7 = r0.A03(r5)
            X.GcE r6 = r2.A02
            X.2js r8 = r2.A0F
            int r0 = r2.A08
            float r12 = (float) r0
            if (r6 == 0) goto L_0x0073
            com.instagram.common.session.UserSession r1 = r6.A07
            java.lang.String r0 = r6.A08
            X.GyF r9 = new X.GyF
            r9.<init>(r1, r0)
        L_0x0038:
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0070
            android.view.ViewGroup r0 = r7.A0O
        L_0x003e:
            java.util.List r11 = X.AnonymousClass7TE.A1I(r0)
            r13 = 1
            r8.A05(r9, r10, r11, r12, r13)
            if (r5 == 0) goto L_0x0059
            X.1OP r0 = X.1OP.$redex_init_class
            X.3K2 r1 = X.AnonymousClass3K2.A04(r5)
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.A0Z()
            if (r0 != r13) goto L_0x0059
            r1.A0X(r4)
        L_0x0059:
            X.3E6 r1 = r2.A01
            if (r1 == 0) goto L_0x0062
            X.2oD r0 = r2.A0K
            r1.A9Y(r0)
        L_0x0062:
            java.lang.String r1 = r14.A0J
            if (r1 != 0) goto L_0x0079
            java.lang.String r0 = "discoveryChainingModuleName"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0070:
            android.view.ViewGroup r0 = r7.A0P
            goto L_0x003e
        L_0x0073:
            X.3Jn r9 = new X.3Jn
            r9.<init>()
            goto L_0x0038
        L_0x0079:
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0097
            X.0eM r0 = r14.A0y
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.GTq r2 = X.GM4.A00(r0)
            X.0JR r0 = r2.A08
            long r0 = r0.now()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
        L_0x0097:
            X.0eM r0 = r14.A0y
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1wY.A00(r0)
            r14.requireContext()
            X.11Z.A00()
            X.11Z.A00()
            r0 = -253986105(0xfffffffff0dc7ac7, float:-5.4588105E29)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52477GUf.onResume():void");
    }

    public final void onStart() {
        String str;
        int A022 = AnonymousClass0fD.A02(1552805072);
        C52477GUf.super.onStart();
        C52469GTv A052 = A05();
        FragmentActivity activity = A052.A0E.getActivity();
        AnonymousClass3E6 r0 = A052.A01;
        if (!(r0 == null || activity == null)) {
            r0.DmJ(activity);
        }
        I4C i4c = this.A08;
        if (i4c == null) {
            0qQ.A0F("chainingLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        i4c.A00 = i4c.A05.now();
        i4c.A02 = false;
        if (i4c.A01 != null) {
            int A002 = I4C.A00(i4c);
            Adapter adapter = i4c.A04;
            if (A002 >= adapter.getCount() || (str = C51971G9r.A0s(C231122qu.A04(adapter.getItem(A002)))) == null) {
                str = i4c.A0A;
            }
            UserSession userSession = i4c.A08;
            AnonymousClass0iw r02 = i4c.A06;
            String str2 = i4c.A0B;
            String str3 = i4c.A0A;
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r02, userSession), "chaining_feed_session_start");
            C51965G9l.A1I(A0e2, str);
            A0e2.AAJ("parent_m_pk", str3);
            C51965G9l.A1R(A0e2, str2);
            A0e2.Cgf();
        }
        AnonymousClass0fD.A09(-728050789, A022);
    }

    public final void onStop() {
        String str;
        0Aj A0e2;
        int A022 = AnonymousClass0fD.A02(-368454017);
        C52477GUf.super.onStop();
        AnonymousClass3E6 r0 = A05().A01;
        if (r0 != null) {
            r0.onStop();
        }
        I4C i4c = this.A08;
        if (i4c == null) {
            0qQ.A0F("chainingLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z = this.A0t;
        String str2 = this.A0m;
        long j = this.A0U;
        C238133Ar r1 = i4c.A01;
        if (r1 != null && r1.BLQ() >= 0) {
            int A002 = I4C.A00(i4c);
            Adapter adapter = i4c.A04;
            if (A002 >= adapter.getCount() || (str = C51971G9r.A0s(C231122qu.A04(adapter.getItem(A002)))) == null) {
                str = i4c.A0A;
                A002 = 0;
            }
            UserSession userSession = i4c.A08;
            AnonymousClass0iw r9 = i4c.A06;
            String str3 = i4c.A0B;
            if (z) {
                String str4 = i4c.A0A;
                int A012 = I4C.A01(i4c, A002);
                A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), "chaining_feed_session_summary");
                C51965G9l.A1R(A0e2, str3);
                A0e2.AAJ("parent_m_pk", str4);
                A0e2.A8D("time_spent", Double.valueOf((double) (i4c.A05.now() - i4c.A00)));
                C51971G9r.A17(A0e2, A012);
                C51965G9l.A1I(A0e2, str);
                A0e2.AAJ("nudge_name", str2);
                A0e2.A9F("nudge_position", Long.valueOf(j));
            } else {
                String str5 = i4c.A0A;
                int A013 = I4C.A01(i4c, A002);
                A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), "chaining_feed_session_summary");
                C51965G9l.A1R(A0e2, str3);
                A0e2.AAJ("parent_m_pk", str5);
                A0e2.A8D("time_spent", Double.valueOf((double) (i4c.A05.now() - i4c.A00)));
                C51971G9r.A17(A0e2, A013);
                C51965G9l.A1I(A0e2, str);
            }
            A0e2.Cgf();
        }
        AnonymousClass0fD.A09(-1479833655, A022);
    }
}
