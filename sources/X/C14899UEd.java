package X;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.UEd  reason: case insensitive filesystem */
public final class C14899UEd extends C249703kE {
    public final Context A00;
    public final View A01;
    public final CheckBox A02;
    public final ImageView A03;
    public final TextView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;
    public final FollowButton A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final GradientSpinnerAvatarView A0C;

    public static final void A02(AnonymousClass0iw r9, G7P g7p, X9V x9v, C14899UEd uEd, WSZ wsz) {
        WSZ wsz2 = wsz;
        int intValue = wsz.A00.intValue();
        C14899UEd uEd2 = uEd;
        if (intValue == 11 || intValue == 5) {
            ImageView imageView = uEd.A03;
            imageView.setVisibility(0);
            X9V x9v2 = x9v;
            WB4.A00(imageView, x9v, g7p, wsz, 68);
            if (wsz.A03) {
                ImageView imageView2 = uEd.A08;
                AnonymousClass0fU.A00(new WBF(26, (Object) uEd2, (Object) x9v2, (Object) r9, (Object) wsz2), imageView2);
                imageView2.setVisibility(0);
                return;
            }
            ImageView imageView3 = uEd.A08;
            imageView3.setVisibility(8);
            imageView3.setOnClickListener((View.OnClickListener) null);
            return;
        }
        ImageView imageView4 = uEd.A03;
        imageView4.setVisibility(8);
        imageView4.setOnClickListener((View.OnClickListener) null);
        ImageView imageView5 = uEd.A08;
        imageView5.setVisibility(8);
        imageView5.setOnClickListener((View.OnClickListener) null);
    }

    public final void A04(AnonymousClass0iw r13, G7P g7p, X9V x9v, WSZ wsz) {
        C273014lo r1;
        Context context;
        int i;
        String string;
        AnonymousClass0iw r7 = r13;
        0qQ.A0B(r13, 1);
        WSZ wsz2 = wsz;
        A03(r13, this, wsz2);
        G7P g7p2 = g7p;
        X9V x9v2 = x9v;
        A02(r13, g7p, x9v, this, wsz2);
        Integer num = wsz2.A00;
        if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0Y || num == AnonymousClass05K.A0u || num == AnonymousClass05K.A15 || num == AnonymousClass05K.A1I) {
            switch (num.intValue()) {
                case 1:
                case 4:
                case 6:
                case 7:
                case 9:
                    r1 = C273014lo.PRIMARY;
                    break;
                case 2:
                    r1 = C273014lo.SECONDARY;
                    break;
                default:
                    C13991Tnr.A1G(num, "Illegal participant role for removeCancelButtonStyle: ");
                    break;
            }
            this.A06.setStyle(r1);
            IgdsButton igdsButton = this.A06;
            Integer num2 = wsz2.A00;
            switch (num2.intValue()) {
                case 1:
                case 4:
                    context = this.A00;
                    i = 2131963933;
                    break;
                case 2:
                    context = this.A00;
                    i = 2131963930;
                    break;
                case 6:
                    context = this.A00;
                    i = 2131963928;
                    break;
                case 7:
                    context = this.A00;
                    i = 2131963931;
                    break;
                case 9:
                    context = this.A00;
                    i = 2131963929;
                    break;
                default:
                    C13991Tnr.A1G(num2, "Illegal participant role for removeCancelButtonText: ");
                    string = null;
                    break;
            }
            string = context.getString(i);
            igdsButton.setText(string);
            AnonymousClass0fU.A00(new WA8(4, r7, x9v2, this, g7p2, wsz2), igdsButton);
            Integer num3 = wsz2.A00;
            if (num3 == AnonymousClass05K.A15 || num3 == AnonymousClass05K.A0u) {
                igdsButton.setEnabled(wsz2.A03);
            } else {
                igdsButton.setEnabled(true);
            }
            igdsButton.setVisibility(0);
            return;
        }
        IgdsButton igdsButton2 = this.A06;
        igdsButton2.setVisibility(8);
        igdsButton2.setOnClickListener((View.OnClickListener) null);
    }

    public static final void A01(AnonymousClass0iw r4, UserSession userSession, X9V x9v, C14899UEd uEd, WSZ wsz, 0sP r9) {
        User user = wsz.A01;
        if (user.B6o() == FollowStatus.A08 || user.B6o() == FollowStatus.A04) {
            uEd.A07.setVisibility(8);
            return;
        }
        C267064at r2 = uEd.A07.A0J;
        r2.A07(new C16363Utg(1, r9, x9v, wsz));
        r2.A03(r4, userSession, user);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r7.length() == 0) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass0iw r8, X.C14899UEd r9, X.WSZ r10) {
        /*
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = r9.A0C
            com.instagram.user.model.User r4 = r10.A01
            com.instagram.common.typedurl.ImageUrl r1 = r4.Bh3()
            r0 = 0
            r2.A0F(r0, r8, r1)
            android.widget.TextView r0 = r9.A0B
            X.DbU.A1H(r0, r4)
            java.lang.String r8 = r4.getFullName()
            r3 = 1
            r5 = 0
            if (r8 == 0) goto L_0x00f4
            int r0 = r8.length()
            if (r0 == 0) goto L_0x00f4
            r6 = r8
        L_0x0020:
            java.lang.Integer r1 = r10.A00
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r8 == 0) goto L_0x0044
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 == r0) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 == r0) goto L_0x0044
            java.lang.String r0 = " • "
            r7.append(r0)
        L_0x0044:
            int r0 = r1.intValue()
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x004b;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00d7;
                case 5: goto L_0x004b;
                case 6: goto L_0x004b;
                case 7: goto L_0x004b;
                case 8: goto L_0x004b;
                case 9: goto L_0x004b;
                case 10: goto L_0x00e3;
                case 11: goto L_0x00e3;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.String r0 = ""
        L_0x004d:
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r7)
            X.0qQ.A07(r0)
            java.lang.String r7 = X.002.A0R(r6, r0)
            if (r7 == 0) goto L_0x0061
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L_0x0062
        L_0x0061:
            r1 = 1
        L_0x0062:
            r6 = 8
            android.widget.TextView r0 = r9.A09
            if (r1 != 0) goto L_0x00d3
            r0.setText(r7)
            r0.setVisibility(r5)
        L_0x006e:
            java.lang.Integer r1 = r10.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x0078
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            if (r1 != r0) goto L_0x00c0
        L_0x0078:
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BxN()
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c0
            android.widget.TextView r1 = r9.A0A
            X.4Cl r0 = r4.A03
            java.lang.String r0 = r0.BxN()
        L_0x008e:
            r1.setText(r0)
            r1.setVisibility(r5)
        L_0x0094:
            java.lang.Integer r1 = r10.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x00bf
            X.4Cl r0 = r4.A03
            java.lang.Boolean r0 = r0.COI()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x00bf
            android.content.Context r3 = r9.A00
            r0 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.setBottomBadgeDrawable(r0)
            r1 = 2
            float r0 = X.0nA.A04(r3, r1)
            r2.A00 = r0
            float r0 = X.0nA.A04(r3, r1)
            r2.A01 = r0
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.String r0 = r10.A02
            if (r0 == 0) goto L_0x00cd
            int r1 = r0.length()
            if (r1 == 0) goto L_0x00cd
            android.widget.TextView r1 = r9.A0A
            goto L_0x008e
        L_0x00cd:
            android.widget.TextView r0 = r9.A0A
            r0.setVisibility(r6)
            goto L_0x0094
        L_0x00d3:
            r0.setVisibility(r6)
            goto L_0x006e
        L_0x00d7:
            android.content.Context r1 = r9.A00
            r0 = 2131963937(0x7f133021, float:1.9564641E38)
            goto L_0x00ee
        L_0x00dd:
            android.content.Context r1 = r9.A00
            r0 = 2131963935(0x7f13301f, float:1.9564637E38)
            goto L_0x00ee
        L_0x00e3:
            android.content.Context r1 = r9.A00
            r0 = 2131963936(0x7f133020, float:1.956464E38)
            goto L_0x00ee
        L_0x00e9:
            android.content.Context r1 = r9.A00
            r0 = 2131963934(0x7f13301e, float:1.9564635E38)
        L_0x00ee:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x004d
        L_0x00f4:
            java.lang.String r6 = ""
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14899UEd.A03(X.0iw, X.UEd, X.WSZ):void");
    }

    public C14899UEd(View view) {
        super(view);
        this.A01 = view;
        this.A00 = view.getContext();
        this.A0C = (GradientSpinnerAvatarView) AnonymousClass7TE.A0b(view, R.id.user_profile_picture);
        this.A0B = DbW.A0B(view, R.id.user_title);
        this.A09 = DbW.A0B(view, R.id.user_subtitle);
        this.A0A = DbW.A0B(view, R.id.user_social_context);
        this.A07 = (FollowButton) AnonymousClass7TE.A0b(view, R.id.user_follow_button);
        this.A05 = C13989Tnp.A0X(view, R.id.user_friend_chat_leave_button);
        this.A04 = DbW.A0B(view, R.id.viewer_wave_button);
        this.A06 = C13989Tnp.A0X(view, R.id.user_room_action_button);
        this.A03 = (ImageView) AnonymousClass7TE.A0b(view, R.id.user_more_button);
        this.A08 = (ImageView) AnonymousClass7TE.A0b(view, R.id.user_invite_button);
        this.A02 = (CheckBox) AnonymousClass7TE.A0b(view, R.id.user_checkbox);
    }

    public static final Integer A00(AnonymousClass0iw r2) {
        if (0qQ.A0K(r2.getModuleName(), AnonymousClass000.A00(4363))) {
            return AnonymousClass05K.A01;
        }
        if (0qQ.A0K(r2.getModuleName(), AnonymousClass000.A00(4364))) {
            return AnonymousClass05K.A0N;
        }
        if (0qQ.A0K(r2.getModuleName(), AnonymousClass000.A00(5007))) {
            return AnonymousClass05K.A04;
        }
        return AnonymousClass05K.A06;
    }
}
