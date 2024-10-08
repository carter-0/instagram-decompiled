package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/* renamed from: X.KrE  reason: case insensitive filesystem */
public abstract class C63085KrE {
    public static Boolean A00(AnonymousClass6Tm r34) {
        String str;
        boolean z;
        int width;
        int height;
        String path;
        AnonymousClass6Tm r1 = r34;
        C307786Rm r0 = (C307786Rm) r1.A03(0);
        C276544tV r5 = (C276544tV) r1.A03(1);
        Context context = r0.A00;
        UserSession A0A = C308206Td.A0A(r0);
        String A0F = r5.A0F();
        String A0D = r5.A0D();
        String A0J = r5.A0J();
        String A0H = r5.A0H();
        int A03 = r5.A03(40, -1);
        String A0I = r5.A0I();
        String A0K = r5.A0K(46);
        if (A0D == null || A0J == null || A0H == null || A03 == -1 || A0I == null || A0K == null) {
            return false;
        }
        0qQ.A0B(A0A, 2);
        1ua A0n = JTO.A0n(context, A0A);
        List A0N = r5.A0N(42);
        String str2 = "";
        String A0K2 = r5.A0K(44);
        if (A0K2 != null) {
            str2 = A0K2;
        }
        AnonymousClass6QE r02 = AnonymousClass6QE.A02;
        Uri A032 = 0cp.A03(A0H);
        0qQ.A0B(A032, 0);
        String obj = AnonymousClass6QJ.A01(A032, true).toString();
        boolean A0R = r5.A0R(45, false);
        AnonymousClass7TF.A1E(obj, 4, A0N);
        try {
            str = new URL(obj).getPath();
        } catch (MalformedURLException unused) {
            0wb.A03("FundraiserWithFeedPostCreator", 002.A0R("Error parsing image url ", obj));
            str = null;
        }
        if (str != null) {
            Rect A0H2 = 1MF.A0H(str);
            int A00 = 1MF.A00(str);
            boolean z2 = true;
            if ((A00 / 90) % 2 == 1) {
                width = A0H2.height();
                height = A0H2.width();
            } else {
                z2 = false;
                width = A0H2.width();
                height = A0H2.height();
            }
            double d = (double) (width / height);
            if (d < 0.792d) {
                height = (int) Math.floor(((double) width) / 0.792d);
            } else if (d > 1.9291d) {
                width = (int) Math.floor(((double) height) * 1.9291d);
            }
            int i = width;
            if (z2) {
                i = height;
                height = width;
            }
            Bitmap A0G = 1MF.A0G(str, A0H2.width(), A0H2.height(), i, height, A00, false);
            if (A0G != null) {
                File A04 = 0mb.A04(context);
                if (1MF.A0L(Bitmap.CompressFormat.JPEG, A0G, A04, 90) && (path = A04.getPath()) != null) {
                    AnonymousClass3Q2 A01 = AnonymousClass9T3.A01(JTQ.A0Z());
                    A0n.A0E(A01);
                    Rect A08 = JTS.A08(A0G);
                    A01.A33 = path;
                    A01.A0K = 0;
                    int width2 = A08.width();
                    int height2 = A08.height();
                    A01.A0S = width2;
                    A01.A0R = height2;
                    A01.A0A = 90;
                    JTP.A1M(A0A);
                    A01.A1E = new NewFundraiserInfo(A0F, A0I, A0J, str2, A0K, A0D, FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY.toString(), (String) null, A0N, A03, A0R);
                    A01.A2y = A0A.A06;
                    A01.A2Z = str2;
                    A01.A0e(ShareType.FOLLOWERS_SHARE);
                    A0n.A0I(A01, true, true);
                    A0n.A0B(A01);
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
