package X;

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4N5  reason: invalid class name */
public final class AnonymousClass4N5 implements AnonymousClass4N6 {
    public final WeakReference A00;

    public final void Dd4(boolean z, boolean z2) {
        String str;
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null && r2.A0I()) {
            if (z) {
                str = "evicted";
            } else {
                str = "released";
            }
            C263634Mt.A05(r2, "Service player was %s", str);
            Handler handler = r2.A0E;
            handler.sendMessage(handler.obtainMessage(12, new Object[]{Boolean.valueOf(z), false}));
        }
    }

    public final void Cwg(AnonymousClass4Yf r4) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            if (r4 != null) {
                C263634Mt.A05(r2, "onAudioInputFormatChanged Channels: %d, SampleRate: %d", Integer.valueOf(r4.A00), Integer.valueOf(r4.A01));
            }
            r2.A0G.Cwg(r4);
        }
    }

    public final void CzF(C263684My r13, C263674Mx r14, boolean z) {
        long j;
        C263634Mt r3 = (C263634Mt) this.A00.get();
        if (r3 != null) {
            C263674Mx r6 = r14;
            C263634Mt.A03(r3, r14, false);
            C263634Mt.A05(r3, "onBufferingStarted", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            if (elapsedRealtime - r3.A0V < 500) {
                z2 = true;
            }
            long j2 = r3.A01;
            if (j2 != -1) {
                j = elapsedRealtime - j2;
            } else {
                j = -1;
            }
            AnonymousClass4NN r1 = r3.A02;
            C263684My r5 = r13;
            if (r1 != null) {
                0qQ.A0B(r13, 1);
                if (r1.A0C.A0B) {
                    AnonymousClass4NN.A07(r1, r13, r14);
                }
            }
            r3.A0G.DmQ(r5, r6, r3.A09, j, z, z2);
        }
    }

    public final void CzG(C263674Mx r2, boolean z) {
        C263634Mt r0 = (C263634Mt) this.A00.get();
        if (r0 != null) {
            C263634Mt.A03(r0, r2, z);
        }
    }

    public final void D0i(C263674Mx r15, String str, String str2, String str3, String str4, long j, boolean z) {
        C263674Mx r6 = r15;
        DXq(r15);
        C263634Mt r3 = (C263634Mt) this.A00.get();
        if (r3 != null) {
            C263634Mt.A05(r3, "onCancelled", new Object[0]);
            AnonymousClass4NN r2 = r3.A02;
            String str5 = str4;
            if (r2 != null) {
                C263684My r1 = (C263684My) r3.A0N.get();
                0qQ.A0B(r1, 1);
                0qQ.A0B(str5, 2);
                if (r2.A0C.A0B) {
                    AnonymousClass4NN.A08(r2, r1, r15, str5);
                }
            }
            r3.A0G.DxA((C263684My) r3.A0N.get(), r6, str, str2, "", str5, j, z);
            synchronized (r3.A05) {
            }
            r3.hashCode();
            C263664Mw.A02(r3.A0F);
        }
    }

    public final void D4H(String str, boolean z) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            C263634Mt.A05(r2, "onCodecInitStart name: %s, isVideo %s", str, Boolean.valueOf(z));
            r2.A0G.D4H(str, z);
        }
    }

    public final void D5J(C263674Mx r17, String str, String str2, String str3, boolean z) {
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            C263674Mx r9 = r17;
            C263634Mt.A03(r4, r9, false);
            C263634Mt.A05(r4, "onCompletion", new Object[0]);
            C297475ro A0A = r4.A0A();
            Integer A002 = C296375px.A00(r9.A0M);
            if (r9.A0E > 0 || r9.A0O) {
                r9.A0O = false;
                r9.A0E = -1;
                r9.A0F = -1;
            }
            AnonymousClass4NN r3 = r4.A02;
            String str4 = str3;
            if (r3 != null) {
                C263684My r2 = (C263684My) r4.A0N.get();
                boolean z2 = r4.A0X;
                0qQ.A0B(r2, 1);
                0qQ.A0B(str4, 3);
                if (r3.A0C.A0B) {
                    AnonymousClass4NN.A0B(r3, r2, r9, str4, z2);
                }
            }
            r4.A0G.DxH(A0A, (C263684My) r4.A0N.get(), r9, A002, str, str2, str4, z, r4.A0X);
        }
    }

    public final void D7z(long j, String str, boolean z) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            C263634Mt.A05(r2, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
            r2.A0G.D7z(j, str, z);
        }
    }

    public final void D80(int i, int i2, int i3, int i4) {
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            C263634Mt.A05(r4, "onDecoderPerfReport avgDecodeTimeMsPerFrame: %d, width %d, height: %d, bitrate %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            r4.A0G.D80(i, i2, i3, i4);
        }
    }

    public final void DAM(AnonymousClass4Yf r13, String str, List list, boolean z) {
        String str2;
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            long A08 = r2.A08();
            AnonymousClass4Yf r6 = r13;
            if (r13 != null) {
                C263634Mt.A05(r2, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", r13.A0E, Integer.valueOf(r13.A02 / IgNetworkConsentStorage.MAX_ENTRIES), Integer.valueOf(r13.A05), Integer.valueOf(r13.A04));
            }
            List list2 = list;
            if (list != null) {
                str2 = TextUtils.join(", ", list);
            } else {
                str2 = "<none>";
            }
            C263634Mt.A05(r2, "onDownStreamFormatChanged customQualities: %s", str2);
            AnonymousClass4NN r1 = r2.A02;
            String str3 = str;
            if (!(r1 == null || r13 == null)) {
                0qQ.A0B(str, 1);
                if (r1.A0C.A0B) {
                    AnonymousClass4NN.A0C(r1, r13);
                }
            }
            r2.A0G.DAN(r6, str3, list2, A08, z);
        }
    }

    public final void DCs(String str, String str2, String str3, String str4, String str5) {
        C266464Yz r2;
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            AnonymousClass5OZ A002 = AnonymousClass5OZ.A00(str);
            try {
                r2 = C266464Yz.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused) {
                r2 = C266464Yz.A1Y;
            }
            C263634Mt.A05(r4, "onError", new Object[0]);
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            if (r2 == C266464Yz.A1D) {
                Handler handler = r4.A0E;
                handler.sendMessage(handler.obtainMessage(17, new String[]{A002.name(), "RESPONSE_CODE_410", str8, str6, str7}));
            } else {
                AnonymousClass4NN r8 = r4.A02;
                if (r8 != null) {
                    C263684My r1 = (C263684My) r4.A0N.get();
                    r8.A0H(new C284815Oa(r2, A002, str8, str6), r1, (C263674Mx) r4.A0B.get(), str7);
                }
                C263684My r11 = (C263684My) r4.A0N.get();
                r4.A0G.DXX((C297475ro) null, new C284815Oa(r2, A002, str8, str6), r11, (C263674Mx) r4.A0B.get(), str7);
                synchronized (r4.A05) {
                }
            }
            r4.hashCode();
            C263664Mw.A02(r4.A0F);
        }
    }

    public final void DCy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C266464Yz r3;
        C263634Mt r5 = (C263634Mt) this.A00.get();
        if (r5 != null) {
            AnonymousClass5OZ A002 = AnonymousClass5OZ.A00(str);
            try {
                r3 = C266464Yz.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused) {
                r3 = C266464Yz.A1Y;
            }
            AtomicInteger atomicInteger = C263634Mt.A0b;
            long A08 = r5.A08();
            String str8 = str6;
            C263634Mt.A05(r5, "onErrorRecoveryAttempt reason: %s", str8);
            AnonymousClass4NN r2 = r5.A02;
            String str9 = str4;
            String str10 = str3;
            if (r2 != null) {
                C284815Oa r1 = new C284815Oa(r3, A002, str10, str9);
                if (r2.A0C.A0B) {
                    AnonymousClass4NN.A06(r2, r1, "");
                }
            }
            r5.A0G.DCz(new C284815Oa(r3, A002, str10, str9), str5, str8, "", A08);
        }
    }

    public final void DGr(String str, long j) {
        C263634Mt r1 = (C263634Mt) this.A00.get();
        if (r1 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            r1.A0G.DGr(str, j);
        }
    }

    public final void DKJ(String str, byte[] bArr, long j) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onImfEventEmsgReceived", new Object[0]);
            r2.A0G.DKJ(str, bArr, j);
        }
    }

    public final void DNp(boolean z) {
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            C263634Mt.A05(r4, "onLiveBroadcastInterruptStatusChanged", new Object[0]);
            AnonymousClass4NN r3 = r4.A02;
            if (r3 != null && r3.A0C.A0B) {
                0bb r2 = new 0bb();
                r2.A03("is_broadcast_interrupted", Boolean.valueOf(z));
                r3.A0F(r2);
            }
            r4.A0G.DNp(z);
        }
    }

    public final void DNr(String str, byte[] bArr, long j, long j2) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onLiveEmsg", new Object[0]);
            r2.A0G.DNr(str, bArr, j, j2);
        }
    }

    public final void DNw(C263684My r10) {
        int i;
        C263694Mz r1;
        boolean z;
        C263634Mt r12 = (C263634Mt) this.A00.get();
        if (r12 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            C263634Mt r6 = r12.A0F.A0D;
            AtomicReference atomicReference = r6.A0N;
            synchronized (atomicReference) {
                C263684My r7 = (C263684My) atomicReference.get();
                TreeMap treeMap = r6.A0M;
                if (treeMap.isEmpty() || (i = r10.A00) != r7.A00) {
                    Long valueOf = Long.valueOf(r10.A09);
                    i = r10.A00;
                    treeMap.put(valueOf, Integer.valueOf(i));
                }
                if (r7.A09 <= r10.A09) {
                    atomicReference.set(r10);
                }
                int i2 = r6.A08.A0d;
                int i3 = r7.A00;
                if (i3 < i2 && i >= i2) {
                    r1 = r6.A0G;
                    z = true;
                } else if (i3 >= i2 && i < i2) {
                    r1 = r6.A0G;
                    z = false;
                }
                r1.Dnv(z);
            }
        }
    }

    public final void DNz(C17183VLn vLn) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            synchronized (r2.A0I) {
                r2.A0A.add(vLn);
            }
            synchronized (r2.A0K) {
                if (r2.A02 != null) {
                    0qQ.A0B(vLn, 0);
                }
            }
            r2.A0G.DNz(vLn);
        }
    }

    public final void DS6(Object obj) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onMetadataMsg", new Object[0]);
            r2.A0G.DS6(obj);
        }
    }

    public final void DTt(byte[] bArr, long j) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onNewAudioData", new Object[0]);
            r2.A0G.DTt(bArr, j);
        }
    }

    public final void DWV(C263674Mx r22, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        C263634Mt r1 = (C263634Mt) this.A00.get();
        if (r1 != null) {
            C263674Mx r6 = r22;
            C263634Mt.A03(r1, r6, false);
            long A002 = r6.A00();
            C263634Mt.A05(r1, "onPaused", new Object[0]);
            C297475ro A0A = r1.A0A();
            AnonymousClass4NN r3 = r1.A02;
            String str6 = str5;
            if (r3 != null) {
                C263684My r2 = (C263684My) r1.A0N.get();
                0qQ.A0B(r2, 1);
                0qQ.A0B(str6, 3);
                if (r3.A0C.A0B) {
                    AnonymousClass4NN.A0A(r3, r2, r6, str6, A002);
                }
            }
            r1.A0G.Dxb(A0A, (C263684My) r1.A0N.get(), r6, C296375px.A00(r6.A0M), str, str2, str3, str4, str6, A002, j, z);
            synchronized (r1.A05) {
            }
            r1.hashCode();
            C263664Mw.A02(r1.A0F);
        }
    }

    public final void DWg(String str, String str2) {
        C263634Mt r1 = (C263634Mt) this.A00.get();
        if (r1 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            if (!TextUtils.isEmpty(str)) {
                r1.A0G.DWg(str, str2);
            }
        }
    }

    public final void DXW() {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onPlaybackAboutToFinish", new Object[0]);
            r2.A0G.DXW();
        }
    }

    public final void DXc(2Co r4) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onPlaybackPositionReached", new Object[0]);
            r2.A0G.DXc(r4);
        }
    }

    public final void DXf(float f) {
        C263634Mt r7 = (C263634Mt) this.A00.get();
        if (r7 != null) {
            C263634Mt.A05(r7, "onPlaybackSpeedChanged", new Object[0]);
            long A08 = r7.A08();
            AnonymousClass4NN r6 = r7.A02;
            if (r6 != null && r6.A0C.A0B) {
                0bb r5 = new 0bb();
                r5.A04("playback_speed", Double.valueOf((double) f));
                r6.A0F(r5);
            }
            r7.A0G.DXg((C263674Mx) r7.A0B.get(), f, A08);
        }
    }

    public final void DXq(C263674Mx r3) {
        C263634Mt r1 = (C263634Mt) this.A00.get();
        if (r1 != null) {
            C263634Mt.A03(r1, r3, false);
        }
    }

    public final void DZ0(C263674Mx r6, String str) {
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            C263634Mt.A03(r4, r6, false);
            long A002 = r6.A00();
            C263634Mt.A05(r4, "onPrepared", new Object[0]);
            r4.A0G.DYz(A002, str);
            synchronized (r4.A05) {
            }
            r4.hashCode();
            C263664Mw.A02(r4.A0F);
        }
    }

    public final void DiV(C263674Mx r4, long j) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A03(r2, r4, false);
            C263634Mt.A05(r2, "onSeeking", new Object[0]);
            AnonymousClass4NN r1 = r2.A02;
            if (r1 != null && r1.A0C.A0B) {
                AnonymousClass4NN.A04(r1);
            }
            r2.A0G.onSeeking(j);
        }
    }

    public final void DjL(long j) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "setRebindServicePlayerListener: message not sent to internal player", new Object[0]);
        }
    }

    public final void Dmm(C263674Mx r19, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C263634Mt r3 = (C263634Mt) this.A00.get();
        if (r3 != null) {
            C263674Mx r6 = r19;
            C263634Mt.A03(r3, r6, false);
            C263634Mt.A05(r3, "onStartedPlaying", new Object[0]);
            AnonymousClass4NN r2 = r3.A02;
            String str8 = str4;
            if (r2 != null) {
                C263684My r1 = (C263684My) r3.A0N.get();
                0qQ.A0B(r1, 1);
                if (r2.A0C.A0B) {
                    AnonymousClass4NN.A09(r2, r1, r6, str8);
                }
            }
            r3.A0G.DyV((C263684My) r3.A0N.get(), r6, str, str2, str3, str8, str5, str6, str7, j, z, z2);
            synchronized (r3.A05) {
            }
            r3.hashCode();
            C263664Mw.A02(r3.A0F);
        }
    }

    public final void Drl(List list) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onWarn", new Object[0]);
            r2.A0G.Drl(list);
        }
    }

    public final void Dt9(AnonymousClass4Yf r15, AnonymousClass4Yf r16, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C266464Yz r2;
        String str7;
        C263634Mt r5 = (C263634Mt) this.A00.get();
        if (r5 != null) {
            AnonymousClass5OZ A002 = AnonymousClass5OZ.A00(str3);
            try {
                r2 = C266464Yz.valueOf(str4);
            } catch (IllegalArgumentException | NullPointerException unused) {
                r2 = C266464Yz.A1Y;
            }
            AtomicInteger atomicInteger = C263634Mt.A0b;
            long A08 = r5.A08();
            AnonymousClass4Yf r7 = r15;
            AnonymousClass4Yf r8 = r16;
            String str8 = str2;
            String str9 = str5;
            if (!(r15 == null || r16 == null)) {
                C263634Mt.A05(r5, "onTrackSelectionFallback MimeType: %s, QualityLabel: %s, nextQualityLabel: %s, reason: %s, error: %s", r15.A0E, r15.A0B, r8.A0B, str8, str9);
            }
            List list2 = list;
            if (list != null) {
                str7 = TextUtils.join(", ", list2);
            } else {
                str7 = "<none>";
            }
            C263634Mt.A05(r5, "onTrackSelectionFallback customQualities: %s", str7);
            r5.A0G.Dt8(new C284815Oa(r2, A002, str9, str6), r7, r8, str, str8, list2, A08);
        }
    }

    public final void DyH(int i, int i2, float f) {
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            AtomicInteger atomicInteger = C263634Mt.A0b;
            C263634Mt.A05(r4, "onVideoSizeChanged: w=%d, h=%d", Integer.valueOf(i), Integer.valueOf(i2));
            AnonymousClass4NN r3 = r4.A02;
            if (r3 != null && r3.A0C.A0B) {
                0bb r2 = new 0bb();
                r2.A05("video_width", Long.valueOf((long) i));
                r2.A05("video_height", Long.valueOf((long) i2));
                r3.A0F(r2);
            }
            r4.A0G.DyH(i, i2, f);
        }
    }

    public final void E07(String str, String str2, String str3) {
        C266464Yz r2;
        C263634Mt r4 = (C263634Mt) this.A00.get();
        if (r4 != null) {
            AnonymousClass5OZ A002 = AnonymousClass5OZ.A00(str);
            try {
                r2 = C266464Yz.valueOf(str2);
            } catch (IllegalArgumentException | NullPointerException unused) {
                r2 = C266464Yz.A1Y;
            }
            C263634Mt.A05(r4, "onWarn", new Object[0]);
            r4.A0G.E06(new C284815Oa(r2, A002, str3));
        }
    }

    public final void onCues(List list) {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onCues", new Object[0]);
            r2.A0G.onCues(list);
        }
    }

    public final void onDrawnToSurface() {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onDrawnToSurface", new Object[0]);
            r2.A0G.onDrawnToSurface();
        }
    }

    public final void onStopped() {
        C263634Mt r2 = (C263634Mt) this.A00.get();
        if (r2 != null) {
            C263634Mt.A05(r2, "onStopped", new Object[0]);
            r2.A0G.DnZ(r2.A0A());
        }
    }

    public AnonymousClass4N5(C263634Mt r2) {
        this.A00 = new WeakReference(r2);
    }
}
