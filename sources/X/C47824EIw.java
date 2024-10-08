package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EIw  reason: case insensitive filesystem */
public final class C47824EIw extends ExX {
    public View A00;
    public View A01;
    public View A02;
    public IgdsButton A03;
    public IgdsButton A04;
    public IgdsButton A05;
    public boolean A06;
    public final View A07;
    public final ViewStub A08;
    public final IgdsButton A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47824EIw(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A07 = view;
        this.A09 = DbU.A0b(view, R.id.direct_send_button_multi_select);
        this.A08 = DbU.A0D(view, R.id.layout_suggested_prompts_stub);
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        this.A02.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
    }

    public final IgdsButton A00() {
        IgdsButton igdsButton = this.A04;
        if (igdsButton != null) {
            return igdsButton;
        }
        if (this.A05 != null) {
            this.A05 = null;
            View view = this.A02;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        this.A09.setVisibility(8);
        View view2 = this.A07;
        this.A04 = DbU.A0b(view2, R.id.direct_send_to_group_button_horizontal);
        this.A00 = view2.requireViewById(R.id.direct_horizontal_send_to_group_button_container);
        IgdsButton igdsButton2 = this.A04;
        if (igdsButton2 != null) {
            igdsButton2.setVisibility(0);
        }
        IgdsButton A0b = DbU.A0b(view2, R.id.direct_send_button_multi_select_horizontal);
        this.A03 = A0b;
        if (A0b != null) {
            A0b.setVisibility(0);
        }
        View view3 = this.A00;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        return this.A04;
    }

    public final IgdsButton A01() {
        IgdsButton igdsButton = this.A05;
        if (igdsButton != null) {
            return igdsButton;
        }
        if (!(this.A03 == null && this.A04 == null)) {
            this.A04 = null;
            this.A03 = null;
            View view = this.A00;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        View view2 = this.A07;
        this.A05 = DbU.A0b(view2, R.id.direct_send_to_group_button_vertical);
        View requireViewById = view2.requireViewById(R.id.direct_vertical_send_to_group_button_container);
        this.A02 = requireViewById;
        if (requireViewById != null) {
            requireViewById.setVisibility(0);
        }
        IgdsButton igdsButton2 = this.A05;
        if (igdsButton2 != null) {
            igdsButton2.setVisibility(0);
        }
        return this.A05;
    }
}
