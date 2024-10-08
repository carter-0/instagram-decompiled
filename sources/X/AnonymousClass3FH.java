package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3FH  reason: invalid class name */
public abstract class AnonymousClass3FH {
    public static 1XZ A00;
    public static final long A01 = TimeUnit.HOURS.toMillis(5);

    public static void A01() {
        ArrayList arrayList = new ArrayList();
        for (PushChannelType pushChannelType : PushChannelType.values()) {
            arrayList.add(pushChannelType.A01);
        }
        0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AR4.ED3(002.A0R("push_reg_date", (String) it.next()));
        }
        AR4.apply();
    }

    public static String A00(PushChannelType pushChannelType) {
        0tS A002 = 0tS.A00();
        if (((Boolean) A002.A1h.CDM(A002, 0tS.A4G[30])).booleanValue()) {
            return pushChannelType.A00;
        }
        return null;
    }

    public static void A02(Integer num) {
        A01();
        AnonymousClass3QY.A00().EBN(num);
    }
}
