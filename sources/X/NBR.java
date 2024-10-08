package X;

import com.facebook.msys.mci.DataTask;
import java.util.Map;

public final class NBR extends AnonymousClass45Y {
    public final /* synthetic */ C296065pO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBR(C296065pO r2) {
        super("StreamingUploadDataTask_ask_for_data");
        this.A00 = r2;
    }

    public final void run() {
        C296065pO r3 = this.A00;
        Map map = r3.A07.A03;
        DataTask dataTask = r3.A02;
        if (map.containsKey(dataTask.mTaskIdentifier)) {
            r3.A03.canHandleStreamingUploadUpdate(dataTask.mTaskIdentifier);
        }
    }
}
