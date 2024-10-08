package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;

/* renamed from: X.8jz  reason: invalid class name and case insensitive filesystem */
public final class C363588jz implements AnonymousClass8k0 {
    public final /* synthetic */ AnonymousClass8k0 A00;
    public final /* synthetic */ C363278jS A01;
    public final /* synthetic */ FbAutoCrossPostingSettingManager A02;
    public final /* synthetic */ String A03;

    public C363588jz(AnonymousClass8k0 r1, C363278jS r2, FbAutoCrossPostingSettingManager fbAutoCrossPostingSettingManager, String str) {
        this.A00 = r1;
        this.A02 = fbAutoCrossPostingSettingManager;
        this.A03 = str;
        this.A01 = r2;
    }

    public final void DEc(String str) {
        C363568jx access$getLogger = this.A02.getLogger();
        String str2 = this.A03;
        String identifier = this.A01.getIdentifier();
        0wc r2 = (0wc) access$getLogger.A01.getValue();
        0Aj A002 = r2.A00(r2.A00, "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(access$getLogger.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A002.AAJ(AnonymousClass9PN.A02(9, 10, 41), str2);
        A002.AAJ(TraceFieldType.AdhocEventName, "xposting_setting_fetch_failure");
        A002.AAJ("data_source", identifier);
        A002.AAJ("source_account_type", A0J.A01);
        A002.Cgf();
        AnonymousClass8k0 r0 = this.A00;
        if (r0 != null) {
            r0.DEc(str);
        }
    }
}
