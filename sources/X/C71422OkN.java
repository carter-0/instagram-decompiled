package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.OkN  reason: case insensitive filesystem */
public final class C71422OkN implements View.OnLongClickListener {
    public final /* synthetic */ C67181Mjd A00;
    public final /* synthetic */ C67058MhZ A01;
    public final /* synthetic */ C68200N5p A02;
    public final /* synthetic */ C67283MlI A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;

    public C71422OkN(C67181Mjd mjd, C67058MhZ mhZ, C68200N5p n5p, C67283MlI mlI, DirectShareTarget directShareTarget, String str) {
        this.A03 = mlI;
        this.A00 = mjd;
        this.A04 = directShareTarget;
        this.A05 = str;
        this.A02 = n5p;
        this.A01 = mhZ;
    }

    public final boolean onLongClick(View view) {
        C67283MlI mlI = this.A03;
        ViewGroup viewGroup = mlI.A07;
        viewGroup.requestDisallowInterceptTouchEvent(true);
        C67181Mjd mjd = this.A00;
        if (182.A06(0Tu.A05, mjd.A02, 36317934218909355L)) {
            DirectShareTarget directShareTarget = this.A04;
            if (directShareTarget.A04 != null) {
                mjd.A03.Dk7(0nA.A0F(mlI.A0O.A04), viewGroup, this.A01, directShareTarget, this.A05, this.A02.A03, false, false);
            }
        }
        return true;
    }
}
