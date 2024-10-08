package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8sG  reason: invalid class name and case insensitive filesystem */
public final class C368218sG {
    public final 0Pj A00;
    public final 2LC A01;
    public final AtomicInteger A02 = new AtomicInteger((int) (Math.random() * 2.147483647E9d));
    public final C368078s2 A03;
    public final C368168sB A04;
    public final C368188sD A05;
    public final C368068s1 A06;

    public C368218sG(C368058s0 r10) {
        C368068s1 r8 = r10.A05;
        C368078s2 r7 = r10.A02;
        C368168sB r6 = r10.A03;
        C368188sD r5 = r10.A04;
        2LC r4 = r10.A01;
        this.A06 = r8;
        this.A03 = r7;
        this.A04 = r6;
        this.A05 = r5;
        this.A01 = r4;
        this.A00 = r10.A00;
    }

    public static ContentProviderClient A00(Context context, Enum enumR, Integer num, String str, C368148s9 r18, C368218sG r19) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        C368148s9 r3 = r18;
        C368218sG r4 = r19;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    if (!packageManager.getApplicationInfo(r3.A02, 0).enabled && (enumR instanceof C368238sI)) {
                        C368188sD r6 = r4.A05;
                        String name = C368228sH.A00(r3.A04).name();
                        String name2 = enumR.name();
                        Integer num2 = AnonymousClass05K.A07;
                        if (num.intValue() != 0) {
                            str4 = "LITE_PROVIDER";
                        } else {
                            str4 = "LEGACY_PROVIDER";
                        }
                        r6.A03(num2, name, name2, r6.A01("resolver_name", str4, "instance_key", str5));
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    if (enumR instanceof C368238sI) {
                        C368188sD r62 = r4.A05;
                        String name3 = C368228sH.A00(r3.A04).name();
                        String name4 = enumR.name();
                        Integer num3 = AnonymousClass05K.A08;
                        if (num.intValue() != 0) {
                            str3 = "LITE_PROVIDER";
                        } else {
                            str3 = "LEGACY_PROVIDER";
                        }
                        r62.A03(num3, name3, name4, r62.A01("resolver_name", str3, TraceFieldType.FailureReason, e.getMessage(), "instance_key", str5));
                    }
                }
            }
            Uri uri = r3.A00;
            0qQ.A0B(uri, 1);
            0Pj r63 = r4.A00;
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = null;
            } else {
                try {
                    0RJ A012 = 0RJ.A01(context, authority);
                    if (!r63.A05(A012, 0cB.A02(context))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("The provider for uri '");
                        sb.append(authority);
                        sb.append("' is not trusted: ");
                        sb.append(A012);
                        throw new SecurityException(sb.toString());
                    }
                } catch (SecurityException unused) {
                    authority = null;
                }
            }
            if (authority == null) {
                return null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            0Um.A00(authority, -635758405, AnonymousClass05K.A00);
            return contentResolver.acquireUnstableContentProviderClient(authority);
        } catch (SecurityException e2) {
            if (enumR instanceof C368238sI) {
                C368188sD r42 = r4.A05;
                String name5 = C368228sH.A00(r3.A04).name();
                String name6 = enumR.name();
                Integer num4 = AnonymousClass05K.A15;
                if (num.intValue() != 0) {
                    str2 = "LITE_PROVIDER";
                } else {
                    str2 = "LEGACY_PROVIDER";
                }
                r42.A03(num4, name5, name6, r42.A01("resolver_name", str2, TraceFieldType.FailureReason, e2.getMessage(), "instance_key", str5));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00da, code lost:
        if (r8.moveToNext() != true) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(android.content.Context r40, java.lang.String r41, java.util.List r42, X.C368218sG r43) {
        /*
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r16 = r42.iterator()
        L_0x0009:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r4 = r16.next()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.util.List r0 = X.C368118s6.A00
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.8s9 r0 = (X.C368148s9) r0
            X.8s4 r0 = r0.A04
            if (r4 != r0) goto L_0x0022
            r3.add(r1)
            goto L_0x0022
        L_0x0037:
            java.util.Iterator r15 = r3.iterator()
        L_0x003b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r3 = r15.next()
            X.8s9 r3 = (X.C368148s9) r3
            r4 = r43
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A02
            int r0 = r0.incrementAndGet()
            java.lang.String r13 = java.lang.Integer.toString(r0)
            X.8sD r2 = r4.A05
            X.8s4 r7 = r3.A04
            X.8s5 r0 = X.C368228sH.A00(r7)
            java.lang.String r1 = r0.name()
            X.8sI r22 = X.C368238sI.SAVED_ACCOUNTS
            java.lang.String r0 = "SAVED_ACCOUNTS"
            java.lang.String r34 = "resolver_name"
            java.lang.Integer r24 = X.AnonymousClass05K.A00
            java.lang.String r35 = "LEGACY_PROVIDER"
            r5 = 1
            java.lang.String r36 = "caller_name"
            r6 = 3
            java.lang.String r38 = "instance_key"
            r26 = r41
            r37 = r26
            r39 = r13
            java.lang.String[] r8 = new java.lang.String[]{r34, r35, r36, r37, r38, r39}
            java.util.HashMap r8 = r2.A01(r8)
            r2.A09(r1, r8, r0)
            r27 = r40
            r28 = r22
            r29 = r24
            r30 = r13
            r31 = r3
            r32 = r4
            android.content.ContentProviderClient r18 = A00(r27, r28, r29, r30, r31, r32)
            if (r18 == 0) goto L_0x003b
            X.8sB r8 = r4.A04
            r8.DmG(r3)
            X.8s2 r8 = r4.A03     // Catch:{ RemoteException -> 0x016c }
            X.0qQ.A0B(r13, r6)     // Catch:{ RemoteException -> 0x016c }
            X.8s4 r6 = X.C368098s4.INSTAGRAM     // Catch:{ RemoteException -> 0x016c }
            if (r7 != r6) goto L_0x00c0
            r19 = 0
            r21 = r3
            r23 = r2
            r17 = r8
            r20 = r13
            java.util.ArrayList r7 = r17.A01(r18, r19, r20, r21, r22, r23)     // Catch:{ RemoteException -> 0x016c }
        L_0x00ae:
            r25 = r13
            r27 = r7
            r28 = r3
            r29 = r22
            r30 = r4
            A04(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ RemoteException -> 0x016c }
            r12.addAll(r7)     // Catch:{ RemoteException -> 0x016c }
            goto L_0x003b
        L_0x00c0:
            r30 = 0
            r27 = r18
            r31 = r13
            r32 = r3
            r33 = r2
            android.database.Cursor r8 = X.C368078s2.A00(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ RemoteException -> 0x016c }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x016c }
            r7.<init>()     // Catch:{ RemoteException -> 0x016c }
            if (r8 == 0) goto L_0x00dc
            boolean r6 = r8.moveToNext()     // Catch:{ RemoteException -> 0x016c }
            r9 = 1
            if (r6 == r5) goto L_0x00dd
        L_0x00dc:
            r9 = 0
        L_0x00dd:
            if (r9 == 0) goto L_0x00ae
            java.lang.String r5 = r8.getString(r5)     // Catch:{ JSONException -> 0x0146 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0146 }
            r11.<init>()     // Catch:{ JSONException -> 0x0146 }
            if (r5 == 0) goto L_0x0104
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0146 }
            r10.<init>(r5)     // Catch:{ JSONException -> 0x0146 }
            int r9 = r10.length()     // Catch:{ JSONException -> 0x0146 }
            r6 = 0
        L_0x00f4:
            if (r6 >= r9) goto L_0x0104
            java.lang.Object r5 = r10.get(r6)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0146 }
            r11.add(r5)     // Catch:{ JSONException -> 0x0146 }
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0104:
            java.util.Iterator r14 = r11.iterator()     // Catch:{ JSONException -> 0x0146 }
        L_0x0108:
            boolean r5 = r14.hasNext()     // Catch:{ JSONException -> 0x0146 }
            if (r5 == 0) goto L_0x0162
            java.lang.Object r5 = r14.next()     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x0146 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0146 }
            r10.<init>(r5)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r5 = "profile"
            org.json.JSONObject r6 = r10.getJSONObject(r5)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r5 = "uid"
            java.lang.String r11 = r6.getString(r5)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r5 = "name"
            java.lang.String r9 = r6.getString(r5)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r6 = ""
            X.9Go r5 = new X.9Go     // Catch:{ JSONException -> 0x0146 }
            r5.<init>(r11, r9, r6)     // Catch:{ JSONException -> 0x0146 }
            java.lang.String r6 = "access_token"
            java.lang.String r9 = r10.getString(r6)     // Catch:{ JSONException -> 0x0146 }
            X.9Gp r6 = new X.9Gp     // Catch:{ JSONException -> 0x0146 }
            r6.<init>(r9, r5)     // Catch:{ JSONException -> 0x0146 }
            X.9Gr r5 = new X.9Gr     // Catch:{ JSONException -> 0x0146 }
            r5.<init>(r3, r6)     // Catch:{ JSONException -> 0x0146 }
            r7.add(r5)     // Catch:{ JSONException -> 0x0146 }
            goto L_0x0108
        L_0x0146:
            r6 = move-exception
            java.lang.Integer r5 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0167 }
            java.lang.String r29 = "failure_reason"
            java.lang.String r30 = r6.getMessage()     // Catch:{ all -> 0x0167 }
            r27 = r34
            r28 = r35
            r31 = r38
            r32 = r13
            java.lang.String[] r6 = new java.lang.String[]{r27, r28, r29, r30, r31, r32}     // Catch:{ all -> 0x0167 }
            java.util.HashMap r6 = r2.A01(r6)     // Catch:{ all -> 0x0167 }
            r2.A03(r5, r1, r0, r6)     // Catch:{ all -> 0x0167 }
        L_0x0162:
            r8.close()     // Catch:{ RemoteException -> 0x016c }
            goto L_0x00ae
        L_0x0167:
            r3 = move-exception
            r8.close()     // Catch:{ RemoteException -> 0x016c }
            throw r3     // Catch:{ RemoteException -> 0x016c }
        L_0x016c:
            r3 = move-exception
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            java.lang.String r7 = "failure_reason"
            java.lang.String r8 = r3.getMessage()
            r5 = r34
            r6 = r35
            r9 = r38
            r10 = r13
            java.lang.String[] r3 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            java.util.HashMap r3 = r2.A01(r3)
            r2.A03(r4, r1, r0, r3)
            goto L_0x003b
        L_0x0189:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368218sG.A01(android.content.Context, java.lang.String, java.util.List, X.8sG):java.util.ArrayList");
    }

    public static void A02(Context context, String str, String str2, List list, C368148s9 r32, C368218sG r33) {
        Integer num;
        C368218sG r15 = r33;
        String num2 = Integer.toString(r15.A02.incrementAndGet());
        C368188sD r8 = r15.A05;
        C368148s9 r6 = r32;
        String name = C368228sH.A00(r6.A04).name();
        C368238sI r7 = C368238sI.ACTIVE_ACCOUNT;
        Integer num3 = AnonymousClass05K.A00;
        String str3 = str2;
        r8.A09(name, r8.A01("resolver_name", "LEGACY_PROVIDER", "caller_name", str3, "instance_key", num2), "ACTIVE_ACCOUNT");
        ContentProviderClient A002 = A00(context, r7, num3, num2, r6, r15);
        if (A002 != null) {
            r15.A04.DmG(r6);
            try {
                ArrayList A012 = r15.A03.A01(A002, str, num2, r6, r7, r8);
                A04(num3, num2, str3, A012, r6, r7, r15);
                list.addAll(A012);
                A002.close();
            } catch (RemoteException e) {
                e = e;
                num = AnonymousClass05K.A1F;
                r8.A03(num, name, "ACTIVE_ACCOUNT", r8.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num2));
            } catch (SecurityException e2) {
                e = e2;
                num = AnonymousClass05K.A15;
                r8.A03(num, name, "ACTIVE_ACCOUNT", r8.A01("resolver_name", "LEGACY_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num2));
            }
        }
    }

    public static void A03(Context context, String str, List list, C368148s9 r35, C368108s5 r36, C368238sI r37, C368218sG r38) {
        ArrayList arrayList;
        F3S f3s;
        C368218sG r8 = r38;
        String num = Integer.toString(r8.A02.incrementAndGet());
        C368188sD r15 = r8.A05;
        C368148s9 r14 = r35;
        C368098s4 r4 = r14.A04;
        String name = C368228sH.A00(r4).name();
        C368238sI r10 = r37;
        String name2 = r10.name();
        Integer num2 = AnonymousClass05K.A01;
        String str2 = str;
        r15.A09(name, r15.A01("resolver_name", "LITE_PROVIDER", "caller_name", str2, "instance_key", num), name2);
        ContentProviderClient A002 = A00(context, r10, num2, num, r14, r8);
        if (A002 != null) {
            C368108s5 r7 = r36;
            try {
                0qQ.A0B(r7, 3);
                0qQ.A0B(num, 5);
                Cursor A003 = C368078s2.A00(A002, r10, num2, (String) null, num, r14, r15);
                if (A003 != null) {
                    arrayList = new ArrayList();
                    C376069Gk r5 = (C376069Gk) C376039Gh.A00.get(r4);
                    if (r5 == null) {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Can't find corresponding transformer for SsoSource =");
                            sb.append(r4);
                            throw new RuntimeException(sb.toString());
                        } catch (C369078tn e) {
                            r15.A03(AnonymousClass05K.A1I, name, name2, r15.A01("resolver_name", "LITE_PROVIDER", TraceFieldType.FailureReason, e.getMessage(), "instance_key", num));
                            A003.close();
                        } catch (Throwable th) {
                            A003.close();
                            throw th;
                        }
                    } else {
                        while (A003.moveToNext()) {
                            if (r4 == C368098s4.INSTAGRAM) {
                                f3s = r5.FHl(A003, r10);
                            } else {
                                f3s = r5.FHj(A003, r7, r10);
                            }
                            if (f3s != null) {
                                arrayList.add(f3s);
                            }
                        }
                        A003.close();
                        A04(num2, num, str2, arrayList, r14, r10, r8);
                        list.addAll(arrayList);
                        A002.close();
                    }
                }
                arrayList = new ArrayList();
                A04(num2, num, str2, arrayList, r14, r10, r8);
                list.addAll(arrayList);
                A002.close();
            } catch (RemoteException e2) {
                r15.A03(AnonymousClass05K.A1F, r7.name(), name2, r15.A01("resolver_name", "LITE_PROVIDER", TraceFieldType.FailureReason, e2.getMessage(), "instance_key", num));
            }
        }
    }

    public static void A04(Integer num, String str, String str2, List list, C368148s9 r16, C368238sI r17, C368218sG r18) {
        String str3;
        String str4;
        String str5;
        boolean isEmpty = list.isEmpty();
        C368218sG r2 = r18;
        C368188sD r11 = r2.A05;
        String name = C368228sH.A00(r16.A04).name();
        String name2 = r17.name();
        if (!isEmpty) {
            if (num.intValue() != 0) {
                str5 = "LITE_PROVIDER";
            } else {
                str5 = "LEGACY_PROVIDER";
            }
            HashMap A012 = r11.A01("resolver_name", str5, "instance_key", str);
            C368188sD.A00(C368248sJ.FETCH_SUCCESS, name, name2, (String) null, (String) null, A012, r11);
            if (r11.A02() != null) {
                C368258sK A022 = r11.A02();
                int A002 = C368258sK.A00(A012);
                QuickPerformanceLogger quickPerformanceLogger = A022.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(857814189, A002, 2);
                }
            }
        } else {
            Integer num2 = AnonymousClass05K.A0N;
            if (num.intValue() != 0) {
                str3 = "LITE_PROVIDER";
            } else {
                str3 = "LEGACY_PROVIDER";
            }
            r11.A03(num2, name, name2, r11.A01("resolver_name", str3, "instance_key", str));
        }
        2LC r3 = r2.A01;
        if (r3 != null) {
            for (Object next : list) {
                if (next instanceof F3S) {
                    str4 = ((F3S) next).A02;
                } else if (next instanceof C376139Gr) {
                    str4 = ((C376139Gr) next).A01.A01.A02;
                }
                r3.A00(name, name2, str4, str2);
            }
        }
    }
}
