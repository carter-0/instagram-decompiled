package X;

/* renamed from: X.Jzw  reason: case insensitive filesystem */
public final class C61263Jzw extends AnonymousClass0T0 implements Cloneable {
    public C62636KjH A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61263Jzw) {
                C61263Jzw jzw = (C61263Jzw) obj;
                if (!(this.A00 == jzw.A00 && this.A06 == jzw.A06 && this.A05 == jzw.A05 && this.A04 == jzw.A04 && this.A07 == jzw.A07 && 0qQ.A0K(this.A02, jzw.A02) && this.A03 == jzw.A03 && 0qQ.A0K(this.A01, jzw.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TE.A0K(this.A00))));
        return AnonymousClass7TF.A09(this.A03, (AnonymousClass7TF.A09(this.A07, A09) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C61263Jzw(C62636KjH kjH, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = kjH;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A02 = str;
        this.A03 = z5;
        this.A01 = num;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Object clone = super.clone();
        0qQ.A0C(clone, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsTimelineActionBarViewModel.ButtonState");
        return clone;
    }
}
