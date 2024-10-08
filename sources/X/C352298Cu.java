package X;

import com.instagram.pendingmedia.model.ClipInfo;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8Cu  reason: invalid class name and case insensitive filesystem */
public final class C352298Cu implements C352308Cv {
    public final /* synthetic */ C352268Cr A00;

    public final void DiS(int i) {
    }

    public C352298Cu(C352268Cr r1) {
        this.A00 = r1;
    }

    public final void DNN(int i) {
        ClipInfo clipInfo;
        C352268Cr r2 = this.A00;
        C349307zv r1 = r2.A04;
        String str = MediaStreamTrack.VIDEO_TRACK_KIND;
        if (r1 != null) {
            r1.A0J = i;
            r1.A1G = true;
            AnonymousClass8LU r0 = r2.A00;
            if (r0 == null) {
                str = "delegate";
            } else {
                AnonymousClass3Q2 r02 = r0.A0D;
                if (r02 != null && (clipInfo = r02.A1N) != null) {
                    clipInfo.A07 = i;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dfv(int i) {
        ClipInfo clipInfo;
        C352268Cr r2 = this.A00;
        C349307zv r1 = r2.A04;
        String str = MediaStreamTrack.VIDEO_TRACK_KIND;
        if (r1 != null) {
            r1.A0I = i;
            r1.A1G = true;
            AnonymousClass8LU r0 = r2.A00;
            if (r0 == null) {
                str = "delegate";
            } else {
                AnonymousClass3Q2 r02 = r0.A0D;
                if (r02 != null && (clipInfo = r02.A1N) != null) {
                    clipInfo.A05 = i;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dsh(boolean z) {
        ClipInfo clipInfo;
        C352268Cr r1 = this.A00;
        r1.A06 = false;
        AnonymousClass8LU r3 = r1.A00;
        if (r3 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.A0J = false;
        AnonymousClass3Q2 r0 = r3.A0D;
        if (r0 != null && (clipInfo = r0.A1N) != null) {
            r3.A0L(clipInfo.A07, clipInfo.A05);
            AnonymousClass8LU.A0A(r3, clipInfo.A07);
        }
    }

    public final void Dsj(boolean z) {
        C352268Cr r0 = this.A00;
        r0.A06 = true;
        AnonymousClass8LU r02 = r0.A00;
        if (r02 == null) {
            0qQ.A0F("delegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r02.A0J = true;
        C378369Pn r1 = r02.A0B;
        if (r1 != null) {
            r1.A09(false);
        }
    }
}
