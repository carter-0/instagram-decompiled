package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.DoW  reason: case insensitive filesystem */
public final class C46978DoW extends C249703kE {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C46978DoW(View view) {
        super(view);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.draft_entrypoint_container);
        this.A00 = viewGroup;
        this.A02 = DbW.A0B(viewGroup, R.id.number_of_drafts);
        this.A01 = DbW.A0B(viewGroup, R.id.disclaimer);
        this.A03 = AnonymousClass7TE.A0b(viewGroup, R.id.draft_preview_image);
    }
}
