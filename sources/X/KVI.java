package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioBrowserCollectionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class KVI extends C60518Jmp {
    public final UserSession A00;
    public final View A01;
    public final TextView A02;
    public final AnonymousClass0iw A03;
    public final IgImageView A04;
    public final C252063oV A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVI(View view, AnonymousClass0iw r3, UserSession userSession) {
        super(view);
        0qQ.A0B(userSession, 2);
        this.A01 = view;
        this.A00 = userSession;
        this.A03 = r3;
        this.A02 = DbW.A0B(view, R.id.header_title);
        this.A04 = DbX.A0b(view, R.id.header_image);
        this.A05 = DbU.A0Z(view, R.id.header_subtitle_stub);
    }

    public final void A00(C62925Kod kod) {
        TextView textView;
        0qQ.A0B(kod, 0);
        this.A02.setText(((C61095Jx6) kod.A00).A03);
        String str = ((C61095Jx6) kod.A00).A02;
        C252063oV r1 = this.A05;
        if (str != null) {
            r1.getView().setVisibility(0);
            View view = r1.getView();
            if ((view instanceof TextView) && (textView = (TextView) view) != null) {
                textView.setText(str);
            }
        } else if (r1.CVM()) {
            r1.getView().setVisibility(8);
        }
        AnonymousClass0iw r2 = this.A03;
        if (r2 != null) {
            DbV.A1P(r2, this.A04, ((C61095Jx6) kod.A00).A01);
        }
        if (((C61095Jx6) kod.A00).A00 == AudioBrowserCollectionType.SPOTIFY_RECOMMENDATIONS) {
            UserSession userSession = this.A00;
            if (!AnonymousClass7TE.A0q(userSession).getBoolean("has_seen_spotify_audio_browser_upsell", false)) {
                Drawable drawable = JTQ.A06(this).getDrawable(R.drawable.instagram_app_spotify_pano_filled_24);
                if (drawable == null) {
                    drawable = new ColorDrawable(0);
                }
                Context A06 = JTQ.A06(this);
                DbX.A11(A06, drawable, 2Yu.A0H(A06, R.attr.igds_color_close_friends_gradient_start));
                F3t f3t = new F3t(JTQ.A06(this));
                f3t.A06 = AnonymousClass7TF.A0d(JTS.A07(this), 2131967749);
                f3t.A04 = AnonymousClass7TF.A0d(JTS.A07(this), 2131967750);
                f3t.A03(drawable);
                f3t.A05 = AnonymousClass05K.A0C;
                f3t.A02((DialogInterface.OnClickListener) null, AnonymousClass7TE.A16(JTQ.A06(this), 2131968772));
                try {
                    f3t.A01();
                    DbX.A1V(AnonymousClass7TE.A0q(userSession), "has_seen_spotify_audio_browser_upsell", true);
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }
    }
}
