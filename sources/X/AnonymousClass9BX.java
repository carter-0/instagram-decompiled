package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.9BX  reason: invalid class name */
public final class AnonymousClass9BX {
    public int A00 = 2;
    public long A01;
    public long A02;
    public boolean A03 = false;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final C374849Ba A08 = new C374849Ba();
    public final boolean A09;

    public final void A00(int i) {
        if (this.A03) {
            throw new RuntimeException(002.A0n("Event with action: ", " and id: ", " already ended", i, this.A04));
        } else if (i > 32767 || i < -32768) {
            throw new IllegalArgumentException("Action value must be between -32768 and 32767");
        } else {
            this.A00 = i;
            this.A03 = true;
            this.A01 = SystemClock.elapsedRealtime();
            this.A02 = SystemClock.elapsedRealtimeNanos();
        }
    }

    public final void A01(String str, long j) {
        this.A08.A01.put(str, Long.valueOf(j));
    }

    public final void A02(String str, String str2) {
        this.A08.A02.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event--->");
        sb.append("\n\tStartTime: ");
        long j = this.A06;
        sb.append(j);
        sb.append("\n\tEndTime: ");
        long j2 = this.A01;
        sb.append(j2);
        sb.append("\n\tDuration(Millis): ");
        sb.append(j2 - j);
        sb.append("\n\tDuration(Micros): ");
        sb.append((this.A02 - this.A07) / 1000);
        sb.append("\n\tId: ");
        sb.append(this.A04);
        sb.append("\n\tUniqueKey: ");
        sb.append(this.A05);
        sb.append("\n\tAction: ");
        sb.append(this.A00);
        sb.append("\n\t- StringParams:");
        C374849Ba r6 = this.A08;
        for (Map.Entry entry : r6.A02.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
        }
        sb.append("\n\t- DoubleParams:");
        for (Map.Entry entry2 : r6.A00.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry2.getKey());
            sb.append(": ");
            sb.append(entry2.getValue());
        }
        sb.append("\n\t- LongParams:");
        for (Map.Entry entry3 : r6.A01.entrySet()) {
            sb.append("\n\t\t");
            sb.append((String) entry3.getKey());
            sb.append(": ");
            sb.append(entry3.getValue());
        }
        return sb.toString();
    }

    public AnonymousClass9BX(Integer num, int i, boolean z) {
        int intValue;
        this.A04 = i;
        if (num == null) {
            intValue = System.identityHashCode(this);
        } else {
            intValue = num.intValue();
        }
        this.A05 = intValue;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.A01 = elapsedRealtime;
        this.A06 = elapsedRealtime;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A02 = elapsedRealtimeNanos;
        this.A07 = elapsedRealtimeNanos;
        this.A09 = z;
    }
}
