package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.6cN  reason: invalid class name and case insensitive filesystem */
public final class C311246cN {
    public final Context A00;
    public final 2el A01;
    public final C310666bQ A02;
    public final C310676bR A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public C311246cN(Context context, 2el r5, C310666bQ r6, C310676bR r7) {
        0qQ.A0B(r5, 2);
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        0eO r2 = 0eO.A02;
        this.A04 = AnonymousClass0eN.A00(r2, new AnonymousClass9LV(this, 29));
        this.A05 = AnonymousClass0eN.A00(r2, new AnonymousClass9LV(this, 30));
        this.A06 = AnonymousClass0eN.A00(r2, new AnonymousClass9LV(this, 31));
        this.A07 = AnonymousClass0eN.A00(r2, new AnonymousClass9LV(this, 32));
        this.A08 = AnonymousClass0eN.A00(r2, new AnonymousClass9LV(this, 33));
    }

    public final void A00(View view, C255773uh r9, C250973mM r10, C309426Yf r11) {
        0qQ.A0B(r9, 2);
        2el r4 = this.A01;
        View findViewById = view.findViewById(R.id.reel_main_container);
        if (findViewById != null) {
            C306176Ld r3 = new C306176Ld(r9, r11, r10.A01(), true);
            String id = r10.A0H.getId();
            0qQ.A07(id);
            String A0b = 002.A0b(id, "_segment_", r10.A01());
            AnonymousClass30Y r0 = AnonymousClass30Y.A07;
            C2354830a r6 = new C2354830a(r10, r3, A0b);
            r6.A00((C230372pW) this.A05.getValue());
            r6.A00((C230622pv) this.A06.getValue());
            if (182.A06(0Tu.A05, this.A02.A01, 36310443794366573L)) {
                r6.A00((C306206Lg) this.A07.getValue());
            }
            r6.A00((C311126cB) this.A08.getValue());
            r4.A05(findViewById, r6.A01());
            return;
        }
        throw new IllegalStateException("Segment Viewpoint view is not in view hierarchy");
    }
}
