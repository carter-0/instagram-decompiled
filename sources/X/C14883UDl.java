package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UDl  reason: case insensitive filesystem */
public final class C14883UDl extends C249703kE {
    public final int A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C14901UEg A04;

    public C14883UDl(View view) {
        super(view);
        Context context = view.getContext();
        Resources resources = context.getResources();
        C14901UEg uEg = new C14901UEg(view, R.layout.question_response_item_music);
        this.A04 = uEg;
        View view2 = uEg.A05;
        ImageView A0F = DbU.A0F(view2, R.id.album_art);
        this.A01 = A0F;
        this.A03 = AnonymousClass7TE.A0d(view2, R.id.track_title);
        this.A02 = AnonymousClass7TE.A0d(view2, R.id.artist_name);
        A0F.setImageDrawable(new GIH(context, (GJO) null, resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin), resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0, 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 1, false));
        this.A00 = context.getColor(R.color.countdown_sticker_title_text_color);
    }
}
