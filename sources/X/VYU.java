package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

public final class VYU {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsButton A03;

    public VYU(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        View requireViewById = viewGroup.requireViewById(R.id.overlay_title);
        TextView textView = (TextView) requireViewById;
        C13988Tno.A16(textView, true);
        0qQ.A07(requireViewById);
        this.A02 = textView;
        this.A01 = AnonymousClass7TG.A0R(viewGroup, R.id.overlay_subtitle);
        this.A03 = JTR.A0n(viewGroup, R.id.overlay_button);
    }
}
