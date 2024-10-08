package X;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class H0L extends AnonymousClass4DH {
    public static final Interpolator A09 = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public static final String __redex_internal_original_name = "InstagramConsentFlowScreenFragment";
    public ViewGroup A00;
    public ViewGroup A01;
    public C55702Hlz A02;
    public String A03;
    public Dialog A04;
    public String A05;
    public String A06;
    public final 2el A07 = 2el.A00();
    public final AnonymousClass0eM A08 = C227642jf.A01(this);

    public final String getModuleName() {
        return "InstagramConsentFlowScreen";
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A08);
    }

    public static final void A00(Window window, int i, boolean z) {
        if (window.getStatusBarColor() != i) {
            window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
            window.setStatusBarColor(i);
        }
        new C586704n(window.getDecorView(), window).A00.A05(!z);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(114450725);
        H0L.super.onCreate(bundle);
        String string = requireArguments().getString("prompt_id");
        if (string != null) {
            this.A05 = string;
            C55702Hlz hlz = (C55702Hlz) C56480HzC.A01.get(string);
            if (hlz == null) {
                String str = this.A05;
                if (str == null) {
                    0qQ.A0F("promptId");
                    throw AnonymousClass00P.createAndThrow();
                }
                HSW.A00(this, str);
            } else {
                this.A02 = hlz;
            }
            AnonymousClass0fD.A09(178778179, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1217080254, A022);
        throw A0y;
    }

    /* JADX WARNING: type inference failed for: r0v41, types: [X.1Ko, java.lang.Object] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        View onCreateView;
        int i2;
        int A022 = AnonymousClass0fD.A02(-1562849136);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        ViewGroup viewGroup2 = viewGroup;
        Bundle bundle2 = bundle;
        if (this.A02 == null) {
            onCreateView = H0L.super.onCreateView(layoutInflater2, viewGroup2, bundle2);
            i2 = 625188659;
        } else {
            Context requireContext = requireContext();
            C55702Hlz hlz = this.A02;
            String str = "promptDisplayParameter";
            if (hlz != null) {
                C3034368u r13 = hlz.A01;
                if (r13 != null) {
                    C276544tV r15 = hlz.A02;
                    if (r15 != null) {
                        String A0F = r15.A0F();
                        if (A0F != null) {
                            this.A06 = A0F;
                            String A0E = r15.A0E();
                            if (A0E == null) {
                                A0E = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                            }
                            this.A03 = A0E;
                            0lg A0X = DbT.A0X(this.A08);
                            2el r10 = this.A07;
                            AnonymousClass6NS A002 = AnonymousClass6NS.A00(requireContext, r13, C229382nI.A03(this, A0X, r10)).A00();
                            C273694n2 r0 = new C273694n2(requireContext);
                            A002.A07(r0);
                            this.A00 = r0;
                            AnonymousClass3DZ A003 = AnonymousClass3DZ.A00(this);
                            ViewGroup viewGroup3 = this.A00;
                            str = "contentView";
                            if (viewGroup3 != null) {
                                r10.A08(viewGroup3, A003, new AnonymousClass2eo[0]);
                                boolean A004 = AnonymousClass3HA.A00(requireContext);
                                ConstraintLayout constraintLayout = new ConstraintLayout(requireContext);
                                String str2 = this.A03;
                                if (str2 != null) {
                                    if (str2.equals("cds")) {
                                        C361838gt C5w = new Object().C5w();
                                        int A005 = C14560TyP.A00(A004, true);
                                        C14560TyP A006 = C48305EcO.A00(requireContext, C5w, "0dp", A004);
                                        constraintLayout.setBackground(C51965G9l.A0D(A005));
                                        constraintLayout.addView(A006);
                                    } else {
                                        C276544tV A072 = r15.A07(140);
                                        int color = requireContext.getColor(R.color.direct_widget_primary_background);
                                        if (A072 != null) {
                                            int i3 = 36;
                                            if (A004) {
                                                i3 = 35;
                                            }
                                            String A0K = A072.A0K(i3);
                                            if (A0K != null) {
                                                color = AnonymousClass6Su.A03(A0K);
                                            }
                                        }
                                        constraintLayout.setBackground(C51965G9l.A0D(color));
                                    }
                                    ViewGroup viewGroup4 = this.A00;
                                    if (viewGroup4 != null) {
                                        constraintLayout.addView(viewGroup4, new ViewGroup.LayoutParams(-1, -1));
                                        C51968G9o.A1D(constraintLayout, -1);
                                        this.A01 = constraintLayout;
                                        C13349TVw tVw = new C13349TVw(14, A002, this);
                                        getSession();
                                        Context context = requireContext;
                                        C3034368u r19 = r13;
                                        C13349TVw tVw2 = tVw;
                                        C52782GcZ gcZ = new C52782GcZ(context, r19, r15.A09(), tVw2, new MYK("InstagramConsentFlowScreen", 5));
                                        gcZ.setCancelable(false);
                                        gcZ.setContentView(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
                                        this.A04 = gcZ;
                                        Window window = gcZ.getWindow();
                                        if (window != null) {
                                            View decorView = window.getDecorView();
                                            C51968G9o.A1D(decorView, -1);
                                            decorView.setPadding(0, 0, 0, 0);
                                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                            layoutParams.copyFrom(window.getAttributes());
                                            layoutParams.width = -1;
                                            layoutParams.height = -1;
                                            window.setAttributes(layoutParams);
                                            window.setDimAmount(0.0f);
                                            boolean A007 = AnonymousClass3HA.A00(requireContext);
                                            int color2 = requireContext.getColor(R.color.direct_widget_primary_background);
                                            new C586704n(window.getDecorView(), window).A00.A04(!A007);
                                            if (window.getNavigationBarColor() != color2) {
                                                window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
                                                window.setNavigationBarColor(color2);
                                            }
                                            String str3 = this.A03;
                                            if (str3 != null) {
                                                if (str3.equals("cds")) {
                                                    ViewGroup viewGroup5 = this.A00;
                                                    if (viewGroup5 != null) {
                                                        C69715Nqb.A00(viewGroup5, window);
                                                        A00(window, 0, A007);
                                                    }
                                                } else {
                                                    A00(window, color2, A007);
                                                }
                                            }
                                        }
                                        onCreateView = H0L.super.onCreateView(layoutInflater2, viewGroup2, bundle2);
                                        i2 = -1074684064;
                                    }
                                }
                                str = "containerTheme";
                            }
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                            i = -1003718606;
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = -1110033837;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -1601662244;
                }
                AnonymousClass0fD.A09(i, A022);
                throw illegalStateException;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(i2, A022);
        return onCreateView;
    }

    public final void onStart() {
        float[] A1b;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(937460073);
        H0L.super.onStart();
        if (this.A02 != null) {
            Context requireContext = requireContext();
            Dialog dialog = this.A04;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        0qQ.A0B(interpolator, 5);
                        if (!dialog.isShowing()) {
                            AnonymousClass0fN.A00(dialog);
                            if (str3.equals("screen")) {
                                A1b = C51965G9l.A1b();
                                A1b[0] = (float) AnonymousClass7TF.A0E(requireContext).widthPixels;
                                A1b[1] = 0.0f;
                                str = "translationX";
                            } else if (str3.equals("modal")) {
                                A1b = C51965G9l.A1b();
                                A1b[0] = (float) AnonymousClass7TF.A0E(requireContext).heightPixels;
                                A1b[1] = 0.0f;
                                str = "translationY";
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, A1b);
                            ofFloat.setDuration(280);
                            ofFloat.setInterpolator(interpolator);
                            ofFloat.start();
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A09(-1855840596, A022);
    }

    public final void onStop() {
        FragmentActivity activity;
        float[] A1b;
        String str;
        String str2;
        int A022 = AnonymousClass0fD.A02(-2027926198);
        if (this.A02 != null && this.mRemoving && (activity = getActivity()) != null && !activity.isDestroyed()) {
            Context requireContext = requireContext();
            FragmentActivity activity2 = getActivity();
            Dialog dialog = this.A04;
            if (dialog == null) {
                str2 = "fullScreenDialog";
            } else {
                ViewGroup viewGroup = this.A01;
                if (viewGroup == null) {
                    str2 = "screenView";
                } else {
                    String str3 = this.A06;
                    if (str3 == null) {
                        str2 = "screenType";
                    } else {
                        Interpolator interpolator = A09;
                        0qQ.A0B(interpolator, 6);
                        C56672I7b i7b = new C56672I7b(0, activity2, dialog);
                        if (str3.equals("screen")) {
                            A1b = C51965G9l.A1b();
                            A1b[0] = 0.0f;
                            A1b[1] = (float) AnonymousClass7TF.A0E(requireContext).widthPixels;
                            str = "translationX";
                        } else if (str3.equals("modal")) {
                            A1b = C51965G9l.A1b();
                            A1b[0] = 0.0f;
                            A1b[1] = (float) AnonymousClass7TF.A0E(requireContext).heightPixels;
                            str = "translationY";
                        }
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, str, A1b);
                        ofFloat.setDuration(200);
                        ofFloat.setInterpolator(interpolator);
                        ofFloat.addListener(i7b);
                        ofFloat.start();
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        H0L.super.onStop();
        AnonymousClass0fD.A09(-1866191922, A022);
    }
}
