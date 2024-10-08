package X;

import android.os.Bundle;

/* renamed from: X.Uv9  reason: case insensitive filesystem */
public final class C16453Uv9 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelShoutOutShareFragment";
    public 28D A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final String getModuleName() {
        return "reel_shout_out_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-465504342);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_USERNAME");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_HEADER_TITLE");
            if (string2 == null) {
                string2 = "";
            }
            this.A02 = string2;
            String string3 = requireArguments.getString("ReelShoutOutConstants.ARG_SHOUTOUT_BACKGROUND_FILE");
            if (string3 != null) {
                this.A01 = string3;
                this.A04 = requireArguments.getBoolean("ReelShoutOutConstants.ARG_SHOW_TOOL_TIP", false);
                this.A00 = AnonymousClass7TH.A07(requireArguments, "ReelShoutOutConstants.ARG_ENTRY_POINT");
                AnonymousClass0fD.A09(-1219981783, A022);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = 1680873172;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -1801564352;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
