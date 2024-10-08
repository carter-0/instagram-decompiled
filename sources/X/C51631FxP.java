package X;

import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

/* renamed from: X.FxP  reason: case insensitive filesystem */
public final class C51631FxP implements 02o {
    public final /* synthetic */ FanClubConsiderationViewModel A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C51631FxP(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str, String str2, String str3) {
        this.A00 = fanClubConsiderationViewModel;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }

    public static void A00(L4V l4v, String str) {
        02m r3 = l4v.A00;
        int hashCode = l4v.A01.hashCode();
        r3.markerAnnotate(1062866800, hashCode, "error", str);
        r3.markerEndAtPoint(1062866800, hashCode, 3, str);
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r12) {
        05G r1;
        Object obj2;
        C48177EaJ eaJ = (C48177EaJ) obj;
        if (0qQ.A0K(eaJ, C47865EKl.A00)) {
            FanClubConsiderationViewModel fanClubConsiderationViewModel = this.A00;
            L4V l4v = fanClubConsiderationViewModel.A05;
            l4v.A00.markerPoint(1062866800, l4v.A01.hashCode(), "google_iap_start");
            r1 = fanClubConsiderationViewModel.A0D;
            obj2 = EVA.PURCHASE_STARTED;
        } else {
            if (0qQ.A0K(eaJ, C47863EKj.A00)) {
                A00(this.A00.A05, "init_failed");
            } else if (0qQ.A0K(eaJ, C47861EKh.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel2 = this.A00;
                fanClubConsiderationViewModel2.A04.A0C(fanClubConsiderationViewModel2.A0A, eaJ.toString(), this.A02, this.A03, fanClubConsiderationViewModel2.A0B);
                A00(fanClubConsiderationViewModel2.A05, "google_payment_failed");
                r1 = fanClubConsiderationViewModel2.A0D;
                obj2 = EVA.READY_TO_PURCHASE;
            } else if (0qQ.A0K(eaJ, C47862EKi.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel3 = this.A00;
                L4V l4v2 = fanClubConsiderationViewModel3.A05;
                02m r2 = l4v2.A00;
                int hashCode = l4v2.A01.hashCode();
                r2.markerPoint(1062866800, hashCode, "google_iap_end");
                r2.markerPoint(1062866800, hashCode, "verification_start");
                r1 = fanClubConsiderationViewModel3.A0D;
                obj2 = EVA.PURCHASING;
            } else if (eaJ instanceof C47860EKg) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel4 = this.A00;
                C273004lm r4 = fanClubConsiderationViewModel4.A04;
                String str = fanClubConsiderationViewModel4.A0A;
                C8918RFl rFl = ((C47860EKg) eaJ).A00;
                r4.A0C(str, rFl.A00, this.A02, this.A03, fanClubConsiderationViewModel4.A0B);
                A00(fanClubConsiderationViewModel4.A05, "purchase_failed");
                fanClubConsiderationViewModel4.A0D.Epw(EVA.READY_TO_PURCHASE);
                if (rFl == C8918RFl.SERVER_QUOTING_FAILED) {
                    r1 = fanClubConsiderationViewModel4.A0F;
                    obj2 = EVK.QUOTE_ERROR;
                } else if (!(rFl == C8918RFl.USER_CANCELLED_PAYMENT || rFl == C8918RFl.USER_PAYMENT_FAILED)) {
                    r1 = fanClubConsiderationViewModel4.A0F;
                    obj2 = EVK.VERIFICATION_ERROR;
                }
            } else if (0qQ.A0K(eaJ, C47864EKk.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel5 = this.A00;
                L4V l4v3 = fanClubConsiderationViewModel5.A05;
                l4v3.A00.markerPoint(1062866800, l4v3.A01.hashCode(), "verification_end");
                String str2 = this.A01;
                if (str2 != null) {
                    FanClubConsiderationViewModel.A0A(fanClubConsiderationViewModel5, str2);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            return C60340gF.A00;
        }
        r1.Epw(obj2);
        return C60340gF.A00;
    }
}
