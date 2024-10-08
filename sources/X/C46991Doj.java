package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Doj  reason: case insensitive filesystem */
public final class C46991Doj extends C249703kE {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C46991Doj(View view) {
        super(view);
        this.A01 = DbX.A0Y(view, R.id.campfire_member_profile_picture);
        this.A02 = DbX.A0Z(view, R.id.campfire_member_name);
        this.A03 = DbX.A0Z(view, R.id.campfire_member_username);
        this.A00 = DbX.A0Y(view, R.id.campfire_member_more_button);
    }
}
