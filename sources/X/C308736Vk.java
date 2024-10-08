package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.List;

/* renamed from: X.6Vk  reason: invalid class name and case insensitive filesystem */
public final class C308736Vk implements AnonymousClass3CG {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C308776Vo A03;
    public final boolean A04;
    public final int A05;

    public final int BU3() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ void DMH(Object obj, int i) {
        AnonymousClass6UO r9;
        IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf;
        int i2;
        C250973mM r15 = (C250973mM) obj;
        0qQ.A0B(r15, 0);
        UserSession userSession = this.A02;
        List A002 = C250973mM.A00(userSession, r15);
        int size = A002.size();
        int i3 = this.A00;
        int i4 = size;
        if (size > i3) {
            i4 = i3;
        }
        int i5 = r15.A0H.A00;
        if (!this.A04 && i5 != 0 && i4 > (i2 = i5 + 1)) {
            i4 = i2;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            1Xj r0 = ((C255773uh) A002.get(i6)).A0b;
            if (r0 != null) {
                if (size > 1) {
                    r9 = AnonymousClass6UO.STORIES_CAROUSEL_FORMAT;
                } else {
                    r9 = AnonymousClass6UO.STORIES_SINGLE_MEDIA_FORMAT;
                }
                if (r0.A66()) {
                    igShowreelNativeAnimationIntf = r0.A0C.BwB();
                    if (igShowreelNativeAnimationIntf == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    1Xj A1b = r0.A1b();
                    if (!A1b.A66()) {
                        continue;
                    } else {
                        igShowreelNativeAnimationIntf = A1b.A0C.BwB();
                        if (igShowreelNativeAnimationIntf == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                Context context = this.A01;
                C308776Vo r8 = this.A03;
                0nY.A00().ATE(new C52506GVj(context, userSession, new AnonymousClass6Q6(C231122qu.A07(userSession, r0), r0.A2v()), igShowreelNativeAnimationIntf, r8, r9, i6, size, i5, i4));
            }
        }
    }

    public C308736Vk(Context context, UserSession userSession, C308776Vo r3, int i, int i2, boolean z) {
        this.A02 = userSession;
        this.A01 = context;
        this.A05 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A03 = r3;
    }
}
