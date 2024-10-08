package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.List;

public final class OUG {
    public static final AnonymousClass3WR A00(N2c n2c, ProductType productType, String str, String str2) {
        List list;
        N2c n2c2 = n2c;
        C66720MbR mbR = n2c2.A02;
        boolean z = false;
        String str3 = str;
        if (mbR != null) {
            list = AnonymousClass7TE.A1I(new VideoUrlImpl(mbR.A03, mbR.A01, mbR.A00, DbX.A01((Number) mbR.A02), str3));
        } else {
            list = null;
        }
        String str4 = n2c2.A03;
        boolean A1V = AnonymousClass7TF.A1V(str4);
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(str3, 2);
        Integer valueOf = Integer.valueOf(A1V ? 1 : 0);
        if ((list != null && !list.isEmpty()) || !(str4 == null || str4.length() == 0)) {
            z = true;
        }
        return new AnonymousClass3WR((C2814057m) null, productType, (C255573uM) null, (Boolean) null, (Double) null, num, valueOf, str3, str2, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null, list, (List) null, (List) null, -1, -1, -1, false, false, false, false, false, false, z, false);
    }

    public final AnonymousClass3WR A01(C74438Put put) {
        String str;
        ProductType productType;
        if (put instanceof N54) {
            N54 n54 = (N54) put;
            N2c n2c = n54.A02;
            if (n2c != null) {
                String str2 = n54.A05;
                int intValue = n54.A03.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            productType = ProductType.IGTV;
                        } else if (intValue == 3) {
                            productType = ProductType.SIDECAR;
                        } else if (intValue == 4) {
                            productType = null;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                    } else if (n54.A04 == AnonymousClass05K.A01) {
                        productType = ProductType.CLIPS;
                    }
                    return A00(n2c, productType, str2, (String) null);
                }
                productType = ProductType.FEED;
                return A00(n2c, productType, str2, (String) null);
            }
            throw AnonymousClass7TE.A0w("Video source cannot be created for non-video content");
        } else if (put instanceof N53) {
            N53 n53 = (N53) put;
            String str3 = n53.A02;
            N2c n2c2 = n53.A01;
            ProductType productType2 = ProductType.FACEBOOK_VIDEO;
            C7607QOp qOp = (C7607QOp) 00k.A0J(n53.A05);
            if (qOp != null) {
                str = qOp.A02;
            } else {
                str = null;
            }
            return A00(n2c2, productType2, str3, str);
        } else if (put instanceof N52) {
            N52 n52 = (N52) put;
            String str4 = n52.A04;
            N2c n2c3 = n52.A00;
            0qQ.A0A(n2c3);
            return A00(n2c3, (ProductType) null, str4, (String) null);
        } else {
            throw AnonymousClass7TE.A0w("Unsupported content type");
        }
    }
}
