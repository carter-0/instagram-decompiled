package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IZp  reason: case insensitive filesystem */
public final class C57384IZp implements C273414mX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C317556nS A04;
    public final /* synthetic */ VQD A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final /* synthetic */ void Cyf() {
    }

    public C57384IZp(View view, FragmentActivity fragmentActivity, UserSession userSession, C317556nS r4, VQD vqd, String str, String str2, int i) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A00 = i;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = r4;
        this.A01 = view;
        this.A05 = vqd;
    }

    public final void Cyc() {
        FragmentActivity fragmentActivity = this.A02;
        UserSession userSession = this.A03;
        int i = this.A00;
        String str = this.A06;
        String str2 = this.A07;
        C56376HxV.A00(fragmentActivity, this.A01, userSession, this.A04, str, str2, i, true);
    }
}
