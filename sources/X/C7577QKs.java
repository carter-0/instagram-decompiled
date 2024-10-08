package X;

import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel;
import com.instagram.android.R;

/* renamed from: X.QKs  reason: case insensitive filesystem */
public abstract class C7577QKs extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public LinearLayout A00;
    public boolean A01 = true;
    public boolean A02;

    public int A00() {
        if (this instanceof C7570QKb) {
            return R.layout.ctwa_iaw_cta_on_ig_view;
        }
        return R.layout.ig_call_extension_view;
    }

    public final void A02() {
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            if (this.A01) {
                linearLayout.setVisibility(8);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) linearLayout.getHeight());
                translateAnimation.setDuration(500);
                Pxg.A1I(translateAnimation);
                linearLayout.startAnimation(translateAnimation);
            }
            this.A01 = false;
        }
    }

    public void A03(View view, C340027ka r7) {
        C3021461u r2;
        String str;
        C11499SbM sbM;
        String str2;
        if (this instanceof C7570QKb) {
            C7570QKb qKb = (C7570QKb) this;
            CTWABrowserCTAExtensionModel cTWABrowserCTAExtensionModel = qKb.A00;
            if (cTWABrowserCTAExtensionModel.A00 == null) {
                0Aj A0e = AnonymousClass7TE.A0e(qKb.A01, "ctmessaging_web_to_wa_cta_error");
                if (A0e.isSampled()) {
                    String str3 = cTWABrowserCTAExtensionModel.A01;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A0e.AAJ("ad_id", str3);
                    A0e.AAJ("error_reason", "URL is empty");
                    A0e.Cgf();
                    return;
                }
                return;
            }
            r2 = (C3021461u) view.findViewById(R.id.bottom_button);
            FragmentActivity activity = r7.getActivity();
            if (activity != null) {
                str = activity.getString(2131963555);
            } else {
                str = null;
            }
            sbM = C11499SbM.A00(view, qKb, 8);
        } else {
            r2 = (C3021461u) view.findViewById(R.id.bottom_button);
            FragmentActivity activity2 = r7.getActivity();
            if (activity2 != null) {
                str2 = activity2.getString(2131954472);
            } else {
                str2 = null;
            }
            sbM = C11499SbM.A00(r7, this, 7);
        }
        r2.setPrimaryAction(str, sbM);
    }

    public int A01() {
        return R.id.call_extension_iab_stub;
    }
}
