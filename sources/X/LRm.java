package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class LRm {
    public static final 1UV A03 = C64457LcG.A00;
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final MSN A01;
    public final Map A02 = AnonymousClass7TE.A1H();

    public final MXS A02(C61002Juy juy) {
        11Z.A06("This operation must be run on UI thread.");
        MA7 ma7 = (MA7) this.A02.get(juy);
        if (ma7 == null) {
            return null;
        }
        Integer num = ma7.A02;
        if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C) {
            return ma7.A05;
        }
        return null;
    }

    public final void A06(MXS mxs, C61002Juy juy) {
        0qQ.A0B(juy, 0);
        A00(this, new MA7(this.A00, this.A01, mxs, AnonymousClass05K.A01), juy);
    }

    public final void A07(C61002Juy juy) {
        0qQ.A0B(juy, 0);
        11Z.A06("This operation must be run on UI thread.");
        MA7 ma7 = (MA7) this.A02.get(juy);
        if (ma7 != null) {
            ma7.A02 = AnonymousClass05K.A01;
            ma7.A01 = -1;
        }
    }

    public final boolean A08() {
        Integer num;
        11Z.A06("This operation must be run on UI thread.");
        Collection<MA7> values = this.A02.values();
        if (values == null || !values.isEmpty()) {
            for (MA7 ma7 : values) {
                if (ma7 != null && ((num = ma7.A02) == AnonymousClass05K.A0N || num == AnonymousClass05K.A0C)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void A00(LRm lRm, MA7 ma7, C61002Juy juy) {
        11Z.A06("This operation must be run on UI thread.");
        lRm.A07(juy);
        lRm.A02.put(juy, ma7);
        ma7.A02 = AnonymousClass05K.A0C;
        ma7.A01 = SystemClock.elapsedRealtime();
        ma7.A03.postDelayed(ma7, ma7.A00);
    }

    public final LMN A01(C61002Juy juy) {
        11Z.A06("This operation must be run on UI thread.");
        MA7 ma7 = (MA7) this.A02.get(juy);
        if (ma7 == null) {
            return LMN.A05;
        }
        return new LMN(SystemClock.elapsedRealtime() - ma7.A01, ma7.A02);
    }

    public final ArrayList A03(1UV r6, Class cls) {
        11Z.A06("This operation must be run on UI thread.");
        Map map = this.A02;
        ArrayList A0f = JTQ.A0f(map);
        Iterator A0v = AnonymousClass7TF.A0v(map);
        while (A0v.hasNext()) {
            MA7 ma7 = (MA7) A0v.next();
            MXS mxs = ma7.A05;
            if (cls.isAssignableFrom(mxs.getClass()) && r6.apply(ma7)) {
                A0f.add(mxs);
            }
        }
        return A0f;
    }

    public final ArrayList A04(Class cls) {
        List AxF;
        ArrayList A032 = A03(A03, cls);
        LinkedHashSet linkedHashSet = new LinkedHashSet(A032.size());
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            MXS mxs = (MXS) it.next();
            if (!(mxs == null || (AxF = mxs.AxF()) == null)) {
                linkedHashSet.addAll(AxF);
            }
        }
        return AnonymousClass7TE.A1D(linkedHashSet);
    }

    public final void A05() {
        11Z.A06("This operation must be run on UI thread.");
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            ((MA7) A0v.next()).run();
        }
    }

    public LRm(MSN msn) {
        this.A01 = msn;
    }
}
