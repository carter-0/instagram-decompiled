package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.io.IOException;
import java.util.List;

/* renamed from: X.3l0  reason: invalid class name and case insensitive filesystem */
public abstract class C250163l0 {
    public static C250173l1 parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            C275554qX r3 = null;
            C275554qX r4 = null;
            C53430GoN goN = null;
            C53432GoP goP = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C53433GoQ goQ = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("adtaxon_i18n_top1_l7_prediction".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("feed_dwell_afi_info".equals(A0q)) {
                    r3 = C254963tM.parseFromJson(r12);
                } else if ("feed_post_click_afi_info".equals(A0q)) {
                    r4 = C254963tM.parseFromJson(r12);
                } else if ("feed_repetition_info".equals(A0q)) {
                    goN = C254983tO.parseFromJson(r12);
                } else if ("interests_reco_info".equals(A0q)) {
                    goP = C254973tN.parseFromJson(r12);
                } else if ("is_feed_dwell_afi_eligible".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("is_feed_post_click_afi_eligible".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("is_reels_dwell_afi_eligible".equals(A0q)) {
                    bool3 = Boolean.valueOf(r12.A0d());
                } else if ("story_dwell_ini_info".equals(A0q)) {
                    goQ = C299395v5.parseFromJson(r12);
                }
                r12.A0z();
            }
            return new C250173l1(r3, r4, goN, goP, goQ, bool, bool2, bool3, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C250173l1 r6) {
        r5.A0c();
        String str = r6.A08;
        if (str != null) {
            r5.A0R("adtaxon_i18n_top1_l7_prediction", str);
        }
        C269884fq r1 = r6.A00;
        if (r1 != null) {
            r5.A0q("feed_dwell_afi_info");
            C254963tM.A00(r5, r1.F0K());
        }
        C269884fq r12 = r6.A01;
        if (r12 != null) {
            r5.A0q("feed_post_click_afi_info");
            C254963tM.A00(r5, r12.F0K());
        }
        C269894fr r13 = r6.A02;
        if (r13 != null) {
            r5.A0q("feed_repetition_info");
            C53430GoN F0L = r13.F0L();
            r5.A0c();
            String str2 = F0L.A02;
            if (str2 != null) {
                r5.A0R("dismiss_icon_resource_name", str2);
            }
            List<C275544qW> list = F0L.A04;
            if (list != null) {
                16P.A03(r5, "questions");
                for (C275544qW r0 : list) {
                    if (r0 != null) {
                        C275494qR.A00(r5, r0.F0H());
                    }
                }
                r5.A0Y();
            }
            REPETITION_UI_TYPE repetition_ui_type = F0L.A01;
            if (repetition_ui_type != null) {
                r5.A0R("render_mode", repetition_ui_type.A00);
            }
            String str3 = F0L.A03;
            if (str3 != null) {
                r5.A0R("repetition_target_type", str3);
            }
            C275524qU r14 = F0L.A00;
            if (r14 != null) {
                r5.A0q("undo_button");
                C275504qS.A00(r5, r14.F0G());
            }
            r5.A0Z();
        }
        C269904fs r15 = r6.A03;
        if (r15 != null) {
            r5.A0q("interests_reco_info");
            C53432GoP F0O = r15.F0O();
            r5.A0c();
            String str4 = F0O.A03;
            if (str4 != null) {
                r5.A0R("expand_button_label", str4);
            }
            Integer num = F0O.A01;
            if (num != null) {
                r5.A0P("expanded_num_rows", num.intValue());
            }
            List<JSM> list2 = F0O.A06;
            if (list2 != null) {
                16P.A03(r5, "interests");
                for (JSM jsm : list2) {
                    if (jsm != null) {
                        C53431GoO F0N = jsm.F0N();
                        r5.A0c();
                        String str5 = F0N.A00;
                        if (str5 != null) {
                            r5.A0R(AnonymousClass000.A00(47), str5);
                        }
                        String str6 = F0N.A01;
                        if (str6 != null) {
                            r5.A0R("emoji", str6);
                        }
                        String str7 = F0N.A02;
                        if (str7 != null) {
                            r5.A0R(AnonymousClass000.A00(1425), str7);
                        }
                        String str8 = F0N.A03;
                        if (str8 != null) {
                            r5.A0R(AnonymousClass000.A00(1426), str8);
                        }
                        String str9 = F0N.A04;
                        if (str9 != null) {
                            r5.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
                        }
                        String str10 = F0N.A05;
                        if (str10 != null) {
                            r5.A0R("source", str10);
                        }
                        String str11 = F0N.A06;
                        if (str11 != null) {
                            r5.A0R("version", str11);
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            Integer num2 = F0O.A02;
            if (num2 != null) {
                r5.A0P("num_rows", num2.intValue());
            }
            AfiInterestsRecoStyle afiInterestsRecoStyle = F0O.A00;
            if (afiInterestsRecoStyle != null) {
                r5.A0R("style", afiInterestsRecoStyle.A00);
            }
            String str12 = F0O.A04;
            if (str12 != null) {
                r5.A0R("subtitle", str12);
            }
            String str13 = F0O.A05;
            if (str13 != null) {
                r5.A0R(DialogModule.KEY_TITLE, str13);
            }
            r5.A0Z();
        }
        Boolean bool = r6.A05;
        if (bool != null) {
            r5.A0S("is_feed_dwell_afi_eligible", bool.booleanValue());
        }
        Boolean bool2 = r6.A06;
        if (bool2 != null) {
            r5.A0S("is_feed_post_click_afi_eligible", bool2.booleanValue());
        }
        Boolean bool3 = r6.A07;
        if (bool3 != null) {
            r5.A0S("is_reels_dwell_afi_eligible", bool3.booleanValue());
        }
        C269914ft r16 = r6.A04;
        if (r16 != null) {
            r5.A0q("story_dwell_ini_info");
            C53433GoQ F0P = r16.F0P();
            r5.A0c();
            String str14 = F0P.A00;
            if (str14 != null) {
                r5.A0R("see_less_button_confirmation_text", str14);
            }
            String str15 = F0P.A01;
            if (str15 != null) {
                r5.A0R("see_less_button_confirmation_text_icon", str15);
            }
            String str16 = F0P.A02;
            if (str16 != null) {
                r5.A0R("see_less_button_icon", str16);
            }
            String str17 = F0P.A03;
            if (str17 != null) {
                r5.A0R("see_less_button_text", str17);
            }
            String str18 = F0P.A04;
            if (str18 != null) {
                r5.A0R("see_more_button_confirmation_text", str18);
            }
            String str19 = F0P.A05;
            if (str19 != null) {
                r5.A0R("see_more_button_confirmation_text_icon", str19);
            }
            String str20 = F0P.A06;
            if (str20 != null) {
                r5.A0R("see_more_button_icon", str20);
            }
            String str21 = F0P.A07;
            if (str21 != null) {
                r5.A0R("see_more_button_text", str21);
            }
            String str22 = F0P.A08;
            if (str22 != null) {
                r5.A0R("undo_button_confirmation_text", str22);
            }
            String str23 = F0P.A09;
            if (str23 != null) {
                r5.A0R("undo_button_text", str23);
            }
            r5.A0Z();
        }
        r5.A0Z();
    }
}
