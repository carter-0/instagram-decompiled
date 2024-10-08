package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Iterator;

/* renamed from: X.TzE  reason: case insensitive filesystem */
public final class C14608TzE implements C13907Tl7 {
    public static final C18522VtM A05 = new Object();
    public C14644Tzq A00;
    public Integer A01;
    public final Context A02;
    public final C18972WEz A03;
    public final AnonymousClass6NS A04;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void A00() {
        C14644Tzq tzq;
        Integer num;
        String str;
        Integer num2 = this.A01;
        Integer num3 = AnonymousClass05K.A01;
        if (num2 != num3 && (tzq = this.A00) != null) {
            this.A01 = num3;
            if (num2 == AnonymousClass05K.A00) {
                num = num3;
            } else {
                num = AnonymousClass05K.A0C;
            }
            C277014uI r4 = tzq.A02;
            if (r4 != null) {
                C276544tV r3 = tzq.A01;
                C307786Rm r2 = tzq.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                C308276Tl A0T = DbU.A0T(r2);
                A0T.A02(str);
                DbT.A1R(r2, r3, A0T, r4);
            }
        }
    }

    public final void A01(Bundle bundle) {
        int i;
        this.A03.A00(bundle, true);
        switch (this.A01.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        bundle.putInt("bloks_screen_navigation_state", i);
    }

    public final void A02(Integer num) {
        C277014uI r4;
        String str;
        Integer num2 = this.A01;
        Integer num3 = AnonymousClass05K.A01;
        if (num2 == num3) {
            this.A01 = AnonymousClass05K.A0C;
            C14644Tzq tzq = this.A00;
            if (tzq != null && (r4 = tzq.A03) != null) {
                C276544tV r3 = tzq.A01;
                C307786Rm r2 = tzq.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                C308276Tl A0T = DbU.A0T(r2);
                A0T.A02(str);
                DbT.A1R(r2, r3, A0T, r4);
            }
        }
    }

    public final void onDestroy(AnonymousClass07Z r3) {
        Iterator it = this.A03.A07.iterator();
        while (it.hasNext()) {
            C14615TzM.A03(Integer.valueOf(AnonymousClass7TG.A0F(it)));
        }
        this.A04.A03();
    }

    public C14608TzE(Context context, SparseArray sparseArray, C18972WEz wEz, C229392nJ r6, Integer num) {
        this.A02 = context;
        this.A03 = wEz;
        this.A01 = num;
        AnonymousClass6NR A002 = AnonymousClass6NS.A00(context, wEz.A02, r6);
        A002.A02 = wEz.A09;
        A002.A00 = sparseArray;
        this.A04 = A002.A00();
    }
}
