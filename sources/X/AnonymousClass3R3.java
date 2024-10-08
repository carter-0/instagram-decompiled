package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.push.FbnsInitBroadcastReceiver;
import org.webrtc.CameraCapturer;

/* renamed from: X.3R3  reason: invalid class name */
public final class AnonymousClass3R3 implements AnonymousClass3R2 {
    public 1XZ A00;
    public FbnsInitBroadcastReceiver A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final AnonymousClass3R7 A06;
    public final C61110lV A07 = new AnonymousClass3R4(this);
    public final AnonymousClass3R2 A08;
    public final String A09;

    public AnonymousClass3R3(Context context, AnonymousClass3R2 r4) {
        this.A05 = context;
        this.A09 = "567067343352427";
        this.A08 = r4;
        this.A06 = new AnonymousClass3R7(context, new AnonymousClass3R6(this));
        this.A04 = AnonymousClass3R8.A00(context);
    }

    public final PushChannelType B3t() {
        AnonymousClass3R2 r0;
        if (!this.A04 || (r0 = this.A08) == null) {
            return PushChannelType.A0D;
        }
        return r0.BiL();
    }

    public final PushChannelType BiL() {
        if (this.A04) {
            return PushChannelType.FBNS;
        }
        AnonymousClass3R2 r0 = this.A08;
        if (r0 != null) {
            return r0.BiL();
        }
        return PushChannelType.A0D;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.3Ri, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    /* JADX WARNING: type inference failed for: r0v31, types: [com.instagram.push.FbnsInitBroadcastReceiver, android.content.BroadcastReceiver] */
    public final void CMj(1XZ r9, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = r9;
        if (!this.A04) {
            DOx();
            return;
        }
        synchronized (this) {
            14i.A08.A0A(this.A07);
            if (this.A01 == null) {
                Context context = this.A05;
                if (context.getApplicationInfo().targetSdkVersion >= 24) {
                    this.A01 = new BroadcastReceiver();
                    IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    if (context.getApplicationInfo().targetSdkVersion >= 26) {
                        intentFilter.addAction("android.intent.action.USER_PRESENT");
                    }
                    0DH.A00(this.A01, context, intentFilter);
                }
            }
        }
        Context context2 = this.A05;
        Class<FbnsInitBroadcastReceiver> cls = FbnsInitBroadcastReceiver.class;
        ComponentName componentName = new ComponentName(context2, cls);
        PackageManager packageManager = context2.getPackageManager();
        packageManager.getClass();
        cls.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        if (str != null) {
            String A052 = 0qv.A02.A05(context2);
            int i = 30;
            if (z || !(!AnonymousClass3RA.A00(context2).A02)) {
                i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
            }
            Integer valueOf = Integer.valueOf(i);
            Bundle bundle = new Bundle();
            if (z) {
                AnonymousClass3RY.A03.A00(bundle, str);
            } else {
                AnonymousClass3RY.A03.A00(bundle, "");
            }
            AnonymousClass3RY.A05.A00(bundle, A052);
            AnonymousClass3RY.A04.A00(bundle, Boolean.valueOf(z));
            AnonymousClass3RY.A06.A00(bundle, -1);
            AnonymousClass3RY.A0A.A00(bundle, valueOf);
            C241783Re r5 = new C241783Re(context2);
            int i2 = C241803Rg.SET_ANALYTICS_CONFIG.A00;
            ? fbnsAIDLResult = new FbnsAIDLResult(bundle);
            fbnsAIDLResult.A00 = i2;
            r5.A05.submit(new C241813Rh(new FbnsAIDLRequest[]{fbnsAIDLResult}[0], r5));
        }
        boolean z2 = null;
        if (0oI.A0C(context2) && (!1AW.A06(0Tu.A05, 18296440421941583L))) {
            z2 = true;
        }
        ? obj = new Object();
        obj.A03 = null;
        obj.A00 = 0;
        obj.A01 = z2;
        obj.A02 = null;
        AnonymousClass3R7 r1 = this.A06;
        String A002 = r1.A01.A00();
        if (A002 != null) {
            if (C241833Rj.A02(A002)) {
                C241853Rl.A00(r1.A00);
            }
            C241853Rl.A01(r1.A00, obj, FbnsServiceDelegate.A00(A002), "init", A002, "Orca.START");
        } else {
            C241853Rl.A00(r1.A00);
        }
        AnonymousClass3R2 r0 = this.A08;
        if (r0 != null) {
            r0.CMj(r9, str, z);
        }
    }

    public final void CsW(C3733895d r3, Integer num) {
        AnonymousClass3R2 r0 = this.A08;
        if (r0 != null) {
            r0.CsW(r3, num);
        } else {
            r3.A00.DMd(false);
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    public final void DOx() {
        Context context = this.A05;
        Class<FbnsInitBroadcastReceiver> cls = FbnsInitBroadcastReceiver.class;
        ComponentName componentName = new ComponentName(context, cls);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        cls.getCanonicalName();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        synchronized (this) {
            14i r0 = 14i.A08;
            14i.A06(this.A07);
            FbnsInitBroadcastReceiver fbnsInitBroadcastReceiver = this.A01;
            if (fbnsInitBroadcastReceiver != null) {
                try {
                    context.unregisterReceiver(fbnsInitBroadcastReceiver);
                } catch (IllegalArgumentException unused) {
                } catch (Throwable th) {
                    this.A01 = null;
                    throw th;
                }
                this.A01 = null;
            }
        }
        AnonymousClass3R7 r6 = this.A06;
        String A002 = r6.A01.A00();
        if (A002 != null) {
            Context context2 = r6.A00;
            String A003 = FbnsServiceDelegate.A00(A002);
            if (A003 == null) {
                A003 = FbnsServiceDelegate.A00(A002);
            }
            Intent intent = new Intent("com.facebook.rti.fbns.intent.UNREGISTER");
            intent.setComponent(new ComponentName(A002, A003));
            intent.putExtra("pkg_name", context2.getPackageName());
            C241903Rv r3 = new C241903Rv(context2, (Boolean) null);
            ComponentName component = intent.getComponent();
            if (component != null) {
                String packageName = component.getPackageName();
                Context context3 = r3.A00;
                AnonymousClass3RB r1 = r3.A01;
                if (C241843Rk.A01(context3, r1, packageName)) {
                    r3.A02(intent);
                    r1.A05(context3, intent);
                }
            }
        }
        Context context4 = r6.A00;
        C241853Rl.A00(context4);
        C13849TiS AR1 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02().A00(context4, 002.A0R("rti.mqtt.", "token_store")).AR1();
        AR1.AHK();
        AR1.AIR("FbnsCallbackHandlerBase", "PreferencesManager failed to clear token store");
        Bundle bundle = new Bundle();
        AnonymousClass3RY.A03.A00(bundle, (Object) null);
        AnonymousClass3RY.A04.A00(bundle, false);
        C241783Re r32 = new C241783Re(context);
        int i = C241803Rg.SET_ANALYTICS_CONFIG.A00;
        ? fbnsAIDLResult = new FbnsAIDLResult(bundle);
        fbnsAIDLResult.A00 = i;
        r32.A05.submit(new C241813Rh(new FbnsAIDLRequest[]{fbnsAIDLResult}[0], r32));
    }

    public final void EBN(Integer num) {
        1XZ r3 = this.A00;
        if (r3 != null) {
            r3.A02(this.A05, PushChannelType.FBNS, num, 1);
        } else {
            0wb.A03("FbnsPushRegistrar register", C66579MXk.A00(625));
        }
        boolean A002 = AnonymousClass3R8.A00(this.A05);
        if (this.A04 != A002) {
            this.A04 = A002;
            CMj(this.A00, this.A02, this.A03);
        }
        if (this.A04) {
            AnonymousClass3R7 r1 = this.A06;
            String str = this.A09;
            String A003 = C3733595a.A00(num);
            String A004 = r1.A01.A00();
            if (A004 != null) {
                Context context = r1.A00;
                String A005 = FbnsServiceDelegate.A00(A004);
                context.getClass();
                C241903Rv r4 = new C241903Rv(context, (Boolean) null);
                if (!TextUtils.isEmpty(str)) {
                    if (context.getPackageName().equals(A004)) {
                        ComponentName componentName = new ComponentName(context, A005);
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        componentName.getShortClassName();
                    }
                    Intent intent = new Intent(Pxd.A00(198));
                    intent.setComponent(new ComponentName(A004, A005));
                    intent.putExtra("pkg_name", context.getPackageName());
                    intent.putExtra(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str);
                    intent.putExtra("push_renew_trigger", A003);
                    ComponentName component = intent.getComponent();
                    if (component != null) {
                        String packageName = component.getPackageName();
                        Context context2 = r4.A00;
                        AnonymousClass3RB r12 = r4.A01;
                        if (C241843Rk.A01(context2, r12, packageName)) {
                            r4.A02(intent);
                            r12.A05(context2, intent);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Missing appId");
                }
            }
        }
        AnonymousClass3R2 r0 = this.A08;
        if (r0 != null) {
            r0.EBN(num);
        }
    }
}
