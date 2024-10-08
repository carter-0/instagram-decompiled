package X;

import java.util.List;

public final class V4Z {
    public int A00;
    public int A01;
    public Float A02;
    public List A03;
    public List A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof V4Z) {
                V4Z v4z = (V4Z) obj;
                if (!0qQ.A0K(this.A02, v4z.A02) || !0qQ.A0K(this.A04, v4z.A04) || !0qQ.A0K(this.A03, v4z.A03) || this.A05 != v4z.A05 || this.A00 != v4z.A00 || this.A01 != v4z.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A03, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31)) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ParametricSliderDataModel(sliderValue=");
        sb.append(this.A02);
        sb.append(", gradientColors=");
        sb.append(this.A04);
        sb.append(", choicePaths=");
        sb.append(this.A03);
        sb.append(", passSliderUpdateToBloksOnTouchUpOnly=");
        sb.append(this.A05);
        sb.append(", currentSliderPosition=");
        sb.append(this.A00);
        sb.append(", thumbBorderWidth=");
        return C51975G9x.A0j(sb, this.A01);
    }
}
