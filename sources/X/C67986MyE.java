package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MyE  reason: case insensitive filesystem */
public final class C67986MyE extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67986MyE(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = DbX.A0Z(view, R.id.title_text);
        this.A00 = DbX.A0Z(view, R.id.content_text);
        this.A01 = DbX.A0Z(view, R.id.learn_more_link);
    }
}
