package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.5nB  reason: invalid class name and case insensitive filesystem */
public interface C294875nB {
    void Cj6(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5);

    void Cj7(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4);

    void D8N(DirectShareTarget directShareTarget);

    void D9P(DirectShareTarget directShareTarget);

    void Dk6(C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5);

    void Dk7(RectF rectF, View view, C67058MhZ mhZ, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2);

    void Dnr(C67058MhZ mhZ, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5);

    void DpB(View view, C67058MhZ mhZ, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z);

    void DpC(RectF rectF, 28D r2, DirectShareTarget directShareTarget);

    void DpD(View view);
}
