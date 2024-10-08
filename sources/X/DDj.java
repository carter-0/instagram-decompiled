package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class DDj {
    public static C15257UXr parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                A01(r3, r0, AnonymousClass7TE.A17(r3));
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static String A00(C15257UXr uXr) {
        String str;
        String str2;
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        if (uXr.A02 != null) {
            A0K.A0q("simple_action");
            D20.A00(A0K, uXr.A02);
        }
        String str3 = uXr.A03;
        if (str3 != null) {
            A0K.A0R("navbar_title", str3);
        }
        A0K.A0S("navbar_count_pages", uXr.A07);
        A0K.A0P("navbar_count_pages_offset", uXr.A00);
        A0K.A0S("has_skip", uXr.A08);
        String str4 = uXr.A04;
        if (str4 != null) {
            A0K.A0R("survey_id", str4);
        }
        if (uXr.A06 != null) {
            16P.A03(A0K, "pages");
            loop0:
            for (C17371VSy vSy : uXr.A06) {
                if (vSy != null) {
                    A0K.A0c();
                    C41846B3n.A0y(A0K, vSy.A00);
                    if (vSy.A01 != null) {
                        16P.A03(A0K, "modules");
                        for (C17926ViH viH : vSy.A01) {
                            if (viH != null) {
                                A0K.A0c();
                                if (viH.A06 != null) {
                                    A0K.A0q("feed_item");
                                    C45354Cuw cuw = viH.A06;
                                    A0K.A0c();
                                    if (cuw.A01 != null) {
                                        A0K.A0q("media_or_ad");
                                        1Xj r2 = cuw.A01;
                                        1Xv r0 = 1Xj.A0h;
                                        1Xv.A07(A0K, r2);
                                    }
                                    if (cuw.A02 != null) {
                                        A0K.A0q(AnonymousClass000.A00(3140));
                                        C45353Cuv cuv = cuw.A02;
                                        A0K.A0c();
                                        if (cuv.A00 != null) {
                                            A0K.A0q("media_or_ad");
                                            1Xj r22 = cuv.A00;
                                            1Xv r02 = 1Xj.A0h;
                                            1Xv.A07(A0K, r22);
                                        }
                                        if (cuv.A01 != null) {
                                            A0K.A0q("follow_hashtag_info");
                                            C279594yt.A00(A0K, cuv.A01);
                                        }
                                        Integer num = cuv.A02;
                                        if (num != null) {
                                            A0K.A0P("brs_severity", num.intValue());
                                        }
                                        A0K.A0Z();
                                    }
                                    if (cuw.A00 != null) {
                                        A0K.A0q("explore_story");
                                        AnonymousClass3f1 r5 = cuw.A00;
                                        A0K.A0c();
                                        C250503lY r23 = r5.A03;
                                        if (r23 != null) {
                                            A0K.A0q("ad");
                                            C250153kz.A00(A0K, r23);
                                        }
                                        Boolean bool = r5.A04;
                                        if (bool != null) {
                                            A0K.A0S("allow_feedback", bool.booleanValue());
                                        }
                                        Integer num2 = r5.A07;
                                        if (num2 != null) {
                                            A0K.A0P("brs_severity", num2.intValue());
                                        }
                                        List list = r5.A0F;
                                        if (list != null) {
                                            Iterator A0s = C41845B3m.A0s(A0K, "feed_recs_hide_reasons", list);
                                            while (A0s.hasNext()) {
                                                DR9 dr9 = (DR9) A0s.next();
                                                if (dr9 != null) {
                                                    C42036BEo bEo = (C42036BEo) dr9;
                                                    A0K.A0c();
                                                    C41846B3n.A0y(A0K, bEo.A00);
                                                    C41846B3n.A0z(A0K, bEo.A01);
                                                    A0K.A0Z();
                                                }
                                            }
                                            A0K.A0Y();
                                        }
                                        String str5 = r5.A0A;
                                        if (str5 != null) {
                                            A0K.A0R("feed_survey_integration_id", str5);
                                        }
                                        Integer num3 = r5.A08;
                                        if (num3 != null) {
                                            A0K.A0P("global_position", num3.intValue());
                                        }
                                        C41846B3n.A0y(A0K, r5.A0B);
                                        String str6 = r5.A0C;
                                        if (str6 != null) {
                                            A0K.A0R("inventory_source", str6);
                                        }
                                        Boolean bool2 = r5.A05;
                                        if (bool2 != null) {
                                            A0K.A0S("is_eof", bool2.booleanValue());
                                        }
                                        Boolean bool3 = r5.A06;
                                        if (bool3 != null) {
                                            A0K.A0S("is_seen", bool3.booleanValue());
                                        }
                                        C67241sS r24 = r5.A00;
                                        if (r24 != null) {
                                            A0K.A0q("item_client_gap_rules");
                                            C250523la.A00(A0K, r24.F8M());
                                        }
                                        1Xj r25 = r5.A01;
                                        if (r25 != null) {
                                            A0K.A0q("media");
                                            1Xv r03 = 1Xj.A0h;
                                            1Xv.A07(A0K, r25);
                                        }
                                        1Xj r26 = r5.A02;
                                        if (r26 != null) {
                                            A0K.A0q("media_or_ad");
                                            1Xv r04 = 1Xj.A0h;
                                            1Xv.A07(A0K, r26);
                                        }
                                        String str7 = r5.A0D;
                                        if (str7 != null) {
                                            A0K.A0R("mezql_token", str7);
                                        }
                                        String str8 = r5.A0E;
                                        if (str8 != null) {
                                            A0K.A0R("source", str8);
                                        }
                                        Integer num4 = r5.A09;
                                        if (num4 != null) {
                                            A0K.A0P("view_state_item_type", num4.intValue());
                                        }
                                        A0K.A0Z();
                                    }
                                    A0K.A0Z();
                                }
                                if (viH.A01 != null) {
                                    A0K.A0q("question_list");
                                    D08.A00(A0K, viH.A01);
                                }
                                if (viH.A07 != null) {
                                    A0K.A0q("reel");
                                    AnonymousClass3HR.A00(A0K, viH.A07);
                                }
                                if (viH.A00 != null) {
                                    A0K.A0q("clips_item");
                                    C275974sH.A00(A0K, viH.A00);
                                }
                                if (viH.A04 != null) {
                                    A0K.A0q("business_card");
                                    C45452Cwj cwj = viH.A04;
                                    A0K.A0c();
                                    String str9 = cwj.A01;
                                    if (str9 == null) {
                                        str = "businessCardId";
                                        break loop0;
                                    }
                                    A0K.A0R("pk", str9);
                                    cwj.A00();
                                    A0K.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                                    User A00 = cwj.A00();
                                    Parcelable.Creator creator = User.CREATOR;
                                    1aC.A08(A0K, A00);
                                    if (cwj.A02 != null) {
                                        16P.A03(A0K, "image_urls");
                                        List<ImageUrl> list2 = cwj.A02;
                                        if (list2 != null) {
                                            for (ImageUrl imageUrl : list2) {
                                                if (imageUrl != null) {
                                                    16h.A01(A0K, imageUrl);
                                                }
                                            }
                                            A0K.A0Y();
                                            A0K.A0Z();
                                        }
                                    }
                                    str = "imageUrlList";
                                    break loop0;
                                }
                                A0K.A0Z();
                            }
                        }
                        A0K.A0Y();
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
        }
        if (uXr.A01 != null) {
            A0K.A0q("ending_screen");
            C45286Ctp ctp = uXr.A01;
            A0K.A0c();
            switch (ctp.A01.intValue()) {
                case 0:
                    str2 = "simple_action";
                    break;
                case 1:
                    str2 = "thank_you";
                    break;
                default:
                    str2 = "unknown";
                    break;
            }
            A0K.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
            if (ctp.A00 != null) {
                A0K.A0q("simple_action");
                AnonymousClass3IJ r05 = ctp.A00;
                if (r05 != null) {
                    D20.A00(A0K, r05);
                    A0K.A0Z();
                }
            }
            str = "simpleActionDict";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        String str10 = uXr.A05;
        if (str10 != null) {
            A0K.A0R("survey_type", str10);
        }
        1XY.A00(A0K, uXr);
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }

    public static void A01(16F r3, C15257UXr uXr, String str) {
        if ("simple_action".equals(str)) {
            uXr.A02 = D20.parseFromJson(r3);
            return;
        }
        ArrayList arrayList = null;
        if ("navbar_title".equals(str)) {
            uXr.A03 = AnonymousClass7TG.A0l(r3);
        } else if ("navbar_count_pages".equals(str)) {
            uXr.A07 = r3.A0d();
        } else if ("navbar_count_pages_offset".equals(str)) {
            uXr.A00 = r3.A1D();
        } else if ("has_skip".equals(str)) {
            uXr.A08 = r3.A0d();
        } else if ("survey_id".equals(str)) {
            uXr.A04 = AnonymousClass7TG.A0l(r3);
        } else if ("pages".equals(str)) {
            if (r3.A11() == 16L.A0C) {
                arrayList = AnonymousClass7TE.A1C();
                while (r3.A1J() != 16L.A08) {
                    C17371VSy parseFromJson = C44861CmC.parseFromJson(r3);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            uXr.A06 = arrayList;
        } else if ("ending_screen".equals(str)) {
            uXr.A01 = C44755CkR.parseFromJson(r3);
        } else if ("survey_type".equals(str)) {
            uXr.A05 = AnonymousClass7TG.A0l(r3);
        } else {
            1XY.A01(r3, uXr, str);
        }
    }
}
