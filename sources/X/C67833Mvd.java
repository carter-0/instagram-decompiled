package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mvd  reason: case insensitive filesystem */
public final class C67833Mvd extends C249403jg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass77U A01;

    public C67833Mvd(AnonymousClass77U r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(1760405628);
        if (i == 0) {
            AnonymousClass7TF.A0D().postDelayed(new C73298PaJ(this, this.A01, this.A00), 100);
        }
        AnonymousClass0fD.A0A(-307581699, A03);
    }
}
