package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.AmQ  reason: case insensitive filesystem */
public final class C40980AmQ implements Runnable {
    public final /* synthetic */ AW2 A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public C40980AmQ(AW2 aw2, AnonymousClass9GD r2) {
        this.A00 = aw2;
        this.A01 = r2;
    }

    public final void run() {
        try {
            AW2 aw2 = this.A00;
            C41771B0a b0a = aw2.A00;
            Object A06 = this.A01.A06();
            AWC awc = (AWC) b0a;
            FirebaseInstanceId firebaseInstanceId = awc.A00;
            String str = awc.A01;
            String str2 = awc.A02;
            String str3 = (String) A06;
            AnonymousClass96R r4 = FirebaseInstanceId.A08;
            String A05 = firebaseInstanceId.A04.A05();
            synchronized (r4) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", str3);
                    jSONObject.put("appVersion", A05);
                    jSONObject.put("timestamp", currentTimeMillis);
                    String obj = jSONObject.toString();
                    if (obj != null) {
                        SharedPreferences.Editor edit = r4.A01.edit();
                        edit.putString(AnonymousClass96R.A01(str, str2), obj);
                        edit.commit();
                    }
                } catch (JSONException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb.append("Failed to encode token: ");
                    Log.w("FirebaseInstanceId", AnonymousClass7TF.A0l(valueOf, sb));
                }
            }
            C3737496t r0 = new C3737496t(str3);
            AnonymousClass9GD r2 = new AnonymousClass9GD();
            r2.A0C(r0);
            Executor executor = AnonymousClass9GH.A01;
            r2.A04(aw2, executor);
            r2.A0A(aw2, executor);
            r2.A03.A00(new C3737296r(aw2, executor));
            AnonymousClass9GD.A01(r2);
        } catch (AnonymousClass9GG e2) {
            e = e2;
            boolean z = e.getCause() instanceof Exception;
            AW2 aw22 = this.A00;
            if (z) {
                e = (Exception) e.getCause();
            }
            aw22.onFailure(e);
        } catch (CancellationException unused) {
            this.A00.D0c();
        } catch (Exception e3) {
            this.A00.onFailure(e3);
        }
    }
}
