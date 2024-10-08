package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.VnX  reason: case insensitive filesystem */
public abstract class C18207VnX {
    public static C17442VVv parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17442VVv vVv = new C17442VVv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("flow_type".equals(A17)) {
                    vVv.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("initial_control_node".equals(A17)) {
                    vVv.A00 = C18206VnW.parseFromJson(r4);
                } else if ("structured_survey_flow_pages".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            C17351VSe parseFromJson = VE0.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    vVv.A02 = arrayList;
                }
                r4.A0z();
            }
            return vVv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C17442VVv vVv) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        String str = vVv.A01;
        if (str != null) {
            A0K.A0R("flow_type", str);
        }
        if (vVv.A00 != null) {
            A0K.A0q("initial_control_node");
            C18206VnW.A00(A0K, vVv.A00);
        }
        if (vVv.A02 != null) {
            16P.A03(A0K, "structured_survey_flow_pages");
            for (C17351VSe vSe : vVv.A02) {
                if (vSe != null) {
                    A0K.A0c();
                    if (vSe.A00 != null) {
                        A0K.A0q("control_node");
                        C18206VnW.A00(A0K, vSe.A00);
                    }
                    if (vSe.A01 != null) {
                        16P.A03(A0K, "buckets");
                        for (VO5 vo5 : vSe.A01) {
                            if (vo5 != null) {
                                A0K.A0c();
                                if (vo5.A00 != null) {
                                    16P.A03(A0K, "configured_questions");
                                    for (C17673Vc4 vc4 : vo5.A00) {
                                        if (vc4 != null) {
                                            A0K.A0c();
                                            A0K.A0S("allow_write_in_response", vc4.A07);
                                            A0K.A0S("is_required", vc4.A08);
                                            String str2 = vc4.A03;
                                            if (str2 != null) {
                                                A0K.A0R("question_id", str2);
                                            }
                                            C16645Uyh uyh = vc4.A02;
                                            if (uyh != null) {
                                                A0K.A0R("question_class", uyh.toString());
                                            }
                                            if (vc4.A00 != null) {
                                                A0K.A0q("body");
                                                C18205VnV.A00(A0K, vc4.A00);
                                            }
                                            if (vc4.A01 != null) {
                                                A0K.A0q(DialogModule.KEY_MESSAGE);
                                                C18205VnV.A00(A0K, vc4.A01);
                                            }
                                            if (vc4.A05 != null) {
                                                16P.A03(A0K, "subquestion_labels");
                                                for (C17349VSc vSc : vc4.A05) {
                                                    if (vSc != null) {
                                                        C18205VnV.A00(A0K, vSc);
                                                    }
                                                }
                                                A0K.A0Y();
                                            }
                                            if (vc4.A06 != null) {
                                                16P.A03(A0K, "survey_token_params");
                                                for (C17353VSg vSg : vc4.A06) {
                                                    if (vSg != null) {
                                                        A0K.A0c();
                                                        String str3 = vSg.A01;
                                                        if (str3 != null) {
                                                            A0K.A0R("param_name", str3);
                                                        }
                                                        C16633UyT uyT = vSg.A00;
                                                        if (uyT != null) {
                                                            A0K.A0R("survey_param_type", uyT.toString());
                                                        }
                                                        A0K.A0Z();
                                                    }
                                                }
                                                A0K.A0Y();
                                            }
                                            if (vc4.A04 != null) {
                                                16P.A03(A0K, "response_options");
                                                for (C17443VVw vVw : vc4.A04) {
                                                    if (vVw != null) {
                                                        A0K.A0c();
                                                        A0K.A0P("option_numeric_value", vVw.A00);
                                                        String str4 = vVw.A02;
                                                        if (str4 != null) {
                                                            A0K.A0R("option_value", str4);
                                                        }
                                                        if (vVw.A01 != null) {
                                                            A0K.A0q(AnonymousClass000.A00(1655));
                                                            C18205VnV.A00(A0K, vVw.A01);
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
        return AnonymousClass7TG.A0k(A0K, stringWriter);
    }
}
