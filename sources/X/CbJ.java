package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CbJ {
    public static C42056BFj parseFromJson(16F r12) {
        String A00;
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            while (true) {
                16L A1J = r12.A1J();
                16L r10 = 16L.A09;
                A00 = AnonymousClass000.A00(4686);
                if (A1J == r10) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r12);
                if (A00.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("parameter_name".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("values".equals(A17)) {
                    if (r12.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r12.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r12, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r12.A0z();
            }
            if (str == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A00, r12, "ParameterPickerImpl");
            } else if (str2 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L("parameter_name", r12, "ParameterPickerImpl");
            } else if (str3 == null && (r12 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r12, "ParameterPickerImpl");
            } else if (arrayList != null || !(r12 instanceof 0c9)) {
                return new C42056BFj(str, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L("values", r12, "ParameterPickerImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
