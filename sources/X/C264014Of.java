package X;

import java.util.List;

/* renamed from: X.4Of  reason: invalid class name and case insensitive filesystem */
public final class C264014Of implements AnonymousClass4N6 {
    public final AnonymousClass4OS A00;
    public volatile AnonymousClass4N6 A01;

    public final void D5J(C263674Mx r7, String str, String str2, String str3, boolean z) {
        try {
            this.A01.D5J(r7, str, str2, str3, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onCompletion(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r7.A0Q)});
        }
    }

    public final void DCs(String str, String str2, String str3, String str4, String str5) {
        try {
            this.A01.DCs(str, str2, str3, str4, str5);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onError(errorCode = %s) callback", e, new Object[]{str2});
        }
    }

    public final void DWV(C263674Mx r11, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        try {
            this.A01.DWV(r11, str, str2, str3, str4, str5, j, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onPaused(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r11.A0Q)});
        }
    }

    public final void Dd4(boolean z, boolean z2) {
        try {
            this.A01.Dd4(z, false);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onRelease(isEvicted = %s) callback", e, new Object[]{Boolean.valueOf(z)});
        }
    }

    public final void Dmm(C263674Mx r14, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        try {
            this.A01.Dmm(r14, str, str2, str3, str4, str5, str6, str7, j, z, z2);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r14.A0Q)});
        }
    }

    public final void Cwg(AnonymousClass4Yf r5) {
        try {
            this.A01.Cwg(r5);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send audio input format change", e, new Object[0]);
        }
    }

    public final void CzF(C263684My r5, C263674Mx r6, boolean z) {
        try {
            this.A01.CzF(r5, r6, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r6.A0Q)});
        }
    }

    public final void CzG(C263674Mx r5, boolean z) {
        try {
            this.A01.CzG(r5, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r5.A0Q)});
        }
    }

    public final void D0i(C263674Mx r10, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.D0i(r10, str, str2, "", str4, j, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onCancelled() callback", e, new Object[0]);
        }
    }

    public final void D4H(String str, boolean z) {
        try {
            this.A01.D4H(str, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send codec init start callback", e, new Object[0]);
        }
    }

    public final void D7z(long j, String str, boolean z) {
        try {
            this.A01.D7z(j, str, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send decoder initialized callback", e, new Object[0]);
        }
    }

    public final void D80(int i, int i2, int i3, int i4) {
        try {
            this.A01.D80(i, i2, i3, i4);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onDecoderPerfReport callback", e, new Object[0]);
        }
    }

    public final void DAM(AnonymousClass4Yf r5, String str, List list, boolean z) {
        try {
            this.A01.DAM(r5, str, list, z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onDownstreamFormatChanged() callback", e, new Object[0]);
        }
    }

    public final void DCy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.DCy(str, str2, str3, str4, str5, str6, "");
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onErrorRecoveryAttempt() callback", e, new Object[0]);
        }
    }

    public final void DGr(String str, long j) {
        this.A01.DGr(str, j);
    }

    public final void DKJ(String str, byte[] bArr, long j) {
        try {
            this.A01.DKJ(str, bArr, j);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onImfEventEmsgReceived callback", e, new Object[0]);
        }
    }

    public final void DNp(boolean z) {
        try {
            this.A01.DNp(z);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onLiveInterrupt callback", e, new Object[0]);
        }
    }

    public final void DNr(String str, byte[] bArr, long j, long j2) {
        try {
            this.A01.DNr(str, bArr, j, j2);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onliveEmsg callback", e, new Object[0]);
        }
    }

    public final void DNw(C263684My r5) {
        try {
            this.A01.DNw(r5);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send live state update", e, new Object[0]);
        }
    }

    public final void DNz(C17183VLn vLn) {
        try {
            this.A01.DNz(vLn);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, new Object[0]);
        }
    }

    public final void DS6(Object obj) {
        try {
            this.A01.DS6(obj);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onMetadataMsg callback", e, new Object[0]);
        }
    }

    public final void DTt(byte[] bArr, long j) {
        try {
            this.A01.DTt(bArr, j);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onNewAudioData callback", e, new Object[0]);
        }
    }

    public final void DWg(String str, String str2) {
        this.A01.DWg(str, str2);
    }

    public final void DXW() {
        try {
            this.A01.DXW();
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onPlaybackAboutToFinish callback", e, new Object[0]);
        }
    }

    public final void DXc(2Co r5) {
        try {
            this.A01.DXc(r5);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onPlaybackPositionReached callback", e, new Object[0]);
        }
    }

    public final void DXf(float f) {
        try {
            this.A01.DXf(f);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, new Object[0]);
        }
    }

    public final void DXq(C263674Mx r5) {
        try {
            this.A01.DXq(r5);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, new Object[]{Boolean.valueOf(r5.A0Q)});
        }
    }

    public final void DZ0(C263674Mx r5, String str) {
        try {
            this.A01.DZ0(r5, str);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onPrepared callback", e, new Object[0]);
        }
    }

    public final void DiV(C263674Mx r5, long j) {
        try {
            this.A01.DiV(r5, j);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onSeeking callback", e, new Object[0]);
        }
    }

    public final void DjL(long j) {
        try {
            this.A01.DjL(j);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onServicePlayerListenerDetached() callback", e, new Object[0]);
        }
    }

    public final void Drl(List list) {
        try {
            this.A01.Drl(list);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send gaps changed callback", e, new Object[0]);
        }
    }

    public final void Dt9(AnonymousClass4Yf r11, AnonymousClass4Yf r12, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        try {
            this.A01.Dt9(r11, r12, str, str2, str3, str4, str5, str6, list);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onTrackSelectionFallback() callback", e, new Object[0]);
        }
    }

    public final void DyH(int i, int i2, float f) {
        try {
            this.A01.DyH(i, i2, f);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    public final void E07(String str, String str2, String str3) {
        try {
            this.A01.E07(str, str2, str3);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onWarn callback", e, new Object[0]);
        }
    }

    public final void onCues(List list) {
        try {
            this.A01.onCues(list);
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed send onCues(list = %s) callback", e, new Object[]{list});
        }
    }

    public final void onDrawnToSurface() {
        try {
            this.A01.onDrawnToSurface();
        } catch (IllegalStateException e) {
            28J.A01(this.A00, "Failed to send onDrawnToSurface callback", e, new Object[0]);
        }
    }

    public final void onStopped() {
        this.A01.onStopped();
    }

    public C264014Of(AnonymousClass4N6 r3, AnonymousClass4OS r4) {
        if (r3 != null) {
            this.A00 = r4;
            this.A01 = r3;
            return;
        }
        throw new IllegalArgumentException("HeroServicePlayerListener cannot be null");
    }
}
