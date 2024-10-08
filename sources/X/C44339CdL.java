package X;

import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CdL  reason: case insensitive filesystem */
public abstract class C44339CdL {
    public static SellerBadgeDict parseFromJson(16F r7) {
        String str;
        String str2;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            SellerBadgeType sellerBadgeType = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (C41845B3m.A1Q(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if (C41845B3m.A19(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r7.A1P();
                    }
                } else if ("surfaces".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            if (r7.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r7.A1P();
                            }
                            SellerBadgeSurfaces sellerBadgeSurfaces = (SellerBadgeSurfaces) SellerBadgeSurfaces.A01.get(str2);
                            if (sellerBadgeSurfaces == null) {
                                sellerBadgeSurfaces = SellerBadgeSurfaces.UNRECOGNIZED;
                            }
                            arrayList.add(sellerBadgeSurfaces);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1C(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    sellerBadgeType = (SellerBadgeType) SellerBadgeType.A01.get(str);
                    if (sellerBadgeType == null) {
                        sellerBadgeType = SellerBadgeType.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new SellerBadgeDict(sellerBadgeType, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
