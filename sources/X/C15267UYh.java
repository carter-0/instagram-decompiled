package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.UYh  reason: case insensitive filesystem */
public abstract class C15267UYh extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "LeadGenConsumerBaseFragment";
    public C262204Co A00;

    public final U8P A07() {
        AnonymousClass0eM r0;
        if (this instanceof C16011Ums) {
            r0 = ((C16011Ums) this).A09;
        } else if (this instanceof C16010Umr) {
            r0 = ((C16010Umr) this).A00;
        } else if (this instanceof C15998Umf) {
            r0 = ((C15998Umf) this).A0D;
        } else {
            r0 = ((C15997Ume) this).A0B;
        }
        return (U8P) r0.getValue();
    }

    public final void A08() {
        if ((this instanceof C16011Ums) || (this instanceof C16010Umr)) {
            ((C15996Umd) this).A0A();
        } else if (this instanceof C15998Umf) {
            ((C15998Umf) this).A0A(true);
        } else {
            C15997Ume ume = (C15997Ume) this;
            UserSession userSession = ((C16037UnQ) ume.A0B.getValue()).A04;
            Activity A03 = DbT.A03(ume);
            AnonymousClass7TG.A1N(userSession, A03);
            C71342cb.A00(userSession).A06(A03);
            A03.finish();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.UYh, X.07Z, androidx.fragment.app.Fragment] */
    public void onStart() {
        int A02 = AnonymousClass0fD.A02(-1573430619);
        C15267UYh.super.onStart();
        this.A00 = C20592WvV.A00(this, A07().A01, 12);
        AnonymousClass0fD.A09(-1053997832, A02);
    }

    public void onStop() {
        int A02 = AnonymousClass0fD.A02(1920327990);
        C15267UYh.super.onStop();
        this.A00 = JTQ.A0n(this.A00);
        AnonymousClass0fD.A09(1211110477, A02);
    }
}
