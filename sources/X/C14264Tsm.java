package X;

import android.content.Context;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Tsm  reason: case insensitive filesystem */
public final class C14264Tsm implements X98 {
    public final C14263Tsl A00;
    public final StringBuilder A01 = new StringBuilder();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Set A04 = new HashSet();
    public final Set A05 = new HashSet();
    public final Set A06 = new HashSet();
    public final Set A07 = new HashSet();

    public final void AHI(X4B x4b) {
        this.A00.A00(x4b);
        this.A06.remove(x4b);
        Set set = this.A04;
        if (set.contains(x4b)) {
            x4b.AHH(this);
        }
        set.remove(x4b);
    }

    public final boolean Bnj(X4B x4b) {
        return this.A04.contains(x4b);
    }

    public final UnifiedFilterManager CBT() {
        throw new UnsupportedOperationException();
    }

    public final void Clu(X4B x4b) {
        this.A04.add(x4b);
    }

    public final Tt4 CsV(int i, int i2) {
        IllegalStateException illegalStateException;
        Tt4 tt4;
        C14263Tsl tsl = this.A00;
        synchronized (tsl) {
            StringBuilder sb = tsl.A01;
            sb.setLength(0);
            sb.append(i);
            String A0t = Pxg.A0t("x", sb, i2);
            0qQ.A07(A0t);
            Map map = tsl.A03;
            if (map.get(A0t) == null) {
                map.put(A0t, new LinkedList());
            }
            Object obj = map.get(A0t);
            if (obj == null) {
                illegalStateException = AnonymousClass7TE.A0y();
            } else if (((List) obj).isEmpty()) {
                tt4 = new Tt4(i, i2);
            } else {
                Object obj2 = map.get(A0t);
                if (obj2 != null) {
                    tt4 = (Tt4) ((List) obj2).remove(0);
                } else {
                    illegalStateException = AnonymousClass7TE.A0y();
                }
            }
            throw illegalStateException;
        }
        this.A07.add(tt4);
        StringBuilder sb2 = this.A01;
        sb2.setLength(0);
        sb2.append(i);
        String A0t2 = Pxg.A0t("x", sb2, i2);
        0qQ.A07(A0t2);
        Map map2 = this.A02;
        C66580MXl.A1T(A0t2, map2, Math.max(C51973G9u.A07(A0t2, map2) - 1, 0));
        return tt4;
    }

    public final void EB2(X4B x4b, C367418qi r9) {
        int i;
        int i2;
        int i3 = 0;
        if (0u4.A00(this.A07).remove(r9)) {
            0qQ.A0C(r9, "null cannot be cast to non-null type com.instagram.filterkit.surface.IntermediateSurface");
            Tt4 tt4 = (Tt4) r9;
            C14263Tsl tsl = this.A00;
            synchronized (tsl) {
                0qQ.A0B(tt4, 0);
                i = tt4.A03;
                i2 = tt4.A01;
                StringBuilder sb = tsl.A01;
                sb.setLength(0);
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                String obj = sb.toString();
                0qQ.A07(obj);
                Object obj2 = tsl.A03.get(obj);
                if (obj2 != null) {
                    ((List) obj2).add(tt4);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            StringBuilder sb2 = this.A01;
            sb2.setLength(0);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            String obj3 = sb2.toString();
            0qQ.A07(obj3);
            Map map = this.A02;
            Number number = (Number) map.get(obj3);
            if (number != null) {
                i3 = number.intValue();
            }
            map.put(obj3, Integer.valueOf(i3 + 1));
            this.A05.add(obj3);
        }
    }

    public C14264Tsm(Context context) {
        this.A00 = new C14263Tsl(context);
    }
}
