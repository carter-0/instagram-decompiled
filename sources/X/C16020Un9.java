package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow;

/* renamed from: X.Un9  reason: case insensitive filesystem */
public final class C16020Un9 extends UBE {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final LeadGenCreativesSectionHeaderRow A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16020Un9(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = (LeadGenCreativesSectionHeaderRow) AnonymousClass7TF.A0F(view, R.id.header_row);
        this.A01 = DbX.A0Z(view, R.id.description_text_view);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.section_items_container);
    }
}
