package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.Jpc  reason: case insensitive filesystem */
public final class C60691Jpc extends C249703kE {
    public static C355298Pl A0B;
    public static C355298Pl A0C;
    public C60999Juv A00;
    public C60999Juv A01;
    public final float A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final L0T A07;
    public final AnonymousClass89v A08;
    public final FilmstripTimelineView A09;
    public final boolean A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60691Jpc(android.view.View r18, X.L0S r19, X.L0T r20, X.AnonymousClass89v r21, boolean r22) {
        /*
            r17 = this;
            r4 = r18
            r5 = r17
            r5.<init>(r4)
            r0 = r21
            r5.A08 = r0
            r6 = r22
            r5.A0A = r6
            r8 = r20
            r5.A07 = r8
            r0 = 2131432846(0x7f0b158e, float:1.848746E38)
            android.view.View r16 = r4.findViewById(r0)
            r14 = r16
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r14 = (com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView) r14
            r0 = 2131237291(0x7f0819ab, float:1.8090828E38)
            r7 = 0
            X.8Pm r1 = r14.A0B
            android.content.res.Resources r2 = r14.getResources()
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0, r7)
            r1.setForeground(r0)
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r14.setSeekerWidth(r0)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r2.getDimensionPixelSize(r1)
            r14.setCornerRadius(r0)
            r3 = 0
            r14.setClipChildren(r3)
            r14.setInnerContainerClipChildren(r3)
            r14.A01 = r6
            r14.A02 = r6
            r11 = 0
            r15 = 0
            r9 = 0
            r10 = 0
            int r0 = r2.getDimensionPixelSize(r1)
            int r13 = r14.A06
            int r12 = r14.A04
            boolean r1 = r14.A01
            if (r1 == 0) goto L_0x0062
            int r15 = r14.A05
            android.graphics.drawable.Drawable r11 = r14.A07
        L_0x0062:
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x006a
            int r10 = r14.A05
            android.graphics.drawable.Drawable r9 = r14.A07
        L_0x006a:
            X.8Ps r6 = r14.A0A
            r2 = -1
            X.8Px r1 = new X.8Px
            r1.<init>(r2, r0, r13, r3)
            if (r15 <= 0) goto L_0x007f
            X.9kW r0 = new X.9kW
            r0.<init>(r15, r2)
            r0.A00(r11, r3)
            r1.A08(r0)
        L_0x007f:
            if (r10 <= 0) goto L_0x008c
            X.9kW r0 = new X.9kW
            r0.<init>(r10, r2)
            r0.A00(r9, r13)
            r1.A09(r0)
        L_0x008c:
            r1.A06(r12)
            X.JTT.A1J(r1, r6)
            r6.invalidate()
            X.0qQ.A07(r16)
            r5.A09 = r14
            r0 = 2131443771(0x7f0b403b, float:1.850962E38)
            android.widget.TextView r0 = X.DbW.A0B(r4, r0)
            r5.A06 = r0
            r0 = 2131430086(0x7f0b0ac6, float:1.8481863E38)
            android.view.View r2 = X.AnonymousClass7TE.A0b(r4, r0)
            r5.A04 = r2
            r0 = 2131432387(0x7f0b13c3, float:1.848653E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r4, r0)
            r5.A03 = r0
            java.lang.Integer r0 = r8.A00
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.intValue()
            android.view.View r7 = r4.findViewById(r0)
        L_0x00c1:
            r5.A05 = r7
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r4)
            r0 = 8
            float r0 = X.0nA.A04(r1, r0)
            r5.A02 = r0
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00e4
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x00e4
            r4.setClipChildren(r3)
            X.LYH r0 = new X.LYH
            r1 = r19
            r0.<init>(r1)
            r4.setOnDragListener(r0)
        L_0x00e4:
            X.2eS.A01(r2)
            r5.A02(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60691Jpc.<init>(android.view.View, X.L0S, X.L0T, X.89v, boolean):void");
    }

    public static final void A00(C60999Juv juv, C60691Jpc jpc) {
        if (juv != null) {
            jpc.A09.setGeneratedVideoTimelineBitmaps(juv);
            return;
        }
        FilmstripTimelineView filmstripTimelineView = jpc.A09;
        AnonymousClass89v r0 = jpc.A08;
        filmstripTimelineView.setGeneratedVideoTimelineBitmaps(new C60999Juv((double[]) null, 0, r0.A02, r0.A01, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if ((r4 instanceof X.AnonymousClass8RX) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass8RH r4, int r5) {
        /*
            r3 = this;
            android.widget.TextView r2 = r3.A06
            r0 = -2
            if (r5 != r0) goto L_0x0015
            boolean r0 = r4 instanceof X.AnonymousClass8RG
            if (r0 == 0) goto L_0x0010
            r0 = r4
            X.8RG r0 = (X.AnonymousClass8RG) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0015
        L_0x0010:
            boolean r1 = r4 instanceof X.AnonymousClass8RX
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60691Jpc.A01(X.8RH, int):void");
    }

    public final void A02(boolean z) {
        FilmstripTimelineView filmstripTimelineView = this.A09;
        filmstripTimelineView.setActivated(z);
        filmstripTimelineView.setAlpha(1.0f);
        Context A0S = AnonymousClass7TE.A0S(filmstripTimelineView);
        0qQ.A0B(this.A07, 1);
        C355298Pl r1 = A0B;
        if (r1 == null) {
            r1 = new C40666Agg(A0S, 0);
            A0B = r1;
        }
        filmstripTimelineView.setMeasureSpecBuilder(r1);
        filmstripTimelineView.setShowTrimmer(false);
        filmstripTimelineView.setShowSeekbar(false);
        filmstripTimelineView.A03(false, false, false);
        filmstripTimelineView.setScaleX(1.0f);
        filmstripTimelineView.setScaleY(1.0f);
        filmstripTimelineView.A00();
        filmstripTimelineView.setOnlyScrollXMargin(0);
        filmstripTimelineView.setFilmstripTimelineWidth(-1);
    }
}
