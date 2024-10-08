package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.common.session.UserSession;

/* renamed from: X.7U9  reason: invalid class name */
public final class AnonymousClass7U9 {
    public final UserSession A00;
    public final AnonymousClass0eK A01;
    public final BizUserInboxState A02;
    public final AnonymousClass0eK A03;
    public final boolean A04;

    public final void A00() {
        C67028Mh1 A002;
        AnonymousClass0eK r1 = this.A01;
        Object obj = r1.get();
        0qQ.A07(obj);
        if (((C333517Zg) obj).C6l().CdE()) {
            Object obj2 = this.A03.get();
            if (obj2 != null) {
                int A1c = ((LinearLayoutManager) obj2).A1c();
                if (A1c != -1) {
                    if (this.A02 == BizUserInboxState.GENERAL_FOLDER_THROTTLED) {
                        Object obj3 = r1.get();
                        0qQ.A07(obj3);
                        AnonymousClass7S7 C6l = ((C333517Zg) obj3).C6l();
                        UserSession userSession = this.A00;
                        if (C6l.C68(2El.A0C(userSession)) == 1 && AnonymousClass78K.A00(userSession)) {
                            return;
                        }
                    }
                    Object obj4 = r1.get();
                    0qQ.A07(obj4);
                    if (((C333517Zg) obj4).C6l().CdE()) {
                        Object obj5 = r1.get();
                        0qQ.A07(obj5);
                        C254793t3 CBU = ((C333517Zg) obj5).C6l().CBU();
                        Object obj6 = r1.get();
                        0qQ.A07(obj6);
                        if (!((C333517Zg) obj6).C6l().CWb() && CBU != null) {
                            Object obj7 = r1.get();
                            0qQ.A07(obj7);
                            boolean CV8 = ((C333517Zg) obj7).C6l().CV8();
                            Object obj8 = r1.get();
                            0qQ.A07(obj8);
                            C333517Zg r0 = (C333517Zg) obj8;
                            if (!CV8) {
                                r0.Clq(CBU, A1c);
                            } else if (r0.C6l().Cdt()) {
                                Object obj9 = r1.get();
                                0qQ.A07(obj9);
                                if (!((C333517Zg) obj9).C6l().CcG() || C272094k5.A03(this.A00)) {
                                    Object obj10 = r1.get();
                                    0qQ.A07(obj10);
                                    ((C333517Zg) obj10).Clq(CBU, A1c);
                                    UserSession userSession2 = this.A00;
                                    C70841ONs oNs = new C70841ONs(userSession2);
                                    2ED r2 = 1bJ.A00(userSession2).A0C;
                                    Object obj11 = r1.get();
                                    0qQ.A07(obj11);
                                    r2.A0N(oNs.A00(), 1, ((C333517Zg) obj11).C6l().CcG());
                                    if (!this.A04 && (A002 = C67026Mgz.A00(userSession2, AnonymousClass61K.DIRECT_THREAD)) != null) {
                                        String str = ((C254763t0) CBU).A00;
                                        0qQ.A0B(str, 0);
                                        A002.A00(str);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public AnonymousClass7U9(UserSession userSession, AnonymousClass0eK r3, AnonymousClass0eK r4, boolean z) {
        this.A00 = userSession;
        this.A04 = z;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = C242003Sf.A00(String.valueOf(AnonymousClass4k9.A00(userSession).A02()));
    }
}
