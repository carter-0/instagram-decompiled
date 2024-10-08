package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.save.model.SavedCollection;

public final class IXK implements JT0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ C331157Pu A03;
    public final /* synthetic */ I6H A04;
    public final /* synthetic */ String A05;

    public final void Coi(SavedCollection savedCollection) {
    }

    public IXK(1Xj r1, AnonymousClass3W1 r2, C331157Pu r3, I6H i6h, String str, int i) {
        this.A03 = r3;
        this.A04 = i6h;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A05 = str;
    }

    public final void APV() {
        this.A03.A07();
    }

    public final void ARd(int i) {
        C331157Pu r6 = this.A03;
        C331137Ps r11 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r11.A02 = R.drawable.instagram_add_pano_outline_24;
        I6H i6h = this.A04;
        r11.A05 = new C56779ICc(this.A01, this.A02, r6, i6h, this.A05, this.A00, i);
        r11.A07 = AnonymousClass7TE.A16(i6h.A00, 2131968265);
        r6.A0K(r11.A00(), true);
    }

    public final void EzN() {
        I6H i6h = this.A04;
        C331157Pu r2 = this.A03;
        I6H.A01(this.A01, this.A02, r2, i6h, this.A05, this.A00, 0, false);
    }
}
