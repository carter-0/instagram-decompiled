package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class TGZ implements Runnable {
    public final /* synthetic */ AnonymousClass8MA A00;
    public final /* synthetic */ SOP A01;

    public TGZ(AnonymousClass8MA r1, SOP sop) {
        this.A01 = sop;
        this.A00 = r1;
    }

    public final void run() {
        C60340gF r0;
        String str;
        Bitmap decodeFile;
        IllegalStateException th;
        SOP sop = this.A01;
        AnonymousClass8MA r5 = this.A00;
        C11283SJb sJb = sop.A04;
        Map map = C11283SJb.A06;
        List A002 = sJb.A00("", false);
        ArrayList<QOy> A1C = AnonymousClass7TE.A1C();
        for (Object next : A002) {
            JTR.A1P(((QOy) next).A04, sop.A08, next, A1C);
        }
        for (QOy qOy : A1C) {
            try {
                str = qOy.A02;
                0qQ.A0B(str, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile != null) {
                    long j = qOy.A00;
                    r5.AWm(new C53394GnR(decodeFile, j));
                    SOP.A01(decodeFile, sop, qOy.A04, (Map) null, j, true);
                    decodeFile.recycle();
                    sJb.A02(str);
                    sop.A03.A00(qOy, AnonymousClass05K.A0Y, (String) null, (String) null, (Throwable) null, (Map) null);
                    r0 = C60340gF.A00;
                    Throwable A003 = 0eR.A00(r0);
                    if (A003 != null) {
                        S5Y s5y = sop.A03;
                        s5y.A00(qOy, AnonymousClass05K.A0j, (String) null, 002.A0R("Failed to apply effect to ", qOy.A02), A003, (Map) null);
                        s5y.A00(qOy, AnonymousClass05K.A0N, (String) null, (String) null, A003, (Map) null);
                    }
                } else {
                    th = AnonymousClass7TE.A0z("Failed to load bitmap from file");
                    throw th;
                }
            } catch (Throwable th2) {
                r0 = JTO.A1B(th2);
            }
        }
    }
}
