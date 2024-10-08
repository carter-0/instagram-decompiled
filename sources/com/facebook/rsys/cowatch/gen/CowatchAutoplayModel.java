package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchAutoplayModel {
    public final String actorId;
    public final CowatchAutoplaySimpleModel autoplay;
    public final String autoplayActionId;
    public final CowatchMediaInfoModel contentInfo;
    public final boolean needsUpdatePeer;
    public final String sourceMediaId;
    public final String sourceMediaSource;

    public static native CowatchAutoplayModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchAutoplayModel)) {
                return false;
            }
            CowatchAutoplayModel cowatchAutoplayModel = (CowatchAutoplayModel) obj;
            String str = this.sourceMediaId;
            String str2 = cowatchAutoplayModel.sourceMediaId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sourceMediaSource;
            String str4 = cowatchAutoplayModel.sourceMediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.autoplayActionId;
            String str6 = cowatchAutoplayModel.autoplayActionId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.actorId;
            String str8 = cowatchAutoplayModel.actorId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel = this.autoplay;
            CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel2 = cowatchAutoplayModel.autoplay;
            if (cowatchAutoplaySimpleModel == null) {
                if (cowatchAutoplaySimpleModel2 != null) {
                    return false;
                }
            } else if (!cowatchAutoplaySimpleModel.equals(cowatchAutoplaySimpleModel2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.contentInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchAutoplayModel.contentInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            return this.needsUpdatePeer == cowatchAutoplayModel.needsUpdatePeer;
        }
    }

    public final int hashCode() {
        return ((((((((((((527 + AnonymousClass7TG.A0E(this.sourceMediaId)) * 31) + AnonymousClass7TG.A0E(this.sourceMediaSource)) * 31) + AnonymousClass7TG.A0E(this.autoplayActionId)) * 31) + AnonymousClass7TG.A0E(this.actorId)) * 31) + AnonymousClass7TG.A0C(this.autoplay)) * 31) + AnonymousClass7TE.A0L(this.contentInfo)) * 31) + (this.needsUpdatePeer ? 1 : 0);
    }

    public CowatchAutoplayModel(String str, String str2, String str3, String str4, CowatchAutoplaySimpleModel cowatchAutoplaySimpleModel, CowatchMediaInfoModel cowatchMediaInfoModel, boolean z) {
        this.sourceMediaId = str;
        this.sourceMediaSource = str2;
        this.autoplayActionId = str3;
        this.actorId = str4;
        this.autoplay = cowatchAutoplaySimpleModel;
        this.contentInfo = cowatchMediaInfoModel;
        this.needsUpdatePeer = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAutoplayModel{sourceMediaId=");
        A1A.append(this.sourceMediaId);
        A1A.append(",sourceMediaSource=");
        A1A.append(this.sourceMediaSource);
        A1A.append(",autoplayActionId=");
        A1A.append(this.autoplayActionId);
        A1A.append(",actorId=");
        A1A.append(this.actorId);
        A1A.append(",autoplay=");
        A1A.append(this.autoplay);
        A1A.append(",contentInfo=");
        A1A.append(this.contentInfo);
        A1A.append(",needsUpdatePeer=");
        A1A.append(this.needsUpdatePeer);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
