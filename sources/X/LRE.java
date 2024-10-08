package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.common.session.UserSession;

public final class LRE {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public View A04;
    public RecyclerView A05;
    public BottomSheetBehavior A06;
    public AnonymousClass2t9 A07;
    public C62500Kgq A08 = C62500Kgq.HIDDEN;
    public LBH A09;
    public A8Y A0A;
    public AnonymousClass7L0 A0B;
    public final FragmentActivity A0C;
    public final 1wn A0D;
    public final UserSession A0E;
    public final C252063oV A0F;
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(new C41655Ay7(this, 14));

    public LRE(FragmentActivity fragmentActivity, UserSession userSession, C252063oV r6) {
        0qQ.A0B(r6, 1);
        this.A0F = r6;
        this.A0E = userSession;
        this.A0C = fragmentActivity;
        C64698LgT A002 = C64698LgT.A00(this, 60);
        this.A0D = A002;
        AnonymousClass1Nd.A00(userSession).A01(A002, AY0.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void A01(X.LRE r8, X.C62500Kgq r9) {
        /*
            monitor-enter(r8)
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = r8.A06     // Catch:{ all -> 0x00ad }
            if (r6 == 0) goto L_0x00ab
            X.Kgq r0 = r8.A08     // Catch:{ all -> 0x00ad }
            if (r0 == r9) goto L_0x00ab
            r2 = 1
            r7 = 0
            r6.A0b(r2)     // Catch:{ all -> 0x00ad }
            int r3 = r6.A0G     // Catch:{ all -> 0x00ad }
            int r0 = r9.ordinal()     // Catch:{ all -> 0x00ad }
            r1 = 3
            r5 = 2
            r4 = 0
            if (r0 == r7) goto L_0x0059
            if (r0 == r2) goto L_0x003e
            if (r0 == r5) goto L_0x0027
            int r4 = r8.A01     // Catch:{ all -> 0x00ad }
            X.LBH r0 = r8.A09     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0025
            r0.A02 = r7     // Catch:{ all -> 0x00ad }
        L_0x0025:
            r2 = 0
            goto L_0x0063
        L_0x0027:
            int r4 = r8.A01     // Catch:{ all -> 0x00ad }
            X.Kgq r1 = r8.A08     // Catch:{ all -> 0x00ad }
            X.Kgq r0 = X.C62500Kgq.HIDDEN     // Catch:{ all -> 0x00ad }
            if (r1 == r0) goto L_0x0030
            r2 = 0
        L_0x0030:
            X.A8Y r0 = r8.A0A     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0037
            r0.A00(r4)     // Catch:{ all -> 0x00ad }
        L_0x0037:
            X.LBH r0 = r8.A09     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0062
            r0.A02 = r7     // Catch:{ all -> 0x00ad }
            goto L_0x0062
        L_0x003e:
            int r4 = r8.A02     // Catch:{ all -> 0x00ad }
            X.Kgq r1 = r8.A08     // Catch:{ all -> 0x00ad }
            X.Kgq r0 = X.C62500Kgq.HIDDEN     // Catch:{ all -> 0x00ad }
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.A8Y r0 = r8.A0A     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x004f
            r0.A00(r4)     // Catch:{ all -> 0x00ad }
        L_0x004f:
            X.LBH r0 = r8.A09     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0055
            r0.A02 = r2     // Catch:{ all -> 0x00ad }
        L_0x0055:
            r6.A0b(r7)     // Catch:{ all -> 0x00ad }
            goto L_0x0061
        L_0x0059:
            X.A8Y r0 = r8.A0A     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x0062
            r0.A00(r7)     // Catch:{ all -> 0x00ad }
            goto L_0x0062
        L_0x0061:
            r2 = r1
        L_0x0062:
            r1 = 4
        L_0x0063:
            r8.A08 = r9     // Catch:{ all -> 0x00ad }
            X.LBH r0 = r8.A09     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x006e
            X.05G r0 = r0.A08     // Catch:{ all -> 0x00ad }
            r0.Epw(r9)     // Catch:{ all -> 0x00ad }
        L_0x006e:
            if (r3 == r1) goto L_0x0073
            r6.A0W(r1)     // Catch:{ all -> 0x00ad }
        L_0x0073:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r8.A06     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x00ab
            boolean r0 = r3.A0U     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            int r1 = r3.A0E     // Catch:{ all -> 0x00a9 }
            goto L_0x0080
        L_0x007f:
            r1 = -1
        L_0x0080:
            if (r1 == r4) goto L_0x00ab
            if (r2 == 0) goto L_0x00a5
            int[] r0 = new int[]{r1, r4}     // Catch:{ all -> 0x00a9 }
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)     // Catch:{ all -> 0x00a9 }
            X.LTn r0 = new X.LTn     // Catch:{ all -> 0x00a9 }
            r0.<init>(r3, r1, r5)     // Catch:{ all -> 0x00a9 }
            r2.addUpdateListener(r0)     // Catch:{ all -> 0x00a9 }
            X.LTe r0 = new X.LTe     // Catch:{ all -> 0x00a9 }
            r0.<init>(r8, r1, r4)     // Catch:{ all -> 0x00a9 }
            r2.addListener(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)     // Catch:{ all -> 0x00a9 }
            r2.start()     // Catch:{ all -> 0x00a9 }
            goto L_0x00ab
        L_0x00a5:
            r3.A0V(r4)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ab
        L_0x00a9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ab:
            monitor-exit(r8)
            return
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRE.A01(X.LRE, X.Kgq):void");
    }

    public static final C62500Kgq A00(LRE lre) {
        C62500Kgq kgq;
        int i = lre.A00;
        if (i == 0) {
            return C62500Kgq.HIDDEN;
        }
        LBH lbh = lre.A09;
        if (lbh != null && lbh.A02) {
            return C62500Kgq.DISMISSED;
        }
        if (i == 1 || lre.A08 != (kgq = C62500Kgq.EXPANDED)) {
            return C62500Kgq.DEFAULT;
        }
        return kgq;
    }

    public final void A02(AnonymousClass7L0 r3) {
        this.A0B = r3;
        View view = this.A04;
        if (view != null) {
            view.setBackgroundTintList(ColorStateList.valueOf(r3.A02));
        }
        LBH lbh = this.A09;
        if (lbh != null) {
            lbh.A01.Epw(r3);
        }
        AnonymousClass2uJ.A04(this.A0C, r3.A02);
    }
}
