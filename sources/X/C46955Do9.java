package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Do9  reason: case insensitive filesystem */
public final class C46955Do9 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public C46955Do9(View view) {
        super(view);
        this.A01 = DbW.A0B(view, R.id.inspiration_section_title);
        this.A00 = DbW.A0B(view, R.id.inspiration_section_description);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.images_grid);
    }
}
