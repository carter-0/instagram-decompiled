package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8qa  reason: invalid class name and case insensitive filesystem */
public final class C367338qa {
    public Long A00;
    public Object A01;
    public String A02 = NetInfoModule.CONNECTION_TYPE_NONE;
    public Map A03;
    public final C367968rr A04;

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        C367698rQ r3 = ((C367958rq) this.A04).A00;
        long j = 0;
        for (C367908rl r0 : r3.A0K) {
            j += (long) Math.max(0, r0.A0C);
        }
        if (j > 0) {
            this.A02 = str;
            this.A00 = Long.valueOf(System.currentTimeMillis());
            this.A03 = 0Yt.A0B(r3);
        }
        r3.clear();
    }

    public final RegularImmutableMap A00(AnonymousClass9ID r6, ImmutableList immutableList) {
        if (!0qQ.A0K(this.A01, r6)) {
            A01("state_snapshot_mismatch");
        }
        C367698rQ r4 = ((C367958rq) this.A04).A00;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = r4.get(next);
            if (obj != null) {
                builder.put(next, obj);
            }
        }
        int i = builder.size;
        Object[] objArr = builder.alternatingKeysAndValues;
        builder.entriesUsed = true;
        RegularImmutableMap A002 = RegularImmutableMap.A00(builder, objArr, i);
        A002.keySet();
        return A002;
    }

    public C367338qa(UserSession userSession) {
        long A012 = 182.A01(0Tu.A05, userSession, 36599946066595482L);
        C367658rM r1 = new C367658rM();
        r1.A02(A012, TimeUnit.MINUTES);
        this.A04 = r1.A00();
    }
}
