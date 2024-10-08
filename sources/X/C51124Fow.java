package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fow  reason: case insensitive filesystem */
public final class C51124Fow implements C363768kJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51124Fow(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFailure() {
        05G r3;
        Object hhf;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                r3 = ((C51119For) this.A02).A00;
                hhf = new HHF(AnonymousClass05K.A01, 0sn.A00);
                break;
            default:
                r3 = ((C51120Fos) this.A02).A00;
                0sn r1 = 0sn.A00;
                hhf = new HHH(r1, r1, 0);
                break;
        }
        r3.Epw(hhf);
    }

    public final void onSuccess() {
        05G r3;
        Object hhf;
        switch (this.A00) {
            case 0:
                2Lk r1 = (2Lk) this.A02;
                CallerContext callerContext = 2Lk.A08;
                UserSession userSession = r1.A04;
                C319606qt A012 = C319606qt.A01(userSession);
                String str = userSession.A06;
                A012.A08((Context) r1.A06.get(), DbS.A0O("aymh"), userSession, Boolean.valueOf(((27y) this.A01).A01()), AnonymousClass7TE.A0u(), AnonymousClass05K.A0C, str, true);
                return;
            case 1:
                C51119For forR = (C51119For) this.A02;
                r3 = forR.A00;
                hhf = new HHF(AnonymousClass05K.A00, C51119For.A00((1wM) this.A01, forR));
                break;
            default:
                C51120Fos fos = (C51120Fos) this.A02;
                1wM r12 = (1wM) this.A01;
                ArrayList A002 = C51120Fos.A00(r12, fos);
                List A013 = C51120Fos.A01(fos, A002);
                r3 = fos.A00;
                hhf = new HHH(C51120Fos.A00(r12, fos), A013, A002.size());
                break;
        }
        r3.Epw(hhf);
    }
}
