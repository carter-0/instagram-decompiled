package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UYf  reason: case insensitive filesystem */
public final class C15265UYf extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgBloksNativeScreenDemoFragment";
    public VRO A00;
    public final AnonymousClass0eM A01 = C227642jf.A01(this);

    public final String getModuleName() {
        return "NativeScreenDemo";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1371383097);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_native_screen_demo, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.submit_button);
        View findViewById2 = inflate.findViewById(R.id.edit_text);
        if (findViewById != null) {
            WBH.A01(findViewById, 18, findViewById2, this);
        }
        AnonymousClass0fD.A09(1047380362, A02);
        return inflate;
    }
}
