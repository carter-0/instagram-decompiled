package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.WtX  reason: case insensitive filesystem */
public final class C20549WtX implements C46214DQs {
    public final /* synthetic */ C17890Vhh A00;

    public final void DEd(String str, Throwable th) {
        0qQ.A0B(str, 0);
        C18724Vyy.A01(C18724Vyy.A00("report_adid_failure", str, th, (List) null), "error", this.A00.A04);
    }

    public C20549WtX(C17890Vhh vhh) {
        this.A00 = vhh;
    }

    public final void onSuccess() {
        C18724Vyy vyy = this.A00.A04;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TraceFieldType.AdhocEventName, "report_adid_success");
        C18724Vyy.A01(DbT.A10(jSONObject), "info", vyy);
    }
}
