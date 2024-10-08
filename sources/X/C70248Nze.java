package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* renamed from: X.Nze  reason: case insensitive filesystem */
public abstract class C70248Nze {
    public static 1lX parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            1lX r1 = new 1lX();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C66581MXm.A1X(r4, A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A06 = str;
                } else if ("toggle_thread_mode_entry_point".equals(A0q)) {
                    r1.A00 = r4.A1D();
                } else if (DatePickerDialogModule.ARG_MODE.equals(A0q)) {
                    r1.A07 = r4.A0d();
                } else if ("ttl_sec".equals(A0q)) {
                    r1.A04 = AnonymousClass7TF.A0X(r4);
                } else if (AnonymousClass000.A00(5379).equals(A0q)) {
                    r1.A05 = AnonymousClass7TF.A0X(r4);
                } else if ("pre_mutation_disappearing_mode_metadata".equals(A0q)) {
                    r1.A03 = C272954lh.parseFromJson(r4);
                } else if ("optimistic_disappearing_mode_metadata".equals(A0q)) {
                    r1.A02 = C272954lh.parseFromJson(r4);
                } else {
                    C66670Mad.A01(r4, r1, A0q);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
