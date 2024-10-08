package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow;

/* renamed from: X.UnB  reason: case insensitive filesystem */
public final class C16022UnB extends UBE {
    public final IgLinearLayout A00;
    public final IgdsButton A01;
    public final LeadGenCreativesSectionHeaderRow A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16022UnB(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = (LeadGenCreativesSectionHeaderRow) AnonymousClass7TF.A0F(view, R.id.header_row);
        this.A00 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.section_items_container);
        this.A01 = JTR.A0n(view, R.id.see_all_button);
    }
}
