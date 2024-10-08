package X;

public final class Sy3 implements C13829Ti0 {
    public final C9700RfJ A00;
    public final C13475Tb2 A01;
    public final C9704RfN A02;

    public Sy3(C9700RfJ rfJ, C13475Tb2 tb2, C9704RfN rfN) {
        this.A02 = rfN;
        this.A00 = rfJ;
        this.A01 = tb2;
    }

    public final int FOw(Object obj) {
        return ((C8424QuF) obj).zzc.hashCode();
    }

    public final C8424QuF FPU() {
        if (this.A01 instanceof C8424QuF) {
            return new C8423QuE();
        }
        C8420QuB quB = new C8420QuB(C8423QuE.zzb);
        C8420QuB.A00(quB);
        return quB.A00;
    }

    public final void FPf(Object obj) {
        SRM srm = ((C8424QuF) obj).zzc;
        if (srm.A01) {
            srm.A01 = false;
        }
        throw AnonymousClass7TE.A11("zzb");
    }

    public final void FPs(SFD sfd, Object obj, byte[] bArr, int i, int i2) {
        C8424QuF quF = (C8424QuF) obj;
        if (quF.zzc == SRM.A04) {
            quF.zzc = SRM.A00();
        }
        throw null;
    }

    public final boolean FPy(Object obj, Object obj2) {
        return C51970G9q.A1U(((C8424QuF) obj).zzc.equals(((C8424QuF) obj2).zzc) ? 1 : 0);
    }

    public final void FPm(Object obj, Object obj2) {
        C11162SCw.A00(obj, obj2);
    }
}
