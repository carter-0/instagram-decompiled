package X;

import java.util.Arrays;

/* renamed from: X.Npy  reason: case insensitive filesystem */
public final class C69676Npy {
    public String A00;
    public byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69676Npy) {
                C69676Npy npy = (C69676Npy) obj;
                if (!0qQ.A0K(this.A00, npy.A00) || !0qQ.A0K(this.A01, npy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A0v("BackupDataFeatureEntry(feature=", this.A00, ", backupData=", Arrays.toString(this.A01), ')');
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A00) + Arrays.hashCode(this.A01);
    }
}
