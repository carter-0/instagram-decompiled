package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class UE3 extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsSwitch A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UE3(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_container);
        this.A03 = Dba.A0E(view, R.id.row_title);
        this.A02 = Dba.A0E(view, R.id.row_subtitle);
        this.A04 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.row_primary_image);
        this.A01 = (ImageView) AnonymousClass7TE.A0b(view, R.id.row_end_image);
        this.A05 = (IgdsSwitch) AnonymousClass7TE.A0b(view, R.id.row_toggle);
    }
}
