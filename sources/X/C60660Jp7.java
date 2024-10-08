package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Jp7  reason: case insensitive filesystem */
public final class C60660Jp7 extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgdsSwitch A05;

    public C60660Jp7(View view) {
        super(view);
        this.A04 = DbW.A0B(view, R.id.sharing_title);
        this.A02 = DbW.A0B(view, R.id.sharing_description);
        this.A03 = DbW.A0B(view, R.id.audience_description);
        this.A05 = (IgdsSwitch) AnonymousClass7TE.A0b(view, R.id.sharing_switch);
        ImageView imageView = (ImageView) AnonymousClass7TE.A0b(view, R.id.sharing_spinner);
        this.A01 = imageView;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.sharing_switch_layout);
        C323716xz A002 = C63297Kug.A00(imageView.getContext(), false);
        A002.A01(1.0f);
        A002.A02(true);
        imageView.setImageDrawable(A002);
    }
}
