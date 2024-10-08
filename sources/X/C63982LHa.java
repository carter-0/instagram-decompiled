package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;

/* renamed from: X.LHa  reason: case insensitive filesystem */
public abstract class C63982LHa {
    public static final boolean A00(BrandedContentGatingInfo brandedContentGatingInfo) {
        Integer num = brandedContentGatingInfo.A00;
        if ((num == null || num.intValue() == 0) && brandedContentGatingInfo.A02 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.api.schemas.BrandedContentGatingInfo r1) {
        /*
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63982LHa.A01(com.instagram.api.schemas.BrandedContentGatingInfo):boolean");
    }
}
