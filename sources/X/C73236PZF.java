package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.PZF  reason: case insensitive filesystem */
public final class C73236PZF implements Runnable {
    public final /* synthetic */ O7O A00;
    public final /* synthetic */ String A01;

    public C73236PZF(O7O o7o, String str) {
        this.A00 = o7o;
        this.A01 = str;
    }

    public final void run() {
        O7O o7o = this.A00;
        String str = this.A01;
        C71874OsH osH = o7o.A00;
        if (osH.A02.A02 != null) {
            C72208OyY oyY = osH.A0F;
            OO3 oo3 = oyY.A01;
            if (oo3 != null) {
                0Aj A0e = AnonymousClass7TE.A0e(oo3.A0E, "messaging_ai_agent_feedback");
                if (A0e.isSampled()) {
                    0bb r2 = new 0bb();
                    r2.A01(C69430Nla.IGD_UNIVERSAL_SEARCH, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    AnonymousClass7TE.A1W(A0e, "action_type", 1);
                    AnonymousClass7TE.A1W(A0e, "view_name", 35);
                    A0e.AAK(r2, "feedback");
                    A0e.Cgf();
                }
            }
            oyY.A05(7);
            oyY.A05(6);
            C72918PPc pPc = osH.A02;
            int A02 = pPc.A0P.A02(pPc.A02);
            C72918PPc pPc2 = osH.A02;
            pPc2.A02.A00 = true;
            pPc2.A07 = str;
            pPc2.A0P.notifyItemChanged(A02);
        }
    }
}
