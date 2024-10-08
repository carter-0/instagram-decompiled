package X;

import android.content.res.Resources;

/* renamed from: X.FaT  reason: case insensitive filesystem */
public final class C50368FaT implements JPK {
    public final /* synthetic */ C50770FiC A00;

    public C50368FaT(C50770FiC fiC) {
        this.A00 = fiC;
    }

    public final void DED() {
        C310336ap A0a = DbS.A0a();
        Resources resources = this.A00.A00.getResources();
        AnonymousClass9B9.A00();
        DbT.A1D(resources, A0a, 2131952561);
        A0a.A05();
        A0a.A0H = "request_ai_agent_access_failure";
        DbY.A1N(A0a);
    }

    public final void Doq(Integer num) {
        AnonymousClass9B9.A00();
        C50770FiC fiC = this.A00;
        C49951FGg.A06(fiC.A01, fiC.A00, C69503Nml.A0E.toString());
    }
}
