package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.util.lifecycle.ViewOwnerTracker;
import com.facebook.endtoend.EndToEnd;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public final class WKW implements AnonymousClass4MX, View.OnAttachStateChangeListener, AnonymousClass4M5 {
    public static final HandlerThread A0P = Pxf.A0J("GrootVideoPlayerThread", -2);
    public View A00;
    public VUQ A01;
    public ViewOwnerTracker A02;
    public C263624Ms A03;
    public Integer A04 = AnonymousClass05K.A00;
    public String A05;
    public 0sP A06;
    public 0sP A07;
    public boolean A08;
    public Uri A09;
    public C62472KgN A0A;
    public UKJ A0B;
    public C255653uU A0C;
    public Float A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public final Context A0K;
    public final C55962HqT A0L = new C55962HqT(new C13348TVv(this, 32));
    public final C255623uR A0M;
    public final Integer A0N;
    public final Integer A0O;

    public final void D7z(long j, String str, boolean z) {
    }

    public final void D80(int i, int i2, int i3, int i4) {
    }

    public final void DAN(AnonymousClass4Yf r1, String str, List list, long j, boolean z) {
    }

    public final void DGr(String str, long j) {
    }

    public final void DTt(byte[] bArr, long j) {
    }

    public final void DXW() {
    }

    public final void DZ3() {
    }

    public final void Dpb() {
    }

    public final void Dt7(AnonymousClass4Yf r1, AnonymousClass4Yf r2, String str, String str2, List list, long j) {
    }

    public final void DyK(int i, int i2, float f) {
    }

    public final void Dzg(boolean z) {
    }

    public final void E06(C284815Oa r1) {
    }

    public final void onDrawnToSurface() {
    }

    public final void onViewAttachedToWindow(View view) {
        0qQ.A0B(view, 0);
        if (view instanceof ViewGroup) {
            if (this.A03 == null) {
                UKJ ukj = this.A0B;
                String str = this.A05;
                if (str != null) {
                    String str2 = this.A0G;
                    String str3 = this.A0H;
                    String str4 = this.A0F;
                    C62472KgN kgN = this.A0A;
                    if (kgN != null) {
                        A03(this.A09, kgN, ukj, str, str2, str3, str4, this.A0I);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.A00 == null) {
                this.A00 = viewGroup;
                C263624Ms r1 = this.A03;
                if (r1 != null) {
                    r1.A0A(viewGroup, (Integer) null);
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        0qQ.A0B(view, 0);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.A00 != null) {
                this.A00 = null;
                C263624Ms r0 = this.A03;
                if (r0 != null) {
                    r0.A09(viewGroup);
                }
            }
            A02();
        }
    }

    private final void A00(Integer num) {
        this.A04 = num;
        VUQ vuq = this.A01;
        if (vuq != null) {
            C276544tV r3 = vuq.A01;
            C277014uI r2 = vuq.A02;
            C308276Tl r1 = new C308276Tl();
            r1.A01(V6B.A00(num));
            C307786Rm r0 = vuq.A00;
            r1.A02(r0);
            DbT.A1R(r0, r3, r1, r2);
        }
    }

    public final void A01() {
        boolean z;
        C263624Ms r0 = this.A03;
        if (r0 == null || !r0.A0I.A0J()) {
            z = false;
        } else {
            z = true;
            C263624Ms r1 = this.A03;
            if (r1 != null) {
                C263624Ms.A01(r1, "player_initiated", true);
            }
        }
        this.A08 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3.A08 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            X.4Ms r0 = r3.A03
            if (r0 == 0) goto L_0x0044
            r1 = 1
            X.4Mt r0 = r0.A0I
            boolean r0 = r0.A0J()
            if (r0 == r1) goto L_0x0012
            boolean r0 = r3.A08
            r1 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.A0J = r1
            X.4Ms r0 = r3.A03
            if (r0 == 0) goto L_0x0047
            X.4Mt r0 = r0.A0I
            long r1 = r0.A08()
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0024:
            r3.A0E = r0
            X.4Ms r0 = r3.A03
            if (r0 == 0) goto L_0x0045
            X.4Mt r0 = r0.A0I
            float r0 = r0.A0Q
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0032:
            r3.A0D = r0
            X.4Ms r0 = r3.A03
            if (r0 == 0) goto L_0x003b
            r0.A08()
        L_0x003b:
            r0 = 0
            r3.A03 = r0
            r3.A0C = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A04 = r0
        L_0x0044:
            return
        L_0x0045:
            r0 = 0
            goto L_0x0032
        L_0x0047:
            r0 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WKW.A02():void");
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [X.4Mi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v0, types: [X.4MZ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object, X.4Ma] */
    /* JADX WARNING: type inference failed for: r23v0, types: [java.lang.Object, X.4Me] */
    /* JADX WARNING: type inference failed for: r27v0, types: [java.lang.Object, X.4Mr] */
    /* JADX WARNING: type inference failed for: r5v3, types: [X.4NJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r17v2, types: [X.3uV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [X.273, java.lang.Object] */
    public final void A03(Uri uri, C62472KgN kgN, UKJ ukj, String str, String str2, String str3, String str4, boolean z) {
        Float f;
        int i;
        C263544Mk wKk;
        boolean z2;
        Uri uri2;
        C255653uU r28;
        boolean z3;
        boolean z4;
        0wc A002;
        float f2;
        C263624Ms r2;
        UKJ ukj2 = ukj;
        this.A0B = ukj2;
        String str5 = str;
        this.A05 = str5;
        String str6 = str2;
        this.A0G = str6;
        String str7 = str3;
        this.A0H = str7;
        String str8 = str4;
        this.A0F = str8;
        C62472KgN kgN2 = kgN;
        this.A0A = kgN2;
        this.A0I = z;
        Uri uri3 = uri;
        this.A09 = uri3;
        if (ukj != null) {
            f = ukj2.A01;
        } else {
            f = null;
        }
        Double d = null;
        AnonymousClass4ND r3 = new AnonymousClass4ND(false);
        int ordinal = kgN2.ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else if (ordinal == 2) {
            i = 3;
        } else {
            throw new RuntimeException();
        }
        r3.A01 = i;
        if (f != null) {
            d = Double.valueOf((double) f.floatValue());
        }
        r3.A00 = d;
        r3.A04 = true;
        r3.A05 = true;
        r3.A02 = true;
        r3.A03 = true;
        if (Build.VERSION.SDK_INT >= 29) {
            wKk = V6A.A00(r3);
        } else {
            wKk = new C19080WKk(r3, new C19082WKm((X68[]) Arrays.copyOf(new X68[]{null, null}, 2)));
        }
        C263464Mc r8 = new C263464Mc();
        r8.A01 = false;
        r8.A00 = true;
        HandlerThread handlerThread = A0P;
        if (!handlerThread.isAlive()) {
            handlerThread.start();
        }
        Context context = this.A0K;
        Looper looper = handlerThread.getLooper();
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        Handler A0D2 = AnonymousClass7TF.A0D();
        ? obj4 = new Object();
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        0qQ.A0C(systemService, AnonymousClass000.A00(4));
        C263534Mj r12 = new C263534Mj((AudioManager) systemService);
        C263574Mn r21 = C263574Mn.A01;
        ? obj5 = new Object();
        C17750VeP veP = C18451Vrz.A04;
        synchronized (veP) {
            z2 = C18451Vrz.A03;
        }
        if (!z2) {
            C18457Vs6 vs6 = new C18457Vs6(HeroPlayerSetting.A3e, new Object(), new HashMap());
            synchronized (veP) {
                if (!C18451Vrz.A03) {
                    C18451Vrz.A02 = new C18451Vrz(vs6, new WeakReference(context));
                    C18451Vrz.A03 = true;
                }
            }
        }
        C263504Mg r22 = new C263504Mg(new C19073WKd(veP.A00()));
        HeroPlayerSetting heroPlayerSetting = veP.A00().A00.A00;
        0qQ.A0A(heroPlayerSetting);
        C263624Ms r16 = new C263624Ms(context, A0D2, looper, r12, r21, r8, obj4, obj2, obj3, this, obj5, obj, r22, heroPlayerSetting, wKk);
        this.A03 = r16;
        if (ukj != null) {
            uri2 = ukj2.A00;
        } else {
            uri2 = null;
        }
        0sm A0E2 = 0Yt.A0E();
        TextUtils.isEmpty(str8);
        if (TextUtils.isEmpty(str8)) {
            z3 = false;
            z4 = false;
            r28 = new C255653uU(uri2, uri3, C255643uT.GENERAL, C255623uR.PROGRESSIVE, str5, (String) null, (String) null, str6, str7, "UNKNOWN", (String) null, "AUDIO_VIDEO", (String) null, (List) null, (List) null, A0E2, false, false, false, false);
        } else {
            z3 = false;
            z4 = false;
            r28 = new C255653uU(uri2, uri3, C255643uT.GENERAL, C255623uR.DASH_VOD, str5, str8, (String) null, str6, str7, "UNKNOWN", (String) null, "AUDIO_VIDEO", (String) null, (List) null, (List) null, A0E2, false, false, false, false);
        }
        this.A0C = r28;
        UserSession A082 = 09i.A0A.A08(C18292VpG.A00);
        1yA r4 = 1wS.A01(A082).A00.A0H.A12;
        if (EndToEnd.isRunningEndToEndTest() || r4.A0K) {
            A002 = AnonymousClass0kN.A00((AnonymousClass0iw) null, 0kJ.A05, A082);
        } else {
            A002 = AnonymousClass0kN.A02(A082);
        }
        0qQ.A06(r4);
        ? obj6 = new Object();
        AnonymousClass3L1 A003 = AnonymousClass3L0.A00(A082);
        String str9 = r4.A04;
        0qQ.A07(str9);
        String A004 = AnonymousClass000.A00(2534);
        if (str9.length() == 0) {
            r4.A04 = A004;
        } else if (!00l.A0d(str9, A004, false)) {
            r4.A04 = 002.A0g(str9, ", ", A004);
        }
        AnonymousClass4NN r14 = new AnonymousClass4NN(A002, r16, new AnonymousClass4NK(r4, obj6), r4, obj6, (AnonymousClass4NM) null, (AnonymousClass4NL) null, A003);
        WKY wky = new WKY(r28, new WeakReference(this));
        r16.A0I.A0G.A00.add(r14);
        r16.A0B(r14);
        r14.A0G(C18403Vr5.A00, wky, V6M.A00(r28.A0G));
        28e r162 = 28e.A01;
        Integer num = AnonymousClass05K.A00;
        C255653uU r18 = r28;
        r16.A0C(new AnonymousClass4OI(new AudioFocusLossSettings(), r162, new Object(), r18, (AnonymousClass4SX) null, num, "", "", new ArrayList(), new ArrayList(), 0, 0, -1, -1, -1, -1, -1, false, false, false, false, false, false, false, false, false, false, false, false, false, z3, z4));
        if (this.A0J && (r2 = this.A03) != null) {
            r2.A07();
        }
        Integer num2 = this.A0E;
        if (num2 != null) {
            int intValue = num2.intValue();
            C263624Ms r23 = this.A03;
            if (r23 != null) {
                r23.A0I.A0C(intValue);
            }
        }
        Float f3 = this.A0D;
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            r16 = this.A03;
            if (z) {
                if (r16 != null) {
                    f2 = 0.0f;
                } else {
                    return;
                }
            } else if (r16 != null) {
                r16.A0E("player_initiated", 1.0f);
                return;
            } else {
                return;
            }
        }
        r16.A0E("player_initiated", f2);
    }

    public final C255623uR CEW() {
        return this.A0M;
    }

    public final Integer CEj() {
        return this.A0N;
    }

    public final Integer CEr() {
        return this.A0O;
    }

    public final void DXX(C297475ro r2, C284815Oa r3, C263684My r4, C263674Mx r5, String str) {
        A00(AnonymousClass05K.A15);
        this.A0L.A00();
    }

    public final void DYz(long j, String str) {
        A00(AnonymousClass05K.A01);
    }

    public final void DmP(boolean z) {
        A00(AnonymousClass05K.A0u);
    }

    public final void DnL(int i) {
        Integer num;
        C263624Ms r0 = this.A03;
        if (r0 == null || !r0.A0I.A0J()) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0C;
        }
        A00(num);
    }

    public final void Dx9() {
        this.A0L.A00();
    }

    public final void DxI(C297475ro r2, long j) {
        C263624Ms r0 = this.A03;
        if (r0 != null && !r0.A0I.A0X) {
            A00(AnonymousClass05K.A0j);
            this.A0L.A00();
        }
    }

    public final void Dxc(C297475ro r2, String str, long j, long j2, boolean z) {
        A00(AnonymousClass05K.A0Y);
        this.A0L.A00();
    }

    public final void DyU(C263674Mx r4, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        A00(AnonymousClass05K.A0C);
        if (this.A07 != null) {
            C55962HqT hqT = this.A0L;
            if (!hqT.A00) {
                hqT.A00 = true;
                hqT.A01.post(hqT.A02);
            }
        }
    }

    public final void onSeeking(long j) {
        A00(AnonymousClass05K.A0N);
    }

    public WKW(Context context) {
        C255623uR r0;
        Integer num;
        this.A0K = context;
        C255653uU r02 = this.A0C;
        Integer num2 = null;
        if (r02 != null) {
            r0 = r02.A07;
        } else {
            r0 = null;
        }
        this.A0M = r0;
        View view = this.A00;
        if (view != null) {
            num = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        this.A0N = num;
        View view2 = this.A00;
        this.A0O = view2 != null ? Integer.valueOf(view2.getWidth()) : num2;
    }

    public final void onCues(List list) {
        0sP r3;
        if (AnonymousClass7TE.A1b(list) && (r3 = this.A06) != null) {
            r3.invoke(00k.A0P("\n", "", "", list, C20718Wxr.A00));
        }
    }
}
