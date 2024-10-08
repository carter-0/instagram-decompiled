package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectPendingLayeredXma;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.List;

public final class NK2 extends AnonymousClass4DH implements C268594df, C273494mf, C252213ok, C74387Pu3, AnonymousClass7Q6 {
    public static final String __redex_internal_original_name = "DirectReplyModalFragment";
    public C71089Obq A00;
    public AnonymousClass2Ep A01;
    public C70636OEh A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public AnonymousClass3E6 A0A;
    public C74468PvO A0B;
    public AnonymousClass7Z7 A0C;
    public 2Dm A0D;
    public 1Xj A0E;
    public DirectPendingLayeredXma A0F;
    public DirectShareTarget A0G;
    public AnonymousClass32A A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final String A0U;
    public final AnonymousClass0eM A0V = C227642jf.A02(this);
    public final C74239PrS A0W = new P1R(this);
    public final C74315Psr A0X = new P1T(this);

    public final int AqL() {
        return -2;
    }

    public final float CMx() {
        return 1.0f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DBs(Drawable drawable, View view, C317486nL r5) {
        String str;
        0qQ.A0B(r5, 0);
        C71089Obq obq = this.A00;
        if (obq == null) {
            str = "composerController";
        } else {
            String str2 = r5.A02;
            ComposerAutoCompleteTextView composerAutoCompleteTextView = obq.A00;
            if (composerAutoCompleteTextView == null) {
                str = "messageEditText";
            } else {
                composerAutoCompleteTextView.append(str2);
                C74468PvO pvO = this.A0B;
                if (pvO == null) {
                    str = "replyController";
                } else {
                    pvO.DBt(r5);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMr(int i, boolean z) {
        String str;
        boolean A1Q = AnonymousClass7TF.A1Q(i);
        View view = this.mView;
        if (A1Q && this.A0T) {
            C71089Obq obq = this.A00;
            if (obq == null) {
                str = "composerController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            String A022 = obq.A02();
            if (A022 == null || A022.length() == 0) {
                if (this.A04) {
                    A00(this);
                } else if (view != null) {
                    C294975nL A0B2 = JTP.A0c(view, 0).A0A().A0B(0.5f);
                    A0B2.A0K((float) view.getHeight());
                    A0B2.A0H();
                } else {
                    throw AnonymousClass7TE.A0y();
                }
                this.A0T = false;
                return;
            }
        }
        this.A0T = !A1Q;
        if (this.A04) {
            C74468PvO pvO = this.A0B;
            if (pvO == null) {
                str = "replyController";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            P1P p1p = (P1P) pvO;
            FragmentActivity requireActivity = requireActivity();
            if (i != 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                requireActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                ScrollView scrollView = p1p.A00;
                scrollView.getClass();
                float dimension = (((float) displayMetrics.heightPixels) - ((float) i)) - scrollView.getResources().getDimension(R.dimen.direct_reply_modal_private_reply_non_comment_content_height);
                IgTextView igTextView = p1p.A01;
                igTextView.getClass();
                if (((float) igTextView.getMeasuredHeight()) > dimension) {
                    ViewGroup.LayoutParams layoutParams = p1p.A00.getLayoutParams();
                    IgTextView igTextView2 = p1p.A02;
                    igTextView2.getClass();
                    layoutParams.height = ((int) dimension) + igTextView2.getMeasuredHeight();
                    p1p.A00.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public final void DMt() {
        this.A06 = false;
        if (this.A07) {
            this.A07 = false;
            A01(this);
        } else if (this.A08) {
            this.A08 = false;
            A02(this);
        } else if (this.A0Q) {
            C71089Obq obq = this.A00;
            if (obq == null) {
                0qQ.A0F("composerController");
                throw AnonymousClass00P.createAndThrow();
            }
            String A022 = obq.A02();
            if (A022 == null || A022.length() == 0) {
                A00(this);
            }
        }
    }

    public final void DMu(int i) {
        this.A06 = true;
        this.A0Q = true;
    }

    public final boolean Erf() {
        return true;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 13369 && i2 == -1) {
            AnonymousClass0eM r3 = this.A0V;
            UserSession A0l = AnonymousClass7TE.A0l(r3);
            C74468PvO pvO = this.A0B;
            String str = "replyController";
            String str2 = null;
            if (pvO != null) {
                C69842Nt6.A00(A0l, pvO.CD0().getId());
                A00(this);
                if (!this.A04) {
                    C74468PvO pvO2 = this.A0B;
                    if (pvO2 != null) {
                        User CD0 = pvO2.CD0();
                        Context requireContext = requireContext();
                        C70636OEh oEh = this.A02;
                        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
                        DirectShareTarget directShareTarget = this.A0G;
                        if (directShareTarget == null) {
                            str = "shareTarget";
                        } else {
                            if (this.A0R) {
                                str2 = "ig_shopping_pdp_share_sheet_confirmation_toast";
                            }
                            C69919NuL.A00(requireContext, this, A0l2, directShareTarget, CD0, oEh, str2);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r9.A0V), 36315254157741165L) == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r9.A05 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        r7 = X.AnonymousClass7TE.A0l(r9.A0V);
        X.0qQ.A0B(r7, 2);
        r4 = X.DbU.A0C(r10, com.instagram.android.R.id.comment_emoji_picker_v1_emoji_container);
        r8 = X.AnonymousClass7TE.A1C();
        r3 = r4.getContext();
        r2 = r3.getResources().getDimensionPixelSize(com.instagram.android.R.dimen.abc_star_medium);
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        r0 = X.C337077fe.A01(r3, r2, false);
        r4.addView(r0);
        r8.add(r0);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        if (r1 < 8) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
        r3 = X.C317486nL.A04.A05(r7, X.AnonymousClass7TE.A19(X.O4H.A00, r4));
        r2 = (android.view.View) r8.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r3 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        r1 = r2.getTag();
        X.0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder");
        X.C337077fe.A02(r9, r7, r3, r9, (X.C337057fc) r1);
        r2.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c3, code lost:
        if (r4 < 8) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c7, code lost:
        if (r9.A04 == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        r1 = r9.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cb, code lost:
        if (r1 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        r2 = "replyController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d7, code lost:
        r2.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        r1 = (X.P1P) r1;
        X.C3265677h.A0O(r1.A05, r1.A06, (java.lang.Boolean) null, (java.lang.Integer) null, X.C273654mx.A00(2309), r1.A03.A0G, r1.A04.getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f8, code lost:
        if (r9.A05 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fa, code lost:
        r1 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        if (r1 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        r2 = "composerController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        r0 = r1.A00;
        r2 = "messageEditText";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        if (r0 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
        r0.requestFocus();
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        if (r0 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        X.0nA.A0S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            super.onViewCreated(r10, r11)
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x001f
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r10)
            X.Psr r1 = r9.A0X
            X.N1Q r0 = new X.N1Q
            r0.<init>(r2, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r2, r0)
            r0 = 2
            X.C71439Oke.A01(r10, r0, r1)
        L_0x001f:
            java.lang.String r0 = r9.A03
            if (r0 == 0) goto L_0x004b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x004b
            X.0eM r0 = r9.A0V
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317332921979933(0x81066c0001141d, double:3.0305658057973394E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x004b
            r0 = 2131431736(0x7f0b1138, float:1.848521E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r10, r0)
            r1.setVisibility(r5)
            java.lang.String r0 = r9.A03
            r1.setText(r0)
        L_0x004b:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0062
            X.0eM r0 = r9.A0V
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315254157741165(0x81048800000c6d, double:3.029251186922231E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0066
        L_0x0062:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x00f6
        L_0x0066:
            X.0eM r0 = r9.A0V
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            r0 = 2131430493(0x7f0b0c5d, float:1.8482689E38)
            android.view.ViewGroup r4 = X.DbU.A0C(r10, r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            android.content.Context r3 = r4.getContext()
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r2 = r1.getDimensionPixelSize(r0)
            r1 = 0
        L_0x008b:
            com.instagram.common.ui.base.IgFrameLayout r0 = X.C337077fe.A01(r3, r2, r5)
            r4.addView(r0)
            r8.add(r0)
            int r1 = r1 + 1
            r6 = 8
            if (r1 < r6) goto L_0x008b
            r4 = 0
        L_0x009c:
            X.7fS r1 = X.C317486nL.A04
            java.util.List r0 = X.O4H.A00
            java.lang.String r0 = X.AnonymousClass7TE.A19(r0, r4)
            X.6nL r3 = r1.A05(r7, r0)
            java.lang.Object r2 = r8.get(r4)
            android.view.View r2 = (android.view.View) r2
            if (r3 == 0) goto L_0x00d7
            java.lang.Object r1 = r2.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.emojigrid.EmojiGridRowItemViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.7fc r1 = (X.C337057fc) r1
            X.C337077fe.A02(r9, r7, r3, r9, r1)
            r2.setVisibility(r5)
        L_0x00c1:
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x009c
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00f6
            X.PvO r1 = r9.A0B
            if (r1 != 0) goto L_0x00db
            java.lang.String r2 = "replyController"
        L_0x00cf:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d7:
            r2.setVisibility(r6)
            goto L_0x00c1
        L_0x00db:
            X.P1P r1 = (X.P1P) r1
            com.instagram.common.session.UserSession r2 = r1.A06
            X.3gp r0 = r1.A03
            java.lang.String r6 = r0.A0G
            com.instagram.user.model.User r0 = r1.A04
            java.lang.String r7 = r0.getId()
            X.0iw r1 = r1.A05
            r0 = 2309(0x905, float:3.236E-42)
            java.lang.String r5 = X.C273654mx.A00(r0)
            r3 = 0
            r4 = r3
            X.C3265677h.A0O(r1, r2, r3, r4, r5, r6, r7)
        L_0x00f6:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x0111
            X.Obq r1 = r9.A00
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = "composerController"
            goto L_0x00cf
        L_0x0101:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r1.A00
            java.lang.String r2 = "messageEditText"
            if (r0 == 0) goto L_0x00cf
            r0.requestFocus()
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r1.A00
            if (r0 == 0) goto L_0x00cf
            X.0nA.A0S(r0)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(NK2 nk2) {
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(nk2.requireContext());
        if (A022 != null) {
            C71089Obq obq = nk2.A00;
            if (obq == null) {
                0qQ.A0F("composerController");
                throw AnonymousClass00P.createAndThrow();
            }
            obq.A03();
            A022.A0B();
        }
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return false;
    }

    public final /* synthetic */ float CoU() {
        return 1.0f;
    }

    public final void D5L() {
        if (this.A04) {
            C74468PvO pvO = this.A0B;
            if (pvO == null) {
                0qQ.A0F("replyController");
                throw AnonymousClass00P.createAndThrow();
            }
            P1P p1p = (P1P) pvO;
            C3265677h.A0S(p1p.A05, p1p.A06, "sheet_compose_message", p1p.A03.A0G, p1p.A04.getId(), (String) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dj2(java.lang.String r19, boolean r20) {
        /*
            r18 = this;
            r16 = 0
            r14 = r19
            int r0 = X.C66581MXm.A04(r14)
            r7 = 1
            if (r0 == 0) goto L_0x00de
            r0 = r18
            X.OEh r3 = r0.A02
            if (r3 == 0) goto L_0x0054
            java.util.regex.Pattern r1 = X.0mp.A06
            X.WZv r2 = r3.A02
            X.F35 r1 = r2.A04
            X.4DU r6 = r2.A03
            com.instagram.user.model.User r5 = r3.A01
            X.1Xj r4 = r3.A00
            X.0wc r2 = r1.A00
            java.lang.String r1 = "reel_viewer_dashboard_send_reply"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0054
            X.DbW.A15(r3, r6)
            java.lang.String r1 = r5.getId()
            java.lang.Long r2 = X.DbV.A0q(r1)
            java.lang.String r1 = "target_user_id"
            r3.A9F(r1, r2)
            int r1 = r5.BIW()
            java.lang.Long r2 = X.DbS.A0j(r1)
            java.lang.String r1 = "target_user_type"
            r3.A9F(r1, r2)
            java.lang.String r1 = r4.A30()
            if (r1 == 0) goto L_0x00d9
            X.G9t.A1J(r3, r1)
            r3.Cgf()
        L_0x0054:
            boolean r1 = r0.A05
            java.lang.String r2 = "replyController"
            java.lang.String r3 = "shareTarget"
            r9 = 0
            if (r1 == 0) goto L_0x0079
            java.lang.String r15 = r0.A0K
            if (r15 != 0) goto L_0x0063
            java.lang.String r15 = "direct_reply_to_story_commenter"
        L_0x0063:
            X.1Xj r10 = r0.A0E
            java.lang.String r13 = r0.A0J
            if (r10 == 0) goto L_0x00de
            if (r13 == 0) goto L_0x00de
            X.7Z7 r8 = r0.A0C
            if (r8 != 0) goto L_0x0095
            java.lang.String r3 = "sendShareManager"
        L_0x0071:
            X.0qQ.A0F(r3)
        L_0x0074:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0079:
            X.PvO r10 = r0.A0B
            if (r10 == 0) goto L_0x00d5
            X.2Dm r12 = r0.A0D
            if (r12 != 0) goto L_0x0084
            java.lang.String r3 = "threadStore"
            goto L_0x0071
        L_0x0084:
            X.2Ep r11 = r0.A01
            if (r11 != 0) goto L_0x008b
            java.lang.String r3 = "thread"
            goto L_0x0071
        L_0x008b:
            com.instagram.model.direct.DirectShareTarget r13 = r0.A0G
            if (r13 == 0) goto L_0x0071
            r15 = r20
            r10.EMw(r11, r12, r13, r14, r15)
            goto L_0x00a0
        L_0x0095:
            com.instagram.model.direct.DirectShareTarget r12 = r0.A0G
            if (r12 == 0) goto L_0x0071
            com.instagram.model.direct.DirectPendingLayeredXma r11 = r0.A0F
            r17 = r16
            r8.ELY(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00a0:
            android.content.Context r1 = r0.requireContext()
            android.content.Context r10 = r1.getApplicationContext()
            X.PvO r1 = r0.A0B
            if (r1 == 0) goto L_0x00d5
            com.instagram.user.model.User r14 = r1.CD0()
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x00d1
            boolean r1 = r0.A0R
            if (r1 == 0) goto L_0x00ba
            java.lang.String r9 = "ig_shopping_pdp_share_sheet_confirmation_toast"
        L_0x00ba:
            X.0qQ.A0A(r10)
            X.OEh r2 = r0.A02
            X.0eM r1 = r0.A0V
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.model.direct.DirectShareTarget r1 = r0.A0G
            if (r1 == 0) goto L_0x0071
            r11 = r0
            r13 = r1
            r15 = r2
            r16 = r9
            X.C69919NuL.A00(r10, r11, r12, r13, r14, r15, r16)
        L_0x00d1:
            A00(r0)
            return r7
        L_0x00d5:
            X.0qQ.A0F(r2)
            goto L_0x0074
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00de:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK2.Dj2(java.lang.String, boolean):boolean");
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0U;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0V);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
        C71089Obq obq = this.A00;
        if (obq == null) {
            0qQ.A0F("composerController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            obq.A03();
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NK2() {
        String str = this.A0K;
        this.A0U = str == null ? "direct_reply_to_author" : str;
    }

    public static final void A01(NK2 nk2) {
        A00(nk2);
        1pE A012 = 1pE.A01(nk2.requireActivity(), nk2, AnonymousClass7TE.A0l(nk2.A0V), "ig_home_reply_to_author");
        List list = nk2.A0N;
        if (list == null) {
            0qQ.A0F("pendingRecipientAsList");
            throw AnonymousClass00P.createAndThrow();
        }
        A012.A0B(list);
        A012.A06();
    }

    public static final void A02(NK2 nk2) {
        A00(nk2);
        AnonymousClass0eM r6 = nk2.A0V;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        C74468PvO pvO = nk2.A0B;
        if (pvO == null) {
            0qQ.A0F("replyController");
            throw AnonymousClass00P.createAndThrow();
        }
        Bundle A012 = C46447Df9.A03().A01.A01(AnonymousClass7TE.A0l(r6), C46548Dgp.A01(A0l, pvO.CD0().getId(), "reel_emoji_reaction_user", nk2.A0U).A04());
        DbU.A1K(nk2, DbW.A0W(nk2.requireActivity(), A012, DbT.A0X(r6), ModalActivity.class, "profile"));
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x009f, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r3), 36324733150572843L) == false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = 1620132754(0x60914392, float:8.373896E19)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r11 = r15
            r0 = r16
            X.NK2.super.onCreate(r0)
            android.os.Bundle r6 = r15.requireArguments()
            java.lang.String r0 = "direct_privacy_text"
            java.lang.String r0 = r6.getString(r0)
            r15.A03 = r0
            X.0eM r3 = r15.A0V
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.328 r1 = new X.328
            r1.<init>(r15)
            X.32A r0 = new X.32A
            r0.<init>(r15, r2, r1)
            r15.A0H = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r0.toString()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.2Dm r0 = X.1bJ.A00(r0)
            r15.A0D = r0
            java.lang.String r0 = "DirectReplyModalFragment.allow_swipe_down_to_dismiss"
            r2 = 0
            boolean r0 = r6.getBoolean(r0, r2)
            r15.A0O = r0
            java.lang.String r0 = "DirectReplyModalFragment.allow_viewer_avatar_clicks"
            boolean r0 = r6.getBoolean(r0, r2)
            r15.A0P = r0
            java.lang.String r0 = "DirectReplyModalFragment.custom_module_name"
            r8 = 0
            java.lang.String r0 = r6.getString(r0, r8)
            r15.A0K = r0
            java.lang.String r0 = "DirectReplyModalFragment.emoji_reaction_unicode"
            java.lang.String r0 = r6.getString(r0, r8)
            r15.A0L = r0
            java.lang.String r0 = "DirectReplyModalFragment.avatar_reaction_url"
            java.lang.String r0 = r6.getString(r0, r8)
            r15.A0I = r0
            java.lang.String r0 = "DirectReplyModalFragment.story_reply_text"
            java.lang.String r0 = r6.getString(r0, r8)
            r15.A0M = r0
            java.lang.String r0 = "DirectReplyModalFragment.entry_point"
            java.lang.String r12 = r6.getString(r0)
            if (r12 == 0) goto L_0x0185
            java.lang.String r0 = "private_reply_message"
            boolean r0 = r12.equals(r0)
            r15.A04 = r0
            java.lang.String r0 = "story_comment_reply"
            boolean r0 = r12.equals(r0)
            r15.A05 = r0
            java.lang.String r0 = "activity_feed"
            boolean r0 = r12.equals(r0)
            r5 = 1
            if (r0 == 0) goto L_0x00a1
            X.0lg r9 = X.DbT.A0X(r3)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324733150572843(0x810d270000312b, double:3.0352457401578244E-306)
            boolean r1 = X.182.A06(r7, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            r15.A0S = r0
            java.lang.String r0 = "message_merchant"
            boolean r0 = r12.equals(r0)
            r15.A0R = r0
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            boolean r0 = r15.A0P
            if (r0 == 0) goto L_0x0181
            X.PrS r0 = r15.A0W
        L_0x00b6:
            X.PvO r1 = X.OS7.A00(r6, r1, r0, r12)
            r15.A0B = r1
            android.os.Parcelable$Creator r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            if (r1 != 0) goto L_0x00ca
            java.lang.String r9 = "replyController"
        L_0x00c2:
            X.0qQ.A0F(r9)
        L_0x00c5:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00ca:
            com.instagram.user.model.User r0 = r1.CD0()
            java.util.List r1 = X.DbW.A0n(r0)
            X.0qQ.A07(r1)
            r15.A0N = r1
            X.2Dm r0 = r15.A0D
            if (r0 != 0) goto L_0x00de
            java.lang.String r9 = "threadStore"
            goto L_0x00c2
        L_0x00de:
            java.lang.String r7 = "pendingRecipientAsList"
            X.3U9 r0 = r0.BYg(r8, r8, r8, r1)
            r15.A01 = r0
            java.util.List r8 = r15.A0N
            if (r8 == 0) goto L_0x017c
            java.lang.String r9 = "thread"
            java.lang.String r1 = r0.C6C()
            java.util.List r0 = r15.A0N
            if (r0 == 0) goto L_0x017c
            X.3t1 r7 = X.C66662MaV.A00(r1, r0)
            X.2Ep r0 = r15.A01
            if (r0 == 0) goto L_0x00c2
            java.lang.String r1 = r0.C6f()
            if (r1 != 0) goto L_0x0104
            java.lang.String r1 = ""
        L_0x0104:
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>(r7, r1, r8, r5)
            r15.A0G = r0
            X.1pG r1 = X.AnonymousClass1pH.A00()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.Mew r1 = r1.E52(r0)
            com.instagram.model.direct.DirectShareTarget r0 = r15.A0G
            if (r0 != 0) goto L_0x011e
            java.lang.String r9 = "shareTarget"
            goto L_0x00c2
        L_0x011e:
            X.7Z7 r0 = r1.A00(r0)
            r15.A0C = r0
            java.lang.String r0 = "DirectReplyModalFragment.content_id"
            java.lang.String r1 = r6.getString(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.1Xj r0 = X.DbV.A0U(r0, r1)
            r15.A0E = r0
            java.lang.String r0 = "DirectReplyModalFragment.comment_id"
            java.lang.String r0 = r6.getString(r0)
            r15.A0J = r0
            java.lang.String r0 = "DirectReplyModalFragment.pending_layered_xma"
            android.os.Parcelable r0 = r6.getParcelable(r0)
            com.instagram.model.direct.DirectPendingLayeredXma r0 = (com.instagram.model.direct.DirectPendingLayeredXma) r0
            r15.A0F = r0
            X.3E5 r0 = X.AnonymousClass3E4.A01(r15, r2, r2)
            r15.A0A = r0
            r0.A9Y(r15)
            android.content.Context r10 = r15.requireContext()
            X.2Ep r0 = r15.A01
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r0.CVE()
            boolean r13 = X.AnonymousClass7TF.A1S(r0, r5)
            X.0lg r3 = X.AnonymousClass7TF.A0L(r3, r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315254157741165(0x81048800000c6d, double:3.029251186922231E-306)
            boolean r14 = X.182.A06(r2, r3, r0)
            X.Obq r9 = new X.Obq
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A00 = r9
            r0 = 1158694654(0x451046fe, float:2308.437)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x017c:
            X.0qQ.A0F(r7)
            goto L_0x00c5
        L_0x0181:
            X.PrS r0 = X.OS7.A00
            goto L_0x00b6
        L_0x0185:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 940974280(0x381620c8, float:3.5793317E-5)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK2.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f5, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r9.A0V), 36315254157741165L) == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f9, code lost:
        if (r9.A05 == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        X.JTR.A0X(r7, com.instagram.android.R.id.layout_direct_reply_composer_emoji_picker_stub).inflate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0105, code lost:
        if (r6 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0109, code lost:
        if (r9.A04 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010b, code lost:
        if (r5 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        if (r8 != false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r1 = requireContext().getDrawable(com.instagram.android.R.drawable.chevron_right);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011a, code lost:
        if (r1 == null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011c, code lost:
        X.AnonymousClass7TE.A1R(r1, X.2Yu.A01(requireContext()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
        r4.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r1, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012a, code lost:
        r3 = requireContext();
        r2 = r9.A05;
        r0 = r9.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0132, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0134, code lost:
        r1 = r0.CD0().getUsername();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013c, code lost:
        if (r6 == false) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013e, code lost:
        if (r5 == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0140, code lost:
        r0 = X.DbW.A0h(r3, r1, 2131959822);
        X.0qQ.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014a, code lost:
        r4.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014f, code lost:
        if (r9.A04 != false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0151, code lost:
        X.AnonymousClass0fU.A00(new X.C71348Oiy(r9, r6, r5, r8), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0159, code lost:
        r3 = r9.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        if (r3 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        r3.CMO(X.JTR.A0X(r7, com.instagram.android.R.id.context_image_container_stub), X.JTR.A0X(r7, com.instagram.android.R.id.reply_modal_detailed_context_stub), X.JTR.A0X(r7, com.instagram.android.R.id.reply_modal_more_context_stub));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0177, code lost:
        if (r9.A0B == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0179, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017b, code lost:
        if (r0 != null) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017d, code lost:
        r14 = "composerController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0181, code lost:
        if (r5 == false) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0183, code lost:
        r0 = 2131959821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0186, code lost:
        r0 = X.DbY.A0c(r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018b, code lost:
        if (r8 != false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018d, code lost:
        r0 = 2131959818;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0190, code lost:
        if (r2 == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0192, code lost:
        r0 = 2131959819;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0196, code lost:
        r0 = 2131959820;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019a, code lost:
        r0.A04(r7);
        X.AnonymousClass0fD.A09(-1363178985, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a3, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = -1473818855(0xffffffffa8274f19, float:-9.287514E-15)
            int r12 = X.AnonymousClass0fD.A02(r0)
            r1 = 0
            r3 = r23
            X.0qQ.A0B(r3, r1)
            r0 = 2131625638(0x7f0e06a6, float:1.887849E38)
            r8 = 0
            r2 = r24
            android.view.View r7 = r3.inflate(r0, r2, r1)
            r9 = r22
            java.lang.String r0 = r9.A0L
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r9.A0M
            boolean r5 = X.AnonymousClass7TF.A1V(r0)
            java.lang.String r0 = r9.A0I
            if (r0 == 0) goto L_0x002a
            r8 = 1
        L_0x002a:
            r0 = 2131439895(0x7f0b3117, float:1.8501758E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r7, r0)
            boolean r0 = r9.A0S
            java.lang.String r14 = "replyController"
            r3 = 0
            if (r0 == 0) goto L_0x0098
            r0 = 2131435217(0x7f0b1ed1, float:1.849227E38)
            android.view.ViewStub r0 = X.JTR.A0X(r7, r0)
            android.view.View r11 = r0.inflate()
            r0 = 2131439041(0x7f0b2dc1, float:1.8500026E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r11, r0)
            X.37D r2 = X.DbX.A0i(r9)
            if (r2 == 0) goto L_0x00a2
            android.content.Context r0 = r9.requireContext()
            android.content.Context r16 = X.DbT.A05(r0)
            X.0eM r0 = r9.A0V
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r0)
            X.2Ep r1 = r9.A01
            if (r1 != 0) goto L_0x006c
            java.lang.String r14 = "thread"
        L_0x0064:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006c:
            com.instagram.model.direct.DirectShareTarget r0 = r9.A0G
            if (r0 != 0) goto L_0x0073
            java.lang.String r14 = "shareTarget"
            goto L_0x0064
        L_0x0073:
            X.PvO r13 = r9.A0B
            if (r13 == 0) goto L_0x0064
            com.instagram.user.model.User r21 = r13.CD0()
            X.P49 r15 = new X.P49
            r19 = r0
            r20 = r2
            r18 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = 8
            X.C71399Ojy.A00(r10, r15, r9, r2, r0)
            r0 = 2131439039(0x7f0b2dbf, float:1.8500022E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r11, r0)
            r0 = 28
            X.C71401Ok0.A01(r1, r0, r9)
            goto L_0x00a2
        L_0x0098:
            r0 = 2131435218(0x7f0b1ed2, float:1.8492272E38)
            android.view.ViewStub r0 = X.JTR.A0X(r7, r0)
            r0.inflate()
        L_0x00a2:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00e0
            r0 = 2131430753(0x7f0b0d61, float:1.8483216E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r7, r0)
            r0 = 2131439894(0x7f0b3116, float:1.8501756E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r7, r0)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.content.Context r10 = r1.getContext()
            r0 = 2130969336(0x7f0402f8, float:1.754735E38)
            int r0 = X.2Yu.A0H(r10, r0)
            X.DbT.A16(r10, r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            int r0 = X.C66582MXn.A01(r10)
            r1.height = r0
            r0 = 17
            r2.setGravity(r0)
            r0 = 1099431936(0x41880000, float:17.0)
            r4.setTextSize(r0)
        L_0x00e0:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00f7
            X.0eM r0 = r9.A0V
            X.0lg r10 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315254157741165(0x81048800000c6d, double:3.029251186922231E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 != 0) goto L_0x00fb
        L_0x00f7:
            boolean r0 = r9.A05
            if (r0 == 0) goto L_0x0105
        L_0x00fb:
            r0 = 2131435219(0x7f0b1ed3, float:1.8492274E38)
            android.view.ViewStub r0 = X.JTR.A0X(r7, r0)
            r0.inflate()
        L_0x0105:
            if (r6 != 0) goto L_0x012a
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x012a
            if (r5 != 0) goto L_0x012a
            if (r8 != 0) goto L_0x012a
            android.content.Context r1 = r9.requireContext()
            r0 = 2131231325(0x7f08025d, float:1.8078728E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 == 0) goto L_0x0127
            android.content.Context r0 = r9.requireContext()
            int r0 = X.2Yu.A01(r0)
            X.AnonymousClass7TE.A1R(r1, r0)
        L_0x0127:
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r1, r3)
        L_0x012a:
            android.content.Context r3 = r9.requireContext()
            boolean r2 = r9.A05
            X.PvO r0 = r9.A0B
            if (r0 == 0) goto L_0x0064
            com.instagram.user.model.User r0 = r0.CD0()
            java.lang.String r1 = r0.getUsername()
            if (r6 == 0) goto L_0x0181
            if (r5 == 0) goto L_0x0196
            r0 = 2131959822(0x7f13200e, float:1.9556295E38)
            java.lang.String r0 = X.DbW.A0h(r3, r1, r0)
            X.0qQ.A0A(r0)
        L_0x014a:
            r4.setText(r0)
            boolean r0 = r9.A04
            if (r0 != 0) goto L_0x0159
            X.Oiy r0 = new X.Oiy
            r0.<init>(r9, r6, r5, r8)
            X.AnonymousClass0fU.A00(r0, r4)
        L_0x0159:
            X.PvO r3 = r9.A0B
            if (r3 == 0) goto L_0x0064
            r0 = 2131430752(0x7f0b0d60, float:1.8483214E38)
            android.view.ViewStub r2 = X.JTR.A0X(r7, r0)
            r0 = 2131439892(0x7f0b3114, float:1.8501752E38)
            android.view.ViewStub r1 = X.JTR.A0X(r7, r0)
            r0 = 2131439893(0x7f0b3115, float:1.8501754E38)
            android.view.ViewStub r0 = X.JTR.A0X(r7, r0)
            r3.CMO(r2, r1, r0)
            X.PvO r0 = r9.A0B
            if (r0 == 0) goto L_0x0064
            X.Obq r0 = r9.A00
            if (r0 != 0) goto L_0x019a
            java.lang.String r14 = "composerController"
            goto L_0x0064
        L_0x0181:
            if (r5 == 0) goto L_0x018b
            r0 = 2131959821(0x7f13200d, float:1.9556293E38)
        L_0x0186:
            java.lang.String r0 = X.DbY.A0c(r3, r1, r0)
            goto L_0x014a
        L_0x018b:
            if (r8 != 0) goto L_0x0196
            r0 = 2131959818(0x7f13200a, float:1.9556287E38)
            if (r2 == 0) goto L_0x0186
            r0 = 2131959819(0x7f13200b, float:1.955629E38)
            goto L_0x0186
        L_0x0196:
            r0 = 2131959820(0x7f13200c, float:1.9556291E38)
            goto L_0x0186
        L_0x019a:
            r0.A04(r7)
            r0 = -1363178985(0xffffffffaebf8a17, float:-8.710204E-11)
            X.AnonymousClass0fD.A09(r0, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NK2.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onPause() {
        Window window;
        String str;
        int A022 = AnonymousClass0fD.A02(57162886);
        NK2.super.onPause();
        Activity rootActivity = getRootActivity();
        if (rootActivity == null || (window = rootActivity.getWindow()) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(1404999402, A022);
            throw A0y;
        }
        window.setSoftInputMode(this.A09);
        this.A0Q = false;
        this.A0T = false;
        C71089Obq obq = this.A00;
        if (obq == null) {
            str = "composerController";
        } else {
            obq.A03();
            AnonymousClass3E6 r0 = this.A0A;
            if (r0 == null) {
                str = "keyboardHeightChangeDetector";
            } else {
                r0.onStop();
                AnonymousClass0fD.A09(-1049902223, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        IllegalStateException illegalStateException;
        int i;
        Window window;
        String str;
        int A022 = AnonymousClass0fD.A02(1022681397);
        super.onResume();
        C71089Obq obq = this.A00;
        Window window2 = null;
        if (obq == null) {
            str = "composerController";
        } else {
            ComposerAutoCompleteTextView composerAutoCompleteTextView = obq.A00;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.requestFocus();
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = obq.A00;
                if (composerAutoCompleteTextView2 != null) {
                    0nA.A0R(composerAutoCompleteTextView2);
                    Activity rootActivity = getRootActivity();
                    if (rootActivity != null) {
                        window2 = rootActivity.getWindow();
                    }
                    if (window2 != null) {
                        this.A09 = window2.getAttributes().softInputMode;
                        Activity rootActivity2 = getRootActivity();
                        if (rootActivity2 == null || (window = rootActivity2.getWindow()) == null) {
                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                            i = -1001038493;
                        } else {
                            window.setSoftInputMode(48);
                            AnonymousClass3E6 r0 = this.A0A;
                            if (r0 == null) {
                                str = "keyboardHeightChangeDetector";
                            } else {
                                JTP.A17(this, r0);
                                AnonymousClass0fD.A09(-429209213, A022);
                                return;
                            }
                        }
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                        i = -111695942;
                    }
                    AnonymousClass0fD.A09(i, A022);
                    throw illegalStateException;
                }
            }
            0qQ.A0F("messageEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
