package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class D0Y {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.87G] */
    public static AnonymousClass87G parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1C(A17)) {
                    obj.A04 = C393699wr.A00(r4.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A19(A17)) {
                        obj.A0G = AnonymousClass7TG.A0l(r4);
                    } else if ("thumbnail_url".equals(A17)) {
                        obj.A05 = 16h.A00(r4);
                    } else if ("ar_effect".equals(A17)) {
                        obj.A03 = AnonymousClass515.parseFromJson(r4);
                    } else if ("poll_stickers".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C272024jy parseFromJson = C271984ju.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0I = arrayList;
                    } else if ("question_stickers".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                UNR parseFromJson2 = C18119Vln.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A0J = arrayList;
                    } else if ("quiz_info".equals(A17)) {
                        obj.A0B = C44998Cob.parseFromJson(r4);
                    } else if ("countdown_info".equals(A17)) {
                        obj.A07 = D29.parseFromJson(r4);
                    } else if ("cards".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C45361Cv3 parseFromJson3 = C45001Coe.parseFromJson(r4);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        obj.A0L = arrayList;
                    } else if ("gifs_info".equals(A17)) {
                        obj.A02 = C45562Cya.parseFromJson(r4);
                    } else if ("otd_info".equals(A17)) {
                        obj.A09 = C44978CoH.parseFromJson(r4);
                    } else if ("templates_info".equals(A17)) {
                        obj.A0C = D2L.parseFromJson(r4);
                    } else if ("mention_info".equals(A17)) {
                        obj.A0A = C44980CoJ.parseFromJson(r4);
                    } else if ("product_item_with_ar".equals(A17)) {
                        obj.A06 = C45681D1g.parseFromJson(r4);
                    } else if ("fundraiser_sticker_suggestions".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                C41846B3n.A1E(r4, arrayList);
                            }
                        }
                        obj.A0H = arrayList;
                    } else if ("fundraiser_sticker_model".equals(A17)) {
                        obj.A08 = AB9.parseFromJson(r4);
                    }
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(AnonymousClass87G r7) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        AnonymousClass87I r0 = r7.A04;
        if (r0 != null) {
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r0.A00);
        }
        String str = r7.A0G;
        if (str != null) {
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        if (r7.A05 != null) {
            A0K.A0q("thumbnail_url");
            16h.A01(A0K, r7.A05);
        }
        if (r7.A03 != null) {
            A0K.A0q("ar_effect");
            AnonymousClass515.A00(A0K, r7.A03);
        }
        if (r7.A0I != null) {
            16P.A03(A0K, "poll_stickers");
            for (C272024jy r02 : r7.A0I) {
                if (r02 != null) {
                    C271984ju.A00(A0K, r02, true);
                }
            }
            A0K.A0Y();
        }
        if (r7.A0J != null) {
            16P.A03(A0K, "question_stickers");
            for (UNR unr : r7.A0J) {
                if (unr != null) {
                    C18119Vln.A00(A0K, unr, true);
                }
            }
            A0K.A0Y();
        }
        if (r7.A0B != null) {
            A0K.A0q("quiz_info");
            C39688A5e a5e = r7.A0B;
            A0K.A0c();
            String str2 = a5e.A00;
            if (str2 != null) {
                A0K.A0R("prompt", str2);
            }
            if (a5e.A01 != null) {
                16P.A03(A0K, "suggestions");
                Iterator it = a5e.A01.iterator();
                while (it.hasNext()) {
                    C41846B3n.A18(A0K, it);
                }
                A0K.A0Y();
            }
            A0K.A0Z();
        }
        if (r7.A07 != null) {
            A0K.A0q("countdown_info");
            UY8 uy8 = r7.A07;
            A0K.A0c();
            String str3 = uy8.A00;
            if (str3 != null) {
                A0K.A0R("max_id", str3);
            }
            A0K.A0S("more_available", uy8.A02);
            A0K.A0S("show_see_all", uy8.A03);
            if (uy8.A01 != null) {
                16P.A03(A0K, "countdowns");
                for (BGi bGi : uy8.A01) {
                    if (bGi != null) {
                        C45635Czl.A00(A0K, bGi, true);
                    }
                }
                A0K.A0Y();
            }
            1XY.A00(A0K, uy8);
            A0K.A0Z();
        }
        if (r7.A0L != null) {
            16P.A03(A0K, "cards");
            for (C45361Cv3 cv3 : r7.A0L) {
                if (cv3 != null) {
                    A0K.A0c();
                    if (cv3.A00 != null) {
                        A0K.A0q("background_url");
                        16h.A01(A0K, cv3.A00);
                    }
                    C41846B3n.A0z(A0K, cv3.A01);
                    String str4 = cv3.A02;
                    if (str4 != null) {
                        A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        if (r7.A02 != null) {
            A0K.A0q("gifs_info");
            C45562Cya.A00(A0K, r7.A02);
        }
        if (r7.A09 != null) {
            A0K.A0q("otd_info");
            C45241Csw csw = r7.A09;
            A0K.A0c();
            if (csw.A00 != null) {
                16P.A03(A0K, DialogModule.KEY_ITEMS);
                for (MemoryItem memoryItem : csw.A00) {
                    if (memoryItem != null) {
                        A0K.A0c();
                        C62558Kho kho = memoryItem.A00;
                        if (kho != null) {
                            A0K.A0R("item_type", kho.A00);
                        }
                        if (memoryItem.A01 != null) {
                            A0K.A0q("item_payload");
                            D2C.A00(A0K, memoryItem.A01);
                        }
                        A0K.A0Z();
                    }
                }
                A0K.A0Y();
            }
            A0K.A0Z();
        }
        if (r7.A0C != null) {
            A0K.A0q("templates_info");
            D2L.A00(A0K, r7.A0C);
        }
        if (r7.A0A != null) {
            A0K.A0q("mention_info");
            C45242Csx csx = r7.A0A;
            A0K.A0c();
            if (csx.A00 != null) {
                16P.A03(A0K, "media_dicts");
                Iterator it2 = csx.A00.iterator();
                while (it2.hasNext()) {
                    C41848B3p.A1O(A0K, it2);
                }
                A0K.A0Y();
            }
            A0K.A0Z();
        }
        if (r7.A06 != null) {
            A0K.A0q("product_item_with_ar");
            C45681D1g.A00(A0K, r7.A06);
        }
        if (r7.A0H != null) {
            16P.A03(A0K, "fundraiser_sticker_suggestions");
            Iterator it3 = r7.A0H.iterator();
            while (it3.hasNext()) {
                C41846B3n.A19(A0K, it3);
            }
            A0K.A0Y();
        }
        if (r7.A08 != null) {
            A0K.A0q("fundraiser_sticker_model");
            AB9.A00(A0K, r7.A08, true);
        }
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
