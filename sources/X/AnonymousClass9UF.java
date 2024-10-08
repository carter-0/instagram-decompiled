package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9UF  reason: invalid class name */
public final class AnonymousClass9UF implements C41843B2y {
    public final /* synthetic */ AnonymousClass8LU A00;

    public AnonymousClass9UF(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void DFu(String str) {
        AnonymousClass8LU r4 = this.A00;
        UserSession userSession = r4.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        AtomicLong atomicLong = A01.A0F;
        atomicLong.set(A01.A0K.A06(CancelReason.USER_CANCELLED, str, 838607486, atomicLong.get()));
        AnonymousClass7TE.A0n(userSession).A04(r4.A0w, 002.A0R("first frame: ", str));
    }

    public final void DFv(String str, String str2, Throwable th) {
        String str3;
        AnonymousClass8LU r3 = this.A00;
        UserSession userSession = r3.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        if (th.getMessage() != null) {
            str3 = th.getMessage();
        } else {
            str3 = "error";
        }
        0qQ.A0B(str3, 0);
        29E r6 = A01.A0K;
        AtomicLong atomicLong = A01.A0F;
        r6.A09(atomicLong.get(), AnonymousClass000.A00(738), str);
        atomicLong.set(r6.A07(str3, "", 838607486, atomicLong.get()));
        AnonymousClass7TE.A0n(userSession).A07(r3.A0w, String.format((Locale) null, "first frame failed: %s", new Object[]{th.getMessage()}), str2, str);
    }

    public final void Dff(Throwable th, String str) {
        AnonymousClass8LU r7 = this.A00;
        UserSession userSession = r7.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        29E r2 = A01.A0K;
        AtomicLong atomicLong = A01.A0F;
        long j = atomicLong.get();
        String A002 = AnonymousClass000.A00(4195);
        r2.A0C(A002, j);
        long j2 = atomicLong.get();
        String message = th.getMessage();
        if (message == null) {
            message = "error";
        }
        r2.A09(j2, A002, message);
        long j3 = atomicLong.get();
        String A003 = AnonymousClass000.A00(738);
        String str2 = str;
        r2.A09(j3, A003, str2);
        long j4 = atomicLong.get();
        String A004 = 0Jc.A00(th);
        0qQ.A07(A004);
        r2.A09(j4, "stack_trace", 00R.A03(A004, IgNetworkConsentStorage.MAX_ENTRIES));
        29L A0n = AnonymousClass7TE.A0n(userSession);
        C2801950r r72 = r7.A0w;
        0qQ.A0B(r72, 0);
        if (A0n.A05.Aji() == C279294yP.CLIPS && r72 == C2801950r.CLIPS) {
            29E r73 = A0n.A04;
            r73.A09(A0n.A01, A003, str2);
            long j5 = A0n.A01;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "empty";
            }
            r73.A09(j5, "error_details", message2);
            long j6 = A0n.A01;
            String A005 = 0Jc.A00(th);
            0qQ.A07(A005);
            r73.A09(j6, "stack_trace", 00R.A03(A005, IgNetworkConsentStorage.MAX_ENTRIES));
            A0n.A01 = r73.A05("first_frame_retry", 585185740, A0n.A01, A0n.A03);
        }
    }

    public final void Dwn() {
        AnonymousClass8LU r2 = this.A00;
        UserSession userSession = r2.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        C2801950r r4 = r2.A0w;
        String str = r2.A05.A02;
        28D r22 = r2.A0Y;
        AnonymousClass7TF.A1B(r4, 0, r22);
        AnonymousClass8A2.A00(r22, A01, r4, str, "init_vvp", "4");
        AnonymousClass7TE.A0n(userSession).A05(r4, "vvp_created");
    }

    public final void Dwo() {
        AnonymousClass8LU r2 = this.A00;
        UserSession userSession = r2.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        C2801950r r4 = r2.A0w;
        String str = r2.A05.A02;
        28D r22 = r2.A0Y;
        AnonymousClass7TF.A1B(r4, 0, r22);
        AnonymousClass8A2.A00(r22, A01, r4, str, "init_vvp_mdm", "3");
        AnonymousClass7TE.A0n(userSession).A05(r4, "vvp_media_decoder_manager_created");
    }

    public final void Dwp() {
        AnonymousClass8LU r1 = this.A00;
        AnonymousClass7TE.A0n(r1.A0c).A05(r1.A0w, "vvp_state_preparing");
    }

    public final void Dwq() {
        AnonymousClass8LU r1 = this.A00;
        AnonymousClass7TE.A0n(r1.A0c).A05(r1.A0w, "vvp_state_ready");
    }

    public final void onFirstFrameRendered() {
        11Z.A02(new C40785AjH(this));
        AnonymousClass8LU r6 = this.A00;
        UserSession userSession = r6.A0c;
        AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
        AtomicLong atomicLong = A01.A0F;
        atomicLong.set(A01.A0K.A02(838607486, atomicLong.get()));
        29L A0n = AnonymousClass7TE.A0n(userSession);
        C2801950r r2 = r6.A0w;
        0qQ.A0B(r2, 0);
        if (A0n.A05.Aji() == C279294yP.CLIPS && r2 == C2801950r.CLIPS) {
            A0n.A01 = A0n.A04.A02(585185740, A0n.A01);
        }
    }
}
