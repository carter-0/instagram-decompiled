package X;

import com.google.android.exoplayer2.Timeline;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.MultimapBuilder$ArrayListSupplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5pC  reason: invalid class name and case insensitive filesystem */
public final class C295965pC extends AnonymousClass5EJ {
    public static final AnonymousClass4RL A09;
    public int A00 = -1;
    public RCU A01;
    public long[][] A02;
    public final C265104So A03;
    public final C257513xW A04;
    public final ArrayList A05;
    public final Map A06;
    public final Timeline[] A07;
    public final C265164Su[] A08;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4So, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.3xW, com.google.common.collect.AbstractMapBasedMultimap, java.lang.Object, com.google.common.collect.Multimaps$CustomListMultimap] */
    public C295965pC(C265164Su... r5) {
        ? obj = new Object();
        this.A08 = r5;
        this.A03 = obj;
        this.A05 = new ArrayList(Arrays.asList(r5));
        this.A07 = new Timeline[r5.length];
        this.A02 = new long[0][];
        this.A06 = new HashMap();
        CompactHashMap compactHashMap = new CompactHashMap(8);
        MultimapBuilder$ArrayListSupplier multimapBuilder$ArrayListSupplier = new MultimapBuilder$ArrayListSupplier();
        ? obj2 = new Object();
        17k.A0E(compactHashMap.isEmpty());
        obj2.A01 = compactHashMap;
        obj2.A00 = multimapBuilder$ArrayListSupplier;
        this.A04 = obj2;
    }

    static {
        AnonymousClass4RF r1 = new AnonymousClass4RF();
        r1.A07 = "MergingMediaSource";
        A09 = r1.A00();
    }

    public final AnonymousClass4TH AMb(C264874Rq r13, AnonymousClass4QW r14, long j) {
        C265164Su[] r9 = this.A08;
        int length = r9.length;
        AnonymousClass4TH[] r5 = new AnonymousClass4TH[length];
        Timeline[] timelineArr = this.A07;
        int A062 = timelineArr[0].A06(r13.A04);
        for (int i = 0; i < length; i++) {
            r5[i] = r9[i].AMb(r13.A00(timelineArr[i].A0C(A062)), r14, j - this.A02[A062][i]);
        }
        return new C295975pF(this.A03, this.A02[A062], r5);
    }

    public final AnonymousClass4RL BQS() {
        C265164Su[] r1 = this.A08;
        if (r1.length > 0) {
            return r1[0].BQS();
        }
        return A09;
    }

    public final void Cnl() {
        RCU rcu = this.A01;
        if (rcu == null) {
            super.Cnl();
            return;
        }
        throw rcu;
    }

    public final void ECj(AnonymousClass4TH r5) {
        C295975pF r52 = (C295975pF) r5;
        int i = 0;
        while (true) {
            C265164Su[] r1 = this.A08;
            if (i < r1.length) {
                C265164Su r2 = r1[i];
                AnonymousClass4TH r12 = r52.A04[i];
                if (r12 instanceof C300565xQ) {
                    r12 = ((C300565xQ) r12).A01;
                }
                r2.ECj(r12);
                i++;
            } else {
                return;
            }
        }
    }

    public final void A0D() {
        super.A0D();
        Arrays.fill(this.A07, (Object) null);
        this.A00 = -1;
        this.A01 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A08);
    }

    public final void A0E(C250823m7 r5) {
        super.A0E(r5);
        int i = 0;
        while (true) {
            C265164Su[] r2 = this.A08;
            if (i < r2.length) {
                A0F(r2[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
