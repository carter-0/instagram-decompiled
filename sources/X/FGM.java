package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

public abstract class FGM {
    public static final void A02(Context context, DialogInterface.OnDismissListener onDismissListener, ProductType productType, String str) {
        int i;
        int ordinal = productType.ordinal();
        if (ordinal == 9) {
            i = 2131961837;
        } else if (ordinal == 1) {
            i = 2131961830;
        } else if (ordinal == 13) {
            i = 2131961832;
        } else {
            throw AnonymousClass7TE.A1B("Unknown product type");
        }
        C358248ab A0Y = DbS.A0Y(context);
        DbU.A16(context, A0Y, R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh);
        A0Y.A09(2131961838);
        DbY.A0w(context, A0Y, str, i);
        A0Y.A0I(FJD.A00, 2131960992);
        A0Y.A0f(onDismissListener);
        DbT.A1V(A0Y);
    }

    public static final void A03(Context context, User user, int i, boolean z) {
        0qQ.A0B(user, 1);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = AnonymousClass7TF.A0e(context.getResources(), user.getUsername(), i);
        A0a.A0B(C310356ar.CIRCULAR);
        A0a.A09 = user.Bh3();
        A0a.A06();
        if (z) {
            A0a.A0I = context.getResources().getString(2131976291);
        }
        Dbb.A1Q(A0a);
    }

    public static final void A04(UserSession userSession, Context context) {
        AnonymousClass7TF.A1H(userSession, context);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131967887);
        A0Y.A08(2131967886);
        C358278ae r3 = C358278ae.DEFAULT;
        A0Y.A0Q((DialogInterface.OnClickListener) null, r3, 2131968772);
        A0Y.A0W(new C50025FJk(context, userSession, 23), r3, AnonymousClass7TF.A0d(context.getResources(), 2131964884), false);
        DbT.A1V(A0Y);
        C273004lm A00 = C272994ll.A00(userSession);
        long parseLong = Long.parseLong(userSession.A06);
        0Aj A0e = AnonymousClass7TE.A0e(A00.A00, "instagram_fan_club_music_attempted");
        Dbb.A1D(A0e, "camera", parseLong);
        A0e.Cgf();
    }

    public static final boolean A05(Context context) {
        String installerPackageName;
        if (context == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
            return 0qQ.A0K(installerPackageName, "com.amazon.venezia");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.fanclub.intf.UserPayFanclubUpsellParams, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r8.A02 == X.17M.A06) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.fanclub.intf.UserPayFanclubUpsellParams A00(com.instagram.common.session.UserSession r7, com.instagram.user.model.User r8) {
        /*
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r8.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0013
            X.17M r1 = r8.A02
            X.17M r0 = X.17M.A06
            r6 = 1
            if (r1 != r0) goto L_0x0014
        L_0x0013:
            r6 = 0
        L_0x0014:
            java.lang.String r1 = r8.getId()
            java.lang.String r0 = r8.getUsername()
            com.instagram.fanclub.intf.UserPayFanclubUpsellParams r5 = new com.instagram.fanclub.intf.UserPayFanclubUpsellParams
            r5.<init>()
            r5.A00 = r1
            r5.A01 = r0
            r5.A02 = r6
            X.4lm r1 = X.C272994ll.A00(r7)
            java.lang.String r0 = r8.getId()
            long r3 = java.lang.Long.parseLong(r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "viewer_profile_fanclub_banner_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "profile"
            X.Dbb.A1D(r2, r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0 = 5247(0x147f, float:7.353E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A7p(r0, r1)
            r2.Cgf()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGM.A00(com.instagram.common.session.UserSession, com.instagram.user.model.User):com.instagram.fanclub.intf.UserPayFanclubUpsellParams");
    }

    public static final void A01(Context context) {
        1xC r2 = 1xC.A01;
        C310336ap A0X = DbV.A0X();
        A0X.A0H = "fan_club_error";
        DbS.A19(context, A0X, 2131974093);
        DbY.A1K(r2, A0X);
    }
}
