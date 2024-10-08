package X;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import java.util.Iterator;

/* renamed from: X.5Qn  reason: invalid class name and case insensitive filesystem */
public final class C285275Qn implements View.OnDragListener, AnonymousClass5Qo {
    public final 04u A00 = new 04u(0);
    public final Modifier A01 = new DragAndDropModifierOnDragListener$modifier$1(this);
    public final C285295Qq A02 = new C285295Qq(C285285Qp.A00);
    public final 0sK A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C55429HhZ hhZ = new C55429HhZ(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                C285295Qq r4 = this.A02;
                ? obj = new Object();
                C58751Iwy iwy = new C58751Iwy(10, obj, r4, hhZ);
                if (iwy.invoke(r4) == GRZ.ContinueTraversal) {
                    GQ7.A03(r4, iwy);
                }
                z = obj.A00;
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                this.A02.DSV(hhZ);
                return false;
            case 3:
                return this.A02.DB6(hhZ);
            case 4:
                this.A02.DCE(hhZ);
                return false;
            case 6:
                this.A02.DDa(hhZ);
                return false;
        }
        return z;
    }

    public C285275Qn(0sK r3) {
        this.A03 = r3;
    }
}
