package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class FXX implements 1wn {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ Fe5 A02;
    public final /* synthetic */ 1Ng A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C309416Ye A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ ArrayList A07;

    public FXX(FragmentActivity fragmentActivity, Fe5 fe5, 1Ng r3, UserSession userSession, C309416Ye r5, String str, ArrayList arrayList, long j) {
        this.A02 = fe5;
        this.A00 = j;
        this.A03 = r3;
        this.A04 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = r5;
        this.A07 = arrayList;
        this.A06 = str;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(-630572099);
        int A033 = AnonymousClass0fD.A03(1931553965);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A00);
        if (!((AnonymousClass376) obj).A01 || seconds > 1) {
            this.A03.A02(this, AnonymousClass376.class);
            if (seconds > 5) {
                i = 1175270136;
            } else {
                Fe5 fe5 = this.A02;
                UserSession userSession = this.A04;
                Fe5.A00(this.A01, fe5, userSession, this.A05, this.A06, this.A07);
                i = -1846586659;
            }
        } else {
            i = 324553327;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(1328376068, A032);
    }
}
