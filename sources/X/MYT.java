package X;

import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;

public final class MYT extends C252233om {
    public final /* synthetic */ MYU A00;

    public MYT(MYU myu) {
        this.A00 = myu;
    }

    public final void onPause() {
        this.A00.A07();
    }

    public final void onViewStateRestored(Bundle bundle) {
        if (bundle != null) {
            MYU myu = this.A00;
            if (myu.A01) {
                myu.A05.markerDrop(myu.A0L(), myu.A00);
            }
        }
    }

    public final void onCreate() {
        Looper.myQueue().addIdleHandler(this.A00.A02);
    }

    public final void onResume() {
        MessageQueue myQueue = Looper.myQueue();
        MYU myu = this.A00;
        myQueue.removeIdleHandler(myu.A02);
        if (myu.A00) {
            myu.A0M();
        } else {
            myu.A0N();
        }
    }
}
