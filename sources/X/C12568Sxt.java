package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Sxt  reason: case insensitive filesystem */
public final /* synthetic */ class C12568Sxt implements C13640Te7 {
    public final /* synthetic */ Context A00;

    public /* synthetic */ C12568Sxt(Context context) {
        this.A00 = context;
    }

    public final Object FP1() {
        T99 t99;
        Object obj;
        BufferedReader A0X;
        Context context = this.A00;
        T99 t992 = C9988Rki.A00;
        if (t992 != null) {
            return t992;
        }
        synchronized (C9988Rki.class) {
            t99 = C9988Rki.A00;
            if (t99 == null) {
                String str = Build.TYPE;
                String str2 = Build.TAGS;
                if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        StrictMode.allowThreadDiskWrites();
                        File A0s = JTO.A0s(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                        if (A0s.exists()) {
                            obj = new C8418Qu9(A0s);
                        } else {
                            obj = C8419QuA.A00;
                        }
                    } catch (RuntimeException e) {
                        Log.e("HermeticFileOverrides", "no data dir", e);
                        obj = C8419QuA.A00;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    if (obj instanceof C8418Qu9) {
                        Object obj2 = ((C8418Qu9) obj).A00;
                        try {
                            A0X = Pxg.A0X(new FileInputStream((File) obj2));
                            01r r5 = new 01r(0);
                            HashMap A1E = AnonymousClass7TE.A1E();
                            while (true) {
                                String readLine = A0X.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                String[] split = readLine.split(" ", 3);
                                if (split.length != 3) {
                                    Log.e("HermeticFileOverrides", 002.A0R("Invalid: ", readLine));
                                } else {
                                    String str3 = new String(split[0]);
                                    String decode = Uri.decode(new String(split[1]));
                                    String A0r = DbS.A0r(split[2], A1E);
                                    if (A0r == null) {
                                        String str4 = new String(split[2]);
                                        A0r = Uri.decode(str4);
                                        if (A0r.length() < 1024 || A0r == str4) {
                                            A1E.put(str4, A0r);
                                        }
                                    }
                                    01r r0 = (01r) r5.get(str3);
                                    if (r0 == null) {
                                        r0 = new 01r(0);
                                        r5.put(str3, r0);
                                    }
                                    r0.put(decode, A0r);
                                }
                            }
                            Log.w("HermeticFileOverrides", 002.A0u("Parsed ", obj2.toString(), " for Android package ", context.getPackageName()));
                            C10270RpU rpU = new C10270RpU(r5);
                            A0X.close();
                            t99 = new C8418Qu9(rpU);
                        } catch (IOException e2) {
                            throw C41845B3m.A0j(e2);
                        } catch (Throwable th2) {
                            C9153RRe.A00(th, th2);
                        }
                    } else {
                        t99 = C8419QuA.A00;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                } else {
                    t99 = C8419QuA.A00;
                }
                C9988Rki.A00 = t99;
            }
        }
        return t99;
        throw th;
    }
}
