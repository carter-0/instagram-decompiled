package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7Cf  reason: invalid class name and case insensitive filesystem */
public final class C327797Cf implements C327807Cg, C327817Ch {
    public C331157Pu A00;
    public Integer A01;
    public final Activity A02;
    public final UserSession A03;
    public final AnonymousClass7I3 A04;
    public final String A05;
    public final C62320sa A06;
    public final 0sP A07;
    public final boolean A08;
    public final boolean A09;
    public final Context A0A;

    public C327797Cf(Activity activity, Context context, UserSession userSession, AnonymousClass7I3 r5, String str, C62320sa r7, 0sP r8, boolean z, boolean z2) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 6);
        this.A0A = context;
        this.A02 = activity;
        this.A03 = userSession;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A09 = z;
        this.A08 = z2;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0r1, java.lang.Object] */
    public final void A00(String str, 0sP r11, boolean z) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A03;
        C55964HqV hqV = new C55964HqV(this.A0A, userSession, this);
        ? obj = new Object();
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.95f;
        r1.A04 = 0.95f;
        r1.A0U = new C40650AgQ(this, obj);
        this.A00 = r1.A00();
        String A042 = 182.A04(0Tu.A05, userSession, 36886463333532364L);
        int i = 0;
        hqV.A00(A042, false);
        boolean z2 = this.A09;
        boolean z3 = this.A08;
        String str2 = this.A05;
        Boolean valueOf = Boolean.valueOf(z);
        Integer num = this.A01;
        if (num != null) {
            i = num.intValue();
        }
        C70614ODl oDl = new C70614ODl(this, r11, obj);
        boolean booleanValue = valueOf.booleanValue();
        C68447NIk nIk = new C68447NIk();
        Bundle bundle = new Bundle();
        bundle.putString("arg_composer_input_string", str);
        bundle.putBoolean("arg_is_group", z2);
        bundle.putBoolean("arg_is_e2ee", z3);
        bundle.putString("arg_thread_id", str2);
        bundle.putBoolean("arg_entered_from_icon", booleanValue);
        bundle.putInt("arg_initial_keyboard_height", i);
        nIk.setArguments(bundle);
        nIk.A0C = oDl;
        C331157Pu r12 = this.A00;
        if (r12 != null) {
            r12.A02(this.A02, nIk);
        }
    }

    public final void ESW(int i, int i2, int i3, int i4) {
    }

    public final void setBackgroundColor(int i) {
    }

    public final List D6U(ActionMode actionMode) {
        if (!182.A06(0Tu.A05, this.A03, 36323513380187352L)) {
            return 0sn.A00;
        }
        long length = (long) ((CharSequence) this.A06.invoke()).length();
        AnonymousClass7I3 r0 = this.A04;
        boolean z = this.A09;
        boolean z2 = this.A08;
        String str = this.A05;
        1Ln A0J = 1Ln.A0J(r0.A01);
        XSV A002 = AnonymousClass7I3.A00(z2, z);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(24);
            A0J.A0R("selected_item", "write_with_ai_tooltip");
            A0J.A0X(1);
            A0J.A0Q(Pxd.A00(42), Long.valueOf(length));
            A0J.A0M(A002, "thread_type");
            A0J.A0O("is_e2ee", Boolean.valueOf(z2));
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.Cgf();
        }
        String string = this.A0A.getResources().getString(2131958811);
        0qQ.A07(string);
        List singletonList = Collections.singletonList(new OCC(string, new C73590PgQ(this)));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final void EPw(Drawable drawable) {
        Fragment fragment;
        C331157Pu r3;
        C331157Pu r0 = this.A00;
        if (r0 != null && r0.A0S()) {
            C331157Pu r02 = this.A00;
            if (r02 != null) {
                fragment = r02.A03.A0M();
            } else {
                fragment = null;
            }
            if ((fragment instanceof C68447NIk) && (r3 = this.A00) != null) {
                C52854Gdn gdn = new C52854Gdn(this.A0A);
                BottomSheetFragment bottomSheetFragment = r3.A03;
                ViewGroup viewGroup = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup != null) {
                    viewGroup.setClipToOutline(true);
                }
                ViewGroup viewGroup2 = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup2 != null) {
                    viewGroup2.setOutlineProvider(gdn);
                }
                if (!bottomSheetFragment.isAdded() || bottomSheetFragment.mView == null) {
                    bottomSheetFragment.registerLifecycleListener(new C71934OtI(drawable, r3));
                    return;
                }
                ViewGroup viewGroup3 = bottomSheetFragment.bottomSheetContainer;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(drawable);
                }
            }
        }
    }
}
