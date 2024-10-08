package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.452  reason: invalid class name */
public abstract class AnonymousClass452 {
    public final List A00 = new LinkedList();

    public AnonymousClass453 A00() {
        return ((AnonymousClass451) this).A00;
    }

    public void A01() {
        int i;
        AnonymousClass451 r3 = (AnonymousClass451) this;
        try {
            JSONObject jSONObject = new JSONObject(r3.A01);
            r3.A04(jSONObject);
            if ("sandbox".equals(r3.A03) && !TextUtils.isEmpty(r3.A02)) {
                String str = r3.A02;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains(":")) {
                            String[] split = str.split(":", 2);
                            str = split[0];
                            i = Integer.parseInt(split[1]);
                        } else {
                            i = 8883;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("host_name_v6", str);
                            jSONObject.put("default_port", i);
                            jSONObject.put("backup_port", i);
                            jSONObject.put("use_ssl", false);
                            jSONObject.put("use_compression", false);
                        }
                    }
                    if (!TextUtils.isEmpty((CharSequence) null)) {
                        jSONObject.put("php_sandbox_host_name", (Object) null);
                    }
                } catch (Throwable th) {
                    0KC.A0H("ConnectionConfigManager", "Failed to parse mqtt sandbox URL", th);
                }
            }
            r3.A00 = new AnonymousClass453(jSONObject);
        } catch (JSONException e) {
            0KC.A0G("BasicConnectionConfigManager", "Could not load connection config. Using default", e);
            r3.A00 = new AnonymousClass453(new JSONObject());
        }
    }

    public void A02() {
        AnonymousClass450 r3 = (AnonymousClass450) this;
        r3.A01();
        Intent intent = new Intent(Pxd.A00(683));
        Context context = r3.A02;
        intent.setPackage(context.getPackageName());
        0b6.A00().A07().A0C(context, intent);
        AnonymousClass4Uw r0 = r3.A03;
        26B.A0G.A01(new C12960TFt(r0.A00, r0.A01));
    }

    public final synchronized void A03(AnonymousClass45B r2) {
        this.A00.add(r2);
    }

    public final synchronized void A04(JSONObject jSONObject) {
        for (AnonymousClass45B r2 : this.A00) {
            try {
                String BUM = r2.BUM();
                if (!TextUtils.isEmpty(BUM)) {
                    jSONObject.put("host_name_v6", BUM);
                }
                String AbR = r2.AbR();
                if (!TextUtils.isEmpty(AbR)) {
                    jSONObject.put("analytics_endpoint", AbR);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
