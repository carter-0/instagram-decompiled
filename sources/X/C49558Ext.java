package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Ext  reason: case insensitive filesystem */
public final class C49558Ext {
    public final TextView A00;
    public final TextView A01;
    public final IgdsCheckBox A02;

    public C49558Ext(ViewGroup viewGroup) {
        this.A01 = DbU.A0G(viewGroup, R.id.text);
        this.A00 = DbU.A0G(viewGroup, R.id.learn_more_link);
        this.A02 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
    }
}
