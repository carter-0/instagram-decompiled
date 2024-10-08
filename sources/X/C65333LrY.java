package X;

import android.os.Handler;
import com.instagram.filterkit.filter.intf.IgFilter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.LrY  reason: case insensitive filesystem */
public final class C65333LrY implements C66489MTs {
    public final Object A00 = new Object();
    public final Queue A01 = new ConcurrentLinkedQueue();
    public final C63627L0p A02;
    public final C66525MVd A03;
    public final LNz A04;
    public volatile IgFilter A05;
    public volatile C365358my A06;
    public volatile XBw A07;
    public volatile Integer A08;
    public volatile Integer A09;

    public final LNz C3F() {
        return this.A04;
    }

    public final void EEp() {
        while (true) {
            Queue queue = this.A01;
            if (!queue.isEmpty()) {
                Object remove = queue.remove();
                if (remove != null) {
                    ((Runnable) remove).run();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (this.A06 == null) {
                throw AnonymousClass7TE.A15("Input surface was null.");
            } else if (this.A05 == null) {
                throw AnonymousClass7TE.A0y();
            } else if (this.A07 != null) {
                Integer num = this.A08;
                Integer num2 = this.A09;
                if (!(num2 == null || num == null)) {
                    XBw xBw = this.A07;
                    if (xBw != null) {
                        xBw.EiS(num2.intValue(), num.intValue());
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
                C65163LoS loS = this.A02.A00;
                C364898mC r0 = loS.A0I;
                r0.A02.A00(r0.A01);
                IgFilter igFilter = this.A05;
                if (igFilter != null) {
                    X98 Bnh = this.A03.Bnh();
                    C365358my r1 = this.A06;
                    if (r1 != null) {
                        XBw xBw2 = this.A07;
                        if (xBw2 != null) {
                            igFilter.EEs(Bnh, r1, xBw2);
                            synchronized (this.A00) {
                            }
                            if (!loS.A05 && loS.A02 != null) {
                                loS.A05 = true;
                                Handler handler = loS.A0D;
                                C59804JYx jYx = loS.A0F;
                                jYx.getClass();
                                handler.post(new C65885M3a(jYx));
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0y();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public C65333LrY(C63627L0p l0p, C66525MVd mVd, LNz lNz) {
        AnonymousClass7TG.A1U(mVd, l0p, lNz);
        this.A03 = mVd;
        this.A02 = l0p;
        this.A04 = lNz;
    }
}
