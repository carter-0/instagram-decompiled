package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.DoZ  reason: case insensitive filesystem */
public final class C46981DoZ extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46981DoZ(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.shortcut_container);
        this.A03 = DbX.A0b(view, R.id.icon_image);
        this.A02 = DbX.A0Z(view, R.id.shortcut_right_text_view);
        this.A01 = DbX.A0Z(view, R.id.shortcut_left_text_view);
    }
}
