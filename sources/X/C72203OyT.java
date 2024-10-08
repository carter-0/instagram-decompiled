package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OyT  reason: case insensitive filesystem */
public final class C72203OyT implements AnonymousClass0lh {
    public Boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = true;
    public boolean A04;
    public final 1aU A05;
    public final 1aU A06;
    public final 1a8 A07 = new 1a8((C269794fh) null);
    public final UserSession A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0r6 A0H;
    public final AnonymousClass0r6 A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O = C51970G9q.A10(false);
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final AnonymousClass0Ud A0R;
    public final AnonymousClass0Ud A0S;
    public final AnonymousClass0Ud A0T;
    public final C262224Cq A0U;

    public C72203OyT(1aU r11, 1aU r12, UserSession userSession, Integer num) {
        AnonymousClass7TF.A1D(userSession, 1, num);
        this.A08 = userSession;
        this.A05 = r11;
        this.A06 = r12;
        0eO r2 = 0eO.A02;
        this.A0G = C73926Pm6.A01(this, r2, 19);
        this.A0C = C73926Pm6.A01(this, r2, 14);
        this.A09 = C73926Pm6.A01(this, r2, 11);
        this.A0F = C73926Pm6.A01(this, r2, 18);
        this.A0D = C73926Pm6.A01(this, r2, 16);
        this.A0A = C73926Pm6.A01(this, r2, 12);
        this.A0B = C73926Pm6.A01(this, r2, 13);
        AnonymousClass19S A022 = 19E.A02(DbX.A0c(AnonymousClass12T.A00).plus(new AnonymousClass19G((C262204Co) null)));
        this.A0U = A022;
        this.A0E = C73926Pm6.A01(this, r2, 17);
        02z A10 = DbS.A10(C69302Nj3.Unknown);
        this.A0J = A10;
        02z A102 = DbS.A10(C69294Niu.Unknown);
        this.A0N = A102;
        C69295Niv niv = C69295Niv.Unknown;
        02z A103 = DbS.A10(niv);
        this.A0K = A103;
        this.A0I = new MC9(A10, 43);
        this.A0H = new MC9(A10, 44);
        this.A0P = 10b.A03(A10);
        this.A0T = 10b.A03(A102);
        this.A0Q = 10b.A03(A103);
        02z A104 = DbS.A10(niv);
        this.A0L = A104;
        this.A0R = 10b.A03(A104);
        02z A105 = DbS.A10(niv);
        this.A0M = A105;
        this.A0S = 10b.A03(A105);
        C51968G9o.A1P(new MGY(this, (AnonymousClass4D7) null, 49), A022, A10);
        if (((AnonymousClass65E) this.A0C.getValue()).A00()) {
            A03(this, num);
        }
    }

    private final void A01() {
        this.A03 = true;
        this.A0J.Epw(C69302Nj3.FetchError);
        this.A0N.Epw(C69294Niu.FetchError);
        05G r0 = this.A0K;
        C69295Niv niv = C69295Niv.FetchError;
        r0.Epw(niv);
        this.A0L.Epw(niv);
        this.A0M.Epw(niv);
    }

    public static final C69295Niv A00(C69356Njv njv, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C70832ONe) it.next()).A00 == njv) {
                    return C69295Niv.Exists;
                }
            }
        }
        return C69295Niv.DoesNotExist;
    }

    public static final void A03(C72203OyT oyT, Integer num) {
        if (!oyT.A01) {
            AnonymousClass0eM r3 = oyT.A0B;
            C66913Mex A0U2 = C66580MXl.A0U(r3);
            A0U2.A09();
            A0U2.A0D("TRIGGER_SOURCE", C69894Ntw.A00(num));
            oyT.A01 = true;
            oyT.A07.A02(oyT.A05.A0L(new C72027Ov1(1, num, oyT)), PT1.A00);
            C66580MXl.A0U(r3).A08();
        }
        if (oyT.A03) {
            oyT.A04(num);
        }
    }

    private final void A04(Integer num) {
        0KC.A0D("EncryptedBackupsStatusRepository", "start to refresh backup status");
        05G r2 = this.A0J;
        Object value = r2.getValue();
        C69302Nj3 nj3 = C69302Nj3.Loading;
        if (value == nj3) {
            0KC.A0D("EncryptedBackupsStatusRepository", "Repository is already fetching backup status, skipped this refresh");
            return;
        }
        this.A03 = false;
        r2.Epw(nj3);
        this.A0N.Epw(C69294Niu.Loading);
        05G r0 = this.A0K;
        C69295Niv niv = C69295Niv.Loading;
        r0.Epw(niv);
        this.A0L.Epw(niv);
        this.A0M.Epw(niv);
        ((NUZ) this.A09.getValue()).A0H(num, AnonymousClass65A.A02(AnonymousClass65D.A00(this.A08).A00, 36315949947948821L), false);
        this.A07.A02(C72120Owf.A00(this.A05, this, 11), C73016PSz.A00);
    }

    public final void A05(Integer num) {
        0KC.A0D("EncryptedBackupsStatusRepository", "force refresh backup status");
        A04(num);
    }

    public final void A06(0sL r5) {
        AnonymousClass0Ud r3 = this.A0P;
        if (!(r3.getValue() == C69302Nj3.Loading || r3.getValue() == C69302Nj3.Unknown)) {
            AnonymousClass0Ud r2 = this.A0T;
            if (!(r2.getValue() == C69294Niu.Loading || r2.getValue() == C69294Niu.Unknown)) {
                r5.invoke(r3.getValue(), r2.getValue());
                return;
            }
        }
        AnonymousClass7TE.A1Z(new C66171MGi(this, r5, (AnonymousClass4D7) null, 42), DbY.A0r(AnonymousClass12T.A00, 1705805791));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r5 = r7.A0S;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.0sJ r8) {
        /*
            r7 = this;
            X.0Ud r3 = r7.A0P
            java.lang.Object r1 = r3.getValue()
            X.Nj3 r0 = X.C69302Nj3.Loading
            if (r1 == r0) goto L_0x0058
            java.lang.Object r1 = r3.getValue()
            X.Nj3 r0 = X.C69302Nj3.Unknown
            if (r1 == r0) goto L_0x0058
            X.0Ud r6 = r7.A0T
            java.lang.Object r1 = r6.getValue()
            X.Niu r0 = X.C69294Niu.Loading
            if (r1 == r0) goto L_0x0058
            java.lang.Object r1 = r6.getValue()
            X.Niu r0 = X.C69294Niu.Unknown
            if (r1 == r0) goto L_0x0058
            X.0Ud r5 = r7.A0S
            java.lang.Object r0 = r5.getValue()
            X.Niv r2 = X.C69295Niv.Loading
            if (r0 == r2) goto L_0x0058
            java.lang.Object r0 = r5.getValue()
            X.Niv r1 = X.C69295Niv.Unknown
            if (r0 == r1) goto L_0x0058
            X.0Ud r4 = r7.A0R
            java.lang.Object r0 = r4.getValue()
            if (r0 == r2) goto L_0x0058
            java.lang.Object r0 = r4.getValue()
            if (r0 == r1) goto L_0x0058
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r6.getValue()
            java.lang.Object r1 = r5.getValue()
            java.lang.Object r0 = r4.getValue()
            r8.invoke(r3, r2, r1, r0)
            return
        L_0x0058:
            X.12T r1 = X.AnonymousClass12T.A00
            r3 = 0
            r0 = 1705805791(0x65ac87df, float:1.0184418E23)
            X.19S r2 = X.DbY.A0r(r1, r0)
            r1 = 41
            X.MGi r0 = new X.MGi
            r0.<init>(r7, r8, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72203OyT.A07(X.0sJ):void");
    }

    public final boolean A08() {
        int ordinal = ((C69302Nj3) this.A0P.getValue()).ordinal();
        if (ordinal == 4 || ordinal == 2) {
            return true;
        }
        return false;
    }

    public final void onSessionWillEnd() {
        PU8.A00(C72120Owf.A00(this.A05, this, 13), this.A07, this, 12);
        this.A02 = false;
    }

    public static final void A02(C69552Nnw nnw, C72203OyT oyT) {
        String str;
        String str2;
        0KC.A0D("EncryptedBackupsStatusRepository", AnonymousClass7TG.A0m(nnw, "backup status updated: ", AnonymousClass7TE.A1A()));
        if (nnw instanceof N0I) {
            AnonymousClass65C r0 = AnonymousClass65B.A03;
            UserSession userSession = oyT.A08;
            C73926Pm6 pm6 = new C73926Pm6(oyT, 15);
            if (AnonymousClass65D.A00(userSession).A00()) {
                AnonymousClass65B A012 = AnonymousClass65C.A01(userSession);
                AnonymousClass65B.A04(new AnonymousClass9M5(6, A012, pm6), A012.A02);
            }
            int ordinal = ((C69341Njg) ((N0I) nnw).A00).ordinal();
            if (ordinal == 0) {
                oyT.A0J.Epw(C69302Nj3.NoBackupsPresent);
                oyT.A03 = false;
            } else if (ordinal == 2) {
                oyT.A0J.Epw(C69302Nj3.DeviceNotOnboarded);
                oyT.A03 = false;
                Oy5 oy5 = (Oy5) oyT.A0G.getValue();
                if (!oy5.A00 && AnonymousClass65A.A02(C66581MXm.A0S(oy5.A04), 2342158959158955759L)) {
                    boolean z = ((AnonymousClass3HH) oy5.A05.getValue()).A00.getBoolean("EB_DEVICE_ONBOARDED", false);
                    oy5.A00 = true;
                    if (z) {
                        oy5.A02.A02(C72120Owf.A00(oy5.A01, oy5, 20), PTA.A00);
                    }
                }
            } else if (ordinal == 1) {
                oyT.A0J.Epw(C69302Nj3.DeviceOnboarded);
                oyT.A03 = false;
                Oy5 oy52 = (Oy5) oyT.A0G.getValue();
                if (AnonymousClass65A.A02(C66581MXm.A0S(oy52.A04), 2342158959158955759L)) {
                    oy52.A02.A02(C72118Owd.A00(oy52.A01, 0), PTB.A00);
                    0xY AR4 = ((AnonymousClass3HH) oy52.A05.getValue()).A00.AR4();
                    AR4.E5T("EB_DEVICE_ONBOARDED", true);
                    AR4.commit();
                }
            } else if (ordinal == 3) {
                oyT.A01();
            } else {
                throw AnonymousClass7TE.A1K();
            }
            C66913Mex A0U2 = C66580MXl.A0U(oyT.A09);
            if (ordinal == 0) {
                str2 = "NO_BACKUPS_PRESENT";
            } else if (ordinal == 2) {
                str2 = "DEVICE_NOT_ONBOARDED";
            } else if (ordinal == 1) {
                str2 = "DEVICE_ONBOARDED";
            } else if (ordinal == 3) {
                str2 = "FETCH_BACKUP_STATUS_ERROR";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A0U2.A0D("BACKUP_STATUS", str2);
            A0U2.A08();
            1aU A002 = C72120Owf.A00(oyT.A05, oyT, 12);
            1a8 r2 = oyT.A07;
            r2.A02(A002, PT0.A00);
            r2.A02(C72120Owf.A00(oyT.A06, oyT, 14), PT2.A00);
        } else {
            if (nnw instanceof N0J) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("failed to refresh backup status with exception: ");
                str = AnonymousClass7TF.A0i(((N0J) nnw).A00, A1A);
            } else if (nnw == null) {
                str = "Unknown error - empty result";
            } else {
                throw AnonymousClass7TE.A1K();
            }
            0KC.A0D("EncryptedBackupsStatusRepository", str);
            oyT.A01();
            C66580MXl.A0U(oyT.A09).A0A(AnonymousClass05K.A01);
        }
        oyT.A07.A02(C72120Owf.A00(oyT.A05, oyT, 15), PT3.A00);
    }
}
