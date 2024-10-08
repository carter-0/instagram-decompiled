package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JpI  reason: case insensitive filesystem */
public final class C60671JpI extends C249703kE {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;

    public C60671JpI(View view) {
        super(view);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.rank);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.placeholder_rank);
        this.A07 = DbX.A0b(view, R.id.profile_pic);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.username);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.full_name);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.hit_count);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.crown);
    }
}
