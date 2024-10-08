package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class QFI extends C249703kE {
    public final ImageView A00;
    public final TextView A01;
    public final /* synthetic */ C7984QeX A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFI(View view, C7984QeX qeX) {
        super(view);
        this.A02 = qeX;
        this.A00 = DbS.A0G(view, R.id.icon);
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
        this.A01 = A0d;
        C11409SSh.A02(view, 2, 11, 11, 4);
        0qQ.A05(A0d);
        SRn.A02(A0d, RH2.POST_PURCHASE_ACTION_TEXT);
    }
}
