package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FaU  reason: case insensitive filesystem */
public final class C50369FaU implements JPK {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0sP A01;

    public C50369FaU(FragmentActivity fragmentActivity, 0sP r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void DED() {
        this.A01.invoke(AnonymousClass7TE.A0u());
        C310336ap A0a = DbS.A0a();
        DbT.A1D(this.A00.getResources(), A0a, 2131952561);
        A0a.A05();
        A0a.A0H = "request_ai_agent_access_failure";
        DbY.A1N(A0a);
    }

    public final void Doq(Integer num) {
        this.A01.invoke(AnonymousClass7TE.A0v());
    }
}
