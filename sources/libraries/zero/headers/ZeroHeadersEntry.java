package libraries.zero.headers;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255463uA;
import X.C51975G9x;
import X.C73537PeT;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class ZeroHeadersEntry {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;

    public final class Companion {
        public final C255463uA serializer() {
            return C73537PeT.A01;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ZeroHeadersEntry) {
                ZeroHeadersEntry zeroHeadersEntry = (ZeroHeadersEntry) obj;
                if (!(0qQ.A0K(this.A03, zeroHeadersEntry.A03) && 0qQ.A0K(this.A04, zeroHeadersEntry.A04) && this.A00 == zeroHeadersEntry.A00 && this.A01 == zeroHeadersEntry.A01 && this.A02 == zeroHeadersEntry.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ZeroHeadersEntry(String str, String str2, int i, int i2, int i3, int i4) {
        if (31 != (i & 31)) {
            VJ6.A00(C73537PeT.A00, i, 31);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03)) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ZeroHeadersEntry(encryptedMsisdn=");
        A1A.append(this.A03);
        A1A.append(", maskedMsisdn=");
        A1A.append(this.A04);
        A1A.append(", carrierId=");
        A1A.append(this.A00);
        A1A.append(", createdAt=");
        A1A.append(this.A01);
        A1A.append(", expiredAt=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
