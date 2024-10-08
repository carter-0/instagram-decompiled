package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.Krt  reason: case insensitive filesystem */
public abstract class C63125Krt {
    /* JADX WARNING: type inference failed for: r2v13, types: [X.L7l, java.lang.Object] */
    public static LinkedList A00(UserSession userSession) {
        LinkedList linkedList = new LinkedList();
        Integer valueOf = Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES);
        Integer[] numArr = new Integer[47];
        System.arraycopy(new Integer[]{1009, 1010, 1011, 1012, 1013, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 643, 640, 706, 703, 705, 707, 709, 710, 702, 642, 112}, 0, numArr, 0, 27);
        System.arraycopy(new Integer[]{114, 111, 615, 614, 613, 605, 616, 603, 612, 608, 24, 17, 23, 25, 1, 27, 28, 2, 10, 15}, 0, numArr, 27, 20);
        C249803kO it = ImmutableList.of(0, 810, 813, valueOf, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, numArr).iterator();
        while (it.hasNext()) {
            C353978Kd A01 = C353948Ka.A00(userSession).A01(AnonymousClass7TG.A0F(it));
            ? obj = new Object();
            obj.A01 = A01;
            obj.A00 = A01.A00;
            obj.A03 = false;
            obj.A02 = false;
            linkedList.add(obj);
        }
        return linkedList;
    }
}
