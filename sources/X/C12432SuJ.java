package X;

import android.content.Context;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SuJ  reason: case insensitive filesystem */
public final class C12432SuJ implements C13864Til {
    public S7g A00;
    public boolean A01;
    public final UserSession A02;
    public final Boolean A03 = AnonymousClass7TE.A0u();
    public final RRI A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final PaymentRequest AMa() {
        return null;
    }

    public final void Ci2() {
    }

    public final void E33(Map map) {
    }

    public final RRI AZu() {
        return this.A04;
    }

    public final /* synthetic */ Set AbC(PaymentRequest paymentRequest) {
        return JTP.A0y(C8881RDy.CARDS);
    }

    public final String AcA() {
        return "META_PAY_APP_STYLE_IG";
    }

    public final String AeB() {
        return null;
    }

    public final S7g An6() {
        return this.A00;
    }

    public final boolean B17() {
        return false;
    }

    public final boolean B1C() {
        return true;
    }

    public final boolean B1I() {
        return false;
    }

    public final boolean B7H() {
        return false;
    }

    public final boolean BNr() {
        return 182.A06(0Tu.A05, this.A02, 36313514696116261L);
    }

    public final boolean BbL() {
        return 182.A06(0Tu.A06, this.A02, 36313514696116261L);
    }

    public final boolean Bfw() {
        return true;
    }

    public final /* synthetic */ Integer Bfx() {
        return AnonymousClass05K.A00;
    }

    public final String BkQ() {
        return (String) AnonymousClass7TE.A14(this.A06);
    }

    public final boolean BnP() {
        return 182.A06(0Tu.A05, this.A02, 36313514696968234L);
    }

    public final String BqE() {
        return DbS.A0t(this.A07);
    }

    public final boolean Bub() {
        return this.A01;
    }

    public final boolean Buf() {
        return true;
    }

    public final boolean C2I() {
        return false;
    }

    public final Boolean CPY() {
        return this.A03;
    }

    public final boolean CZt() {
        return AnonymousClass7TF.A1Z(this.A05);
    }

    public final void Ekm(boolean z) {
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S7g, java.lang.Object] */
    public final void clear() {
        PaymentRequest paymentRequest = this.A00.A02;
        ? obj = new Object();
        obj.A02 = paymentRequest;
        obj.A05 = null;
        obj.A04 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A00 = null;
        obj.A03 = null;
        obj.A01 = null;
        this.A00 = obj;
    }

    public final String getProductId() {
        return "742725890006429";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S7g, java.lang.Object] */
    public C12432SuJ(Context context, C340027ka r4, UserSession userSession) {
        ? obj = new Object();
        obj.A02 = null;
        obj.A05 = null;
        obj.A04 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A00 = null;
        obj.A03 = null;
        obj.A01 = null;
        this.A00 = obj;
        this.A02 = userSession;
        this.A05 = AnonymousClass0eN.A01(TVU.A00);
        this.A04 = new C8120QhC(context, r4);
        this.A06 = C58675Ivk.A00(this, 33);
        this.A07 = C58675Ivk.A00(this, 34);
    }

    public static boolean A00() {
        if (182.A06(0Tu.A05, AnonymousClass2E0.A0D().A00, 36313428797884376L)) {
            return false;
        }
        AnonymousClass2E0.A0D();
        return true;
    }

    public final boolean B13() {
        return 182.A06(0Tu.A06, C11431STx.A00(), 36313428797622230L);
    }

    public final Boolean B1A() {
        Boolean A0R = AnonymousClass7TF.A0R(0Tu.A06, C11431STx.A00(), 36321902767253329L);
        0qQ.A0A(A0R);
        return A0R;
    }

    public final Boolean B1E() {
        return Boolean.valueOf(A00());
    }

    public final boolean B1F() {
        return A00();
    }

    public final boolean B1G() {
        return A00();
    }

    public final List Bb2(C10857RzI rzI) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (rzI.A00 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.BILLING_ADDRESS);
        }
        if (AnonymousClass7TE.A1b(rzI.A0C)) {
            A1C.add(PaymentDetailChangeTypes$Companion.OFFERS);
        }
        if (rzI.A0A != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID);
        }
        if (rzI.A01 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS);
        }
        if (rzI.A06 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.FULFILLMENT_OPTION_ID);
        }
        if (rzI.A09 != null) {
            A1C.add(PaymentDetailChangeTypes$Companion.PICKUP_ZIP_CODE);
        }
        return A1C;
    }

    public final boolean CQ6() {
        AnonymousClass2E0.A0D();
        return false;
    }

    public final Boolean EsL(String str, AnonymousClass4D7 r3, C62320sa r4) {
        return AnonymousClass7TE.A0u();
    }
}
