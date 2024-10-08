package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import com.instagram.user.model.User;

public final class I73 {
    public static final I73 A00 = new Object();

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A03(View view) {
        IUM ium = new IUM(view);
        ium.A0G.setVisibility(0);
        ium.A0P.setVisibility(8);
        ? r3 = ium.A0O;
        r3.setVisibility(8);
        ium.A0L.setVisibility(8);
        IgImageView igImageView = ium.A0R;
        igImageView.setVisibility(8);
        ium.A0H.setVisibility(8);
        r3.setOnClickListener((View.OnClickListener) null);
        IgFrameLayout igFrameLayout = ium.A0B;
        igFrameLayout.setOnClickListener((View.OnClickListener) null);
        igFrameLayout.setOnLongClickListener((View.OnLongClickListener) null);
        igImageView.setOnClickListener((View.OnClickListener) null);
    }

    public static final void A01(Context context, AnonymousClass0iw r18, UserSession userSession, IgTextView igTextView, 1Xj r21, IntentAwareAdPivotState intentAwareAdPivotState, AnonymousClass3W1 r23, C230292pL r24, C54077Gz1 gz1, C230282pK r26, C227802jw r27, int i) {
        String A0t;
        UserSession userSession2 = userSession;
        1Xj r5 = r21;
        User A2A = r5.A2A(userSession2);
        if (A2A == null || !A2A.A2Q()) {
            A0t = C51971G9r.A0t(r5.A2A(userSession2));
        } else {
            A0t = C231122qu.A0G(userSession2, r5);
        }
        IgTextView igTextView2 = igTextView;
        igTextView2.setText(A0t);
        Context context2 = context;
        A00(context2, igTextView2, C238863Ds.STORY_HEADER, r18, userSession2, r5);
        if (!A05(userSession2) && 182.A06(0Tu.A06, userSession2, 36312887640327632L)) {
            igTextView2.setPadding((int) 0nA.A00(context2, 6.0f), 0, igTextView2.getPaddingEnd(), 0);
        }
        AnonymousClass0fU.A00(new C244023aW(userSession2, (String) null, C58452Is9.A00, new C58828IyD(userSession2, r5, intentAwareAdPivotState, r23, r24, gz1, r26, r27, i, 1), true), igTextView2);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r15, X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, com.instagram.common.ui.widget.imageview.CircularImageView r18, X.1Xj r19, com.instagram.feed.ui.state.IntentAwareAdPivotState r20, X.AnonymousClass3W1 r21, X.C230292pL r22, X.C54077Gz1 r23, X.C230282pK r24, X.C227802jw r25, int r26) {
        /*
            X.3Ds r10 = X.C238863Ds.STORY_HEADER
            r8 = r15
            r3 = r16
            r6 = r17
            r2 = r18
            r7 = r19
            r11 = r3
            r12 = r6
            r13 = r7
            r9 = r2
            A00(r8, r9, r10, r11, r12, r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.2eS.A04(r2, r0)
            r1 = 2131964416(0x7f133200, float:1.9565613E38)
            r19 = 1
            com.instagram.user.model.User r0 = r7.A2A(r6)
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r0.B8Q()
            r15 = 0
            java.lang.String r0 = X.DbW.A0h(r8, r0, r1)
            r2.setContentDescription(r0)
            boolean r0 = A05(r6)
            r11 = r23
            if (r0 != 0) goto L_0x0069
            X.0Tu r4 = X.0Tu.A06
            r0 = 36312887640327632(0x810261009205d0, double:3.027754591780712E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 != 0) goto L_0x004d
            int r0 = r11.A00
            boolean r0 = X.I7D.A00(r6, r0)
            if (r0 == 0) goto L_0x0069
        L_0x004d:
            int r0 = r11.A00
            boolean r0 = X.I7D.A01(r6, r0)
            if (r0 != 0) goto L_0x0069
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            r1 = 1103101952(0x41c00000, float:24.0)
            float r0 = X.0nA.A00(r8, r1)
            int r0 = (int) r0
            r4.width = r0
            float r0 = X.0nA.A00(r8, r1)
            int r0 = (int) r0
            r4.height = r0
        L_0x0069:
            com.instagram.user.model.User r0 = r7.A2A(r6)
            if (r0 == 0) goto L_0x0094
            X.DbU.A1S(r3, r2, r0)
            r16 = 0
            X.Is8 r17 = X.C58451Is8.A00
            X.IyD r5 = new X.IyD
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            r13 = r25
            r14 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.3aW r0 = new X.3aW
            r14 = r0
            r15 = r6
            r18 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I73.A02(android.content.Context, X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.widget.imageview.CircularImageView, X.1Xj, com.instagram.feed.ui.state.IntentAwareAdPivotState, X.3W1, X.2pL, X.Gz1, X.2pK, X.2jw, int):void");
    }

    public static final void A04(UserSession userSession, 1Xj r4, C230292pL r5, C54077Gz1 gz1) {
        String str;
        int i = gz1.A00;
        0qQ.A0B(userSession, 0);
        if (AnonymousClass59V.A00.A02(Integer.valueOf(i)) && 182.A06(0Tu.A05, userSession, 36312887645046287L)) {
            String A07 = C231122qu.A07(userSession, r4);
            if (A07 != null) {
                C42049BFc bFc = gz1.A03;
                if (bFc == null || (str = bFc.A05) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                r5.A03(A07, str, "1848189102340159");
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final boolean A05(UserSession userSession) {
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36312887638820284L) || 182.A06(r2, userSession, 36312887639475653L)) {
            return true;
        }
        return false;
    }

    public static final void A00(Context context, View view, C238863Ds r5, AnonymousClass0iw r6, UserSession userSession, 1Xj r8) {
        C238833Dp.A00(userSession).A05(view, r5);
        C238833Dp A002 = C238833Dp.A00(userSession);
        AnonymousClass4DU r62 = (AnonymousClass4DU) r6;
        AnonymousClass3W1 r1 = new AnonymousClass3W1();
        if (r8.A5D()) {
            r1.A0B(0);
        }
        A002.A0A(view, C51971G9r.A0f(context, r1, userSession, r8, r62));
    }
}
