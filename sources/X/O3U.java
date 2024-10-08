package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class O3U {
    public static OM1 parseFromJson(16F r24) {
        String str;
        16F r1 = r24;
        0qQ.A0B(r1, 0);
        try {
            16L A11 = r1.A11();
            16L r242 = 16L.A0D;
            if (A11 != r242) {
                r1.A0z();
                return null;
            }
            String str2 = null;
            C70754OKa oKa = null;
            C70754OKa oKa2 = null;
            C70754OKa oKa3 = null;
            OTO oto = null;
            OTO oto2 = null;
            HashMap hashMap = null;
            C70754OKa oKa4 = null;
            ArrayList arrayList = null;
            C70754OKa oKa5 = null;
            OTO oto3 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            ImageUrl imageUrl = null;
            C70662OFj oFj = null;
            C69334NjZ njZ = null;
            ArrayList arrayList3 = null;
            Boolean bool = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r14 = 16L.A09;
                if (A1J == r14) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if ("body".equals(A17)) {
                    oKa2 = O3N.parseFromJson(r1);
                } else if (Pxd.A00(38).equals(A17)) {
                    oto = O3K.parseFromJson(r1);
                } else if ("secondary_button".equals(A17)) {
                    oto2 = O3K.parseFromJson(r1);
                } else if ("report_info".equals(A17)) {
                    if (r1.A11() == r242) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r1.A1J() != r14) {
                            String A1P = r1.A1P();
                            r1.A1J();
                            if (r1.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r1.A1P();
                                if (str == null) {
                                }
                            }
                            hashMap.put(A1P, str);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("done_button_label".equals(A17)) {
                    oKa4 = O3N.parseFromJson(r1);
                } else if ("follow_up_actions".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            OHB parseFromJson = O3J.parseFromJson(r1);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("follow_up_actions_title".equals(A17)) {
                    oKa5 = O3N.parseFromJson(r1);
                } else if ("prompt_button".equals(A17)) {
                    oto3 = O3K.parseFromJson(r1);
                } else if ("tip_number".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("paragraphs".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            C70754OKa parseFromJson2 = O3N.parseFromJson(r1);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("image_url".equals(A17)) {
                    imageUrl = 16h.A00(r1);
                } else if ("policy_education".equals(A17)) {
                    oFj = O3Q.parseFromJson(r1);
                } else if ("style".equals(A17)) {
                    int A1D = r1.A1D();
                    C69334NjZ[] values = C69334NjZ.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            njZ = null;
                            break;
                        }
                        njZ = values[i];
                        if (njZ.A00 == A1D) {
                            break;
                        }
                        i++;
                    }
                } else if ("report_tags".equals(A17)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r1.A1J() != 16L.A08) {
                            OGY parseFromJson3 = O3S.parseFromJson(r1);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("show_confirmation_screen".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("context".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    oKa = O3N.parseFromJson(r1);
                } else if ("subtitle".equals(A17)) {
                    oKa3 = O3N.parseFromJson(r1);
                }
                r1.A0z();
            }
            if (str2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("context", r1, "SubmitFRXReportModel.Response");
            } else if (oKa != null || !(r1 instanceof 0c9)) {
                OM1 om1 = new OM1(oKa, oKa3, str2);
                if (oKa2 != null) {
                    om1.A04 = oKa2;
                }
                if (oto != null) {
                    om1.A02 = oto;
                }
                if (oto2 != null) {
                    om1.A03 = oto2;
                }
                if (hashMap != null) {
                    om1.A0B = hashMap;
                }
                if (oKa4 != null) {
                    om1.A05 = oKa4;
                }
                if (arrayList != null) {
                    om1.A0C = arrayList;
                }
                if (oKa5 != null) {
                    om1.A06 = oKa5;
                }
                if (oto3 != null) {
                    om1.A01 = oto3;
                }
                if (str3 != null) {
                    om1.A0A = str3;
                }
                if (arrayList2 != null) {
                    om1.A0E = arrayList2;
                }
                if (imageUrl != null) {
                    om1.A00 = imageUrl;
                }
                if (oFj != null) {
                    om1.A07 = oFj;
                }
                if (njZ != null) {
                    om1.A08 = njZ;
                }
                if (arrayList3 != null) {
                    om1.A0D = arrayList3;
                }
                if (bool != null) {
                    om1.A09 = bool;
                }
                if (om1.A09 == null) {
                    0wb.A03("SubmitFRXReport Response", "'show_confirmation_screen' flag was null");
                }
                return om1;
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r1, "SubmitFRXReportModel.Response");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
