package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.OcF  reason: case insensitive filesystem */
public final class C71093OcF {
    public float A00 = 0.7f;
    public User A01;
    public C16666Uz2 A02 = C16666Uz2.CHEVRON_BUTTON;
    public C74489Pvj A03 = new C72984PRr();
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public Map A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Activity A0I;
    public final AnonymousClass0iw A0J;
    public final UserSession A0K;
    public final C14068TpH A0L;
    public final C16677UzD A0M;
    public final String A0N;
    public final Map A0O = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0P = AnonymousClass0eN.A01(new C58175Inf(this, 25));
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(new C58175Inf(this, 26));
    public final boolean A0R;

    private final boolean A02(JSONArray jSONArray) {
        int i = 0;
        while (i < jSONArray.length()) {
            int i2 = i + 1;
            if (Dba.A1X(this.A0M, jSONArray.getString(i))) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    public final NKU A03(C331157Pu r22) {
        UserSession userSession = this.A0K;
        User user = this.A01;
        String str = this.A0N;
        String moduleName = this.A0J.getModuleName();
        C72983PRq pRq = new C72983PRq(this.A03, new MPC(this, 33));
        C16666Uz2 uz2 = this.A02;
        C14068TpH tpH = this.A0L;
        C16677UzD uzD = this.A0M;
        Map map = this.A0O;
        0qQ.A0C(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        return O3I.A00(userSession, r22, user, uz2, tpH, uzD, pRq, (NHU) null, str, this.A05, (String) null, moduleName, (HashMap) map, 0.7f, this.A0F, true, this.A0G);
    }

    public final /* synthetic */ void A06() {
        A00((C331157Pu) null, this);
    }

    public final void A07(C74489Pvj pvj) {
        0qQ.A0B(pvj, 0);
        this.A03 = pvj;
    }

    public static final AnonymousClass37D A00(C331157Pu r21, C71093OcF ocF) {
        String str;
        C71093OcF ocF2 = ocF;
        boolean A012 = ocF2.A01();
        Map A042 = ocF2.A04();
        UserSession userSession = ocF2.A0K;
        ORV.A00(userSession, ocF2.A0F);
        AnonymousClass0iw r12 = ocF2.A0J;
        String str2 = ocF2.A0N;
        User user = ocF2.A01;
        if (user != null) {
            user.getId();
        }
        new 0xF().A0C(ocF2.A0O);
        AnonymousClass0eM r6 = ocF2.A0Q;
        C71038Oa2 oa2 = (C71038Oa2) r6.getValue();
        synchronized (oa2) {
            02m.A0p.markerStart(303970949);
            oa2.A03(Boolean.valueOf(A012), (Integer) null, (Integer) null, (String) null, (Map) null, 303970949);
        }
        if (A012) {
            C71038Oa2 oa22 = (C71038Oa2) r6.getValue();
            synchronized (oa22) {
                02m.A0p.markerStart(303960177);
                oa22.A03((Boolean) null, (Integer) null, (Integer) null, (String) null, A042, 303960177);
            }
        }
        if (ocF2.A0D) {
            0Tu r62 = 0Tu.A06;
            if (!182.A06(r62, userSession, 36312861860955417L)) {
                182.A06(0Tu.A05, userSession, 36312861861020954L);
            }
            if (182.A06(r62, userSession, 36312861861086491L)) {
                String str3 = (String) A042.get("location");
                if (str3 != null) {
                    C49530ExC A002 = ORV.A00(userSession, ocF2.A0F);
                    C16666Uz2 uz2 = ocF2.A02;
                    C16677UzD uzD = ocF2.A0M;
                    String moduleName = r12.getModuleName();
                    String str4 = (String) A042.get("trigger_session_id");
                    0qQ.A0B(moduleName, 4);
                    0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "frx_start_flow");
                    if (A0e.isSampled()) {
                        A0e.AAJ("location", str3);
                        DbS.A1N(A0e, uz2.toString());
                        A0e.AAJ("object_value", str2);
                        A0e.AAJ("object_type", uzD.toString());
                        A0e.AAJ("locale", AnonymousClass1Q2.A03().getLanguage());
                        A0e.AAJ("container_module", moduleName);
                        A0e.AAJ(AnonymousClass9NE.A00(), str4);
                        A0e.Cgf();
                    }
                } else {
                    String canonicalName = ocF2.getClass().getCanonicalName();
                    0qQ.A07(canonicalName);
                    0wb.A03(canonicalName, "IXT trigger location can't be null");
                }
            }
        }
        User user2 = ocF2.A01;
        if (user2 != null) {
            str = user2.getId();
        } else {
            str = ocF2.A06;
        }
        if (str != null) {
            0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
            A0p.E5c(002.A0R("proactive_warning_banner_cache_expiration_override/", str), 0);
            A0p.apply();
        }
        C331157Pu r14 = r21;
        if (ocF2.A01()) {
            C69229Nhj nhj = new C69229Nhj(ocF2);
            FragmentActivity fragmentActivity = ocF2.A0I;
            DbS.A1X(fragmentActivity);
            Map A043 = ocF2.A04();
            new C67614Mqm(fragmentActivity, (F1F) null, r12, userSession, r14, nhj, Boolean.valueOf(ocF2.A0D), AnonymousClass05K.A00, "com.bloks.www.ig.ixt.triggers.bottom_sheet.ig_content", ocF2.A0A, A043).A04();
            return null;
        }
        C331127Pr r1 = (C331127Pr) ocF2.A0P.getValue();
        if (r21 != null) {
            r14.A0F(ocF2.A03(r14), r1);
        } else {
            C331157Pu A003 = r1.A00();
            A003.A02(ocF2.A0I, ocF2.A03(A003));
        }
        AnonymousClass37D A013 = AnonymousClass37D.A00.A01(ocF2.A0I);
        if (A013 == null) {
            return null;
        }
        C72964PQw.A00(ocF2, 6, A013);
        return A013;
    }

    private final boolean A01() {
        0Tu r2;
        long j;
        C14068TpH tpH;
        if (!this.A0H && (!this.A0F || !((tpH = this.A0L) == C14068TpH.ENCRYPTED_DIRECT_MESSAGE || tpH == C14068TpH.IG_DIRECT_ENCRYPTED_THREAD || tpH == C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_VANISH || tpH == C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_VANISH || tpH == C14068TpH.IGD_ENCRYPTED_DIRECT_MESSAGE_INSTAMADILLO || tpH == C14068TpH.IGD_ENCRYPTED_DIRECT_THREAD_INSTAMADILLO))) {
            UserSession userSession = this.A0K;
            0Tu r5 = 0Tu.A06;
            JSONArray jSONArray = new JSONArray(182.A04(r5, userSession, 36874763842486326L));
            JSONArray jSONArray2 = new JSONArray(182.A04(r5, userSession, 36875919188688979L));
            if (!A02(jSONArray) && !A02(jSONArray2)) {
                C16677UzD uzD = this.A0M;
                if (uzD != C16677UzD.AD) {
                    AnonymousClass16q C31 = DbT.A0j(userSession).A03.C31();
                    if (C31 != null && AnonymousClass7TF.A1Y(C31.Ccp(), true) && ((uzD == C16677UzD.DIRECT_MESSAGE || uzD == C16677UzD.ENCRYPTED_DIRECT_MESSAGE || uzD == C16677UzD.DIRECT_MESSAGE_THREAD) && 182.A06(r5, userSession, 36312969235334717L))) {
                        return true;
                    }
                    JSONArray jSONArray3 = new JSONArray(182.A04(r5, userSession, 36874763842420789L));
                    JSONArray jSONArray4 = new JSONArray(182.A04(r5, userSession, 36875919188623442L));
                    JSONArray jSONArray5 = new JSONArray(182.A04(r5, userSession, 36876009382936664L));
                    if (A02(jSONArray3)) {
                        r2 = 0Tu.A05;
                        j = 36311813888934674L;
                    } else if (A02(jSONArray4)) {
                        r2 = 0Tu.A05;
                        j = 36312969235138108L;
                    } else if (A02(jSONArray5)) {
                        r2 = 0Tu.A05;
                        j = 36313059429451467L;
                    }
                    return 182.A06(r2, userSession, j);
                } else if (this.A02 != C16666Uz2.HIDE_AD_BUTTON || !182.A06(r5, userSession, 36312969235400254L)) {
                    return 182.A06(0Tu.A05, userSession, 36312969235465791L);
                }
                return false;
            }
        }
        return true;
    }

    public final Map A04() {
        boolean z;
        String A10;
        UserSession userSession = this.A0K;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36313793868859641L);
        if (!A01() || (A062 && !O3W.A00(userSession))) {
            z = false;
        } else {
            z = true;
        }
        String moduleName = this.A0J.getModuleName();
        C14068TpH tpH = this.A0L;
        C16666Uz2 uz2 = this.A02;
        String str = this.A0N;
        C16677UzD uzD = this.A0M;
        boolean z2 = this.A0R;
        Map map = this.A0O;
        0qQ.A0C(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        AbstractMap abstractMap = (AbstractMap) map;
        0qQ.A0B(moduleName, 0);
        0qQ.A0B(abstractMap, 7);
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(160), moduleName);
        Locale locale = Locale.US;
        0qQ.A08(locale);
        0eP A1L2 = AnonymousClass7TE.A1L(AnonymousClass000.A00(196), DbT.A12(locale, "IG_REPORT_BUTTON_CLICKED"));
        0eP A1L3 = AnonymousClass7TE.A1L("trigger_session_id", C51972G9s.A0n());
        LinkedHashMap A072 = 0Yt.A07(AnonymousClass7TH.A0h(AnonymousClass000.A00(317), AnonymousClass7TF.A0c(), A1L, A1L2, A1L3));
        C21270XRp A012 = C21522Xdo.A01(tpH);
        if (DbU.A02(A012, 0) == 209) {
            A10 = C273654mx.A00(300);
        } else {
            A10 = DbT.A10(A012);
        }
        A072.put("location", DbT.A12(locale, A10));
        A072.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, DbT.A12(locale, DbT.A10(C21522Xdo.A00(uz2))));
        A072.put("ig_object_value", str);
        A072.put("ig_object_type", uzD.toString());
        if (!abstractMap.isEmpty()) {
            String A002 = AnonymousClass000.A00(3618);
            if (abstractMap.get(A002) == null) {
                abstractMap.put(A002, String.valueOf(DbS.A0k()));
            }
            A072.put("logging_extra", JTQ.A0c(abstractMap));
        }
        String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str3 = "0";
        if (z) {
            str3 = str2;
        }
        A072.put("preloading_enabled", str3);
        if (!z2) {
            str2 = "0";
        }
        A072.put("is_e2ee", str2);
        return 0Yt.A0B(A072);
    }

    public final void A08(String str, String str2) {
        if (str2 != null) {
            this.A0O.put(str, str2);
        }
    }

    public C71093OcF(Activity activity, AnonymousClass0iw r4, UserSession userSession, C14068TpH tpH, C16677UzD uzD, String str, boolean z) {
        this.A0K = userSession;
        this.A0I = activity;
        this.A0J = r4;
        this.A0N = str;
        this.A0L = tpH;
        this.A0M = uzD;
        this.A0R = z;
        this.A0A = AnonymousClass7TE.A16(activity, 2131972171);
    }

    public final void A05() {
        if (A01()) {
            UserSession userSession = this.A0K;
            boolean A062 = 182.A06(0Tu.A05, userSession, 36313793868859641L);
            if (!A062) {
                this.A0D = true;
            }
            if (O3W.A00(userSession)) {
                if (A062) {
                    this.A0D = true;
                }
                Activity activity = this.A0I;
                0qQ.A0C(activity, "null cannot be cast to non-null type android.content.Context");
                C359638dF.A04(activity, new C359618dD(userSession), "com.bloks.www.ig.ixt.triggers.bottom_sheet.ig_content", new HashMap(A04()), 182.A01(0Tu.A06, userSession, 36594336837863089L));
            }
        }
    }
}
