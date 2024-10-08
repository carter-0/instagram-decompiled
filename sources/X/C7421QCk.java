package X;

import android.app.Application;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* renamed from: X.QCk  reason: case insensitive filesystem */
public final class C7421QCk extends C361478gI {
    public static final 11S A0J = new 11S("^\\d{3,4}$");
    public static final Set A0K = C51967G9n.A0t(new String[]{"IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_BINDING_UPDATER", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "UNKNOWN"}, 0);
    public static final 11S A0L = new 11S("^\\d{16}$");
    public long A00;
    public C8946RGo A01;
    public S7C A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public final Application A07;
    public final AnonymousClass2gB A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C;
    public final AnonymousClass0JP A0D;
    public final Integer A0E;
    public final String A0F;
    public final AnonymousClass0eM A0G;
    public final Bundle A0H;
    public final AnonymousClass2gO A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7421QCk(Application application, Bundle bundle) {
        super(application);
        String string;
        0qQ.A0B(application, 1);
        this.A07 = application;
        this.A0H = bundle;
        if (bundle == null || (string = bundle.getString("keyCredentialId")) == null) {
            throw AnonymousClass7TE.A0w("INTENT_KEY_CREDENTIAL_ID is missing from Intent extras");
        }
        this.A0F = string;
        this.A0E = DbV.A0o(bundle, "qplInstanceKey");
        this.A06 = AnonymousClass7TE.A1C();
        this.A09 = JTO.A0K();
        this.A0A = JTO.A0K();
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A08 = A0M;
        this.A0B = new 2Fk("");
        this.A0C = new 2Fk("");
        this.A02 = AnonymousClass2IK.A04.A02();
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A0D = r0;
        this.A0I = new C11651Sdt(this, 25);
        this.A00 = -1;
        this.A00 = C11288SJh.A02.now();
        A0M.A0B(RER.OperationInProgress);
        S7C s7c = this.A02;
        AnonymousClass2gB A012 = AnonymousClass72Y.A01(s7c.A00(), new C73943PmN(string, s7c, 12));
        Pxi.A1A(A012, A0M, new C59103J6l(7, (Object) A012, (Object) this), 35);
        this.A0G = C13346TVt.A00(this, 15);
    }

    private final List A00() {
        AnonymousClass2Fj r0;
        RDS rds = (RDS) this.A0A.A02();
        if (rds != null) {
            int A082 = Pxe.A08(rds, C9978RkX.A00);
            if (A082 == 1) {
                r0 = this.A0B;
            } else if (A082 == 2) {
                r0 = this.A0C;
            } else if (A082 == 3) {
                return 0sr.A1P(new AnonymousClass2Fj[]{this.A0C, this.A0B});
            }
            return AnonymousClass7TE.A1I(r0);
        }
        throw AnonymousClass7TE.A0z("Illegal scenario");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0rl, java.lang.Object] */
    public static final void A02(C7421QCk qCk, long j) {
        ? obj = new Object();
        C7421QCk qCk2 = qCk;
        obj.A00 = qCk.A0D.now();
        long now = C11288SJh.A02.now();
        S7C s7c = qCk2.A02;
        String str = qCk2.A0F;
        Object A022 = qCk2.A0B.A02();
        0qQ.A0A(A022);
        AnonymousClass5A6 A032 = s7c.A03(str, (String) A022, qCk2.A03, false);
        Pxi.A1A(A032, qCk2.A08, new TWP(A032, qCk2, obj, j, now), 35);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.0rl, java.lang.Object] */
    public final void A0E() {
        AnonymousClass2gB r4 = this.A08;
        if (r4.A02() == RER.ValidInput) {
            for (2Fk A0D2 : A00()) {
                r4.A0D(A0D2);
            }
            r4.A0B(RER.OperationInProgress);
            if (this.A0A.A02() != RDS.A02) {
                ? obj = new Object();
                obj.A00 = this.A0D.now();
                String str = (String) this.A0C.A02();
                if (str != null) {
                    AnonymousClass5A6 A022 = this.A02.A02(this.A0F, str, "IAB_AUTOFILL");
                    Pxi.A1A(A022, r4, new C58751Iwy(45, A022, this, obj), 35);
                    return;
                }
                return;
            }
            A02(this, -1);
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Cannot confirm card details from state ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r4.A02(), A1A));
    }

    public static final void A01(C7421QCk qCk) {
        for (2Fk A0E2 : qCk.A00()) {
            qCk.A08.A0E(A0E2, qCk.A0I);
        }
    }
}
