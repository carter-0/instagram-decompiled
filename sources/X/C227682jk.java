package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.2jk  reason: invalid class name and case insensitive filesystem */
public final class C227682jk extends AnonymousClass4DH {
    public static final int A0A = View.generateViewId();
    public static final String __redex_internal_original_name = "NavigationBoundaryTestWrapperFragment";
    public Fragment A00;
    public 0sP A01;
    public boolean A02;
    public boolean A03;
    public int A04 = -1;
    public long A05;
    public long A06;
    public SpinnerImageView A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final Handler A09 = new Handler(Looper.getMainLooper());

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C227682jk.super.onAttach(context);
        this.A05 = System.currentTimeMillis();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("wrapped_fragment_added", this.A02);
    }

    private final void A00() {
        if (!this.A02) {
            long currentTimeMillis = this.A06 - (System.currentTimeMillis() - this.A05);
            if (currentTimeMillis <= 0) {
                A01(this);
            } else {
                this.A09.postDelayed(new TEA(this), currentTimeMillis);
            }
        }
    }

    public final Fragment A02(0sP r3) {
        Fragment fragment = null;
        if (this.A03) {
            fragment = this.A00;
            if (fragment == null) {
                0qQ.A0F("wrappedFragment");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            this.A01 = r3;
        }
        return fragment;
    }

    public final AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A08.getValue();
    }

    public static final void A01(C227682jk r5) {
        if (!r5.isStateSaved() && !r5.A02) {
            r5.A02 = true;
            0hq childFragmentManager = r5.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            0s1 r3 = new 0s1(childFragmentManager);
            int i = A0A;
            Fragment fragment = r5.A00;
            if (fragment == null) {
                0qQ.A0F("wrappedFragment");
                throw AnonymousClass00P.createAndThrow();
            }
            r3.A09(fragment, i);
            r3.A0G = true;
            r3.A0I((String) null);
            r3.A00();
            0s1 r1 = new 0s1(r5.getParentFragmentManager());
            r1.A0I("test");
            r1.A00();
            r5.getParentFragmentManager().A0c();
            SpinnerImageView spinnerImageView = r5.A07;
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(C255943uy.SUCCESS);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A022 = AnonymousClass0fD.A02(1531842925);
        C227682jk.super.onCreate(bundle);
        if (bundle != null) {
            this.A02 = bundle.getBoolean("wrapped_fragment_added", false);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A04 = bundle2.getInt("background_color", this.A04);
            this.A06 = bundle2.getLong("delay_ms", 0);
            if (!this.A02) {
                Context context = getContext();
                if (context != null) {
                    String string = bundle2.getString("wrapped_fragment_class");
                    Bundle bundle3 = bundle2.getBundle("wrapped_fragment_args");
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                        Object obj = bundle2.get("ClipsViewerLauncher.KEY_CONFIG");
                        if ((obj instanceof Parcelable) && (parcelable = (Parcelable) obj) != null) {
                            bundle3.putParcelable("ClipsViewerLauncher.KEY_CONFIG", parcelable);
                        }
                    }
                    if (string != null) {
                        this.A00 = Fragment.instantiate(context, string, bundle3);
                        getChildFragmentManager().A0r(new C7416QCf(this), false);
                        Fragment.SavedState savedState = (Fragment.SavedState) 2Yc.A01(bundle2, Fragment.SavedState.class, "wrapped_fragment_state");
                        if (savedState != null) {
                            Fragment fragment = this.A00;
                            if (fragment == null) {
                                0qQ.A0F("wrappedFragment");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            fragment.setInitialSavedState(savedState);
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                Fragment A0P = getChildFragmentManager().A0P(A0A);
                if (A0P != null) {
                    this.A00 = A0P;
                    this.A03 = true;
                }
            }
        }
        AnonymousClass0fD.A09(901744348, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        int A022 = AnonymousClass0fD.A02(249384213);
        Context context = getContext();
        if (context != null) {
            frameLayout = new FrameLayout(context);
            SpinnerImageView spinnerImageView = new SpinnerImageView(context);
            this.A07 = spinnerImageView;
            spinnerImageView.setImageResource(R.drawable.spinner_large);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackgroundColor(this.A04);
            KHL khl = new KHL(context, viewGroup);
            khl.setId(A0A);
            frameLayout.addView(frameLayout2);
            frameLayout.addView(this.A07);
            frameLayout.addView(khl);
            A00();
        } else {
            frameLayout = null;
        }
        AnonymousClass0fD.A09(21831693, A022);
        return frameLayout;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1766861494);
        super.onDestroyView();
        this.A07 = null;
        AnonymousClass0fD.A09(1307487616, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(356737490);
        A01(this);
        C227682jk.super.onPause();
        AnonymousClass0fD.A09(1908171807, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(454966362);
        super.onResume();
        A00();
        AnonymousClass0fD.A09(1133121634, A022);
    }
}
