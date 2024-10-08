package X;

import android.content.Context;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Fr  reason: invalid class name and case insensitive filesystem */
public final class C352948Fr {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass07Z A02;
    public final C340707lh A03 = new C40164AUe(this);
    public final C340297l2 A04;
    public final UserSession A05;
    public final C357638Yz A06;
    public final C3498081w A07;
    public final C3497281m A08;
    public final C3495780x A09;
    public final Context A0A;
    public final AnonymousClass8GD A0B = new C364438lQ(this);

    public C352948Fr(Context context, AnonymousClass07Z r3, C340297l2 r4, UserSession userSession, C357638Yz r6, C3497281m r7, C3495780x r8) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(context, 4);
        0qQ.A0B(userSession, 5);
        0qQ.A0B(r3, 6);
        0qQ.A0B(r4, 7);
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r6;
        this.A0A = context;
        this.A05 = userSession;
        this.A02 = r3;
        this.A04 = r4;
        this.A07 = r7.A00().BOi();
    }

    public static final void A00(C352948Fr r4, int i) {
        C340547lR r3;
        if (i != r4.A04.A09()) {
            C3495780x r1 = r4.A09;
            AnonymousClass8GD r42 = r4.A0B;
            0qQ.A0B(r42, 1);
            C340297l2 r0 = r1.A01;
            if (r0 != null && (r3 = ((BasicCameraOutputController) C340297l2.A02(r0)).A04) != null) {
                C342757p7 r2 = new C342757p7();
                r2.A01(C342717p3.A0e, Integer.valueOf(i));
                r3.A0N.CoY(r42, r2.A00());
                return;
            }
            return;
        }
        A01(r4, r4.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r4 == 2) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C352948Fr r6, boolean r7) {
        /*
            X.7l2 r0 = r6.A04
            int r4 = r0.A09()
            r3 = 1
            if (r4 == r3) goto L_0x000d
            r0 = 2
            r5 = 0
            if (r4 != r0) goto L_0x000e
        L_0x000d:
            r5 = 1
        L_0x000e:
            X.80x r0 = r6.A09
            X.05G r1 = r0.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.Epw(r0)
            X.81w r2 = r6.A07
            android.content.Context r1 = r6.A0A
            r0 = 2131238516(0x7f081e74, float:1.8093313E38)
            if (r5 == 0) goto L_0x0025
            r0 = 2131238515(0x7f081e73, float:1.809331E38)
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.EZd(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131965637(0x7f1336c5, float:1.956809E38)
            if (r5 != r3) goto L_0x0038
            r0 = 2131965638(0x7f1336c6, float:1.9568092E38)
        L_0x0038:
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A0A(r1)
            X.81v r2 = (X.C3497981v) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.view.View r0 = r2.getView()
            r0.setContentDescription(r1)
            if (r4 == r3) goto L_0x005a
            if (r7 != 0) goto L_0x005a
            X.81m r0 = r6.A08
            X.81t r0 = r0.A00()
            r0.CLZ()
            return
        L_0x005a:
            X.81m r0 = r6.A08
            X.81t r0 = r0.A00()
            r0.Euk()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352948Fr.A01(X.8Fr, boolean):void");
    }

    public final void A02() {
        C340297l2 r0 = this.A04;
        C340707lh r1 = this.A03;
        C340547lR r02 = ((BasicCameraOutputController) C340297l2.A02(r0)).A04;
        if (r02 != null) {
            r02.A0N.EE2(r1);
        }
        this.A08.A00().CLZ();
        this.A09.A0A.Epw(false);
    }
}
