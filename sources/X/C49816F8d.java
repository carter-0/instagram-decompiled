package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F8d  reason: case insensitive filesystem */
public final class C49816F8d {
    public static DwJ parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("ctrl_type".equals(A17)) {
                    r1.A03 = C49245Ero.A00(r4.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if ("report_status".equals(A17)) {
                        r1.A09 = AnonymousClass7TG.A0l(r4);
                    } else if ("reported_content_id".equals(A17)) {
                        r1.A05 = AnonymousClass7TF.A0Z(r4);
                    } else if (TraceFieldType.ContentType.equals(A17)) {
                        r1.A07 = AnonymousClass7TG.A0l(r4);
                    } else if ("report_type".equals(A17)) {
                        r1.A0A = AnonymousClass7TG.A0l(r4);
                    } else {
                        if (!"reporter_id".equals(A17)) {
                            if ("report_status_type".equals(A17)) {
                                if (r4.A11() == 16L.A0G) {
                                }
                            } else if ("responsible_id".equals(A17)) {
                                r1.A06 = AnonymousClass7TF.A0Z(r4);
                            } else if (C66579MXk.A00(409).equals(A17)) {
                                if (r4.A11() == 16L.A0G) {
                                }
                            } else if (!AnonymousClass000.A00(4665).equals(A17)) {
                                if ("ticket_id".equals(A17)) {
                                    r1.A0C = AnonymousClass7TG.A0l(r4);
                                } else if ("show_self_remediation_options".equals(A17)) {
                                    r1.A0H = r4.A0d();
                                } else if ("show_community_guidelines".equals(A17)) {
                                    r1.A0G = r4.A0d();
                                } else if ("can_appeal".equals(A17)) {
                                    r1.A0E = r4.A0d();
                                } else if ("events".equals(A17)) {
                                    if (r4.A11() == 16L.A0C) {
                                        arrayList = AnonymousClass7TE.A1C();
                                        while (r4.A1J() != 16L.A08) {
                                            C49568Eyd parseFromJson = C49248Err.parseFromJson(r4);
                                            if (parseFromJson != null) {
                                                arrayList.add(parseFromJson);
                                            }
                                        }
                                    }
                                    r1.A0D = arrayList;
                                } else if ("appeal_info".equals(A17)) {
                                    r1.A02 = C49249Ers.parseFromJson(r4);
                                } else if ("ob_reference_id".equals(A17)) {
                                    r1.A08 = AnonymousClass7TG.A0l(r4);
                                } else if ("ob_expiration_time".equals(A17)) {
                                    r1.A04 = AnonymousClass7TF.A0Z(r4);
                                } else if ("ob_is_expired".equals(A17)) {
                                    r1.A0F = r4.A0d();
                                } else if ("url_button_info".equals(A17)) {
                                    r1.A01 = C49247Erq.parseFromJson(r4);
                                } else if ("ob_bottom_sheet_info".equals(A17)) {
                                    r1.A00 = C49246Erp.parseFromJson(r4);
                                } else if ("sd_reporter_tag".equals(A17)) {
                                    r1.A0B = AnonymousClass7TG.A0l(r4);
                                } else {
                                    1XY.A01(r4, r1, A17);
                                }
                            }
                            r4.A1P();
                        }
                        r4.A0y();
                    }
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
