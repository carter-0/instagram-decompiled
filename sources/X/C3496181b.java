package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.81b  reason: invalid class name and case insensitive filesystem */
public final class C3496181b {
    public C40183AUx A00;
    public C341897nh A01;
    public C340307l3 A02;
    public A97 A03;
    public C340397lC A04;
    public boolean A05;
    public final AnonymousClass2Fj A06 = new 2Fk(false);
    public final C3496281c A07 = new Object();
    public final Context A08;
    public final C3496081a A09;
    public final UserSession A0A;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.81c, java.lang.Object] */
    public C3496181b(Context context, C3496081a r4, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A08 = context;
        this.A0A = userSession;
        this.A09 = r4;
    }

    public final C341047mF A00(View view, C340307l3 r28, String str, boolean z) {
        C40183AUx aUx;
        C341897nh r3;
        C340397lC wPi;
        C340297l2 r0;
        int i;
        C340307l3 r2 = r28;
        this.A02 = r2;
        UserSession userSession = this.A0A;
        C344227rW r15 = new C344227rW(new C343947r4(userSession));
        C340307l3 r32 = this.A02;
        View view2 = view;
        if (!(r32 instanceof C340297l2) || (r0 = (C340297l2) r32) == null || !((i = r0.A0E) == 1 || i == 3)) {
            Context context = this.A08;
            C341897nh r5 = null;
            boolean z2 = false;
            if (C3495280s.A00(context)) {
                r3 = C341887ng.A00(context, false);
                if (r3.isARCoreSupported() && AnonymousClass4x3.A00(context) >= 223040000) {
                    z2 = true;
                }
                aUx = new C40183AUx();
            } else {
                aUx = null;
                r3 = null;
            }
            C340267kz.A01 = z2;
            if (z2) {
                r5 = r3;
            }
            this.A01 = r5;
            this.A00 = aUx;
            C340307l3 r6 = this.A02;
            if (r6 != null) {
                A97 a97 = new A97(r6, new A3U(this));
                this.A03 = a97;
                A3V a3v = new A3V(this);
                C3496281c r33 = this.A07;
                C344037rD B46 = r2.B46();
                C341897nh r22 = this.A01;
                wPi = new C19202WPi(context, view2, r15, B46, this.A00, r22, r6, a3v, a97, r33, this.A09, userSession, str);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            0qQ.A0C(r32, "null cannot be cast to non-null type com.instagram.camera.capture.OneCameraController");
            wPi = new C340387lB(view2, r15, (C340297l2) r32, this.A07, userSession, z);
        }
        this.A04 = wPi;
        if (this.A05) {
            wPi.Dza();
            C340307l3 r02 = this.A02;
            if (r02 != null) {
                r02.Dza();
            }
            this.A05 = false;
        }
        this.A06.A0B(true);
        C340397lC r03 = this.A04;
        if (r03 != null) {
            return r03.C3L();
        }
        return null;
    }
}
