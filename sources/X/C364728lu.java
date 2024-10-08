package X;

import android.graphics.Rect;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

/* renamed from: X.8lu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C364728lu implements Runnable {
    public final /* synthetic */ AnonymousClass8QA A00;
    public final /* synthetic */ AnonymousClass8K4 A01;
    public final /* synthetic */ C352218Cl A02;

    public /* synthetic */ C364728lu(AnonymousClass8QA r1, AnonymousClass8K4 r2, C352218Cl r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void run() {
        C351958Bc r5;
        CameraAREffect cameraAREffect;
        List list;
        AnonymousClass8K4 r4 = this.A01;
        C352218Cl r7 = this.A02;
        AnonymousClass8QA r0 = this.A00;
        AnonymousClass8K4.A0B(r4, r7);
        C364758lx r3 = r0.A05().A02;
        if (r3 != null) {
            C354028Kj r2 = r4.A0Z;
            if (r2 != null) {
                if (r3.A00 == 1112 && (list = r3.A08) != null && list.size() == 9) {
                    r2.A00();
                    r4.A0a.A00(r3.A08);
                } else {
                    r2.ETV(r3.A00);
                }
            }
            if (C305756Jk.A00(r4.A0A) && (cameraAREffect = r3.A01) != null) {
                r4.A06 = new C41132Aos(cameraAREffect, r4, cameraAREffect.A0K);
            }
            C366668pT r1 = r3.A04;
            if (r1 != null) {
                r4.A0M.A08(r1);
            }
        }
        r4.A0E.A05().setVisibility(0);
        if (r4.A08 && (r5 = r4.A0S) != null) {
            Rect A002 = JW0.A00(AnonymousClass514.NINE_BY_SIXTEEN.A00, r7.A09, r7.A06, r7.A07, false);
            r5.A02.Epw(C351968Bd.FILL);
            r4.A0M.A07(A002);
            r4.A08 = false;
            AnonymousClass8B2 r12 = r4.A0X;
            if (r12 != null) {
                r12.A03 = true;
                AnonymousClass8BA.A0G(r4.A0G, false, false);
            }
        }
        r4.A07 = null;
    }
}
