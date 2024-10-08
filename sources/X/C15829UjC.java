package X;

import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.UjC  reason: case insensitive filesystem */
public final class C15829UjC extends 2Cn {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C15829UjC(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, String str, String str2, long j) {
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        AnonymousClass9B2 r1 = (AnonymousClass9B2) obj;
        0qQ.A0B(r1, 0);
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = this.A01;
        DbX.A10(fragmentActivity, r0);
        UserSession userSession = this.A03;
        AnonymousClass0iw r10 = this.A02;
        0wc A012 = AnonymousClass0kN.A01(r10, userSession);
        String str2 = this.A05;
        if (str2 != null) {
            str = "explore_meta_ai_bottom_sheet_qp_suggestion";
        } else {
            str = "explore_meta_ai_bottom_sheet_qp_primary_button";
        }
        String A0a = DbY.A0a();
        AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(userSession);
        DirectShareTarget A002 = r1.A00();
        String str3 = this.A04;
        String str4 = str3;
        int length = str3.length();
        if (length == 0) {
            str3 = str;
        }
        if (!aiAgentThreadLauncher.A0B(fragmentActivity, (C68112N1a) null, r10, new WVQ(A012, A0a, str4, str, this.A00), A002, (C273414mX) null, str3, str2, true, false, false, false)) {
            if (length != 0) {
                str = str4;
            }
            String stackTraceString = Log.getStackTraceString(new Exception());
            0qQ.A07(stackTraceString);
            String A16 = C51968G9o.A16(this);
            DirectShareTarget A003 = r1.A00();
            0qQ.A0B(userSession, 0);
            C69836Nsy.A00(A012, A003, A0a, str, stackTraceString, A16, C3262475z.A00(userSession), "", "");
        }
    }
}
