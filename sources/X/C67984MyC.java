package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MyC  reason: case insensitive filesystem */
public final class C67984MyC extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C67984MyC(View view) {
        super(view);
        this.A00 = view;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.echo_text);
        this.A01 = A0R;
        ? A0a = DbX.A0a(view, R.id.row_search_profile_image);
        this.A02 = A0a;
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(A0a);
        Resources resources = view.getResources();
        A0G.setMarginStart(JTP.A03(resources));
        A0G.setMarginEnd(AnonymousClass7TE.A0B(resources));
        C14497TxJ.A00(AnonymousClass7TE.A0S(view), A0a, AnonymousClass05K.A00);
        2eS.A01(A0R);
    }
}
