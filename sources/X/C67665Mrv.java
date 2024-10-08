package X;

import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Mrv  reason: case insensitive filesystem */
public final class C67665Mrv extends Connection {
    public String A00;
    public final UserSession A01;
    public final 1XD A02;

    public C67665Mrv(UserSession userSession, 1XD r3, String str) {
        0qQ.A0B(r3, 3);
        this.A01 = userSession;
        this.A00 = str;
        this.A02 = r3;
    }

    public final void onShowIncomingCallUi() {
        String str = this.A00;
        1XD r2 = this.A02;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        AnonymousClass9IV A002 = 1XD.A00(r2, this, str);
        if (A002 != null) {
            1XD.A02((Bundle) A002.A01, userSession, r2, str);
        }
    }

    public final void onAnswer() {
        super.onAnswer();
        String str = this.A00;
        1XD r0 = this.A02;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        AnonymousClass9IV A002 = 1XD.A00(r0, this, str);
        if (A002 != null) {
            List list = r0.A01;
            0qQ.A06(list);
            ListIterator listIterator = 00k.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((1XG) listIterator.next()).CvV((Bundle) A002.A01, userSession, str);
            }
        }
    }

    public final void onCallAudioStateChanged(CallAudioState callAudioState) {
        super.onCallAudioStateChanged(callAudioState);
        1XD r2 = this.A02;
        0qQ.A0B(this.A00, 1);
        List list = r2.A00;
        0qQ.A06(list);
        ListIterator listIterator = 00k.A0a(list).listIterator();
        while (listIterator.hasNext()) {
            C68373NDy nDy = (C68373NDy) listIterator.next();
            C69377NkH A012 = nDy.A01();
            if (A012 == C69377NkH.SPEAKERPHONE) {
                nDy.A05.A00(002.A1D("Speakerphone finished turning on for video call | AudioManager: ", nDy.A02.isSpeakerphoneOn()), new Object[0]);
            }
            if (nDy.aomCurrentAudioOutput != A012) {
                nDy.A05.A00("onCallAudioStateChanged update audio output from %s to %s", nDy.aomCurrentAudioOutput, A012);
                0qQ.A0B(A012, 0);
                nDy.aomCurrentAudioOutput = A012;
                nDy.A05();
            }
            nDy.A0C();
        }
    }

    public final void onDisconnect() {
        super.onDisconnect();
        String str = this.A00;
        1XD r0 = this.A02;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        AnonymousClass9IV A002 = 1XD.A00(r0, this, str);
        if (A002 != null) {
            List list = r0.A01;
            0qQ.A06(list);
            ListIterator listIterator = 00k.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((1XG) listIterator.next()).D96((Bundle) A002.A01, userSession, str);
            }
        }
    }

    public final void onHold() {
        super.onHold();
    }

    public final void onReject() {
        super.onReject();
        String str = this.A00;
        1XD r0 = this.A02;
        UserSession userSession = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        AnonymousClass9IV A002 = 1XD.A00(r0, this, str);
        if (A002 != null) {
            List list = r0.A01;
            0qQ.A06(list);
            ListIterator listIterator = 00k.A0a(list).listIterator();
            while (listIterator.hasNext()) {
                ((1XG) listIterator.next()).Dcx((Bundle) A002.A01, userSession, str);
            }
        }
    }

    public final void onUnhold() {
        super.onUnhold();
    }

    public final void onStateChanged(int i) {
        super.onStateChanged(i);
    }
}
