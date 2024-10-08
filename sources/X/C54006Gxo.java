package X;

import com.facebook.litho.annotations.Comparable;
import java.util.Timer;

/* renamed from: X.Gxo  reason: case insensitive filesystem */
public final class C54006Gxo extends 2TB {
    @Comparable(type = 3)
    public int A00;
    @Comparable(type = 13)
    public Timer A01;
    @Comparable(type = 3)
    public boolean A02;

    public final void A01(C294145lv r4) {
        Object[] objArr = r4.A01;
        switch (r4.A00) {
            case AnonymousClass972.MUTABLE_FLAG_MASK:
                this.A02 = AnonymousClass7TE.A1a(objArr[0]);
                return;
            case -2147483647:
                this.A00 = AnonymousClass7TE.A0M(objArr[0]);
                return;
            case -2147483646:
                this.A01 = (Timer) objArr[0];
                return;
            default:
                return;
        }
    }
}
