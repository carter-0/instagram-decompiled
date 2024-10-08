package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VCn  reason: case insensitive filesystem */
public abstract class C16961VCn {
    public static C17737Vd6 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C17737Vd6 vd6 = new C17737Vd6();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C273654mx.A00(311).equals(A17)) {
                    vd6.A0D = r4.A0d();
                } else if (C273654mx.A00(2899).equals(A17)) {
                    vd6.A0E = r4.A0d();
                } else if ("is_draft".equals(A17)) {
                    vd6.A0F = r4.A0d();
                } else if (AnonymousClass000.A00(3426).equals(A17)) {
                    vd6.A0G = r4.A0d();
                } else if (C273654mx.A00(3467).equals(A17)) {
                    vd6.A0H = r4.A0d();
                } else if ("hands_free_duration".equals(A17)) {
                    vd6.A00 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("camera_format_type".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("gatekeeper".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if ("gatelogic".equals(A17)) {
                        if (r4.A11() == 16L.A0G) {
                        }
                    } else if (C41845B3m.A17(A17)) {
                        vd6.A08 = AnonymousClass7TG.A0l(r4);
                    } else if (C41845B3m.A19(A17)) {
                        vd6.A09 = AnonymousClass7TG.A0l(r4);
                    } else if (C273654mx.A00(386).equals(A17)) {
                        vd6.A07 = (C16621UyH) EnumHelper.A00(r4.A1Q(), C16621UyH.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("attribution_user".equals(A17)) {
                        vd6.A01 = C16951VCd.parseFromJson(r4);
                    } else if (AnonymousClass000.A00(1132).equals(A17)) {
                        vd6.A02 = C16957VCj.parseFromJson(r4);
                    } else if (C66579MXk.A00(60).equals(A17)) {
                        vd6.A03 = O13.parseFromJson(r4);
                    } else if ("fan_club".equals(A17)) {
                        vd6.A04 = C16958VCk.parseFromJson(r4);
                    } else if (AnonymousClass000.A00(381).equals(A17)) {
                        vd6.A05 = C16959VCl.parseFromJson(r4);
                    } else if ("transparent_avatar_thumbnail".equals(A17)) {
                        vd6.A06 = C16960VCm.parseFromJson(r4);
                    } else if ("disabled_camera_formats".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C391249sa r0 = (C391249sa) EnumHelper.A00(r4.A1Q(), C391249sa.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (r0 != null) {
                                    arrayList.add(r0);
                                }
                            }
                        }
                        vd6.A0A = arrayList;
                    } else if ("effect_actions".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C16622UyI uyI = (C16622UyI) EnumHelper.A00(r4.A1Q(), C16622UyI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (uyI != null) {
                                    arrayList.add(uyI);
                                }
                            }
                        }
                        vd6.A0B = arrayList;
                    } else if (AnonymousClass000.A00(3055).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                C391259sb r02 = (C391259sb) EnumHelper.A00(r4.A1Q(), C391259sb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                                if (r02 != null) {
                                    arrayList.add(r02);
                                }
                            }
                        }
                        vd6.A0C = arrayList;
                    }
                    r4.A1P();
                }
                r4.A0z();
            }
            return vd6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
