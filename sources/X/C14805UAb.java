package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UAb  reason: case insensitive filesystem */
public final class C14805UAb extends AnonymousClass3B3 {
    public final C307786Rm A00;
    public final C276544tV A01;

    public C14805UAb(C307786Rm r1, C276544tV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r7) {
        List unmodifiableList;
        Rect rect2;
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        int A03 = RecyclerView.A03(view);
        List list = ((Ty7) C13988Tno.A0V(this.A00, this.A01)).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) 00k.A0O(unmodifiableList, A03)) != null) {
            rect.set(rect2);
        }
    }
}
