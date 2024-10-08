package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3E2  reason: invalid class name */
public final class AnonymousClass3E2 extends 0vM {
    public final /* synthetic */ C227802jw A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3E2(C227802jw r7) {
        super("scheduleClipsDraftNotification", 875171464, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C227802jw r1 = this.A00;
        FragmentActivity activity = r1.getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && r1.mView != null && r1.isAdded() && !r1.mDetached && !r1.mRemoving && r1.mViewLifecycleOwnerLiveData.A02() != null) {
            UserSession A05 = r1.getSession();
            AnonymousClass07Z r6 = (AnonymousClass07Z) r1.mViewLifecycleOwnerLiveData.A02();
            boolean z = r1.A0S;
            0qQ.A0B(A05, 0);
            0qQ.A0B(r6, 2);
            AnonymousClass72N A002 = new 2YN(new AnonymousClass72M(activity, A05), activity).A00(AnonymousClass72N.class);
            if (A002 != null) {
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    11Z.A03(new AnonymousClass90U(activity, r6, A002, A05));
                }
                if (!z) {
                    AnonymousClass90V.A02(A002, A05);
                }
                List A07 = 28K.A00(A05).A07();
                ArrayList arrayList = new ArrayList();
                for (Object next : A07) {
                    1iA r12 = ((AnonymousClass3Q2) next).A1G;
                    if (r12 == 1iA.A0Q || r12 == 1iA.A09) {
                        arrayList.add(next);
                    }
                }
                11Z.A03(new AnonymousClass90Z(r6, A002, A05, arrayList));
            }
        }
    }
}
