package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Oe2  reason: case insensitive filesystem */
public abstract class C71145Oe2 {
    public static final Integer A02(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        String string = fragment.requireArguments().getString("BUNDLE_ENTRY_POINT", "");
        0qQ.A0A(string);
        if (string.equals("DIRECT_INBOX_NUX")) {
            return AnonymousClass05K.A00;
        }
        if (string.equals("RESTORE_TOAST")) {
            return AnonymousClass05K.A01;
        }
        if (string.equals("SETTINGS")) {
            return AnonymousClass05K.A0C;
        }
        if (string.equals("SETTINGS_GDRIVE_TOGGLE")) {
            return AnonymousClass05K.A0N;
        }
        if (string.equals("FISHFOODING")) {
            return AnonymousClass05K.A0Y;
        }
        if (string.equals("OTC_NOTIFICATION")) {
            return AnonymousClass05K.A0j;
        }
        if (string.equals("SETTINGS_RESET_PIN")) {
            return AnonymousClass05K.A0u;
        }
        if (string.equals("UNKNOWN")) {
            return AnonymousClass05K.A15;
        }
        if (string.equals("ENCRYPTED_MESSAGE")) {
            return AnonymousClass05K.A1F;
        }
        if (string.equals("DEFAULT_BACKUPS")) {
            return AnonymousClass05K.A1I;
        }
        if (string.equals("THREAD_EXIT")) {
            return AnonymousClass05K.A02;
        }
        if (string.equals("INBOX_BANNER")) {
            return AnonymousClass05K.A03;
        }
        if (string.equals("RETRY_PIN")) {
            return AnonymousClass05K.A04;
        }
        if (string.equals("AUTO_POPUP")) {
            return AnonymousClass05K.A05;
        }
        if (string.equals("STATE_CHECKER")) {
            return AnonymousClass05K.A06;
        }
        if (string.equals("BLOCK_STORE_HEALTH_VALIDATOR")) {
            return AnonymousClass05K.A07;
        }
        throw AnonymousClass7TE.A0w(string);
    }

    public static final void A05(ViewGroup viewGroup, Fragment fragment, double d) {
        0qQ.A0B(viewGroup, 1);
        if (A08(fragment)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (AnonymousClass65A.A02(AnonymousClass65D.A00(DbX.A0U(fragment)).A00, 36315949952274243L)) {
                AnonymousClass03j.A00(viewGroup, new C71491Olg(layoutParams, viewGroup, fragment, d));
                return;
            }
            layoutParams.height = (int) (((double) DbV.A05(fragment).getDisplayMetrics().heightPixels) * 0.75d);
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public static final void A06(Fragment fragment, C358278ae r3, Integer num, Integer num2, Integer num3, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, int i, int i2) {
        0qQ.A0B(fragment, 0);
        C358248ab A0U = DbW.A0U(fragment);
        if (num != null) {
            A0U.A09(num.intValue());
        }
        A0U.A08(i);
        if (num2 != null) {
            A0U.A0Q(C71249OgE.A00(r10, 23), r3, num2.intValue());
        }
        if (num3 != null) {
            A0U.A0G(C71249OgE.A00(r9, 24), num3.intValue());
        }
        C71249OgE.A03(A0U, r8, 25, i2);
        A0U.A0r(true);
        if (r7 != null) {
            C71252OgJ.A00(A0U, r7, 6);
        }
        DbT.A1V(A0U);
    }

    public static final boolean A08(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        return Dba.A1X(C69271NiX.BOTTOM_SHEET, fragment.requireArguments().getString("BUNDLE_SURFACE", ""));
    }

    public static final boolean A09(Fragment fragment) {
        0qQ.A0B(fragment, 0);
        return Dba.A1X(C69271NiX.FULLSCREEN_MODAL, fragment.requireArguments().getString("BUNDLE_SURFACE", ""));
    }

    public static final void A04(ViewGroup viewGroup, Fragment fragment) {
        A05(viewGroup, fragment, 0.75d);
    }

    public static final void A07(Fragment fragment, Integer num, C62320sa r13, int i) {
        A06(fragment, C358278ae.BLUE_BOLD, num, (Integer) null, (Integer) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, r13, i, 2131968772);
    }

    public static final C69271NiX A00(Fragment fragment) {
        String string = fragment.requireArguments().getString("BUNDLE_SURFACE", "");
        0qQ.A0A(string);
        return C69271NiX.valueOf(string);
    }

    public static final Integer A01(Fragment fragment) {
        return C66583MXo.A0c(fragment.requireArguments().getInt("BUNDLE_CURRENT_INTERVAL", AnonymousClass972.MUTABLE_FLAG_MASK), AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public static final Integer A03(Fragment fragment) {
        String string = fragment.requireArguments().getString("BUNDLE_ONBOARDING_PERIOD", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        0qQ.A0A(string);
        if (string.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return AnonymousClass05K.A00;
        }
        if (string.equals("INTRODUCE")) {
            return AnonymousClass05K.A01;
        }
        if (string.equals("CUTOVER")) {
            return AnonymousClass05K.A0C;
        }
        if (string.equals("SELL")) {
            return AnonymousClass05K.A0N;
        }
        if (string.equals("WARN")) {
            return AnonymousClass05K.A0Y;
        }
        if (string.equals("BLOCK")) {
            return AnonymousClass05K.A0j;
        }
        if (string.equals("MEX_EB_UPSELL")) {
            return AnonymousClass05K.A0u;
        }
        if (string.equals("MEX_EB_LOW_DISK_SPACE")) {
            return AnonymousClass05K.A15;
        }
        throw AnonymousClass7TE.A0w(string);
    }
}
