package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: X.AhB  reason: case insensitive filesystem */
public final class C40694AhB implements X85 {
    public final int A00;
    public final UserSession A01;
    public final A91 A02;
    public final HashMap A03 = AnonymousClass7TE.A1E();
    public final HashMap A04 = AnonymousClass7TE.A1E();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A01, 36326305108932286L) != false) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C365358my C5l(X.C282745Eo r9, long r10, long r12) {
        /*
            r8 = this;
            r2 = 0
            java.util.HashMap r0 = r8.A03
            java.lang.Object r3 = r0.get(r9)
            X.A5n r3 = (X.C39697A5n) r3
            r0 = 0
            if (r3 == 0) goto L_0x0050
            X.A91 r1 = r8.A02
            android.graphics.drawable.Drawable r7 = r1.A00(r9)
            android.graphics.Bitmap r4 = r3.A01
            r4.eraseColor(r2)
            boolean r1 = r7 instanceof X.AnonymousClass5MJ
            if (r1 == 0) goto L_0x0025
            r5 = r7
            X.5MJ r5 = (X.AnonymousClass5MJ) r5
            if (r5 == 0) goto L_0x0025
            int r2 = (int) r10
            int r1 = (int) r12
            r5.EXC(r2, r1)
        L_0x0025:
            boolean r2 = r7 instanceof X.AnonymousClass5MH
            if (r2 == 0) goto L_0x0031
            r1 = r7
            X.5MH r1 = (X.AnonymousClass5MH) r1
            if (r1 == 0) goto L_0x0031
            r1.A09()
        L_0x0031:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r4)
            r7.draw(r1)
            if (r2 == 0) goto L_0x0067
            boolean r1 = r7.isVisible()
            if (r1 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r6 = r8.A01
            X.0Tu r5 = X.0Tu.A05
            r1 = 36326305108932286(0x810e95000536be, double:3.0362398529541044E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            return r0
        L_0x0051:
            X.5MH r7 = (X.AnonymousClass5MH) r7
            android.graphics.drawable.Drawable r1 = r7.A0A
            boolean r0 = r1 instanceof X.C41779B0i
            if (r0 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0067
            r1 = 1
            java.util.HashMap r0 = r8.A04
            java.lang.Object r0 = r0.get(r9)
            X.8my r0 = (X.C365358my) r0
            if (r0 == 0) goto L_0x0068
            return r0
        L_0x0067:
            r1 = 0
        L_0x0068:
            int r0 = r8.A00
            X.8my r2 = X.AnonymousClass9S9.A02(r4, r0)
            r3.A00 = r2
            if (r1 == 0) goto L_0x007c
            java.util.HashMap r1 = r8.A04
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.filterkit.surface.InputSurface"
            X.0qQ.A0C(r2, r0)
            r1.put(r9, r2)
        L_0x007c:
            X.8my r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40694AhB.C5l(X.5Eo, long, long):X.8my");
    }

    public final void A8e(C282745Eo r5) {
        try {
            UserSession userSession = this.A01;
            27p.A01(userSession).A04.A07();
            this.A03.put(r5, new C39697A5n(this.A02.A00(r5)));
            27p.A01(userSession).A04.A08();
        } catch (Exception e) {
            27p.A01(this.A01).A04.A06();
            AnonymousClass7TG.A1I(0wj.A01, "StickerTextureProviderfailed to render sticker", e, 817900213);
            throw e;
        }
    }

    public final void cleanup() {
        HashMap hashMap = this.A03;
        Collection<C39697A5n> values = hashMap.values();
        0qQ.A07(values);
        for (C39697A5n a5n : values) {
            a5n.A01.recycle();
        }
        hashMap.clear();
    }

    public C40694AhB(UserSession userSession, A91 a91, int i) {
        AnonymousClass7TG.A1O(userSession, a91);
        this.A01 = userSession;
        this.A02 = a91;
        this.A00 = i;
    }
}
