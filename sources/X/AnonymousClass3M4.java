package X;

import android.os.Bundle;

/* renamed from: X.3M4  reason: invalid class name */
public abstract class AnonymousClass3M4 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgBloksScreenFragmentBase";
    public int A00 = -1;
    public int A01 = -1;
    public boolean A02;
    public boolean A03;

    public void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        this.A03 = true;
        super.onSaveInstanceState(bundle);
        bundle.putInt("__key_screen_modal_level", this.A00);
        bundle.putInt(C273654mx.A00(530), this.A00);
        bundle.putBoolean("__key_screen_is_modal_root", this.A02);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-292274824);
        AnonymousClass3M4.super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        this.A02 = bundle.getBoolean("__key_screen_is_modal_root", false);
        this.A00 = bundle.getInt("__key_screen_modal_level", -1);
        this.A01 = bundle.getInt(C273654mx.A00(530), -1);
        if (this.A00 == -1) {
            FR8 A002 = FR8.A02.A00(requireActivity());
            if (this.A02) {
                int i = this.A01;
                A002.A00.put(Integer.valueOf(A002.A01.incrementAndGet()), Integer.valueOf(i));
            }
            this.A00 = A002.A01.get();
        }
        AnonymousClass0fD.A09(-1997854916, A022);
    }

    public void onDestroy() {
        int i;
        int A022 = AnonymousClass0fD.A02(500450097);
        super.onDestroy();
        if (this.A03) {
            i = 546930544;
        } else if (!this.A02 || getActivity() == null) {
            i = 1770448331;
        } else {
            FR8 A002 = FR8.A02.A00(requireActivity());
            if (A002.A00.remove(Integer.valueOf(this.A00)) != null) {
                A002.A01.decrementAndGet();
            }
            i = 71394671;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(560580616);
        super.onResume();
        this.A03 = false;
        AnonymousClass0fD.A09(1808933995, A022);
    }
}
