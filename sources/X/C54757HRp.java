package X;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.HRp  reason: case insensitive filesystem */
public abstract class C54757HRp {
    public static final void A00(C304786Ff r15, AnonymousClass5QA r16, C291805hu r17, C289645dx r18, C3022262d r19, C291795ht r20, float f) {
        C304786Ff r9 = r15;
        AnonymousClass5QA r10 = r16;
        r10.EJt();
        List list = r19.A04;
        C291805hu r11 = r17;
        C289645dx r12 = r18;
        C291795ht r13 = r20;
        float f2 = f;
        if (list.size() <= 1 || (r9 instanceof C304776Fe)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C292055iK r8 = ((C3022362e) list.get(i)).A06;
                r8.E1c(r9, r10, r11, r12, r13, f2, 3);
                r10.FHv(0.0f, r8.BCs());
            }
        } else if (r9 instanceof C298605tj) {
            int size2 = list.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                C292055iK r1 = ((C3022362e) list.get(i2)).A06;
                f4 += r1.BCs();
                f3 = Math.max(f3, (float) Constraints.A01(((C292045iJ) r1).A00));
            }
            Shader A01 = ((C298605tj) r9).A01(C288015bE.A00(f3, f4));
            Matrix matrix = new Matrix();
            A01.getLocalMatrix(matrix);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C292055iK r82 = ((C3022362e) list.get(i3)).A06;
                r82.E1c(new C52918Ges(A01, 0), r10, r11, r12, r13, f2, 3);
                r10.FHv(0.0f, r82.BCs());
                matrix.setTranslate(0.0f, -r82.BCs());
                A01.setLocalMatrix(matrix);
            }
        }
        r10.EIm();
    }
}
