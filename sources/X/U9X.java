package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class U9X extends C355538Qj {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;

    public final void onSwiped(C249703kE r1, int i) {
    }

    public U9X(C307786Rm r1, C276544tV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(15, 0);
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r11, C249703kE r12) {
        if (C16714V2x.A02 != null) {
            int absoluteAdapterPosition = r11.getAbsoluteAdapterPosition();
            int absoluteAdapterPosition2 = r12.getAbsoluteAdapterPosition();
            C277014uI A08 = this.A01.A08();
            if (A08 == null) {
                C307446Qd A02 = C307476Qg.A02(this.A00);
                if (C245983dn.A03()) {
                    A02.A00++;
                }
                A02.A0E(new C15673Uge(this, absoluteAdapterPosition, absoluteAdapterPosition2), (long) C16714V2x.A02.A03);
                A02.A07();
            } else if (!(C16714V2x.A00 == absoluteAdapterPosition || C16714V2x.A01 == absoluteAdapterPosition2)) {
                C276544tV r4 = C16714V2x.A02;
                C308276Tl r3 = new C308276Tl();
                C307786Rm r2 = this.A00;
                r3.A01(r2);
                r3.A03(Integer.valueOf(absoluteAdapterPosition), 1);
                r3.A03(Integer.valueOf(absoluteAdapterPosition2), 2);
                DbT.A1R(r2, r4, r3, A08);
                C16714V2x.A00 = absoluteAdapterPosition;
                C16714V2x.A01 = absoluteAdapterPosition2;
                return true;
            }
        }
        return true;
    }

    public final void clearView(RecyclerView recyclerView, C249703kE r7) {
        super.clearView(recyclerView, r7);
        C277014uI A09 = this.A01.A09();
        C16714V2x.A00 = -1;
        C16714V2x.A01 = -1;
        if (A09 != null && C16714V2x.A02 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C16714V2x.A02.A0L().size(); i++) {
                arrayList.add(((C276544tV) C16714V2x.A02.A0L().get(i)).A0C());
            }
            C307886Rw.A03(this.A00, C16714V2x.A02, Pxj.A0a(arrayList), A09);
        }
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r6, float f, float f2, int i, boolean z) {
        super.onChildDraw(canvas, recyclerView, r6, f, f2, i, z);
        if (z) {
            View view = r6.itemView;
            view.setElevation(Math.max(20.0f, view.getElevation()));
        }
    }
}
