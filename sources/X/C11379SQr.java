package X;

import android.net.wifi.ScanResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SQr  reason: case insensitive filesystem */
public class C11379SQr {
    public Integer A00;
    public ScanResult A01;
    public final int A02;
    public final long A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C11379SQr(Boolean bool, Integer num, String str, String str2, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = null;
        this.A0A = null;
        this.A0B = null;
        this.A04 = bool;
        this.A05 = null;
        this.A06 = null;
    }

    public static ArrayList A01(AnonymousClass0JP r19, AnonymousClass0JR r20, List list) {
        String str;
        String str2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            A1A.setLength(0);
            String str3 = scanResult.capabilities;
            if (str3 != null) {
                A1A.append(str3);
            }
            CharSequence charSequence = scanResult.operatorFriendlyName;
            if (charSequence == null || charSequence.length() <= 0) {
                str = null;
            } else {
                str = scanResult.operatorFriendlyName.toString();
            }
            CharSequence charSequence2 = scanResult.venueName;
            if (charSequence2 == null || charSequence2.length() <= 0) {
                str2 = null;
            } else {
                str2 = scanResult.venueName.toString();
            }
            if (scanResult.is80211mcResponder()) {
                A1A.append("[MC]");
            }
            String str4 = scanResult.BSSID;
            int i = scanResult.level;
            C11379SQr sQr = new C11379SQr(Integer.valueOf(scanResult.frequency), str4, scanResult.SSID, A1A.toString(), str, str2, i, r19.now() - (r20.now() - AnonymousClass7TE.A0P(scanResult.timestamp)));
            sQr.A01 = scanResult;
            A1C.add(sQr);
        }
        return A1C;
    }

    public C11379SQr(Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A04 = bool;
        this.A05 = num2;
        this.A06 = num3;
    }

    public C11379SQr(Integer num, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A03 = j;
        this.A07 = str;
        this.A02 = i;
        this.A08 = str2;
        this.A00 = num;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
    }
}
