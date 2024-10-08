package X;

import androidx.media3.common.Timeline;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.Xc2  reason: case insensitive filesystem */
public final class C21470Xc2 {
    public C22521Y7s A00;
    public Y8A A01 = new C22094XvK(new Random(), new int[0]);
    public boolean A02;
    public final C22520Y7r A03;
    public final C22528Y7z A04;
    public final YCG A05;
    public final HashMap A06;
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final List A08 = AnonymousClass7TE.A1C();
    public final Map A09 = AnonymousClass7TE.A1E();
    public final Set A0A;
    public final C22016XrA A0B;

    public final Timeline A00() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass7TE.A11("firstWindowIndexInChild");
        }
        Y8A y8a = this.A01;
        Timeline timeline = Timeline.A00;
        Timeline[] timelineArr = new Timeline[list.size()];
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("getTimeline");
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return new C21142XGj(y8a, timelineArr, objArr);
        }
        it2.next();
        throw AnonymousClass7TE.A11("getUid");
    }

    public C21470Xc2(C22520Y7r y7r, C22528Y7z y7z, YCG ycg, C22016XrA xrA) {
        this.A0B = xrA;
        this.A04 = y7z;
        this.A05 = ycg;
        this.A03 = y7r;
        this.A06 = AnonymousClass7TE.A1E();
        this.A0A = AnonymousClass7TE.A1F();
    }
}
