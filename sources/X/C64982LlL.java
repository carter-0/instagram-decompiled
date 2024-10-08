package X;

import com.instagram.creation.fragment.AlbumEditFragment;

/* renamed from: X.LlL  reason: case insensitive filesystem */
public final class C64982LlL implements AnonymousClass8GH {
    public final int A00;
    public final Object A01;

    public C64982LlL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean D26() {
        switch (this.A00) {
            case 0:
                ((AlbumEditFragment) this.A01).A0K();
                return true;
            case 1:
                ((C356988Vz) ((K6C) this.A01).A03.getValue()).A00(C356928Vt.NONE);
                return true;
            case 2:
                K6C.A00((K6C) this.A01);
                return true;
            case 3:
                Dba.A1Q(this.A01);
                return true;
            default:
                K57.A02((K57) this.A01);
                return true;
        }
    }
}
