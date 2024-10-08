package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ll8  reason: case insensitive filesystem */
public final class C64969Ll8 implements MXG, C66441MRv {
    public static final String __redex_internal_original_name = "AvatarStickerPickerController";
    public View A00;
    public final Context A01;
    public final Fragment A02;
    public final 0hq A03;
    public final UserSession A04;
    public final AnonymousClass8MH A05;
    public final C60186Jh5 A06;
    public final List A07 = AnonymousClass7TE.A1C();
    public final C62320sa A08;
    public final View A09;
    public final Integer A0A;
    public final Set A0B = DbS.A0y();
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public C64969Ll8(Context context, View view, Fragment fragment, UserSession userSession, AnonymousClass8MH r8, C62320sa r9, C62320sa r10, C62320sa r11, C62320sa r12) {
        AnonymousClass7TF.A1G(r10, 8, r11);
        this.A01 = context;
        this.A04 = userSession;
        this.A02 = fragment;
        this.A09 = view;
        this.A05 = r8;
        this.A0E = r9;
        this.A08 = r10;
        this.A0C = r11;
        this.A0D = r12;
        0hq childFragmentManager = fragment.getChildFragmentManager();
        0qQ.A07(childFragmentManager);
        this.A03 = childFragmentManager;
        this.A06 = JTO.A0L(new C61523KBc(userSession), fragment.requireActivity()).A00(C60186Jh5.class);
        this.A0A = AnonymousClass05K.A1F;
        Fragment fragment2 = this.A02;
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = fragment2.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH4(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 40), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final Set Acf() {
        return this.A0B;
    }

    public final Integer Aci() {
        return this.A0A;
    }

    public final boolean CII() {
        List list = this.A07;
        if (list.size() <= 1) {
            return false;
        }
        list.remove(C51966G9m.A06(list));
        0hq r0 = this.A03;
        r0.A13();
        0s1 r1 = new 0s1(r0);
        r1.A0N((Fragment) list.get(C51966G9m.A06(list)));
        r1.A00();
        return true;
    }

    public final void E0h() {
        if (this.A00 == null) {
            View A0H = JTP.A0H(JTR.A0X(this.A09, R.id.avatar_sticker_picker_stub), R.layout.avatar_picker_grid_layout_v2);
            Set set = this.A0B;
            set.clear();
            0qQ.A0A(A0H);
            set.add(A0H);
            this.A00 = A0H;
        }
        K3R A002 = C63127Krv.A00("stories_avatar_sticker_picker_grid", (String) this.A0E.invoke(), (List) this.A0C.invoke(), false, C51971G9r.A1b(this.A0D));
        this.A07.add(A002);
        0s1 r1 = new 0s1(this.A03);
        r1.A09(A002, R.id.avatar_sticker_grid_container);
        r1.A01();
    }

    public final void close() {
        List<Fragment> list = this.A07;
        for (Fragment A0q : list) {
            JTU.A0q(A0q, this.A03);
        }
        list.clear();
    }

    public final String getModuleName() {
        return "stories_avatar_sticker_picker_grid";
    }

    public final boolean isScrolledToBottom() {
        List list = this.A07;
        Object obj = list.get(C51970G9q.A0A(list));
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.avatars.stickergrid.AvatarStickerPickerScrollHandler");
        return C2808154f.A04(((C61364K4g) ((C66388MPu) obj)).A07());
    }

    public final boolean isScrolledToTop() {
        List list = this.A07;
        Object obj = list.get(C51970G9q.A0A(list));
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.avatars.stickergrid.AvatarStickerPickerScrollHandler");
        return C2808154f.A05(((C61364K4g) ((C66388MPu) obj)).A07());
    }
}
