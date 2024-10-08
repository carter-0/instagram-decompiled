package X;

import android.content.Context;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.P1b  reason: case insensitive filesystem */
public final class C72310P1b implements C74543Pwc {
    public final Context A00;
    public final boolean A01;

    public final 0eP Bqn(N40 n40) {
        C61169JyL jyL;
        ArrayList A0q = AnonymousClass7TF.A0q(n40, 0);
        if (n40.A06) {
            jyL = new C61169JyL((Context) null, (C63593Kzg) null, C69300Nj1.CUTOUT_STICKER_SEE_MORE, false, 2131960380, 2131960277, false);
        } else {
            jyL = new C61169JyL((Context) null, (C63593Kzg) null, C69300Nj1.AVATAR_EDIT, false, (Integer) null, 2131960277, false);
        }
        List<C61077JwF> list = n40.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C61077JwF jwF : list) {
            A0r.add(new C68185N5a((C317966o8) jwF.A00));
        }
        A0q.addAll(A0r);
        return AnonymousClass7TE.A1L(jyL, A0q);
    }

    public final boolean Erk(N40 n40) {
        0qQ.A0B(n40, 0);
        if (!this.A01 || !AnonymousClass7TE.A1b(n40.A02)) {
            return false;
        }
        return true;
    }

    public final C61072JwA BDn(int i) {
        return C66584MXp.A0G(AnonymousClass05K.A01, AnonymousClass05K.A0C, this.A00.getString(2131960277), R.drawable.instagram_sticker_pano_outline_24, i);
    }

    public C72310P1b(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
