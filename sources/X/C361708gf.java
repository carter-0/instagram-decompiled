package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8gf  reason: invalid class name and case insensitive filesystem */
public final class C361708gf extends C232222tE {
    public final AnonymousClass9IV A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C361698ge A03;
    public final C62320sa A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        C361698ge r4 = this.A03;
        UserSession userSession = this.A02;
        AnonymousClass9IV r2 = this.A00;
        0qQ.A0B(r4, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r2, 4);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        return new C60697Jpi((ConstraintLayout) inflate, r2, userSession, r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        if (r14.A09 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        if (r2 != -1) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r14, X.C249703kE r15) {
        /*
            r13 = this;
            X.8gh r14 = (X.C361728gh) r14
            X.Jpi r15 = (X.C60697Jpi) r15
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r7 = 1
            X.0qQ.A0B(r15, r7)
            X.0iw r1 = r13.A01
            com.instagram.common.session.UserSession r2 = r13.A02
            X.0sa r12 = r13.A04
            X.9IV r9 = r13.A00
            X.8ge r0 = r13.A03
            X.MIb r10 = new X.MIb
            r10.<init>(r0)
            r6 = 0
            r0 = 2
            X.0qQ.A0B(r1, r0)
            r5 = 3
            X.0qQ.A0B(r2, r5)
            r4 = 4
            X.0qQ.A0B(r12, r4)
            r0 = 5
            X.0qQ.A0B(r9, r0)
            r15.A00 = r14
            com.instagram.common.session.UserSession r11 = r15.A07
            com.instagram.common.gallery.model.GalleryItem r0 = r14.A03
            com.instagram.common.gallery.RemoteMedia r3 = r0.A04
            if (r3 == 0) goto L_0x0121
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r3.A02
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r0.A00
            if (r0 == 0) goto L_0x0121
            java.lang.String r8 = r0.A00
        L_0x003e:
            java.lang.Object r0 = r12.invoke()
            X.4yO r0 = (X.C279284yO) r0
            r12 = 0
            if (r8 == 0) goto L_0x004e
            boolean r0 = X.C39600A1q.A00(r11, r0, r6)
            if (r0 == 0) goto L_0x004e
            r12 = 1
        L_0x004e:
            r8 = 8
            com.instagram.common.ui.base.IgSimpleImageView r11 = r15.A09
            if (r12 == 0) goto L_0x011c
            r11.setVisibility(r6)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r15.A06
            android.content.Context r12 = r0.getContext()
            r0 = 2131238191(0x7f081d2f, float:1.8092654E38)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
            r11.setImageDrawable(r0)
        L_0x0067:
            com.instagram.common.ui.base.IgSimpleImageView r11 = r15.A08
            r11.setVisibility(r6)
            if (r3 == 0) goto L_0x0119
            int r0 = r3.A01
        L_0x0070:
            boolean r12 = X.AJ5.A06(r2, r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r15.A06
            android.content.Context r3 = r2.getContext()
            r0 = 2131231426(0x7f0802c2, float:1.8078933E38)
            if (r12 == 0) goto L_0x0082
            r0 = 2131231427(0x7f0802c3, float:1.8078935E38)
        L_0x0082:
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r11.setImageDrawable(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r15.A0A
            X.AZJ r0 = new X.AZJ
            r0.<init>(r15, r14, r10)
            r3.A0E = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setScaleX(r0)
            r3.setScaleY(r0)
            r2.setScaleX(r0)
            r2.setScaleY(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r14.A04
            r3.A0F(r1, r0, r7)
            X.JVy r0 = r15.A0C
            int r2 = r14.A02
            r0.A00(r2)
            android.widget.ImageView r0 = r15.A04
            boolean r1 = r14.A08
            if (r1 == 0) goto L_0x00b3
            r8 = 0
        L_0x00b3:
            r0.setVisibility(r8)
            java.lang.Object r0 = r9.A00
            X.9Ig r0 = (X.C376509Ig) r0
            java.lang.Object r0 = r0.A04
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x0107
            if (r0 != r6) goto L_0x0124
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x010d
        L_0x00ca:
            boolean r2 = r15.A01
            android.view.View r0 = r15.A03
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r2)
        L_0x00d6:
            r15.A01 = r6
            android.content.res.Resources r2 = r3.getResources()
            int r0 = r14.A01
            android.widget.TextView r1 = r15.A05
            if (r0 != r5) goto L_0x0100
            r1.setVisibility(r6)
            int r0 = r14.A00
            java.lang.String r0 = X.C347917xa.A01(r0)
            r1.setText(r0)
            r0 = 2131976521(0x7f136149, float:1.9590165E38)
        L_0x00f1:
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            X.0sP r1 = r14.A07
            java.lang.String r0 = r14.A05
            r1.invoke(r0)
            return
        L_0x0100:
            r1.setVisibility(r4)
            r0 = 2131969421(0x7f13458d, float:1.9575764E38)
            goto L_0x00f1
        L_0x0107:
            if (r1 == 0) goto L_0x010d
            r0 = -1
            if (r2 == r0) goto L_0x010d
            goto L_0x00ca
        L_0x010d:
            boolean r1 = r15.A01
            android.view.View r0 = r15.A03
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r1)
            goto L_0x00d6
        L_0x0119:
            r0 = 0
            goto L_0x0070
        L_0x011c:
            r11.setVisibility(r8)
            goto L_0x0067
        L_0x0121:
            r8 = 0
            goto L_0x003e
        L_0x0124:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361708gf.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C361728gh.class;
    }

    public C361708gf(AnonymousClass9IV r1, AnonymousClass0iw r2, UserSession userSession, C361698ge r4, C62320sa r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = r1;
        this.A04 = r5;
    }
}
