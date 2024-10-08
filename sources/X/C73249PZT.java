package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.PZT  reason: case insensitive filesystem */
public final class C73249PZT implements Runnable {
    public final /* synthetic */ PI3 A00;
    public final /* synthetic */ C61033JvX A01;

    public C73249PZT(PI3 pi3, C61033JvX jvX) {
        this.A00 = pi3;
        this.A01 = jvX;
    }

    public final void run() {
        View view;
        SimpleImageUrl simpleImageUrl;
        int i;
        PI3 pi3 = this.A00;
        OTJ otj = pi3.A00;
        if (otj == null) {
            0qQ.A0F("viewBinder");
            throw AnonymousClass00P.createAndThrow();
        }
        C61033JvX jvX = this.A01;
        C8944RGm rGm = pi3.A06;
        OCV ocv = pi3.A08;
        0qQ.A0B(rGm, 1);
        0qQ.A0B(ocv, 2);
        int ordinal = rGm.ordinal();
        if (ordinal == 4) {
            Integer num = jvX.A06;
            if (num != null) {
                int intValue = num.intValue();
                OGM ogm = otj.A02;
                ConstraintLayout constraintLayout = ogm.A02;
                constraintLayout.setVisibility(0);
                C71396Ojv.A00(constraintLayout, 0, ocv);
                DbT.A18(otj.A00, ogm.A04, intValue);
                ogm.A00.setVisibility(0);
            }
            String str = jvX.A07;
            if (str != null) {
                OTJ.A00(otj, jvX.A05, str, AnonymousClass7TF.A1Y(jvX.A03, true));
            }
            List list = jvX.A0A;
            if (list != null) {
                view = otj.A02.A01;
                View A0b = AnonymousClass7TE.A0b(view, R.id.right_image_pile_container);
                if (list.size() >= 2) {
                    A0b.setVisibility(0);
                    ImageUrlBase imageUrlBase = (ImageUrlBase) 00k.A0O(list, 1);
                    if (imageUrlBase != null) {
                        JTO.A0Y(view, R.id.image_pile_second).setUrl(imageUrlBase, otj.A01);
                    }
                    simpleImageUrl = (ImageUrlBase) 00k.A0O(list, 0);
                    if (simpleImageUrl != null) {
                        i = R.id.image_pile_first;
                    } else {
                        return;
                    }
                } else {
                    A0b.setVisibility(8);
                    return;
                }
            } else {
                return;
            }
        } else if (ordinal == 3) {
            Integer num2 = jvX.A06;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                OGM ogm2 = otj.A02;
                ConstraintLayout constraintLayout2 = ogm2.A02;
                constraintLayout2.setVisibility(0);
                C71396Ojv.A00(constraintLayout2, 0, ocv);
                DbT.A18(otj.A00, ogm2.A04, intValue2);
                ogm2.A00.setVisibility(0);
            }
            String str2 = jvX.A07;
            if (str2 != null) {
                OTJ.A00(otj, jvX.A05, str2, AnonymousClass7TF.A1Y(jvX.A03, true));
            }
            simpleImageUrl = jvX.A00;
            if (simpleImageUrl != null) {
                view = otj.A02.A01;
                i = R.id.left_thumbnail_image;
            } else {
                return;
            }
        } else {
            return;
        }
        JTO.A0Y(view, i).setUrl(simpleImageUrl, otj.A01);
    }
}
