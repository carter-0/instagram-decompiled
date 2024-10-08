package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eg4  reason: case insensitive filesystem */
public abstract class C48533Eg4 {
    public static final Object A00(C307896Rx r18) {
        0hq A05 = C308206Td.A05(r18);
        FragmentActivity A04 = C308206Td.A04(r18);
        AnonymousClass0iw A08 = C308206Td.A08(r18);
        UserSession A0Y = DbT.A0Y(r18);
        Fragment A0H = DbU.A0H(r18);
        boolean A1Y = DbX.A1Y(A0Y);
        EVP evp = ((C50340FYx) A0Y.A01(C50340FYx.class, new C73662Phb(A0Y, 27))).A00;
        EVP evp2 = EVP.SINGLE;
        if (evp == evp2) {
            C67623Mqv mqv = C67620Mqs.A04;
            C47705EDo eDo = new C47705EDo(DbT.A05(A04), A0H, A04, A05, A08, A0Y, evp2, AnonymousClass7TE.A1C(), A1Y);
            DbV.A1Q(eDo);
            return eDo;
        }
        EVP evp3 = EVP.FAMILY;
        AnonymousClass07i A00 = AnonymousClass07i.A00(A0H);
        if (evp == evp3) {
            new FH4(A0H, A04, A05, A00, A08, A0Y).A0B();
        } else {
            new FH4(A0H, A04, A05, A00, A08, A0Y).A0D(EVP.ALL, A1Y);
        }
        return C60340gF.A00;
    }
}
