package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.Es1  reason: case insensitive filesystem */
public abstract class C49258Es1 {
    public static final void A00(Context context, FA0 fa0, C49719F3f f3f, FoaUserSession foaUserSession, Object obj) {
        int i;
        Fragment uYe;
        FoaUserSession foaUserSession2 = foaUserSession;
        AnonymousClass7TG.A1N(context, foaUserSession2);
        Object obj2 = obj;
        0qQ.A0B(obj2, 4);
        C49684F1u f1u = (C49684F1u) ((IgMetaSessionImpl) foaUserSession2).A00.A01(C49684F1u.class, C51777G1m.A00);
        0qQ.A07(f1u);
        C49719F3f f3f2 = f3f;
        C51892G6h A00 = f1u.A00(context, f3f2, obj2);
        A00.E3m();
        FragmentActivity A002 = C46604Dhk.A00(context);
        if (A002 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = A002;
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                0KC.A0D("IgCdsBottomSheetNavigator", "Activity is finishing or destroyed, not launching CDS bottom sheet fragment");
                return;
            }
            C46471DfZ dfZ = fa0.A00;
            UserSession A003 = C56316HwT.A00(foaUserSession2);
            Integer num = dfZ.A0G;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 32;
            }
            C49720F3h f3h = new C49720F3h(A00, f3f2, foaUserSession2, obj2, i);
            boolean A06 = 182.A06(0Tu.A05, A003, 2342167162543812439L);
            Bundle A0a = AnonymousClass7TE.A0a();
            DbW.A0w(A0a, A003);
            A0a.putBundle(AnonymousClass000.A00(542), dfZ.A00());
            A0a.putInt(AnonymousClass000.A00(1216), C14615TzM.A00(f3h));
            A0a.putString("cds_platform", "Native");
            A0a.putString("dark_mode_config", C46642DiN.A01(dfZ.A0F));
            if (A06) {
                uYe = new C14557TyM();
            } else {
                uYe = new C15264UYe();
            }
            uYe.setArguments(A0a);
            if (dfZ.A0E == C46626Di6.FULL_SCREEN) {
                C309516Yo A0M = DbS.A0M(fragmentActivity, A003);
                A0M.A0B((Bundle) null, uYe);
                A0M.A0G = true;
                A0M.A04();
                return;
            }
            0hq A0F = DbT.A0F(fragmentActivity);
            try {
                if (!A0F.A12()) {
                    0s1 r0 = new 0s1(A0F);
                    r0.A0I((String) null);
                    ((0SM) uYe).A0C(r0, (String) null);
                }
            } catch (IllegalStateException e) {
                0KC.A0H("IgCdsBottomSheetNavigator", "Failed to open bottom sheet", e);
            }
        } else {
            throw AnonymousClass7TE.A0z("Unable to launch CDS bottom sheet fragment without FragmentActivity!");
        }
    }
}
