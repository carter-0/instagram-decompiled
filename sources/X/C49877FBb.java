package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.FBb  reason: case insensitive filesystem */
public final class C49877FBb {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C273004lm A03;
    public final F3F A04;
    public final String A05;

    public /* synthetic */ C49877FBb(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, F3F f3f, String str, int i) {
        C273004lm r0 = null;
        fragment = (i & 8) != 0 ? null : fragment;
        f3f = (i & 16) != 0 ? new F3F(fragmentActivity, userSession) : f3f;
        r0 = (i & 32) != 0 ? C272994ll.A00(userSession) : r0;
        AnonymousClass7TG.A1U(userSession, fragmentActivity, str);
        AnonymousClass7TG.A1S(f3f, r0);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = str;
        this.A00 = fragment;
        this.A04 = f3f;
        this.A03 = r0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x004a: MOVE  (r1v3 X.2ZS) = (r1v2 X.2ZS)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A01(android.content.Context r8, X.C46401DeO r9, int r10, int r11) {
        /*
            r7 = this;
            r0 = -1
            if (r11 == r0) goto L_0x0008
            r0 = 9683(0x25d3, float:1.3569E-41)
            if (r11 == r0) goto L_0x0008
        L_0x0007:
            return
        L_0x0008:
            r6 = 2
            r3 = 1
            if (r10 == r6) goto L_0x0058
            r2 = 3
            if (r10 == r2) goto L_0x0042
            r0 = 4
            if (r10 == r0) goto L_0x0039
            r0 = 5
            if (r10 == r0) goto L_0x0030
            r0 = 9587(0x2573, float:1.3434E-41)
            if (r10 != r0) goto L_0x0007
            if (r9 == 0) goto L_0x0007
            int r1 = r9.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x002d
            if (r1 == r3) goto L_0x0061
            if (r1 == r6) goto L_0x0007
            if (r1 == r2) goto L_0x0007
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x002d:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.PROMO_VIDEO
            goto L_0x0063
        L_0x0030:
            r0 = 2131962036(0x7f1328b4, float:1.9560786E38)
            X.C59689JTv.A07(r8, r0)
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.SUBSCRIBER_CHAT_STORY_STICKER
            goto L_0x0063
        L_0x0039:
            r0 = 2131962036(0x7f1328b4, float:1.9560786E38)
            X.C59689JTv.A07(r8, r0)
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.SUBSCRIPTION_STORY_STICKER
            goto L_0x0063
        L_0x0042:
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof X.2ZS
            if (r0 == 0) goto L_0x0055
            X.2ZS r1 = (X.2ZS) r1
            if (r1 == 0) goto L_0x0055
            X.C240073Jm.A00 = r3
            X.1QK r0 = X.1QK.A0C
            r1.Enh(r0)
        L_0x0055:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.POST_OR_REEL
            goto L_0x0063
        L_0x0058:
            r0 = 2131962036(0x7f1328b4, float:1.9560786E38)
            X.C59689JTv.A07(r8, r0)
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.SUBSCRIBER_STORY
            goto L_0x0063
        L_0x0061:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = com.instagram.api.schemas.FanClubNextStepsRecommendationsType.WELCOME_VIDEO
        L_0x0063:
            java.lang.String r5 = r0.toString()
            X.4lm r4 = r7.A03
            java.lang.String r3 = r7.A05
            r2 = 0
            X.0qQ.A0B(r5, r6)
            X.0wc r1 = r4.A00
            java.lang.String r0 = "ig_fan_club_settings_recommendations_recommendation_completed"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "creator_management_settings"
            X.DbS.A1O(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A01
            java.lang.String r0 = r0.A06
            X.DbY.A1G(r1, r0)
            java.lang.String r0 = "origin"
            r1.AAJ(r0, r3)
            r0 = 1803(0x70b, float:2.527E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.AAJ(r0, r5)
            java.lang.String r0 = "media_id"
            r1.A9F(r0, r2)
            r1.Cgf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49877FBb.A01(android.content.Context, X.DeO, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d6, code lost:
        r0.A0C(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ec, code lost:
        X.Dba.A12(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0107, code lost:
        X.FC2.A01(r4, r0, r3, r2, false).CfS(r12.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0110, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015a, code lost:
        A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x015d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.api.schemas.FanClubNextStepsRecommendationsType r13, java.lang.Integer r14) {
        /*
            r12 = this;
            r7 = 0
            X.0qQ.A0B(r13, r7)
            java.lang.String r3 = r13.toString()
            X.4lm r5 = r12.A03
            java.lang.String r4 = r12.A05
            r8 = 1
            r2 = 2
            X.0qQ.A0B(r3, r2)
            X.0wc r1 = r5.A00
            java.lang.String r0 = "ig_fan_club_settings_recommendations_recommendation_tapped"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = X.C63261Ku6.A00(r14)
            X.DbS.A1O(r1, r0)
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r0 = r0.A06
            X.DbY.A1G(r1, r0)
            java.lang.String r6 = "origin"
            r1.AAJ(r6, r4)
            r0 = 1803(0x70b, float:2.527E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.AAJ(r0, r3)
            r1.Cgf()
            int r0 = r13.ordinal()
            switch(r0) {
                case 1: goto L_0x0050;
                case 2: goto L_0x00a1;
                case 3: goto L_0x00da;
                case 4: goto L_0x00fd;
                case 5: goto L_0x0111;
                case 6: goto L_0x0129;
                case 7: goto L_0x0131;
                case 8: goto L_0x0077;
                case 9: goto L_0x00f0;
                case 10: goto L_0x0121;
                case 11: goto L_0x003f;
                case 12: goto L_0x00f0;
                case 13: goto L_0x0149;
                case 14: goto L_0x003f;
                case 15: goto L_0x0153;
                case 16: goto L_0x0040;
                case 17: goto L_0x015e;
                default: goto L_0x003f;
            }
        L_0x003f:
            return
        L_0x0040:
            X.F3F r1 = r12.A04
            androidx.fragment.app.Fragment r0 = r12.A00
            if (r0 == 0) goto L_0x003f
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L_0x003f
            r1.A00(r0)
            return
        L_0x0050:
            X.F3F r1 = r12.A04
            java.lang.String r5 = "next_step_recommendations"
            androidx.fragment.app.FragmentActivity r0 = r1.A00
            com.instagram.common.session.UserSession r4 = r1.A01
            X.6Yo r3 = X.DbS.A0M(r0, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318986484390695(0x8107ed00011b27, double:3.0316115253242667E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0074
            java.lang.String r1 = "com.bloks.www.ig_subscriptions.creator_experience.special_deals"
        L_0x006b:
            java.util.HashMap r0 = X.DbY.A0m(r6, r5)
            X.3M3 r0 = X.C46649DiU.A02(r4, r1, r0)
            goto L_0x00ec
        L_0x0074:
            java.lang.String r1 = "com.instagram.user_pay.fan_club.screens.creator_onboarding.special_deals"
            goto L_0x006b
        L_0x0077:
            com.instagram.common.session.UserSession r5 = r12.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.DbY.A09(r5)
            java.lang.String r1 = "prior_module_name"
            java.lang.String r0 = "FanClubSettingsRecommendations"
            r2.putString(r1, r0)
            java.lang.String r0 = "is_modal"
            r2.putBoolean(r0, r8)
            r0 = 1071(0x42f, float:1.501E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r8)
            androidx.fragment.app.FragmentActivity r4 = r12.A01
            r0 = 1556(0x614, float:2.18E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.6W8 r0 = X.DbS.A0b(r4, r2, r5, r3, r0)
            goto L_0x00d6
        L_0x00a1:
            X.F3F r4 = r12.A04
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "interest_based_channel_entry_point"
            java.lang.String r0 = "broadcast_chat_setup"
            r3.putString(r1, r0)
            java.lang.String r0 = "interest_based_channel_implicit_audience_type"
            r3.putInt(r0, r2)
            com.instagram.direct.channels.analytics.ChannelCreationSource r1 = com.instagram.direct.channels.analytics.ChannelCreationSource.PROFILE
            java.lang.String r0 = "social_channel_creation_source"
            r3.putParcelable(r0, r1)
            java.lang.String r1 = "Broadcast"
            java.lang.String r0 = "InterestBasedChannelType"
            r3.putString(r0, r1)
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r3.putBoolean(r0, r7)
            com.instagram.common.session.UserSession r2 = r4.A01
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r4 = r4.A00
            java.lang.String r0 = "channel_creation_configure"
            X.6W8 r0 = X.DbV.A0Y(r4, r3, r2, r1, r0)
        L_0x00d6:
            r0.A0C(r4)
            return
        L_0x00da:
            X.F3F r2 = r12.A04
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A01
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            X.F3X r1 = r2.A02
            java.lang.String r0 = "preview_picker"
            X.Ubn r0 = r1.A00(r0)
        L_0x00ec:
            X.Dba.A12(r0, r3)
            return
        L_0x00f0:
            com.instagram.common.session.UserSession r4 = r12.A02
            com.instagram.direct.channels.analytics.ChannelCreationSource r3 = com.instagram.direct.channels.analytics.ChannelCreationSource.SUBSCRIPTION_SETTINGS
            X.EV0 r2 = X.EV0.Social
            r1 = 0
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r0 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r0.<init>(r1, r1, r1)
            goto L_0x0107
        L_0x00fd:
            com.instagram.common.session.UserSession r4 = r12.A02
            com.instagram.direct.channels.analytics.ChannelCreationSource r3 = com.instagram.direct.channels.analytics.ChannelCreationSource.SUBSCRIPTION_SETTINGS
            r2 = 0
            com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r0 = new com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs
            r0.<init>(r2, r2, r2)
        L_0x0107:
            X.G6v r1 = X.FC2.A01(r4, r0, r3, r2, r7)
            androidx.fragment.app.FragmentActivity r0 = r12.A01
            r1.CfS(r0)
            return
        L_0x0111:
            X.1Yy r3 = X.FC8.A01()
            androidx.fragment.app.FragmentActivity r2 = r12.A01
            com.instagram.common.session.UserSession r1 = r12.A02
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r3.A05(r2, r1, r4, r0)
            return
        L_0x0121:
            r0 = 3247(0xcaf, float:4.55E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 5
            goto L_0x015a
        L_0x0129:
            r0 = 2341(0x925, float:3.28E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 3
            goto L_0x015a
        L_0x0131:
            X.F3F r2 = r12.A04
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A01
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            X.F3X r2 = r2.A02
            r3 = r8
            r4 = r7
            r5 = r7
            r6 = r8
            X.E4g r0 = r2.A01(r3, r4, r5, r6, r7)
            X.Dba.A12(r0, r1)
            return
        L_0x0149:
            r0 = 27
            java.lang.String r0 = X.C273654mx.A00(r0)
            r12.A00(r0, r2)
            return
        L_0x0153:
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 4
        L_0x015a:
            r12.A00(r1, r0)
            return
        L_0x015e:
            X.F3F r2 = r12.A04
            androidx.fragment.app.FragmentActivity r1 = r2.A00
            com.instagram.common.session.UserSession r0 = r2.A01
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            X.F3X r6 = r2.A02
            r9 = r7
            r10 = r8
            r11 = r7
            X.E4g r0 = r6.A01(r7, r8, r9, r10, r11)
            X.Dba.A12(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49877FBb.A02(com.instagram.api.schemas.FanClubNextStepsRecommendationsType, java.lang.Integer):void");
    }

    private final void A00(String str, int i) {
        Bundle A0a = AnonymousClass7TE.A0a();
        FragmentActivity fragmentActivity = this.A01;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(fragmentActivity, A0a, this.A02, TransparentModalActivity.class, str);
        A022.A07();
        Fragment fragment = this.A00;
        if (fragment == null || fragment.getContext() == null) {
            A022.A0A(fragmentActivity, i);
        } else {
            A022.A0D(fragment, i);
        }
    }
}
