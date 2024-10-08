package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public abstract class JVP {
    public static final View A00(Context context, C376669Iw r4) {
        0qQ.A0B(r4, 2);
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.layout_expanded_profile_picture_interaction_bar_item_view);
        0qQ.A0A(A08);
        0qQ.A0B(A08, 1);
        ImageView A0G = DbS.A0G(A08, R.id.profile_interaction_item_icon);
        TextView A0d = AnonymousClass7TE.A0d(A08, R.id.profile_interaction_item_label);
        A0G.setImageResource(r4.A01);
        String str = r4.A03;
        A0G.setContentDescription(str);
        A0d.setText(str);
        C61685KHt.A00(AnonymousClass7TE.A0m(A08), r4, 37);
        return A08;
    }
}
