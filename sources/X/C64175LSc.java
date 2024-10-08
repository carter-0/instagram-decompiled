package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.base.VideoSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LSc  reason: case insensitive filesystem */
public abstract class C64175LSc {
    public static final ImageUrl A00(AnonymousClass3Q2 r4) {
        String str = r4.A33;
        if (str == null) {
            return null;
        }
        1iA r2 = r4.A1G;
        int ordinal = r2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return JTQ.A0G(str);
        }
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r2, "Unexpected media type: ", AnonymousClass7TE.A1A()));
    }

    public static final String A02(C3499682q r3, AnonymousClass3Q2 r4) {
        1iA r2 = r4.A1G;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            for (VideoSession videoSession : r3.FN1()) {
                String str = videoSession.A0G;
                if (str != null && str.equals(r4.A35)) {
                    return videoSession.A0H;
                }
            }
            return null;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r2, "Unexpected media type: ", AnonymousClass7TE.A1A()));
    }

    public static final ExtendedImageUrl A01(Context context, 1Xj r3) {
        int ordinal = r3.BR7().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return r3.A1n(context);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Unexpected media type: ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r3.BR7(), A1A));
    }

    public static final String A03(1Xj r2) {
        int ordinal = r2.BR7().ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return r2.A2U();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Unexpected media type: ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r2.BR7(), A1A));
    }

    public static final ArrayList A04(AnonymousClass3Q2 r3) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        BrandedContentTag A08 = r3.A08();
        if (!(A08 == null || (str = A08.A01) == null)) {
            A1C.add(str);
        }
        List list = r3.A4C;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = JTO.A0l(it).A01;
                if (str2 != null) {
                    A1C.add(str2);
                }
            }
        }
        if (A1C.isEmpty()) {
            return null;
        }
        return A1C;
    }
}
