package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8Qw  reason: invalid class name and case insensitive filesystem */
public final class C355668Qw extends C249403jg {
    public final /* synthetic */ AnonymousClass8QZ A00;

    public C355668Qw(AnonymousClass8QZ r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(275994088);
        if (i == 0 || i == 1) {
            this.A00.A0B = false;
        }
        AnonymousClass0fD.A0A(-315379449, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollRange;
        int i3;
        int A03 = AnonymousClass0fD.A03(-1160574191);
        AnonymousClass8QZ r5 = this.A00;
        if (r5.A0B) {
            i3 = 1828961982;
        } else {
            boolean z = r5.A0Z;
            RecyclerView recyclerView2 = r5.A0L;
            if (z) {
                int computeHorizontalScrollOffset = recyclerView2.computeHorizontalScrollOffset();
                computeHorizontalScrollRange = 0;
                if (computeHorizontalScrollOffset > 0) {
                    computeHorizontalScrollRange = -computeHorizontalScrollOffset;
                }
            } else {
                computeHorizontalScrollRange = (recyclerView2.computeHorizontalScrollRange() - recyclerView2.computeHorizontalScrollExtent()) - recyclerView2.computeHorizontalScrollOffset();
            }
            r5.A0H.mutate().setAlpha((int) 0mi.A02((float) Math.abs(computeHorizontalScrollRange), 0.0f, (float) r5.A0E, 0.0f, 255.0f));
            i3 = -1146443011;
        }
        AnonymousClass0fD.A0A(i3, A03);
    }
}
