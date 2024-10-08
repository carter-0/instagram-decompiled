package X;

import android.content.Context;
import android.util.Size;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.IDp  reason: case insensitive filesystem */
public final class C56818IDp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C320296s9 A00;

    public C56818IDp(C320296s9 r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        C320296s9 r5 = this.A00;
        Context context = r5.getContext();
        if (context != null) {
            C320516sV r4 = r5.A06;
            String str = "clipsGridAdapter";
            if (r4 != null) {
                Size A01 = C320546sY.A01(context, r4.A0D.A00);
                r4.A02 = A01;
                r4.A01 = A01.getWidth();
                int height = r4.A02.getHeight();
                r4.A00 = height;
                C320586sc r1 = r4.A05;
                if (r1 == null) {
                    str = "clipsGridItemDefinition";
                } else {
                    r1.A01 = r4.A01;
                    r1.A00 = height;
                    C320516sV r0 = r5.A06;
                    if (r0 != null) {
                        r0.A0I.notifyDataSetChanged();
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView = r5.A00;
        if (recyclerView != null) {
            C51971G9r.A0z(recyclerView, this);
        }
    }
}
