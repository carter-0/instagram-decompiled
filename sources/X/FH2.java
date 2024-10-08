package X;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class FH2 {
    public static final FH2 A00 = new Object();

    /* JADX WARNING: type inference failed for: r6v1, types: [X.EbZ, java.lang.Object, X.EUZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r1 == 0) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.EUZ A00(android.content.Context r13, X.0lg r14, X.EW4 r15, X.C46634DiE r16) {
        /*
            r3 = 0
            X.0qQ.A0B(r13, r3)
            r2 = 1
            r7 = 2
            X.0qQ.A0B(r15, r7)
            r0 = 3
            int r1 = r15.ordinal()
            r6 = 0
            if (r1 == r3) goto L_0x0030
            if (r1 == r2) goto L_0x00cc
            if (r1 == r7) goto L_0x002c
            if (r1 == r0) goto L_0x001f
            r0 = 4
            if (r1 == r0) goto L_0x0104
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x001f:
            java.lang.String r2 = A03(r13)
            if (r2 == 0) goto L_0x0104
            int r0 = r2.length()
            if (r0 != 0) goto L_0x00f2
            return r6
        L_0x002c:
            java.lang.String r2 = X.C49315Esy.A01
            goto L_0x00f0
        L_0x0030:
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r13.getSystemService(r0)
            if (r10 == 0) goto L_0x0107
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            int r9 = r10.getSimState()
            switch(r9) {
                case 1: goto L_0x00af;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00be;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00c4;
                case 9: goto L_0x00c8;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r11 = "unknown"
        L_0x0043:
            boolean r12 = X.1DL.A06(r13)
            long r2 = java.lang.System.currentTimeMillis()
            double r0 = X.DbS.A00()
            X.0wc r5 = X.AnonymousClass0kN.A02(r14)
            java.lang.String r4 = "sim_card_state"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r5, r4)
            X.DbW.A11(r8)
            X.DbW.A14(r8, r2)
            double r4 = (double) r2
            X.DbY.A1D(r8, r4, r0)
            X.FH8.A05(r8)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            r2 = 4834(0x12e2, float:6.774E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            r8.A7p(r2, r3)
            X.DbY.A1B(r8)
            X.DbT.A1P(r8)
            java.lang.String r2 = "sim_state"
            X.DbY.A1I(r8, r2, r11, r0)
            r0 = r16
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "step"
            X.FH8.A0D(r8, r14, r0, r1)
            if (r12 == 0) goto L_0x00a7
            r0 = 5
            if (r9 != r0) goto L_0x00a7
            java.lang.String r0 = r10.getLine1Number()
            if (r0 == 0) goto L_0x0099
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            java.lang.Boolean r1 = X.DbT.A0l(r0)
            r0 = 4835(0x12e3, float:6.775E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A7p(r0, r1)
        L_0x00a7:
            r8.Cgf()
            java.lang.String r2 = A02(r13)
            goto L_0x00f0
        L_0x00af:
            java.lang.String r11 = "absent"
            goto L_0x0043
        L_0x00b2:
            java.lang.String r11 = "pin_required"
            goto L_0x0043
        L_0x00b5:
            java.lang.String r11 = "puk_required"
            goto L_0x0043
        L_0x00b8:
            java.lang.String r11 = "network_locked"
            goto L_0x0043
        L_0x00bb:
            java.lang.String r11 = "ready"
            goto L_0x0043
        L_0x00be:
            java.lang.String r11 = "not_ready"
            goto L_0x0043
        L_0x00c1:
            java.lang.String r11 = "perm_disabled"
            goto L_0x0043
        L_0x00c4:
            java.lang.String r11 = "card_id_error"
            goto L_0x0043
        L_0x00c8:
            java.lang.String r11 = "card_restricted"
            goto L_0x0043
        L_0x00cc:
            X.FV8 r2 = X.FV8.A00()
            java.lang.String r1 = "ig_android_growth_fx_access_fb_ig_prefill_phone"
            java.lang.String r0 = "PhoneNumberPrefillGenerater"
            java.lang.String r1 = r2.A02(r14, r1, r0)
            android.util.Pair r0 = X.C48215Eaw.A01
            if (r0 == 0) goto L_0x0104
            android.util.Pair r0 = X.C48215Eaw.A01
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r0.first
        L_0x00e2:
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0104
            android.util.Pair r0 = X.C48215Eaw.A01
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
        L_0x00f0:
            if (r2 == 0) goto L_0x0104
        L_0x00f2:
            java.lang.String r1 = r15.A00
            X.0qQ.A0B(r1, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.EUZ r6 = new X.EUZ
            r6.<init>()
            r6.A02 = r2
            r6.A00 = r0
            r6.A01 = r1
        L_0x0104:
            return r6
        L_0x0105:
            r0 = r6
            goto L_0x00e2
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH2.A00(android.content.Context, X.0lg, X.EW4, X.DiE):X.EUZ");
    }

    public static final String A01(Activity activity, 0lg r15, C46634DiE diE, Integer num) {
        0lg r6 = r15;
        AnonymousClass7TG.A1O(activity, r15);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashMap A1E = AnonymousClass7TE.A1E();
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(activity);
        Object systemService = activity.getSystemService("phone");
        0qQ.A0C(systemService, AnonymousClass000.A00(715));
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        String country = Locale.getDefault().getCountry();
        FH2 fh2 = A00;
        String simCountryIso = telephonyManager.getSimCountryIso();
        0qQ.A0A(A01);
        fh2.A06(A01, r6, simCountryIso, "sim", A1E);
        fh2.A06(A01, r6, telephonyManager.getNetworkCountryIso(), "network", A1E);
        fh2.A06(A01, r15, country, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, A1E);
        Iterator it = A04(activity, r6, diE, A05(num)).iterator();
        while (it.hasNext()) {
            C48254EbZ ebZ = (C48254EbZ) it.next();
            String str = ebZ.A02;
            0qQ.A0A(country);
            try {
                A07(String.valueOf(A01.A0F(str, country).A00), A1E, ebZ.A01);
            } catch (C231962sh unused) {
                "failed_country_code".getClass();
                0xI A012 = 0xI.A01("failed_country_code", (String) null);
                A012.A0C("uuid", DbV.A0t());
                DbU.A1R(A012, r6);
            }
        }
        ArrayList A1D = AnonymousClass7TE.A1D(A1E.values());
        C267484bd A08 = AnonymousClass15o.A00.A08(byteArrayOutputStream);
        A08.A0b();
        Iterator it2 = A1D.iterator();
        while (it2.hasNext()) {
            F3B f3b = (F3B) it2.next();
            A08.A0c();
            String str2 = f3b.A00;
            if (str2 != null) {
                A08.A0R("country_code", str2);
            }
            List list = f3b.A01;
            if (list != null) {
                16P.A03(A08, "source");
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C41846B3n.A18(A08, it3);
                }
                A08.A0Y();
            }
            A08.A0Z();
        }
        A08.A0Y();
        A08.close();
        byteArrayOutputStream.close();
        String byteArrayOutputStream2 = byteArrayOutputStream.toString(ReactWebViewManager.HTML_ENCODING);
        0qQ.A07(byteArrayOutputStream2);
        return byteArrayOutputStream2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012f, code lost:
        if (r1 == false) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(android.content.Context r21) {
        /*
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r12 = r21
            boolean r1 = X.1DL.A07(r12, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0184
            java.lang.String r1 = "android.permission.READ_PROFILE"
            boolean r1 = X.1DL.A07(r12, r1)
            if (r1 == 0) goto L_0x0184
            r1 = 4210(0x1072, float:5.9E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r1)
            r1 = 4211(0x1073, float:5.901E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r1)
            r1 = 1930(0x78a, float:2.705E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r1)
            java.lang.String r3 = "data2"
            java.lang.String r2 = "data3"
            java.lang.String r4 = "mimetype"
            java.lang.String r1 = "data1"
            android.net.Uri r11 = android.provider.ContactsContract.Profile.CONTENT_URI
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r11 == 0) goto L_0x0178
            java.lang.String r10 = "data"
            android.net.Uri r5 = android.net.Uri.withAppendedPath(r11, r10)
            android.content.ContentProviderClient r16 = X.C61990qh.A00(r12, r5)
            if (r16 == 0) goto L_0x0178
            r5 = 0
            android.net.Uri r17 = android.net.Uri.withAppendedPath(r11, r10)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            java.lang.String[] r18 = new java.lang.String[]{r4, r2, r3, r1, r1}     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            java.lang.String r19 = "mimetype = ? OR mimetype in (?, ?)"
            java.lang.String[] r20 = new java.lang.String[]{r7, r8, r9}     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            java.lang.String r21 = "is_primary DESC"
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r5 != 0) goto L_0x005e
            goto L_0x0175
        L_0x005e:
            int r13 = r5.getColumnIndex(r4)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            int r12 = r5.getColumnIndex(r3)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            int r11 = r5.getColumnIndex(r2)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            int r10 = r5.getColumnIndex(r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            int r14 = r5.getColumnIndex(r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
        L_0x0072:
            boolean r1 = r5.moveToNext()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 == 0) goto L_0x0149
            java.lang.String r2 = r5.getString(r13)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r7.equals(r2)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 == 0) goto L_0x00ed
            java.lang.String r4 = r5.getString(r12)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r4 == 0) goto L_0x0099
            java.lang.String r1 = r4.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x0099
            java.util.regex.Pattern r1 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r4, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            if (r1 == 0) goto L_0x009e
            r3 = r0
            goto L_0x00b9
        L_0x009e:
            if (r4 == 0) goto L_0x00b1
            java.lang.String r1 = r4.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x00b1
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r4, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x00b7
            r3 = r4
            r4 = r0
            goto L_0x00b9
        L_0x00b7:
            r4 = r0
            r3 = r0
        L_0x00b9:
            java.lang.String r2 = r5.getString(r11)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r2 == 0) goto L_0x00d0
            java.lang.String r1 = r2.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x00d0
            java.util.regex.Pattern r1 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r2, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x00d1
        L_0x00d0:
            r1 = 0
        L_0x00d1:
            if (r1 == 0) goto L_0x00d5
            r4 = r2
            goto L_0x0133
        L_0x00d5:
            if (r2 == 0) goto L_0x00e8
            java.lang.String r1 = r2.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x00e8
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r2, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x00e9
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            if (r1 == 0) goto L_0x0133
            r3 = r2
            goto L_0x0133
        L_0x00ed:
            boolean r1 = r8.equals(r2)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 == 0) goto L_0x0110
            java.lang.String r4 = r5.getString(r10)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r4 == 0) goto L_0x010a
            java.lang.String r1 = r4.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x010a
            java.util.regex.Pattern r1 = android.util.Patterns.PHONE     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r4, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            if (r1 != 0) goto L_0x010e
            r4 = r0
        L_0x010e:
            r3 = r0
            goto L_0x0133
        L_0x0110:
            boolean r1 = r9.equals(r2)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 == 0) goto L_0x0131
            java.lang.String r3 = r5.getString(r14)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r3 == 0) goto L_0x012d
            java.lang.String r1 = r3.trim()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = r1.isEmpty()     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x012d
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            boolean r1 = X.DbV.A1b(r3, r1)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x012e
        L_0x012d:
            r1 = 0
        L_0x012e:
            r4 = r0
            if (r1 != 0) goto L_0x0133
        L_0x0131:
            r4 = r0
            r3 = r0
        L_0x0133:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x013e
            r15.add(r4)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x0072
        L_0x013e:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            if (r1 != 0) goto L_0x0072
            r6.add(r3)     // Catch:{ RemoteException -> 0x0166, all -> 0x0156 }
            goto L_0x0072
        L_0x0149:
            r16.release()
            boolean r1 = r5.isClosed()
            if (r1 != 0) goto L_0x0178
            r5.close()
            goto L_0x0178
        L_0x0156:
            r1 = move-exception
            r16.release()
            if (r5 == 0) goto L_0x0165
            boolean r0 = r5.isClosed()
            if (r0 != 0) goto L_0x0165
            r5.close()
        L_0x0165:
            throw r1
        L_0x0166:
            r16.release()
            if (r5 == 0) goto L_0x0178
            boolean r1 = r5.isClosed()
            if (r1 != 0) goto L_0x0178
            r5.close()
            goto L_0x0178
        L_0x0175:
            r16.release()
        L_0x0178:
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x0184
            java.lang.Object r0 = X.AnonymousClass7TE.A12(r15)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0184:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FH2.A03(android.content.Context):java.lang.String");
    }

    public static final EnumSet A05(Integer num) {
        EnumSet of;
        if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
            of = EnumSet.of(EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE, EW4.PHONE_NUMBER_SOURCE_FB_FIRST_PARTY, EW4.PHONE_NUMBER_SOURCE_UIG_VIA_PHONE_ID);
        } else {
            of = EnumSet.of(EW4.PHONE_NUMBER_SOURCE_MOBILE_SUBNO_SERVICE);
        }
        EnumSet complementOf = EnumSet.complementOf(of);
        0qQ.A07(complementOf);
        return complementOf;
    }

    private final void A06(PhoneNumberUtil phoneNumberUtil, 0lg r5, String str, String str2, Map map) {
        if (str != null) {
            try {
                int A0A = phoneNumberUtil.A0A(str);
                if (A0A > 0) {
                    A07(String.valueOf(A0A), map, str2);
                }
            } catch (IllegalArgumentException unused) {
                "failed_country_code".getClass();
                0xI A01 = 0xI.A01("failed_country_code", (String) null);
                A01.A0C("failed_country", str);
                A01.A0C("uuid", DbV.A0t());
                DbU.A1R(A01, r5);
            }
        }
    }

    public static final String A02(Context context) {
        if (!1DL.A06(context)) {
            return null;
        }
        Object systemService = context.getSystemService("phone");
        0qQ.A0C(systemService, AnonymousClass000.A00(715));
        try {
            return ((TelephonyManager) systemService).getLine1Number();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final ArrayList A04(Context context, 0lg r5, C46634DiE diE, EnumSet enumSet) {
        AnonymousClass7TG.A1T(context, r5, diE);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(enumSet);
        while (A1G.hasNext()) {
            EW4 ew4 = (EW4) A1G.next();
            0qQ.A0A(ew4);
            EUZ A002 = A00(context, r5, ew4, diE);
            if (A002 != null) {
                A1C.add(A002);
            }
        }
        Collections.sort(A1C, new C51566FwC((0sL) C51843G4b.A00, 12));
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.F3B, java.lang.Object] */
    public static final void A07(String str, Map map, String str2) {
        F3B f3b = (F3B) map.get(str);
        if (f3b != null) {
            0qQ.A0B(str2, 0);
            List list = f3b.A01;
            if (list != null) {
                list.add(str2);
                return;
            }
            return;
        }
        0qQ.A0B(str2, 2);
        ? obj = new Object();
        obj.A00 = str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        obj.A01 = A1C;
        A1C.add(str2);
        map.put(str, obj);
    }
}
