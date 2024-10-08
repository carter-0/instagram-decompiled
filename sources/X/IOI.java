package X;

import com.instagram.clips.intf.ClipsViewerSource;
import java.util.HashMap;

public final class IOI implements C61110lV, AnonymousClass0lh {
    public static final I3O A0C = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public ClipsViewerSource A06 = ClipsViewerSource.UNKNOWN;
    public ClipsViewerSource A07;
    public C15052ULt A08;
    public C15052ULt A09;
    public String A0A;
    public final HashMap A0B = AnonymousClass7TE.A1E();

    private final void A00() {
        this.A04 = 0;
        this.A05 = 0;
        this.A03 = 0;
        this.A0B.clear();
        this.A09 = null;
        this.A08 = null;
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A07 = null;
    }

    public IOI() {
        14i.A05(this);
    }

    public final void A01(C267324bN r12, Long l, int i) {
        Long l2;
        Float CE0;
        String id = r12.getId();
        1Xj r0 = r12.A02;
        if (r0 == null || (CE0 = r0.A0C.CE0()) == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf((long) (CE0.floatValue() * 1000.0f));
        }
        boolean A0F = r12.A0F();
        boolean A0E = r12.A0E();
        boolean A042 = C52076GDw.A04(r12);
        C295365o2 r1 = r12.A01;
        C15052ULt uLt = new C15052ULt(id, l, r1.name(), l2, A0F, A0E, A042);
        if (this.A09 == null && i == 0) {
            this.A09 = uLt;
        }
        if (i > this.A00) {
            this.A02++;
            this.A08 = uLt;
            this.A00 = i;
        }
        if (GDZ.A01(r1)) {
            HashMap hashMap = this.A0B;
            C15052ULt uLt2 = (C15052ULt) C51968G9o.A0x(r12, hashMap);
            if (uLt2 != null) {
                Long l3 = null;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l4 = uLt2.A00;
                    if (l4 != null) {
                        l3 = Long.valueOf(l4.longValue() + longValue);
                    }
                    uLt2.A00 = l3;
                    return;
                }
            }
            hashMap.put(r12.getId(), uLt);
        } else if (r1 == C295365o2.ORGANIC) {
            this.A03++;
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1192590109);
        A00();
        AnonymousClass0fD.A0A(1141088998, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-1505476335);
        A00();
        AnonymousClass0fD.A0A(-2025563562, A032);
    }

    public final void onSessionWillEnd() {
        A00();
        14i.A06(this);
    }
}
