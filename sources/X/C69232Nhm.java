package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Nhm  reason: case insensitive filesystem */
public final class C69232Nhm extends C68505NKy {
    public User A00;
    public NHU A01;
    public final Context A02;
    public final AnonymousClass2s2 A03;
    public final UserSession A04;
    public final C68510NLh A05;
    public final C68507NLe A06;
    public final C68511NLi A07;
    public final C68508NLf A08;
    public final NLa A09;
    public final C68513NLk A0A;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.2s0, X.2s2, java.lang.Object] */
    public C69232Nhm(Context context, AnonymousClass0iw r10, UserSession userSession, NKY nky, NKY nky2, C74435Pup pup) {
        this.A02 = context;
        this.A04 = userSession;
        C68510NLh nLh = new C68510NLh(context, r10);
        this.A05 = nLh;
        C68508NLf nLf = new C68508NLf(context);
        this.A08 = nLf;
        C68511NLi nLi = new C68511NLi(context, (UserSession) null);
        this.A07 = nLi;
        C68507NLe nLe = new C68507NLe(context, nky);
        this.A06 = nLe;
        C68513NLk nLk = new C68513NLk(context, userSession, pup);
        this.A0A = nLk;
        ? obj = new Object();
        this.A03 = obj;
        NLa nLa = new NLa(context, C69327NjS.CUSTOM_LIST_ITEM, nky2);
        this.A09 = nLa;
        A0B(nLh, nLf, nLi, nLe, nLk, obj, nLa);
    }
}
