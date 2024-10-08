package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.Ab1  reason: case insensitive filesystem */
public final class C40368Ab1 implements C41819B1z {
    public AnonymousClass3Q2 A00;
    public final Context A01;
    public final UserSession A02;
    public final LD4 A03;
    public final DirectCameraViewModel A04;
    public final C381779cJ A05;
    public final A6R A06;
    public final C352218Cl A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final Object A0B = new Object();
    public final Set A0C = new LinkedHashSet();

    public final void A00(AnonymousClass3Q2 r4) {
        0qQ.A0B(r4, 0);
        synchronized (this.A0B) {
            this.A00 = r4;
            for (0sP invoke : this.A0C) {
                invoke.invoke(r4);
            }
        }
    }

    public final void A01(0sP r3) {
        synchronized (this.A0B) {
            this.A0C.add(r3);
            AnonymousClass3Q2 r0 = this.A00;
            if (r0 != null) {
                r3.invoke(r0);
            }
        }
    }

    public final String BNd() {
        return this.A08;
    }

    public final C39651A3r ELx(C53401GnY gnY, String str, boolean z) {
        AnonymousClass8KW.A00(this.A02).A00(this.A03.A00, this.A04, this.A05, Integer.valueOf(this.A07.A08), AnonymousClass05K.A1F, this.A08);
        A01(new C73949PmT(this, gnY, str, 22));
        return new C39651A3r("");
    }

    public C40368Ab1(Context context, UserSession userSession, LD4 ld4, DirectCameraViewModel directCameraViewModel, C381779cJ r6, A6R a6r, C352218Cl r8, String str, String str2, boolean z) {
        AnonymousClass7TG.A1O(context, userSession);
        0qQ.A0B(ld4, 5);
        AnonymousClass7TF.A1G(str, 7, str2);
        this.A01 = context;
        this.A02 = userSession;
        this.A07 = r8;
        this.A06 = a6r;
        this.A03 = ld4;
        this.A05 = r6;
        this.A09 = str;
        this.A0A = z;
        this.A08 = str2;
        this.A04 = directCameraViewModel;
    }
}
