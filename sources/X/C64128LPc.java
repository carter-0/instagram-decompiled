package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.LPc  reason: case insensitive filesystem */
public abstract class C64128LPc {
    public static final void A01(View view, C62320sa r3) {
        0qQ.A0B(view, 0);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A04 = new C61685KHt(r3, 31);
        A0m.A07 = true;
        A0m.A00();
    }

    public static final AnonymousClass0eM A00(AnonymousClass4DH r3, int i) {
        return AnonymousClass0eN.A00(0eO.A02, new MJ3(i, 33, r3));
    }

    public static final void A02(RecyclerView recyclerView, int i) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = 0;
        if (valueOf != null) {
            Context A0S = AnonymousClass7TE.A0S(recyclerView);
            i2 = (int) 0nA.A00(A0S, A0S.getResources().getDimension(valueOf.intValue()));
        }
        recyclerView.A11(new C60455Jln(i2, 4));
    }
}
