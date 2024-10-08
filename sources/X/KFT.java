package X;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KFT extends C232222tE {
    public final int A00;
    public final C63588Kzb A01;

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.8Qr] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r22, C249703kE r23) {
        C64785Li1 li1 = (C64785Li1) r22;
        C60581Jnq jnq = (C60581Jnq) r23;
        boolean A1U = AnonymousClass7TF.A1U(0, li1, jnq);
        C62150Kb5 kb5 = jnq.A01;
        GalleryItem.LocalGalleryMedium A0f = JTR.A0f(new Medium((Uri) null, "", li1.A00, A1U ? 1 : 0, 0, 0, 0, 0));
        kb5.A03(new AnonymousClass9I9((DefaultConstructorMarker) null, 0, 0, 15, 3, false, false), new Object(), A0f, false, false, false, false);
        kb5.setMinHeight(kb5.A00);
        li1.A01.A01(new C64863LjP(0, jnq, li1));
    }

    public final Class modelClass() {
        return C64785Li1.class;
    }

    public KFT(C63588Kzb kzb, int i) {
        this.A00 = i;
        this.A01 = kzb;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        int i = MediaPickerItemView.A0X;
        return new C60581Jnq(this.A01, new C62150Kb5(AnonymousClass7TE.A0S(viewGroup), this.A00));
    }
}
