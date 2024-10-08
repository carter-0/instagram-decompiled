package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.9rF  reason: invalid class name and case insensitive filesystem */
public final class C390419rF extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelsQuickSnapShareFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new MJ2(this, 16));
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new MJ2(this, 17));
    public final C41837B2s A02 = new WUP(this, 31);

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        File file = (File) this.A01.getValue();
        if (file == null) {
            return null;
        }
        Medium A03 = C282665Eg.A03(file, 3, 0);
        A03.A0J = true;
        RectF A04 = AnonymousClass7TH.A04(this);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0C(A002, this.A02, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        A002.A0B = 28D.A0O;
        A002.A0O = this;
        AnonymousClass80D.A02(A04, (RectF) null, A002);
        A002.A3y = true;
        AnonymousClass80D.A0A(A002);
        A002.A0P = A03;
        A002.A0w = null;
        A002.A2C = Long.valueOf(AnonymousClass7TE.A0R(this.A00.getValue()));
        A002.A3Q = true;
        return A002;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(62496587);
        super.onResume();
        File file = (File) this.A01.getValue();
        if (file == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(1482771439, A022);
    }
}
