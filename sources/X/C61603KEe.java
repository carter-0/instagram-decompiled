package X;

import com.instagram.common.session.UserSession;
import com.instagram.trials.impl.TrialsPreferencesImpl;
import com.instagram.trials.model.TrialMetricsData;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import com.instagram.trials.viewmodels.ClipsTrialBottomSheetViewModel;

/* renamed from: X.KEe  reason: case insensitive filesystem */
public final class C61603KEe extends C228042kh {
    public final C46327Dbv A00;
    public final UserSession A01;
    public final TrialMetricsData A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = new ClipsTrialBottomSheetRepositoryImpl(userSession);
        String str = this.A03;
        String str2 = this.A06;
        LSk A012 = LK1.A01(DbS.A0O(this.A04), userSession, str2);
        boolean z = this.A08;
        String str3 = this.A05;
        C46327Dbv dbv = this.A00;
        boolean z2 = this.A07;
        return new ClipsTrialBottomSheetViewModel(dbv, new C63666L2c(userSession), new TrialsPreferencesImpl(userSession), A012, this.A02, clipsTrialBottomSheetRepositoryImpl, str, str2, str3, z, z2, this.A09);
    }

    public C61603KEe(C46327Dbv dbv, UserSession userSession, TrialMetricsData trialMetricsData, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C51972G9s.A1B(userSession, str3);
        this.A01 = userSession;
        this.A03 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A08 = z;
        this.A05 = str4;
        this.A00 = dbv;
        this.A07 = z2;
        this.A02 = trialMetricsData;
        this.A09 = z3;
    }
}
