package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Dko  reason: case insensitive filesystem */
public final class C46761Dko extends 2YL {
    public final 2Fk A00;
    public final XIGIGBoostCallToAction A01;
    public final WGU A02;
    public final UserSession A03;
    public final String A04;
    public final List A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final boolean A09;
    public final C48748EjX A0A;

    public C46761Dko(XIGIGBoostCallToAction xIGIGBoostCallToAction, XIGIGBoostDestination xIGIGBoostDestination, WGU wgu, C48748EjX ejX, UserSession userSession, String str, boolean z) {
        EWU[] ewuArr;
        0sn A1P;
        EWU ewu;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(xIGIGBoostDestination, 2);
        0qQ.A0B(str, 3);
        0qQ.A0B(xIGIGBoostCallToAction, 4);
        AnonymousClass7TF.A1E(wgu, 6, ejX);
        this.A03 = userSession;
        this.A04 = str;
        this.A01 = xIGIGBoostCallToAction;
        this.A09 = z;
        this.A02 = wgu;
        this.A0A = ejX;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR r02 = new 1HR(AnonymousClass3FN.A00);
        this.A06 = r02;
        this.A07 = 0u9.A04(r02);
        02z A10 = DbS.A10(false);
        this.A08 = A10;
        this.A00 = DbT.A0G(A10);
        int ordinal = xIGIGBoostDestination.ordinal();
        if (ordinal == 12) {
            ewuArr = new EWU[3];
            ewuArr[0] = EWU.A06;
            ewu = EWU.A09;
            ewuArr[1] = ewu;
            ewuArr[2] = EWU.A0A;
            A1P = 0sr.A1P(ewuArr);
        } else if (ordinal == 4) {
            ewuArr = new EWU[]{EWU.A06, EWU.A09, EWU.A07, EWU.A0A};
            A1P = 0sr.A1P(ewuArr);
        } else if (ordinal != 10) {
            A1P = 0sn.A00;
        } else {
            ewuArr = new EWU[3];
            ewuArr[0] = EWU.A06;
            ewu = EWU.A08;
            ewuArr[1] = ewu;
            ewuArr[2] = EWU.A0A;
            A1P = 0sr.A1P(ewuArr);
        }
        this.A05 = A1P;
    }
}
