package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class WUU implements MTX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public WUU(FragmentActivity fragmentActivity, 28D r2, UserSession userSession, String str, String str2, boolean z) {
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void Dob(File file) {
        11Z.A02(new C20242Wnh(this, file));
    }

    public final void onFailure(Exception exc) {
        11Z.A02(new C20063WkN(this));
    }
}
