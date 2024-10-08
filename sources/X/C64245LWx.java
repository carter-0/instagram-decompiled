package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.LWx  reason: case insensitive filesystem */
public final class C64245LWx implements View.OnClickListener {
    public final /* synthetic */ C314226hr A00;

    public C64245LWx(C314226hr r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        FragmentActivity activity;
        C255773uh Au5;
        int A05 = AnonymousClass0fD.A05(-568191725);
        C314226hr r14 = this.A00;
        AnonymousClass6ZN r5 = r14.A0O;
        Context context = r14.A0A;
        0qQ.A07(context);
        WeakReference weakReference = r5.A0H;
        Fragment fragment = (Fragment) weakReference.get();
        if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
            C273384mU r2 = r5.A0F;
            C250973mM r3 = ((ReelViewerFragment) r2).A0a;
            if (!(r3 == null || (Au5 = r2.Au5()) == null)) {
                r5.A0B = true;
                Object obj = new Object();
                r2.CLU();
                UserSession userSession = r5.A01;
                if (userSession == null) {
                    DbS.A17();
                    throw AnonymousClass00P.createAndThrow();
                }
                AvatarStore A002 = 25x.A00(userSession);
                C64510LdC ldC = new C64510LdC(r14, A002.A01.A00, A002, Au5, r3, r5);
                Fragment fragment2 = (Fragment) weakReference.get();
                if (fragment2 != null) {
                    AnonymousClass7TE.A1Z(new C59688JTu(r5, activity, context, obj, ldC, (AnonymousClass4D7) null, 3, true), DbW.A0E(fragment2));
                }
            }
        }
        AnonymousClass0fD.A0C(1636562770, A05);
    }
}
