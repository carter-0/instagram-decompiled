package X;

import com.facebook.papaya.client.ICallback;
import java.util.Map;

/* renamed from: X.SoQ  reason: case insensitive filesystem */
public final class C12175SoQ implements ICallback {
    public ICallback A00;

    public final synchronized void onExecutorComplete(String str, Map map) {
        ICallback iCallback = this.A00;
        if (iCallback != null) {
            iCallback.onExecutorComplete(str, map);
        }
    }
}
