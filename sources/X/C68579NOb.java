package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NOb  reason: case insensitive filesystem */
public final class C68579NOb extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final X41 A02;
    public final X9Q A03;
    public final C17264VOr A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A0D = DbT.A0D(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.card_search_item, false);
        A0D.setTag(new C68077Mzi(A0D));
        return new C68077Mzi(A0D);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r17, X.C249703kE r18) {
        /*
            r16 = this;
            r1 = r18
            r14 = r17
            X.Ncn r14 = (X.C69011Ncn) r14
            X.Mzi r1 = (X.C68077Mzi) r1
            r5 = 0
            boolean r15 = X.AnonymousClass7TF.A1U(r5, r14, r1)
            r0 = r16
            X.X41 r10 = r0.A02
            com.instagram.igds.components.imagebutton.IgImageButton r11 = r1.A02
            X.5qq r13 = r14.A02
            X.5qz r12 = r14.A01
            r10.ECL(r11, r12, r13, r14, r15)
            com.instagram.common.session.UserSession r8 = r0.A01
            X.VOr r10 = r0.A04
            X.0iw r9 = r0.A00
            X.X9Q r4 = r0.A03
            X.0qQ.A0B(r8, r5)
            r7 = 2
            X.C51973G9u.A0r(r7, r10, r9, r4)
            X.1Xj r3 = r14.A02
            float r6 = r14.A00
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0036
            float r6 = r3.A0l()
        L_0x0036:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = r1.A03
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = (int) r0
            r2.width = r0
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r2 = r1.A01
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x0052
            r2.setVideoSource(r3, r9)
        L_0x0052:
            r2.setAspectRatio(r6)
            r2 = 29
            X.WB4 r0 = new X.WB4
            r0.<init>(r2, r10, r3, r14)
            X.AnonymousClass0fU.A00(r0, r11)
            r11.A00 = r6
            r11.setVisibility(r5)
            com.instagram.common.typedurl.ImageUrl r0 = r3.A1Q()
            if (r0 == 0) goto L_0x00b3
            r11.A0F(r9, r0, r5)
            android.widget.ImageView r2 = r1.A00
            X.0qQ.A0B(r2, r7)
            r2.setVisibility(r5)
            boolean r0 = X.C243203Xv.A00(r8, r3)
            if (r0 == 0) goto L_0x008c
            X.6uM r0 = X.C321546uM.A0M
        L_0x007d:
            int r0 = r0.A03
            r2.setImageResource(r0)
        L_0x0082:
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x008b
            r4.E6t(r1, r3)
        L_0x008b:
            return
        L_0x008c:
            boolean r0 = r3.A56()
            if (r0 == 0) goto L_0x0095
            X.6uM r0 = X.C321546uM.A08
            goto L_0x007d
        L_0x0095:
            boolean r0 = r3.CeS()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r3.A5G()
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r3.A5I()
            if (r0 != 0) goto L_0x00aa
            X.6uM r0 = X.C321546uM.A0N
            goto L_0x007d
        L_0x00aa:
            X.6uM r0 = X.C321546uM.A0K
            goto L_0x007d
        L_0x00ad:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0082
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68579NOb.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C69011Ncn.class;
    }

    public C68579NOb(AnonymousClass0iw r1, UserSession userSession, X41 x41, X9Q x9q, C17264VOr vOr) {
        this.A04 = vOr;
        this.A01 = userSession;
        this.A03 = x9q;
        this.A00 = r1;
        this.A02 = x41;
    }
}
