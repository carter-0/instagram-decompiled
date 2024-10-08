package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.9mY  reason: invalid class name and case insensitive filesystem */
public final class C387649mY extends C353308Hc implements AnonymousClass8DG {
    public static boolean A03;
    public final ViewGroup A00;
    public final A4J A01;
    public final C387619mV A02;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void DBj(X.AnonymousClass518 r11, java.lang.String r12, int r13, boolean r14) {
        /*
            r10 = this;
            r1 = 0
            X.0qQ.A0B(r11, r1)
            X.A4J r0 = r10.A01
            X.AJ9 r5 = r0.A00
            X.7w8 r4 = r5.A06
            if (r4 == 0) goto L_0x011d
            r4.A0B(r13)
            android.graphics.drawable.Drawable r0 = r4.A04()
            X.0qQ.A07(r0)
            X.B3d r0 = X.AJ9.A01(r0)
            X.6KJ r3 = r0.BV4()
            X.1Av r0 = r5.A0O
            boolean r9 = r5.A0A
            boolean r2 = X.AnonymousClass7TF.A1U(r1, r0, r3)
            boolean r8 = r3.A02()
            java.lang.String r7 = r3.A02
            X.0qQ.A0B(r7, r1)
            X.0xa r6 = r0.A01
            X.0xY r1 = r6.AR4()
            if (r8 == 0) goto L_0x0134
            r0 = 3534(0xdce, float:4.952E-42)
        L_0x0039:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5g(r0, r7)
            r1.apply()
            if (r9 == 0) goto L_0x0055
            X.0xY r1 = r6.AR4()
            r0 = 3768(0xeb8, float:5.28E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5T(r0, r8)
            r1.apply()
        L_0x0055:
            com.instagram.common.session.UserSession r6 = r5.A0I
            r0 = 7
            int r1 = r3.ordinal()
            if (r1 == r0) goto L_0x0130
            r0 = 4
            if (r1 == r0) goto L_0x012c
            r0 = 5
            if (r1 == r0) goto L_0x0128
            r0 = 3
            if (r1 == r0) goto L_0x0124
            r0 = 2
            if (r1 != r0) goto L_0x00b5
            java.lang.String r8 = "MUSIC_STICKER_STYLE_KARAOKE"
        L_0x006c:
            X.27r r0 = X.27p.A01(r6)
            X.29R r7 = r0.A09
            X.0wc r0 = r7.A01
            X.1Ln r6 = X.1Ln.A08(r0)
            X.4yP r1 = r7.A0J()
            X.0Aj r0 = r6.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x00b5
            if (r1 == 0) goto L_0x00b5
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r6.A0t(r0)
            r6.A0r(r8)
            X.29R.A00(r6, r7)
            r6.A0a(r1)
            X.283 r1 = r7.A04
            X.28D r0 = r1.A09
            r6.A0b(r0)
            r6.A0T()
            r6.A0U()
            X.0iw r0 = X.27x.A08
            java.lang.String r0 = r0.getModuleName()
            r6.A0n(r0)
            X.28t r0 = r1.A0A
            r6.A0c(r0)
            X.AnonymousClass7TF.A18(r6)
            r6.Cgf()
        L_0x00b5:
            if (r13 <= 0) goto L_0x00cb
            X.0wX r0 = X.C61170le.A00
            X.0xm r0 = X.AnonymousClass0xl.A00(r0)
            X.0xa r0 = r0.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_used_music_sticker_style_selector"
            r1.E5T(r0, r2)
            r1.apply()
        L_0x00cb:
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_ONLY
            if (r3 != r0) goto L_0x011e
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x011e
            X.8a2 r0 = r5.A0L
            r0.EuN()
        L_0x00d8:
            X.AJ9.A05(r5)
            X.AJ9.A08(r5)
            boolean r0 = r0.CPG()
            if (r0 == 0) goto L_0x011d
            android.view.View r3 = r5.A0F
            int r2 = r4.getIntrinsicWidth()
            int r1 = r4.getIntrinsicHeight()
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r3.setLayoutParams(r0)
            X.7w8 r0 = r5.A06
            if (r0 == 0) goto L_0x0138
            android.graphics.drawable.Drawable r0 = r0.A04()
            X.0qQ.A07(r0)
            X.B3d r0 = X.AJ9.A01(r0)
            X.6KJ r3 = r0.BV4()
            if (r3 == 0) goto L_0x0138
            X.0eM r0 = r5.A0R
            java.lang.Object r2 = r0.getValue()
            com.instagram.common.ui.base.IgSimpleImageView r2 = (com.instagram.common.ui.base.IgSimpleImageView) r2
            com.instagram.common.ui.base.IgTextView r1 = r5.A04
            boolean r0 = r5.A0B
            int r0 = X.C271404in.A00(r2, r1, r3, r0)
            r5.A00 = r0
        L_0x011d:
            return
        L_0x011e:
            X.8a2 r0 = r5.A0L
            r0.CLM()
            goto L_0x00d8
        L_0x0124:
            java.lang.String r8 = "MUSIC_STICKER_STYLE_CUBE_REVEAL"
            goto L_0x006c
        L_0x0128:
            java.lang.String r8 = "MUSIC_STICKER_STYLE_TYPEWRITER"
            goto L_0x006c
        L_0x012c:
            java.lang.String r8 = "MUSIC_STICKER_STYLE_DYNAMIC_REVEAL"
            goto L_0x006c
        L_0x0130:
            java.lang.String r8 = "MUSIC_STICKER_STYLE_HIDDEN"
            goto L_0x006c
        L_0x0134:
            r0 = 3613(0xe1d, float:5.063E-42)
            goto L_0x0039
        L_0x0138:
            X.Axk r0 = X.C41632Axk.A00
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387649mY.DBj(X.518, java.lang.String, int, boolean):void");
    }

    public C387649mY(Context context, ViewGroup viewGroup, AnonymousClass0iw r4, AnonymousClass8AL r5, A4J a4j) {
        super(r5);
        this.A00 = viewGroup;
        this.A01 = a4j;
        C387619mV r0 = new C387619mV(context, r4, this, this);
        this.A02 = r0;
        this.A00 = r0;
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }
}
