package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.DoL  reason: case insensitive filesystem */
public final class C46967DoL extends C249703kE {
    public final IgLinearLayout A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46967DoL(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.prompt_container);
        this.A01 = DbX.A0Y(view, R.id.emoji);
        this.A02 = DbX.A0Z(view, R.id.prompt_text_view);
    }
}
