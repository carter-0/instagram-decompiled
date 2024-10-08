package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.SjC  reason: case insensitive filesystem */
public final class C11938SjC implements C13698TfG {
    public final 02U A00;
    public final List A01;

    public final C10528Rth AEZ(C11856Shi shi, Object obj, int i, int i2) {
        C10528Rth AEZ;
        List list = this.A01;
        int size = list.size();
        ArrayList A0v = DbS.A0v(size);
        C13892TjF tjF = null;
        for (int i3 = 0; i3 < size; i3++) {
            C13698TfG tfG = (C13698TfG) list.get(i3);
            if (tfG.CJT(obj) && (AEZ = tfG.AEZ(shi, obj, i, i2)) != null) {
                tjF = AEZ.A00;
                A0v.add(AEZ.A01);
            }
        }
        if (A0v.isEmpty() || tjF == null) {
            return null;
        }
        return new C10528Rth(tjF, new C11893SiS(this.A00, A0v));
    }

    public final boolean CJT(Object obj) {
        for (C13698TfG CJT : this.A01) {
            if (CJT.CJT(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return 002.A0S("MultiModelLoader{modelLoaders=", Arrays.toString(this.A01.toArray()), '}');
    }

    public C11938SjC(02U r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }
}
