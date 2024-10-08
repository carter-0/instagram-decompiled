package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* renamed from: X.6IR  reason: invalid class name */
public final class AnonymousClass6IR extends C267794cD implements C267814cG {
    public AnonymousClass6H4 A00;

    public final /* synthetic */ void DPk() {
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6IR) && 0qQ.A0K(this.A00, ((AnonymousClass6IR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DisplayingDisappearingItemsNode(animator=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final void A0E() {
        this.A00.A02 = this;
    }

    public final void A0F() {
        this.A00.A06();
    }

    public final void AQM(AnonymousClass5Q4 r14) {
        List list = this.A00.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C56602I4b i4b = (C56602I4b) list.get(i);
            GraphicsLayer graphicsLayer = i4b.A04;
            if (graphicsLayer != null) {
                long j = i4b.A00;
                float f = (float) ((int) (j >> 32));
                float f2 = (float) ((int) (j & 4294967295L));
                long j2 = graphicsLayer.A06;
                float f3 = f - ((float) ((int) (j2 >> 32)));
                float f4 = f2 - ((float) ((int) (j2 & 4294967295L)));
                AnonymousClass5QF r3 = ((AnonymousClass5QC) r14.Ayw()).A01;
                r3.FHv(f3, f4);
                try {
                    C289365dT.A00(r14, graphicsLayer);
                } finally {
                    r3.FHv(-f3, -f4);
                }
            }
        }
        r14.AQW();
    }
}
