package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import java.util.HashSet;

/* renamed from: X.35a  reason: invalid class name and case insensitive filesystem */
public abstract class C2367735a {
    public static final HashSet A04 = new HashSet();
    public final Context A00;
    public final C2367835b A01;
    public final C2367935c A02;
    public final UserSession A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.35c, java.lang.Object] */
    public /* synthetic */ C2367735a(Context context, UserSession userSession) {
        C2367835b r1 = new C2367835b(userSession);
        ? obj = new Object();
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = r1;
        this.A02 = obj;
    }

    public final C74381Ptw A00(NHY nhy, 1Xj r13) {
        1Xj r10 = r13;
        if (this instanceof AnonymousClass35Z) {
            AnonymousClass35Z r3 = (AnonymousClass35Z) this;
            Fragment fragment = r3.A00;
            FragmentActivity requireActivity = fragment.requireActivity();
            boolean z = false;
            if (nhy.A02 == C69321NjM.SPARKLE) {
                z = true;
            }
            ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel = new ClipsCelebrationReshareViewModel(nhy.A08, z);
            return new AXH(requireActivity, fragment, r3.A01, r3.A02, clipsCelebrationReshareViewModel, r10);
        }
        C2368035d r32 = (C2368035d) this;
        Fragment fragment2 = r32.A00;
        FragmentActivity requireActivity2 = fragment2.requireActivity();
        boolean z2 = false;
        if (nhy.A02 == C69321NjM.SPARKLE) {
            z2 = true;
        }
        return new C50200FTg(requireActivity2, fragment2, r32.A01, new ClipsCelebrationReshareViewModel(nhy.A08, z2), r13);
    }

    public final boolean A01() {
        if (this instanceof AnonymousClass35Z) {
            return true;
        }
        return false;
    }
}
