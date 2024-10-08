package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import java.util.Set;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Fb5  reason: case insensitive filesystem */
public final class C50397Fb5 implements C74469PvP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ C331127Pr A02;
    public final /* synthetic */ C317546nR A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ boolean A06;

    public final void DEp(String str) {
        Integer num;
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        if (!0qQ.A0K(this.A04, ChatStickerChannelType.BROADCAST.A00)) {
            num = AnonymousClass05K.A04;
        } else if (this.A06) {
            num = AnonymousClass05K.A0I;
        } else {
            num = AnonymousClass05K.A0G;
        }
        1Yy A012 = FC8.A01();
        UserSession userSession = this.A00;
        Set set = C49280EsP.A00;
        switch (num.intValue()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str2 = "join_chat_story_sticker_subscriber_chat";
                break;
            case 13:
                str2 = "live_pinned_view";
                break;
            case 14:
                str2 = "available_creators_notification";
                break;
            case 15:
                str2 = "suggested_subscriptions_netego";
                break;
            case 16:
                str2 = "subscribed_list_in_follow_connected";
                break;
            case 17:
                str2 = "subscribed_list_in_follow_unconnected";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str2 = "recommendations_list_in_sub_feed";
                break;
            case 19:
                str2 = "content_preview_activation_card";
                break;
            case 20:
                str2 = "content_preview_attribution";
                break;
            case 21:
                str2 = "new_story";
                break;
            case 22:
                str2 = "fan_referral_dm";
                break;
            case 23:
                str2 = "invite_link_preview_broadcast_chat";
                break;
            case 24:
                str2 = "message_in_story";
                break;
            default:
                str2 = "clips_chat_sticker";
                break;
        }
        A012.A06(userSession, this.A01, this.A02, str3, str2);
    }

    public final void DTc() {
    }

    public C50397Fb5(UserSession userSession, C331157Pu r2, C331127Pr r3, C317546nR r4, String str, C62320sa r6, boolean z) {
        this.A03 = r4;
        this.A00 = userSession;
        this.A04 = str;
        this.A06 = z;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
    }

    public final void Cye(boolean z) {
        this.A05.invoke();
    }

    public final void DIJ() {
        int A012;
        C317546nR r5 = this.A03;
        StoryJoinChatStatus storyJoinChatStatus = StoryJoinChatStatus.ACCEPTED;
        UserSession userSession = this.A00;
        String str = "model";
        C19469WaH waH = r5.A05;
        if (waH != null) {
            StoryJoinChatStatus storyJoinChatStatus2 = waH.A00.A02;
            if (storyJoinChatStatus2 == null || storyJoinChatStatus2 != storyJoinChatStatus) {
                A012 = waH.A01() + 1;
            } else {
                A012 = waH.A01();
            }
            waH.A05(A012);
            C19469WaH waH2 = r5.A05;
            if (waH2 != null) {
                waH2.A06(storyJoinChatStatus);
                C369668v8 r2 = r5.A04;
                if (r2 != null) {
                    View view = r5.A01;
                    str = "stickerContainerView";
                    if (view != null) {
                        Context A0S = AnonymousClass7TE.A0S(view);
                        r2.A03.A05(A012);
                        C16142UpT upT = r2.A01;
                        C306386Ly r22 = upT.A04;
                        r22.A0M(upT.A02.A04(A0S, userSession));
                        float centerX = (float) upT.getBounds().centerX();
                        Rect bounds = upT.A01.getBounds();
                        0qQ.A07(bounds);
                        r22.setBounds(C16142UpT.A00(bounds, upT, centerX));
                        upT.invalidateSelf();
                        C369668v8 r1 = r5.A04;
                        if (r1 != null) {
                            View view2 = r5.A01;
                            if (view2 != null) {
                                r1.A0B(AnonymousClass7TE.A0S(view2), storyJoinChatStatus, userSession);
                                IgSimpleImageView igSimpleImageView = r5.A03;
                                if (igSimpleImageView == null) {
                                    str = "stickerView";
                                } else {
                                    igSimpleImageView.invalidate();
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F("stickerDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
