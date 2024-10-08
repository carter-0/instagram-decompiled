package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class PMK implements C74361Ptb {
    public Bitmap A00;
    public C68295N9i A01;
    public final View A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C72981PRo A05;
    public final IgProgressImageView A06;
    public final C70942OSp A07;
    public final MediaFrameLayout A08;
    public final View A09;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADN(X.C68295N9i r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x0018
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A06
            r0.A04()
            r4.A00()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r4.A08
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0018:
            X.N9i r0 = r4.A01
            if (r0 == 0) goto L_0x007d
            java.lang.String r1 = r0.A0D
        L_0x001e:
            java.lang.String r0 = r5.A0D
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x0029
            r4.A00()
        L_0x0029:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r4.A08
            float r0 = r5.A00
            r1.A00 = r0
            com.instagram.feed.widget.IgProgressImageView r3 = r4.A06
            r3.setAspectRatio(r0)
            boolean r0 = r5.A0T
            android.view.View r1 = r4.A02
            X.0qQ.A06(r1)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.graphics.Bitmap r1 = r5.A04
            if (r1 == 0) goto L_0x007a
            android.graphics.Bitmap r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005b
            r0 = 3
            com.instagram.common.ui.blur.BlurUtil.blurInPlace(r1, r0)
            r3.setImageBitmap(r1)
            r3.setEnableProgressBar(r2)
        L_0x0058:
            r3.setVisibility(r2)
        L_0x005b:
            r4.A00 = r1
            float r0 = r5.A01
            r3.setAlpha(r0)
            com.instagram.common.typedurl.ImageUrl r2 = r5.A07
            if (r2 == 0) goto L_0x0077
            boolean r1 = r5.A0L
            X.0iw r0 = r4.A03
            r3.setUrl(r2, r0)
            r3.setEnableProgressBar(r1)
            r0 = 0
        L_0x0071:
            r3.setVisibility(r0)
            r4.A01 = r5
            return
        L_0x0077:
            r0 = 8
            goto L_0x0071
        L_0x007a:
            r2 = 8
            goto L_0x0058
        L_0x007d:
            r1 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMK.ADN(X.N9i):void");
    }

    public final void A00() {
        IgProgressImageView igProgressImageView;
        int i;
        C72981PRo pRo = this.A05;
        C14044Tol tol = pRo.A01;
        if (tol != null) {
            tol.A0D("hide", true);
        }
        C66582MXn.A1K(pRo.A04);
        C72981PRo.A00(pRo);
        C14044Tol tol2 = pRo.A01;
        if (tol2 != null) {
            tol2.A0B("hide");
        }
        pRo.A01 = null;
        C72981PRo.A00(pRo);
        C68295N9i n9i = this.A01;
        if (n9i != null) {
            ImageUrl imageUrl = n9i.A07;
            if (imageUrl != null) {
                boolean z = n9i.A0L;
                igProgressImageView = this.A06;
                igProgressImageView.setUrl(imageUrl, this.A03);
                igProgressImageView.setEnableProgressBar(z);
                i = 0;
            } else {
                igProgressImageView = this.A06;
                0qQ.A06(igProgressImageView);
                i = 8;
            }
            igProgressImageView.setVisibility(i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.OOq, java.lang.Object] */
    public PMK(View view, AnonymousClass0iw r6, UserSession userSession) {
        this.A09 = view;
        this.A03 = r6;
        this.A04 = userSession;
        this.A08 = (MediaFrameLayout) view.findViewById(R.id.cowatch_media_container);
        this.A02 = view.findViewById(R.id.cowatch_loading_spinner);
        this.A06 = (IgProgressImageView) view.findViewById(R.id.cowatch_image_view);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A07 = new C70942OSp(A0S);
        if (AnonymousClass1pW.A00 == null) {
            0qQ.A0F("plugin");
            throw AnonymousClass00P.createAndThrow();
        }
        Activity activity = (Activity) A0S;
        0qQ.A0B(activity, 0);
        C72981PRo pRo = new C72981PRo(activity, A0S, userSession, new Object());
        this.A05 = pRo;
        pRo.A00 = new C72275Ozk(this);
    }
}
