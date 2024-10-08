package com.instagram.feed.media;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.B4X;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.ImmutablePandoAttributionUser;
import com.instagram.api.schemas.ImmutablePandoGenAIToolInfoDict;
import com.instagram.model.shopping.ImmutablePandoProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.List;

public final class ImmutablePandoCreativeConfig extends 17P implements CreativeConfigIntf {
    public static final C3035269k CREATOR = CTA.A00(27);
    public ProductItemWithARIntf A00;

    public final AttributionUser AdD() {
        return (AttributionUser) A05(115051403, ImmutablePandoAttributionUser.class);
    }

    public final List AsN() {
        return A08(95981973, ImmutablePandoCameraToolInfo.class);
    }

    public final List B02() {
        return A08(1616979139, ImmutablePandoEffectPreview.class);
    }

    public final EffectPreviewIntf B0A() {
        return (EffectPreviewIntf) A05(347677466, ImmutablePandoEffectPreview.class);
    }

    public final ProductItemWithARIntf B0B() {
        ProductItemWithARIntf productItemWithARIntf = this.A00;
        if (productItemWithARIntf == null) {
            return (ProductItemWithARIntf) A05(356387905, ImmutablePandoProductItemWithAR.class);
        }
        return productItemWithARIntf;
    }

    public final List B92() {
        return A08(1337664557, ImmutablePandoGenAIToolInfoDict.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.feed.media.CreativeConfig FDy(X.1E9 r23) {
        /*
            r22 = this;
            r4 = r22
            com.instagram.api.schemas.AttributionUser r1 = r4.AdD()
            r0 = 0
            if (r1 == 0) goto L_0x0044
            com.instagram.api.schemas.AttributionUserImpl r7 = r1.F0a()
        L_0x000d:
            r1 = -590004159(0xffffffffdcd54041, float:-4.80198544E17)
            com.google.common.collect.ImmutableList r18 = r4.getOptionalStringListByHashCode(r1)
            r1 = 767106195(0x2db91c93, float:2.1044754E-11)
            java.lang.String r10 = r4.A0i(r1)
            java.util.List r2 = r4.AsN()
            r3 = 10
            if (r2 == 0) goto L_0x0046
            int r1 = X.0Yv.A1E(r2, r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0030:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r2.next()
            com.instagram.feed.media.CameraToolInfoIntf r1 = (com.instagram.feed.media.CameraToolInfoIntf) r1
            com.instagram.feed.media.CameraToolInfo r1 = r1.FDu()
            r5.add(r1)
            goto L_0x0030
        L_0x0044:
            r7 = r0
            goto L_0x000d
        L_0x0046:
            r5 = r0
        L_0x0047:
            r1 = 1246001165(0x4a44780d, float:3218947.2)
            java.lang.String r11 = r4.A0i(r1)
            r1 = -564585278(0xffffffffde591cc2, float:-3.91114813E18)
            java.lang.String r12 = r4.A0j(r1)
            java.util.List r6 = r4.B02()
            if (r6 == 0) goto L_0x007c
            int r1 = X.0Yv.A1E(r6, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x007d
            java.lang.Object r1 = r6.next()
            com.instagram.feed.media.EffectPreviewIntf r1 = (com.instagram.feed.media.EffectPreviewIntf) r1
            com.instagram.feed.media.EffectPreview r1 = r1.FE1()
            r2.add(r1)
            goto L_0x0068
        L_0x007c:
            r2 = r0
        L_0x007d:
            com.instagram.feed.media.EffectPreviewIntf r1 = r4.B0A()
            if (r1 == 0) goto L_0x00d8
            com.instagram.feed.media.EffectPreview r8 = r1.FE1()
        L_0x0087:
            com.instagram.model.shopping.ProductItemWithARIntf r1 = r4.B0B()
            if (r1 == 0) goto L_0x00d6
            r6 = r23
            com.instagram.model.shopping.ProductItemWithAR r9 = r1.FFK(r6)
        L_0x0093:
            r1 = -1061995346(0xffffffffc0b33cae, float:-5.601157)
            java.lang.String r13 = r4.A0i(r1)
            r1 = 1705526055(0x65a84327, float:9.932454E22)
            java.lang.String r14 = r4.A0j(r1)
            r1 = 1743941273(0x67f26e99, float:2.2897057E24)
            java.lang.String r15 = r4.A0i(r1)
            r1 = -1792227267(0xffffffff952cc83d, float:-3.4893084E-26)
            java.lang.String r16 = r4.A0i(r1)
            java.util.List r1 = r4.B92()
            if (r1 == 0) goto L_0x00da
            int r3 = X.0Yv.A1E(r1, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x00c2:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00da
            java.lang.Object r1 = r3.next()
            com.instagram.api.schemas.GenAIToolInfoDictIntf r1 = (com.instagram.api.schemas.GenAIToolInfoDictIntf) r1
            com.instagram.api.schemas.GenAIToolInfoDict r1 = r1.F3O()
            r0.add(r1)
            goto L_0x00c2
        L_0x00d6:
            r9 = r0
            goto L_0x0093
        L_0x00d8:
            r8 = r0
            goto L_0x0087
        L_0x00da:
            r1 = 777500950(0x2e57b916, float:4.904973E-11)
            java.lang.String r17 = r4.A0i(r1)
            com.instagram.feed.media.CreativeConfig r6 = new com.instagram.feed.media.CreativeConfig
            r20 = r2
            r21 = r0
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.ImmutablePandoCreativeConfig.FDy(X.1E9):com.instagram.feed.media.CreativeConfig");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoCreativeConfig, com.instagram.feed.media.CreativeConfigIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4X.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoCreativeConfig] */
    public final List Ajq() {
        return getOptionalStringListByHashCode(-590004159);
    }

    public final String Ayr() {
        return A0i(1246001165);
    }

    public final String Ays() {
        return A0j(-564585278);
    }

    public final String B30() {
        return A0i(-1061995346);
    }

    public final String B3W() {
        return A0j(1705526055);
    }

    public final String B7Y() {
        return A0i(-1792227267);
    }

    public final String Bbn() {
        return A0i(777500950);
    }

    public final CreativeConfigIntf E9f(1E9 r2) {
        ProductItemWithARIntf B0B = B0B();
        if (B0B != null) {
            B0B.EA3(r2);
        } else {
            B0B = null;
        }
        this.A00 = B0B;
        return this;
    }

    public final CreativeConfig FDz(1E6 r2) {
        return FDy(C41846B3n.A0S(r2));
    }

    public final String getCaptureType() {
        return A0i(767106195);
    }

    public final String getFailureReason() {
        return A0i(1743941273);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.feed.media.ImmutablePandoCreativeConfig] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
