package X;

import android.os.Parcelable;

/* renamed from: X.81C  reason: invalid class name */
public final class AnonymousClass81C {
    public AnonymousClass80Y A00;
    public final Integer A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public AnonymousClass81C(AnonymousClass80U r7, Integer num, C62320sa r9, C62320sa r10, C62320sa r11, boolean z) {
        AnonymousClass0eM r0;
        Object value;
        0qQ.A0B(r7, 1);
        this.A01 = num;
        AnonymousClass80Z r3 = ((AnonymousClass80T) r7).A00;
        this.A00 = r3.A00;
        0t0 A012 = AnonymousClass0eN.A01(new AnonymousClass9LJ(r9, 1));
        this.A04 = A012;
        0t0 A013 = AnonymousClass0eN.A01(new AnonymousClass9LJ(r10, 2));
        this.A03 = A013;
        0t0 A014 = AnonymousClass0eN.A01(new AnonymousClass9LJ(r11, 3));
        this.A02 = A014;
        if (!z) {
            if (2CC.A00(num)) {
                A013.getValue().hashCode();
                value = A014.getValue();
            } else {
                value = A012.getValue();
            }
            value.hashCode();
        }
        if (2CC.A00(num)) {
            int ordinal = this.A00.ordinal();
            if (ordinal == 0) {
                r0 = this.A03;
            } else if (ordinal == 1) {
                r0 = this.A02;
            } else {
                throw new RuntimeException();
            }
            ((AnonymousClass81E) r0.getValue()).A7M((Parcelable) null);
            r3.A01.add(new AnonymousClass81F(this));
        }
    }

    public final AnonymousClass81E A00() {
        AnonymousClass0eM r0;
        if (2CC.A00(this.A01)) {
            int ordinal = this.A00.ordinal();
            if (ordinal == 0) {
                r0 = this.A03;
            } else if (ordinal == 1) {
                r0 = this.A02;
            } else {
                throw new RuntimeException();
            }
        } else {
            r0 = this.A04;
        }
        return (AnonymousClass81E) r0.getValue();
    }
}
