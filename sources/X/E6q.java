package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E6q extends C273374mT {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridNativeAndBloksBottomSheetInteropExampleFragment";

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_native_and_bloks_bottom_sheet_interop_example";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(266229650);
        E6q.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1593605768, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1178462080);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.native_and_blocks_bottom_sheet_example);
        View findViewById = A0C.findViewById(R.id.button);
        if (findViewById != null) {
            FP6.A00(findViewById, 56, this);
        }
        AnonymousClass0fD.A09(1483845943, A02);
        return A0C;
    }
}
