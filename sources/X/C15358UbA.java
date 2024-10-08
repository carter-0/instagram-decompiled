package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.keyword.Keyword;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UbA  reason: case insensitive filesystem */
public final class C15358UbA extends AnonymousClass4DH implements AnonymousClass4DV, C232682uF, AnonymousClass4DR, C227252iu, AnonymousClass0j6, AnonymousClass4DS, AnonymousClass4DT, C267664bz {
    public static final String __redex_internal_original_name = "KeywordMediaSerpFragment";
    public C227762js A00;
    public GXC A01;
    public C14227TsA A02;
    public C14074TpO A03;
    public GWW A04;
    public C296935qt A05;
    public X9Q A06;
    public AnonymousClass2uE A07;
    public Keyword A08;
    public C14379Tv8 A09;
    public C17899Vhq A0A;
    public VYM A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public 2el A0G;
    public WWD A0H;
    public String A0I;
    public String A0J;
    public final C14005To7 A0K = new C14005To7();
    public final C19737Wee A0L = new C19737Wee(this);
    public final AnonymousClass32Q A0M = AnonymousClass32Q.A00;
    public final AnonymousClass0eM A0N = C227642jf.A02(this);
    public final C14075TpP A0O = new C14075TpP();
    public final C20907X3y A0P = new C19355WVw(this, 4);
    public final WW4 A0Q = new C15942UlC(this, 4);
    public final X41 A0R = new WW5(this, 4);
    public final X44 A0S = new WWA(this);
    public final C289875eN A0T = new C19360WWb(this, 4);
    public final C17267VOu A0U = new C17267VOu(this);
    public final C17268VOv A0V = new C17268VOv();

    public static final void A01(C296995qz r7, C296935qt r8, 1Xj r9, C15358UbA ubA) {
        1Xj r4 = r9;
        C15358UbA ubA2 = ubA;
        0jB E4l = ubA.E4l(r9);
        C18244VoB.A01(E4l, r8);
        0xF A002 = E4l.A00();
        String str = ubA.A0C;
        if (str == null) {
            0qQ.A0F("keywordSessionId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbU.A1R(VBN.A00(ubA2, A002, r4, str, r7.A01, r7.A00), DbT.A0X(ubA.A0N));
        }
    }

    public final void A8T(0xI r1) {
    }

    public final boolean CbJ() {
        return true;
    }

    public final 0jB E4l(1Xj r3) {
        0qQ.A0B(r3, 0);
        r3.A0C.Ehi(this.A0E);
        0jB E4k = E4k();
        User A2A = r3.A2A(AnonymousClass7TE.A0l(this.A0N));
        if (A2A != null) {
            GU0.A00(E4k, A2A);
        }
        return E4k;
    }

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        WWD wwd = this.A0H;
        String str = "refinementSurfaceController";
        if (wwd != null) {
            wwd.configureActionBar(r5);
            C238133Ar scrollingViewProxy = getScrollingViewProxy();
            if (scrollingViewProxy != null) {
                WWD wwd2 = this.A0H;
                if (wwd2 != null) {
                    C227762js r1 = this.A00;
                    if (r1 == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        C14074TpO tpO = this.A03;
                        if (tpO == null) {
                            str = "grid";
                        } else {
                            wwd2.AJ9(r1, tpO.A0B, scrollingViewProxy);
                        }
                    }
                }
            }
            r5.Eu4(true);
            r5.ErT(this);
            Keyword keyword = this.A08;
            if (keyword == null) {
                str = "surfaceKeyword";
            } else {
                r5.setTitle(keyword.A04);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "feed_keyword";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C14074TpO tpO = this.A03;
        if (tpO != null) {
            C19737Wee wee = this.A0L;
            tpO.A05(view, wee.isLoading());
            C14074TpO tpO2 = this.A03;
            if (tpO2 != null) {
                tpO2.A06(wee);
                C14074TpO tpO3 = this.A03;
                if (tpO3 != null) {
                    C14227TsA.A00(tpO3.A0E);
                    return;
                }
            }
        }
        0qQ.A0F("grid");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C61078JwG jwG, C15358UbA ubA, List list, boolean z) {
        Object obj;
        String str = "dataSource";
        if (z) {
            GWW gww = ubA.A04;
            if (gww != null) {
                gww.A05();
                if (jwG != null) {
                    WWD wwd = ubA.A0H;
                    if (wwd == null) {
                        str = "refinementSurfaceController";
                    } else {
                        wwd.A03 = jwG;
                        wwd.A09.A00 = jwG;
                        if (((AnonymousClass4DQ) wwd.A07).isResumed()) {
                            C51970G9q.A12(wwd.A06);
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        GWW gww2 = ubA.A04;
        if (gww2 != null) {
            gww2.A07((String) null, list);
            GWW gww3 = ubA.A04;
            if (gww3 != null) {
                Iterator it = gww3.A01.A02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (obj instanceof C296925qs) {
                        break;
                    }
                }
                ubA.A05 = (C296935qt) obj;
                C14074TpO tpO = ubA.A03;
                if (tpO == null) {
                    str = "grid";
                } else {
                    C14227TsA.A00(tpO.A0E);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C15358UbA ubA, boolean z) {
        UserSession A0l = AnonymousClass7TE.A0l(ubA.A0N);
        if (!182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36331033867600762L)) {
            if (z) {
                ubA.A0V.A00.clear();
            }
            C17899Vhq vhq = ubA.A0A;
            String str = null;
            if (vhq == null) {
                0qQ.A0F("requestController");
                throw AnonymousClass00P.createAndThrow();
            }
            C15959Ulb ulb = new C15959Ulb(ubA, z);
            if (!z) {
                str = ubA.A0E;
            }
            vhq.A00(ulb, str, ubA.A0V.A00, z);
        }
    }

    public final C227762js BD0() {
        C227762js r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("scrollableNavigationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4k() {
        0jB r2 = new 0jB();
        0j9 r1 = C297705sC.A03;
        Keyword keyword = this.A08;
        String str = "surfaceKeyword";
        if (keyword != null) {
            r2.A04(r1, keyword.A03);
            0j9 r12 = C297705sC.A04;
            Keyword keyword2 = this.A08;
            if (keyword2 != null) {
                r2.A04(r12, keyword2.A04);
                r2.A04(C297705sC.A05, "KEYWORD");
                0j9 r13 = C14073TpN.A02;
                String str2 = this.A0C;
                if (str2 == null) {
                    str = "keywordSessionId";
                } else {
                    r2.A04(r13, str2);
                    0j9 r14 = C14073TpN.A00;
                    String str3 = this.A0F;
                    if (str3 == null) {
                        str = "searchSessionId";
                    } else {
                        r2.A04(r14, str3);
                        r2.A05(C297695sB.A01, this.A0E);
                        r2.A05(C297695sB.A00, this.A0I);
                        return r2;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EKl() {
        String str;
        C14074TpO tpO = this.A03;
        if (tpO == null) {
            str = "grid";
        } else {
            tpO.A03();
            WWD wwd = this.A0H;
            if (wwd == null) {
                str = "refinementSurfaceController";
            } else {
                wwd.EKZ();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C238133Ar getScrollingViewProxy() {
        C14074TpO tpO = this.A03;
        if (tpO != null) {
            return tpO.A06;
        }
        C13988Tno.A0n();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0N);
    }

    public final boolean onBackPressed() {
        AnonymousClass2uE r0 = this.A07;
        if (r0 != null) {
            return r0.onBackPressed();
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(1Xj r13, Keyword keyword, C15358UbA ubA, List list) {
        ArrayList arrayList;
        String A0j = AnonymousClass7TG.A0j();
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C51971G9r.A0v(it);
                if (A0v != null) {
                    arrayList.add(A0v);
                }
            }
        } else {
            arrayList = null;
        }
        FragmentActivity requireActivity = ubA.requireActivity();
        AnonymousClass0eM r0 = ubA.A0N;
        C18243VoA.A01(requireActivity, AnonymousClass7TE.A0l(r0), ubA.A0K, ubA, r13, keyword, A0j, ubA.A0D, "", (String) null, arrayList, C55141Hcp.A00(AnonymousClass7TE.A0l(r0)));
    }

    public static final void A03(Keyword keyword, C15358UbA ubA) {
        String str;
        FragmentActivity requireActivity = ubA.requireActivity();
        AnonymousClass0eM r0 = ubA.A0N;
        C309516Yo A0N2 = DbX.A0N(requireActivity, r0);
        A0N2.A08();
        C14398TvR.A00();
        r0.getValue();
        String str2 = ubA.A0F;
        if (str2 == null) {
            str = "searchSessionId";
        } else {
            String str3 = ubA.A0I;
            Keyword keyword2 = ubA.A08;
            if (keyword2 == null) {
                str = "surfaceKeyword";
            } else {
                A0N2.A0D(C14452Twa.A02(keyword, "feed_keyword", str2, str3, keyword2.A03));
                A0N2.A04();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final 0jB E4x() {
        return E4k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: X.0iw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: X.4DU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.4DJ} */
    /* JADX WARNING: type inference failed for: r24v2, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r55) {
        /*
            r54 = this;
            r0 = 1569382489(0x5d8ae059, float:1.25088703E18)
            int r13 = X.AnonymousClass0fD.A02(r0)
            r0 = r54
            r1 = r55
            X.C15358UbA.super.onCreate(r1)
            android.os.Bundle r2 = r0.requireArguments()
            java.lang.String r1 = "argument_keyword"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            com.instagram.model.keyword.Keyword r1 = (com.instagram.model.keyword.Keyword) r1
            if (r1 == 0) goto L_0x0395
            r0.A08 = r1
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r0.A0C = r1
            android.content.Context r3 = r0.requireContext()
            X.0eM r1 = r0.A0N
            r53 = r1
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r53)
            java.lang.String r1 = r0.A0C
            java.lang.String r20 = "keywordSessionId"
            r12 = 0
            if (r1 == 0) goto L_0x0390
            r9 = 0
            r15 = 1
            r7 = -1
            r5 = r0
            r6 = r1
            r10 = r15
            X.X9Q r1 = X.C16942VBu.A00(r3, r4, r5, r6, r7, r9, r10)
            r0.A06 = r1
            java.lang.String r3 = "argument_search_session_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r2.getString(r3, r1)
            r0.A0F = r1
            java.lang.String r1 = "argument_search_string"
            java.lang.String r1 = r2.getString(r1)
            r0.A0I = r1
            java.lang.String r1 = "argument_prior_serp_keyword_id"
            java.lang.String r1 = r2.getString(r1)
            r0.A0J = r1
            java.lang.String r1 = "argument_prior_module"
            java.lang.String r1 = r2.getString(r1)
            r0.A0D = r1
            java.lang.String r1 = "argument_pinned_media_id"
            java.lang.String r52 = r2.getString(r1)
            r53.getValue()
            X.2el r1 = X.C51969G9p.A0k()
            r0.A0G = r1
            com.instagram.common.session.UserSession r23 = X.AnonymousClass7TE.A0l(r53)
            com.instagram.model.keyword.Keyword r4 = r0.A08
            java.lang.String r19 = "surfaceKeyword"
            if (r4 == 0) goto L_0x038b
            java.lang.String r3 = r0.A0C
            if (r3 == 0) goto L_0x0390
            java.lang.String r2 = r0.A0F
            java.lang.String r10 = "searchSessionId"
            if (r2 == 0) goto L_0x0386
            X.Tv8 r1 = new X.Tv8
            r25 = r3
            r26 = r2
            r21 = r1
            r22 = r0
            r24 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            r0.A09 = r1
            java.lang.String r2 = r0.A0C
            if (r2 == 0) goto L_0x0390
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r53)
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.GXC r1 = new X.GXC
            r3 = r1
            r4 = r0
            r7 = r12
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A01 = r1
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r53)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.GSm r3 = new X.GSm
            r3.<init>(r1)
            X.WVy r23 = X.C19357WVy.A00
            X.Wee r1 = r0.A0L
            r44 = r1
            X.72b r4 = new X.72b
            r4.<init>()
            r1 = 2131238763(0x7f081f6b, float:1.8093814E38)
            r4.A02 = r1
            android.content.res.Resources r2 = X.DbV.A05(r0)
            r1 = 2131968402(0x7f134192, float:1.9573698E38)
            java.lang.String r1 = r2.getString(r1)
            r4.A0D = r1
            android.content.res.Resources r2 = X.DbV.A05(r0)
            r1 = 2131968401(0x7f134191, float:1.9573696E38)
            java.lang.String r1 = r2.getString(r1)
            r4.A07 = r1
            r1 = 16
            X.Wxc r2 = new X.Wxc
            r2.<init>(r0, r1)
            X.GWW r1 = new X.GWW
            r24 = r3
            r25 = r4
            r26 = r44
            r27 = r2
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r0.A04 = r1
            X.GWV r1 = r1.A01
            java.util.List r1 = r1.A02
            java.util.Iterator r3 = r1.iterator()
        L_0x0108:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0383
            java.lang.Object r2 = r3.next()
            boolean r1 = r2 instanceof X.C296925qs
            if (r1 == 0) goto L_0x0108
        L_0x0116:
            X.5qt r2 = (X.C296935qt) r2
            r0.A05 = r2
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r53)
            X.X9Q r7 = r0.A06
            java.lang.String r18 = "videoPlayerManager"
            if (r7 == 0) goto L_0x037e
            X.WW4 r6 = r0.A0Q
            X.X41 r14 = r0.A0R
            X.TpP r3 = r0.A0O
            X.GWW r5 = r0.A04
            java.lang.String r17 = "dataSource"
            if (r5 == 0) goto L_0x023b
            java.lang.String r4 = r0.A0F
            if (r4 == 0) goto L_0x0386
            r1 = 2
            X.0qQ.A0B(r8, r1)
            X.C51974G9v.A1N(r6, r14, r3)
            android.content.Context r21 = r0.requireContext()
            X.2s4 r24 = new X.2s4
            r24.<init>()
            X.0lg r11 = X.DbT.A0X(r53)
            X.0Tu r10 = X.0Tu.A05
            r1 = 36314545488399015(0x8103e300040aa7, double:3.028803021576673E-306)
            boolean r45 = X.182.A06(r10, r11, r1)
            if (r45 == 0) goto L_0x01a0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            java.lang.String r11 = "feed_keyword"
            X.34R r10 = new X.34R
            r10.<init>(r1, r12, r11)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.34L r2 = new X.34L
            r2.<init>(r1, r11)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.1wY r1 = X.1wY.A00(r1)
            java.lang.Integer r16 = X.1wY.A0F
            X.0qQ.A08(r16)
            r1.A07(r2, r10, r11)
            com.instagram.common.session.UserSession r47 = X.AnonymousClass7TE.A0l(r53)
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.6z9 r48 = X.C51970G9q.A0g(r2, r0, r1)
            com.instagram.model.keyword.Keyword r2 = r0.A08
            if (r2 == 0) goto L_0x038b
            java.lang.String r11 = r0.A0J
            java.lang.String r10 = r0.A0D
            X.Vhq r1 = new X.Vhq
            r46 = r1
            r49 = r2
            r50 = r11
            r51 = r10
            r46.<init>(r47, r48, r49, r50, r51, r52)
            r0.A0A = r1
        L_0x01a0:
            androidx.fragment.app.FragmentActivity r35 = r0.requireActivity()
            X.GWW r1 = r0.A04
            if (r1 == 0) goto L_0x023b
            com.instagram.common.session.UserSession r38 = X.AnonymousClass7TE.A0l(r53)
            r25 = r3
            r26 = r6
            r27 = r5
            r28 = r14
            r29 = r7
            r30 = r0
            r31 = r12
            r32 = r4
            r33 = r9
            r34 = r9
            r22 = r0
            r23 = r8
            X.2tC r10 = X.C14370Tuz.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.Mmq r2 = new X.Mmq
            r2.<init>()
            r10.A01(r2)
            com.instagram.common.session.UserSession r23 = X.AnonymousClass7TE.A0l(r53)
            X.GWW r8 = r0.A04
            if (r8 == 0) goto L_0x023b
            X.Tv8 r7 = r0.A09
            java.lang.String r11 = "keywordRefinementItemLogger"
            if (r7 == 0) goto L_0x0379
            r2 = 17
            X.WvZ r6 = new X.WvZ
            r6.<init>(r0, r2)
            r2 = 4
            X.InX r5 = new X.InX
            r5.<init>(r0, r2)
            r2 = 5
            X.InX r4 = new X.InX
            r4.<init>(r0, r2)
            com.instagram.model.keyword.Keyword r2 = r0.A08
            if (r2 == 0) goto L_0x038b
            java.lang.String r2 = r2.A04
            r21 = r0
            r22 = r10
            r24 = r8
            r25 = r14
            r26 = r7
            r27 = r2
            r28 = r6
            r29 = r12
            r30 = r5
            r31 = r4
            X.C67368Mmk.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.TsA r2 = new X.TsA
            r36 = r0
            r37 = r10
            r39 = r1
            r40 = r12
            r41 = r12
            r42 = r12
            r43 = r12
            r46 = r9
            r34 = r2
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r0.A02 = r2
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.TvE r4 = new X.TvE
            r4.<init>(r1)
            X.X3y r1 = r0.A0P
            r4.A01(r1)
            X.TsA r1 = r0.A02
            if (r1 != 0) goto L_0x0243
            java.lang.String r17 = "adapter"
        L_0x023b:
            X.0qQ.A0F(r17)
        L_0x023e:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0243:
            r4.A06 = r1
            X.GWW r1 = r0.A04
            if (r1 == 0) goto L_0x023b
            r4.A08 = r1
            X.X9Q r1 = r0.A06
            if (r1 == 0) goto L_0x037e
            r4.A0A = r1
            r4.A04 = r0
            X.32Q r1 = X.AnonymousClass32Q.A00
            r4.A02(r1)
            X.2el r1 = r0.A0G
            java.lang.String r6 = "viewpointManager"
            if (r1 == 0) goto L_0x0374
            r4.A05 = r1
            X.Tvf r2 = X.C14411Tvf.TWO_BY_TWO
            X.TvF r1 = new X.TvF
            r1.<init>(r2)
            X.Uiv[] r1 = new X.C15812Uiv[]{r1}
            r4.A0P = r1
            r4.A0K = r9
            X.WW3 r1 = new X.WW3
            r1.<init>(r0)
            r4.A09 = r1
            X.TpO r1 = new X.TpO
            r1.<init>(r4)
            r0.A03 = r1
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r53)
            java.lang.String r4 = r0.A0C
            if (r4 == 0) goto L_0x0390
            r2 = 3
            X.WWF r1 = new X.WWF
            r1.<init>(r0, r2)
            X.Hzv r7 = new X.Hzv
            r20 = r7
            r23 = r1
            r24 = r12
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25)
            X.2el r5 = r0.A0G
            if (r5 == 0) goto L_0x0374
            X.Tv8 r4 = r0.A09
            if (r4 == 0) goto L_0x0379
            X.TpO r1 = r0.A03
            java.lang.String r6 = "grid"
            if (r1 == 0) goto L_0x0374
            X.JQy r2 = r1.A0D
            X.VYM r1 = new X.VYM
            r1.<init>(r5, r2, r7, r4)
            r0.A0B = r1
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r1 = r0.requireContext()
            X.2js r1 = X.C227752jr.A00(r1, r12, r9)
            r0.A00 = r1
            androidx.fragment.app.FragmentActivity r21 = r0.requireActivity()
            X.0hq r4 = r0.mFragmentManager
            if (r4 == 0) goto L_0x03a0
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r53)
            X.TpO r1 = r0.A03
            if (r1 == 0) goto L_0x0374
            X.TsA r1 = r1.A0E
            X.2uE r2 = new X.2uE
            r20 = r2
            r22 = r0
            r23 = r4
            r25 = r12
            r26 = r0
            r27 = r1
            r28 = r12
            r29 = r9
            r30 = r15
            r31 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0.A07 = r2
            X.5eN r1 = r0.A0T
            r2.EU9(r1)
            android.content.Context r8 = r0.requireContext()
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            r53.getValue()
            X.VOu r4 = r0.A0U
            X.X44 r2 = r0.A0S
            X.WWD r1 = new X.WWD
            r7 = r1
            r10 = r0
            r11 = r2
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A0H = r1
            if (r45 != 0) goto L_0x0332
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r53)
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r53)
            X.6z9 r18 = X.C51970G9q.A0g(r2, r0, r1)
            com.instagram.model.keyword.Keyword r5 = r0.A08
            if (r5 == 0) goto L_0x038b
            java.lang.String r4 = r0.A0J
            java.lang.String r2 = r0.A0D
            X.Vhq r1 = new X.Vhq
            r19 = r5
            r20 = r4
            r21 = r2
            r22 = r52
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r0.A0A = r1
        L_0x0332:
            X.TpO r2 = r0.A03
            if (r2 == 0) goto L_0x0374
            X.2js r1 = r0.A00
            if (r1 != 0) goto L_0x033e
            java.lang.String r17 = "scrollableNavigationHelper"
            goto L_0x023b
        L_0x033e:
            X.3jg[] r1 = new X.C249403jg[]{r1}
            r2.A09(r1)
            X.2jd r2 = new X.2jd
            r2.<init>()
            r2.A0E(r3)
            X.2uE r1 = r0.A07
            if (r1 != 0) goto L_0x0355
            java.lang.String r17 = "peekMediaController"
            goto L_0x023b
        L_0x0355:
            r2.A0E(r1)
            X.GXC r1 = r0.A01
            if (r1 != 0) goto L_0x0360
            java.lang.String r17 = "clipsUnitController"
            goto L_0x023b
        L_0x0360:
            r2.A0E(r1)
            X.TpO r1 = r0.A03
            if (r1 == 0) goto L_0x0374
            r0.registerLifecycleListenerSet(r2)
            A04(r0, r15)
            r0 = 992652553(0x3b2aad09, float:0.0026043078)
            X.AnonymousClass0fD.A09(r0, r13)
            return
        L_0x0374:
            X.0qQ.A0F(r6)
            goto L_0x023e
        L_0x0379:
            X.0qQ.A0F(r11)
            goto L_0x023e
        L_0x037e:
            X.0qQ.A0F(r18)
            goto L_0x023e
        L_0x0383:
            r2 = 0
            goto L_0x0116
        L_0x0386:
            X.0qQ.A0F(r10)
            goto L_0x023e
        L_0x038b:
            X.0qQ.A0F(r19)
            goto L_0x023e
        L_0x0390:
            X.0qQ.A0F(r20)
            goto L_0x023e
        L_0x0395:
            java.lang.String r0 = "Keyword must be supplied."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = -1557797844(0xffffffffa325e42c, float:-8.992985E-18)
            goto L_0x03a7
        L_0x03a0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -611197612(0xffffffffdb91dd54, float:-8.2114449E16)
        L_0x03a7:
            X.AnonymousClass0fD.A09(r0, r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15358UbA.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(724089513);
        0qQ.A0B(layoutInflater, 0);
        if (this.A03 == null) {
            str = "grid";
        } else {
            View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_grid_recyclerview_wrapper, false);
            WWD wwd = this.A0H;
            if (wwd == null) {
                str = "refinementSurfaceController";
            } else {
                wwd.D6y(layoutInflater, viewGroup);
                AnonymousClass0fD.A09(1521029545, A022);
                return A0D2;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1848379316);
        super.onDestroy();
        AnonymousClass0eM r4 = this.A0N;
        if (182.A06(0Tu.A05, DbT.A0X(r4), 36314545488399015L)) {
            1wY.A00(AnonymousClass7TE.A0l(r4)).A08("feed_keyword");
        }
        AnonymousClass0fD.A09(54670005, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1784954779);
        super.onDestroyView();
        C14074TpO tpO = this.A03;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        tpO.A01();
        AnonymousClass0fD.A09(-155073060, A022);
    }

    public final void onPause() {
        String str;
        int A022 = AnonymousClass0fD.A02(338866718);
        C14074TpO tpO = this.A03;
        if (tpO == null) {
            str = "grid";
        } else {
            tpO.A0D.AGS();
            X9Q x9q = this.A06;
            if (x9q == null) {
                str = "videoPlayerManager";
            } else {
                x9q.ECU();
                C15358UbA.super.onPause();
                WWD wwd = this.A0H;
                if (wwd == null) {
                    str = "refinementSurfaceController";
                } else {
                    wwd.onPause();
                    C227762js r2 = this.A00;
                    if (r2 == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        C238133Ar scrollingViewProxy = getScrollingViewProxy();
                        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        r2.A09(scrollingViewProxy);
                        AnonymousClass0fD.A09(903056350, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        View view;
        int A022 = AnonymousClass0fD.A02(1509303435);
        super.onResume();
        C14074TpO tpO = this.A03;
        if (tpO == null) {
            str = "grid";
        } else {
            tpO.A0D.EHL();
            WWD wwd = this.A0H;
            str = "refinementSurfaceController";
            if (wwd != null) {
                wwd.onResume();
                WWD wwd2 = this.A0H;
                if (wwd2 != null) {
                    C227762js r1 = this.A00;
                    if (r1 == null) {
                        str = "scrollableNavigationHelper";
                    } else {
                        wwd2.AJA(r1, new WWC(this));
                        AnonymousClass0eM r8 = this.A0N;
                        0lg A0X = DbT.A0X(r8);
                        0qQ.A0B(A0X, 0);
                        Class<C15935Ul2> cls = C15935Ul2.class;
                        C20656Wwo wwo = C20656Wwo.A00;
                        C17957Vip vip = (C17957Vip) A0X.A01(cls, wwo);
                        String str2 = this.A0C;
                        String str3 = "keywordSessionId";
                        if (str2 != null) {
                            if (vip.A00.containsKey(str2)) {
                                C17957Vip vip2 = (C17957Vip) AnonymousClass7TF.A0L(r8, 0).A01(cls, wwo);
                                String str4 = this.A0C;
                                if (str4 != null) {
                                    C15936Ul3 ul3 = (C15936Ul3) ((C17625VbH) vip2.A00.remove(str4));
                                    if (ul3 != null) {
                                        if (ul3.A04) {
                                            C17899Vhq vhq = this.A0A;
                                            if (vhq == null) {
                                                str3 = "requestController";
                                            } else {
                                                vhq.A00 = vhq.A00.A00(ul3.A00);
                                            }
                                        }
                                        List list = ul3.A06;
                                        if (AnonymousClass7TE.A1b(list)) {
                                            int size = list.size();
                                            for (int i = 0; i < size; i++) {
                                                A00((C61078JwG) null, this, (List) list.get(i), AnonymousClass7TE.A1a(ul3.A05.get(i)));
                                            }
                                        }
                                        String str5 = ul3.A02;
                                        if (!(str5 == null || str5.length() == 0 || (view = this.mView) == null)) {
                                            view.post(new C20244Wnj(this, ul3));
                                        }
                                    }
                                }
                            }
                            AnonymousClass0fD.A09(938796669, A022);
                            return;
                        }
                        0qQ.A0F(str3);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
