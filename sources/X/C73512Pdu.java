package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Pdu  reason: case insensitive filesystem */
public final /* synthetic */ class C73512Pdu implements 0sP {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass2Ep A03;
    public final /* synthetic */ C74489Pvj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ C73512Pdu(Activity activity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass2Ep r4, C74489Pvj pvj, String str, String str2, boolean z, boolean z2) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = r4;
        this.A07 = z;
        this.A04 = pvj;
        this.A01 = r2;
        this.A08 = z2;
    }

    public final Object invoke(Object obj) {
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        AnonymousClass2Ep r4 = this.A03;
        boolean z = this.A07;
        activity.runOnUiThread(new C73417PcE(activity, this.A01, userSession, r4, this.A04, str, str2, (List) obj, z, this.A08));
        return C60340gF.A00;
    }
}
