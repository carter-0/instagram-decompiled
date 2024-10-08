package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.util.Either;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashSet;

/* renamed from: X.6xB  reason: invalid class name and case insensitive filesystem */
public final class C323246xB {
    public Either A00;
    public final FragmentActivity A01;
    public final 2Zg A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 25));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9LD(this, 26));
    public final UserSession A05;
    public final HashSet A06 = 0sc.A05(new String[]{"profile", "profile_fullname_screen", "liked_feed", "highlights_grid", "edit_profile", "clickable_category", "social_context_follow_list_fragment", "unified_follow_list", "hashtag_feed"});

    public C323246xB(FragmentActivity fragmentActivity, UserSession userSession, 2Zg r12) {
        0qQ.A0B(userSession, 3);
        this.A02 = r12;
        this.A01 = fragmentActivity;
        this.A05 = userSession;
    }

    public final void A00() {
        C309516Yo r0;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                AnonymousClass6W8 r1 = (AnonymousClass6W8) either.A00;
                if (r1 != null) {
                    r1.A0C(this.A01);
                }
            } else if ((!z) && (r0 = (C309516Yo) either.A01) != null) {
                r0.A04();
            }
        }
    }

    public final void A01() {
        C309516Yo r0;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                AnonymousClass6W8 r02 = (AnonymousClass6W8) either.A00;
                if (r02 != null) {
                    r02.A07();
                }
            } else if ((!z) && (r0 = (C309516Yo) either.A01) != null) {
                r0.A0E = true;
            }
        }
    }

    public final void A02() {
        C309516Yo r0;
        Either either = this.A00;
        if (either != null && (!either.A02) && (r0 = (C309516Yo) either.A01) != null) {
            r0.A0A = "EditProfileFragment.BACK_STACK_NAME";
        }
    }

    public final void A03(Fragment fragment, String str, boolean z) {
        Either either;
        Bundle bundle;
        String str2 = str;
        if ((((Boolean) this.A04.getValue()).booleanValue() || (((Boolean) this.A03.getValue()).booleanValue() && this.A06.contains(str))) && (bundle = fragment.mArguments) != null) {
            AnonymousClass6W8 r2 = new AnonymousClass6W8(this.A01, bundle, this.A05, ModalActivity.class, str2);
            if (z) {
                r2.A08();
            }
            either = new Either(r2, (Object) null, true);
        } else {
            C309516Yo r22 = new C309516Yo(this.A01, this.A05);
            r22.A0B((Bundle) null, fragment);
            if (z) {
                r22.A0F = true;
            }
            either = new Either((Object) null, r22, false);
        }
        this.A00 = either;
    }

    public final void A04(C267664bz r4) {
        C309516Yo r0;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                AnonymousClass6W8 r02 = (AnonymousClass6W8) either.A00;
                if (r02 != null) {
                    r02.A01 = r4;
                }
            } else if ((!z) && (r0 = (C309516Yo) either.A01) != null) {
                r0.A07 = r4;
            }
        }
    }

    public final void A05(String str) {
        C309516Yo r0;
        Either either = this.A00;
        if (either != null) {
            boolean z = either.A02;
            if (z) {
                AnonymousClass6W8 r02 = (AnonymousClass6W8) either.A00;
                if (r02 != null) {
                    r02.A05 = str;
                }
            } else if ((!z) && (r0 = (C309516Yo) either.A01) != null) {
                r0.A0B = str;
            }
        }
    }
}
