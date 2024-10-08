package X;

import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.Wjs  reason: case insensitive filesystem */
public final class C20032Wjs implements Runnable {
    public final /* synthetic */ GenericSurveyFragment A00;

    public C20032Wjs(GenericSurveyFragment genericSurveyFragment) {
        this.A00 = genericSurveyFragment;
    }

    public final void run() {
        GenericSurveyFragment genericSurveyFragment = this.A00;
        if (genericSurveyFragment.isResumed()) {
            C15462UdD udD = genericSurveyFragment.A05;
            if (udD == null) {
                DbS.A13();
                throw AnonymousClass00P.createAndThrow();
            } else {
                udD.A00 = false;
            }
        }
    }
}
