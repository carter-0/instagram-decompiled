package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cks  reason: case insensitive filesystem */
public abstract class C44781Cks {
    public static C45428Cw8 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45428Cw8 cw8 = new C45428Cw8();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("disqualified_thank_you_card_transparency_info_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("form_extension_landing_page".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("gated_content_locked_description".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("gated_content_locked_headline".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("gated_content_unlocked_description".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("gated_content_unlocked_headline".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("qualified_thank_you_card_transparency_info_text".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                    }
                    r4.A1P();
                } else if ("policy_url".equals(A17)) {
                    cw8.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("context_page".equals(A17)) {
                    cw8.A00 = CkW.parseFromJson(r4);
                } else if ("creative".equals(A17)) {
                    cw8.A01 = C44777Cko.parseFromJson(r4);
                } else if ("legal_content".equals(A17)) {
                    cw8.A02 = C44792Cl3.parseFromJson(r4);
                } else if ("conditions".equals(A17)) {
                    cw8.A03 = C44793Cl4.parseFromJson(r4);
                } else if ("thank_you_page".equals(A17)) {
                    cw8.A04 = C44794Cl5.parseFromJson(r4);
                } else if ("draft_responses".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45293Ctw parseFromJson = C44778Ckp.parseFromJson(r4);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    cw8.A06 = arrayList;
                } else if ("end_screens".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45429Cw9 parseFromJson2 = C44779Ckq.parseFromJson(r4);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    cw8.A07 = arrayList;
                } else if ("phone_number_validation_exemptions".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C45294Ctx parseFromJson3 = C44780Ckr.parseFromJson(r4);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    cw8.A09 = arrayList;
                } else if ("info_fields_data".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C17739Vd8 parseFromJson4 = C16989VDp.parseFromJson(r4);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    cw8.A08 = arrayList;
                }
                r4.A0z();
            }
            return cw8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
