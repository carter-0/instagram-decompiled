package X;

import android.widget.FrameLayout;

/* renamed from: X.HaB  reason: case insensitive filesystem */
public abstract class C54978HaB {
    public static void A00(C229382nI r3, C55722HmJ hmJ, C270464gm r5) {
        C257593xe r0;
        C270864hR r1 = r5.A02;
        if (r1 == null && (r0 = r5.A03) != null) {
            r1 = Ci1.A00(r0).A01;
            r5.A02 = r1;
        }
        if (r1 == null) {
            0wb.A03("null_bloks_data_adapter", C273654mx.A00(1313));
            return;
        }
        if (r5.A09) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            hmJ.A01.setLayoutParams(layoutParams);
        }
        AnonymousClass6NS r2 = r5.A01;
        if (r2 == null && r5.A01() != null) {
            r2 = AnonymousClass6NS.A00(hmJ.A01.getContext(), C3034368u.A02((C361078fd) null, r5.A01()), r3).A00();
            r5.A01 = r2;
            r3.A05(new EED(4, r2, r5, r3));
        }
        AnonymousClass6NS r02 = hmJ.A00;
        if (r02 != r2) {
            if (r02 != null) {
                r02.A04();
            }
            hmJ.A00 = r2;
            if (r2 != null) {
                r2.A07(hmJ.A02);
            }
        }
        C276544tV A00 = r5.A00();
        A00.getClass();
        String.valueOf(A00.A0C());
    }
}
