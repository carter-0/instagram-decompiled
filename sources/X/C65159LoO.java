package X;

import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LoO  reason: case insensitive filesystem */
public final class C65159LoO implements MV7 {
    public final /* synthetic */ LBE A00;

    public final /* synthetic */ void Ddi() {
    }

    public final /* synthetic */ void Ddn() {
    }

    public final /* synthetic */ void Dgg(Map map) {
    }

    public C65159LoO(LBE lbe) {
        this.A00 = lbe;
    }

    public final void Ddl(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LEA lea = (LEA) it.next();
            boolean A1W = AnonymousClass7TF.A1W(lea.A07, AnonymousClass05K.A00);
            if (lea.A03.A02 == C62461KgB.UPLOAD) {
                KH4 kh4 = this.A00.A02.A00;
                if (A1W) {
                    UserSession userSession = kh4.A01;
                    27p.A01(userSession).A04.A0A();
                    Point point = lea.A01;
                    point.getClass();
                    L6I l6i = new L6I(lea, point.x, point.y);
                    28K.A00(userSession).A0B(kh4.A00.getApplicationContext());
                    MTY mty = kh4.A04;
                    if (mty != null) {
                        mty.Dvn(l6i);
                    }
                } else {
                    String obj = lea.toString();
                    0kD.A0G("Stories camera upload fail", obj, lea.A06);
                    27p.A01(kh4.A01).A04.A0B(obj);
                    MTY mty2 = kh4.A04;
                    if (mty2 != null) {
                        mty2.Dvm();
                    }
                }
            }
        }
    }
}
