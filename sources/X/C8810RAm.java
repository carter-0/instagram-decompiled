package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.RAm  reason: case insensitive filesystem */
public final class C8810RAm extends R8b implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "IgHubContainerFragment";

    public final void A00() {
        FragmentActivity activity = getActivity();
        activity.getClass();
        2dZ.A0t.A03(activity).A0T();
        BaseFragmentActivity activity2 = getActivity();
        if (activity2 != null && (activity2 instanceof BaseFragmentActivity)) {
            activity2.A0d();
        }
    }

    public final void configureActionBar(2da r6) {
        int i;
        View.OnClickListener onClickListener;
        AnonymousClass3JR r2;
        View.OnClickListener onClickListener2;
        if (getChildFragmentManager().A0P(R.id.container_fragment) instanceof C13616Tdi) {
            C11005S4z C7o = getChildFragmentManager().A0P(R.id.container_fragment).C7o();
            r6.Etr(C7o.A08);
            r6.Eu4(true);
            boolean A03 = C11431STx.A03();
            String str = C7o.A05;
            str.getClass();
            if (A03) {
                r6.setTitle(str);
            } else {
                r6.EfN(str, requireContext().getString(2131962186));
            }
            if (C7o.A07 && (i = C7o.A01) != 0) {
                if (i == 1) {
                    String str2 = C7o.A04;
                    if (str2 != null && (onClickListener2 = C7o.A03) != null) {
                        if (C7o.A06) {
                            r2 = new AnonymousClass3JR();
                            r2.A0K = str2;
                            r2.A0G = onClickListener2;
                        } else {
                            r6.AA7(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Drawable drawable = C7o.A02;
                    if (drawable != null && (onClickListener = C7o.A03) != null) {
                        r2 = new AnonymousClass3JR();
                        r2.A0F = drawable;
                        r2.A0G = onClickListener;
                        r2.A05 = C7o.A00;
                    } else {
                        return;
                    }
                }
                r6.AA3(new AnonymousClass3Jb(r2));
                return;
            }
            return;
        }
        r6.Etr(false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (getChildFragmentManager().A0P(R.id.container_fragment) != null) {
            getChildFragmentManager().A0P(R.id.container_fragment).onActivityResult(i, i2, intent);
        }
    }
}
