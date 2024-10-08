package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.LdI  reason: case insensitive filesystem */
public final class C64516LdI implements C66423MRd {
    public int A00;
    public int A01;
    public C64515LdH A02;
    public Integer A03;
    public String A04;
    public String A05;
    public Map A06;
    public final C62474KgP A07;
    public final C64534Ldb A08;
    public final AnonymousClass0iw A09;
    public final List A0A = AnonymousClass7TE.A1C();
    public final Map A0B;
    public final C63600Kzn A0C;
    public final LOA A0D;
    public final LOW A0E;
    public final C46215DQt A0F;
    public final C46215DQt A0G;
    public final C46215DQt A0H;
    public final UserSession A0I;

    public C64516LdI(C62474KgP kgP, LOA loa, C64534Ldb ldb, AnonymousClass0iw r10, UserSession userSession) {
        LinkedHashMap A1H;
        C62493Kgj kgj;
        Object k8n;
        C62493Kgj kgj2;
        Object k8k;
        0qQ.A0B(userSession, 1);
        this.A0I = userSession;
        this.A09 = r10;
        this.A07 = kgP;
        this.A08 = ldb;
        this.A0D = loa;
        ldb.A00 = this;
        this.A0C = new C63600Kzn(userSession);
        this.A0E = new LOW(userSession, (C324356z9) null);
        this.A03 = AnonymousClass05K.A00;
        int ordinal = kgP.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                A1H = AnonymousClass7TE.A1H();
                String str = loa.A03;
                if (AnonymousClass000.A00(781).equals(str)) {
                    kgj2 = C62493Kgj.POST_TYPE;
                    k8k = new C61457K8l();
                } else {
                    boolean equals = AnonymousClass000.A00(1412).equals(str);
                    kgj2 = C62493Kgj.POST_TYPE;
                    if (!equals) {
                        k8k = new C61456K8k();
                    }
                }
                A1H.put(kgj2, k8k);
                kgj = C62493Kgj.POST_TIME_FRAME;
                k8n = new C61455K8j();
            } else if (ordinal == 2) {
                A1H = AnonymousClass7TE.A1H();
                kgj2 = C62493Kgj.POST_TYPE;
            } else {
                throw AnonymousClass7TE.A0z("MediaContentType should be either POST or STORY");
            }
            k8k = new C61458K8m();
            A1H.put(kgj2, k8k);
            kgj = C62493Kgj.POST_TIME_FRAME;
            k8n = new C61455K8j();
        } else {
            A1H = AnonymousClass7TE.A1H();
            kgj = C62493Kgj.STORY_TIME_FRAME;
            k8n = new C61459K8n(userSession);
        }
        A1H.put(kgj, k8n);
        A1H.put(C62493Kgj.ELIGIBILITY, new C61454K8i());
        Map unmodifiableMap = Collections.unmodifiableMap(A1H);
        0qQ.A07(unmodifiableMap);
        this.A0B = unmodifiableMap;
        this.A0F = new C64725Lh2(this, 0);
        this.A0H = new C64725Lh2(this, 1);
        this.A0G = new C64725Lh2(this, 2);
    }

    public final void destroy() {
        throw AnonymousClass00P.createAndThrow();
    }

    public static final int A00(C64516LdI ldI, String str) {
        List<C64804LiO> list = ldI.A0A;
        for (C64804LiO liO : list) {
            if (0qQ.A0K(liO.A03, str)) {
                return list.indexOf(liO);
            }
        }
        throw AnonymousClass7TE.A0w("invalid media Id");
    }

    public static final void A01(C64516LdI ldI) {
        LOW low;
        String str;
        C46215DQt dQt;
        String str2;
        String str3;
        C64516LdI ldI2 = ldI;
        boolean A062 = 182.A06(0Tu.A05, ldI2.A0I, 36321353011307819L);
        int ordinal = ldI2.A07.ordinal();
        if (A062) {
            if (ordinal == 1) {
                low = ldI2.A0E;
                str = ldI2.A04;
                dQt = ldI2.A0F;
                str2 = "STORY";
            } else if (ordinal == 0) {
                low = ldI2.A0E;
                str = ldI2.A04;
                dQt = ldI2.A0F;
                str2 = "FEED";
            } else if (ordinal == 2) {
                low = ldI2.A0E;
                str = ldI2.A04;
                dQt = ldI2.A0F;
                str2 = "CLIPS";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            0qQ.A0B(dQt, 2);
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, "", "access_token");
            UserSession userSession = low.A03;
            2IS A0D2 = JTQ.A0D(A032, userSession.A06, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            DbW.A18(A032, A0D2, "query_params");
            A0D2.A03("count", 15);
            if (str2.equals("STORY")) {
                str3 = "ONE_DAY";
            } else {
                str3 = "LIFETIME";
            }
            A0D2.A04("timeframe", str3);
            A0D2.A04("metric", "MEDIA_ORGANIC_ACCOUNT_REACH_OR_PROMOTED_PEOPLE_BASED_REACH");
            A0D2.A02("should_include_insights_data", true);
            A0D2.A02("show_only_ig_boost_eligible_media", true);
            A0D2.A04(AnonymousClass000.A00(3579), str2);
            A0D2.A04("cursor", str);
            A0D2.A04(C66579MXk.A00(110), "BOOST_MEDIA_PICKER");
            C239113Fa r4 = new C239113Fa(A0D2, C60870Jsd.class, "IGInsightsIntegratedMediaGridQuery", false);
            C363088j4.A00(userSession).ATL(new C64394LbB(dQt, 8), new DFQ(1, low, dQt), r4);
        } else if (ordinal == 1) {
            C63600Kzn kzn = ldI2.A0C;
            Map map = ldI2.A06;
            if (map != null) {
                String valueOf = String.valueOf(ldI2.A00);
                C46215DQt dQt2 = ldI2.A0H;
                0qQ.A0B(dQt2, 2);
                Object obj = map.get(C62493Kgj.STORY_TIME_FRAME);
                if (obj != null) {
                    String str4 = (String) obj;
                    Object obj2 = map.get(C62493Kgj.ELIGIBILITY);
                    if (obj2 != null) {
                        String str5 = (String) obj2;
                        LOW low2 = kzn.A00;
                        0qQ.A0B(str4, 0);
                        0qQ.A0B(str5, 1);
                        C64533Lda lda = new C64533Lda(dQt2, 4);
                        low2.A00 = lda;
                        UserSession userSession2 = low2.A03;
                        Integer A002 = C63986LHe.A00(str4);
                        0qQ.A0B(A002, 2);
                        C18718Vyo.A01(new C18485Vsg(lda, userSession2, A002, valueOf, str5));
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (ordinal == 0) {
            C63600Kzn kzn2 = ldI2.A0C;
            Map map2 = ldI2.A06;
            if (map2 != null) {
                String valueOf2 = String.valueOf(ldI2.A00);
                C46215DQt dQt3 = ldI2.A0F;
                0qQ.A0B(dQt3, 2);
                Object obj3 = map2.get(C62493Kgj.POST_TYPE);
                if (obj3 != null) {
                    String str6 = (String) obj3;
                    Object obj4 = map2.get(C62493Kgj.POST_TIME_FRAME);
                    if (obj4 != null) {
                        String str7 = (String) obj4;
                        Object obj5 = map2.get(C62493Kgj.ELIGIBILITY);
                        if (obj5 != null) {
                            kzn2.A00.A01(dQt3, str6, str7, (String) obj5, valueOf2);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (ordinal == 2) {
            C63600Kzn kzn3 = ldI2.A0C;
            String str8 = ldI2.A04;
            C46215DQt dQt4 = ldI2.A0G;
            0qQ.A0B(dQt4, 1);
            LOW low3 = kzn3.A00;
            UserSession userSession3 = low3.A03;
            String str9 = userSession3.A06;
            0Df A033 = C41845B3m.A03(GraphQlCallInput.A02, true, "include_feed_video");
            0Df.A00(A033, str9, "target_user_id");
            0Df.A00(A033, str8, "max_id");
            0Df.A00(A033, "audience", "audience");
            2IS A0D3 = JTQ.A0D(A033, true, "is_request_from_viewer");
            2IS A042 = C41845B3m.A04();
            A042.A01("use_defer");
            A042.A01(C273654mx.A00(420));
            A042.A03("initial_stream_count", 0);
            A042.A02("stream_use_customized_batch", true);
            A042.A01(C273654mx.A00(680));
            A042.A01(C273654mx.A00(272));
            A042.A01(C273654mx.A00(273));
            A042.A01(C273654mx.A00(274));
            A042.A01(C273654mx.A00(271));
            A042.A01(C273654mx.A00(685));
            A042.A01(C273654mx.A00(684));
            1P2.A00(1P1.A00(userSession3), AnonymousClass93P.A00, (1P0) null, new C15621Ufn(dQt4, 19), AnonymousClass9D0.A00(1vm.A01(userSession3).A03(new PandoGraphQLRequest(C41847B3o.A04(A033, A0D3, "data"), "ClipsProfileQuery", A0D3.getParamsCopy(), A042.getParamsCopy(), AnonymousClass73E.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_user_clips_graphql", AnonymousClass7TE.A1C())).A01(new C72221Oyp((Object) low3, 0), 189753949, 3)), (1OC) null, "clips/user/", 21600, true, false);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public static final void A02(C64516LdI ldI, int i, boolean z) {
        List list = ldI.A0A;
        C64804LiO liO = (C64804LiO) list.get(i);
        String str = liO.A03;
        ImageUrl imageUrl = liO.A02;
        list.set(i, new C64804LiO(liO.A01, imageUrl, str, liO.A00, liO.A04, z));
    }

    public static final void A03(C64516LdI ldI, List list) {
        C64534Ldb ldb;
        int i;
        int i2;
        int i3;
        String str;
        if (ldI.A00 == 0) {
            if (AnonymousClass7TE.A1b(list)) {
                str = ((C63833L8o) list.get(0)).A04;
            } else {
                str = null;
            }
            ldI.A05 = str;
            C64515LdH ldH = ldI.A02;
            if (ldH != null) {
                ldH.A01(str, false);
            } else {
                throw AnonymousClass7TE.A0z("delegate could not be null when init media grid");
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63833L8o l8o = (C63833L8o) it.next();
            String str2 = l8o.A04;
            ImageUrl imageUrl = l8o.A02;
            C16528UwY uwY = l8o.A01;
            boolean A1Q = AnonymousClass7TF.A1Q(ldI.A00);
            ldI.A0A.add(new C64804LiO(uwY, imageUrl, str2, l8o.A00, C51972G9s.A1Z(l8o.A03), A1Q));
            ldI.A00++;
        }
        List list2 = ldI.A0A;
        if (list2.isEmpty()) {
            int ordinal = ldI.A07.ordinal();
            if (ordinal == 1) {
                ldb = ldI.A08;
                i = 2131961611;
                i2 = 2131961610;
                i3 = 2131965976;
            } else if (ordinal == 0) {
                ldb = ldI.A08;
                i = 2131961607;
                i2 = 2131961606;
                i3 = 2131965897;
            } else if (ordinal == 2) {
                ldb = ldI.A08;
                i = 2131961609;
                i2 = 2131961608;
                i3 = 2131965966;
            } else {
                throw AnonymousClass7TE.A0z("MediaContentType should be either POST or STORY");
            }
            ldb.A03.setVisibility(8);
            ldb.A07.setText(i);
            ldb.A06.setText(i2);
            IgTextView igTextView = ldb.A05;
            igTextView.setText(i3);
            igTextView.setVisibility(0);
            ldb.A02.setVisibility(0);
            return;
        }
        C64534Ldb ldb2 = ldI.A08;
        ldb2.A03.setVisibility(0);
        ldb2.A02.setVisibility(8);
        AnonymousClass2t9 r0 = ldb2.A04;
        JTR.A1L(r0, list2);
        r0.notifyDataSetChanged();
    }

    public final boolean A04() {
        C62493Kgj kgj = C62493Kgj.ELIGIBILITY;
        Map map = this.A06;
        if (map != null) {
            if (map.containsKey(kgj)) {
                Map map2 = this.A06;
                if (map2 != null) {
                    Object obj = map2.get(kgj);
                    if (obj == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (!obj.equals("NOT_ELIGIBLE")) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return true;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
