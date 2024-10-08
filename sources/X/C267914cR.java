package X;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4cR  reason: invalid class name and case insensitive filesystem */
public final class C267914cR extends 0ng {
    public final /* synthetic */ 1Bn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C267914cR(1Bn r4, boolean z) {
        super(52, 4, z, false);
        this.A00 = r4;
    }

    public final void run() {
        1Bn r4 = this.A00;
        synchronized (r4) {
            SharedPreferences.Editor edit = r4.A00.edit();
            Map map = r4.A01;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == r4) {
                    edit.remove(str);
                } else if (value instanceof Set) {
                    edit.putStringSet(str, (Set) value);
                } else if (value instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof Long) {
                    edit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    edit.putFloat(str, ((Float) value).floatValue());
                } else if (value instanceof Integer) {
                    edit.putInt(str, ((Integer) value).intValue());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("try to store unsupport value type ");
                    sb.append(value);
                    0wb.A03("LazyPreferences", sb.toString());
                }
            }
            edit.apply();
            map.clear();
        }
    }
}
