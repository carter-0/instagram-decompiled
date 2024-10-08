package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.util.regex.Pattern;

public final class EDD extends 1P0 {
    public Uri A00;
    public FragmentActivity A01;
    public 06p A02;
    public AnonymousClass0iw A03;
    public AnonymousClass0aP A04;
    public C47483E4i A05;
    public C46634DiE A06;
    public String A07;
    public final C47695EDe A08;
    public final /* synthetic */ C47483E4i A09;

    public EDD(C47483E4i e4i, String str) {
        0s1 r0;
        C47483E4i e4i2 = e4i;
        this.A09 = e4i;
        FragmentActivity requireActivity = e4i.requireActivity();
        AnonymousClass0aP r5 = e4i.A07;
        C46634DiE diE = C46634DiE.A1j;
        Uri A012 = C46413Dea.A01(e4i);
        0hq r1 = e4i.mFragmentManager;
        if (r1 != null) {
            r0 = new 0s1(r1);
        } else {
            r0 = null;
        }
        this.A07 = str;
        this.A01 = requireActivity;
        this.A04 = r5;
        this.A06 = diE;
        this.A03 = e4i;
        this.A00 = A012;
        this.A05 = e4i;
        this.A02 = r0;
        this.A08 = new EMJ(requireActivity, A012, e4i2, r5, this, diE, AnonymousClass05K.A00);
    }

    public final void onFail(C268654dm r8) {
        int i;
        EM2 em2;
        String string;
        int A032 = AnonymousClass0fD.A03(389473469);
        C47483E4i e4i = this.A09;
        if (!e4i.A06()) {
            i = 1477390927;
        } else {
            e4i.A0G.setShowProgressBar(false);
            02m.A0p.markerEnd(725096220, 3);
            if ((r8 instanceof C268674do) && (em2 = (EM2) r8.A00()) != null) {
                int i2 = em2.mStatusCode;
                if (i2 == 404) {
                    if (em2.A0D) {
                        if (em2.getErrorMessage() != null) {
                            string = em2.getErrorMessage();
                        } else {
                            string = e4i.getString(2131975944);
                        }
                        String str = em2.mErrorTitle;
                        if (str == null) {
                            str = e4i.getString(2131961740);
                        }
                        String str2 = em2.A02;
                        if (str2 == null) {
                            str2 = e4i.getString(2131963059);
                        }
                        C358248ab A002 = C49952FGh.A00(e4i.requireContext());
                        A002.A0q(string);
                        A002.A05 = str;
                        A002.A0c(C50020FJf.A00(this, 9), str2);
                        A002.A0G((DialogInterface.OnClickListener) null, 2131975551);
                        DbT.A1V(A002);
                        i = -2021502493;
                    } else {
                        e4i.A0F.A04(e4i.getString(2131968486));
                        i = -1628337061;
                    }
                } else if (i2 == 429) {
                    C358248ab A003 = C49952FGh.A00(e4i.requireContext());
                    A003.A08(2131976736);
                    DbT.A1V(A003);
                    i = 536305267;
                }
            }
            if (e4i.getContext() != null) {
                C49952FGh.A01(e4i.getContext());
            }
            i = -114787796;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1263133345);
        this.A09.A0M.post(new C51217FqY(this));
        AnonymousClass0fD.A0A(-316766941, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-209660229);
        this.A09.A0M.post(new C51216FqX(this));
        AnonymousClass0fD.A0A(2124996522, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C309516Yo r1;
        String str;
        int i;
        String str2;
        int A032 = AnonymousClass0fD.A03(1478049307);
        EM2 em2 = (EM2) obj;
        int A033 = AnonymousClass0fD.A03(925889387);
        C47483E4i e4i = this.A05;
        if (!e4i.A06()) {
            i = -1624483291;
        } else {
            C49922FEx fEx = new C49922FEx();
            C47483E4i e4i2 = this.A09;
            Integer A002 = C47483E4i.A00(0nA.A0I(e4i2.A0E));
            Bundle bundle = fEx.A00;
            bundle.putString(DbX.A0s(C48071EUp.A06), C49025Eo1.A00(A002));
            Integer num = e4i2.A0H;
            if (num != null) {
                bundle.putString(DbX.A0s(C48071EUp.A04), C49025Eo1.A00(num));
            }
            bundle.putBoolean(DbX.A0s(C48071EUp.A08), e4i2.A0I.equals(0nA.A0I(e4i2.A0E).trim()));
            fEx.A02();
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putAll(bundle);
            02m r12 = 02m.A0p;
            String A003 = AnonymousClass000.A00(1611);
            r12.markerPoint(725096220, A003);
            02m.A0p.markerPoint(725096125, A003);
            boolean z = em2.A0B;
            if (z && em2.A0C) {
                02m.A0p.markerEnd(725096220, 4);
                if (TextUtils.isEmpty(em2.A03)) {
                    str2 = this.A07;
                } else {
                    str2 = em2.A03;
                }
                if ("link".equals(em2.A05)) {
                    FragmentActivity fragmentActivity = this.A01;
                    if (fragmentActivity != null) {
                        String formatNumber = PhoneNumberUtils.formatNumber(str2.replace("+", ""));
                        Pattern pattern = 0mp.A01;
                        if (formatNumber == null) {
                            formatNumber = "";
                        }
                        str2 = Dbc.A0F(fragmentActivity, formatNumber).toString();
                    }
                    FragmentActivity activity = e4i.getActivity();
                    if (activity != null && e4i.A02 == null) {
                        C358248ab A0X = DbS.A0X(activity);
                        A0X.A09(2131965626);
                        A0X.A0q(DbV.A0z(e4i, str2, 2131965625));
                        A0X.A07(R.drawable.confirmation_icon);
                        A0X.A06();
                        Dialog A022 = A0X.A02();
                        e4i.A02 = A022;
                        AnonymousClass0fN.A00(A022);
                        0xI A052 = 1Q0.A1G.A02(e4i.A07).A05((EXD) null, C46634DiE.A1j);
                        e4i.A09.A00.putString(DbX.A0s(C48071EUp.A0A), "sms");
                        e4i.A09.A03(A052);
                        DbU.A1R(A052, e4i.A07);
                    }
                } else {
                    C49721F3j A0X2 = DbW.A0X();
                    String str3 = this.A07;
                    AnonymousClass0aP r7 = this.A04;
                    E3X A034 = A0X2.A03(A0a, str2, str3, true);
                    FGJ fgj = FGJ.A03;
                    FragmentActivity fragmentActivity2 = this.A01;
                    fgj.A03(fragmentActivity2, r7, A034, this.A06, str3);
                    r1 = DbV.A0N(A034, fragmentActivity2, r7);
                    r1.A0G = true;
                    r1.A04();
                }
            } else if (z && em2.A09) {
                02m.A0p.markerEnd(725096220, 4);
                if (TextUtils.isEmpty(em2.A03)) {
                    str = this.A07;
                } else {
                    str = em2.A03;
                }
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putString("lookup_user_input", this.A07);
                A0a2.putString("lookup_email", str);
                A0a2.putBoolean("arg_is_multiple_account_recovery", true);
                if (!e4i.A0K && !e4i.requireActivity().isFinishing()) {
                    r1 = DbY.A0J(this.A01, this.A04);
                    DbU.A1C(A0a2);
                    AnonymousClass4DH r0 = new AnonymousClass4DH();
                    r0.setArguments(A0a2);
                    r1.A0E(r0);
                    r1.A04();
                }
            } else if (em2.A00 != null) {
                this.A08.A04(em2);
            } else {
                AnonymousClass7TF.A0D().post(new C51365Fsx(this, new C51456FuQ(A0a, em2, this)));
            }
            i = 482263565;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-222269902, A032);
    }
}
