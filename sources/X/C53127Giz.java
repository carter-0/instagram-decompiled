package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Giz  reason: case insensitive filesystem */
public final class C53127Giz extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgdsButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53127Giz(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = Dba.A0E(view, R.id.header);
        this.A00 = Dba.A0E(view, R.id.body);
        this.A02 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.action);
    }
}
