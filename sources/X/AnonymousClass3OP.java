package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3OP  reason: invalid class name */
public abstract class AnonymousClass3OP {
    public static C239773Ic parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Integer num = null;
            ArrayList arrayList3 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("image_hints".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            ExtendedImageUrl parseFromJson = 16W.parseFromJson(r7);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            BFQ parseFromJson2 = CaC.parseFromJson(r7);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("version".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("video_hints".equals(A0q)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList3 = new ArrayList();
                        while (r7.A1J() != 16L.A08) {
                            1Xj A00 = 1Xj.A00(r7);
                            if (A00 != null) {
                                arrayList3.add(A00);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                r7.A0z();
            }
            return new C239773Ic(num, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
