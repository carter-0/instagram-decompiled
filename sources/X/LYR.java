package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class LYR implements View.OnLayoutChangeListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C308596Uw A04;
    public final /* synthetic */ C308606Ux A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public LYR(AnonymousClass0iw r1, IgImageView igImageView, 1Xj r3, C308596Uw r4, C308606Ux r5, String str, float f, boolean z, boolean z2) {
        this.A03 = r3;
        this.A02 = igImageView;
        this.A07 = z;
        this.A08 = z2;
        this.A05 = r5;
        this.A06 = str;
        this.A01 = r1;
        this.A00 = f;
        this.A04 = r4;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        1Xj r1 = this.A03;
        IgImageView igImageView = this.A02;
        ExtendedImageUrl A1m = r1.A1m(igImageView.getWidth());
        boolean z = this.A07;
        if (z || this.A08) {
            C308606Ux r7 = this.A05;
            String str = this.A06;
            AnonymousClass0iw r3 = this.A01;
            boolean z2 = this.A08;
            C308606Ux.A00(r3, A1m, igImageView, this.A04, r7, str, this.A00, z2, z);
            return;
        }
        AnonymousClass0iw r32 = this.A01;
        String str2 = this.A06;
        C308596Uw r12 = this.A04;
        if (A1m != null) {
            igImageView.A0E = new C64859LjL(r12);
            igImageView.setUrl(A1m, r32);
            return;
        }
        igImageView.setVisibility(4);
        C14164Tr2.A01(str2, "Null image");
    }
}
