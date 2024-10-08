package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.IdentityHashMap;

/* renamed from: X.5Ng  reason: invalid class name and case insensitive filesystem */
public final class C284615Ng implements AnonymousClass4TF {
    public final /* synthetic */ AnonymousClass4TC A00;
    public final /* synthetic */ AnonymousClass5NF A01;

    public C284615Ng(AnonymousClass4TC r1, AnonymousClass5NF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final AnonymousClass4TH A00(C264874Rq r6, AnonymousClass4QW r7, long j) {
        AnonymousClass5NF r3 = this.A01;
        Object obj = r6.A04;
        Timeline timeline = Timeline.A00;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C264874Rq A002 = r6.A00(pair.second);
        Object obj3 = r3.A09.get(obj2);
        obj3.getClass();
        AnonymousClass5NQ r2 = (AnonymousClass5NQ) obj3;
        r3.A0A.add(r2);
        C284605Nf r0 = (C284605Nf) r3.A06.get(r2);
        if (r0 != null) {
            r0.A02.ARI(r0.A01);
        }
        r2.A04.add(A002);
        C284625Nh A0G = r2.A02.AMb(A002, r7, j);
        r3.A07.put(A0G, r2);
        AnonymousClass5NF.A02(r3);
        return A0G;
    }

    public final void ECj(AnonymousClass4TH r6) {
        AnonymousClass5NF r4 = this.A01;
        IdentityHashMap identityHashMap = r4.A07;
        Object remove = identityHashMap.remove(r6);
        remove.getClass();
        AnonymousClass5NQ r2 = (AnonymousClass5NQ) remove;
        r2.A02.ECj(r6);
        r2.A04.remove(((C284625Nh) r6).A05);
        if (!identityHashMap.isEmpty()) {
            AnonymousClass5NF.A02(r4);
        }
        AnonymousClass5NF.A01(r2, r4);
    }
}
