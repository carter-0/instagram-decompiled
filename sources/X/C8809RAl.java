package X;

import com.instagram.android.R;

/* renamed from: X.RAl  reason: case insensitive filesystem */
public final class C8809RAl extends R8b implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IGBSCContainerFragment";
    public S62 A00;
    public final 0sP A01 = new C73933PmD(this, 44);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        S62 s62 = this.A00;
        r4.Etr(AnonymousClass7TF.A1V(s62));
        r4.Eu4(true);
        if (s62 != null && getContext() != null) {
            r4.setTitle(String.valueOf(s62.A00.C1h(requireContext())));
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, X.RAl, X.4DH] */
    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(58535589);
        super.onResume();
        C13604TdW A0P = getChildFragmentManager().A0P(R.id.container_fragment);
        if (A0P instanceof C13604TdW) {
            AnonymousClass2gB C7p = A0P.C7p();
            0sP r2 = this.A01;
            C7p.A08(new LZt(57, r2));
            C7p.A06(this, new LZt(57, r2));
        }
        AnonymousClass0fD.A09(-806954593, A02);
    }
}
