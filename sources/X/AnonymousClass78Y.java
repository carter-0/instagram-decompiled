package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.78Y  reason: invalid class name */
public abstract class AnonymousClass78Y extends AnonymousClass78R {
    public final Integer A00;

    public final void A00() {
        UserSession userSession;
        Activity activity;
        1ps r5;
        ViewGroup viewGroup;
        1ps A002;
        UserSession userSession2;
        Activity activity2;
        if (this instanceof AnonymousClass78X) {
            AnonymousClass78X r1 = (AnonymousClass78X) this;
            if (!AnonymousClass9B8.A07(r1.userSession)) {
                A002 = AnonymousClass9B9.A00();
                userSession2 = r1.userSession;
                activity2 = r1.A01;
            } else if (!r1.A00) {
                boolean A02 = C331227Qb.A02(r1.userSession);
                r1.A00 = A02;
                if (!A02) {
                    r5 = AnonymousClass9B9.A00();
                    userSession = r1.userSession;
                    activity = r1.A01;
                    r5.A01(activity, C69503Nml.A05, userSession, (AnonymousClass7JY) null, false, false);
                    return;
                }
                return;
            } else {
                return;
            }
        } else if (this instanceof C3267678b) {
            C3267678b r12 = (C3267678b) this;
            if (!AnonymousClass9B8.A07(r12.userSession)) {
                A002 = AnonymousClass9B9.A00();
                userSession2 = r12.userSession;
                activity2 = r12.A01;
            } else if (!r12.A00) {
                boolean A022 = C331227Qb.A02(r12.userSession);
                r12.A00 = A022;
                if (!A022) {
                    r5 = AnonymousClass9B9.A00();
                    userSession = r12.userSession;
                    activity = r12.A01;
                    r5.A01(activity, C69503Nml.A05, userSession, (AnonymousClass7JY) null, false, false);
                    return;
                }
                return;
            } else {
                return;
            }
        } else {
            C3267878d r4 = (C3267878d) this;
            if (!AnonymousClass9B8.A07(r4.userSession)) {
                A002 = AnonymousClass9B9.A00();
                userSession2 = r4.userSession;
                activity2 = r4.A01;
            } else if (!r4.A00) {
                boolean A023 = C331227Qb.A02(r4.userSession);
                r4.A00 = A023;
                if (!A023) {
                    UserSession userSession3 = r4.userSession;
                    0Tu r3 = 0Tu.A05;
                    if (Boolean.valueOf(182.A06(r3, userSession3, 36320438186025419L)).booleanValue()) {
                        AnonymousClass9B9.A00();
                        UserSession userSession4 = r4.userSession;
                        Activity activity3 = r4.A01;
                        C69503Nml nml = C69503Nml.A05;
                        C62320sa r42 = r4.A02;
                        0qQ.A0B(userSession4, 0);
                        NIU niu = new NIU();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, nml);
                        niu.setArguments(bundle);
                        C331127Pr r13 = new C331127Pr(userSession4);
                        r13.A0v = true;
                        r13.A0U = new C72951PQj(niu, r42);
                        C331157Pu A024 = r13.A00().A02(activity3, niu);
                        if (A024 != null && (viewGroup = A024.A03.titleAndNavContainer) != null) {
                            viewGroup.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    boolean booleanValue = Boolean.valueOf(182.A06(r3, r4.userSession, 36329367420420166L)).booleanValue();
                    r5 = AnonymousClass9B9.A00();
                    if (booleanValue) {
                        r5.A02(r4.A01, r4.userSession, C69503Nml.A05.toString(), (C62320sa) null);
                        return;
                    }
                    userSession = r4.userSession;
                    activity = r4.A01;
                    r5.A01(activity, C69503Nml.A05, userSession, (AnonymousClass7JY) null, false, false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        A002.A00(activity2, C69503Nml.A05, userSession2);
    }

    public AnonymousClass78Y(Context context, UserSession userSession, AnonymousClass7OR r3, String str, AnonymousClass7OS r5, Integer num, int i, AnonymousClass78U r8, Integer num2) {
        super(context, userSession, r3, str, r5, num, i, r8);
        this.A00 = num2;
    }
}
