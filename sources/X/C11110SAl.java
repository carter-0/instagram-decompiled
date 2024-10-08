package X;

import android.os.Parcel;

/* renamed from: X.SAl  reason: case insensitive filesystem */
public abstract class C11110SAl {
    public static int A00(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static void A01(Parcel parcel, int i, int i2) {
        int A00 = A00(parcel, i);
        if (A00 != i2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(AnonymousClass000.A00(940));
            A1A.append(i2);
            A1A.append(" got ");
            A1A.append(A00);
            A1A.append(" (0x");
            A1A.append(Integer.toHexString(A00));
            throw new RuntimeException(AnonymousClass7TF.A0l(")", A1A));
        }
    }
}
