package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;

public final class K9G extends 2Ru {
    public C62571Ki2 A00;
    public final UserSession A01;
    public final K9V A02;
    public final C47610E9w A03;
    public final C61476K9h A04;
    public final K9W A05;
    public final C47611E9x A06;
    public final K9N A07;
    public final K9X A08;
    public final K9O A09;
    public final K9Y A0A;
    public final C61477K9i A0B;
    public final C336947fR A0C;
    public final GroupProfileStoryRecipient A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K9G(Context context, AnonymousClass4DH r19, UserSession userSession, GroupProfileStoryRecipient groupProfileStoryRecipient, C65634LxB lxB, C62571Ki2 ki2, C351998Bg r24, C363008it r25) {
        super(false);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        this.A01 = userSession2;
        this.A00 = ki2;
        this.A0D = groupProfileStoryRecipient;
        C65634LxB lxB2 = lxB;
        C363008it r0 = r25;
        AnonymousClass4DH r5 = r19;
        C61477K9i k9i = new C61477K9i(r5, userSession2, lxB2, r0);
        this.A0B = k9i;
        C61476K9h k9h = new C61476K9h(userSession2, lxB2, r24, r0);
        this.A04 = k9h;
        C47610E9w e9w = new C47610E9w(userSession2, lxB2);
        this.A03 = e9w;
        K9Y k9y = new K9Y(userSession2, lxB2);
        this.A0A = k9y;
        K9V k9v = new K9V(userSession2, lxB2);
        this.A02 = k9v;
        C47611E9x e9x = new C47611E9x(userSession2, lxB2);
        this.A06 = e9x;
        K9O k9o = new K9O(lxB2);
        this.A09 = k9o;
        K9W k9w = new K9W(userSession2, lxB2);
        this.A05 = k9w;
        K9N k9n = new K9N(lxB2);
        this.A07 = k9n;
        K9X k9x = new K9X(r5, lxB2);
        this.A08 = k9x;
        C336947fR r02 = new C336947fR(context);
        this.A0C = r02;
        init(new C231642s0[]{k9i, k9h, e9w, k9y, k9o, k9w, k9n, k9v, e9x, k9x, r02});
    }
}
