package X;

import android.graphics.Color;
import com.instagram.model.androidlink.AndroidLinkImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vwc  reason: case insensitive filesystem */
public abstract class C18679Vwc {
    public static final int A00(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (!00p.A0k(str, "#", false)) {
            str = 002.A0D(str, '#');
        }
        return Color.parseColor(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (X.C17432VVl) X.AnonymousClass7TE.A13(r8.A00);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.model.mediasize.ImageInfo A01(X.VNR r8) {
        /*
            r4 = 0
            if (r8 == 0) goto L_0x0029
            java.util.List r0 = r8.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            X.VVl r0 = (X.C17432VVl) r0
            java.lang.String r3 = r0.A02
            if (r3 == 0) goto L_0x0029
            int r2 = r0.A01
            int r1 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r3, r2, r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            com.instagram.model.mediasize.ImageInfoImpl r3 = new com.instagram.model.mediasize.ImageInfoImpl
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            com.instagram.model.mediasize.ImageInfo r4 = X.1iI.A06(r3, r0)
        L_0x0029:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18679Vwc.A01(X.VNR):com.instagram.model.mediasize.ImageInfo");
    }

    public static final ArrayList A02(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && AnonymousClass7TE.A1b(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VY3 vy3 = (VY3) it.next();
                String str = vy3.A02;
                arrayList.add(new AndroidLinkImpl((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, Integer.valueOf(vy3.A00), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, vy3.A01, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, vy3.A03));
            }
        }
        return arrayList;
    }
}
