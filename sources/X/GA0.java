package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class GA0 extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GA0(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A06 = obj4;
        this.A04 = obj5;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C230282pK r4;
        C54077Gz1 gz1;
        IntentAwareAdPivotState intentAwareAdPivotState;
        int i;
        Integer num;
        String str;
        Integer num2;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                Canvas canvas = (Canvas) obj2;
                0qQ.A0B(canvas, 0);
                int save = canvas.save();
                canvas.clipRect((Rect) this.A04);
                RectF rectF = (RectF) this.A05;
                if (rectF != null) {
                    canvas.clipRect(rectF);
                }
                ((0sP) this.A06).invoke(canvas);
                canvas.restoreToCount(save);
                break;
            case 1:
                Medium medium = (Medium) obj2;
                0qQ.A0B(medium, 0);
                Context context = (Context) this.A03;
                UserSession userSession = (UserSession) this.A05;
                0qQ.A0B(context, 0);
                0qQ.A0B(userSession, 2);
                JZ5 jz5 = new JZ5(context, medium, userSession, false);
                C385939jm r5 = new C385939jm(context, this.A06, this.A02, this.A04, this.A01, 1);
                C290815g0 r0 = new C290815g0(jz5, 459);
                r0.A00 = r5;
                1ES.A03(r0);
                break;
            case 2:
                ((C227802jw) this.A04).A0G((1Xj) this.A02);
                r4 = (C230282pK) this.A05;
                gz1 = (C54077Gz1) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                i = this.A01;
                num = AnonymousClass05K.A00;
                break;
            case 3:
                ((C227802jw) this.A04).A0G((1Xj) this.A02);
                r4 = (C230282pK) this.A05;
                gz1 = (C54077Gz1) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                i = this.A01;
                num = AnonymousClass05K.A01;
                break;
            default:
                DdY ddY = (DdY) obj2;
                0qQ.A0B(ddY, 0);
                List<AnonymousClass3UL> list = ddY.A0J;
                User user = (User) this.A05;
                FollowStatus followStatus = (FollowStatus) this.A03;
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (AnonymousClass3UL r2 : list) {
                    if (0qQ.A0K(r2.getId(), user.getId())) {
                        r2.A03.A0n(followStatus);
                    }
                    arrayList.add(r2);
                }
                List<C283155Gi> list2 = ddY.A0F;
                2YL r14 = (2YL) this.A06;
                int i2 = this.A01;
                FollowStatus followStatus2 = (FollowStatus) this.A04;
                JV7 jv7 = (JV7) this.A02;
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(list2, 10));
                for (C283155Gi r15 : list2) {
                    User A042 = r15.A04();
                    if (A042 != null) {
                        str = A042.getId();
                    } else {
                        str = null;
                    }
                    if (0qQ.A0K(str, user.getId())) {
                        C48087EVf eVf = C48087EVf.PRIMARY_BUTTON;
                        if (user.CPV()) {
                            num2 = AnonymousClass05K.A0Y;
                        } else {
                            if (followStatus2 != null) {
                                int ordinal = followStatus2.ordinal();
                                if (ordinal == 4) {
                                    num2 = AnonymousClass05K.A01;
                                } else if (ordinal == 3) {
                                    num2 = AnonymousClass05K.A00;
                                } else if (ordinal == 5) {
                                    num2 = AnonymousClass05K.A0N;
                                }
                            }
                            num2 = null;
                        }
                        C47179Dru dru = new C47179Dru(jv7, eVf, num2, i2);
                        1Eo.A05(19B.A00, new C66176MGn(r14, r15, dru, (Object) null, (AnonymousClass4D7) null, i2, 6), C318116oQ.A00(r14));
                        User A043 = r15.A04();
                        if (A043 != null) {
                            A043.A0n(followStatus);
                        }
                    }
                    arrayList2.add(r15);
                }
                return DdY.A00((C376619Ir) null, (JV5) null, (C53380GnA) null, (C61008Jv7) null, ddY, (Integer) null, arrayList2, arrayList, (List) null, 131065);
        }
        r4.A0F(intentAwareAdPivotState, gz1, num, i);
        return C60340gF.A00;
    }
}
