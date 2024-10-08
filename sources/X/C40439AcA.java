package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;

/* renamed from: X.AcA  reason: case insensitive filesystem */
public final class C40439AcA implements AnonymousClass8k0 {
    public final /* synthetic */ AnonymousClass8k0 A00;
    public final /* synthetic */ B29 A01;
    public final /* synthetic */ FbAutoCrossPostingSettingManager A02;
    public final /* synthetic */ String A03;

    public C40439AcA(AnonymousClass8k0 r1, B29 b29, FbAutoCrossPostingSettingManager fbAutoCrossPostingSettingManager, String str) {
        this.A00 = r1;
        this.A02 = fbAutoCrossPostingSettingManager;
        this.A03 = str;
        this.A01 = b29;
    }

    public final void DEc(String str) {
        C363568jx access$getLogger = this.A02.getLogger();
        String str2 = this.A03;
        String identifier = this.A01.getIdentifier();
        0Aj A0e = AnonymousClass7TE.A0e((0wc) access$getLogger.A01.getValue(), "cxp_ig_client_sourced_creation");
        16V A0J = AnonymousClass0t1.A01.A01(access$getLogger.A00).A0J();
        if (A0J == null) {
            A0J = 16V.A08;
        }
        A0e.AAJ(AnonymousClass9PN.A01(), str2);
        A0e.AAJ(TraceFieldType.AdhocEventName, "xposting_setting_mutate_failure");
        A0e.AAJ("data_source", identifier);
        A0e.AAJ("source_account_type", A0J.A01);
        A0e.Cgf();
        AnonymousClass8k0 r0 = this.A00;
        if (r0 != null) {
            r0.DEc(str);
        }
    }
}
