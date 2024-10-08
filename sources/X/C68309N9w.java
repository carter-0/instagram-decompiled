package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineUnreadMessage;
import com.facebook.messenger.notification.engine.MSGOpenPathRenderedNotification;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.N9w  reason: case insensitive filesystem */
public final class C68309N9w extends MSGNotificationEngineInstagramSyncPathIntegrator.MSGNotificationEngineOpenPathIntegratorCallback {
    public final UserSession A00;
    public final 1XZ A01 = AnonymousClass3F2.A00();

    public C68309N9w(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.OUr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.OUr, java.lang.Object] */
    public final void onNotification(MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification) {
        String str;
        ArrayList arrayList;
        AnonymousClass5HN r1;
        AnonymousClass5HJ A002;
        AnonymousClass5HN r12;
        MSGOpenPathRenderedNotification mSGOpenPathRenderedNotification2 = mSGOpenPathRenderedNotification;
        0qQ.A0B(mSGOpenPathRenderedNotification2, 0);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 1);
        String threadId = mSGOpenPathRenderedNotification2.getThreadId();
        String messageId = mSGOpenPathRenderedNotification2.getMessageId();
        String notificationId = mSGOpenPathRenderedNotification2.getNotificationId();
        SimpleImageUrl simpleImageUrl = null;
        if (threadId == null || messageId == null || notificationId == null) {
            str = "threadKey or messageId or notificationId is null from the engine but should not be";
        } else {
            C70807OMc oMc = new C70807OMc(userSession);
            OUr oUr = OUr.A00;
            OUr oUr2 = oUr;
            if (oUr == null) {
                ? obj = new Object();
                OUr.A00 = obj;
                oUr2 = obj;
            }
            if (mSGOpenPathRenderedNotification2.getIsUnsent()) {
                long A003 = OUn.A00.A00(AnonymousClass5HN.UNSEND_MESSAGE, messageId, threadId);
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", "did", threadId, "x", messageId);
                0qQ.A07(formatStrLocaleSafe);
                A002 = oMc.A01(notificationId, messageId, formatStrLocaleSafe);
                A002.A1S = oUr2.A00(notificationId);
                A002.A0K = Long.valueOf(A003);
            } else {
                String engineMessage = mSGOpenPathRenderedNotification2.getEngineMessage();
                Long notifType = mSGOpenPathRenderedNotification2.getNotifType();
                String senderPK = mSGOpenPathRenderedNotification2.getSenderPK();
                if (engineMessage == null || notifType == null || senderPK == null) {
                    str = "renderedEngineMessage or notifType or senderPK is null but should not be";
                } else {
                    String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("direct_v2?%s=%s&%s=%s", PublicKeyCredentialControllerUtility.JSON_KEY_ID, threadId, "x", messageId);
                    0qQ.A07(formatStrLocaleSafe2);
                    long longValue = notifType.longValue();
                    String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s_%s", threadId, messageId, String.valueOf(longValue), senderPK);
                    0qQ.A07(formatStrLocaleSafe3);
                    ArrayList unreadMessages = mSGOpenPathRenderedNotification2.getUnreadMessages();
                    if (unreadMessages != null) {
                        arrayList = AnonymousClass7TG.A0r(unreadMessages);
                        Iterator it = unreadMessages.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((MSGNotificationEngineUnreadMessage) it.next()).getText());
                        }
                    } else {
                        arrayList = null;
                    }
                    int i = (int) longValue;
                    AnonymousClass5HN[] values = AnonymousClass5HN.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            r1 = null;
                            break;
                        }
                        r1 = values[i2];
                        if (r1.A00 == i) {
                            break;
                        }
                        i2++;
                    }
                    String A004 = O1U.A00(r1);
                    String title = mSGOpenPathRenderedNotification2.getTitle();
                    String str2 = userSession.A06;
                    String senderAvatarUrl = mSGOpenPathRenderedNotification2.getSenderAvatarUrl();
                    if (senderAvatarUrl != null) {
                        simpleImageUrl = DbS.A0V(senderAvatarUrl);
                    }
                    String sound = mSGOpenPathRenderedNotification2.getSound();
                    if (sound == null) {
                        sound = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    }
                    mSGOpenPathRenderedNotification2.getUnreadMessagesSummary();
                    A002 = oMc.A00(simpleImageUrl, title, engineMessage, "direct_v2_message", A004, str2, formatStrLocaleSafe2, sound, formatStrLocaleSafe3, messageId, senderPK, (String) null, arrayList, true);
                    OUn oUn = OUn.A00;
                    AnonymousClass5HN[] values2 = AnonymousClass5HN.values();
                    int length2 = values2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            r12 = AnonymousClass5HN.UNKNOWN;
                            break;
                        }
                        r12 = values2[i3];
                        if (r12.A00 == i) {
                            break;
                        }
                        i3++;
                    }
                    A002.A0K = Long.valueOf(oUn.A00(r12, messageId, threadId));
                    A002.A0c = mSGOpenPathRenderedNotification2.getExperimentMask();
                    A002.A0b = mSGOpenPathRenderedNotification2.getThreadName();
                    A002.A1U = mSGOpenPathRenderedNotification2.getIsVanishModeEnabled();
                    A002.A1F = mSGOpenPathRenderedNotification2.getThreadId();
                    A002.A1S = oUr2.A00(notificationId);
                    if (182.A06(0Tu.A06, userSession, 36314863316372324L)) {
                        A002.A1M = mSGOpenPathRenderedNotification2.getIsSilentPush();
                    }
                }
            }
            this.A01.A08(A002, PushChannelType.SYNC, (String) null);
            return;
        }
        0KC.A0E("NotificationEngineIntegratorConverter.convertOpenNotificationToIgNotification", str);
        C304006Bs.A00(userSession).A00(notificationId, messageId, (String) null, (String) null, str, 7);
        ? obj2 = new Object();
        OUr oUr3 = OUr.A00;
        OUr oUr4 = oUr3;
        if (oUr3 == null) {
            ? obj3 = new Object();
            OUr.A00 = obj3;
            oUr4 = obj3;
        }
        String notificationId2 = mSGOpenPathRenderedNotification2.getNotificationId();
        boolean z = true;
        if (notificationId2 == null || !oUr4.A00(notificationId2)) {
            z = false;
        }
        obj2.A00 = z;
        if (z) {
            AnonymousClass6EB.A02.A00(userSession, mSGOpenPathRenderedNotification2.getIntendedRecipientUserId(), new JG3(20, obj2, this, mSGOpenPathRenderedNotification2));
        }
    }
}
