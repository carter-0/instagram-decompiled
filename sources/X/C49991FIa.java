package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.FIa  reason: case insensitive filesystem */
public final class C49991FIa implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C49991FIa(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A02;
                VA1.A00(userSession).A08(AnonymousClass000.A00(1725), "view_appeal", this.A04, (String) null);
                SUL A0J = Dba.A0J((Context) this.A01, userSession, 2EG.A34, this.A03);
                A0J.A0S = AnonymousClass000.A00(5146);
                A0J.A0A();
                return;
            case 1:
                String str = this.A03;
                String str2 = this.A04;
                C11225SFz sFz = new C11225SFz(str);
                sFz.A02 = str2;
                SimpleWebViewActivity.A00((Context) this.A01, (0lg) this.A02, new SimpleWebViewConfig(sFz));
                return;
            default:
                C239413Gj.A04((Reel) this.A01, (C239413Gj) this.A02, this.A03);
                return;
        }
    }
}
