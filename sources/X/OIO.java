package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class OIO {
    public AnonymousClass7DW A00;
    public String A01;
    public String A02;
    public final Activity A03;
    public final C72520P9d A04;
    public final PA1 A05;
    public final UserSession A06;
    public final NV4 A07;
    public final C72498P8h A08;
    public final C72522P9f A09;
    public final C67759MuF A0A;
    public final AnonymousClass7DS A0B = P8K.A00;
    public final AnonymousClass7DU A0C = P8T.A00;
    public final AnonymousClass7XA A0D;
    public final AnonymousClass7ST A0E;
    public final DirectThreadKey A0F;
    public final String A0G;
    public final AnonymousClass0eK A0H;
    public final AnonymousClass7X4 A0I;

    public OIO(Activity activity, UserSession userSession, NV4 nv4, C67759MuF muF, AnonymousClass7X4 r14, AnonymousClass7XA r15, AnonymousClass7ST r16, DirectThreadKey directThreadKey, String str, AnonymousClass0eK r19) {
        0qQ.A0B(userSession, 3);
        this.A07 = nv4;
        Activity activity2 = activity;
        this.A03 = activity;
        this.A06 = userSession;
        DirectThreadKey directThreadKey2 = directThreadKey;
        this.A0F = directThreadKey2;
        this.A0A = muF;
        this.A0H = r19;
        this.A0D = r15;
        AnonymousClass7ST r7 = r16;
        this.A0E = r7;
        this.A0I = r14;
        this.A0G = str;
        this.A00 = new P8W(1, activity2, userSession, nv4, this, r7, directThreadKey2);
        this.A08 = new C72498P8h();
        this.A05 = new PA1(0);
        this.A09 = new C72522P9f();
        this.A04 = new C72520P9d(this, 1);
    }
}
