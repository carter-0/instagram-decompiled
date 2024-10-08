package X;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Pg  reason: invalid class name and case insensitive filesystem */
public final class C331037Pg implements C331117Pq {
    public C69222Nhc A00;
    public AnonymousClass7JQ A01;
    public OFQ A02;
    public C18581VuX A03;
    public AnonymousClass7GR A04;
    public AnonymousClass7GP A05;
    public C14044Tol A06;
    public String A07;
    public AnonymousClass7GQ A08;
    public final Context A09;
    public final UserSession A0A;
    public final AnonymousClass7GO A0B = new AnonymousClass7GO();
    public final AnonymousClass4DU A0C;

    private void A00() {
        SensorManager sensorManager;
        C18851W5y w5y;
        OFQ ofq = this.A02;
        if (ofq != null) {
            C18581VuX vuX = this.A03;
            if (vuX == null) {
                UserSession userSession = this.A0A;
                Context context = this.A09;
                Integer num = ofq.A03;
                C73503Pdk pdk = new C73503Pdk(this);
                0qQ.A0B(num, 3);
                if (num == AnonymousClass05K.A01) {
                    0Tu r2 = 0Tu.A05;
                    if (182.A06(r2, userSession, 36323642228944216L)) {
                        vuX = new C18581VuX(context, this, pdk, (int) 182.A01(r2, userSession, 36605117205976250L), (int) 182.A00(r2, userSession, 37168067159458256L), 182.A06(r2, userSession, 36323642229140827L));
                        this.A03 = vuX;
                    }
                }
                vuX = null;
                this.A03 = vuX;
            }
            if (vuX != null) {
                Integer num2 = this.A02.A03;
                0qQ.A0B(num2, 0);
                if (!C394329xu.A00(vuX.A03) && (sensorManager = vuX.A05) != null && vuX.A04 != null && (w5y = vuX.A00) != null && num2 == AnonymousClass05K.A01) {
                    0qQ.A0B(sensorManager, 0);
                    w5y.A00 = System.currentTimeMillis();
                    boolean A012 = C60240fb.A01(w5y.A03, w5y, sensorManager, 2);
                    w5y.A01 = A012;
                    if (A012) {
                        vuX.A07.A00(vuX.A02);
                    }
                }
            }
        }
    }

    public final void A08(AnonymousClass7JP r15, AnonymousClass7JQ r16, DirectMessageIdentifier directMessageIdentifier, Integer num, String str) {
        A07(r15, C254923tH.DJANGO, r16, (1Xj) null, directMessageIdentifier, num, AnonymousClass05K.A0N, AnonymousClass05K.A0j, 0L, str, (String) null, false, false);
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r1) {
    }

    public final void Dxy(C263754Nf r1) {
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onPrepare(C263754Nf r1) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
        this.A02 = null;
        this.A01 = null;
        C18581VuX vuX = this.A03;
        if (vuX != null) {
            vuX.A01();
        }
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final int A01() {
        C14044Tol tol = this.A06;
        if (tol != null) {
            return tol.A06.getCurrentPositionMs();
        }
        return 0;
    }

    public final int A02() {
        C14044Tol tol = this.A06;
        if (tol != null) {
            return tol.A06.AzN();
        }
        return 0;
    }

    public final void A03() {
        if (this.A06 != null) {
            A00();
            this.A06.A0C("resume", false);
            OFQ ofq = this.A02;
            if (ofq == null || ofq.A03 != AnonymousClass05K.A00) {
                AnonymousClass7GP r3 = this.A05;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                r3.A00((C69475NmJ) null, timeUnit.toSeconds((long) A01()), timeUnit.toSeconds((long) A02()));
                return;
            }
            AnonymousClass7GP r7 = this.A05;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long seconds = timeUnit2.toSeconds((long) A01());
            long seconds2 = timeUnit2.toSeconds((long) A02());
            0wc r2 = r7.A00;
            0Aj A002 = r2.A00(r2.A00, "music_sharing_playback_resume");
            if (A002.isSampled()) {
                A002.A9F("position", Long.valueOf(seconds));
                A002.A9F(TraceFieldType.Duration, Long.valueOf(seconds2));
                A002.Cgf();
            }
        }
    }

    public final void A04(int i) {
        if (this.A06 != null) {
            AnonymousClass7GQ r3 = this.A08;
            r3.removeMessages(1);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds((long) A01());
            if (r3.A02 == -1) {
                r3.A02 = seconds;
            }
            r3.A01 = timeUnit.toSeconds((long) i);
            r3.A00 = timeUnit.toSeconds((long) A02());
            this.A06.A05(i, true);
            r3.sendEmptyMessageDelayed(1, 1000);
        }
    }

    public final void A05(int i) {
        AnonymousClass4MM r0;
        C14044Tol tol = this.A06;
        if (tol != null && (r0 = ((AnonymousClass4M1) tol.A06).A0K) != null) {
            C263634Mt r3 = r0.A09.A0I;
            Integer valueOf = Integer.valueOf(i);
            C263634Mt.A05(r3, "setAudioUsage: %d", valueOf);
            Handler handler = r3.A0E;
            handler.sendMessage(handler.obtainMessage(23, valueOf));
        }
    }

    public final void A06(AnonymousClass7JP r3) {
        OFQ ofq = this.A02;
        if (ofq != null && r3 == ofq.A00) {
            ofq.A00 = null;
        }
    }

    public final void A07(AnonymousClass7JP r29, C254923tH r30, AnonymousClass7JQ r31, 1Xj r32, DirectMessageIdentifier directMessageIdentifier, Integer num, Integer num2, Integer num3, Long l, String str, String str2, boolean z, boolean z2) {
        String str3;
        AnonymousClass3WR A002;
        int i;
        TimeUnit timeUnit;
        long seconds;
        0Aj A003;
        C14044Tol tol = this.A06;
        boolean z3 = true;
        if (tol != null && (tol.A0F() || tol.A01)) {
            if (tol.A0F()) {
                A0C(true);
            }
            A0B("context_switch");
        }
        DirectMessageIdentifier directMessageIdentifier2 = directMessageIdentifier;
        if (directMessageIdentifier != null) {
            str3 = directMessageIdentifier2.A00;
        } else {
            str3 = null;
        }
        P0M p0m = new P0M(r30, r32, Boolean.valueOf(z), num2, num3, l, str2, z2);
        Integer num4 = num;
        this.A02 = new OFQ(p0m, r29, directMessageIdentifier2, num4);
        AnonymousClass7GR r1 = this.A04;
        r1.A01(str3);
        if (this.A06 == null) {
            UserSession userSession = this.A0A;
            AnonymousClass4DU r6 = this.A0C;
            C69222Nhc nhc = new C69222Nhc(userSession, r1, r6, this.A07);
            this.A00 = nhc;
            this.A06 = new C14044Tol(this.A09, userSession, nhc, this, r6.getModuleName());
        }
        this.A01 = r31;
        A00();
        1Xj r4 = p0m.A01;
        String str4 = str;
        if (r4 != null) {
            A002 = r4.A2C();
        } else {
            C271394im r62 = new C271394im(AnonymousClass05K.A0u, UUID.randomUUID().toString());
            r62.A04 = ProductType.DIRECT_AUDIO;
            r62.A03 = new C72228Oyw(this, str4);
            r62.A0G = true;
            r62.A02 = -1;
            if (str == null || str4.isEmpty()) {
                z3 = false;
            }
            r62.A0I = z3;
            if (num4 == AnonymousClass05K.A00) {
                r62.A0A = "undefined";
                ArrayList arrayList = new ArrayList();
                arrayList.add("undefined");
                r62.A0D = arrayList;
            }
            A002 = r62.A00();
        }
        C21297XTr xTr = (C21297XTr) this.A0B.A01(directMessageIdentifier2);
        if (xTr == null || (i = xTr.A00) == xTr.A01) {
            i = 0;
        }
        this.A06.A09((C242423Ua) null, A002, this.A02.A02, str4, this.A0C.getModuleName(), 1.0f, -1, i, false, true);
        if (r4 == null || r4.A0C.AdR() == null || r4.A0C.AdR().AzI() == null) {
            timeUnit = TimeUnit.MILLISECONDS;
            seconds = timeUnit.toSeconds((long) A02());
        } else {
            timeUnit = TimeUnit.MILLISECONDS;
            seconds = timeUnit.toSeconds(r4.A0C.AdR().AzI().longValue());
        }
        Integer num5 = AnonymousClass05K.A00;
        AnonymousClass7GP r7 = this.A05;
        long seconds2 = timeUnit.toSeconds((long) A01());
        0wc r42 = r7.A00;
        if (num4 == num5) {
            A003 = r42.A00(r42.A00, "music_sharing_playback_start");
            if (A003.isSampled()) {
                A003.A9F("position", Long.valueOf(seconds2));
                A003.A9F(TraceFieldType.Duration, Long.valueOf(seconds));
            } else {
                return;
            }
        } else {
            A003 = r42.A00(r42.A00, "audio_clips_playback_start");
            if (A003.isSampled()) {
                A003.A9F("position", Long.valueOf(seconds2));
                A003.A9F(TraceFieldType.Duration, Long.valueOf(seconds));
                A003.AAJ("attachment_id", (String) null);
                A003.A7p("has_access_token", false);
            } else {
                return;
            }
        }
        A003.Cgf();
    }

    public final void A09(AnonymousClass7JP r3, DirectMessageIdentifier directMessageIdentifier) {
        OFQ ofq;
        if (this.A06 != null && (ofq = this.A02) != null && directMessageIdentifier.A02(ofq.A01)) {
            ofq.A00 = r3;
        }
    }

    public final void A0A(String str) {
        if (this.A06 != null) {
            A0C(false);
            this.A06.A0B(str);
            this.A06 = null;
            this.A04.A00 = null;
        }
        C18581VuX vuX = this.A03;
        if (vuX != null) {
            vuX.A01();
            vuX.A00 = null;
        }
        this.A03 = null;
    }

    public final void A0B(String str) {
        C14044Tol tol = this.A06;
        if (tol != null) {
            tol.A0D(str, true);
        }
        C18581VuX vuX = this.A03;
        if (vuX != null) {
            vuX.A01();
        }
    }

    public final void A0C(boolean z) {
        String str;
        0Aj A002;
        AnonymousClass7JP r0;
        C18581VuX vuX = this.A03;
        if (vuX != null) {
            vuX.A01();
        }
        C14044Tol tol = this.A06;
        if (tol != null) {
            if (z) {
                str = "tapped";
            } else {
                str = "fragment_paused";
            }
            tol.A0A(str);
            OFQ ofq = this.A02;
            if (!(ofq == null || (r0 = ofq.A00) == null)) {
                r0.Cwj();
            }
            OFQ ofq2 = this.A02;
            if (ofq2 == null || ofq2.A03 != AnonymousClass05K.A00) {
                AnonymousClass7GP r8 = this.A05;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long seconds = timeUnit.toSeconds((long) A01());
                long seconds2 = timeUnit.toSeconds((long) A02());
                0wc r2 = r8.A00;
                A002 = r2.A00(r2.A00, "audio_clips_playback_pause");
                if (A002.isSampled()) {
                    A002.A9F("position", Long.valueOf(seconds));
                    A002.A9F(TraceFieldType.Duration, Long.valueOf(seconds2));
                    A002.AAJ("attachment_id", (String) null);
                    A002.A7p("has_access_token", false);
                } else {
                    return;
                }
            } else {
                AnonymousClass7GP r7 = this.A05;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long seconds3 = timeUnit2.toSeconds((long) A01());
                long seconds4 = timeUnit2.toSeconds((long) A02());
                0wc r22 = r7.A00;
                A002 = r22.A00(r22.A00, "music_sharing_playback_pause");
                if (A002.isSampled()) {
                    A002.A9F("position", Long.valueOf(seconds3));
                    A002.A9F(TraceFieldType.Duration, Long.valueOf(seconds4));
                } else {
                    return;
                }
            }
            A002.Cgf();
        }
    }

    public final boolean A0D() {
        C14044Tol tol = this.A06;
        if (tol == null || !tol.A0F()) {
            return false;
        }
        return true;
    }

    public final boolean A0E(DirectMessageIdentifier directMessageIdentifier) {
        OFQ ofq;
        C14044Tol tol = this.A06;
        if (tol == null || tol.A01 || (ofq = this.A02) == null || !directMessageIdentifier.A02(ofq.A01)) {
            return false;
        }
        return true;
    }

    public final void onCompletion() {
        DirectMessageIdentifier directMessageIdentifier;
        C21297XTr xTr;
        AnonymousClass7JP r1;
        OFQ ofq = this.A02;
        if (ofq != null) {
            directMessageIdentifier = ofq.A01;
            if (!(directMessageIdentifier == null || (xTr = (C21297XTr) this.A0B.A01(directMessageIdentifier)) == null)) {
                int i = xTr.A01;
                xTr.A00 = i;
                OFQ ofq2 = this.A02;
                if (!(ofq2 == null || (r1 = ofq2.A00) == null)) {
                    r1.Cwk(i, i, false);
                    ofq2.A00.Cwj();
                }
            }
        } else {
            directMessageIdentifier = null;
        }
        AnonymousClass7JQ r0 = this.A01;
        if (r0 != null) {
            r0.Cwi(directMessageIdentifier);
        }
        C14044Tol tol = this.A06;
        if (tol != null) {
            tol.A0D("finished", true);
        }
        C18581VuX vuX = this.A03;
        if (vuX != null) {
            vuX.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.XTr] */
    public final void onProgressUpdate(int i, int i2, boolean z) {
        AnonymousClass7JP r0;
        DirectMessageIdentifier directMessageIdentifier;
        OFQ ofq = this.A02;
        if (!(ofq == null || (directMessageIdentifier = ofq.A01) == null)) {
            AnonymousClass7GO r1 = this.A0B;
            C21297XTr xTr = (C21297XTr) r1.A01(directMessageIdentifier);
            if (xTr != null) {
                xTr.A00 = i;
            } else {
                ? obj = new Object();
                obj.A00 = i;
                obj.A01 = i2;
                r1.A02(directMessageIdentifier, obj);
            }
        }
        OFQ ofq2 = this.A02;
        if (ofq2 != null && (r0 = ofq2.A00) != null) {
            r0.Cwk(i, i2, z);
        }
    }

    public C331037Pg(Context context, UserSession userSession, AnonymousClass4DU r6, String str) {
        this.A09 = context;
        this.A0A = userSession;
        this.A0C = r6;
        this.A07 = str;
        this.A05 = new AnonymousClass7GP(userSession);
        this.A08 = new AnonymousClass7GQ(Looper.getMainLooper(), this.A05);
        this.A04 = new AnonymousClass7GR(userSession);
    }
}
