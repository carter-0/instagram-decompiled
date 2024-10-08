package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class LBD {
    public View A00;
    public ImageView A01;
    public C63785L6r A02;
    public AnonymousClass8ZI A03;
    public GVO A04;
    public boolean A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final TextView A09;
    public final C71662eb A0A;

    public LBD(View view) {
        this.A06 = view;
        View requireViewById = view.requireViewById(R.id.song_title);
        TextView textView = (TextView) requireViewById;
        textView.getPaint().setFakeBoldText(true);
        0qQ.A07(requireViewById);
        this.A09 = textView;
        this.A07 = DbX.A0J(view, R.id.album_art);
        this.A08 = DbX.A0J(view, R.id.search_row_camera_button);
        this.A0A = DbY.A0S(view, R.id.dismiss_button_stub);
    }
}
