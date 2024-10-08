package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class I4M {
    public C241293Oq A00;
    public C55680Hld A01;
    public String A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final C55563Hjj A0D;
    public final FragmentActivity A0E;

    public final void A02(String str) {
        if (00l.A0d(str, this.A02, false)) {
            this.A08 = true;
            if (this.A03 && !this.A05) {
                GBE gbe = this.A0D.A00.A09;
                if (gbe == null) {
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                gbe.A1K.A0N((C267324bN) null, "fragment_paused", false, true);
                this.A05 = true;
            }
        }
    }

    public static final void A01(C241293Oq r7, I4M i4m) {
        Object obj = new Object();
        C310336ap A0a = DbS.A0a();
        Context context = i4m.A0A;
        A0a.A0D = DbW.A0h(context, r7.CCd().getUsername(), 2131955471);
        A0a.A09 = r7.CCd().Bh3();
        A0a.A0B(C310356ar.CIRCULAR);
        DbW.A0q(context, A0a, 2131955472);
        A0a.A06();
        A0a.A0A(new IVU(5, obj, i4m, r7));
        A0a.A0L = true;
        Dbb.A1Q(A0a);
        i4m.A04 = true;
        if (i4m.A09) {
            i4m.A09 = false;
        }
    }

    public I4M(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession, C55563Hjj hjj) {
        AnonymousClass7TG.A1O(userSession, r4);
        this.A0C = userSession;
        this.A0B = r4;
        this.A0A = context;
        this.A0E = fragmentActivity;
        this.A0D = hjj;
    }

    public static final void A00(C241293Oq r4, UserSession userSession, I4M i4m) {
        1a1 A022 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(userSession, r4.CCd().getId(), "clips_follow_prompt", i4m.A0B.getModuleName());
        A012.A0i = true;
        Dbb.A11(A022.A02(userSession, A012.A04()), i4m.A0E, userSession);
    }
}
