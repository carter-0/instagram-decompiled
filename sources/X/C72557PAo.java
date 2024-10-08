package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAo  reason: case insensitive filesystem */
public final class C72557PAo implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XR A02;
    public final AnonymousClass7DZ A03;
    public final AnonymousClass9HC A04;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.direct_coauthor_posts_invite, false);
        AnonymousClass7PV.A01(A0A);
        PBZ pbz = new PBZ(A0A);
        this.A03.A00(pbz);
        return pbz;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A03.A01(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (0.8f < r3) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r10, X.AnonymousClass7FW r11) {
        /*
            r9 = this;
            X.PBZ r10 = (X.PBZ) r10
            X.NYK r11 = (X.NYK) r11
            r6 = 0
            boolean r8 = X.AnonymousClass7TF.A1U(r6, r10, r11)
            float r3 = r11.A00
            r2 = 1072986849(0x3ff47ae1, float:1.91)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r2 = r3
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r10.A03
            r0.A00 = r1
            com.instagram.feed.widget.IgProgressImageView r4 = r10.A02
            r4.setAspectRatio(r1)
            boolean r0 = r11.A04
            r7 = 8
            if (r0 != 0) goto L_0x004d
            X.3oV r0 = r10.A01
            r0.setVisibility(r7)
        L_0x002f:
            X.7FE r0 = r11.A03
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.getIgImageView()
            X.77D r0 = X.C3265577g.A05(r1, r0)
            r1.setImageRendererAndReset(r0)
            com.instagram.common.typedurl.ImageUrl r2 = r11.A01
            if (r2 == 0) goto L_0x0047
            com.instagram.common.session.UserSession r1 = r9.A01
            X.0iw r0 = r9.A00
            r4.setUrl(r1, r2, r0)
        L_0x0047:
            X.7DZ r0 = r9.A03
            r0.A02(r10, r11)
            return
        L_0x004d:
            X.3oV r2 = r10.A01
            r2.setVisibility(r6)
            android.view.View r1 = r2.getView()
            r0 = 31
            X.C71408Ok7.A00(r1, r0, r9, r11)
            X.7FE r0 = r11.A03
            int r5 = X.C3265577g.A00(r0)
            android.view.View r0 = r2.getView()
            android.graphics.drawable.Drawable r3 = r0.getBackground()
            java.lang.String r0 = X.C273654mx.A00(r6)
            X.0qQ.A0C(r3, r0)
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            float[] r2 = new float[r7]
            r1 = 0
            r2[r6] = r1
            r2[r8] = r1
            r0 = 2
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            r0 = 4
            float r1 = (float) r5
            r2[r0] = r1
            r0 = 5
            r2[r0] = r1
            r0 = 6
            r2[r0] = r1
            r0 = 7
            r2[r0] = r1
            r3.setCornerRadii(r2)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72557PAo.ADp(X.7Db, X.7FW):void");
    }

    public C72557PAo(AnonymousClass0iw r11, UserSession userSession, AnonymousClass7XR r13, AnonymousClass9HC r14) {
        this.A02 = r13;
        this.A04 = r14;
        this.A00 = r11;
        this.A01 = userSession;
        boolean z = r14.A1X;
        C3265877j r0 = new C3265877j(z);
        C3265977k A002 = r0.A00(r13);
        AnonymousClass7DV r5 = new AnonymousClass7DV((AnonymousClass7XX) r13, z);
        this.A03 = C66582MXn.A0Y(new C3266077l((AnonymousClass7DX) null, new C72489P7y(this), A002, r5, (C333107Xr) r13, r14, (C3266177m) null, false), r0);
    }
}
