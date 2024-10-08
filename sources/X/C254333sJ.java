package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.3sJ  reason: invalid class name and case insensitive filesystem */
public final class C254333sJ {
    public long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C254333sJ)) {
            return false;
        }
        C254333sJ r7 = (C254333sJ) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.A01;
        if (j != -1) {
            String format = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(j));
            0qQ.A07(format);
            sb.append(002.A0R("Enter: ", format));
        }
        long j2 = this.A00;
        if (j2 != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", Exit: ");
            String format2 = new SimpleDateFormat("mm:ss.SSS", Locale.US).format(Long.valueOf(j2));
            0qQ.A07(format2);
            sb2.append(format2);
            sb2.append(", Duration: ");
            sb2.append(((double) (this.A00 - j)) / 1000.0d);
            sb2.append(" secs");
            sb.append(sb2.toString());
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public C254333sJ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }
}
