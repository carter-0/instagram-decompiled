package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class LiveVideoModel {
    public static 2LV CONVERTER = C22180Xwq.A00(63);
    public static long sMcfTypeId;
    public final ArrayList acceptedUsers;
    public final Long broadcastId;
    public final LiveVideoCancelCreatedNotStartedParameters cancelCreatedNotStartedParameters;
    public final LiveVideoCreationParameters creationParameters;
    public final LiveVideoEndParameters endParameters;
    public final Long errorCode;
    public final int liveStreamStatus;
    public final boolean livestreamStateSyncTopicInitialized;
    public final LiveVideoMetadata metadata;
    public final boolean needsStateSyncUnsubscribe;
    public final String negotiationToken;
    public final LiveStreamOptInInfo optInInfo;
    public final LiveVideoStartParameters startParameters;
    public final boolean userAcknowledged;
    public final String videoId;

    public static native LiveVideoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoModel)) {
                return false;
            }
            LiveVideoModel liveVideoModel = (LiveVideoModel) obj;
            if (this.liveStreamStatus != liveVideoModel.liveStreamStatus) {
                return false;
            }
            Long l = this.errorCode;
            Long l2 = liveVideoModel.errorCode;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.userAcknowledged != liveVideoModel.userAcknowledged) {
                return false;
            }
            String str = this.negotiationToken;
            String str2 = liveVideoModel.negotiationToken;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            LiveStreamOptInInfo liveStreamOptInInfo = this.optInInfo;
            LiveStreamOptInInfo liveStreamOptInInfo2 = liveVideoModel.optInInfo;
            if (liveStreamOptInInfo == null) {
                if (liveStreamOptInInfo2 != null) {
                    return false;
                }
            } else if (!liveStreamOptInInfo.equals(liveStreamOptInInfo2)) {
                return false;
            }
            ArrayList arrayList = this.acceptedUsers;
            ArrayList arrayList2 = liveVideoModel.acceptedUsers;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            Long l3 = this.broadcastId;
            Long l4 = liveVideoModel.broadcastId;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            String str3 = this.videoId;
            String str4 = liveVideoModel.videoId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.needsStateSyncUnsubscribe != liveVideoModel.needsStateSyncUnsubscribe) {
                return false;
            }
            LiveVideoCreationParameters liveVideoCreationParameters = this.creationParameters;
            LiveVideoCreationParameters liveVideoCreationParameters2 = liveVideoModel.creationParameters;
            if (liveVideoCreationParameters == null) {
                if (liveVideoCreationParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoCreationParameters.equals(liveVideoCreationParameters2)) {
                return false;
            }
            LiveVideoStartParameters liveVideoStartParameters = this.startParameters;
            LiveVideoStartParameters liveVideoStartParameters2 = liveVideoModel.startParameters;
            if (liveVideoStartParameters == null) {
                if (liveVideoStartParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoStartParameters.equals(liveVideoStartParameters2)) {
                return false;
            }
            LiveVideoEndParameters liveVideoEndParameters = this.endParameters;
            LiveVideoEndParameters liveVideoEndParameters2 = liveVideoModel.endParameters;
            if (liveVideoEndParameters == null) {
                if (liveVideoEndParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoEndParameters.equals(liveVideoEndParameters2)) {
                return false;
            }
            LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters = this.cancelCreatedNotStartedParameters;
            LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters2 = liveVideoModel.cancelCreatedNotStartedParameters;
            if (liveVideoCancelCreatedNotStartedParameters == null) {
                if (liveVideoCancelCreatedNotStartedParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoCancelCreatedNotStartedParameters.equals(liveVideoCancelCreatedNotStartedParameters2)) {
                return false;
            }
            LiveVideoMetadata liveVideoMetadata = this.metadata;
            LiveVideoMetadata liveVideoMetadata2 = liveVideoModel.metadata;
            if (liveVideoMetadata == null) {
                if (liveVideoMetadata2 != null) {
                    return false;
                }
            } else if (!liveVideoMetadata.equals(liveVideoMetadata2)) {
                return false;
            }
            return this.livestreamStateSyncTopicInitialized == liveVideoModel.livestreamStateSyncTopicInitialized;
        }
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((C66583MXo.A01(this.liveStreamStatus) + AnonymousClass7TG.A0C(this.errorCode)) * 31) + (this.userAcknowledged ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.negotiationToken)) * 31) + AnonymousClass7TG.A0C(this.optInInfo)) * 31) + AnonymousClass7TG.A0C(this.acceptedUsers)) * 31) + AnonymousClass7TG.A0C(this.broadcastId)) * 31) + AnonymousClass7TG.A0E(this.videoId)) * 31) + (this.needsStateSyncUnsubscribe ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.creationParameters)) * 31) + AnonymousClass7TG.A0C(this.startParameters)) * 31) + AnonymousClass7TG.A0C(this.endParameters)) * 31) + AnonymousClass7TG.A0C(this.cancelCreatedNotStartedParameters)) * 31) + AnonymousClass7TE.A0L(this.metadata)) * 31) + (this.livestreamStateSyncTopicInitialized ? 1 : 0);
    }

    public LiveVideoModel(int i, Long l, boolean z, String str, LiveStreamOptInInfo liveStreamOptInInfo, ArrayList arrayList, Long l2, String str2, boolean z2, LiveVideoCreationParameters liveVideoCreationParameters, LiveVideoStartParameters liveVideoStartParameters, LiveVideoEndParameters liveVideoEndParameters, LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters, LiveVideoMetadata liveVideoMetadata, boolean z3) {
        this.liveStreamStatus = i;
        this.errorCode = l;
        this.userAcknowledged = z;
        this.negotiationToken = str;
        this.optInInfo = liveStreamOptInInfo;
        this.acceptedUsers = arrayList;
        this.broadcastId = l2;
        this.videoId = str2;
        this.needsStateSyncUnsubscribe = z2;
        this.creationParameters = liveVideoCreationParameters;
        this.startParameters = liveVideoStartParameters;
        this.endParameters = liveVideoEndParameters;
        this.cancelCreatedNotStartedParameters = liveVideoCancelCreatedNotStartedParameters;
        this.metadata = liveVideoMetadata;
        this.livestreamStateSyncTopicInitialized = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LiveVideoModel{liveStreamStatus=");
        A1A.append(this.liveStreamStatus);
        A1A.append(",errorCode=");
        A1A.append(this.errorCode);
        A1A.append(",userAcknowledged=");
        A1A.append(this.userAcknowledged);
        A1A.append(",negotiationToken=");
        A1A.append(this.negotiationToken);
        A1A.append(",optInInfo=");
        A1A.append(this.optInInfo);
        A1A.append(",acceptedUsers=");
        A1A.append(this.acceptedUsers);
        A1A.append(",broadcastId=");
        A1A.append(this.broadcastId);
        A1A.append(",videoId=");
        A1A.append(this.videoId);
        A1A.append(",needsStateSyncUnsubscribe=");
        A1A.append(this.needsStateSyncUnsubscribe);
        A1A.append(",creationParameters=");
        A1A.append(this.creationParameters);
        A1A.append(",startParameters=");
        A1A.append(this.startParameters);
        A1A.append(",endParameters=");
        A1A.append(this.endParameters);
        A1A.append(",cancelCreatedNotStartedParameters=");
        A1A.append(this.cancelCreatedNotStartedParameters);
        A1A.append(",metadata=");
        A1A.append(this.metadata);
        A1A.append(",livestreamStateSyncTopicInitialized=");
        return C66584MXp.A0b(A1A, this.livestreamStateSyncTopicInitialized);
    }
}
