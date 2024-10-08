package X;

import com.instagram.common.session.UserSession;

public final /* synthetic */ class FT8 implements AnonymousClass2hV {
    public final /* synthetic */ AnonymousClass2hV A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass4DU A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ FT8(AnonymousClass2hV r1, UserSession userSession, 1Xj r3, AnonymousClass4DU r4, Boolean bool, Runnable runnable, String str, String str2) {
        this.A06 = str;
        this.A02 = r3;
        this.A07 = str2;
        this.A03 = r4;
        this.A01 = userSession;
        this.A04 = bool;
        this.A05 = runnable;
        this.A00 = r1;
    }

    public final Object apply(Object obj) {
        String str = this.A06;
        1Xj r3 = this.A02;
        String str2 = this.A07;
        AnonymousClass4DU r4 = this.A03;
        UserSession userSession = this.A01;
        Boolean bool = this.A04;
        Runnable runnable = this.A05;
        AnonymousClass2hV r0 = this.A00;
        String str3 = (String) obj;
        if (str3 == null) {
            return null;
        }
        r0.apply(str3);
        if (bool.booleanValue()) {
            String id = r3.getId();
            id.getClass();
            C22031Xty.A0K(r4, userSession, id, str2, str, str3, DbT.A0x(r3), (String) null, (String) null);
        }
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
