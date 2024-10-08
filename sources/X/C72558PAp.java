package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.PAp  reason: case insensitive filesystem */
public final class C72558PAp implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass7DZ A03;
    public final AnonymousClass9HC A04;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C72569PBa pBa = new C72569PBa(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_static_sticker_message, false));
        this.A03.A00(pBa);
        return pBa;
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r26, AnonymousClass7FW r27) {
        double d;
        C72569PBa pBa = (C72569PBa) r26;
        C328677Fs r5 = (C328677Fs) r27;
        boolean A1U = AnonymousClass7TF.A1U(0, pBa, r5);
        DirectMessageIdentifier directMessageIdentifier = r5.A01;
        String str = directMessageIdentifier.A00;
        if (str != null) {
            ((AnonymousClass7TJ) this.A02).CjC(str, r5.CU2());
        }
        ImageUrl imageUrl = r5.A00;
        String A0o = JTP.A0o(imageUrl);
        2FW Aqm = r5.Aqm();
        2FW r0 = 2FW.A0O;
        int i = R.dimen.clips_netego_card_width;
        if (Aqm == r0) {
            i = R.dimen.avatar_sticker_max_height;
        }
        IgProgressImageView igProgressImageView = pBa.A03;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        View view = pBa.A02;
        igImageView.setMaxHeight(AnonymousClass7TF.A02(view.getContext(), i));
        if (URLUtil.isContentUrl(A0o) || URLUtil.isFileUrl(A0o)) {
            Object tag = igProgressImageView.getTag();
            if (str == null || !str.equals(tag)) {
                igProgressImageView.A04();
                igProgressImageView.setTag(str);
                Context A0S = AnonymousClass7TE.A0S(igProgressImageView);
                String str2 = directMessageIdentifier.A01;
                UserSession userSession = this.A01;
                MYd A002 = AnonymousClass6FA.A00(userSession);
                String A003 = A002.A00(A0o);
                int width = imageUrl.getWidth();
                boolean z = r5.A03;
                int dimensionPixelSize = A0S.getResources().getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
                int A004 = AnonymousClass7PV.A00(A0S, false);
                if (width > A004) {
                    width = A004;
                }
                if (width < dimensionPixelSize) {
                    width = dimensionPixelSize;
                }
                if (z) {
                    d = 0.322d;
                } else {
                    d = 1.0d;
                }
                int i2 = (int) (((double) width) * d);
                if (A003 != null) {
                    igProgressImageView.setImageDrawable(C70049NwR.A00(A0S, userSession, new GifUrlImpl(A003, (float) imageUrl.getWidth(), (float) imageUrl.getHeight()), Integer.valueOf(i2), str2));
                } else if (!A002.A02(A0o)) {
                    A002.A01(A0o);
                    C70762OKi oKi = pBa.A00;
                    if (oKi != null) {
                        oKi.A00();
                    }
                    pBa.A00 = null;
                    pBa.A00 = ((C332827Wn) this.A02).CgK(new P9C(A0S, imageUrl, this, pBa, str2, i2), A0o);
                }
                String str3 = r5.A02;
                if (str3 != null) {
                    view.setContentDescription(AnonymousClass7TF.A0e(view.getResources(), str3, 2131959126));
                }
                03v.A0B(view, new C67703MtH(A1U ? 1 : 0));
                igProgressImageView.setEnableProgressBar(false);
            }
        } else {
            igProgressImageView.setUrl(this.A01, imageUrl, this.A00);
        }
        this.A03.A02(pBa, r5);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C72569PBa pBa = (C72569PBa) r3;
        0qQ.A0B(pBa, 0);
        pBa.A03.setTag((Object) null);
        this.A03.A01(pBa);
        C70762OKi oKi = pBa.A00;
        if (oKi != null) {
            oKi.A00();
        }
        pBa.A00 = null;
    }

    public C72558PAp(AnonymousClass0iw r12, UserSession userSession, AnonymousClass7XR r14, AnonymousClass9HC r15) {
        this.A01 = userSession;
        this.A02 = r14;
        this.A04 = r15;
        this.A00 = r12;
        boolean z = r15.A1X;
        C3265877j r1 = new C3265877j(z);
        P87 p87 = new P87(this);
        C3265977k A002 = r1.A00(r14);
        AnonymousClass7DV r6 = new AnonymousClass7DV((AnonymousClass7XX) r14, z);
        AnonymousClass7DX r3 = new AnonymousClass7DX((AnonymousClass7XN) r14);
        this.A03 = C66582MXn.A0Y(new C3266077l(r3, p87, A002, r6, (C333107Xr) r14, r15, (C3266177m) null, false), r1);
    }
}
