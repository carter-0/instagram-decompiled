package X;

import java.io.IOException;

/* renamed from: X.CpP  reason: case insensitive filesystem */
public abstract class C45046CpP {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.CuL] */
    public static C45317CuL parseFromJson(16F r6) {
        String A0l;
        String A00;
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if (C273654mx.A00(45).equals(A17)) {
                    C45080Cpx.A00(AnonymousClass7TG.A0l(r6));
                } else {
                    if (C41845B3m.A1E(A17)) {
                        if (r6.A11() == 16L.A0G) {
                        }
                    } else if (!C41845B3m.A1L(A17)) {
                        if ("subtitle_destination".equals(A17)) {
                            A0l = AnonymousClass7TG.A0l(r6);
                        } else if ("product_items_feed".equals(A17)) {
                            obj.A01 = LJM.parseFromJson(r6);
                        } else if ("is_multi_merchant".equals(A17)) {
                            r6.A0d();
                        } else if ("cta_text".equals(A17)) {
                            if (r6.A11() == 16L.A0G) {
                            }
                        } else if ("cta_destination".equals(A17)) {
                            A0l = AnonymousClass7TG.A0l(r6);
                        } else if ("ig_funded_incentive".equals(A17)) {
                            obj.A00 = C63336KvJ.parseFromJson(r6);
                        }
                        Integer[] A002 = AnonymousClass05K.A00(4);
                        int length = A002.length;
                        int i = 0;
                        while (i < length) {
                            switch (A002[i].intValue()) {
                                case 1:
                                    A00 = "continue_shopping";
                                    break;
                                case 2:
                                    A00 = "ig_funded_incentive";
                                    break;
                                case 3:
                                    A00 = AnonymousClass000.A00(2749);
                                    break;
                                default:
                                    A00 = "storefront_relevance_sorted";
                                    break;
                            }
                            if (!A00.equals(A0l)) {
                                i++;
                            }
                        }
                    } else if (r6.A11() == 16L.A0G) {
                    }
                    r6.A1P();
                }
                r6.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
