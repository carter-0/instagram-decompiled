package com.facebook.messenger.notification.engine;

import X.C70910ORf;
import X.OOU;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public final class MSGOpenPathRenderedNotification {
    public static final OOU Companion = new Object();
    public final boolean isGroupThread;
    public final boolean isRenderedByEngine;
    public final boolean isSecureMessage;
    public final boolean isShowPreviewsEnabled;
    public final boolean isSilentPush;
    public final boolean isUnsent;
    public final boolean isVanishModeEnabled;
    public NativeHolder mNativeHolder;

    public static final native NativeHolder initNativeHolder(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, Long l, Long l2, Long l3, boolean z5, String str4, Long l4, Long l5, String str5, String str6, Long l6, Long l7, Long l8, String str7, String str8, Long l9, String str9, Long l10, boolean z6, String str10, boolean z7, Long l11, Integer num, ArrayList arrayList, String str11, String str12, Integer num2, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Integer num3, Long l12, Long l13, Long l14, String str23);

    public final native Integer getAttachmentType();

    public final native String getChannelId();

    public final native Integer getChannelType();

    public final native Long getClientThreadKey();

    public final native Long getConsistentThreadFbid();

    public final native String getEngineMessage();

    public final native String getExperimentMask();

    public final native String getGroupingID();

    public final native String getIntendedRecipientUserId();

    public final native boolean getIsGroupThread();

    public final native boolean getIsRenderedByEngine();

    public final native boolean getIsSecureMessage();

    public final native boolean getIsShowPreviewsEnabled();

    public final native boolean getIsSilentPush();

    public final native boolean getIsUnsent();

    public final native boolean getIsVanishModeEnabled();

    public final native Long getLastReadWatermarkTimestampMs();

    public final native Integer getMaximumUnreadMessagesAllowed();

    public final native Long getMessageAuthoritativeTimestampMs();

    public final native String getMessageClientContext();

    public final native Long getMessageEphemeralDurationInSec();

    public final native String getMessageId();

    public final native String getMtrId();

    public final native Long getNotifType();

    public final native String getNotificationId();

    public final native String getOrcaThreadKey();

    public final native String getProfileImagePayload();

    public final native String getRenderedEngineMessage();

    public final native String getSenderAvatarUrl();

    public final native Long getSenderId();

    public final native String getSenderPK();

    public final native String getShortcutId();

    public final native String getSound();

    public final native Long getSoundNameInteger();

    public final native Long getStickerId();

    public final native String getSubtitle();

    public final native Long getTargetViewerId();

    public final native String getTargetViewerType();

    public final native String getThreadId();

    public final native Long getThreadKey();

    public final native Long getThreadLockStatus();

    public final native String getThreadName();

    public final native String getThreadPictureUrl();

    public final native Long getThreadType();

    public final native long getTimestampMs();

    public final native String getTitle();

    public final native ArrayList getUnreadMessages();

    public final native String getUnreadMessagesSummary();

    public final native Long getUnsentTimestampMs();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OOU, java.lang.Object] */
    static {
        C70910ORf.A00();
    }

    public MSGOpenPathRenderedNotification(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
