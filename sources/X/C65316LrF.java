package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LrF  reason: case insensitive filesystem */
public final class C65316LrF implements AnonymousClass3YT {
    public final CharSequence Bqi(Context context, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, AnonymousClass3W1 r8) {
        0qQ.A0B(r6, 3);
        AnonymousClass3YD r2 = AnonymousClass3YC.A00;
        AnonymousClass57K A02 = r2.A02(r6);
        if (A02 == null || A02.ordinal() != 6) {
            return null;
        }
        return r2.A04(r6);
    }

    public final CharSequence C4o(Context context, UserSession userSession, 1Xj r9, AnonymousClass3W1 r10) {
        Object obj;
        C46308DUl Bg2;
        DTJ Axv;
        DTJ Axv2;
        DTJ Axv3;
        String AcE;
        0qQ.A0B(context, 0);
        0qQ.A0B(r9, 1);
        AnonymousClass3YD r5 = AnonymousClass3YC.A00;
        AnonymousClass57K A02 = r5.A02(r9);
        if (A02 == null || A02.ordinal() != 6) {
            return AnonymousClass7TE.A16(context, 2131976619);
        }
        String A04 = r5.A04(r9);
        C46308DUl Bg22 = r9.A0C.Bg2();
        String str = null;
        if (Bg22 == null || (Axv3 = Bg22.Axv()) == null || (AcE = Axv3.AcE()) == null) {
            List A01 = AnonymousClass3YD.A01(r9);
            if (A01 != null) {
                Iterator it = A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    C46308DUl Bg23 = ((1Xj) obj).A0C.Bg2();
                    if (Bg23 != null && (Axv2 = Bg23.Axv()) != null && Axv2.AcE() != null) {
                        break;
                    }
                }
                1Xj r1 = (1Xj) obj;
                if (!(r1 == null || (Bg2 = r1.A0C.Bg2()) == null || (Axv = Bg2.Axv()) == null)) {
                    str = Axv.AcE();
                }
            }
        } else {
            str = AcE;
        }
        return C63263Ku8.A00(context, A04, str, r5.A06(r9));
    }

    public final boolean Et3(1Xj r2, AnonymousClass3W1 r3, int i) {
        return true;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean EtS() {
        return false;
    }

    public final /* synthetic */ List Bqk(1Xj r2, AnonymousClass3W1 r3) {
        return null;
    }

    public final /* synthetic */ boolean Et2(UserSession userSession, 1Xj r3) {
        return false;
    }

    public final /* synthetic */ String BSq(Context context, 1Xj r3, AnonymousClass3W1 r4) {
        return null;
    }

    public final /* synthetic */ boolean Et1(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        return false;
    }
}
