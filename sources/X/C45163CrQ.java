package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CrQ  reason: case insensitive filesystem */
public abstract class C45163CrQ {
    public static C55892HpD parseFromJson(16F r23) {
        String str;
        16F r2 = r23;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            Integer num = null;
            BH0 bh0 = null;
            BH1 bh1 = null;
            C42110BHo bHo = null;
            C45368CvA cvA = null;
            C53436GoT goT = null;
            C53442Goa goa = null;
            C53461Got got = null;
            BG4 bg4 = null;
            C276014sL r10 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ClipsMidCardType clipsMidCardType = null;
            Integer num2 = null;
            Integer num3 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if (AnonymousClass000.A00(802).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("stories_mid_card_metadata".equals(A17)) {
                    bh0 = C44410CeU.parseFromJson(r2);
                } else if ("stories_mid_card_metadata_v2".equals(A17)) {
                    bh1 = C44409CeT.parseFromJson(r2);
                } else if ("template_mid_card_metadata".equals(A17)) {
                    bHo = C44510Cg6.parseFromJson(r2);
                } else if ("mid_card_metadata".equals(A17)) {
                    cvA = C45165CrS.parseFromJson(r2);
                } else if ("camera_roll_mid_card_metadata".equals(A17)) {
                    goT = CVL.parseFromJson(r2);
                } else if ("feed_collection_mid_card_metadata".equals(A17)) {
                    goa = C44140CXf.parseFromJson(r2);
                } else if ("recently_saved_audio_mid_card_metadata".equals(A17)) {
                    got = C44303Ccl.parseFromJson(r2);
                } else if ("prompt_mid_card_metadata".equals(A17)) {
                    bg4 = C44285CcT.parseFromJson(r2);
                } else if ("stitched_media".equals(A17)) {
                    r10 = C275974sH.parseFromJson(r2);
                } else if ("linked_medias_with_position".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            C43845CFl parseFromJson = C45164CrR.parseFromJson(r2);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("top_following_creator_usernames".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r2, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("mid_card_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    clipsMidCardType = (ClipsMidCardType) ClipsMidCardType.A01.get(str);
                    if (clipsMidCardType == null) {
                        clipsMidCardType = ClipsMidCardType.UNRECOGNIZED;
                    }
                } else if ("view_state_item_type".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r2);
                } else {
                    num3 = C41847B3o.A13(r2, num3, A17, AnonymousClass000.A00(1141));
                }
                r2.A0z();
            }
            if (clipsMidCardType != null || !(r2 instanceof 0c9)) {
                return new C55892HpD(goT, r10, clipsMidCardType, goa, bg4, got, bh0, bh1, bHo, cvA, num, num2, num3, arrayList, arrayList2);
            }
            AnonymousClass7TF.A1L("mid_card_type", r2, "ClipsMidcardItem");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
