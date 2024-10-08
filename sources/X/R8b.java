package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public abstract class R8b extends C273374mT implements AnonymousClass4DR, C13613Tdf, C227562jX {
    public static final String __redex_internal_original_name = "FBPayIg4aContainerFragment";

    public final void onViewCreated(View view, Bundle bundle) {
        Fragment A07;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0hq childFragmentManager = getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        if (childFragmentManager.A0P(R.id.container_fragment) == null) {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                String string = bundle2.getString("CHILD_FRAGMENT_IDENTIFIER");
                if (string != null) {
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null) {
                        Bundle bundle4 = bundle3.getBundle("CHILD_FRAGMENT_BUNDLE");
                        if (this instanceof C8810RAm) {
                            A07 = AnonymousClass2E0.A0E().A04(bundle4, string);
                        } else if (this instanceof C8808RAk) {
                            A07 = AnonymousClass2E0.A03().A04.A01(bundle4, string);
                            0qQ.A07(A07);
                        } else {
                            A07 = AnonymousClass2E0.A02().A07(bundle4, string);
                        }
                        07M.A02(this);
                        A07.setTargetFragment((Fragment) null, this.mTargetRequestCode);
                        0s1 r0 = new 0s1(childFragmentManager);
                        r0.A0A(A07, R.id.container_fragment);
                        r0.A00();
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final boolean DGj(Bundle bundle, int i, boolean z) {
        if (!(this instanceof C8810RAm)) {
            return C11093S9u.A01(bundle, this, z);
        }
        if (C11093S9u.A01(bundle, this, z) || ((getChildFragmentManager().A0P(R.id.container_fragment) instanceof C13613Tdf) && getChildFragmentManager().A0P(R.id.container_fragment).DGj(bundle, i, z))) {
            return true;
        }
        return false;
    }

    public final String getModuleName() {
        return "FBPAY_CONTAINER_FRAGMENT";
    }

    public final boolean CIn(int i, KeyEvent keyEvent) {
        getChildFragmentManager().A0P(R.id.container_fragment);
        return false;
    }

    public final boolean onBackPressed() {
        C13610Tdc A0P = getChildFragmentManager().A0P(R.id.container_fragment);
        if (A0P instanceof C13610Tdc) {
            return A0P.onBackPressed();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(334316684);
        R8b.super.onCreate(bundle);
        AnonymousClass0fD.A09(1138514474, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1809668870);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fbpay_container_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1920660584, A02);
        return inflate;
    }
}
