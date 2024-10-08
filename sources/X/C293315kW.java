package X;

import java.io.IOException;

/* renamed from: X.5kW  reason: invalid class name and case insensitive filesystem */
public abstract class C293315kW {
    public static final void A00(16L r2, 16L r3) {
        if (r2 != r3) {
            0wb.A03("IGLegacyFragmentModelResponseParser", "Unexpected token");
            StringBuilder sb = new StringBuilder();
            sb.append("Expected token ");
            sb.append(r3);
            sb.append(" but found ");
            sb.append(r2);
            throw new IOException(sb.toString());
        }
    }
}
