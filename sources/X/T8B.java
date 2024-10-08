package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.react.activity.IgReactActivity;

public final class T8B implements C13759TgV {
    public int A00 = 1;
    public C267664bz A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public Bundle A0B;
    public final 0lg A0C;

    public final T8B A00(Bundle bundle) {
        if (this.A05 != null) {
            this.A0B.putBundle("params", bundle);
            return this;
        }
        this.A0B = bundle;
        return this;
    }

    public final T8B A01(String str) {
        17k.A0G(DbW.A1a(this.A04), "Route name and app key cannot be both set");
        this.A05 = str;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("routeName", str);
        A0a.putBundle("params", this.A0B);
        this.A04 = "FacebookAppRouteHandler";
        this.A0B = A0a;
        return this;
    }

    public final boolean A02(Context context) {
        Intent A0A2 = C66580MXl.A0A(context, IgReactActivity.class);
        Integer num = this.A02;
        if (num != null) {
            A0A2.addFlags(num.intValue());
        }
        A0A2.putExtras(AEV());
        if (this.A08 && AnonymousClass2Rc.A00) {
            A0A2.putExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION", new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit});
        }
        0R3 A072 = 0kR.A00.A07();
        0UW r3 = A072.A01;
        Intent A0C2 = r3.A0C(context, A0A2, A072.A02);
        if (A0C2 == null) {
            return false;
        }
        if (A0C2.hasExtra("_ci_")) {
            A0C2.removeExtra("_ci_");
        }
        0bs.A03(context, A072);
        if (AnonymousClass0Wi.A01(context, A0C2)) {
            r3.A01.EFS("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        context.startActivity(A0C2);
        return true;
    }

    public T8B(0lg r2, String str) {
        this.A0C = r2;
        this.A04 = str;
    }

    public final Bundle AEV() {
        String A0R;
        Bundle A0a = AnonymousClass7TE.A0a();
        DbW.A0w(A0a, this.A0C);
        String str = this.A07;
        if (str != null) {
            A0a.putString("IgReactFragment.ARGUMENT_TITLE", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A0a.putString("IgReactFragment.TTI_EVENT_NAME", str2);
        }
        A0a.putBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", this.A0A);
        A0a.putString("IgReactFragment.ARGUMENT_APP_KEY", this.A04);
        A0a.putBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN", this.A09);
        A0a.putBoolean("IgReactFragment.ARGUMENT_IS_MODAL", false);
        Bundle bundle = this.A0B;
        if (bundle != null) {
            A0a.putBundle("IgReactFragment.ARGUMENT_INITIAL_PROPS", bundle);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A0R = this.A03;
        } else {
            if (bundle != null && !TextUtils.isEmpty(bundle.getString("routeName"))) {
                A0R = 002.A0R("react_", bundle.getString("routeName"));
            }
            A0a.putBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB", false);
            A0a.putInt("IgReactFragment.ARGUMENT_ORIENTATION", this.A00);
            A0a.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", false);
            return A0a;
        }
        A0a.putString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE", A0R);
        A0a.putBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB", false);
        A0a.putInt("IgReactFragment.ARGUMENT_ORIENTATION", this.A00);
        A0a.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", false);
        return A0a;
    }

    public final C309516Yo F08(FragmentActivity fragmentActivity) {
        1WM.getInstance().getFragmentFactory();
        Bundle AEV = AEV();
        R8S r8s = new R8S();
        r8s.setArguments(AEV);
        C309516Yo A0M = DbS.A0M(fragmentActivity, this.A0C);
        A0M.A0E(r8s);
        A0M.A07 = this.A01;
        String str = this.A05;
        if (str == null) {
            str = this.A04;
        }
        A0M.A0C = str;
        return A0M;
    }

    public T8B(0lg r2) {
        this.A0C = r2;
    }
}
