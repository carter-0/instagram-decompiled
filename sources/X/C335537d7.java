package X;

import java.util.UUID;

/* renamed from: X.7d7  reason: invalid class name and case insensitive filesystem */
public final class C335537d7 extends AnonymousClass0T0 implements C334027aY {
    public final long A00;
    public final String A01;
    public final UUID A02;
    public final boolean A03;

    public C335537d7(String str, UUID uuid, long j, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(uuid, 4);
        this.A01 = str;
        this.A03 = z;
        this.A00 = j;
        this.A02 = uuid;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C335537d7) {
                C335537d7 r8 = (C335537d7) obj;
                if (!0qQ.A0K(this.A01, r8.A01) || this.A03 != r8.A03 || this.A00 != r8.A00 || !0qQ.A0K(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        long j = this.A00;
        return ((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode();
    }
}
