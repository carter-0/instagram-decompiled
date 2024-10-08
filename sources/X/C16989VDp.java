package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VDp  reason: case insensitive filesystem */
public abstract class C16989VDp {
    public static C17739Vd8 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17739Vd8 vd8 = new C17739Vd8();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (AnonymousClass000.A00(1505).equals(A17)) {
                    vd8.A0I = r4.A0d();
                } else if ("is_editable".equals(A17)) {
                    r4.A0d();
                } else if ("is_required".equals(A17)) {
                    vd8.A0J = r4.A0d();
                } else if ("step_size".equals(A17)) {
                    vd8.A00 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(4697).equals(A17)) {
                        vd8.A05 = AnonymousClass7TG.A0l(r4);
                    } else if ("field_key".equals(A17)) {
                        vd8.A06 = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A17(A17)) {
                        vd8.A07 = AnonymousClass7TG.A0l(r4);
                    } else if (AnonymousClass000.A00(1464).equals(A17)) {
                        vd8.A08 = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A19(A17)) {
                        vd8.A09 = AnonymousClass7TG.A0l(r4);
                    } else if ("place_holder".equals(A17)) {
                        C41846B3n.A1A(r4);
                    } else if ("context_provider_type".equals(A17)) {
                        EnumHelper.A00(r4.A1Q(), C16627UyN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("field_type".equals(A17)) {
                        vd8.A02 = (C16676UzC) EnumHelper.A00(r4.A1Q(), C16676UzC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("input_domain".equals(A17)) {
                        vd8.A03 = (C16644Uyg) EnumHelper.A00(r4.A1Q(), C16644Uyg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("input_type".equals(A17)) {
                        vd8.A04 = (C16662Uyy) EnumHelper.A00(r4.A1Q(), C16662Uyy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("validation_spec".equals(A17)) {
                        vd8.A01 = C9833Rhv.parseFromJson(r4);
                    } else if ("context_provider_keys".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        vd8.A0A = arrayList;
                    } else if ("customized_tokens".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        vd8.A0B = arrayList;
                    } else if ("range".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        vd8.A0F = arrayList;
                    } else if ("values".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r4, arrayList);
                            }
                        }
                        vd8.A0H = arrayList;
                    } else if ("dependent_questions_dynamic_info".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C17440VVt parseFromJson = C16982VDi.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vd8.A0C = arrayList;
                    } else if ("dependent_questions_static_info".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VSW parseFromJson2 = C16984VDk.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        vd8.A0D = arrayList;
                    } else if ("options".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VDT parseFromJson3 = C16985VDl.parseFromJson(r4);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        vd8.A0E = arrayList;
                    } else if ("routing_info".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                VSX parseFromJson4 = C16988VDo.parseFromJson(r4);
                                if (parseFromJson4 != null) {
                                    arrayList.add(parseFromJson4);
                                }
                            }
                        }
                        vd8.A0G = arrayList;
                    }
                }
                r4.A0z();
            }
            return vd8;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
