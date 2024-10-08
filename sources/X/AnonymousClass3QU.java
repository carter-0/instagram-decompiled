package X;

import java.util.Arrays;

/* renamed from: X.3QU  reason: invalid class name */
public abstract class AnonymousClass3QU {
    public static final 28D A01(String str) {
        if (str == null) {
            return 28D.A5J;
        }
        try {
            return 28D.valueOf(str);
        } catch (Exception e) {
            String format = String.format("Failed to find matching InstagramCameraEntryPointTypes for %s", Arrays.copyOf(new Object[]{str}, 1));
            0qQ.A07(format);
            0wb.A06("InstagramCameraEntryPointTypesSerializer", format, e);
            return 28D.A5J;
        }
    }

    public static final 28D A00(long j) {
        for (28D r3 : 28D.values()) {
            Long valueOf = Long.valueOf(r3.A00);
            if (valueOf != null && j == valueOf.longValue()) {
                return r3;
            }
        }
        return 28D.A5J;
    }
}
