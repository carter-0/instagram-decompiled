package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* renamed from: X.WQv  reason: case insensitive filesystem */
public final class C19236WQv implements AnonymousClass1FD {
    public static final C19236WQv A00 = new C19236WQv();

    public final /* bridge */ /* synthetic */ Object invoke(16F r5) {
        String A1P;
        0qQ.A0B(r5, 0);
        C53387GnJ gnJ = new C53387GnJ();
        if (r5.A11() != 16L.A0D) {
            throw new IOException("JSON string for ProfilePicUrlInfo should start with a left brace");
        }
        while (r5.A1J() != 16L.A09) {
            String A17 = AnonymousClass7TE.A17(r5);
            if (A17 != null) {
                int hashCode = A17.hashCode();
                if (hashCode == -1221029593) {
                    if (A17.equals(IgReactMediaPickerNativeModule.HEIGHT)) {
                        gnJ.A00 = r5.A1D();
                    }
                    0KC.A0C("ProfilePicUrlInfoJsonHelper", C13988Tno.A0g(A17));
                } else if (hashCode != 116079) {
                    if (hashCode == 113126854 && A17.equals(IgReactMediaPickerNativeModule.WIDTH)) {
                        gnJ.A01 = r5.A1D();
                    }
                    0KC.A0C("ProfilePicUrlInfoJsonHelper", C13988Tno.A0g(A17));
                } else {
                    if (A17.equals("url")) {
                        if (!(r5.A11() == 16L.A0G || (A1P = r5.A1P()) == null)) {
                            gnJ.A02 = A1P;
                        }
                    }
                    0KC.A0C("ProfilePicUrlInfoJsonHelper", C13988Tno.A0g(A17));
                }
                r5.A0z();
            } else {
                throw C13988Tno.A0P();
            }
        }
        return gnJ;
    }
}
