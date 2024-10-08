package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.FEn  reason: case insensitive filesystem */
public final class C49914FEn {
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);
    public Sx9 A00;
    public G85 A01;
    public final C319616qu A02 = new Object();
    public final 0lg A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public static void A00(0lg r2, C46634DiE diE, String str, int i) {
        String str2 = null;
        if (str != null) {
            if (diE != null) {
                str2 = diE.A01;
            }
            0qQ.A0B(r2, 0);
            C49956FGl.A02(r2, str2);
        } else if (i == 0) {
            if (diE != null) {
                str2 = diE.A01;
            }
            0qQ.A0B(r2, 0);
            C49956FGl.A01(r2, str2);
        } else {
            if (diE != null) {
                str2 = diE.A01;
            }
            0qQ.A0B(r2, 0);
            C49956FGl.A03(r2, str2);
        }
    }

    public final /* synthetic */ void A01(Activity activity, HintRequest hintRequest, AnonymousClass63S r16, Sx9 sx9, C13675Tek tek, C46634DiE diE) {
        if (Build.VERSION.SDK_INT < 31) {
            AnonymousClass63S r2 = r16;
            r2.getClass();
            String A002 = AnonymousClass000.A00(1765);
            AnonymousClass3Qk.A03(hintRequest, A002);
            Sx4 sx4 = ((C8397Qq2) r2.A05(C10136RnD.A02)).A00;
            Context A032 = r2.A03();
            String str = sx4.A00;
            AnonymousClass3Qk.A03(A032, "context must not be null");
            AnonymousClass3Qk.A03(hintRequest, A002);
            if (TextUtils.isEmpty(str)) {
                str = C11139SBu.A00();
            } else {
                AnonymousClass3Qk.A02(str);
            }
            Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage(AnonymousClass000.A00(270)).putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
            Parcel obtain = Parcel.obtain();
            hintRequest.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
            PendingIntent activity2 = PendingIntent.getActivity(A032, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, putExtra, C49270EsD.A00 | 134217728);
            Activity activity3 = activity;
            C13675Tek tek2 = tek;
            try {
                0lg r5 = this.A03;
                C47908EMc eMc = new C47908EMc(r5, tek2, diE);
                List list = this.A04;
                synchronized (list) {
                    list.add(eMc);
                }
                activity3.startIntentSenderForResult(activity2.getIntentSender(), eMc.A00, (Intent) null, 0, 0, 0);
                int A022 = DbY.A02(r5);
                boolean A1S = AnonymousClass7TF.A1S(sx9.A01, 10);
                0qQ.A0B(r5, 0);
                C49956FGl.A00((Status) null, r5, "bloks_reg", A022, A1S);
            } catch (IntentSender.SendIntentException unused) {
                activity.runOnUiThread(new C51457FuR(activity, tek2, (Object) null));
                0lg r3 = this.A03;
                0qQ.A0B(r3, 0);
                C49956FGl.A04(r3, "bloks_reg", "get_signup_hint", "cannot_show_dialog");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6qu, java.lang.Object] */
    public C49914FEn(0lg r2) {
        this.A03 = r2;
    }
}
