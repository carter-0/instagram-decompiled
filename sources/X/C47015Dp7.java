package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* renamed from: X.Dp7  reason: case insensitive filesystem */
public final class C47015Dp7 extends C249703kE {
    public final View A00;
    public final IgLinearLayout A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgdsRadioButton A04;
    public final IgdsFaceSwarm A05;

    public C47015Dp7(View view) {
        super(view);
        this.A00 = view;
        this.A05 = (IgdsFaceSwarm) AnonymousClass7TF.A0F(view, R.id.campfire_list_item_photo);
        this.A03 = DbX.A0Z(view, R.id.campfire_list_item_name);
        this.A01 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.campfire_list_item_member_count_container);
        this.A02 = DbX.A0Z(view, R.id.campfire_list_item_member_count);
        this.A04 = (IgdsRadioButton) AnonymousClass7TF.A0F(view, R.id.campfire_list_item_radio_button);
    }
}
