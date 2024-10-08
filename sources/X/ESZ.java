package X;

import android.app.TimePickerDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

public final class ESZ extends PR9 {
    public C48253EbY A00;
    public C48253EbY A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final CompoundButton.OnCheckedChangeListener A05;
    public final C49397Euz A06;
    public final C49882FBg A07;
    public final String A08;
    public final Fragment A09;
    public final UserSession A0A;

    public static void A00(CompoundButton compoundButton, ESZ esz) {
        String str;
        ESZ esz2 = esz;
        Fragment fragment = esz.A09;
        SQH.A02(fragment.getParentFragmentManager());
        boolean z = esz.A02;
        C48253EbY ebY = esz.A01;
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        String A0g = 002.A0g(str, "-", ebY.toString());
        C49882FBg fBg = esz.A07;
        String str2 = esz.A08;
        fBg.A01(str2, A0g, "time_range");
        Context context = esz.A04;
        0gy A002 = AnonymousClass07i.A00(fragment);
        1OC A012 = F7X.A01(esz.A0A, str2, A0g);
        A012.A00 = new C48002EQl(compoundButton, fragment.mFragmentManager, ebY, esz2, esz.A03, esz.A02);
        1ES.A00(context, A002, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ESZ(android.content.Context r4, androidx.fragment.app.Fragment r5, X.AnonymousClass9JM r6, com.instagram.common.session.UserSession r7, X.C49397Euz r8, X.C49882FBg r9, X.C48253EbY r10, X.C50989Fmc r11, X.C50989Fmc r12) {
        /*
            r3 = this;
            java.lang.String r2 = r6.A04
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = "1"
            boolean r0 = r1.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r0 = 0
            r3.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (java.lang.CharSequence) r2, (boolean) r1)
            r1 = 27
            X.FQO r0 = new X.FQO
            r0.<init>(r3, r1)
            r3.A05 = r0
            r3.A08 = r0
            java.lang.String r0 = r6.A01
            r3.A08 = r0
            r3.A06 = r8
            boolean r0 = r3.A0D
            r3.A03 = r0
            r3.A00 = r10
            r3.A01 = r10
            r3.A04 = r4
            r3.A0A = r7
            r3.A09 = r5
            r3.A07 = r9
            r1 = 43
            X.FP9 r0 = new X.FP9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r11.A05 = r0
            r1 = 44
            X.FP9 r0 = new X.FP9
            r0.<init>((java.lang.Object) r3, (int) r1)
            r12.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESZ.<init>(android.content.Context, androidx.fragment.app.Fragment, X.9JM, com.instagram.common.session.UserSession, X.Euz, X.FBg, X.EbY, X.Fmc, X.Fmc):void");
    }

    public static void A01(G6M g6m, ESZ esz, String str, String str2) {
        String str3;
        String[] split = str2.split(":");
        String str4 = "00";
        if (split.length == 2) {
            str4 = split[0];
            str3 = split[1];
        } else {
            str3 = str4;
        }
        int parseInt = Integer.parseInt(str4);
        int parseInt2 = Integer.parseInt(str3);
        Context context = esz.A04;
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, new FHS(g6m, esz), parseInt, parseInt2, DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(str);
        AnonymousClass0fN.A00(timePickerDialog);
    }
}
