package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.messenger.notification.engine.MSGNotificationEngineIntegrator;
import com.facebook.messenger.notification.engine.MSGRenderedNotification;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;

/* renamed from: X.N9x  reason: case insensitive filesystem */
public final class C68310N9x extends MSGNotificationEngineIntegrator.MSGNotificationEngineIntegratorCallback {
    public final UserSession A00;
    public final C70807OMc A01;

    public final void onNotification(MSGRenderedNotification mSGRenderedNotification) {
        int i;
        String str;
        String message;
        MSGRenderedNotification mSGRenderedNotification2 = mSGRenderedNotification;
        0qQ.A0B(mSGRenderedNotification2, 0);
        C70807OMc oMc = this.A01;
        SimpleImageUrl simpleImageUrl = null;
        if (!(mSGRenderedNotification2.getThreadPK() == null || mSGRenderedNotification2.getMessagePK() == null)) {
            if (mSGRenderedNotification2.getIsRenderedByEngine()) {
                message = mSGRenderedNotification2.getEngineMessage();
            } else {
                message = mSGRenderedNotification2.getMessage();
            }
            String title = mSGRenderedNotification2.getTitle();
            AnonymousClass65Y r5 = oMc.A02;
            UserSession userSession = oMc.A01;
            String A002 = r5.A00(userSession, message);
            String str2 = userSession.A06;
            Long threadPK = mSGRenderedNotification2.getThreadPK();
            if (threadPK != null) {
                String A0x = C66581MXm.A0x(threadPK);
                Long messagePK = mSGRenderedNotification2.getMessagePK();
                if (messagePK != null) {
                    String A012 = r5.A01(messagePK, (Long) null, A0x, 0, true, false);
                    String senderProfilePictureUrl = mSGRenderedNotification2.getSenderProfilePictureUrl();
                    if (senderProfilePictureUrl != null) {
                        simpleImageUrl = DbS.A0V(senderProfilePictureUrl);
                    }
                    String sound = mSGRenderedNotification2.getSound();
                    if (sound == null) {
                        sound = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    }
                    String notificationId = mSGRenderedNotification2.getNotificationId();
                    if (notificationId != null) {
                        String notificationId2 = mSGRenderedNotification2.getNotificationId();
                        if (notificationId2 != null) {
                            simpleImageUrl = oMc.A00(simpleImageUrl, title, A002, "direct_v2_message", "direct_v2_text", str2, A012, sound, notificationId, notificationId2, (String) null, (String) null, (List) null, false);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Integer notifRenderType = mSGRenderedNotification2.getNotifRenderType();
        if (notifRenderType != null) {
            i = notifRenderType.intValue();
            switch (i) {
                case 0:
                    str = "secure_text_message";
                    break;
                case 1:
                    str = "secure_message_reaction";
                    break;
                case 2:
                    str = "secure_unsend_message";
                    break;
                case 3:
                    str = "secure_forwarded_message";
                    break;
                case 4:
                    str = "secure_reply_message";
                    break;
                case 5:
                    str = "secure_media_message";
                    break;
                case 6:
                    str = "secure_message_request";
                    break;
                case 7:
                    str = "secure_thread_name_update";
                    break;
                case 8:
                    str = "secure_current_user_added_to_thread";
                    break;
                case 9:
                    str = "secure_current_user_removed_from_thread";
                    break;
                case 10:
                    str = "secure_group_invite";
                    break;
            }
        } else {
            i = -1;
        }
        str = "secure_ig_media_share";
        switch (i) {
            case IgNetworkConsentStorage.MAX_ENTRIES /*1000*/:
            case 1003:
            case 1004:
            case 1005:
            case 1006:
            case 1007:
            case 1008:
                break;
            case 1001:
                str = "secure_ig_multipost_share";
                break;
            case 1002:
                str = "secure_ig_story_reply";
                break;
            default:
                str = C273654mx.A00(3290);
                break;
        }
        if (simpleImageUrl != null) {
            simpleImageUrl.A0w = str;
            UserSession userSession2 = this.A00;
            C67295MlU.A02(simpleImageUrl, userSession2, "NotificationEngineIntegratorCallback after engine for Armadillo", (String) null, 10);
            OZF.A02.A00().A00(simpleImageUrl, userSession2);
            return;
        }
        UserSession userSession3 = this.A00;
        String notificationId3 = mSGRenderedNotification2.getNotificationId();
        String messageId = mSGRenderedNotification2.getMessageId();
        if (userSession3 != null) {
            C304006Bs.A00(userSession3).A00(notificationId3, messageId, str, (String) null, "NotificationEngineIntegratorCallback unable to convert to ig notification", 3);
        }
    }

    public /* synthetic */ C68310N9x(UserSession userSession) {
        C70807OMc oMc = new C70807OMc(userSession);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = oMc;
    }
}
