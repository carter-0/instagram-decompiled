package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Ld1  reason: case insensitive filesystem */
public final class C64500Ld1 implements C66521MUz {
    public ImageUrl A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final Reel A04;
    public final String A05;
    public final boolean A06;

    public final ImageUrl Arz(Context context) {
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            return imageUrl;
        }
        return JZV.A03(context, this.A03, this.A05, this.A06);
    }

    public final void D6m(InlineAddHighlightFragment inlineAddHighlightFragment, AnonymousClass4D6 r5, String str) {
        AnonymousClass8VR.A00(this.A03).A00 = C64133LPh.A00(str, Ki3.CREATE_STORY_LONG_PRESS.A00, this.A02, this.A01);
        JTU.A0o(inlineAddHighlightFragment);
    }

    public final void DOL(C322126vI r4, List list) {
        Reel reel = this.A04;
        list.add(0, reel);
        r4.Ei9(list, false, this.A03);
        r4.A08(reel.getId());
    }

    public final void DcI(Fragment fragment, AnonymousClass4D6 r5, String str, boolean z) {
        if (!str.equals(this.A04.getId())) {
            String str2 = Ki3.CREATE_STORY_LONG_PRESS.A00;
            0qQ.A0B(str2, 1);
            AnonymousClass8VR.A00(this.A03).A00 = C64133LPh.A01(str, (String) null, str2, true);
            JTU.A0o(fragment);
        }
    }

    public C64500Ld1(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        this.A03 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A06 = z;
        if (!182.A06(0Tu.A05, userSession, 36323436070448286L)) {
            this.A00 = JZV.A03(context, userSession, str, z);
        }
        1OP r0 = 1OP.$redex_init_class;
        0qQ.A0B(userSession, 0);
        Reel reel = 1O2.A00(userSession).A00;
        0qQ.A0A(reel);
        this.A04 = reel;
    }
}
