package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* renamed from: X.ClS  reason: case insensitive filesystem */
public abstract class C44816ClS {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.ClR] */
    public static C44815ClR parseFromJson(16F r6) {
        int i;
        0qQ.A0B(r6, 0);
        try {
            ? obj = new Object();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                if (DatePickerDialogModule.ARG_MODE.equals(AnonymousClass7TE.A17(r6))) {
                    int A0i = r6.A0i();
                    Integer[] A00 = AnonymousClass05K.A00(3);
                    int length = A00.length;
                    int i2 = 0;
                    while (i2 < length) {
                        switch (A00[i2].intValue()) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != A0i) {
                            i2++;
                        }
                    }
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
