package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAg  reason: case insensitive filesystem */
public final class C72549PAg implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7XA A02;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0062, code lost:
        if (r0 == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r16, X.AnonymousClass7FW r17) {
        /*
            r15 = this;
            r3 = r17
            r8 = r16
            X.PBj r8 = (X.C72578PBj) r8
            X.NYX r3 = (X.NYX) r3
            android.widget.FrameLayout r2 = r8.A05
            android.content.Context r13 = r2.getContext()
            X.7FE r0 = r3.A02
            X.3Us r0 = X.C71049OaR.A00(r0, r8)
            if (r0 == 0) goto L_0x0029
            float[] r7 = r0.A01
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r6 = r8.A0K
            r0 = 0
            r5 = r7[r0]
            r0 = 2
            r4 = r7[r0]
            r0 = 4
            r1 = r7[r0]
            r0 = 6
            r0 = r7[r0]
            r6.A01(r5, r4, r1, r0)
        L_0x0029:
            X.9Iu r1 = r3.A00
            com.instagram.common.session.UserSession r7 = r15.A01
            X.0iw r6 = r15.A00
            X.C71049OaR.A01(r1, r6, r7, r8)
            X.Nop r10 = r3.A03
            X.0eM r0 = r3.A05
            java.lang.Object r11 = r0.getValue()
            com.instagram.model.direct.messageid.DirectMessageIdentifier r11 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r11
            boolean r12 = X.AnonymousClass7TF.A1V(r1)
            r9 = 0
            X.C71049OaR.A02(r6, r7, r8, r9, r10, r11, r12)
            X.Noq r12 = r3.A04
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165265(0x7f070051, float:1.7944742E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r4.width = r1
            boolean r0 = r10 instanceof X.C68863NZv
            if (r0 == 0) goto L_0x0097
            X.NZv r10 = (X.C68863NZv) r10
            boolean r0 = r10.A03
        L_0x005f:
            r3 = 1059363750(0x3f249ba6, float:0.643)
            if (r0 != 0) goto L_0x0066
        L_0x0064:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0066:
            float r0 = (float) r1
            float r0 = r0 / r3
            int r0 = (int) r0
            r4.height = r0
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r8.A0K
            r0.A00 = r3
            com.instagram.feed.widget.IgProgressImageView r1 = r8.A0I
            r1.setAspectRatio(r3)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            r2.setLayoutParams(r4)
            android.view.View r0 = r8.A04
            r11 = 8
            r0.setVisibility(r11)
            r0 = 2131239184(0x7f082110, float:1.8094668E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            r1.setProgressBarDrawable(r0)
            X.Ojz r10 = new X.Ojz
            r14 = r8
            r10.<init>((int) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15)
            X.AnonymousClass0fU.A00(r10, r1)
            return
        L_0x0097:
            boolean r0 = r10 instanceof X.C68864NZw
            if (r0 == 0) goto L_0x0064
            X.NZw r10 = (X.C68864NZw) r10
            boolean r0 = r10.A06
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72549PAg.ADp(X.7Db, X.7FW):void");
    }

    public C72549PAg(AnonymousClass0iw r1, UserSession userSession, AnonymousClass7XA r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_media_share_message);
        AnonymousClass7PV.A01(A0C);
        return new C72578PBj(A0C);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r1) {
    }
}
