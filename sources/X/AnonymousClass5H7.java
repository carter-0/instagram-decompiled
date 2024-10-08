package X;

import java.util.List;

/* renamed from: X.5H7  reason: invalid class name */
public final class AnonymousClass5H7 extends AnonymousClass0T0 {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public List A08;

    public AnonymousClass5H7() {
        this(511, (List) null, (List) null, (List) null);
    }

    public /* synthetic */ AnonymousClass5H7(int i, 0sn r9, 0sn r10, 0sn r11) {
        0sn r3;
        0sn r1;
        0sn r6 = null;
        0sn r2 = null;
        0sn r5 = null;
        0sn r4 = null;
        r9 = (i & 1) != 0 ? 0sn.A00 : r9;
        if ((i & 2) != 0) {
            r3 = 0sn.A00;
        } else {
            r3 = null;
        }
        r6 = (i & 4) != 0 ? 0sn.A00 : r6;
        r10 = (i & 8) != 0 ? 0sn.A00 : r10;
        r2 = (i & 16) != 0 ? 0sn.A00 : r2;
        r11 = (i & 32) != 0 ? 0sn.A00 : r11;
        if ((i & 64) != 0) {
            r1 = 0sn.A00;
        } else {
            r1 = null;
        }
        r5 = (i & 128) != 0 ? 0sn.A00 : r5;
        r4 = (i & 256) != 0 ? 0sn.A00 : r4;
        0qQ.A0B(r9, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(r10, 4);
        0qQ.A0B(r2, 5);
        0qQ.A0B(r11, 6);
        0qQ.A0B(r1, 7);
        0qQ.A0B(r5, 8);
        0qQ.A0B(r4, 9);
        this.A05 = r9;
        this.A07 = r3;
        this.A00 = r6;
        this.A06 = r10;
        this.A02 = r2;
        this.A08 = r11;
        this.A01 = r1;
        this.A03 = r5;
        this.A04 = r4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5H7) {
                AnonymousClass5H7 r5 = (AnonymousClass5H7) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((this.A05.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }
}
