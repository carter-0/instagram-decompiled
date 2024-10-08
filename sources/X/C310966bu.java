package X;

import android.content.Context;

/* renamed from: X.6bu  reason: invalid class name and case insensitive filesystem */
public final class C310966bu extends C229902ob {
    public final Context A00;
    public final boolean A01;
    public final C229822oN A02;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2n2] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C310966bu(android.content.Context r14, X.1Bk r15, com.instagram.common.session.UserSession r16, X.AnonymousClass4DU r17, X.C229842oQ r18, X.C229822oN r19) {
        /*
            r13 = this;
            r12 = 1
            r0 = 7
            r8 = r18
            X.0qQ.A0B(r8, r0)
            X.6bv r6 = new X.6bv
            r6.<init>()
            r10 = 0
            r9 = 432(0x1b0, float:6.05E-43)
            r3 = r13
            r4 = r15
            r5 = r16
            r7 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12)
            r0 = r19
            r13.A02 = r0
            r13.A00 = r14
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318913470339824(0x8107dc00071af0, double:3.031565350944492E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r13.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310966bu.<init>(android.content.Context, X.1Bk, com.instagram.common.session.UserSession, X.4DU, X.2oQ, X.2oN):void");
    }

    public final String A03() {
        return "";
    }

    public final /* bridge */ /* synthetic */ C254523sc A01(Object obj, Object obj2) {
        Boolean bool;
        String str;
        C255773uh r14 = (C255773uh) obj;
        0qQ.A0B(r14, 0);
        if (this.A01) {
            1Ua A002 = 1UX.A00(this.A00, this.A04);
            String str2 = r14.A0j;
            if (str2 == null) {
                str2 = "";
            }
            bool = Boolean.valueOf(A002.A03(002.A0R("NETEGO_VPV_KEY_PREFIX", str2)));
        } else {
            bool = null;
        }
        String str3 = r14.A0j;
        0qQ.A07(str3);
        String A0T = r14.A0T();
        AnonymousClass4DU r1 = this.A07;
        C292915jj r5 = new C292915jj((Long) null, str3, (String) null, (String) null, A0T, r1.getModuleName(), 64478);
        C250963mL r3 = r14.A0e;
        if (r3 == C250963mL.NETEGO_BAKEOFF) {
            str = "NETEGO_BAKEOFF";
        } else {
            C270064g8 r4 = r14.A0f;
            if (r4 != null) {
                r5.A03 = "NETEGO_AD4AD_IN_STORY";
                C239603Hc r32 = r4.A00;
                String AYU = r32.AYU();
                if (AYU == null) {
                    AYU = "";
                }
                r5.A01 = AYU;
                String C9L = r32.C9L();
                if (C9L == null) {
                    C9L = "";
                }
                r5.A02 = C9L;
            } else if (r14.A1U()) {
                r5.A03 = "NETEGO_SUGGESTED_USERS";
                C270074g9 r0 = r14.A09;
                if (r0 != null) {
                    AnonymousClass3IN r33 = r0.A00;
                    r5.A02 = r33.A06;
                    r5.A04 = r33.A04;
                    r5.A01 = r33.A03;
                }
            } else if (r14.A1S()) {
                str = "NETEGO_SUGGESTED_CLIPS";
            } else if (r14.A1T()) {
                str = "NETEGO_RECON_PRODUCTS_FOR_YOU";
            } else if (r3 == C250963mL.NETEGO_VISIT_THESE_SHOPS_AGAIN) {
                str = "NETEGO_RECON_CONTINUE_SHOPPING";
            } else if (r3 == C250963mL.NETEGO_BLOKS) {
                str = "NETEGO_BLOKS";
            } else if (r14.A1Q()) {
                str = "NETEGO_TRENDING_PROMPTS_IN_STORY";
            } else if (r3 == C250963mL.NETEGO_STORY_CREATION_UPSELL) {
                str = "NETEGO_STORY_CREATION_UPSELL";
            } else if (r3 == C250963mL.NETEGO_QUALITY_SURVEY) {
                str = "NETEGO_QUALITY_SURVEY";
            } else if (r3 == C250963mL.NETEGO_INSIGHTS_GROWTH) {
                str = "NETEGO_INSIGHTS_GROWTH";
            } else if (r3 == C250963mL.NETEGO_IG_ADS_CONSENT_GROWTH) {
                str = "NETEGO_IG_ADS_CONSENT_GROWTH";
            }
            C254523sc A022 = GTA.A02(this.A04, r1, r14, "impression");
            A022.A02();
            A022.A1u = true;
            A022.A0w = r5;
            A022.A14 = bool;
            return A022;
        }
        r5.A03 = str;
        C254523sc A0222 = GTA.A02(this.A04, r1, r14, "impression");
        A0222.A02();
        A0222.A1u = true;
        A0222.A0w = r5;
        A0222.A14 = bool;
        return A0222;
    }

    public final String A02() {
        return null;
    }

    public final String A04() {
        return "story_netego";
    }

    public final /* bridge */ /* synthetic */ void A05(Context context, C254363sM r4, Object obj, String str) {
        C255773uh r5 = (C255773uh) obj;
        if (this.A01 && r5 != null) {
            Context context2 = this.A00;
            String str2 = r5.A0j;
            if (str2 == null) {
                str2 = "";
            }
            super.A05(context2, r4, r5, str2);
        }
    }
}
