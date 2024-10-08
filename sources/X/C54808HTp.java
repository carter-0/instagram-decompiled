package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;
import java.io.IOException;

/* renamed from: X.HTp  reason: case insensitive filesystem */
public abstract class C54808HTp {
    public static C53452Gok parseFromJson(16F r28) {
        String A00;
        String A002;
        String A003;
        String A004;
        String str;
        String str2;
        String str3;
        String str4;
        16F r8 = r28;
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str5 = null;
            C53449Goh goh = null;
            String str6 = null;
            MidCardLayoutType midCardLayoutType = null;
            C53453Gol gol = null;
            ClipsMidCardSubtype clipsMidCardSubtype = null;
            ClipsMidCardType clipsMidCardType = null;
            String str7 = null;
            InstagramMidcardType instagramMidcardType = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r12 = 16L.A09;
                A00 = AnonymousClass000.A00(4205);
                A002 = AnonymousClass000.A00(802);
                A003 = C273654mx.A00(45);
                A004 = AnonymousClass000.A00(1141);
                if (A1J == r12) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if (AnonymousClass000.A00(2705).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if (A004.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("data".equals(A17)) {
                    goh = C54805HTm.parseFromJson(r8);
                } else if ("impression_token".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                } else if (A003.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                    midCardLayoutType = (MidCardLayoutType) MidCardLayoutType.A01.get(str4);
                    if (midCardLayoutType == null) {
                        midCardLayoutType = MidCardLayoutType.UNRECOGNIZED;
                    }
                } else if ("metadata".equals(A17)) {
                    gol = C54809HTq.parseFromJson(r8);
                } else if ("mid_card_subtype".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                    clipsMidCardSubtype = HTW.A00(str3);
                } else if ("mid_card_type".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    clipsMidCardType = (ClipsMidCardType) ClipsMidCardType.A01.get(str2);
                    if (clipsMidCardType == null) {
                        clipsMidCardType = ClipsMidCardType.UNRECOGNIZED;
                    }
                } else if ("subtype_v2".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r8.A1P();
                    }
                } else if (A002.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else if ("type_v2".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    instagramMidcardType = (InstagramMidcardType) InstagramMidcardType.A01.get(str);
                    if (instagramMidcardType == null) {
                        instagramMidcardType = InstagramMidcardType.A0k;
                    }
                } else {
                    num3 = C41847B3o.A13(r8, num3, A17, A00);
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A004, r8, "MidCardInfoV2");
            } else if (goh == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("data", r8, "MidCardInfoV2");
            } else if (str6 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("impression_token", r8, "MidCardInfoV2");
            } else if (midCardLayoutType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A003, r8, "MidCardInfoV2");
            } else if (num2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r8, "MidCardInfoV2");
            } else if (instagramMidcardType == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("type_v2", r8, "MidCardInfoV2");
            } else if (num3 != null || !(r8 instanceof 0c9)) {
                return new C53452Gok(clipsMidCardSubtype, clipsMidCardType, instagramMidcardType, goh, midCardLayoutType, gol, str5, str6, str7, num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L(A00, r8, "MidCardInfoV2");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
