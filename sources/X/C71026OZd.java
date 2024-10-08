package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OZd  reason: case insensitive filesystem */
public final class C71026OZd {
    public Integer A00 = null;
    public Integer A01 = 100;
    public final UserSession A02;

    public static C71026OZd A00(UserSession userSession) {
        return (C71026OZd) userSession.A01(C71026OZd.class, new C73467Pd9(userSession, 2));
    }

    public static String A01(Context context, C71026OZd oZd, C67350MmR mmR, int i, boolean z) {
        Resources resources;
        int i2;
        Object[] objArr;
        int i3;
        int A04;
        Resources resources2;
        int i4;
        if (i != 28) {
            if (i == 29) {
                C67350MmR mmR2 = C67350MmR.ADMINS_AND_MODERATORS;
                UserSession userSession = oZd.A02;
                0Tu r2 = 0Tu.A05;
                if (mmR == mmR2) {
                    i3 = DbS.A04(r2, userSession, 36597343317986079L);
                    resources = context.getResources();
                    i2 = 2131958685;
                    objArr = new Object[1];
                    G9w.A1Z(objArr, i3, 0);
                    return resources.getString(i2, objArr);
                }
                A04 = DbS.A04(r2, userSession, 36597987560131655L);
                resources2 = context.getResources();
                i4 = R.plurals.direct_broadcast_chats_max_collaborators_message;
            } else if (i != 61) {
                A04 = oZd.A02(mmR, i, z);
                resources2 = context.getResources();
                boolean A05 = 182.A05(0Tu.A05, oZd.A02);
                i4 = R.plurals.direct_max_recipients_reached_body;
                if (A05) {
                    i4 = R.plurals.direct_max_recipients_in_chat_reached_body;
                }
            }
            return DbY.A0d(resources2, A04, i4);
        }
        resources = context.getResources();
        i2 = 2131957115;
        objArr = new Object[1];
        i3 = C375479Ds.A00(oZd.A02);
        G9w.A1Z(objArr, i3, 0);
        return resources.getString(i2, objArr);
    }

    public final int A02(C67350MmR mmR, int i, boolean z) {
        long j;
        if (i != 28) {
            if (i == 29) {
                C67350MmR mmR2 = C67350MmR.ADMINS_AND_MODERATORS;
                UserSession userSession = this.A02;
                0Tu r2 = 0Tu.A05;
                if (mmR == mmR2) {
                    j = 36597343317986079L;
                } else {
                    j = 36597987560131655L;
                }
                return DbS.A04(r2, userSession, j);
            } else if (i != 61) {
                Integer num = this.A00;
                if (!z || num == null) {
                    return C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
                }
                return num.intValue();
            }
        }
        return C375479Ds.A00(this.A02) + 1;
    }

    public C71026OZd(UserSession userSession) {
        this.A02 = userSession;
        if (((int) AnonymousClass7TE.A0R(2HM.A00(userSession).A1V.getValue())) == 4) {
            1aD.A01(this.A02, "UnifiedGroupsHelper").A03(new C73452Pcu((Object) this, 15));
        }
    }

    public final Dialog A03(Context context, C67350MmR mmR, int i, boolean z) {
        int i2;
        C358248ab A0Y = DbS.A0Y(context);
        if (i != 28) {
            if (i == 29) {
                i2 = 2131958683;
                if (mmR == C67350MmR.ADMINS_AND_MODERATORS) {
                    i2 = 2131958684;
                }
            } else if (i != 61) {
                i2 = 2131959723;
                if (182.A05(0Tu.A05, this.A02)) {
                    i2 = 2131959722;
                }
            }
            A0Y.A09(i2);
            A0Y.A0q(A01(context, this, mmR, i, z));
            A0Y.A06();
            return A0Y.A02();
        }
        i2 = 2131957116;
        A0Y.A09(i2);
        A0Y.A0q(A01(context, this, mmR, i, z));
        A0Y.A06();
        return A0Y.A02();
    }
}
