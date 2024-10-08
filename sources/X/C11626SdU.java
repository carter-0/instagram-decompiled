package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.SdU  reason: case insensitive filesystem */
public final class C11626SdU implements AnonymousClass07Y {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C11380SQs A01;
    public final /* synthetic */ boolean A02;

    public C11626SdU(Fragment fragment, C11380SQs sQs, boolean z) {
        this.A02 = z;
        this.A00 = fragment;
        this.A01 = sQs;
    }

    @OnLifecycleEvent(07T.ON_PAUSE)
    public final void onPause() {
        if (this.A02 || C9666Rek.A00(this.A00.getActivity())) {
            C11380SQs sQs = this.A01;
            C11380SQs.A01(sQs);
            sQs.A05 = null;
        }
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void onResume() {
        if (this.A02 || C9666Rek.A00(this.A00.getActivity())) {
            C11380SQs sQs = this.A01;
            FragmentActivity activity = this.A00.getActivity();
            if (activity != null && activity.getWindow() != null) {
                View A0A = C66581MXm.A0A(activity);
                sQs.A05 = A0A;
                if (A0A != null && A0A.getWindowToken() != null) {
                    C11380SQs.A00(activity, sQs);
                } else if (sQs.A03 == null) {
                    GW4 gw4 = new GW4(3, activity, sQs);
                    sQs.A03 = gw4;
                    View view = sQs.A05;
                    if (view != null) {
                        view.addOnAttachStateChangeListener(gw4);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
    }
}
