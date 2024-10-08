package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.model.ReactionViewModel;

/* renamed from: X.NOl  reason: case insensitive filesystem */
public final class C68589NOl extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C70690OGl A01;
    public final C74412PuS A02;
    public final boolean A03;
    public final UserSession A04;

    public C68589NOl(AnonymousClass0iw r2, UserSession userSession, C70690OGl oGl, C74412PuS puS, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A02 = puS;
        this.A04 = userSession;
        this.A00 = r2;
        this.A01 = oGl;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68055MzM(DbT.A0D(layoutInflater, viewGroup, R.layout.emoji_reaction_row, false));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.instagram.common.ui.widget.imageview.ConstrainedImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.instagram.common.ui.widget.imageview.ConstrainedImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r20, X.C249703kE r21) {
        /*
            r19 = this;
            r5 = r21
            r6 = r20
            com.instagram.direct.messagethread.reactions.model.ReactionViewModel r6 = (com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r6
            X.MzM r5 = (X.C68055MzM) r5
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r6, r5)
            android.widget.TextView r0 = r5.A01
            java.lang.String r10 = r6.A06
            r0.setText(r10)
            boolean r0 = r6.A08
            r7 = r19
            if (r0 == 0) goto L_0x012b
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x012b
            android.view.View r2 = r5.itemView
            r1 = 51
            X.Ok7 r0 = new X.Ok7
            r0.<init>((com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r6, (X.C68589NOl) r7, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            java.lang.String r12 = r1.getString(r0)
        L_0x0035:
            X.0qQ.A0A(r12)
            com.instagram.common.typedurl.ImageUrl r9 = r6.A01
            if (r9 == 0) goto L_0x0126
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2131959217(0x7f131db1, float:1.9555068E38)
            java.lang.String r11 = r6.A04
            java.lang.String r13 = X.DbW.A0h(r1, r11, r0)
        L_0x0049:
            android.view.View r8 = r5.itemView
            android.content.Context r1 = r8.getContext()
            r0 = 2131959221(0x7f131db5, float:1.9555076E38)
            r2 = 2
            java.lang.String r0 = X.DbV.A0u(r1, r10, r13, r0)
            r8.setContentDescription(r0)
            android.view.View r1 = r5.itemView
            X.MtI r0 = new X.MtI
            r0.<init>(r12, r2)
            X.03v.A0B(r1, r0)
            if (r11 == 0) goto L_0x0123
            X.7fS r0 = X.C317486nL.A04
            com.instagram.common.typedurl.SimpleImageUrl r8 = r0.A04(r11)
        L_0x006c:
            boolean r0 = r7.A03
            r2 = 8
            if (r0 != 0) goto L_0x011a
            if (r8 == 0) goto L_0x011a
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r13 = r5.A04
            r13.setVisibility(r4)
            X.0iw r0 = r7.A00
            r13.setUrl(r8, r0)
            if (r9 == 0) goto L_0x011d
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r17 = r1.getDimensionPixelSize(r0)
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r14 = r5.A05
            java.lang.String r15 = r6.A05
            java.lang.String r16 = X.JTP.A0o(r9)
            X.JvU r12 = new X.JvU
            r18 = r17
            r12.<init>((com.instagram.common.ui.widget.imageview.ConstrainedImageView) r13, (com.instagram.common.ui.widget.imageview.ConstrainedImageView) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17, (int) r18)
            X.OGl r11 = r7.A01
            if (r11 == 0) goto L_0x00c7
            java.util.Set r1 = r11.A04
            java.lang.String r0 = r12.A06
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x00c7
            java.util.Queue r0 = r11.A03
            r0.add(r12)
            X.4Co r0 = r11.A01
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L_0x00c7
        L_0x00b7:
            X.4Cq r10 = r11.A05
            r9 = 0
            r1 = 17
            X.MFR r0 = new X.MFR
            r0.<init>(r11, r9, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r10)
            r11.A01 = r0
        L_0x00c7:
            r5.A00 = r12
        L_0x00c9:
            com.instagram.common.typedurl.ImageUrl r9 = r6.A02
            if (r9 == 0) goto L_0x0114
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r5.A03
            r1.setVisibility(r4)
            X.0iw r0 = r7.A00
            r1.setUrl(r9, r0)
        L_0x00d7:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x010e
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r5.A02
            r0.setVisibility(r4)
            r0.setText(r1)
        L_0x00e7:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0144
            if (r8 == 0) goto L_0x0144
            r5.A01(r3)
            java.util.List r0 = r5.A06
            java.util.Iterator r2 = r0.iterator()
        L_0x00f6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0147
            java.lang.Object r0 = r2.next()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0iw r0 = r7.A00
            r1.setUrl(r8, r0)
            goto L_0x00f6
        L_0x010e:
            android.widget.TextView r0 = r5.A02
            r0.setVisibility(r2)
            goto L_0x00e7
        L_0x0114:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r5.A03
            r0.setVisibility(r2)
            goto L_0x00d7
        L_0x011a:
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r5.A04
            goto L_0x011f
        L_0x011d:
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r5.A05
        L_0x011f:
            r0.setVisibility(r2)
            goto L_0x00c9
        L_0x0123:
            r8 = 0
            goto L_0x006c
        L_0x0126:
            java.lang.String r13 = r6.A04
            r11 = r13
            goto L_0x0049
        L_0x012b:
            android.view.View r2 = r5.itemView
            r1 = 52
            X.Ok7 r0 = new X.Ok7
            r0.<init>((com.instagram.direct.messagethread.reactions.model.ReactionViewModel) r6, (X.C68589NOl) r7, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2131959222(0x7f131db6, float:1.9555078E38)
            java.lang.String r12 = X.DbW.A0h(r1, r10, r0)
            goto L_0x0035
        L_0x0144:
            r5.A01(r4)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68589NOl.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return ReactionViewModel.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r7) {
        C61030JvU jvU;
        C70690OGl oGl;
        String str;
        C68055MzM mzM = (C68055MzM) r7;
        if (mzM != null && (jvU = mzM.A00) != null && (oGl = this.A01) != null) {
            String str2 = jvU.A06;
            C70648OEv oEv = oGl.A00;
            if (oEv != null) {
                str = oEv.A00;
            } else {
                str = null;
            }
            if (0qQ.A0K(str2, str)) {
                C70648OEv oEv2 = oGl.A00;
                if (oEv2 != null) {
                    C71081Ob0.A00(oEv2.A01, oEv2.A02, oEv2.A03);
                }
                oGl.A00 = null;
            }
            oGl.A03.remove(jvU);
        }
    }
}
