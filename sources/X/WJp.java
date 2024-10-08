package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView;
import com.instagram.user.model.User;

public final class WJp implements C252203oj, X5D {
    public static final C71392co A0L = C71392co.A02(12.0d);
    public ViewGroup A00;
    public ViewGroup A01;
    public C16722V3f A02;
    public C17564VaI A03;
    public CircularImageView A04;
    public CircularImageView A05;
    public NametagResultCardView A06;
    public User A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final Activity A0C;
    public final VM8 A0D;
    public final AnonymousClass0iw A0E;
    public final 1wn A0F = new WQU(this, 10);
    public final UserSession A0G;
    public final int A0H;
    public final ViewGroup A0I;
    public final 2cs A0J;
    public final AnonymousClass84G A0K;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    private void A00() {
        if (this.A01 == null) {
            ViewGroup viewGroup = (ViewGroup) JTP.A0H(DbU.A0D(this.A0I, R.id.nametag_result_view_stub), R.layout.nametag_result_card_no_bg);
            this.A01 = viewGroup;
            viewGroup.setVisibility(8);
            WB0.A00(this.A01, 29, this);
            NametagResultCardView nametagResultCardView = (NametagResultCardView) this.A01.requireViewById(R.id.result_card_view);
            this.A06 = nametagResultCardView;
            nametagResultCardView.setDelegate(this);
            WC3.A00(this.A06, 17, this);
        }
    }

    public final void A02(User user) {
        this.A07 = user;
        A00();
        NametagResultCardView nametagResultCardView = this.A06;
        nametagResultCardView.getClass();
        AnonymousClass0iw r1 = this.A0E;
        String fullName = user.getFullName();
        DbU.A1S(r1, nametagResultCardView.A06, user);
        nametagResultCardView.A07.setName(user.getUsername(), fullName);
        boolean isEmpty = TextUtils.isEmpty(fullName);
        TextView textView = nametagResultCardView.A04;
        if (!isEmpty) {
            textView.setText(fullName);
            nametagResultCardView.A04.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (nametagResultCardView.A00 > 0) {
            NametagResultCardView.A01(nametagResultCardView);
        } else {
            nametagResultCardView.A02.setVisibility(8);
        }
        2cs r0 = this.A0J;
        r0.A06 = false;
        r0.A03();
        this.A0I.setImportantForAccessibility(4);
        this.A0A = false;
    }

    public final boolean A03() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX WARNING: type inference failed for: r0v19, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v27, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTR(int r17, int r18, boolean r19) {
        /*
            r16 = this;
            r11 = r16
            r2 = r17
            android.app.Activity r6 = r11.A0C
            int r14 = X.0nA.A09(r6)
            float r1 = (float) r2
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 * r0
            int r12 = (int) r1
            android.view.ViewGroup r0 = r11.A01
            r0.getClass()
            int r0 = r0.getHeight()
            int r0 = r0 - r18
            int r8 = r0 / 2
            int r2 = r17 - r12
            int r0 = r2 / 2
            int r8 = r8 + r0
            if (r19 == 0) goto L_0x0047
            int r3 = r8 * 2
            int r3 = r3 + r12
            android.view.ViewGroup r0 = r11.A00
            if (r0 != 0) goto L_0x0047
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
            r11.A00 = r0
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r14, r3)
            android.view.ViewGroup r1 = r11.A01
            r1.getClass()
            android.view.ViewGroup r0 = r11.A00
            r1.addView(r0, r2)
            android.view.ViewGroup r1 = r11.A00
            r0 = 0
            r1.layout(r0, r0, r14, r3)
        L_0x0047:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r11.A04
            if (r0 != 0) goto L_0x0073
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r0.<init>(r6)
            r11.A04 = r0
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r12)
            r2.topMargin = r8
            android.view.ViewGroup r1 = r11.A01
            r1.getClass()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r11.A04
            r1.addView(r0, r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r11.A04
            r1 = 0
            int r0 = r8 + r12
            r2.layout(r1, r8, r12, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r11.A04
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r6, r1, r0)
        L_0x0073:
            int r4 = r11.A0H
            int r0 = r14 - r4
            int r15 = r0 / 2
            com.instagram.common.ui.widget.imageview.CircularImageView r10 = r11.A04
            r10.getClass()
            float r0 = (float) r15
            if (r19 == 0) goto L_0x0082
            float r0 = (float) r14
        L_0x0082:
            r10.setTranslationX(r0)
            r3 = 0
            r10.setVisibility(r3)
            com.instagram.user.model.User r0 = r11.A07
            r0.getClass()
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            X.0iw r2 = r11.A0E
            r10.setUrl(r0, r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r11.A05
            if (r9 != 0) goto L_0x00d4
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = new com.instagram.common.ui.widget.imageview.CircularImageView
            r0.<init>(r6)
            r11.A05 = r0
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r12, r12)
            r5.topMargin = r8
            android.view.ViewGroup r1 = r11.A01
            r1.getClass()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r11.A05
            r1.addView(r0, r5)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r11.A05
            int r5 = r11.A0B
            int r1 = r8 - r5
            int r0 = r5 * 2
            int r0 = r0 + r12
            int r8 = r8 + r12
            int r8 = r8 + r5
            r7.layout(r3, r1, r0, r8)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r11.A05
            r0 = 2131239607(0x7f0822b7, float:1.8095526E38)
            X.DbU.A13(r6, r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r11.A05
            r0 = -1
            r1.A0H(r5, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r11.A05
            r0 = 1
            r9.A02 = r0
        L_0x00d4:
            int r4 = r4 + r14
            int r13 = r4 / 2
            int r13 = r13 - r12
            r9.getClass()
            if (r19 == 0) goto L_0x0101
            int r1 = -r12
            int r0 = r11.A0B
            int r1 = r1 - r0
            float r0 = (float) r1
        L_0x00e2:
            r9.setTranslationX(r0)
            r9.setVisibility(r3)
            com.instagram.common.session.UserSession r0 = r11.A0G
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            X.DbU.A1S(r2, r9, r0)
            if (r19 == 0) goto L_0x0100
            android.view.ViewGroup r0 = r11.A01
            r0.getClass()
            X.Wps r8 = new X.Wps
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.post(r8)
        L_0x0100:
            return
        L_0x0101:
            float r0 = (float) r13
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WJp.DTR(int, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void DmC(2cs r6) {
        ValueAnimator valueAnimator;
        if (r6.A01 != 1.0d) {
            ? r3 = this.A05;
            if (r3 != 0) {
                C71392co r0 = C315596kB.A02;
                C294975nL.A00(r3).A0G();
                r3.setTranslationX((float) ((-r3.getWidth()) - this.A0B));
                r3.setImageAlpha(255);
            }
            ? r1 = this.A04;
            if (r1 != 0) {
                C71392co r02 = C315596kB.A02;
                C294975nL.A00(r1).A0G();
                r1.setTranslationX((float) 0nA.A09(this.A0C));
                r1.setImageAlpha(255);
            }
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                viewGroup.setAlpha(1.0f);
            }
            C17564VaI vaI = this.A03;
            if (!(vaI == null || (valueAnimator = vaI.A00) == null || !valueAnimator.isRunning())) {
                valueAnimator.cancel();
            }
            if (this.A08) {
                this.A08 = false;
                AnonymousClass84G r32 = this.A0K;
                User user = this.A07;
                user.getClass();
                String username = user.getUsername();
                C16722V3f v3f = this.A02;
                v3f.getClass();
                int i = v3f.A00;
                VRL vrl = this.A02.A01;
                vrl.getClass();
                r32.DkS(username, i, vrl.A00);
            } else {
                this.A0K.DfZ(this.A0A);
            }
            this.A07 = null;
            this.A02 = null;
            NametagResultCardView nametagResultCardView = this.A06;
            if (nametagResultCardView != null) {
                nametagResultCardView.A0B = false;
                nametagResultCardView.A0D = false;
                nametagResultCardView.A0C = false;
                nametagResultCardView.A05.setOnClickListener((View.OnClickListener) null);
                View view = nametagResultCardView.A02;
                C71392co r03 = C315596kB.A02;
                C294975nL.A01(view, 0).A0G();
                nametagResultCardView.A02.setAlpha(1.0f);
                nametagResultCardView.A02.setVisibility(0);
                nametagResultCardView.A09.setVisibility(8);
                nametagResultCardView.A0A.setVisibility(8);
                nametagResultCardView.A03.setVisibility(8);
                nametagResultCardView.A01.setVisibility(8);
            }
        } else if (this.A02 == null) {
            NametagResultCardView nametagResultCardView2 = this.A06;
            nametagResultCardView2.getClass();
            UserSession userSession = this.A0G;
            AnonymousClass0iw r12 = this.A0E;
            User user2 = this.A07;
            user2.getClass();
            nametagResultCardView2.A02(r12, userSession, user2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void DmE(2cs r16) {
        C71412ct r7 = r16.A09;
        float min = (float) Math.min(Math.max(r7.A00, 0.0d), 1.0d);
        double d = (double) min;
        float A012 = (float) AnonymousClass37Q.A01(d, 1.0d);
        NametagResultCardView nametagResultCardView = this.A06;
        nametagResultCardView.getClass();
        nametagResultCardView.setAlpha(A012);
        int i = 0;
        this.A06.setVisibility(JTQ.A01((A012 > 0.0f ? 1 : (A012 == 0.0f ? 0 : -1))));
        float A032 = (float) AnonymousClass37Q.A03(r7.A00, 0.800000011920929d, 1.0d);
        this.A06.setScaleX(A032);
        this.A06.setScaleY(A032);
        ViewGroup viewGroup = this.A01;
        viewGroup.getClass();
        viewGroup.setVisibility(JTQ.A01((min > 0.0f ? 1 : (min == 0.0f ? 0 : -1))));
        if (this.A06.A0D) {
            int A002 = (int) AnonymousClass37Q.A00(d);
            ? r1 = this.A05;
            if (r1 != 0) {
                r1.setImageAlpha(A002);
                r1.setVisibility(JTQ.A01(A002));
                r1.setStrokeAlpha(A002);
            }
            ? r12 = this.A04;
            if (r12 != 0) {
                r12.setImageAlpha(A002);
                r12.setVisibility(JTQ.A01(A002));
            }
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                viewGroup2.setAlpha(A012);
                if (A002 <= 0) {
                    i = 8;
                }
                viewGroup2.setVisibility(i);
            }
        }
        this.A0K.Dfa(min);
    }

    public WJp(Activity activity, ViewGroup viewGroup, VM8 vm8, AnonymousClass0iw r6, UserSession userSession, AnonymousClass84G r8) {
        this.A0C = activity;
        this.A0I = viewGroup;
        this.A0G = userSession;
        this.A0K = r8;
        this.A0D = vm8;
        this.A0E = r6;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(A0L);
        A0J2.A0A(this);
        this.A0J = A0J2;
        this.A0B = AnonymousClass7TG.A07(activity);
        this.A0H = AnonymousClass7TG.A05(activity);
    }

    public final void A01() {
        if (A03()) {
            2cs r0 = this.A0J;
            r0.A06 = true;
            r0.A04();
            this.A0I.setImportantForAccessibility(1);
        }
    }
}
