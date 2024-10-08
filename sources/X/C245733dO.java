package X;

import com.facebook.litho.BaseMountingView;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;

/* renamed from: X.3dO  reason: invalid class name and case insensitive filesystem */
public final class C245733dO extends C251323mv implements C251333mw {
    public final void ADA(RenderTreeNode renderTreeNode, C245753dQ r2, int i) {
    }

    public final void Cy6(2Th r1, C245753dQ r2, Object obj, Object obj2) {
    }

    public final void Cz0(2Th r1, C245753dQ r2, Object obj, Object obj2, boolean z) {
    }

    public final void DSP(2Th r1, C245753dQ r2, Object obj, Object obj2) {
    }

    public final void DuU(2Th r1, C245753dQ r2, Object obj, Object obj2) {
    }

    public final boolean Eti(2Th r2, 2Th r3, C245753dQ r4, Object obj, Object obj2) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object A0A() {
        return null;
    }

    public final void Dv4(2Th r4, C245753dQ r5, Object obj, Object obj2) {
        if (obj instanceof C251303mt) {
            ArrayList arrayList = new ArrayList();
            ((C251303mt) obj).CsS(arrayList);
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Object obj3 = arrayList.get(size);
                    0qQ.A07(obj3);
                    ((BaseMountingView) obj3).A0W();
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
