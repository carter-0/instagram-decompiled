package com.instagram.reels.questionv2.model;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44995CoY;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoSpritesheetInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.model.mediasize.SpritesheetInfoImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoQuestionMediaResponseModel extends 17P implements QuestionMediaResponseModelIntf {
    public static final C3035269k CREATOR = CTA.A00(74);

    public final ImageInfo BGO() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    public final SpritesheetInfo C78() {
        return (SpritesheetInfo) A05(-1703162617, ImmutablePandoSpritesheetInfo.class);
    }

    public final List CEY() {
        return A08(713258463, ImmutablePandoVideoVersion.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel, com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44995CoY.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final Boolean BAZ() {
        return getOptionalBooleanValueByHashCode(53851633);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final Integer BR8() {
        return getOptionalIntValueByHashCode(1939875509);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final Integer BZ3() {
        return getOptionalIntValueByHashCode(-636516523);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final Integer BZH() {
        return getOptionalIntValueByHashCode(1933097432);
    }

    public final String CEE() {
        return A0i(-1617978007);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final Integer CRC() {
        return getOptionalIntValueByHashCode(-181834353);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final QuestionMediaResponseModel FGS() {
        ImageInfoImpl imageInfoImpl;
        SpritesheetInfoImpl spritesheetInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(53851633);
        String A0e = A0e();
        ImageInfo BGO = BGO();
        ArrayList arrayList = null;
        if (BGO != null) {
            imageInfoImpl = BGO.FEa();
        } else {
            imageInfoImpl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-181834353);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(1939875509);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-636516523);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(1933097432);
        SpritesheetInfo C78 = C78();
        if (C78 != null) {
            spritesheetInfoImpl = C78.FEc();
        } else {
            spritesheetInfoImpl = null;
        }
        String A0i = A0i(1370685266);
        String A0i2 = A0i(-134887560);
        String A0i3 = A0i(-1617978007);
        List CEY = CEY();
        if (CEY != null) {
            arrayList = AnonymousClass7TG.A0r(CEY);
            Iterator it = CEY.iterator();
            while (it.hasNext()) {
                C41847B3o.A1Z(arrayList, it);
            }
        }
        return new QuestionMediaResponseModel(imageInfoImpl, spritesheetInfoImpl, optionalBooleanValueByHashCode, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, A0e, A0i, A0i2, A0i3, arrayList);
    }

    public final String getId() {
        return A0e();
    }

    public final String getVideoCodec() {
        return A0i(1370685266);
    }

    public final String getVideoDashManifest() {
        return A0i(-134887560);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
