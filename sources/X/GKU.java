package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

public final class GKU extends C52050GCw implements AnonymousClass32U {
    public AnonymousClass5Gv A00;
    public final Activity A01;
    public final UserSession A02;
    public final 0xa A03;
    public final C57626Idr A04 = new Object();
    public final GKV A05;
    public final GKV A06;
    public final boolean A07;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DWA(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final void DhU(Integer num) {
        0qQ.A0B(num, 0);
        if (num == AnonymousClass05K.A0C && !this.A07) {
            A00(this, this.A06, 2131955885, true);
        }
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0006: MOVE  (r1v1 X.2ZX) = (r1v0 X.2ZX)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A00(X.GKU r6, X.C59596JPq r7, int r8, boolean r9) {
        /*
            android.app.Activity r1 = r6.A01
            boolean r0 = r1 instanceof X.2ZX
            if (r0 == 0) goto L_0x002a
            X.2ZX r1 = (X.2ZX) r1
            if (r1 == 0) goto L_0x002a
            X.1QK r0 = X.1QK.A09
            java.lang.String r0 = r0.toString()
            android.view.View r4 = r1.C3m(r0)
            if (r4 == 0) goto L_0x002a
            X.6jx r5 = new X.6jx
            r5.<init>((int) r8)
            android.os.Handler r2 = X.AnonymousClass7TF.A0D()
            X.GQ4 r3 = new X.GQ4
            r8 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.postDelayed(r3, r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GKU.A00(X.GKU, X.JPq, int, boolean):void");
    }

    public final void DW8(int i, int i2) {
        if (this.A07) {
            C52012GBj gBj = this.A02;
            if (gBj == null || i != GD6.A00(gBj.A09) - 1) {
                AnonymousClass5Gv r1 = this.A00;
                if (r1 != null) {
                    r1.A08(true);
                    return;
                }
                return;
            }
            A00(this, this.A04, 2131955876, false);
        } else if (i > i2 && i >= 5 && System.currentTimeMillis() - this.A03.getLong("KEY_LAST_VIEWER_ENTRY", System.currentTimeMillis()) > StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
            A00(this, this.A05, 2131955885, true);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.Idr] */
    public GKU(Activity activity, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1O(userSession, activity);
        this.A02 = userSession;
        this.A01 = activity;
        this.A07 = z;
        0xa A0n = C51969G9p.A0n(1Al.A01(userSession), 1An.A0o, this);
        this.A03 = A0n;
        this.A06 = new GKV(userSession, A0n, C52249GKq.STANDARD);
        this.A05 = new GKV(userSession, A0n, C52249GKq.DEEPER_IN_FUNNEL);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C52012GBj gBj = this.A02;
        if (gBj != null) {
            gBj.A0K(this);
        }
    }
}
