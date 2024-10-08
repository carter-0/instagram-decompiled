package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51972G9s;
import X.C66581MXm;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchImpressionEvent {
    public final long duration;
    public final boolean isSearch;
    public final int itemPosition;
    public final String mediaId;
    public final String rankingRequestId;
    public final String sectionId;
    public final int sectionPosition;
    public final String tabId;
    public final String targetId;

    public static native CowatchImpressionEvent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchImpressionEvent)) {
                return false;
            }
            CowatchImpressionEvent cowatchImpressionEvent = (CowatchImpressionEvent) obj;
            String str = this.mediaId;
            String str2 = cowatchImpressionEvent.mediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.targetId;
            String str4 = cowatchImpressionEvent.targetId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.duration == cowatchImpressionEvent.duration && this.itemPosition == cowatchImpressionEvent.itemPosition && this.sectionId.equals(cowatchImpressionEvent.sectionId) && this.sectionPosition == cowatchImpressionEvent.sectionPosition && this.tabId.equals(cowatchImpressionEvent.tabId) && this.isSearch == cowatchImpressionEvent.isSearch && this.rankingRequestId.equals(cowatchImpressionEvent.rankingRequestId))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        long j = this.duration;
        String str = this.sectionId;
        return ((AnonymousClass7TF.A08(this.tabId, (AnonymousClass7TF.A08(str, (C51972G9s.A07(j, (C66583MXo.A01(AnonymousClass7TG.A0E(this.mediaId)) + C41845B3m.A00(this.targetId)) * 31) + this.itemPosition) * 31) + this.sectionPosition) * 31) + (this.isSearch ? 1 : 0)) * 31) + this.rankingRequestId.hashCode();
    }

    public CowatchImpressionEvent(String str, String str2, long j, int i, String str3, int i2, String str4, boolean z, String str5) {
        C66581MXm.A1R(str3, str4, str5);
        this.mediaId = str;
        this.targetId = str2;
        this.duration = j;
        this.itemPosition = i;
        this.sectionId = str3;
        this.sectionPosition = i2;
        this.tabId = str4;
        this.isSearch = z;
        this.rankingRequestId = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchImpressionEvent{mediaId=");
        A1A.append(this.mediaId);
        A1A.append(",targetId=");
        A1A.append(this.targetId);
        A1A.append(",duration=");
        A1A.append(this.duration);
        A1A.append(",itemPosition=");
        A1A.append(this.itemPosition);
        A1A.append(",sectionId=");
        A1A.append(this.sectionId);
        A1A.append(",sectionPosition=");
        A1A.append(this.sectionPosition);
        A1A.append(",tabId=");
        A1A.append(this.tabId);
        A1A.append(",isSearch=");
        A1A.append(this.isSearch);
        A1A.append(",rankingRequestId=");
        return C66584MXp.A0a(this.rankingRequestId, A1A);
    }
}
