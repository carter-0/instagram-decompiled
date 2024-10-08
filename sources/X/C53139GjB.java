package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.GjB  reason: case insensitive filesystem */
public final class C53139GjB extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public C53139GjB(View view) {
        super(view);
        this.A00 = view;
        this.A04 = DbX.A0Z(view, R.id.title_text);
        this.A03 = DbX.A0Z(view, R.id.pinned_save_row_title_text);
        this.A01 = DbX.A0Z(view, R.id.new_collection_cta);
        this.A02 = DbX.A0Z(view, R.id.pinned_save_row_new_collection_cta);
    }
}
