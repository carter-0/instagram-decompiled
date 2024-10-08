package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;

/* renamed from: X.4Ox  reason: invalid class name and case insensitive filesystem */
public final class C264184Ox {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03 = SystemClock.elapsedRealtime();
    public 28m A04;
    public 214 A05;
    public String A06;
    public long A07 = -1;
    public final Handler A08;
    public final 214 A09;
    public final 28T A0A;
    public final HeroPlayerSetting A0B;
    public final Runnable A0C;
    public final VpsEventCallback A0D;
    public final C257163wx A0E;
    public final AnonymousClass4OI A0F;

    public C264184Ox(Handler handler, VpsEventCallback vpsEventCallback, C257163wx r10, AnonymousClass4OI r11, 28T r12, HeroPlayerSetting heroPlayerSetting) {
        String str;
        214 r6;
        214 r0;
        0qQ.A0B(handler, 1);
        this.A08 = handler;
        this.A0B = heroPlayerSetting;
        this.A0F = r11;
        this.A0A = r12;
        this.A0D = vpsEventCallback;
        this.A0E = r10;
        int i = heroPlayerSetting.A0f;
        if (i == 2) {
            str = "ToggleNormal";
            this.A06 = str;
            r6 = 214.A04;
        } else if (i == 1) {
            r6 = 214.A02;
        } else {
            str = "Classifier";
            this.A06 = str;
            r6 = 214.A04;
        }
        this.A09 = r6;
        this.A05 = r6;
        this.A0C = AnonymousClass4P0.A00;
        this.A06 = "";
        if (A00(r6, this).A0g) {
            r0 = 214.A04;
        } else {
            r0 = this.A05;
        }
        this.A05 = r0;
        A05();
        long j = (long) A00(this.A05, this).A0R;
        if (j > 0) {
            this.A08.postDelayed(this.A0C, j);
        }
        A01(r6, this.A05, this, 002.A0R("Initial:", this.A06));
    }

    public static final 217 A00(214 r1, C264184Ox r2) {
        217 r0 = (217) r2.A0B.A1A.get(r1);
        if (r0 == null) {
            return new 217();
        }
        return r0;
    }

    public static final void A01(214 r3, 214 r4, C264184Ox r5, String str) {
        VpsEventCallback vpsEventCallback = r5.A0D;
        System.currentTimeMillis();
        A00(r4, r5);
        vpsEventCallback.callback(new AnonymousClass4P1(r3, r4, str));
        HashMap hashMap = new HashMap();
        hashMap.put("latency_level", r4.toString());
        hashMap.put("target_latency_level", r3.toString());
        hashMap.put("settings", A00(r4, r5).A0a);
        hashMap.put("reason", r5.A06);
    }

    private final boolean A03(int i, int i2) {
        long j;
        28m r0 = this.A04;
        if (r0 != null) {
            j = r0.A00().getEstimatedThroughput(i2, (String) null);
        } else {
            j = 0;
        }
        if (j > ((long) i)) {
            return true;
        }
        return false;
    }

    private final boolean A04(217 r9) {
        28m r0;
        long j;
        String str;
        28m r02;
        if (!r9.A0e || this.A0A.A03.A01()) {
            String str2 = r9.A0Y;
            0qQ.A06(str2);
            if (str2.length() == 0 || 00l.A0d(str2, "UNKNOWN", true)) {
                int i = r9.A0E;
                if (i > 0 && this.A00 <= i) {
                    str = "abr_bitrate";
                } else if (r9.A0f) {
                    str = 002.A0R("not QUIC: ", (String) null);
                } else {
                    int i2 = r9.A0D;
                    if (i2 > 0 && (r02 = this.A04) != null) {
                        r02.A00();
                        if (!A03(i2, r9.A0C)) {
                            str = "low_bandwidth";
                        }
                    }
                    int i3 = r9.A0H;
                    if (i3 > 0 && (r0 = this.A04) != null) {
                        r0.A00();
                        int i4 = r9.A0G;
                        28m r03 = this.A04;
                        if (r03 != null) {
                            j = r03.A00().getEstimatedRequestTTFBMs(i4, (String) null);
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (j >= ((long) i3)) {
                            str = "high_ttfb";
                        }
                    }
                    return false;
                }
            } else {
                str = "connection";
            }
        } else {
            str = "cell";
        }
        this.A06 = str;
        return true;
    }

    public final void A05() {
        boolean z;
        214 r2;
        214 r4;
        String str;
        28m r0;
        String str2;
        String str3;
        28m r02;
        long j;
        28m r03;
        217 A002 = A00(this.A05, this);
        long j2 = this.A07;
        if (j2 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            long j3 = (long) A002.A0S;
            if (elapsedRealtime < j3) {
                long j4 = j3 - elapsedRealtime;
                if (j4 > 0) {
                    this.A08.postDelayed(this.A0C, j4);
                    return;
                }
                return;
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.A03;
        int i = this.A02;
        if (i <= 0 || elapsedRealtime2 < ((long) A002.A0R) || elapsedRealtime2 / ((long) i) >= ((long) A002.A0F)) {
            z = false;
        } else {
            this.A06 = "stalls";
            z = true;
        }
        boolean A042 = A04(A002);
        214 r3 = 214.A06;
        if ((!z && !A042) || this.A05 == (r2 = A002.A0W) || r2 == r3) {
            214 r04 = this.A05;
            r4 = this.A09;
            if (r04.compareTo(r4) > 0) {
                if (this.A0B.A3M) {
                    str2 = "";
                    String str4 = ";";
                    String str5 = str2;
                    int i2 = A002.A0K;
                    if (i2 > 0) {
                        boolean z2 = false;
                        if (this.A00 > i2) {
                            z2 = true;
                        }
                        str3 = "abr_bitrate";
                        if (z2) {
                            str2 = 002.A0g(str2, str2, str3);
                            str5 = str4;
                        }
                        this.A06 = str3;
                        return;
                    }
                    int i3 = A002.A0J;
                    if (i3 <= 0 || (r03 = this.A04) == null) {
                        str4 = str5;
                    } else {
                        r03.A00();
                        if (A03(i3, A002.A0I)) {
                            str2 = 002.A0g(str2, str5, "high_bandwidth");
                        } else {
                            str3 = "low_bandwidth";
                            this.A06 = str3;
                            return;
                        }
                    }
                    int i4 = A002.A0M;
                    if (i4 > 0 && (r02 = this.A04) != null) {
                        r02.A00();
                        int i5 = A002.A0L;
                        28m r05 = this.A04;
                        if (r05 != null) {
                            j = r05.A00().getEstimatedRequestTTFBMs(i5, (String) null);
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        if (j < ((long) i4)) {
                            str2 = 002.A0g(str2, str4, "low_ttfb");
                        } else {
                            str3 = "high_ttfb";
                            this.A06 = str3;
                            return;
                        }
                    }
                    if (str2.length() <= 0) {
                        return;
                    }
                } else {
                    int i6 = A002.A0K;
                    if (i6 <= 0 || this.A00 <= i6) {
                        int i7 = A002.A0J;
                        if (i7 > 0 && (r0 = this.A04) != null) {
                            r0.A00();
                            if (A03(i7, A002.A0I)) {
                                str2 = "high_bandwidth";
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        str2 = "abr_bitrate";
                    }
                }
                this.A06 = str2;
                214 r06 = this.A05;
                r2 = A002.A0X;
                if (r06 != r2 && !A04(A00(r2, this)) && r2 != r3) {
                    str = "Upgrade:";
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            r4 = this.A09;
            str = "Fallback:";
        }
        A01(r4, r2, this, 002.A0R(str, this.A06));
        if (r2 != r3) {
            this.A05 = r2;
            A02(this);
        }
    }

    public static final void A02(C264184Ox r7) {
        r7.A03 = SystemClock.elapsedRealtime();
        r7.A07 = SystemClock.elapsedRealtime();
        r7.A02 = 0;
        Handler handler = r7.A08;
        Runnable runnable = r7.A0C;
        handler.removeCallbacks(runnable);
        long j = (long) A00(r7.A05, r7).A0R;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        }
    }
}
