package X;

import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.D1t  reason: case insensitive filesystem */
public abstract class C45694D1t {
    public static UpcomingEventMediaImpl parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str2 = null;
            ProductImageContainerImpl productImageContainerImpl = null;
            ImageInfoImpl imageInfoImpl = null;
            String str3 = null;
            Double d = null;
            ArrayList arrayList = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("accessibility_caption".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("explore_pivot_grid".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r12);
                } else if ("has_audio".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r12);
                } else if (C41845B3m.A17(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("image".equals(A17)) {
                    productImageContainerImpl = C275414q7.parseFromJson(r12);
                } else if ("image_versions2".equals(A17)) {
                    imageInfoImpl = 1dH.parseFromJson(r12);
                } else if ("product_type".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("video_duration".equals(A17)) {
                    d = C41846B3n.A0e(r12);
                } else if ("video_versions".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            VideoVersion parseFromJson = 1rY.parseFromJson(r12);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r12.A0z();
            }
            return new UpcomingEventMediaImpl(imageInfoImpl, productImageContainerImpl, bool, bool2, d, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, UpcomingEventMediaImpl upcomingEventMediaImpl) {
        r3.A0c();
        String str = upcomingEventMediaImpl.A05;
        if (str != null) {
            r3.A0R("accessibility_caption", str);
        }
        Boolean bool = upcomingEventMediaImpl.A02;
        if (bool != null) {
            r3.A0S("explore_pivot_grid", bool.booleanValue());
        }
        Boolean bool2 = upcomingEventMediaImpl.A03;
        if (bool2 != null) {
            r3.A0S("has_audio", bool2.booleanValue());
        }
        C41846B3n.A0y(r3, upcomingEventMediaImpl.A06);
        ProductImageContainer productImageContainer = upcomingEventMediaImpl.A01;
        if (productImageContainer != null) {
            r3.A0q("image");
            C275414q7.A00(r3, productImageContainer.FFc());
        }
        C41847B3o.A1J(r3, upcomingEventMediaImpl.A00);
        String str2 = upcomingEventMediaImpl.A07;
        if (str2 != null) {
            r3.A0R("product_type", str2);
        }
        Double d = upcomingEventMediaImpl.A04;
        if (d != null) {
            r3.A0N("video_duration", d.doubleValue());
        }
        List list = upcomingEventMediaImpl.A08;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r3, "video_versions", list);
            while (A0s.hasNext()) {
                VideoVersion videoVersion = (VideoVersion) A0s.next();
                if (videoVersion != null) {
                    1rY.A00(r3, videoVersion);
                }
            }
            r3.A0Y();
        }
        r3.A0Z();
    }
}
