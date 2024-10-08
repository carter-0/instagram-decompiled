package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.TsL  reason: case insensitive filesystem */
public final class C14238TsL extends 2Rw {
    public int A00 = R.drawable.floating_button_background;
    public Integer A01;
    public boolean A02;
    public final View.OnClickListener A03 = new WB8((Object) this, 27);
    public final UserSession A04;
    public final X3Z A05;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        IgTextView igTextView;
        C14239TsM tsM = (C14239TsM) r6;
        AnonymousClass0fU.A00(this.A03, tsM.A01);
        IgImageView igImageView = tsM.A03;
        Resources resources = igImageView.getResources();
        int intValue = this.A01.intValue();
        int i2 = 8;
        if (intValue == 1) {
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 0);
            boolean booleanValue = C306096Kt.A00(userSession).booleanValue();
            int i3 = R.drawable.instagram_sparkles_outline_16;
            if (booleanValue) {
                i3 = R.drawable.instagram_effects_pano_outline_16;
            }
            igImageView.setImageResource(i3);
            DbT.A1A(resources, igImageView, 2131961548);
            tsM.A00.setBackgroundResource(R.drawable.floating_button_black_background);
            igImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            igTextView = tsM.A02;
            if (this.A02) {
                i2 = 0;
            }
        } else if (intValue == 0) {
            igImageView.setImageResource(R.drawable.instagram_x_filled_small);
            DbT.A1A(resources, igImageView, 2131954722);
            tsM.A00.setBackgroundResource(this.A00);
            igImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            igTextView = tsM.A02;
        } else {
            return;
        }
        igTextView.setVisibility(i2);
    }

    public C14238TsL(UserSession userSession, X3Z x3z) {
        this.A04 = userSession;
        this.A05 = x3z;
        this.A01 = AnonymousClass05K.A00;
    }

    public final int getItemCount() {
        AnonymousClass0fD.A0A(843534127, AnonymousClass0fD.A03(584279080));
        return 1;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14239TsM(DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.floating_button_layout));
    }
}
