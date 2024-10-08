package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.Jpo  reason: case insensitive filesystem */
public final class C60703Jpo extends C249703kE implements C348257y9, AnonymousClass1MK {
    public LD3 A00;
    public C63810L7q A01;
    public boolean A02;
    public final View A03;
    public final C252063oV A04;
    public final C252063oV A05;

    public final boolean CWP(Medium medium) {
        return true;
    }

    public final void CyF(C226952iF r3, AnonymousClass3LX r4) {
        0qQ.A0B(r4, 1);
        C63810L7q l7q = this.A01;
        if (l7q != null) {
            A00(r4.A01, C364678lo.A01(l7q.A03.A0X));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        0qQ.A0B(bitmap, 2);
        A00(bitmap, 0);
    }

    private final void A00(Bitmap bitmap, int i) {
        if (bitmap != null) {
            C252063oV r1 = this.A05;
            if (r1.CFV() == 0) {
                ((ImageView) r1.getView()).setImageBitmap(bitmap);
            } else {
                C252063oV r3 = this.A04;
                if (r3.CFV() == 0) {
                    C63810L7q l7q = this.A01;
                    if (l7q != null) {
                        C63809L7p l7p = l7q.A01;
                        ((LayoutImageView) r3.getView()).A0O((int) l7p.A03, (int) l7p.A00, bitmap, i);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0w("Loaded thumbnail but no image preview is visible.");
                }
            }
        }
        LD3 ld3 = this.A00;
        if (ld3 != null) {
            ld3.A00();
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        LD3 ld3 = this.A00;
        if (ld3 != null) {
            ld3.A00();
        }
    }

    public final void DLY(Medium medium, String str) {
        LD3 ld3 = this.A00;
        if (ld3 != null) {
            ld3.A00();
        }
    }

    public C60703Jpo(View view) {
        super(view);
        this.A03 = view;
        this.A05 = DbU.A0Z(view, R.id.layout_thumbnail_simple_image_stub);
        this.A04 = DbU.A0Z(view, R.id.layout_thumbnail_layout_image_stub);
    }
}
