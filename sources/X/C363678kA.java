package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.8kA  reason: invalid class name and case insensitive filesystem */
public final class C363678kA {
    public final /* synthetic */ C363658k8 A00;
    public final /* synthetic */ C363378jd A01;
    public final /* synthetic */ String A02;

    public final void A01(String str) {
        Object value;
        C363378jd r4 = this.A01;
        r4.A01.set(false);
        05G r3 = r4.A06;
        do {
            value = r3.getValue();
            ((Number) value).longValue();
        } while (!r3.AIY(value, 0L));
        C363658k8 r0 = this.A00;
        if (r0 != null) {
            r0.Dcq();
        }
        C363758kI r32 = (C363758kI) r4.A02.getValue();
        String str2 = this.A02;
        0wc r2 = (0wc) r32.A01.getValue();
        0Aj A002 = r2.A00(r2.A00, "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(r32.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A002.AAJ(AnonymousClass9PN.A02(9, 10, 41), str2);
        A002.AAJ(TraceFieldType.AdhocEventName, "xposting_destination_fetch_failure");
        A002.AAJ("data_source", str);
        A002.AAJ("source_account_type", A0J.A01);
        A002.Cgf();
    }

    public C363678kA(C363658k8 r1, C363378jd r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void A00() {
        Object value;
        C363378jd r2 = this.A01;
        r2.A01.set(false);
        05G r3 = r2.A06;
        do {
            value = r3.getValue();
            ((Number) value).longValue();
        } while (!r3.AIY(value, Long.valueOf(System.currentTimeMillis())));
        C363658k8 r0 = this.A00;
        if (r0 != null) {
            r0.Dcr();
        }
    }
}
