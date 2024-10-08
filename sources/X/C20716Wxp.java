package X;

import java.util.Map;

/* renamed from: X.Wxp  reason: case insensitive filesystem */
public final class C20716Wxp extends 0Yg implements 0sP {
    public static final C20716Wxp A00 = new C20716Wxp();

    public C20716Wxp() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map;
        String str;
        Object obj2;
        C226742hm r4 = (C226742hm) obj;
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C226752hn)) {
            return new 0eP("", C51967G9n.A0j());
        }
        C226752hn r42 = (C226752hn) r4;
        1TY r0 = (1TY) r42.A0F.A00;
        if (r0 == null || (map = r0.A04) == null) {
            map = AnonymousClass2i2.A00((C249903kY) null, (1TY) null, r42).A0C;
        }
        if (map == null || (obj2 = map.get("origin")) == null || (str = obj2.toString()) == null) {
            str = "unknown";
        }
        return AnonymousClass7TF.A0x(str, DbX.A02(C51966G9m.A14(str, C9932Rjl.A00)));
    }
}
