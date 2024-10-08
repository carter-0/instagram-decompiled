package X;

import android.os.Bundle;

public final class DxC extends C47418E1m {
    public static final String __redex_internal_original_name = "AvatarNUXBottomSheetFragment";
    public C267624bv A00;
    public String A01;
    public String A02;
    public String A03;

    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        0qQ.A0F("previousModuleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-625664233);
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
                    AnonymousClass0fD.A09(219076537, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("previous module required");
                i = -660941170;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("editor logging mechanism required");
                i = 1585203024;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("editor logging surface required");
            i = -1378188921;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
