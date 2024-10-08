package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FRa  reason: case insensitive filesystem */
public final class C50143FRa implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C50143FRa.class);
    public static final String __redex_internal_original_name = "FacebookPageClaimHelper";

    public static void A01(Context context, Fragment fragment, AnonymousClass0iw r13, UserSession userSession, String str, boolean z) {
        int i;
        Object[] objArr;
        Fragment fragment2 = fragment;
        UserSession userSession2 = userSession;
        String str2 = str;
        A03(userSession, str, "claim_page", "claim_page_row");
        Context context2 = context;
        FF8 ff8 = new FF8(context, R.layout.claim_page_dialog, 0);
        C46659Dig dig = ff8.A0D;
        dig.setCancelable(true);
        dig.setCanceledOnTouchOutside(true);
        C46659Dig A002 = ff8.A00();
        0eE r3 = AnonymousClass0t1.A01;
        DbU.A1S(r13, A002.requireViewById(R.id.profile), r3.A01(userSession));
        TextView textView = (TextView) A002.requireViewById(R.id.dialog_content);
        String string = context.getString(2131969131);
        if (z) {
            ((TextView) A002.requireViewById(R.id.dialog_title)).setText(2131956533);
            i = 2131956879;
            objArr = new Object[]{string};
        } else {
            i = 2131955125;
            objArr = new Object[]{r3.A01(userSession).B8Q(), string};
        }
        SpannableStringBuilder A0C = DbS.A0C(context.getString(i, objArr));
        String A01 = SQU.A01(context, AnonymousClass000.A00(634));
        int A0F = 2Yu.A0F(context, R.attr.igds_color_link);
        AnonymousClass7TG.A1Q(userSession2, A01);
        UserSession userSession3 = userSession2;
        AnonymousClass7AV.A05(A0C, new C69192Ngq(context, userSession3, (OAJ) null, A01, A0F), string);
        DbX.A1G(textView, A0C);
        AnonymousClass0fU.A00(new C50104FOu((Object) fragment2, (Object) userSession3, (Object) A002, str2, 0), A002.requireViewById(R.id.not_now));
        if (z) {
            ((ViewStub) A002.requireViewById(R.id.middle_connect_page_button)).inflate();
            TextView textView2 = (TextView) A002.requireViewById(R.id.connect_existing_page_button);
            textView2.setText(2131956701);
            AnonymousClass0fU.A00(new FOD(A002, fragment2, userSession2, context2, str2, 0), textView2);
        }
        if (fragment2 instanceof DialogInterface.OnCancelListener) {
            A002.setOnCancelListener((DialogInterface.OnCancelListener) fragment2);
        }
        AnonymousClass0fN.A00(A002);
    }

    public static void A02(Fragment fragment, UserSession userSession, Integer num, String str) {
        C61073JwB jwB = new C61073JwB(num, (String) null, (String) null, (String) null, 7);
        Integer num2 = AnonymousClass05K.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        E1T e1t = new E1T();
        e1t.setArguments(C48758Ejh.A00(jwB, num2, str));
        Dbb.A0o((Bundle) null, e1t, requireActivity, userSession);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r1.A2K() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r1.A2K() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r0.A00 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r11, androidx.fragment.app.Fragment r12, X.AnonymousClass0iw r13, com.instagram.common.session.UserSession r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "setting"
            r9 = r15
            boolean r0 = X.2Ob.A00(r15, r0)
            r8 = r14
            com.instagram.user.model.User r1 = X.DbT.A0j(r14)
            if (r0 == 0) goto L_0x003d
            com.facebook.common.callercontext.CallerContext r3 = A00
            java.lang.String r4 = "ig_android_ig_business_asset_ig_business_settings"
            java.lang.String r5 = "ig_settings_business"
            java.lang.String r6 = "settings_business"
            java.lang.String r7 = "loading"
            X.9JK r2 = new X.9JK
            r2.<init>((com.facebook.common.callercontext.CallerContext) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
            X.9F7 r0 = X.DbV.A0O(r14)
            java.lang.Object r0 = r0.Au3(r2)
            X.Dfh r0 = (X.C46478Dfh) r0
            r10 = 1
            if (r0 == 0) goto L_0x0036
            X.9Gd r0 = r0.A00
            if (r0 == 0) goto L_0x0036
        L_0x002e:
            r10 = 0
        L_0x002f:
            r5 = r11
            r6 = r12
            r7 = r13
            A01(r5, r6, r7, r8, r9, r10)
            return
        L_0x0036:
            boolean r0 = r1.A2K()
            if (r0 == 0) goto L_0x002e
            goto L_0x002f
        L_0x003d:
            X.4Cl r0 = r1.A03
            java.lang.String r0 = r0.BaE()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002e
            boolean r0 = r1.A2K()
            r10 = 1
            if (r0 != 0) goto L_0x002f
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50143FRa.A00(android.content.Context, androidx.fragment.app.Fragment, X.0iw, com.instagram.common.session.UserSession, java.lang.String):void");
    }

    public static void A03(0lg r6, String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger A01 = C319596qs.A01(C319586qr.EDIT_PROFILE, r6, "facebook_page_claim_helper", AnonymousClass7TF.A0b());
        A01.getClass();
        A01.Ckp(new C22030Xtl(str2, str, str3, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
    }
}
