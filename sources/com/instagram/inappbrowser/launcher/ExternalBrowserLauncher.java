package com.instagram.inappbrowser.launcher;

import X.0Tu;
import X.0bY;
import X.0cp;
import X.0kR;
import X.182;
import X.2IL;
import X.AnonymousClass05K;
import X.AnonymousClass2hV;
import X.AnonymousClass7TE;
import X.C10710Rwo;
import X.C13113TLw;
import X.DbV;
import X.DbW;
import X.Pxe;
import X.SF1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExternalBrowserLauncher {
    public static final 0bY A06 = DbW.A0G();
    public List A00 = AnonymousClass7TE.A1C();
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02;
    public final Context A03;
    public final PackageManager A04;
    public final UserSession A05;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if ((!android.text.TextUtils.isEmpty(r1.getQueryParameter("u"))) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String r5) {
        /*
            java.lang.String r2 = "horizon.meta.com;hz.me"
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x003c
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x003c
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x003c
            android.net.Uri r1 = android.net.Uri.parse(r5)
            boolean r0 = X.C11324SMy.A01(r1)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)     // Catch:{ Exception -> 0x003a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x003a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003e
        L_0x002d:
            java.lang.String r0 = "u"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x003a
            android.net.Uri r1 = X.Pxg.A0L(r0)
        L_0x003a:
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r0 = 0
            return r0
        L_0x003e:
            java.lang.String r5 = r1.getHost()
            if (r5 == 0) goto L_0x003c
            java.lang.String r0 = "[,; ]+"
            java.lang.String[] r4 = r2.split(r0)
            int r3 = r4.length
            r2 = 0
        L_0x004c:
            if (r2 >= r3) goto L_0x003c
            r1 = r4[r2]
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x005e
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x005e
            r0 = 1
            return r0
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.launcher.ExternalBrowserLauncher.A00(java.lang.String):boolean");
    }

    public final C10710Rwo A01(Uri uri) {
        ArrayList A1C;
        int indexOf;
        PackageManager packageManager = this.A04;
        if (packageManager == null) {
            A1C = AnonymousClass7TE.A1C();
        } else {
            String str = null;
            Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
            Intent addCategory2 = new Intent("android.intent.action.VIEW", uri.buildUpon().scheme("http").build()).addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = packageManager.resolveActivity(addCategory, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            if (!(resolveActivity == null && (resolveActivity = packageManager.resolveActivity(addCategory2, Constants.LOAD_RESULT_PGO_ATTEMPTED)) == null)) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                activityInfo.getClass();
                str = activityInfo.packageName;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE"), Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            A1C = AnonymousClass7TE.A1C();
            for (ResolveInfo next : queryIntentActivities) {
                ActivityInfo activityInfo2 = next.activityInfo;
                activityInfo2.getClass();
                String str2 = activityInfo2.packageName;
                String str3 = next.activityInfo.packageName;
                boolean equals = str3.equals(str);
                TextUtils.isEmpty(SF1.A00(this.A03, DbV.A14(str3)));
                List list = this.A01;
                if (!list.contains(next.activityInfo.packageName)) {
                    indexOf = Integer.MAX_VALUE;
                } else {
                    indexOf = list.indexOf(next.activityInfo.packageName);
                }
                A1C.add(new C10710Rwo(str2, equals, this.A00.contains(next.activityInfo.packageName), indexOf));
            }
        }
        if (A1C.isEmpty()) {
            return null;
        }
        C13113TLw.A00(12, A1C);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            DbV.A1U(next2, A1C2, ((C10710Rwo) next2).A02 ? 1 : 0);
        }
        C13113TLw.A00(13, A1C2);
        if (!A1C2.isEmpty()) {
            return (C10710Rwo) AnonymousClass7TE.A12(A1C2);
        }
        return null;
    }

    public final Integer A02() {
        UserSession userSession = this.A05;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36313579120691300L)) {
            return AnonymousClass05K.A00;
        }
        if (182.A06(r2, userSession, 36313579120887911L)) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0F;
    }

    public final boolean A03(String str, String str2) {
        Uri uri;
        if (this.A02 && this.A04 != null && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2))) {
            if (!TextUtils.isEmpty(str)) {
                uri = 0cp.A01(A06, str);
                if (uri == null) {
                    return false;
                }
            } else {
                str2.getClass();
                uri = 0cp.A03(str2);
            }
            UserSession userSession = this.A05;
            if (182.A06(0Tu.A05, userSession, 36330342377996873L)) {
                String A022 = 2IL.A01(userSession).A02((AnonymousClass2hV) null, uri.toString());
                A022.getClass();
                uri = 0cp.A03(A022);
            }
            C10710Rwo A012 = A01(uri);
            if (A012 != null) {
                return 0kR.A09(this.A03, Pxe.A0F(uri).setPackage(A012.A01).addCategory("android.intent.category.BROWSABLE"));
            }
        }
        return false;
    }

    public ExternalBrowserLauncher(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = context.getPackageManager();
        this.A05 = userSession;
    }
}
