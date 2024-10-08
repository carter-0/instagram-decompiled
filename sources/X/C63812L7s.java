package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsRadioButton;

/* renamed from: X.L7s  reason: case insensitive filesystem */
public final class C63812L7s {
    public final View A00;
    public final TextView A01;
    public final IgdsRadioButton A02;
    public final ImageView A03;

    public C63812L7s(View view, Context context) {
        Drawable drawable;
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.row_add_to_exclusive_story_container);
        ImageView imageView = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = imageView;
        View A0V = JTR.A0V(view, R.id.show_fans_label_stub);
        0qQ.A0C(A0V, "null cannot be cast to non-null type android.widget.TextView");
        this.A01 = (TextView) A0V;
        this.A02 = (IgdsRadioButton) AnonymousClass7TE.A0b(view, R.id.recipient_picker_radio_button);
        Drawable drawable2 = context.getDrawable(R.drawable.exclusive_story_recipient_picker);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }
}
