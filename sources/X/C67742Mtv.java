package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mtv  reason: case insensitive filesystem */
public final class C67742Mtv extends 2YL {
    public boolean A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final NUH A03;
    public final 05G A04;
    public final 05G A05 = C51970G9q.A10(false);
    public final 05G A06;
    public final 05G A07;
    public final 1aU A08;
    public final 1a8 A09 = new 1a8((C269794fh) null);

    public C67742Mtv(AnonymousClass12V r10, 1aU r11, UserSession userSession, NUH nuh) {
        AnonymousClass7TF.A1B(userSession, 1, nuh);
        AnonymousClass7TF.A1D(r11, 3, r10);
        this.A02 = userSession;
        this.A03 = nuh;
        this.A08 = r11;
        02z A10 = DbS.A10(new O6B(false));
        this.A06 = A10;
        02z A102 = DbS.A10("");
        this.A07 = A102;
        02z A103 = DbS.A10(new O6A(false));
        this.A04 = A103;
        AnonymousClass0r6 A0o = C66583MXo.A0o(r10, AnonymousClass10H.A00(new C73570Pfy(1, (AnonymousClass4D7) null), A10, A103, A102), 1705805791, 3);
        this.A01 = C66582MXn.A0G(new N2W(new O6A(false), new O6B(false), ""), C318116oQ.A00(this), A0o, AnonymousClass10A.A00);
    }

    public final void onCleared() {
        this.A00 = true;
        this.A09.A01();
    }

    public final void A00() {
        0KC.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "fetchCode starting");
        this.A03.A0B("OTC_DISPLAY_CODE_FETCH_CODE_START");
        this.A04.FIA(new O6A(false));
        this.A06.FIA(new O6B(true));
        1a8 r5 = this.A09;
        1aU r3 = this.A08;
        C73908Plj plj = new C73908Plj(this, 33);
        C74193PqZ pqZ = new C74193PqZ(this, 38);
        0qQ.A0B(r5, 0);
        0rm A11 = C51965G9l.A11();
        C68661NRt nRt = new C68661NRt(plj, A11);
        0no A002 = 0no.A00();
        0qQ.A07(A002);
        A002.A01(nRt, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        r3.A0V(new C72171Oxg(r5, nRt, A002, pqZ, A11));
    }
}
