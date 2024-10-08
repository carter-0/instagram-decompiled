package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.4v1  reason: invalid class name */
public final class AnonymousClass4v1 {
    public static final Random A07 = new Random();
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public int[] A05;
    public String A06;

    public static 0xI A00(AnonymousClass4v1 r9, Integer num, long j) {
        long j2;
        if (r9.A05 == null) {
            return null;
        }
        long j3 = r9.A04;
        if (j > j3) {
            j2 = Math.min(64, (j - r9.A03) + 1);
        } else {
            j2 = (j3 - r9.A03) + 1;
        }
        "time_spent_bit_array".getClass();
        0xI A012 = 0xI.A01("time_spent_bit_array", (String) null);
        A012.A0C("tos_id", r9.A06);
        A012.A0B(TraceFieldType.StartTime, Long.valueOf(r9.A03));
        A012.A0C("tos_array", Arrays.toString(r9.A05));
        A012.A08(Integer.valueOf((int) j2), "tos_len");
        A012.A08(Integer.valueOf(r9.A02), "tos_seq");
        A012.A08(Integer.valueOf(r9.A01), "tos_cum");
        if (num == AnonymousClass05K.A0N) {
            A012.A0C("trigger", "clock_change");
        }
        return A012;
    }

    public AnonymousClass4v1() {
        this.A00 = 1;
        this.A00 = (int) Math.ceil(2.0d);
        this.A06 = Integer.toString(Math.abs(A07.nextInt()), 36);
        this.A02 = -1;
        this.A01 = 0;
        this.A05 = null;
    }
}
