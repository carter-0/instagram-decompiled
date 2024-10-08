package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

public final class PHQ implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public PHQ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public final void onClick() {
        switch (this.A00) {
            case 0:
                NKG nkg = (NKG) this.A03;
                K8P k8p = (K8P) nkg.A06.getValue();
                C254703su r0 = (C254703su) this.A01;
                String A0g = r0.A0g();
                String str = r0.A1j;
                String str2 = ((DirectThreadKey) nkg.A05.getValue()).A00;
                if (A0g != null && str != null && str2 != null) {
                    KWZ kwz = k8p.A00;
                    AnonymousClass7TE.A1Z(new MEe(kwz, str2, A0g, str, (AnonymousClass4D7) null, 2), kwz.A01);
                    DbY.A1K(1xC.A01, (C310336ap) this.A02);
                    return;
                }
                return;
            case 1:
                C3728292s A002 = C3728192r.A00((UserSession) this.A03);
                Object obj = this.A02;
                synchronized (A002) {
                    AnonymousClass0eM r1 = A002.A04;
                    ArrayList A0U = 00k.A0U(((C363368jb) r1.getValue()).A04);
                    A0U.add(0, obj);
                    ((C363368jb) r1.getValue()).A07(A0U.subList(0, Math.min(4, A0U.size())));
                }
                ((C74585PxY) this.A01).DUo();
                return;
            default:
                C3728292s A003 = C3728192r.A00((UserSession) this.A03);
                Object obj2 = this.A02;
                synchronized (A003) {
                    ((C363368jb) A003.A04.getValue()).A06(obj2);
                }
                TwE twE = ((C67418MnZ) this.A01).A00.A06;
                if (twE != null) {
                    twE.A01();
                    twE.A02();
                    return;
                }
                return;
        }
    }
}
