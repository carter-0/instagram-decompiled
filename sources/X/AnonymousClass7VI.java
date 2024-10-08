package X;

import android.animation.ValueAnimator;

/* renamed from: X.7VI  reason: invalid class name */
public final class AnonymousClass7VI implements 1wn {
    public final /* synthetic */ AnonymousClass7VH A00;

    public AnonymousClass7VI(AnonymousClass7VH r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-619163748);
        C57070INk iNk = (C57070INk) obj;
        int A032 = AnonymousClass0fD.A03(1053557649);
        0qQ.A0B(iNk, 0);
        if (iNk.A01) {
            String str = iNk.A00;
            AnonymousClass7VH r5 = this.A00;
            if (0qQ.A0K(str, ((C333517Zg) r5.A09.invoke()).C6l().C6C())) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(500);
                ofFloat.addListener(new AnonymousClass9WH(r5));
                ofFloat.addUpdateListener(new AJQ(r5));
                ofFloat.start();
            }
        }
        AnonymousClass0fD.A0A(-103470697, A032);
        AnonymousClass0fD.A0A(1915023420, A03);
    }
}
