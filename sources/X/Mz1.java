package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public final class Mz1 extends C249703kE {
    public View A00;
    public View A01;
    public CheckBox A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgdsSwitch A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Mz1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.row_simple_text_textview);
        this.A06 = (IgdsSwitch) AnonymousClass7TF.A0F(view, R.id.row_menu_item_switch);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.row_simple_text_description);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.row_simple_text_detail);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_divider);
        this.A02 = (CheckBox) AnonymousClass7TF.A0F(view, R.id.checkbox);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.row_switch_item_view);
    }
}
