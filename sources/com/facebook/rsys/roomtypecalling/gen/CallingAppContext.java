package com.facebook.rsys.roomtypecalling.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

public class CallingAppContext {
    public static 2LV CONVERTER = new C71545Omg(1);
    public static long sMcfTypeId;
    public final String callablePostId;
    public final HashSet callingTags;
    public final String immersiveModeDoorId;
    public final boolean isMetaAiCall;
    public final String linkUrl;
    public final String liveBroadcastId;
    public final String phoneNumber;
    public final String pstnUserId;
    public final String rtcDoorId;
    public final String serverInfoData;
    public final String threadID;
    public final int threadType;

    public static native CallingAppContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallingAppContext)) {
                return false;
            }
            CallingAppContext callingAppContext = (CallingAppContext) obj;
            String str = this.threadID;
            String str2 = callingAppContext.threadID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.threadType != callingAppContext.threadType) {
                return false;
            }
            HashSet hashSet = this.callingTags;
            HashSet hashSet2 = callingAppContext.callingTags;
            if (hashSet == null) {
                if (hashSet2 != null) {
                    return false;
                }
            } else if (!hashSet.equals(hashSet2)) {
                return false;
            }
            String str3 = this.serverInfoData;
            String str4 = callingAppContext.serverInfoData;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.linkUrl;
            String str6 = callingAppContext.linkUrl;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.liveBroadcastId;
            String str8 = callingAppContext.liveBroadcastId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.callablePostId;
            String str10 = callingAppContext.callablePostId;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.immersiveModeDoorId;
            String str12 = callingAppContext.immersiveModeDoorId;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.rtcDoorId;
            String str14 = callingAppContext.rtcDoorId;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.phoneNumber;
            String str16 = callingAppContext.phoneNumber;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            if (this.isMetaAiCall != callingAppContext.isMetaAiCall) {
                return false;
            }
            String str17 = this.pstnUserId;
            String str18 = callingAppContext.pstnUserId;
            if (str17 != null) {
                return str17.equals(str18);
            }
            if (str18 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((((((((((((((((((C66583MXo.A01(AnonymousClass7TG.A0E(this.threadID)) + this.threadType) * 31) + AnonymousClass7TG.A0C(this.callingTags)) * 31) + AnonymousClass7TG.A0E(this.serverInfoData)) * 31) + AnonymousClass7TG.A0E(this.linkUrl)) * 31) + AnonymousClass7TG.A0E(this.liveBroadcastId)) * 31) + AnonymousClass7TG.A0E(this.callablePostId)) * 31) + AnonymousClass7TG.A0E(this.immersiveModeDoorId)) * 31) + AnonymousClass7TG.A0E(this.rtcDoorId)) * 31) + AnonymousClass7TG.A0E(this.phoneNumber)) * 31) + (this.isMetaAiCall ? 1 : 0)) * 31) + C41845B3m.A00(this.pstnUserId);
    }

    public CallingAppContext(String str, int i, HashSet hashSet, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9) {
        this.threadID = str;
        this.threadType = i;
        this.callingTags = hashSet;
        this.serverInfoData = str2;
        this.linkUrl = str3;
        this.liveBroadcastId = str4;
        this.callablePostId = str5;
        this.immersiveModeDoorId = str6;
        this.rtcDoorId = str7;
        this.phoneNumber = str8;
        this.isMetaAiCall = z;
        this.pstnUserId = str9;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CallingAppContext{threadID=");
        A1A.append(this.threadID);
        A1A.append(",threadType=");
        A1A.append(this.threadType);
        A1A.append(",callingTags=");
        A1A.append(this.callingTags);
        A1A.append(",serverInfoData=");
        A1A.append(this.serverInfoData);
        A1A.append(",linkUrl=");
        A1A.append(this.linkUrl);
        A1A.append(",liveBroadcastId=");
        A1A.append(this.liveBroadcastId);
        A1A.append(",callablePostId=");
        A1A.append(this.callablePostId);
        A1A.append(",immersiveModeDoorId=");
        A1A.append(this.immersiveModeDoorId);
        A1A.append(",rtcDoorId=");
        A1A.append(this.rtcDoorId);
        A1A.append(",phoneNumber=");
        A1A.append(this.phoneNumber);
        A1A.append(",isMetaAiCall=");
        A1A.append(this.isMetaAiCall);
        A1A.append(",pstnUserId=");
        return C66584MXp.A0a(this.pstnUserId, A1A);
    }
}
