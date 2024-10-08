package X;

import java.util.Arrays;

/* renamed from: X.3kg  reason: invalid class name and case insensitive filesystem */
public final class C249973kg extends AnonymousClass0T0 {
    public final String A00;
    public final byte[] A01;

    public C249973kg(String str, byte[] bArr) {
        0qQ.A0B(str, 1);
        0qQ.A0B(bArr, 2);
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C249973kg) {
                C249973kg r5 = (C249973kg) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        return 002.A0v("SponsoredPoolItemEntity(surface=", this.A00, AnonymousClass000.A00(399), Arrays.toString(this.A01), ')');
    }
}
