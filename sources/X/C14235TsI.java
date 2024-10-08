package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.accessibility.AccessibleTextView;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.TsI  reason: case insensitive filesystem */
public final class C14235TsI extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final AccessibleTextView A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.accessibility.AccessibleTextView, android.widget.TextView] */
    public C14235TsI(View view, View view2) {
        super(view);
        this.A00 = view2;
        this.A04 = DbX.A0Y(view2, R.id.inline_insights_icon);
        this.A03 = (IgLinearLayout) AnonymousClass7TF.A0F(view2, R.id.inline_insights_container);
        ? r3 = (AccessibleTextView) AnonymousClass7TF.A0F(view2, R.id.inline_insights_text);
        this.A02 = r3;
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.boost_post);
        this.A01 = A0R;
        0nA.A0k(A0R, 16, 7, 16, 7);
        A0R.setTextAppearance(R.style.igds_emphasized_body_1);
        r3.setTextAppearance(R.style.igds_emphasized_body_1);
    }
}
