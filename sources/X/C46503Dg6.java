package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dg6  reason: case insensitive filesystem */
public abstract class C46503Dg6 {
    public static final BigInteger A00 = new BigInteger("ffffffffffffffff", 16);

    public static DirectShareTarget A00(Context context, UserSession userSession, AnonymousClass2Ep r10) {
        ArrayList A01 = AnonymousClass48M.A01(r10.BRZ());
        return new DirectShareTarget(r10.C3d(), C66662MaV.A00(r10.C6C(), A01), (Boolean) null, (Double) null, AnonymousClass48N.A07(context, userSession, r10), (String) null, A01, r10.CQ2(), r10.CR4());
    }

    public static ArrayList A01(Context context, UserSession userSession, List list) {
        DirectShareTarget directShareTarget;
        String obj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74253Prh prh = (C74253Prh) it.next();
            if (prh instanceof C50409FbI) {
                C50409FbI fbI = (C50409FbI) prh;
                Integer num = fbI.A02;
                if (num == AnonymousClass05K.A00) {
                    C370538wd r6 = fbI.A00;
                    ArrayList A01 = AnonymousClass48M.A01(Collections.unmodifiableList(r6.A1c));
                    String str = r6.A1K;
                    if (TextUtils.isEmpty(str) || !r6.A1q) {
                        str = AnonymousClass50n.A00(context, userSession, A01);
                    }
                    int i = r6.A0I;
                    if (i == 24 || i == 26) {
                        obj = new BigInteger(r6.A1D).and(A00).toString();
                    } else {
                        obj = r6.A1D;
                    }
                    C254763t0 r15 = new C254763t0(obj);
                    boolean z = r6.A1d;
                    CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = r6.A0l;
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = r6.A0k;
                    DiscoverableThreadInfo discoverableThreadInfo = r6.A0n;
                    String str2 = r6.A1A;
                    Boolean bool = r6.A0x;
                    Boolean bool2 = bool;
                    directShareTarget = new DirectShareTarget(r6.A0j, creatorBroadcastThreadInfo, creatorSubscriberThreadInfo, discoverableThreadInfo, (2EN) null, r15, true, bool2, (Double) null, (Integer) null, Integer.valueOf(r6.A0I), (Integer) null, str, (String) null, str2, r6.A1O, (String) null, A01, z, false);
                } else if (num == AnonymousClass05K.A01) {
                    List singletonList = Collections.singletonList(new PendingRecipient(fbI.A01));
                    directShareTarget = new DirectShareTarget(new C291175gg(singletonList), true, (Double) null, AnonymousClass50n.A07(fbI.A01), singletonList, true);
                }
                A1C.add(directShareTarget);
            }
        }
        return A1C;
    }

    public static ArrayList A02(List list) {
        User user;
        Boolean bool;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (list != null && !list.isEmpty()) {
            HashSet A1F = AnonymousClass7TE.A1F();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C74253Prh prh = (C74253Prh) it.next();
                if (prh instanceof C50409FbI) {
                    C50409FbI fbI = (C50409FbI) prh;
                    C370538wd r5 = fbI.A00;
                    if (fbI.A02 == AnonymousClass05K.A00 && (((bool = r5.A10) == null || !bool.booleanValue()) && Boolean.FALSE.equals(r5.A0y) && Collections.unmodifiableList(r5.A1c).size() == 1)) {
                        user = (User) AnonymousClass7TE.A13(Collections.unmodifiableList(fbI.A00.A1c));
                        if (!A1F.add(user)) {
                        }
                    } else if (fbI.A02 == AnonymousClass05K.A01 && A1F.add(fbI.A01)) {
                        user = fbI.A01;
                    }
                    A1C.add(new DirectShareTarget(user));
                }
            }
        }
        return A1C;
    }
}
