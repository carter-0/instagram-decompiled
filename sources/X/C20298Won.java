package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.Won  reason: case insensitive filesystem */
public final class C20298Won implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ GenericSurveyFragment A01;
    public final /* synthetic */ AnonymousClass3K2 A02;

    public C20298Won(ViewGroup viewGroup, GenericSurveyFragment genericSurveyFragment, AnonymousClass3K2 r3) {
        this.A01 = genericSurveyFragment;
        this.A00 = viewGroup;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void run() {
        RectF rectF;
        RectF rectF2;
        GenericSurveyFragment genericSurveyFragment = this.A01;
        if (genericSurveyFragment.isResumed()) {
            C50901Fkg fkg = (C50901Fkg) AnonymousClass7TE.A0b(this.A00, R.id.reel_preview_container).getTag();
            if (fkg != null) {
                rectF = 0nA.A0F(fkg.A05);
                rectF2 = new RectF(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            } else {
                rectF = null;
                rectF2 = null;
            }
            this.A02.A0W(rectF, rectF2, genericSurveyFragment, (C51914G7i) null);
        }
    }
}
