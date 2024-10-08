package X;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.RyZ  reason: case insensitive filesystem */
public final class C10813RyZ {
    public final Context A00;
    public final C13619Tdl A01;
    public final 2Mg A02;
    public final C10501RtG A03;
    public final Object A04;
    public final Map A05;
    public final Map A06;
    public final Set A07;

    public C10813RyZ(Context context, 2Mg r6, C10501RtG rtG, Object obj, Map map, Map map2) {
        DbW.A1O(rtG, 4, map2);
        this.A00 = context;
        this.A04 = obj;
        this.A05 = map;
        this.A03 = rtG;
        this.A02 = r6;
        this.A06 = map2;
        LinkedHashSet A0y = DbS.A0y();
        Iterator A16 = DbV.A16(this.A05);
        while (A16.hasNext()) {
            A0y.add(002.A0R("RSA::", AnonymousClass7TE.A18(A16)));
        }
        this.A07 = A0y;
        this.A01 = new C12493SvP(this);
    }
}
