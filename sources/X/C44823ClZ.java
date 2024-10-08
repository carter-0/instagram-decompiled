package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.ClZ  reason: case insensitive filesystem */
public abstract class C44823ClZ {
    public static C45430CwA parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45430CwA cwA = new C45430CwA();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (!"is_demo".equals(A17)) {
                    ArrayList arrayList = null;
                    if ("label".equals(A17)) {
                        cwA.A05 = AnonymousClass7TG.A0l(r4);
                    } else {
                        if ("hide_label".equals(A17)) {
                            if (r4.A11() == 16L.A0G) {
                            }
                        } else if (C41845B3m.A1W(A17)) {
                            cwA.A07 = AnonymousClass7TG.A0l(r4);
                        } else if ("hide_reasons_v2".equals(A17)) {
                            if (r4.A11() == 16L.A0C) {
                                arrayList = AnonymousClass7TE.A1C();
                                while (r4.A1J() != 16L.A08) {
                                    C250263lA parseFromJson = C250253l9.parseFromJson(r4);
                                    if (parseFromJson != null) {
                                        arrayList.add(parseFromJson);
                                    }
                                }
                            }
                            cwA.A0B = arrayList;
                        } else if ("ad_title".equals(A17)) {
                            cwA.A03 = AnonymousClass7TG.A0l(r4);
                        } else if ("hide_flow_type".equals(A17)) {
                            r4.A1D();
                        } else if ("ad_id".equals(A17)) {
                            cwA.A02 = AnonymousClass7TG.A0l(r4);
                        } else if (!"show_ad_choices".equals(A17)) {
                            if ("ad_action".equals(A17)) {
                                if (r4.A11() == 16L.A0G) {
                                }
                            } else if ("link_text".equals(A17)) {
                                cwA.A06 = AnonymousClass7TG.A0l(r4);
                            } else if ("link_hint_text".equals(A17)) {
                                if (r4.A11() == 16L.A0G) {
                                }
                            } else if ("android_links".equals(A17)) {
                                if (r4.A11() == 16L.A0C) {
                                    arrayList = AnonymousClass7TE.A1C();
                                    while (r4.A1J() != 16L.A08) {
                                        C41846B3n.A1C(r4, arrayList);
                                    }
                                }
                                cwA.A08 = arrayList;
                            } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                                if (r4.A11() == 16L.A0C) {
                                    arrayList = AnonymousClass7TE.A1C();
                                    while (r4.A1J() != 16L.A08) {
                                        C41846B3n.A1D(r4, arrayList);
                                    }
                                }
                                cwA.A0A = arrayList;
                            } else if ("interaction_timestamp".equals(A17)) {
                                cwA.A04 = AnonymousClass7TG.A0l(r4);
                            } else if ("cookies".equals(A17)) {
                                if (r4.A11() == 16L.A0C) {
                                    arrayList = AnonymousClass7TE.A1C();
                                    while (r4.A1J() != 16L.A08) {
                                        AnonymousClass7TG.A1F(r4, arrayList);
                                    }
                                }
                                cwA.A09 = arrayList;
                            } else if ("client_gap_rules".equals(A17)) {
                                cwA.A01 = C250043ko.parseFromJson(r4);
                            } else if (AnonymousClass000.A00(3319).equals(A17)) {
                                cwA.A00 = C271234iU.parseFromJson(r4);
                            }
                        }
                        r4.A1P();
                    }
                    r4.A0z();
                }
                r4.A0d();
                r4.A0z();
            }
            return cwA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
