package X;

import android.os.Bundle;
import java.util.List;
import java.util.Set;

public final class SlG implements C59533JNf {
    public final Bundle A00;
    public final S5W A01;
    public final C270254gR A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final void Che(String str, boolean z) {
        Set set;
        RRP A002 = this.A01.A00(str, false);
        A002.A0A = this.A04;
        List list = this.A05;
        int i = 0;
        if (list == null || list.isEmpty()) {
            set = null;
        } else {
            set = Pxj.A10(list.get(0));
        }
        A002.A07 = SUR.A02(set);
        A002.A08 = this.A03;
        if (list != null) {
            i = list.size();
        }
        A002.A00 = i;
        A002.A0P = z;
        A002.A0M = true;
        SUR.A0A(this.A00, this.A02, A002.A00());
    }

    public SlG(Bundle bundle, S5W s5w, C270254gR r3, String str, String str2, List list) {
        this.A01 = s5w;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A00 = bundle;
        this.A02 = r3;
    }
}
