package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

public final class EAL extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final GenericSurveyFragment A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAL(AnonymousClass0iw r1, UserSession userSession, GenericSurveyFragment genericSurveyFragment) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = genericSurveyFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r0 = -135031263(0xfffffffff7f39621, float:-9.88104E33)
            int r2 = X.DbX.A04(r13, r0)
            r1 = 2
            X.0qQ.A0B(r14, r1)
            if (r12 != 0) goto L_0x00c5
            com.instagram.common.session.UserSession r0 = r11.A01
            java.lang.Object r6 = r13.getTag()
            if (r6 == 0) goto L_0x00bd
            X.F0J r6 = (X.F0J) r6
            X.1Xj r14 = (X.1Xj) r14
            X.0iw r7 = r11.A00
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = r11.A02
            r10 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r10, r0, r6)
            X.AnonymousClass7TG.A0w(r1, r14, r7, r5)
            com.instagram.feed.widget.IgProgressImageView r4 = r6.A04
            android.content.Context r9 = r4.getContext()
            com.instagram.user.model.User r1 = r14.A2A(r0)
            if (r1 == 0) goto L_0x00b8
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r6.A03
            X.DbU.A1S(r7, r0, r1)
            android.widget.TextView r8 = r6.A02
            X.DbU.A1H(r8, r1)
            r4.setAdjustViewBounds(r3)
            X.0qQ.A0A(r9)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r14.A1n(r9)
            if (r0 == 0) goto L_0x004a
            r4.setUrl(r0, r7)
        L_0x004a:
            boolean r0 = r14.A5D()
            if (r0 == 0) goto L_0x00a2
            X.0eM r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2131237287(0x7f0819a7, float:1.809082E38)
        L_0x005b:
            r3.setImageResource(r0)
        L_0x005e:
            android.widget.TextView r7 = r6.A01
            boolean r1 = r14.CcK()
            r0 = 1
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x0091
            r7.setVisibility(r10)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131957526(0x7f131716, float:1.9551638E38)
            X.DbU.A1A(r1, r7, r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.0qQ.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 48
        L_0x0083:
            r1.gravity = r0
            r0 = 31
            X.FPH.A00(r4, r5, r14, r6, r0)
            r0 = 2069380761(0x7b583e99, float:1.12280575E36)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0091:
            r0 = 8
            r7.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.0qQ.A0C(r1, r3)
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r0 = 16
            goto L_0x0083
        L_0x00a2:
            boolean r1 = r14.CeS()
            X.0eM r0 = r6.A05
            java.lang.Object r3 = r0.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r1 == 0) goto L_0x00b4
            r0 = 2131237268(0x7f081994, float:1.8090782E38)
            goto L_0x005b
        L_0x00b4:
            X.0nA.A0O(r3)
            goto L_0x005e
        L_0x00b8:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x00bd:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 116318244(0x6eee024, float:8.9854995E-35)
            goto L_0x00d2
        L_0x00c5:
            r0 = 33
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)
            r0 = 1039208076(0x3df10e8c, float:0.11770353)
        L_0x00d2:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAL.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 760225488);
        if (i == 0) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.feed_preview_content_view, false);
            A0A.setTag(new F0J(A0A));
            AnonymousClass0fD.A0A(-1490544750, A04);
            return A0A;
        }
        UnsupportedOperationException A1B = AnonymousClass7TE.A1B("Unhandled view type");
        AnonymousClass0fD.A0A(1688248671, A04);
        throw A1B;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
