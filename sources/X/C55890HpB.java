package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.HpB  reason: case insensitive filesystem */
public final class C55890HpB {
    public final View A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final IgTextView A0C;
    public final GradientSpinnerAvatarView A0D;

    public C55890HpB(View view) {
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.option_rows);
        this.A09 = Dba.A0E(view, R.id.standalone_question_text);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.header_section);
        this.A0D = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.row_comment_imageview);
        this.A0B = Dba.A0E(view, R.id.username);
        this.A0A = Dba.A0E(view, R.id.time_ago);
        this.A08 = Dba.A0E(view, R.id.question_text);
        this.A0C = DbX.A0Z(view, R.id.vote_counts);
        this.A01 = DbX.A0J(view, R.id.vote_count_facepile);
        this.A03 = DbX.A0Z(view, R.id.creator_view_footer_text_aligned_left);
        this.A05 = DbX.A0Z(view, R.id.delete_vote_aligned_left);
        this.A04 = DbX.A0Z(view, R.id.creator_view_footer_text_aligned_right);
        this.A06 = DbX.A0Z(view, R.id.delete_vote_aligned_right);
        this.A07 = DbX.A0Z(view, R.id.footer_nux);
    }
}
