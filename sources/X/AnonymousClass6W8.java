package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.Arrays;

/* renamed from: X.6W8  reason: invalid class name */
public final class AnonymousClass6W8 {
    public static final int[] A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public int A00 = 0;
    public C267664bz A01;
    public AnonymousClass0iw A02;
    public EEH A03;
    public Integer A04;
    public String A05 = "button";
    public String A06 = null;
    public boolean A07 = true;
    public boolean A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I;
    public int[] A0J;
    public Integer A0K;
    public final Activity A0L;
    public final Bundle A0M;
    public final 0lg A0N;
    public final String A0O;
    public final Class A0P;

    public final void A0B(Activity activity, Fragment fragment, AnonymousClass34S[] r9, int i) {
        Fragment fragment2 = fragment;
        Intent A002 = A00(fragment.getContext());
        if (0mE.A00(fragment.getContext(), FragmentActivity.class) != null) {
            A04();
            EEH eeh = this.A03;
            if (eeh != null) {
                EEH.A00(eeh);
            }
            0kR.A00.A07().A0A(activity, A002, fragment2, r9, i);
            return;
        }
        throw new IllegalStateException("Trying to start an activity from a fragment not hosted in a FragmentActivity");
    }

    static {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        boolean z = AnonymousClass2Rc.A00;
        if (z) {
            iArr = new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit};
        } else {
            iArr = ModalActivity.A08;
        }
        A0S = iArr;
        if (z) {
            iArr2 = new int[]{R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit};
        } else {
            iArr2 = ModalActivity.A08;
        }
        A0R = iArr2;
        if (z) {
            iArr3 = new int[]{R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out};
        } else {
            iArr3 = ModalActivity.A08;
        }
        A0Q = iArr3;
    }

    private Intent A00(Context context) {
        Intent putExtra = new Intent(context, this.A0P).putExtra("fragment_name", this.A0O).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, this.A0M).putExtra("source_activity_arguments", this.A0L.getIntent().getExtras());
        String str = this.A06;
        if (str != null) {
            putExtra.putExtra("initial_fragment_backstack_name", str);
        }
        int[] iArr = this.A0J;
        if (iArr != null) {
            putExtra.putExtra("fragment_animation", iArr);
            if (Arrays.equals(iArr, ModalActivity.A08)) {
                putExtra.addFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
            }
        }
        putExtra.putExtra("translucent_navigation_bar", this.A0G);
        putExtra.putExtra("will_hide_system_ui", this.A0I);
        if (this.A0A) {
            putExtra.putExtra("do_not_inflate_action_bar", true);
        }
        if (this.A0D) {
            putExtra.addFlags(805306368);
        }
        if (this.A0E) {
            putExtra.addFlags(536870912);
        }
        if (!this.A07) {
            putExtra.addFlags(SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        if (this.A08) {
            putExtra.addFlags(335544320);
        }
        if (this.A09) {
            putExtra.addFlags(67108864);
        }
        putExtra.putExtra("will_fit_system_windows", this.A0H);
        putExtra.putExtra("will_hide_navigation_bar", this.A0B);
        putExtra.putExtra("display_cutout_mode", this.A00);
        Integer num = this.A0K;
        if (num != null) {
            putExtra.putExtra("status_bar_color", num);
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            putExtra.putExtra("navigation_bar_color", num2);
        }
        putExtra.putExtra("lock_to_portrait", this.A0F);
        return putExtra;
    }

    public static AnonymousClass6W8 A01(Activity activity, Bundle bundle, 0lg r11) {
        AnonymousClass6W8 r3 = new AnonymousClass6W8(activity, bundle, r11, TransparentModalActivity.class, "reel_viewer");
        r3.A0J = ModalActivity.A08;
        if (!(r11 instanceof UserSession)) {
            StringBuilder sb = new StringBuilder();
            sb.append("session is not instance of UserSession ");
            sb.append(r11);
            0wb.A03("ModalActivityLauncher", sb.toString());
            return r3;
        }
        r3.A04 = -16777216;
        return r3;
    }

    public static AnonymousClass6W8 A02(Activity activity, Bundle bundle, 0lg r6, Class cls, String str) {
        AnonymousClass6W8 r3 = new AnonymousClass6W8(activity, bundle, r6, cls, str);
        if (!(r6 instanceof UserSession)) {
            StringBuilder sb = new StringBuilder();
            sb.append("session is not instance of UserSession ");
            sb.append(r6);
            0wb.A03("ModalActivityLauncher", sb.toString());
            return r3;
        }
        r3.A0C = true;
        r3.A0H = false;
        r3.A0B = true;
        r3.A09(0);
        r3.A04 = Integer.valueOf(activity.getColor(R.color.igds_transparent_navigation_bar));
        r3.A0F = true;
        return r3;
    }

    public static AnonymousClass6W8 A03(Activity activity, Bundle bundle, 0lg r3, Class cls, String str) {
        return new AnonymousClass6W8(activity, bundle, r3, cls, str);
    }

    private void A04() {
        AnonymousClass0iw r4 = this.A02;
        2cc A002 = C71342cb.A00(this.A0N);
        if (r4 != null) {
            int backStackEntryCount = this.A0L.getFragmentManager().getBackStackEntryCount();
            A002.A0B(this.A01, r4, this.A05, backStackEntryCount);
            return;
        }
        A002.A07(this.A0L, this.A01, this.A05);
    }

    public static void A05(Activity activity, Bundle bundle, Class cls, String str, int i) {
        0kR.A07(activity, new Intent(activity, cls).putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle), i);
    }

    public static void A06(Context context, Bundle bundle, Class cls, String str) {
        Intent putExtra = new Intent(context, cls).putExtra("fragment_name", str).putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle);
        putExtra.setFlags(268435456);
        0kR.A0B(context, putExtra);
    }

    public final void A07() {
        this.A0J = A0R;
    }

    public final void A08() {
        this.A0J = A0S;
    }

    public final void A0E(C273434mZ r2) {
        EEH eeh;
        if (r2 == null) {
            eeh = null;
        } else {
            eeh = new EEH(r2);
        }
        this.A03 = eeh;
    }

    public AnonymousClass6W8(Activity activity, Bundle bundle, 0lg r6, Class cls, String str) {
        this.A0N = r6;
        this.A0P = cls;
        this.A0O = str;
        this.A0M = bundle;
        this.A0L = activity;
        AnonymousClass0Dg.A00(bundle, r6);
    }

    public final void A09(int i) {
        this.A0K = Integer.valueOf(i);
    }

    public final void A0A(Activity activity, int i) {
        Intent A002 = A00(activity);
        A04();
        EEH eeh = this.A03;
        if (eeh != null) {
            EEH.A00(eeh);
        }
        0kR.A07(activity, A002, i);
    }

    public final void A0C(Context context) {
        Intent A002 = A00(context);
        Class<Activity> cls = Activity.class;
        if (0mE.A00(context, cls) == null) {
            A002.addFlags(268435456);
        } else {
            Activity activity = (Activity) 0mE.A00(context, cls);
            if (activity.getParent() != null) {
                context = activity.getParent();
            }
        }
        A04();
        Bundle bundle = this.A0M;
        CameraConfiguration cameraConfiguration = (CameraConfiguration) bundle.getParcelable("camera_configuration");
        28D serializable = bundle.getSerializable("camera_entry_point");
        if (serializable == null) {
            serializable = (28D) bundle.getSerializable("cameraEntryPoint");
        }
        if (cameraConfiguration != null && (cameraConfiguration.A03 instanceof C363138jC)) {
            JW1.A00(this.A0N).A03(serializable);
        }
        EEH eeh = this.A03;
        if (eeh != null) {
            EEH.A00(eeh);
        }
        if (this.A0C) {
            C226112fe.A0B.A05(this.A0L, new C57848IhR(A002, this));
            return;
        }
        0kR.A0B(context, A002);
    }

    public final void A0D(Fragment fragment, int i) {
        Intent A002 = A00(fragment.getContext());
        if (0mE.A00(fragment.getContext(), FragmentActivity.class) != null) {
            A04();
            EEH eeh = this.A03;
            if (eeh != null) {
                EEH.A00(eeh);
            }
            0kR.A05(fragment, A002, i);
            return;
        }
        throw new IllegalStateException("Trying to start an activity from a fragment not hosted in a FragmentActivity");
    }
}
