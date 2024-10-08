package X;

import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TraceInfo;
import com.facebook.msys.mci.TraceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.67a  reason: invalid class name and case insensitive filesystem */
public abstract class C3030067a {
    public static final Map A00;
    public static final PrivacyContext A01 = C3030167b.A00;
    public static final Random A02 = new Random();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("sendImageAttachmentMessage", 401);
        hashMap.put("sendImageAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendVideoAttachmentMessage", 401);
        hashMap.put("sendVideoAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendAudioAttachmentMessage", 401);
        hashMap.put("sendAudioAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendFileAttachmentMessage", 401);
        hashMap.put("sendFileAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendExternalAttachmentMessage", 401);
        hashMap.put("sendExternalAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendStickerAttachmentMessage", 401);
        hashMap.put("sendStickerAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendStickerPackAttachmentMessage", 401);
        hashMap.put("sendStickerPackAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendHotEmojiMessage", 401);
        hashMap.put("sendHotEmojiMessageWithThreadIdentifier", 401);
        hashMap.put("sendStandaloneXMAAttachmentMessage", 401);
        hashMap.put("sendStandaloneXMAAttachmentMessageWithThreadIdentifier", 401);
        hashMap.put("sendTextMessage", 401);
        hashMap.put("sendTextMessageWithThreadIdentifier", 401);
        hashMap.put("deleteMessage", 403);
        hashMap.put("deleteMessageWithThreadIdentifier", 403);
        hashMap.put("forwardMessage", 403);
        hashMap.put("forwardMessageWithThreadIdentifier", 403);
        hashMap.put("reactToMessage", 403);
        hashMap.put("reactToMessageWithThreadIdentifier", 403);
        hashMap.put("resendMessage", 403);
        hashMap.put("unsendMessage", 403);
        hashMap.put("unsendMessageWithThreadIdentifier", 403);
        hashMap.put("saveDraftMessage", 403);
        hashMap.put("loadMessageList", 406);
        hashMap.put("loadMessageListPrioritized", 406);
        hashMap.put("loadMessageListNativeCQL", 406);
        hashMap.put("loadMessageListWithToken", 406);
        hashMap.put("loadMessageListPrioritizedWithToken", 406);
        hashMap.put("loadThreadList", 406);
        hashMap.put("loadThreadListPrioritized", 406);
        hashMap.put("archiveThread", 402);
        hashMap.put("archiveThreadWithThreadIdentifier", 402);
        hashMap.put("UnarchiveThreadWithThreadIdentifier", 402);
        hashMap.put("deleteThread", 402);
        hashMap.put("deleteThreadWithThreadIdentifier", 402);
        hashMap.put("ignoreThread", 402);
        hashMap.put("markAsReadThread", 402);
        hashMap.put("markAsReadThreadWithThreadIdentifier", 402);
        hashMap.put("markAsReadThreadLocally", 402);
        hashMap.put("markAsUnreadThread", 402);
        hashMap.put("markAsUnreadThreadWithThreadIdentifier", 402);
        hashMap.put("muteThread", 402);
        hashMap.put("muteThreadWithThreadIdentifier", 402);
        hashMap.put("UnmuteThreadWithThreadIdentifier", 402);
        hashMap.put("setTypingIndicatorForThread", 402);
        hashMap.put("setTypingIndicatorForThreadWithThreadIdentifier", 402);
        hashMap.put("demoteParticipantFromAdminInGroupWithThreadIdentifier", 402);
        hashMap.put("leaveGroupWithThreadIdentifier", 402);
        hashMap.put("removeParticipantFromGroupWithThreadIdentifier", 402);
        hashMap.put("setThreadParticipantNicknameWithThreadIdentifier", 402);
        hashMap.put("promoteParticipantAsAdminInGroupWithThreadIdentifier", 402);
        hashMap.put("addParticipantsToGroupWithThreadIdentifier", 402);
        hashMap.put("updateEmojiForThreadWithThreadIdentifier", 402);
        hashMap.put("updateNameForThreadWithThreadIdentifier", 402);
        hashMap.put("updateImageForThreadWithThreadIdentifier", 402);
        hashMap.put("messageUnblockContact", 402);
        hashMap.put("messageBlockContact", 402);
        hashMap.put("facebookUnblockContact", 402);
        hashMap.put("facebookBlockContact", 402);
        A00 = Collections.unmodifiableMap(hashMap);
        PrivacyContextCoding privacyContextCoding = PrivacyContextCoding.$redex_init_class;
    }

    public static int A00(AnonymousClass685 r3) {
        int nextInt = A02.nextInt() & Integer.MAX_VALUE;
        PlatformLogger.platformEventLogNoMsysWithInstanceId(865, nextInt, 65674984);
        r3.addResultCallback(new C3030267c(nextInt));
        return nextInt;
    }

    public static TraceInfo A01(AnonymousClass685 r9, String str, String str2) {
        int i;
        String createTraceIdForType;
        String A0g = 002.A0g(str, ".", str2);
        PrivacyContext privacyContext = A01;
        if ("MailboxSDK".equals(str)) {
            Number number = (Number) A00.get(str2);
            if (number != null) {
                i = number.intValue();
            } else {
                i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            }
        } else {
            i = 74;
        }
        if ((i >= 314 && privacyContext == null) || (createTraceIdForType = TraceLogger.createTraceIdForType(i)) == null) {
            return null;
        }
        TraceLogger.log(privacyContext, i, A0g, 80, createTraceIdForType, (String) null, 0, (List) null);
        TraceLogger.log(privacyContext, i, A0g, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, createTraceIdForType, (String) null, 0, (List) null);
        TraceInfo traceInfo = TraceInfo.$redex_init_class;
        TraceInfo traceInfo2 = new TraceInfo(Integer.valueOf(i), createTraceIdForType);
        r9.addResultCallback(new C71640OoL(privacyContext, traceInfo2, A0g));
        return traceInfo2;
    }

    public static void A02(int i) {
        PlatformLogger.platformEventLog(862, i);
    }

    public static void A03(TraceInfo traceInfo, String str, String str2) {
        PrivacyContext privacyContext = A01;
        if (traceInfo != null) {
            String A0g = 002.A0g(str, ".", str2);
            TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), A0g, 2003, traceInfo.getTraceId(), (String) null, 0, (List) null);
            TraceLogger.log(privacyContext, traceInfo.getTraceType().intValue(), A0g, 81, traceInfo.getTraceId(), (String) null, 0, (List) null);
        }
    }

    public static void A04(String str, String str2, int i) {
        PlatformLogger.platformEventLog(864, i);
        PlatformLogger.platformEventLog(31, i, Collections.singletonMap("api_name", 002.A0g(str, ".", str2)));
        PlatformLogger.platformEventLog(863, i);
    }
}
