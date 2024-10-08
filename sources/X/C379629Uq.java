package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: X.9Uq  reason: invalid class name and case insensitive filesystem */
public final class C379629Uq implements Q2X {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass6L8 A02;

    public final void Cjy(int i, Integer num) {
        AnonymousClass6L8 r2;
        String valueOf;
        String str;
        0qQ.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2) {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_fail";
        } else {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_fail";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        0qQ.A07(formatStrLocaleSafe);
        AnonymousClass6L8.A00(r2, formatStrLocaleSafe, (String) null);
    }

    public final void Cjz(Integer num, Map map, int i) {
        AnonymousClass6L8 r2;
        String valueOf;
        String str;
        0qQ.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2) {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_start";
        } else {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_start";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        0qQ.A07(formatStrLocaleSafe);
        AnonymousClass6L8.A01(r2, new C377699Mv(r2, map, formatStrLocaleSafe, 0, r2.A01.currentMonotonicTimestampNanos()));
    }

    public final void Ck0(int i, Integer num) {
        AnonymousClass6L8 r2;
        String valueOf;
        String str;
        0qQ.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2) {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_success";
        } else {
            r2 = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_success";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        0qQ.A07(formatStrLocaleSafe);
        AnonymousClass6L8.A00(r2, formatStrLocaleSafe, (String) null);
    }

    public final void CwA(String str, int i) {
        0qQ.A0B(str, 0);
        boolean z = this.A01;
        AnonymousClass6L8 r3 = this.A02;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("load_source", str);
        String A002 = A00("byte_size", String.valueOf(i), A1E);
        if (z) {
            AnonymousClass6L8.A00(r3, "extra_assets_fetch_success", A002);
            return;
        }
        AnonymousClass6L8.A00(r3, "assets_fetch_success", A002);
        this.A00 = true;
    }

    public final void Dlm(ImmutableMap immutableMap, Integer num, String str) {
        Integer num2 = num;
        0qQ.A0B(num, 0);
        AnonymousClass6L8 r0 = this.A02;
        QuickPerformanceLogger quickPerformanceLogger = r0.A01;
        C379599Un r3 = r0.A00;
        C379619Up r5 = r0.A02;
        ExecutorService executorService = r0.A03;
        if (executorService.isTerminated() || executorService.isShutdown()) {
            0wb.A03("ShowreelNativeErrorReporter", C273654mx.A00(1402));
            return;
        }
        executorService.execute(new C41253Aqp(r3, quickPerformanceLogger, r5, immutableMap, num2, str, quickPerformanceLogger.currentMonotonicTimestampNanos()));
    }

    public final void Ctc(String str) {
        AnonymousClass6L8.A00(this.A02, "active_request_reuse", A00(Py0.A00(), str, AnonymousClass7TE.A1E()));
    }

    public final void Cw8(Throwable th) {
        boolean z = this.A01;
        AnonymousClass6L8 r4 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("error", "general_error");
        String A002 = A00("error_msg", message, A1E);
        if (z) {
            AnonymousClass6L8.A00(r4, "extra_assets_fetch_fail", A002);
            return;
        }
        AnonymousClass6L8.A00(r4, "assets_fetch_fail", A002);
        this.A00 = true;
    }

    public final void Cw9() {
        boolean z = this.A00;
        AnonymousClass6L8 r2 = this.A02;
        if (z) {
            AnonymousClass6L8.A00(r2, "extra_assets_fetch_start", (String) null);
            this.A01 = true;
            return;
        }
        AnonymousClass6L8.A00(r2, "assets_fetch_start", (String) null);
    }

    public final void D9i(Throwable th) {
        AnonymousClass6L8 r4 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("error", "general_error");
        AnonymousClass6L8.A00(r4, "document_fetch_fail", A00("error_msg", message, A1E));
    }

    public final void D9j() {
        AnonymousClass6L8.A00(this.A02, "document_fetch_start", (String) null);
    }

    public final void D9k(String str, int i) {
        AnonymousClass6L8 r3 = this.A02;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("load_source", str);
        AnonymousClass6L8.A00(r3, "document_fetch_success", A00("byte_size", String.valueOf(i), A1E));
    }

    public final void DWH(boolean z) {
        AnonymousClass6L8 r2 = this.A02;
        AnonymousClass6L8.A01(r2, new C377379Lp(0, r2, z));
    }

    public final void DYt(Throwable th) {
        AnonymousClass6L8 r4 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("error", "general_error");
        AnonymousClass6L8.A00(r4, C273654mx.A00(3139), A00("error_msg", message, A1E));
    }

    public final void DYu() {
        AnonymousClass6L8.A00(this.A02, "prepare_render_start", (String) null);
    }

    public final void DYv() {
        AnonymousClass6L8.A00(this.A02, "prepare_render_success", (String) null);
    }

    public final void DeE() {
        AnonymousClass6L8 r4 = this.A02;
        AnonymousClass6L8.A01(r4, new C377289Lg(r4, r4.A01.currentMonotonicTimestampNanos(), 0));
    }

    public final void DeO(Throwable th) {
        AnonymousClass6L8 r1 = this.A02;
        Integer num = AnonymousClass05K.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        AnonymousClass6L8.A01(r1, new C377699Mv(r1, num, message, 1, r1.A01.currentMonotonicTimestampNanos()));
    }

    public final void Dei() {
        this.A02.A02();
    }

    public C379629Uq(AnonymousClass6L8 r1) {
        this.A02 = r1;
    }

    public static String A00(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        String obj3 = new JSONObject(abstractMap).toString();
        0qQ.A07(obj3);
        return obj3;
    }
}
