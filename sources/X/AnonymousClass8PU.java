package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.8PU  reason: invalid class name */
public final class AnonymousClass8PU implements CallerContextable {
    public static final CallerContext A00;
    public static final AnonymousClass9JK A01;
    public static final String __redex_internal_original_name = "CrossPostToFacebookUtil";

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "getIGXPostLinkageType", imports = {}))
    public static final Integer A00(UserSession userSession) {
        AnonymousClass9F7 A002;
        C46478Dfh dfh;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass8PV.A00(userSession).booleanValue()) {
            return C363038ix.A00(userSession);
        }
        AnonymousClass9JK r1 = A01;
        0qQ.A0B(r1, 1);
        AnonymousClass9F4 A003 = AnonymousClass9F3.A00(userSession);
        if (A003 == null || (A002 = AnonymousClass9F4.A00(A003)) == null || (dfh = (C46478Dfh) A002.Au3(r1)) == null || dfh.A00 == null) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A00;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "getIGXPostLinkageType", imports = {}))
    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A00(userSession) == AnonymousClass05K.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r0 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r2 == X.16V.A06) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(com.instagram.common.session.UserSession r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.Boolean r0 = X.AnonymousClass8PV.A00(r5)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x001d
            X.8jd r1 = X.C363388je.A00(r5)
            com.facebook.common.callercontext.CallerContext r0 = A00
            X.5wF r0 = r1.A00(r0)
            boolean r1 = X.C363388je.A02(r0)
        L_0x001c:
            return r1
        L_0x001d:
            X.0t1 r0 = X.0eE.A00(r5)
            com.instagram.user.model.User r0 = r0.A00()
            X.16V r2 = r0.A0J()
            X.16V r0 = X.16V.A07
            if (r2 == r0) goto L_0x0032
            X.16V r1 = X.16V.A06
            r0 = 0
            if (r2 != r1) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x008d
            boolean r0 = A09(r5)
            if (r0 == 0) goto L_0x008d
            X.1Av r2 = X.1Au.A00(r5)
            X.16V r0 = X.AnonymousClass0eD.A01(r5)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0088
            r0 = 3
            if (r1 != r0) goto L_0x008d
            X.0xa r1 = r2.A01
            java.lang.String r0 = "creator_account_fb_destination_backfilling_completed"
        L_0x0053:
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x008d
            r0 = 6
            X.WxV r1 = new X.WxV
            r1.<init>(r5, r0)
            java.lang.Class<X.A8m> r0 = X.C39772A8m.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.A8m r1 = (X.C39772A8m) r1
            com.facebook.common.callercontext.CallerContext r0 = A00
            X.8jo r2 = r1.A00(r0)
            r1 = 0
            if (r2 == 0) goto L_0x0072
            java.lang.String r1 = r2.A01
        L_0x0072:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008d
            if (r2 == 0) goto L_0x007f
            java.lang.String r0 = r2.A00
        L_0x007e:
            r3 = r0
        L_0x007f:
            boolean r0 = X.00l.A0W(r3)
            r1 = 0
            if (r0 != 0) goto L_0x001c
            r1 = 1
            return r1
        L_0x0088:
            X.0xa r1 = r2.A01
            java.lang.String r0 = "personal_account_fb_page_id_backfilling_completed"
            goto L_0x0053
        L_0x008d:
            boolean r0 = A05(r5)
            if (r0 != 0) goto L_0x00a1
            X.16V r1 = X.AnonymousClass0eD.A01(r5)
            X.16V r0 = X.16V.A06
            if (r1 != r0) goto L_0x007f
            boolean r0 = A02(r5)
            if (r0 == 0) goto L_0x007f
        L_0x00a1:
            X.9JK r1 = A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.9F4 r0 = X.AnonymousClass9F3.A00(r5)
            X.9F7 r0 = X.AnonymousClass9F4.A00(r0)
            java.lang.Object r0 = r0.Au3(r1)
            X.Dfh r0 = (X.C46478Dfh) r0
            if (r0 == 0) goto L_0x007f
            X.9Gd r0 = r0.A00
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r0.A00(r1, r5)
            if (r0 != 0) goto L_0x007e
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PU.A06(com.instagram.common.session.UserSession):boolean");
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A07(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass8PV.A00(userSession).booleanValue()) {
            return C363378jd.A08.A04(A00, userSession);
        }
        if (!00l.A0W(A01(userSession))) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A0A(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass8PV.A00(userSession).booleanValue()) {
            if (!z || !C363378jd.A08.A04(A00, userSession)) {
                return false;
            }
            return true;
        } else if (!A07(userSession) || !z || C46508DgB.A00(userSession)) {
            return false;
        } else {
            return true;
        }
    }

    static {
        CallerContext A002 = CallerContext.A00(AnonymousClass8PU.class);
        A00 = A002;
        A01 = new AnonymousClass9JK(A002, "ig_android_ig_to_fb_crossposting", "ig_android_ig_to_fb_crossposting", "crossposting", "loading");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r3 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2 == X.16V.A06) goto L_0x0013;
     */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(com.instagram.common.session.UserSession r5) {
        /*
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r5)
            X.16V r2 = r0.A0J()
            X.16V r0 = X.16V.A07
            if (r2 == r0) goto L_0x0013
            X.16V r1 = X.16V.A06
            r0 = 0
            if (r2 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x008b
            boolean r0 = A09(r5)
            if (r0 == 0) goto L_0x008b
            X.1Av r3 = X.1Au.A00(r5)
            r2 = 0
            X.16V r0 = X.AnonymousClass0eD.A01(r5)
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0086
            r0 = 3
            if (r1 != r0) goto L_0x008b
            X.0xa r1 = r3.A01
            java.lang.String r0 = "creator_account_fb_destination_backfilling_completed"
        L_0x0035:
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x008b
            r0 = 6
            X.WxV r1 = new X.WxV
            r1.<init>(r5, r0)
            java.lang.Class<X.A8m> r0 = X.C39772A8m.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.A8m r1 = (X.C39772A8m) r1
            com.facebook.common.callercontext.CallerContext r0 = A00
            X.8jo r3 = r1.A00(r0)
            r1 = 0
            if (r3 == 0) goto L_0x0084
            java.lang.String r2 = r3.A01
        L_0x0054:
            java.lang.String r0 = "FB_USER"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x007b
            if (r3 == 0) goto L_0x0079
            java.lang.String r2 = r3.A01
        L_0x0060:
            java.lang.String r0 = "FB_ADDITIONAL_PROFILE"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x007b
            if (r3 == 0) goto L_0x006c
        L_0x006a:
            java.lang.String r1 = r3.A01
        L_0x006c:
            java.lang.String r0 = "FB_PAGE"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x008b
            if (r3 == 0) goto L_0x00c9
            java.lang.String r0 = r3.A00
        L_0x0078:
            return r0
        L_0x0079:
            r2 = r1
            goto L_0x0060
        L_0x007b:
            java.lang.String r1 = r3.A02
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006a
            return r1
        L_0x0084:
            r2 = r1
            goto L_0x0054
        L_0x0086:
            X.0xa r1 = r3.A01
            java.lang.String r0 = "personal_account_fb_page_id_backfilling_completed"
            goto L_0x0035
        L_0x008b:
            boolean r0 = A05(r5)
            if (r0 != 0) goto L_0x00aa
            boolean r0 = A02(r5)
            if (r0 != 0) goto L_0x00aa
            X.2Ly r2 = X.2Lv.A00(r5)
            com.facebook.common.callercontext.CallerContext r1 = A00
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            fxcache.model.FxCalAccount r0 = r2.A01(r1, r0)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.A07
        L_0x00a7:
            if (r0 != 0) goto L_0x0078
            return r4
        L_0x00aa:
            X.9JK r1 = A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.9F4 r0 = X.AnonymousClass9F3.A00(r5)
            X.9F7 r0 = X.AnonymousClass9F4.A00(r0)
            java.lang.Object r0 = r0.Au3(r1)
            X.Dfh r0 = (X.C46478Dfh) r0
            if (r0 == 0) goto L_0x00c9
            X.9Gd r0 = r0.A00
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = r0.A00(r1, r5)
            goto L_0x00a7
        L_0x00c9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PU.A01(com.instagram.common.session.UserSession):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r1 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0.A00 == null) goto L_0x001f;
     */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.instagram.common.session.UserSession r3) {
        /*
            X.9JK r1 = A01
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.9F4 r0 = X.AnonymousClass9F3.A00(r3)
            if (r0 == 0) goto L_0x001f
            X.9F7 r0 = X.AnonymousClass9F4.A00(r0)
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r0.Au3(r1)
            X.Dfh r0 = (X.C46478Dfh) r0
            if (r0 == 0) goto L_0x001f
            X.9Gd r0 = r0.A00
            r2 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            boolean r0 = A05(r3)
            if (r0 == 0) goto L_0x0027
            return r2
        L_0x0027:
            X.16V r1 = X.AnonymousClass0eD.A01(r3)
            X.16V r0 = X.16V.A06
            if (r1 != r0) goto L_0x003a
            boolean r0 = A04(r3)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            if (r2 != 0) goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            return r0
        L_0x003a:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            X.4Cl r0 = r0.A03
            java.lang.String r0 = r0.BaE()
            if (r0 == 0) goto L_0x004f
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0050
        L_0x004f:
            r0 = 1
        L_0x0050:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PU.A02(com.instagram.common.session.UserSession):boolean");
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingUtil", replaceWith = @ReplaceWith(expression = "isBusinessAccount", imports = {}))
    public static final boolean A05(UserSession userSession) {
        if (AnonymousClass0t1.A01.A01(userSession).A0J() == 16V.A05) {
            return true;
        }
        return false;
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A09(UserSession userSession) {
        16V A0J = AnonymousClass0t1.A01.A01(userSession).A0J();
        16V r1 = 16V.A06;
        if (A0J != r1 || (AnonymousClass0eD.A01(userSession) == r1 && A00(userSession) == AnonymousClass05K.A01)) {
            return 2Lv.A00(userSession).A03(A00, "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check");
        }
        return false;
    }

    public static final boolean A0C(AnonymousClass3Q2 r0, 1us r1) {
        if (r0.A5T) {
            return true;
        }
        if (r1 == null || !r1.CT1()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @kotlin.ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r3) {
        /*
            java.lang.Boolean r0 = X.AnonymousClass8PV.A00(r3)
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x001d
            boolean r0 = X.C363038ix.A01(r3)
            if (r0 == 0) goto L_0x001b
            X.8je r1 = X.C363378jd.A08
            com.facebook.common.callercontext.CallerContext r0 = A00
            boolean r0 = r1.A04(r0, r3)
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            return r2
        L_0x001d:
            boolean r0 = A06(r3)
            if (r0 != 0) goto L_0x001b
            boolean r0 = A05(r3)
            if (r0 != 0) goto L_0x001c
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8PU.A03(com.instagram.common.session.UserSession):boolean");
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A08(UserSession userSession) {
        int ordinal;
        if (!AnonymousClass8PV.A00(userSession).booleanValue()) {
            0eE r4 = AnonymousClass0t1.A01;
            16V A0J = r4.A01(userSession).A0J();
            if (A0J == null) {
                return false;
            }
            int ordinal2 = A0J.ordinal();
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    if (ordinal2 != 1 || 00l.A0W(A01(userSession))) {
                        return false;
                    }
                } else if (!AnonymousClass8PV.A00(userSession).booleanValue()) {
                    16V A0J2 = r4.A01(userSession).A0J();
                    if (A0J2 == null) {
                        ordinal = -1;
                    } else {
                        ordinal = A0J2.ordinal();
                    }
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 1) {
                                return A09(userSession);
                            }
                            return false;
                        } else if (A09(userSession) || A02(userSession)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                return true;
            }
            return A02(userSession);
        }
        return C363378jd.A08.A04(A00, userSession);
    }

    @Deprecated(message = "Use CrosspostingAccountLinkingManager", replaceWith = @ReplaceWith(expression = "getCrosspostingDestination", imports = {}))
    public static final boolean A0B(UserSession userSession, boolean z) {
        boolean A002;
        if (AnonymousClass8PV.A00(userSession).booleanValue()) {
            if (!z) {
                return false;
            }
            A002 = C363378jd.A08.A04(A00, userSession);
        } else if (A07(userSession) || !z) {
            return false;
        } else {
            A002 = C46508DgB.A00(userSession);
        }
        if (!A002) {
            return true;
        }
        return false;
    }
}
