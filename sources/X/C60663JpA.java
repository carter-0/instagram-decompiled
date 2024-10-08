package X;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.JpA  reason: case insensitive filesystem */
public final class C60663JpA extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final EditText A03;
    public final TextView A04;
    public final CircularImageView A05;
    public final C60704Jpp A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60663JpA(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.highlight_cover_container);
        this.A05 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.highlight_cover_image);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.highlight_card_cover_image);
        this.A06 = new C60704Jpp(view);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.highlight_title_container);
        this.A03 = (EditText) AnonymousClass7TF.A0F(view, R.id.highlight_title);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.edit_cover_link);
    }
}
