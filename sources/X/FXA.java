package X;

import android.text.TextUtils;

public final class FXA implements 1wn {
    public final /* synthetic */ E3X A00;

    public FXA(E3X e3x) {
        this.A00 = e3x;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Integer num;
        int i;
        int A03 = AnonymousClass0fD.A03(-249644485);
        C50262FVt fVt = (C50262FVt) obj;
        int A032 = AnonymousClass0fD.A03(238554300);
        E3X e3x = this.A00;
        if (!C49958FGq.A00(e3x.A09, e3x.A0B).equals(fVt.A02)) {
            i = -247086657;
        } else {
            String str = fVt.A01;
            if (!TextUtils.isEmpty(str)) {
                num = fVt.A00;
            } else {
                str = DbZ.A0j(e3x);
                num = AnonymousClass05K.A00;
            }
            e3x.EuV(str, num);
            i = -1961064093;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(751747426, A03);
    }
}
