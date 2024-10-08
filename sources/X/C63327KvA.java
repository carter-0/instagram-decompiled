package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.KvA  reason: case insensitive filesystem */
public abstract class C63327KvA {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.7Qt, java.lang.Object] */
    public static C331377Qt parseFromJson(16F r5) {
        C273814nE r0;
        0qQ.A0B(r5, 0);
        try {
            ? obj = new Object();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("mediaType".equals(A17)) {
                    obj.A01 = LJI.A00(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("photo_path".equals(A17)) {
                        obj.A04 = AnonymousClass7TG.A0l(r5);
                    } else if ("video_path".equals(A17)) {
                        obj.A05 = AnonymousClass7TG.A0l(r5);
                    } else if ("aspectPostCrop".equals(A17)) {
                        obj.A00 = (float) r5.A0U();
                    } else if ("tap_models".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                C255783ui parseFromJson = C273934nQ.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("is_awaiting_burn_in".equals(A17)) {
                        obj.A08 = r5.A0d();
                    } else if ("view_mode".equals(A17)) {
                        obj.A06 = AnonymousClass7TG.A0l(r5);
                    } else if ("pending_media".equals(A17)) {
                        obj.A02 = AnonymousClass3Q1.parseFromJson(r5);
                    } else if ("pending_media_key".equals(A17)) {
                        obj.A03 = AnonymousClass7TG.A0l(r5);
                    }
                }
                r5.A0z();
            }
            AnonymousClass3Q2 r1 = obj.A02;
            if (r1 == null) {
                return obj;
            }
            if (obj.A03 == null) {
                obj.A03 = r1.A35;
            }
            if (obj.A07 == null) {
                obj.A07 = r1.A4b;
            }
            if (obj.A06 == null && (r0 = r1.A1R) != null) {
                obj.A06 = r0.A02;
            }
            obj.A02 = null;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
