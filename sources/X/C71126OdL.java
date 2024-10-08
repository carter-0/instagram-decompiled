package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.user.model.User;

/* renamed from: X.OdL  reason: case insensitive filesystem */
public final class C71126OdL {
    public long A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public ConstraintLayout A03;
    public IgEditText A04;
    public IgSimpleImageView A05;
    public IgTextView A06;
    public IgImageView A07;
    public IgImageView A08;
    public IgImageView A09;
    public C74511Pw6 A0A;
    public C308476Uk A0B;
    public AnonymousClass7JI A0C;
    public IgBouncyUfiButtonImageView A0D;
    public Long A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public IgTextView A0M;
    public final Context A0N;
    public final BaseFragmentActivity A0O;
    public final AnonymousClass4DH A0P;
    public final UserSession A0Q;
    public final IgLinearLayout A0R;
    public final C74499Pvt A0S;
    public final C63939LEc A0T = new C63939LEc();
    public final C67755MuA A0U;
    public final C333537Zi A0V;
    public final 2Dm A0W;
    public final C234502xy A0X;
    public final 17i A0Y;
    public final String A0Z;
    public final AnonymousClass0eM A0a = AnonymousClass0eN.A01(C73924Pm4.A01(this, 35));
    public final AnonymousClass0eM A0b = AnonymousClass0eN.A01(C73924Pm4.A01(this, 36));
    public final boolean A0c;
    public final boolean A0d;
    public final Bundle A0e;

    public C71126OdL(Context context, Bundle bundle, BaseFragmentActivity baseFragmentActivity, AnonymousClass4DH r5, UserSession userSession, IgLinearLayout igLinearLayout, C74499Pvt pvt, C67755MuA muA, C234502xy r10, String str, long j, boolean z, boolean z2) {
        0qQ.A0B(userSession, 5);
        0qQ.A0B(muA, 11);
        this.A0N = context;
        this.A0P = r5;
        this.A0e = bundle;
        this.A0O = baseFragmentActivity;
        this.A0Q = userSession;
        this.A00 = j;
        this.A0c = z;
        this.A0S = pvt;
        this.A0R = igLinearLayout;
        this.A0X = r10;
        this.A0U = muA;
        this.A0Z = str;
        this.A0d = z2;
        this.A0V = C333527Zh.A00(userSession);
        this.A0W = 1bJ.A00(userSession);
        this.A0Y = 17h.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r0v56, types: [X.07Z, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016d, code lost:
        if (r11 == false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x016f, code lost:
        if (r16 != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0171, code lost:
        if (r15 != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0175, code lost:
        if (r5.A0c != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0179, code lost:
        if (r4.A05 != null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x017b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0185, code lost:
        if (X.182.A06(r2, r3, 36321245637190849L) != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0187, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0188, code lost:
        r5.A0J = r1;
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x018d, code lost:
        if (r4.A0L != false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018f, code lost:
        r0 = X.AnonymousClass4AJ.A08(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0193, code lost:
        if (r0 != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0195, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0196, code lost:
        r5.A0H = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x019a, code lost:
        if (r5.A01 == null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x019c, code lost:
        r11 = 0;
        r0 = X.182.A06(r2, r3, 36320511197782534L);
        r13 = 0;
        r14 = 8;
        r1 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ab, code lost:
        if (r0 == false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ad, code lost:
        if (r1 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01af, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b2, code lost:
        r1 = r5.A02;
        r6 = "smashableSendButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01b6, code lost:
        if (r1 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b8, code lost:
        X.C71408Ok7.A00(r1, 23, r5, r4);
        r0 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01bf, code lost:
        if (r0 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c1, code lost:
        r6 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c3, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c8, code lost:
        r1 = r0.getLayoutParams();
        X.0qQ.A0C(r1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        r1 = (X.C71492dQ) r1;
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d5, code lost:
        if (r0 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d7, code lost:
        r1.A0N = r0.getId();
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01df, code lost:
        if (r0 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01e1, code lost:
        r1 = new X.C308476Uk(r0);
        r5.A0B = r1;
        r1.A00(X.1QE.A0B(r7, (X.1QG) null).getDefaultColor(), false);
        r6 = r5.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f5, code lost:
        if (r6 == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f7, code lost:
        r6.A02.getDrawable().setTint(X.1QE.A0C(r7, (X.1QG) null).getDefaultColor());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0209, code lost:
        if (r1 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x020d, code lost:
        if (r5.A0I != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0211, code lost:
        if (r5.A0L != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0215, code lost:
        if (r5.A0J != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0217, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0218, code lost:
        r1.setVisibility(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x021b, code lost:
        r1 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x021d, code lost:
        if (r1 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x021f, code lost:
        X.DbT.A17(r7, r1, X.1QE.A01(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0226, code lost:
        r1 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0228, code lost:
        if (r1 == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x022a, code lost:
        X.C71408Ok7.A00(r1, 23, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x022f, code lost:
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0231, code lost:
        if (r1 != null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0233, code lost:
        r6 = "replyMessageContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0236, code lost:
        r5.A07 = X.DbT.A0b(r1, com.instagram.android.R.id.note_quick_reply_composer_button_left);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0243, code lost:
        if (A04(r4) == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x024e, code lost:
        if (X.182.A06(r2, r3, 36324917834297828L) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0250, code lost:
        if (r16 != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0252, code lost:
        if (r15 != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0256, code lost:
        if (r4.A05 != null) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x025a, code lost:
        if (r5.A0c != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0265, code lost:
        if (X.182.A06(r2, r3, 36320738831115049L) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0267, code lost:
        r6 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0269, code lost:
        if (r6 != null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x026b, code lost:
        r6 = "composerButtonLeft";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x026f, code lost:
        r6.setVisibility(0);
        r14 = r6.getContext();
        r15 = X.AnonymousClass7TG.A03(r14);
        r6.setPadding(r15, r15, r15, r15);
        r1 = r14.getDrawable(com.instagram.android.R.drawable.direct_message_composer_thread_camera_icon);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0284, code lost:
        if (r1 == null) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0286, code lost:
        X.AnonymousClass7TE.A1R(r1, X.1QE.A0C(r14, (X.1QG) null).getDefaultColor());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0291, code lost:
        r6.setImageDrawable(r1);
        r1 = new android.graphics.drawable.ShapeDrawable(new X.AnonymousClass7BX((float) r15));
        X.C66582MXn.A11(r1, X.1QE.A0B(r14, (X.1QG) null).getDefaultColor());
        r6.setBackground(r1);
        X.DbT.A1A(r14.getResources(), r6, 2131963752);
        X.C68642NQw.A00(X.AnonymousClass7TE.A0m(r6), r4, r5, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02bf, code lost:
        r1 = r5.A03;
        r6 = "replyMessageContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02c3, code lost:
        if (r1 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c5, code lost:
        r1 = X.JTO.A0Y(r1, com.instagram.android.R.id.note_quick_reply_voice_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ce, code lost:
        if (r5.A0I != false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d0, code lost:
        r11 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02d2, code lost:
        r1.setVisibility(r11);
        r5.A09 = r1;
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d9, code lost:
        if (r1 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02db, code lost:
        r1 = X.JTO.A0Y(r1, com.instagram.android.R.id.note_quick_reply_sticker_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02e4, code lost:
        if (r5.A0L != false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02e8, code lost:
        if (r5.A0J != false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02ea, code lost:
        r13 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ec, code lost:
        r1.setVisibility(r13);
        X.C71397Ojw.A00(r1, 32, r5);
        r5.A08 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02f8, code lost:
        if (r5.A0C != null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02fa, code lost:
        r1 = r20.A02(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0300, code lost:
        if (r1 == null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0302, code lost:
        r0 = new com.instagram.model.direct.DirectShareTarget(r1);
        r13 = r5.A0R;
        r15 = r5.A01;
        r6 = "replyComposerContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x030d, code lost:
        if (r15 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x030f, code lost:
        r16 = X.DbY.A0T(r15, com.instagram.android.R.id.note_composer_voice_recording_stub);
        r17 = X.DbY.A0S(r13, com.instagram.android.R.id.note_composer_voice_lock_stub);
        r12 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x031f, code lost:
        if (r12 != null) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0321, code lost:
        r6 = "voiceRecorderButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0325, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0328, code lost:
        r0 = X.AnonymousClass4AJ.A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0330, code lost:
        if (r4.A05 == null) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0332, code lost:
        r0 = X.AnonymousClass7TF.A0e(r7.getResources(), r4.A09, 2131956640);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0341, code lost:
        r1 = r7.getResources();
        r0 = 2131968608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0348, code lost:
        if (r16 == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x034a, code lost:
        r0 = 2131960939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0352, code lost:
        r11 = new X.AnonymousClass7JE(r12, r13, r13, r15, r16, r17);
        r6 = new X.PFS(r5, r4);
        r1 = X.AnonymousClass1YB.A00(X.C73924Pm4.A01(r5, 37));
        r0 = X.AnonymousClass7JH.A00(r7, r3, (X.C331037Pg) null, r6, r11, X.DbS.A0c(r0), true, true);
        r0.A0G(r1);
        r5.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0382, code lost:
        r1 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0384, code lost:
        if (r1 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0386, code lost:
        r1.removeTextChangedListener((android.text.TextWatcher) r5.A0a.getValue());
        r1 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0393, code lost:
        if (r1 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0395, code lost:
        r1.addTextChangedListener(new X.C71274OhF(1, (java.lang.Object) r5, (java.lang.Object) r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x039f, code lost:
        if (r5.A0H == false) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03a1, code lost:
        r6 = new X.C72379P3s(r5, 1);
        r12 = r5.A0U;
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03aa, code lost:
        if (r0 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03ac, code lost:
        r13 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03ae, code lost:
        r0 = r5.A00;
        r11 = r4.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03b2, code lost:
        if (r13 == null) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03b4, code lost:
        r7 = r12.A03.A05(r13, java.lang.String.valueOf(r0));
        r11 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03c0, code lost:
        if (r7 == false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03c2, code lost:
        r7 = "❤️";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03c4, code lost:
        r11.Epw(r7);
        X.AnonymousClass7TE.A1Z(new X.MGA((java.lang.Object) r12, (X.AnonymousClass4D7) null, 17, r0), X.C318116oQ.A00(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03e0, code lost:
        if (X.182.A06(r2, r3, 36324329423777798L) == false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03e2, code lost:
        r2 = X.C71121OdF.A01;
        r1 = r4.A0B;
        r0 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03e8, code lost:
        if (r0 == null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03f2, code lost:
        if (r2.A04(X.AnonymousClass7TE.A0S(r0), r1) == false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03f4, code lost:
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03f6, code lost:
        if (r1 == null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03f8, code lost:
        r0 = (com.instagram.common.ui.base.IgSimpleImageView) r1.findViewById(com.instagram.android.R.id.note_birthday_animation_image_view);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0401, code lost:
        r5.A05 = r0;
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0405, code lost:
        if (r1 == null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0407, code lost:
        r3 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r1.findViewById(com.instagram.android.R.id.note_like_button);
        r1 = r5.A0T;
        X.0qQ.A0A(r3);
        r1.A01(r5.A05, r3);
        X.AnonymousClass7TE.A1Z(new X.C66167MGe((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) null, 14), X.AnonymousClass07a.A00(r5.A0P));
        r5.A0D = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x042c, code lost:
        r0 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x042e, code lost:
        if (r0 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0430, code lost:
        r0 = r0.getText();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0434, code lost:
        if (r0 == null) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x043a, code lost:
        if (r0.length() == 0) goto L_0x043d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x043c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x043d, code lost:
        A03(r5, r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0440, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0441, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0443, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0445, code lost:
        r13 = r12.A04;
        r16 = ((java.lang.Iterable) r13.A0p.getValue()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0453, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0458, code lost:
        if (r16.hasNext() == false) goto L_0x04b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x045a, code lost:
        r15 = r16.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0462, code lost:
        if (X.C66582MXn.A1U(r15, r0) == false) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0464, code lost:
        r15 = (X.C279864zZ) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0466, code lost:
        if (r15 == null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0468, code lost:
        r7 = r15.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x046a, code lost:
        if (r7 == null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x046c, code lost:
        r7 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x046e, code lost:
        if (r7 == null) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0470, code lost:
        r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) X.00k.A0J(r7);
        r1 = r12.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0478, code lost:
        if (r0 == null) goto L_0x0481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x047a, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x047c, code lost:
        r1.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0481, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0483, code lost:
        r7 = (X.C279894zc) X.JTR.A0z(r11, r13.A0r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x048b, code lost:
        if (r7 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x048d, code lost:
        r7 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x048f, code lost:
        if (r7 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0491, code lost:
        r13 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0499, code lost:
        if (r13.hasNext() == false) goto L_0x04a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x049b, code lost:
        r11 = r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04a3, code lost:
        if (X.C66582MXn.A1U(r11, r0) == false) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x04a5, code lost:
        r14 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x04a6, code lost:
        r14 = (X.C279864zZ) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04a8, code lost:
        if (r14 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04aa, code lost:
        r0 = r14.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04ac, code lost:
        if (r0 == null) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04ae, code lost:
        r7 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04b1, code lost:
        r7 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x04b4, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04b6, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (X.1as.A04.A0H(r5.A0Q, r2) != true) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r2 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (X.1as.A04.A0I(r5.A0Q, r2) == true) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009b, code lost:
        r7 = r5.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r16 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        r0 = com.instagram.android.R.drawable.group_mention_quick_reply_composer_background;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r15 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r0 = com.instagram.android.R.drawable.note_quick_reply_composer_background_shhmode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        r11 = r7.getDrawable(r0);
        r3 = r5.A0Q;
        r2 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        if (X.182.A06(r2, r3, 36320738831311659L) == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        if (r11 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        X.DbX.A11(r7, r11, X.2Yu.A0H(r7, com.instagram.android.R.attr.igds_color_elevated_highlight_background));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r0 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (r0 == null) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        r0.setBackground(r11);
        r13 = r5.A04;
        r19 = "replyMessage";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d1, code lost:
        if (r13 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        if (r4.A0N == false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00db, code lost:
        if (X.AnonymousClass4AJ.A02(r3) == false) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        r1 = r7.getResources();
        r0 = 2131968612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e4, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        r13.setHint(X.DbS.A0C(r0));
        r1 = r5.A0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        if (r1 == null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f9, code lost:
        if (r1.getBoolean("pending_admin_approval") != true) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fb, code lost:
        r0 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fd, code lost:
        if (r0 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0102, code lost:
        r11 = A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0106, code lost:
        if (r11 == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0108, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0112, code lost:
        if (X.182.A06(r2, r3, 36324917834166754L) == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0114, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0115, code lost:
        if (r11 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0121, code lost:
        if (X.182.A06(r2, r3, 36324917834363365L) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0123, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0124, code lost:
        if (r11 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0126, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        if (X.182.A06(r2, r3, 36324917834232291L) == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0133, code lost:
        if (r14 == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0135, code lost:
        if (r16 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0137, code lost:
        if (r15 != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013b, code lost:
        if (r4.A05 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013f, code lost:
        if (r5.A0c != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0141, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014b, code lost:
        if (X.182.A06(r2, r3, 36320738831049512L) != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014e, code lost:
        r5.A0I = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0150, code lost:
        if (r13 == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0152, code lost:
        if (r16 != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0154, code lost:
        if (r15 != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0158, code lost:
        if (r4.A05 != null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015c, code lost:
        if (r5.A0c != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x015e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0168, code lost:
        if (X.182.A06(r2, r3, 36321245637125312L) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016a, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016b, code lost:
        r5.A0L = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C68770NWf r29) {
        /*
            r28 = this;
            r9 = 0
            r4 = r29
            X.0qQ.A0B(r4, r9)
            r5 = r28
            X.0eM r0 = r5.A0b
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            r6 = 8
            r10 = 0
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.A0A
            long r0 = java.lang.Long.parseLong(r0)
            r5.A00 = r0
            com.instagram.common.ui.base.IgEditText r0 = r5.A04
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "replyMessage"
            r0.requestFocus()
            com.instagram.common.ui.base.IgEditText r0 = r5.A04
            if (r0 != 0) goto L_0x0030
            X.0qQ.A0F(r1)
        L_0x002b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0030:
            X.0nA.A0S(r0)
        L_0x0033:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 != 0) goto L_0x003a
            java.lang.String r19 = "smashableSendButton"
            goto L_0x005d
        L_0x003a:
            r0.setVisibility(r6)
        L_0x003d:
            android.widget.FrameLayout r0 = r5.A01
            java.lang.String r18 = "replyComposerContainer"
            if (r0 == 0) goto L_0x04be
            r0.setVisibility(r9)
            boolean r0 = r4.A0H
            java.lang.String r17 = "replyMessageContainer"
            if (r0 != 0) goto L_0x0064
            boolean r0 = r5.A0d
            if (r0 != 0) goto L_0x0064
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.A03
            if (r0 == 0) goto L_0x04b9
            r0.setVisibility(r6)
            com.instagram.common.ui.base.IgTextView r0 = r5.A0M
            if (r0 != 0) goto L_0x0061
            java.lang.String r19 = "blockMessageView"
        L_0x005d:
            X.0qQ.A0F(r19)
            goto L_0x002b
        L_0x0061:
            r0.setVisibility(r9)
        L_0x0064:
            X.P45 r0 = new X.P45
            r0.<init>(r5, r4)
            r5.A0A = r0
            X.17i r0 = r5.A0Y
            r20 = r0
            java.lang.String r12 = r4.A08
            com.instagram.user.model.User r0 = r0.A02(r12)
            if (r0 == 0) goto L_0x034f
            com.instagram.model.direct.DirectShareTarget r2 = new com.instagram.model.direct.DirectShareTarget
            r2.<init>((com.instagram.user.model.User) r0)
        L_0x007c:
            r8 = 1
            if (r2 == 0) goto L_0x008b
            X.1as r1 = X.1as.A04
            com.instagram.common.session.UserSession r0 = r5.A0Q
            boolean r0 = r1.A0H(r0, r2)
            r16 = 1
            if (r0 == r8) goto L_0x008f
        L_0x008b:
            r16 = 0
            if (r2 == 0) goto L_0x009a
        L_0x008f:
            X.1as r1 = X.1as.A04
            com.instagram.common.session.UserSession r0 = r5.A0Q
            boolean r0 = r1.A0I(r0, r2)
            r15 = 1
            if (r0 == r8) goto L_0x009b
        L_0x009a:
            r15 = 0
        L_0x009b:
            android.content.Context r7 = r5.A0N
            if (r16 != 0) goto L_0x00a4
            r0 = 2131237427(0x7f081a33, float:1.8091104E38)
            if (r15 == 0) goto L_0x00a7
        L_0x00a4:
            r0 = 2131239369(0x7f0821c9, float:1.8095043E38)
        L_0x00a7:
            android.graphics.drawable.Drawable r11 = r7.getDrawable(r0)
            com.instagram.common.session.UserSession r3 = r5.A0Q
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320738831311659(0x8109850005232b, double:3.032719716573219E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00c6
            if (r11 == 0) goto L_0x00c6
            r0 = 2130970211(0x7f040663, float:1.7549126E38)
            int r0 = X.2Yu.A0H(r7, r0)
            X.DbX.A11(r7, r11, r0)
        L_0x00c6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r5.A03
            if (r0 == 0) goto L_0x04b9
            r0.setBackground(r11)
            com.instagram.common.ui.base.IgEditText r13 = r5.A04
            java.lang.String r19 = "replyMessage"
            if (r13 == 0) goto L_0x005d
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x032e
            boolean r0 = X.AnonymousClass4AJ.A02(r3)
            if (r0 == 0) goto L_0x032e
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131968612(0x7f134264, float:1.9574124E38)
        L_0x00e4:
            java.lang.String r0 = r1.getString(r0)
        L_0x00e8:
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r0)
            r13.setHint(r0)
            android.os.Bundle r1 = r5.A0e
            if (r1 == 0) goto L_0x0102
            java.lang.String r0 = "pending_admin_approval"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r8) goto L_0x0102
            com.instagram.common.ui.base.IgEditText r0 = r5.A04
            if (r0 == 0) goto L_0x005d
            r0.setVisibility(r6)
        L_0x0102:
            boolean r11 = r5.A04(r4)
            if (r11 == 0) goto L_0x0114
            r0 = 36324917834166754(0x810d52000031e2, double:3.035362534806275E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r14 = 0
            if (r0 == 0) goto L_0x0117
        L_0x0114:
            r14 = 1
            if (r11 == 0) goto L_0x0123
        L_0x0117:
            r0 = 36324917834363365(0x810d52000331e5, double:3.0353625349306125E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r13 = 0
            if (r0 == 0) goto L_0x0126
        L_0x0123:
            r13 = 1
            if (r11 == 0) goto L_0x0132
        L_0x0126:
            r0 = 36324917834232291(0x810d52000131e3, double:3.035362534847721E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r11 = 0
            if (r0 == 0) goto L_0x0133
        L_0x0132:
            r11 = 1
        L_0x0133:
            if (r14 == 0) goto L_0x014d
            if (r16 != 0) goto L_0x014d
            if (r15 != 0) goto L_0x014d
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 != 0) goto L_0x014d
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x014d
            r0 = 36320738831049512(0x81098500012328, double:3.032719716407436E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x014e
        L_0x014d:
            r1 = 0
        L_0x014e:
            r5.A0I = r1
            if (r13 == 0) goto L_0x016a
            if (r16 != 0) goto L_0x016a
            if (r15 != 0) goto L_0x016a
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 != 0) goto L_0x016a
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x016a
            r0 = 36321245637125312(0x8109fb000024c0, double:3.0330402226105164E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x016b
        L_0x016a:
            r1 = 0
        L_0x016b:
            r5.A0L = r1
            if (r11 == 0) goto L_0x0187
            if (r16 != 0) goto L_0x0187
            if (r15 != 0) goto L_0x0187
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x0187
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 != 0) goto L_0x0187
            r0 = 36321245637190849(0x8109fb000124c1, double:3.033040222651962E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            r5.A0J = r1
            boolean r0 = r4.A0L
            r1 = 1
            if (r0 != 0) goto L_0x0328
            boolean r0 = X.AnonymousClass4AJ.A08(r3)
        L_0x0193:
            if (r0 != 0) goto L_0x0196
            r1 = 0
        L_0x0196:
            r5.A0H = r1
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x04be
            r11 = 0
            r0 = 36320511197782534(0x81095000012206, double:3.032575760212794E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r13 = 0
            r14 = 8
            com.instagram.common.ui.base.IgTextView r1 = r5.A06
            if (r0 == 0) goto L_0x0209
            if (r1 == 0) goto L_0x01b2
            r1.setVisibility(r6)
        L_0x01b2:
            android.widget.FrameLayout r1 = r5.A02
            java.lang.String r6 = "smashableSendButton"
            if (r1 == 0) goto L_0x01c3
            r0 = 23
            X.C71408Ok7.A00(r1, r0, r5, r4)
            com.instagram.common.ui.base.IgEditText r0 = r5.A04
            if (r0 != 0) goto L_0x01c8
            r6 = r19
        L_0x01c3:
            X.0qQ.A0F(r6)
            goto L_0x002b
        L_0x01c8:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x01c3
            int r0 = r0.getId()
            r1.A0N = r0
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x01c3
            X.6Uk r1 = new X.6Uk
            r1.<init>(r0)
            r5.A0B = r1
            android.content.res.ColorStateList r0 = X.1QE.A0B(r7, r10)
            int r0 = r0.getDefaultColor()
            r1.A00(r0, r9)
            X.6Uk r6 = r5.A0B
            if (r6 == 0) goto L_0x022f
            android.content.res.ColorStateList r0 = X.1QE.A0C(r7, r10)
            int r1 = r0.getDefaultColor()
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A02
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r0.setTint(r1)
            goto L_0x022f
        L_0x0209:
            if (r1 == 0) goto L_0x021b
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x0218
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0218
            boolean r0 = r5.A0J
            if (r0 != 0) goto L_0x0218
            r14 = 0
        L_0x0218:
            r1.setVisibility(r14)
        L_0x021b:
            com.instagram.common.ui.base.IgTextView r1 = r5.A06
            if (r1 == 0) goto L_0x0226
            int r0 = X.1QE.A01(r7)
            X.DbT.A17(r7, r1, r0)
        L_0x0226:
            com.instagram.common.ui.base.IgTextView r1 = r5.A06
            if (r1 == 0) goto L_0x022f
            r0 = 23
            X.C71408Ok7.A00(r1, r0, r5, r4)
        L_0x022f:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 != 0) goto L_0x0236
            r6 = r17
            goto L_0x01c3
        L_0x0236:
            r0 = 2131437050(0x7f0b25fa, float:1.8495988E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r5.A07 = r0
            boolean r0 = r5.A04(r4)
            if (r0 == 0) goto L_0x0250
            r0 = 36324917834297828(0x810d52000231e4, double:3.0353625348891666E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02bf
        L_0x0250:
            if (r16 != 0) goto L_0x02bf
            if (r15 != 0) goto L_0x02bf
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 != 0) goto L_0x02bf
            boolean r0 = r5.A0c
            if (r0 != 0) goto L_0x02bf
            r0 = 36320738831115049(0x81098500022329, double:3.032719716448882E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x02bf
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r5.A07
            if (r6 != 0) goto L_0x026f
            java.lang.String r6 = "composerButtonLeft"
            goto L_0x01c3
        L_0x026f:
            r6.setVisibility(r9)
            android.content.Context r14 = r6.getContext()
            int r15 = X.AnonymousClass7TG.A03(r14)
            r6.setPadding(r15, r15, r15, r15)
            r0 = 2131231588(0x7f080364, float:1.8079261E38)
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r0)
            if (r1 == 0) goto L_0x0325
            android.content.res.ColorStateList r0 = X.1QE.A0C(r14, r10)
            int r0 = r0.getDefaultColor()
            X.AnonymousClass7TE.A1R(r1, r0)
        L_0x0291:
            r6.setImageDrawable(r1)
            float r1 = (float) r15
            X.7BX r0 = new X.7BX
            r0.<init>(r1)
            android.graphics.drawable.ShapeDrawable r1 = new android.graphics.drawable.ShapeDrawable
            r1.<init>(r0)
            android.content.res.ColorStateList r0 = X.1QE.A0B(r14, r10)
            int r0 = r0.getDefaultColor()
            X.C66582MXn.A11(r1, r0)
            r6.setBackground(r1)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131963752(0x7f132f68, float:1.9564266E38)
            X.DbT.A1A(r1, r6, r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r6)
            r0 = 5
            X.C68642NQw.A00(r1, r4, r5, r0)
        L_0x02bf:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            r6 = r17
            if (r1 == 0) goto L_0x01c3
            r0 = 2131437067(0x7f0b260b, float:1.8496022E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.JTO.A0Y(r1, r0)
            boolean r0 = r5.A0I
            if (r0 != 0) goto L_0x02d2
            r11 = 8
        L_0x02d2:
            r1.setVisibility(r11)
            r5.A09 = r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A03
            if (r1 == 0) goto L_0x01c3
            r0 = 2131437064(0x7f0b2608, float:1.8496016E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.JTO.A0Y(r1, r0)
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x02ec
            boolean r0 = r5.A0J
            if (r0 != 0) goto L_0x02ec
            r13 = 8
        L_0x02ec:
            r1.setVisibility(r13)
            r0 = 32
            X.C71397Ojw.A00(r1, r0, r5)
            r5.A08 = r1
            X.7JI r0 = r5.A0C
            if (r0 != 0) goto L_0x0382
            r0 = r20
            com.instagram.user.model.User r1 = r0.A02(r12)
            if (r1 == 0) goto L_0x0382
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((com.instagram.user.model.User) r1)
            com.instagram.common.ui.base.IgLinearLayout r13 = r5.A0R
            android.widget.FrameLayout r15 = r5.A01
            r6 = r18
            if (r15 == 0) goto L_0x01c3
            r1 = 2131437035(0x7f0b25eb, float:1.8495957E38)
            X.2eb r16 = X.DbY.A0T(r15, r1)
            r1 = 2131437034(0x7f0b25ea, float:1.8495955E38)
            X.2eb r17 = X.DbY.A0S(r13, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r5.A09
            if (r12 != 0) goto L_0x0352
            java.lang.String r6 = "voiceRecorderButton"
            goto L_0x01c3
        L_0x0325:
            r1 = r10
            goto L_0x0291
        L_0x0328:
            boolean r0 = X.AnonymousClass4AJ.A05(r3)
            goto L_0x0193
        L_0x032e:
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 == 0) goto L_0x0341
            android.content.res.Resources r11 = r7.getResources()
            r1 = 2131956640(0x7f1313a0, float:1.9549841E38)
            java.lang.String r0 = r4.A09
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r11, r0, r1)
            goto L_0x00e8
        L_0x0341:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131968608(0x7f134260, float:1.9574115E38)
            if (r16 == 0) goto L_0x00e4
            r0 = 2131960939(0x7f13246b, float:1.955856E38)
            goto L_0x00e4
        L_0x034f:
            r2 = r10
            goto L_0x007c
        L_0x0352:
            X.7JE r24 = new X.7JE
            r11 = r24
            r14 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.PFS r6 = new X.PFS
            r6.<init>(r5, r4)
            r1 = 37
            X.Pm4 r1 = X.C73924Pm4.A01(r5, r1)
            X.0eM r1 = X.AnonymousClass1YB.A00(r1)
            X.3t2 r25 = X.DbS.A0c(r0)
            r21 = r3
            r22 = r10
            r23 = r6
            r26 = r8
            r27 = r8
            r20 = r7
            X.7JI r0 = X.AnonymousClass7JH.A00(r20, r21, r22, r23, r24, r25, r26, r27)
            r0.A0G(r1)
            r5.A0C = r0
        L_0x0382:
            com.instagram.common.ui.base.IgEditText r1 = r5.A04
            if (r1 == 0) goto L_0x005d
            X.0eM r0 = r5.A0a
            java.lang.Object r0 = r0.getValue()
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r1.removeTextChangedListener(r0)
            com.instagram.common.ui.base.IgEditText r1 = r5.A04
            if (r1 == 0) goto L_0x005d
            X.OhF r0 = new X.OhF
            r0.<init>((int) r8, (java.lang.Object) r5, (java.lang.Object) r4)
            r1.addTextChangedListener(r0)
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x042c
            X.P3s r6 = new X.P3s
            r6.<init>(r5, r8)
            X.MuA r12 = r5.A0U
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r4.A05
            if (r0 == 0) goto L_0x04b6
            java.lang.String r13 = r0.A08
        L_0x03ae:
            long r0 = r5.A00
            java.lang.String r11 = r4.A0C
            if (r13 == 0) goto L_0x0445
            X.4JK r11 = r12.A03
            java.lang.String r7 = java.lang.String.valueOf(r0)
            boolean r7 = r11.A05(r13, r7)
            X.05G r11 = r12.A07
            if (r7 == 0) goto L_0x0443
            java.lang.String r7 = "❤️"
        L_0x03c4:
            r11.Epw(r7)
            X.6oS r7 = X.C318116oQ.A00(r12)
            r14 = 17
            X.MGA r11 = new X.MGA
            r13 = r10
            r15 = r0
            r11.<init>((java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r14, (long) r15)
            X.AnonymousClass7TE.A1Z(r11, r7)
        L_0x03d7:
            r0 = 36324329423777798(0x810cc900023006, double:3.0349904217069607E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0441
            X.OdF r2 = X.C71121OdF.A01
            java.lang.String r1 = r4.A0B
            android.widget.FrameLayout r0 = r5.A01
            if (r0 == 0) goto L_0x04be
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            boolean r0 = r2.A04(r0, r1)
            if (r0 == 0) goto L_0x0441
            android.widget.FrameLayout r1 = r5.A01
            if (r1 == 0) goto L_0x04be
            r0 = 2131437028(0x7f0b25e4, float:1.8495943E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = (com.instagram.common.ui.base.IgSimpleImageView) r0
        L_0x0401:
            r5.A05 = r0
            android.widget.FrameLayout r1 = r5.A01
            if (r1 == 0) goto L_0x04be
            r0 = 2131437040(0x7f0b25f0, float:1.8495967E38)
            android.view.View r3 = r1.findViewById(r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r3 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r3
            X.LEc r1 = r5.A0T
            X.0qQ.A0A(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A05
            r1.A01(r0, r3)
            X.4DH r0 = r5.A0P
            X.0xx r2 = X.AnonymousClass07a.A00(r0)
            r1 = 14
            X.MGe r0 = new X.MGe
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r6, (X.AnonymousClass4D7) r10, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            r5.A0D = r3
        L_0x042c:
            com.instagram.common.ui.base.IgEditText r0 = r5.A04
            if (r0 == 0) goto L_0x005d
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x043d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x043d
            r8 = 0
        L_0x043d:
            A03(r5, r8, r9)
            return
        L_0x0441:
            r0 = r10
            goto L_0x0401
        L_0x0443:
            r7 = 0
            goto L_0x03c4
        L_0x0445:
            com.instagram.direct.inbox.notes.NotesRepository r13 = r12.A04
            X.0Ud r7 = r13.A0p
            java.lang.Object r7 = r7.getValue()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r16 = r7.iterator()
        L_0x0453:
            boolean r7 = r16.hasNext()
            r14 = 0
            if (r7 == 0) goto L_0x04b4
            java.lang.Object r15 = r16.next()
            boolean r7 = X.C66582MXn.A1U(r15, r0)
            if (r7 == 0) goto L_0x0453
        L_0x0464:
            X.4zZ r15 = (X.C279864zZ) r15
            if (r15 == 0) goto L_0x0483
            X.5y4 r7 = r15.A07
            if (r7 == 0) goto L_0x0483
            java.util.List r7 = r7.A01
            if (r7 == 0) goto L_0x0483
        L_0x0470:
            java.lang.Object r0 = X.00k.A0J(r7)
            com.instagram.api.schemas.NoteEmojiReactionInfo r0 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r0
            X.05G r1 = r12.A07
            if (r0 == 0) goto L_0x0481
            java.lang.String r0 = r0.A02
        L_0x047c:
            r1.Epw(r0)
            goto L_0x03d7
        L_0x0481:
            r0 = 0
            goto L_0x047c
        L_0x0483:
            X.0Ud r7 = r13.A0r
            java.lang.Object r7 = X.JTR.A0z(r11, r7)
            X.4zc r7 = (X.C279894zc) r7
            if (r7 == 0) goto L_0x04b1
            java.util.List r7 = r7.A05
            if (r7 == 0) goto L_0x04b1
            java.util.Iterator r13 = r7.iterator()
        L_0x0495:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x04a6
            java.lang.Object r11 = r13.next()
            boolean r7 = X.C66582MXn.A1U(r11, r0)
            if (r7 == 0) goto L_0x0495
            r14 = r11
        L_0x04a6:
            X.4zZ r14 = (X.C279864zZ) r14
            if (r14 == 0) goto L_0x04b1
            X.5y4 r0 = r14.A07
            if (r0 == 0) goto L_0x04b1
            java.util.List r7 = r0.A01
            goto L_0x0470
        L_0x04b1:
            X.0sn r7 = X.0sn.A00
            goto L_0x0470
        L_0x04b4:
            r15 = r14
            goto L_0x0464
        L_0x04b6:
            r13 = r10
            goto L_0x03ae
        L_0x04b9:
            X.0qQ.A0F(r17)
            goto L_0x002b
        L_0x04be:
            X.0qQ.A0F(r18)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71126OdL.A06(X.NWf):void");
    }

    private final void A00() {
        IgEditText igEditText = this.A04;
        if (igEditText != null) {
            ViewGroup.LayoutParams layoutParams = igEditText.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C71492dQ r1 = (C71492dQ) layoutParams;
            FrameLayout frameLayout = this.A02;
            if (frameLayout != null) {
                r1.A0N = frameLayout.getId();
                FrameLayout frameLayout2 = this.A02;
                if (frameLayout2 != null) {
                    this.A0B = new C308476Uk(frameLayout2);
                    Context context = this.A0N;
                    ColorStateList A0B2 = 1QE.A0B(context, (1QG) null);
                    C308476Uk r2 = this.A0B;
                    if (r2 != null) {
                        r2.A00(A0B2.getDefaultColor(), true);
                    }
                    C308476Uk r22 = this.A0B;
                    if (r22 != null) {
                        r22.A02.getDrawable().setTint(1QE.A0C(context, (1QG) null).getDefaultColor());
                    }
                    FrameLayout frameLayout3 = this.A02;
                    if (frameLayout3 != null) {
                        C71397Ojw.A00(frameLayout3, 31, this);
                        IgTextView igTextView = this.A06;
                        if (igTextView != null) {
                            igTextView.setTextColor(A0B2.getColorForState(new int[]{-16842910}, A0B2.getDefaultColor()));
                        }
                        IgTextView igTextView2 = this.A06;
                        if (igTextView2 != null) {
                            C71397Ojw.A00(igTextView2, 31, this);
                        }
                        IgEditText igEditText2 = this.A04;
                        if (igEditText2 != null) {
                            igEditText2.addTextChangedListener((TextWatcher) this.A0a.getValue());
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("smashableSendButton");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("replyMessage");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C71126OdL odL, C68770NWf nWf) {
        Context context = odL.A0N;
        String string = context.getString(2131968541);
        odL.A0G = string;
        if (nWf.A05 != null) {
            String string2 = context.getString(2131968540);
            if (string2 != null) {
                C310336ap A0W2 = DbV.A0W();
                A0W2.A0D = odL.A0G;
                A0W2.A0L = true;
                A0W2.A0G = string2;
                C72737PHr.A00(A0W2, odL, 7);
                A0W2.A02 = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
                A0W2.A0R = true;
                DbY.A1N(A0W2);
                return;
            }
            return;
        }
        C59689JTv.A09(context, string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r8 != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C71126OdL r7, boolean r8, boolean r9) {
        /*
            com.instagram.common.session.UserSession r6 = r7.A0Q
            r5 = 0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320511197782534(0x81095000012206, double:3.032575760212794E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r3 = 0
            r4 = 8
            if (r0 == 0) goto L_0x0093
            if (r8 == 0) goto L_0x0089
            X.6Uk r1 = r7.A0B
            if (r1 == 0) goto L_0x001d
            r0 = 0
            r1.A01(r0, r5, r9)
        L_0x001d:
            X.MuA r0 = r7.A0U
            X.0Ud r0 = r0.A0A
            java.lang.Object r1 = r0.getValue()
            X.NWi r0 = X.C68773NWi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r2 = "voiceRecorderButton"
            if (r0 == 0) goto L_0x0051
            if (r8 == 0) goto L_0x0081
            boolean r0 = r7.A0d
            if (r0 == 0) goto L_0x0053
            boolean r0 = X.AnonymousClass4AJ.A0A(r6)
            if (r0 == 0) goto L_0x0053
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A09
            if (r0 == 0) goto L_0x00a9
            r0.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A08
            if (r0 == 0) goto L_0x0049
            r0.setVisibility(r4)
        L_0x0049:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L_0x0050
            r0.setVisibility(r4)
        L_0x0050:
            return
        L_0x0051:
            if (r8 == 0) goto L_0x0081
        L_0x0053:
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x005e
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L_0x005e
            r0.setVisibility(r5)
        L_0x005e:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x006d
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A09
            if (r1 == 0) goto L_0x00a9
            int r0 = X.DbW.A01(r8)
            r1.setVisibility(r0)
        L_0x006d:
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x0075
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x0050
        L_0x0075:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A08
            if (r0 == 0) goto L_0x0050
            if (r8 != 0) goto L_0x007d
            r3 = 8
        L_0x007d:
            r0.setVisibility(r3)
            return
        L_0x0081:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r7.A0D
            if (r0 == 0) goto L_0x005e
            r0.setVisibility(r4)
            goto L_0x005e
        L_0x0089:
            X.6Uk r2 = r7.A0B
            if (r2 == 0) goto L_0x001d
            r1 = 0
            r0 = 1
            r2.A01(r1, r0, r9)
            goto L_0x001d
        L_0x0093:
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            if (r1 == 0) goto L_0x009e
            int r0 = X.DbW.A00(r8)
            r1.setVisibility(r0)
        L_0x009e:
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            if (r1 == 0) goto L_0x001d
            r0 = r8 ^ 1
            r1.setEnabled(r0)
            goto L_0x001d
        L_0x00a9:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71126OdL.A03(X.OdL, boolean, boolean):void");
    }

    private final boolean A04(C68770NWf nWf) {
        DirectShareTarget directShareTarget;
        User A022 = this.A0Y.A02(nWf.A08);
        if (A022 != null) {
            directShareTarget = new DirectShareTarget(A022);
        } else {
            directShareTarget = null;
        }
        if (directShareTarget == null) {
            return false;
        }
        if (this.A0W.BYf(directShareTarget).CVa(this.A0Q) || (DbS.A0c(directShareTarget) instanceof AnonymousClass9HR)) {
            return true;
        }
        return false;
    }

    public final void A05() {
        IgLinearLayout igLinearLayout = this.A0R;
        this.A01 = (FrameLayout) igLinearLayout.findViewById(R.id.note_quick_reply_composer_container);
        this.A03 = (ConstraintLayout) igLinearLayout.findViewById(R.id.note_quick_reply_message_container);
        this.A04 = (IgEditText) igLinearLayout.findViewById(R.id.note_quick_reply_message);
        this.A0M = JTO.A0X(igLinearLayout, R.id.note_quick_reply_blocked_message);
        Bundle bundle = this.A0e;
        if (bundle != null && bundle.getBoolean("pending_admin_approval")) {
            ConstraintLayout constraintLayout = this.A03;
            if (constraintLayout == null) {
                0qQ.A0F("replyMessageContainer");
                throw AnonymousClass00P.createAndThrow();
            }
            constraintLayout.setVisibility(8);
        }
        this.A02 = (FrameLayout) igLinearLayout.findViewById(R.id.row_thread_composer_send_button_container);
        this.A06 = JTO.A0X(igLinearLayout, R.id.note_quick_reply_send_button);
        if (AnonymousClass7TF.A1Z(this.A0b)) {
            A00();
        }
    }

    public final void A07(boolean z) {
        String str = "replyMessage";
        if (z) {
            IgEditText igEditText = this.A04;
            if (igEditText != null) {
                igEditText.setText((CharSequence) null);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        IgEditText igEditText2 = this.A04;
        if (igEditText2 != null) {
            0nA.A0N(igEditText2);
            IgImageView igImageView = this.A07;
            if (igImageView == null) {
                str = "composerButtonLeft";
            } else {
                igImageView.setVisibility(8);
                IgImageView igImageView2 = this.A09;
                if (igImageView2 == null) {
                    str = "voiceRecorderButton";
                } else {
                    igImageView2.setVisibility(8);
                    IgImageView igImageView3 = this.A08;
                    if (igImageView3 != null) {
                        igImageView3.setVisibility(8);
                    }
                    IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A0D;
                    if (igBouncyUfiButtonImageView != null) {
                        igBouncyUfiButtonImageView.setVisibility(8);
                    }
                    A00();
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(View view, C71126OdL odL, C68770NWf nWf) {
        A02(odL, nWf);
        if (AnonymousClass7TF.A1Z(odL.A0b)) {
            C74499Pvt pvt = odL.A0S;
            if (pvt != null) {
                pvt.DUX();
            }
            0nA.A0N(view);
            odL.A07(true);
            return;
        }
        BaseFragmentActivity baseFragmentActivity = odL.A0O;
        if (baseFragmentActivity != null) {
            baseFragmentActivity.onBackPressed();
        }
    }
}
