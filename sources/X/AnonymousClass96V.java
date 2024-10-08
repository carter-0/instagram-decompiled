package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.zzm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.96V  reason: invalid class name */
public final class AnonymousClass96V extends AnonymousClass96W {
    public final /* synthetic */ AnonymousClass96U A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass96V(Looper looper, AnonymousClass96U r2) {
        super(looper);
        this.A00 = r2;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        String str3;
        Bundle bundle;
        AnonymousClass96U r4 = this.A00;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C390629ra());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzm) {
                        r4.A01 = (zzm) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        r4.A00 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    action = intent2.getStringExtra("registration_id");
                    if (action == null) {
                        action = intent2.getStringExtra(C66579MXk.A00(176));
                    }
                    if (action == null) {
                        String stringExtra = intent2.getStringExtra("error");
                        str = "FirebaseInstanceId";
                        if (stringExtra == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            str2 = sb.toString();
                        } else {
                            if (Log.isLoggable(str, 3)) {
                                String.valueOf(stringExtra);
                            }
                            if (stringExtra.startsWith("|")) {
                                String[] split = stringExtra.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    String valueOf2 = String.valueOf(stringExtra);
                                    if (valueOf2.length() != 0) {
                                        str2 = "Unexpected structured response ".concat(valueOf2);
                                    } else {
                                        str2 = new String("Unexpected structured response ");
                                    }
                                } else {
                                    str3 = split[2];
                                    String str4 = split[3];
                                    if (str4.startsWith(":")) {
                                        str4 = str4.substring(1);
                                    }
                                    bundle = intent2.putExtra("error", str4).getExtras();
                                }
                            } else {
                                01r r3 = r4.A04;
                                synchronized (r3) {
                                    for (int i = 0; i < r3.size(); i++) {
                                        AnonymousClass96U.A01(intent2.getExtras(), r4, (String) r3.A05(i));
                                    }
                                }
                                return;
                            }
                        }
                        Log.w(str, str2);
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(action);
                    if (matcher.matches()) {
                        str3 = matcher.group(1);
                        String group = matcher.group(2);
                        bundle = intent2.getExtras();
                        bundle.putString("registration_id", group);
                    }
                    AnonymousClass96U.A01(bundle, r4, str3);
                    return;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String.valueOf(action);
                    return;
                }
                return;
            }
        }
        str = "FirebaseInstanceId";
        str2 = "Dropping invalid message";
        Log.w(str, str2);
    }
}
