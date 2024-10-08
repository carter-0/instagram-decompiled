package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Kj  reason: invalid class name and case insensitive filesystem */
public final class C354028Kj implements C354038Kk {
    public int A00 = -1;
    public Integer A01 = AnonymousClass05K.A0N;
    public List A02;
    public float A03;
    public int A04;
    public int A05;
    public final ArrayList A06 = new ArrayList();
    public final UserSession A07;
    public final C354028Kj A08 = this;
    public final C353998Kg A09;
    public final C354008Kh A0A;

    public final void AKm(C354098Kq r5) {
        0qQ.A0B(r5, 0);
        synchronized (this.A08) {
            List list = this.A02;
            r5.A01 = ((Number) list.get(this.A04)).intValue();
            r5.A02 = ((Number) list.get(this.A05)).intValue();
            r5.A00 = this.A03;
            Integer num = this.A01;
            0qQ.A0B(num, 0);
            r5.A03 = num;
        }
    }

    public final void DC5(Integer num, float f) {
        0qQ.A0B(num, 0);
        synchronized (this.A08) {
            this.A03 = f;
            this.A01 = num;
            if (num == AnonymousClass05K.A0C) {
                int i = this.A05;
                this.A04 = i;
                this.A0A.A00(i);
                int Au0 = Au0();
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass8KA) it.next()).Dpt(Au0);
                }
            }
        }
        this.A09.EEp();
    }

    public final void DSQ(Integer num, float f) {
        0qQ.A0B(num, 0);
        synchronized (this.A08) {
            if (num == AnonymousClass05K.A00) {
                this.A05 = (this.A04 + 1) % this.A02.size();
            } else {
                List list = this.A02;
                this.A05 = ((this.A04 - 1) + list.size()) % list.size();
            }
            this.A01 = num;
            this.A03 = f;
        }
        this.A09.EEp();
    }

    public final void A00() {
        int i = this.A00;
        if (i >= 0) {
            this.A02.remove(i);
            this.A00 = -1;
        }
        this.A02.add(this.A04, 1112);
        this.A00 = this.A04;
    }

    public final int Au0() {
        int intValue;
        synchronized (this.A08) {
            intValue = ((Number) this.A02.get(this.A04)).intValue();
        }
        return intValue;
    }

    public final void ETV(int i) {
        int indexOf = this.A02.indexOf(Integer.valueOf(i));
        if (indexOf >= 0) {
            synchronized (this.A08) {
                this.A04 = indexOf;
                this.A05 = indexOf;
                this.A01 = AnonymousClass05K.A0N;
                this.A03 = 0.0f;
            }
            this.A09.EEp();
        }
    }

    public final void onStart() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((AnonymousClass8KA) it.next()).Dpx();
        }
    }

    public C354028Kj(UserSession userSession, C353998Kg r3, C354008Kh r4, List list) {
        this.A09 = r3;
        this.A02 = list;
        this.A0A = r4;
        this.A07 = userSession;
    }
}
