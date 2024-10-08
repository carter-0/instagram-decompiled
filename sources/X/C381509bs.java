package X;

import java.util.Arrays;

/* renamed from: X.9bs  reason: invalid class name and case insensitive filesystem */
public final class C381509bs extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final byte[] A04;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.inbox.notes.persistence.NoteEntity");
                C381509bs r8 = (C381509bs) obj;
                if (!(0qQ.A0K(this.A03, r8.A03) && Arrays.equals(this.A04, r8.A04) && this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        return ((((((AnonymousClass7TE.A0O(this.A03) + Arrays.hashCode(this.A04)) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C381509bs(String str, byte[] bArr, int i, int i2, long j) {
        AnonymousClass7TG.A1O(str, bArr);
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
