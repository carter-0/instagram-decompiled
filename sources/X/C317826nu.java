package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.endtoend.EndToEnd;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.6nu  reason: invalid class name and case insensitive filesystem */
public final class C317826nu implements AnonymousClass0lh {
    public List A00 = 0sn.A00;
    public boolean A01;
    public final UserSession A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();

    public C317826nu(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A09(Context context, UserSession userSession, G75 g75, String str, String str2, boolean z, boolean z2) {
        String str3;
        0qQ.A0B(userSession, 1);
        String str4 = str;
        0qQ.A0B(str, 2);
        G75 g752 = g75;
        if (!2Lv.A00(this.A02).A00(CallerContext.A01("FxMultiNativeAuthTokenVerifier"), "ig_android_linking_cache_fx_ac_eligibility_linkage_check")) {
            boolean z3 = z2;
            if (!this.A03.containsKey(str) || z2) {
                Context context2 = context;
                if (!z) {
                    Class<FYV> cls = FYV.class;
                    Boolean bool = (Boolean) ((FYV) userSession.A01(cls, new C51597Fwl(userSession))).A01.get("FACEBOOK");
                    if (bool == null || !bool.booleanValue()) {
                        FYV fyv = (FYV) userSession.A01(cls, new C51597Fwl(userSession));
                        C376149Gs r0 = FV8.A00().A01;
                        if (r0 != null) {
                            str3 = r0.A02;
                        } else {
                            str3 = null;
                        }
                        0nY.A00().ATE(new EI9(context, fyv, str3));
                        return;
                    }
                    return;
                }
                HashSet hashSet = new HashSet();
                hashSet.add("FACEBOOK");
                hashSet.add("MESSENGER");
                A05(this, "native auth fetch start");
                AnonymousClass1HI.A02.Eym(new C317836nv(context2, g752, this, str4, str2, z3));
            }
        } else if (g75 != null) {
            g75.onFail("Prefetch failed: Already linked account");
        }
    }

    public final boolean A0B(UserSession userSession, String str, boolean z) {
        Object obj;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 2);
        if (z) {
            obj = this.A03.get(str);
        } else {
            obj = ((FYV) userSession.A01(FYV.class, new C51597Fwl(userSession))).A01.get("FACEBOOK");
        }
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static final ArrayList A01(Context context, UserSession userSession, Set set) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (C376139Gr r0 : AJ0.A02(context, userSession, "ig_android_access_library_fx_fetch_active_msgr_token", "FxMultiNativeAuthTokenVerifier", (String) null)) {
            C376119Gp r5 = r0.A01;
            String str2 = r5.A00;
            0qQ.A07(str2);
            if (str2.length() != 0) {
                2IV r2 = new 2IV();
                2IV r1 = new 2IV();
                r1.A09(str2, "sensitive_string_value");
                r2.A06(r1, "access_token");
                r2.A09("ACTIVE_ACCOUNT", "account_source");
                r2.A09("MESSENGER", "app_source");
                r2.A09("FACEBOOK", "account_type");
                C376109Go r02 = r5.A01;
                if (r02 == null || (str = r02.A02) == null) {
                    str = "";
                }
                set.add(str);
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    @Deprecated(message = "This method is using SsoLoginUtil which is a privacy unsafe legacy API")
    public static final ArrayList A02(Context context, UserSession userSession, Set set) {
        C376159Gt r0;
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        C376149Gs A002 = C368048rz.A00(context, userSession, false, userSession.A06);
        if (!(A002 == null || (r0 = A002.A00) == null || (str = r0.A01) == null || str.length() <= 0 || (str2 = A002.A02) == null || str2.length() <= 0)) {
            2IV r2 = new 2IV();
            2IV r1 = new 2IV();
            r1.A09(str2, "sensitive_string_value");
            r2.A06(r1, "access_token");
            r2.A09("ACTIVE_ACCOUNT", "account_source");
            r2.A09("FACEBOOK", "app_source");
            r2.A09("FACEBOOK", "account_type");
            C376159Gt r02 = A002.A00;
            if (r02 == null || (str3 = r02.A01) == null) {
                str3 = "";
            }
            set.add(str3);
            arrayList.add(r2);
        }
        return arrayList;
    }

    public static final ArrayList A03(Context context, UserSession userSession, Set set) {
        ArrayList arrayList = new ArrayList();
        C368058s0 r4 = new C368058s0();
        r4.A03 = new C368198sE(userSession, (String) null);
        C368218sG r1 = new C368218sG(r4);
        List singletonList = Collections.singletonList(C368098s4.FACEBOOK);
        0qQ.A07(singletonList);
        Iterator it = C368218sG.A01(context, (String) null, singletonList, r1).iterator();
        while (it.hasNext()) {
            C376119Gp r12 = ((C376139Gr) it.next()).A01;
            String str = r12.A00;
            0qQ.A07(str);
            if (str.length() != 0 && !set.contains(r12.A01.A02)) {
                2IV r2 = new 2IV();
                2IV r13 = new 2IV();
                r13.A09(str, "sensitive_string_value");
                r2.A06(r13, "access_token");
                r2.A09("INACTIVE_LOGGED_IN_ACCOUNTS", "account_source");
                r2.A09("FACEBOOK", "app_source");
                r2.A09("FACEBOOK", "account_type");
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public static final void A04(ImmutableList immutableList, ImmutableList immutableList2, C317826nu r6, String str) {
        String str2;
        String str3;
        String str4;
        String A05;
        String str5;
        String str6;
        String str7;
        String str8;
        String A052;
        UserSession userSession = r6.A02;
        if (182.A06(0Tu.A06, userSession, 36319746694979175L)) {
            return;
        }
        if (0qQ.A0K(str, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            if (immutableList != null && !immutableList.isEmpty()) {
                M1M m1m = (M1M) userSession.A01(M1M.class, new C73662Phb(userSession, 21));
                C249803kO it = immutableList.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    AnonymousClass3FZ r62 = (AnonymousClass3FZ) it.next();
                    Class<B9N> cls = B9N.class;
                    if (r62.A00(cls, "prescreen_content") != null) {
                        String str9 = "";
                        AnonymousClass3FZ A002 = r62.A00(cls, "prescreen_content");
                        if (A002 == null || (str5 = A002.A05("title_text")) == null) {
                            str5 = str9;
                        }
                        m1m.A02 = str5;
                        AnonymousClass3FZ A003 = r62.A00(cls, "prescreen_content");
                        if (A003 == null || (str6 = A003.A05("body_text")) == null) {
                            str6 = str9;
                        }
                        m1m.A00 = str6;
                        AnonymousClass3FZ A004 = r62.A00(cls, "prescreen_content");
                        if (A004 == null || (str7 = A004.A05("primary_cta_text")) == null) {
                            str7 = str9;
                        }
                        m1m.A03 = str7;
                        AnonymousClass3FZ A005 = r62.A00(cls, "prescreen_content");
                        if (A005 == null || (str8 = A005.A05("secondary_cta_text")) == null) {
                            str8 = str9;
                        }
                        m1m.A04 = str8;
                        AnonymousClass3FZ A006 = r62.A00(cls, "prescreen_content");
                        if (!(A006 == null || (A052 = A006.A05("footer_text")) == null)) {
                            str9 = A052;
                        }
                        m1m.A01 = str9;
                        return;
                    }
                }
            }
        } else if (0qQ.A0K(str, "IG_LOGOUT_UPSELL") && immutableList2 != null && !immutableList2.isEmpty()) {
            M1L m1l = (M1L) userSession.A01(M1L.class, new C73662Phb(userSession, 23));
            C249803kO it2 = immutableList2.iterator();
            0qQ.A07(it2);
            while (it2.hasNext()) {
                AnonymousClass3FZ r63 = (AnonymousClass3FZ) it2.next();
                Class<B9P> cls2 = B9P.class;
                if (r63.A00(cls2, "prescreen_content") != null) {
                    String str10 = "";
                    AnonymousClass3FZ A007 = r63.A00(cls2, "prescreen_content");
                    if (A007 == null || (str2 = A007.A05("title_text")) == null) {
                        str2 = str10;
                    }
                    m1l.A01 = str2;
                    AnonymousClass3FZ A008 = r63.A00(cls2, "prescreen_content");
                    if (A008 == null || (str3 = A008.A05("body_text")) == null) {
                        str3 = str10;
                    }
                    m1l.A00 = str3;
                    AnonymousClass3FZ A009 = r63.A00(cls2, "prescreen_content");
                    if (A009 == null || (str4 = A009.A05("primary_cta_text")) == null) {
                        str4 = str10;
                    }
                    m1l.A02 = str4;
                    AnonymousClass3FZ A0010 = r63.A00(cls2, "prescreen_content");
                    if (!(A0010 == null || (A05 = A0010.A05("secondary_cta_text")) == null)) {
                        str10 = A05;
                    }
                    m1l.A03 = str10;
                    return;
                }
            }
        }
    }

    public static final void A05(C317826nu r3, String str) {
        UserSession userSession = r3.A02;
        if (!182.A06(0Tu.A05, userSession, 36319746695044712L)) {
            return;
        }
        if (EndToEnd.isRunningEndToEndTest() || EndToEnd.A03()) {
            C59689JTv.A09(userSession.A03.A06(), str);
        }
    }

    @Deprecated(message = "This is using a legacy API without proper callername input")
    public final ImmutableList A06(Context context) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A06, userSession, 36316564124930559L)) {
            try {
                arrayList.addAll(A02(context, userSession, hashSet));
                arrayList.addAll(A03(context, userSession, hashSet));
            } catch (Exception e) {
                FFL.A01(C48152EZu.A0O, userSession, "upsell_multi_native_auth_prefetch_exception", 0Yt.A06(new 0eP[]{new 0eP("getAllFacebookAccessTokens exception:", e.toString()), new 0eP("getAllFacebookAccessTokens trace:", 2Og.A00(e))}));
            }
        } else {
            arrayList.addAll(A02(context, userSession, hashSet));
            arrayList.addAll(A03(context, userSession, hashSet));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final ImmutableList A07(Context context) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A06, userSession, 36316564124930559L)) {
            try {
                arrayList.addAll(A01(context, userSession, hashSet));
            } catch (Exception e) {
                FFL.A01(C48152EZu.A0O, userSession, "upsell_multi_native_auth_prefetch_exception", 0Yt.A06(new 0eP[]{new 0eP("getAllMsgrAccessTokens exception:", e.toString()), new 0eP("getAllMsgrTokens trace:", 2Og.A00(e))}));
            }
        } else {
            arrayList.addAll(A01(context, userSession, hashSet));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        0qQ.A07(copyOf);
        return copyOf;
    }

    public final List A08(String str) {
        if (182.A06(0Tu.A05, this.A02, 36322134695487452L)) {
            return (List) this.A04.get(str);
        }
        return null;
    }

    public final void A0A(boolean z) {
        Context A06 = this.A02.A03.A06();
        1Hb r2 = AnonymousClass1HI.A02;
        int i = 3;
        if (z) {
            i = 2;
        }
        r2.Eym(new C387089le(A06, this, i));
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C317826nu.class);
    }

    public static final C48152EZu A00(String str) {
        switch (str.hashCode()) {
            case -1599767705:
                if (str.equals("IG_FB_PROFILE_LINK_INTEGRATION")) {
                    return C48152EZu.A07;
                }
                break;
            case -1574224499:
                if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                    return C48152EZu.A06;
                }
                break;
            case -773734548:
                if (str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                    return C48152EZu.A0K;
                }
                break;
            case -664343167:
                if (str.equals("IG_FB_REEL_STORY_VIEWERS_DASHBOARD_BOTTOM")) {
                    return C48152EZu.A09;
                }
                break;
            case 1949671265:
                if (str.equals("IG_LOGOUT_UPSELL")) {
                    return C48152EZu.A0G;
                }
                break;
        }
        return C48152EZu.A0O;
    }
}
