package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.ArrayList;

/* renamed from: X.Lzc  reason: case insensitive filesystem */
public final class C65784Lzc implements MT3 {
    public final /* synthetic */ LPF A00;
    public final /* synthetic */ C63957LFd A01;
    public final /* synthetic */ GalleryView A02;

    public C65784Lzc(LPF lpf, C63957LFd lFd, GalleryView galleryView) {
        this.A00 = lpf;
        this.A02 = galleryView;
        this.A01 = lFd;
    }

    public final void DHS(LR6 lr6, ArrayList arrayList) {
        LPF lpf = this.A00;
        LOJ loj = lpf.A09;
        ArrayList arrayList2 = loj.A07;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (!arrayList2.isEmpty()) {
            LR6 lr62 = (LR6) DbZ.A0g(arrayList2, 0);
            loj.A01 = lr62;
            loj.A05.A01(lr62.A01);
        }
        if (arrayList2.size() > 1) {
            LGD lgd = loj.A05;
            ImageView imageView = lgd.A07;
            if (imageView != null) {
                lgd.A00 = true;
                imageView.setVisibility(0);
            }
            View.OnClickListener A002 = LY5.A00(loj, 12);
            if (lgd.A0D) {
                A002 = new LY7(52, (Object) A002, (Object) lgd);
            }
            View view = lgd.A04;
            if (!(view == null && (view = lgd.A0C) == null)) {
                AnonymousClass0fU.A00(A002, view);
            }
        }
        loj.A06.notifyDataSetChanged();
        this.A02.post(new M82(lpf, this.A01));
    }
}
