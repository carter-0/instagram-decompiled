package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Caa  reason: case insensitive filesystem */
public abstract class C44213Caa {
    public static BFZ parseFromJson(16F r24) {
        String A00;
        String A002;
        String str;
        16F r5 = r24;
        0qQ.A0B(r5, 0);
        try {
            Integer num = null;
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str2 = null;
            C53436GoT goT = null;
            C53442Goa goa = null;
            ArrayList arrayList = null;
            ClipsMidCardType clipsMidCardType = null;
            BG4 bg4 = null;
            C53461Got got = null;
            BH0 bh0 = null;
            BH1 bh1 = null;
            C42110BHo bHo = null;
            while (true) {
                16L A1J = r5.A1J();
                16L r6 = 16L.A09;
                A00 = AnonymousClass000.A00(802);
                A002 = AnonymousClass000.A00(1141);
                if (A1J == r6) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r5);
                if (AnonymousClass000.A00(2705).equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if (A002.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r5);
                } else if ("camera_roll_mid_card_metadata".equals(A17)) {
                    goT = CVL.parseFromJson(r5);
                } else if ("feed_collection_mid_card_metadata".equals(A17)) {
                    goa = C44140CXf.parseFromJson(r5);
                } else if ("linked_medias_with_position".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C42047BFa parseFromJson = C44214Cab.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mid_card_type".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    clipsMidCardType = (ClipsMidCardType) ClipsMidCardType.A01.get(str);
                    if (clipsMidCardType == null) {
                        clipsMidCardType = ClipsMidCardType.UNRECOGNIZED;
                    }
                } else if ("prompt_mid_card_metadata".equals(A17)) {
                    bg4 = C44285CcT.parseFromJson(r5);
                } else if ("recently_saved_audio_mid_card_metadata".equals(A17)) {
                    got = C44303Ccl.parseFromJson(r5);
                } else if ("stories_mid_card_metadata".equals(A17)) {
                    bh0 = C44410CeU.parseFromJson(r5);
                } else if ("stories_mid_card_metadata_v2".equals(A17)) {
                    bh1 = C44409CeT.parseFromJson(r5);
                } else if (A00.equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r5);
                } else if ("template_mid_card_metadata".equals(A17)) {
                    bHo = C44510Cg6.parseFromJson(r5);
                } else {
                    num3 = C41847B3o.A13(r5, num3, A17, "view_state_item_type");
                }
                r5.A0z();
            }
            if (num == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r5, "MidCardInfo");
            } else if (clipsMidCardType == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L("mid_card_type", r5, "MidCardInfo");
            } else if (num2 == null && (r5 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r5, "MidCardInfo");
            } else if (num3 != null || !(r5 instanceof 0c9)) {
                return new BFZ(goT, clipsMidCardType, goa, bg4, got, bh0, bh1, bHo, str2, arrayList, num.intValue(), num2.intValue(), num3.intValue());
            } else {
                AnonymousClass7TF.A1L("view_state_item_type", r5, "MidCardInfo");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
