package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LIn  reason: case insensitive filesystem */
public abstract class C64007LIn {
    public static final void A00(JZZ jzz, AnonymousClass818 r6, UserSession userSession, String str, String str2, List list, boolean z) {
        0qQ.A0B(list, 6);
        16V A0J = AnonymousClass7TF.A0Q(userSession).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "cxp_ig_client_xpost_interoperability_platform");
        if (str == null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        if (A0e.isSampled() && 182.A06(0Tu.A05, userSession, 36328800484605531L)) {
            A0e.AAJ(AnonymousClass9PN.A01(), str);
            DbS.A1I(A0e, "primary_click");
            A0e.A8M(jzz, AnonymousClass000.A00(5313));
            DbS.A1F(r6, A0e);
            A0e.A7p("session_xposting_enabled", JTP.A0g(A0e, AnonymousClass000.A00(5273), A0J.A01, z));
            A0e.A9H("auto_xposting_settings", 0Yt.A0E());
            A0e.AAe("ineligibility_errors", list);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2.A01(r1, "reason");
        r3.A02(r2, "contentIneligibilityError");
        r8.add(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass818 r7, com.instagram.common.session.UserSession r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            r5 = r8
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0q(r8, r0)
            if (r9 == 0) goto L_0x0064
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.Jqn r3 = new X.Jqn
            r3.<init>()
            X.Jql r2 = new X.Jql
            r2.<init>()
            int r4 = r9.intValue()
            switch(r4) {
                case 0: goto L_0x0022;
                case 1: goto L_0x004f;
                case 2: goto L_0x0025;
                case 3: goto L_0x004f;
                case 4: goto L_0x004f;
                case 5: goto L_0x004f;
                case 6: goto L_0x0028;
                case 7: goto L_0x004f;
                case 8: goto L_0x004f;
                case 9: goto L_0x004f;
                case 10: goto L_0x004f;
                case 11: goto L_0x004f;
                case 12: goto L_0x002b;
                case 13: goto L_0x004f;
                case 14: goto L_0x002e;
                case 15: goto L_0x004f;
                case 16: goto L_0x0031;
                case 17: goto L_0x004f;
                case 18: goto L_0x004f;
                case 19: goto L_0x0034;
                case 20: goto L_0x004f;
                case 21: goto L_0x004f;
                case 22: goto L_0x004f;
                case 23: goto L_0x004f;
                case 24: goto L_0x004f;
                case 25: goto L_0x004f;
                case 26: goto L_0x0037;
                case 27: goto L_0x004f;
                case 28: goto L_0x004f;
                case 29: goto L_0x003a;
                case 30: goto L_0x004f;
                case 31: goto L_0x004f;
                case 32: goto L_0x003d;
                case 33: goto L_0x0040;
                case 34: goto L_0x004f;
                case 35: goto L_0x004f;
                case 36: goto L_0x004f;
                default: goto L_0x001d;
            }
        L_0x001d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0022:
            X.KkY r1 = X.C62672KkY.ARCHIVE_FEED_STICKER
            goto L_0x0042
        L_0x0025:
            X.KkY r1 = X.C62672KkY.BRANDED_CONTENT
            goto L_0x0042
        L_0x0028:
            X.KkY r1 = X.C62672KkY.COMMENT_SHARE_STICKER
            goto L_0x0042
        L_0x002b:
            X.KkY r1 = X.C62672KkY.IGTV_STICKER
            goto L_0x0042
        L_0x002e:
            X.KkY r1 = X.C62672KkY.IMMERSIVE_MENTION_RESHARE
            goto L_0x0042
        L_0x0031:
            X.KkY r1 = X.C62672KkY.MAGIC_MOD
            goto L_0x0042
        L_0x0034:
            X.KkY r1 = X.C62672KkY.MENTION_RESHARE
            goto L_0x0042
        L_0x0037:
            X.KkY r1 = X.C62672KkY.PRODUCT_SHARE
            goto L_0x0042
        L_0x003a:
            X.KkY r1 = X.C62672KkY.REELS_RESHARE
            goto L_0x0042
        L_0x003d:
            X.KkY r1 = X.C62672KkY.STORY_TEMPLATE
            goto L_0x0042
        L_0x0040:
            X.KkY r1 = X.C62672KkY.STORY_TEMPLATE_RESHARE_XPOSTING_INELIGIBLE_PINNED_ITEMS
        L_0x0042:
            java.lang.String r0 = "reason"
            r2.A01(r1, r0)
            java.lang.String r0 = "contentIneligibilityError"
            r3.A02(r2, r0)
            r8.add(r3)
        L_0x004f:
            X.Jqn r3 = new X.Jqn
            r3.<init>()
            X.Jqm r2 = new X.Jqm
            r2.<init>()
            r0 = 7
            if (r4 == r0) goto L_0x006e
            r0 = 35
            if (r4 == r0) goto L_0x006e
            r0 = 36
            if (r4 == r0) goto L_0x006e
        L_0x0064:
            X.JZZ r3 = X.JZZ.STORY
            r4 = r7
            r6 = r10
            r7 = r11
            r9 = r12
            A00(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x006e:
            X.KkG r1 = X.C62654KkG.MISSING_DESTINATION
            java.lang.String r0 = "reason"
            r2.A01(r1, r0)
            java.lang.String r0 = "destinationIneligibilityError"
            r3.A02(r2, r0)
            r8.add(r3)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64007LIn.A01(X.818, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }
}
