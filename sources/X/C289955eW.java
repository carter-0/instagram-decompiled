package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.5eW  reason: invalid class name and case insensitive filesystem */
public final class C289955eW extends 1XP implements 1XU, AnonymousClass1XV {
    public AnonymousClass9I4 A00 = new AnonymousClass9I4(false, 3);
    public AnonymousClass9IM A01 = new AnonymousClass9IM(2);
    public AnonymousClass9IM A02 = new AnonymousClass9IM(2);
    public C376619Ir A03;
    public BBV A04;
    public GSY A05;
    public C61008Jv7 A06;
    public AnonymousClass3UH A07;
    public C52414GRr A08;
    public GSP A09;
    public C45357Cuz A0A;
    public C289985eZ A0B;
    public C292375iq A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H = null;
    public List A0I;
    public List A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public boolean A0P;
    public boolean A0Q;
    public long A0R = -1;
    public long A0S = -1;

    public final boolean CPJ() {
        return false;
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public static void A00(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C283155Gi) it.next()).A0D = str;
            }
        }
    }

    public final long AjJ() {
        return this.A0R;
    }

    public final long AjP() {
        return this.A0S;
    }

    public final boolean CP6() {
        return this.A0P;
    }

    public final boolean CPt() {
        if (this.A0S != -1) {
            return true;
        }
        return false;
    }

    public final String getNextMaxId() {
        return this.A0G;
    }

    public final void EQE(long j) {
        this.A0R = j;
    }

    public final void EQG(long j) {
        this.A0S = j;
    }
}
