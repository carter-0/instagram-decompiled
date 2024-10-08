package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.JpG  reason: case insensitive filesystem */
public final class C60669JpG extends C249703kE {
    public final ViewGroup A00;
    public final IgLinearLayout A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgdsCheckBox A07;

    public C60669JpG(View view) {
        super(view);
        this.A00 = DbX.A0I(view, R.id.audience_list_row_container);
        this.A05 = DbX.A0Z(view, R.id.audience_list_label);
        this.A01 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.audience_list_member_count_container);
        this.A06 = DbX.A0Z(view, R.id.audience_list_member_count);
        this.A03 = DbX.A0Y(view, R.id.audience_list_member_count_chevron);
        this.A02 = DbX.A0Y(view, R.id.audience_list_facepile);
        this.A07 = (IgdsCheckBox) AnonymousClass7TF.A0F(view, R.id.audience_list_checkbox);
        this.A04 = DbX.A0Y(view, R.id.audience_list_right_chevron);
    }
}
