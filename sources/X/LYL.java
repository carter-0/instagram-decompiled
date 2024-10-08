package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class LYL implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LYL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.A00) {
            case 0:
                AZU azu = (AZU) this.A02;
                AnonymousClass87F r0 = azu.A0M;
                if (!z) {
                    r0.A01();
                    ((AnonymousClass3E6) this.A01).EEH(azu);
                    JTQ.A1K(view);
                    break;
                } else {
                    r0.A00();
                    ((AnonymousClass3E6) this.A01).A9Y(azu);
                    0qQ.A0A(view);
                    C63183Ksq.A00(view);
                    return;
                }
            case 1:
                Fragment fragment = (Fragment) this.A02;
                Context context = fragment.getContext();
                int i = R.attr.igds_color_separator;
                if (z) {
                    i = R.attr.igds_color_controls;
                }
                int A0H = 2Yu.A0H(context, i);
                DbT.A16(fragment.requireContext(), (View) this.A01, A0H);
                if (z) {
                    return;
                }
                break;
            case 2:
                if (z) {
                    ((AnonymousClass37D) this.A01).A0T(AnonymousClass05K.A04);
                    return;
                } else {
                    C68468NJg.A00((C68468NJg) this.A02);
                    return;
                }
            default:
                if (z) {
                    C65614Lwp lwp = (C65614Lwp) this.A02;
                    if (!lwp.A01) {
                        lwp.A01 = true;
                        lwp.A02.setVisibility(0);
                        C337257fy r1 = lwp.A00;
                        if (r1 != null) {
                            r1.EhX("");
                        } else {
                            0qQ.A0F("searchProvider");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                C51968G9o.A1O((0sP) this.A01, z);
                return;
        }
        0nA.A0N(view);
    }
}
