package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.UDz  reason: case insensitive filesystem */
public final class C14897UDz extends C249703kE {
    public CircularImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsButton A05;

    public C14897UDz(View view) {
        super(view);
        this.A04 = DbU.A0G(view, R.id.sa_title);
        this.A03 = DbU.A0G(view, R.id.sa_subtitle);
        this.A05 = (IgdsButton) view.requireViewById(R.id.sa_button);
        this.A02 = DbU.A0D(view, R.id.sa_icon_viewstub);
        this.A01 = view.requireViewById(R.id.sa_dismiss_button);
    }
}
