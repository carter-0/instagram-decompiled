package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hx8  reason: case insensitive filesystem */
public abstract class C56357Hx8 {
    public static final void A00(Bitmap bitmap, C286575Wy r9, float f, int i) {
        int i2;
        C288095bM r5;
        0qQ.A0B(bitmap, 0);
        C286575Wy r2 = r9;
        r9.ExV(1437973019);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, bitmap) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A00(r9, f);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1626205847, "com.instagram.wonderwall.ui.compose.components.BitmapAttachment (WallImageAttachment.kt:36)");
            }
            AnonymousClass6GC r4 = new AnonymousClass6GC(new C3018360g(bitmap));
            String A00 = C304346Dc.A00(r9, 2131965980);
            Modifier A0P = C51968G9o.A0P(C54739HQw.A00(C51969G9p.A0U(), f, false), 12.0f);
            if (f < 1.0f) {
                r5 = C288075bK.A03;
            } else {
                r5 = C288075bK.A00;
            }
            AnonymousClass6G3.A0A(r2, A0P, r4, r5, A00, 0);
            if (0fL.A02()) {
                0fL.A00(853476635);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7J(bitmap, f, i, 1);
        }
    }

    public static final void A01(C286575Wy r8, ImageUrl imageUrl, float f, int i) {
        int i2;
        C288095bM r6;
        C286625Xd ASQ;
        int i3;
        C286575Wy r3 = r8;
        r8.ExV(1320262832);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A00(r8, f);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1198159880, "com.instagram.wonderwall.ui.compose.components.ImageAttachment (WallImageAttachment.kt:22)");
            }
            if (imageUrl == null) {
                if (0fL.A02()) {
                    0fL.A00(1612323711);
                }
                ASQ = r8.ASQ();
                if (ASQ != null) {
                    i3 = 2;
                    ASQ.A06 = new J7J(imageUrl, f, i, i3);
                }
                return;
            }
            AnonymousClass2DN A01 = 1zC.A01(r3, imageUrl, i2 & 14);
            String A00 = C304346Dc.A00(r3, 2131965980);
            Modifier A0P = C51968G9o.A0P(C54739HQw.A00(C51969G9p.A0U(), f, false), 12.0f);
            if (f < 1.0f) {
                r6 = C288075bK.A03;
            } else {
                r6 = C288075bK.A00;
            }
            AnonymousClass6G3.A0A(r3, A0P, A01, r6, A00, 0);
            if (0fL.A02()) {
                0fL.A00(-1076220582);
            }
        } else {
            r8.Evl();
        }
        ASQ = r3.ASQ();
        if (ASQ != null) {
            i3 = 3;
            ASQ.A06 = new J7J(imageUrl, f, i, i3);
        }
    }
}
