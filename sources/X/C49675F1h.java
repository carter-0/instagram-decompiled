package X;

import android.view.View;
import com.instagram.android.R;
import kotlin.Deprecated;

/* renamed from: X.F1h  reason: case insensitive filesystem */
public final class C49675F1h {
    public final ExX A00;

    public C49675F1h(View view, boolean z) {
        ExX exX;
        0qQ.A0B(view, 1);
        if (z) {
            View A0F = DbY.A0F(view, R.id.direct_multi_select_bottom_container_stub);
            0qQ.A0A(A0F);
            exX = new C47824EIw(A0F);
        } else {
            View A0F2 = DbY.A0F(view, R.id.direct_private_share_message_view_stub);
            0qQ.A0A(A0F2);
            0qQ.A0B(A0F2, 1);
            exX = new ExX(A0F2);
            View view2 = exX.A01;
            int A01 = AnonymousClass1GB.A01(0nA.A04(AnonymousClass7TE.A0S(view2), 12));
            view2.setPadding(A01, A01, A01, A01);
        }
        this.A00 = exX;
    }

    @Deprecated(message = "Exposed viewHolder visibility is temporary for migration purposes")
    public final C47824EIw A00() {
        ExX exX = this.A00;
        if (exX instanceof C47824EIw) {
            return (C47824EIw) exX;
        }
        return null;
    }
}
