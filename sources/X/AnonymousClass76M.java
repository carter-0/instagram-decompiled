package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.76M  reason: invalid class name */
public final class AnonymousClass76M extends C249703kE implements C328007Db, C328017Dc, C328027Dd, AnonymousClass76N {
    public AnonymousClass7DU A00;
    public C328087Dj A01;
    public final Drawable A02 = C328037De.A00();
    public final TextView A03;
    public final AnonymousClass76O A04 = new AnonymousClass76O(new C377089Km(this, 34));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass76M(TextView textView) {
        super(textView);
        0qQ.A0B(textView, 1);
        this.A03 = textView;
    }

    public final View BJd() {
        return this.A03;
    }

    public final C328087Dj BY0() {
        return this.A01;
    }

    public final void FHQ(int i) {
        AnonymousClass7PT.A00(this.A03.getBackground(), i);
    }

    public final void EdM(AnonymousClass7DU r1) {
        this.A00 = r1;
    }

    public final void EeT(C328087Dj r1) {
        this.A01 = r1;
    }
}
