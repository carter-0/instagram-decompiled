package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchRankingMetadata {
    public final String callType;
    public final ArrayList connectedPeerIds;
    public final String cowatchSessionId;
    public final String localCallId;
    public final String serverInfoData;
    public final String sharedCallId;

    public static native CowatchRankingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchRankingMetadata)) {
                return false;
            }
            CowatchRankingMetadata cowatchRankingMetadata = (CowatchRankingMetadata) obj;
            String str = this.localCallId;
            String str2 = cowatchRankingMetadata.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sharedCallId;
            String str4 = cowatchRankingMetadata.sharedCallId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.serverInfoData;
            String str6 = cowatchRankingMetadata.serverInfoData;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.callType.equals(cowatchRankingMetadata.callType)) {
                return false;
            }
            String str7 = this.cowatchSessionId;
            String str8 = cowatchRankingMetadata.cowatchSessionId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            return this.connectedPeerIds.equals(cowatchRankingMetadata.connectedPeerIds);
        }
    }

    public final int hashCode() {
        String str = this.callType;
        return AnonymousClass7TE.A0N(this.connectedPeerIds, (AnonymousClass7TF.A08(str, (((C66583MXo.A01(AnonymousClass7TG.A0E(this.localCallId)) + AnonymousClass7TG.A0E(this.sharedCallId)) * 31) + AnonymousClass7TG.A0E(this.serverInfoData)) * 31) + C41845B3m.A00(this.cowatchSessionId)) * 31);
    }

    public CowatchRankingMetadata(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        str4.getClass();
        arrayList.getClass();
        this.localCallId = str;
        this.sharedCallId = str2;
        this.serverInfoData = str3;
        this.callType = str4;
        this.cowatchSessionId = str5;
        this.connectedPeerIds = arrayList;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchRankingMetadata{localCallId=");
        A1A.append(this.localCallId);
        A1A.append(",sharedCallId=");
        A1A.append(this.sharedCallId);
        A1A.append(",serverInfoData=");
        A1A.append(this.serverInfoData);
        A1A.append(",callType=");
        A1A.append(this.callType);
        A1A.append(",cowatchSessionId=");
        A1A.append(this.cowatchSessionId);
        A1A.append(",connectedPeerIds=");
        return C66582MXn.A0v(this.connectedPeerIds, A1A);
    }
}
