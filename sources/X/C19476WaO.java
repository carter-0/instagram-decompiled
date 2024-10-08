package X;

import java.util.List;

/* renamed from: X.WaO  reason: case insensitive filesystem */
public final class C19476WaO implements C2802350v {
    public static final C14272Tsv A03;
    public static final int[] A04;
    public BGi A00;
    public final C14272Tsv A01;
    public final boolean A02;

    public C19476WaO(BGi bGi, C14272Tsv tsv) {
        0qQ.A0B(tsv, 2);
        this.A00 = bGi;
        this.A01 = tsv;
        this.A02 = AnonymousClass7TF.A1V(bGi.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C19476WaO)) {
                return false;
            }
            C19476WaO waO = (C19476WaO) obj;
            if (!0qQ.A0K(this.A00, waO.A00) || this.A01 != waO.A01) {
                return false;
            }
        }
        return true;
    }

    static {
        C14272Tsv tsv = (C14272Tsv) DbZ.A0g(C17164VKt.A00, 0);
        A03 = tsv;
        A04 = C14276Tsz.A02(tsv);
    }

    public final long A00() {
        return DbY.A04(this.A00.A04);
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A1F;
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A0f, A0C);
        return A0C;
    }
}
