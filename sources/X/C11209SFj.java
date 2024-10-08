package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.SFj  reason: case insensitive filesystem */
public final class C11209SFj {
    public double A00;
    public FragmentActivity A01;
    public BrowserLiteFragment A02;
    public RU5 A03;
    public SRY A04;
    public S4Q A05;
    public C10913S0o A06;
    public boolean A07;
    public boolean A08;

    public static void A00(Bundle bundle, C11209SFj sFj, String str, int i) {
        BrowserLiteFragment browserLiteFragment = sFj.A02;
        if (browserLiteFragment != null) {
            browserLiteFragment.A0W(i);
            FragmentActivity fragmentActivity = sFj.A01;
            if (fragmentActivity.getCallingActivity() != null) {
                fragmentActivity.setResult(sFj.A02.A00, new Intent(fragmentActivity.getIntent()).putExtra("KEY_URL", str).putExtra("last_tap_point", i).putExtras(bundle));
            }
        }
        sFj.A01.finish();
    }

    public static void A01(C11209SFj sFj) {
        SSR.A06 = new SSR(SSR.A07);
        long longExtra = sFj.A01.getIntent().getLongExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", 0);
        if (longExtra > 0) {
            SSR.A00().A05("BLIH.Intent_Creation", longExtra);
        }
    }
}
