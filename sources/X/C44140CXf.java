package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CXf  reason: case insensitive filesystem */
public abstract class C44140CXf {
    public static C53442Goa parseFromJson(16F r18) {
        String str;
        16F r8 = r18;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ClipsACRMidCardSubType clipsACRMidCardSubType = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str5 = null;
            String str6 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (AnonymousClass000.A00(237).equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    clipsACRMidCardSubType = (ClipsACRMidCardSubType) ClipsACRMidCardSubType.A01.get(str);
                    if (clipsACRMidCardSubType == null) {
                        clipsACRMidCardSubType = ClipsACRMidCardSubType.UNRECOGNIZED;
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("feed_collection_compound_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("feed_collection_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("media_dict".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1D(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_infos".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C53465Gox parseFromJson = C44363Cdj.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("subtitle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("cta_text", r8, "FeedCollectionMidCardMetadata");
            } else if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_dict", r8, "FeedCollectionMidCardMetadata");
            } else if (arrayList2 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("sound_sync_infos", r8, "FeedCollectionMidCardMetadata");
            } else if (str5 == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("subtitle", r8, "FeedCollectionMidCardMetadata");
            } else if (str6 != null || !(r8 instanceof 0c9)) {
                return new C53442Goa(clipsACRMidCardSubType, str2, str3, str4, str5, str6, arrayList, arrayList2);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r8, "FeedCollectionMidCardMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
