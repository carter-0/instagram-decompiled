package X;

import android.graphics.Rect;
import android.util.Log;
import java.util.List;

/* renamed from: X.9Ry  reason: invalid class name and case insensitive filesystem */
public final class C378979Ry extends C342747p6 {
    public C14252Tsa A00;
    public C378939Ru A01;

    public final void A02() {
        A04(this.A00.A00());
    }

    public final void A03() {
        C14252Tsa tsa = this.A00;
        Rect rect = C14254Tsc.A00;
        List list = (List) tsa.A01(C342687p0.A0w);
        int i = 4;
        if (!list.contains(4)) {
            i = 1;
            if (!list.contains(1)) {
                i = 6;
                if (!list.contains(6)) {
                    return;
                }
            }
        }
        this.A00.A01(C342717p3.A0D, Integer.valueOf(i));
    }

    public final void A04(C343147pk r8) {
        C378849Rl r6;
        boolean z;
        String str;
        this.A00 = new C342757p7();
        C378939Ru r5 = this.A01;
        try {
            r6 = (C378849Rl) r5.A02.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            r6 = null;
        }
        if (r8.A12) {
            z = r5.A01(C342717p3.A0D, Integer.valueOf(r8.A0C));
        } else {
            z = false;
        }
        if (r8.A0b) {
            z = A00(r5, C342717p3.A00, r8.A06, z);
        }
        if (r8.A0t) {
            z = A00(r5, C342717p3.A07, r8.A08, z);
        }
        if (r8.A0l) {
            z = A01(r5, C342717p3.A0P, r8.A0k, z);
        }
        if (r8.A0p) {
            z = A01(r5, C342717p3.A0R, r8.A0o, z);
        }
        if (r8.A10) {
            z = A00(r5, C342717p3.A0B, r8.A0B, z);
        }
        if (r8.A0w) {
            z = A00(r5, C342717p3.A09, r8.A0A, z);
        }
        if (r8.A11) {
            z |= r5.A01(C342717p3.A0C, r8.A0Z);
        }
        if (r8.A1J) {
            z = A00(r5, C342717p3.A0a, r8.A0E, z);
        }
        if (r8.A1K) {
            z = A00(r5, C342717p3.A0b, r8.A0F, z);
        }
        if (r8.A1L) {
            z |= r5.A01(C342717p3.A0c, r8.A0S);
        }
        if (r8.A1O) {
            z |= r5.A01(C342717p3.A0f, r8.A0a);
        }
        if (r8.A1S) {
            z = A00(r5, C342717p3.A0i, r8.A0I, z);
        }
        if (r8.A1T) {
            z |= r5.A01(C342717p3.A0k, r8.A0T);
        }
        if (r8.A1U) {
            z = A00(r5, C342717p3.A0m, r8.A0J, z);
        }
        if (r8.A1W) {
            z = A00(r5, C342717p3.A0o, r8.A0K, z);
        }
        if (r8.A1V) {
            z |= r5.A01(C342717p3.A0n, r8.A1o);
        }
        if (r8.A1X) {
            z |= r5.A01(C342717p3.A0q, r8.A0U);
        }
        if (r8.A1c) {
            z = A00(r5, C342717p3.A0s, r8.A0L, z);
        }
        if (r8.A1i) {
            z = A01(r5, C342717p3.A0Z, r8.A1h, z);
        }
        if (r8.A1g) {
            z |= r5.A01(C342717p3.A0y, r8.A0V);
        }
        if (r8.A1j) {
            z = A00(r5, C342717p3.A0z, r8.A0N, z);
        }
        if (r8.A1l) {
            z = A00(r5, C342717p3.A11, r8.A0O, z);
        }
        if (r8.A1F) {
            z = A01(r5, C342717p3.A0W, r8.A1E, z);
        }
        if (r8.A1b) {
            z = A01(r5, C342717p3.A0r, r8.A1a, z);
        }
        if (r8.A15) {
            z |= r5.A01(C342717p3.A0E, Double.valueOf(r8.A00));
        }
        if (r8.A16) {
            z |= r5.A01(C342717p3.A0F, Double.valueOf(r8.A01));
        }
        if (r8.A17) {
            z |= r5.A01(C342717p3.A0G, Double.valueOf(r8.A02));
        }
        if (r8.A18) {
            z |= r5.A01(C342717p3.A0H, r8.A0X);
        }
        if (r8.A19) {
            z |= r5.A01(C342717p3.A0I, Long.valueOf(r8.A0Q));
        }
        if (r8.A1R) {
            z = A00(r5, C342717p3.A0g, r8.A0H, z);
        }
        if (r8.A1f) {
            z = A00(r5, C342717p3.A0x, r8.A0M, z);
        }
        if (r8.A1I) {
            z = A00(r5, C342717p3.A0L, r8.A0D, z);
        }
        if (r8.A0v) {
            z |= r5.A01(C342717p3.A0l, (Object) null);
        }
        if (r8.A1H) {
            z = A01(r5, C342717p3.A0V, r8.A1G, z);
        }
        if (r8.A0h) {
            z = A01(r5, C342717p3.A0N, r8.A0g, z);
        }
        if (z) {
            int incrementAndGet = C378939Ru.A05.incrementAndGet();
            try {
                C340577lU.A00(34, incrementAndGet, (Object) null);
                if (C348137xw.A02(C348147xx.A01)) {
                    r8.A00();
                }
                r5.A01.setParameters(r5.A00);
                C340577lU.A00(35, incrementAndGet, (Object) null);
            } catch (RuntimeException e2) {
                C340577lU.A00(36, incrementAndGet, e2);
                if (r6 != null) {
                    str = r6.A03();
                } else {
                    str = "null";
                }
                throw new RuntimeException(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", new Object[]{str, r5.A02.A03(), r5.A00.flatten(), r8.A00()}), e2);
            }
        }
    }

    public static boolean A00(C378939Ru r1, C342727p4 r2, int i, boolean z) {
        return z | r1.A01(r2, Integer.valueOf(i));
    }

    public static boolean A01(C378939Ru r1, C342727p4 r2, boolean z, boolean z2) {
        return z2 | r1.A01(r2, Boolean.valueOf(z));
    }
}
