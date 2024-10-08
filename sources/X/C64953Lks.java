package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Lks  reason: case insensitive filesystem */
public final class C64953Lks implements C314236hs, AnonymousClass7Q6 {
    public final AnonymousClass4DH A00;
    public final /* synthetic */ K6T A01;

    public final boolean CZu(boolean z) {
        return false;
    }

    public final void Cw1(View view, C317466nJ r2) {
    }

    public C64953Lks(K6T k6t) {
        this.A01 = k6t;
        this.A00 = k6t;
    }

    private final void A00(View view, C317486nL r5) {
        K6T k6t = this.A01;
        if (k6t.isAdded()) {
            C314276hw r0 = k6t.A02;
            if (r0 != null) {
                r0.A05(r5);
            }
            LYO lyo = k6t.A03;
            if (lyo == null) {
                0qQ.A0F("emojiSearchBarController");
                throw AnonymousClass00P.createAndThrow();
            }
            lyo.A01.A03();
            Context context = k6t.getContext();
            if (context != null) {
                AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context);
                if (A02 != null) {
                    A02.A0B();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            MS1 ms1 = k6t.A01;
            if (ms1 != null) {
                ms1.DBu(view, r5.A02, r5.A01);
            }
        }
    }

    public final long AyD() {
        return 0;
    }

    public final AnonymousClass4DH BZy() {
        return this.A00;
    }

    public final boolean CWK() {
        return false;
    }

    public final boolean CXD() {
        return false;
    }

    public final boolean CXt() {
        return false;
    }

    public final boolean Cc2() {
        return false;
    }

    public final void Cw2(Drawable drawable, View view, C317466nJ r5) {
        AnonymousClass7TG.A1N(r5, view);
        if (r5.CAW() == C317476nK.EMOJI) {
            C317486nL B0p = r5.B0p();
            if (B0p != null) {
                A00(view, B0p);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void DBs(Drawable drawable, View view, C317486nL r3) {
        AnonymousClass7TG.A1N(r3, view);
        A00(view, r3);
    }
}
