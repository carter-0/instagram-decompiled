package X;

import android.os.Debug;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class S3X {
    public int A00 = -1;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04;
    public long A05 = 0;
    public long A06;
    public long A07 = -1;
    public long A08 = -1;
    public Debug.MemoryInfo A09 = null;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public Map A0E;

    public void A00(JSONObject jSONObject) {
        try {
            int i = this.A00;
            if (i != -1) {
                jSONObject.put("queuing_msg_count", i);
            }
            String str = this.A0B;
            if (str != null) {
                jSONObject.put("thread_cpu_usage", str);
            }
            String str2 = this.A0A;
            if (str2 != null) {
                jSONObject.put("proc_cpu_usage", str2);
            }
            if (this.A0D != null) {
                JSONArray A1E = Pxe.A1E();
                Iterator it = this.A0D.iterator();
                while (it.hasNext()) {
                    A1E.put(AnonymousClass7TE.A18(it));
                }
                jSONObject.put("whole_cpu_usage", A1E);
            }
            String str3 = this.A0C;
            if (str3 != null) {
                jSONObject.put("thread_sched_stat", str3);
            }
            if (this.A05 > 0) {
                boolean z = false;
                long j = this.A04;
                if (j != 0) {
                    jSONObject.put(AnonymousClass000.A00(3187), j);
                    jSONObject.put(C273654mx.A00(715), this.A06);
                    z = true;
                }
                long j2 = this.A01;
                if (j2 != 0) {
                    jSONObject.put(AnonymousClass000.A00(2710), j2);
                    jSONObject.put("blocking_gc_time", this.A02);
                } else if (z) {
                }
                jSONObject.put("gc_monitor_interval", this.A05);
            }
            if (this.A08 != -1) {
                jSONObject.put("max_java_heap_size", this.A07);
                jSONObject.put("current_java_heap_size", this.A08);
                jSONObject.put("available_java_heap", this.A03);
                jSONObject.put("total_available_java_heap", (this.A07 - this.A08) + this.A03);
                long j3 = this.A08;
                jSONObject.put("java_heap_usage_percentage", ((j3 - this.A03) * 100) / j3);
            }
            if (this.A0E != null) {
                JSONObject A11 = DbS.A11();
                Iterator A16 = DbV.A16(this.A0E);
                while (A16.hasNext()) {
                    C274924pJ r2 = (C274924pJ) A16.next();
                    A11.put(r2.getName(), this.A0E.get(r2));
                }
                jSONObject.put("monitor_duration", A11);
            }
            if (this.A09 != null) {
                JSONObject A112 = DbS.A11();
                Iterator A0u = AnonymousClass7TF.A0u(this.A09.getMemoryStats());
                while (A0u.hasNext()) {
                    C66584MXp.A18(A0u, A112);
                }
                jSONObject.put("meminfo", A112);
            }
        } catch (Throwable unused) {
        }
    }
}
