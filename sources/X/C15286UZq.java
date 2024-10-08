package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.UZq  reason: case insensitive filesystem */
public abstract class C15286UZq extends AnonymousClass4DH implements AnonymousClass0iw, C249763kK, AnonymousClass4DV, C232682uF, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BaseSerpGridFragment";
    public int A00;
    public int A01;
    public 0wc A02;
    public C59630JQy A03;
    public GXC A04;
    public IY3 A05;
    public C14074TpO A06;
    public X9Q A07;
    public X9Q A08;
    public C232692uG A09;
    public AnonymousClass4O6 A0A;
    public C14379Tv8 A0B;
    public C55868Hop A0C;
    public C18611Vv4 A0D;
    public C14140Tqa A0E;
    public C15940UlA A0F;
    public C67408MnP A0G;
    public C56001Hr7 A0H;
    public C56001Hr7 A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public C52572GXx A0S;
    public C358448av A0T;
    public C358448av A0U;
    public C233812wV A0V;
    public boolean A0W;
    public final C20900X3r A0X;
    public final X8Q A0Y;
    public final C21052XBu A0Z;
    public final X47 A0a;
    public final X47 A0b;
    public final X47 A0c;
    public final X47 A0d;
    public final X47 A0e;
    public final G7A A0f;
    public final C20912X4d A0g;
    public final C17960Vit A0h;
    public final C56023HrV A0i;
    public final G6V A0j;
    public final AnonymousClass32Q A0k;
    public final String A0l = "android.permission.ACCESS_FINE_LOCATION";
    public final AnonymousClass0eM A0m = C227642jf.A02(this);
    public final 1wn A0n;
    public final 1wn A0o;
    public final 1wn A0p;
    public final C289875eN A0q;
    public final C229122ms A0r;
    public final AnonymousClass0eM A0s;

    public static final void A00(C70826OMy oMy, C15286UZq uZq, String str) {
        String A0j2 = AnonymousClass7TG.A0j();
        C15286UZq uZq2 = uZq;
        C324636ze.A00(AnonymousClass7TE.A0l(uZq2.A0m)).A00 = new SearchContext(C13988Tno.A0a(uZq2), C13988Tno.A0Y(uZq2), C13988Tno.A0X(uZq2), (String) null, C13988Tno.A0Z(uZq2), A0j2, (String) null, (String) null);
        C358448av r9 = uZq2.A0U;
        if (r9 == null) {
            0qQ.A0F("serpLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C70826OMy oMy2 = oMy;
        String A0t = DbS.A0t(oMy2.A0A);
        if (A0t == null) {
            A0t = "";
        }
        r9.CiE(OVV.A00((Integer) null, (String) null, A0t, DbS.A0t(oMy2.A0B), (String) null, "server"), uZq2.A05().E51(), C13988Tno.A0X(uZq2), C13988Tno.A0Y(uZq2), (String) null, str, A0j2, 0);
    }

    public final void A0A(C296995qz r11, C296935qt r12, 1Xj r13) {
        0jB E4l = E4l(r13);
        C18244VoB.A01(E4l, r12);
        0xI A002 = VBN.A00(this, E4l.A00(), r13, C13988Tno.A0Z(this), r11.A01, r11.A00);
        A002.A07(C297705sC.A03, A06().A0E);
        A002.A07(C297705sC.A04, C13988Tno.A0X(this));
        A002.A0C("serp_session_id", C13988Tno.A0Z(this));
        A002.A0C("source", A06().A0M);
        if (r13.BR7() == 1iA.A09) {
            Long A062 = C254443sU.A06(r13, 0);
            if (A062 != null) {
                A002.A0B("carousel_index", A062);
            }
            String A0G2 = C254443sU.A0G(r13, 0);
            if (A0G2 != null) {
                A002.A0C("carousel_media_id", A0G2);
            }
            String A0G3 = C254443sU.A0G(r13, 0);
            String A003 = C273654mx.A00(607);
            if (A0G3 != null) {
                A002.A0C(A003, A0G3);
            }
            Long A072 = C254443sU.A07(r13, 0);
            if (A072 != null) {
                A002.A0B("carousel_m_t", A072);
            }
            Long A082 = C254443sU.A08(r13, 0);
            String A004 = C273654mx.A00(2144);
            if (A082 != null) {
                A002.A0B(A004, A082);
            }
        }
        DbU.A1R(A002, AnonymousClass7TE.A0l(this.A0m));
    }

    public final 0jB E4l(1Xj r3) {
        0qQ.A0B(r3, 0);
        r3.A0C.Ehi(C13988Tno.A0Y(this));
        return E4k();
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            C358448av r0 = this.A0U;
            if (r0 == null) {
                0qQ.A0F("serpLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            r0.CkQ();
            if (A06().A0T) {
                String A0a2 = C13988Tno.A0a(this);
                UserSession A0l2 = AnonymousClass7TE.A0l(this.A0m);
                String str = A06().A0G;
                String str2 = A06().A0H;
                String str3 = A06().A0I;
                0qQ.A0B(A0l2, 2);
                C14443TwR twR = new C14443TwR(this, A0l2, (C14444TwS) null, A0a2, str, str2, str3);
                this.A0T = twR;
                twR.CkQ();
            }
            C67757MuC A072 = A07();
            C13989Tnp.A1S(A072, C318116oQ.A00(A072), 10);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14074TpO tpO = this.A06;
        String str = "grid";
        if (tpO != null) {
            tpO.A05(view, this.A0r.isLoading());
            tpO.A06(new WWL(this, 3));
            C67408MnP mnP = this.A0G;
            if (mnP == null) {
                str = "viewpointDelegate";
            } else {
                DiscoveryRecyclerView discoveryRecyclerView = tpO.A04;
                C14450TwY twY = A06().A0C;
                if (twY != null) {
                    mnP.A01(discoveryRecyclerView, this, twY);
                    DiscoveryRecyclerView discoveryRecyclerView2 = tpO.A04;
                    if (discoveryRecyclerView2 != null) {
                        discoveryRecyclerView2.setItemAnimator((AnonymousClass3AS) null);
                    }
                    C67757MuC A072 = A07();
                    DbV.A1F(getViewLifecycleOwner(), A072.A05, new C20705Wxc(this, 4), 40);
                    DbV.A1F(getViewLifecycleOwner(), A072.A03, new C20705Wxc(this, 5), 40);
                    DbV.A1F(getViewLifecycleOwner(), A072.A07, C20750WyN.A00, 40);
                    DbV.A1F(getViewLifecycleOwner(), A072.A06, C20751WyO.A00, 40);
                    if (this instanceof C16207UqW) {
                        C13989Tnp.A1S(this, DbV.A0J(this), 8);
                    }
                    C13989Tnp.A1S(this, DbV.A0J(this), 9);
                    if (C13989Tnp.A1Y(this)) {
                        C227762js A012 = A06().A01();
                        C14074TpO tpO2 = this.A06;
                        if (tpO2 != null) {
                            A012.A06(tpO2.A0B, tpO2.A06, this.A0R);
                        }
                    }
                    1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0m));
                    A002.A01(this.A0o, C57066INg.class);
                    A002.A01(this.A0p, C2370836g.class);
                    A002.A01(this.A0n, C2370536d.class);
                    return;
                }
                str = "keyboardHeightDetectorCache";
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(N3M n3m, C15286UZq uZq, String str, boolean z) {
        String str2;
        List list;
        X9z x9z;
        String str3;
        if (0qQ.A0K(str, "tap_action_talk_to_friend")) {
            1pC A002 = C69997Nvb.A00();
            FragmentActivity requireActivity = uZq.requireActivity();
            uZq.A04();
            A002.A00(requireActivity, (AnonymousClass0iw) null, "all");
        } else if (0qQ.A0K(str, "tap_action_place_voice_call")) {
            if (n3m == null) {
                throw new IllegalStateException("inform message must not be null for voice call action");
            } else if (z && (list = n3m.A0B) != null && (x9z = (X9z) AnonymousClass7TE.A13(list)) != null && (str3 = ((UNP) x9z).A02) != null) {
                0b6.A00().A04().A0G(uZq.requireContext(), new Intent(C66579MXk.A00(10)).setData(0cp.A03(002.A0R("tel:", str3))));
            }
        } else if (0qQ.A0K(str, "tap_action_contact_helpline") || 0qQ.A0K(str, "tap_action_contact_helpline_ed") || 0qQ.A0K(str, "tap_action_ed_resources") || 0qQ.A0K(str, "tap_action_helpful_resources")) {
            UserSession A0l2 = AnonymousClass7TE.A0l(uZq.A0m);
            FragmentActivity requireActivity2 = uZq.requireActivity();
            Integer num = AnonymousClass05K.A00;
            if (!0qQ.A0K(str, "tap_action_contact_helpline")) {
                num = AnonymousClass05K.A01;
                if (!0qQ.A0K(str, "tap_action_contact_helpline_ed")) {
                    num = AnonymousClass05K.A0N;
                    if (0qQ.A0K(str, "tap_action_helpful_resources")) {
                        num = AnonymousClass05K.A0C;
                    } else if (!0qQ.A0K(str, "tap_action_ed_resources")) {
                        throw new IllegalStateException("action key must map to a URL");
                    }
                }
            }
            switch (num.intValue()) {
                case 0:
                    str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_contact_helpline&params=%7B%22resource_type%22%3A%22suicide_prevention_actor%22%7D";
                    break;
                case 1:
                    str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_contact_helpline&params=%7B%22resource_type%22%3A%22eating_disorders_actor%22%7D";
                    break;
                case 2:
                    str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ssi_ed_helpful_suggestion_resources";
                    break;
                default:
                    str2 = "instagram://bloks/?app_id=com.bloks.www.xmwb.ed_resources_controller";
                    break;
            }
            FFC.A01(requireActivity2, 0cp.A03(str2), A0l2, 1);
        } else if (str == null || str.length() == 0) {
            FragmentActivity requireActivity3 = uZq.requireActivity();
            AnonymousClass0eM r2 = uZq.A0m;
            C13990Tnq.A0y(requireActivity3, AnonymousClass7TE.A0l(r2));
            C309516Yo r4 = new C309516Yo(uZq.requireActivity(), AnonymousClass7TE.A0l(r2));
            r4.A0B = "search_result";
            C14398TvR.A00();
            new Object();
            uZq.A04();
            String A0a2 = C13988Tno.A0a(uZq);
            String A0Z2 = C13988Tno.A0Z(uZq);
            C14137TqX tqX = new C14137TqX();
            Bundle A003 = C14452Twa.A00(A0a2, "");
            A003.putString("argument_prior_serp_session_id", A0Z2);
            tqX.setArguments(A003);
            r4.A0B((Bundle) null, tqX);
            r4.A04();
        } else {
            0wc r0 = uZq.A02;
            if (r0 == null) {
                0qQ.A0F("typedLogger");
                throw AnonymousClass00P.createAndThrow();
            } else if (n3m != null) {
                1Ln A0G2 = 1Ln.A0G(r0);
                if (DbT.A1Y(A0G2)) {
                    C13989Tnp.A1J(A0G2, n3m, n3m.A05);
                    C13992Tns.A0n(A0G2, uZq);
                }
                FragmentActivity requireActivity4 = uZq.requireActivity();
                AnonymousClass0eM r22 = uZq.A0m;
                if (!FH7.A0B(requireActivity4, AnonymousClass7TE.A0l(r22), str, uZq.getModuleName())) {
                    FHB.A04(uZq.requireActivity(), AnonymousClass7TE.A0l(r22), 2EG.A3J, str, uZq.getModuleName());
                }
            } else {
                throw new IllegalStateException("informMessage required for non action key values");
            }
        }
    }

    public static final void A02(UO1 uo1, C15286UZq uZq, boolean z) {
        String str;
        boolean z2;
        QP5 qp5;
        int i = uo1.A00;
        String str2 = null;
        C55868Hop hop = uZq.A0C;
        if (i == 0) {
            if (hop != null) {
                0Aj A0e2 = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_donut_tap");
                if (A0e2.isSampled()) {
                    C51976G9y.A0Y(A0e2, hop, C66584MXp.A0T(A0e2, hop));
                    A0e2.Cgf();
                }
                str = "ig_search:serp_hcm_donut";
            }
            0qQ.A0F("serpMetaAiHcmLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        if (hop != null) {
            String str3 = uo1.A07;
            String str4 = uo1.A05;
            String str5 = uo1.A04;
            if (str5 == null) {
                str5 = "";
            }
            AnonymousClass7TG.A1O(str3, str4);
            0Aj A0e3 = AnonymousClass7TE.A0e(hop.A01, "ig_search_meta_ai_hcm_prompt_tap");
            if (A0e3.isSampled()) {
                C51976G9y.A0Y(A0e3, hop, C66584MXp.A0T(A0e3, hop));
                A0e3.A9F(C66579MXk.A00(1051), Long.valueOf((long) i));
                A0e3.AAJ(C66579MXk.A00(68), str3);
                A0e3.AAJ(AnonymousClass000.A00(355), str4);
                A0e3.AAJ("prompt_id", str5);
                A0e3.Cgf();
            }
            str = "ig_search:serp_hcm_pill";
        }
        0qQ.A0F("serpMetaAiHcmLogger");
        throw AnonymousClass00P.createAndThrow();
        String str6 = uZq.A0J;
        if (str6 == null || str6.length() == 0 || uo1.A06.length() > 0 || ((qp5 = uo1.A02) != null && !0qQ.A0K(str6, qp5.A02))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            C14437TwL A022 = uZq.A06().A02();
            String str7 = uo1.A06;
            A022.A0A(str, str7, str7, uo1.A04);
        } else {
            QP5 qp52 = uo1.A02;
            if (qp52 != null) {
                uZq.A06().A02().A04(uo1.A01, qp52, str, qp52.A03, uo1.A06, z2);
            }
        }
        QP5 qp53 = uo1.A02;
        if (qp53 != null) {
            str2 = qp53.A02;
        }
        uZq.A0J = str2;
    }

    public static final void A03(Keyword keyword, C15286UZq uZq) {
        AnonymousClass0eM r4 = uZq.A0m;
        UserSession A0l2 = AnonymousClass7TE.A0l(r4);
        if (!182.A06(AnonymousClass7TF.A0H(A0l2), A0l2, 36331033867600762L)) {
            C309516Yo A0Q2 = DbU.A0Q(uZq.requireActivity(), AnonymousClass7TE.A0l(r4));
            C14398TvR.A00();
            uZq.A04();
            A0Q2.A0B((Bundle) null, C14452Twa.A02(keyword, uZq.getModuleName(), C13988Tno.A0a(uZq), C13988Tno.A0X(uZq), (String) null));
            A0Q2.A04();
        }
    }

    public final UserSession A04() {
        return AnonymousClass7TE.A0l(this.A0m);
    }

    public final C20911X4c A05() {
        if (this instanceof C16206UqV) {
            return ((C16206UqV) this).A00;
        }
        if (this instanceof C16207UqW) {
            return ((C16207UqW) this).A00;
        }
        if (this instanceof C16203UqS) {
            return ((C16203UqS) this).A00;
        }
        if (this instanceof C16208UqX) {
            return ((C16208UqX) this).A00;
        }
        if (this instanceof C16205UqU) {
            return ((C16205UqU) this).A00;
        }
        if (this instanceof C16204UqT) {
            return ((C16204UqT) this).A00;
        }
        return ((C16209UqY) this).A02;
    }

    public final C15272UZa A06() {
        C15272UZa uZa = this.mParentFragment;
        0qQ.A0C(uZa, "null cannot be cast to non-null type com.instagram.search.surface.fragment.CompositeSerpTabbedFragment");
        return uZa;
    }

    public final C67757MuC A07() {
        return (C67757MuC) this.A0s.getValue();
    }

    public final String A08() {
        if (this instanceof C16206UqV) {
            return "user_serp";
        }
        if (this instanceof C16207UqW) {
            return "top_serp";
        }
        if (this instanceof C16203UqS) {
            return "audio_serp_page";
        }
        if (this instanceof C16208UqX) {
            return "popular_serp";
        }
        if (this instanceof C16205UqU) {
            return "places_serp";
        }
        if (this instanceof C16204UqT) {
            return "hashtag_serp";
        }
        return "clips_serp_page";
    }

    public final String A09() {
        if (this instanceof C16207UqW) {
            return "TOP";
        }
        if (this instanceof C16206UqV) {
            return "USER";
        }
        if (this instanceof C16203UqS) {
            return "AUDIO";
        }
        if (this instanceof C16208UqX) {
            return "POPULAR";
        }
        if (this instanceof C16205UqU) {
            return "PLACE";
        }
        if (this instanceof C16204UqT) {
            return "HASHTAG";
        }
        return "CLIPS";
    }

    public final 0jB E4k() {
        0jB r2 = new 0jB();
        r2.A04(C14073TpN.A02, C13988Tno.A0Z(this));
        r2.A04(C14073TpN.A00, C13988Tno.A0a(this));
        r2.A04(C14073TpN.A01, C13988Tno.A0Z(this));
        r2.A05(C297695sB.A01, C13988Tno.A0Y(this));
        r2.A05(C297695sB.A00, C13988Tno.A0X(this));
        r2.A0A("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", requireArguments().getString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"));
        return r2;
    }

    public final void beforeOnPause() {
        if (this.A0W && isMenuVisible()) {
            String A092 = A09();
            if (0qQ.A0K(A092, "TOP") || 0qQ.A0K(A092, "USER")) {
                C319996rZ.A00(AnonymousClass7TE.A0l(this.A0m)).A01(requireActivity());
            }
        }
    }

    public final C238133Ar getScrollingViewProxy() {
        C14074TpO tpO = this.A06;
        if (tpO != null) {
            return tpO.A06;
        }
        C13988Tno.A0n();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0m);
    }

    public final boolean isSponsoredEligible() {
        return 182.A06(0Tu.A05, AnonymousClass7TE.A0l(this.A0m), 36318780325960137L);
    }

    public final boolean onBackPressed() {
        C232692uG r0 = this.A09;
        if (r0 != null) {
            return r0.onBackPressed();
        }
        0qQ.A0F("previewMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    public C15286UZq() {
        C20608Wvp wvp = new C20608Wvp(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20608Wvp(new C20608Wvp(this, 46), 47));
        this.A0s = new C227862kA(new C20608Wvp(A002, 48), wvp, new C58691Iw0(41, (Object) null, A002), new 0Yh(C67757MuC.class));
        this.A0k = AnonymousClass32Q.A00;
        this.A0r = new PRL(this, 9);
        this.A0Z = new C19349WVq(this, 4);
        this.A0Y = new C19347WVo(this);
        this.A0X = new C19345WVm(this);
        this.A0g = new C19554Wbe(this);
        this.A0j = new C19707We9(this, 4);
        this.A0b = new C72688PFs(this, 5);
        this.A0a = new C72688PFs(this, 4);
        this.A0d = new C72688PFs(this, 7);
        this.A0e = new C72688PFs(this, 8);
        this.A0c = new C72688PFs(this, 6);
        this.A0o = new C19221WQb(this, 42);
        this.A0p = new C19221WQb(this, 43);
        this.A0n = new C19221WQb(this, 41);
        this.A0q = new C19360WWb(this, 3);
        this.A0f = new WZ6(this, 0);
        this.A0h = new C17960Vit(this);
        this.A0i = new C56023HrV(this);
    }

    public final String getSessionId() {
        return C13988Tno.A0Z(this);
    }

    /* JADX WARNING: type inference failed for: r33v6, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v25, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v68, types: [X.IY3, java.lang.Object, X.2uo] */
    /* JADX WARNING: type inference failed for: r6v11, types: [X.2mN, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0735, code lost:
        if (X.182.A06(r4, r7, 36312879042528622L) == false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x070b, code lost:
        if (X.182.A06(r4, r7, 36319772463668851L) == false) goto L_0x070d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0720, code lost:
        if (X.182.A06(r4, r7, 36312879042528622L) == false) goto L_0x0722;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0444  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r56) {
        /*
            r55 = this;
            r0 = 2018660466(0x78525072, float:1.7062718E34)
            int r16 = X.AnonymousClass0fD.A02(r0)
            r0 = r55
            X.0eM r1 = r0.A0m
            r54 = r1
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r22 = X.C13988Tno.A0a(r0)
            java.lang.String r23 = X.C13988Tno.A0Z(r0)
            java.lang.String r24 = X.C13988Tno.A0X(r0)
            X.UZa r1 = r0.A06()
            java.lang.String r7 = r1.A0G
            X.UZa r1 = r0.A06()
            java.lang.String r6 = r1.A0I
            X.UZa r1 = r0.A06()
            java.lang.String r4 = r1.A0M
            X.VOs r3 = new X.VOs
            r3.<init>(r0)
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER"
            java.lang.String r28 = r2.getString(r1)
            r5 = 1
            X.0qQ.A0B(r8, r5)
            boolean r2 = X.C253063q9.A02(r24)
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r2)
            X.WbL r2 = new X.WbL
            r18 = r0
            r19 = r8
            r20 = r3
            r25 = r7
            r26 = r6
            r27 = r4
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A0U = r2
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r10 = X.C13988Tno.A0a(r0)
            java.lang.String r11 = X.C13988Tno.A0Z(r0)
            java.lang.String r12 = X.C13988Tno.A0X(r0)
            r17 = 1
            X.TxI r3 = new X.TxI
            r3.<init>(r0, r5)
            X.OK9 r2 = new X.OK9
            r2.<init>(r0)
            X.0qQ.A0B(r4, r5)
            X.Hop r5 = new X.Hop
            r6 = r0
            r7 = r4
            r8 = r3
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.A0C = r5
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r54)
            X.0iw r4 = X.C14481Tx3.A01
            android.content.Context r2 = r0.requireContext()
            boolean r3 = X.0oI.A0A(r2)
            X.GXx r2 = new X.GXx
            r2.<init>(r4, r5, r3)
            r0.A0S = r2
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r5 = X.C13988Tno.A0a(r0)
            java.lang.String r6 = X.C13988Tno.A0Z(r0)
            java.lang.String r7 = X.C13988Tno.A0X(r0)
            java.lang.String r8 = r0.A09()
            X.Vv4 r3 = new X.Vv4
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0D = r3
            java.lang.String r2 = "SERP_TAB_OPEN"
            r9 = 0
            X.C18611Vv4.A00(r3, r2, r9)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r54)
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r2)
            r0.A02 = r2
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.4O6 r2 = new X.4O6
            r2.<init>(r0, r3)
            r0.A0A = r2
            r18 = 0
            X.2el r19 = X.C51969G9p.A0k()
            X.8av r6 = r0.A0U
            java.lang.String r13 = "serpLogger"
            if (r6 == 0) goto L_0x08c6
            X.GXx r5 = r0.A0S
            if (r5 != 0) goto L_0x00ee
            java.lang.String r29 = "threadsLogger"
        L_0x00e6:
            X.0qQ.A0F(r29)
        L_0x00e9:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x00ee:
            r2 = 4
            X.Tqs r4 = new X.Tqs
            r4.<init>(r0, r2)
            r20 = 2
            X.TxI r3 = new X.TxI
            r2 = r20
            r3.<init>(r0, r2)
            X.Tx2 r27 = X.C14480Tx2.A00
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r34 = X.C13988Tno.A0a(r0)
            X.X4c r40 = r0.A05()
            r21 = 0
            X.Hop r7 = r0.A0C
            if (r7 != 0) goto L_0x0114
            java.lang.String r29 = "serpMetaAiHcmLogger"
            goto L_0x00e6
        L_0x0114:
            X.Wba r33 = X.C19550Wba.A00
            X.MnP r2 = new X.MnP
            r22 = r2
            r23 = r0
            r25 = r19
            r26 = r5
            r28 = r6
            r29 = r7
            r30 = r3
            r31 = r4
            r32 = r40
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A0G = r2
            java.lang.String r23 = X.C13988Tno.A0a(r0)
            java.lang.String r24 = X.C13988Tno.A0Y(r0)
            java.lang.String r25 = X.C13988Tno.A0X(r0)
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r30 = r2.getString(r1)
            com.instagram.search.common.analytics.SearchContext r34 = new com.instagram.search.common.analytics.SearchContext
            r22 = r34
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r45 = X.C13988Tno.A0a(r0)
            java.lang.String r46 = X.C13988Tno.A0Z(r0)
            r1 = 5
            X.Tqs r12 = new X.Tqs
            r12.<init>(r0, r1)
            r28 = 3
            X.TxI r11 = new X.TxI
            r1 = r28
            r11.<init>(r0, r1)
            X.UZa r1 = r0.A06()
            X.TwL r42 = r1.A02()
            X.UZa r1 = r0.A06()
            X.TwK r10 = r1.A0A
            if (r10 == 0) goto L_0x08bf
            X.UZa r1 = r0.A06()
            X.Ja5 r43 = r1.A03()
            X.WW7 r31 = X.WW7.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r54)
            X.328 r1 = new X.328
            r1.<init>(r0)
            X.32A r8 = new X.32A
            r8.<init>(r0, r2, r1)
            X.8av r7 = r0.A0U
            if (r7 == 0) goto L_0x08c6
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r54)
            X.5js r6 = new X.5js
            r6.<init>(r0, r1)
            X.WbQ r5 = new X.WbQ
            r5.<init>(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r54)
            X.0Tu r3 = X.AnonymousClass7TF.A0H(r4)
            r1 = 36328340924742921(0x81106f00193d09, double:3.037527311070322E-306)
            boolean r51 = X.182.A06(r3, r4, r1)
            r27 = r0
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36328340924022014(0x81106f000e3cfe, double:3.037527310614418E-306)
            boolean r52 = X.182.A06(r4, r3, r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            r1 = 36328340924153088(0x81106f00103d00, double:3.0375273106973095E-306)
            boolean r53 = X.182.A06(r4, r3, r1)
            X.WbO r36 = X.C19538WbO.A00
            X.Tx6 r47 = X.C14484Tx6.A00
            X.Tx5 r48 = X.C14483Tx5.A00
            X.Tqa r1 = new X.Tqa
            r33 = r8
            r35 = r7
            r37 = r11
            r38 = r5
            r39 = r12
            r41 = r18
            r44 = r10
            r49 = r9
            r50 = r9
            r29 = r1
            r32 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0.A0E = r1
            android.content.Context r29 = r0.requireContext()
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r32 = X.C13988Tno.A0Z(r0)
            r33 = -1
            r31 = r0
            r35 = r9
            r36 = r17
            X.X9Q r1 = X.C16942VBu.A00(r29, r30, r31, r32, r33, r35, r36)
            r0.A08 = r1
            android.content.Context r29 = r0.requireContext()
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r32 = X.C13988Tno.A0Z(r0)
            r36 = r9
            X.X9Q r1 = X.C16942VBu.A00(r29, r30, r31, r32, r33, r35, r36)
            r0.A07 = r1
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r32 = X.C13988Tno.A0X(r0)
            r38 = 0
            com.instagram.model.keyword.Keyword r29 = new com.instagram.model.keyword.Keyword
            r30 = r18
            r31 = r18
            r33 = r18
            r34 = r18
            r35 = r18
            r36 = r18
            r37 = r18
            r40 = r9
            r41 = r9
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r41)
            java.lang.String r14 = X.AnonymousClass7TG.A0j()
            java.lang.String r15 = X.C13988Tno.A0a(r0)
            X.Tv8 r1 = new X.Tv8
            r11 = r0
            r13 = r29
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A0B = r1
            java.lang.String r15 = X.C13988Tno.A0a(r0)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r54)
            androidx.fragment.app.FragmentActivity r12 = r0.requireActivity()
            X.GXC r1 = new X.GXC
            r10 = r1
            r14 = r18
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A04 = r1
            X.TpP r22 = new X.TpP
            r22.<init>()
            X.MuC r2 = r0.A07()
            X.UlA r1 = new X.UlA
            r1.<init>(r2)
            r0.A0F = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r1, r9)
            boolean r1 = X.C13988Tno.A1Y(r1)
            r0.A0P = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            r1 = 36319055203801993(0x8107fd00001b89, double:3.0316549837566824E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            r0.A0Q = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r1, r9)
            boolean r1 = X.C13988Tno.A1Y(r1)
            r0.A01 = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            r1 = 36319738103668303(0x81089c00011e4f, double:3.032086852381954E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            r0.A0L = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            r1 = 36319738103733840(0x81089c00021e50, double:3.0320868524234E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            r0.A0K = r1
            android.content.Context r1 = r0.requireContext()
            int r2 = X.AnonymousClass3D4.A00(r1)
            android.content.Context r1 = r0.requireContext()
            int r1 = X.C66582MXn.A01(r1)
            int r2 = r2 + r1
            r0.A0R = r2
            X.X9Q r3 = r0.A08
            java.lang.String r29 = "videoPlayerManager"
            if (r3 == 0) goto L_0x00e6
            X.VOr r7 = new X.VOr
            r7.<init>(r0)
            X.UlC r2 = new X.UlC
            r1 = r28
            r2.<init>(r0, r1)
            X.WW5 r26 = new X.WW5
            r5 = r26
            r5.<init>(r0, r1)
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r54)
            X.X9Q r1 = r0.A07
            java.lang.String r25 = "hcmVideoPlayerManager"
            if (r1 == 0) goto L_0x055f
            X.WWz r6 = new X.WWz
            r30 = r6
            r31 = r0
            r33 = r5
            r34 = r1
            r35 = r0
            r36 = r7
            r30.<init>(r31, r32, r33, r34, r35, r36)
            X.Ttn r5 = new X.Ttn
            r5.<init>(r6)
            X.UZa r31 = r0.A06()
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r54)
            X.X9Q r7 = r0.A07
            if (r7 == 0) goto L_0x055f
            X.WWE r7 = (X.WWE) r7
            X.WET r1 = new X.WET
            r30 = r1
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r14
            r30.<init>(r31, r32, r33, r34, r35, r36)
            r0.A03 = r1
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r54)
            X.UlA r8 = r0.A0F
            java.lang.String r25 = "dataSource"
            if (r8 == 0) goto L_0x055f
            java.lang.String r41 = X.C13988Tno.A0Z(r0)
            boolean r7 = r0 instanceof X.C16209UqY
            if (r7 == 0) goto L_0x07ce
            r43 = 1
        L_0x0356:
            r1 = r20
            android.content.Context r30 = X.DbT.A06(r0, r10, r1)
            X.2s4 r33 = new X.2s4
            r33.<init>()
            r31 = r0
            r32 = r10
            r34 = r22
            r35 = r2
            r36 = r8
            r37 = r26
            r38 = r3
            r39 = r0
            r40 = r14
            r42 = r9
            X.2tC r1 = X.C14370Tuz.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.Tqa r3 = r0.A0E
            java.lang.String r24 = "delegate"
            if (r3 == 0) goto L_0x08ba
            X.MnH r2 = new X.MnH
            r2.<init>(r3)
            r1.A01(r2)
            X.XBu r10 = r0.A0Z
            X.X47 r8 = r0.A0b
            X.Tw5 r2 = new X.Tw5
            r2.<init>(r10, r8)
            r1.A01(r2)
            X.X8Q r3 = r0.A0Y
            X.UiR r2 = new X.UiR
            r2.<init>(r3, r8)
            r1.A01(r2)
            X.X3r r3 = r0.A0X
            X.Uj5 r2 = new X.Uj5
            r2.<init>(r3, r8)
            r1.A01(r2)
            X.X4d r3 = r0.A0g
            X.Tw3 r2 = new X.Tw3
            r2.<init>(r3)
            r1.A01(r2)
            X.Dh3 r2 = new X.Dh3
            r2.<init>()
            r1.A01(r2)
            X.Tw2 r2 = new X.Tw2
            r2.<init>(r10)
            r1.A01(r2)
            X.G6V r3 = r0.A0j
            X.Dh1 r2 = new X.Dh1
            r2.<init>(r3)
            r1.A01(r2)
            X.Tqa r10 = r0.A0E
            if (r10 == 0) goto L_0x08ba
            X.MnP r8 = r0.A0G
            java.lang.String r23 = "viewpointDelegate"
            if (r8 == 0) goto L_0x08c1
            boolean r3 = r0.A0P
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r54)
            X.Tw4 r2 = new X.Tw4
            r30 = r2
            r33 = r10
            r34 = r8
            r35 = r3
            r30.<init>(r31, r32, r33, r34, r35)
            r1.A01(r2)
            androidx.fragment.app.FragmentActivity r31 = r0.getActivity()
            com.instagram.common.session.UserSession r33 = X.AnonymousClass7TE.A0l(r54)
            X.Tqa r11 = r0.A0E
            if (r11 == 0) goto L_0x08ba
            X.MnP r10 = r0.A0G
            if (r10 == 0) goto L_0x08c1
            boolean r12 = r0.A0P
            java.lang.String r2 = r0.getModuleName()
            java.lang.String r8 = "serp_users"
            boolean r2 = X.0qQ.A0K(r2, r8)
            if (r2 == 0) goto L_0x07b3
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r54)
            r2 = 36326266453964449(0x810e8c000136a1, double:3.036215407396793E-306)
        L_0x0412:
            boolean r37 = X.182.A06(r4, r13, r2)
        L_0x0416:
            java.lang.String r3 = r0.getModuleName()
            java.lang.String r2 = "serp_non_profiled"
            boolean r43 = X.0qQ.A0K(r3, r2)
            X.MnG r2 = new X.MnG
            r30 = r2
            r32 = r0
            r34 = r11
            r35 = r10
            r36 = r14
            r38 = r9
            r39 = r12
            r40 = r17
            r41 = r9
            r42 = r17
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1.A01(r2)
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r54)
            X.Tqa r11 = r0.A0E
            if (r11 == 0) goto L_0x08ba
            X.MnP r10 = r0.A0G
            if (r10 == 0) goto L_0x08c1
            boolean r3 = r0.A0P
            X.Tw1 r2 = new X.Tw1
            r30 = r2
            r31 = r0
            r33 = r11
            r34 = r10
            r35 = r9
            r36 = r9
            r37 = r3
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r1.A01(r2)
            X.Tqa r11 = r0.A0E
            if (r11 == 0) goto L_0x08ba
            X.MnP r10 = r0.A0G
            if (r10 == 0) goto L_0x08c1
            boolean r3 = r0.A0P
            X.Tw0 r2 = new X.Tw0
            r2.<init>(r0, r11, r10, r3)
            r1.A01(r2)
            X.Tqa r11 = r0.A0E
            if (r11 == 0) goto L_0x08ba
            X.MnP r10 = r0.A0G
            if (r10 == 0) goto L_0x08c1
            boolean r15 = r0.A0P
            boolean r13 = r0.A0Q
            int r12 = r0.A01
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r14, r9)
            r2 = 36328340924480773(0x81106f00153d05, double:3.037527310904539E-306)
            boolean r39 = X.182.A06(r4, r14, r2)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r14, r9)
            r2 = 36328340924611847(0x81106f00173d07, double:3.0375273109874306E-306)
            boolean r40 = X.182.A06(r4, r14, r2)
            X.Tw6 r2 = new X.Tw6
            r30 = r2
            r31 = r11
            r32 = r10
            r33 = r12
            r34 = r15
            r37 = r13
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1.A01(r2)
            com.instagram.common.session.UserSession r31 = X.AnonymousClass7TE.A0l(r54)
            X.Tqa r14 = r0.A0E
            if (r14 == 0) goto L_0x08ba
            X.MnP r13 = r0.A0G
            if (r13 == 0) goto L_0x08c1
            X.UZa r2 = r0.A06()
            boolean r12 = r2.A0O
            X.UZa r2 = r0.A06()
            boolean r11 = r2.A0N
            X.UZa r2 = r0.A06()
            boolean r10 = r2.A0P
            boolean r3 = r0.A0P
            X.Ja4 r2 = new X.Ja4
            r30 = r2
            r32 = r14
            r33 = r18
            r34 = r13
            r35 = r12
            r36 = r11
            r37 = r10
            r38 = r3
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38)
            r1.A01(r2)
            X.X47 r3 = r0.A0c
            X.Tw7 r2 = new X.Tw7
            r2.<init>(r3)
            r1.A01(r2)
            X.Vit r15 = r0.A0h
            com.instagram.common.session.UserSession r33 = X.AnonymousClass7TE.A0l(r54)
            X.X47 r13 = r0.A0a
            X.X47 r12 = r0.A0d
            X.X47 r11 = r0.A0e
            X.2t9 r14 = r6.A00
            boolean r10 = r0.A0L
            X.HrV r6 = r0.A0i
            X.Wxc r3 = new X.Wxc
            r2 = r17
            r3.<init>(r5, r2)
            X.NQ6 r2 = new X.NQ6
            r30 = r2
            r31 = r0
            r32 = r14
            r34 = r13
            r35 = r12
            r36 = r11
            r37 = r15
            r38 = r6
            r39 = r3
            r40 = r10
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1.A01(r2)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.H7F r2 = new X.H7F
            r2.<init>(r5, r3, r13)
            r1.A01(r2)
            X.G7A r3 = r0.A0f
            X.NPm r2 = new X.NPm
            r2.<init>(r3)
            r1.A01(r2)
            boolean r5 = r0.A0P
            int r3 = r0.A01
            X.Dh2 r2 = new X.Dh2
            r2.<init>(r5, r3)
            r1.A01(r2)
            com.instagram.common.session.UserSession r32 = X.AnonymousClass7TE.A0l(r54)
            X.UlA r10 = r0.A0F
            if (r10 == 0) goto L_0x055f
            X.Tv8 r6 = r0.A0B
            if (r6 != 0) goto L_0x0564
            java.lang.String r25 = "keywordRefinementItemLogger"
        L_0x055f:
            X.0qQ.A0F(r25)
            goto L_0x00e9
        L_0x0564:
            r2 = 16
            X.WvZ r5 = new X.WvZ
            r5.<init>(r0, r2)
            X.InX r3 = new X.InX
            r2 = r28
            r3.<init>(r0, r2)
            r11 = 8
            X.JK3 r2 = new X.JK3
            r2.<init>(r0, r11)
            java.lang.String r36 = X.C13988Tno.A0X(r0)
            r30 = r0
            r31 = r1
            r33 = r10
            r34 = r26
            r35 = r6
            r37 = r5
            r38 = r18
            r39 = r3
            r40 = r2
            X.C67368Mmk.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r54)
            r2 = 36314545488530089(0x8103e300060aa9, double:3.0288030216595645E-306)
            boolean r41 = X.182.A06(r4, r5, r2)
            if (r41 == 0) goto L_0x05d1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r3 = r0.getModuleName()
            X.34R r5 = new X.34R
            r2 = r18
            r5.<init>(r6, r2, r3)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r2 = r0.getModuleName()
            X.34L r6 = new X.34L
            r6.<init>(r3, r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r54)
            X.1wY r3 = X.1wY.A00(r2)
            java.lang.String r2 = r0.getModuleName()
            java.lang.Integer r10 = X.1wY.A0F
            X.0qQ.A08(r10)
            r3.A07(r6, r5, r2)
        L_0x05d1:
            if (r7 == 0) goto L_0x07b0
            r2 = r27
            X.UqY r2 = (X.C16209UqY) r2
            X.Tvf r5 = r2.A01
        L_0x05d9:
            if (r5 == 0) goto L_0x05e8
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r54)
            X.Tuy r21 = new X.Tuy
            r3 = r21
            r2 = r19
            r3.<init>(r6, r2)
        L_0x05e8:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r54)
            r2 = 36319192642821131(0x81081d00011c0b, double:3.031741900745808E-306)
            boolean r42 = X.182.A06(r4, r6, r2)
            android.content.Context r31 = r0.requireContext()
            X.2ms r6 = r0.A0r
            X.UlA r3 = r0.A0F
            if (r3 == 0) goto L_0x055f
            com.instagram.common.session.UserSession r34 = X.AnonymousClass7TE.A0l(r54)
            X.TsA r2 = new X.TsA
            r30 = r2
            r32 = r0
            r33 = r1
            r35 = r3
            r36 = r18
            r37 = r21
            r39 = r18
            r40 = r6
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r11 = 1
            if (r5 == 0) goto L_0x07ac
            X.TvF r1 = new X.TvF
            r1.<init>(r5)
            X.Uiv[] r5 = new X.C15812Uiv[]{r1}
        L_0x0624:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r54)
            X.TvE r3 = new X.TvE
            r3.<init>(r1)
            X.WVx r1 = X.C19356WVx.A00
            r3.A01(r1)
            r3.A06 = r2
            X.UlA r1 = r0.A0F
            if (r1 == 0) goto L_0x055f
            r3.A08 = r1
            X.X9Q r1 = r0.A08
            if (r1 == 0) goto L_0x00e6
            r3.A0A = r1
            r3.A04 = r0
            X.32Q r1 = r0.A0k
            r3.A02(r1)
            r3.A0N = r9
            r1 = r19
            r3.A00(r1)
            r1 = 2131165253(0x7f070045, float:1.7944718E38)
            r3.A01 = r1
            r3.A0P = r5
            r3.A0K = r9
            X.WW2 r1 = new X.WW2
            r1.<init>(r0)
            r3.A09 = r1
            X.WZ6 r2 = new X.WZ6
            r2.<init>(r0, r11)
            r3.A0F = r2
            java.lang.String r1 = r0.getModuleName()
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 == 0) goto L_0x07a9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
        L_0x0673:
            r3.A0H = r1
            r3.A0O = r11
            X.TpO r1 = new X.TpO
            r1.<init>(r3)
            r0.A06 = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            r1 = 36318780325894600(0x8107bd000019c8, double:3.0314811498612026E-306)
            boolean r1 = X.182.A06(r4, r3, r1)
            if (r1 == 0) goto L_0x075d
            X.IY3 r2 = new X.IY3
            r2.<init>()
            r0.A05 = r2
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r54)
            X.UlA r13 = r0.A0F
            if (r13 == 0) goto L_0x055f
            X.0qQ.A0B(r7, r9)
            X.Urg r5 = X.C16278Urg.A00
            X.0qQ.A0B(r5, r9)
            java.util.Set r3 = X.C14410Tve.A01
            boolean r1 = r3.contains(r5)
            if (r1 != 0) goto L_0x06b7
            X.GXn r1 = new X.GXn
            r1.<init>()
            X.1PG.A01(r1, r5)
            r3.add(r5)
        L_0x06b7:
            X.1PG r1 = X.1PG.A00(r7)
            X.0qQ.A07(r1)
            X.3kU r10 = r1.A06(r5)
            X.0qQ.A07(r10)
            X.IY7 r8 = new X.IY7
            r8.<init>(r7, r13)
            X.GXo r6 = new X.GXo
            r6.<init>()
            X.GXS r3 = X.GXS.A00
            X.2vA r1 = r1.A03(r5)
            X.2vG r12 = r3.A00(r7, r1, r0, r0)
            X.IYC r5 = new X.IYC
            r5.<init>(r7, r13)
            X.2w4 r1 = X.C233632w4.A05
            X.2w5 r3 = new X.2w5
            r3.<init>(r1)
            r3.A0L = r10
            r3.A0H = r8
            r3.A0G = r2
            X.4jj r1 = new X.4jj
            r1.<init>(r7, r6, r10)
            r3.A0N = r1
            r3.A0K = r12
            r3.A0E = r6
            r3.A0p = r9
            X.1PJ r29 = X.C14410Tve.A00
            boolean r1 = X.C233832wY.A01(r7)
            if (r1 == 0) goto L_0x070d
            r1 = 36319772463668851(0x8108a400051e73, double:3.032108581784657E-306)
            boolean r1 = X.182.A06(r4, r7, r1)
            r30 = 1
            if (r1 != 0) goto L_0x070f
        L_0x070d:
            r30 = 0
        L_0x070f:
            boolean r1 = X.C228342lQ.A03(r7)
            if (r1 == 0) goto L_0x0722
            r1 = 36312879042528622(0x81025f001a056e, double:3.027749154497997E-306)
            boolean r1 = X.182.A06(r4, r7, r1)
            r31 = 1
            if (r1 != 0) goto L_0x0724
        L_0x0722:
            r31 = 0
        L_0x0724:
            boolean r1 = X.C228342lQ.A05(r7)
            if (r1 == 0) goto L_0x0737
            r1 = 36312879042528622(0x81025f001a056e, double:3.027749154497997E-306)
            boolean r1 = X.182.A06(r4, r7, r1)
            r32 = 1
            if (r1 != 0) goto L_0x0739
        L_0x0737:
            r32 = 0
        L_0x0739:
            X.4jd r1 = new X.4jd
            r27 = r12
            r28 = r10
            r23 = r1
            r24 = r7
            r25 = r6
            r26 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.A0J = r1
            r3.A0I = r5
            X.WdL r1 = new X.WdL
            r1.<init>()
            r3.A0P = r1
            r3.A03 = r7
            X.2wV r1 = r3.A00()
            r0.A0V = r1
        L_0x075d:
            com.instagram.common.session.UserSession r30 = X.AnonymousClass7TE.A0l(r54)
            java.lang.String r33 = X.C13988Tno.A0Z(r0)
            X.WWF r2 = new X.WWF
            r1 = r20
            r2.<init>(r0, r1)
            X.VOt r1 = new X.VOt
            r1.<init>(r0)
            X.Hzv r28 = new X.Hzv
            r29 = r0
            r31 = r2
            r32 = r1
            r28.<init>(r29, r30, r31, r32, r33)
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r54)
            X.TpO r1 = r0.A06
            java.lang.String r6 = "grid"
            if (r1 == 0) goto L_0x08b5
            X.JQy r3 = r1.A0D
            X.0wc r2 = r0.A02
            java.lang.String r5 = "typedLogger"
            if (r2 == 0) goto L_0x08b0
            X.Hr7 r1 = new X.Hr7
            r23 = r1
            r24 = r2
            r26 = r19
            r27 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r0.A0H = r1
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r54)
            X.JQy r3 = r0.A03
            if (r3 != 0) goto L_0x07d5
            java.lang.String r29 = "hcmAutoplayViewpointController"
            goto L_0x00e6
        L_0x07a9:
            r1 = 0
            goto L_0x0673
        L_0x07ac:
            r5 = r18
            goto L_0x0624
        L_0x07b0:
            r5 = 0
            goto L_0x05d9
        L_0x07b3:
            java.lang.String r3 = r0.getModuleName()
            java.lang.String r2 = "serp_top"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x07ca
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r54)
            r2 = 36326266454029986(0x810e8c000236a2, double:3.036215407438239E-306)
            goto L_0x0412
        L_0x07ca:
            r37 = 0
            goto L_0x0416
        L_0x07ce:
            r0.A04()
            r43 = 0
            goto L_0x0356
        L_0x07d5:
            X.0wc r2 = r0.A02
            if (r2 == 0) goto L_0x08b0
            X.Hr7 r1 = new X.Hr7
            r23 = r1
            r24 = r2
            r27 = r3
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r0.A0I = r1
            androidx.fragment.app.FragmentActivity r24 = r0.requireActivity()
            X.0hq r3 = r0.mFragmentManager
            if (r3 == 0) goto L_0x08cb
            com.instagram.common.session.UserSession r27 = X.AnonymousClass7TE.A0l(r54)
            X.TpO r1 = r0.A06
            if (r1 == 0) goto L_0x08b5
            X.TsA r1 = r1.A0E
            X.2uE r2 = new X.2uE
            r23 = r2
            r25 = r0
            r26 = r3
            r28 = r18
            r30 = r1
            r31 = r18
            r32 = r9
            r33 = r11
            r34 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A09 = r2
            X.5eN r1 = r0.A0q
            r2.EU9(r1)
            boolean r1 = X.C13989Tnp.A1Y(r0)
            if (r1 == 0) goto L_0x084f
            X.TpO r2 = r0.A06
            if (r2 == 0) goto L_0x08b5
            X.UZa r1 = r0.A06()
            X.2js r1 = r1.A01()
            X.3jg[] r1 = new X.C249403jg[]{r1}
            r2.A09(r1)
            X.UZa r1 = r0.A06()
            X.HCA r3 = r1.A0B
            X.UZa r1 = r0.A06()
            boolean r1 = r1.A0S
            if (r1 == 0) goto L_0x084f
            if (r3 == 0) goto L_0x084f
            X.0h9 r1 = r0.mLifecycleRegistry
            r1.A09(r3)
            X.TpO r2 = r0.A06
            if (r2 == 0) goto L_0x08b5
            X.3jg[] r1 = new X.C249403jg[]{r3}
            r2.A09(r1)
        L_0x084f:
            X.2jd r2 = new X.2jd
            r2.<init>()
            r1 = r22
            r2.A0E(r1)
            X.2uG r1 = r0.A09
            if (r1 != 0) goto L_0x0861
            java.lang.String r29 = "previewMediaController"
            goto L_0x00e6
        L_0x0861:
            r2.A0E(r1)
            X.GXC r1 = r0.A04
            if (r1 != 0) goto L_0x086c
            java.lang.String r29 = "clipsUnitController"
            goto L_0x00e6
        L_0x086c:
            r2.A0E(r1)
            X.TpO r1 = r0.A06
            if (r1 == 0) goto L_0x08b5
            r0.registerLifecycleListenerSet(r2)
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r54)
            boolean r1 = r3 instanceof X.AnonymousClass0iw
            if (r1 != 0) goto L_0x0883
            r3 = r0
        L_0x0883:
            X.0iw r3 = (X.AnonymousClass0iw) r3
            X.4O6 r1 = new X.4O6
            r1.<init>(r3, r2)
            r0.A0A = r1
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r54)
            X.0qQ.A0B(r3, r9)
            r1 = 36599099956596147(0x8206b000030db3, double:3.208756413073413E-306)
            long r2 = X.182.A01(r4, r3, r1)
            int r1 = (int) r2
            if (r1 != 0) goto L_0x08a0
            r11 = 0
        L_0x08a0:
            r0.A0W = r11
            r1 = r56
            X.C15286UZq.super.onCreate(r1)
            r1 = -1698155879(0xffffffff9ac83299, float:-8.2799806E-23)
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            return
        L_0x08b0:
            X.0qQ.A0F(r5)
            goto L_0x00e9
        L_0x08b5:
            X.0qQ.A0F(r6)
            goto L_0x00e9
        L_0x08ba:
            X.0qQ.A0F(r24)
            goto L_0x00e9
        L_0x08bf:
            java.lang.String r23 = "hideSuggestionController"
        L_0x08c1:
            X.0qQ.A0F(r23)
            goto L_0x00e9
        L_0x08c6:
            X.0qQ.A0F(r13)
            goto L_0x00e9
        L_0x08cb:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r1 = 1263778382(0x4b53ba4e, float:1.387579E7)
            r0 = r16
            X.AnonymousClass0fD.A09(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15286UZq.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(769011484);
        0qQ.A0B(layoutInflater, 0);
        C67408MnP mnP = this.A0G;
        if (mnP == null) {
            str = "viewpointDelegate";
        } else {
            C15272UZa A062 = A06();
            long j = A062.A03;
            A062.A03 = 0;
            mnP.A00.sendEmptyMessageDelayed(0, j);
            if (this.A06 == null) {
                str = "grid";
            } else {
                View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
                AnonymousClass0fD.A09(996291595, A022);
                return A0D2;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1485039548);
        AnonymousClass0eM r5 = this.A0m;
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r5));
        A002.A02(this.A0o, C57066INg.class);
        A002.A02(this.A0p, C2370836g.class);
        A002.A02(this.A0n, C2370536d.class);
        if (C13989Tnp.A1Y(this)) {
            C14074TpO tpO = this.A06;
            if (tpO != null) {
                C249403jg r1 = new C249403jg[]{A06().A01()}[0];
                C228172ku r0 = tpO.A0G;
                0qQ.A0B(r1, 0);
                r0.A01.remove(r1);
                HCA hca = A06().A0B;
                if (A06().A0S && hca != null) {
                    this.mLifecycleRegistry.A0A(hca);
                    C14074TpO tpO2 = this.A06;
                    if (tpO2 != null) {
                        C249403jg r12 = new C249403jg[]{hca}[0];
                        C228172ku r02 = tpO2.A0G;
                        0qQ.A0B(r12, 0);
                        r02.A01.remove(r12);
                    }
                }
            }
            0qQ.A0F("grid");
            throw AnonymousClass00P.createAndThrow();
        }
        if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(r5), 36314545488530089L)) {
            1wY.A00(AnonymousClass7TE.A0l(r5)).A08(getModuleName());
        }
        super.onDestroy();
        C233812wV r03 = this.A0V;
        if (r03 != null) {
            r03.A0B();
        }
        AnonymousClass0fD.A09(1879429727, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-971165737);
        super.onDestroyView();
        C13988Tno.A1K(A06().A03());
        C14074TpO tpO = this.A06;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        tpO.A01();
        C67757MuC A072 = A07();
        C71108Ocm ocm = A072.A0C;
        String str = A072.A0F;
        String str2 = A072.A0G;
        C71108Ocm.A03(ocm, str, str2, new C20705Wxc(C71108Ocm.A02(ocm, str, str2).getValue(), 9));
        C20752WyP wyP = C20752WyP.A00;
        05G A012 = C71108Ocm.A01(ocm, str, str2);
        A012.Epw(wyP.invoke(A012.getValue()));
        AnonymousClass0fD.A09(86639832, A022);
    }

    public final void onPause() {
        ViewGroup CEd;
        int A022 = AnonymousClass0fD.A02(1428389637);
        C14074TpO tpO = this.A06;
        String str = "grid";
        if (tpO != null) {
            tpO.A0D.AGS();
            X9Q x9q = this.A08;
            if (x9q == null) {
                str = "videoPlayerManager";
            } else {
                x9q.ECU();
                X9Q x9q2 = this.A07;
                if (x9q2 == null) {
                    str = "hcmVideoPlayerManager";
                } else {
                    x9q2.ECU();
                    C18611Vv4 vv4 = this.A0D;
                    if (vv4 == null) {
                        str = "perfLogger";
                    } else {
                        vv4.A01();
                        C15286UZq.super.onPause();
                        if (C13989Tnp.A1Y(this)) {
                            C227762js A012 = A06().A01();
                            C14074TpO tpO2 = this.A06;
                            if (tpO2 != null) {
                                C238133Ar r1 = tpO2.A06;
                                C227762js.A01(A012, true);
                                if (!(r1 == null || (CEd = r1.CEd()) == null)) {
                                    CEd.requestLayout();
                                }
                            }
                        }
                        C13988Tno.A1K(A06().A03());
                        AnonymousClass0fD.A09(369748070, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        ViewGroup viewGroup;
        int A022 = AnonymousClass0fD.A02(-1614778616);
        super.onResume();
        C14074TpO tpO = this.A06;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        tpO.A0D.EHL();
        View view = A06().A04;
        if (C13989Tnp.A1Y(this) && view != null) {
            boolean z = A06().A0S;
            2dZ A032 = 2dZ.A0t.A03(getActivity());
            if (z) {
                viewGroup = A032.A0O;
            } else {
                viewGroup = A032.A0P;
            }
            List A1P = 0sr.A1P(new View[]{viewGroup, view});
            A06().A01().A05(new C19151WNj(1), 0sn.A00, A1P, (float) this.A0R, true);
        }
        C319996rZ.A00(AnonymousClass7TE.A0l(this.A0m)).A00(requireActivity());
        View view2 = this.mView;
        if (view2 != null) {
            view2.post(new C20067WkR(this));
        }
        AnonymousClass0fD.A09(1461947541, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1877213517);
        C15286UZq.super.onStop();
        C13988Tno.A1K(A06().A03());
        AnonymousClass0fD.A09(77476725, A022);
    }
}
