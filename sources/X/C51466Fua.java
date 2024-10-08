package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import java.util.regex.Pattern;

/* renamed from: X.Fua  reason: case insensitive filesystem */
public final /* synthetic */ class C51466Fua implements Runnable {
    public final /* synthetic */ DwH A00;
    public final /* synthetic */ EDY A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C51466Fua(DwH dwH, EDY edy, String str) {
        this.A01 = edy;
        this.A02 = str;
        this.A00 = dwH;
    }

    public final void run() {
        C309516Yo A0N;
        Bundle A0a;
        Fragment e58;
        EDY edy = this.A01;
        String str = this.A02;
        DwH dwH = this.A00;
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        regFlowExtras.A08 = str;
        regFlowExtras.A0n = dwH.A07;
        regFlowExtras.A0X = dwH.A02;
        regFlowExtras.A0C = dwH.A00;
        regFlowExtras.A0g = dwH.A04;
        RegFlowExtras regFlowExtras2 = edy.A04;
        if (regFlowExtras2 != null) {
            EXD exd = EXD.SAC;
            if (exd == regFlowExtras2.A01()) {
                regFlowExtras.A0g = regFlowExtras2.A0g;
                regFlowExtras.A0J = regFlowExtras2.A0J;
                regFlowExtras.A0M = regFlowExtras2.A0M;
                regFlowExtras.A0u = regFlowExtras2.A0u;
            }
            regFlowExtras.A04 = regFlowExtras2.A04;
            regFlowExtras.A03 = regFlowExtras2.A03;
            if (exd == regFlowExtras2.A01()) {
                regFlowExtras.A0Z = regFlowExtras2.A0Z;
                regFlowExtras.A0P = regFlowExtras2.A0P;
                regFlowExtras.A03(exd);
                Integer A022 = regFlowExtras2.A02();
                if (A022 != null) {
                    regFlowExtras.A0V = C49109EpY.A00(A022);
                }
                regFlowExtras.A0w = regFlowExtras2.A0w;
                regFlowExtras.A06 = regFlowExtras2.A06;
                regFlowExtras.A07 = regFlowExtras2.A07;
                FCQ.A01(regFlowExtras2, regFlowExtras);
                if (regFlowExtras2.A0t) {
                    regFlowExtras.A0u = false;
                    A0N = DbS.A0M(edy.A01.requireActivity(), edy.A02);
                    A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                    e58 = new AnonymousClass4DH();
                } else if (regFlowExtras.A0u) {
                    regFlowExtras.A0u = false;
                    AnonymousClass0aP r3 = edy.A02;
                    String str2 = regFlowExtras2.A0Z;
                    Pattern pattern = 0mp.A01;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AnonymousClass4DH r1 = edy.A01;
                    AnonymousClass4DH r2 = r1;
                    C50144FRb.A02(AnonymousClass7TF.A0D(), r1, r2, r3, (G67) null, edy.A03, regFlowExtras, edy.A05, C46634DiE.A1M, str2, (String) null, false);
                    return;
                } else {
                    A0N = DbS.A0M(edy.A01.requireActivity(), edy.A02);
                    A0a = AnonymousClass7TE.A0a();
                    A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
                    e58 = new E58();
                }
                e58.setArguments(A0a);
                A0N.A0B((Bundle) null, e58);
                A0N.A04();
            }
        }
        DbT.A15();
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        0lg r22 = edy.A02;
        DbW.A0w(A0a2, r22);
        E3V e3v = new E3V();
        e3v.setArguments(A0a2);
        A0N = DbV.A0N(e3v, edy.A01.requireActivity(), r22);
        A0N.A04();
    }
}
