package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class WZE implements C66495MTy {
    public final int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;
    public final C65505LuT A08;
    public final GVO A09;
    public final VTH A0A;
    public final Us7 A0B;
    public final Us7 A0C;
    public final Us7 A0D;
    public final Handler A0E = AnonymousClass7TF.A0D();
    public final Runnable A0F = new C20061WkL(this);

    public WZE(View view, UserSession userSession, AnonymousClass4DU r23, C234462xu r24) {
        View view2 = view;
        Context context = view2.getContext();
        Resources resources = context.getResources();
        this.A02 = view2;
        View requireViewById = view2.requireViewById(R.id.music_player);
        this.A03 = requireViewById;
        this.A08 = new C65505LuT(requireViewById, userSession, r23, this, r24);
        VTH vth = new VTH(view2);
        this.A0A = vth;
        this.A09 = new GVO(vth.A01, context.getColor(R.color.direct_light_mode_glyph_color_tertiary));
        ImageView A0F2 = DbU.A0F(view2, R.id.album_art);
        this.A04 = A0F2;
        A0F2.setImageDrawable(new GIH(context, (GJO) null, resources.getDimensionPixelSize(R.dimen.avatar_sticker_max_height), AnonymousClass7TE.A0E(resources), 0, 0, resources.getDimensionPixelSize(R.dimen.accent_edge_thickness), 1, false));
        this.A01 = view2.requireViewById(R.id.artist_profile_container);
        this.A07 = DbT.A0b(view2, R.id.artist_profile_pic);
        this.A05 = DbU.A0G(view2, R.id.artist_profile_username);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        this.A0C = C13990Tnq.A0Y(view2, R.id.message_button);
        this.A0D = C13990Tnq.A0Y(view2, R.id.share_button);
        this.A0B = C13990Tnq.A0Y(view2, R.id.delete_button);
        this.A06 = DbU.A0G(view2, R.id.text_response);
        this.A00 = JTP.A03(resources);
    }

    public final void DT9() {
        this.A0E.postDelayed(this.A0F, 1000);
    }

    public final void DTA() {
        this.A0E.removeCallbacks(this.A0F);
        this.A09.A00(false);
    }
}
