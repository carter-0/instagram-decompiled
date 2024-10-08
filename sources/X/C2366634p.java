package X;

import java.util.Arrays;

/* renamed from: X.34p  reason: invalid class name and case insensitive filesystem */
public final class C2366634p {
    public Integer A00 = AnonymousClass05K.A00;
    public final C252423p5 A01;
    public final String A02;

    public C2366634p(C252423p5 r2, String str) {
        0qQ.A0B(str, 2);
        this.A01 = r2;
        this.A02 = str;
    }

    public final void A04() {
        A08((String) null);
    }

    private final boolean A00(Integer num, Integer num2) {
        Integer num3 = this.A00;
        if (num3 != AnonymousClass05K.A0C) {
            C252423p5 r1 = this.A01;
            if (r1.A01) {
                if (num3 != num) {
                    String format = String.format("%s.%s tries to move from state %s to %s while the current state is %s", Arrays.copyOf(new Object[]{r1.getClass().getSimpleName(), this.A02, C320046rg.A00(num), C320046rg.A00(num2), C320046rg.A00(num3)}, 5));
                    0qQ.A07(format);
                    0wb.A03("NavigationPerfComponent", format);
                } else {
                    this.A00 = num2;
                    return true;
                }
            }
        }
        return false;
    }

    public final void A01() {
        if (A00(AnonymousClass05K.A01, AnonymousClass05K.A0C)) {
            this.A01.A0D(this, (String) null, true);
        }
    }

    public final void A02() {
        Integer num = this.A00;
        if (num != AnonymousClass05K.A01 && num != AnonymousClass05K.A00) {
            String format = String.format("%s.%s component prefetched attempt while the current state is %s", Arrays.copyOf(new Object[]{this.A01.getClass().getSimpleName(), this.A02, C320046rg.A00(num)}, 3));
            0qQ.A07(format);
            0wb.A03("NavigationPerfComponent", format);
        } else if (A00(num, AnonymousClass05K.A0C)) {
            C252423p5 r5 = this.A01;
            if (r5.A01) {
                r5.A05.markerPoint(r5.A0L(), r5.A00, 002.A0R(this.A02, "_prefetched"));
                r5.A08.remove(this);
                r5.A03();
            }
            C249813kP.A00.A01(r5.A0L(), 002.A0R(this.A02, "_prefetched"));
        }
    }

    public final void A03() {
        Integer num = AnonymousClass05K.A00;
        Integer num2 = AnonymousClass05K.A0C;
        if (A00(num, num2)) {
            this.A00 = num2;
            C252423p5 r5 = this.A01;
            if (r5.A01) {
                r5.A05.markerPoint(r5.A0L(), r5.A00, 002.A0R(this.A02, "_skipped"));
                r5.A08.remove(this);
                r5.A03();
            }
            C249813kP.A00.A01(r5.A0L(), 002.A0R(this.A02, "_skipped"));
        }
    }

    public final void A05() {
        Integer num = AnonymousClass05K.A01;
        Integer num2 = AnonymousClass05K.A0C;
        if (A00(num, num2)) {
            this.A00 = num2;
            C252423p5 r5 = this.A01;
            if (r5.A01) {
                r5.A05.markerPoint(r5.A0L(), r5.A00, 002.A0R(this.A02, "_end"));
                r5.A08.remove(this);
                r5.A03();
            }
            C249813kP.A00.A01(r5.A0L(), 002.A0R(this.A02, "_end"));
        }
    }

    public final void A06(long j) {
        if (A00(AnonymousClass05K.A00, AnonymousClass05K.A01)) {
            this.A01.A0C(this, (String) null, j);
        }
    }

    public final void A07(String str) {
        if (A00(AnonymousClass05K.A01, AnonymousClass05K.A0C)) {
            this.A01.A0D(this, str, true);
        }
    }

    public final void A08(String str) {
        if (A00(AnonymousClass05K.A00, AnonymousClass05K.A01)) {
            this.A01.A0C(this, str, -1);
        }
    }
}
