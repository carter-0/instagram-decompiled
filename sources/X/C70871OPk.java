package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OPk  reason: case insensitive filesystem */
public abstract class C70871OPk {
    public static DirectAREffectShare parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            DirectAREffectShare directAREffectShare = new DirectAREffectShare();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("effect_id".equals(A17)) {
                    directAREffectShare.A07 = AnonymousClass7TG.A0l(r4);
                } else if ("effect_title".equals(A17)) {
                    directAREffectShare.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("icon_url".equals(A17)) {
                    directAREffectShare.A01 = 16h.A00(r4);
                } else if ("attribution_user_name".equals(A17)) {
                    directAREffectShare.A06 = AnonymousClass7TG.A0l(r4);
                } else if ("attribution_user_id".equals(A17)) {
                    directAREffectShare.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("attribution_profile_picture_url".equals(A17)) {
                    directAREffectShare.A00 = 16h.A00(r4);
                } else if ("data".equals(A17)) {
                    directAREffectShare.A02 = O12.parseFromJson(r4);
                } else if ("preview_video".equals(A17)) {
                    directAREffectShare.A03 = AnonymousClass3HR.parseFromJson(r4);
                } else if ("primary_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    directAREffectShare.A09 = arrayList;
                } else if ("secondary_actions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    directAREffectShare.A0A = arrayList;
                } else if ("shopping_info".equals(A17)) {
                    directAREffectShare.A04 = O1G.parseFromJson(r4);
                }
                r4.A0z();
            }
            return directAREffectShare;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, DirectAREffectShare directAREffectShare) {
        r4.A0c();
        String str = directAREffectShare.A07;
        if (str != null) {
            r4.A0R("effect_id", str);
        }
        String str2 = directAREffectShare.A08;
        if (str2 != null) {
            r4.A0R("effect_title", str2);
        }
        if (directAREffectShare.A01 != null) {
            r4.A0q("icon_url");
            16h.A01(r4, directAREffectShare.A01);
        }
        String str3 = directAREffectShare.A06;
        if (str3 != null) {
            r4.A0R("attribution_user_name", str3);
        }
        String str4 = directAREffectShare.A05;
        if (str4 != null) {
            r4.A0R("attribution_user_id", str4);
        }
        if (directAREffectShare.A00 != null) {
            r4.A0q("attribution_profile_picture_url");
            16h.A01(r4, directAREffectShare.A00);
        }
        if (directAREffectShare.A02 != null) {
            r4.A0q("data");
            NML nml = directAREffectShare.A02;
            r4.A0c();
            if (nml.A00 != null) {
                r4.A0q("instagram_direct_effects");
                O96 o96 = nml.A00;
                r4.A0c();
                if (o96.A00 != null) {
                    r4.A0q("target_effect_preview");
                    OHW ohw = o96.A00;
                    r4.A0c();
                    String str5 = ohw.A05;
                    if (str5 != null) {
                        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
                    }
                    String str6 = ohw.A06;
                    if (str6 != null) {
                        r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
                    }
                    C62622Kit kit = ohw.A04;
                    if (kit != null) {
                        r4.A0R("device_position", kit.toString());
                    }
                    if (ohw.A00 != null) {
                        r4.A0q("attribution_user");
                        OEI oei = ohw.A00;
                        r4.A0c();
                        String str7 = oei.A01;
                        if (str7 != null) {
                            r4.A0R("instagram_user_id", str7);
                        }
                        String str8 = oei.A02;
                        if (str8 != null) {
                            r4.A0R(DcV.A01(), str8);
                        }
                        if (oei.A00 != null) {
                            r4.A0q("profile_picture");
                            O94 o94 = oei.A00;
                            r4.A0c();
                            String str9 = o94.A00;
                            if (str9 != null) {
                                r4.A0R("uri", str9);
                            }
                            r4.A0Z();
                        }
                        r4.A0Z();
                    }
                    if (ohw.A01 != null) {
                        r4.A0q("effect_action_sheet");
                        OCR ocr = ohw.A01;
                        r4.A0c();
                        if (ocr.A00 != null) {
                            16P.A03(r4, "primary_actions");
                            for (Object next : ocr.A00) {
                                if (next != null) {
                                    r4.A0t(next.toString());
                                }
                            }
                            r4.A0Y();
                        }
                        if (ocr.A01 != null) {
                            16P.A03(r4, "secondary_actions");
                            for (Object next2 : ocr.A01) {
                                if (next2 != null) {
                                    r4.A0t(next2.toString());
                                }
                            }
                            r4.A0Y();
                        }
                        r4.A0Z();
                    }
                    if (ohw.A02 != null) {
                        r4.A0q("fan_club");
                        OCS ocs = ohw.A02;
                        r4.A0c();
                        String str10 = ocs.A00;
                        if (str10 != null) {
                            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10);
                        }
                        String str11 = ocs.A01;
                        if (str11 != null) {
                            r4.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str11);
                        }
                        r4.A0Z();
                    }
                    if (ohw.A03 != null) {
                        r4.A0q(AnonymousClass000.A00(381));
                        O95 o95 = ohw.A03;
                        r4.A0c();
                        String str12 = o95.A00;
                        if (str12 != null) {
                            r4.A0R("uri", str12);
                        }
                        r4.A0Z();
                    }
                    r4.A0Z();
                }
                r4.A0Z();
            }
            r4.A0Z();
        }
        if (directAREffectShare.A03 != null) {
            r4.A0q("preview_video");
            AnonymousClass3HR.A00(r4, directAREffectShare.A03);
        }
        if (directAREffectShare.A09 != null) {
            16P.A03(r4, "primary_actions");
            Iterator it = directAREffectShare.A09.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r4, it);
            }
            r4.A0Y();
        }
        if (directAREffectShare.A0A != null) {
            16P.A03(r4, "secondary_actions");
            Iterator it2 = directAREffectShare.A0A.iterator();
            while (it2.hasNext()) {
                C41846B3n.A18(r4, it2);
            }
            r4.A0Y();
        }
        if (directAREffectShare.A04 != null) {
            r4.A0q("shopping_info");
            ProductAREffectContainer productAREffectContainer = directAREffectShare.A04;
            r4.A0c();
            if (productAREffectContainer.A00 != null) {
                r4.A0q(AnonymousClass000.A00(595));
                C45681D1g.A00(r4, productAREffectContainer.A00);
            }
            r4.A0Z();
        }
        r4.A0Z();
    }
}
