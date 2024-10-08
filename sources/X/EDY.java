package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import com.instagram.registration.model.RegFlowExtras;

public final class EDY extends 1P0 {
    public final Handler A00 = new Handler();
    public final AnonymousClass4DH A01;
    public final 0lg A02;
    public final G69 A03;
    public final RegFlowExtras A04;
    public final EEK A05;
    public final String A06;
    public final /* synthetic */ E3Y A07;
    public final /* synthetic */ String A08;

    public EDY(AnonymousClass4DH r2, 0lg r3, E3Y e3y, G69 g69, RegFlowExtras regFlowExtras, EEK eek, String str, String str2) {
        this.A07 = e3y;
        this.A08 = str2;
        this.A02 = r3;
        this.A06 = str;
        this.A01 = r2;
        this.A05 = eek;
        this.A03 = g69;
        this.A04 = regFlowExtras;
    }

    private void A00(String str) {
        C49886FBm A062 = 1Q0.A1D.A02(this.A02).A06(EXD.A03, C46634DiE.A0d);
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        A062.A04("reason", str);
        A062.A02();
    }

    public final void onFail(C268654dm r5) {
        String str;
        int A032 = AnonymousClass0fD.A03(-160887957);
        this.A03.EuV(DbZ.A0j(this.A01), AnonymousClass05K.A00);
        if (r5 instanceof C268674do) {
            str = ((AnonymousClass1XT) ((C268674do) r5).A00).getErrorType();
        } else {
            str = "network_error";
        }
        A00(str);
        AnonymousClass0fD.A0A(-1861243388, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-1613360542);
        EDY.super.onFinish();
        this.A05.A00();
        AnonymousClass0fD.A0A(-842995130, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(679603632);
        EDY.super.onStart();
        this.A05.A01();
        AnonymousClass0fD.A0A(2093865782, A032);
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [X.KHA, X.11X] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        G69 g69;
        Resources A052;
        int i;
        int A032 = AnonymousClass0fD.A03(-268504843);
        DwH dwH = (DwH) obj;
        int A033 = AnonymousClass0fD.A03(1396813970);
        E3Y e3y = this.A07;
        String A0I = 0nA.A0I(e3y.A00);
        String str3 = dwH.A01;
        if (str3 != null) {
            A0I = str3;
        }
        RegFlowExtras regFlowExtras = e3y.A0J;
        if (!regFlowExtras.A0t || !2PP.A00(regFlowExtras.A0I, A0I)) {
            if (dwH.A05) {
                C50022FJh fJh = new C50022FJh(this.A08, (Object) e3y, 9);
                C358248ab A0I2 = Dba.A0I(e3y);
                A0I2.A09(2131973618);
                A0I2.A08(2131973615);
                Dba.A1M(A0I2);
                A0I2.A0I(fJh, 2131973617);
                A0I2.A0H(C50020FJf.A00(e3y, 58), 2131973616);
                DbT.A1V(A0I2);
                DbU.A1R(FGI.A00(e3y, 1Q0.A1e), e3y.A05);
            } else if (!dwH.A08 || !dwH.A06) {
                int A034 = AnonymousClass0fD.A03(665935505);
                if (!dwH.A08) {
                    g69 = this.A03;
                    A052 = DbV.A05(this.A01);
                    i = 2131961578;
                } else if (!dwH.A06) {
                    if (dwH.A03 == null) {
                        g69 = this.A03;
                        A052 = DbV.A05(this.A01);
                        i = 2131961577;
                    }
                    A00(dwH.mErrorType);
                    AnonymousClass0fD.A0A(1018993330, A034);
                } else {
                    if (TextUtils.isEmpty(dwH.A01)) {
                        str = this.A06;
                    } else {
                        str = dwH.A01;
                    }
                    0lg r8 = this.A02;
                    Context requireContext = this.A01.requireContext();
                    DbY.A1S(r8, str);
                    FH1.A05(r8, "email");
                    if (1DL.A07(requireContext, "android.permission.GET_ACCOUNTS")) {
                        AccountManager accountManager = AccountManager.get(requireContext);
                        Account[] accounts = accountManager.getAccounts();
                        0qQ.A07(accounts);
                        for (Account account : accounts) {
                            if (account != null && "com.google".equalsIgnoreCase(account.type) && str.equalsIgnoreCase(account.name)) {
                                FH1.A06(r8, "email", r7);
                                1ES.A03(new KHA(5, account, accountManager, r8));
                                break;
                            }
                        }
                        str2 = "no_match_found";
                        FH1.A07(r8, "email", str2);
                    } else {
                        str2 = "no_permission";
                        FH1.A07(r8, "email", str2);
                    }
                    this.A00.post(new C51466Fua(dwH, this, str));
                    AnonymousClass0fD.A0A(1018993330, A034);
                }
                g69.EuV(A052.getString(i), AnonymousClass05K.A0N);
                A00(dwH.mErrorType);
                AnonymousClass0fD.A0A(1018993330, A034);
            }
            AnonymousClass0fD.A0A(1834351006, A033);
            AnonymousClass0fD.A0A(555304901, A032);
        }
        E3Y.A05(e3y, A0I);
        AnonymousClass0fD.A0A(1834351006, A033);
        AnonymousClass0fD.A0A(555304901, A032);
    }
}
