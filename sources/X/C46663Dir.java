package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.Dir  reason: case insensitive filesystem */
public final class C46663Dir extends BroadcastReceiver implements C51864G4y {
    public G79 A00;
    public String A01;
    public final Context A02;
    public final AtomicBoolean A03 = new AtomicBoolean(true);

    public static void A00(C46663Dir dir) {
        if (dir.A03.getAndSet(false)) {
            dir.A02.unregisterReceiver(dir);
        }
    }

    public C46663Dir(Context context) {
        this.A02 = context;
        0DH.A03(this, context, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), true);
    }

    public static void A01(C46663Dir dir, String str) {
        A00(dir);
        G79 g79 = dir.A00;
        if (g79 != null) {
            AnonymousClass7TF.A0D().post(new C51369Ft1(g79, str));
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        int A012 = AnonymousClass0fD.A01(-709490868);
        AnonymousClass0fQ.A01(this, context, intent);
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            parcelableExtra.getClass();
            int i = ((Status) parcelableExtra).A00;
            if (i != 0) {
                if (i == 10) {
                    str = "dev_error";
                } else if (i != 15) {
                    str = "unknown";
                } else {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                }
                A01(this, str);
            } else {
                String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                Pattern pattern = 0mp.A01;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                A00(this);
                this.A01 = stringExtra;
                G79 g79 = this.A00;
                if (g79 != null) {
                    AnonymousClass7TF.A0D().post(new C51370Ft2(g79, stringExtra));
                }
            }
        }
        AnonymousClass0fD.A0E(1550764851, A012, intent);
    }
}
