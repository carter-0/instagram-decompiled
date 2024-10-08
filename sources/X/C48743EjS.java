package X;

import com.instagram.business.model.BoostGuidanceItemResponse;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EjS  reason: case insensitive filesystem */
public abstract class C48743EjS {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.EzY, java.lang.Object] */
    public static C49615EzY parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("num_steps_required".equals(A17)) {
                    obj.A01 = r4.A1D();
                } else if ("num_steps_left".equals(A17)) {
                    obj.A00 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("target_user_id".equals(A17)) {
                        obj.A02 = AnonymousClass7TG.A0l(r4);
                    } else if ("sub_items".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                F3Q parseFromJson = C48744EjT.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A04 = arrayList;
                    } else if ("boost_guidance_items".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                BoostGuidanceItemResponse parseFromJson2 = C48736EjL.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A03 = arrayList;
                    }
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
