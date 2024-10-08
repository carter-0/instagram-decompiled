package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6aI  reason: invalid class name and case insensitive filesystem */
public final class C310016aI extends C252233om implements C232842uX {
    public int A00;
    public C310006aH A01;
    public String A02;
    public boolean A03;
    public final Context A04;
    public final 0wc A05;
    public final UserSession A06;
    public final C230562pp A07;
    public final AnonymousClass3BQ A08;
    public final C310036aK A09;
    public final C310026aJ A0A;
    public final C310046aL A0B;
    public final C230262pI A0C;
    public final User A0D;
    public final C249763kK A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Map A0I = new LinkedHashMap();
    public final Map A0J = new LinkedHashMap();
    public final Set A0K;
    public final C309986aF A0L;

    /* JADX WARNING: type inference failed for: r0v18, types: [X.2uc, java.lang.Object] */
    public C310016aI(Context context, UserSession userSession, AnonymousClass4DU r19, AnonymousClass3BQ r20, C310006aH r21, C309986aF r22, C249763kK r23, String str, String str2, String str3) {
        C232872ua r7;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        AnonymousClass3BQ r5 = r20;
        0qQ.A0B(r5, 4);
        String str4 = str;
        0qQ.A0B(str4, 6);
        C309986aF r10 = r22;
        0qQ.A0B(r10, 7);
        this.A04 = context;
        this.A06 = userSession2;
        this.A08 = r5;
        C249763kK r11 = r23;
        this.A0E = r11;
        this.A0H = str4;
        this.A0L = r10;
        String str5 = str2;
        this.A0F = str5;
        String str6 = str3;
        this.A0G = str6;
        this.A01 = r21;
        C230262pI r3 = new C230262pI();
        this.A0C = r3;
        this.A0K = new LinkedHashSet();
        C310026aJ r9 = new C310026aJ(r19, r5);
        this.A0A = r9;
        this.A05 = AnonymousClass0kN.A01(r9, userSession2);
        this.A0D = 0eE.A00(userSession2).A00();
        this.A09 = new C310036aK(userSession2, r9, r10, r11, str4, str6);
        this.A0B = new C310046aL();
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, userSession2, 36311998572659543L);
        boolean A063 = 182.A06(r4, userSession2, 36311998572856154L);
        boolean A064 = 182.A06(r4, userSession2, 36311998572790617L);
        boolean A065 = 182.A06(r4, userSession2, 36311998573052765L);
        if (A062 || A063 || A064 || A065) {
            r7 = new C232872ua(userSession2, new Object(), new C54384HAz(userSession2, A062, A063, A064, A065), r9);
        } else {
            r7 = null;
        }
        this.A07 = new C230562pp(new C232872ua(userSession2, (C232892uc) null, this, r9), r7, new AnonymousClass57G(userSession2, this, r9));
        r3.A01 = r5.A00;
        r3.A00 = str5;
    }

    public final void A05(0wc r6, UserSession userSession, C250973mM r8, Boolean bool, String str, String str2, String str3, String str4, String str5, double d, long j) {
        Long l;
        Long l2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r8, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r6, 8);
        C255773uh A082 = r8.A08(userSession);
        if (A082.A17()) {
            1Ln r2 = new 1Ln(r6.A00(r6.A00, "ig_live_reaction"), 230);
            if (r2.A00.isSampled()) {
                GT8 gt8 = (GT8) this.A0I.get(A082.CFY());
                r2.A0Q("a_pk", Long.valueOf(j));
                r2.A0m(str);
                r2.A0R(AnonymousClass000.A00(360), str2);
                r2.A0R("support_tier", str3);
                r2.A0R("tray_session_id", this.A0H);
                r2.A0R("viewer_session_id", this.A0E.getSessionId());
                r2.A0P("live_position", Double.valueOf(d));
                r2.A0R("story_ranking_token", this.A0G);
                if (gt8 != null) {
                    l = Long.valueOf((long) gt8.A00);
                } else {
                    l = null;
                }
                r2.A0Q("session_reel_counter", l);
                if (gt8 != null) {
                    l2 = Long.valueOf((long) gt8.A04.A0E);
                } else {
                    l2 = null;
                }
                r2.A0Q("tray_position", l2);
                r2.A0R("reaction_unicode", str4);
                r2.A0R("avatar_reaction_template_id", str5);
                if (str5 == null) {
                    bool = null;
                }
                r2.A0O("avatar_reaction_is_animated", bool);
                r2.Cgf();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(com.instagram.model.reels.Reel r11, X.C255773uh r12, java.lang.String r13, java.lang.String r14, int r15) {
        /*
            r10 = this;
            r0 = 1
            X.0qQ.A0B(r12, r0)
            r0 = 4
            X.0qQ.A0B(r14, r0)
            r5 = 0
            r9 = 0
            com.instagram.common.session.UserSession r4 = r10.A06
            X.6aJ r0 = r10.A0A
            r0.A00 = r11
            X.0wc r0 = X.AnonymousClass0kN.A01(r0, r4)
            X.1Xj r6 = r12.A0b
            X.1Ln r3 = X.1Ln.A0I(r0)     // Catch:{ Exception -> 0x0139 }
            X.0Aj r0 = r3.A00     // Catch:{ Exception -> 0x0139 }
            boolean r0 = r0.isSampled()     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x0141
            X.1Ns r0 = r11.A0W     // Catch:{ Exception -> 0x0139 }
            r7 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = r0.getId()     // Catch:{ Exception -> 0x0139 }
            if (r1 == 0) goto L_0x0044
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x0044
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0139 }
        L_0x003a:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "a_pk"
            r3.A0Q(r0, r1)     // Catch:{ Exception -> 0x0139 }
            goto L_0x0047
        L_0x0044:
            r0 = 0
            goto L_0x003a
        L_0x0047:
            java.lang.String r2 = ""
            if (r6 == 0) goto L_0x005b
            com.instagram.user.model.User r0 = r6.A2A(r4)     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x005b
            com.instagram.user.model.FollowStatus r0 = r0.B6o()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x0139 }
            if (r1 != 0) goto L_0x005c
        L_0x005b:
            r1 = r2
        L_0x005c:
            java.lang.String r0 = "follow_status"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "is_coming_from"
            r3.A0R(r0, r2)     // Catch:{ Exception -> 0x0139 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "is_context_sheet"
            r3.A0O(r0, r1)     // Catch:{ Exception -> 0x0139 }
            if (r6 == 0) goto L_0x0077
            java.lang.String r0 = r6.getId()     // Catch:{ Exception -> 0x0139 }
            if (r0 != 0) goto L_0x0078
        L_0x0077:
            r0 = r2
        L_0x0078:
            r3.A0m(r0)     // Catch:{ Exception -> 0x0139 }
            if (r6 == 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r0 = 0
            goto L_0x0088
        L_0x0081:
            X.1iA r0 = r6.BR7()     // Catch:{ Exception -> 0x0139 }
            int r0 = r0.A00     // Catch:{ Exception -> 0x0139 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0139 }
        L_0x0088:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "m_t"
            r3.A0Q(r0, r1)     // Catch:{ Exception -> 0x0139 }
            r0 = 53
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0139 }
            r3.A0R(r0, r2)     // Catch:{ Exception -> 0x0139 }
            java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "post_id"
            r3.A0Q(r0, r6)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r11.getId()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "reel_id"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            long r0 = (long) r15     // Catch:{ Exception -> 0x0139 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "reel_position"
            r3.A0Q(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.util.List r0 = r11.A0O(r4)     // Catch:{ Exception -> 0x0139 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0139 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0139 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "reel_size"
            r3.A0Q(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r11.A0H(r4)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "reel_type"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            int r0 = r10.A00     // Catch:{ Exception -> 0x0139 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0139 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "session_reel_counter"
            r3.A0Q(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = "stories"
            java.lang.String r0 = "source_of_action"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "sticker_id"
            r3.A0R(r0, r14)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "sticker_type"
            r3.A0R(r0, r13)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = r10.A0G     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x00f3
            r2 = r0
        L_0x00f3:
            java.lang.String r0 = "story_ranking_token"
            r3.A0R(r0, r2)     // Catch:{ Exception -> 0x0139 }
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "time_elapsed"
            r3.A0P(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "time_remaining"
            r3.A0P(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "tray_pos_excl_own_story"
            r3.A0Q(r0, r6)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "tray_position"
            r3.A0Q(r0, r6)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r10.A0H     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "tray_session_id"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r4.A06     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "user_id"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            X.3kK r0 = r10.A0E     // Catch:{ Exception -> 0x0139 }
            java.lang.String r1 = r0.getSessionId()     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "viewer_session_id"
            r3.A0R(r0, r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "bloks_app"
            r3.A0R(r0, r5)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "attribution_type"
            r3.A0S(r0, r5)     // Catch:{ Exception -> 0x0139 }
            r3.Cgf()     // Catch:{ Exception -> 0x0139 }
            return
        L_0x0139:
            r2 = move-exception
            java.lang.String r1 = "ReelViewerLogger#reportLinkStickerTap"
            java.lang.String r0 = "Failed to log link sticker tap"
            X.0wb.A06(r1, r0, r2)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310016aI.A07(com.instagram.model.reels.Reel, X.3uh, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (X.0qQ.A0K(r8, "-1") != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x024f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.C255773uh r20, X.C250973mM r21, X.C309426Yf r22, java.lang.Integer r23, java.lang.String r24) {
        /*
            r19 = this;
            r0 = 4
            r15 = r24
            X.0qQ.A0B(r15, r0)
            r18 = r20
            boolean r0 = r18.CWu()
            if (r0 != 0) goto L_0x0015
            boolean r0 = r18.A17()
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            return
        L_0x0015:
            r0 = r21
            com.instagram.model.reels.Reel r6 = r0.A0H
            X.1Ns r14 = r6.A0W
            if (r14 == 0) goto L_0x0014
            r7 = r19
            java.util.Map r1 = r7.A0I
            java.lang.String r0 = r18.CFY()
            java.lang.Object r9 = r1.get(r0)
            X.GT8 r9 = (X.GT8) r9
            if (r9 == 0) goto L_0x0014
            r0 = r18
            X.1Xj r5 = r0.A0b
            X.4gL r12 = r0.A0c
            java.lang.String r13 = ""
            r4 = 0
            if (r5 == 0) goto L_0x0048
            int r0 = r5.A12()     // Catch:{ UnsupportedOperationException -> 0x0048 }
            java.lang.String r8 = X.AnonymousClass6LX.A00(r4, r0)     // Catch:{ UnsupportedOperationException -> 0x0048 }
            java.lang.String r0 = "-1"
            boolean r0 = X.0qQ.A0K(r8, r0)     // Catch:{ UnsupportedOperationException -> 0x0048 }
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r8 = r13
        L_0x0049:
            com.instagram.common.session.UserSession r0 = r7.A06
            X.6aJ r3 = r7.A0A
            r3.A00 = r6
            X.0wc r2 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r1 = "reel_media_pause"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            r0 = 365(0x16d, float:5.11E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r1, r0)
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0014
            int r0 = r9.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "session_reel_counter"
            r2.A0Q(r0, r1)
            X.3kK r0 = r7.A0E
            java.lang.String r1 = r0.getSessionId()
            java.lang.String r0 = "viewer_session_id"
            r2.A0R(r0, r1)
            java.lang.String r1 = r7.A0H
            java.lang.String r0 = "tray_session_id"
            r2.A0R(r0, r1)
            int r0 = r9.A00()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_position"
            r2.A0Q(r0, r1)
            com.instagram.model.reels.Reel r11 = r9.A02
            com.instagram.common.session.UserSession r10 = r9.A01
            java.util.List r0 = r11.A0O(r10)
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_size"
            r2.A0Q(r0, r1)
            if (r5 == 0) goto L_0x00b4
            java.lang.String r0 = r5.getId()
            if (r0 != 0) goto L_0x00bb
        L_0x00b4:
            if (r12 == 0) goto L_0x00bc
            java.lang.String r0 = r12.A0e
            r0.getClass()
        L_0x00bb:
            r13 = r0
        L_0x00bc:
            r2.A0m(r13)
            X.1iA r0 = r18.A0C()
            if (r0 == 0) goto L_0x024f
            int r0 = r0.A00
            long r0 = (long) r0
        L_0x00c8:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_t"
            r2.A0Q(r0, r1)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            if (r5 == 0) goto L_0x0240
            X.1Xy r0 = r5.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0240
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
        L_0x00e1:
            java.lang.String r1 = X.1aC.A06(r0)
            java.lang.String r0 = "follow_status"
            r2.A0R(r0, r1)
            r12 = r22
            float r1 = r12.A0B
            float r0 = r12.A0A
            float r1 = r1 * r0
            double r0 = (double) r1
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r16
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_elapsed"
            r2.A0P(r0, r1)
            r13 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r12.A0B
            float r1 = r1 - r0
            float r1 = java.lang.Math.max(r13, r1)
            float r0 = r12.A0A
            float r1 = r1 * r0
            double r0 = (double) r1
            double r0 = r0 / r16
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_remaining"
            r2.A0P(r0, r1)
            java.lang.String r0 = "media_source"
            r2.A0R(r0, r8)
            boolean r0 = r9.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "first_view"
            r2.A0O(r0, r1)
            X.3mM r8 = r9.A04
            int r0 = r8.A0E
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "tray_position"
            r2.A0Q(r0, r1)
            double r0 = r12.A03
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "pause_duration"
            r2.A0P(r0, r1)
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "source_of_action"
            r2.A0R(r0, r1)
            java.lang.String r1 = r11.getId()
            X.0qQ.A07(r1)
            java.lang.String r0 = "reel_id"
            r2.A0R(r0, r1)
            boolean r0 = r18.CcK()
            if (r0 == 0) goto L_0x023c
            java.lang.String r1 = "ad"
        L_0x0161:
            java.lang.String r0 = "delivery_class"
            r2.A0R(r0, r1)
            java.lang.Integer r0 = r12.A0W
            java.lang.String r0 = X.C305726Jh.A00(r0)
            r2.A0k(r0)
            boolean r0 = r18.CcK()
            if (r0 == 0) goto L_0x0238
            java.lang.String r1 = "ad"
        L_0x0177:
            java.lang.String r0 = "a_i"
            r2.A0R(r0, r1)
            java.lang.String r1 = r14.getId()
            X.0qQ.A07(r1)
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "a_pk"
            r2.A0Q(r0, r1)
            java.lang.String r0 = "dest_module"
            r2.A0R(r0, r15)
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "elapsed_time_since_last_item"
            r2.A0P(r0, r1)
            boolean r0 = r12.A0l
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_media_loaded"
            r2.A0O(r0, r1)
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_acp_delivered"
            r2.A0O(r0, r1)
            boolean r0 = r9.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_video_to_carousel"
            r2.A0O(r0, r1)
            if (r5 == 0) goto L_0x0236
            long r0 = r5.A1A()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x01c8:
            java.lang.String r0 = "m_ts"
            r2.A0Q(r0, r1)
            int r0 = r12.A0J
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "profile_tap_counter"
            r2.A0Q(r0, r1)
            boolean r0 = r8.A0L
            if (r0 == 0) goto L_0x0233
            r0 = 0
        L_0x01de:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_start_position"
            r2.A0Q(r0, r1)
            java.lang.String r1 = r11.A0H(r10)
            java.lang.String r0 = "reel_type"
            r2.A0R(r0, r1)
            X.6Yf r0 = r9.A05
            int r0 = r0.A0I
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reel_viewer_position"
            r2.A0Q(r0, r1)
            int r0 = r23.intValue()
            if (r0 == 0) goto L_0x0231
            r0 = 2
        L_0x0206:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "source"
            r2.A0Q(r0, r1)
            r3.A00 = r6
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "source_module"
            r2.A0R(r0, r1)
            java.lang.String r1 = r7.A0G
            java.lang.String r0 = "story_ranking_token"
            r2.A0R(r0, r1)
            if (r5 == 0) goto L_0x0228
            java.lang.String r4 = r5.C9L()
        L_0x0228:
            java.lang.String r0 = "tracking_token"
            r2.A0R(r0, r4)
            r2.Cgf()
            return
        L_0x0231:
            r0 = 1
            goto L_0x0206
        L_0x0233:
            int r0 = r8.A00
            goto L_0x01de
        L_0x0236:
            r1 = r4
            goto L_0x01c8
        L_0x0238:
            java.lang.String r1 = "organic"
            goto L_0x0177
        L_0x023c:
            java.lang.String r1 = "organic"
            goto L_0x0161
        L_0x0240:
            if (r12 == 0) goto L_0x024c
            com.instagram.user.model.User r0 = r12.A03()
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            goto L_0x00e1
        L_0x024c:
            r0 = r4
            goto L_0x00e1
        L_0x024f:
            r0 = 0
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310016aI.A0A(X.3uh, X.3mM, X.6Yf, java.lang.Integer, java.lang.String):void");
    }

    public final void A0D(C250973mM r19, float f, float f2, boolean z, boolean z2) {
        GT8 gt8;
        FollowStatus followStatus;
        Long l;
        int i;
        String str;
        UserSession userSession = this.A06;
        C250973mM r2 = r19;
        C255773uh A082 = r2.A08(userSession);
        Long l2 = null;
        if (A082.CWu() && (gt8 = (GT8) this.A0I.get(A082.CFY())) != null) {
            1Xj r5 = A082.A0b;
            r5.getClass();
            Reel reel = r2.A0H;
            1Nr r3 = reel.A0W;
            C310026aJ r7 = this.A0A;
            r7.A00 = reel;
            0wc A012 = AnonymousClass0kN.A01(r7, userSession);
            1Ln r22 = new 1Ln(A012.A00(A012.A00, "reel_send_message"), 368);
            if (r22.A00.isSampled()) {
                String str2 = "";
                if (182.A06(0Tu.A05, userSession, 36324161919987546L) || (str2 = r5.getId()) != null) {
                    r22.A0m(str2);
                    r22.A0Q("m_t", Long.valueOf((long) r5.BR7().A00));
                    r22.A0R("tray_session_id", this.A0H);
                    r22.A0R("viewer_session_id", this.A0E.getSessionId());
                    r22.A0Q("reel_position", Long.valueOf((long) gt8.A00()));
                    r22.A0O("is_quick_reaction", Boolean.valueOf(z));
                    r22.A0O("is_avatar_quick_reaction", Boolean.valueOf(z2));
                    r22.A0O(AnonymousClass000.A00(679), false);
                    Reel reel2 = gt8.A02;
                    UserSession userSession2 = gt8.A01;
                    r22.A0R("reel_type", reel2.A0H(userSession2));
                    r22.A0O("is_custom_quick_reaction", false);
                    r22.A0R("inventory_source", r5.A0C.BIl());
                    r22.A0P("time_elapsed", Double.valueOf(((double) (f * f2)) / 1000.0d));
                    r22.A0Q("reel_size", Long.valueOf((long) reel2.A0O(userSession2).size()));
                    float f3 = 1.0f - f;
                    float f4 = 0.0f;
                    if (0.0f < f3) {
                        f4 = f3;
                    }
                    r22.A0P("time_remaining", Double.valueOf(((double) (f4 * f2)) / 1000.0d));
                    r22.A0Q("session_reel_counter", Long.valueOf((long) gt8.A00));
                    Parcelable.Creator creator = User.CREATOR;
                    User A2A = r5.A2A(userSession);
                    if (A2A != null) {
                        followStatus = A2A.B6o();
                    } else {
                        followStatus = null;
                    }
                    r22.A0R("follow_status", 1aC.A06(followStatus));
                    r22.A0O("first_view", Boolean.valueOf(gt8.A06));
                    C250973mM r12 = gt8.A04;
                    r22.A0Q("tray_position", Long.valueOf((long) r12.A0E));
                    r22.A0R("tracking_token", r5.C9L());
                    User A2A2 = r5.A2A(userSession);
                    if (A2A2 != null) {
                        l = 00y.A0n(10, A2A2.getId());
                    } else {
                        l = null;
                    }
                    r22.A0Q("media_owner_id", l);
                    r22.A0R("source_of_action", r7.getModuleName());
                    String id = reel2.getId();
                    0qQ.A07(id);
                    r22.A0R("reel_id", id);
                    r22.A0R("story_ranking_token", this.A0G);
                    if (r12.A0L) {
                        i = 0;
                    } else {
                        i = r12.A00;
                    }
                    r22.A0Q("reel_start_position", Long.valueOf((long) i));
                    r22.A0Q("reel_viewer_position", Long.valueOf((long) gt8.A05.A0I));
                    r22.A0O("is_video_to_carousel", Boolean.valueOf(gt8.A07));
                    r22.A0P("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                    boolean z3 = false;
                    if (reel.A0P == ReelType.A05) {
                        z3 = true;
                    }
                    r22.A0O("is_moments_with_friends", Boolean.valueOf(z3));
                    r22.A0R("delivery_flags", C243413Yr.A00(r5.A0e));
                    if (A082.CcK()) {
                        str = "ad";
                    } else {
                        str = "organic";
                    }
                    r22.A0R("delivery_class", str);
                    Hashtag B6n = r5.A0C.B6n();
                    if (B6n != null) {
                        String id2 = B6n.getId();
                        if (id2 != null) {
                            l2 = 00y.A0n(10, id2);
                        }
                        r22.A0Q("hashtag_id", l2);
                        r22.A0R("hashtag_name", B6n.getName());
                    }
                    if (r3 instanceof 1Nr) {
                        r22.A0Q("a_pk", 00y.A0n(10, r3.getId()));
                    } else if (r3 instanceof AnonymousClass6YJ) {
                        AnonymousClass6YJ r32 = (AnonymousClass6YJ) r3;
                        String str3 = r32.A00.A07;
                        0qQ.A0B(str3, 0);
                        r22.A0Q("o_pk", 00y.A0n(10, str3));
                        r22.A0R("o_t", r32.A00());
                    }
                    r22.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r23v0, types: [java.util.Map] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C250973mM r25, X.C255783ui r26) {
        /*
            r24 = this;
            r11 = 0
            r6 = 1
            r2 = r24
            com.instagram.common.session.UserSession r1 = r2.A06
            r7 = r25
            X.3uh r5 = r7.A08(r1)
            r0 = r26
            com.instagram.model.shopping.reels.ProductSticker r8 = r0.A0q
            com.instagram.model.shopping.reels.MultiProductSticker r9 = r0.A0n
            X.BIk r10 = r0.A0o
            X.BIn r4 = r0.A0r
            if (r8 == 0) goto L_0x01c2
            com.instagram.user.model.ProductDetailsProductItemDict r3 = r8.A03
            if (r3 == 0) goto L_0x024b
            com.instagram.user.model.Product r11 = X.C14502TxO.A00(r3)
            X.ULx r9 = X.C294165ly.A03(r1, r11)
            long r3 = r9.A00
            X.4Ny r15 = r9.A01
            java.lang.Boolean r10 = r9.A04
            java.lang.Boolean r9 = r9.A03
            java.util.List r11 = java.util.Collections.singletonList(r11)
            X.0qQ.A07(r11)
            java.util.List r22 = X.C294165ly.A0C(r11)
            java.util.Map r23 = X.C294165ly.A0D(r11)
            java.lang.String r19 = X.C44936CnW.A00(r8)
            java.lang.String r8 = r8.A0B
            java.lang.Long r18 = java.lang.Long.valueOf(r3)
            java.lang.String r21 = "product_sticker"
            X.UKh r14 = new X.UKh
            r20 = r8
            r16 = r10
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0052:
            boolean r3 = r5.CWu()
            if (r3 == 0) goto L_0x01be
            X.1Xj r5 = r5.A0b
            if (r5 == 0) goto L_0x01be
            X.1Xj r3 = r5.A1e(r1)
            boolean r3 = r3.CcK()
            if (r3 == r6) goto L_0x01be
            if (r14 == 0) goto L_0x01be
            com.instagram.model.reels.Reel r13 = r7.A0H
            X.6aJ r3 = A01(r13, r2)
            X.0wc r9 = X.AnonymousClass0kN.A01(r3, r1)
            X.1Ln r11 = X.1Ln.A01(r9)
            java.lang.String r8 = r14.A04
            java.lang.String r7 = "shopping_sticker_id"
            X.0eP r1 = new X.0eP
            r1.<init>(r7, r8)
            X.0eP[] r1 = new X.0eP[]{r1}
            java.util.LinkedHashMap r12 = X.0Yt.A07(r1)
            X.BIk r1 = r0.A0o
            java.lang.String r10 = ""
            if (r1 == 0) goto L_0x009d
            com.instagram.user.model.ProductCollection r1 = r1.A02
            if (r1 == 0) goto L_0x0097
            java.lang.String r3 = r1.Aoi()
            if (r3 != 0) goto L_0x0098
        L_0x0097:
            r3 = r10
        L_0x0098:
            java.lang.String r1 = "product_collection_id"
            r12.put(r1, r3)
        L_0x009d:
            X.0Aj r1 = r11.A00
            boolean r1 = r1.isSampled()
            java.lang.String r6 = "Required value was null."
            r4 = 0
            if (r1 == 0) goto L_0x011d
            java.lang.String r3 = r2.A02
            if (r3 != 0) goto L_0x00ad
            r3 = r10
        L_0x00ad:
            java.lang.String r1 = "shopping_session_id"
            r11.A0R(r1, r3)
            X.1QJ r1 = X.AnonymousClass1QI.A00
            X.1QM r1 = r1.A02
            java.lang.String r3 = r1.A00
            java.lang.String r1 = "navigation_chain"
            r11.A0R(r1, r3)
            java.lang.String r3 = "instagram_organic_tap_shopping_sticker"
            java.lang.String r1 = "legacy_event_name"
            r11.A0R(r1, r3)
            X.V1Z r3 = X.V1Z.STICKER
            java.lang.String r1 = "analytics_component"
            r11.A0M(r3, r1)
            X.6aJ r1 = A01(r13, r2)
            java.lang.String r3 = r1.getModuleName()
            java.lang.String r1 = "legacy_surface"
            r11.A0R(r1, r3)
            java.lang.String r3 = r14.A05
            java.lang.String r1 = "legacy_ui_component"
            r11.A0R(r1, r3)
            java.lang.String r1 = r5.getId()
            r11.A0m(r1)
            X.4Ny r1 = r14.A00
            java.lang.Long r3 = r1.A00
            java.lang.String r1 = "merchant_id"
            r11.A0Q(r1, r3)
            r11.A0x(r12)
            java.util.List r3 = r14.A07
            java.lang.String r1 = "product_ids"
            r11.A0S(r1, r3)
            java.util.Map r1 = r14.A08
            r11.A0y(r1)
            java.lang.String r3 = r14.A06
            java.lang.String r1 = "text_format"
            r11.A0R(r1, r3)
            X.BIk r1 = r0.A0o
            if (r1 == 0) goto L_0x01bf
            com.instagram.user.model.ProductCollection r1 = r1.A02
            if (r1 == 0) goto L_0x01bf
            com.instagram.api.schemas.ProductCollectionV2Type r1 = r1.Aou()
        L_0x0111:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "product_collection_type"
            r11.A0R(r1, r3)
            r11.Cgf()
        L_0x011d:
            java.lang.String r3 = "instagram_organic_tap_shopping_sticker"
            X.0kJ r1 = r9.A00
            X.0Aj r3 = r9.A00(r1, r3)
            X.BIk r0 = r0.A0o
            if (r0 == 0) goto L_0x014e
            X.3sW r9 = new X.3sW
            r9.<init>()
            com.instagram.user.model.ProductCollection r1 = r0.A02
            if (r1 == 0) goto L_0x0139
            java.lang.String r0 = r1.Aoi()
            if (r0 == 0) goto L_0x0139
            r10 = r0
        L_0x0139:
            java.lang.String r0 = "product_collection_id"
            r9.A06(r0, r10)
            if (r1 == 0) goto L_0x0144
            com.instagram.api.schemas.ProductCollectionV2Type r4 = r1.Aou()
        L_0x0144:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "product_collection_type"
            r9.A06(r0, r1)
            r4 = r9
        L_0x014e:
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x01be
            X.327 r9 = new X.327
            r9.<init>()
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "shopping_session_id"
            r9.A06(r0, r1)
            java.lang.String r1 = r14.A05
            java.lang.String r0 = "submodule"
            r9.A06(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r9.A06(r0, r1)
            java.lang.String r0 = "navigation_info"
            r3.AAK(r9, r0)
            X.4Ny r1 = r14.A00
            java.lang.String r0 = "merchant_id"
            r3.AAE(r1, r0)
            r3.AAJ(r7, r8)
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x0245
            java.lang.String r0 = "m_pk"
            r3.AAJ(r0, r1)
            java.lang.Long r1 = r14.A03
            java.lang.String r0 = "product_id"
            r3.A9F(r0, r1)
            java.lang.Boolean r1 = r14.A02
            java.lang.String r0 = "is_checkout_enabled"
            r3.A7p(r0, r1)
            java.lang.Boolean r1 = r14.A01
            java.lang.String r0 = "has_drops_launched"
            r3.A7p(r0, r1)
            java.util.List r1 = r14.A07
            java.lang.String r0 = "product_ids"
            r3.AAe(r0, r1)
            java.util.Map r1 = r14.A08
            java.lang.String r0 = "product_merchant_ids"
            r3.A9H(r0, r1)
            java.lang.String r0 = "collections_logging_info"
            r3.AAK(r4, r0)
            java.lang.String r1 = r14.A06
            java.lang.String r0 = "text_format"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x01be:
            return
        L_0x01bf:
            r1 = r4
            goto L_0x0111
        L_0x01c2:
            if (r9 == 0) goto L_0x0204
            java.util.List r3 = r9.A09
            r8 = 0
            if (r3 == 0) goto L_0x0253
            java.util.List r4 = X.C14502TxO.A02(r3)
            if (r4 == 0) goto L_0x0253
            java.lang.Object r3 = r4.get(r11)
            com.instagram.user.model.Product r3 = (com.instagram.user.model.Product) r3
            if (r3 == 0) goto L_0x01df
            com.instagram.user.model.User r3 = r3.A0B
            if (r3 == 0) goto L_0x01df
            java.lang.String r8 = X.AnonymousClass3ZA.A00(r3)
        L_0x01df:
            X.4Ny r15 = X.C263944Ny.A00(r8)
            java.lang.String r19 = X.CnO.A00(r9)
            java.lang.Boolean r16 = X.C294165ly.A08(r4)
            java.util.List r22 = X.C294165ly.A0C(r4)
            java.util.Map r23 = X.C294165ly.A0D(r4)
            java.lang.String r3 = r9.A04
            r17 = 0
            java.lang.String r21 = "multi_product_sticker"
            X.UKh r14 = new X.UKh
            r18 = r17
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0052
        L_0x0204:
            if (r10 == 0) goto L_0x0227
            java.lang.String r3 = r10.A05
            X.4Ny r15 = X.C263944Ny.A00(r3)
            java.lang.String r19 = X.C44933CnT.A00(r10)
            java.lang.String r3 = r10.A07
            r16 = 0
            java.lang.String r21 = "product_collection_sticker"
        L_0x0216:
            X.UKh r14 = new X.UKh
            r17 = r16
            r18 = r16
            r20 = r3
            r22 = r16
            r23 = r16
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0052
        L_0x0227:
            if (r4 == 0) goto L_0x0242
            com.instagram.user.model.User r3 = r4.A00
            if (r3 == 0) goto L_0x0240
            java.lang.String r3 = r3.getId()
        L_0x0231:
            X.4Ny r15 = X.C263944Ny.A00(r3)
            java.lang.String r19 = X.C44945Cnf.A00(r4)
            java.lang.String r3 = r4.A04
            r16 = 0
            java.lang.String r21 = "storefront_sticker"
            goto L_0x0216
        L_0x0240:
            r3 = 0
            goto L_0x0231
        L_0x0242:
            r14 = 0
            goto L_0x0052
        L_0x0245:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x024b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0253:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310016aI.A0F(X.3mM, X.3ui):void");
    }

    public final void A0I(C250973mM r16, C309426Yf r17, int i) {
        UserSession userSession = this.A06;
        C250973mM r8 = r16;
        C255773uh A082 = r8.A08(userSession);
        if (!A082.A1N()) {
            Reel reel = r8.A0H;
            String id = reel.getId();
            0qQ.A07(id);
            int i2 = r8.A01;
            if (this.A0B.A00(A082, r8)) {
                this.A00++;
            }
            GT8 gt8 = new GT8(userSession, reel, A082, r8, r17, this.A00, !2O0.A00(userSession).CaU(reel, A082));
            this.A0I.put(A082.CFY(), gt8);
            Map map = this.A0J;
            int i3 = i;
            if (!map.containsKey(id)) {
                this.A0L.A01(userSession, reel, A082, i3);
                map.put(id, gt8);
                this.A07.A00((0jB) null, reel, i2, -1, false);
            }
            this.A0L.A02(A082, i3);
            if (!A082.A1P()) {
                this.A07.A00((0jB) null, A082, i2, -1, false);
            }
        }
    }

    public final void A0K(C250973mM r7, C309426Yf r8, Float f, String str, float f2, float f3) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 4);
        Reel reel = r7.A0H;
        if (!reel.A0m()) {
            UserSession userSession = this.A06;
            C255773uh A082 = r7.A08(userSession);
            if (!A082.A1N()) {
                float f4 = 0nA.A0H(this.A04).density;
                C310026aJ r1 = this.A0A;
                r1.A00 = reel;
                C254523sc A022 = GTA.A02(userSession, r1, A082, "gesture");
                A022.A7M = str;
                A022.A2V = Double.valueOf((double) (f2 / f4));
                A022.A2W = Double.valueOf((double) (f3 / f4));
                A022.A2j = f;
                A03(A022, r7, this, r8);
            }
        }
    }

    public final void A0M(C250973mM r8, C297795sM r9, User user, String str, String str2, String str3) {
        String str4;
        0qQ.A0B(str, 3);
        UserSession userSession = this.A06;
        C255773uh A082 = r8.A08(userSession);
        if (A082.CWu()) {
            1Xj r3 = A082.A0b;
            if (r3 != null) {
                C254523sc r5 = new C254523sc(A01(r8.A0H, this), str2);
                r5.A0G(userSession, r3);
                r5.A5K = str;
                r5.A12 = r9;
                if (user != null) {
                    str4 = user.A03.B4N();
                } else {
                    str4 = null;
                }
                r5.A4Z = str4;
                r5.A4J = str3;
                A04(r5, (GT8) this.A0I.get(A082.CFY()), this);
                C233822wX.A0C(userSession, r5, r3, this.A0A, (Integer) null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0N(C250973mM r16, Boolean bool, String str, String str2, String str3) {
        1Xj r4;
        GT8 gt8;
        User A2A;
        String name;
        long j;
        int i;
        String str4 = str3;
        0qQ.A0B(str4, 3);
        UserSession userSession = this.A06;
        C250973mM r6 = r16;
        C255773uh A082 = r6.A08(userSession);
        if (A082.CWu()) {
            1Xj r3 = A082.A0b;
            if (r3 != null) {
                String str5 = str2;
                String str6 = str;
                if (r3.CcK() || !"location_attempt".equals(str6)) {
                    C254523sc A022 = GTA.A02(userSession, A01(r6.A0H, this), A082, str6);
                    A022.A5r = str5;
                    A022.A5K = str4;
                    if (bool != null) {
                        A022.A2D = Boolean.valueOf(bool.booleanValue());
                    }
                    A04(A022, (GT8) this.A0I.get(A082.CFY()), this);
                    C233822wX.A0C(userSession, A022, r3, this.A0A, (Integer) null);
                    return;
                }
                C255773uh A083 = r6.A08(userSession);
                1Ns r9 = r6.A0H.A0W;
                if (r9 != null && (r4 = A083.A0b) != null && (gt8 = (GT8) this.A0I.get(A083.CFY())) != null) {
                    C309426Yf r32 = gt8.A05;
                    0wc r10 = this.A05;
                    1Ln r2 = new 1Ln(r10.A00(r10.A00, "instagram_organic_location_attempt"), 303);
                    if (r2.A00.isSampled() && (A2A = r4.A2A(userSession)) != null && (name = A2A.B6o().name()) != null) {
                        String id = r9.getId();
                        0qQ.A07(id);
                        Long A0n = 00y.A0n(10, id);
                        long j2 = 0;
                        if (A0n != null) {
                            j = A0n.longValue();
                        } else {
                            j = 0;
                        }
                        r2.A0Q("a_pk", Long.valueOf(j));
                        r2.A0R("follow_status", name);
                        r2.A0R("from", str4);
                        r2.A0R(AnonymousClass000.A00(3524), str5);
                        r2.A0m(C294185m0.A09(r4));
                        r2.A0Q("m_t", Long.valueOf((long) r4.BR7().A00));
                        long A1A = r4.A1A();
                        if (Long.valueOf(A1A) != null) {
                            j2 = A1A;
                        }
                        r2.A0Q("m_ts", Long.valueOf(j2));
                        String str7 = this.A0G;
                        String str8 = "";
                        if (str7 == null) {
                            str7 = str8;
                        }
                        r2.A0R("story_ranking_token", str7);
                        r2.A0O("is_acp_delivered", false);
                        r2.A0O("is_video_to_carousel", Boolean.valueOf(gt8.A07));
                        Reel reel = gt8.A02;
                        String id2 = reel.getId();
                        0qQ.A07(id2);
                        r2.A0R("reel_id", id2);
                        r2.A0Q("reel_position", Long.valueOf((long) gt8.A00()));
                        UserSession userSession2 = gt8.A01;
                        r2.A0Q("reel_size", Long.valueOf((long) reel.A0O(userSession2).size()));
                        C250973mM r8 = gt8.A04;
                        if (r8.A0L) {
                            i = 0;
                        } else {
                            i = r8.A00;
                        }
                        r2.A0Q("reel_start_position", Long.valueOf((long) i));
                        r2.A0R("reel_type", reel.A0H(userSession2));
                        r2.A0Q("reel_viewer_position", Long.valueOf((long) r32.A0I));
                        r2.A0Q("session_reel_counter", Long.valueOf((long) gt8.A00));
                        r2.A0R("source_of_action", A00(A083, this).getModuleName());
                        r2.A0P("time_elapsed", Double.valueOf(((double) (r32.A0B * r32.A0A)) / 1000.0d));
                        String A2v = r4.A2v();
                        if (A2v != null) {
                            str8 = A2v;
                        }
                        r2.A0R("tracking_token", str8);
                        r2.A0Q("tray_position", Long.valueOf((long) r8.A0E));
                        r2.A0R("tray_session_id", this.A0H);
                        r2.A0R("viewer_session_id", this.A0E.getSessionId());
                        r2.Cgf();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void ChS(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChT(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChU(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChW(1Xj r1, AnonymousClass4DU r2, int i, int i2, long j) {
    }

    public final void ChX(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void Cir(0jB r1, 1Nv r2, AnonymousClass4DU r3, int i, int i2) {
    }

    public final void Cke(0jB r1, 1Nv r2, AnonymousClass4DU r3, int i, int i2) {
    }

    public final void Ckf(1Nv r11, AnonymousClass4DU r12, int i, int i2) {
        1Xj r8;
        Long valueOf;
        Long l;
        long j;
        Long l2;
        Long l3;
        Long l4;
        0qQ.A0B(r11, 1);
        if (r11 instanceof C255773uh) {
            C255773uh r5 = (C255773uh) r11;
            if (!r5.CcK()) {
                C310026aJ A002 = A00(r11, this);
                AnonymousClass3PI r2 = AnonymousClass3PI.A00;
                UserSession userSession = this.A06;
                C255773uh A003 = AnonymousClass3PI.A00(userSession, r11);
                C254523sc A022 = GTA.A02(userSession, A002, r5, "sub_viewed_impression");
                GT8 A023 = A02(r11);
                A04(A022, A023, this);
                r2.A0D(A022, A023);
                C255773uh A004 = AnonymousClass3PI.A00(userSession, r11);
                if (A004 != null) {
                    A022.A1X = Boolean.valueOf(A004.A1J());
                }
                boolean CcK = r5.CcK();
                Long l5 = null;
                if (!CcK) {
                    0wc A012 = AnonymousClass0kN.A01(A002, userSession);
                    0Aj A005 = A012.A00(A012.A00, "instagram_organic_sub_viewed_impression");
                    if (A005.isSampled()) {
                        if (A003 != null) {
                            r8 = A003.A0b;
                        } else {
                            r8 = null;
                        }
                        0jB A013 = A022.A01();
                        0xF r4 = A022.A00().A06;
                        if (r8 != null) {
                            A005.AAJ("follow_status", C294185m0.A06(userSession, r8));
                            A005.A9F("sponsor_tag_count", (Long) A013.A01(C271774jZ.A8F));
                            A005.AAJ("m_pk", C294185m0.A09(r8));
                            A005.AAJ("tracking_token", C294185m0.A07(userSession, r8, r12));
                            A005.A9F("m_t", Long.valueOf((long) r8.BR7().A00));
                            A005.A9O("feed_sticker_media_id", A013.A01(C271774jZ.A2q));
                            A005.AAJ("inventory_source", r8.A0C.BIl());
                            0qQ.A0B(userSession, 0);
                            A005.AAJ("last_navigation_module", C71342cb.A00(userSession).A03());
                            A005.AAJ("module_name", r12.getModuleName());
                            A005.AAJ("reel_id", (String) A013.A01(C271774jZ.A7T));
                            A005.AAJ("tray_session_id", (String) A013.A01(C271774jZ.A7X));
                            A005.AAJ("viewer_session_id", (String) A013.A01(C271774jZ.A9i));
                            A005.AAJ("ranking_session_id", (String) A013.A01(C271774jZ.A6q));
                            A005.AAJ("action", C294185m0.A08(r8));
                            A005.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) A013.A01(C271774jZ.A2e));
                            A005.A7p("can_add_to_bag", r4.A01("can_add_to_bag"));
                            A005.AAJ("prior_module", (String) A013.A01(C271774jZ.A6h));
                            if (i2 == -1) {
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf((long) i2);
                            }
                            A005.A9F("m_ix", valueOf);
                            A005.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r4.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            A005.AAJ("source_of_action", (String) A013.A01(C271774jZ.A8A));
                            A005.A8D("elapsed_time_since_last_item", (Double) A013.A01(C271774jZ.A2P));
                            A005.A9F("m_ts", Long.valueOf(r8.A1A()));
                            A005.A7p("is_acp_delivered", false);
                            A005.AAJ("a_pk", String.valueOf(C294185m0.A00(userSession, r8)));
                            A005.A9F("imp_logger_ver", 24L);
                            A005.AAJ(C46367Ddj.A01(9, 10, 65), (String) A013.A01(C271774jZ.A7x));
                            A005.AAJ("feed_request_id", (String) A013.A01(C271774jZ.A88));
                            A005.A7p("is_highlights_sourced", (Boolean) A013.A01(C271774jZ.A4K));
                            A005.A9F("reel_size", (Long) A013.A01(C271774jZ.A7V));
                            A005.A9F("session_reel_counter", (Long) A013.A01(C271774jZ.A7y));
                            A005.A9F("reel_viewer_position", (Long) A013.A01(C271774jZ.A7b));
                            A005.AAJ("reel_type", (String) A013.A01(C271774jZ.A7Y));
                            A005.A8D("time_elapsed", (Double) A013.A01(C271774jZ.A8z));
                            A005.A8D("media_dwell_time", (Double) A013.A01(C271774jZ.A5F));
                            A005.A8D("media_time_paused", (Double) A013.A01(C271774jZ.A5T));
                            A005.A9F("tray_position", (Long) A013.A01(C271774jZ.A9P));
                            A005.A8D("media_time_elapsed", Double.valueOf(-1.0d));
                            A005.A8D("media_time_remaining", (Double) A013.A01(C271774jZ.A5Z));
                            A005.A8D("media_time_to_load", (Double) A013.A01(C271774jZ.A5Q));
                            A005.A9F("reel_position", (Long) A013.A01(C271774jZ.A7U));
                            A005.A9F("reel_start_position", (Long) A013.A01(C271774jZ.A7W));
                            A005.AAJ("story_ranking_token", (String) A013.A01(C271774jZ.A8O));
                            A005.A9F("entity_id", (Long) A013.A01(C271774jZ.A2Z));
                            A005.AAJ("entity_name", (String) A013.A01(C271774jZ.A2a));
                            A005.A7p("is_igtv", Boolean.valueOf(r8.A5Y()));
                            A005.AAJ("audience", (String) A013.A01(C271774jZ.A0W));
                            A005.A9F("is_live_streaming", r4.A04("is_live_streaming"));
                            0j9 r6 = C271774jZ.A01;
                            String str = (String) A013.A01(r6);
                            if (str != null) {
                                l = 00y.A0n(10, str);
                            } else {
                                l = null;
                            }
                            A005.A9F("actor_id", l);
                            A005.A9F("is_live_questions", r4.A04("is_live_questions"));
                            if (AnonymousClass1GD.A03()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            A005.A9F("is_dark_mode", Long.valueOf(j));
                            A005.A9F("tab_index", (Long) A013.A01(C271774jZ.A8i));
                            A005.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                            A005.A9F("guest_id", r4.A04("guest_id"));
                            Integer A032 = r4.A03("is_replay");
                            if (A032 != null) {
                                l2 = Long.valueOf((long) A032.intValue());
                            } else {
                                l2 = null;
                            }
                            A005.A9F("is_replay", l2);
                            A005.A8D("time_remaining", (Double) A013.A01(C271774jZ.A94));
                            A005.AAJ("is_coming_from", (String) A013.A01(C271774jZ.A42));
                            A005.A9F("effect_id", (Long) A013.A01(C271774jZ.A2O));
                            A005.A9F("media_face_effect_id", (Long) A013.A01(C271774jZ.A5G));
                            String str2 = (String) A013.A01(C271774jZ.A9Q);
                            if (str2 != null) {
                                l3 = 00y.A0n(10, str2);
                            } else {
                                l3 = null;
                            }
                            A005.A9F("tray_pos_excl_own_story", l3);
                            A005.AAJ("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
                            A005.AAJ("reply_type", r4.A05("reply_type"));
                            A005.AAJ("explore_topic_session_id", (String) A013.A01(C271774jZ.A2g));
                            0j9 r9 = C271774jZ.A9J;
                            A005.A9F("top_liker_count", (Long) A013.A01(r9));
                            A005.A9F("reel_gap_to_last_ad", (Long) A013.A01(C271774jZ.A7R));
                            A005.A9F("reel_gap_to_last_netego", (Long) A013.A01(C271774jZ.A7S));
                            A005.AAJ("search_session_id", (String) A013.A01(C271774jZ.A7p));
                            A005.A7p("is_influencer", (Boolean) A013.A01(C271774jZ.A4O));
                            A005.A9F("media_type", (Long) A013.A01(C271774jZ.A5a));
                            A005.AAJ("position", String.valueOf(i2));
                            A005.A7p("is_besties_reel", (Boolean) A013.A01(C271774jZ.A40));
                            A005.AAJ("impression_token", r4.A05("impression_token"));
                            A005.AAJ("algorithm", r4.A05("algorithm"));
                            A005.AAJ("media_tags_hashtag_name", (String) A013.A01(C271774jZ.A5V));
                            A005.A9F("media_tags_total_hashtags", (Long) A013.A01(C271774jZ.A5W));
                            A005.A7p("is_besties_media", (Boolean) A013.A01(C271774jZ.A3z));
                            String A2n = r8.A2n();
                            if (A2n != null) {
                                A005.A9F("media_id", 00y.A0n(10, A2n));
                                A005.A9F("ad_position_from_server", (Long) A013.A01(C271774jZ.A0I));
                                A005.A7p("is_reshare", r4.A01("is_reshare"));
                                A005.A9F("top_followers_count", (Long) A013.A01(C271774jZ.A9H));
                                A005.A9F("top_likers_count", (Long) A013.A01(r9));
                                A005.A9F("dr_ad_type", (Long) A013.A01(C271774jZ.A2J));
                                A005.A9F("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5h));
                                A005.A9F("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5i));
                                A005.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5j));
                                A005.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5k));
                                A005.AAJ("entity_page_type", r4.A05("entity_page_type"));
                                A005.AAJ("counter_channel", (String) A013.A01(C271774jZ.A1f));
                                String str3 = (String) A013.A01(C271774jZ.A1g);
                                if (str3 != null) {
                                    l4 = 00y.A0n(10, str3);
                                } else {
                                    l4 = null;
                                }
                                A005.A9F("counter_id", l4);
                                String str4 = (String) A013.A01(C271774jZ.A1h);
                                if (str4 != null) {
                                    l5 = 00y.A0n(10, str4);
                                }
                                A005.A9F("counter_sid", l5);
                                A005.A9F(TraceFieldType.BroadcastId, r4.A04(TraceFieldType.BroadcastId));
                                A005.AAJ("a_i", (String) A013.A01(r6));
                                A005.AAJ("tray_rank_token", r4.A05("tray_rank_token"));
                                A005.A9F("ad_inserted_position", (Long) A013.A01(C271774jZ.A0D));
                                A005.A9F("sponsor_tag_id", r4.A04("bc_tagged_partner"));
                                A005.AAJ("playback_format", r4.A05("playback_format"));
                                A005.A7p("is_pride_media", (Boolean) A013.A01(C271774jZ.A4d));
                                A005.A7p("is_pride_reel", (Boolean) A013.A01(C271774jZ.A4e));
                                A005.Cgf();
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        return;
                    }
                    return;
                }
                C233822wX.A0C(userSession, A022, r11, A002, (Integer) null);
            }
        }
    }

    public final void Cku(C254223s8 r5, 1Nv r6, AnonymousClass4DU r7, int i, int i2, long j) {
        0qQ.A0B(r6, 1);
        if (!(r6 instanceof Reel) || ((Reel) r6).CcK()) {
            C310026aJ A002 = A00(r6, this);
            UserSession userSession = this.A06;
            C254523sc A003 = GTA.A00(userSession, r6, A002, "time_spent");
            A003.A0B(j);
            A04(A003, A02(r6), this);
            C233822wX.A0C(userSession, A003, r6, A002, (Integer) null);
        }
    }

    public final void ClD(1Nv r12, AnonymousClass4DU r13, int i, int i2) {
        1Xj r5;
        Long valueOf;
        long j;
        0qQ.A0B(r12, 1);
        if (r12 instanceof C255773uh) {
            C255773uh r7 = (C255773uh) r12;
            if (!r7.CcK()) {
                C310026aJ A002 = A00(r12, this);
                UserSession userSession = this.A06;
                C254523sc A022 = GTA.A02(userSession, A002, r7, "viewed_impression");
                GT8 A023 = A02(r12);
                AnonymousClass3PI r0 = AnonymousClass3PI.A00;
                C255773uh A003 = AnonymousClass3PI.A00(userSession, r12);
                A04(A022, A023, this);
                r0.A0D(A022, A023);
                if (A003 != null) {
                    A022.A1X = Boolean.valueOf(A003.A1J());
                }
                Long l = null;
                if (!r7.CcK()) {
                    0wc A012 = AnonymousClass0kN.A01(A002, userSession);
                    0Aj A004 = A012.A00(A012.A00, "instagram_organic_viewed_impression");
                    if (A004.isSampled()) {
                        if (A003 != null) {
                            r5 = A003.A0b;
                        } else {
                            r5 = null;
                        }
                        0jB A013 = A022.A01();
                        0xF r3 = A022.A00().A06;
                        if (r5 != null) {
                            A004.A9F("a_pk", Long.valueOf(C294185m0.A00(userSession, r5)));
                            A004.AAJ("action", C294185m0.A08(r5));
                            A004.AAJ("follow_status", C294185m0.A06(userSession, r5));
                            A004.A9F("imp_logger_ver", 24L);
                            A004.AAJ("inventory_source", r5.A0C.BIl());
                            if (i2 == -1) {
                                valueOf = null;
                            } else {
                                valueOf = Long.valueOf((long) i2);
                            }
                            A004.A9F("m_ix", valueOf);
                            A004.AAJ("m_pk", C294185m0.A09(r5));
                            A004.A9O("feed_sticker_media_id", A013.A01(C271774jZ.A2q));
                            Integer A032 = r3.A03("is_replay");
                            if (A032 != null) {
                                l = Long.valueOf((long) A032.intValue());
                            }
                            A004.A9O("is_replay", l);
                            A004.A7p("is_ad", Boolean.valueOf(r7.CcK()));
                            A004.A9F("m_t", Long.valueOf((long) r5.BR7().A00));
                            A004.A9F("m_ts", Long.valueOf(r5.A1A()));
                            A004.A8D("media_time_elapsed", Double.valueOf(-1.0d));
                            A004.AAJ("reel_id", (String) A013.A01(C271774jZ.A7T));
                            A004.A9F("reel_position", (Long) A013.A01(C271774jZ.A7U));
                            A004.A9F("reel_size", (Long) A013.A01(C271774jZ.A7V));
                            A004.A9F("reel_start_position", (Long) A013.A01(C271774jZ.A7W));
                            A004.AAJ("reel_type", (String) A013.A01(C271774jZ.A7Y));
                            A004.A9F("reel_viewer_position", (Long) A013.A01(C271774jZ.A7b));
                            A004.A9F("session_reel_counter", (Long) A013.A01(C271774jZ.A7y));
                            A004.AAJ("source_of_action", (String) A013.A01(C271774jZ.A8A));
                            A004.A9F("sponsor_tag_count", (Long) A013.A01(C271774jZ.A8F));
                            A004.AAJ("story_ranking_token", (String) A013.A01(C271774jZ.A8O));
                            A004.A8D("time_elapsed", (Double) A013.A01(C271774jZ.A8z));
                            A004.A8D("time_remaining", (Double) A013.A01(C271774jZ.A94));
                            A004.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, r3.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                            A004.AAJ("topic_cluster_debug_info", (String) A013.A01(C271774jZ.A9C));
                            A004.AAJ("topic_cluster_id", (String) A013.A01(C271774jZ.A9D));
                            A004.AAJ("topic_cluster_title", (String) A013.A01(C271774jZ.A9F));
                            A004.AAJ("topic_cluster_type", (String) A013.A01(C271774jZ.A9G));
                            A004.AAJ("tracking_token", C294185m0.A07(userSession, r5, r13));
                            A004.A9F("tray_position", (Long) A013.A01(C271774jZ.A9P));
                            A004.AAJ("tray_session_id", (String) A013.A01(C271774jZ.A7X));
                            A004.AAJ("viewer_session_id", (String) A013.A01(C271774jZ.A9i));
                            A004.A7p("can_add_to_bag", r3.A01("can_add_to_bag"));
                            A004.A8D("elapsed_time_since_last_item", (Double) A013.A01(C271774jZ.A2P));
                            A004.A7p("is_acp_delivered", false);
                            A004.A7p("is_highlights_sourced", (Boolean) A013.A01(C271774jZ.A4K));
                            A004.AAJ(C46367Ddj.A01(9, 10, 65), (String) A013.A01(C271774jZ.A7x));
                            A004.AAJ("feed_request_id", (String) A013.A01(C271774jZ.A88));
                            A004.A9F("entity_id", (Long) A013.A01(C271774jZ.A2Z));
                            A004.AAJ("entity_name", (String) A013.A01(C271774jZ.A2a));
                            A004.A7p("is_igtv", Boolean.valueOf(r5.A5Y()));
                            if (AnonymousClass1GD.A03()) {
                                j = 1;
                            } else {
                                j = 0;
                            }
                            A004.A9F("is_dark_mode", Long.valueOf(j));
                            A004.AAJ("audience", (String) A013.A01(C271774jZ.A0W));
                            A004.A9F("tab_index", (Long) A013.A01(C271774jZ.A8i));
                            A004.AAJ("collection_id", (String) A013.A01(C271774jZ.A1L));
                            A004.AAJ("collection_name", (String) A013.A01(C271774jZ.A1N));
                            A004.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                            A004.A9F("is_live_streaming", r3.A04("is_live_streaming"));
                            A004.A9F("is_live_questions", r3.A04("is_live_questions"));
                            A004.A7p("is_influencer", (Boolean) A013.A01(C271774jZ.A4O));
                            A004.A9F("effect_id", (Long) A013.A01(C271774jZ.A2O));
                            A004.A9F("media_face_effect_id", (Long) A013.A01(C271774jZ.A5G));
                            A004.AAJ("ranking_info_token", (String) A013.A01(C271774jZ.A6p));
                            A004.AAJ("reply_type", r3.A05("reply_type"));
                            A004.A9F("guest_id", r3.A04("guest_id"));
                            A004.A9F("top_liker_count", (Long) A013.A01(C271774jZ.A9J));
                            A004.A9F("top_followers_count", (Long) A013.A01(C271774jZ.A9H));
                            A004.A9F("top_likers_count", (Long) A013.A01(C271774jZ.A9I));
                            A004.A9F("dr_ad_type", (Long) A013.A01(C271774jZ.A2J));
                            A004.A7p("is_besties_reel", (Boolean) A013.A01(C271774jZ.A40));
                            A004.AAJ("search_session_id", (String) A013.A01(C271774jZ.A7p));
                            A004.AAJ("is_programmatic_scroll", (String) A013.A01(C271774jZ.A4g));
                            A004.A7p("is_besties_media", (Boolean) A013.A01(C271774jZ.A3z));
                            A004.AAJ("impression_token", r3.A05("impression_token"));
                            String A2n = r5.A2n();
                            if (A2n != null) {
                                A004.A9F("media_id", 00y.A0n(10, A2n));
                                A004.A9F("media_author_id", (Long) A013.A01(C271774jZ.A5E));
                                A004.A9F("media_type", (Long) A013.A01(C271774jZ.A5a));
                                A004.AAJ("position", String.valueOf(i2));
                                A004.A9F("reel_gap_to_last_ad", (Long) A013.A01(C271774jZ.A7R));
                                A004.A9F("reel_gap_to_last_netego", (Long) A013.A01(C271774jZ.A7S));
                                A004.A7p("is_reshare", r3.A01("is_reshare"));
                                A004.A9F("ad_position_from_server", (Long) A013.A01(C271774jZ.A0I));
                                A004.AAJ("entity_page_type", r3.A05("entity_page_type"));
                                A004.A9F("min_consumed_media_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5h));
                                A004.A9F("min_consumed_media_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5i));
                                A004.A9F("min_consumed_reel_gap_to_previous_ad", (Long) A013.A01(C271774jZ.A5j));
                                A004.A9F("min_consumed_reel_gap_to_previous_netego", (Long) A013.A01(C271774jZ.A5k));
                                A004.AAJ("explore_topic_session_id", (String) A013.A01(C271774jZ.A2g));
                                A004.A7p("is_pride_media", (Boolean) A013.A01(C271774jZ.A4d));
                                A004.A7p("is_pride_reel", (Boolean) A013.A01(C271774jZ.A4e));
                                A004.AAJ("algorithm", r3.A05("algorithm"));
                                A004.Cgf();
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        return;
                    }
                    return;
                }
                C233822wX.A0C(userSession, A022, r12, A002, (Integer) null);
            }
        }
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A07.D6z(view);
    }

    public static final C310026aJ A00(1Nv r2, C310016aI r3) {
        Reel A0M;
        if (r2 instanceof Reel) {
            A0M = (Reel) r2;
        } else if (r2 instanceof C255773uh) {
            A0M = ReelStore.A03(r3.A06).A0M(((C255773uh) r2).A0k);
        } else {
            throw new UnsupportedOperationException("This item does not represent an ImpressionItem");
        }
        return A01(A0M, r3);
    }

    public static final C310026aJ A01(Reel reel, C310016aI r2) {
        if (reel != null) {
            r2.A0A.A00 = reel;
        }
        return r2.A0A;
    }

    private final GT8 A02(1Nv r3) {
        Map map;
        String CFY;
        if (r3 instanceof Reel) {
            map = this.A0J;
            CFY = ((Reel) r3).getId();
        } else if (r3 instanceof C255773uh) {
            map = this.A0I;
            CFY = ((C255773uh) r3).CFY();
        } else {
            throw new UnsupportedOperationException("This item does not represent an ImpressionItem");
        }
        return (GT8) map.get(CFY);
    }

    public static final void A03(C254523sc r9, C250973mM r10, C310016aI r11, C309426Yf r12) {
        UserSession userSession = r11.A06;
        C255773uh A082 = r10.A08(userSession);
        1Xj r0 = A082.A0b;
        if (r0 != null) {
            r9.A0G(userSession, r0);
            AnonymousClass3PI.A03(r11.A04, r9);
            float f = r12.A0A;
            double d = ((double) (r12.A0B * f)) / 1000.0d;
            r9.A2X = Double.valueOf(d);
            r9.A2a = Double.valueOf((((double) f) / 1000.0d) - d);
            A04(r9, (GT8) r11.A0I.get(A082.CFY()), r11);
            C233822wX.A0I(userSession, r9, r11.A0A, AnonymousClass05K.A01);
        }
    }

    public static final void A04(C254523sc r1, GT8 gt8, C310016aI r3) {
        if (gt8 != null) {
            AnonymousClass3PI.A09(r1, gt8);
            r1.A6g = r3.A0H;
            r1.A7Q = r3.A0E.getSessionId();
            r1.A72 = r3.A0G;
        }
    }

    public final void A09(C255773uh r19, C250973mM r20) {
        C255773uh r6 = r19;
        if (!r6.A1N()) {
            UserSession userSession = this.A06;
            C250973mM r0 = r20;
            int A032 = r0.A03(userSession, r6);
            Reel reel = r0.A0H;
            if (reel.A1P) {
                if (reel.A16(userSession)) {
                    this.A0C.A04.put("nux_story", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                }
                String str = reel.A0q;
                if (str != null && reel.A0O(userSession).indexOf(r6) == 0) {
                    long millis = TimeUnit.SECONDS.toMillis(SandboxRepository.CACHE_TTL);
                    AnonymousClass2bO.A00();
                    0qQ.A0B(userSession, 0);
                    DcZ A002 = DcY.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xa r12 = 1Au.A00(userSession).A01;
                    long j = -1;
                    if (str.equals(r12.getString("qp_reel_tray_last_impressed_promotion_id", (String) null))) {
                        j = r12.getLong("qp_reel_tray_last_impressed_promotion_time_millis", -1);
                    }
                    if (j <= currentTimeMillis - millis) {
                        QuickPromotionSurface quickPromotionSurface = QuickPromotionSurface.A0G;
                        0xI A003 = 0xI.A00(A002, "view");
                        UserSession userSession2 = A002.A00;
                        0qQ.A0A(A003);
                        A003.A08(Integer.valueOf(quickPromotionSurface.A00), "nux_id");
                        A003.A0C("promotion_id", str);
                        C60510iO.A00(userSession2).EHF(A003);
                        0xY AR4 = 1Au.A00(userSession).A01.AR4();
                        AR4.E5g("qp_reel_tray_last_impressed_promotion_id", str);
                        AR4.E5c("qp_reel_tray_last_impressed_promotion_time_millis", currentTimeMillis);
                        AR4.apply();
                    }
                }
            } else if (r6.CWu() && !reel.A0b()) {
                C230262pI r3 = this.A0C;
                String id = reel.getId();
                1Xj r02 = r6.A0b;
                if (r02 != null) {
                    r3.A06(id, userSession, r02);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (reel.A0t()) {
                C64113LOb lOb = r6.A0E;
                lOb.getClass();
                C42101BHe bHe = lOb.A03.A00;
                C230262pI r1 = this.A0C;
                User user = r6.A0i;
                if (user != null) {
                    String str2 = bHe.A02;
                    if (str2 != null) {
                        Integer num = bHe.A01;
                        if (num != null) {
                            C230262pI.A02(user, str2, "SUPERLATIVE", r1.A03, (long) num.intValue());
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            reel.A0S(userSession, r6.A03());
            1Xj r03 = r6.A0b;
            if (r03 != null) {
                List singletonList = Collections.singletonList(r03.getId());
                0qQ.A07(singletonList);
                reel.A0U(userSession, singletonList);
            }
            Set set = this.A0K;
            if (!set.contains(reel.getId())) {
                String id2 = reel.getId();
                0qQ.A07(id2);
                set.add(id2);
                this.A07.A01(C254193s5.A02, reel, A032);
            }
            this.A07.A01(C254193s5.A02, r6, A032);
        }
    }

    public final void A0B(C255773uh r11, C250973mM r12, Integer num) {
        Long l;
        long j;
        String str;
        String str2;
        Long l2;
        Integer num2;
        Long l3;
        String str3;
        String str4;
        String str5;
        Integer num3;
        String str6;
        C310006aH r6 = this.A01;
        if (r6 != null) {
            UserSession userSession = r6.A03;
            AnonymousClass0iw r7 = r6.A01;
            0wc A012 = AnonymousClass0kN.A01(r7, userSession);
            0Aj A002 = A012.A00(A012.A00, "instagram_ad_pivots_carousel_banner_click");
            1Xj r0 = r11.A0b;
            r0.getClass();
            String A072 = C231122qu.A07(userSession, r0);
            Boolean bool = null;
            if (A072 != null) {
                l = 00y.A0n(10, A072);
            } else {
                l = null;
            }
            if (A002.isSampled() && l != null) {
                A002.A9F("ad_id", l);
                C270424gi r02 = r6.A00;
                if (r02 != null) {
                    j = (long) r02.CMI(r12);
                } else {
                    j = 0;
                }
                A002.A9F("chaining_position", Long.valueOf(j));
                C249763kK r3 = r6.A04;
                A002.AAJ("chaining_session_id", r3.getSessionId());
                A002.AAJ("client_session_id", r3.getSessionId());
                A002.AAJ("contextual_ads_category", "");
                A002.AAe("position", 0sr.A1M(new Long[]{0L, Long.valueOf((long) r12.A01)}));
                Reel reel = r12.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A002.AAJ("trigger_type", str);
                switch (num.intValue()) {
                    case 0:
                        str2 = "CTA";
                        break;
                    case 1:
                        str2 = "PROFILE_NAME";
                        break;
                    default:
                        str2 = "PROFILE_IMAGE";
                        break;
                }
                A002.AAJ("click_type", str2);
                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                if (intentAwareAdsInfo2 == null || (str6 = intentAwareAdsInfo2.A07) == null) {
                    l2 = null;
                } else {
                    l2 = 00y.A0n(10, str6);
                }
                A002.A9F("hscroll_seed_ad_id", l2);
                A002.AAJ("container_module", r7.getModuleName());
                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                if (intentAwareAdsInfo3 != null) {
                    num2 = intentAwareAdsInfo3.A02;
                } else {
                    num2 = null;
                }
                A002.AAJ("multi_ads_type", String.valueOf(num2));
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 == null || (num3 = intentAwareAdsInfo4.A02) == null) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf((long) num3.intValue());
                }
                A002.A9F("multi_ads_type_number", l3);
                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                if (intentAwareAdsInfo5 != null) {
                    str3 = intentAwareAdsInfo5.A06;
                } else {
                    str3 = null;
                }
                A002.AAJ("multi_ads_id", str3);
                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                if (intentAwareAdsInfo6 != null) {
                    str4 = intentAwareAdsInfo6.A06;
                } else {
                    str4 = null;
                }
                A002.AAJ("multi_ads_unit_id", str4);
                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                if (intentAwareAdsInfo7 != null) {
                    str5 = intentAwareAdsInfo7.A04;
                } else {
                    str5 = null;
                }
                A002.AAJ("insertion_mechanism", str5);
                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                if (intentAwareAdsInfo8 != null) {
                    bool = intentAwareAdsInfo8.A01;
                }
                A002.A7p("is_seed_ad_multi_ads_eligible", bool);
                A002.AAJ("tracking_token", r11.ByO(userSession));
                A002.Cgf();
            }
        }
    }

    public final void A0C(C255773uh r11, C250973mM r12, Integer num) {
        Long l;
        long j;
        String str;
        String str2;
        Long l2;
        Integer num2;
        Long l3;
        String str3;
        String str4;
        String str5;
        Integer num3;
        String str6;
        C310006aH r6 = this.A01;
        if (r6 != null) {
            UserSession userSession = r6.A03;
            AnonymousClass0iw r7 = r6.A01;
            0wc A012 = AnonymousClass0kN.A01(r7, userSession);
            0Aj A002 = A012.A00(A012.A00, "instagram_ad_pivots_carousel_banner_tooltip_click");
            1Xj r0 = r11.A0b;
            r0.getClass();
            String A072 = C231122qu.A07(userSession, r0);
            Boolean bool = null;
            if (A072 != null) {
                l = 00y.A0n(10, A072);
            } else {
                l = null;
            }
            if (A002.isSampled() && l != null) {
                A002.A9F("ad_id", l);
                C270424gi r02 = r6.A00;
                if (r02 != null) {
                    j = (long) r02.CMI(r12);
                } else {
                    j = 0;
                }
                A002.A9F("chaining_position", Long.valueOf(j));
                C249763kK r3 = r6.A04;
                A002.AAJ("chaining_session_id", r3.getSessionId());
                A002.AAJ("client_session_id", r3.getSessionId());
                A002.AAJ("contextual_ads_category", "");
                A002.AAe("position", 0sr.A1M(new Long[]{0L, Long.valueOf((long) r12.A01)}));
                Reel reel = r12.A0H;
                IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
                if (intentAwareAdsInfo != null) {
                    str = intentAwareAdsInfo.A09;
                } else {
                    str = null;
                }
                A002.AAJ("trigger_type", str);
                switch (num.intValue()) {
                    case 0:
                        str2 = "CTA";
                        break;
                    case 1:
                        str2 = "PROFILE_NAME";
                        break;
                    default:
                        str2 = "PROFILE_IMAGE";
                        break;
                }
                A002.AAJ("click_type", str2);
                IntentAwareAdsInfo intentAwareAdsInfo2 = reel.A0B;
                if (intentAwareAdsInfo2 == null || (str6 = intentAwareAdsInfo2.A07) == null) {
                    l2 = null;
                } else {
                    l2 = 00y.A0n(10, str6);
                }
                A002.A9F("hscroll_seed_ad_id", l2);
                A002.AAJ("container_module", r7.getModuleName());
                IntentAwareAdsInfo intentAwareAdsInfo3 = reel.A0B;
                if (intentAwareAdsInfo3 != null) {
                    num2 = intentAwareAdsInfo3.A02;
                } else {
                    num2 = null;
                }
                A002.AAJ("multi_ads_type", String.valueOf(num2));
                IntentAwareAdsInfo intentAwareAdsInfo4 = reel.A0B;
                if (intentAwareAdsInfo4 == null || (num3 = intentAwareAdsInfo4.A02) == null) {
                    l3 = null;
                } else {
                    l3 = Long.valueOf((long) num3.intValue());
                }
                A002.A9F("multi_ads_type_number", l3);
                IntentAwareAdsInfo intentAwareAdsInfo5 = reel.A0B;
                if (intentAwareAdsInfo5 != null) {
                    str3 = intentAwareAdsInfo5.A06;
                } else {
                    str3 = null;
                }
                A002.AAJ("multi_ads_id", str3);
                IntentAwareAdsInfo intentAwareAdsInfo6 = reel.A0B;
                if (intentAwareAdsInfo6 != null) {
                    str4 = intentAwareAdsInfo6.A06;
                } else {
                    str4 = null;
                }
                A002.AAJ("multi_ads_unit_id", str4);
                IntentAwareAdsInfo intentAwareAdsInfo7 = reel.A0B;
                if (intentAwareAdsInfo7 != null) {
                    str5 = intentAwareAdsInfo7.A04;
                } else {
                    str5 = null;
                }
                A002.AAJ("insertion_mechanism", str5);
                IntentAwareAdsInfo intentAwareAdsInfo8 = reel.A0B;
                if (intentAwareAdsInfo8 != null) {
                    bool = intentAwareAdsInfo8.A01;
                }
                A002.A7p("is_seed_ad_multi_ads_eligible", bool);
                A002.AAJ("tracking_token", r11.ByO(userSession));
                A002.Cgf();
            }
        }
    }

    public final void A0E(C250973mM r9, C255783ui r10) {
        Long l;
        String str;
        String id;
        C255773uh A082 = r9.A08(this.A06);
        1Xj r7 = A082.A0b;
        if (r7 != null) {
            GT8 gt8 = (GT8) this.A0I.get(A082.CFY());
            if (gt8 != null) {
                0wc r2 = this.A05;
                1Ln r4 = new 1Ln(r2.A00(r2.A00, "instagram_organic_story_media_reshare"), 306);
                String str2 = null;
                if (r4.A00.isSampled()) {
                    C309426Yf r0 = gt8.A05;
                    double d = ((double) (r0.A0A * r0.A0B)) / 1000.0d;
                    String id2 = r7.getId();
                    if (id2 != null) {
                        r4.A0m(id2);
                        r4.A0Q("m_t", Long.valueOf((long) r7.BR7().A00));
                        Reel reel = r9.A0H;
                        String id3 = reel.getId();
                        0qQ.A07(id3);
                        r4.A0R("reel_id", id3);
                        r4.A0R("tray_session_id", this.A0H);
                        r4.A0R("viewer_session_id", this.A0E.getSessionId());
                        1Ns r02 = reel.A0W;
                        if (r02 == null || (id = r02.getId()) == null) {
                            l = null;
                        } else {
                            l = 00y.A0n(10, id);
                        }
                        r4.A0Q("a_pk", l);
                        ProductType productType = r10.A0m;
                        if (productType != null) {
                            str2 = productType.A00;
                        }
                        r4.A0R("tapped_media_product_type", str2);
                        r4.A0R("tapped_media_id", r10.A1a);
                        UpcomingEventImpl upcomingEventImpl = r10.A1A;
                        if (upcomingEventImpl != null) {
                            str = upcomingEventImpl.A0B;
                        } else {
                            str = r10.A1m;
                        }
                        r4.A0R("upcoming_event_id", str);
                        r4.A0Q("reel_position", Long.valueOf((long) gt8.A00()));
                        r4.A0Q("reel_size", Long.valueOf((long) gt8.A02.A0O(gt8.A01).size()));
                        r4.A0P("time_elapsed", Double.valueOf(d));
                        r4.A0Q("tray_position", Long.valueOf((long) gt8.A04.A0E));
                        r4.Cgf();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            return;
        }
        String str3 = A082.A0j;
        String id4 = r9.A0H.getId();
        0qQ.A07(id4);
        0wb.A03("ReelViewerLogger", 002.A0u("Missing media ID for reel item: ", str3, ", In reel: ", id4));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(X.C250973mM r12, X.C255783ui r13, java.lang.Boolean r14, java.lang.String r15, int r16, int r17) {
        /*
            r11 = this;
            com.instagram.common.session.UserSession r3 = r11.A06
            X.3uh r2 = r12.A08(r3)
            boolean r0 = r2.CWu()
            if (r0 == 0) goto L_0x003a
            X.1Xj r1 = r2.A0b
            java.lang.String r6 = "Required value was null."
            if (r1 == 0) goto L_0x0107
            com.instagram.user.model.User r5 = r13.A1B
            if (r5 == 0) goto L_0x0101
            java.lang.String r7 = r13.A1f
            X.0qQ.A07(r7)
            java.lang.String r4 = r13.A1g
            java.lang.String r0 = "mention_professional_username"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0041
            X.6aJ r2 = r11.A0A
            java.lang.String r1 = r1.A2n()
            if (r1 == 0) goto L_0x003b
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.String r0 = "share_business_sticker"
            X.FEI.A00(r2, r3, r5, r1, r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0041:
            com.instagram.model.reels.Reel r0 = r12.A0H
            X.6aJ r0 = A01(r0, r11)
            X.3sc r6 = X.GTA.A02(r3, r0, r2, r15)
            java.lang.String r0 = r5.getId()
            r6.A7O = r0
            java.lang.String r0 = r5.getUsername()
            r6.A7B = r0
            r6.A5K = r7
            if (r4 == 0) goto L_0x0062
            int r0 = r4.hashCode()
            switch(r0) {
                case -828308891: goto L_0x00e1;
                case -658873289: goto L_0x00f3;
                case 52159282: goto L_0x00de;
                case 1132176267: goto L_0x00db;
                default: goto L_0x0062;
            }
        L_0x0062:
            if (r14 == 0) goto L_0x006e
            boolean r0 = r14.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A2D = r0
        L_0x006e:
            r0 = r16
            float r8 = (float) r0
            r0 = r17
            float r5 = (float) r0
            r4 = 0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            android.content.Context r4 = r11.A04
            int r0 = X.AnonymousClass0nB.A01(r4)
            float r0 = (float) r0
            float r9 = X.0nA.A01(r4, r0)
            int r0 = X.AnonymousClass0nB.A00(r4)
            float r0 = (float) r0
            float r7 = X.0nA.A01(r4, r0)
            float r10 = X.0nA.A01(r4, r8)
            float r8 = X.0nA.A01(r4, r5)
            double r4 = (double) r10
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r6.A2V = r0
            double r4 = (double) r8
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r6.A2W = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            if (r0 == 0) goto L_0x00af
            r6.A05 = r10
        L_0x00af:
            java.lang.Float r0 = java.lang.Float.valueOf(r8)
            if (r0 == 0) goto L_0x00b7
            r6.A06 = r8
        L_0x00b7:
            double r4 = (double) r9
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r6.A2U = r0
            double r4 = (double) r7
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r6.A2T = r0
        L_0x00c5:
            java.util.Map r4 = r11.A0I
            java.lang.String r0 = r2.CFY()
            java.lang.Object r0 = r4.get(r0)
            X.GT8 r0 = (X.GT8) r0
            A04(r6, r0, r11)
            X.6aJ r2 = r11.A0A
            r0 = 0
            X.C233822wX.A0C(r3, r6, r1, r2, r0)
            return
        L_0x00db:
            java.lang.String r0 = "mention_username"
            goto L_0x00e3
        L_0x00de:
            java.lang.String r0 = "mention_valentines"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "mention_anti_valentines"
        L_0x00e3:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r13.A1t
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "mention_sticker"
            goto L_0x00fd
        L_0x00f0:
            java.lang.String r0 = "caption_mention"
            goto L_0x00fd
        L_0x00f3:
            java.lang.String r0 = "mention_reshare"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "story_reshare"
        L_0x00fd:
            r6.A5x = r0
            goto L_0x0062
        L_0x0101:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0107:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C310016aI.A0G(X.3mM, X.3ui, java.lang.Boolean, java.lang.String, int, int):void");
    }

    public final void A0H(C250973mM r18, C255783ui r19, Boolean bool, String str, String str2) {
        String str3;
        1Xj r5;
        GT8 gt8;
        User A2A;
        String name;
        long j;
        String str4;
        int i;
        int i2;
        UserSession userSession = this.A06;
        C250973mM r52 = r18;
        C255773uh A082 = r52.A08(userSession);
        if (A082.CWu()) {
            1Xj r3 = A082.A0b;
            if (r3 != null) {
                String str5 = str;
                String str6 = str2;
                C255783ui r1 = r19;
                if (r3.CcK() || !"hashtag_attempt".equals(str5)) {
                    C254523sc A022 = GTA.A02(userSession, A01(r52.A0H, this), A082, str5);
                    A022.A5S = str6;
                    A022.A5K = r1.A1f;
                    if (r1.A1t) {
                        str3 = "hashtag_sticker";
                    } else {
                        str3 = "caption_hashtag";
                    }
                    A022.A5U = str3;
                    if (bool != null) {
                        A022.A2D = Boolean.valueOf(bool.booleanValue());
                    }
                    A04(A022, (GT8) this.A0I.get(A082.CFY()), this);
                    C233822wX.A0C(userSession, A022, r3, this.A0A, (Integer) null);
                    return;
                }
                C255773uh A083 = r52.A08(userSession);
                1Ns r11 = r52.A0H.A0W;
                if (r11 != null && (r5 = A083.A0b) != null && (gt8 = (GT8) this.A0I.get(A083.CFY())) != null) {
                    C309426Yf r32 = gt8.A05;
                    0wc r12 = this.A05;
                    1Ln r2 = new 1Ln(r12.A00(r12.A00, "instagram_organic_hashtag_attempt"), 299);
                    if (r2.A00.isSampled() && (A2A = r5.A2A(userSession)) != null && (name = A2A.B6o().name()) != null) {
                        String id = r11.getId();
                        0qQ.A07(id);
                        Long A0n = 00y.A0n(10, id);
                        long j2 = 0;
                        if (A0n != null) {
                            j = A0n.longValue();
                        } else {
                            j = 0;
                        }
                        r2.A0Q("a_pk", Long.valueOf(j));
                        r2.A0k("hashtag_attempt");
                        r2.A0P("elapsed_time_since_last_item", Double.valueOf(-1.0d));
                        r2.A0R("follow_status", name);
                        r2.A0R("from", r1.A1f);
                        if (r1.A1t) {
                            str4 = "hashtag_sticker";
                        } else {
                            str4 = "caption_hashtag";
                        }
                        r2.A0R("hashtag_type", str4);
                        r2.A0R("hashtag", str6);
                        r2.A0O("is_acp_delivered", false);
                        r2.A0O("is_video_to_carousel", Boolean.valueOf(gt8.A07));
                        r2.A0m(C294185m0.A09(r5));
                        r2.A0Q("m_t", Long.valueOf((long) r5.BR7().A00));
                        long A1A = r5.A1A();
                        if (Long.valueOf(A1A) != null) {
                            j2 = A1A;
                        }
                        r2.A0Q("m_ts", Long.valueOf(j2));
                        Reel reel = gt8.A02;
                        String id2 = reel.getId();
                        0qQ.A07(id2);
                        r2.A0R("reel_id", id2);
                        r2.A0Q("reel_position", Long.valueOf((long) gt8.A00()));
                        UserSession userSession2 = gt8.A01;
                        r2.A0Q("reel_size", Long.valueOf((long) reel.A0O(userSession2).size()));
                        C250973mM r10 = gt8.A04;
                        if (r10.A0L) {
                            i = 0;
                        } else {
                            i = r10.A00;
                        }
                        r2.A0Q("reel_start_position", Long.valueOf((long) i));
                        String str7 = "";
                        r2.A0R("reel_type", reel.A0H(userSession2));
                        r2.A0Q("reel_viewer_position", Long.valueOf((long) r32.A0I));
                        r2.A0Q("session_reel_counter", Long.valueOf((long) gt8.A00));
                        r2.A0R("source_of_action", A00(A083, this).getModuleName());
                        String str8 = this.A0G;
                        if (str8 == null) {
                            str8 = str7;
                        }
                        r2.A0R("story_ranking_token", str8);
                        r2.A0P("time_elapsed", Double.valueOf(((double) (r32.A0B * r32.A0A)) / 1000.0d));
                        String A2v = r5.A2v();
                        if (A2v != null) {
                            str7 = A2v;
                        }
                        r2.A0R("tracking_token", str7);
                        Long valueOf = Long.valueOf((long) r10.A0E);
                        r2.A0Q("tray_position", valueOf);
                        r2.A0R("tray_session_id", this.A0H);
                        r2.A0R("viewer_session_id", this.A0E.getSessionId());
                        if (reel.A17(userSession2)) {
                            i2 = reel.A00;
                        } else {
                            i2 = -1;
                        }
                        r2.A0Q("carousel_opt_in_position", Long.valueOf((long) i2));
                        if (gt8.A03.CcK()) {
                            r2.A0Q("ad_position_from_server", valueOf);
                        }
                        r2.Cgf();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0J(C250973mM r5, C309426Yf r6, C297795sM r7) {
        UserSession userSession = this.A06;
        C254523sc A022 = GTA.A02(userSession, A01(r5.A0H, this), r5.A08(userSession), "gesture");
        A022.A12 = r7;
        A022.A7M = "swipe_up";
        A03(A022, r5, this, r6);
    }

    public final void A0L(C250973mM r12, C309426Yf r13, String str, String str2) {
        GT8 gt8;
        FollowStatus followStatus;
        if (r12 != null && r13 != null) {
            UserSession userSession = this.A06;
            C255773uh A082 = r12.A08(userSession);
            Long l = null;
            if (A082.CWu() && (gt8 = (GT8) this.A0I.get(A082.CFY())) != null) {
                1Xj r4 = A082.A0b;
                r4.getClass();
                Reel reel = r12.A0H;
                1Nr r7 = reel.A0W;
                C310026aJ r1 = this.A0A;
                r1.A00 = reel;
                0wc A012 = AnonymousClass0kN.A01(r1, userSession);
                1Ln r3 = new 1Ln(A012.A00(A012.A00, "ig_story_quick_reaction"), 240);
                if (r3.A00.isSampled()) {
                    String id = r4.getId();
                    if (id != null) {
                        r3.A0m(id);
                        r3.A0Q("m_t", Long.valueOf((long) r4.BR7().A00));
                        r3.A0P("time_elapsed", Double.valueOf(((double) (r13.A0B * r13.A0A)) / 1000.0d));
                        r3.A0P("time_remaining", Double.valueOf(((double) (Math.max(0.0f, 1.0f - r13.A0B) * r13.A0A)) / 1000.0d));
                        r3.A0R("tray_session_id", this.A0H);
                        r3.A0R("viewer_session_id", this.A0E.getSessionId());
                        Reel reel2 = gt8.A02;
                        String id2 = reel2.getId();
                        0qQ.A07(id2);
                        r3.A0R("reel_id", id2);
                        r3.A0k(str);
                        r3.A0R("quick_reaction_type", str2);
                        UserSession userSession2 = gt8.A01;
                        r3.A0R("reel_type", reel2.A0H(userSession2));
                        r3.A0R("inventory_source", r4.A0C.BIl());
                        r3.A0Q("reel_size", Long.valueOf((long) reel2.A0O(userSession2).size()));
                        Parcelable.Creator creator = User.CREATOR;
                        User A2A = r4.A2A(userSession);
                        if (A2A != null) {
                            followStatus = A2A.B6o();
                        } else {
                            followStatus = null;
                        }
                        r3.A0R("follow_status", 1aC.A06(followStatus));
                        r3.A0O("first_view", Boolean.valueOf(gt8.A06));
                        r3.A0Q("tray_position", Long.valueOf((long) gt8.A04.A0E));
                        Hashtag B6n = r4.A0C.B6n();
                        if (B6n != null) {
                            String id3 = B6n.getId();
                            if (id3 != null) {
                                l = 00y.A0n(10, id3);
                            }
                            r3.A0Q("hashtag_id", l);
                        }
                        if (r7 instanceof 1Nr) {
                            r3.A0Q("a_pk", 00y.A0n(10, r7.getId()));
                        } else if (r7 instanceof AnonymousClass6YJ) {
                            AnonymousClass6YJ r72 = (AnonymousClass6YJ) r7;
                            String str3 = r72.A00.A07;
                            0qQ.A0B(str3, 0);
                            r3.A0Q("o_pk", 00y.A0n(10, str3));
                            r3.A0R("o_t", r72.A00());
                        }
                        r3.Cgf();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }

    public final void A0O(C250973mM r6, String str) {
        UserSession userSession = this.A06;
        C255773uh A082 = r6.A08(userSession);
        if (A082.CWu()) {
            1Xj r4 = A082.A0b;
            r4.getClass();
            C310026aJ A012 = A01(r6.A0H, this);
            0wc A013 = AnonymousClass0kN.A01(A012, userSession);
            1Ln r1 = new 1Ln(A013.A00(A013.A00, "ig_story_entity_impression"), 238);
            if (r1.A00.isSampled()) {
                r1.A0n(A012.getModuleName());
                r1.A0m(r4.getId());
                r1.A0R("tapped_entity", str);
                r1.Cgf();
            }
        }
    }

    public final void A0P(C250973mM r9, String str, float f, float f2, int i) {
        UserSession userSession = this.A06;
        Reel reel = r9.A0H;
        1Ln A0C2 = 1Ln.A0C(AnonymousClass0kN.A01(A01(reel, this), userSession));
        A0C2.A0m("");
        A0C2.A0Q("m_t", 0L);
        A0C2.A0P("time_elapsed", Double.valueOf(((double) (f * f2)) / 1000.0d));
        float f3 = 1.0f - f;
        float f4 = 0.0f;
        if (0.0f < f3) {
            f4 = f3;
        }
        A0C2.A0P("time_remaining", Double.valueOf(((double) (f4 * f2)) / 1000.0d));
        A0C2.A0R("tray_session_id", this.A0H);
        A0C2.A0R("viewer_session_id", this.A0E.getSessionId());
        A0C2.A0R("reel_id", reel.getId());
        A0C2.A0k("tap");
        A0C2.A0Q("carousel_index", Long.valueOf((long) i));
        A0C2.A0R("reel_type", String.valueOf(reel.A0P));
        A0C2.A0R("tapped_entity", str);
        A0C2.Cgf();
    }

    public final void A0Q(C250973mM r11, String str, String str2, float f, float f2) {
        GT8 gt8;
        UserSession userSession = this.A06;
        C255773uh A082 = r11.A08(userSession);
        Long l = null;
        if (A082.CWu() && (gt8 = (GT8) this.A0I.get(A082.CFY())) != null) {
            1Xj r4 = A082.A0b;
            r4.getClass();
            1Ln A0C2 = 1Ln.A0C(AnonymousClass0kN.A01(A01(r11.A0H, this), userSession));
            if (A0C2.A00.isSampled()) {
                String id = r4.getId();
                if (id != null) {
                    A0C2.A0m(id);
                    A0C2.A0Q("m_t", Long.valueOf((long) r4.BR7().A00));
                    A0C2.A0P("time_elapsed", Double.valueOf(((double) (f * f2)) / 1000.0d));
                    float f3 = 1.0f - f;
                    float f4 = 0.0f;
                    if (0.0f < f3) {
                        f4 = f3;
                    }
                    A0C2.A0P("time_remaining", Double.valueOf(((double) (f4 * f2)) / 1000.0d));
                    A0C2.A0R("tray_session_id", this.A0H);
                    A0C2.A0R("viewer_session_id", this.A0E.getSessionId());
                    Reel reel = gt8.A02;
                    String id2 = reel.getId();
                    0qQ.A07(id2);
                    A0C2.A0R("reel_id", id2);
                    if (str == null) {
                        str = "";
                    }
                    A0C2.A0k(str);
                    UserSession userSession2 = gt8.A01;
                    A0C2.A0Q("reel_size", Long.valueOf((long) reel.A0O(userSession2).size()));
                    A0C2.A0Q("tray_position", Long.valueOf((long) gt8.A04.A0E));
                    A0C2.A0R("reel_type", reel.A0H(userSession2));
                    User A2A = r4.A2A(userSession);
                    if (A2A != null) {
                        l = 00y.A0n(10, A2A.getId());
                    }
                    A0C2.A0Q("a_pk", l);
                    A0C2.A0R("tracking_token", r4.A0C.getOrganicTrackingToken());
                    A0C2.A0R("tapped_entity", str2);
                    A0C2.Cgf();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final void onCreate() {
        this.A07.onCreate();
    }

    public final void onDestroy() {
        this.A07.onDestroy();
    }

    public final void onDestroyView() {
        this.A07.onDestroyView();
    }

    public final void onPause() {
        this.A07.onPause();
    }

    public final void onResume() {
        this.A07.onResume();
    }

    public final void A06(Reel reel, C255773uh r8, String str) {
        if (r8.CWu()) {
            1Xj r5 = r8.A0b;
            if (r5 != null) {
                UserSession userSession = this.A06;
                C310026aJ r3 = this.A0A;
                r3.A00 = reel;
                C254523sc A042 = C254513sb.A04(r5, r3, "caption_dismiss");
                A042.A0G(userSession, r5);
                A042.A5K = str;
                A04(A042, (GT8) this.A0I.get(r8.CFY()), this);
                C233822wX.A0C(userSession, A042, r5, r3, (Integer) null);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A08(C255773uh r5, float f) {
        C310026aJ A002 = A00(r5, this);
        UserSession userSession = this.A06;
        C254523sc A022 = GTA.A02(userSession, A002, r5, "opt_in_tap");
        A022.A04 = f;
        C233822wX.A0A(userSession, A022, r5.A09());
        A04(A022, (GT8) this.A0I.get(r5.CFY()), this);
        C233822wX.A0I(userSession, A022, this.A0A, AnonymousClass05K.A01);
    }
}
