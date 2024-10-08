package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9SG  reason: invalid class name */
public final class AnonymousClass9SG extends C339087j2 {
    public final int A00;
    public final Context A01;

    public final void A00(UserSession userSession, C339807kC r6) {
        IgSimpleImageView igSimpleImageView = r6.A07;
        igSimpleImageView.setImageResource(R.drawable.instagram_draft_pano_outline_24);
        igSimpleImageView.setColorFilter(AnonymousClass37O.A00(AnonymousClass7TE.A0A(igSimpleImageView.getContext())));
        igSimpleImageView.setScaleType(ImageView.ScaleType.CENTER);
        Context context = this.A01;
        String A16 = AnonymousClass7TE.A16(context, 2131962909);
        int i = this.A00;
        if (1 <= i) {
            if (i < 101) {
                A16 = AnonymousClass7TF.A0e(context.getResources(), String.valueOf(i), 2131955420);
            } else {
                A16 = context.getString(2131955421);
            }
        }
        IgTextView igTextView = r6.A08;
        igTextView.setText(A16);
        igTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public AnonymousClass9SG(Context context, C339057iz r8, int i) {
        super(r8, 2131962909, C339067j0.A00, C339077j1.A00, R.drawable.instagram_draft_pano_outline_24);
        this.A01 = context;
        this.A00 = i;
    }
}
