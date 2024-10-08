package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PAh  reason: case insensitive filesystem */
public final class C72550PAh implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7XR A01;
    public final AnonymousClass7DZ A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.direct_product_share_message, false);
        AnonymousClass7PV.A01(A0A);
        03v.A0B(A0A, new U7M(viewGroup, 7));
        C72575PBg pBg = new C72575PBg(A0A);
        this.A02.A00(pBg);
        return pBg;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A02.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r8, AnonymousClass7FW r9) {
        C72575PBg pBg = (C72575PBg) r8;
        C68818NYc nYc = (C68818NYc) r9;
        boolean A1U = AnonymousClass7TF.A1U(0, pBg, nYc);
        AnonymousClass7FE r1 = nYc.A01;
        FrameLayout frameLayout = pBg.A01;
        Object value = r1.A05.getValue();
        if (value != null) {
            C3265577g.A06((Drawable) value, frameLayout, r1, A1U);
            N3T n3t = nYc.A02;
            if (n3t != null) {
                IgProgressImageView igProgressImageView = pBg.A07;
                igProgressImageView.setVisibility(0);
                igProgressImageView.setForeground(igProgressImageView.getContext().getDrawable(R.drawable.bubble_border_square));
                float A022 = C229632nm.A02(n3t.A00, 0.8f, 1.91f);
                pBg.A08.A00 = A022;
                igProgressImageView.setAspectRatio(A022);
                igProgressImageView.setExpiration(n3t.A01);
                igProgressImageView.setUrl(n3t.A02, this.A00);
            } else {
                pBg.A07.setVisibility(8);
            }
            IgImageView igImageView = pBg.A06;
            igImageView.setContentDescription(DbW.A0h(frameLayout.getContext(), nYc.A05, 2131959132));
            ImageUrl imageUrl = nYc.A00;
            if (imageUrl != null) {
                igImageView.setUrl(imageUrl, this.A00);
            } else {
                igImageView.A09();
            }
            TextView textView = pBg.A05;
            textView.setText(nYc.A04);
            textView.setTypeface(textView.getTypeface(), A1U ? 1 : 0);
            pBg.A03.setText(nYc.A03);
            pBg.A02.post(new C73315Paa(this, pBg, nYc));
            this.A02.A02(pBg, nYc);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C72550PAh(AnonymousClass0iw r11, AnonymousClass7XR r12, AnonymousClass9HC r13) {
        this.A01 = r12;
        this.A00 = r11;
        boolean z = r13.A1X;
        C3265877j r0 = new C3265877j(z);
        C3265977k A002 = r0.A00(r12);
        AnonymousClass7DV r5 = new AnonymousClass7DV((AnonymousClass7XX) r12, z);
        this.A02 = C66582MXn.A0Y(new C3266077l((AnonymousClass7DX) null, new P84(this), A002, r5, (C333107Xr) r12, r13, (C3266177m) null, false), r0);
    }
}
