package com.instagram.rtc.rsys.models;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class RingNotification {
    public static 2LV CONVERTER = new C71545Omg(26);
    public static long sMcfTypeId;
    public final String avatarUrl;
    public final String displayName;
    public final String groupCallerName;
    public final String igThreadId;
    public final boolean isE2eeMandated;
    public final boolean isE2eeOverInstamadillo;
    public final ArrayList otherCallParticipants;
    public final int ringType;
    public final String roomUrl;
    public final String serverInfoData;
    public final String transactionId;

    public static native RingNotification createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RingNotification)) {
                return false;
            }
            RingNotification ringNotification = (RingNotification) obj;
            if (!this.transactionId.equals(ringNotification.transactionId) || !this.serverInfoData.equals(ringNotification.serverInfoData) || !this.displayName.equals(ringNotification.displayName) || !this.igThreadId.equals(ringNotification.igThreadId)) {
                return false;
            }
            String str = this.groupCallerName;
            String str2 = ringNotification.groupCallerName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.avatarUrl.equals(ringNotification.avatarUrl) || this.ringType != ringNotification.ringType) {
                return false;
            }
            String str3 = this.roomUrl;
            String str4 = ringNotification.roomUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.isE2eeMandated != ringNotification.isE2eeMandated || this.isE2eeOverInstamadillo != ringNotification.isE2eeOverInstamadillo) {
                return false;
            }
            ArrayList arrayList = this.otherCallParticipants;
            ArrayList arrayList2 = ringNotification.otherCallParticipants;
            if (arrayList != null) {
                return arrayList.equals(arrayList2);
            }
            if (arrayList2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.displayName, AnonymousClass7TF.A08(this.serverInfoData, C66583MXo.A06(this.transactionId)));
        return ((((((((AnonymousClass7TF.A08(this.avatarUrl, (AnonymousClass7TF.A08(this.igThreadId, A08) + AnonymousClass7TG.A0E(this.groupCallerName)) * 31) + this.ringType) * 31) + AnonymousClass7TG.A0E(this.roomUrl)) * 31) + (this.isE2eeMandated ? 1 : 0)) * 31) + (this.isE2eeOverInstamadillo ? 1 : 0)) * 31) + AnonymousClass7TE.A0L(this.otherCallParticipants);
    }

    public RingNotification(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z, boolean z2, ArrayList arrayList) {
        C66581MXm.A1R(str, str2, str3);
        str4.getClass();
        str6.getClass();
        this.transactionId = str;
        this.serverInfoData = str2;
        this.displayName = str3;
        this.igThreadId = str4;
        this.groupCallerName = str5;
        this.avatarUrl = str6;
        this.ringType = i;
        this.roomUrl = str7;
        this.isE2eeMandated = z;
        this.isE2eeOverInstamadillo = z2;
        this.otherCallParticipants = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RingNotification{transactionId=");
        A1A.append(this.transactionId);
        A1A.append(",serverInfoData=");
        A1A.append(this.serverInfoData);
        A1A.append(",displayName=");
        A1A.append(this.displayName);
        A1A.append(",igThreadId=");
        A1A.append(this.igThreadId);
        A1A.append(",groupCallerName=");
        A1A.append(this.groupCallerName);
        A1A.append(",avatarUrl=");
        A1A.append(this.avatarUrl);
        A1A.append(",ringType=");
        A1A.append(this.ringType);
        A1A.append(",roomUrl=");
        A1A.append(this.roomUrl);
        A1A.append(",isE2eeMandated=");
        A1A.append(this.isE2eeMandated);
        A1A.append(",isE2eeOverInstamadillo=");
        A1A.append(this.isE2eeOverInstamadillo);
        A1A.append(",otherCallParticipants=");
        return C66582MXn.A0v(this.otherCallParticipants, A1A);
    }
}
