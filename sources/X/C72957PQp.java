package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.PQp  reason: case insensitive filesystem */
public final class C72957PQp implements C273414mX {
    public UserSession A00;
    public String A01;
    public WeakReference A02;
    public boolean A03;
    public final NKE A04;

    public final /* synthetic */ void Cyf() {
    }

    public final void Cyc() {
        String str;
        if (this.A03) {
            WeakReference weakReference = this.A02;
            if (weakReference == null) {
                str = "activityRef";
            } else {
                FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                if (fragmentActivity != null) {
                    String str2 = this.A01;
                    if (str2 == null) {
                        str = "promptId";
                    } else {
                        UserSession userSession = this.A00;
                        if (userSession == null) {
                            str = "userSession";
                        } else {
                            C69983NvN.A00(fragmentActivity, userSession, str2, (String) null);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C72957PQp(NKE nke) {
        this.A04 = nke;
    }
}
