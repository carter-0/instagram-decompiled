package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EAp  reason: case insensitive filesystem */
public final class C47629EAp extends C231632rz {
    public final UserSession A00;
    public final C47522E6i A01;
    public final Context A02;
    public final boolean A03;

    public C47629EAp(Context context, UserSession userSession, C47522E6i e6i, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = e6i;
        this.A03 = z;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String id = ((1Xj) obj).getId();
        if (id != null) {
            return id.hashCode();
        }
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((1Xj) obj).A0v();
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (X.C243353Yk.A03(r4, r12, r1) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017e, code lost:
        if (r11 != false) goto L_0x00cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r19, android.view.View r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r18 = this;
            r12 = r21
            r0 = 131154077(0x7d1409d, float:3.14848E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = r20
            r1 = r22
            X.AnonymousClass7TG.A1U(r0, r12, r1)
            java.lang.Object r5 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.userlist.adapter.LikeAndViewCountViewBinder.Holder"
            X.0qQ.A0C(r5, r0)
            X.F0g r5 = (X.C49649F0g) r5
            r0 = r18
            com.instagram.common.session.UserSession r4 = r0.A00
            X.1Xj r12 = (X.1Xj) r12
            boolean r17 = X.AnonymousClass7TE.A1a(r1)
            X.E6i r8 = r0.A01
            boolean r11 = r0.A03
            r7 = 0
            X.0qQ.A0B(r4, r7)
            X.AnonymousClass7TG.A1O(r5, r12)
            r0 = 4
            X.0qQ.A0B(r8, r0)
            android.view.View r10 = r5.A00
            android.content.res.Resources r6 = X.DbU.A05(r10)
            boolean r16 = X.C243353Yk.A02(r4, r12)
            java.lang.Integer r0 = r8.A0F
            boolean r15 = X.C243353Yk.A03(r4, r12, r0)
            java.lang.CharSequence r0 = r8.A0D
            if (r0 != 0) goto L_0x004a
            java.lang.CharSequence r0 = r8.A0E
        L_0x004a:
            r13 = 1
            r2 = 0
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Integer r0 = r8.A0F
            X.3Yk r9 = X.C243353Yk.A00
            boolean r0 = r9.A05(r4, r12, r0, r1)
            if (r0 != 0) goto L_0x0182
            boolean r0 = X.F8J.A01(r4)
            if (r0 == 0) goto L_0x007a
            boolean r0 = X.C46342Dck.A02(r4, r12)
            if (r0 == 0) goto L_0x007a
            boolean r0 = X.C338007hG.A01(r12)
            if (r0 == 0) goto L_0x007a
            java.lang.CharSequence r0 = r8.A0D
            if (r0 != 0) goto L_0x0074
            java.lang.CharSequence r0 = r8.A0E
            if (r0 == 0) goto L_0x007a
        L_0x0074:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0182
        L_0x007a:
            r14 = 0
        L_0x007b:
            java.lang.CharSequence r0 = r8.A0D
            if (r0 != 0) goto L_0x0084
            java.lang.CharSequence r0 = r8.A0E
            if (r0 != 0) goto L_0x0084
            r13 = 0
        L_0x0084:
            java.lang.Integer r1 = r8.A0F
            boolean r0 = X.C243353Yk.A02(r4, r12)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r9.A05(r4, r12, r1, r13)
            if (r0 != 0) goto L_0x0099
            boolean r1 = X.C243353Yk.A03(r4, r12, r1)
            r0 = 0
            if (r1 == 0) goto L_0x009a
        L_0x0099:
            r0 = 1
        L_0x009a:
            r9 = 8
            if (r0 != 0) goto L_0x00a8
            r10.setVisibility(r9)
        L_0x00a1:
            r0 = -1445286977(0xffffffffa9daabbf, float:-9.710938E-14)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x00a8:
            r10.setVisibility(r7)
            if (r16 == 0) goto L_0x017e
            X.0qQ.A0A(r6)
            android.view.ViewGroup r1 = r5.A02
            r1.setVisibility(r7)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r6.getDimensionPixelSize(r0)
            X.0nA.A0c(r1, r0)
            int r10 = r12.A0v()
            android.widget.TextView r1 = r5.A05
            r0 = 2131820771(0x7f1100e3, float:1.9274266E38)
            X.F8A.A01(r6, r1, r10, r0)
        L_0x00cb:
            boolean r1 = X.F8J.A01(r4)
            X.1Xy r0 = r12.A0C
            java.lang.Integer r0 = r0.CEg()
            if (r1 == 0) goto L_0x00df
            if (r0 != 0) goto L_0x016d
            X.1Xy r0 = r12.A0C
            java.lang.Integer r0 = r0.Bd0()
        L_0x00df:
            if (r0 != 0) goto L_0x016d
            android.widget.TextView r0 = r5.A06
            r0.setVisibility(r9)
        L_0x00e6:
            java.lang.Integer r10 = r8.A0F
            if (r15 == 0) goto L_0x0157
            if (r10 == 0) goto L_0x0157
            X.0qQ.A0A(r6)
            android.view.ViewGroup r1 = r5.A02
            r1.setVisibility(r7)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r6.getDimensionPixelSize(r0)
            X.0nA.A0c(r1, r0)
            int r10 = r10.intValue()
            android.widget.TextView r1 = r5.A04
            r0 = 2131820765(0x7f1100dd, float:1.9274254E38)
            X.F8A.A01(r6, r1, r10, r0)
        L_0x010a:
            if (r14 == 0) goto L_0x014c
            boolean r0 = X.F8J.A01(r4)
            if (r0 == 0) goto L_0x0117
            android.widget.TextView r0 = r5.A03
            X.DbT.A1H(r0)
        L_0x0117:
            android.widget.TextView r1 = r5.A03
            java.lang.CharSequence r0 = r8.A0D
            if (r0 != 0) goto L_0x011f
            java.lang.CharSequence r0 = r8.A0E
        L_0x011f:
            r1.setText(r0)
            r1.setVisibility(r7)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r6.getDimensionPixelSize(r0)
            X.0nA.A0X(r1, r0)
            android.view.ViewGroup r1 = r5.A02
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
        L_0x0134:
            int r0 = r6.getDimensionPixelSize(r0)
            X.0nA.A0X(r1, r0)
            android.view.View r1 = r5.A01
            if (r17 == 0) goto L_0x0147
            boolean r0 = X.F8J.A01(r4)
            if (r0 != 0) goto L_0x0147
            r2 = 8
        L_0x0147:
            r1.setVisibility(r2)
            goto L_0x00a1
        L_0x014c:
            android.widget.TextView r0 = r5.A03
            r0.setVisibility(r9)
            android.view.ViewGroup r1 = r5.A02
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            goto L_0x0134
        L_0x0157:
            if (r16 != 0) goto L_0x010a
            if (r11 != 0) goto L_0x010a
            android.view.ViewGroup r0 = r5.A02
            r0.setVisibility(r9)
            android.widget.TextView r1 = r5.A03
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r6.getDimensionPixelSize(r0)
            X.0nA.A0c(r1, r0)
            goto L_0x010a
        L_0x016d:
            X.0qQ.A0A(r6)
            int r10 = r0.intValue()
            android.widget.TextView r1 = r5.A06
            r0 = 2131821006(0x7f1101ce, float:1.9274743E38)
            X.F8A.A01(r6, r1, r10, r0)
            goto L_0x00e6
        L_0x017e:
            if (r11 == 0) goto L_0x00e6
            goto L_0x00cb
        L_0x0182:
            r14 = 1
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47629EAp.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A0E != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.C232672uC r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            X.1Xj r8 = (X.1Xj) r8
            r5 = 0
            X.AnonymousClass7TF.A1H(r7, r8)
            X.E6i r1 = r6.A01
            java.lang.CharSequence r0 = r1.A0D
            if (r0 != 0) goto L_0x0011
            java.lang.CharSequence r0 = r1.A0E
            r4 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            java.lang.Integer r3 = r1.A0F
            com.instagram.common.session.UserSession r2 = r6.A00
            X.3Yk r1 = X.C243353Yk.A00
            r0 = 3
            X.0qQ.A0B(r2, r0)
            boolean r0 = X.C243353Yk.A02(r2, r8)
            if (r0 != 0) goto L_0x002e
            boolean r0 = r1.A05(r2, r8, r3, r4)
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.C243353Yk.A03(r2, r8, r3)
            if (r0 == 0) goto L_0x0031
        L_0x002e:
            r7.A7U(r5)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47629EAp.buildRowViewTypes(X.2uC, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -610206975);
        Context context = this.A02;
        UserSession userSession = this.A00;
        AnonymousClass7TF.A1B(context, 0, userSession);
        LayoutInflater from = LayoutInflater.from(context);
        boolean A012 = F8J.A01(userSession);
        int i2 = R.layout.view_and_like_counts_header_row;
        if (A012) {
            i2 = R.layout.like_and_view_counts_header_row;
        }
        View A0A = DbU.A0A(from, viewGroup, i2, false);
        A0A.setTag(new C49649F0g(A0A));
        boolean A013 = F8J.A01(userSession);
        int i3 = R.drawable.instagram_play_filled_16;
        if (A013) {
            i3 = R.drawable.instagram_play_pano_outline_16;
        }
        F8A.A00(context, A0A, R.id.video_view_count_text, i3);
        boolean A014 = F8J.A01(userSession);
        int i4 = R.drawable.instagram_heart_filled_16;
        if (A014) {
            i4 = R.drawable.instagram_heart_pano_outline_16;
        }
        F8A.A00(context, A0A, R.id.like_count_text, i4);
        F8A.A00(context, A0A, R.id.impression_count_text, R.drawable.instagram_eye_pano_outline_16);
        AnonymousClass0fD.A0A(1744666647, A04);
        return A0A;
    }
}
