package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import java.util.Locale;

/* renamed from: X.7Ci  reason: invalid class name and case insensitive filesystem */
public abstract class C327827Ci {
    public static final Drawable A00(Context context, ThemeViewModelDelegate themeViewModelDelegate) {
        int i;
        Drawable drawable;
        int[] iArr;
        int i2;
        0qQ.A0B(themeViewModelDelegate, 1);
        boolean A00 = AnonymousClass3HA.A00(context);
        if (A00) {
            i = themeViewModelDelegate.A01;
        } else {
            i = themeViewModelDelegate.A03;
        }
        if (i <= 0) {
            if (A00) {
                iArr = themeViewModelDelegate.A0B;
                i2 = themeViewModelDelegate.A00;
            } else {
                iArr = themeViewModelDelegate.A0C;
                i2 = themeViewModelDelegate.A02;
            }
            drawable = C69930NuW.A00(context, iArr, i2, R.drawable.direct_thread_detail_chat_color_preview);
        } else {
            drawable = context.getResources().getDrawable(i);
        }
        0qQ.A07(drawable);
        return drawable;
    }

    public static final void A01(Context context, AnonymousClass0iw r20, UserSession userSession, C47167Dri dri) {
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        Context context2 = context;
        Activity activity = (Activity) context2;
        int i = -1;
        C47167Dri dri2 = dri;
        String str2 = dri2.A0A;
        if (str2 != null) {
            Locale locale = Locale.US;
            0qQ.A08(locale);
            String upperCase = str2.toUpperCase(locale);
            0qQ.A07(upperCase);
            if (upperCase.equals("general")) {
                i = 1;
            } else if (upperCase.equals("primary")) {
                i = 0;
            }
        }
        String str3 = null;
        AnonymousClass0iw r4 = r20;
        if (!C71118OdC.A03(activity, context2, r4, userSession2, (2EM) null, i, false)) {
            1ap r7 = 1as.A04.A02;
            ThemeViewModelDelegate themeViewModelDelegate = dri2.A03;
            C254743sy r10 = dri2.A07;
            NKI A04 = r7.A04(userSession2, themeViewModelDelegate, r10, "thread_details", dri2.A01, dri2.A00, dri2.A0K, dri2.A0I, dri2.A0J);
            0qQ.A0C(A04, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.chatsettings.DirectThreadColorPickerFragment");
            C331127Pr r72 = new C331127Pr(userSession2);
            r72.A0T = A04;
            r72.A0a = true;
            r72.A1C = false;
            r72.A0A = 2Yu.A02(context2);
            float f = 0.5f;
            if (182.A06(0Tu.A05, userSession2, 36324222049464204L)) {
                f = 0.75f;
            }
            r72.A03 = f;
            C331157Pu A00 = r72.A00();
            A00.A02(C61190ls.A00(activity), A04);
            A04.A05 = new C72331P1w(A00);
            0wc A01 = AnonymousClass0kN.A01(r4, userSession2);
            0Aj A002 = A01.A00(A01.A00, "direct_thread_theme_picker");
            if (A002.isSampled()) {
                A002.A7p("is_e2ee", Boolean.valueOf(C66647MaG.A0E(r10)));
                Long l = null;
                if (r10 != null) {
                    str = C66647MaG.A0A(r10);
                } else {
                    str = null;
                }
                A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                A002.A8M(C69478NmM.THREAD_DETAILS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                if (r10 != null) {
                    str3 = C67003Mgb.A01(r10);
                }
                A002.AAJ("open_thread_id", str3);
                if (r10 != null) {
                    l = C67003Mgb.A00(r10);
                }
                A002.A9F("occamadillo_thread_id", l);
                A002.Cgf();
            }
        }
    }

    public static final boolean A02(UserSession userSession, Capabilities capabilities, C254783t2 r5, int i, boolean z, boolean z2) {
        if (r5 != null && AnonymousClass6W3.A08(r5)) {
            return AnonymousClass9HV.A00(userSession).A00(r5, 14);
        }
        if (!capabilities.A00(C376179Gx.THREAD_DETAILS_SHOW_THEME_SETTINGS)) {
            return false;
        }
        if (!AnonymousClass7LY.A00(i)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
