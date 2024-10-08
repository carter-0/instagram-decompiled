package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.JoW  reason: case insensitive filesystem */
public final class C60623JoW extends C249703kE {
    public final TextView A00;
    public final C355568Qm A01;
    public final ImageView A02;

    public C60623JoW(View view, C355568Qm r4) {
        super(view);
        this.A01 = r4;
        this.A00 = AnonymousClass7TG.A0R(view, R.id.reorder_section_title);
        ImageView A0J = DbX.A0J(view, R.id.section_reorder_thumb);
        this.A02 = A0J;
        C64286LYm.A00(A0J, 23, this);
    }
}
