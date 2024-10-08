package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8On  reason: invalid class name and case insensitive filesystem */
public final class C355088On extends AnonymousClass3B3 {
    public final /* synthetic */ C355048Oj A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        int i;
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        0qQ.A0B(r9, 3);
        super.getItemOffsets(rect, view, recyclerView, r9);
        C355078Om r4 = this.A00.A01;
        if (r4 != null) {
            Integer num = C355078Om.A06;
            if (num != null) {
                i = num.intValue();
            } else {
                Context context = r4.A03;
                float A04 = 0nA.A04(context, 7);
                float A042 = 0nA.A04(context, 44);
                float f = (float) r4.A02;
                float A01 = ((float) AnonymousClass1GB.A01(f / (A04 + A042))) - 0.5f;
                i = (int) ((f - (A042 * A01)) / A01);
                C355078Om.A06 = Integer.valueOf(i);
            }
            if (Integer.valueOf(i) != null) {
                rect.left = i;
                if (RecyclerView.A03(view) == r9.A00() - 1) {
                    rect.right = i;
                }
            }
        }
    }

    public C355088On(C355048Oj r1) {
        this.A00 = r1;
    }
}
