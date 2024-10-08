package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Lwv  reason: case insensitive filesystem */
public final /* synthetic */ class C65620Lwv implements 0Jp {
    public final /* synthetic */ Long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C65620Lwv(Long l, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = l;
    }

    public final void ATC(UserSession userSession, 0Jv r11) {
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        long longValue = this.A00.longValue();
        M4A m4a = new M4A(r11);
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("direct_v2/delivery_receipt/");
        A0L.A9m("sender_ig_id", str);
        A0L.A9m(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A0L.A9m("item_id", str3);
        A0L.A9m("item_client_context", str4);
        A0L.A9m("watermark_ts_ms", String.valueOf(longValue));
        DbX.A1M(A0L, "dr_disable", "0");
        1OC A0M = A0L.A0M();
        C61500KAf.A00(A0M, m4a, 25);
        1ES.A03(A0M);
    }
}
