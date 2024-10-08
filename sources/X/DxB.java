package X;

import android.os.Bundle;

public final class DxB extends C47418E1m {
    public static final String __redex_internal_original_name = "AvatarQuickCaptureUpsellBottomSheetFragment";
    public C267624bv A00 = new C50195FTb(this, 2);
    public String A01;
    public String A02;
    public String A03;

    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(2001237360);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A01 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A03 = string3;
                    AnonymousClass0fD.A09(964652120, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("module name required");
                i = -2101357153;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = 1693641293;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = 1220605993;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
