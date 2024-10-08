package X;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.FFr  reason: case insensitive filesystem */
public final class C49938FFr {
    public static final C49938FFr A00 = new Object();

    public static final void A01(0lg r4, String str) {
        A00(r4, (C49922FEx) null, (EXD) null, (Integer) null, str, (String) null);
    }

    public final void A02(0lg r7, EXD exd, String str) {
        AnonymousClass7TG.A1N(r7, str);
        A00(r7, (C49922FEx) null, exd, (Integer) null, str, (String) null);
    }

    public static final void A00(0lg r7, C49922FEx fEx, EXD exd, Integer num, String str, String str2) {
        boolean z;
        String str3;
        String str4;
        String str5;
        AnonymousClass7TG.A1N(r7, str);
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        Context A06 = r7.getDeviceSession().A06();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), AnonymousClass000.A00(1840));
        DbZ.A1H(A0e, A01, A002);
        FH8.A0E(A0e, "step", str);
        A0e.A7p("is_facebook_app_installed", Boolean.valueOf(0oI.A0B(A06)));
        try {
            A06.getPackageManager().getPackageInfo("com.facebook.orca", 128);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        A0e.A7p("messenger_installed", Boolean.valueOf(z));
        A0e.A7p("whatsapp_installed", Boolean.valueOf(0oI.A0G(A06)));
        A0e.A7p("fb_lite_installed", Boolean.valueOf(0lz.A03("com.facebook.lite")));
        FH8.A0B(A0e, r7);
        List list = null;
        if (exd != null) {
            str3 = exd.A00;
        } else {
            str3 = null;
        }
        DbS.A1G(A0e, str3);
        if (num != null) {
            str4 = DbY.A0j(C49109EpY.A00(num));
        } else {
            str4 = null;
        }
        A0e.AAJ("cp_type_given", str4);
        if (fEx != null) {
            str5 = fEx.A00.getString(DbX.A0s(C48071EUp.A06));
        } else {
            str5 = null;
        }
        A0e.AAJ("cp_type_given", str5);
        if (str2 != null) {
            list = AnonymousClass7TE.A1I(str2);
        }
        A0e.AAe(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, list);
        A0e.Cgf();
    }
}
