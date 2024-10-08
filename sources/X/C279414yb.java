package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.4yb  reason: invalid class name and case insensitive filesystem */
public final class C279414yb implements 1FX, C279424yc {
    public ByteArrayOutputStream A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final File A05;
    public final Boolean A06;
    public final List A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (X.C63311Kuu.A00(r7).booleanValue() == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C279414yb(com.instagram.common.session.UserSession r7, android.content.Context r8, boolean r9) {
        /*
            r6 = this;
            r2 = 1
            r6.<init>()
            r6.A01 = r8
            r6.A02 = r7
            r6.A08 = r9
            X.0Tu r5 = X.0Tu.A05
            r0 = 36324703085801744(0x810d2000003110, double:3.0352267270755203E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            r4 = 0
            if (r0 != 0) goto L_0x0068
            X.1V1 r0 = X.1V0.A06
            java.io.File r0 = r0.A00(r8, r7)
        L_0x001e:
            r6.A05 = r0
            X.0eO r3 = X.0eO.A03
            r1 = 0
            X.9L9 r0 = new X.9L9
            r0.<init>(r6, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r6.A03 = r0
            r0 = 36324703085867281(0x810d2000013111, double:3.035226727116966E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 != 0) goto L_0x0053
            X.0JN r0 = X.0JN.A01()
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x004e
            java.lang.Boolean r0 = X.C63311Kuu.A00(r7)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L_0x0053:
            r6.A06 = r4
            X.9L9 r0 = new X.9L9
            r0.<init>(r6, r2)
            X.0eM r0 = X.AnonymousClass0eN.A00(r3, r0)
            r6.A04 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A07 = r0
            return
        L_0x0068:
            r0 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279414yb.<init>(com.instagram.common.session.UserSession, android.content.Context, boolean):void");
    }

    public final void DfF(ByteArrayOutputStream byteArrayOutputStream) {
        0qQ.A0B(byteArrayOutputStream, 0);
        UserSession userSession = this.A02;
        if (C279614yw.A00(userSession).booleanValue()) {
            List list = this.A07;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            0qQ.A07(byteArray);
            list.add(byteArray);
        } else if (182.A06(0Tu.A05, userSession, 36328529901731220L)) {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = this.A00;
                if (byteArrayOutputStream2 != null) {
                    byteArrayOutputStream2.close();
                }
            } catch (IOException e) {
                0KC.A0F("FirstPageOnlyDeferStrategy", "Exception on close ByteArrayOutputStream", e);
            }
            this.A00 = byteArrayOutputStream;
        } else {
            A00();
        }
    }

    private final void A00() {
        UserSession userSession = this.A02;
        0Tu r5 = 0Tu.A05;
        int A012 = (int) 182.A01(r5, userSession, 36610004878563282L);
        if (A012 == 0) {
            0nY.A00().ATE(new C386629ku(this, (int) 182.A01(r5, userSession, 36610004878628819L)));
        } else if (A012 != 1) {
            if (A012 == 2) {
                AnonymousClass1HI.A02.Eyn(new C387049la(this), true);
            } else if (A012 == 3) {
                AnonymousClass19S A022 = AnonymousClass1HX.A02(19927624, 3);
                C376879Jr r2 = new C376879Jr(this, (AnonymousClass4D7) null, 26);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
            }
        } else if (C279614yw.A00(userSession).booleanValue()) {
            A01(this);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            if (byteArrayOutputStream != null) {
                A02(this, byteArrayOutputStream);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C279414yb r15) {
        /*
            r0 = 1351(0x547, float:1.893E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = "FirstPageOnlyDeferStrategy"
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r14 = 1
            java.util.List r10 = r15.A07     // Catch:{ JSONException -> 0x0071 }
            r0 = 10
            int r0 = X.0Yv.A1E(r10, r0)     // Catch:{ JSONException -> 0x0071 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0071 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x0071 }
            java.util.Iterator r13 = r10.iterator()     // Catch:{ JSONException -> 0x0071 }
            r6 = 0
            r11 = 0
        L_0x0021:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x006f }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r3 = r13.next()     // Catch:{ JSONException -> 0x006f }
            int r12 = r11 + 1
            if (r11 >= 0) goto L_0x0037
            X.0sr.A1T()     // Catch:{ JSONException -> 0x006f }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ JSONException -> 0x006f }
            throw r0     // Catch:{ JSONException -> 0x006f }
        L_0x0037:
            byte[] r3 = (byte[]) r3     // Catch:{ JSONException -> 0x006f }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006f }
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05     // Catch:{ JSONException -> 0x006f }
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x006f }
            r0.<init>(r3, r1)     // Catch:{ JSONException -> 0x006f }
            r8.<init>(r0)     // Catch:{ JSONException -> 0x006f }
            boolean r0 = r8.has(r7)     // Catch:{ JSONException -> 0x006f }
            if (r0 == 0) goto L_0x0060
            org.json.JSONArray r4 = r8.getJSONArray(r7)     // Catch:{ JSONException -> 0x006f }
            int r3 = r4.length()     // Catch:{ JSONException -> 0x006f }
            r1 = 0
        L_0x0054:
            if (r1 >= r3) goto L_0x0060
            org.json.JSONObject r0 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x006f }
            r5.put(r0)     // Catch:{ JSONException -> 0x006f }
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0060:
            int r0 = r10.size()     // Catch:{ JSONException -> 0x006f }
            int r0 = r0 - r14
            if (r11 != r0) goto L_0x0068
            r6 = r8
        L_0x0068:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ JSONException -> 0x006f }
            r9.add(r0)     // Catch:{ JSONException -> 0x006f }
            r11 = r12
            goto L_0x0021
        L_0x006f:
            r4 = move-exception
            goto L_0x0073
        L_0x0071:
            r4 = move-exception
            r6 = 0
        L_0x0073:
            java.lang.String r3 = "Failed to parse and merge feed responses"
            X.0KC.A0F(r2, r3, r4)
            X.0wj r1 = X.0wj.A01
            r0 = 817905005(0x30c03d6d, float:1.3987297E-9)
            X.0f9 r0 = r1.AEf(r3, r0)
            r0.ERJ(r4)
            r0.report()
        L_0x0087:
            if (r6 == 0) goto L_0x0127
            int r1 = r5.length()
            java.lang.String r0 = "num_results"
            r6.put(r0, r1)
            r6.put(r7, r5)
            java.io.File r4 = r15.A05
            if (r4 != 0) goto L_0x00a1
            X.0eM r0 = r15.A03
            java.lang.Object r4 = r0.getValue()
            java.io.File r4 = (java.io.File) r4
        L_0x00a1:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x00b1
            X.1V1 r3 = X.1V0.A06
            android.content.Context r1 = r15.A01
            com.instagram.common.session.UserSession r0 = r15.A02
            java.io.File r4 = r3.A00(r1, r0)
        L_0x00b1:
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = ".pending"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00c6 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00c6 }
            goto L_0x00e0
        L_0x00c6:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x00db
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00db
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x00db
            r0.mkdirs()
        L_0x00db:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x011d }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x011d }
        L_0x00e0:
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x00f4 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x00f4 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x00f4 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ IOException -> 0x00f4 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00f4 }
            r5.write(r0)     // Catch:{ IOException -> 0x00f4 }
            goto L_0x010c
        L_0x00f4:
            r1 = move-exception
            java.lang.Boolean r0 = r15.A06
            if (r0 != 0) goto L_0x0101
            X.0eM r0 = r15.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0101:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = "Exception on writing cache file"
            X.0KC.A0F(r2, r0, r1)
        L_0x010c:
            r5.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0124
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = "Exception on closing file output stream"
            X.0KC.A0F(r2, r0, r1)     // Catch:{ all -> 0x0117 }
            goto L_0x0124
        L_0x0117:
            r0 = move-exception
            r3.renameTo(r4)
            throw r0
        L_0x011c:
            throw r1
        L_0x011d:
            r1 = move-exception
            java.lang.String r0 = "swallowing error on open after retying to create and open"
            X.0KC.A0F(r2, r0, r1)
            return
        L_0x0124:
            r3.renameTo(r4)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C279414yb.A01(X.4yb):void");
    }

    public static final void A02(C279414yb r6, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream fileOutputStream;
        File parentFile;
        File file = r6.A05;
        if (file == null) {
            file = (File) r6.A03.getValue();
        }
        if (!file.exists()) {
            file = 1V0.A06.A00(r6.A01, r6.A02);
        }
        File file2 = new File(002.A0R(file.getPath(), ".pending"));
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException unused) {
            File parentFile2 = file2.getParentFile();
            if (!(parentFile2 == null || parentFile2.exists() || (parentFile = file2.getParentFile()) == null)) {
                parentFile.mkdirs();
            }
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (FileNotFoundException e) {
                0KC.A0F("FirstPageOnlyDeferStrategy", "swallowing error on open after retying to create and open", e);
                return;
            }
        }
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e2) {
            Boolean bool = r6.A06;
            if (bool == null) {
                bool = (Boolean) r6.A04.getValue();
            }
            if (bool.booleanValue()) {
                0KC.A0F("FirstPageOnlyDeferStrategy", "Exception on writing cache file", e2);
            } else {
                throw e2;
            }
        }
        try {
            fileOutputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            0KC.A0F("FirstPageOnlyDeferStrategy", "Exception on closing file output stream", e3);
        } catch (Throwable th) {
            file2.renameTo(file);
            throw th;
        }
        file2.renameTo(file);
    }

    public final InputStream FNb(1Fn r3, InputStream inputStream) {
        String str;
        if (r3 == null || (str = r3.A01) == null) {
            str = "";
        }
        if (!this.A08 || !str.equals("cache")) {
            return inputStream;
        }
        return new C279604yv(this, inputStream);
    }

    public final void onFinish() {
        if (this.A08) {
            A00();
        }
    }
}
