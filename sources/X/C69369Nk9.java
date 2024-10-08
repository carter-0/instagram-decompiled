package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Nk9  reason: case insensitive filesystem */
public enum C69369Nk9 {
    ONE_DAY(2131954922, 1, (int) r0.toSeconds(1)),
    THREE_DAYS(2131954923, 3, (int) r0.toSeconds(3)),
    FIVE_DAYS(2131954924, 5, (int) r0.toSeconds(5)),
    SEVEN_DAYS(2131954926, 7, (int) r0.toSeconds(7)),
    ONE_MIN(2131954921, 0, (int) r7.toSeconds(1)),
    FIVE_MIN(2131954925, 0, (int) r7.toSeconds(5)),
    ONE_HOUR(2131954920, 0, (int) TimeUnit.HOURS.toSeconds(1));
    
    public final int A00;
    public final int A01;
    public final int A02;

    /* access modifiers changed from: public */
    static {
        C69369Nk9[] nk9Arr;
        A03 = 0oU.A00(nk9Arr);
    }

    /* access modifiers changed from: public */
    C69369Nk9(int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
