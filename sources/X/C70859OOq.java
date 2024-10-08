package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* renamed from: X.OOq  reason: case insensitive filesystem */
public final class C70859OOq {
    public static final AnonymousClass3WR A00(N2c n2c, ProductType productType, String str, String str2, boolean z) {
        List list;
        Integer num;
        VideoUrlImpl videoUrlImpl;
        N2c n2c2 = n2c;
        C66720MbR mbR = n2c2.A02;
        String str3 = null;
        boolean z2 = false;
        String str4 = str;
        if (mbR != null) {
            list = AnonymousClass7TE.A1I(new VideoUrlImpl(mbR.A03, mbR.A01, mbR.A00, DbX.A01((Number) mbR.A02), str4));
        } else {
            list = null;
        }
        String str5 = n2c2.A03;
        boolean A1V = AnonymousClass7TF.A1V(str5);
        if (z) {
            num = AnonymousClass05K.A0N;
            if (!(list == null || (videoUrlImpl = (VideoUrlImpl) 00k.A0J(list)) == null)) {
                str3 = videoUrlImpl.A06;
            }
        } else {
            num = AnonymousClass05K.A00;
        }
        0qQ.A0B(str4, 2);
        Integer valueOf = Integer.valueOf(A1V ? 1 : 0);
        if (!(str3 == null || str3.length() == 0) || ((list != null && !list.isEmpty()) || !(str5 == null || str5.length() == 0))) {
            z2 = true;
        }
        return new AnonymousClass3WR((C2814057m) null, productType, (C255573uM) null, (Boolean) null, (Double) null, num, valueOf, str4, str2, str3, str5, (String) null, (String) null, (String) null, (String) null, (String) null, list, (List) null, (List) null, -1, -1, -1, false, false, false, false, false, false, z2, false);
    }
}
