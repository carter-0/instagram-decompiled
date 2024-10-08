package X;

import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class PA2 implements AnonymousClass7X2 {
    public final int A00;
    public final Object A01;

    public PA2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void AAr(MessageIdentifier messageIdentifier, long j) {
        int i;
        int i2;
        if (this.A00 != 0) {
            PA3 pa3 = ((OIQ) this.A01).A0F;
            if (pa3 != null) {
                pa3.AAr(messageIdentifier, j);
                return;
            }
            return;
        }
        OIT oit = (OIT) this.A01;
        String str = oit.A0K;
        if (0qQ.A0K(str, "shared_stack")) {
            String str2 = oit.A03;
            1iA r3 = oit.A01;
            if (str2 != null && r3 != null) {
                C71127OdQ.A06(oit.A05, r3, new C73669Phi(str2, oit, 35));
                return;
            }
            return;
        }
        boolean A0K = 0qQ.A0K(str, "challenges");
        String str3 = oit.A03;
        if (A0K) {
            i = 2131954944;
            i2 = 2131954943;
        } else {
            i = 2131960076;
            i2 = 2131960079;
        }
        if (str3 != null) {
            C358248ab A0X = DbS.A0X(oit.A05);
            A0X.A09(i);
            A0X.A08(i2);
            A0X.A0K(new C71184Of2(oit, str3, false), 2131960075);
            A0X.A0C(C71207OfY.A00);
            AnonymousClass7TH.A0a(A0X, true);
        }
    }

    public final void FJD(View view, AnonymousClass7FU r11, MessageIdentifier messageIdentifier, C62320sa r13, long j) {
        String str;
        int i;
        int i2;
        String str2;
        if (this.A00 != 0) {
            MessageIdentifier messageIdentifier2 = messageIdentifier;
            0qQ.A0B(messageIdentifier, 0);
            OIQ oiq = (OIQ) this.A01;
            PA3 pa3 = oiq.A0F;
            if (pa3 != null) {
                pa3.FJD(view, (AnonymousClass7FU) null, messageIdentifier2, C73915Plq.A00(oiq, messageIdentifier, 40), j);
                return;
            }
            return;
        }
        OIT oit = (OIT) this.A01;
        String str3 = oit.A0K;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1782234803:
                    str2 = "questions";
                    break;
                case -697290194:
                    if (str3.equals("shared_stack")) {
                        String str4 = oit.A03;
                        1iA r3 = oit.A01;
                        if (str4 != null && r3 != null) {
                            C71127OdQ.A06(oit.A05, r3, new C73669Phi(str4, oit, 35));
                            return;
                        }
                        return;
                    }
                    break;
                case 348943746:
                    str2 = "add_yours";
                    break;
                case 531959920:
                    if (str3.equals("challenges")) {
                        str = oit.A03;
                        i = 2131954956;
                        i2 = 2131954955;
                        break;
                    }
                    break;
                case 535918816:
                    if (str3.equals("roll_call")) {
                        oit.A0A.A02(C69497Nmf.UNSEND_RESPONSE, oit.A0D.A0B, oit.A0J.A00);
                        break;
                    }
                    break;
            }
            if (str3.equals(str2)) {
                str = oit.A03;
                i = 2131960078;
                i2 = 2131960079;
                if (str != null) {
                    C358248ab A0X = DbS.A0X(oit.A05);
                    A0X.A09(i);
                    A0X.A08(i2);
                    A0X.A0K(new C71184Of2(oit, str, true), 2131960643);
                    A0X.A0C(C71207OfY.A00);
                    AnonymousClass7TH.A0a(A0X, true);
                    return;
                }
                return;
            }
        }
        String str5 = oit.A03;
        if (str5 != null) {
            oit.A0D.A0C(str5, true, oit.A04);
        }
    }

    public final void FJF(MessageIdentifier messageIdentifier) {
        PA3 pa3;
        if (this.A00 != 0 && (pa3 = ((OIQ) this.A01).A0F) != null) {
            pa3.FJF(messageIdentifier);
        }
    }
}
