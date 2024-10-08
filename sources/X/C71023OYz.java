package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OYz  reason: case insensitive filesystem */
public final class C71023OYz {
    public static final C71023OYz A00 = new Object();

    public static final Integer A00(1iA r1) {
        int ordinal;
        if (!(r1 == null || (ordinal = r1.ordinal()) == 0)) {
            if (ordinal == 1) {
                return AnonymousClass05K.A0N;
            }
            if (ordinal == 7) {
                return AnonymousClass05K.A01;
            }
            if (ordinal == 29) {
                return AnonymousClass05K.A0Y;
            }
            if (ordinal == 30) {
                return AnonymousClass05K.A0j;
            }
        }
        return AnonymousClass05K.A00;
    }

    public final List A01(C254703su r6) {
        AnonymousClass5FY r0;
        String str;
        ExtendedImageUrl extendedImageUrl;
        String str2;
        1Xj r4;
        List<ExtendedImageUrl> list;
        Object obj = r6.A1T;
        if (obj instanceof 1Xj) {
            r4 = (1Xj) obj;
        } else if (obj instanceof C271374ik) {
            r4 = ((C271374ik) obj).A05;
        } else {
            if (obj instanceof C2609947v) {
                str = ((C2609947v) obj).A02();
            } else if (obj instanceof List) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : (List) obj) {
                    if (!(!(next instanceof C254873tC) || (extendedImageUrl = ((C254873tC) next).A0X) == null || (str2 = extendedImageUrl.A0A) == null)) {
                        A1C.add(str2);
                    }
                }
                return A1C;
            } else if (!(obj instanceof String)) {
                return 0sn.A00;
            } else {
                synchronized (r6) {
                    r0 = r6.A0V;
                }
                if (r0 != null) {
                    str = r0.A01;
                } else {
                    str = null;
                }
            }
            return 0sr.A1N(str);
        }
        if (r4 == null) {
            0KC.A0C("ArmadilloExpressMediaUtil", "Invalid DirectMedia");
            return 0sn.A00;
        }
        01N A1H = 0jo.A1H();
        ImageInfo A1p = r4.A1p();
        if (A1p == null || (list = A1p.Al9()) == null) {
            list = 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (ExtendedImageUrl extendedImageUrl2 : list) {
            A0r.add(extendedImageUrl2.A0A);
        }
        A1H.addAll(A0r);
        0sn<VideoVersionIntf> CEY = r4.A0C.CEY();
        if (CEY == null) {
            CEY = 0sn.A00;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (VideoVersionIntf url : CEY) {
            String url2 = url.getUrl();
            if (url2 != null) {
                A1C2.add(url2);
            }
        }
        A1H.addAll(A1C2);
        return 0jo.A1I(A1H);
    }
}
