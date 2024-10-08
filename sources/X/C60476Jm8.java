package X;

import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jm8  reason: case insensitive filesystem */
public final class C60476Jm8 extends C249403jg implements AnonymousClass07Y {
    public final int A00 = 5;
    public final C61417K6o A01;
    public final C63778L6k A02;

    public C60476Jm8(AnonymousClass07Z r2, C61417K6o k6o, C63778L6k l6k) {
        this.A02 = l6k;
        this.A01 = k6o;
        r2.getLifecycle().A09(this);
    }

    @OnLifecycleEvent(07T.ON_START)
    public final void startObservingScroll() {
        this.A02.A02.A15(this);
    }

    @OnLifecycleEvent(07T.ON_STOP)
    public final void stopObservingScroll() {
        this.A02.A02.A16(this);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(1154831303);
        AnonymousClass0eM r3 = this.A01.A09;
        if (!((C60280Jib) r3.getValue()).A00 && ((C60280Jib) r3.getValue()).A07.A0D) {
            C63778L6k l6k = this.A02;
            if (l6k.A01.getItemCount() - l6k.A00.A1b() < this.A00 && !((C60280Jib) r3.getValue()).A00) {
                C60280Jib jib = (C60280Jib) r3.getValue();
                C60280Jib.A00(jib, new C59675JTg(jib, (AnonymousClass4D7) null, 10), false);
            }
        }
        AnonymousClass0fD.A0A(716957623, A03);
    }
}
