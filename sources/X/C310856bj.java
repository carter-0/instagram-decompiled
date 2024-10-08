package X;

import android.content.Context;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;

/* renamed from: X.6bj  reason: invalid class name and case insensitive filesystem */
public final class C310856bj extends C230372pW {
    public final Context A00;
    public final UserSession A01;
    public final C310006aH A02;
    public final AnonymousClass4DU A03;
    public final C309986aF A04;
    public final C310666bQ A05;
    public final AnonymousClass2yG A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C310856bj(android.content.Context r4, X.1Bk r5, X.C310006aH r6, X.C309986aF r7, X.C310666bQ r8, X.AnonymousClass2yG r9) {
        /*
            r3 = this;
            X.6bP r2 = r8.A04
            com.instagram.common.session.UserSession r1 = r8.A01
            X.6bk r0 = new X.6bk
            r0.<init>(r1, r2)
            r3.<init>(r5, r0)
            r3.A00 = r4
            r3.A05 = r8
            r3.A04 = r7
            r3.A06 = r9
            r3.A02 = r6
            X.4DU r0 = r8.A02
            r3.A03 = r0
            r3.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310856bj.<init>(android.content.Context, X.1Bk, X.6aH, X.6aF, X.6bQ, X.2yG):void");
    }

    private final void A00(C255773uh r15, AnonymousClass6YY r16, Boolean bool, String str) {
        UserSession userSession = this.A01;
        C255773uh r10 = r15;
        String A0U = r15.A0U(userSession);
        if (A0U != null) {
            this.A06.EGR(C230472pg.SPONSORED, C233162v9.SEEN_STATE, C230432pc.STORIES, A0U);
        }
        AnonymousClass4DU r1 = this.A03;
        C310666bQ r13 = this.A05;
        AnonymousClass3BQ r6 = r13.A03;
        AnonymousClass6YY r12 = r16;
        C250973mM r5 = r12.A00;
        AnonymousClass6KG A002 = AnonymousClass6KF.A00(r1, r5.A0H, r6);
        C254523sc A022 = GTA.A02(userSession, A002, r15, str);
        A022.A02();
        A022.A1u = bool;
        String str2 = AnonymousClass1QI.A00.A02.A00;
        if (str2 != null) {
            A022.A65 = str2;
        }
        1Xj r4 = r15.A0b;
        if (r4 != null) {
            A022.A8B = C231122qu.A0R(userSession, r4);
        }
        A022.A1f = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36313437387229161L));
        AnonymousClass3PI.A08(A022, r15, r12, r13);
        AnonymousClass3PI r7 = AnonymousClass3PI.A00;
        C309986aF r0 = this.A04;
        String str3 = r15.A0k;
        0qQ.A07(str3);
        r7.A0B(this.A00, A022, r10, (AnonymousClass6UP) r0.A05.get(str3), r12, r13);
        A022.A7U = AnonymousClass6Q2.A00(userSession, r15, r5, r6, r12.A02);
        C233822wX.A0A(userSession, A022, r15.A09());
        if (C228342lQ.A02(userSession)) {
            A022.A4X = C228342lQ.A01(1Au.A00(userSession)).toString();
            A022.A4Y = C228342lQ.A00(userSession).toString();
        }
        C234002wp r14 = new C234002wp(userSession);
        if (r14.A04()) {
            A022.A1P = Boolean.valueOf(r14.A05(r4));
            A022.A1s = Boolean.valueOf(r14.A07(r4));
        }
        C233822wX.A0I(userSession, A022, A002, AnonymousClass05K.A01);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        AnonymousClass47L r1;
        C310006aH r11;
        Long l;
        long j;
        String str;
        Long l2;
        Integer num;
        Long l3;
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        C255773uh r13 = (C255773uh) obj;
        AnonymousClass6YY r14 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r13, 0);
        0qQ.A0B(r14, 1);
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36311998572790617L));
        1Xj r5 = r13.A0b;
        AndroidLink A022 = AnonymousClass47K.A02(this.A00, userSession, r5, 0, false);
        if (A022 != null) {
            r1 = C271714jT.A01(A022);
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE) {
            AnonymousClass59S.A06("STORIES_AD_IMPRESSION", userSession, r5);
        }
        A00(r13, r14, valueOf, "impression");
        if (r5 != null) {
            C2817059b.A00(userSession).A02(r5, r13.A0U(userSession));
        }
        C250973mM r7 = r14.A00;
        if (C297785sK.A0l(r7) && (r11 = this.A02) != null) {
            UserSession userSession2 = r11.A03;
            AnonymousClass0iw r8 = r11.A01;
            0wc A012 = AnonymousClass0kN.A01(r8, userSession2);
            0Aj A002 = A012.A00(A012.A00, "instagram_ad_pivots_carousel_impression");
            r5.getClass();
            String A07 = C231122qu.A07(userSession2, r5);
            Boolean bool = null;
            if (A07 != null) {
                l = 00y.A0n(10, A07);
            } else {
                l = null;
            }
            if (A002.isSampled() && l != null) {
                A002.A9F("ad_id", l);
                C270424gi r0 = r11.A00;
                if (r0 != null) {
                    j = (long) r0.CMI(r7);
                } else {
                    j = 0;
                }
                A002.A9F("chaining_position", Long.valueOf(j));
                C249763kK r52 = r11.A04;
                A002.AAJ("chaining_session_id", r52.getSessionId());
                A002.AAJ("client_session_id", r52.getSessionId());
                A002.AAJ("contextual_ads_category", "");
                A002.AAe("position", 0sr.A1M(new Long[]{0L, Long.valueOf((long) r7.A01)}));
                Reel reel = r7.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A002.AAJ("trigger_type", str);
                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                if (intentAwareAdsInfo2 == null || (str5 = intentAwareAdsInfo2.A07) == null) {
                    l2 = null;
                } else {
                    l2 = 00y.A0n(10, str5);
                }
                A002.A9F("hscroll_seed_ad_id", l2);
                A002.AAJ("container_module", r8.getModuleName());
                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                if (intentAwareAdsInfo3 != null) {
                    num = intentAwareAdsInfo3.A02;
                } else {
                    num = null;
                }
                A002.AAJ("multi_ads_type", String.valueOf(num));
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 == null || (num2 = intentAwareAdsInfo4.A02) == null) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf((long) num2.intValue());
                }
                A002.A9F("multi_ads_type_number", l3);
                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                if (intentAwareAdsInfo5 != null) {
                    str2 = intentAwareAdsInfo5.A06;
                } else {
                    str2 = null;
                }
                A002.AAJ("multi_ads_id", str2);
                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                if (intentAwareAdsInfo6 != null) {
                    str3 = intentAwareAdsInfo6.A06;
                } else {
                    str3 = null;
                }
                A002.AAJ("multi_ads_unit_id", str3);
                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                if (intentAwareAdsInfo7 != null) {
                    str4 = intentAwareAdsInfo7.A04;
                } else {
                    str4 = null;
                }
                A002.AAJ("insertion_mechanism", str4);
                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                if (intentAwareAdsInfo8 != null) {
                    bool = intentAwareAdsInfo8.A01;
                }
                A002.A7p("is_seed_ad_multi_ads_eligible", bool);
                A002.AAJ("tracking_token", r13.ByO(userSession2));
                A002.Cgf();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C255773uh r3 = (C255773uh) obj;
        AnonymousClass6YY r4 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        A00(r3, r4, (Boolean) null, "sub_impression");
    }
}
