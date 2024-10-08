package X;

public final class WLE implements X2v {
    public final /* bridge */ /* synthetic */ Object EB6(Object obj, Object obj2) {
        C17188VLs vLs;
        long j;
        boolean z;
        boolean z2;
        C18475VsR vsR = (C18475VsR) obj;
        V33 v33 = (V33) obj2;
        if (v33 instanceof C15222UVz) {
            j = vsR.A00;
            z = vsR.A02;
            z2 = vsR.A03;
            vLs = ((C15222UVz) v33).A00;
        } else if (v33 instanceof UVU) {
            UVU uvu = (UVU) v33;
            vLs = vsR.A01;
            j = uvu.A00;
            z = uvu.A00;
            z2 = uvu.A01;
        } else if (!(v33 instanceof UVL)) {
            return vsR;
        } else {
            vLs = null;
            j = 0;
            z = true;
            z2 = false;
        }
        return new C18475VsR(vLs, j, z, z2);
    }
}
