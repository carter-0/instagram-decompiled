package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E6r  reason: case insensitive filesystem */
public final class C47530E6r extends C273374mT {
    public static final String __redex_internal_original_name = "IgBloksNativeEmbeddedScreenFragment";

    public final String getModuleName() {
        return "ig_bloks_native_embedded_screen_example";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1243011902);
        C47530E6r.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1729593136, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-910499130);
        View inflate = layoutInflater.inflate(R.layout.native_bloks_embedded_and_screen_example, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.complex_type_example_input);
        View requireViewById2 = inflate.requireViewById(R.id.server_param_input);
        View requireViewById3 = inflate.requireViewById(R.id.client_input_param_input);
        View requireViewById4 = inflate.requireViewById(R.id.string_native_prop_input);
        View requireViewById5 = inflate.requireViewById(R.id.long_native_prop_input);
        AnonymousClass0fU.A00(new FOQ(0, requireViewById4, requireViewById5, requireViewById2, requireViewById, requireViewById3, this), inflate.requireViewById(R.id.new_bloks_screen_button));
        AnonymousClass0fD.A09(-661091521, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(-1805103380);
        super.onDestroyView();
        AnonymousClass0fD.A09(896039378, A02);
    }
}
