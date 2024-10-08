package X;

import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9SM  reason: invalid class name */
public abstract class AnonymousClass9SM {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.8lx, java.lang.Object] */
    public static C364758lx parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                boolean z = true;
                if ("free_transform_edits".equals(A0q)) {
                    C370178vx parseFromJson = C370168vw.parseFromJson(r4);
                    if (parseFromJson == null) {
                        z = false;
                        parseFromJson = null;
                    }
                    obj.A04 = new C366668pT(z, parseFromJson);
                } else if ("filter_id".equals(A0q)) {
                    obj.A00 = r4.A1D();
                } else if ("post_capture_ar_effect".equals(A0q)) {
                    obj.A01 = AnonymousClass515.parseFromJson(r4);
                } else if ("visual_info".equals(A0q)) {
                    obj.A05 = C370208w0.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("transform_matrix_configs".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                TransformMatrixConfig parseFromJson2 = C266614a0.parseFromJson(r4);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        obj.A09 = arrayList;
                    } else if ("transform_matrix_config".equals(A0q)) {
                        obj.A03 = C266614a0.parseFromJson(r4);
                    } else if ("crop_info".equals(A0q)) {
                        obj.A02 = AnonymousClass9SO.parseFromJson(r4);
                    } else if ("should_render_drawables_in_unified_layer".equals(A0q)) {
                        obj.A0A = r4.A0d();
                    } else if ("ai_filter_colors".equals(A0q)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                Integer valueOf = Integer.valueOf(r4.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        obj.A08 = arrayList;
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
