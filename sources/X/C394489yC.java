package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9yC  reason: invalid class name and case insensitive filesystem */
public abstract class C394489yC {
    public static C366618pO parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C366618pO r0 = new C366618pO();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("sticker_index".equals(A17)) {
                    r0.A02 = r5.A1D();
                } else if ("sticker_color_index".equals(A17)) {
                    r0.A01 = r5.A1D();
                } else if ("sticker_color_id".equals(A17)) {
                    r0.A00 = r5.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("sticker_emphasis_status".equals(A17)) {
                        r0.A03 = A1S.A00(AnonymousClass7TG.A0l(r5));
                    } else if ("edit_recycler_view_models".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C381919cn parseFromJson = C394459y9.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A07 = arrayList;
                    } else if ("edit_recycler_view_center_index".equals(A17)) {
                        r0.A04 = AnonymousClass7TF.A0X(r5);
                    } else if ("tokens".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C15092UOk parseFromJson2 = C18191Vn5.parseFromJson(r5);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A08 = arrayList;
                    } else if ("editing_token_index".equals(A17)) {
                        r0.A05 = AnonymousClass7TF.A0X(r5);
                    } else if ("original_file_path".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r5);
                        0qQ.A0B(A0l, 0);
                        r0.A06 = A0l;
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
