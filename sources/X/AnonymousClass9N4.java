package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.9N4  reason: invalid class name */
public final class AnonymousClass9N4 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N4(C299665vd r2, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = r2;
        if (1 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((C299635va) this.A01).CqE(this.A02, this.A03);
                break;
            case 1:
                ((C299665vd) this.A01).DBO(this.A02, this.A03);
                break;
            case 2:
                ((C299665vd) this.A01).DZ5(this.A03, this.A02);
                break;
            default:
                Object value = AnonymousClass0eN.A00(0eO.A02, new C51761G0d((Fragment) this.A01, this.A02)).getValue();
                if (value != null) {
                    return value;
                }
                throw new IllegalStateException(002.A0R(AnonymousClass000.A00(2103), this.A03));
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N4(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
