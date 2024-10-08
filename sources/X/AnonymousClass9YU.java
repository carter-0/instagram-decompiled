package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9YU  reason: invalid class name */
public final class AnonymousClass9YU extends C249703kE {
    public final IgTextView A00;

    public AnonymousClass9YU(View view) {
        super(view);
        IgTextView A0b = AnonymousClass7TE.A0b(view, R.id.gallery_grid_meta_gallery_footer_message_text);
        this.A00 = A0b;
        A0b.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
