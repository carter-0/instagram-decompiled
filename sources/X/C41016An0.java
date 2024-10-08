package X;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;

/* renamed from: X.An0  reason: case insensitive filesystem */
public final /* synthetic */ class C41016An0 implements Runnable {
    public final /* synthetic */ AnonymousClass8HX A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C41016An0(AnonymousClass8HX r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        int i;
        AnonymousClass8HX r1 = this.A00;
        String str = this.A01;
        AnonymousClass8HF r12 = r1.A00;
        if (AnonymousClass8HF.A03(r12, str)) {
            AnonymousClass8GA r0 = r12.A0H.A00.A0n;
            AnonymousClass8GB r6 = r0.A0G;
            View view = r0.A0A;
            if (r0.A0F.A0R()) {
                i = Color.parseColor("#FBE9D2");
            } else {
                i = -1;
            }
            view.setBackgroundColor(i);
            r6.A01(view);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.25f, 0.0f});
            r6.A00 = ofFloat;
            ofFloat.setDuration(100);
            r6.A00.setRepeatCount(-1);
            r6.A00.addListener(new AJM(view, r6, (Runnable) null, 0.25f));
            r6.A00.start();
        }
    }
}
