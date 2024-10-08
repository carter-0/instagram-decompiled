package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class TCP implements Runnable {
    public final /* synthetic */ SHT A00;

    public TCP(SHT sht) {
        this.A00 = sht;
    }

    public final void run() {
        SHT sht = this.A00;
        Executor executor = SHT.A04;
        C10778Rxy rxy = sht.A02;
        Map map = rxy.A04;
        String str = "";
        if (!map.isEmpty()) {
            JSONObject A11 = DbS.A11();
            try {
                long j = rxy.A01;
                rxy.A01 = 1 + j;
                A11.put("seq", j);
                A11.put("time", S9J.A00(System.currentTimeMillis()));
                JSONArray A1E = Pxe.A1E();
                Iterator A0v = AnonymousClass7TF.A0v(map);
                while (A0v.hasNext()) {
                    A1E.put(((S6G) A0v.next()).A01());
                }
                A11.put("data", A1E);
                A11.put("log_type", "client_event");
                A11.put("app_id", "567310203415052");
                A11.put("app_ver", rxy.A02);
                A11.put("build_num", rxy.A03);
                A11.put(Q2M.A00(), rxy.A05);
                str = A11.toString();
            } catch (JSONException e) {
                0KC.A0I("CounterSession", "Failed to serialize", e);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                int A002 = sht.A01.A00(str);
                if (A002 == 200) {
                    map.clear();
                    rxy.A00 = 0;
                    return;
                }
                0KC.A0O("CounterAnalytics", "Unsuccessful upload. response code=%d", new Object[]{Integer.valueOf(A002)});
            } catch (Exception e2) {
                0KC.A0H("CounterAnalytics", "Unsuccessful upload.", e2);
            }
        }
    }
}
