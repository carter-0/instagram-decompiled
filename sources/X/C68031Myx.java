package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Myx  reason: case insensitive filesystem */
public final class C68031Myx extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final GradientSpinnerAvatarView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68031Myx(Context context, View view, Integer num) {
        super(view);
        Drawable A042;
        int A022 = DbW.A02(1, view, context);
        this.A01 = view;
        this.A06 = DbX.A0j(view, R.id.avatar);
        ImageView A0J = DbX.A0J(view, R.id.avatar_badge);
        this.A03 = A0J;
        this.A05 = DbX.A0Z(view, R.id.username);
        this.A04 = DbX.A0Z(view, R.id.user_fullname);
        if (num != null) {
            if (num.intValue() != 8) {
                A042 = C346697vb.A03(context, R.drawable.close_friends_star_small, A022);
            } else {
                int[] iArr = new int[5];
                C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
                A042 = AnonymousClass3JT.A04(context, iArr, R.drawable.instagram_star_pano_filled_12);
            }
            A0J.setImageDrawable(A042);
        }
        View A0H = JTP.A0H(JTR.A0X(view, R.id.action_button_container_view_stub), R.layout.action_button_container_panavision);
        this.A00 = A0H.requireViewById(R.id.add);
        this.A02 = A0H.requireViewById(R.id.remove);
    }
}
