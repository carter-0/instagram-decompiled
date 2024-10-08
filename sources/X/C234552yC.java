package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yC  reason: invalid class name and case insensitive filesystem */
public final class C234552yC extends C230372pW {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass2lU A03;
    public final Context A04;

    public C234552yC(Context context, 1Bk r3, UserSession userSession, C232852uY r5, AnonymousClass4DU r6, AnonymousClass2lU r7) {
        super(r3, C234562yD.A00);
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = context;
        this.A03 = r7;
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        int position;
        1Xj r6 = (1Xj) obj;
        AnonymousClass3W1 r8 = (AnonymousClass3W1) obj2;
        0qQ.A0B(r6, 0);
        0qQ.A0B(r8, 1);
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        Boolean valueOf = Boolean.valueOf(182.A06(r3, userSession, 36311998572594006L));
        Boolean valueOf2 = Boolean.valueOf(182.A06(r3, userSession, 36313437387491309L));
        if (!r8.A0p()) {
            0wb.A03("OrganicImpressionEventAction:handleImpression", 002.A0R("position in media state is not set, media type is ", r6.BR7().name()));
            position = -1;
        } else {
            position = r8.getPosition();
        }
        AnonymousClass2lU r1 = this.A03;
        if (r1 != null && r1.A09(r8.A0o)) {
            r1.A06(r6, r8.A03);
        }
        if (r8.A0o == 1sy.A0H) {
            AnonymousClass2yJ.A00(AnonymousClass05K.A0Y);
        }
        if (AnonymousClass3VO.A09(r6)) {
            AnonymousClass2yJ.A00(AnonymousClass05K.A02);
            if (position == 0) {
                AnonymousClass2yJ.A00(AnonymousClass05K.A1I);
            }
        }
        int i = r8.A03;
        C254433sT.A01(userSession, this.A01, r6, this.A02, r8, valueOf, true, valueOf2, position, i);
    }
}
