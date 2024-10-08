package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.FXa  reason: case insensitive filesystem */
public final class C50295FXa implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50295FXa(C307896Rx r1, C277014uI r2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = r1;
            this.A02 = r2;
        } else {
            this.A02 = r1;
            this.A01 = r2;
        }
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-932871577);
                C50261FVs fVs = (C50261FVs) obj;
                int A032 = AnonymousClass0fD.A03(-1774925565);
                0qQ.A0B(fVs, 0);
                Integer num = fVs.A00;
                if (num != AnonymousClass05K.A00) {
                    C308276Tl A0P = DbS.A0P();
                    switch (num.intValue()) {
                        case 0:
                            str = "STARTED";
                            break;
                        case 1:
                            str = "SUCCESS";
                            break;
                        default:
                            str = "FAILED";
                            break;
                    }
                    A0P.A03(str, 0);
                    A0P.A02(fVs.A02);
                    A0P.A03(fVs.A01, 2);
                    C299275ur.A00((C307896Rx) this.A02, A0P.A00(), (C277014uI) this.A01);
                    1xC.A01.A03(this, C50261FVs.class);
                }
                AnonymousClass0fD.A0A(-106068120, A032);
                i = 2100454204;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1604146687);
                int A033 = AnonymousClass0fD.A03(861316600);
                C308206Td.A0E((C307896Rx) this.A01, (C277014uI) this.A02, "pending");
                AnonymousClass0fD.A0A(51407549, A033);
                i = 1423724066;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-159632920);
                AnonymousClass3EI r8 = (AnonymousClass3EI) obj;
                int A034 = AnonymousClass0fD.A03(220512195);
                C238713Dd.A01(C238713Dd.A00(r8), (0hq) this.A01);
                ((1wn) this.A02).onEvent(r8);
                AnonymousClass0fD.A0A(-282391644, A034);
                i = -134821545;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-327971467);
                0KY r82 = (0KY) obj;
                int A035 = AnonymousClass0fD.A03(-919736247);
                0qQ.A0B(r82, 0);
                String str3 = r82.A01;
                if (str3 == null || (str2 = r82.A00) == null) {
                    FFQ.A00().A00((Activity) this.A01, (Bundle) null, (0lg) this.A02);
                } else {
                    Activity activity = (Activity) this.A01;
                    C358248ab A0X = DbS.A0X(activity);
                    A0X.A05 = str3;
                    A0X.A0r(false);
                    A0X.A0q(str2);
                    A0X.A0E(C50025FJk.A00(activity, this.A02, 41));
                    DbT.A1V(A0X);
                }
                AnonymousClass0fD.A0A(-707039773, A035);
                i = 1472783461;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public C50295FXa(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
