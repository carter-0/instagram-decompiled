package X;

import android.view.View;

/* renamed from: X.7AJ  reason: invalid class name */
public final class AnonymousClass7AJ extends AnonymousClass7AK {
    public final /* synthetic */ AnonymousClass7AI A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7AJ(AnonymousClass7AI r2, String str, boolean z) {
        super((Integer) null);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = z;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        AnonymousClass7AI r2 = this.A00;
        AnonymousClass7ZY BSN = ((C333517Zg) r2.A01.get()).BSN();
        String str3 = this.A01;
        boolean z = !this.A02;
        BSN.EtD(str3, z);
        AnonymousClass7IS r1 = r2.A00;
        C254743sy r4 = (C254743sy) r2.A02.get();
        0wc r22 = r1.A00;
        0Aj A002 = r22.A00(r22.A00, "direct_edit_message");
        if (A002.isSampled()) {
            if (z) {
                str = "show_edit_history";
            } else {
                str = "hide_edit_history";
            }
            A002.AAJ("action", str);
            A002.AAJ("message_type", 2FW.A1g.toString());
            A002.AAJ("message_id", str3);
            A002.A7p("is_e2ee", false);
            Long l = null;
            if (r4 != null) {
                str2 = C67003Mgb.A01(r4);
            } else {
                str2 = null;
            }
            A002.AAJ("open_thread_id", str2);
            if (r4 != null) {
                l = C67003Mgb.A00(r4);
            }
            A002.A9F("occamadillo_thread_id", l);
            A002.Cgf();
        }
    }
}
