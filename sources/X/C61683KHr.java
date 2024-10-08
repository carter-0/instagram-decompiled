package X;

import android.view.View;

/* renamed from: X.KHr  reason: case insensitive filesystem */
public final class C61683KHr extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C61683KHr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean Dqe(View view) {
        if (this.A00 != 0) {
            JW7 jw7 = (JW7) this.A03;
            JW8 jw8 = jw7.A14;
            Integer num = jw8.A03;
            Integer num2 = AnonymousClass05K.A00;
            if (num != num2) {
                jw8.A0K(num2);
                if (!jw8.A0F.A07) {
                    if (182.A06(0Tu.A05, jw7.A0z, 36319493290466752L)) {
                        jw8.A0L(true, true);
                    }
                }
            } else {
                jw7.A17.Cuz((View) this.A02, jw7);
            }
        } else {
            0qQ.A0B(view, 0);
            if (!view.isEnabled()) {
                return false;
            }
            view.performHapticFeedback(3);
            C361518gM r2 = ((KKK) this.A02).A00;
            if (r2 != null) {
                r2.DQC((C63945LEl) this.A01, ((C249703kE) this.A03).getBindingAdapterPosition());
            }
        }
        return true;
    }
}
