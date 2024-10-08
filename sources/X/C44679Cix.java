package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* renamed from: X.Cix  reason: case insensitive filesystem */
public abstract class C44679Cix {
    public static BB5 parseFromJson(16F r7) {
        int i;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if (DatePickerDialogModule.ARG_MODE.equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        i = 3;
                    } else {
                        i = r7.A1D();
                    }
                    num = Integer.valueOf(i);
                } else if (C41845B3m.A18(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                }
                r7.A0z();
            }
            if (num != null || !(r7 instanceof 0c9)) {
                return new BB5(num.intValue(), str);
            }
            AnonymousClass7TF.A1L(DatePickerDialogModule.ARG_MODE, r7, "DirectThreadGroupInviteLinkDelta");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
