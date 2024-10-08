package X;

/* renamed from: X.QuB  reason: case insensitive filesystem */
public final class C8420QuB extends C12842T9y {
    public C8424QuF A00;
    public final C8424QuF A01;

    public static void A00(C8420QuB quB) {
        C8424QuF quF = quB.A00;
        if ((quF.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            SH3.A02.A00(quF.getClass()).FPf(quF);
            quF.zzd &= Integer.MAX_VALUE;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C8420QuB quB = new C8420QuB(C8423QuE.zzb);
        A00(this);
        quB.A00 = this.A00;
        return quB;
    }

    public C8420QuB(C8424QuF quF) {
        this.A01 = quF;
        if ((quF.zzd & AnonymousClass972.MUTABLE_FLAG_MASK) != 0) {
            throw AnonymousClass7TE.A0w("Default instance must be immutable.");
        }
        this.A00 = (C8424QuF) quF.A02(4);
    }

    public C8420QuB() {
        this(C8423QuE.zzb);
    }
}
