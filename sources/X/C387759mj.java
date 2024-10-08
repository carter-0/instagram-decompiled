package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9mj  reason: invalid class name and case insensitive filesystem */
public final class C387759mj extends AnonymousClass9YS {
    public AnonymousClass3NM A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final C62320sa A03;

    public C387759mj(View view, C62320sa r5) {
        super(view);
        this.A03 = r5;
        this.A02 = AnonymousClass7TF.A0F(view, R.id.title_label);
        this.A01 = (IgSimpleImageView) AnonymousClass7TF.A0F(view, R.id.entrypoint_view);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A07 = true;
        this.A00 = C386359kT.A00(A0m, this, 12);
    }
}
