package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.419  reason: invalid class name */
public final class AnonymousClass419 extends C249703kE implements AnonymousClass2xU {
    public View A00;
    public UserSession A01;
    public C247733gp A02;
    public AnonymousClass4DU A03;
    public AnonymousClass3W1 A04;
    public 0Pl A05;
    public IgBouncyUfiButtonImageView A06;
    public C300835xz A07;
    public String A08;
    public final View A09;
    public final View A0A;
    public final ViewStub A0B;
    public final IgTextLayoutView A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass419(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A0A = view;
        View requireViewById = view.requireViewById(R.id.row_feed_comment_textview_child_comment_indent);
        0qQ.A07(requireViewById);
        this.A09 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.row_feed_comment_textview_layout);
        0qQ.A07(requireViewById2);
        this.A0C = (IgTextLayoutView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.row_feed_comment_like_button_stub);
        0qQ.A07(requireViewById3);
        this.A0B = (ViewStub) requireViewById3;
    }

    public final void DQp(AnonymousClass3W1 r13, int i) {
        if (i == 4) {
            C268384dI.A02(this);
            C247733gp r5 = this.A02;
            if (r5 != null) {
                0Pl r3 = this.A05;
                AnonymousClass3W1 r1 = this.A04;
                if (r3 != null && r1 != null && 1sx.A0H(r5)) {
                    IgTextLayoutView igTextLayoutView = this.A0C;
                    Context context = igTextLayoutView.getContext();
                    0qQ.A07(context);
                    if (r1.A03 == 0 || r1.A02 == 0) {
                        igTextLayoutView.setTextLayout(r3.A0C(context, r5, r1.A0o, 1, false, false, false, 1sx.A0I(r5, r1.A02)));
                        0nA.A0b(igTextLayoutView, context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
                    }
                }
            }
        }
    }
}
