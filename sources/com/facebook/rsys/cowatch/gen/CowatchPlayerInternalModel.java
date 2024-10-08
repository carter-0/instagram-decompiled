package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

public class CowatchPlayerInternalModel {
    public static 2LV CONVERTER = C22180Xwq.A00(33);
    public static long sMcfTypeId;
    public final long audioUpdateCursor;
    public final String cowatchSessionID;
    public final boolean forceToSyncLatestState;
    public final CowatchLoggingModel log;
    public final long mediaPositionMsPerceivedDelta;
    public final String mediaUniqueID;
    public final int mutationSource;
    public final Long startWatchTimestampInMs;
    public final String suggestedContext;
    public final int swipeDirection;
    public final String tabSelectedFromAmdPlayNow;
    public final Map watchedHistory;

    public static native CowatchPlayerInternalModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerInternalModel)) {
                return false;
            }
            CowatchPlayerInternalModel cowatchPlayerInternalModel = (CowatchPlayerInternalModel) obj;
            String str = this.cowatchSessionID;
            String str2 = cowatchPlayerInternalModel.cowatchSessionID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mutationSource != cowatchPlayerInternalModel.mutationSource || this.mediaPositionMsPerceivedDelta != cowatchPlayerInternalModel.mediaPositionMsPerceivedDelta) {
                return false;
            }
            String str3 = this.mediaUniqueID;
            String str4 = cowatchPlayerInternalModel.mediaUniqueID;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.audioUpdateCursor != cowatchPlayerInternalModel.audioUpdateCursor || this.forceToSyncLatestState != cowatchPlayerInternalModel.forceToSyncLatestState) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = this.log;
            CowatchLoggingModel cowatchLoggingModel2 = cowatchPlayerInternalModel.log;
            if (cowatchLoggingModel == null) {
                if (cowatchLoggingModel2 != null) {
                    return false;
                }
            } else if (!cowatchLoggingModel.equals(cowatchLoggingModel2)) {
                return false;
            }
            Long l = this.startWatchTimestampInMs;
            Long l2 = cowatchPlayerInternalModel.startWatchTimestampInMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str5 = this.tabSelectedFromAmdPlayNow;
            String str6 = cowatchPlayerInternalModel.tabSelectedFromAmdPlayNow;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.swipeDirection != cowatchPlayerInternalModel.swipeDirection) {
                return false;
            }
            String str7 = this.suggestedContext;
            String str8 = cowatchPlayerInternalModel.suggestedContext;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Map map = this.watchedHistory;
            Map map2 = cowatchPlayerInternalModel.watchedHistory;
            if (map != null) {
                return map.equals(map2);
            }
            if (map2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int i = 0;
        long j = this.mediaPositionMsPerceivedDelta;
        int A01 = (((((((((((AnonymousClass7TF.A01(this.audioUpdateCursor, (AnonymousClass7TF.A01(j, (C66583MXo.A01(AnonymousClass7TG.A0E(this.cowatchSessionID)) + this.mutationSource) * 31) + AnonymousClass7TG.A0E(this.mediaUniqueID)) * 31) + (this.forceToSyncLatestState ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.log)) * 31) + AnonymousClass7TG.A0C(this.startWatchTimestampInMs)) * 31) + AnonymousClass7TG.A0E(this.tabSelectedFromAmdPlayNow)) * 31) + this.swipeDirection) * 31) + AnonymousClass7TG.A0E(this.suggestedContext)) * 31;
        Map map = this.watchedHistory;
        if (map != null) {
            i = map.hashCode();
        }
        return A01 + i;
    }

    public CowatchPlayerInternalModel(String str, int i, long j, String str2, long j2, boolean z, CowatchLoggingModel cowatchLoggingModel, Long l, String str3, int i2, String str4, Map map) {
        this.cowatchSessionID = str;
        this.mutationSource = i;
        this.mediaPositionMsPerceivedDelta = j;
        this.mediaUniqueID = str2;
        this.audioUpdateCursor = j2;
        this.forceToSyncLatestState = z;
        this.log = cowatchLoggingModel;
        this.startWatchTimestampInMs = l;
        this.tabSelectedFromAmdPlayNow = str3;
        this.swipeDirection = i2;
        this.suggestedContext = str4;
        this.watchedHistory = map;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchPlayerInternalModel{cowatchSessionID=");
        A1A.append(this.cowatchSessionID);
        A1A.append(",mutationSource=");
        A1A.append(this.mutationSource);
        A1A.append(",mediaPositionMsPerceivedDelta=");
        A1A.append(this.mediaPositionMsPerceivedDelta);
        A1A.append(",mediaUniqueID=");
        A1A.append(this.mediaUniqueID);
        A1A.append(",audioUpdateCursor=");
        A1A.append(this.audioUpdateCursor);
        A1A.append(",forceToSyncLatestState=");
        A1A.append(this.forceToSyncLatestState);
        A1A.append(",log=");
        A1A.append(this.log);
        A1A.append(",startWatchTimestampInMs=");
        A1A.append(this.startWatchTimestampInMs);
        A1A.append(",tabSelectedFromAmdPlayNow=");
        A1A.append(this.tabSelectedFromAmdPlayNow);
        A1A.append(",swipeDirection=");
        A1A.append(this.swipeDirection);
        A1A.append(",suggestedContext=");
        A1A.append(this.suggestedContext);
        A1A.append(",watchedHistory=");
        return C66582MXn.A0v(this.watchedHistory, A1A);
    }
}
