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

public final class LeX implements 1FX, C279424yc {
    public ByteArrayOutputStream A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final UserSession A05;
    public final List A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final File A09;
    public final Boolean A0A;

    public final void DfF(ByteArrayOutputStream byteArrayOutputStream) {
        0qQ.A0B(byteArrayOutputStream, 0);
        UserSession userSession = this.A05;
        if (C279614yw.A00(userSession).booleanValue()) {
            List list = this.A06;
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
                0KC.A0F("FirstPageOnlyDeferStrategy", C273654mx.A00(1253), e);
            }
            this.A00 = byteArrayOutputStream;
        } else {
            A03();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.LeX r15) {
        /*
            r0 = 1351(0x547, float:1.893E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = "FirstPageOnlyDeferStrategy"
            boolean r0 = r15.A02
            r11 = 1
            if (r0 != 0) goto L_0x0010
            r15.A01 = r11
        L_0x000f:
            return
        L_0x0010:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.List r10 = r15.A06     // Catch:{ JSONException -> 0x0070 }
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r10)     // Catch:{ JSONException -> 0x0070 }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ JSONException -> 0x0070 }
            r6 = 0
            r12 = 0
        L_0x0021:
            boolean r0 = r14.hasNext()     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r3 = r14.next()     // Catch:{ JSONException -> 0x006e }
            int r13 = r12 + 1
            if (r12 >= 0) goto L_0x0037
            X.0sr.A1T()     // Catch:{ JSONException -> 0x006e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ JSONException -> 0x006e }
            throw r0     // Catch:{ JSONException -> 0x006e }
        L_0x0037:
            byte[] r3 = (byte[]) r3     // Catch:{ JSONException -> 0x006e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006e }
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05     // Catch:{ JSONException -> 0x006e }
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x006e }
            r0.<init>(r3, r1)     // Catch:{ JSONException -> 0x006e }
            r8.<init>(r0)     // Catch:{ JSONException -> 0x006e }
            boolean r0 = r8.has(r7)     // Catch:{ JSONException -> 0x006e }
            if (r0 == 0) goto L_0x0060
            org.json.JSONArray r4 = r8.getJSONArray(r7)     // Catch:{ JSONException -> 0x006e }
            int r3 = r4.length()     // Catch:{ JSONException -> 0x006e }
            r1 = 0
        L_0x0054:
            if (r1 >= r3) goto L_0x0060
            org.json.JSONObject r0 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x006e }
            r5.put(r0)     // Catch:{ JSONException -> 0x006e }
            int r1 = r1 + 1
            goto L_0x0054
        L_0x0060:
            int r0 = X.DbT.A02(r10, r11)     // Catch:{ JSONException -> 0x006e }
            if (r12 != r0) goto L_0x0067
            r6 = r8
        L_0x0067:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ JSONException -> 0x006e }
            r9.add(r0)     // Catch:{ JSONException -> 0x006e }
            r12 = r13
            goto L_0x0021
        L_0x006e:
            r4 = move-exception
            goto L_0x0072
        L_0x0070:
            r4 = move-exception
            r6 = 0
        L_0x0072:
            r0 = 1268(0x4f4, float:1.777E-42)
            java.lang.String r3 = X.C273654mx.A00(r0)
            X.0KC.A0F(r2, r3, r4)
            X.0wj r1 = X.0wj.A01
            r0 = 817905005(0x30c03d6d, float:1.3987297E-9)
            X.AnonymousClass7TG.A1I(r1, r3, r4, r0)
        L_0x0083:
            if (r6 == 0) goto L_0x000f
            int r1 = r5.length()
            r0 = 173(0xad, float:2.42E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.put(r0, r1)
            r6.put(r7, r5)
            java.io.File r4 = r15.A09
            if (r4 != 0) goto L_0x00a1
            X.0eM r0 = r15.A07
            java.lang.Object r4 = r0.getValue()
            java.io.File r4 = (java.io.File) r4
        L_0x00a1:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x00b1
            X.1V1 r3 = X.1V0.A06
            android.content.Context r1 = r15.A04
            com.instagram.common.session.UserSession r0 = r15.A05
            java.io.File r4 = r3.A00(r1, r0)
        L_0x00b1:
            java.lang.String r1 = r4.getPath()
            java.lang.String r0 = ".pending"
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.io.File r3 = X.AnonymousClass7TE.A0t(r0)
            java.io.FileOutputStream r5 = X.JTO.A0t(r3)     // Catch:{ FileNotFoundException -> 0x00c4 }
            goto L_0x00dd
        L_0x00c4:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00d9
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L_0x00d9
            r0.mkdirs()
        L_0x00d9:
            java.io.FileOutputStream r5 = X.JTO.A0t(r3)     // Catch:{ FileNotFoundException -> 0x012c }
        L_0x00dd:
            java.lang.String r1 = X.DbT.A10(r6)     // Catch:{ IOException -> 0x00ee }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException -> 0x00ee }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ IOException -> 0x00ee }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00ee }
            r5.write(r0)     // Catch:{ IOException -> 0x00ee }
            goto L_0x010a
        L_0x00ee:
            r1 = move-exception
            java.lang.Boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x0103
            boolean r0 = r0.booleanValue()
        L_0x00f7:
            if (r0 == 0) goto L_0x012b
            r0 = 481(0x1e1, float:6.74E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0F(r2, r0, r1)
            goto L_0x010a
        L_0x0103:
            X.0eM r0 = r15.A08
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            goto L_0x00f7
        L_0x010a:
            r5.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x0118
        L_0x010e:
            r1 = move-exception
            r0 = 480(0x1e0, float:6.73E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x0121 }
            X.0KC.A0F(r2, r0, r1)     // Catch:{ all -> 0x0121 }
        L_0x0118:
            r3.renameTo(r4)
            java.util.List r0 = r15.A06
            r0.clear()
            return
        L_0x0121:
            r1 = move-exception
            r3.renameTo(r4)
            java.util.List r0 = r15.A06
            r0.clear()
            throw r1
        L_0x012b:
            throw r1
        L_0x012c:
            r1 = move-exception
            r0 = 981(0x3d5, float:1.375E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0F(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LeX.A01(X.LeX):void");
    }

    public static final void A02(LeX leX, ByteArrayOutputStream byteArrayOutputStream) {
        FileOutputStream fileOutputStream;
        boolean A1Z;
        File parentFile;
        File file = leX.A09;
        if (file == null) {
            file = (File) leX.A07.getValue();
        }
        if (!file.exists()) {
            file = 1V0.A06.A00(leX.A04, leX.A05);
        }
        File A0t = AnonymousClass7TE.A0t(002.A0R(file.getPath(), ".pending"));
        try {
            fileOutputStream = JTO.A0t(A0t);
        } catch (FileNotFoundException unused) {
            File parentFile2 = A0t.getParentFile();
            if (!(parentFile2 == null || parentFile2.exists() || (parentFile = A0t.getParentFile()) == null)) {
                parentFile.mkdirs();
            }
            try {
                fileOutputStream = JTO.A0t(A0t);
            } catch (FileNotFoundException e) {
                0KC.A0F("FirstPageOnlyDeferStrategy", C273654mx.A00(981), e);
                return;
            }
        }
        try {
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (IOException e2) {
            Boolean bool = leX.A0A;
            if (bool != null) {
                A1Z = bool.booleanValue();
            } else {
                A1Z = AnonymousClass7TF.A1Z(leX.A08);
            }
            if (A1Z) {
                0KC.A0F("FirstPageOnlyDeferStrategy", C273654mx.A00(481), e2);
            } else {
                throw e2;
            }
        }
        try {
            fileOutputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            0KC.A0F("FirstPageOnlyDeferStrategy", C273654mx.A00(480), e3);
        } catch (Throwable th) {
            A0t.renameTo(file);
            throw th;
        }
        A0t.renameTo(file);
    }

    public final void A03() {
        UserSession userSession = this.A05;
        0Tu r4 = 0Tu.A05;
        int A042 = DbS.A04(r4, userSession, 36610004878563282L);
        if (A042 == 0) {
            0nY.A00().ATE(new KIX(this, DbS.A04(r4, userSession, 36610004878628819L)));
        } else if (A042 == 1) {
            A00(userSession, this);
        } else if (A042 == 2) {
            AnonymousClass1HI.A02.Eyn(new KJO(this), true);
        } else if (A042 == 3) {
            C51971G9r.A1P(this, AnonymousClass1HX.A02(19927624, 3), 40);
        }
    }

    public final InputStream FNb(1Fn r3, InputStream inputStream) {
        String str;
        if (r3 == null || (str = r3.A01) == null) {
            str = "";
        }
        if (!this.A03 || !str.equals("cache")) {
            return inputStream;
        }
        return new C279604yv(this, inputStream);
    }

    public final void onFinish() {
        if (this.A03) {
            UserSession userSession = this.A05;
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36328529902189977L) && !182.A06(r2, userSession, 36328529902124440L)) {
                A03();
            }
        }
        if (this.A03) {
            this.A02 = true;
        }
        if (this.A01) {
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (X.C63311Kuu.A00(r7).booleanValue() == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LeX(android.content.Context r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            X.AnonymousClass7TG.A1O(r6, r7)
            r5.<init>()
            r5.A04 = r6
            r5.A05 = r7
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324703085801744(0x810d2000003110, double:3.0352267270755203E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            r3 = 0
            if (r0 != 0) goto L_0x0068
            X.1V1 r0 = X.1V0.A06
            java.io.File r0 = r0.A00(r6, r7)
        L_0x001e:
            r5.A09 = r0
            X.0eO r2 = X.0eO.A03
            r0 = 20
            X.MML r0 = X.MML.A00(r5, r0)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r5.A07 = r0
            r0 = 36324703085867281(0x810d2000013111, double:3.035226727116966E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
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
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0053:
            r5.A0A = r3
            r0 = 21
            X.MML r0 = X.MML.A00(r5, r0)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r5.A08 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r5.A06 = r0
            return
        L_0x0068:
            r0 = r3
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LeX.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }

    public static void A00(0lg r0, LeX leX) {
        if (C279614yw.A00(r0).booleanValue()) {
            A01(leX);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = leX.A00;
        if (byteArrayOutputStream != null) {
            A02(leX, byteArrayOutputStream);
        }
    }
}
