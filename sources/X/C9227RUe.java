package X;

import android.app.Activity;
import android.content.Context;
import android.util.SparseIntArray;
import android.view.ContextThemeWrapper;
import com.instagram.android.R;

/* renamed from: X.RUe  reason: case insensitive filesystem */
public abstract class C9227RUe {
    public static final C10395RrW A00(Context context) {
        int i;
        int i2;
        C10395RrW rrW = new C10395RrW(context, (SparseIntArray) null);
        if (!(context instanceof Activity)) {
            return rrW;
        }
        Activity activity = (Activity) context;
        0qQ.A0B(activity, 0);
        if (!activity.getIntent().getBooleanExtra("BrowserLiteIntent.EXTRA_ENABLE_DARK_MODE", false)) {
            return rrW;
        }
        Context context2 = rrW.A00;
        S8S s8s = C10068Rm5.A00;
        boolean Agw = S8S.A00().Agw(C10135RnC.A00);
        boolean Agw2 = S8S.A00().Agw(C10135RnC.A01);
        if (S8S.A00().Agw(C9931Rjk.A00)) {
            i2 = R.style.FDSDarkModeAccessible;
        } else {
            if (Agw && Agw2) {
                AnonymousClass0RU A00 = S8S.A00();
                long j = C10135RnC.A02;
                if (!A00.Agw(j) || !S8S.A00().Agw(C10135RnC.A03)) {
                    AnonymousClass0RU A002 = S8S.A00();
                    long j2 = C10135RnC.A04;
                    if (!A002.Agw(j2) || !S8S.A00().Agw(C10135RnC.A05)) {
                        AnonymousClass0RU A003 = S8S.A00();
                        long j3 = C10135RnC.A06;
                        if (A003.Agw(j3) && S8S.A00().Agw(C10135RnC.A05)) {
                            i2 = R.style.FDSDarkModeOneDotOV3TextAndWash;
                        } else if (S8S.A00().Agw(j)) {
                            i2 = R.style.FDSDarkModeOneDotOV1Text;
                        } else if (S8S.A00().Agw(j2)) {
                            i2 = R.style.FDSDarkModeOneDotOV2Text;
                        } else if (S8S.A00().Agw(j3)) {
                            i2 = R.style.FDSDarkModeOneDotOV3Text;
                        } else if (S8S.A00().Agw(C10135RnC.A03)) {
                            i2 = R.style.FDSDarkModeOneDotOV1Wash;
                        } else {
                            boolean Agw3 = S8S.A00().Agw(C10135RnC.A05);
                            i2 = R.style.FDSDarkModeOneDotO;
                            if (Agw3) {
                                i2 = R.style.FDSDarkModeOneDotOV2Wash;
                            }
                        }
                    } else {
                        i2 = R.style.FDSDarkModeOneDotOV2TextAndWash;
                    }
                } else {
                    i2 = R.style.FDSDarkModeOneDotOV1TextAndWash;
                }
            }
            i = R.style.FDSDarkMode;
            return new C10395RrW(new ContextThemeWrapper(context2, i), rrW.A01);
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf != null) {
            i = valueOf.intValue();
            return new C10395RrW(new ContextThemeWrapper(context2, i), rrW.A01);
        }
        i = R.style.FDSDarkMode;
        return new C10395RrW(new ContextThemeWrapper(context2, i), rrW.A01);
    }
}
