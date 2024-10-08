package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.iabadscontext.CheckoutSetupPayload;
import com.facebook.iabadscontext.DisclaimerText;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.facebook.iabadscontext.ReceiverInfo;
import com.facebookpay.offsite.models.message.AvailabilityInitiator$Companion;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QhF  reason: case insensitive filesystem */
public final class C8123QhF extends C12431SuI {
    public String A00;
    public final IABAdsMetaCheckoutPaymentsSDKDataExtension A01;
    public final UserSession A02;
    public final RRI A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final RRI AZu() {
        return this.A03;
    }

    public final String AcA() {
        return "META_CHECKOUT_APP_STYLE_IG";
    }

    public final String AeB() {
        return this.A00;
    }

    public final boolean BNr() {
        return 182.A06(0Tu.A05, this.A02, 36313514696902697L);
    }

    public final boolean BbL() {
        return 182.A06(0Tu.A06, this.A02, 36313514696902697L);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.0bY] */
    public final Integer Bfx() {
        List list;
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = this.A01;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension != null) {
            CheckoutSetupPayload checkoutSetupPayload = iABAdsMetaCheckoutPaymentsSDKDataExtension.A00;
            boolean z = checkoutSetupPayload.A00.A00;
            String str = iABAdsMetaCheckoutPaymentsSDKDataExtension.A01;
            if (z) {
                if (str != null) {
                    ReceiverInfo receiverInfo = checkoutSetupPayload.A01;
                    if (receiverInfo == null || (list = receiverInfo.A00) == null) {
                        list = 0sn.A00;
                    }
                    String A002 = C9649ReT.A00(str);
                    if (A002 != null && A002.length() != 0) {
                        ? obj = new Object();
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Uri A003 = 0cp.A00(obj, AnonymousClass7TE.A18(it));
                            if (A003 != null) {
                                Uri.Builder A0I = Pxe.A0I();
                                A0I.scheme(A003.getScheme());
                                A0I.authority(A003.getAuthority());
                                String A0b = Pxf.A0b(A0I);
                                if (A0b != null) {
                                    A1C.add(A0b);
                                }
                            }
                        }
                        Iterator it2 = A1C.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (A002.equals(next)) {
                                if (next != null) {
                                    return AnonymousClass05K.A0C;
                                }
                            }
                        }
                    }
                }
            }
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public final String BkQ() {
        return (String) AnonymousClass7TE.A14(this.A05);
    }

    public final String BqE() {
        return DbS.A0t(this.A06);
    }

    public final boolean CZt() {
        return AnonymousClass7TF.A1Z(this.A04);
    }

    public C8123QhF(Context context, C340027ka r4, DisclaimerText disclaimerText, IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension, UserSession userSession) {
        String str;
        C13895TjI suK;
        this.A01 = iABAdsMetaCheckoutPaymentsSDKDataExtension;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension != null) {
            str = AvailabilityInitiator$Companion.INITIATOR_UAC;
        } else {
            str = AvailabilityInitiator$Companion.INITIATOR_IAW;
        }
        this.A00 = str;
        this.A02 = userSession;
        this.A04 = AnonymousClass0eN.A01(TVT.A00);
        if (disclaimerText != null) {
            suK = new C12434SuL(context, disclaimerText);
        } else {
            suK = new C12433SuK(context);
        }
        this.A03 = new C8121QhD(context, r4, suK, userSession);
        this.A05 = C58675Ivk.A00(this, 31);
        this.A06 = C58675Ivk.A00(this, 32);
    }
}
