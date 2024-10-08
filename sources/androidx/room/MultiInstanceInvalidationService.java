package androidx.room;

import X.AnonymousClass7TE;
import X.Q7y;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.Map;

public final class MultiInstanceInvalidationService extends Service {
    public int A00;
    public final RemoteCallbackList A01 = new Q7y(this);
    public final Map A02 = AnonymousClass7TE.A1H();
    public final MultiInstanceInvalidationService$binder$1 A03 = new MultiInstanceInvalidationService$binder$1(this);

    public final IBinder onBind(Intent intent) {
        return this.A03;
    }
}
