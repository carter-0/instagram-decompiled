package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardOverlayType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HTm  reason: case insensitive filesystem */
public abstract class C54805HTm {
    public static C53449Goh parseFromJson(16F r30) {
        String A00;
        String str;
        String str2;
        16F r8 = r30;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str3 = null;
            MidCardClipsClickedAction midCardClipsClickedAction = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            MidCardOverlayType midCardOverlayType = null;
            ArrayList arrayList5 = null;
            C53451Goj goj = null;
            C53450Goi goi = null;
            C53450Goi goi2 = null;
            C53450Goi goi3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r8.A1J();
                16L r13 = 16L.A09;
                A00 = AnonymousClass000.A00(182);
                if (A1J == r13) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                if ("body_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("clips_clicked_action".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    midCardClipsClickedAction = (MidCardClipsClickedAction) MidCardClipsClickedAction.A01.get(str2);
                    if (midCardClipsClickedAction == null) {
                        midCardClipsClickedAction = MidCardClipsClickedAction.UNRECOGNIZED;
                    }
                } else if ("clips_clicked_actions_info".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C53448Gog parseFromJson = C54804HTl.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("clips_items".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C276014sL parseFromJson2 = C275974sH.parseFromJson(r8);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("labels_on_clips".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C53450Goi parseFromJson3 = C54806HTn.parseFromJson(r8);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("overlay_clicked_actions_info".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C53450Goi parseFromJson4 = C54806HTn.parseFromJson(r8);
                            if (parseFromJson4 != null) {
                                arrayList4.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("overlay_on_clips".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    midCardOverlayType = (MidCardOverlayType) MidCardOverlayType.A01.get(str);
                    if (midCardOverlayType == null) {
                        midCardOverlayType = MidCardOverlayType.UNRECOGNIZED;
                    }
                } else if ("overlay_on_clips_text_info".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList5 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r8, arrayList5);
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("preview_media_target".equals(A17)) {
                    goj = C54807HTo.parseFromJson(r8);
                } else if (A00.equals(A17)) {
                    goi = C54806HTn.parseFromJson(r8);
                } else if ("seconary_cta".equals(A17)) {
                    goi2 = C54806HTn.parseFromJson(r8);
                } else if ("secondary_cta".equals(A17)) {
                    goi3 = C54806HTn.parseFromJson(r8);
                } else if ("title_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (midCardClipsClickedAction == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_clicked_action", r8, "MidCardCommonData");
            } else if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_clicked_actions_info", r8, "MidCardCommonData");
            } else if (arrayList2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("clips_items", r8, "MidCardCommonData");
            } else if (arrayList3 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("labels_on_clips", r8, "MidCardCommonData");
            } else if (goi == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r8, "MidCardCommonData");
            } else if (str4 != null || !(r8 instanceof 0c9)) {
                return new C53449Goh(midCardClipsClickedAction, goi, goi2, goi3, goj, midCardOverlayType, str3, str4, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            } else {
                AnonymousClass7TF.A1L("title_text", r8, "MidCardCommonData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
