package X;

import android.content.DialogInterface;
import com.instagram.save.model.SavedCollection;
import java.util.List;

public final class FIi implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public FIi(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A04 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        switch (this.A00) {
            case 0:
                for (int i2 = 0; i2 < this.A01; i2++) {
                    if (((boolean[]) this.A04)[i2]) {
                        ((2cW) this.A02).AHW((AnonymousClass4VR) this.A03, AnonymousClass05K.A00(5)[i2], this.A05);
                    }
                }
                return;
            case 1:
                P30 p30 = (P30) this.A04;
                int i3 = p30.A01.C6l().C6Q().A08;
                C313756gx A0R = DbZ.A0R(p30.A03);
                int i4 = this.A01;
                C254793t3 r4 = (C254793t3) this.A03;
                if (r4 != null) {
                    str = C300965yF.A07(r4);
                } else {
                    str = null;
                }
                String str2 = this.A05;
                1Ln A0J = DbT.A0J(A0R);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A0R);
                    DbV.A1M(A0J, C273654mx.A00(2148));
                    A0J.A0p("channel_translation_education");
                    A0J.A0i(DbZ.A0b(A0J, "thread_view", str, str2, i4));
                    Dba.A1C(A0J, A0R);
                }
                ((C332907Wx) this.A02).CpN(r4, C273654mx.A00(998), i3);
                return;
            default:
                H15 h15 = (H15) this.A02;
                String str3 = this.A05;
                List list = (List) this.A03;
                int i5 = this.A01;
                Runnable runnable = (Runnable) this.A04;
                H15.A02(h15);
                SavedCollection savedCollection = h15.A0C;
                if (savedCollection != null) {
                    C56669I6y.A01(h15.requireContext(), h15, h15.A05, savedCollection, runnable, str3, list, i5);
                    return;
                }
                return;
        }
    }
}
