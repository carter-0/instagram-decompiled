package X;

import android.os.Bundle;

public final class ERW extends C47518E6c {
    public static final String __redex_internal_original_name = "ContentDeepDiveDebugFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "content_deep_dive_debug_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1921095139);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("media_id", "Media Id Null");
        this.A01 = requireArguments.getString("media_eligibility", "Eligibility Null");
        String str = "prompts";
        this.A03 = requireArguments.getString(str, "Prompts Null");
        String string = requireArguments.getString("launcher_value", "Launcher value Null");
        this.A00 = string;
        C46448DfA dfA = new C46448DfA((CharSequence) "Launcher Enabled:");
        if (string == null) {
            str = "cddEnabled";
        } else {
            FGF fgf = new FGF((CharSequence) string);
            fgf.A04 = FP8.A00(this, 65);
            C46448DfA dfA2 = new C46448DfA((CharSequence) "Media ID");
            String str2 = this.A02;
            if (str2 == null) {
                str = "mediaId";
            } else {
                FGF fgf2 = new FGF((CharSequence) str2);
                fgf2.A04 = FP8.A00(this, 66);
                C46448DfA dfA3 = new C46448DfA((CharSequence) "Media Eligibility:");
                String str3 = this.A01;
                if (str3 == null) {
                    str = "mediaEligibility";
                } else {
                    FGF fgf3 = new FGF((CharSequence) str3);
                    fgf3.A04 = FP8.A00(this, 67);
                    C46448DfA dfA4 = new C46448DfA((CharSequence) "Prompts:");
                    String str4 = this.A03;
                    if (str4 != null) {
                        FGF fgf4 = new FGF((CharSequence) str4);
                        fgf4.A04 = FP8.A00(this, 68);
                        setBottomSheetMenuItems(0sr.A1P(new Object[]{dfA, fgf, dfA2, fgf2, dfA3, fgf3, dfA4, fgf4}));
                        AnonymousClass0fD.A09(-794725551, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
