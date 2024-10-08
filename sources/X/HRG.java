package X;

import androidx.compose.ui.Modifier;

public abstract class HRG {
    public static final Modifier A00(Modifier modifier, AnonymousClass5S2 r8, float f, float f2) {
        int i = 3;
        boolean z = false;
        AnonymousClass5S2 r2 = r8;
        if (r8 != null) {
            i = 0;
            z = true;
        }
        float f3 = f;
        float f4 = f2;
        if ((Float.compare(f, 0.0f) <= 0 || Float.compare(f2, 0.0f) <= 0) && !z) {
            return modifier;
        }
        return C51970G9q.A0X(modifier, new C58754Ix1(r2, f3, f4, i, z));
    }
}
