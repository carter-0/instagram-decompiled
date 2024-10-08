package X;

import android.app.Application;
import android.os.Bundle;
import com.fbpay.w3c.CardDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QCi  reason: case insensitive filesystem */
public final class C7419QCi extends C361478gI {
    public static final 11S A0D = new 11S("^\\d{3,4}$");
    public long A00;
    public String A01;
    public List A02;
    public final AnonymousClass2gB A03;
    public final AnonymousClass2Fj A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06;
    public final AnonymousClass0JP A07;
    public final S7C A08;
    public final Integer A09;
    public final List A0A;
    public final Application A0B;
    public final Bundle A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7419QCi(Application application, Bundle bundle) {
        super(application);
        ArrayList parcelableArrayList;
        0qQ.A0B(application, 1);
        this.A0B = application;
        this.A0C = bundle;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("cardDetailsList")) == null) {
            throw AnonymousClass7TE.A0w("INTENT_KEY_CARD_DETAILS_LIST is missing from Intent extras");
        }
        this.A0A = parcelableArrayList;
        this.A09 = DbV.A0o(bundle, "qplInstanceKey");
        this.A02 = AnonymousClass7TE.A1C();
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A04 = A0K;
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A03 = A0M;
        this.A06 = new 2Fk("");
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A05 = A0K2;
        S7C A022 = AnonymousClass2IK.A04.A02();
        this.A08 = A022;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A07 = r0;
        this.A00 = -1;
        this.A00 = C11288SJh.A02.now();
        A0M.A0B(REK.OperationInProgress);
        if (DbT.A1b(parcelableArrayList)) {
            A0M.A0B(REK.InvalidInput);
            this.A01 = A022.A04();
            A0K2.A0B(00k.A0I(parcelableArrayList));
            A00(this);
            return;
        }
        A0M.A0B(REK.Error);
        A0K.A0B(new C7606QOo((CardDetails) null, (C11216SFq) null, "error_card_not_found", -1, -1, -1));
    }

    public static final void A00(C7419QCi qCi) {
        C11649Sdr A002 = C11649Sdr.A00(qCi, 12);
        AnonymousClass2gB r2 = qCi.A03;
        r2.A0E(qCi.A06, A002);
        r2.A0E(qCi.A05, C11649Sdr.A00(qCi, 13));
    }

    public final void A0E() {
        String str;
        AnonymousClass2gB r5 = this.A03;
        if (r5.A02() == REK.ValidInput) {
            AnonymousClass2Fj r2 = this.A06;
            r5.A0D(r2);
            AnonymousClass2Fj r1 = this.A05;
            r5.A0D(r1);
            r5.A0B(REK.OperationInProgress);
            long now = this.A07.now();
            long now2 = C11288SJh.A02.now();
            CardDetails cardDetails = (CardDetails) r1.A02();
            if (cardDetails != null && (str = cardDetails.A08) != null) {
                S7C s7c = this.A08;
                String str2 = (String) r2.A02();
                if (str2 == null) {
                    str2 = "";
                }
                AnonymousClass5A6 A032 = s7c.A03(str, str2, this.A01, false);
                Pxi.A1A(A032, r5, new C58763IxA(1, now2, now, A032, this), 1);
                return;
            }
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Cannot confirm card details from state ");
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0i(r5.A02(), A1A));
    }
}
