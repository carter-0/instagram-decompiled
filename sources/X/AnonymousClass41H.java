package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;

/* renamed from: X.41H  reason: invalid class name */
public final class AnonymousClass41H implements AnonymousClass41G {
    public final UserSession A00;
    public final AnonymousClass41G A01;
    public final AnonymousClass2xI A02;
    public final C2354930b A03;
    public final C2362032v A04;
    public final C227802jw A05;

    public AnonymousClass41H(UserSession userSession, AnonymousClass41G r3, AnonymousClass2xI r4, C2354930b r5, C2362032v r6, C227802jw r7) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r6, 5);
        0qQ.A0B(r5, 6);
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = userSession;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    public final void DQy(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        this.A01.DQy(r2, r3, i);
    }

    public final void Djh(1Xj r12, C62320sa r13) {
        AnonymousClass2xI r4;
        0qQ.A0B(r12, 0);
        C62320sa r7 = r13;
        0qQ.A0B(r13, 1);
        C227802jw r3 = this.A05;
        View view = r3.mView;
        Context context = r3.getContext();
        C238133Ar r1 = r3.mScrollingViewProxy;
        if (context == null || view == null || r1 == null || (r4 = this.A02) == null || r3.A0X()) {
            this.A01.Djh(r12, r13);
            return;
        }
        ViewParent parent = r1.getParent();
        0qQ.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        String string = context.getString(2131971085);
        0qQ.A07(string);
        r4.A00((ViewGroup) parent, string, r7, 500, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0.A09(r7, r8, r3, r1) != false) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dji(X.1Xj r7, X.AnonymousClass3W1 r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r4 = 1
            X.0qQ.A0B(r8, r4)
            X.41G r0 = r6.A01
            r0.Dji(r7, r8, r9)
            X.32v r5 = r6.A04
            boolean r0 = r5.A01(r7)
            if (r0 == 0) goto L_0x0079
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r0 = r5.A02(r7, r1)
            if (r0 == 0) goto L_0x0079
            r5.A00(r7, r1)
            X.30b r2 = r6.A03
            X.3DY r3 = X.AnonymousClass3DY.SHARE_BUTTON
        L_0x0024:
            X.2un r0 = r2.A03
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.A09(r7, r8, r3, r1)
            if (r0 == 0) goto L_0x0032
        L_0x002e:
            r0 = 0
            r2.A01(r7, r8, r3, r0)
        L_0x0032:
            com.instagram.common.session.UserSession r5 = r6.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317105288647451(0x8106370000131b, double:3.030421849561272E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0076
            X.0uX r1 = X.0uX.A00(r5)
            java.lang.String r0 = r7.getId()
            X.0tj r1 = r1.A01(r0)
            if (r1 != 0) goto L_0x006d
            java.lang.String r3 = r7.getId()
            if (r3 == 0) goto L_0x0096
            com.instagram.user.model.User r1 = r7.A2A(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0077
            java.lang.String r2 = r1.getId()
        L_0x0060:
            com.instagram.model.mediatype.ProductType r1 = r7.A1v()
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = r1.A00
        L_0x0068:
            X.0tj r1 = new X.0tj
            r1.<init>(r3, r2, r0)
        L_0x006d:
            r1.A08 = r4
            X.0uX r0 = X.0uX.A00(r5)
            r0.A05(r1)
        L_0x0076:
            return
        L_0x0077:
            r2 = r0
            goto L_0x0060
        L_0x0079:
            X.30b r2 = r6.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.3DY r3 = X.AnonymousClass3DY.SHARE_BUTTON
            X.2un r0 = r2.A03
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.A09(r7, r8, r3, r1)
            if (r0 == 0) goto L_0x008a
            goto L_0x002e
        L_0x008a:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            boolean r0 = r5.A02(r7, r1)
            if (r0 == 0) goto L_0x0024
            r5.A00(r7, r1)
            goto L_0x0024
        L_0x0096:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41H.Dji(X.1Xj, X.3W1, int):void");
    }

    public final void Djn(Rect rect, ViewParent viewParent, 1Xj r4, int i) {
        0qQ.A0B(r4, 2);
        this.A01.Djn(rect, viewParent, r4, i);
    }

    public final void Djs(MotionEvent motionEvent, 1Xj r3) {
        0qQ.A0B(r3, 1);
        this.A01.Djs(motionEvent, r3);
    }

    public final void Djj(1Xj r2, AnonymousClass3W1 r3, String str, int i) {
        this.A01.Djj(r2, r3, str, i);
    }
}
