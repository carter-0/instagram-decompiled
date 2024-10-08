package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.base.BoundedLinearLayout;
import com.instagram.user.follow.FollowButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UAK extends 2Rw {
    public int A00;
    public AnonymousClass3UH A01;
    public AnonymousClass2p0 A02;
    public final int A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final 1Ng A06;
    public final UserSession A07;
    public final C230162p3 A08;
    public final Integer A09;
    public final Runnable A0A;
    public final String A0B;
    public final List A0C;
    public final Map A0D = new HashMap();

    public static int A00(UAK uak, C17674Vc5 vc5) {
        AnonymousClass3UH r0 = uak.A01;
        r0.getClass();
        return r0.A00(vc5);
    }

    public final void A02(AnonymousClass3UH r3) {
        this.A01 = r3;
        List list = this.A0C;
        list.clear();
        List A042 = r3.A04();
        A042.getClass();
        list.addAll(A042);
        this.A0D.clear();
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.instagram.user.follow.FollowButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.instagram.hashtag.ui.HashtagFollowButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.instagram.user.follow.FollowButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.instagram.user.follow.FollowButton} */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        if (r0.B5J() == X.1UQ.A0t) goto L_0x00c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r11, int r12) {
        /*
            r10 = this;
            int r0 = r11.mItemViewType
            if (r0 == 0) goto L_0x00a3
            r8 = 1
            if (r0 != r8) goto L_0x020b
            X.UEQ r11 = (X.UEQ) r11
            java.util.List r0 = r10.A0C
            java.lang.Object r4 = r0.get(r12)
            X.Vc5 r4 = (X.C17674Vc5) r4
            android.widget.TextView r1 = r11.A04
            java.lang.String r0 = r4.A06
            r1.setText(r0)
            java.util.List r0 = r4.A07
            java.lang.Object r2 = X.AnonymousClass7TE.A13(r0)
            X.1Xj r2 = (X.1Xj) r2
            android.widget.TextView r1 = r11.A03
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            android.content.Context r9 = r10.A04
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r2.A1n(r9)
            if (r1 != 0) goto L_0x0036
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0036:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r11.A06
            r0.getClass()
            X.0iw r7 = r10.A05
            r0.setUrl(r1, r7)
            java.util.Map r6 = r10.A0D
            java.util.List r5 = r4.A08
            if (r5 == 0) goto L_0x00a1
            java.lang.Integer r0 = X.C51969G9p.A0q(r5)
        L_0x004a:
            java.lang.Object r1 = r6.get(r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            if (r1 != 0) goto L_0x0081
            r0 = r5
            if (r5 != 0) goto L_0x005a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x005a:
            java.util.List r3 = X.C51966G9m.A1J(r0)
            int r2 = X.C66582MXn.A01(r9)
            java.lang.String r0 = r7.getModuleName()
            X.ON3 r1 = new X.ON3
            r1.<init>(r9, r0, r3, r2)
            r1.A0B = r8
            r1.A0D = r8
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            r1.A00 = r0
            X.3b0 r1 = r1.A00()
            if (r5 == 0) goto L_0x009f
            java.lang.Integer r0 = X.C51969G9p.A0q(r5)
        L_0x007e:
            r6.put(r0, r1)
        L_0x0081:
            android.widget.ImageView r0 = r11.A02
            r0.getClass()
            r0.setImageDrawable(r1)
            X.2p3 r1 = r10.A08
            X.3UH r0 = r10.A01
            r0.getClass()
            r1.A00(r0, r4)
            android.view.View r9 = r11.A00
        L_0x0095:
            X.2el r2 = r1.A00
            X.2oe r1 = r1.A01
            java.lang.String r0 = r4.A04
            X.C13988Tno.A14(r9, r2, r1, r0)
            return
        L_0x009f:
            r0 = 0
            goto L_0x007e
        L_0x00a1:
            r0 = 0
            goto L_0x004a
        L_0x00a3:
            X.UEQ r11 = (X.UEQ) r11
            java.util.List r0 = r10.A0C
            java.lang.Object r4 = r0.get(r12)
            X.Vc5 r4 = (X.C17674Vc5) r4
            android.widget.TextView r2 = r11.A04
            java.lang.String r0 = r4.A06
            r2.setText(r0)
            java.lang.Integer r1 = X.C18214Vne.A00(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00c9
            X.3UH r0 = r10.A01
            r0.getClass()
            X.1UQ r1 = r0.B5J()
            X.1UQ r0 = X.1UQ.A0t
            if (r1 != r0) goto L_0x00d5
        L_0x00c9:
            com.instagram.user.model.User r0 = r4.A02
            r0.getClass()
            boolean r0 = r0.isVerified()
            X.C244273av.A0B(r2, r0)
        L_0x00d5:
            android.widget.TextView r1 = r11.A03
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            java.lang.Integer r0 = X.C18214Vne.A00(r4)
            int r1 = X.C13988Tno.A0D(r0)
            r0 = 1
            if (r1 == r0) goto L_0x01f2
            r0 = 0
            if (r1 != r0) goto L_0x00f4
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r11.A05
            r1.getClass()
            r0 = 8
            r1.setVisibility(r0)
        L_0x00f4:
            android.view.View r9 = r11.A00
            r0 = 38
            X.WB4.A00(r9, r10, r11, r4, r0)
            android.view.View r2 = r11.A01
            r2.getClass()
            r0 = 39
            X.WB4.A00(r2, r10, r11, r4, r0)
            X.3UH r0 = r10.A01
            r0.getClass()
            boolean r0 = r0.A0Q
            r8 = 0
            int r1 = X.DbW.A01(r0)
            android.graphics.RectF r0 = X.0nA.A01
            r2.setVisibility(r1)
            X.0xF r2 = new X.0xF
            r2.<init>()
            X.3UH r0 = r10.A01
            r0.getClass()
            java.lang.String r0 = r0.A0C
            if (r0 == 0) goto L_0x0134
            X.3UH r0 = r10.A01
            r0.getClass()
            java.lang.String r1 = r0.A0C
            r0 = 161(0xa1, float:2.26E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xF.A00(r2, r1, r0)
        L_0x0134:
            java.lang.String r1 = "format"
            java.lang.String r0 = "preview"
            X.0xF.A00(r2, r0, r1)
            X.3UH r0 = r10.A01
            r0.getClass()
            java.lang.String r1 = r0.getId()
            r0 = 4143(0x102f, float:5.806E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xF.A00(r2, r1, r0)
            int r0 = A00(r10, r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "position"
            X.0xF.A00(r2, r1, r0)
            X.3UH r0 = r10.A01
            r0.getClass()
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 4205(0x106d, float:5.892E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xF.A00(r2, r1, r0)
            java.lang.Integer r0 = r10.A09
            java.lang.String r1 = X.C294615mk.A00(r0)
            java.lang.String r0 = "view"
            X.0xF.A00(r2, r1, r0)
            java.lang.Integer r0 = X.C18214Vne.A00(r4)
            int r0 = X.C13988Tno.A0D(r0)
            r7 = 1
            r6 = 8
            if (r0 == r7) goto L_0x01d5
            if (r0 != r8) goto L_0x01a7
            com.instagram.hashtag.ui.HashtagFollowButton r5 = r11.A07
            r5.getClass()
            com.instagram.model.hashtag.Hashtag r2 = r4.A00
            r2.getClass()
            X.0iw r1 = r10.A05
            X.WXh r0 = new X.WXh
            r0.<init>(r11, r10, r4)
            r5.A01(r1, r0, r2)
            com.instagram.user.follow.FollowButton r0 = r11.A0B
        L_0x019e:
            r0.getClass()
            r0.setVisibility(r6)
            r5.setVisibility(r8)
        L_0x01a7:
            java.util.List r0 = r4.A07
            java.util.Iterator r3 = r0.iterator()
            android.content.Context r2 = r10.A04
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r11.A09
            r0.getClass()
            X.0iw r1 = r10.A05
            A01(r2, r1, r0, r3, r8)
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r11.A0A
            r0.getClass()
            A01(r2, r1, r0, r3, r7)
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r11.A08
            r0.getClass()
            A01(r2, r1, r0, r3, r7)
            X.2p3 r1 = r10.A08
            X.3UH r0 = r10.A01
            r0.getClass()
            r1.A00(r0, r4)
            goto L_0x0095
        L_0x01d5:
            com.instagram.user.follow.FollowButton r5 = r11.A0B
            r5.getClass()
            X.4at r3 = r5.A0J
            X.Utg r0 = new X.Utg
            r0.<init>(r8, r11, r10, r4)
            r3.A07(r0)
            r3.A03 = r2
            com.instagram.common.session.UserSession r2 = r10.A07
            com.instagram.user.model.User r1 = r4.A02
            X.0iw r0 = r10.A05
            r3.A03(r0, r2, r1)
            com.instagram.hashtag.ui.HashtagFollowButton r0 = r11.A07
            goto L_0x019e
        L_0x01f2:
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r11.A05
            r2.getClass()
            r0 = 0
            r2.setVisibility(r0)
            com.instagram.user.model.User r0 = r4.A02
            r0.getClass()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            X.0iw r0 = r10.A05
            r2.setUrl(r1, r0)
            goto L_0x00f4
        L_0x020b:
            java.lang.String r1 = "Unknown view type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAK.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i == 0) {
            Context context = this.A04;
            View inflate = LayoutInflater.from(context).inflate(R.layout.interest_recommendation_card, viewGroup2, false);
            ? igImageButton = new IgImageButton(context);
            ? igImageButton2 = new IgImageButton(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
            layoutParams.setMargins(0, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
            igImageButton2.setLayoutParams(layoutParams);
            ? igImageButton3 = new IgImageButton(context);
            igImageButton3.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            ViewGroup A0C2 = DbU.A0C(inflate, R.id.media_grid);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            JTQ.A0w(linearLayout, -1, -2);
            A0C2.addView(linearLayout, 0);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout2.addView(igImageButton2);
            linearLayout2.addView(igImageButton3);
            int i3 = this.A03;
            int A022 = AnonymousClass7TF.A02(context, R.dimen.photo_grid_spacing);
            int i4 = (i3 - (A022 * 2)) / 3;
            int i5 = (i4 * 2) + A022;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i5, i5);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i5);
            layoutParams3.setMarginEnd(A022);
            linearLayout.addView(linearLayout2, layoutParams3);
            linearLayout.addView(igImageButton, 1, layoutParams2);
            ((BoundedLinearLayout) inflate.requireViewById(R.id.interest_recommendation_info_view)).setMaxWidth(i3);
            JTQ.A0w(inflate.requireViewById(R.id.gradient), -1, i3 / 3);
            int i6 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new UEQ(inflate, inflate.findViewById(R.id.interest_recommendation_dismiss_button), (ImageView) null, Dba.A06(inflate), Dba.A05(inflate), (CircularImageView) inflate.findViewById(R.id.profile_image), (IgImageView) null, (HashtagFollowButton) inflate.findViewById(R.id.hashtag_follow_button), igImageButton, igImageButton2, igImageButton3, (FollowButton) inflate.findViewById(R.id.user_follow_button), this.A0B);
        } else if (i2 == 1) {
            View A0C3 = DbT.A0C(LayoutInflater.from(this.A04), viewGroup2, R.layout.topic_recommendation_card);
            int i7 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            TextView A062 = Dba.A06(A0C3);
            TextView A052 = Dba.A05(A0C3);
            String str = this.A0B;
            return new UEQ(A0C3, (View) null, (ImageView) A0C3.findViewById(R.id.topic_facepile), A062, A052, (CircularImageView) null, A0C3.findViewById(R.id.topic_image), (HashtagFollowButton) null, (IgImageButton) null, (IgImageButton) null, (IgImageButton) null, (FollowButton) null, str);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    public UAK(Context context, AnonymousClass0iw r4, UserSession userSession, C230162p3 r6, Integer num, Runnable runnable, String str, int i) {
        this.A04 = context;
        this.A0A = runnable;
        this.A07 = userSession;
        this.A06 = AnonymousClass1Nd.A00(userSession);
        this.A05 = r4;
        this.A00 = i;
        this.A0B = str;
        this.A09 = num;
        this.A08 = r6;
        this.A03 = (int) (((float) 0nA.A09(context)) * 0.78f);
        this.A0C = new ArrayList();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.content.Context r1, X.AnonymousClass0iw r2, com.instagram.igds.components.imagebutton.IgImageButton r3, java.util.Iterator r4, boolean r5) {
        /*
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0029
            X.1Xj r0 = X.C51966G9m.A0t(r4)
            if (r5 == 0) goto L_0x0024
            com.instagram.common.typedurl.ImageUrl r1 = r0.A1Q()
        L_0x0010:
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
        L_0x0019:
            r3.setUrl(r1, r2)
            r0 = 0
            r3.setEnableTouchOverlay(r0)
        L_0x0020:
            r3.setVisibility(r0)
            return
        L_0x0024:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r0.A1n(r1)
            goto L_0x0010
        L_0x0029:
            r0 = 4
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAK.A01(android.content.Context, X.0iw, com.instagram.igds.components.imagebutton.IgImageButton, java.util.Iterator, boolean):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1883874045);
        int size = this.A0C.size();
        AnonymousClass0fD.A0A(129984350, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(119247348);
        Object obj = this.A0C.get(i);
        if (obj instanceof C17674Vc5) {
            Integer A002 = C18214Vne.A00((C17674Vc5) obj);
            int i2 = 0;
            int i3 = 942373628;
            if (A002 == AnonymousClass05K.A0C) {
                i2 = 1;
                i3 = 1085393605;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return i2;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unknown view type");
        AnonymousClass0fD.A0A(-1695906883, A032);
        throw unsupportedOperationException;
    }
}
