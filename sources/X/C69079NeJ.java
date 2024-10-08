package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NeJ  reason: case insensitive filesystem */
public final class C69079NeJ extends C69081NeL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewGroup A08;
    public final C71111Ocu A09;
    public final PM7 A0A;
    public final AnonymousClass0eM A0B;
    public final boolean A0C;
    public final FragmentActivity A0D;
    public final UserSession A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69079NeJ(ViewGroup viewGroup, FragmentActivity fragmentActivity, UserSession userSession, C71111Ocu ocu) {
        super(DbS.A0z(N9M.class));
        boolean A1Y = DbW.A1Y(ocu);
        this.A0E = userSession;
        this.A09 = ocu;
        this.A0D = fragmentActivity;
        this.A08 = viewGroup;
        AnonymousClass0eM A002 = C73895PlW.A00(this, 9);
        this.A0B = A002;
        this.A0C = A1Y;
        this.A0A = new PM7(userSession, (C252063oV) A002.getValue(), C66580MXl.A15(this, 43), this.A00);
        this.A05 = A1Y;
    }
}
