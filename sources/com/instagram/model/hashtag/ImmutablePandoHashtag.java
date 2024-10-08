package com.instagram.model.hashtag;

import X.17P;
import X.AnonymousClass7TH;
import X.C14195Tra;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

public final class ImmutablePandoHashtag extends 17P implements Hashtag {
    public static final C3035269k CREATOR = CTA.A00(34);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.Hashtag, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C14195Tra.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean Ab5() {
        return getOptionalBooleanValueByHashCode(1446562075);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean Ab8() {
        return getOptionalBooleanValueByHashCode(-1948154558);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Integer B6q() {
        return getOptionalIntValueByHashCode(1028143168);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Integer B6z() {
        return getOptionalIntValueByHashCode(765915793);
    }

    public final String B7j() {
        return A0i(1544060401);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean BDK() {
        return getOptionalBooleanValueByHashCode(1767727834);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Integer BPt() {
        return getOptionalIntValueByHashCode(-9393932);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean BWU() {
        return getOptionalBooleanValueByHashCode(342632973);
    }

    public final ImageUrl Bh3() {
        return A0A(1782139044);
    }

    public final String BqG() {
        return A0i(348451171);
    }

    public final String BqN() {
        return A0i(-1548880689);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean CCV() {
        return getOptionalBooleanValueByHashCode(-875391281);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean CSN() {
        return getOptionalBooleanValueByHashCode(1013486691);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final Boolean CWZ() {
        return getOptionalBooleanValueByHashCode(118114326);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, X.17P] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.model.hashtag.HashtagImpl FEY() {
        /*
            r18 = this;
            r1 = 1446562075(0x5638c91b, float:5.079347E13)
            r0 = r18
            java.lang.Boolean r3 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1948154558(0xffffffff8be18542, float:-8.686735E-32)
            java.lang.Boolean r4 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1028143168(0x3d483840, float:0.04888177)
            java.lang.Integer r10 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 765915793(0x2da6f291, float:1.8979736E-11)
            java.lang.Integer r11 = r0.getOptionalIntValueByHashCode(r1)
            r1 = 1544060401(0x5c087df1, float:1.53676283E17)
            java.lang.String r13 = r0.A0i(r1)
            r1 = 1767727834(0x695d62da, float:1.6727464E25)
            java.lang.Boolean r5 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.String r14 = r0.A0e()
            r1 = 1013486691(0x3c689463, float:0.014195534)
            java.lang.Boolean r6 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 118114326(0x70a4816, float:1.040315E-34)
            java.lang.Boolean r7 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -9393932(0xffffffffff70a8f4, float:-3.1989197E38)
            java.lang.Integer r12 = r0.getOptionalIntValueByHashCode(r1)
            java.lang.String r15 = r0.A0W()
            r1 = 342632973(0x146c2a0d, float:1.1923248E-26)
            java.lang.Boolean r8 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1782139044(0x6a3948a4, float:5.599858E25)
            com.instagram.common.typedurl.ImageUrl r2 = r0.A0A(r1)
            r1 = 348451171(0x14c4f163, float:1.9886153E-26)
            java.lang.String r16 = r0.A0i(r1)
            r1 = -1548880689(0xffffffffa3adf4cf, float:-1.8860378E-17)
            java.lang.String r17 = r0.A0i(r1)
            r1 = -875391281(0xffffffffcbd296cf, float:-2.7602334E7)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r1)
            com.instagram.model.hashtag.HashtagImpl r1 = new com.instagram.model.hashtag.HashtagImpl
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.hashtag.ImmutablePandoHashtag.FEY():com.instagram.model.hashtag.HashtagImpl");
    }

    public final String getId() {
        return A0e();
    }

    public final String getName() {
        return A0W();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.hashtag.ImmutablePandoHashtag] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
