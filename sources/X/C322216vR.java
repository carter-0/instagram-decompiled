package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6vR  reason: invalid class name and case insensitive filesystem */
public final class C322216vR {
    public int A00;
    public int A01;
    public int A02;
    public UserSession A03;
    public C238133Ar A04;
    public C322256vV A05;
    public long A06;
    public final C2366634p A07;
    public final C2366634p A08;
    public final C322226vS A09 = new Object();
    public final C322236vT A0A;
    public final UserDetailFragment A0B;
    public final C321606uS A0C;
    public final Map A0D = new HashMap();

    public final void A00(1Xj r10, int i, boolean z) {
        C319766rB r4;
        int A092;
        int i2;
        C294255m9 A0B2 = this.A0B.A0z.A0B();
        if (A0B2 != null) {
            int i3 = A0B2.A00.A00;
            Map map = this.A0D;
            Integer valueOf = Integer.valueOf(i3);
            if (map.containsKey(valueOf)) {
                r4 = (C319766rB) map.get(valueOf);
            } else {
                r4 = new C319766rB(this);
                map.put(valueOf, r4);
            }
            Set set = r4.A01;
            if (set.isEmpty()) {
                int i4 = 0;
                for (int i5 = 0; i5 <= this.A04.BLQ(); i5++) {
                    if (this.A04.AnE(i5) != null && this.A04.AnE(i5).getId() == R.id.media_set_row_content_identifier) {
                        i4++;
                    }
                }
                this.A01 = i4 - 1;
            }
            int i6 = this.A01;
            if (i6 == -1 && (i2 = this.A02) != 0) {
                i6 = (i2 / 3) - 1;
                this.A01 = i6;
            }
            long j = this.A06;
            if (j > 0) {
                this.A01 = (int) Math.min(j, (long) i6);
            }
            set.add(r10.getId());
            C322236vT r3 = this.A0A;
            UserDetailFragment userDetailFragment = r3.A03.A0B;
            C294255m9 A0B3 = userDetailFragment.A0z.A0B();
            if (A0B3 == null) {
                A092 = -1;
            } else {
                A092 = userDetailFragment.A0z.A09(A0B3.A00, r10.getId());
            }
            Iterator it = r3.A05.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C319776rC r5 = (C319776rC) ((Map.Entry) it.next()).getValue();
                C322226vS r2 = r5.A02;
                if (A092 >= r2.A01 && A092 <= r2.A00) {
                    Map map2 = r5.A03;
                    if (!map2.containsKey(r10.getId())) {
                        r10.getId();
                        r5.A01.now();
                        map2.put(r10.getId(), new Object());
                    }
                    r3.A00.post(r3.A04);
                }
            }
            if (!z) {
                C321606uS r52 = this.A0C;
                int i7 = r52.A00;
                if (i7 != 0) {
                    02m r22 = r52.A01;
                    r22.markerAnnotate(i7, TraceFieldType.FailureReason, "render_fail");
                    r22.markerEnd(r52.A00, 3);
                }
                this.A08.A01();
            }
            Map map3 = r4.A00;
            Integer valueOf2 = Integer.valueOf(i);
            if (map3.containsKey(valueOf2)) {
                ((Set) map3.get(valueOf2)).add(r10.getId());
            } else {
                HashSet hashSet = new HashSet();
                hashSet.add(r10.getId());
                map3.put(valueOf2, hashSet);
            }
            if (map3.containsKey(valueOf2) && i >= this.A00 && i <= this.A01) {
                int i8 = this.A02 / 3;
                if (i != i8 && ((Set) map3.get(valueOf2)).size() < 3) {
                    return;
                }
                if (i != i8 || ((Set) map3.get(valueOf2)).size() >= this.A02 % 3) {
                    int i9 = this.A00;
                    while (i9 <= this.A01) {
                        if (!map3.containsKey(Integer.valueOf(i9))) {
                            return;
                        }
                        if (i9 < i8 && ((Set) map3.get(Integer.valueOf(i9))).size() < 3) {
                            return;
                        }
                        if (i9 != i8 || ((Set) map3.get(Integer.valueOf(i9))).size() >= this.A02 % 3) {
                            i9++;
                        } else {
                            return;
                        }
                    }
                    C321606uS r32 = this.A0C;
                    int i10 = r32.A00;
                    if (i10 != 0) {
                        02m r23 = r32.A01;
                        r23.markerPoint(i10, "grid_render_end");
                        int i11 = r32.A00;
                        if (i11 != 0) {
                            r23.markerEnd(i11, 2);
                            r32.A00 = 0;
                        }
                    }
                    this.A08.A05();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6vS, java.lang.Object] */
    public C322216vR(C2366634p r2, C2366634p r3, UserSession userSession, UserDetailFragment userDetailFragment, C321606uS r6, long j) {
        this.A03 = userSession;
        this.A0A = new C322236vT(this, this);
        this.A08 = r2;
        this.A07 = r3;
        this.A0B = userDetailFragment;
        this.A0C = r6;
        this.A05 = new C322256vV(this);
        this.A06 = j;
    }
}
