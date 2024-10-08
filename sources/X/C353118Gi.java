package X;

import android.app.Activity;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.File;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8Gi  reason: invalid class name and case insensitive filesystem */
public final class C353118Gi {
    public C21986Xoh A00;
    public C340297l2 A01;
    public C40793AjP A02;
    public C343607qU A03;
    public AnonymousClass8W6 A04;
    public AnonymousClass8G8 A05;
    public File A06;
    public File A07;
    public boolean A08;
    public final long A09;
    public final Activity A0A;
    public final 0yf A0B = new 01r(0);
    public final 0yf A0C = new 01r(0);
    public final AnonymousClass8GD A0D = new C353138Gk(this);
    public final AnonymousClass8GD A0E = new C353128Gj(this);
    public final AnonymousClass8GD A0F;
    public final AnonymousClass82W A0G;
    public final UserSession A0H;
    public final C357638Yz A0I;
    public final C353108Gh A0J;
    public final AnonymousClass8GA A0K;
    public final AnonymousClass8GT A0L;
    public final C3498081w A0M;
    public final AnonymousClass85X A0N;
    public final C3499582p A0O;
    public final AnonymousClass8AL A0P;
    public final AnonymousClass8DD A0Q;
    public final AnonymousClass8E5 A0R;
    public final AnonymousClass80U A0S;
    public final AnonymousClass846 A0T;
    public final C3495780x A0U;
    public final ShutterButton A0V;
    public final C353098Gg A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final C352868Fj A0a;
    public final C3504784u A0b;
    public final boolean A0c;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.8GK] */
    public final void A07(C349307zv r6) {
        Product A032;
        String str;
        r6.A19 = true;
        AnonymousClass82W r2 = this.A0G;
        CameraAREffect A012 = r2.A00().A01();
        if (A012 != null) {
            Integer num = null;
            try {
                C340297l2 r0 = this.A01;
                if (r0 != null && r0.CVP()) {
                    num = Integer.valueOf(this.A01.A07());
                    if (num != null) {
                        r6.A0f = C363818kO.A00(num);
                    }
                }
            } catch (C352928Fp unused) {
            }
            r6.A0P = A012;
            r6.A0g = C363828kP.A00(this.A0I.A08());
            r6.A0j = r2.A00().A02();
            C3504784u r1 = this.A0b;
            if (!(!this.A0c || r1 == null || (A032 = r1.A03()) == null)) {
                String str2 = A032.A0H;
                User user = A032.A0B;
                if (user == null || (str = AnonymousClass3ZA.A00(user)) == null) {
                    str = "";
                }
                0qQ.A0B(str2, 1);
                ? obj = new Object();
                obj.A01 = str2;
                obj.A00 = str;
                r6.A0W = obj;
            }
            if (A012.A0f) {
                r6.A12.add(C391429sz.A0X.toString());
            }
        }
    }

    public static String A00(C353118Gi r2) {
        StringBuilder sb = new StringBuilder();
        sb.append("camera_destination ");
        sb.append(r2.A0I.A08.A00);
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.LDq] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.A70, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.LDq] */
    public static void A01(C353118Gi r13) {
        String str;
        String str2;
        ShutterButton shutterButton = r13.A0V;
        shutterButton.setButtonActionsEnabled(true);
        r13.A0a.A00().Dy6();
        r13.A05 = null;
        if (r13.A07 != null) {
            if (r13.A06 == null) {
                C340297l2 r0 = r13.A01;
                r0.getClass();
                if (r0.A0T()) {
                    return;
                }
            }
            AnonymousClass8GA r6 = r13.A0K;
            boolean z = r6.A05;
            C340297l2 r02 = r13.A01;
            r02.getClass();
            if (r02.A0V() || z) {
                String format = String.format("isRecordingVideo() isRecordingVideo=%s mAwaitingFakeSelfieFlash=%s", new Object[]{Boolean.valueOf(r13.A01.A0V()), Boolean.valueOf(z)});
                HashMap hashMap = new HashMap();
                hashMap.put("IgCameraViewRecordingController", format);
                hashMap.put("Already recording", ((C345417tS) r13.A01.A0G.A01(C345417tS.A00)).Bz9());
                0kD.A0I("IgCameraViewRecordingController", (Throwable) null, hashMap);
                AnonymousClass8A1.A01(r13.A0H).A0M("Already recording", A00(r13));
                return;
            }
            UserSession userSession = r13.A0H;
            AnonymousClass8A1.A01(userSession).A0E("recording_starting_1");
            if (A04(r13)) {
                if (shutterButton.A0i.A0A) {
                    AnonymousClass82T r4 = r13.A0G.A00().A05.A0M;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("captureType", "tap");
                        jSONObject.put("platform", "android");
                        AnonymousClass82T.A00(r4, jSONObject);
                    } catch (JSONException e) {
                        if (e.getMessage() != null) {
                            str2 = e.getMessage();
                        } else {
                            str2 = "";
                        }
                        0kD.A01("PlatformEventsController::fireCaptureTypeTapEvent", str2);
                    }
                }
                AnonymousClass82T r42 = r13.A0G.A00().A05.A0M;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("action", "play_effect");
                    jSONObject2.put("platform", "android");
                    AnonymousClass82T.A00(r42, jSONObject2);
                } catch (JSONException e2) {
                    if (e2.getMessage() != null) {
                        str = e2.getMessage();
                    } else {
                        str = "";
                    }
                    0kD.A01("PlatformEventsController::firePlayEffectEvent", str);
                }
            }
            boolean z2 = !r13.A0Z;
            ? obj = new Object();
            C63575KzO kzO = LOF.A07;
            File file = r13.A07;
            file.getClass();
            obj.A00(kzO, file);
            C63575KzO kzO2 = LOF.A0A;
            obj.A00(kzO2, false);
            if (r13.A01.A0T()) {
                ? obj2 = new Object();
                File file2 = r13.A06;
                file2.getClass();
                obj2.A00(kzO, file2);
                obj2.A00(kzO2, false);
                obj.A00(LOF.A06, new LOF(obj2));
                if (r13.A0I.A08.A00 instanceof AnonymousClass80O) {
                    obj.A00(kzO2, true);
                }
                r13.A0J.A00.A0s.setEnabled(false);
            }
            C363898kX A012 = C340297l2.A01(r13.A01);
            if (!(A012 == null || A012.A01 == C390989sA.A03) || r13.A03()) {
                obj.A00(LOF.A0B, 2);
            }
            LOF lof = new LOF(obj);
            ? obj3 = new Object();
            obj3.A00 = Boolean.valueOf(z2);
            Object obj4 = r13.A0I.A08.A00;
            if (obj4 == AnonymousClass80M.A00) {
                obj3.A04 = 32000;
                obj3.A03 = 5;
            }
            if (obj4 == AnonymousClass9QA.A00) {
                Activity activity = r13.A0A;
                if (C362998is.A00(activity.getApplicationContext(), userSession) && r13.A03()) {
                    0qQ.A0B(userSession, 0);
                    if (182.A06(0Tu.A05, userSession, 36319781053406868L)) {
                        1pd.A00(C362988ir.A00()).A00(activity.getApplicationContext(), userSession, new C40619Afh(obj3, r13), "IgCameraViewRecordingController");
                    }
                }
            }
            if (r6.A0B(new C41140Ap0(obj3, lof, r13))) {
                AnonymousClass8A1.A01(userSession).A0E("recording_wait_for_flash");
            }
        }
    }

    public static void A02(C353118Gi r5, String str) {
        String str2;
        ShutterButton shutterButton = r5.A0V;
        shutterButton.setEnabled(true);
        shutterButton.setButtonActionsEnabled(true);
        AnonymousClass8G8 r0 = r5.A05;
        if (r0 != null) {
            str2 = r0.getName();
        } else {
            str2 = "";
        }
        shutterButton.A04(CancelReason.USER_CANCELLED, 002.A0g(str, " - ", str2));
        C353098Gg r2 = r5.A0W;
        C60240fb.A00(r2, r2.A03);
        r2.A00 = -1;
        if (A04(r5)) {
            if (r5.A0X) {
                C3498081w r1 = r5.A0M;
                r1.getClass();
                r1.setEnabled(true);
                r1.EOX(1.0f);
            }
            r5.A08 = false;
        }
        if (r5.A05 != null) {
            r5.A05 = null;
            r5.A04.A03();
        } else {
            r5.A04.A03();
            C340297l2 r12 = r5.A01;
            r12.getClass();
            r12.A0R(AnonymousClass05K.A01);
        }
        r5.A0S.E3H(new Object());
    }

    private boolean A03() {
        C357488Yc A012 = C357488Yc.A03.A01(this.A0H);
        if (A012 == null || !A012.A00().A0J()) {
            return false;
        }
        C357638Yz r2 = this.A0I;
        if (!C358218aY.A00((C279284yO) r2.A08.A00, (Set) r2.A09.A00)) {
            return true;
        }
        return false;
    }

    public static boolean A04(C353118Gi r1) {
        CameraAREffect cameraAREffect = r1.A0G.A00().A05.A09;
        if (cameraAREffect == null || !cameraAREffect.A0i) {
            return false;
        }
        return true;
    }

    public final void A05() {
        boolean z = false;
        if (this.A0I.A08.A00 == AnonymousClass80L.A00) {
            z = true;
        }
        C358248ab r1 = new C358248ab(this.A0A);
        int i = 2131976418;
        if (z) {
            i = 2131965436;
        }
        r1.A09(i);
        int i2 = 2131976417;
        if (z) {
            i2 = 2131965435;
        }
        r1.A08(i2);
        r1.A0E(new C39912AJe());
        AnonymousClass0fN.A00(r1.A02());
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C343367q6 r8) {
        /*
            r7 = this;
            X.7qU r2 = r7.A03
            android.app.Activity r0 = r7.A0A
            android.content.Context r4 = r0.getApplicationContext()
            r0 = 2
            X.0qQ.A0B(r4, r0)
            if (r2 == 0) goto L_0x0017
            int r1 = r8.A01
            int r0 = r2.A00
            if (r1 != r0) goto L_0x0017
        L_0x0014:
            r7.A03 = r2
            return
        L_0x0017:
            X.7p0 r2 = r8.A02
            X.7p1 r0 = X.C342687p0.A00
            java.lang.Object r3 = r2.A01(r0)
            X.0qQ.A07(r3)
            X.7p1 r0 = X.C342687p0.A0x
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            X.7p1 r0 = X.C342687p0.A1A
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0064
            X.7pa r1 = (X.C343047pa) r1
            int r1 = r1.A00
        L_0x0053:
            java.lang.Object r0 = r5.next()
            X.7pa r0 = (X.C343047pa) r0
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x005e
            r1 = r0
        L_0x005e:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x0053
        L_0x0064:
            X.7p1 r0 = X.C342687p0.A10
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0098
            X.7pa r1 = (X.C343047pa) r1
            int r1 = r1.A00
        L_0x0087:
            java.lang.Object r0 = r5.next()
            X.7pa r0 = (X.C343047pa) r0
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x0092
            r1 = r0
        L_0x0092:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x0087
        L_0x0098:
            X.7p1 r0 = X.C342687p0.A12
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d6
            int[] r1 = (int[]) r1
            X.0qQ.A0A(r1)
            int r1 = X.03t.A00(r1)
        L_0x00c0:
            java.lang.Object r0 = r5.next()
            int[] r0 = (int[]) r0
            X.0qQ.A0A(r0)
            int r0 = X.03t.A00(r0)
            if (r1 >= r0) goto L_0x00d0
            r1 = r0
        L_0x00d0:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x00c0
        L_0x00d6:
            X.7p1 r0 = X.C342687p0.A0Z
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f2
            X.7p1 r0 = X.C342687p0.A0r
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.00k.A07(r0)
        L_0x00f2:
            X.7p1 r0 = X.C342687p0.A0b
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            X.7p1 r0 = X.C342687p0.A0Q
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            X.7p1 r0 = X.C342687p0.A0V
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            X.7p1 r0 = X.C342687p0.A0M
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0129
            X.7p1 r0 = X.C342687p0.A0L
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01b8
        L_0x0129:
            X.7p1 r0 = X.C342687p0.A0y
            java.lang.Object r1 = r2.A01(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            if (r1 == 0) goto L_0x01b8
            java.lang.Comparable r0 = X.00k.A06(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Comparable r6 = X.00k.A04(r1)
            java.lang.Number r6 = (java.lang.Number) r6
            if (r0 == 0) goto L_0x01b8
            if (r6 == 0) goto L_0x01b8
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            int r0 = r6.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r5, r0}
            java.util.List r5 = X.0sr.A1P(r0)
        L_0x015d:
            X.7l0 r0 = X.C340277l0.CAMERA2
            if (r3 != r0) goto L_0x0172
            java.util.HashSet r0 = X.C348147xx.A00
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x0172
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.camera.concurrent"
            r1.hasSystemFeature(r0)
        L_0x0172:
            X.7p1 r0 = X.C342687p0.A0p
            java.lang.Object r0 = r2.A01(r0)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x0186
            double r0 = X.C343597qT.A00
        L_0x0186:
            X.7p1 r0 = X.C342687p0.A0n
            java.lang.Object r1 = r2.A01(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01ba
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x019f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.add(r0)
            goto L_0x019f
        L_0x01b8:
            r5 = 0
            goto L_0x015d
        L_0x01ba:
            r4 = 0
        L_0x01bb:
            X.7p1 r0 = X.C342687p0.A0o
            java.lang.Object r3 = r2.A01(r0)
            X.7pa r3 = (X.C343047pa) r3
            if (r3 == 0) goto L_0x01e4
            int r0 = r3.A02
            long r0 = (long) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            int r0 = r3.A01
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long[] r0 = new java.lang.Long[]{r2, r0}
            java.util.List r1 = X.0sr.A1P(r0)
        L_0x01db:
            int r0 = r8.A01
            X.7qU r2 = new X.7qU
            r2.<init>(r0, r5, r4, r1)
            goto L_0x0014
        L_0x01e4:
            r1 = 0
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C353118Gi.A06(X.7q6):void");
    }

    public C353118Gi(Activity activity, AnonymousClass82W r5, UserSession userSession, C357638Yz r7, AnonymousClass888 r8, C353108Gh r9, AnonymousClass8GA r10, AnonymousClass8GT r11, C3498081w r12, AnonymousClass85X r13, C3499582p r14, AnonymousClass8AL r15, AnonymousClass8DD r16, AnonymousClass8E5 r17, C352868Fj r18, AnonymousClass80U r19, AnonymousClass846 r20, C3495780x r21, C3504784u r22, ShutterButton shutterButton, C353098Gg r24, long j, boolean z, boolean z2, boolean z3) {
        this.A0H = userSession;
        this.A0A = activity;
        this.A0I = r7;
        this.A0S = r19;
        this.A0V = shutterButton;
        this.A0W = r24;
        this.A0G = r5;
        this.A0K = r10;
        this.A0N = r13;
        this.A0P = r15;
        this.A0O = r14;
        this.A0R = r17;
        this.A0T = r20;
        this.A0U = r21;
        this.A0X = z;
        this.A0c = z2;
        boolean z4 = z3;
        this.A0Y = z4;
        this.A09 = j;
        this.A0M = r12;
        this.A0a = r18;
        C353148Gl r1 = new C353148Gl(this);
        0qQ.A0B(userSession, 1);
        this.A0F = new C353158Gm(userSession, r8, r1, z4);
        this.A0Q = r16;
        this.A0b = r22;
        this.A0L = r11;
        this.A0J = r9;
        this.A0Z = C305756Jk.A00(activity);
    }
}
