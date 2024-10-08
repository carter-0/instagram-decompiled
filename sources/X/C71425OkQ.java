package X;

import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.OkQ  reason: case insensitive filesystem */
public final class C71425OkQ implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public C71425OkQ(C71091OcD ocD, int i) {
        this.A00 = i;
        this.A01 = ocD;
    }

    public final boolean onLongClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                C74235PrO prO = ((C69203Nh3) this.A01).A02;
                if (prO == null) {
                    return true;
                }
                C331857Sq r1 = ((P0K) prO).A00;
                AnonymousClass7I3 r3 = r1.A09;
                String A002 = ((C333637Zs) r1.A0H.getValue()).A00();
                C69203Nh3 nh3 = r1.A01;
                if (nh3 != null) {
                    str = nh3.getCurrentDecorAvatarPosition();
                } else {
                    str = null;
                }
                r3.A0B(A002, str, "long");
                return true;
            case 1:
                C66934MfT mfT = (C66934MfT) this.A01;
                AnonymousClass4DH r0 = mfT.A04;
                DeveloperOptionsLauncher.launchDirectInboxV2ExperimentSwitcherTool(r0.requireContext(), r0.requireActivity(), mfT.A07);
                return true;
            case 4:
                return true;
            default:
                return false;
        }
    }

    public C71425OkQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
