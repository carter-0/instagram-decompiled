package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class AR0 implements C345777u4, B3S, C41786B0p {
    public B0V A00;
    public B0W A01;
    public C343837qt A02;
    public C361848gv A03;
    public AnonymousClass9g8 A04;
    public AnonymousClass9g8 A05;
    public final C312426eP A06;
    public final C312136ds A07;
    public final AH3 A08;
    public final Context A09;
    public final UserSession A0A;
    public final List A0B = new ArrayList(2);

    public final void APC() {
    }

    public final void ARH() {
    }

    public final void CMk() {
    }

    public final void E3N() {
    }

    public final void EAf() {
    }

    public final void EIx() {
    }

    public final void connect() {
    }

    public final void disconnect() {
    }

    public final void pause() {
    }

    public final void release() {
    }

    public final C348407yO AJp(C371458yK r13) {
        C380949am r6;
        C314366i5 A002 = this.A06.A00(this.A07);
        C371458yK r4 = r13;
        AnonymousClass8yN r3 = r13.A04.A00;
        if (r3 != null) {
            UserSession userSession = this.A0A;
            String str = AnonymousClass1CT.A00(userSession).A04;
            if (str != null) {
                if (str.startsWith("Bearer")) {
                    str = str.substring(6);
                }
                String trim = str.trim();
                r6 = new C380949am(new C40103ARp(r3.A00, r3, this), (AvatarsNativeInputDelegate) null, AnonymousClass05K.A01, userSession.A06, trim);
                return this.A08.A01(r4, A002, r6, this.A00, this.A01, (String) null);
            }
        }
        r6 = null;
        return this.A08.A01(r4, A002, r6, this.A00, this.A01, (String) null);
    }

    public final C312426eP B3i() {
        return this.A06;
    }

    public final C343717qg BJt() {
        return B3S.A00;
    }

    public final List Blz() {
        if (this.A05 == null) {
            AnonymousClass9g8 r1 = new AnonymousClass9g8(this.A09, 182.A06(0Tu.A05, this.A0A, 36316254885122235L));
            this.A05 = r1;
            this.A0B.add(r1);
        }
        if (this.A03 == null) {
            Context context = this.A09;
            UserSession userSession = this.A0A;
            C361848gv A002 = C368558sq.A00(context, new C40099ARl(), (GPUTimerImpl) null, (AnonymousClass82I) null, C312146dt.A00(userSession), userSession, 0);
            this.A03 = A002;
            this.A0B.add(A002);
        }
        if (this.A04 == null) {
            AnonymousClass9g8 r12 = new AnonymousClass9g8(this.A09, 182.A06(0Tu.A05, this.A0A, 36316254885122235L));
            this.A04 = r12;
            this.A0B.add(r12);
        }
        return this.A0B;
    }

    public final void CMP() {
        AH3 ah3 = this.A08;
        C343837qt r1 = this.A02;
        r1.getClass();
        ah3.A00 = (C345607tn) r1.Ape(C345607tn.A00);
    }

    public AR0(Context context, C312136ds r5, UserSession userSession, String str) {
        this.A09 = context;
        this.A0A = userSession;
        this.A07 = r5;
        this.A08 = new AH3(context, userSession, str);
        this.A06 = C312406eN.A00(context, new QPLUserFlowImpl(182.A06(0Tu.A05, userSession, 36330836300153643L)), userSession);
    }
}
