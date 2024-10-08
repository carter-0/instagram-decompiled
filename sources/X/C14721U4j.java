package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.instagram.android.R;
import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.U4j  reason: case insensitive filesystem */
public final class C14721U4j extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Point A07;
    public ViewGroup A08;
    public VU5 A09;
    public LiveVideoDebugStatsView A0A;
    public String A0B;
    public String A0C = "NO_INIT";
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public CheckBox A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public 214 A0M;
    public 214 A0N;
    public AnonymousClass4Yf A0O;
    public AnonymousClass4Yf A0P;
    public C255623uR A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public final C17297VPy A0Z;
    public final C17603Vav A0a;
    public final AtomicReference A0b = new AtomicReference(0sn.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14721U4j(Context context, C17297VPy vPy) {
        super(context);
        0qQ.A0B(context, 1);
        this.A0Z = vPy;
        214 r0 = 214.A06;
        this.A0N = r0;
        this.A0M = r0;
        this.A0V = "Undefined";
        this.A0W = "";
        LayoutInflater.from(context).inflate(R.layout.player_debug_view, this);
        this.A08 = DbS.A0E(this, R.id.container_view);
        this.A0J = AnonymousClass7TE.A0d(this, R.id.info_text);
        this.A0I = AnonymousClass7TE.A0d(this, R.id.error_text);
        this.A0H = AnonymousClass7TE.A0d(this, R.id.compact_info_text);
        this.A0L = AnonymousClass7TE.A0d(this, R.id.set_quality_button);
        CheckBox checkBox = (CheckBox) findViewById(R.id.background_checkbox);
        this.A0G = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(false);
            this.A08.setBackgroundColor(0);
            C18921WCy.A00(checkBox, this, 4);
        }
        this.A0A = (LiveVideoDebugStatsView) findViewById(R.id.live_video_debug_stats);
        this.A0a = new C17603Vav(this);
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.set_bandwidth_button);
        this.A0K = A0d;
        A0d.setOnClickListener(new ID1((Object) this, 46));
        this.A0H.setOnClickListener(new WB0(this, 41));
        0tS A002 = 0tS.A4E.A00();
        if (AnonymousClass7TG.A1a(A002, A002.A2t, 0tS.A4G, 90)) {
            A02(this);
        } else {
            A00(this);
            this.A0J.setOnClickListener(new WB0(this, 42));
        }
        A04();
    }

    public final void A04() {
        this.A0O = null;
        this.A0P = null;
        this.A0B = null;
        this.A0F = -1;
        this.A02 = -1;
        this.A0T = null;
        this.A0S = null;
        this.A0U = null;
        this.A05 = -1;
        this.A04 = -1;
        this.A06 = -1;
        this.A01 = -1;
        this.A0X = "";
        C17603Vav vav = this.A0a;
        vav.A01 = 0;
        int i = 0;
        vav.A00 = 0;
        vav.A02 = false;
        do {
            vav.A03[i] = 0;
            vav.A04[i] = 0;
            i++;
        } while (i < 3);
    }

    public final void setExtraFeatureDebugInfo(String str) {
        0qQ.A0B(str, 0);
        this.A0R = str;
    }

    public final void setFormat(AnonymousClass4Yf r4) {
        0qQ.A0B(r4, 0);
        String str = r4.A0E;
        0qQ.A06(str);
        if (00l.A0d(str, MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
            this.A0P = r4;
        }
        if (00l.A0d(str, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
            this.A0O = r4;
        }
    }

    public final void setLatencyDecision(AnonymousClass4P1 r2) {
        0qQ.A0B(r2, 0);
        this.A0N = r2.A01;
        214 r0 = r2.A00;
        if (r0 == null) {
            r0 = 214.A06;
        }
        this.A0M = r0;
        String str = r2.A02;
        if (str == null) {
            str = "Undefined";
        }
        this.A0V = str;
    }

    public final void setPlayerId(String str) {
        0qQ.A0B(str, 0);
        this.A0W = str;
    }

    public final void setVideoSource(C255653uU r7) {
        String str;
        String str2 = null;
        if (r7 == null) {
            this.A0F = -1;
            this.A0P = null;
            this.A0Q = null;
            return;
        }
        C255623uR r4 = r7.A07;
        this.A0Q = r4;
        this.A0X = r7.A0G;
        Uri uri = r7.A05;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = null;
        }
        int i = 0;
        if (!r7.A03() || str == null ? r7.A09 != null : 00l.A0d(str, "-abr", false)) {
            i = 1;
        }
        this.A0F = i;
        if (r4 == C255623uR.PROGRESSIVE) {
            Uri uri2 = r7.A05;
            if (uri2 != null) {
                str2 = uri2.getScheme();
            }
            if ("file".equals(str2)) {
                this.A0Y = true;
            }
        }
    }

    public static final void A00(C14721U4j u4j) {
        u4j.A0L.setVisibility(4);
        CheckBox checkBox = u4j.A0G;
        checkBox.setVisibility(4);
        u4j.A0K.setVisibility(4);
        u4j.A0J.setVisibility(4);
        u4j.A0I.setVisibility(4);
        u4j.A0H.setVisibility(0);
        checkBox.setChecked(false);
    }

    public static void A03(String str, String str2, StringBuilder sb) {
        sb.append(002.A0S(str, str2, 10));
    }

    private final List getAvailableCustomQualities() {
        List list = (List) this.A0b.get();
        if (list == null) {
            return 0sn.A00;
        }
        return list;
    }

    private final float getBufferedDurationInSec() {
        long j = this.A04;
        if (j <= 0) {
            return -1.0f;
        }
        long j2 = this.A05;
        if (j2 > 0) {
            return ((float) (j - j2)) / 1000.0f;
        }
        return -1.0f;
    }

    private final float getCurrentPositionInSec() {
        long j = this.A05;
        if (j > 0) {
            return ((float) j) / 1000.0f;
        }
        return -1.0f;
    }

    private final StringBuilder getVideoQualityMosText() {
        int i;
        int i2;
        Float f;
        Float f2;
        StringBuilder sb = new StringBuilder();
        AnonymousClass4Yf r3 = this.A0P;
        if (r3 != null) {
            Point point = this.A07;
            if (point != null) {
                i = point.x;
            } else {
                i = C13988Tno.A0F(this).widthPixels;
            }
            Point point2 = this.A07;
            if (point2 != null) {
                i2 = point2.y;
            } else {
                i2 = C13988Tno.A0F(this).heightPixels;
            }
            String str = r3.A0C;
            if (str != null) {
                f = Float.valueOf(MosScoreCalculation.A01(str, i));
            } else {
                f = null;
            }
            float A022 = MosScoreCalculation.A02(r3.A09, i, i2);
            float A023 = MosScoreCalculation.A02(r3.A08, i, i2);
            Float valueOf = Float.valueOf(A022);
            if (f == null || valueOf == null) {
                f2 = null;
            } else {
                double floatValue = (double) f.floatValue();
                f2 = Float.valueOf(new BigDecimal(String.valueOf(((floatValue * 1.4148d) - 0.0592480517578125d) + (floatValue * 0.005351d * ((double) A022)))).setScale(2, RoundingMode.UP).floatValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mos=");
            sb2.append(A022);
            sb2.append(" csvqm=");
            sb2.append(A023);
            sb2.append(" uumos=");
            sb2.append(f);
            sb.append(AnonymousClass7TG.A0m(f2, " overallMos=", sb2));
        }
        return sb;
    }

    public final void A05() {
        String str;
        float f;
        long j;
        long j2;
        String str2;
        int i;
        String A002 = AnonymousClass000.A00(4361);
        StringBuilder sb = new StringBuilder();
        sb.append("playerVersion: ");
        sb.append(002.A0g(A002, " | PlayerId: ", this.A0W));
        sb.append("\n");
        String str3 = this.A0X;
        if (str3 != null) {
            A03("video id: ", str3, sb);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is warmed: ");
        sb2.append(this.A0E);
        sb2.append(", abr: ");
        sb2.append(this.A0F);
        sb2.append(10);
        Pxf.A1O(sb, sb2);
        String str4 = "NO_INIT";
        if (!0qQ.A0K(this.A0C, str4)) {
            if (00l.A0d(this.A0C, "SurfaceTexture", false)) {
                i = 2512;
            } else {
                i = 2505;
            }
            str4 = AnonymousClass000.A00(i);
        }
        A03("View used: ", str4, sb);
        Point point = this.A07;
        if (point != null) {
            sb.append(002.A0X("view size: ", " x ", 10, point.x, point.y));
        }
        AnonymousClass4Yf r3 = this.A0P;
        if (r3 != null) {
            sb.append(002.A0X("video size: ", " x ", 10, r3.A05, r3.A04));
        }
        C17603Vav vav = this.A0a;
        long[] jArr = vav.A04;
        sb.append(StringFormatUtil.formatStrLocaleSafe("Stalls: init: %d, buffering: %d, count: %d, total: %d\n", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]), Integer.valueOf(vav.A00), Long.valueOf(vav.A01)));
        int i2 = this.A01;
        if (i2 > 0) {
            sb.append(002.A0c("injected delay: ", " ms\n", i2));
        }
        if (r3 != null) {
            sb.append("\nVideo:\n");
            sb.append(002.A0c("bitrate: ", " kbps\n", r3.A02 / IgNetworkConsentStorage.MAX_ENTRIES));
            if (this.A0Y) {
                str2 = "original";
            } else {
                str2 = r3.A0D;
            }
            A03("rep id: ", str2, sb);
        }
        int i3 = this.A02;
        if (i3 >= 0) {
            sb.append(002.A0c("bandwidth: ", " kbps\n", i3));
        }
        sb.append(002.A0Z("current pos: ", "s, ", getCurrentPositionInSec()));
        sb.append(002.A0Z("buffered duration: ", "s\n", getBufferedDurationInSec()));
        if (this.A06 > 0) {
            sb.append("Live Data:");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("\nPlayback Speed: ");
            sb3.append(this.A00);
            sb3.append(" Buffered Duration: ");
            sb3.append(this.A03);
            Pxf.A1O(sb, sb3);
            214 r2 = this.A0N;
            if (r2 != 214.A06) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Target:");
                sb4.append(r2);
                sb4.append(", Current:");
                sb4.append(this.A0M);
                sb4.append(", reason:");
                sb4.append(this.A0V);
                Pxf.A1O(sb, sb4);
            }
            long j3 = this.A04;
            if (j3 > 0) {
                f = ((float) (this.A06 - j3)) / 1000.0f;
            } else {
                f = -1.0f;
            }
            sb.append(0mp.A06("\nedge: %.1f\n", new Object[]{Float.valueOf(f)}));
            VU5 vu5 = this.A09;
            if (vu5 != null) {
                j = vu5.A01;
                j2 = vu5.A00;
            } else {
                j = 0;
                j2 = 0;
            }
            LiveVideoDebugStatsView liveVideoDebugStatsView = this.A0A;
            long j4 = this.A05;
            long j5 = this.A04;
            long j6 = this.A06;
            if (liveVideoDebugStatsView.getVisibility() != 0) {
                liveVideoDebugStatsView.setVisibility(0);
            }
            liveVideoDebugStatsView.A06 = j;
            liveVideoDebugStatsView.A03 = j2;
            liveVideoDebugStatsView.A04 = j4;
            liveVideoDebugStatsView.A02 = j5;
            liveVideoDebugStatsView.A05 = j6;
        }
        AnonymousClass4Yf r0 = this.A0P;
        if (r0 != null) {
            A03("format.codecs: ", r0.A06, sb);
        }
        String str5 = this.A0B;
        if (str5 != null) {
            A03("decoder name: ", str5, sb);
        }
        C255623uR r22 = this.A0Q;
        if (r22 != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("source type: ");
            sb5.append(r22);
            sb5.append(10);
            Pxf.A1O(sb, sb5);
        }
        AnonymousClass4Yf r23 = this.A0P;
        if (r23 != null) {
            A03("selected quality: ", r23.A0B, sb);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(getVideoQualityMosText());
            sb6.append(10);
            Pxf.A1O(sb, sb6);
            A03("encoding tag: ", r23.A07, sb);
        }
        List availableCustomQualities = getAvailableCustomQualities();
        if (!availableCustomQualities.isEmpty()) {
            A03("qualities: ", C66581MXm.A0w(",", availableCustomQualities), sb);
        }
        AnonymousClass4Yf r24 = this.A0O;
        if (r24 != null) {
            sb.append("\nAudio:\n");
            A03("audio codecs: ", r24.A06, sb);
            A03("audio rep id: ", r24.A0D, sb);
            sb.append(002.A0c("audio bitrate: ", " kbps\n", r24.A02 / IgNetworkConsentStorage.MAX_ENTRIES));
            sb.append(002.A0I("audio sample rate: ", 10, r24.A01));
            sb.append(002.A0I("audio channel: ", 10, r24.A00));
            A03("audio encoding tag: ", r24.A07, sb);
        }
        0KC.A0P("ig4a.video-overlay", "%s", new Object[]{00p.A0g(DbT.A10(sb), "\n", ";", false)});
        TextView textView = this.A0J;
        textView.setText(sb);
        float f2 = 0.5f;
        if (this.A0D) {
            f2 = 1.0f;
        }
        textView.setAlpha(f2);
        float f3 = 50.0f;
        if (this.A0D) {
            f3 = 0.0f;
        }
        textView.setTranslationY(f3);
        StringBuilder sb7 = new StringBuilder();
        String str6 = this.A0T;
        if (str6 != null) {
            sb7.append(str6);
        }
        String str7 = this.A0S;
        if (str7 != null) {
            sb7.append(" \n");
            sb7.append(str7);
        }
        String str8 = this.A0U;
        if (str8 != null) {
            sb7.append(" \n");
            sb7.append(str8);
        }
        this.A0I.setText(sb7);
        StringBuilder sb8 = new StringBuilder();
        AnonymousClass4Yf r12 = this.A0P;
        if (r12 != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("video: ");
            sb9.append(r12.A05);
            sb9.append('x');
            sb9.append(r12.A04);
            sb9.append(' ');
            sb9.append(r12.A02 / IgNetworkConsentStorage.MAX_ENTRIES);
            sb9.append("kb/s abr:");
            sb9.append(this.A0F);
            Pxf.A1O(sb8, sb9);
            String str9 = r12.A07;
            if (str9 != null) {
                sb8.append(G9w.A0k(" (", 00l.A0G("_v1", 00l.A0F("dash_", str9))));
            }
            sb8.append("\n");
            StringBuilder sb10 = new StringBuilder();
            sb10.append(getVideoQualityMosText());
            sb10.append(10);
            Pxf.A1O(sb8, sb10);
        }
        AnonymousClass4Yf r11 = this.A0O;
        if (r11 != null) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("audio: ");
            if (r11.A00 == 1) {
                str = "mono";
            } else {
                str = "stereo";
            }
            sb11.append(str);
            sb11.append(' ');
            sb11.append(r11.A01);
            sb11.append("hz ");
            sb11.append(r11.A02 / IgNetworkConsentStorage.MAX_ENTRIES);
            sb11.append("kb/s");
            Pxf.A1O(sb8, sb11);
            String str10 = r11.A07;
            if (str10 != null) {
                sb8.append(G9w.A0k(" (", 00l.A0G("_v1", 00l.A0F("dash_", str10))));
            }
            sb8.append("\n");
        }
        Point point2 = this.A07;
        if (point2 != null) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("view: ");
            sb12.append(point2.x);
            sb12.append('x');
            sb12.append(point2.y);
            sb12.append(' ');
            sb12.append(str4);
            Pxf.A1O(sb8, sb12);
            sb8.append("\n");
        }
        String str11 = this.A0R;
        if (str11 != null) {
            sb8.append(str11);
        }
        this.A0H.setText(sb8);
    }

    public final void A06(Integer num) {
        C17603Vav vav = this.A0a;
        long[] jArr = vav.A03;
        int intValue = num.intValue();
        long j = jArr[intValue];
        if (j > 0) {
            vav.A02 = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            vav.A01 += elapsedRealtime;
            long[] jArr2 = vav.A04;
            jArr2[intValue] = jArr2[intValue] + elapsedRealtime;
            jArr[intValue] = 0;
            vav.A00++;
        }
    }

    public final String getDecoderName() {
        return this.A0B;
    }

    public final int getInjectedStartDelayMs() {
        return this.A01;
    }

    public final VU5 getLiveVideoDebugStats() {
        return this.A09;
    }

    public final String getPlayerId() {
        return this.A0W;
    }

    public final long getPreferredTimePeriod() {
        if (this.A06 > 0) {
            return this.A0A.A09;
        }
        return -1;
    }

    public final int getThroughputKbps() {
        return this.A02;
    }

    public final boolean getWasWarmed() {
        return this.A0E;
    }

    public final void setCustomQualities(List list) {
        if (list != null) {
            AtomicReference atomicReference = this.A0b;
            List list2 = (List) atomicReference.get();
            if (list2 == null || list.size() != list2.size() || !list2.containsAll(list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                atomicReference.set(arrayList);
                this.A0L.setOnClickListener(new WB0(this, 43));
            }
        }
    }

    public final void setDecoderName(String str) {
        this.A0B = str;
    }

    public final void setErrorOrWarningCause(String str, String str2, String str3) {
        this.A0T = str;
        this.A0S = str2;
        this.A0U = str3;
    }

    public final void setInjectedStartDelayMs(int i) {
        this.A01 = i;
    }

    public final void setIsPlaying(boolean z) {
        this.A0D = z;
    }

    public final void setLiveVideoDebugStats(VU5 vu5) {
        this.A09 = vu5;
    }

    public final void setPlaying(boolean z) {
        this.A0D = z;
    }

    public final void setThroughputKbps(int i) {
        this.A02 = i;
    }

    public final void setWasWarmed(boolean z) {
        this.A0E = z;
    }

    public static final void A01(C14721U4j u4j) {
        String str;
        String[] A1b = DbU.A1b(u4j.getAvailableCustomQualities(), 0);
        if (A1b.length == 0) {
            str = "No Available Qualities";
        } else {
            str = "Set Quality";
        }
        C358248ab r2 = new C358248ab(u4j.getContext());
        r2.A0e(new C18833W4v(22, A1b, u4j), A1b);
        r2.A0q(str);
        r2.A0r(true);
        r2.A0s(true);
        Dialog A022 = r2.A02();
        Window window = A022.getWindow();
        if (window != null) {
            window.setType(2038);
        }
        AnonymousClass0fN.A00(A022);
    }

    public static final void A02(C14721U4j u4j) {
        boolean canDrawOverlays = Settings.canDrawOverlays(u4j.getContext());
        TextView textView = u4j.A0L;
        if (!canDrawOverlays) {
            textView.setVisibility(4);
            u4j.A0K.setVisibility(4);
        } else {
            textView.setVisibility(0);
            u4j.A0K.setVisibility(0);
        }
        CheckBox checkBox = u4j.A0G;
        checkBox.setVisibility(0);
        u4j.A0J.setVisibility(0);
        u4j.A0I.setVisibility(0);
        u4j.A0H.setVisibility(4);
        checkBox.setChecked(true);
    }
}
