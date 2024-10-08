package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.85r  reason: invalid class name and case insensitive filesystem */
public final class C3506685r {
    public String A00;
    public final C3506885u A01;
    public final C3507185x A02;
    public final AnonymousClass861 A03;
    public final C234462xu A04;
    public final AnonymousClass85s A05;
    public final AnonymousClass85q A06;

    public final C3506785t A02() {
        C3506885u r1 = this.A01;
        boolean z = r1.A02;
        C315536k3 r12 = r1;
        if (!z) {
            r12 = this.A05;
        }
        return (C3506785t) r12;
    }

    public C3506685r(Context context, Fragment fragment, UserSession userSession, C234462xu r11, AnonymousClass85q r12) {
        this.A04 = r11;
        this.A06 = r12;
        this.A05 = new AnonymousClass85s(context, userSession, (AnonymousClass4DU) null, r11, r12);
        this.A01 = new C3506885u(context, userSession, r11);
        FragmentActivity requireActivity = fragment.requireActivity();
        this.A02 = new 2YN(new C3507085w(userSession, requireActivity), requireActivity).A00(C3507185x.class);
        AnonymousClass861 A002 = new 2YN(requireActivity).A00(AnonymousClass860.class).A00("post_capture");
        this.A03 = A002;
        A002.A05.A06(fragment, new AnonymousClass868(new C377149Ks(this, 9)));
    }

    public static final void A00(Drawable drawable, C3506685r r10) {
        int i;
        int i2;
        int i3;
        MusicOverlayStickerModel A022 = C271404in.A02(drawable);
        r10.A00 = A022.A0l;
        C3506785t A023 = r10.A02();
        MusicDataSource A002 = C59670JTa.A00(A022);
        Integer num = A022.A0K;
        int i4 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = A022.A0O;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        C3506785t A024 = r10.A02();
        if (!(0qQ.A0K(A002, A024.BUq()) && i == A024.BV2() && i2 == A024.BV1())) {
            A023.Edj(C59670JTa.A00(A022), false);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            A023.Edo(i3);
            if (num2 != null) {
                i4 = num2.intValue();
            }
            A023.Edn(i4);
        }
        if (!A023.isPlaying()) {
            A023.E2p();
        }
    }

    public static final void A01(C3506685r r1) {
        r1.A02().release();
        AnonymousClass85q r12 = r1.A06;
        if (r12 instanceof C3506585p) {
            ((C3506585p) r12).A00 = -1;
        }
    }
}
