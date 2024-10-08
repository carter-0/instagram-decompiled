package X;

import android.content.res.Resources;
import android.os.LocaleList;

/* renamed from: X.TJu  reason: case insensitive filesystem */
public final /* synthetic */ class C13064TJu implements Runnable {
    public final /* synthetic */ XSa A00;
    public final /* synthetic */ C11332SNl A01;
    public final /* synthetic */ C10612Rv6 A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C13064TJu(XSa xSa, C11332SNl sNl, C10612Rv6 rv6, String str) {
        this.A01 = sNl;
        this.A02 = rv6;
        this.A00 = xSa;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ryy, java.lang.Object] */
    public final void run() {
        String str;
        C8535QwZ qwZ;
        String A002;
        C11332SNl sNl = this.A01;
        C10612Rv6 rv6 = this.A02;
        XSa xSa = this.A00;
        String str2 = this.A03;
        C10757Rxb rxb = rv6.A02;
        rxb.A02 = xSa;
        C10839Ryz ryz = new C10758Rxc(rxb).A04;
        if (ryz == null || (str = ryz.A09) == null || str.isEmpty()) {
            str = "NA";
        }
        ? obj = new Object();
        obj.A06 = sNl.A04;
        obj.A07 = sNl.A05;
        synchronized (C11332SNl.class) {
            qwZ = C11332SNl.A0A;
            if (qwZ == null) {
                2Yd A003 = C9167RRs.A00(Resources.getSystem().getConfiguration());
                C8532QwW qwW = new C8532QwW();
                int i = 0;
                while (true) {
                    LocaleList localeList = A003.A00.A00;
                    if (i >= localeList.size()) {
                        break;
                    }
                    qwW.A00(localeList.get(i).toLanguageTag());
                    i++;
                }
                qwW.A01 = true;
                Object[] objArr = qwW.A02;
                int i2 = qwW.A00;
                C8548Qwm qwm = C8535QwZ.A00;
                if (i2 == 0) {
                    qwZ = C8540Qwe.A02;
                } else {
                    qwZ = new C8540Qwe(objArr, i2);
                }
                C11332SNl.A0A = qwZ;
            }
        }
        obj.A00 = qwZ;
        obj.A02 = AnonymousClass7TE.A0v();
        obj.A09 = str;
        obj.A08 = str2;
        AnonymousClass9GD r1 = sNl.A02;
        if (r1.A0E()) {
            A002 = (String) r1.A06();
        } else {
            A002 = sNl.A03.A00();
        }
        obj.A0A = A002;
        obj.A04 = 10;
        obj.A05 = Integer.valueOf(sNl.A00);
        rv6.A00 = obj;
        sNl.A01.FP7(rv6);
    }
}
