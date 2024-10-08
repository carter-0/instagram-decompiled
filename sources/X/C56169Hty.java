package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* renamed from: X.Hty  reason: case insensitive filesystem */
public abstract class C56169Hty {
    public static final Modifier A01(Modifier modifier, AnonymousClass5S2 r9, float f, long j, long j2, boolean z) {
        float f2 = f;
        boolean z2 = z;
        if (Float.compare(f, 0.0f) > 0 || z) {
            return modifier.Ezh(new ShadowGraphicsLayerElement(r9, f2, j, j2, z2));
        }
        return modifier;
    }

    public static Modifier A00(C286575Wy r8, Modifier modifier, boolean z) {
        AnonymousClass5ZQ A00 = AnonymousClass5ZN.A00();
        long j = AnonymousClass5RV.A00;
        return C304766Fd.A01(A01(modifier, A00, 4.0f, j, j, z), AnonymousClass5ZN.A00(), AnonymousClass5aQ.A00(r8).A0B);
    }
}
