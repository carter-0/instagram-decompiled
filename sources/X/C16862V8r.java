package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V8r  reason: case insensitive filesystem */
public abstract class C16862V8r {
    public static ArrayList A00(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276544tV r5 = (C276544tV) it.next();
            if (r5.A0H() == null) {
                1Kn.A02(C273654mx.A00(1200), "Received invalid null url while trying to create video version");
            } else {
                String str = "regular";
                String A0F = r5.A0F();
                if (A0F != null) {
                    str = A0F;
                }
                if (!str.equals("hd")) {
                    i = 102;
                    if (!str.equals("regular")) {
                        i = -1;
                    }
                } else {
                    i = 101;
                }
                arrayList.add(new VideoUrlImpl(r5.A0H(), r5.A03(41, -1), r5.A03(35, -1), i, r5.A0E()));
            }
        }
        return arrayList;
    }
}
