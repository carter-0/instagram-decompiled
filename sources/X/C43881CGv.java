package X;

import com.google.common.collect.ImmutableList;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CGv  reason: case insensitive filesystem */
public final class C43881CGv extends C298815u5 {
    public List A00 = 0sn.A00;

    public final List Ao4() {
        List<C41938B7p> unmodifiableList = Collections.unmodifiableList(this.A00);
        0qQ.A07(unmodifiableList);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C41938B7p A01 : unmodifiableList) {
            A1C.add(A01.A01());
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
        0qQ.A07(copyOf);
        ArrayList A0r = AnonymousClass7TG.A0r(copyOf);
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            A0r.add(C295375o3.A03((AnonymousClass3OA) it.next()));
        }
        List unmodifiableList2 = Collections.unmodifiableList(A0r);
        0qQ.A07(unmodifiableList2);
        return unmodifiableList2;
    }

    public final C276114sa BaP() {
        C298855u9 A002 = C276114sa.A00.A00(true);
        A002.A00 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        return A002.A00();
    }

    public final boolean CP6() {
        return true;
    }

    public final String getNextMaxId() {
        return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
    }

    public final void A01() {
        super.A00();
    }
}
