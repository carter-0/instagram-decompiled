package X;

import android.app.Application;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* renamed from: X.QCj  reason: case insensitive filesystem */
public final class C7420QCj extends C361478gI {
    public static final Set A0J = C51967G9n.A0t(new String[]{"IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_BINDING_UPDATER", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "UNKNOWN"}, 0);
    public static final 11S A0K = new 11S("^\\d{3,4}$");
    public long A00;
    public C8946RGo A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public final Application A06;
    public final AnonymousClass2gB A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2gO A0C;
    public final AnonymousClass0JP A0D;
    public final S7C A0E;
    public final Integer A0F;
    public final String A0G;
    public final AnonymousClass0eM A0H;
    public final Bundle A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7420QCj(Application application, Bundle bundle) {
        super(application);
        String string;
        0qQ.A0B(application, 1);
        this.A06 = application;
        this.A0I = bundle;
        if (bundle == null || (string = bundle.getString("keyCredentialId")) == null) {
            throw AnonymousClass7TE.A0w("INTENT_KEY_CREDENTIAL_ID is missing from Intent extras");
        }
        this.A0G = string;
        this.A0F = DbV.A0o(bundle, "qplInstanceKey");
        this.A05 = AnonymousClass7TE.A1C();
        this.A08 = JTO.A0K();
        this.A09 = JTO.A0K();
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A07 = A0M;
        this.A0A = new 2Fk("");
        this.A0B = new 2Fk("");
        S7C A022 = AnonymousClass2IK.A04.A02();
        this.A0E = A022;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A0D = r0;
        this.A0C = C11649Sdr.A00(this, 16);
        this.A00 = -1;
        this.A00 = C11288SJh.A02.now();
        A0M.A0B(REL.OperationInProgress);
        AnonymousClass2gB A012 = AnonymousClass72Y.A01(A022.A00(), new C73943PmN(string, A022, 12));
        Pxi.A1A(A012, A0M, new TYA(21, (Object) this, (Object) A012), 3);
        this.A0H = AnonymousClass0eN.A00(0eO.A02, new C13347TVu((Object) this, 45));
    }

    public static final void A01(C7420QCj qCj, long j) {
        C7420QCj qCj2 = qCj;
        long now = qCj.A0D.now();
        long now2 = C11288SJh.A02.now();
        S7C s7c = qCj2.A0E;
        String str = qCj2.A0G;
        String str2 = (String) qCj2.A0A.A02();
        if (str2 == null) {
            str2 = "";
        }
        AnonymousClass5A6 A032 = s7c.A03(str, str2, qCj2.A02, false);
        Pxi.A1A(A032, qCj2.A07, new TWN(A032, qCj2, now, j, now2), 3);
    }

    public final void A0E() {
        AnonymousClass2gB r4 = this.A07;
        if (r4.A02() == REL.ValidInput) {
            for (2Fk A0D2 : A00(this)) {
                r4.A0D(A0D2);
            }
            r4.A0B(REL.OperationInProgress);
            if (this.A09.A02() != RDR.A02) {
                long now = this.A0D.now();
                String str = (String) this.A0B.A02();
                if (str != null) {
                    AnonymousClass5A6 A022 = this.A0E.A02(this.A0G, str, "IAB_AUTOFILL");
                    Pxi.A1A(A022, r4, new C58749Iww(now, this, A022, 1), 3);
                    return;
                }
                return;
            }
            A01(this, -1);
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Cannot confirm card details from state ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r4.A02(), A1A));
    }

    public static final List A00(C7420QCj qCj) {
        AnonymousClass2Fj r0;
        RDR rdr = (RDR) qCj.A09.A02();
        if (rdr != null) {
            int A082 = Pxe.A08(rdr, C9918RjX.A00);
            if (A082 == 1) {
                r0 = qCj.A0A;
            } else if (A082 == 2) {
                r0 = qCj.A0B;
            } else if (A082 == 3) {
                return 0sr.A1P(new AnonymousClass2Fj[]{qCj.A0B, qCj.A0A});
            }
            return AnonymousClass7TE.A1I(r0);
        }
        throw AnonymousClass7TE.A0z("Illegal scenario");
    }
}
