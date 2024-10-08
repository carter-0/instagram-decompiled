package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.KXj  reason: case insensitive filesystem */
public final class C62043KXj extends C65614Lwp {
    public final Context A00;
    public final AnonymousClass07i A01;
    public final UserSession A02;
    public final C336227eH A03;
    public final View A04;
    public final IgdsInlineSearchBox A05;
    public final K9H A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62043KXj(Context context, View view, AnonymousClass07i r11, UserSession userSession, IgdsInlineSearchBox igdsInlineSearchBox, C336227eH r14, K9H k9h) {
        super(context, view, r11, userSession, igdsInlineSearchBox, k9h, (String) null);
        C51974G9v.A1M(userSession, igdsInlineSearchBox, view);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = igdsInlineSearchBox;
        this.A04 = view;
        this.A01 = r11;
        this.A06 = k9h;
        this.A03 = r14;
    }
}
