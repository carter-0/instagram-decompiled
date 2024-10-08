package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ld0  reason: case insensitive filesystem */
public final class C64499Ld0 implements C66521MUz {
    public ImageUrl A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final String A04;
    public final boolean A05;

    public final ImageUrl Arz(Context context) {
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            return imageUrl;
        }
        return JZV.A03(context, this.A03, this.A04, this.A05);
    }

    public final void D6m(InlineAddHighlightFragment inlineAddHighlightFragment, AnonymousClass4D6 r7, String str) {
        AnonymousClass8VT A002 = C64133LPh.A00(str, Ki3.DIRECT_RECIPIENT_PICKER.A00, this.A02, this.A01);
        UserSession userSession = this.A03;
        LQZ A003 = LQZ.A00(userSession);
        synchronized (A003) {
            A003.A05.add(A002.A01);
            if (A003.A01 == null) {
                A003.A03.add(A002);
            } else {
                LQZ.A02(A003, A002);
            }
        }
        AnonymousClass8VR.A00(userSession).A00 = A002;
        JTU.A0o(inlineAddHighlightFragment);
    }

    public final void DOL(C322126vI r3, List list) {
        UserSession userSession = this.A03;
        r3.Ei9(list, false, userSession);
        Iterator A0h = JTQ.A0h(LQZ.A00(userSession).A04);
        while (A0h.hasNext()) {
            r3.A08(AnonymousClass7TE.A18(A0h));
        }
    }

    public final void DcI(Fragment fragment, AnonymousClass4D6 r9, String str, boolean z) {
        UserSession userSession = this.A03;
        Reel A0L = Dba.A0L(userSession, str);
        A0L.getClass();
        AnonymousClass8VT A012 = C64133LPh.A01(str, A0L.A0r, Ki3.DIRECT_RECIPIENT_PICKER.A00, !z);
        LQZ A002 = LQZ.A00(userSession);
        Context requireContext = fragment.requireContext();
        synchronized (A002) {
            boolean z2 = A012.A04;
            if (z2) {
                A002.A04.add(A012.A00);
                A002.A05.add(A012.A01);
            } else {
                A002.A04.remove(A012.A00);
                A002.A05.remove(A012.A01);
            }
            if (A002.A01 != null) {
                LQZ.A01(requireContext, A002, A012);
            } else if (z2) {
                A002.A02.add(A012);
            } else {
                A002.A02.remove(A012);
            }
        }
        AnonymousClass8VR.A00(userSession).A00 = A012;
        JTU.A0o(fragment);
    }

    public C64499Ld0(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        this.A03 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A05 = z;
        if (!182.A06(0Tu.A05, userSession, 36323436070448286L)) {
            this.A00 = JZV.A03(context, userSession, str, z);
        }
    }
}
