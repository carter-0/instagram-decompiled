package X;

import android.view.View;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;

public final class THU implements Runnable {
    public final /* synthetic */ WaitingForStringsActivity A00;
    public final /* synthetic */ Throwable A01;

    public THU(WaitingForStringsActivity waitingForStringsActivity, Throwable th) {
        this.A00 = waitingForStringsActivity;
        this.A01 = th;
    }

    public final void run() {
        String str;
        WaitingForStringsActivity waitingForStringsActivity = this.A00;
        waitingForStringsActivity.A09 = true;
        View view = waitingForStringsActivity.A01;
        if (view == null) {
            str = "progressView";
        } else {
            view.setVisibility(8);
            View view2 = waitingForStringsActivity.A00;
            if (view2 == null) {
                str = "errorView";
            } else {
                view2.setVisibility(0);
                View view3 = waitingForStringsActivity.A02;
                if (view3 == null) {
                    str = "useEnglishButton";
                } else {
                    view3.setVisibility(0);
                    13u r2 = waitingForStringsActivity.A03;
                    if (r2 == null) {
                        str = "resourcesLogger";
                    } else {
                        AnonymousClass1Qr r0 = waitingForStringsActivity.A04;
                        if (r0 == null) {
                            str = "stringResourcesDelegate";
                        } else {
                            r2.A01(r0.A03().toString(), this.A01, true);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
