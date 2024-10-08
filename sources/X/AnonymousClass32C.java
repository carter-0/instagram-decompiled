package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.32C  reason: invalid class name */
public final class AnonymousClass32C extends C249403jg {
    public final /* synthetic */ AnonymousClass32A A00;

    public AnonymousClass32C(AnonymousClass32A r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(761265834);
        AnonymousClass32A r1 = this.A00;
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        r1.A0E = z;
        AnonymousClass0fD.A0A(499128963, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        AnonymousClass6VJ r1;
        int A03 = AnonymousClass0fD.A03(1450396673);
        AnonymousClass32A r12 = this.A00;
        if (!r12.A0E && (r1 = r12.A07) != null) {
            r1.A05(AnonymousClass05K.A00);
        }
        AnonymousClass0fD.A0A(-1276494199, A03);
    }
}
