package X;

import android.content.Intent;
import android.graphics.Path;

/* renamed from: X.9Ln  reason: invalid class name and case insensitive filesystem */
public final class C377359Ln extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377359Ln(Object obj, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C331687Ry r11 = (C331687Ry) obj;
            0qQ.A0B(r11, 0);
            r11.onActivityResult(this.A01, this.A02, (Intent) this.A03);
        } else {
            C3022362e r112 = (C3022362e) obj;
            C3018060d r3 = (C3018060d) this.A03;
            int i = this.A02;
            int i2 = this.A01;
            C292055iK r2 = r112.A06;
            int i3 = r112.A05;
            int i4 = r112.A04;
            int A032 = C229632nm.A03(i, i3, i4) - i3;
            int A033 = C229632nm.A03(i2, i3, i4) - i3;
            C292045iJ r22 = (C292045iJ) r2;
            if (A032 < 0 || A032 > A033 || A033 > r22.A03.length()) {
                throw new IllegalArgumentException(002.A0z("start(", ") or end(", C273654mx.A00(1030), "], or start > end!", A032, A033, r22.A03.length()));
            }
            Path path = new Path();
            C292075iM r1 = r22.A01;
            r1.A09.getSelectionPath(A032, A033, path);
            int i5 = r1.A07;
            if (i5 != 0 && !path.isEmpty()) {
                path.offset(0.0f, (float) i5);
            }
            C3018160e r23 = new C3018160e(path);
            r23.A00(C289325dP.A00(0.0f, r112.A01));
            ((C3018160e) r3).A03.addPath(r23.A03, C289295dM.A01(0), Float.intBitsToFloat(0));
        }
        return C60340gF.A00;
    }
}
