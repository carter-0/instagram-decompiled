package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Mft  reason: case insensitive filesystem */
public final class C66960Mft implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ boolean A03;

    public C66960Mft(View view, View view2, int i, boolean z) {
        this.A03 = z;
        this.A02 = view;
        this.A00 = i;
        this.A01 = view2;
    }

    public final void run() {
        boolean z = this.A03;
        if (!z) {
            View view = this.A02;
            0qQ.A0C(view, "null cannot be cast to non-null type com.instagram.direct.inbox.notes.ui.NoteBubbleView");
            if (this.A00 > 3) {
                view.setPadding(0, 0, 0, 0);
            } else {
                view.setPadding(0, DbY.A01(AnonymousClass7TE.A0S(view)), 0, 0);
            }
        }
        View view2 = this.A02;
        View view3 = this.A01;
        float A022 = AnonymousClass7TE.A02(view2);
        Context A0S = AnonymousClass7TE.A0S(view2);
        float f = 70.0f;
        if (z) {
            f = 70.0f / 0.75f;
        }
        if (A022 > C61380mr.A00(A0S, f)) {
            if (z) {
                C319756rA.A01(view2, view3);
                return;
            }
            C270354gb r4 = new C270354gb();
            ViewParent parent = view2.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r4.A0I((ConstraintLayout) parent);
            r4.A0C(view2.getId(), 3, 0, 3);
            r4.A0C(view2.getId(), 6, 0, 6);
            r4.A0C(view2.getId(), 7, 0, 7);
            r4.A09(view2.getId(), 4);
            ViewParent parent2 = view2.getParent();
            0qQ.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            r4.A0G((ConstraintLayout) parent2);
        } else if (z) {
            C319756rA.A02(view2, view3);
        } else {
            C319756rA.A00(view2);
        }
    }
}
