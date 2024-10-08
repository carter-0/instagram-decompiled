package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.L8x  reason: case insensitive filesystem */
public final class C63842L8x {
    public final View A00;
    public final TextView A01;
    public final IgdsRadioButton A02;
    public final ImageView A03;
    public final TextView A04;

    public C63842L8x(View view, Context context) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_add_to_story_favorites_container);
        ImageView imageView = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = imageView;
        TextView A0B = DbW.A0B(view, R.id.label);
        this.A04 = A0B;
        View A0V = JTR.A0V(view, R.id.edit_close_friends_label_stub);
        0qQ.A0C(A0V, "null cannot be cast to non-null type android.widget.TextView");
        this.A01 = (TextView) A0V;
        this.A02 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.recipient_picker_radio_button);
        imageView.setImageDrawable(C346697vb.A00(context));
        A0B.setText(2131956191);
    }
}
