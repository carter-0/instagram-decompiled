package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Mya  reason: case insensitive filesystem */
public final class C68008Mya extends C249703kE {
    public final Button A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;

    public C68008Mya(View view) {
        super(view);
        this.A03 = DbU.A0G(view, R.id.search_error_title_textview);
        this.A02 = DbU.A0G(view, R.id.search_error_sub_textview);
        this.A01 = DbU.A0F(view, R.id.search_error_imageview);
        this.A00 = (Button) view.requireViewById(R.id.search_error_tryagain_button);
    }
}
