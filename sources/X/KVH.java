package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.music.common.model.MusicSearchArtist;

public final class KVH extends C60518Jmp {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final C63788L6u A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVH(View view, C66451MSf mSf) {
        super(view);
        0qQ.A0B(mSf, 2);
        ImageView A0J = DbX.A0J(view, R.id.artist_image);
        this.A00 = A0J;
        this.A02 = AnonymousClass7TG.A0R(view, R.id.artist_title_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.artist_subtitle_text);
        this.A03 = new C63788L6u(view, mSf);
        Context context = view.getContext();
        int A012 = Dbb.A01(context);
        A0J.setImageDrawable(new GIH(context, (GJO) null, A012, A012 / 2, 0, 0, 0, -1, false));
    }

    public final void A00(MusicSearchArtist musicSearchArtist, int i) {
        TextView textView = this.A02;
        C61094Jx5 jx5 = (C61094Jx5) musicSearchArtist.A01;
        textView.setText(jx5.A01);
        this.A01.setText(jx5.A02);
        C63788L6u l6u = this.A03;
        l6u.A01 = musicSearchArtist;
        l6u.A00 = i;
        JYP.A00(this.A00, jx5.A00);
    }
}
