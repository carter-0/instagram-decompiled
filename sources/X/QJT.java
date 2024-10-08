package X;

import org.json.JSONArray;
import org.json.JSONObject;

public final class QJT extends S3X {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public String A04;
    public String A05 = null;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String[] A0D;
    public String[] A0E;

    public final void A00(JSONObject jSONObject) {
        super.A00(jSONObject);
        try {
            if (this.A08 != null) {
                JSONArray A1E = Pxe.A1E();
                for (String put : this.A08.split("\n")) {
                    A1E.put(put);
                }
                jSONObject.put("native_stack_trace", A1E);
            }
            if (this.A0A != null) {
                JSONArray A1E2 = Pxe.A1E();
                for (String put2 : this.A0A.split("\n")) {
                    A1E2.put(put2);
                }
                jSONObject.put("render_thread_native_stack_trace", A1E2);
            }
            String str = this.A0B;
            if (str != null) {
                jSONObject.put("render_thread_sched_stat", str);
            }
            String str2 = this.A09;
            if (str2 != null) {
                jSONObject.put("render_thread_cpu_usage", str2);
            }
            String str3 = this.A07;
            if (str3 != null) {
                jSONObject.put("litho_layout_thread_name", str3);
            }
            if (this.A0D != null) {
                JSONArray A1E3 = Pxe.A1E();
                for (String put3 : this.A0D) {
                    A1E3.put(put3);
                }
                jSONObject.put("litho_layout_thread_stack", A1E3);
            }
            String str4 = this.A06;
            if (str4 != null) {
                jSONObject.put("memory_red_java", str4);
            }
            String str5 = this.A0C;
            if (str5 != null) {
                jSONObject.put("memory_red_system", str5);
            }
            String str6 = this.A04;
            if (str6 != null) {
                jSONObject.put("memory_red_address_space", str6);
            }
            long j = this.A02;
            if (j != -1) {
                jSONObject.put("swap_total", j);
            }
            long j2 = this.A01;
            if (j2 != -1) {
                jSONObject.put("swap_free", j2);
            }
            long j3 = this.A00;
            if (j3 != -1) {
                jSONObject.put("swap_cached", j3);
            }
            long j4 = this.A03;
            if (j4 != -1) {
                jSONObject.put("vm_swap", j4);
            }
            if (this.A0E != null) {
                JSONArray A1E4 = Pxe.A1E();
                for (String str7 : this.A0E) {
                    if (str7 != null) {
                        A1E4.put(str7);
                    }
                }
                jSONObject.put("memory_pressure", A1E4);
            }
            String str8 = this.A05;
            if (str8 != null) {
                jSONObject.put("endpoint", str8);
            }
        } catch (Throwable unused) {
        }
    }
}
