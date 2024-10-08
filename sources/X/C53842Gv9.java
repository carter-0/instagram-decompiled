package X;

/* renamed from: X.Gv9  reason: case insensitive filesystem */
public final class C53842Gv9 extends C251343mx {
    public final JT9 A00;
    public final JTA A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final C62320sa A04;
    public final 2WX A05;
    public final C55667HlQ A06;
    public final String A07;
    public final String A08;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        Integer num;
        String AXo;
        String AXo2;
        0qQ.A0B(r13, 0);
        CharSequence charSequence = this.A02;
        CharSequence charSequence2 = this.A03;
        C62320sa r4 = this.A04;
        boolean z = true;
        if (r4 == null) {
            z = false;
        }
        String str = this.A08;
        if (str == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            JTA jta = this.A01;
            if (!(jta == null || (AXo2 = jta.AXo()) == null)) {
                A1A.append(AXo2);
            }
            if (charSequence != null) {
                A1A.append(charSequence.toString());
            }
            if (charSequence2 != null) {
                A1A.append(charSequence2.toString());
            }
            JT9 jt9 = this.A00;
            if (!(jt9 == null || (AXo = jt9.AXo()) == null)) {
                A1A.append(AXo);
            }
            str = DbT.A10(A1A);
        }
        C62320sa r11 = null;
        JTA jta2 = this.A01;
        JT9 jt92 = this.A00;
        if (jta2 == null || !(jta2 instanceof C57534IcM) || (charSequence == null ? charSequence2 == null : charSequence2 != null)) {
            num = null;
        } else {
            num = AnonymousClass05K.A01;
        }
        C57543IcV icV = new C57543IcV(this.A06, jta2, jt92, num);
        if (z) {
            r11 = r4;
        }
        String str2 = this.A07;
        AnonymousClass3XV r5 = this.A05;
        if (r5 == null) {
            r5 = 2WX.A02;
        }
        return new C53920GwQ(r5, icV, charSequence, charSequence2, str, str2, r11);
    }

    public C53842Gv9(2WX r1, JT9 jt9, JTA jta, C55667HlQ hlQ, CharSequence charSequence, CharSequence charSequence2, String str, String str2, C62320sa r9) {
        this.A02 = charSequence;
        this.A03 = charSequence2;
        this.A01 = jta;
        this.A06 = hlQ;
        this.A00 = jt9;
        this.A04 = r9;
        this.A08 = str;
        this.A07 = str2;
        this.A05 = r1;
    }
}
