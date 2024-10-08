package X;

import com.instagram.api.schemas.EarnedOnMediaState;

/* renamed from: X.ISv  reason: case insensitive filesystem */
public final class C57208ISv implements G73 {
    public final /* synthetic */ EarnedOnMediaState A00;
    public final /* synthetic */ C53031GhM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void DoN(1Xj r9) {
        0qQ.A0B(r9, 0);
        C53031GhM ghM = this.A01;
        AnonymousClass7TE.A1Z(new MGN(ghM, r9, this.A04, this.A02, (AnonymousClass4D7) null, 8), C318116oQ.A00(ghM));
    }

    public C57208ISv(EarnedOnMediaState earnedOnMediaState, C53031GhM ghM, String str, String str2, String str3) {
        this.A01 = ghM;
        this.A02 = str;
        this.A04 = str2;
        this.A00 = earnedOnMediaState;
        this.A03 = str3;
    }

    public final void onFail(String str) {
        String str2;
        if (this.A00 == EarnedOnMediaState.DELETED) {
            str2 = this.A03;
        } else {
            str2 = null;
        }
        C53031GhM ghM = this.A01;
        AnonymousClass7TE.A1Z(new MFW(ghM, str2, (AnonymousClass4D7) null, 7), C318116oQ.A00(ghM));
    }
}
