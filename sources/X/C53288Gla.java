package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Gla  reason: case insensitive filesystem */
public final class C53288Gla extends AnonymousClass0T0 {
    public final int A00;
    public final IntentAwareAdPivotState A01;
    public final C230292pL A02;
    public final C54077Gz1 A03;
    public final AnonymousClass2pN A04;
    public final C230302pO A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53288Gla) {
                C53288Gla gla = (C53288Gla) obj;
                if (!0qQ.A0K(this.A03, gla.A03) || !0qQ.A0K(this.A01, gla.A01) || this.A00 != gla.A00 || !0qQ.A0K(this.A04, gla.A04) || !0qQ.A0K(this.A05, gla.A05) || !0qQ.A0K(this.A02, gla.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03)) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public C53288Gla(IntentAwareAdPivotState intentAwareAdPivotState, C230292pL r2, C54077Gz1 gz1, AnonymousClass2pN r4, C230302pO r5, int i) {
        this.A03 = gz1;
        this.A01 = intentAwareAdPivotState;
        this.A00 = i;
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
    }
}
