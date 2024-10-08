package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.EDj  reason: case insensitive filesystem */
public class C47700EDj extends 1P0 implements G69 {
    public RegFlowExtras A00;
    public final 0lg A01;
    public final C46634DiE A02;
    public final AnonymousClass4DH A03;
    public final G69 A04;
    public final CountryCodeData A05;
    public final RegFlowExtras A06;
    public final EEK A07;
    public final String A08;

    public final void A00(ENM enm) {
        int A032;
        String str;
        String str2;
        int i;
        C309516Yo A0H;
        Bundle A0a;
        Fragment e58;
        if (this instanceof C47929ENg) {
            A032 = AnonymousClass0fD.A03(-522206666);
            E3X.A00(((C47929ENg) this).A00);
            i = 834228009;
        } else {
            A032 = AnonymousClass0fD.A03(2117932095);
            ENM enm2 = enm;
            boolean z = !TextUtils.isEmpty(enm2.A02);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                String A002 = countryCodeData.A00();
                str2 = this.A08;
                str = C49958FGq.A00(A002, str2);
            } else {
                str = this.A08;
                str2 = str;
            }
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            regFlowExtras.A0n = enm2.A05;
            regFlowExtras.A0X = enm2.A01;
            regFlowExtras.A0C = enm2.A00;
            regFlowExtras.A0g = enm2.A04;
            RegFlowExtras regFlowExtras2 = this.A06;
            if (regFlowExtras2 != null) {
                regFlowExtras.A0Z = regFlowExtras2.A0Z;
                regFlowExtras.A0P = regFlowExtras2.A0P;
                EXD A012 = regFlowExtras2.A01();
                A012.getClass();
                regFlowExtras.A03(A012);
                Integer A022 = regFlowExtras2.A02();
                if (A022 != null) {
                    regFlowExtras.A0V = C49109EpY.A00(A022);
                }
                regFlowExtras.A03 = regFlowExtras2.A03;
                regFlowExtras.A04 = regFlowExtras2.A04;
                regFlowExtras.A0w = regFlowExtras2.A0w;
                regFlowExtras.A06 = regFlowExtras2.A06;
                regFlowExtras.A07 = regFlowExtras2.A07;
                if (EXD.SAC == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    regFlowExtras.A0J = regFlowExtras2.A0J;
                    regFlowExtras.A0M = regFlowExtras2.A0M;
                    regFlowExtras.A0u = regFlowExtras2.A0u;
                }
            }
            regFlowExtras.A0q = true;
            if (z) {
                regFlowExtras.A05 = enm2.A02;
                regFlowExtras.A0Q = str;
                FGJ.A03.A05(this.A03.getContext());
            }
            regFlowExtras2.getClass();
            FCQ.A01(regFlowExtras2, regFlowExtras);
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                long A003 = 1Q0.A00();
                AnonymousClass0aP r10 = this.A01;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r10), "phone_number_auto_confirmed");
                if (A0e.isSampled()) {
                    DbY.A1E(A0e, currentTimeMillis, A003);
                    DbZ.A1J(A0e, this.A02.A01);
                    DbW.A12(A0e, (double) A003);
                    DbT.A1O(A0e);
                    DbW.A13(A0e, (double) currentTimeMillis);
                    A0e.AAJ("autoconfirmation_sources", new C239023El(", ").A02(enm2.A03));
                    DbV.A1H(A0e, DbZ.A0m(r10));
                }
                if (EXD.SAC == regFlowExtras2.A01()) {
                    regFlowExtras.A0g = regFlowExtras2.A0g;
                    if (regFlowExtras2.A0t) {
                        regFlowExtras.A0u = false;
                        A0H = DbW.A0H(this.A03, r10);
                        A0a = AnonymousClass7TE.A0a();
                        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        e58 = new AnonymousClass4DH();
                    } else if (regFlowExtras.A0u) {
                        regFlowExtras.A0u = false;
                        this.A00 = regFlowExtras;
                        AnonymousClass0aP r102 = r10;
                        String str3 = regFlowExtras2.A0Z;
                        Pattern pattern = 0mp.A01;
                        if (str3 == null) {
                            str3 = "";
                        }
                        AnonymousClass4DH r8 = this.A03;
                        C50144FRb.A02(AnonymousClass7TF.A0D(), r8, r8, r102, (G67) null, this, regFlowExtras, this.A07, this.A02, str3, (String) null, false);
                    } else {
                        A0H = DbW.A0H(this.A03, r10);
                        A0a = AnonymousClass7TE.A0a();
                        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                        e58 = new E58();
                    }
                    e58.setArguments(A0a);
                    Dba.A13(e58, A0H);
                } else {
                    AnonymousClass7TF.A0D().post(new C51475Fuj(this.A03, r10, regFlowExtras));
                }
            } else {
                regFlowExtras.A01 = countryCodeData;
                regFlowExtras.A0R = str2;
                FragmentActivity requireActivity = this.A03.requireActivity();
                0lg r0 = this.A01;
                C309516Yo A0J = DbY.A0J(requireActivity, r0);
                String token = r0.getToken();
                Bundle A0a2 = AnonymousClass7TE.A0a();
                Bundle A0a3 = AnonymousClass7TE.A0a();
                A0a3.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                A0a3.putBoolean("should_enable_auto_conf", false);
                A0a3.putBoolean("arg_is_reg_flow", true);
                DbS.A1A(A0a3, token);
                A0a3.putAll(A0a2);
                E3X e3x = new E3X();
                e3x.setArguments(A0a3);
                A0J.A0E(e3x);
                A0J.A0G = true;
                A0J.A07();
            }
            i = -2115142360;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void EuV(String str, Integer num) {
        FCQ.A00(this.A03, this.A01, this.A00, str);
    }

    public C47700EDj(AnonymousClass4DH r1, 0lg r2, G69 g69, CountryCodeData countryCodeData, RegFlowExtras regFlowExtras, EEK eek, C46634DiE diE, String str) {
        this.A01 = r2;
        this.A08 = str;
        this.A03 = r1;
        this.A07 = eek;
        this.A05 = countryCodeData;
        this.A02 = diE;
        this.A04 = g69;
        this.A06 = regFlowExtras;
    }

    public final void onFail(C268654dm r9) {
        String errorMessage;
        String str;
        String str2;
        Integer num;
        int A032 = AnonymousClass0fD.A03(1647865364);
        FGI A022 = 1Q0.A1D.A02(this.A01);
        C46634DiE diE = this.A02;
        C49886FBm A062 = A022.A06(EXD.PHONE, diE);
        boolean z = r9 instanceof C268674do;
        if (!z) {
            errorMessage = null;
        } else {
            Object A002 = r9.A00();
            A002.getClass();
            1XP r1 = (1XP) A002;
            List list = r1.mErrorStrings;
            if (list == null || list.isEmpty()) {
                errorMessage = r1.getErrorMessage();
            } else {
                errorMessage = (String) AnonymousClass7TE.A13(r1.mErrorStrings);
            }
        }
        G69 g69 = this.A04;
        if (errorMessage != null) {
            if (z) {
                Object A003 = r9.A00();
                A003.getClass();
                String str3 = ((1XP) A003).mErrorSource;
                if (str3 != null) {
                    num = C48317Eca.A00(str3);
                    g69.EuV(errorMessage, num);
                    str = "invalid_number";
                }
            }
            num = AnonymousClass05K.A00;
            g69.EuV(errorMessage, num);
            str = "invalid_number";
        } else {
            g69.EuV(DbZ.A0j(this.A03), AnonymousClass05K.A00);
            str = "request_failed";
        }
        A062.A04("error", str);
        if (diE == C46634DiE.A1F) {
            String stripSeparators = PhoneNumberUtils.stripSeparators(this.A08);
            stripSeparators.getClass();
            int length = stripSeparators.length();
            if (length >= 3) {
                stripSeparators = stripSeparators.substring(0, 3);
            }
            A062.A04(Dbj.A00(), stripSeparators);
            A062.A03("digits", length);
            CountryCodeData countryCodeData = this.A05;
            if (countryCodeData != null) {
                str2 = countryCodeData.A01;
            } else {
                str2 = "can't tell";
            }
            A062.A04("country_code", str2);
        }
        A062.A02();
        AnonymousClass0fD.A0A(715033024, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-432528267);
        C47700EDj.super.onFinish();
        this.A07.A00();
        AnonymousClass0fD.A0A(-1638142396, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1013303443);
        C47700EDj.super.onStart();
        this.A07.A01();
        AnonymousClass0fD.A0A(-463094905, A032);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1434960197);
        A00((ENM) obj);
        AnonymousClass0fD.A0A(853163110, A032);
    }
}
