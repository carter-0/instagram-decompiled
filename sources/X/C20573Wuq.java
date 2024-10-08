package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.Wuq  reason: case insensitive filesystem */
public final class C20573Wuq extends HashMap<String, String> {
    public C20573Wuq(String str, String str2) {
        put("err_name", "DiskCorruptionError");
        put(TraceFieldType.CallPath, str);
        put("err_message", str2);
    }
}
