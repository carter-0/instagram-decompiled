package X;

import android.app.Activity;
import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8Jb  reason: invalid class name and case insensitive filesystem */
public final class C353788Jb {
    public 28D A00;
    public C39903AIl A01;
    public C366258oa A02;
    public AnonymousClass9YG A03;
    public C366068o8 A04;
    public final Activity A05;
    public final View A06;
    public final C587707f A07 = new C587707f();
    public final AnonymousClass86W A08;
    public final C3497681r A09;
    public final AnonymousClass4DH A0A;
    public final C353778Ja A0B;
    public final AnonymousClass82W A0C;
    public final C3503284f A0D;
    public final UserSession A0E;
    public final C357638Yz A0F;
    public final TargetViewSizeProvider A0G;
    public final C3504384q A0H;
    public final AnonymousClass8JZ A0I;
    public final C314446iH A0J;
    public final AnonymousClass80U A0K;
    public final AnonymousClass0eM A0L;
    public final boolean A0M;

    public C353788Jb(Activity activity, View view, 28D r4, AnonymousClass86W r5, C3497681r r6, AnonymousClass4DH r7, C353778Ja r8, AnonymousClass82W r9, C3503284f r10, UserSession userSession, C357638Yz r12, TargetViewSizeProvider targetViewSizeProvider, C3504384q r14, AnonymousClass8JZ r15, C314446iH r16, AnonymousClass80U r17, AnonymousClass0eM r18, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(activity, 2);
        0qQ.A0B(view, 3);
        0qQ.A0B(r7, 4);
        0qQ.A0B(r12, 5);
        0qQ.A0B(r15, 6);
        0qQ.A0B(targetViewSizeProvider, 12);
        0qQ.A0B(r4, 16);
        this.A0E = userSession;
        this.A05 = activity;
        this.A06 = view;
        this.A0A = r7;
        this.A0F = r12;
        this.A0I = r15;
        this.A0B = r8;
        this.A0C = r9;
        this.A0D = r10;
        this.A0K = r17;
        this.A0H = r14;
        this.A0G = targetViewSizeProvider;
        this.A0L = r18;
        this.A0J = r16;
        this.A09 = r6;
        this.A00 = r4;
        this.A08 = r5;
        this.A0M = z;
    }

    public final CameraAREffect A00() {
        Object value;
        Object obj = this.A0F.A08.A00;
        0qQ.A0B(obj, 0);
        if (!(obj instanceof AnonymousClass80O)) {
            C366068o8 r0 = this.A04;
            if (r0 == null) {
                return null;
            }
            value = r0.A0I.getValue();
        } else if (this.A03 == null) {
            return null;
        } else {
            value = AnonymousClass8d4.A03.getValue();
        }
        return (CameraAREffect) value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r5 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass84B r4, com.instagram.camera.effect.models.CameraAREffect r5) {
        /*
            r3 = this;
            X.8o8 r2 = r3.A04
            if (r2 == 0) goto L_0x0039
            r1 = 0
            if (r5 == 0) goto L_0x0009
            java.lang.String r1 = r5.A0K
        L_0x0009:
            X.8JZ r0 = r2.A0G
            r0.A00(r4, r1)
            X.05G r0 = r2.A0I
            r0.Epw(r5)
            X.0Ud r0 = r2.A04
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "effectTrayState"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C387679mb
            if (r0 != 0) goto L_0x0039
            if (r5 == 0) goto L_0x0043
            X.84f r0 = r2.A0A
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.84i r0 = (X.C3503584i) r0
            r0.EUm(r5)
            goto L_0x003b
        L_0x0039:
            if (r5 == 0) goto L_0x0043
        L_0x003b:
            X.9YG r0 = r3.A03
            if (r0 == 0) goto L_0x0042
            r0.A01(r5)
        L_0x0042:
            return
        L_0x0043:
            X.9YG r0 = r3.A03
            if (r0 == 0) goto L_0x0042
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353788Jb.A01(X.84B, com.instagram.camera.effect.models.CameraAREffect):void");
    }
}
