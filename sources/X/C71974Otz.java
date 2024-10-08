package X;

import java.util.Iterator;

/* renamed from: X.Otz  reason: case insensitive filesystem */
public final class C71974Otz implements C232262tL {
    public final float A00;
    public final C3251571g A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C71974Otz otz = (C71974Otz) obj;
        0qQ.A0B(otz, 0);
        return 0qQ.A0K(this.A02, otz.A02);
    }

    public C71974Otz(C3251571g r4, float f) {
        StringBuilder sb = new StringBuilder("emojis:");
        Iterator it = r4.iterator();
        while (it.hasNext()) {
            sb.append(((C317486nL) it.next()).A01);
            sb.append("+");
        }
        this.A02 = DbT.A10(sb);
        this.A01 = r4;
        this.A00 = f;
    }
}
