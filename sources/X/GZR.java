package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class GZR extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GZR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, String str2, AnonymousClass4D7 r11, int i) {
        super(2, r11);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A01 = obj7;
        this.A08 = str;
        this.A09 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.GZR, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Object obj2;
        String str;
        String str2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        AnonymousClass4D7 r10 = r14;
        if (this.A00 != 0) {
            obj3 = this.A02;
            obj6 = this.A03;
            obj7 = this.A04;
            obj8 = this.A05;
            obj5 = this.A06;
            obj2 = this.A07;
            obj4 = this.A01;
            str = this.A08;
            str2 = this.A09;
            i = 1;
        } else {
            obj2 = this.A07;
            str = this.A08;
            str2 = this.A09;
            obj3 = this.A02;
            obj4 = this.A01;
            obj5 = this.A06;
            obj6 = this.A03;
            obj7 = this.A04;
            obj8 = this.A05;
            i = 0;
        }
        return new GZR(obj3, obj6, obj7, obj8, obj5, obj2, obj4, str, str2, r10, i);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        C284945Oz r3;
        Object A0q;
        String str;
        String str2;
        if (this.A00 != 0) {
            0eS.A00(obj);
            C52614GZn gZn = (C52614GZn) this.A02;
            GZF gzf = gZn.A00;
            if (!gzf.A0G.CbH()) {
                r3 = (C284945Oz) this.A03;
                if (C51971G9r.A0B(r3) != -1) {
                    float A002 = gZn.A00(C51971G9r.A0B(r3)) - C51971G9r.A02((C284945Oz) this.A04);
                    long currentTimeMillis = System.currentTimeMillis() - AnonymousClass7TE.A0R(C51966G9m.A17(this.A05));
                    C56542I0t i0t = C56542I0t.A00;
                    List list = (List) this.A06;
                    String A0b = C51974G9v.A0b(list, C51971G9r.A0B(r3));
                    int size = list.size();
                    int A0B = C51971G9r.A0B(r3);
                    double d = (double) currentTimeMillis;
                    if (A002 > 0.0f) {
                        str = "swipe_away_right";
                    } else {
                        str = "swipe_away_left";
                    }
                    UserSession userSession = (UserSession) this.A07;
                    AnonymousClass0iw r10 = (AnonymousClass0iw) this.A01;
                    String str3 = this.A08;
                    String str4 = this.A09;
                    double d2 = d;
                    i0t.A01(r10, userSession, A0b, str, str3, str4, d2, size, A0B);
                    String A0b2 = C51974G9v.A0b(list, gzf.A03());
                    int size2 = list.size();
                    int A032 = gzf.A03();
                    if (A002 > 0.0f) {
                        str2 = "swipe_into_right";
                    } else {
                        str2 = "swipe_into_left";
                    }
                    i0t.A01(r10, userSession, A0b2, str2, str3, str4, d2, size2, A032);
                }
                A0q = new Integer(gzf.A03());
            } else {
                ((C284945Oz) this.A05).Epw(new Long(System.currentTimeMillis()));
                r3 = (C284945Oz) this.A04;
                A0q = C51965G9l.A0q(gZn.A00(gzf.A03()));
            }
            r3.Epw(A0q);
        } else {
            0eS.A00(obj);
            05G r4 = ((C62031KWh) this.A07).A03;
            String str5 = this.A08;
            String str6 = this.A09;
            Boolean bool = (Boolean) this.A02;
            Integer num = (Integer) this.A01;
            List list2 = (List) this.A06;
            Boolean bool2 = (Boolean) this.A03;
            Integer num2 = (Integer) this.A04;
            Integer num3 = (Integer) this.A05;
            do {
                value = r4.getValue();
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
            } while (!r4.AIY(value, new C59678JTj(new C53363Gmn(bool2, num, num2, num3, str5, str6, list2, z), 1)));
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GZR) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
