package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class LH8 {
    public static C61283K0u parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                ArrayList arrayList = null;
                if ("cta_type".equals(A17)) {
                    TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType = (TextPostAppBottomSheetCTAType) TextPostAppBottomSheetCTAType.A01.get(AnonymousClass7TG.A0l(r7));
                    if (textPostAppBottomSheetCTAType == null) {
                        textPostAppBottomSheetCTAType = TextPostAppBottomSheetCTAType.UNRECOGNIZED;
                    }
                    r1.A00 = textPostAppBottomSheetCTAType;
                } else if (C273654mx.A00(280).equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            C41846B3n.A1E(r7, arrayList);
                        }
                    }
                    r1.A05 = arrayList;
                } else if (AnonymousClass000.A00(4833).equals(A17)) {
                    r1.A02 = AnonymousClass7TF.A0S(r7);
                } else if (C273654mx.A00(329).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r7);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r7);
                } else {
                    1XY.A01(r7, r1, A17);
                }
                r7.A0z();
            }
            TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType2 = r1.A00;
            0qQ.A0A(textPostAppBottomSheetCTAType2);
            List list = r1.A05;
            0qQ.A0A(list);
            boolean A14 = C41845B3m.A14(r1.A02);
            String str = r1.A03;
            String str2 = r1.A04;
            0qQ.A0A(str2);
            r1.A01 = new C61125Jxb(textPostAppBottomSheetCTAType2, str, str2, list, A14);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
