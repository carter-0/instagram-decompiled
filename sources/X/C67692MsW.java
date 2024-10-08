package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MsW  reason: case insensitive filesystem */
public final class C67692MsW extends FrameLayout {
    public final ImageView A00;
    public final TextView A01;

    public C67692MsW(Context context, int i) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.quick_snap_consumption_viewer_empty_state_card, this);
        0qQ.A07(inflate);
        this.A00 = DbU.A0F(inflate, R.id.author_profile_picture);
        this.A01 = DbU.A0G(inflate, R.id.author_username_text);
        0nA.A0g(AnonymousClass7TF.A0G(inflate, R.id.content_container), i, i);
        View A0G = AnonymousClass7TF.A0G(inflate, R.id.background_view);
        0nA.A0g(A0G, i, i);
        I7E.A06(A0G, i);
        A0G.setRotation(4.0f);
    }
}
