package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JWw  reason: case insensitive filesystem */
public final class C59759JWw extends C232232tF {
    public final C376529Ii A00;
    public final 0sP A01;
    public final 0sP A02;

    public C59759JWw(C376529Ii r2, 0sP r3, 0sP r4) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.gallery_picker_grid_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        C59738JVw A002 = JXQ.A00(JTR.A0i(constraintLayout, R.id.gallery_picker_grid_item_background));
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60657Jp4(constraintLayout, new C59851JaS((GalleryPickerMediaOverlayView) AnonymousClass7TE.A0b(constraintLayout, R.id.gallery_picker_item_overlay)), A002);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r17, C249703kE r18) {
        String str;
        Bitmap bitmap;
        String str2;
        C64795LiF liF = (C64795LiF) r17;
        C60657Jp4 jp4 = (C60657Jp4) r18;
        AnonymousClass7TG.A1N(liF, jp4);
        C63698L3i l3i = new C63698L3i(this, liF);
        C376529Ii r9 = this.A00;
        0qQ.A0B(r9, 2);
        GalleryItem galleryItem = liF.A01;
        AnonymousClass8y3 r1 = jp4.A02;
        String str3 = null;
        if (r1 != null) {
            str = r1.A02;
        } else {
            str = null;
        }
        AnonymousClass8y3 r12 = galleryItem.A05;
        if (r12 != null) {
            str3 = r12.A02;
        }
        boolean A1a = C51966G9m.A1a(str, str3);
        if (r12 != null) {
            jp4.A02 = r12;
        }
        ConstraintLayout constraintLayout = jp4.A03;
        LYA.A01(constraintLayout, liF, l3i, jp4, 9);
        constraintLayout.setOnLongClickListener(new LYV(1, l3i, jp4));
        AnonymousClass9I9 r8 = liF.A00;
        if (r12 != null) {
            LNL lnl = LNL.A00;
            C59738JVw jVw = jp4.A05;
            C59851JaS jaS = jp4.A04;
            if (r12.A03) {
                bitmap = jp4.A00;
                if (bitmap == null) {
                    bitmap = BitmapFactory.decodeResource(jaS.A00.getResources(), R.drawable.filled_grid_album_icon);
                    if (bitmap != null) {
                        jp4.A00 = bitmap;
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            } else {
                bitmap = null;
            }
            if (r12.A04) {
                int i = r12.A00;
                if (i > 0) {
                    str2 = C347917xa.A01(i);
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            lnl.A00(bitmap, constraintLayout, r8, r9, galleryItem, jaS, jVw, str2, A1a, false);
            ImageUrl imageUrl = r12.A01;
            if (imageUrl != null) {
                C64617Lf3 lf3 = new C64617Lf3(4, r9, jp4);
                jp4.A01 = lf3;
                1OO A0J = 1NK.A00().A0J(imageUrl, (String) null);
                A0J.A0I = false;
                A0J.A02(lf3);
                A0J.A01();
            }
            jaS.A00.invalidate();
            constraintLayout.invalidate();
        }
    }

    public final Class modelClass() {
        return C64795LiF.class;
    }
}
