package X;

import java.util.List;

/* renamed from: X.4MF  reason: invalid class name */
public final class AnonymousClass4MF implements AnonymousClass4ME {
    public AnonymousClass4ME A00;

    public final void EFv(C257183wz r3, Object obj) {
        0qQ.A0B(r3, 1);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportFirstDataSegmentFetched", "attempted to log after logger is released");
        } else {
            r0.EFv(r3, obj);
        }
    }

    public final void EG5(C257183wz r3, Object obj) {
        0qQ.A0B(r3, 1);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportInitSegmentFetched", "attempted to log after logger is released");
        } else {
            r0.EG5(r3, obj);
        }
    }

    public final void EGA(2Yz r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportMediaCodecLifecycle", "attempted to log after logger is released");
        } else {
            r0.EGA(r3);
        }
    }

    public final void EGv(C263834Nn r7, Object obj, String str, String str2, String str3) {
        String str4 = str;
        0qQ.A0B(str, 1);
        String str5 = str2;
        0qQ.A0B(str2, 2);
        String str6 = str3;
        0qQ.A0B(str3, 3);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoError", "attempted to log after logger is released");
        } else {
            r0.EGv(r7, obj, str4, str5, str6);
        }
    }

    public final void EGy(C263834Nn r3, Object obj, String str) {
        0qQ.A0B(str, 1);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoLoop", "attempted to log after logger is released");
        } else {
            r0.EGy(r3, obj, str);
        }
    }

    public final void EH2(C263834Nn r8, Object obj, String str, String str2, String str3, String str4) {
        String str5 = str;
        0qQ.A0B(str, 1);
        String str6 = str2;
        0qQ.A0B(str2, 2);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerPaused", "attempted to log after logger is released");
        } else {
            r0.EH2(r8, obj, str5, str6, str3, (String) null);
        }
    }

    public final void EH7(C263834Nn r10, Object obj, String str, long j, boolean z, boolean z2, boolean z3) {
        String str2 = str;
        0qQ.A0B(str, 4);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerStarted", "attempted to log after logger is released");
        } else {
            r0.EH7(r10, obj, str2, j, z, z2, z3);
        }
    }

    public final void EHD(Object obj, String str, String str2, String str3) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoWarning", "attempted to log after logger is released");
        } else {
            r0.EHD(obj, str, str2, str3);
        }
    }

    public final void EFa(C291485hN r3) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportAbrDecision", "attempted to log after logger is released");
        } else {
            r0.EFa(r3);
        }
    }

    public final void EFf(AnonymousClass3WR r3) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoViewSizeChanged", "attempted to log after logger is released");
        } else {
            r0.EFf(r3);
        }
    }

    public final void EFo(C263834Nn r8, Object obj, String str, String str2, int i, int i2) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportDownstreamFormatChanged", "attempted to log after logger is released");
        } else {
            r0.EFo(r8, obj, str, str2, i, i2);
        }
    }

    public final void EGs(C263834Nn r3, Object obj, int i, boolean z) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoAudioToggleChanged", "attempted to log after logger is released");
        } else {
            r0.EGs(r3, obj, i, z);
        }
    }

    public final void EGt(C263834Nn r3, Object obj, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoBufferingFinished", "attempted to log after logger is released");
        } else {
            r0.EGt(r3, obj, i);
        }
    }

    public final void EGu(C263834Nn r3, Object obj, List list) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoBufferingStart", "attempted to log after logger is released");
        } else {
            r0.EGu(r3, obj, list);
        }
    }

    public final void EGx(Object obj, boolean z) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoFetched", "attempted to log after logger is released");
        } else {
            r0.EGx(obj, z);
        }
    }

    public final void EGz(C263834Nn r3, Object obj) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoOnPrepareStart", "attempted to log after logger is released");
        } else {
            r0.EGz(r3, obj);
        }
    }

    public final void EH0(Object obj, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayedTimeUpdate", "attempted to log after logger is released");
        } else {
            r0.EH0(obj, i);
        }
    }

    public final void EH1(Object obj) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerExited", "attempted to log after logger is released");
        } else {
            r0.EH1(obj);
        }
    }

    public final void EH3(C263834Nn r3, Object obj, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerRequestedPlaying", "attempted to log after logger is released");
        } else {
            r0.EH3(r3, obj, i);
        }
    }

    public final void EH4(C263834Nn r3, Object obj, String str) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerResumed", "attempted to log after logger is released");
        } else {
            r0.EH4(r3, obj, str);
        }
    }

    public final void EH5(C263834Nn r3, Object obj, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerSeek", "attempted to log after logger is released");
        } else {
            r0.EH5(r3, obj, i);
        }
    }

    public final void EH6(C263834Nn r3, Object obj, String str, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayerShouldStart", "attempted to log after logger is released");
        } else {
            r0.EH6(r3, obj, str, i);
        }
    }

    public final void EH8(C263834Nn r7, Object obj, int i, int i2, int i3) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoPlayingUpdate", "attempted to log after logger is released");
        } else {
            r0.EH8(r7, obj, i, i2, i3);
        }
    }

    public final void EH9(Object obj, String str, String str2, int i, long j) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoRendered", "attempted to log after logger is released");
        } else {
            r0.EH9(obj, str, str2, i, j);
        }
    }

    public final void EHA(Object obj) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoSwitchToWarmupPlayer", "attempted to log after logger is released");
        } else {
            r0.EHA(obj);
        }
    }

    public final void EHB(C263834Nn r3, Object obj) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoViewSizeChanged", "attempted to log after logger is released");
        } else {
            r0.EHB(r3, obj);
        }
    }

    public final void EHC(C263834Nn r3, Object obj) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoViewed", "attempted to log after logger is released");
        } else {
            r0.EHC(r3, obj);
        }
    }

    public final void EHE(C263834Nn r3, Object obj, int i) {
        AnonymousClass4ME r0 = this.A00;
        if (r0 == null) {
            0wb.A03("VideoPlayerImpl_Logger_reportVideoViewabilityChanged", "attempted to log after logger is released");
        } else {
            r0.EHE(r3, obj, i);
        }
    }
}
