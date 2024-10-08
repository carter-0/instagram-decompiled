package X;

import com.facebook.rsys.filelogging.gen.LogFileStats;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.SmX  reason: case insensitive filesystem */
public final class C12078SmX implements C13816Thj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LogFileStats A01;
    public final /* synthetic */ C7854Qbc A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void D5G(C11286SJe sJe) {
        Long l;
        Long l2;
        0qQ.A0B(sJe, 0);
        String str = sJe.A03;
        0qQ.A0B(str, 1);
        String optString = new JSONObject(str).optString("manifoldPath");
        0Aj A0d = C51969G9p.A0d(this.A02.A00, "rtc_large_log_upload");
        if (A0d.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0d, "log_type", i);
            } else {
                A0d.AAJ("log_type", (String) null);
            }
            AnonymousClass7TE.A1W(A0d, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 6);
            AnonymousClass7TE.A1W(A0d, "requestor", 1);
            A0d.AAJ("manifold_path", optString);
            A0d.AAJ("shared_call_id", this.A04);
            LogFileStats logFileStats = this.A01;
            Long l3 = null;
            if (logFileStats != null) {
                l = DbS.A0j(logFileStats.logBytes);
            } else {
                l = null;
            }
            A0d.A9F("file_size_bytes", l);
            if (logFileStats != null) {
                l2 = DbS.A0j(logFileStats.droppedLogsCount);
            } else {
                l2 = null;
            }
            A0d.A9F("dropped_logs_count", l2);
            if (logFileStats != null) {
                l3 = DbS.A0j(logFileStats.droppedLogBytes);
            }
            A0d.A9F("dropped_log_bytes", l3);
            A0d.AAJ("local_call_id", this.A03);
            A0d.Cgf();
        }
    }

    public final void DaE(float f) {
    }

    public C12078SmX(LogFileStats logFileStats, C7854Qbc qbc, String str, String str2, int i) {
        this.A02 = qbc;
        this.A00 = i;
        this.A04 = str;
        this.A01 = logFileStats;
        this.A03 = str2;
    }

    public final void D0e() {
        0Aj A0d = C51969G9p.A0d(this.A02.A00, "rtc_large_log_upload");
        if (A0d.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0d, "log_type", i);
            } else {
                A0d.AAJ("log_type", (String) null);
            }
            AnonymousClass7TE.A1W(A0d, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
            AnonymousClass7TE.A1W(A0d, "requestor", 1);
            A0d.AAJ("shared_call_id", this.A04);
            A0d.AAJ("local_call_id", this.A03);
            A0d.Cgf();
        }
    }

    public final void DEX(C8989RKf rKf) {
        0Aj A0d = C51969G9p.A0d(this.A02.A00, "rtc_large_log_upload");
        if (A0d.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0d, "log_type", i);
            } else {
                A0d.AAJ("log_type", (String) null);
            }
            AnonymousClass7TE.A1W(A0d, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
            AnonymousClass7TE.A1W(A0d, "requestor", 1);
            A0d.AAJ("shared_call_id", this.A04);
            A0d.AAJ("local_call_id", this.A03);
            A0d.Cgf();
        }
    }

    public final void onStart() {
        Long l;
        Long l2;
        0Aj A0d = C51969G9p.A0d(this.A02.A00, "rtc_large_log_upload");
        if (A0d.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AnonymousClass7TE.A1W(A0d, "log_type", i);
            } else {
                A0d.AAJ("log_type", (String) null);
            }
            AnonymousClass7TE.A1W(A0d, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 4);
            AnonymousClass7TE.A1W(A0d, "requestor", 1);
            A0d.AAJ("shared_call_id", this.A04);
            LogFileStats logFileStats = this.A01;
            Long l3 = null;
            if (logFileStats != null) {
                l = DbS.A0j(logFileStats.logBytes);
            } else {
                l = null;
            }
            A0d.A9F("file_size_bytes", l);
            if (logFileStats != null) {
                l2 = DbS.A0j(logFileStats.droppedLogsCount);
            } else {
                l2 = null;
            }
            A0d.A9F("dropped_logs_count", l2);
            if (logFileStats != null) {
                l3 = DbS.A0j(logFileStats.droppedLogBytes);
            }
            A0d.A9F("dropped_log_bytes", l3);
            A0d.AAJ("local_call_id", this.A03);
            A0d.Cgf();
        }
    }
}
