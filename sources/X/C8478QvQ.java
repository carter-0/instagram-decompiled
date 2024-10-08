package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraCapturer;

/* renamed from: X.QvQ  reason: case insensitive filesystem */
public final class C8478QvQ extends ST5 implements C13740TgC {
    public static DecimalFormat A03;
    public final Uri A00;
    public final C11381SQt A01;
    public final String A02;

    public static void A01(String str, Map map, double d) {
        if (d != 0.0d) {
            DecimalFormat decimalFormat = A03;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat("0.######");
                A03 = decimalFormat;
            }
            map.put(str, decimalFormat.format(d));
        }
    }

    public final Uri FPA() {
        return this.A00;
    }

    public final void FPI(C11350SOj sOj) {
        long j;
        int i;
        C8485QvX qvX;
        HashMap A002;
        String str;
        C11350SOj sOj2 = sOj;
        AnonymousClass3Qk.A02(sOj2);
        AnonymousClass3Qk.A08(sOj2.A03, "Can't deliver not submitted measurement");
        AnonymousClass3Qk.A05("deliver should be called on worker thread");
        C11350SOj sOj3 = new C11350SOj(sOj2);
        C8336Qom qom = (C8336Qom) sOj3.A01(C8336Qom.class);
        if (TextUtils.isEmpty(qom.A01)) {
            qvX = this.A00.A0C;
            C11381SQt.A02(qvX);
            A002 = A00(sOj3);
            str = "Ignoring measurement without type";
        } else if (TextUtils.isEmpty(qom.A02)) {
            qvX = this.A00.A0C;
            C11381SQt.A02(qvX);
            A002 = A00(sOj3);
            str = "Ignoring measurement without client id";
        } else {
            Qob qob = this.A01.A02;
            AnonymousClass3Qk.A02(qob);
            AnonymousClass3Qk.A08(AnonymousClass7TF.A1P(qob.A01 ? 1 : 0), "Analytics instance not initialized");
            double d = qom.A00;
            String str2 = qom.A02;
            if (d > 0.0d && d < 100.0d) {
                if (!TextUtils.isEmpty(str2)) {
                    i = 0;
                    for (int length = str2.length() - 1; length >= 0; length--) {
                        char charAt = str2.charAt(length);
                        i = ((i << 6) & 65535) + charAt + (charAt << 14);
                        int i2 = 266338304 & i;
                        if (i2 != 0) {
                            i ^= i2 >> 21;
                        }
                    }
                } else {
                    i = 1;
                }
                if (((double) (i % CameraCapturer.OPEN_CAMERA_TIMEOUT)) >= d * 100.0d) {
                    A0F("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
            }
            HashMap A003 = A00(sOj3);
            A003.put("v", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            A003.put("_v", C10087RmP.A01);
            String str3 = this.A02;
            A003.put("tid", str3);
            AnonymousClass3Qk.A08(AnonymousClass7TF.A1P(qob.A01 ? 1 : 0), "Analytics instance not initialized");
            if (qob.A02) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                Iterator A0s = AnonymousClass7TF.A0s(A003);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (A1A.length() != 0) {
                        Pxe.A1Y(A1A);
                    }
                    Pxg.A1S(A1A, A1J);
                    A1A.append("=");
                    A1A.append(DbS.A0s(A1J));
                }
                ST5.A0A(this, A1A.toString(), (Object) null, (Object) null, "Dry run is enabled. GoogleAnalytics would have sent", 4);
                return;
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            C11304SKp.A02(A1E, "uid", qom.A03);
            C8338Qoo qoo = (C8338Qoo) ((C11335SNp) sOj2.A09.get(C8338Qoo.class));
            if (qoo != null) {
                C11304SKp.A02(A1E, "an", qoo.A00);
                C11304SKp.A02(A1E, "aid", qoo.A02);
                C11304SKp.A02(A1E, "av", qoo.A01);
                C11304SKp.A02(A1E, "aiid", qoo.A03);
            }
            C10754RxY rxY = new C10754RxY(qom.A02, str3, A1E, 0, !TextUtils.isEmpty(qom.A04));
            C11381SQt sQt = this.A00;
            C11381SQt sQt2 = sQt;
            C8481QvT qvT = sQt.A06;
            C11381SQt.A02(qvT);
            qvT.A0J();
            C11200SFa.A00();
            C8490Qvc qvc = qvT.A00;
            qvc.A0J();
            C11200SFa.A00();
            try {
                C8491Qvd qvd = qvc.A04;
                qvd.A0J();
                AnonymousClass0fa.A01(qvd.A0K(), -1896096357);
                String str4 = rxY.A01;
                AnonymousClass3Qk.A04(str4);
                qvd.A0J();
                C11200SFa.A00();
                SQLiteDatabase A0K = qvd.A0K();
                String valueOf = String.valueOf(0);
                int i3 = 0;
                int delete = A0K.delete("properties", "app_uid=? AND cid<>?", new String[]{valueOf, str4});
                if (delete > 0) {
                    qvd.A0E("Deleted property records", Integer.valueOf(delete));
                }
                String str5 = rxY.A02;
                AnonymousClass3Qk.A04(str4);
                AnonymousClass3Qk.A04(str5);
                qvd.A0J();
                C11200SFa.A00();
                j = C8491Qvd.A01(qvd, "SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[]{valueOf, str4, str5});
                rxY.A00 = 1 + j;
                qvd.A0J();
                C11200SFa.A00();
                SQLiteDatabase A0K2 = qvd.A0K();
                Map map = rxY.A03;
                AnonymousClass3Qk.A02(map);
                Uri.Builder A0I = Pxe.A0I();
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u);
                    A0I.appendQueryParameter(DbT.A13(A1J2), DbS.A0s(A1J2));
                }
                String encodedQuery = A0I.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", 0L);
                contentValues.put("cid", str4);
                contentValues.put("tid", str5);
                if (rxY.A04) {
                    i3 = 1;
                }
                Pxe.A1K(contentValues, "adid", i3);
                contentValues.put("hits_count", Long.valueOf(rxY.A00));
                contentValues.put("params", encodedQuery);
                try {
                    AnonymousClass0fa.A00(-1992842745);
                    long insertWithOnConflict = A0K2.insertWithOnConflict("properties", (String) null, contentValues, 5);
                    AnonymousClass0fa.A00(-1447504665);
                    if (insertWithOnConflict == -1) {
                        ST5.A0B(qvd, "Failed to insert/update a property (got -1)", 6);
                    }
                } catch (SQLiteException e) {
                    qvd.A0H("Error storing a property", e);
                }
                qvd.A0J();
                qvd.A0K().setTransactionSuccessful();
                try {
                    qvd.A0M();
                } catch (SQLiteException e2) {
                    qvc.A0H("Failed to end transaction", e2);
                }
                if (j == 0) {
                    C11200SFa.A00();
                    qvc.A0F("Sending first hit to property", str5);
                    C11381SQt sQt3 = qvc.A00;
                    C8486QvY qvY = sQt3.A0D;
                    C11381SQt.A02(qvY);
                    if (!new C11233SGt(qvY.A00.A04, qvY.A0K()).A00(AnonymousClass7TE.A0R(SDN.A04.A00))) {
                        C11381SQt.A02(qvY);
                        C11200SFa.A00();
                        qvY.A0J();
                        String string = qvY.A00.getString("installation_campaign", (String) null);
                        if (TextUtils.isEmpty(string)) {
                            string = null;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            C8485QvX qvX2 = sQt3.A0C;
                            C11381SQt.A02(qvX2);
                            C8337Qon A004 = C11304SKp.A00(qvX2, string);
                            qvc.A0F("Found relevant installation campaign", A004);
                            C8490Qvc.A02(rxY, qvc, A004);
                        }
                    }
                }
            } catch (SQLiteException e3) {
                qvc.A0H("Failed to update Analytics property", e3);
                try {
                    qvc.A04.A0M();
                } catch (SQLiteException e4) {
                    qvc.A0H("Failed to end transaction", e4);
                }
                j = -1;
            } catch (Throwable th) {
                try {
                    qvc.A04.A0M();
                    throw th;
                } catch (SQLiteException e5) {
                    qvc.A0H("Failed to end transaction", e5);
                    throw th;
                }
            }
            A003.put("_s", String.valueOf(j));
            C8485QvX qvX3 = sQt2.A0C;
            C11381SQt.A02(qvX3);
            C11250SHk sHk = new C11250SHk(qvX3, (List) null, A003, 0, sOj2.A00, 0, true);
            C11381SQt.A02(qvT);
            qvT.A0J();
            qvT.A0F("Hit delivery requested", sHk);
            C11381SQt.A00(qvT).A02.submit(new TH8(qvT, sHk));
            return;
        }
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        Iterator A0s2 = AnonymousClass7TF.A0s(A002);
        while (A0s2.hasNext()) {
            Map.Entry A1J3 = AnonymousClass7TE.A1J(A0s2);
            if (A1A2.length() > 0) {
                A1A2.append(',');
            }
            Pxg.A1S(A1A2, A1J3);
            A1A2.append('=');
            A1A2.append(DbS.A0s(A1J3));
        }
        qvX.A0G(Pxh.A0m("Discarding hit. ", str), A1A2.toString());
    }

    public C8478QvQ(C11381SQt sQt, String str) {
        super(sQt);
        AnonymousClass3Qk.A04(str);
        this.A01 = sQt;
        this.A02 = str;
        AnonymousClass3Qk.A04(str);
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme("uri");
        A0I.authority("google-analytics.com");
        A0I.path(str);
        this.A00 = A0I.build();
    }

    public static HashMap A00(C11350SOj sOj) {
        String str;
        String valueOf;
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = sOj.A09;
        Qoe qoe = (Qoe) ((C11335SNp) map.get(Qoe.class));
        if (qoe != null) {
            Iterator A0u = AnonymousClass7TF.A0u(Collections.unmodifiableMap(qoe.A00));
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object value = A1J.getValue();
                if (value != null) {
                    if (value instanceof String) {
                        valueOf = (String) value;
                        if (TextUtils.isEmpty(valueOf)) {
                        }
                    } else if (value instanceof Double) {
                        double A002 = JTO.A00(value);
                        if (A002 != 0.0d) {
                            DecimalFormat decimalFormat = A03;
                            if (decimalFormat == null) {
                                decimalFormat = new DecimalFormat("0.######");
                                A03 = decimalFormat;
                            }
                            valueOf = decimalFormat.format(A002);
                        }
                    } else if (!(value instanceof Boolean)) {
                        valueOf = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        valueOf = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                        A1E.put(A1J.getKey(), valueOf);
                    }
                    if (valueOf == null) {
                    }
                    A1E.put(A1J.getKey(), valueOf);
                }
            }
        }
        C8336Qom qom = (C8336Qom) ((C11335SNp) map.get(C8336Qom.class));
        if (qom != null) {
            A02(A1E, "t", qom.A01);
            A02(A1E, "cid", qom.A02);
            A02(A1E, "uid", qom.A03);
            A02(A1E, "sc", qom.A05);
            A01("sf", A1E, qom.A00);
            if (qom.A07) {
                A1E.put("ni", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            A02(A1E, "adid", qom.A04);
            if (qom.A06) {
                A1E.put("ate", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        C8335Qol qol = (C8335Qol) ((C11335SNp) map.get(C8335Qol.class));
        if (qol != null) {
            A02(A1E, "cd", qol.A02);
            A01("a", A1E, (double) qol.A00);
            A02(A1E, "dr", qol.A04);
        }
        Qoj qoj = (Qoj) ((C11335SNp) map.get(Qoj.class));
        if (qoj != null) {
            A02(A1E, "ec", qoj.A01);
            A02(A1E, "ea", qoj.A03);
            A02(A1E, "el", qoj.A02);
            A01("ev", A1E, (double) qoj.A00);
        }
        C8337Qon qon = (C8337Qon) ((C11335SNp) map.get(C8337Qon.class));
        if (qon != null) {
            A02(A1E, "cn", qon.A00);
            A02(A1E, "cs", qon.A02);
            A02(A1E, "cm", qon.A03);
            A02(A1E, "ck", qon.A04);
            A02(A1E, "cc", qon.A05);
            A02(A1E, "ci", qon.A01);
            A02(A1E, "anid", qon.A06);
            A02(A1E, "gclid", qon.A07);
            A02(A1E, "dclid", qon.A08);
            A02(A1E, "aclid", qon.A09);
        }
        Qof qof = (Qof) ((C11335SNp) map.get(Qof.class));
        if (qof != null) {
            A02(A1E, "exd", qof.A00);
            if (qof.A01) {
                A1E.put("exf", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
        }
        Qog qog = (Qog) ((C11335SNp) map.get(Qog.class));
        if (qog != null) {
            A02(A1E, "sn", qog.A00);
            A02(A1E, "sa", qog.A01);
            A02(A1E, "st", qog.A02);
        }
        Qoi qoi = (Qoi) ((C11335SNp) map.get(Qoi.class));
        if (qoi != null) {
            A02(A1E, "utv", qoi.A02);
            A01("utt", A1E, (double) qoi.A00);
            A02(A1E, "utc", qoi.A01);
            A02(A1E, "utl", qoi.A03);
        }
        Qoc qoc = (Qoc) ((C11335SNp) map.get(Qoc.class));
        if (qoc != null) {
            Iterator A0u2 = AnonymousClass7TF.A0u(Collections.unmodifiableMap(qoc.A00));
            while (A0u2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
                String A003 = C9695RfD.A00("cd", AnonymousClass7TE.A0M(A1J2.getKey()));
                if (!TextUtils.isEmpty(A003)) {
                    A1E.put(A003, A1J2.getValue());
                }
            }
        }
        Qod qod = (Qod) ((C11335SNp) map.get(Qod.class));
        if (qod != null) {
            Iterator A0u3 = AnonymousClass7TF.A0u(Collections.unmodifiableMap(qod.A00));
            while (A0u3.hasNext()) {
                Map.Entry A1J3 = AnonymousClass7TE.A1J(A0u3);
                String A004 = C9695RfD.A00("cm", AnonymousClass7TE.A0M(A1J3.getKey()));
                if (!TextUtils.isEmpty(A004)) {
                    double A005 = JTO.A00(A1J3.getValue());
                    DecimalFormat decimalFormat2 = A03;
                    if (decimalFormat2 == null) {
                        decimalFormat2 = new DecimalFormat("0.######");
                        A03 = decimalFormat2;
                    }
                    A1E.put(A004, decimalFormat2.format(A005));
                }
            }
        }
        Qoh qoh = (Qoh) ((C11335SNp) map.get(Qoh.class));
        if (qoh != null) {
            Iterator A0h = JTQ.A0h(qoh.A00);
            if (A0h.hasNext()) {
                A0h.next();
                C9695RfD.A00("promo", 1);
                throw AnonymousClass7TE.A11("zzn");
            }
            Iterator A0h2 = JTQ.A0h(qoh.A01);
            if (A0h2.hasNext()) {
                A0h2.next();
                C9695RfD.A00("pr", 1);
                throw AnonymousClass7TE.A11("zzn");
            }
            Iterator A0u4 = AnonymousClass7TF.A0u(qoh.A02);
            int i = 1;
            while (A0u4.hasNext()) {
                Map.Entry A1J4 = AnonymousClass7TE.A1J(A0u4);
                String A006 = C9695RfD.A00("il", i);
                Iterator it = ((List) A1J4.getValue()).iterator();
                if (it.hasNext()) {
                    it.next();
                    String.valueOf(A006);
                    String.valueOf(C9695RfD.A00("pi", 1));
                    throw AnonymousClass7TE.A11("zzn");
                }
                if (!TextUtils.isEmpty((CharSequence) A1J4.getKey())) {
                    String valueOf2 = String.valueOf(A006);
                    if ("nm".length() != 0) {
                        str = valueOf2.concat("nm");
                    } else {
                        str = new String(valueOf2);
                    }
                    A1E.put(str, A1J4.getKey());
                }
                i++;
            }
        }
        C8334Qok qok = (C8334Qok) ((C11335SNp) map.get(C8334Qok.class));
        if (qok != null) {
            A02(A1E, "ul", qok.A05);
            A01("sd", A1E, (double) qok.A00);
            int i2 = qok.A01;
            int i3 = qok.A02;
            if (i2 > 0 && i3 > 0) {
                StringBuilder A14 = Pxe.A14(23);
                A14.append(i2);
                A1E.put("sr", Pxg.A0t("x", A14, i3));
            }
            int i4 = qok.A03;
            int i5 = qok.A04;
            if (i4 > 0 && i5 > 0) {
                StringBuilder A142 = Pxe.A14(23);
                A142.append(i4);
                A1E.put("vp", Pxg.A0t("x", A142, i5));
            }
        }
        C8338Qoo qoo = (C8338Qoo) ((C11335SNp) map.get(C8338Qoo.class));
        if (qoo != null) {
            A02(A1E, "an", qoo.A00);
            A02(A1E, "aid", qoo.A02);
            A02(A1E, "aiid", qoo.A03);
            A02(A1E, "av", qoo.A01);
        }
        return A1E;
    }

    public static void A02(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
