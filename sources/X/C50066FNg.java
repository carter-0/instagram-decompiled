package X;

import android.view.View;

/* renamed from: X.FNg  reason: case insensitive filesystem */
public final class C50066FNg implements View.OnClickListener {
    public final /* synthetic */ C255783ui A00;
    public final /* synthetic */ C309756Zm A01;
    public final /* synthetic */ AnonymousClass6P2 A02;

    public C50066FNg(C255783ui r1, C309756Zm r2, AnonymousClass6P2 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(694197194);
        AnonymousClass6P2 r2 = this.A02;
        View view2 = r2.A01;
        if (view2 != null) {
            float width = ((float) view2.getWidth()) * 0.5f;
            View view3 = r2.A01;
            if (view3 != null) {
                this.A01.DcE(this.A00, (int) width, (int) (((float) view3.getHeight()) * 0.5f));
                AnonymousClass0fD.A0C(-102757526, A05);
                return;
            }
        }
        0qQ.A0F("productThumbnailTappableArea");
        throw AnonymousClass00P.createAndThrow();
    }
}
