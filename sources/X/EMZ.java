package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class EMZ extends C47907EMb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0wW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 0BQ A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EMZ(Uri uri, FragmentActivity fragmentActivity, AnonymousClass0iw r13, AnonymousClass0aP r14, AnonymousClass0wW r15, UserSession userSession, C50515Fdb fdb, 0BQ r18, C46634DiE diE, Long l, String str, String str2, String str3, String str4, String str5) {
        super(uri, fragmentActivity, r13, r14, fdb, diE, str, str2);
        this.A00 = fragmentActivity;
        this.A06 = str3;
        this.A01 = r15;
        this.A05 = str4;
        this.A04 = l;
        this.A07 = str5;
        this.A03 = r18;
        this.A02 = userSession;
    }

    public final void A04(EM4 em4) {
        long j;
        int A032 = AnonymousClass0fD.A03(1940093362);
        EM4 em42 = em4;
        0qQ.A0B(em42, 0);
        super.A04(em42);
        String str = this.A06;
        if (str != null) {
            AnonymousClass0wW r7 = this.A01;
            synchronized (C46400DeN.class) {
                j = C46400DeN.A00;
            }
            String str2 = this.A05;
            Long l = this.A04;
            C46400DeN.A03(r7, l, l, "intra_app", str2, "horizontal_switch", str, "logged_out", this.A07, (String) null, (double) j, false, true, true);
        }
        AnonymousClass0fD.A0A(668462601, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(1191968056);
        0BQ r3 = this.A03;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        FFQ.A00().A01(fragmentActivity, r3.AEO(fragmentActivity, (Uri) null, userSession, (String) null, false).A00, userSession, false);
        AnonymousClass0fD.A0A(163469280, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass0fD.A0A(-537481837, C47695EDe.A00(this, obj, 322603563));
    }
}
