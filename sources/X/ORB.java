package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

public abstract class ORB {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        String str2;
        0qQ.A0B(userSession, 0);
        if (bundle == null) {
            bundle = AnonymousClass7TE.A0a();
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_TITLE", fragmentActivity.getString(i));
        if (num != null) {
            str2 = fragmentActivity.getString(num.intValue());
        } else {
            str2 = "";
        }
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_DESCRIPTION", str2);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTION_NAME", str);
        bundle.putParcelableArray("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_CHOOSER_OPTIONS", directMessageInteropReachabilityOptionsArr);
        bundle.putParcelable("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_VIEW_MODEL", directMessagesInteropOptionsViewModel);
        bundle.putBoolean("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ADD_HEADER_AND_FOOTER", z);
        bundle.putString("DirectMessagesSelectOptionFragment.DIRECT_MESSAGE_OPTIONS_CONTROLS_ENTRY_POINT", bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY));
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        C69185Ngf ngf = new C69185Ngf();
        ngf.setArguments(bundle);
        A0Q.A0D(ngf);
        A0Q.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r14 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        throw X.AnonymousClass7TE.A0w(X.002.A0g("Option[", r12, "] is not implemented"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        r4 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        if (r13 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f5, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        r2.Cq3(r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fa, code lost:
        r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel r9, X.C74431Pul r10, X.16V r11, java.lang.String r12, boolean r13, boolean r14, boolean r15) {
        /*
            r8 = 0
            r0 = 6
            r2 = r10
            X.0qQ.A0B(r10, r0)
            r5 = r12
            int r0 = r12.hashCode()
            r3 = r9
            switch(r0) {
                case -2143256302: goto L_0x00bf;
                case -1890055046: goto L_0x00df;
                case -1839818691: goto L_0x00b0;
                case -1275916548: goto L_0x009b;
                case -737267292: goto L_0x008f;
                case -456614348: goto L_0x0080;
                case -371252023: goto L_0x006b;
                case -8227469: goto L_0x0055;
                case 949752640: goto L_0x003c;
                case 949752738: goto L_0x002c;
                case 1767124056: goto L_0x001c;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.String r1 = "Option["
            java.lang.String r0 = "] is not implemented"
            java.lang.String r0 = X.002.A0g(r1, r12, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x001c:
            java.lang.String r0 = "group_message_setting"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966240(0x7f133920, float:1.9569313E38)
            r4 = 0
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A04
            goto L_0x00f6
        L_0x002c:
            java.lang.String r0 = "others_on_ig"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966257(0x7f133931, float:1.9569347E38)
            r0 = 2131966228(0x7f133914, float:1.9569288E38)
            goto L_0x00ed
        L_0x003c:
            java.lang.String r0 = "others_on_fb"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966258(0x7f133932, float:1.956935E38)
            if (r15 == 0) goto L_0x004c
            r7 = 2131966256(0x7f133930, float:1.9569345E38)
        L_0x004c:
            r0 = 2131966229(0x7f133915, float:1.956929E38)
            if (r15 == 0) goto L_0x0063
            r0 = 2131966227(0x7f133913, float:1.9569286E38)
            goto L_0x0063
        L_0x0055:
            java.lang.String r0 = "fb_liked_or_followed_your_page"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966260(0x7f133934, float:1.9569353E38)
            r0 = 2131966231(0x7f133917, float:1.9569294E38)
        L_0x0063:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r14 == 0) goto L_0x00fa
            goto L_0x00f3
        L_0x006b:
            java.lang.String r0 = "ig_verified"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966243(0x7f133923, float:1.9569319E38)
            r0 = 2131966244(0x7f133924, float:1.956932E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07
            goto L_0x00f5
        L_0x0080:
            java.lang.String r0 = "ig_followers"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966265(0x7f133939, float:1.9569363E38)
            r0 = 2131966226(0x7f133912, float:1.9569284E38)
            goto L_0x00ed
        L_0x008f:
            java.lang.String r0 = "eligible_for_bc_partnership"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r10.CpJ()
            return
        L_0x009b:
            java.lang.String r0 = "fb_messaged_your_page"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966259(0x7f133933, float:1.9569351E38)
            r0 = 2131966230(0x7f133916, float:1.9569292E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06
            goto L_0x00f5
        L_0x00b0:
            java.lang.String r0 = "people_with_your_phone_number"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966266(0x7f13393a, float:1.9569365E38)
            r0 = 2131966232(0x7f133918, float:1.9569296E38)
            goto L_0x00ed
        L_0x00bf:
            java.lang.String r0 = "fb_friends"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966251(0x7f13392b, float:1.9569335E38)
            X.16V r1 = X.16V.A06
            r0 = 2131966223(0x7f13390f, float:1.9569278E38)
            if (r11 != r1) goto L_0x00d4
            r0 = 2131966224(0x7f133910, float:1.956928E38)
        L_0x00d4:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r13 != 0) goto L_0x00f3
            if (r11 == r1) goto L_0x00f3
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A05
            goto L_0x00f5
        L_0x00df:
            java.lang.String r0 = "fb_friends_of_friends"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000f
            r7 = 2131966252(0x7f13392c, float:1.9569337E38)
            r0 = 2131966225(0x7f133911, float:1.9569282E38)
        L_0x00ed:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r13 == 0) goto L_0x00fa
        L_0x00f3:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A06
        L_0x00f5:
            r8 = 1
        L_0x00f6:
            r2.Cq3(r3, r4, r5, r6, r7, r8)
            return
        L_0x00fa:
            com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions[] r6 = com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions.A07
            goto L_0x00f5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ORB.A01(com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel, X.Pul, X.16V, java.lang.String, boolean, boolean, boolean):void");
    }
}
