package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class NL0 extends C331047Ph {
    public ImageUrl A00;
    public String A01;
    public final C68510NLh A02;
    public final C68511NLi A03;
    public final C68508NLf A04;
    public final List A05 = AnonymousClass7TE.A1C();

    public NL0(Context context, AnonymousClass0iw r6) {
        C68510NLh nLh = new C68510NLh(context, r6);
        this.A02 = nLh;
        C68508NLf nLf = new C68508NLf(context);
        this.A04 = nLf;
        C68511NLi nLi = new C68511NLi(context, (UserSession) null);
        this.A03 = nLi;
        A0B(nLh, nLf, nLi);
    }
}
