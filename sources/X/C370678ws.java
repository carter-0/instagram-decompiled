package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8ws  reason: invalid class name and case insensitive filesystem */
public abstract class C370678ws {
    public static AnonymousClass9JL parseFromJson(16F r14) {
        String A00;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C381549bw r8 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                16L A1J = r14.A1J();
                16L r2 = 16L.A09;
                A00 = AnonymousClass000.A00(289);
                if (A1J == r2) {
                    break;
                }
                String A0q = r14.A0q();
                r14.A1J();
                if ("background_images".equals(A0q)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r14.A1J() != 16L.A08) {
                            ExtendedImageUrl parseFromJson = 16W.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("background_video".equals(A0q)) {
                    r8 = C393629wk.parseFromJson(r14);
                } else if (A00.equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                } else if ("one_thousand_twenty_four".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("seven_hundred_twenty".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("two_thousand_forty_eight".equals(A0q)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            if (str == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00(A00, "ThemeBackgroundAsset");
            } else if (str2 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("one_thousand_twenty_four", "ThemeBackgroundAsset");
            } else if (str3 == null && (r14 instanceof 0c9)) {
                ((0c9) r14).A03.A00("seven_hundred_twenty", "ThemeBackgroundAsset");
            } else if (str4 != null || !(r14 instanceof 0c9)) {
                return new AnonymousClass9JL(r8, str, str2, str3, str4, (List) arrayList);
            } else {
                ((0c9) r14).A03.A00("two_thousand_forty_eight", "ThemeBackgroundAsset");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
