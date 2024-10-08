package X;

import java.util.Map;

/* renamed from: X.5FW  reason: invalid class name */
public final class AnonymousClass5FW {
    public final AnonymousClass5FV A00(int i) {
        AnonymousClass5FV r0 = (AnonymousClass5FV) ((Map) AnonymousClass5FV.A04.getValue()).get(Integer.valueOf(i));
        if (r0 == null) {
            return AnonymousClass5FV.Unsupported;
        }
        return r0;
    }
}
