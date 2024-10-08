package X;

import java.util.Arrays;

/* renamed from: X.4GW  reason: invalid class name */
public final class AnonymousClass4GW {
    public final int A00;
    public final int A01;
    public final long A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass4GW)) {
            return false;
        }
        return 0qQ.A0K(((AnonymousClass4GW) obj).A04, this.A04);
    }

    public final int hashCode() {
        return this.A03;
    }

    public final String toString() {
        return this.A04;
    }

    public AnonymousClass4GW(int i) {
        this.A02 = 0;
        this.A00 = -1;
        this.A01 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        sb.append(':');
        sb.append(-1);
        sb.append(':');
        sb.append(i);
        this.A04 = sb.toString();
        this.A03 = (int) System.currentTimeMillis();
    }

    public AnonymousClass4GW(long j, int i, int i2) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(':');
        sb.append(i);
        sb.append(':');
        sb.append(i2);
        this.A04 = sb.toString();
        this.A03 = Arrays.hashCode(new Object[]{Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }
}
