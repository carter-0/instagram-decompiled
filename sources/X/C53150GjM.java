package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GjM  reason: case insensitive filesystem */
public final class C53150GjM extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgImageView A08;

    public C53150GjM(View view) {
        super(view);
        this.A00 = view;
        this.A08 = AnonymousClass7TE.A0b(view, R.id.comment_author_imageview);
        this.A07 = Dba.A0E(view, R.id.comment_title);
        this.A06 = Dba.A0E(view, R.id.comment_timestamp);
        this.A03 = Dba.A0E(view, R.id.comment_textview);
        this.A05 = Dba.A0E(view, R.id.comment_reply_button);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.comment_row_overflow_button);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.comment_like_button);
        this.A04 = Dba.A0E(view, R.id.comment_like_count);
    }
}
