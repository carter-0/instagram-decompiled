package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4Px  reason: invalid class name and case insensitive filesystem */
public final class C264444Px {
    public static final C264444Px A04 = new C264444Px(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C264444Px)) {
            return false;
        }
        C264444Px r4 = (C264444Px) obj;
        return this.A03 == r4.A03 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(2104));
        sb.append(this.A03);
        sb.append(AnonymousClass000.A00(398));
        sb.append(this.A01);
        sb.append(AnonymousClass000.A00(2012));
        sb.append(this.A02);
        sb.append(']');
        return sb.toString();
    }

    public C264444Px(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (Util.A0G(i3)) {
            i4 = Util.A03(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }
}
