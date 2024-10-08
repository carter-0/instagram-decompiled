package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.ui.text.TextColorScheme;
import java.io.IOException;
import java.util.ArrayList;

public abstract class A1Q {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.ui.text.TextColorScheme, java.lang.Object] */
    public static TextColorScheme parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("text_colors".equals(A17)) {
                    obj.A02 = r4.A1D();
                } else if ("hint_text_colors".equals(A17)) {
                    obj.A04 = ABL.parseFromJson(r4);
                } else if ("emphasis_color".equals(A17)) {
                    obj.A01 = r4.A1D();
                } else {
                    ArrayList arrayList = null;
                    if (AnonymousClass000.A00(260).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                Integer A0X = AnonymousClass7TF.A0X(r4);
                                if (A0X != null) {
                                    arrayList.add(A0X);
                                }
                            }
                        }
                        obj.A07 = arrayList;
                    } else if ("background_gradient_enum".equals(A17)) {
                        obj.A05 = ABK.A00(r4.A1P());
                    } else if ("background_opacity".equals(A17)) {
                        obj.A00 = (float) r4.A0U();
                    } else if ("orientation".equals(A17)) {
                        obj.A03 = GradientDrawable.Orientation.valueOf(r4.A1Q());
                    } else if (AnonymousClass000.A00(520).equals(A17)) {
                        obj.A06 = AnonymousClass7TG.A0l(r4);
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
