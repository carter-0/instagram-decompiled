package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashMap;

public final class AhC implements C41823B2e {
    public C349027zT A00;
    public final int A01;
    public final UserSession A02;
    public final A91 A03;
    public final HashMap A04 = AnonymousClass7TE.A1E();
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public final void A8e(C282745Eo r5) {
        try {
            UserSession userSession = this.A02;
            27p.A01(userSession).A04.A07();
            this.A04.put(r5, new C39698A5o(this.A03.A00(r5)));
            27p.A01(userSession).A04.A08();
        } catch (Exception e) {
            27p.A01(this.A02).A04.A06();
            AnonymousClass7TG.A1I(0wj.A01, "StickerTextureProviderfailed to render sticker", e, 817900213);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A02, 36326305108932286L) != false) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C365358my C5l(X.C282745Eo r26, long r27, long r29) {
        /*
            r25 = this;
            r2 = r27
            r6 = 0
            r8 = r25
            java.util.HashMap r0 = r8.A04
            r5 = r26
            java.lang.Object r4 = r0.get(r5)
            X.A5o r4 = (X.C39698A5o) r4
            r1 = 0
            if (r4 == 0) goto L_0x00be
            X.A91 r0 = r8.A03
            android.graphics.drawable.Drawable r10 = r0.A00(r5)
            android.graphics.Bitmap r9 = r4.A01
            r9.eraseColor(r6)
            boolean r0 = r10 instanceof X.AnonymousClass5MJ
            if (r0 == 0) goto L_0x002d
            r12 = r10
            X.5MJ r12 = (X.AnonymousClass5MJ) r12
            if (r12 == 0) goto L_0x002d
            int r11 = (int) r2
            r6 = r29
            int r0 = (int) r6
            r12.EXC(r11, r0)
        L_0x002d:
            boolean r11 = r10 instanceof X.AnonymousClass5MH
            if (r11 == 0) goto L_0x00c3
            r7 = r10
            X.5MH r7 = (X.AnonymousClass5MH) r7
            r6 = 1
            if (r7 == 0) goto L_0x00c3
            boolean r0 = r7.A09()
            if (r0 != r6) goto L_0x00c3
            android.graphics.drawable.Drawable r12 = r7.A0A
        L_0x003f:
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r9)
            boolean r0 = r12 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x00bf
            X.6Ly r12 = (X.C306386Ly) r12
            X.6Lz r0 = r12.A0I
            if (r0 == 0) goto L_0x00bf
            X.8ik r0 = r12.A0J
            if (r0 == 0) goto L_0x00bf
            X.7zT r0 = r8.A00
            if (r0 == 0) goto L_0x00bf
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r27 * r13
            boolean r0 = r12 instanceof X.C15927Ukr
            if (r0 == 0) goto L_0x0067
            r0 = r12
            X.Ukr r0 = (X.C15927Ukr) r0
            if (r0 == 0) goto L_0x0067
            r0.A0b()
        L_0x0067:
            r12.A0S(r7)
            X.7zT r0 = r8.A00
            r16 = r0
            if (r0 == 0) goto L_0x00a7
            X.8ik r14 = r12.A0J
            int r0 = r7.getWidth()
            r15 = 1
            if (r0 >= r15) goto L_0x007a
            r0 = 1
        L_0x007a:
            float r0 = (float) r0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r6 = r13 / r0
            int r0 = r7.getHeight()
            if (r0 >= r15) goto L_0x0086
            r0 = 1
        L_0x0086:
            float r0 = (float) r0
            float r0 = r13 / r0
            X.8ik r18 = X.C394799yi.A00(r14, r13, r6, r0, r13)
            r6 = 27
            X.MPC r0 = new X.MPC
            r0.<init>(r12, r6)
            int r21 = r7.getWidth()
            int r22 = r7.getHeight()
            r23 = r2
            r19 = r1
            r20 = r0
            r17 = r7
            r16.A02(r17, r18, r19, r20, r21, r22, r23)
        L_0x00a7:
            if (r11 == 0) goto L_0x00dc
            boolean r0 = r10.isVisible()
            if (r0 != 0) goto L_0x00c6
            com.instagram.common.session.UserSession r6 = r8.A02
            X.0Tu r0 = X.0Tu.A05
            r2 = 36326305108932286(0x810e95000536be, double:3.0362398529541044E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            if (r0 == 0) goto L_0x00c6
        L_0x00be:
            return r1
        L_0x00bf:
            r10.draw(r7)
            goto L_0x00a7
        L_0x00c3:
            r12 = r10
            goto L_0x003f
        L_0x00c6:
            X.5MH r10 = (X.AnonymousClass5MH) r10
            android.graphics.drawable.Drawable r1 = r10.A0A
            boolean r0 = r1 instanceof X.C41779B0i
            if (r0 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00dc
            r3 = 1
            java.util.HashMap r0 = r8.A05
            java.lang.Object r1 = r0.get(r5)
            X.8my r1 = (X.C365358my) r1
            if (r1 == 0) goto L_0x00dd
            return r1
        L_0x00dc:
            r3 = 0
        L_0x00dd:
            int r0 = r8.A01
            X.8my r2 = X.AnonymousClass9S9.A02(r9, r0)
            r4.A00 = r2
            if (r3 == 0) goto L_0x00f1
            java.util.HashMap r1 = r8.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.filterkit.surface.InputSurface"
            X.0qQ.A0C(r2, r0)
            r1.put(r5, r2)
        L_0x00f1:
            X.8my r1 = r4.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AhC.C5l(X.5Eo, long, long):X.8my");
    }

    public final void cleanup() {
        HashMap hashMap = this.A04;
        Collection<C39698A5o> values = hashMap.values();
        0qQ.A07(values);
        for (C39698A5o a5o : values) {
            a5o.A01.recycle();
        }
        hashMap.clear();
    }

    public AhC(UserSession userSession, A91 a91, int i) {
        AnonymousClass7TG.A1O(userSession, a91);
        this.A02 = userSession;
        this.A03 = a91;
        this.A01 = i;
    }
}
