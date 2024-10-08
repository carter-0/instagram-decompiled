package X;

import androidx.fragment.app.Fragment;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.LgB  reason: case insensitive filesystem */
public final class C64683LgB implements 27S, 1wn {
    public final int A00;
    public final Object A01;

    public C64683LgB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        switch (this.A00) {
            case 0:
                return ((AnonymousClass376) obj).A02;
            case 1:
                C64651Lfd lfd = (C64651Lfd) obj;
                0qQ.A0B(lfd, 0);
                AnonymousClass3Q2 A0f = JTT.A0f((K6A) this.A01);
                if (A0f != null) {
                    return 0qQ.A0K(A0f.A35, lfd.A00);
                }
                return false;
            default:
                2Cy r5 = (2Cy) obj;
                0qQ.A0B(r5, 0);
                Set<C61064Jw2> set = (Set) ((C60302Jj0) this.A01).A08.A03.getValue();
                if (set == null) {
                    return false;
                }
                for (C61064Jw2 jw2 : set) {
                    if (2PP.A00(jw2.A02, r5.A00.getId())) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1487369032);
                int A032 = AnonymousClass0fD.A03(1682702686);
                if (((AnonymousClass376) obj).A02) {
                    DbX.A1I((Fragment) this.A01);
                }
                AnonymousClass0fD.A0A(1404522125, A032);
                i = 302428150;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(1322743011);
                int A033 = AnonymousClass0fD.A03(434263913);
                K6A k6a = (K6A) this.A01;
                if (k6a.A0I == AnonymousClass05K.A0N) {
                    K6A.A04(k6a);
                    DbX.A0R(k6a.A0O).A05(new Object());
                } else {
                    C61347K3p k3p = k6a.A0E;
                    if (k3p != null) {
                        k3p.A0C();
                    }
                    JWG jwg = k6a.A08;
                    if (jwg != null) {
                        jwg.A08(AnonymousClass05K.A01);
                    }
                    C59888JbD.A02(k6a.A0O);
                }
                AnonymousClass0fD.A0A(-657358043, A033);
                i = -438100828;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-178056559);
                2Cy r9 = (2Cy) obj;
                int A0D = AnonymousClass7TG.A0D(r9, 406259600);
                User user = r9.A00;
                if (user.A1w()) {
                    2YL r5 = (2YL) this.A01;
                    AnonymousClass7TE.A1Z(new MGD(user, r5, (AnonymousClass4D7) null, 39), C318116oQ.A00(r5));
                }
                AnonymousClass0fD.A0A(893743588, A0D);
                i = -1289530632;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
