package X;

import android.graphics.Bitmap;
import com.instagram.user.model.User;

/* renamed from: X.AXq  reason: case insensitive filesystem */
public final class C40252AXq implements AnonymousClass1MK {
    public final User A00;
    public final String A01;
    public final /* synthetic */ C39964ALg A02;

    public final void CyF(C226952iF r9, AnonymousClass3LX r10) {
        char A1U = AnonymousClass7TF.A1U(0, r9, r10);
        C39964ALg aLg = this.A02;
        if (aLg.A09 == this.A00) {
            Bitmap bitmap = r10.A01;
            if (bitmap == null) {
                DJx(r9, (C254673sr) null);
                return;
            }
            Object C3s = r9.C3s();
            0qQ.A0C(C3s, "null cannot be cast to non-null type kotlin.Int");
            aLg.A0B[AnonymousClass7TE.A0M(C3s)] = new C61076JwE(this.A01, bitmap);
            C61076JwE[] jwEArr = aLg.A0B;
            if (jwEArr[0] != null && jwEArr[A1U] != null && jwEArr[2] != null) {
                aLg.A0M.E3H(new AnonymousClass8TR(C39964ALg.A00(aLg)));
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C40252AXq(C39964ALg aLg, User user, String str) {
        this.A02 = aLg;
        this.A00 = user;
        this.A01 = str;
    }

    public final void DJx(C226952iF r5, C254673sr r6) {
        C39964ALg aLg = this.A02;
        if (aLg.A09 == this.A00) {
            aLg.A0B = new C61076JwE[3];
            aLg.A0M.E3H(new AnonymousClass8TR(C39964ALg.A00(aLg)));
        }
    }
}
