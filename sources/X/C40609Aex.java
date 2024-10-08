package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Aex  reason: case insensitive filesystem */
public final class C40609Aex implements C2802350v {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C40609Aex aex = (C40609Aex) obj;
            if (!2Ob.A00(this.A02, aex.A02) || !2Ob.A00(this.A01, aex.A01) || !2Ob.A00(this.A00, aex.A00) || !2Ob.A00(this.A03, aex.A03)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A03});
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A10, A0C);
        return A0C;
    }
}
