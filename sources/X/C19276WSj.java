package X;

import android.view.View;
import com.instagram.api.schemas.ProductTileBannerMetadataDecoration;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.WSj  reason: case insensitive filesystem */
public final class C19276WSj implements C232262tL {
    public final UL1 A00;
    public final C17702VcX A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj instanceof C19276WSj) {
            C19276WSj wSj = (C19276WSj) obj;
            if (!0qQ.A0K(this.A02, wSj.A02) || !0qQ.A0K(this.A00, wSj.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UL1 ul1;
        C19276WSj wSj = (C19276WSj) obj;
        UL1 ul12 = this.A00;
        if (wSj != null) {
            ul1 = wSj.A00;
        } else {
            ul1 = null;
        }
        return 0qQ.A0K(ul12, ul1);
    }

    public C19276WSj(View.OnLongClickListener onLongClickListener, ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration, AnonymousClass0iw r30, C56078HsR hsR, C266444Yx r32, ImageUrl imageUrl, ImageInfo imageInfo, C17969Vj5 vj5, Uw7 uw7, Integer num, Integer num2, String str, String str2, List list, 0sP r42, 0sP r43, 0sP r44, 0sP r45, 0sP r46, 0sL r47, 0sL r48, 0sL r49, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        String str3 = str;
        C266444Yx r7 = r32;
        AnonymousClass7TG.A1P(str3, r7);
        List list2 = list;
        0qQ.A0B(list2, 18);
        boolean z13 = z4;
        boolean z14 = z3;
        boolean z15 = z2;
        boolean z16 = z;
        Uw7 uw72 = uw7;
        Integer num3 = num;
        Integer num4 = num2;
        ProductTileBannerMetadataDecoration productTileBannerMetadataDecoration2 = productTileBannerMetadataDecoration;
        ImageUrl imageUrl2 = imageUrl;
        AnonymousClass0iw r5 = r30;
        ImageInfo imageInfo2 = imageInfo;
        C56078HsR hsR2 = hsR;
        String str4 = str2;
        UL1 ul1 = new UL1(productTileBannerMetadataDecoration2, r5, hsR2, r7, imageUrl2, imageInfo2, uw72, num3, num4, str4, list2, z16, z15, z14, z13, z5, z6, z7, z8, z9, z10, z11, z12);
        C17702VcX vcX = new C17702VcX(onLongClickListener, r5, vj5, r42, r43, r44, r45, r46, r47, r48, r49);
        this.A02 = str3;
        this.A00 = ul1;
        this.A01 = vcX;
    }
}
