package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Fdv  reason: case insensitive filesystem */
public final class C50535Fdv implements G78 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void D5C(boolean z, String str) {
        String str2 = str;
        switch (this.A00) {
            case 0:
                if (!z) {
                    boolean A0K = 0qQ.A0K(str, "The save prompt is disabled for the current app. To restore, remove this app from the \"Never save\" list in the Smart Lock for Passwords settings for all accounts on this device.");
                    EMD emd = (EMD) this.A03;
                    if (A0K) {
                        AnonymousClass0aP r4 = emd.A01;
                        0qQ.A0B(r4, 0);
                        C319616qu.A01(r4, "login_smartlock_save_impression_not_allowed", "login_smart_lock", "smartlock", (String) null);
                    } else {
                        AnonymousClass0aP r1 = emd.A01;
                        0qQ.A0B(r1, 0);
                        Integer num = AnonymousClass05K.A01;
                        if (str == null) {
                            str2 = "Unknown failure, failure_reason null";
                        }
                        C319616qu.A00(r1, num, "login_smartlock_save_failed", "login_smart_lock", "smartlock", (String) null, str2, (HashMap) null);
                    }
                }
                ((EMD) this.A03).A05((UserSession) this.A02, (User) this.A01);
                return;
            case 1:
                C47478E4d e4d = ((EMI) this.A01).A05;
                User user = (User) this.A02;
                C50031FJq fJq = new C50031FJq(0, this.A03, this, user);
                FragmentActivity activity = e4d.getActivity();
                if (activity != null) {
                    AnonymousClass0fN.A00(C49133Epw.A00(activity, fJq, e4d, e4d.A05, AnonymousClass05K.A1F, user.getUsername(), user.getId()));
                    return;
                }
                return;
            default:
                EMG.A01((UserSession) this.A03, (EMG) this.A01, (User) this.A02);
                return;
        }
    }

    public C50535Fdv(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    public final void Dez(C51880G5s g5s) {
        C13675Tek fdi;
        switch (this.A00) {
            case 0:
                fdi = new C50522Fdi(0, this.A03, this.A02, this.A01);
                break;
            case 1:
                fdi = new C50522Fdi(1, this.A02, this.A03, this);
                break;
            default:
                fdi = new C50520Fdg(this, 2);
                break;
        }
        g5s.EIU(fdi);
    }
}
