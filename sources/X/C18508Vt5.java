package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vt5  reason: case insensitive filesystem */
public final class C18508Vt5 {
    public final float[] A00 = new float[2];
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass9JD A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C265794Wh A04;
    public final /* synthetic */ C265804Wi A05;
    public final /* synthetic */ C19472WaK A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public C18508Vt5(AnonymousClass9JD r2, UserSession userSession, C265794Wh r4, C265804Wi r5, C19472WaK waK, String str, String str2, int i) {
        this.A04 = r4;
        this.A06 = waK;
        this.A03 = userSession;
        this.A02 = r2;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = i;
        this.A05 = r5;
    }

    public static final void A00(C18508Vt5 vt5, float f) {
        float f2;
        int i;
        C265804Wi r4 = vt5.A05;
        C16145UpW A002 = r4.A00();
        float[] fArr = vt5.A00;
        0qQ.A0B(fArr, 0);
        AnonymousClass0eM r6 = A002.A0F;
        U1V u1v = (U1V) r6.getValue();
        Rect bounds = u1v.getBounds();
        float f3 = (float) ((int) u1v.A0N.A00);
        boolean z = u1v.A09;
        float f4 = u1v.A00;
        float width = (float) bounds.width();
        if (z) {
            f2 = (f4 * (width - f3)) + (f3 / 2.0f);
        } else {
            f2 = f4 * width;
        }
        fArr[0] = f2;
        fArr[1] = (float) (JTP.A06(u1v) / 2);
        fArr[0] = fArr[0] + ((float) A002.A05);
        float intrinsicHeight = (fArr[1] + ((float) A002.getIntrinsicHeight())) - ((float) JTT.A09(r6));
        if (A002.A0B.A02().length() == 0) {
            i = A002.A04;
        } else {
            i = A002.A03;
        }
        fArr[1] = intrinsicHeight - ((float) i);
        r4.A06.getMatrix().mapPoints(fArr);
        U1U u1u = r4.A00;
        if (u1u != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            u1u.A01 = f5;
            u1u.A02 = f6;
            C17592Vak vak = u1u.A03;
            if (vak != null) {
                vak.A03 = f5;
                vak.A04 = f6;
            }
            u1u.invalidateSelf();
            U1U u1u2 = r4.A00;
            if (u1u2 != null) {
                int i2 = u1u2.A08;
                float f7 = ((float) i2) + (f * ((float) (u1u2.A07 - i2)));
                u1u2.A00 = f7;
                C17592Vak vak2 = u1u2.A03;
                if (vak2 != null) {
                    vak2.A01 = f7;
                }
                u1u2.invalidateSelf();
                return;
            }
        }
        0qQ.A0F("sliderParticleSystem");
        throw AnonymousClass00P.createAndThrow();
    }
}
