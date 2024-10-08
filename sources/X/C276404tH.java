package X;

import java.io.IOException;

/* renamed from: X.4tH  reason: invalid class name and case insensitive filesystem */
public abstract class C276404tH {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.4hR, java.lang.Object] */
    public static final C270864hR A00(16F r6) {
        long currentMonotonicTimestamp = 02m.A0p.currentMonotonicTimestamp();
        C276464tN A00 = C276454tM.A00((C276484tP) null, new C276414tI(r6));
        0qQ.A07(A00);
        C246643ew r3 = A00.A00;
        if (r3 != null) {
            ? obj = new Object();
            long currentMonotonicTimestamp2 = 02m.A0p.currentMonotonicTimestamp();
            obj.A02 = r3;
            obj.A01 = currentMonotonicTimestamp;
            obj.A00 = currentMonotonicTimestamp2;
            return obj;
        }
        throw new IOException("failed to parse bloks payload");
    }

    public static final void A02(17Z r2, C270864hR r3) {
        if (r3 instanceof R9S) {
            R9S.A01.A01(r2, ((R9S) r3).A00);
        } else {
            0wb.A03("bloks_serialize", "BloksDataAdapter does not support serialization. Use SerializableBloksAdapter instead");
        }
    }

    public static final C270864hR A01(String str) {
        try {
            if (11Z.A07()) {
                0wb.A01(0kg.A0A, "BloksDataAdapter", "BloksDataAdapter is being parsed on the UI thread, move this to a background thread");
            }
            return A00(16P.A00(str));
        } catch (IOException e) {
            0wb.A01(0kg.A0A, "BloksDataAdapter.fromPayloadString", 002.A0R("failed to parse bloks payload ", e.getMessage()));
            return null;
        }
    }
}
