package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4AP  reason: invalid class name */
public final class AnonymousClass4AP extends C232232tF {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 2el A03;
    public final AnonymousClass4AD A04;

    public AnonymousClass4AP(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, 2el r5, AnonymousClass4AD r6) {
        0qQ.A0B(r6, 6);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = fragmentActivity;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.layout_media_note_stack, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C67582MqG(inflate, this.A00, this.A01, this.A02, this.A04);
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        this.A03.A04(r3.itemView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r1.length() == 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        if (r1.length() == 0) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02a2, code lost:
        if (((long) r14) < r12) goto L_0x02a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r20, X.C249703kE r21) {
        /*
            r19 = this;
            r3 = r21
            r4 = r20
            X.4AT r4 = (X.AnonymousClass4AT) r4
            X.MqG r3 = (X.C67582MqG) r3
            r2 = 0
            X.0qQ.A0B(r4, r2)
            r5 = 1
            X.0qQ.A0B(r3, r5)
            X.30Y r6 = r4.A00
            if (r6 == 0) goto L_0x001d
            r0 = r19
            X.2el r1 = r0.A03
            android.view.View r0 = r3.itemView
            r1.A05(r0, r6)
        L_0x001d:
            java.lang.String r1 = r4.A0C
            java.lang.String r0 = "media_note_author_stack"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01ac
            com.instagram.common.session.UserSession r12 = r3.A03
            X.0Tu r8 = X.0Tu.A05
            r0 = 2342171272828828848(0x2081105d00163cb0, double:4.072592724888973E-152)
            boolean r0 = X.182.A06(r8, r12, r0)
            if (r0 == 0) goto L_0x00de
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A06
            r7 = 8
            r0.setVisibility(r7)
            java.util.Map r0 = r4.A0E
            java.util.Collection r0 = r0.values()
            java.util.List r0 = X.00k.A0a(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r3.A08
            r6 = 0
            java.lang.Object r1 = r0.get(r2)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0iw r0 = r3.A02
            r10.setUrl(r1, r0)
            r10.setVisibility(r2)
            int r0 = r4.A01
            int r9 = r0 % 2
            r0 = 36609738591901614(0x82105d001717ae, double:3.2154843288789364E-306)
            long r0 = X.182.A01(r8, r12, r0)
            float r8 = (float) r0
            if (r9 == 0) goto L_0x0069
            float r8 = -r8
        L_0x0069:
            r10.setRotation(r8)
            android.widget.TextView r10 = r3.A00
            java.util.List r8 = r4.A0D
            r9 = 0
            if (r8 == 0) goto L_0x00dc
            java.lang.Object r0 = r8.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0085
            java.lang.String r1 = r0.A0Q()
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0091
        L_0x0085:
            java.lang.Object r0 = r8.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = r0.getUsername()
        L_0x0091:
            r10.setText(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0A
            r0.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A09
            r0.setVisibility(r7)
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x01a0
            com.instagram.api.schemas.NoteCustomThemeImpl r0 = r4.A05
            X.C67582MqG.A00(r0, r3)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r8 = r3.A0C
            r8.setVisibility(r2)
            java.lang.CharSequence r7 = X.C66889MeU.A04(r12, r1)
            X.DIm r1 = X.C46008DIm.A00
            java.lang.String r0 = ""
            r8.setText(r7, r2, r0, r1)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentNoteLayout$default(r8, r2, r5, r9)
        L_0x00ba:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r3.A07
            java.lang.Boolean r1 = r4.A07
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00ca
            r6 = 8
        L_0x00ca:
            r2.setVisibility(r6)
        L_0x00cd:
            android.view.View r1 = r3.itemView
            boolean r0 = r4.A0G
            r10 = r0 ^ 1
        L_0x00d3:
            X.MqF r0 = new X.MqF
            r0.<init>(r4, r3, r10)
            r1.setOnTouchListener(r0)
            return
        L_0x00dc:
            r1 = r9
            goto L_0x0091
        L_0x00de:
            java.util.Map r0 = r4.A0E
            java.util.Collection r0 = r0.values()
            java.util.List r7 = X.00k.A0a(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.A08
            r6 = 0
            java.lang.Object r0 = r7.get(r2)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            X.0iw r8 = r3.A02
            r1.setUrl(r0, r8)
            java.lang.Object r1 = X.00k.A0O(r7, r5)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r7 = 8
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A06
            if (r1 == 0) goto L_0x0165
            r0.setUrl(r1, r8)
            r0.setVisibility(r2)
        L_0x0108:
            android.widget.TextView r10 = r3.A00
            java.util.List r9 = r4.A0D
            r8 = 0
            if (r9 == 0) goto L_0x0163
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0121
            java.lang.String r1 = r0.A0Q()
            int r0 = r1.length()
            if (r0 != 0) goto L_0x012d
        L_0x0121:
            java.lang.Object r0 = r9.get(r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0163
            java.lang.String r1 = r0.getUsername()
        L_0x012d:
            r10.setText(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A0A
            r0.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.A09
            if (r9 == 0) goto L_0x0169
            android.content.Context r11 = r1.getContext()
            X.0qQ.A07(r11)
            r0 = 10
            int r0 = X.0Yv.A1E(r9, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x014f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r9.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.OBf r0 = X.C69988NvS.A00(r0)
            r10.add(r0)
            goto L_0x014f
        L_0x0163:
            r1 = r8
            goto L_0x012d
        L_0x0165:
            r0.setVisibility(r7)
            goto L_0x0108
        L_0x0169:
            r1.setVisibility(r7)
            goto L_0x0182
        L_0x016d:
            java.lang.Object r13 = r10.get(r2)
            X.OBf r13 = (X.C70557OBf) r13
            X.NWk r14 = X.C68775NWk.A00
            X.DIn r15 = X.C46009DIn.A00
            X.Mrd r10 = new X.Mrd
            r10.<init>(r11, r12, r13, r14, r15)
            r1.setImageDrawable(r10)
            r1.setVisibility(r2)
        L_0x0182:
            java.lang.String r1 = r4.A09
            if (r1 == 0) goto L_0x01a0
            com.instagram.api.schemas.NoteCustomThemeImpl r0 = r4.A05
            X.C67582MqG.A00(r0, r3)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r9 = r3.A0C
            r9.setVisibility(r2)
            java.lang.CharSequence r7 = X.C66889MeU.A04(r12, r1)
            X.DIl r1 = X.C46007DIl.A00
            java.lang.String r0 = ""
            r9.setText(r7, r2, r0, r1)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentNoteLayout$default(r9, r2, r5, r8)
            goto L_0x00ba
        L_0x01a0:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r3.A0C
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r3.A04
            r0.setVisibility(r7)
            goto L_0x00cd
        L_0x01ac:
            java.util.Map r0 = r4.A0E
            java.util.Collection r0 = r0.values()
            java.util.List r1 = X.00k.A0a(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r3.A08
            r10 = 0
            java.lang.Object r0 = r1.get(r2)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            X.0iw r6 = r3.A02
            r8.setUrl(r0, r6)
            java.lang.Object r0 = X.00k.A0O(r1, r5)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r1 = 8
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r3.A06
            if (r0 == 0) goto L_0x0210
            r7.setUrl(r0, r6)
            r7.setVisibility(r2)
        L_0x01d6:
            X.C67582MqG.A01(r4, r3)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.A09
            r0.setVisibility(r1)
            java.util.List r11 = r4.A0D
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r3.A0A
            if (r11 == 0) goto L_0x0214
            android.content.Context r12 = r6.getContext()
            X.0qQ.A07(r12)
            com.instagram.common.session.UserSession r13 = r3.A03
            r0 = 10
            int r0 = X.0Yv.A1E(r11, r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x01fc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0218
            java.lang.Object r0 = r11.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.OBf r0 = X.C69988NvS.A00(r0)
            r9.add(r0)
            goto L_0x01fc
        L_0x0210:
            r7.setVisibility(r1)
            goto L_0x01d6
        L_0x0214:
            r6.setVisibility(r1)
            goto L_0x0229
        L_0x0218:
            X.NWj r14 = X.C68774NWj.A00
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.NQp r11 = new X.NQp
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r6.setImageDrawable(r11)
            r6.setVisibility(r2)
        L_0x0229:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r0 = r3.A0C
            r0.setVisibility(r1)
            boolean r1 = r4.A0F
            if (r1 != 0) goto L_0x0333
            android.content.Context r11 = r8.getContext()
            r9 = 2130970278(0x7f0406a6, float:1.7549262E38)
            int r0 = X.2Yu.A0H(r11, r9)
            int r0 = r11.getColor(r0)
            r8.setColorFilter(r0)
            android.content.Context r8 = r7.getContext()
            int r0 = X.2Yu.A0H(r8, r9)
            int r0 = r8.getColor(r0)
            r7.setColorFilter(r0)
            int r0 = X.2Yu.A0H(r8, r9)
            int r0 = r8.getColor(r0)
            r6.setColorFilter(r0)
            android.widget.TextView r9 = r3.A00
            android.content.Context r8 = r9.getContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x0267:
            int r0 = X.2Yu.A0H(r8, r0)
            int r0 = r8.getColor(r0)
            r9.setTextColor(r0)
            if (r1 == 0) goto L_0x02a4
            com.instagram.common.session.UserSession r7 = r3.A03
            X.0Tu r6 = X.0Tu.A05
            r0 = 2342171272827518111(0x2081105d00023c9f, double:4.072592723777579E-152)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x02a4
            X.1Av r0 = X.1Au.A00(r7)
            X.0xa r12 = r0.A01
            java.lang.String r11 = "last_media_note_stack_open_time"
            r0 = 0
            long r17 = r12.getLong(r11, r0)
            int r14 = r4.A03
            r15 = 0
            if (r14 < 0) goto L_0x02a8
            r11 = 1000(0x3e8, double:4.94E-321)
            long r12 = r17 / r11
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x02a8
            long r0 = (long) r14
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x02a8
        L_0x02a4:
            android.view.View r1 = r3.itemView
            goto L_0x00d3
        L_0x02a8:
            r0 = 36609738590459818(0x82105d000117aa, double:3.215484327967139E-306)
            long r12 = X.182.A01(r6, r7, r0)
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x02cb
            int r11 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x02cb
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r17
            long r6 = X.182.A01(r6, r7, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x02cb
            goto L_0x02a4
        L_0x02cb:
            boolean r0 = X.C61670oa.A0B()
            if (r0 == 0) goto L_0x0330
            X.1QG r0 = X.1QE.A0E()
        L_0x02d5:
            int r0 = X.1QE.A05(r8, r0)
            int r6 = r8.getColor(r0)
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            int r0 = X.2Yu.A0H(r8, r0)
            android.graphics.drawable.Drawable r11 = r8.getDrawable(r0)
            if (r11 == 0) goto L_0x02a4
            android.graphics.drawable.Drawable r1 = r11.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.setColorFilter(r6, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            r6 = 2131165195(0x7f07000b, float:1.79446E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r8.getResources()
            int r0 = r0.getDimensionPixelSize(r6)
            r11.setBounds(r2, r2, r1, r0)
            java.lang.CharSequence r0 = r9.getText()
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            int r6 = r7.length()
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C263324Kh.A02(r11, r7, r6, r0, r2)
            r9.setText(r7)
            r0 = 0
            r9.setTypeface(r0, r5)
            goto L_0x02a4
        L_0x0330:
            X.1QG r0 = X.1QG.A03
            goto L_0x02d5
        L_0x0333:
            r0 = 0
            r8.setColorFilter(r0)
            r7.setColorFilter(r0)
            r6.setColorFilter(r0)
            android.widget.TextView r9 = r3.A00
            android.content.Context r8 = r9.getContext()
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x0267
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4AP.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AnonymousClass4AT.class;
    }
}
