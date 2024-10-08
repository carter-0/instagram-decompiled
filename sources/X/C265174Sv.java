package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Sv  reason: invalid class name and case insensitive filesystem */
public final class C265174Sv {
    public final int A00;
    public final C264874Rq A01;
    public final CopyOnWriteArrayList A02;
    public final long A03;

    public final void A02(C256683wB r16, AnonymousClass4Y0 r17, Object obj, int i, int i2, int i3, int i4, long j, long j2) {
        AnonymousClass4Y4 r2 = new AnonymousClass4Y4(r16, obj, i, i2, i3, A00(this, j), A00(this, j2));
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            AnonymousClass4Y4 r11 = r2;
            Util.A0E(r0.A00, new C21061XCn(r17, r11, this, r0.A01, i4));
        }
    }

    public final void A06(C256683wB r11, Object obj, int i, int i2, long j) {
        A0B(new AnonymousClass4Y4(r11, obj, 1, i, i2, A00(this, j), -9223372036854775807L));
    }

    public final void A09(AnonymousClass4Y0 r10, AnonymousClass4Y4 r11, IOException iOException, boolean z) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new XD1(r10, r11, this, r0.A01, iOException, z));
        }
    }

    public final void A0A(AnonymousClass4Y0 r10, AnonymousClass4Y4 r11, Object obj, Object obj2) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new AnonymousClass4YQ(r10, r11, this, r0.A01, obj, obj2));
        }
    }

    public final void A01(C256683wB r12, AnonymousClass4Y0 r13, IOException iOException, Object obj, int i, int i2, int i3, long j, long j2, boolean z) {
        A09(r13, new AnonymousClass4Y4(r12, obj, i, i2, i3, A00(this, j), A00(this, j2)), iOException, z);
    }

    public final void A03(C256683wB r11, AnonymousClass4Y0 r12, Object obj, int i, int i2, int i3, long j, long j2) {
        A07(r12, new AnonymousClass4Y4(r11, obj, i, i2, i3, A00(this, j), A00(this, j2)));
    }

    public final void A04(C256683wB r11, AnonymousClass4Y0 r12, Object obj, int i, int i2, int i3, long j, long j2) {
        A08(r12, new AnonymousClass4Y4(r11, obj, i, i2, i3, A00(this, j), A00(this, j2)));
    }

    public final void A05(C256683wB r11, AnonymousClass4Y0 r12, Object obj, Object obj2, Object obj3, int i, int i2, int i3, long j, long j2) {
        A0A(r12, new AnonymousClass4Y4(r11, obj, i, i2, i3, A00(this, j), A00(this, j2)), obj2, obj3);
    }

    public final void A07(AnonymousClass4Y0 r5, AnonymousClass4Y4 r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new C291235gp(r5, r6, this, r0.A01));
        }
    }

    public final void A08(AnonymousClass4Y0 r5, AnonymousClass4Y4 r6) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new AnonymousClass4Y5(r5, r6, this, r0.A01));
        }
    }

    public final void A0B(AnonymousClass4Y4 r5) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new C266254Yd(r5, this, r0.A01));
        }
    }

    public final void A0C(AnonymousClass4Y4 r6) {
        C264874Rq r4 = this.A01;
        r4.getClass();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new Y3Z(r6, r4, this, r0.A01));
        }
    }

    public final void A0D(C266054Xj r5) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass4T3 r0 = (AnonymousClass4T3) it.next();
            Util.A0E(r0.A00, new C14096Tpo(r0.A01, r5));
        }
    }

    public C265174Sv(C264874Rq r1, CopyOnWriteArrayList copyOnWriteArrayList, int i, long j) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r1;
        this.A03 = j;
    }

    public static long A00(C265174Sv r5, long j) {
        long A08 = Util.A08(j);
        if (A08 != -9223372036854775807L) {
            return r5.A03 + A08;
        }
        return -9223372036854775807L;
    }

    public C265174Sv() {
        this((C264874Rq) null, new CopyOnWriteArrayList(), 0, 0);
    }
}
