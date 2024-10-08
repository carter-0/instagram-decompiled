package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.Vkr  reason: case insensitive filesystem */
public final class C18065Vkr {
    public C242423Ua A00;
    public C14044Tol A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C20930X4v A05;
    public final C331117Pq A06 = new C16383Uu0(this, 1);
    public final C331117Pq A07 = new C16383Uu0(this, 0);
    public final boolean A08;

    public C18065Vkr(Context context, UserSession userSession, AnonymousClass4DU r6, C20930X4v x4v) {
        UUID.randomUUID().toString();
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = r6;
        this.A08 = true;
        this.A05 = x4v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r0.A0E() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.1Xj r19) {
        /*
            r18 = this;
            r11 = 0
            X.4Nf r6 = new X.4Nf
            r4 = r19
            r6.<init>((java.lang.Object) r4, (int) r11)
            r2 = r18
            X.Tol r0 = r2.A01
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.A0E()
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r6.A00 = r0
            X.Tol r0 = r2.A01
            if (r0 != 0) goto L_0x003e
            boolean r0 = r2.A08
            r3 = 0
            if (r0 == 0) goto L_0x0069
            com.instagram.common.session.UserSession r1 = r2.A03
            X.4DU r0 = r2.A04
            X.3ou r15 = new X.3ou
            r15.<init>(r1, r0, r3, r11)
        L_0x002a:
            android.content.Context r13 = r2.A02
            com.instagram.common.session.UserSession r14 = r2.A03
            X.7Pq r0 = r2.A07
            java.lang.String r17 = "instagram_shopping_pdp"
            X.Tol r12 = new X.Tol
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            r2.A01 = r12
            r12.A02()
        L_0x003e:
            X.Tol r3 = r2.A01
            java.lang.String r7 = r4.A0M
            X.3WR r5 = r4.A2D()
            X.3Ua r4 = r2.A00
            if (r4 != 0) goto L_0x0053
            android.content.Context r0 = r2.A02
            com.instagram.ui.widget.framelayout.MediaFrameLayout r4 = new com.instagram.ui.widget.framelayout.MediaFrameLayout
            r4.<init>(r0)
            r2.A00 = r4
        L_0x0053:
            X.Tol r0 = r2.A01
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.A0E()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            r10 = -1
            r12 = 1
            java.lang.String r8 = "instagram_shopping_pdp"
            r13 = r12
            r3.A09(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0069:
            r15 = r3
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18065Vkr.A00(X.1Xj):void");
    }

    public final void A01(C242423Ua r2) {
        C14044Tol tol = this.A01;
        if (tol != null) {
            tol.A07(r2);
        }
    }

    public final void A02(String str) {
        C14044Tol tol = this.A01;
        if (tol != null) {
            tol.A0B(str);
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A03(String str) {
        C14044Tol tol = this.A01;
        if (tol != null) {
            tol.A0D(str, true);
        }
    }
}
