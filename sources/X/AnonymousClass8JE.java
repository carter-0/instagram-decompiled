package X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.io.File;

/* renamed from: X.8JE  reason: invalid class name */
public final class AnonymousClass8JE implements AnonymousClass8JF {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public AnonymousClass82X A01;
    public AnonymousClass886 A02 = AnonymousClass886.A09;
    public AudioOverlayTrack A03;
    public boolean A04;
    public C348937zI A05;
    public final Handler A06 = new Handler(Looper.getMainLooper());
    public final UserSession A07;
    public final AnonymousClass8JD A08;
    public final Context A09;

    public final void A05(AnonymousClass886 r11, AudioOverlayTrack audioOverlayTrack) {
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        File file = null;
        if (downloadedTrack == null) {
            0kD.A07("BackingTrackPlayerController", "null downloaded track", (Throwable) null);
        }
        this.A03 = audioOverlayTrack;
        this.A02 = r11;
        if (downloadedTrack != null) {
            file = new File(downloadedTrack.A02);
        }
        Uri fromFile = Uri.fromFile(file);
        C348937zI A012 = A01(this);
        0qQ.A0A(fromFile);
        float f = 1.0f / r11.A00;
        0qQ.A0B(fromFile, 0);
        if (!A012.A00) {
            A012.A04.A00();
            String hexString = Integer.toHexString(fromFile.hashCode());
            AnonymousClass4MM r3 = A012.A05;
            r3.ETv(fromFile, (Integer) null, hexString, "IgVideoPlayerBasedRecordingBackingTrackPlayer", false, true);
            r3.E3n((ViewGroup) null, (Integer) null);
            r3.A06(f);
            A012.A01.A00.A08.A00.A1h.A02();
            A03(this, true);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void D6P(int i) {
        A03(this, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00() {
        /*
            r7 = this;
            com.instagram.music.common.model.AudioOverlayTrack r0 = r7.A03
            java.lang.String r3 = "BackingTrackPlayerController"
            r1 = 0
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = "null audio overlay track"
            X.0kD.A07(r3, r0, r1)
        L_0x000c:
            com.instagram.music.common.model.AudioOverlayTrack r0 = r7.A03
            if (r0 == 0) goto L_0x0084
            com.instagram.music.common.model.DownloadedTrack r2 = r0.A06
            if (r2 == 0) goto L_0x0084
            int r0 = r0.A03
            int r6 = r2.A00(r0)
        L_0x001a:
            com.instagram.common.session.UserSession r0 = r7.A07
            int r4 = X.C353608Ij.A00(r0)
            X.8JD r0 = r7.A08
            X.8Hw r5 = r0.A00
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0N
            r2 = 0
            if (r0 == 0) goto L_0x0076
            com.instagram.music.common.model.MusicAssetModel r0 = r0.A08
            if (r0 == 0) goto L_0x002f
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r0.A01
        L_0x002f:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            if (r1 == r0) goto L_0x0076
            com.instagram.common.session.UserSession r0 = r5.A1D
            boolean r0 = X.AnonymousClass8IK.A00(r0)
            if (r0 == 0) goto L_0x0076
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A1n
            X.831 r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.A00(r0)
            int r1 = r0.A00
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0N
            if (r0 == 0) goto L_0x0049
            int r2 = r0.A04
        L_0x0049:
            int r1 = r1 - r2
            if (r0 == 0) goto L_0x0074
            int r0 = r0.A02
        L_0x004e:
            int r1 = r1 % r0
        L_0x004f:
            X.886 r0 = r7.A02
            float r3 = r0.A00
            int r2 = r5.A02
            r0 = -1
            if (r2 != r0) goto L_0x006a
            X.8Yz r2 = r5.A1F
            X.8aL r0 = X.C358088aL.A0J
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r2.A0V(r0)
            if (r0 != 0) goto L_0x006a
            r0 = 0
        L_0x0067:
            int r6 = r6 + r1
            int r6 = r6 - r0
            return r6
        L_0x006a:
            float r2 = (float) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r3
            float r2 = r2 * r0
            int r0 = X.AnonymousClass1GB.A01(r2)
            goto L_0x0067
        L_0x0074:
            r0 = 1
            goto L_0x004e
        L_0x0076:
            X.831 r0 = r5.A0J
            int r1 = X.C348947zL.A01(r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = r5.A0N
            if (r0 == 0) goto L_0x0082
            int r2 = r0.A04
        L_0x0082:
            int r1 = r1 - r2
            goto L_0x004f
        L_0x0084:
            java.lang.String r0 = "null downloaded track"
            X.0kD.A07(r3, r0, r1)
            r6 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8JE.A00():int");
    }

    public static final C348937zI A01(AnonymousClass8JE r9) {
        C348937zI r2 = r9.A05;
        if (r2 == null) {
            Context context = r9.A09;
            UserSession userSession = r9.A07;
            r2 = new C348937zI(context, userSession, new AnonymousClass9QJ(r9), new C234482xw((AnonymousClass0iw) null, userSession, "IgVideoPlayerBasedRecordingBackingTrackPlayer", "RecordingBackingTrackPlayer", false));
            r9.A05 = r2;
        }
        AnonymousClass82X r1 = r9.A01;
        if (r1 != null) {
            r2.A02.A00 = r1;
        }
        return r2;
    }

    public static final void A02(AnonymousClass8JE r1, int i) {
        r1.A00 = i;
        int max = Math.max(i, 0);
        C348937zI A012 = A01(r1);
        if (!A012.A00) {
            A012.A05.seekTo(max);
            A012.A04.A00();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public static final void A03(AnonymousClass8JE r3, boolean z) {
        AudioOverlayTrack audioOverlayTrack = r3.A03;
        if (audioOverlayTrack != null) {
            boolean A002 = AnonymousClass8IK.A00(r3.A07);
            int A003 = r3.A00();
            if (A002) {
                A003 = Math.min(A003, audioOverlayTrack.A02);
            }
            if (A003 != r3.A00 || z) {
                A02(r3, A003);
            }
        }
    }

    public final void A04() {
        C348937zI r2 = this.A05;
        if (r2 != null && !r2.A00) {
            r2.A04.A00();
            r2.A05.ECQ(false);
            r2.A00 = true;
        }
        this.A05 = null;
        this.A03 = null;
        this.A02 = AnonymousClass886.A09;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public AnonymousClass8JE(Context context, UserSession userSession, AnonymousClass8JD r5) {
        this.A09 = context;
        this.A07 = userSession;
        this.A08 = r5;
    }
}
