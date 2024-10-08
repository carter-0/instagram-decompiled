package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;

/* renamed from: X.LXl  reason: case insensitive filesystem */
public final class C64259LXl implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass818 A00;
    public final /* synthetic */ AnonymousClass819 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C311396cc A04;
    public final /* synthetic */ C311376ca A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public C64259LXl(AnonymousClass818 r1, AnonymousClass819 r2, UserSession userSession, C255773uh r4, C311396cc r5, C311376ca r6, boolean z, boolean z2) {
        this.A02 = userSession;
        this.A00 = r1;
        this.A03 = r4;
        this.A07 = z;
        this.A01 = r2;
        this.A06 = z2;
        this.A05 = r6;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        LinkedHashMap linkedHashMap;
        PromptStickerModel A0K;
        int A052 = AnonymousClass0fD.A05(-1712220303);
        String A0n = C51972G9s.A0n();
        UserSession userSession = this.A02;
        AnonymousClass818 r6 = this.A00;
        String str = r6.A00;
        String A0g = AnonymousClass7TF.A0g(userSession);
        C255773uh r5 = this.A03;
        if (r5 == null || (A0K = r5.A0K()) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = A0K.A06();
        }
        C63394KwF.A00(userSession, "primary_click", str, A0g, A0n, linkedHashMap);
        if (this.A07) {
            C64029LJs.A01(userSession, AnonymousClass000.A00(1702), "share_later", A0n);
        }
        AnonymousClass819 r3 = this.A01;
        C368278sM r2 = C368278sM.ACCEPT;
        AnonymousClass81A A0O = JTO.A0O();
        A0O.A0A(Boolean.valueOf(this.A06));
        C368288sN.A00(r6, r2, r3, A0O, userSession);
        this.A05.DkA(r5, A0n);
        C311396cc r0 = this.A04;
        if (r0 != null) {
            r0.D5S();
        }
        AnonymousClass0fD.A0C(282582171, A052);
    }
}
