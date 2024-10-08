package X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class QFQ extends C249703kE {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final /* synthetic */ C8002Qep A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFQ(LinearLayout linearLayout, C8002Qep qep) {
        super(linearLayout);
        0qQ.A0B(linearLayout, 2);
        this.A03 = qep;
        this.A01 = linearLayout;
        this.A02 = AnonymousClass7TG.A0R(linearLayout, R.id.description);
        this.A00 = (ImageView) AnonymousClass7TF.A0F(linearLayout, R.id.back_button);
    }
}
