package X;

import com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.74s  reason: invalid class name and case insensitive filesystem */
public final class C3259274s implements AnonymousClass7X3 {
    public final AnonymousClass930 A00;
    public final AnonymousClass0eM A01;
    public final C3259374t A02;
    public final AnonymousClass0eK A03;

    public final boolean CdW() {
        if (this.A02 != null) {
            return true;
        }
        return false;
    }

    public final void Exi(C70620ODr oDr, 1Xj r11, DirectMessageIdentifier directMessageIdentifier, String str) {
        AnonymousClass930 r0 = this.A00;
        if (r0 != null) {
            int hashCode = directMessageIdentifier.hashCode();
            02m r3 = r0.A00;
            r3.markerStart(331815788, hashCode);
            r3.markerAnnotate(331815788, hashCode, "MESSAGE_ID", directMessageIdentifier.A01);
        }
        ((C333477Zc) this.A03.get()).FK6(new N4D(AnonymousClass05K.A01), directMessageIdentifier);
        C70764OKk oKk = new C70764OKk(oDr, this, directMessageIdentifier);
        C3259374t r32 = this.A02;
        if (r32 != null) {
            int hashCode2 = directMessageIdentifier.hashCode();
            if (!C3259374t.A06()) {
                oKk.A00(new IllegalStateException("Trying to start transcription before setup."));
                return;
            }
            C262224Cq r1 = r32.A05;
            1Eo.A05(19B.A00, new VoiceMessageTranscriptionApi$startTranscription$1(r32, oKk, r11, str, (AnonymousClass4D7) null, hashCode2), r1);
        }
    }

    public final void FJr(N4D n4d, DirectMessageIdentifier directMessageIdentifier) {
        ((C333477Zc) this.A03.get()).FK6(n4d, directMessageIdentifier);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (X.C3259374t.A06() != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3259274s(com.instagram.common.session.UserSession r5, X.AnonymousClass0eK r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.A03 = r6
            X.930 r3 = X.C301275yq.A00(r5)
            r4.A00 = r3
            boolean r0 = X.AnonymousClass1A9.A00()
            if (r0 != 0) goto L_0x0043
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325527719523340(0x810de00000340c, double:3.035748228761591E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            X.Phg r1 = new X.Phg
            r1.<init>(r0, r3, r5)
            java.lang.Class<X.74t> r0 = X.C3259374t.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.74t r1 = (X.C3259374t) r1
            boolean r0 = X.C3259374t.A06()
            if (r0 == 0) goto L_0x0043
        L_0x0032:
            r4.A02 = r1
            X.0eO r2 = X.0eO.A02
            r1 = 3
            X.9LX r0 = new X.9LX
            r0.<init>(r5, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r4.A01 = r0
            return
        L_0x0043:
            r1 = 0
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3259274s.<init>(com.instagram.common.session.UserSession, X.0eK):void");
    }
}
