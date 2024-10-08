package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8Lc  reason: invalid class name and case insensitive filesystem */
public final class C354218Lc implements C354228Ld {
    public final /* synthetic */ AnonymousClass8LU A00;

    public C354218Lc(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final int CDy() {
        0eP r0;
        0eP r02;
        AnonymousClass8LU r2 = this.A00;
        if (!(r2.A05 instanceof AnonymousClass80O)) {
            return r2.A0E();
        }
        AnonymousClass861 r1 = r2.A0y;
        int i = ClipsCreationViewModel.A00(r2.A0u).A00;
        AnonymousClass2Fj r3 = r1.A07;
        0eP r03 = (0eP) r3.A02();
        int i2 = 0;
        if ((r03 == null || ((Number) r03.A01).intValue() != -1) && (r0 = (0eP) r3.A02()) != null) {
            i = ((Number) r0.A01).intValue();
        }
        0eP r04 = (0eP) r3.A02();
        if ((r04 == null || ((Number) r04.A00).intValue() != -1) && (r02 = (0eP) r3.A02()) != null) {
            i2 = ((Number) r02.A00).intValue();
        }
        return i - i2;
    }

    public final void E29() {
        C378369Pn r1 = this.A00.A0B;
        if (r1 != null) {
            r1.A09(true);
        }
    }

    public final void E2v() {
        AnonymousClass8LU.A07(this.A00);
    }
}
