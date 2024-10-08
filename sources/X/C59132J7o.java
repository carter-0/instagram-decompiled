package X;

import androidx.compose.ui.Modifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.J7o  reason: case insensitive filesystem */
public final class C59132J7o extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59132J7o(long j, Object obj, Object obj2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = j;
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                C54820HUb.A00(C51966G9m.A0R(obj3, obj4), (C62320sa) this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                C56230Hux.A01(C51966G9m.A0R(obj3, obj4), (User) this.A04, (0sP) this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                C286575Wy r15 = (C286575Wy) obj3;
                if (C51968G9o.A0C(obj4) == 2 && r15.Bwn()) {
                    r15.Evl();
                    break;
                } else {
                    if (0fL.A02()) {
                        0fL.A01(989080545, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabLayout.<anonymous> (IgdsSegmentedTabLayout.kt:57)");
                    }
                    List list = (List) this.A04;
                    Object obj5 = this.A03;
                    int i = this.A01;
                    long j = this.A02;
                    ArrayList A0r = AnonymousClass7TG.A0r(list);
                    int i2 = 0;
                    for (Object next : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            0sr.A1T();
                            throw AnonymousClass00P.createAndThrow();
                        }
                        C53356Gmg gmg = (C53356Gmg) next;
                        C285245Qk r12 = Modifier.A00;
                        C287625aV A0R = C51965G9l.A0R(4);
                        boolean A1Z = G9t.A1Z(r15, obj5, gmg, 1053692043);
                        Object ECw = r15.ECw();
                        if (A1Z || ECw == AnonymousClass5XT.A00) {
                            ECw = new GNG(22, gmg, obj5);
                            r15.FLL(ECw);
                        }
                        C51965G9l.A1X(r15, false);
                        C53356Gmg gmg2 = gmg;
                        C56616I4r.A01(r15, C287635aW.A05(r12, A0R, (String) null, (C62320sa) ECw, true), gmg2, 0, 0, j, AnonymousClass7TF.A1S(i, i2));
                        A0r.add(C60340gF.A00);
                        i2 = i3;
                    }
                    if (0fL.A02()) {
                        0fL.A00(1380175793);
                        break;
                    }
                }
                break;
        }
        return C60340gF.A00;
    }
}
