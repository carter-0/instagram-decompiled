package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.35x  reason: invalid class name and case insensitive filesystem */
public final class C2369935x implements 1wn {
    public final /* synthetic */ AnonymousClass35W A00;

    public C2369935x(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        IllegalStateException illegalStateException;
        int i;
        FragmentActivity fragmentActivity;
        String str;
        Resources resources;
        AnonymousClass2rI r1;
        int A03 = AnonymousClass0fD.A03(2035859220);
        C2371536n r12 = (C2371536n) obj;
        int A032 = AnonymousClass0fD.A03(-997893626);
        0qQ.A0B(r12, 0);
        1Xj r10 = r12.A00;
        AnonymousClass35W r5 = this.A00;
        C227812jx r2 = (C227812jx) r5.A0b.get();
        if (!(r2 == null || (r1 = (AnonymousClass2rI) r2.getAdapter()) == null)) {
            r1.A0A(-1);
        }
        ImageUrl A1Q = r10.A1Q();
        if (A1Q != null) {
            UserSession userSession = r5.A0T;
            if (r2 != null) {
                fragmentActivity = r2.getActivity();
                Context context = r2.getContext();
                if (!(context == null || (resources = context.getResources()) == null)) {
                    str = resources.getString(2131972224);
                }
                str = null;
            } else {
                fragmentActivity = null;
                str = null;
            }
            String id = r10.getId();
            if (id != null) {
                C310336ap r13 = new C310336ap();
                r13.A0D = null;
                r13.A09 = A1Q;
                r13.A03();
                r13.A01();
                if (str == null) {
                    str = "";
                }
                r13.A0G = str;
                r13.A0A = new Fd7(fragmentActivity, userSession, id);
                1xC.A01.A00(new AnonymousClass3GP(r13.A00()));
                AnonymousClass0fD.A0A(1638090222, A032);
                AnonymousClass0fD.A0A(-100769205, A03);
                return;
            }
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -978925183;
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = 84308629;
        }
        AnonymousClass0fD.A0A(i, A032);
        throw illegalStateException;
    }
}
