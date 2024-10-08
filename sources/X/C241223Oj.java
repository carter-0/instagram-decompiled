package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.SuggestedUsersStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3Oj  reason: invalid class name and case insensitive filesystem */
public abstract class C241223Oj {
    public static AnonymousClass3UG parseFromJson(16F r35) {
        String str;
        16F r5 = r35;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            C257593xe r10 = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            C250533lb r7 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            C270864hR r9 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str12 = null;
            SuggestedUsersStyle suggestedUsersStyle = null;
            String str13 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str14 = null;
            String str15 = null;
            Integer num2 = null;
            String str16 = null;
            Integer num3 = null;
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("bloks_data".equals(A0q)) {
                    r10 = C45662D0m.parseFromJson(r5);
                } else if ("cards_size".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(r5.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r5.A1P();
                    }
                } else if ("insertion_context".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r5.A1P();
                    }
                } else if ("is_dismissable".equals(A0q)) {
                    bool = Boolean.valueOf(r5.A0d());
                } else if ("is_unit_dismissable".equals(A0q)) {
                    bool2 = Boolean.valueOf(r5.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    r7 = C250523la.parseFromJson(r5);
                } else if ("landing_site_subtitle".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r5.A1P();
                    }
                } else if ("landing_site_title".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r5.A1P();
                    }
                } else if ("landing_site_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r5.A1P();
                    }
                } else if ("layout".equals(A0q)) {
                    r9 = C276404tH.A00(r5);
                } else if ("multiple_profile_navigation".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r5.A1P();
                    }
                } else if ("netego_type".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r5.A1P();
                    }
                } else if ("payload".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r5.A1P();
                    }
                } else if ("ranking_algorithm".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r5.A1P();
                    }
                } else if ("should_display_community_card".equals(A0q)) {
                    bool3 = Boolean.valueOf(r5.A0d());
                } else if ("show_bottom_cta".equals(A0q)) {
                    bool4 = Boolean.valueOf(r5.A0d());
                } else if ("style".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r5.A1P();
                    }
                } else if ("style_enum".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    suggestedUsersStyle = (SuggestedUsersStyle) SuggestedUsersStyle.A01.get(str);
                    if (suggestedUsersStyle == null) {
                        suggestedUsersStyle = SuggestedUsersStyle.UNRECOGNIZED;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r5.A1P();
                    }
                } else if ("suggestion_cards".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C241303Or parseFromJson = C241233Ok.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("suggestions".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass3UJ parseFromJson2 = C41907B6f.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("suggestions_with_media".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C298725tv parseFromJson3 = C44195CZi.parseFromJson(r5);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r5.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r5.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num2 = Integer.valueOf(r5.A1D());
                } else if ("view_all_text".equals(A0q)) {
                    if (r5.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r5.A1P();
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(r5.A1D());
                }
                r5.A0z();
            }
            return new AnonymousClass3UG(r7, suggestedUsersStyle, r9, r10, bool, bool2, bool3, bool4, num, num2, num3, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
