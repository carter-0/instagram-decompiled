package X;

import android.content.Intent;
import java.util.HashMap;

public final class TSS extends HashMap<String, String> {
    public final /* synthetic */ Intent A00;

    public TSS(Intent intent, String str) {
        this.A00 = intent;
        put("intent", 0eG.A00(intent));
        put("error", str);
    }
}
