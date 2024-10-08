package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.487  reason: invalid class name */
public final class AnonymousClass487 extends AnonymousClass488 implements AnonymousClass483 {
    public String A00;
    public String A01;
    public boolean A02;
    public final C250863mB A03;
    public final AnonymousClass40P A04;
    public final AnonymousClass486 A05;
    public final AnonymousClass40Y A06;
    public final AnonymousClass40R A07;
    public final AnonymousClass483[] A08;

    public AnonymousClass487(C250863mB r2, AnonymousClass486 r3, AnonymousClass40Y r4, AnonymousClass483[] r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        0qQ.A0B(r4, 3);
        this.A05 = r3;
        this.A03 = r2;
        this.A06 = r4;
        this.A08 = r5;
        this.A07 = r2.A02;
        this.A04 = r2.A00;
        int ordinal = r4.ordinal();
        if (r5 != null) {
            r5[ordinal] = this;
        }
    }

    public final AnonymousClass484 ADJ(SerialDescriptor serialDescriptor) {
        AnonymousClass483 r0;
        0qQ.A0B(serialDescriptor, 0);
        C250863mB r4 = this.A03;
        AnonymousClass40Y A012 = C2590640g.A01(serialDescriptor, r4);
        char c = A012.A00;
        AnonymousClass486 r2 = this.A05;
        r2.A01(c);
        boolean z = r2 instanceof AnonymousClass489;
        if (z) {
            AnonymousClass489 r1 = (AnonymousClass489) r2;
            r1.A00 = true;
            r1.A00++;
        } else {
            r2.A00 = true;
        }
        String str = this.A00;
        if (str != null) {
            String str2 = this.A01;
            if (str2 == null) {
                str2 = serialDescriptor.BsV();
            }
            r2.A00();
            ASB(str);
            r2.A01(':');
            if (z) {
                r2.A01(' ');
            }
            ASB(str2);
            this.A00 = null;
            this.A01 = null;
        }
        if (this.A06 == A012) {
            return this;
        }
        AnonymousClass483[] r12 = this.A08;
        if (r12 == null || (r0 = r12[A012.ordinal()]) == null) {
            return new AnonymousClass487(r4, r2, A012, r12);
        }
        return r0;
    }

    public final void AS7(Object obj, C255473uB r3, SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        0qQ.A0B(r3, 2);
        if (obj != null || this.A04.A0A) {
            super.AS7(obj, r3, serialDescriptor, i);
        }
    }

    public final void AS6() {
        this.A05.A03("null");
    }

    public final void AST(SerialDescriptor serialDescriptor) {
        char c = this.A06.A01;
        if (c != 0) {
            AnonymousClass486 r2 = this.A05;
            if (r2 instanceof AnonymousClass489) {
                AnonymousClass489 r1 = (AnonymousClass489) r2;
                r1.A00--;
                if (!r2.A00) {
                    r2.A00();
                    r2.A01(c);
                }
            }
            r2.A00 = false;
            r2.A01(c);
        }
    }

    public final AnonymousClass40R Bsb() {
        return this.A07;
    }

    public final boolean EsA(SerialDescriptor serialDescriptor, int i) {
        return this.A04.A09;
    }
}
