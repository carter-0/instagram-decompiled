package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

public final class KVN extends C60518Jmp implements C66453MSh {
    public AnonymousClass3NL A00;
    public AnonymousClass3NL A01;
    public final TextView A02;
    public final MXW A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final GridLayoutManager A09 = new GridLayoutManager(JTQ.A06(this), 1, 0, false);
    public final LinearLayoutManager A0A;
    public final RecyclerView A0B;
    public final UserSession A0C;
    public final C60378JkX A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KVN(android.view.View r16, X.AnonymousClass07Z r17, com.instagram.api.schemas.MusicProduct r18, com.instagram.common.session.UserSession r19, X.LFN r20, X.MXW r21, X.C60329JjY r22, X.1Av r23, boolean r24) {
        /*
            r15 = this;
            r3 = 1
            r9 = r19
            r11 = r21
            X.AnonymousClass7TG.A1Q(r9, r11)
            r8 = r18
            r12 = r22
            r13 = r23
            X.C51974G9v.A1N(r8, r13, r12)
            r0 = 8
            r7 = r17
            r10 = r20
            X.AnonymousClass7TF.A1G(r10, r0, r7)
            r2 = r16
            r15.<init>(r2)
            r15.A0C = r9
            r15.A03 = r11
            r0 = 2131438108(0x7f0b2a1c, float:1.8498134E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r2, r0)
            r15.A04 = r0
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r0 = X.DbW.A0B(r2, r0)
            r15.A02 = r0
            r0 = 2131440926(0x7f0b351e, float:1.850385E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r2, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r15.A07 = r5
            r0 = 2131442023(0x7f0b3967, float:1.8506074E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r2, r0)
            r15.A08 = r0
            r0 = 2131436756(0x7f0b24d4, float:1.8495391E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r2, r0)
            r15.A05 = r0
            r0 = 2131438126(0x7f0b2a2e, float:1.849817E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r2, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r15.A0B = r1
            r0 = 2131428945(0x7f0b0651, float:1.8479549E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r2, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r15.A06 = r4
            X.Jk1 r0 = new X.Jk1
            r0.<init>()
            r1.setItemAnimator(r0)
            android.content.Context r1 = r1.getContext()
            r0 = 2131967868(0x7f133f7c, float:1.9572615E38)
            X.DbU.A12(r1, r5, r0)
            X.DbU.A12(r1, r4, r0)
            X.JkX r6 = new X.JkX
            r14 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A0D = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1)
            r15.A0A = r0
            android.content.Context r2 = X.JTQ.A06(r15)
            r1 = 0
            androidx.recyclerview.widget.GridLayoutManager r0 = new androidx.recyclerview.widget.GridLayoutManager
            r0.<init>((android.content.Context) r2, (int) r3, (int) r1, (boolean) r1)
            r15.A09 = r0
            X.3NG r1 = X.AnonymousClass7TE.A0m(r5)
            r1.A07 = r3
            r0 = 34
            X.C61685KHt.A00(r1, r15, r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r4)
            r1.A07 = r3
            r0 = 35
            X.C61685KHt.A00(r1, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KVN.<init>(android.view.View, X.07Z, com.instagram.api.schemas.MusicProduct, com.instagram.common.session.UserSession, X.LFN, X.MXW, X.JjY, X.1Av, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(com.instagram.api.schemas.AudioBrowserPlaylistType r13, X.MVC r14, int r15, boolean r16) {
        /*
            r12 = this;
            r3 = 0
            java.lang.String r9 = r14.getTitle()
            java.lang.String r8 = r14.getId()
            androidx.recyclerview.widget.RecyclerView r6 = r12.A0B
            X.2Rw r0 = r6.A0A
            java.lang.String r2 = "PLAYLIST_ID.IN_THIS_REEL"
            if (r0 != 0) goto L_0x0042
            boolean r0 = X.0qQ.A0K(r8, r2)
            if (r0 == 0) goto L_0x0143
            androidx.recyclerview.widget.GridLayoutManager r0 = r12.A09
            r6.setLayoutManager(r0)
            android.content.res.Resources r1 = X.JTS.A07(r12)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.JTS.A07(r12)
            r4 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r1 = r0.getDimensionPixelSize(r4)
            android.content.res.Resources r0 = X.JTS.A07(r12)
            int r0 = r0.getDimensionPixelSize(r4)
            r6.setPadding(r5, r1, r0, r3)
        L_0x003d:
            X.JkX r0 = r12.A0D
            r6.setAdapter(r0)
        L_0x0042:
            r4 = r9
            android.widget.TextView r1 = r12.A02
            r1.setText(r9)
            X.2eQ.A03(r1)
            com.instagram.api.schemas.AudioBrowserPlaylistType r0 = com.instagram.api.schemas.AudioBrowserPlaylistType.FOR_YOU
            r7 = r13
            if (r13 != r0) goto L_0x005b
            android.content.Context r4 = X.JTQ.A06(r12)
            r0 = 2131967777(0x7f133f21, float:1.957243E38)
            java.lang.String r4 = r4.getString(r0)
        L_0x005b:
            r1.setContentDescription(r4)
            com.instagram.api.schemas.AudioBrowserPlaylistType r5 = com.instagram.api.schemas.AudioBrowserPlaylistType.SPOTIFY
            r4 = 8
            android.widget.TextView r0 = r12.A08
            if (r13 != r5) goto L_0x013e
            r0.setVisibility(r3)
        L_0x0069:
            X.JkX r5 = r12.A0D
            java.util.List r10 = r14.Bf2()
            com.instagram.api.schemas.AudioBrowserCategoryType r6 = r14.AmL()
            r11 = r15
            r5.A01(r6, r7, r8, r9, r10, r11)
            boolean r0 = X.0qQ.A0K(r8, r2)
            if (r0 == 0) goto L_0x00bb
            r12.A01()
            r1.setVisibility(r3)
            android.widget.TextView r5 = r12.A07
            r5.setVisibility(r4)
            android.view.View r0 = r12.A05
            r0.setVisibility(r4)
            android.widget.TextView r2 = r12.A06
            r2.setVisibility(r4)
        L_0x0092:
            r0 = 2132018668(0x7f1405ec, float:1.967565E38)
        L_0x0095:
            r1.setTextAppearance(r0)
        L_0x0098:
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x00b9
            r1 = 9
            X.KHu r0 = new X.KHu
            r0.<init>(r1, r12, r14)
        L_0x00a5:
            r12.A01 = r0
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x00b7
            r1 = 9
            X.KHu r0 = new X.KHu
            r0.<init>(r1, r12, r14)
        L_0x00b4:
            r12.A00 = r0
            return
        L_0x00b7:
            r0 = 0
            goto L_0x00b4
        L_0x00b9:
            r0 = 0
            goto L_0x00a5
        L_0x00bb:
            com.instagram.api.schemas.AudioBrowserPlaylistType r0 = com.instagram.api.schemas.AudioBrowserPlaylistType.SPOTIFY_RECENTLY_PLAYED
            if (r13 != r0) goto L_0x00da
            android.view.View r0 = r12.A04
            r0.setPadding(r3, r3, r3, r3)
            r1.setVisibility(r3)
            android.view.View r0 = r12.A05
            r0.setVisibility(r4)
            android.widget.TextView r2 = r12.A06
            r2.setVisibility(r4)
            android.widget.TextView r5 = r12.A07
            r5.setVisibility(r3)
        L_0x00d6:
            r0 = 2132018667(0x7f1405eb, float:1.9675647E38)
            goto L_0x0095
        L_0x00da:
            com.instagram.api.schemas.AudioBrowserCategoryType r2 = r14.AmL()
            com.instagram.api.schemas.AudioBrowserCategoryType r0 = com.instagram.api.schemas.AudioBrowserCategoryType.SPOTIFY_MOODS
            if (r2 != r0) goto L_0x00f8
            r12.A01()
            r1.setVisibility(r3)
            android.view.View r0 = r12.A05
            r0.setVisibility(r4)
        L_0x00ed:
            android.widget.TextView r5 = r12.A07
            r5.setVisibility(r4)
            android.widget.TextView r2 = r12.A06
            r2.setVisibility(r4)
            goto L_0x00d6
        L_0x00f8:
            com.instagram.api.schemas.AudioBrowserCategoryType r2 = r14.AmL()
            com.instagram.api.schemas.AudioBrowserCategoryType r0 = com.instagram.api.schemas.AudioBrowserCategoryType.SPOTIFY_GENRES
            if (r2 != r0) goto L_0x010c
            r12.A01()
            r1.setVisibility(r3)
            android.view.View r0 = r12.A05
            r0.setVisibility(r3)
            goto L_0x00ed
        L_0x010c:
            if (r16 == 0) goto L_0x0127
            android.view.View r0 = r12.A04
            r0.setPadding(r3, r3, r3, r3)
            r1.setVisibility(r4)
            android.widget.TextView r5 = r12.A07
            r5.setVisibility(r4)
            android.widget.TextView r2 = r12.A06
            r2.setVisibility(r3)
            android.view.View r0 = r12.A05
            r0.setVisibility(r3)
            goto L_0x0098
        L_0x0127:
            r12.A01()
            r1.setVisibility(r3)
            android.widget.TextView r2 = r12.A06
            r2.setVisibility(r4)
            android.widget.TextView r5 = r12.A07
            r5.setVisibility(r3)
            android.view.View r0 = r12.A05
            r0.setVisibility(r3)
            goto L_0x0092
        L_0x013e:
            r0.setVisibility(r4)
            goto L_0x0069
        L_0x0143:
            com.instagram.api.schemas.AudioBrowserCategoryType r1 = r14.AmL()
            com.instagram.api.schemas.AudioBrowserCategoryType r0 = com.instagram.api.schemas.AudioBrowserCategoryType.SPOTIFY_MOODS
            if (r1 == r0) goto L_0x015a
            com.instagram.api.schemas.AudioBrowserCategoryType r1 = r14.AmL()
            com.instagram.api.schemas.AudioBrowserCategoryType r0 = com.instagram.api.schemas.AudioBrowserCategoryType.SPOTIFY_GENRES
            if (r1 == r0) goto L_0x015a
            androidx.recyclerview.widget.LinearLayoutManager r0 = r12.A0A
            r6.setLayoutManager(r0)
            goto L_0x003d
        L_0x015a:
            androidx.recyclerview.widget.GridLayoutManager r0 = r12.A09
            r6.setLayoutManager(r0)
            android.content.res.Resources r1 = X.JTS.A07(r12)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            r7 = 2131165190(0x7f070006, float:1.794459E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = X.JTS.A07(r12)
            int r4 = r0.getDimensionPixelSize(r7)
            android.content.res.Resources r0 = X.JTS.A07(r12)
            int r1 = r0.getDimensionPixelSize(r7)
            android.content.res.Resources r0 = X.JTS.A07(r12)
            int r0 = r0.getDimensionPixelSize(r7)
            r6.setPadding(r5, r4, r1, r0)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KVN.A02(com.instagram.api.schemas.AudioBrowserPlaylistType, X.MVC, int, boolean):void");
    }

    private final void A01() {
        this.A04.setPadding(0, DbY.A01(DbS.A07(this)), 0, 0);
    }

    public final void FM3(C66569MWx mWx, float f) {
        C249703kE A0W;
        int A002 = this.A0D.A00(mWx);
        if (A002 >= 0 && (A0W = this.A0B.A0W(A002)) != null) {
            ((C66453MSh) A0W).FM3(mWx, f);
        }
    }
}
