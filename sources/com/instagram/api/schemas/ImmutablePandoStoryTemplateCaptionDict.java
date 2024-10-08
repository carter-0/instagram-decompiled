package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C393519wZ;
import X.C41700Ayr;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoStoryTemplateCaptionDict extends 17P implements StoryTemplateCaptionDictIntf {
    public static final C3035269k CREATOR = new CTB(91);

    public final ClipsTextFormatType B7W() {
        return (ClipsTextFormatType) A0M(1458614914, C41700Ayr.A00);
    }

    public final float CGs() {
        return A02(120);
    }

    public final float CHR() {
        return A02(121);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateCaptionDict, com.instagram.api.schemas.StoryTemplateCaptionDictIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C393519wZ.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String Aak() {
        return A0h(1767875043);
    }

    public final String Abi() {
        return A0h(1118509956);
    }

    public final String Ap4() {
        return A0h(-1354842768);
    }

    public final String B0J() {
        return A0h(-1833928446);
    }

    public final float B78() {
        return A02(-1539906063);
    }

    public final float BCs() {
        return A02(-1221029593);
    }

    public final float Bod() {
        return A02(-40300674);
    }

    public final float BpU() {
        return A02(109250890);
    }

    public final String Bqa() {
        return A0i(-1937629992);
    }

    public final float CGW() {
        return A02(113126854);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.api.schemas.StoryTemplateCaptionDict FBX() {
        /*
            r17 = this;
            r0 = 1767875043(0x695fa1e3, float:1.6897184E25)
            r1 = r17
            java.lang.String r3 = r1.A0h(r0)
            r0 = 1118509956(0x42ab1b84, float:85.55374)
            java.lang.String r4 = r1.A0h(r0)
            r0 = -1354842768(0xffffffffaf3ebd70, float:-1.7347701E-10)
            java.lang.String r5 = r1.A0h(r0)
            r0 = -1833928446(0xffffffff92b07902, float:-1.1136992E-27)
            java.lang.String r6 = r1.A0h(r0)
            r0 = -1539906063(0xffffffffa436e5f1, float:-3.9659727E-17)
            float r9 = r1.A02(r0)
            com.instagram.api.schemas.ClipsTextFormatType r2 = r1.B7W()
            r0 = -1221029593(0xffffffffb7389127, float:-1.1001051E-5)
            float r10 = r1.A02(r0)
            r0 = -40300674(0xfffffffffd990f7e, float:-2.543154E37)
            float r11 = r1.A02(r0)
            r0 = 109250890(0x683094a, float:4.929037E-35)
            float r12 = r1.A02(r0)
            r0 = -1937629992(0xffffffff8c821cd8, float:-2.004703E-31)
            java.lang.String r7 = r1.A0i(r0)
            java.lang.String r8 = r1.A0P()
            r0 = 113126854(0x6be2dc6, float:7.1537315E-35)
            float r13 = r1.A02(r0)
            r0 = 120(0x78, float:1.68E-43)
            float r14 = r1.A02(r0)
            r0 = 121(0x79, float:1.7E-43)
            float r15 = r1.A02(r0)
            r0 = -573585203(0xffffffffddcfc8cd, float:-1.8715553E18)
            int r16 = r1.getIntValueByHashCode(r0)
            com.instagram.api.schemas.StoryTemplateCaptionDict r1 = new com.instagram.api.schemas.StoryTemplateCaptionDict
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.schemas.ImmutablePandoStoryTemplateCaptionDict.FBX():com.instagram.api.schemas.StoryTemplateCaptionDict");
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateCaptionDict] */
    public final int getZIndex() {
        return getIntValueByHashCode(-573585203);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryTemplateCaptionDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
