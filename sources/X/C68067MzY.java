package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.MzY  reason: case insensitive filesystem */
public final class C68067MzY extends C249703kE implements C328007Db, C328017Dc {
    public C328087Dj A00;
    public final Drawable A01 = C328037De.A00();
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final List A06;

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C68067MzY(View view) {
        super(view);
        this.A02 = DbX.A0Z(view, R.id.poll_question);
        this.A06 = 0sr.A1P(new OFE[]{new OFE(view, R.id.poll_option_1, R.id.poll_option_progress1, R.id.poll_voters_option_1), new OFE(view, R.id.poll_option_2, R.id.poll_option_progress2, R.id.poll_voters_option_2), new OFE(view, R.id.poll_option_3, R.id.poll_option_progress3, R.id.poll_voters_option_3)});
        this.A03 = DbX.A0Z(view, R.id.poll_secondary_description);
        this.A04 = DbX.A0a(view, R.id.poll_creator_avatar);
        this.A05 = JTR.A0n(view, R.id.cta_button);
    }

    public final View BJd() {
        return JTO.A0F(this);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
