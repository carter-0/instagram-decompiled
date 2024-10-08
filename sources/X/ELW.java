package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

public final class ELW extends ELX {
    public static final String __redex_internal_original_name = "FxCalFlowFragmentImpl";
    public final 02m A00;

    public final void A01(Fragment fragment, 0lg r6, String str, String str2, int i) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(str, 2);
        if (!"ig_interop".equals(str)) {
            F5u.A01(r6, true);
        }
        Bundle A0C = DbV.A0C("flow", str);
        A0C.putString(AnonymousClass000.A00(1653), str2);
        AnonymousClass6W8 A0b = DbS.A0b(fragment.getActivity(), A0C, r6, ModalActivity.class, "fxcal_flow");
        if (str.equals(EXN.A0P.A01())) {
            A0b.A08();
        }
        A0b.A0D(fragment, i);
    }

    public final String getModuleName() {
        return "fxcal_flow";
    }

    public ELW() {
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A00 = r0;
    }

    public static final String A00(String str, String str2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append('\"');
        A1A.append(str);
        A1A.append("\":\"");
        A1A.append(str2);
        A1A.append('\"');
        return A1A.toString();
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1160679146);
        02m r3 = this.A00;
        r3.markerStart(857807376);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        r3.markerAnnotate(857807376, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(4244993, A02);
    }
}
