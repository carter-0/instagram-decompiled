package com.google.firebase.iid;

import X.AnonymousClass96P;
import X.AnonymousClass96Q;
import X.AnonymousClass96R;
import X.AnonymousClass96S;
import X.AnonymousClass96T;
import X.AnonymousClass96X;
import X.AnonymousClass96Y;
import X.AnonymousClass9G4;
import X.AnonymousClass9GD;
import X.C3734195g;
import X.C3735195u;
import X.C3735495z;
import X.C3735796c;
import X.C3736096f;
import X.C3736196g;
import X.C3736396i;
import X.C3736896n;
import X.C3737396s;
import X.C3737496t;
import X.C41271ArA;
import X.PyM;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static AnonymousClass96R A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public AnonymousClass96T A00;
    public boolean A01 = false;
    public final C3734195g A02;
    public final AnonymousClass96Y A03;
    public final AnonymousClass96P A04;
    public final C3735796c A05;
    public final AnonymousClass96X A06;
    public final Executor A07;

    public static final synchronized void A03(FirebaseInstanceId firebaseInstanceId) {
        synchronized (firebaseInstanceId) {
            if (!firebaseInstanceId.A01) {
                firebaseInstanceId.A07(0);
            }
        }
    }

    public final synchronized void A06() {
        A08.A02();
        if (this.A03.A00()) {
            A03(this);
        }
    }

    public final synchronized void A07(long j) {
        A04(new C41271ArA(this, this.A06, Math.min(Math.max(30, j << 1), A0A)), j);
        this.A01 = true;
    }

    public FirebaseInstanceId(C3734195g r23, C3735195u r24, C3735495z r25) {
        boolean z;
        C3734195g r4 = r23;
        C3734195g.A01(r4);
        Context context = r4.A00;
        AnonymousClass96P r2 = new AnonymousClass96P(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = AnonymousClass96Q.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (AnonymousClass96P.A01(r4) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    C3734195g.A01(r4);
                    A08 = new AnonymousClass96R(context);
                }
            }
            this.A02 = r4;
            this.A04 = r2;
            AnonymousClass96T r1 = this.A00;
            if (r1 == null) {
                C3734195g.A01(r4);
                r1 = (AnonymousClass96T) r4.A02.A03(AnonymousClass96T.class);
                r1 = (r1 == null || r1.A01.A03() == 0) ? new AnonymousClass96T(r4, r2, r25, threadPoolExecutor) : r1;
                this.A00 = r1;
            }
            this.A00 = r1;
            this.A07 = threadPoolExecutor2;
            this.A06 = new AnonymousClass96X(A08);
            AnonymousClass96Y r12 = new AnonymousClass96Y(r24, this);
            this.A03 = r12;
            this.A05 = new C3735796c(threadPoolExecutor);
            if (r12.A00()) {
                if (!A08(A00(AnonymousClass96P.A01(this.A02), "*"))) {
                    AnonymousClass96X r22 = this.A06;
                    synchronized (r22) {
                        z = AnonymousClass96X.A00(r22) != null;
                    }
                    if (!z) {
                        return;
                    }
                }
                A03(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static C3736096f A00(String str, String str2) {
        C3736096f r4;
        C3736096f r2;
        AnonymousClass96R r3 = A08;
        synchronized (r3) {
            r4 = null;
            String string = r3.A01.getString(AnonymousClass96R.A01(str, str2), (String) null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r2 = new C3736096f(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    r2 = new C3736096f(string, (String) null, 0);
                }
                r4 = r2;
            }
        }
        return r4;
    }

    public static final Object A01(AnonymousClass9GD r3, FirebaseInstanceId firebaseInstanceId) {
        try {
            return C3736896n.A01(r3, TimeUnit.MILLISECONDS, 30000);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    firebaseInstanceId.A06();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e);
            }
            throw cause;
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public static String A02() {
        C3737396s r0;
        AnonymousClass96R r3 = A08;
        synchronized (r3) {
            Map map = r3.A03;
            r0 = (C3737396s) map.get("");
            if (r0 == null) {
                try {
                    AnonymousClass96S r6 = r3.A02;
                    Context context = r3.A00;
                    AnonymousClass9G4 e = null;
                    File A042 = AnonymousClass96S.A04(context);
                    if (A042.exists()) {
                        try {
                            r0 = AnonymousClass96S.A02(A042);
                        } catch (AnonymousClass9G4 | IOException e2) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String.valueOf(String.valueOf(e2));
                            }
                            try {
                                r0 = AnonymousClass96S.A02(A042);
                            } catch (IOException e3) {
                                String valueOf = String.valueOf(e3);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                                sb.append("IID file exists, but failed to read from it: ");
                                sb.append(valueOf);
                                Log.w("FirebaseInstanceId", sb.toString());
                                throw new Exception(e3);
                            } catch (AnonymousClass9G4 e4) {
                                e = e4;
                            }
                        }
                        AnonymousClass96S.A06(context, r0);
                        map.put("", r0);
                    }
                    try {
                        r0 = AnonymousClass96S.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                        if (r0 != null) {
                            AnonymousClass96S.A00(context, r0, false);
                        } else {
                            if (e == null) {
                                r0 = r6.A07(context);
                            }
                            throw e;
                        }
                        map.put("", r0);
                    } catch (AnonymousClass9G4 e5) {
                        e = e5;
                    }
                } catch (AnonymousClass9G4 unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C3734195g.A00()).A06();
                    r0 = r3.A02.A07(r3.A00);
                }
            }
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(r0.A01.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused2) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static void A04(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new PyM("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public static FirebaseInstanceId getInstance(C3734195g r2) {
        C3734195g.A01(r2);
        return (FirebaseInstanceId) r2.A02.A03(FirebaseInstanceId.class);
    }

    public final boolean A08(C3736096f r8) {
        if (r8 != null) {
            String A052 = this.A04.A05();
            if (System.currentTimeMillis() > r8.A00 + C3736096f.A03 || !A052.equals(r8.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            AnonymousClass9GD r4 = new AnonymousClass9GD();
            r4.A0C((Object) null);
            Executor executor = this.A07;
            C3736196g r0 = new C3736196g(this, str, str2);
            AnonymousClass9GD r2 = new AnonymousClass9GD();
            r4.A03.A00(new C3736396i(r0, r2, executor));
            AnonymousClass9GD.A01(r4);
            return ((C3737496t) A01(r2, this)).A00;
        }
        throw new IOException("MAIN_THREAD");
    }
}
