package X;

import android.view.animation.Interpolator;
import com.facebook.android.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedList;

public final class WFV implements X7N, X2F {
    public Interpolator A00;
    public C14635Tzh A01;
    public final Collection A02 = new LinkedList();

    public final void CvN(C14635Tzh tzh) {
    }

    private void A00(C14635Tzh tzh) {
        Collection<VUS> collection = this.A02;
        for (VUS vus : collection) {
            C14957UGv uGv = vus.A00;
            C19879Wh8 wh8 = vus.A01;
            uGv.A0I(wh8.A03());
            uGv.A0H(1.0f);
            wh8.A04 = null;
        }
        collection.clear();
        tzh.A04();
        this.A01 = null;
    }

    public final void CvQ(C14635Tzh tzh) {
        float interpolation;
        int i;
        int i2;
        float f = tzh.A00;
        for (VUS vus : this.A02) {
            C19879Wh8 wh8 = vus.A01;
            LatLng A03 = wh8.A04.A03();
            LatLng A032 = wh8.A03();
            Interpolator interpolator = this.A00;
            if (interpolator == null) {
                interpolation = f;
            } else {
                interpolation = interpolator.getInterpolation(f);
            }
            double d = A032.A00;
            double d2 = A03.A00;
            double d3 = (double) interpolation;
            double d4 = (d - d2) * d3;
            double d5 = A032.A01;
            double d6 = A03.A01;
            double d7 = d5 - d6;
            if (d7 < -180.0d) {
                i = 360;
            } else {
                i = 0;
                if (d7 > 180.0d) {
                    i = -360;
                }
            }
            double d8 = d2 + d4;
            double d9 = d6 + ((d7 + ((double) i)) * d3);
            if (d9 < -180.0d) {
                i2 = 360;
            } else {
                i2 = 0;
                if (d9 > 180.0d) {
                    i2 = -360;
                }
            }
            LatLng latLng = new LatLng(d8, d9 + ((double) i2));
            C14957UGv uGv = vus.A00;
            uGv.A0I(latLng);
            uGv.A0H(f);
        }
    }

    public final void CvB(C14635Tzh tzh) {
        A00(tzh);
    }

    public final void CvF(C14635Tzh tzh) {
        A00(tzh);
    }
}
