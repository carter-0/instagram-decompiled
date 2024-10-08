package X;

import android.os.Handler;
import android.os.Message;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;

/* renamed from: X.7ov  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C342637ov implements Handler.Callback {
    public final /* synthetic */ C342627ou A00;

    public /* synthetic */ C342637ov(C342627ou r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i;
        C342627ou r1 = this.A00;
        Message message2 = message;
        if (message2.what != 1) {
            return false;
        }
        List list = r1.A0A;
        List list2 = r1.A09;
        int i2 = message2.arg1;
        float A06 = r1.A06();
        if (list == null || list2 == null || i2 >= list.size()) {
            return true;
        }
        Object obj = message2.obj;
        if (obj != null) {
            i = ((Number) obj).intValue();
        } else {
            i = 0;
        }
        C3496981j r12 = r1.A0F;
        float floatValue = ((Number) list2.get(list2.size() - 1)).floatValue();
        list.get(list.size() - 1);
        List list3 = r12.A00;
        int size = list3.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass8GT r11 = (AnonymousClass8GT) list3.get(i3);
            C340297l2 A002 = AnonymousClass8GT.A00(r11, AnonymousClass000.A00(3693));
            if (A002 != null) {
                if (i != 1) {
                    if (i == 2) {
                        AnonymousClass8GT.A02(A002, r11, 800);
                        1Eo.A05(r11.A0A, new C66174MGl((Object) r11, (Object) A002, ReactProgressBarViewManager.DEFAULT_STYLE, (AnonymousClass4D7) null, 20), r11.A0B);
                    }
                } else if (r11.A09.get() == AnonymousClass8GV.NORMAL) {
                    1Eo.A05(r11.A0A, new C66174MGl((Object) r11, (Object) A002, "Ultra Wide", (AnonymousClass4D7) null, 20), r11.A0B);
                    if (!A002.A0V() && A06 > floatValue) {
                        Object A03 = C340297l2.A03(C342717p3.A0t, A002);
                        A03.getClass();
                        AnonymousClass8GT.A01(A002, r11, ((Number) A03).floatValue());
                    }
                }
                0mp.A06(AnonymousClass000.A00(3694), new Object[]{Float.valueOf(A06), Integer.valueOf(i2)});
            }
        }
        return true;
    }
}
