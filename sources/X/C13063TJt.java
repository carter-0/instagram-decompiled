package X;

import android.content.res.Resources;
import android.os.LocaleList;

/* renamed from: X.TJt  reason: case insensitive filesystem */
public final /* synthetic */ class C13063TJt implements Runnable {
    public final /* synthetic */ XSZ A00;
    public final /* synthetic */ C11215SFp A01;
    public final /* synthetic */ C10471Rsm A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C13063TJt(XSZ xsz, C11215SFp sFp, C10471Rsm rsm, String str) {
        this.A01 = sFp;
        this.A02 = rsm;
        this.A00 = xsz;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ryw, java.lang.Object] */
    public final void run() {
        String str;
        C8518QwE qwE;
        String A002;
        C11215SFp sFp = this.A01;
        C10471Rsm rsm = this.A02;
        XSZ xsz = this.A00;
        String str2 = this.A03;
        C10608Rv2 rv2 = rsm.A01;
        rv2.A01 = xsz;
        C10837Ryx ryx = new C10609Rv3(rv2).A02;
        if (ryx == null || (str = ryx.A09) == null || str.isEmpty()) {
            str = "NA";
        }
        ? obj = new Object();
        obj.A06 = sFp.A05;
        obj.A07 = sFp.A06;
        synchronized (C11215SFp.class) {
            qwE = C11215SFp.A0A;
            if (qwE == null) {
                2Yd A003 = C9167RRs.A00(Resources.getSystem().getConfiguration());
                C8512Qw8 qw8 = new C8512Qw8();
                int i = 0;
                while (true) {
                    LocaleList localeList = A003.A00.A00;
                    if (i >= localeList.size()) {
                        break;
                    }
                    qw8.A00(localeList.get(i).toLanguageTag());
                    i++;
                }
                qw8.A01 = true;
                Object[] objArr = qw8.A02;
                int i2 = qw8.A00;
                C8509Qw5 qw5 = C8518QwE.A00;
                if (i2 == 0) {
                    qwE = C8517QwD.A02;
                } else {
                    qwE = new C8517QwD(objArr, i2);
                }
                C11215SFp.A0A = qwE;
            }
        }
        obj.A00 = qwE;
        obj.A02 = AnonymousClass7TE.A0v();
        obj.A09 = str;
        obj.A08 = str2;
        AnonymousClass9GD r1 = sFp.A03;
        if (r1.A0E()) {
            A002 = (String) r1.A06();
        } else {
            A002 = sFp.A04.A00();
        }
        obj.A0A = A002;
        obj.A04 = 10;
        obj.A05 = Integer.valueOf(sFp.A00);
        rsm.A00 = obj;
        sFp.A01.FP6(rsm);
    }
}
