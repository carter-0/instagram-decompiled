package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow;

/* renamed from: X.Un7  reason: case insensitive filesystem */
public final class C16018Un7 extends UBE {
    public final IgLinearLayout A00;
    public final LeadGenCreativesSectionHeaderRow A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16018Un7(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = (LeadGenCreativesSectionHeaderRow) AnonymousClass7TF.A0F(view, R.id.header_row);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.section_items_container);
    }
}
