package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.save.model.SavedCollection;

public final class IXJ implements JT0 {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ I6H A02;
    public final /* synthetic */ JOV A03;
    public final /* synthetic */ JOW A04;

    public IXJ(1Xj r1, C331157Pu r2, I6H i6h, JOV jov, JOW jow) {
        this.A04 = jow;
        this.A01 = r2;
        this.A02 = i6h;
        this.A00 = r1;
        this.A03 = jov;
    }

    public final void APV() {
        this.A01.A07();
    }

    public final void ARd(int i) {
        C331157Pu r4 = this.A01;
        C331137Ps r10 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r10.A02 = R.drawable.instagram_add_pano_outline_24;
        I6H i6h = this.A02;
        r10.A05 = new ICQ(r4, this.A03, i6h, this.A00, i, 4);
        r10.A07 = AnonymousClass7TE.A16(i6h.A00, 2131968265);
        r4.A0K(r10.A00(), true);
    }

    public final void EzN() {
        I6H i6h = this.A02;
        JOV jov = this.A03;
        I6H.A02(this.A00, this.A01, i6h, jov, 0, false);
    }

    public final void Coi(SavedCollection savedCollection) {
        APV();
        this.A04.Coi(savedCollection);
    }
}
