package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.TIFUAppDestinationEnum;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.FGy  reason: case insensitive filesystem */
public final class C49965FGy {
    public static final C49965FGy A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(androidx.fragment.app.FragmentActivity r20, com.instagram.common.session.UserSession r21, java.lang.String r22, java.lang.String r23) {
        /*
            r2 = 0
            r4 = r21
            r3 = r20
            boolean r13 = X.AnonymousClass7TF.A1U(r2, r4, r3)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            if (r0 == 0) goto L_0x01ef
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            X.1SF r1 = new X.1SF
            r1.<init>(r3, r0)
            r0 = 26
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x01ef
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            X.1SF r0 = new X.1SF
            r0.<init>(r3, r1)
            X.1TT r1 = r0.A00()
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x01ef
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x01ef
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324445387894877(0x810ce40002305d, double:3.0350637578815514E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x004c
            X.SP0 r0 = X.SP0.A00(r3)
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01ef
        L_0x004c:
            r0 = 36324445387763803(0x810ce40000305b, double:3.03506375779866E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 != 0) goto L_0x0062
            r0 = 36324445387829340(0x810ce40001305c, double:3.0350637578401056E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x01ef
        L_0x0062:
            java.util.HashMap r1 = X.C49272EsF.A00
            r0 = r22
            java.lang.Object r5 = r1.get(r0)
            X.QOp r5 = (X.C7607QOp) r5
            r0 = 36324445387829340(0x810ce40001305c, double:3.0350637578401056E-306)
            boolean r0 = X.182.A06(r6, r4, r0)
            if (r0 == 0) goto L_0x0123
            X.0hq r7 = X.DbT.A0F(r3)
            X.0wc r11 = X.AnonymousClass0kN.A02(r4)
            X.0wj r10 = X.0wj.A01
            r12 = 0
            r1 = 0
            if (r5 == 0) goto L_0x011e
            java.lang.String r12 = r5.A05
            java.lang.String r9 = r5.A01
            java.lang.String r8 = r5.A04
            java.lang.String r6 = r5.A02
            java.lang.String r1 = r5.A03
        L_0x008f:
            com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures r0 = com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures.A01
            X.AnonymousClass7TG.A1Q(r10, r0)
            r5 = 639(0x27f, float:8.95E-43)
            java.lang.String r18 = X.Pxd.A00(r5)
            if (r12 != 0) goto L_0x009e
            r12 = r18
        L_0x009e:
            if (r8 != 0) goto L_0x00a2
            r8 = r18
        L_0x00a2:
            if (r6 != 0) goto L_0x00a6
            r6 = r18
        L_0x00a6:
            if (r1 != 0) goto L_0x00aa
            r1 = r18
        L_0x00aa:
            if (r9 != 0) goto L_0x00ae
            r9 = r18
        L_0x00ae:
            java.lang.String r20 = ""
            X.SOK r13 = new X.SOK
            r21 = r20
            r14 = r12
            r15 = r8
            r16 = r6
            r17 = r1
            r19 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.QQe r6 = new X.QQe
            r6.<init>()
            r6.A00 = r11
            r6.A01 = r10
            java.lang.String r5 = "utm"
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = new com.facebook.base.activity.parcel.OpaqueParcelable
            r1.<init>((android.os.Parcelable) r0)
            java.lang.String r0 = "features"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            android.os.Bundle r0 = r13.A02()
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r5, r0, r1)
            r6.setArguments(r0)
            java.lang.String r0 = "MainEntryBottomSheetDialogFragment"
            r6.A0B(r7, r0)
            r1 = 1
        L_0x00e6:
            java.util.HashMap r5 = X.C49272EsF.A00
            r0 = r22
            java.lang.Object r0 = r5.get(r0)
            X.QOp r0 = (X.C7607QOp) r0
            if (r0 == 0) goto L_0x011c
            java.lang.String r10 = r0.A01
        L_0x00f4:
            if (r1 != 0) goto L_0x022b
            X.F3b r9 = new X.F3b
            r9.<init>(r3, r4)
            boolean r0 = r9.A01()
            java.lang.String r7 = "com.instagram.android"
            java.lang.String r6 = "com.instagram.barcelona"
            r8 = r23
            if (r0 == 0) goto L_0x0200
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318887703943786(0x8107d6003b1a6a, double:3.0315490561718845E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x0200
            if (r23 == 0) goto L_0x01f9
            android.content.Intent r0 = X.0oI.A01(r9, r8)
            goto L_0x01f2
        L_0x011c:
            r10 = 0
            goto L_0x00f4
        L_0x011e:
            r9 = r12
            r8 = r12
            r6 = r12
            goto L_0x008f
        L_0x0123:
            r14 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            java.lang.String r1 = "com.instagram.barcelona"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            java.lang.String r11 = "ig4a_"
            r0 = r22
            java.lang.String r11 = X.002.A0R(r11, r0)
            if (r5 == 0) goto L_0x0143
            java.lang.String r10 = r5.A05
            java.lang.String r8 = r5.A02
            java.lang.String r9 = r5.A04
            java.lang.String r7 = r5.A03
            java.lang.String r6 = r5.A01
        L_0x0143:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            X.1SF r5 = new X.1SF
            r5.<init>(r3, r0)
            r0 = 14
            boolean r0 = r5.A01(r0)
            if (r0 != 0) goto L_0x0180
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r7 = 0
            r0.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException -> 0x015d }
            r7 = 1
        L_0x015d:
            r6 = 0
            boolean r0 = X.RW3.A00(r3)
            if (r0 == 0) goto L_0x0174
            X.0Sy r5 = new X.0Sy
            r5.<init>()
            r5.A0D = r13
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = r5.A01(r3, r2, r0)
            r0.getIntentSender()
        L_0x0174:
            if (r11 == 0) goto L_0x0177
            r6 = r11
        L_0x0177:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            android.content.Intent r5 = X.C48304EcN.A00(r12, r0, r1, r6)
            goto L_0x01e1
        L_0x0180:
            android.content.Intent r5 = X.DbS.A09()
            java.lang.String r15 = "com.facebook.appmanager"
            java.lang.String r0 = "com.facebook.oxygen.appmanager.appupdate.AppUpdateRequestRedirectActivity"
            r5.setClassName(r15, r0)
            java.lang.String r0 = "package_name"
            android.content.Intent r1 = r5.putExtra(r0, r1)
            java.lang.String r0 = "fallback_intent"
            r1.putExtra(r0, r14)
            boolean r0 = X.RW3.A00(r3)
            if (r0 == 0) goto L_0x01b2
            X.0Sy r1 = new X.0Sy
            r1.<init>()
            r1.A0D = r13
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = r1.A01(r3, r2, r0)
            android.content.IntentSender r1 = r0.getIntentSender()
            java.lang.String r0 = "intent_sender"
            r5.putExtra(r0, r1)
        L_0x01b2:
            java.lang.String r0 = "should_show_back_navigation"
            r5.putExtra(r0, r12)
            if (r11 == 0) goto L_0x01be
            java.lang.String r0 = "referrer"
            r5.putExtra(r0, r11)
        L_0x01be:
            if (r10 == 0) goto L_0x01c5
            java.lang.String r0 = "utm_source"
            r5.putExtra(r0, r10)
        L_0x01c5:
            if (r9 == 0) goto L_0x01cc
            java.lang.String r0 = "utm_medium"
            r5.putExtra(r0, r9)
        L_0x01cc:
            if (r8 == 0) goto L_0x01d3
            java.lang.String r0 = "utm_campaign"
            r5.putExtra(r0, r8)
        L_0x01d3:
            if (r7 == 0) goto L_0x01da
            java.lang.String r0 = "utm_content"
            r5.putExtra(r0, r7)
        L_0x01da:
            if (r6 == 0) goto L_0x01e1
            java.lang.String r0 = "utm_id"
            r5.putExtra(r0, r6)
        L_0x01e1:
            X.0b6 r0 = X.0b6.A00()
            X.0R7 r0 = r0.A06()
            boolean r1 = r0.A0G(r3, r5)
            goto L_0x00e6
        L_0x01ef:
            r1 = 0
            goto L_0x00e6
        L_0x01f2:
            boolean r0 = X.0kR.A08(r3, r0, r2)     // Catch:{ ActivityNotFoundException -> 0x0209 }
            if (r0 != 0) goto L_0x022b
            goto L_0x0213
        L_0x01f9:
            if (r10 != 0) goto L_0x01fc
            r10 = r7
        L_0x01fc:
            X.0oI.A06(r3, r9, r6, r10)
            return
        L_0x0200:
            if (r23 != 0) goto L_0x0213
            if (r10 != 0) goto L_0x0205
            r10 = r7
        L_0x0205:
            X.0oI.A07(r3, r6, r10)
            return
        L_0x0209:
            r0 = move-exception
            java.lang.String r1 = "PackageUtil"
            java.lang.String r0 = r0.getMessage()
            X.0wb.A03(r1, r0)
        L_0x0213:
            java.lang.String r0 = X.0oI.A02
            android.net.Uri r2 = X.0cp.A03(r8)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)
            r1.setData(r2)
            X.0kR.A0D(r3, r1)
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49965FGy.A03(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r10.equals("story_attribution") != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326528447231805L) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r11 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326528447166268L) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        r1 = r5.buildUpon();
        r0 = "non_blocking";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r1 = r1.appendQueryParameter("ig_reshare_upsell", r0).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        X.0qQ.A07(r1);
        X.FH7.A08(r6, r7, X.2EG.A1S, r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        if (r4 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326528447428416L) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a7, code lost:
        if (r11 == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36326528447362879L) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r1 = r5.buildUpon();
        r0 = "blocking";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        r1 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c2, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(androidx.fragment.app.FragmentActivity r6, com.instagram.common.session.UserSession r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r1 = 0
            X.AnonymousClass7TF.A1B(r7, r1, r8)
            if (r9 == 0) goto L_0x001e
            int r0 = r9.length()
            if (r0 == 0) goto L_0x001e
            r3 = 0
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r1 = X.AnonymousClass5FF.A01(r6, r7, r9, r0, r1)
            boolean r0 = X.0oI.A0A(r6)
            if (r0 == 0) goto L_0x001f
            if (r1 == 0) goto L_0x001f
            X.FH7.A03(r6, r9)
        L_0x001e:
            return
        L_0x001f:
            if (r11 == 0) goto L_0x0032
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447100731(0x810ec90003373b, double:3.0363810929111397E-306)
        L_0x0028:
            boolean r0 = X.DbY.A1Z(r2, r7, r0)
            if (r0 == 0) goto L_0x004a
            A03(r6, r7, r10, r3)
            return
        L_0x0032:
            java.lang.String r0 = "story_sticker"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "story_attribution"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x004a
        L_0x0042:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447297342(0x810ec90006373e, double:3.036381093035477E-306)
            goto L_0x0028
        L_0x004a:
            android.net.Uri r5 = android.net.Uri.parse(r9)
            java.lang.String r0 = "story_sticker"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = "story_attribution"
            boolean r0 = r10.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x006d
        L_0x005f:
            r4 = 1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447231805(0x810ec90005373d, double:3.0363810929940314E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x007c
        L_0x006d:
            if (r11 == 0) goto L_0x00c2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447166268(0x810ec90004373c, double:3.0363810929525855E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c2
        L_0x007c:
            r0 = 1
        L_0x007d:
            java.lang.String r3 = "ig_reshare_upsell"
            if (r0 == 0) goto L_0x0098
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r0 = "non_blocking"
        L_0x0087:
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r3, r0)
            java.lang.String r1 = r0.toString()
        L_0x008f:
            X.0qQ.A07(r1)
            X.2EG r0 = X.2EG.A1S
            X.FH7.A08(r6, r7, r0, r1, r8)
            return
        L_0x0098:
            if (r4 == 0) goto L_0x00a7
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447428416(0x810ec900083740, double:3.036381093118369E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x00b6
        L_0x00a7:
            if (r11 == 0) goto L_0x00bd
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326528447362879(0x810ec90007373f, double:3.036381093076923E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00bd
        L_0x00b6:
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r0 = "blocking"
            goto L_0x0087
        L_0x00bd:
            java.lang.String r1 = r5.toString()
            goto L_0x008f
        L_0x00c2:
            r0 = 0
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49965FGy.A05(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A07(FragmentActivity fragmentActivity, C274524oV r7, UserSession userSession, String str, String str2) {
        int i;
        String url;
        C274504oT r3 = null;
        if (0oI.A0A(fragmentActivity)) {
            if (r7 != null) {
                r3 = r7.BHs();
            }
            i = 2;
        } else {
            if (r7 != null) {
                r3 = r7.CBW();
            }
            i = 3;
        }
        C58181Inl inl = new C58181Inl(str, i);
        if (r3 == null || (url = r3.getUrl()) == null) {
            DbT.A1Q(0wj.A01, 002.A0R("BarcelonaDeeplinkUtil, No deep link found for TIFU destination ", (String) inl.invoke()), 817898032);
            A02(fragmentActivity, userSession, "tifu");
            return;
        }
        TIFUAppDestinationEnum BKS = r3.BKS();
        if (BKS != null) {
            int ordinal = BKS.ordinal();
            if (ordinal == 2 || ordinal == 4) {
                FH7.A02(fragmentActivity, url);
                return;
            } else if (ordinal == 1) {
                A03(fragmentActivity, userSession, str2, url);
                return;
            }
        }
        FH7.A03(fragmentActivity, url);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        if (X.182.A06(r5, r8, 36318887704337008L) == false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(androidx.fragment.app.FragmentActivity r24, X.AnonymousClass0iw r25, com.instagram.common.session.UserSession r26, com.instagram.user.model.User r27) {
        /*
            r23 = this;
            r4 = 0
            r3 = r27
            java.lang.String r13 = r3.getId()
            r8 = r26
            boolean r6 = X.2R8.A05(r8, r13)
            if (r6 == 0) goto L_0x006d
            java.lang.String r12 = "self_profile_badge"
        L_0x0011:
            r2 = r24
            boolean r17 = X.0oI.A0A(r2)
            r9 = 0
            java.lang.Integer r11 = r3.A04
            if (r11 != 0) goto L_0x0022
            X.4Cl r0 = r3.A03
            java.lang.Integer r11 = r0.C5X()
        L_0x0022:
            r7 = r25
            r10 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            X.C321406u6.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r1.A01(r8)
            boolean r0 = r0.A1r()
            if (r0 == 0) goto L_0x005c
            com.instagram.user.model.User r0 = r1.A01(r8)
            boolean r0 = r0.A1r()
            if (r0 == 0) goto L_0x008a
            if (r17 != 0) goto L_0x008a
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318887704205934(0x8107d6003f1a6e, double:3.031549056337668E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 != 0) goto L_0x005c
            r0 = 36318887704337008(0x8107d600411a70, double:3.0315490564205597E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x008a
        L_0x005c:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318887704337008(0x8107d600411a70, double:3.0315490564205597E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x0070
            A03(r2, r8, r12, r9)
            return
        L_0x006d:
            java.lang.String r12 = "other_profile_badge"
            goto L_0x0011
        L_0x0070:
            X.FTe r6 = new X.FTe
            r18 = r7
            r19 = r8
            r20 = r12
            r21 = r13
            r22 = r17
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            X.FEg r4 = X.C49908FEg.A00
            r5 = r2
            r7 = r8
            r8 = r3
            r4.A01(r5, r6, r7, r8, r9, r10)
            return
        L_0x008a:
            X.4Cl r0 = r3.A03
            java.lang.String r0 = r0.C6o()
            if (r0 == 0) goto L_0x0097
            if (r17 == 0) goto L_0x0097
            X.FH7.A02(r2, r0)
        L_0x0097:
            java.lang.String r1 = X.0oI.A04(r2)
            if (r1 == 0) goto L_0x00c4
            if (r17 == 0) goto L_0x00c4
            r0 = 344(0x158, float:4.82E-43)
            boolean r0 = X.0oI.A0H(r2, r1, r0)
            if (r0 == 0) goto L_0x00c4
            X.0Tu r5 = X.0Tu.A05
            r0 = 36321511929292266(0x810a39004025ea, double:3.0332086268491706E-306)
            boolean r0 = X.182.A06(r5, r8, r0)
            if (r0 == 0) goto L_0x00c4
            X.IwM r1 = new X.IwM
            r1.<init>(r8, r4)
            java.lang.Class<X.IOo> r0 = X.C57100IOo.class
            java.lang.Object r0 = r8.A01(r0, r1)
            X.IOo r0 = (X.C57100IOo) r0
            r0.A00(r9)
        L_0x00c4:
            java.lang.String r1 = r3.getUsername()
            if (r6 == 0) goto L_0x00f5
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x00cc:
            java.lang.String r3 = "com.instagram.android"
            r0 = r23
            boolean r0 = r0.A06(r2, r8)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = A00(r8, r4, r1, r3)
        L_0x00da:
            X.FH7.A02(r2, r0)
            return
        L_0x00de:
            boolean r0 = X.0oI.A0A(r2)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = "&glyph_type="
            java.lang.String r0 = X.C49200Er5.A00(r4)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "barcelona://user?id=%s&source_application=%s%s"
            java.lang.String r0 = X.DbU.A0s(r0, r13, r3, r1)
            goto L_0x00da
        L_0x00f5:
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x00cc
        L_0x00f8:
            java.lang.String r3 = A00(r8, r4, r1, r9)
            java.lang.String r1 = r7.getModuleName()
            X.2EG r0 = X.2EG.A0Q
            X.FHB.A04(r2, r8, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49965FGy.A08(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):void");
    }

    public static final String A00(UserSession userSession, Integer num, String str, String str2) {
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        boolean booleanValue = AnonymousClass9HN.A00(userSession).booleanValue();
        String A002 = AnonymousClass000.A00(1893);
        if (booleanValue) {
            String A04 = 182.A04(0Tu.A05, userSession, 36881837654147487L);
            if (A04.length() != 0) {
                A002 = A04;
            }
        }
        Uri.Builder appendEncodedPath = scheme.authority(002.A0R("www.", A002)).path("/").appendEncodedPath(002.A0D(str, '@'));
        if (!(str2 == null || str2.length() == 0)) {
            appendEncodedPath.appendQueryParameter("source_application", str2);
        }
        if (num != null) {
            appendEncodedPath.appendQueryParameter("glyph_type", C49200Er5.A00(num));
        }
        return DbT.A10(appendEncodedPath.build());
    }

    private final boolean A06(Context context, UserSession userSession) {
        String A04 = 0oI.A04(context);
        if (A04 == null || !0oI.A0H(context, A04, 311) || !AnonymousClass9HN.A00(userSession).booleanValue() || !C319886rO.A01(userSession) || !182.A06(0Tu.A05, userSession, 36318887702567510L)) {
            return false;
        }
        return true;
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        String A0s;
        AnonymousClass7TG.A1T(userSession, fragmentActivity, str);
        if (A00.A06(fragmentActivity, userSession)) {
            A0s = A00(userSession, num, str2, "com.instagram.android");
        } else if (0oI.A0A(fragmentActivity)) {
            if (num != null) {
                str4 = 002.A0R("&glyph_type=", C49200Er5.A00(num));
            } else {
                str4 = "";
            }
            A0s = DbU.A0s("barcelona://user?id=%s&source_application=%s%s", str, "com.instagram.android", str4);
        } else {
            A03(fragmentActivity, userSession, str3, (String) null);
            return;
        }
        FH7.A02(fragmentActivity, A0s);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        if (0oI.A0A(fragmentActivity)) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(C273654mx.A00(1526));
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.addAll(0sr.A1P(new String[]{null, null, null}));
            boolean z = false;
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                if (A18 != null) {
                    char c = '&';
                    if (!z) {
                        c = '?';
                    }
                    A1A.append(c);
                    A1A.append(A18);
                    z = true;
                }
            }
            FH7.A02(fragmentActivity, DbT.A10(A1A));
            return;
        }
        A03(fragmentActivity, userSession, str, (String) null);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        AnonymousClass7TG.A1T(userSession, fragmentActivity, str);
        if (0oI.A0A(fragmentActivity)) {
            FH7.A02(fragmentActivity, str);
        } else {
            A03(fragmentActivity, userSession, str2, str3);
        }
    }
}
