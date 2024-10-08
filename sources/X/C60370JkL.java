package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JkL  reason: case insensitive filesystem */
public final class C60370JkL extends C355538Qj {
    public final /* synthetic */ C60477Jm9 A00;

    public final int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        0qQ.A0B(recyclerView, 0);
        int interpolateOutOfBoundsScroll = super.interpolateOutOfBoundsScroll(recyclerView, i, i2, i3, j);
        int abs = Math.abs(interpolateOutOfBoundsScroll);
        if (abs < 10) {
            abs = 10;
        } else if (abs > 20) {
            abs = 20;
        }
        return abs * Integer.signum(interpolateOutOfBoundsScroll);
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r15, float f, float f2, int i, boolean z) {
        boolean intersect;
        char A1U = AnonymousClass7TF.A1U(0, canvas, recyclerView);
        0qQ.A0B(r15, 2);
        super.onChildDraw(canvas, recyclerView, r15, f, f2, i, z);
        C60477Jm9 jm9 = this.A00;
        View A0F = JTO.A0F(r15);
        View view = jm9.A0A;
        if (view.getVisibility() != 0) {
            intersect = false;
        } else {
            int[] iArr = new int[2];
            A0F.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[A1U];
            C60423JlG jlG = jm9.A03;
            if (jlG == null) {
                0qQ.A0F("adapter");
                throw AnonymousClass00P.createAndThrow();
            }
            Rect rect = new Rect(i2, i3, jlG.A01() + i2, iArr[A1U] + jlG.A00());
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int i4 = iArr2[0];
            intersect = rect.intersect(new Rect(i4, iArr2[A1U], view.getWidth() + i4, iArr2[A1U] + view.getHeight()));
        }
        if (intersect != jm9.A06) {
            if (intersect) {
                AnonymousClass2S0.A01.A05(20);
            }
            jm9.A06 = intersect;
        }
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r7, C249703kE r8) {
        AnonymousClass7TF.A1B(r7, 1, r8);
        C60477Jm9 jm9 = this.A00;
        jm9.A00 = r8.getAbsoluteAdapterPosition();
        C60423JlG jlG = jm9.A03;
        if (jlG == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        jlG.notifyItemMoved(r7.getAbsoluteAdapterPosition(), jm9.A00);
        return true;
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public C60370JkL(C60477Jm9 jm9) {
        this.A00 = jm9;
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(51, 0);
    }

    public final void onSelectedChanged(C249703kE r3, int i) {
        if (r3 != null) {
            C60477Jm9 jm9 = this.A00;
            jm9.A04 = true;
            if (!jm9.A07) {
                jm9.A01 = RecyclerView.A04(r3.itemView);
            }
        }
    }
}
