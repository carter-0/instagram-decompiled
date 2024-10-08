package X;

import android.text.method.MovementMethod;

/* renamed from: X.GxL  reason: case insensitive filesystem */
public final class C53977GxL extends C243963aQ {
    public static final 2WU A07 = G9t.A16(C56963IJh.A00);
    public final MovementMethod A00;
    public final 2WX A01;
    public final 2Wd A02;
    public final 2Wd A03;
    public final Boolean A04;
    public final CharSequence A05;
    public final Integer A06;

    public C53977GxL(MovementMethod movementMethod, 2WX r3, 2Wd r4, 2Wd r5, Boolean bool, CharSequence charSequence, Integer num) {
        0qQ.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A03 = r4;
        this.A06 = num;
        this.A00 = movementMethod;
        this.A04 = bool;
        this.A02 = r5;
        this.A01 = r3;
    }

    public final C244523bK A0X(C244463bE r20) {
        Float f;
        Integer num;
        C244463bE r2 = r20;
        0qQ.A0B(r2, 0);
        2Wd r0 = this.A03;
        if (r0 != null) {
            f = Float.valueOf((float) C51969G9p.A09(r2, r0.A00));
        } else {
            f = null;
        }
        2Wd r02 = this.A02;
        if (r02 != null) {
            num = Integer.valueOf(C51969G9p.A09(r2, r02.A00));
        } else {
            num = null;
        }
        2WU r13 = A07;
        CharSequence charSequence = this.A05;
        Boolean bool = this.A04;
        return new C244523bK(this.A01, new AnonymousClass2WD(new AnonymousClass54S(r13, bool, charSequence, f, num, (Integer) null), C51969G9p.A0f(r2, r13, AnonymousClass54T.A00, new C58810Ixv(2, (Object) null, f, bool, charSequence, this.A06, this.A00, num))));
    }
}
