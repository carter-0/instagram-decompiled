package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.VbK  reason: case insensitive filesystem */
public final class C17628VbK {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgdsRadioButton A06;

    public C17628VbK(View view) {
        0qQ.A0B(view, 1);
        this.A04 = AnonymousClass7TE.A0d(view, R.id.text);
        this.A05 = AnonymousClass7TE.A0d(view, R.id.serial);
        this.A01 = view.findViewById(R.id.serial_layout);
        this.A06 = (IgdsRadioButton) view.findViewById(R.id.button);
        this.A03 = DbS.A0G(view, R.id.selected);
        this.A00 = view.findViewById(R.id.answer_container);
        this.A02 = view.findViewById(R.id.serial_layout_extra_margin);
    }
}
