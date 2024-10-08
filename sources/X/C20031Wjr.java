package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.Wjr  reason: case insensitive filesystem */
public final class C20031Wjr implements Runnable {
    public final /* synthetic */ GenericSurveyFragment A00;

    public C20031Wjr(GenericSurveyFragment genericSurveyFragment) {
        this.A00 = genericSurveyFragment;
    }

    public final void run() {
        View view;
        GenericSurveyFragment genericSurveyFragment = this.A00;
        int A02 = JTQ.A02(genericSurveyFragment.loadingSpinner);
        ViewGroup viewGroup = genericSurveyFragment.contentContainer;
        if (viewGroup != null) {
            viewGroup.setVisibility(A02);
        }
        ViewGroup viewGroup2 = genericSurveyFragment.retryView;
        if (viewGroup2 == null) {
            ViewStub viewStub = genericSurveyFragment.retryViewStub;
            if (viewStub != null) {
                view = viewStub.inflate();
            } else {
                view = null;
            }
            if (!(view instanceof ViewGroup) || (viewGroup2 = (ViewGroup) view) == null) {
                viewGroup2 = null;
            } else {
                WB9.A00(viewGroup2.requireViewById(R.id.retry), 30, genericSurveyFragment);
            }
        }
        genericSurveyFragment.retryView = viewGroup2;
        AnonymousClass7TF.A16(viewGroup2);
    }
}
