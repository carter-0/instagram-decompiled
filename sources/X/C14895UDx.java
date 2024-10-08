package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UDx  reason: case insensitive filesystem */
public final class C14895UDx extends C249703kE {
    public final ViewGroup A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14895UDx(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = DbX.A0I(view, R.id.header_container);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.header_text);
        this.A03 = DbX.A0J(view, R.id.header_info_icon);
        this.A02 = DbX.A0J(view, R.id.meta_ai_snippet_thumbs_up);
        this.A01 = DbX.A0J(view, R.id.meta_ai_snippet_thumbs_down);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.header_action_button);
    }
}
