package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class PB3 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final Context A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new PBM(DbU.A0A(layoutInflater, viewGroup, R.layout.message_content_sticker_reaction_to_expired_reel, false));
    }

    public static final Drawable A00(PB3 pb3, String str) {
        Context context = pb3.A03;
        UserSession userSession = pb3.A01;
        return C320996tP.A02(context, userSession, str, context.getResources().getDimensionPixelSize(R.dimen.ar_effect_option_icon_size), AnonymousClass7TF.A02(context, R.dimen.ar_effect_option_icon_size), C63282KuR.A00(userSession));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final /* bridge */ /* synthetic */ void ADp(C328007Db r8, AnonymousClass7FW r9) {
        String url;
        Drawable A002;
        PBM pbm = (PBM) r8;
        NYP nyp = (NYP) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, pbm, nyp);
        AnonymousClass7XR r3 = this.A02;
        UserSession userSession = this.A01;
        ImageUrl imageUrl = nyp.A00;
        if (imageUrl == null || (url = imageUrl.getUrl()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        ? r2 = pbm.A01;
        r2.setVisibility(0);
        if (C66580MXl.A1a("msys://ae-media", 1, url)) {
            C70440O6r o6r = pbm.A00;
            if (o6r != null) {
                o6r.A00.set(A1U);
            }
            pbm.A00 = null;
            pbm.A00 = ((AnonymousClass7X5) r3).Cg8(new P91(r2, this, pbm), url);
            return;
        }
        if (URLUtil.isContentUrl(url) || URLUtil.isFileUrl(url)) {
            MYd A003 = AnonymousClass6FA.A00(userSession);
            String A004 = A003.A00(url);
            if (A004 != null) {
                A002 = A00(this, A004);
            } else if (!A003.A02(url)) {
                A003.A01(url);
                ((C332827Wn) r3).CgK(new P99(r2, this), url);
                return;
            } else {
                return;
            }
        } else {
            A002 = A00(this, url);
        }
        r2.setImageDrawable(A002);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        PBM pbm = (PBM) r3;
        0qQ.A0B(pbm, 0);
        IgImageView igImageView = pbm.A01;
        igImageView.setVisibility(8);
        igImageView.A09();
    }

    public PB3(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass7XR r4) {
        this.A03 = context;
        this.A02 = r4;
        this.A01 = userSession;
        this.A00 = r2;
    }
}
