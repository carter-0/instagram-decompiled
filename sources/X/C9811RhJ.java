package X;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

/* renamed from: X.RhJ  reason: case insensitive filesystem */
public abstract class C9811RhJ {
    public static String A00(AnonymousClass6Tm r3) {
        String replaceAll = ((String) r3.A01()).replaceAll("(%\\d)", "$0\\$s");
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            A1C.addAll((List) r3.A02());
            try {
                return String.format(replaceAll, A1C.toArray());
            } catch (IllegalFormatException e) {
                0wb.A07("ig-action-string-printf-error", e);
                return replaceAll;
            }
        } catch (ClassCastException unused) {
            0wb.A03("bloks-print-invalid-args", "ig.action.string.Printf only supports string args");
            return replaceAll;
        }
    }
}
