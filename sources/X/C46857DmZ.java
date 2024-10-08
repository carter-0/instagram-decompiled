package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DmZ  reason: case insensitive filesystem */
public final class C46857DmZ extends AnonymousClass3B3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2365334c A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1O(view, recyclerView);
        if (RecyclerView.A03(view) == 0 && this.A01.A0C.A08 == AnonymousClass05K.A00) {
            rect.set(-this.A00, 0, 0, 0);
        }
    }

    public C46857DmZ(C2365334c r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
