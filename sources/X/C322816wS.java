package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

/* renamed from: X.6wS  reason: invalid class name and case insensitive filesystem */
public final class C322816wS implements C322826wT {
    public int A00;
    public WeakReference A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass07Z A04;
    public final UserSession A05;
    public final 2aD A06;
    public final C294255m9 A07;
    public final boolean A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public final View AN7(ViewGroup viewGroup, String str, int i) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(str, 1);
        if (!this.A08 || this.A07 != C294255m9.A0B || !this.A0A) {
            C324826zy A002 = C324816zw.A00(viewGroup, str, i);
            this.A01 = new WeakReference(A002);
            AnonymousClass701 A003 = A00();
            A002.EHN(A003.A03);
            Context context = this.A03;
            Drawable drawable = context.getDrawable(A003.A01);
            if (drawable != null) {
                A002.setIcon(drawable);
            }
            String string = context.getString(this.A02);
            0qQ.A07(string);
            A002.setTitle(string);
            View view = A002.getView();
            view.setContentDescription(context.getResources().getString(A003.A00));
            A01(this);
            A002.setActiveIcon(context.getDrawable(A03()));
            return view;
        }
        2aD r3 = this.A06;
        Context context2 = viewGroup.getContext();
        View inflate = LayoutInflater.from(context2).inflate(R.layout.profile_badged_tab, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.notifications.badging.ui.component.ToastingBadge");
        ToastingBadge toastingBadge = (ToastingBadge) inflate;
        2eS.A03(toastingBadge, context2.getString(2131974924));
        toastingBadge.A01 = true;
        toastingBadge.setUseCase(r3);
        toastingBadge.setLifecycleOwner(this.A04);
        AnonymousClass701 A004 = A00();
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) toastingBadge.findViewById(R.id.profile_tab_icon_view);
        if (colorFilterAlphaImageView != null) {
            Context context3 = this.A03;
            colorFilterAlphaImageView.setImageDrawable(0ok.A02(context3.getDrawable(A004.A01), context3.getDrawable(A004.A02)));
            colorFilterAlphaImageView.setContentDescription(context3.getResources().getString(A004.A00));
            colorFilterAlphaImageView.setActiveColor(i);
        }
        return toastingBadge;
    }

    public final void DqE(boolean z) {
    }

    public final void DqF() {
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.701] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.701] */
    private final AnonymousClass701 A00() {
        int A022;
        int A032;
        int i;
        int ordinal = this.A07.ordinal();
        if (ordinal == 0) {
            A022 = A02();
            A032 = A03();
            i = 2131969976;
        } else if (ordinal != 1) {
            A022 = A02();
            A032 = A03();
            if (ordinal != 2) {
                i = 2131970064;
            } else {
                i = 2131969966;
            }
        } else {
            int A023 = A02();
            int A033 = A03();
            ? obj = new Object();
            obj.A01 = A023;
            obj.A02 = A033;
            obj.A00 = 2131970072;
            obj.A03 = true;
            return obj;
        }
        ? obj2 = new Object();
        obj2.A01 = A022;
        obj2.A02 = A032;
        obj2.A00 = i;
        obj2.A03 = false;
        return obj2;
    }

    public static final void A01(C322816wS r7) {
        C324826zy r1;
        WeakReference weakReference = r7.A01;
        if (weakReference != null && (r1 = (C324826zy) weakReference.get()) != null) {
            r1.setBadgeCount(r7.A00);
            if (!r7.A08 && C294255m9.A0B == r7.A07) {
                UserSession userSession = r7.A05;
                2aT A002 = 2aN.A00(userSession).A00();
                2aD r2 = r7.A06;
                int i = r7.A00;
                2aX r12 = new 2aX(r2, (List) null, i, i);
                AnonymousClass2g1 r0 = AnonymousClass2g1.PROFILE_MENU;
                C226252fx r4 = C226252fx.DOT;
                A002.A02(r4, r0, r12);
                2aV A012 = 2aN.A00(userSession).A01();
                2aD r13 = 2aD.A0b;
                int i2 = r7.A00;
                2aX r22 = new 2aX(r13, (List) null, i2, i2);
                AnonymousClass2g1 r14 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
                0qQ.A0B(r14, 0);
                A012.A02(new C239993Jd(r4, r14, (C71062aE) null, (Set) null), r22);
            }
        }
    }

    public final int A02() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return R.drawable.instagram_tag_up_pano_outline_24;
            }
            if (ordinal != 2) {
                return R.drawable.instagram_reshare_pano_outline_24;
            }
            return R.drawable.instagram_crown_pano_outline_24;
        } else if (this.A0B) {
            return R.drawable.instagram_photo_grid_tall_pano_outline_24;
        } else {
            return R.drawable.instagram_photo_grid_pano_outline_24;
        }
    }

    public final int A03() {
        int ordinal = this.A07.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return R.drawable.instagram_tag_up_pano_filled_24;
            }
            if (ordinal != 2) {
                return R.drawable.instagram_reshare_pano_filled_24;
            }
            return R.drawable.instagram_crown_pano_filled_24;
        } else if (this.A0B) {
            return R.drawable.instagram_photo_grid_tall_pano_filled_24;
        } else {
            return R.drawable.instagram_photo_grid_pano_filled_24;
        }
    }

    public final AnonymousClass723 AMg(boolean z) {
        UserSession userSession = this.A05;
        C294255m9 r5 = this.A07;
        String C3j = C3j();
        String str = this.A09;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putSerializable("ProfileMediaTabFragment.profile_tab_mode", r5);
        bundle.putSerializable("ProfileMediaTabFragment.profile_tab_identifier", C3j);
        bundle.putSerializable("ProfileMediaTabFragment.profile_source_media_id", str);
        ProfileMediaTabFragment profileMediaTabFragment = new ProfileMediaTabFragment();
        profileMediaTabFragment.setArguments(bundle);
        return profileMediaTabFragment;
    }

    public final String AbV() {
        return this.A07.A02;
    }

    public final String BMO() {
        return this.A07.A03;
    }

    public final C294255m9 BhJ() {
        return this.A07;
    }

    public final String C3j() {
        int ordinal = this.A07.ordinal();
        if (ordinal == 0) {
            return "profile_media_grid";
        }
        if (ordinal == 1) {
            return "profile_tagged_media_photos_of_you";
        }
        if (ordinal != 2) {
            return "profile_reposts";
        }
        return "profile_fan_club_grid";
    }

    public final String C3l() {
        int ordinal = this.A07.ordinal();
        if (ordinal == 0) {
            return "tap_grid_tab";
        }
        if (ordinal == 1) {
            return "tap_tagged_photos";
        }
        if (ordinal != 2) {
            return "tap_repost_grid";
        }
        return "tap_fan_club_tab";
    }

    public final void DqL(boolean z) {
        if (C294255m9.A0B != this.A07) {
            return;
        }
        if (!this.A08 || !this.A0A) {
            UserSession userSession = this.A05;
            2aT A002 = 2aN.A00(userSession).A00();
            2aD r2 = this.A06;
            int i = this.A00;
            2aX r1 = new 2aX(r2, (List) null, i, i);
            AnonymousClass2g1 r0 = AnonymousClass2g1.PROFILE_MENU;
            C226252fx r4 = C226252fx.DOT;
            A002.A01(r4, r0, r1);
            2aV A012 = 2aN.A00(userSession).A01();
            2aD r12 = 2aD.A0b;
            int i2 = this.A00;
            2aX r22 = new 2aX(r12, (List) null, i2, i2);
            AnonymousClass2g1 r13 = AnonymousClass2g1.TOP_NAVIGATION_BAR;
            0qQ.A0B(r13, 0);
            A012.A03(new C239993Jd(r4, r13, (C71062aE) null, (Set) null), r22, false);
            return;
        }
        C71082aO A003 = 2aN.A00(this.A05);
        2aD r14 = this.A06;
        0qQ.A0B(r14, 0);
        ((C71132ar) A003).A00.A02(r14);
    }

    public C322816wS(Context context, AnonymousClass07Z r6, UserSession userSession, C294255m9 r8, String str, int i, boolean z) {
        2aD r0;
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = i;
        this.A07 = r8;
        this.A0A = z;
        this.A09 = str;
        this.A04 = r6;
        2aZ A022 = 2aN.A00(userSession).A02();
        this.A08 = A022.A00();
        UserSession userSession2 = A022.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession2, 36310667132666077L)) {
            r0 = 2aD.A0o;
        } else {
            r0 = 2aD.A0a;
        }
        this.A06 = r0;
        this.A0B = 182.A06(r2, userSession, 36327438980037052L);
    }
}
