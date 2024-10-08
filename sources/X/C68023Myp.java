package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Myp  reason: case insensitive filesystem */
public final class C68023Myp extends C249703kE {
    public C68187N5c A00;
    public final AnonymousClass0iw A01;
    public final IgTextView A02;
    public final CircularImageView A03;
    public final 0sP A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68023Myp(View view, AnonymousClass0iw r5, 0sP r6, boolean z) {
        super(view);
        AnonymousClass7TG.A1Q(r6, r5);
        this.A04 = r6;
        this.A01 = r5;
        this.A05 = z;
        this.A03 = DbX.A0a(view, R.id.note_tagging_profile_view);
        this.A02 = DbX.A0Z(view, R.id.note_tagging_name_view);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(JTO.A0F(this));
        A0m.A07 = true;
        NQx.A01(A0m, this, 9);
    }
}
