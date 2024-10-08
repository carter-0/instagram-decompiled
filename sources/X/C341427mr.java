package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import com.facebook.cameracore.audiograph.CameraAudioManager;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import java.util.HashMap;
import java.util.Locale;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.7mr  reason: invalid class name and case insensitive filesystem */
public final class C341427mr {
    public C39894ADw A00;
    public C3730893y A01;
    public C3730993z A02;
    public C3730593v A03;
    public C371238xr A04;
    public AudioServiceConfigurationAnnouncer A05;
    public Object A06;
    public boolean A07;
    public boolean A08 = false;
    public final Context A09;
    public final AudioManager A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final AudioAttributesCompat A0D;
    public final C341507n0 A0E = new C341497mz(this);
    public final C341437ms A0F;
    public final C341477mx A0G;
    public final C341487my A0H = new Object();
    public final C341457mv A0I;
    public final C263534Mj A0J;
    public final C341407mp A0K;
    public final C344037rD A0L;
    public final C343967r6 A0M;
    public final C341417mq A0N;
    public final boolean A0O;
    public volatile AudioGraphClientProvider A0P;

    public static void A01(Handler handler, C391719tX r4, C341687nM r5, String str) {
        handler.post(new C41104AoQ(r4, r5, String.format((Locale) null, "%s error: %s", new Object[]{str, r4.getMessage()})));
    }

    public final synchronized HashMap A03() {
        return C341457mv.A00(this.A0A, this.A0I, this.A03);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.7mx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.7my, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.media.AudioAttributesImpl, java.lang.Object, androidx.media.AudioAttributesImplApi21] */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public C341427mr(Context context, C341407mp r8, C344037rD r9, C343967r6 r10, C341417mq r11, boolean z) {
        C341437ms r1 = new C341437ms(r11);
        Handler A012 = C341447mt.A01("audiopipeline_thread");
        C341457mv r3 = new C341457mv();
        ? obj = new Object();
        this.A0G = obj;
        Context applicationContext = context.getApplicationContext();
        this.A09 = applicationContext;
        this.A0M = r10;
        this.A0L = r9;
        this.A0N = r11;
        this.A0I = r3;
        this.A0F = r1;
        this.A08 = r10.CTO(69);
        this.A0C = new Handler(Looper.getMainLooper());
        this.A0K = r8;
        this.A06 = new C341517n1(this);
        this.A0B = A012;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager != null) {
            this.A0A = audioManager;
            this.A0J = new C263534Mj(audioManager);
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(3);
            builder.setUsage(1);
            builder.setContentType(2);
            AudioAttributes build = builder.build();
            ? obj2 = new Object();
            obj2.A01 = build;
            obj2.A00 = -1;
            ? obj3 = new Object();
            obj3.A00 = obj2;
            this.A0D = obj3;
            obj.A01 = r9;
            this.A0O = z;
            r3.A05.A01("c");
            return;
        }
        throw new RuntimeException("Cannot obtain AUDIO_SERVICE");
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [X.AQc, java.lang.Object] */
    public static synchronized int A00(C341427mr r23) {
        int i;
        String str;
        AudioPipelineImpl audioPipelineImpl;
        C341427mr r0 = r23;
        synchronized (r0) {
            if (r0.A03 != null) {
                i = 0;
            } else {
                C344037rD r15 = r0.A0L;
                r15.DD9(20);
                if (AudioPipelineImpl.sIsNativeLibLoaded) {
                    str = "True";
                } else {
                    str = "False";
                }
                r15.CvU(20, "isNativeLibAlreadyLoaded", str);
                r0.A01 = new C3730893y(r0);
                r0.A02 = new C3730993z(r0);
                AnonymousClass940 r11 = new AnonymousClass940(r0);
                r15.DD7(20, "audiopipeline_init_native_lib_start");
                synchronized (AudioPipelineImpl.class) {
                    if (!AudioPipelineImpl.sIsNativeLibLoaded) {
                        0dV.A0C("audiograph-native");
                        AudioPipelineImpl.sIsNativeLibLoaded = true;
                    }
                }
                r15.DD7(20, "audiopipeline_init_native_lib_end");
                try {
                    C341437ms r4 = r0.A0F;
                    C343967r6 r7 = r0.A0M;
                    int B4o = (int) r7.B4o(22);
                    if (B4o <= 0) {
                        B4o = C249703kE.FLAG_MOVED;
                    }
                    int i2 = 44100;
                    if (r7.CTP(74)) {
                        i2 = 48000;
                    }
                    C3730893y r9 = r0.A01;
                    C3730993z r10 = r0.A02;
                    Handler handler = r0.A0B;
                    C341417mq r14 = r4.A00;
                    if (r7.CTO(69)) {
                        ? obj = new Object();
                        CameraAudioManager cameraAudioManager = new CameraAudioManager((float) i2);
                        obj.A00 = cameraAudioManager;
                        cameraAudioManager.getSampleRate();
                        audioPipelineImpl = obj;
                    } else {
                        audioPipelineImpl = new AudioPipelineImpl(B4o, i2, r7, IgNetworkConsentStorage.MAX_ENTRIES, r9, r10, r11, (B0T) null, handler, r14);
                    }
                    r0.A03 = audioPipelineImpl;
                    C341487my r2 = r0.A0H;
                    C341457mv r1 = r0.A0I;
                    r2.A00 = handler;
                    r2.A02 = audioPipelineImpl;
                    r2.A01 = r1;
                    r15.DD7(20, "audiopipeline_init_ctor_end");
                    if (r0.A08 || r0.A0O) {
                        C3730593v r5 = r0.A03;
                        int i3 = 2;
                        if (r7.CTP(76)) {
                            i3 = 4;
                        }
                        int i4 = 1;
                        if (r7.CTP(77)) {
                            i4 = 2;
                        }
                        i = r5.createFbaProcessingGraph(i3, i4, r0.A0G);
                    } else {
                        C3730593v r52 = r0.A03;
                        int i5 = 2;
                        if (r7.CTP(76)) {
                            i5 = 4;
                        }
                        int i6 = 1;
                        if (r7.CTP(77)) {
                            i6 = 2;
                        }
                        i = r52.createManualProcessingGraph(i5, i6, r0.A0G);
                    }
                    r15.DD7(20, "audiopipeline_init_create_graph_end");
                    Context context = r0.A09;
                    AudioManager audioManager = r0.A0A;
                    r0.A04 = new C371238xr(context, audioManager, handler, new C371228xq(r0));
                    Object obj2 = r0.A06;
                    if (obj2 != null) {
                        audioManager.registerAudioDeviceCallback((AudioDeviceCallback) obj2, handler);
                    }
                    r15.DD4(20);
                } catch (Exception e) {
                    0KC.A0F("AudioPipelineController", "Error creating AudioPipeline", e);
                    C391719tX r3 = new C391719tX(40000, (Throwable) e);
                    i = 34;
                    r15.ChC(r3, "audio_pipeline_error", "AudioPipelineController", "high", "init", "fba_error", (long) r0.hashCode());
                }
            }
        }
        return i;
    }

    public final AudioGraphClientProvider A02() {
        C3730593v r0;
        this.A0I.A05.A01("getAGCP");
        int A002 = A00(this);
        if (A002 != 0 && A002 != 4) {
            this.A0L.ChC(new C382299dT("Failed to init when requesting Audio Graph Client Provider"), "audio_pipeline_error", "AudioPipelineController", "debug", "getAudioGraphClientProvider", String.valueOf(A002), (long) hashCode());
        } else if (this.A0P == null && (r0 = this.A03) != null) {
            this.A0P = r0.getAudioGraphClientProvider();
        }
        return this.A0P;
    }

    public final void A04() {
        this.A0I.A05.A01("d");
        this.A0B.post(new C378719Qy(this));
    }

    public final void A05() {
        this.A0I.A05.A01("p");
        this.A0B.post(new C346497vH(this, new C346487vG(this)));
    }

    public final void A06(C341687nM r3, Handler handler) {
        this.A0I.A05.A01("r");
        if (!this.A0B.post(new C3730493t(handler, this, r3)) && r3 != null && handler != null) {
            handler.post(new C40934Alg(this, r3));
        }
    }
}
