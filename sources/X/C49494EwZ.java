package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.EwZ  reason: case insensitive filesystem */
public final class C49494EwZ {
    public final TextView A00;
    public final IgdsCheckBox A01;

    public C49494EwZ(ViewGroup viewGroup) {
        this.A00 = DbU.A0G(viewGroup, R.id.text);
        this.A01 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
    }
}
