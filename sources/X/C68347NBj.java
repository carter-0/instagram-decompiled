package X;

import com.facebook.msys.mci.DataTask;
import java.util.Map;

/* renamed from: X.NBj  reason: case insensitive filesystem */
public final class C68347NBj extends AnonymousClass45Y {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C296065pO A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68347NBj(C296065pO r2, int i) {
        super("StreamingUploadDataTask_update");
        this.A01 = r2;
        this.A00 = i;
    }

    public final void run() {
        C296065pO r3 = this.A01;
        Map map = r3.A07.A03;
        DataTask dataTask = r3.A02;
        if (map.containsKey(dataTask.mTaskIdentifier)) {
            r3.A03.updateDataTaskUploadProgress(dataTask.mTaskIdentifier, (long) this.A00, r3.A00, r3.A01.longValue());
        }
    }
}
