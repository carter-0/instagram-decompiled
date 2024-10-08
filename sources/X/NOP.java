package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOP extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C74390Pu6 A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67940MxQ(DbU.A09(layoutInflater, viewGroup, R.layout.direct_store_sticker_tray_item, false));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r29, X.C249703kE r30) {
        /*
            r28 = this;
            r7 = r30
            r8 = r29
            X.N5l r8 = (X.C68196N5l) r8
            X.MxQ r7 = (X.C67940MxQ) r7
            r9 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r9, r8, r7)
            r0 = r28
            com.instagram.common.session.UserSession r10 = r0.A01
            X.0iw r12 = r0.A00
            com.instagram.model.direct.stickerstore.DirectStoreSticker r5 = r8.A02
            X.Jw2 r15 = r8.A01
            X.Pu6 r4 = r0.A02
            X.0qQ.A0B(r10, r9)
            X.0qQ.A0B(r12, r6)
            X.C51972G9s.A1C(r5, r4)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r7.A00
            android.content.Context r2 = r3.getContext()
            com.instagram.model.direct.stickerstore.TypedImageUrl r11 = r5.A01
            if (r11 != 0) goto L_0x002e
            com.instagram.model.direct.stickerstore.TypedImageUrl r11 = r5.A00
        L_0x002e:
            X.0r1 r1 = new X.0r1
            r1.<init>()
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x00bd
            X.0qQ.A0A(r2)
            boolean r0 = X.C247163fs.A00(r2)
            if (r0 != 0) goto L_0x00bd
            com.instagram.common.typedurl.ImageUrl r0 = r11.A00
            java.lang.String r12 = r5.A04
            java.lang.String r21 = X.JTP.A0o(r0)
            int r0 = X.JTR.A08(r2)
            float r11 = (float) r0
            android.content.res.Resources r13 = r2.getResources()
            r0 = 2131165315(0x7f070083, float:1.7944844E38)
            int r14 = r13.getDimensionPixelSize(r0)
            r13 = 1053609165(0x3ecccccd, float:0.4)
            r0 = 1065353216(0x3f800000, float:1.0)
            X.6tX r19 = X.C321066tW.A01(r2, r13, r0, r14)
            r0 = 2130971273(0x7f040a89, float:1.755128E38)
            int r25 = X.AnonymousClass7TF.A03(r2, r0)
            r0 = 2130971272(0x7f040a88, float:1.7551278E38)
            int r26 = X.AnonymousClass7TF.A03(r2, r0)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            r23 = 0
            X.6tR r0 = new X.6tR
            r22 = r12
            r24 = r11
            r27 = r9
            r18 = r10
            r17 = r2
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r7.A01
            r0.setCornerRadius(r9)
            r1.A00 = r6
        L_0x0093:
            r3.setVisibility(r9)
            java.lang.String r0 = r5.A02
            r3.setContentDescription(r0)
            X.2eS.A01(r3)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r7.A01
            X.3NG r0 = X.AnonymousClass7TE.A0m(r0)
            X.NQv r11 = new X.NQv
            r12 = r15
            r13 = r10
            r14 = r4
            r15 = r7
            r16 = r5
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.A04 = r11
            r0.A00()
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x00bc
            r8.A00 = r6
        L_0x00bc:
            return
        L_0x00bd:
            com.instagram.common.typedurl.ImageUrl r0 = r11.A00
            r3.setUrl(r0, r12)
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOP.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68196N5l.class;
    }

    public NOP(AnonymousClass0iw r1, UserSession userSession, C74390Pu6 pu6) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = pu6;
    }
}
