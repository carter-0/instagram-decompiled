package X;

/* renamed from: X.LiZ  reason: case insensitive filesystem */
public final class C64814LiZ implements C232262tL {
    public final int A00;
    public final CharSequence A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A06;
        if (str != null) {
            return str;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A03);
        A1A.append("::");
        A1A.append(this.A01);
        A1A.append("::");
        A1A.append(this.A02);
        A1A.append("::");
        return AnonymousClass7TF.A0i((Object) null, A1A);
    }

    public C64814LiZ(CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, String str, int i, boolean z) {
        this.A06 = str;
        this.A05 = num;
        this.A03 = num2;
        this.A01 = charSequence;
        this.A02 = num3;
        this.A07 = z;
        this.A00 = i;
        this.A04 = num4;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }

    public C64814LiZ() {
        this((CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 1, false);
    }
}
