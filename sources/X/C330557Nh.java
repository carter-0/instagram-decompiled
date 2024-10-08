package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Nh  reason: invalid class name and case insensitive filesystem */
public final class C330557Nh extends C232922uf {
    public final /* synthetic */ C330537Nf A00;

    public final void DmE(2cs r8) {
        AnonymousClass7PN r1;
        0qQ.A0B(r8, 0);
        float f = (float) r8.A09.A00;
        C330537Nf r5 = this.A00;
        RecyclerView recyclerView = r5.A0F;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C249703kE A0Z = recyclerView.A0Z(recyclerView.getChildAt(i));
            if ((A0Z instanceof AnonymousClass7PN) && (r1 = (AnonymousClass7PN) A0Z) != null) {
                r1.DAV(f, r5.A0D);
            }
        }
    }

    public C330557Nh(C330537Nf r1) {
        this.A00 = r1;
    }
}
