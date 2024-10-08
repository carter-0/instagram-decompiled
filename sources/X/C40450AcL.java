package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.AcL  reason: case insensitive filesystem */
public final class C40450AcL implements MV8 {
    public final Context A00;
    public final UserSession A01;
    public final C331697Sa A02;
    public final boolean A03;
    public final boolean A04;

    public final void Dkp(Medium medium, String str) {
    }

    public final AnonymousClass8XO B8p() {
        if (this.A04) {
            return AnonymousClass8XO.PHOTO_AND_VIDEO;
        }
        return AnonymousClass8XO.PHOTO_ONLY;
    }

    public final void CnJ() {
        UserSession userSession = this.A01;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        String A002 = C66579MXk.A00(323);
        if (!A0q.getBoolean(A002, false) && this.A03) {
            0xY A0N = AnonymousClass7TF.A0N(userSession);
            A0N.E5T(A002, true);
            A0N.apply();
            C49951FGg.A03(this.A00, userSession);
        }
    }

    public final void Dio(int i) {
        C274644oo r2;
        int i2;
        List A1P;
        if (182.A06(0Tu.A05, this.A01, 36320489722880496L)) {
            AnonymousClass7TI A012 = AnonymousClass9H7.A01(this.A02.A00);
            if (i == 1) {
                r2 = A012.A0A;
                if (r2 != null) {
                    i2 = 21;
                }
                0qQ.A0F("messageListAdapterHolder");
                throw AnonymousClass00P.createAndThrow();
            }
            r2 = A012.A0A;
            if (i >= 4) {
                if (r2 != null) {
                    A1P = 0sr.A1P(new Integer[]{93, 188});
                    r2.E3j(A1P);
                }
            } else if (r2 != null) {
                i2 = 92;
            }
            0qQ.A0F("messageListAdapterHolder");
            throw AnonymousClass00P.createAndThrow();
            A1P = AnonymousClass7TE.A1I(Integer.valueOf(i2));
            r2.E3j(A1P);
        }
    }

    public C40450AcL(Context context, UserSession userSession, C331697Sa r3, boolean z, boolean z2) {
        AnonymousClass7TG.A1P(context, r3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = z2;
    }
}
