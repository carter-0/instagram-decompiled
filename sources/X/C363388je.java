package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.8je  reason: invalid class name and case insensitive filesystem */
public final class C363388je {
    public static final C363378jd A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C363378jd) userSession.A01(C363378jd.class, new AnonymousClass9L5(userSession, 29));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
        if (r1 == 0) goto L_0x008a;
     */
    @kotlin.Deprecated(message = "Linkage Cache won't refresh with Service Cache and might be stale.", replaceWith = @kotlin.ReplaceWith(expression = "isDestinationValid", imports = {}))
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(com.facebook.common.callercontext.CallerContext r11, com.instagram.common.session.UserSession r12) {
        /*
            r10 = this;
            r3 = 0
            X.0qQ.A0B(r12, r3)
            r2 = 1
            X.8jd r1 = A00(r12)
            com.instagram.common.session.UserSession r0 = r1.A00
            java.lang.Integer r0 = X.C363038ix.A00(r0)
            int r0 = r0.intValue()
            r5 = r11
            if (r0 == r3) goto L_0x004f
            if (r0 == r2) goto L_0x001a
            r0 = 0
        L_0x0019:
            return r0
        L_0x001a:
            X.0eM r0 = r1.A04
            java.lang.Object r4 = r0.getValue()
            X.8jf r4 = (X.C363398jf) r4
            com.instagram.common.session.UserSession r3 = r4.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330466931917452(0x81125e0000428c, double:3.0388718065682395E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0040
            X.5wF r0 = r4.A00(r11)
            java.lang.String r0 = r0.A03
            int r1 = r0.length()
            r0 = 0
            if (r1 <= 0) goto L_0x0019
            r0 = 1
            return r0
        L_0x0040:
            X.0eM r0 = r4.A01
            java.lang.Object r1 = r0.getValue()
            X.2Ly r1 = (X.2Ly) r1
            java.lang.String r0 = "ig_android_linking_cache_ig_to_fb_crossposting_eligibility_check"
            boolean r0 = r1.A03(r11, r0)
            return r0
        L_0x004f:
            X.0eM r0 = r1.A03
            java.lang.Object r2 = r0.getValue()
            X.A5I r2 = (X.A5I) r2
            java.lang.String r7 = r11.A02
            X.0qQ.A07(r7)
            java.lang.String r6 = "ig_android_ig_to_fb_crossposting"
            java.lang.String r8 = "crossposting"
            java.lang.String r9 = "loading"
            X.9JK r4 = new X.9JK
            r4.<init>((com.facebook.common.callercontext.CallerContext) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9)
            X.0eM r0 = r2.A01
            java.lang.Object r0 = r0.getValue()
            X.9F7 r0 = (X.AnonymousClass9F7) r0
            java.lang.Object r0 = r0.Au3(r4)
            X.Dfh r0 = (X.C46478Dfh) r0
            if (r0 == 0) goto L_0x008a
            X.9Gd r1 = r0.A00
            if (r1 == 0) goto L_0x008a
            com.instagram.common.session.UserSession r0 = r2.A00
            java.lang.String r0 = r1.A00(r4, r0)
            if (r0 == 0) goto L_0x008a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x008b
        L_0x008a:
            r0 = 1
        L_0x008b:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363388je.A04(com.facebook.common.callercontext.CallerContext, com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A01(C299935wF r3) {
        Object obj;
        Iterator it = r3.A06.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass805) obj).A01, "story")) {
                break;
            }
        }
        AnonymousClass805 r2 = (AnonymousClass805) obj;
        if (r2 != null) {
            return r2.A02;
        }
        0KC.A0C("CrosspostingAccountLinkingManager", "(isDestinationEligibleForStory) storyToXpostEligibility==null");
        return true;
    }

    public static final boolean A02(C299935wF r2) {
        if (r2.A02 == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C299935wF r1) {
        if (r1.A03.length() > 0) {
            return true;
        }
        return false;
    }
}
