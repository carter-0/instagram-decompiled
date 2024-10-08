package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class Q7y extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public final /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        0qQ.A0B(obj, 1);
        this.A00.A02.remove(obj);
    }

    public Q7y(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}
