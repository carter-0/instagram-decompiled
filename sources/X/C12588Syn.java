package X;

/* renamed from: X.Syn  reason: case insensitive filesystem */
public final class C12588Syn implements C13845TiL {
    public final SI3 A00;
    public final C13957TmK A01;
    public final SK0 A02;

    public C12588Syn(SI3 si3, C13957TmK tmK, SK0 sk0) {
        this.A02 = sk0;
        this.A00 = si3;
        this.A01 = tmK;
    }

    public static C12588Syn A00(SI3 si3, C13957TmK tmK, SK0 sk0) {
        return new C12588Syn(si3, tmK, sk0);
    }

    public final int FOw(Object obj) {
        SK0 sk0 = this.A02;
        return sk0.A01(sk0.A02(obj));
    }

    public final int FPC(Object obj) {
        return this.A02.A02(obj).hashCode();
    }

    public final C8563Qx1 FPb() {
        C13957TmK tmK = this.A01;
        if (tmK instanceof C8563Qx1) {
            return ((C8563Qx1) tmK).A0M();
        }
        return tmK.FQH().A03();
    }

    public final void FPl(Object obj) {
        this.A02.A06(obj);
        this.A00.A01();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FPr(Object obj, Object obj2) {
        SUi.A0F(this.A02, obj, obj2);
    }

    public final void FPz(SFE sfe, Object obj, byte[] bArr, int i, int i2) {
        C8563Qx1 qx1 = (C8563Qx1) obj;
        if (qx1.zzc == STV.A00()) {
            qx1.zzc = STV.A01();
        }
        throw null;
    }

    public final void FQ3(C13865Tim tim, Object obj) {
        this.A00.A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean FQ6(Object obj, Object obj2) {
        SK0 sk0 = this.A02;
        return C51970G9q.A1U(sk0.A02(obj).equals(sk0.A02(obj2)) ? 1 : 0);
    }

    public final boolean FQA(Object obj) {
        this.A00.A00();
        throw AnonymousClass00P.createAndThrow();
    }
}
