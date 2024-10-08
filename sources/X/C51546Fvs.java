package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fvs  reason: case insensitive filesystem */
public final class C51546Fvs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C69270NiW A03;
    public final /* synthetic */ C254793t3 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C51546Fvs(FragmentActivity fragmentActivity, UserSession userSession, C69270NiW niW, C254793t3 r4, String str, String str2, int i) {
        this.A03 = niW;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = r4;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
    }

    public final void run() {
        C69270NiW niW = this.A03;
        int ordinal = niW.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            UserSession userSession = this.A02;
            FragmentActivity fragmentActivity = this.A01;
            C254793t3 r3 = this.A04;
            int i = this.A00;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putSerializable("channel_education_type", niW);
            if (r3 != null) {
                OXL.A02(A0a, r3, "channel_education_thread_id");
            }
            A0a.putInt("channel_education_audience_type", i);
            E3U e3u = new E3U();
            C331127Pr A0V = DbV.A0V(A0a, e3u, userSession);
            A0V.A0U = new C72959PQr(userSession, 2);
            AnonymousClass7TF.A0D().post(new C51445FuF(fragmentActivity, e3u, A0V.A00()));
            return;
        }
        UserSession userSession2 = this.A02;
        FragmentActivity fragmentActivity2 = this.A01;
        C254793t3 r5 = this.A04;
        int i2 = this.A00;
        String str = this.A05;
        String str2 = this.A06;
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putSerializable("channel_education_type", niW);
        if (r5 != null) {
            OXL.A02(A0a2, r5, "channel_education_thread_id");
        }
        A0a2.putInt("channel_education_audience_type", i2);
        A0a2.putString("channel_education_entrypoint", str);
        E3P e3p = new E3P();
        e3p.setArguments(A0a2);
        C309516Yo A0M = DbS.A0M(fragmentActivity2, userSession2);
        0qQ.A0A(e3p);
        A0M.A0D(e3p);
        A0M.A0A = str2;
        A0M.A0F = true;
        A0M.A04();
    }
}
