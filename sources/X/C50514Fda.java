package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.utils.ThreadMetadataOverrideBroadcastReceiver;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;
import java.util.List;

/* renamed from: X.Fda  reason: case insensitive filesystem */
public final class C50514Fda implements C358108aN {
    public final /* synthetic */ C48014ERb A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47518E6c A02;
    public final /* synthetic */ List A03;

    public C50514Fda(C48014ERb eRb, UserSession userSession, C47518E6c e6c, List list) {
        this.A01 = userSession;
        this.A02 = e6c;
        this.A03 = list;
        this.A00 = eRb;
    }

    public final void onFailure(String str, boolean z) {
        C47518E6c e6c = this.A02;
        if (e6c.getContext() != null) {
            C59689JTv.A06(e6c.getContext(), 2131957895);
        }
        this.A00.setBottomSheetMenuItems(this.A03);
    }

    public final void onSuccess() {
        try {
            UserSession userSession = this.A01;
            C47518E6c e6c = this.A02;
            C48014ERb eRb = this.A00;
            List pinnedDevOptions = DeveloperOptionsPluginImpl.INSTANCE.getPinnedDevOptions(userSession, e6c, new C50365FaO(eRb, e6c));
            0qQ.A07(pinnedDevOptions);
            if (AnonymousClass7TE.A1b(pinnedDevOptions)) {
                List list = this.A03;
                list.add(new C70944OSr(true));
                list.add(new C46448DfA((CharSequence) "Pinned Rageshake Items"));
                list.addAll(pinnedDevOptions);
            }
            FragmentActivity activity = eRb.getActivity();
            if (!(activity == null || activity.findViewById(R.id.thread_fragment_container) == null)) {
                List list2 = this.A03;
                list2.add(new C70944OSr(true));
                list2.add(new C46448DfA((CharSequence) "IG Direct"));
                list2.add(C50989Fmc.A00(eRb.requireContext(), FPB.A00(eRb, 9), 2131971273));
                list2.add(C50989Fmc.A00(eRb.requireContext(), FPB.A00(eRb, 10), 2131971274));
                ThreadMetadataOverrideBroadcastReceiver.Companion.isEnabled(userSession);
            }
            eRb.setBottomSheetMenuItems(this.A03);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (AnonymousClass063 e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
