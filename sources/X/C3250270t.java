package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.70t  reason: invalid class name and case insensitive filesystem */
public abstract class C3250270t {
    public static void A04(Context context, LinearLayout linearLayout, C61052Jvq jvq, AnonymousClass0iw r20, UserSession userSession, C322496vv r22, C323326xJ r23, C3250370u r24, User user) {
        LinearLayout linearLayout2;
        UserSession userSession2;
        C323326xJ r9;
        User user2;
        Context context2 = context;
        int A01 = AnonymousClass0nB.A01(context2);
        C3250370u r10 = r24;
        if (A01 != r10.A00) {
            C3250470v.A01(context2, r10.A08, A01);
            r10.A00 = A01;
        }
        C61052Jvq jvq2 = jvq;
        Iterator it = ((List) jvq2.A01).iterator();
        while (true) {
            linearLayout2 = linearLayout;
            userSession2 = userSession;
            r9 = r23;
            user2 = user;
            if (!it.hasNext()) {
                break;
            }
            C3250670x r11 = (C3250670x) it.next();
            View A00 = A00(context2, r20, userSession2, (1Xj) null, r9, r10, r11, (UserDetailEntryInfo) null, user2, (String) null, (String) null, (String) null, jvq2.A00);
            linearLayout2.addView(A00);
            2eS.A01(A00);
            if (r11 instanceof AnonymousClass71B) {
                r9.Bgg().EvE(A00);
            } else if (r11 instanceof AnonymousClass717) {
                r9.Bgg().Eu8(A00);
            } else if (r11 instanceof AnonymousClass718) {
                r9.Bgg().EuT(A00);
            } else if (r11 instanceof AnonymousClass719) {
                r9.Bgg().Euv(A00);
                r9.Bgg().EC2(A00, user2);
            } else if (r11 instanceof AnonymousClass71A) {
                r9.Bgg().EuS(A00);
            } else if (r11 instanceof C318626pG) {
                r9.BhL().Euj(A00);
            } else if (r11 instanceof C318746pS) {
                r9.Bgg().EvL(A00);
            }
        }
        if (jvq2.A02) {
            linearLayout2.addView(A03(context2, userSession2, r22, r9, r10, user2));
            r9.BwV().D1K();
        }
    }

    public static void A06(LinearLayout linearLayout, C3250370u r6) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            Object tag = childAt.getTag();
            Map map = r6.A07;
            if (!map.containsKey(tag)) {
                map.put(tag, new LinkedList());
            }
            Object obj = map.get(tag);
            obj.getClass();
            ((Queue) obj).offer(childAt);
        }
        linearLayout.removeAllViews();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        return A01(r11, r7, r6, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021f, code lost:
        r10.requireViewById(com.instagram.android.R.id.dot_badge).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x022b, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View A00(android.content.Context r20, X.AnonymousClass0iw r21, com.instagram.common.session.UserSession r22, X.1Xj r23, X.C323326xJ r24, X.C3250370u r25, X.C3250670x r26, com.instagram.profile.intf.UserDetailEntryInfo r27, com.instagram.user.model.User r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32) {
        /*
            r2 = r26
            java.lang.String r1 = r2.Aix()
            int r0 = r1.hashCode()
            r11 = r20
            r7 = r22
            r6 = r25
            r4 = r32
            switch(r0) {
                case -1268958287: goto L_0x001a;
                case -1183699191: goto L_0x0182;
                case 3446944: goto L_0x01e0;
                case 3529462: goto L_0x023b;
                case 627051248: goto L_0x025b;
                default: goto L_0x0015;
            }
        L_0x0015:
            android.view.View r10 = A01(r11, r7, r6, r2, r4)
            return r10
        L_0x001a:
            java.lang.String r3 = "follow"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0015
            java.util.Map r0 = r6.A07
            java.lang.Object r1 = r0.get(r3)
            java.util.Queue r1 = (java.util.Queue) r1
            r2 = 1
            r9 = r27
            r8 = r29
            r5 = r30
            if (r1 == 0) goto L_0x0138
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0138
            java.lang.Object r10 = r1.poll()
            r10.getClass()
            android.view.View r10 = (android.view.View) r10
            r0 = 2131438455(0x7f0b2b77, float:1.8498837E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
        L_0x004b:
            r0.getClass()
            X.3aK r1 = X.C243923aK.ACTIONABLE_TEXT
            r0.setBaseStyle(r1)
            X.710 r13 = r24.BhL()
            java.lang.String r17 = "button_tray"
            r12 = r23
            r11 = r28
            r20 = r31
            r18 = r8
            r19 = r5
            r15 = r0
            r16 = r11
            r14 = r9
            X.C3254572l.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = 2131438482(0x7f0b2b92, float:1.8498892E38)
            r10.setId(r1)
            boolean r1 = r0.isSelected()
            r10.setSelected(r1)
            java.lang.String r1 = r11.getId()
            X.C267154b3.A02(r10, r7, r1)
            r10.setTag(r3)
            r0.A0A = r2
            X.4as r1 = X.C267054as.FULL
            r0.setFollowButtonSize(r1)
            boolean r1 = X.C324376zB.A01(r7, r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x009b
            boolean r1 = X.C46380Ddx.A00(r7)
            if (r1 == 0) goto L_0x009b
            r0.setIsElevated(r2)
        L_0x009b:
            X.4at r2 = r0.A0J
            X.710 r1 = r24.BhL()
            r2.A07(r1)
            r2.A04 = r12
            r1 = r21
            r2.A03(r1, r7, r11)
            A05(r10, r6, r4)
            boolean r1 = X.C324376zB.A01(r7, r11)
            if (r1 == 0) goto L_0x00db
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x00db
            boolean r1 = X.C46380Ddx.A00(r7)
            if (r1 == 0) goto L_0x00db
            android.view.ViewGroup$LayoutParams r3 = r10.getLayoutParams()
            java.util.Map r2 = r6.A08
            r1 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r3.width = r1
            r10.setLayoutParams(r3)
        L_0x00db:
            boolean r1 = X.C324376zB.A01(r7, r11)
            if (r1 == 0) goto L_0x0136
            r1 = 0
            X.0qQ.A0B(r7, r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36329715312902427(0x8111af0004411b, double:3.038396479676611E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 != 0) goto L_0x0101
            boolean r1 = r6.A01
            if (r1 == 0) goto L_0x0136
            r1 = 36329715313099037(0x8111af0007411d, double:3.038396479800948E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x0136
        L_0x0101:
            r4 = 1
        L_0x0102:
            boolean r1 = r0.A07()
            if (r1 != 0) goto L_0x010a
            if (r4 == 0) goto L_0x021f
        L_0x010a:
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131165526(0x7f070156, float:1.7945272E38)
            int r2 = r3.getDimensionPixelSize(r1)
            if (r4 == 0) goto L_0x0122
            r1 = 2131165250(0x7f070042, float:1.7944712E38)
            int r2 = r3.getDimensionPixelSize(r1)
        L_0x0122:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.height = r2
            r0.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r0.height = r2
            r10.setLayoutParams(r0)
            goto L_0x021f
        L_0x0136:
            r4 = 0
            goto L_0x0102
        L_0x0138:
            X.0Tu r10 = X.0Tu.A05
            r0 = 36604949707625619(0x820c0200581493, double:3.212455819179508E-306)
            long r15 = X.182.A01(r10, r7, r0)
            r13 = 0
            r12 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0174
            r16 = 2131628354(0x7f0e1142, float:1.8883998E38)
            android.view.ViewGroup r0 = r6.A02
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r11)
            r14 = 0
            r15 = r0
            r17 = r12
            r18 = r2
            android.view.View r10 = X.2Su.A01(r13, r14, r15, r16, r17, r18)
        L_0x015d:
            r0 = 2131438455(0x7f0b2b77, float:1.8498837E38)
            android.view.View r0 = r10.requireViewById(r0)
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
            X.4at r11 = r0.A0J
            r11.A0J = r8
            r11.A0I = r5
            r11.A06 = r9
            java.lang.String r1 = "user_profile_header"
            r11.A0H = r1
            goto L_0x004b
        L_0x0174:
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r11)
            r1 = 2131628354(0x7f0e1142, float:1.8883998E38)
            android.view.ViewGroup r0 = r6.A02
            android.view.View r10 = r10.inflate(r1, r0, r12)
            goto L_0x015d
        L_0x0182:
            java.lang.String r8 = "invite"
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0015
            java.util.Map r0 = r6.A07
            java.lang.Object r1 = r0.get(r8)
            java.util.Queue r1 = (java.util.Queue) r1
            if (r1 == 0) goto L_0x01d1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01d1
            java.lang.Object r10 = r1.poll()
        L_0x019e:
            android.widget.TextView r10 = (android.widget.TextView) r10
            r10.getClass()
            r10.setTag(r8)
            java.lang.String r0 = r2.Air()
            r10.setText(r0)
            X.FLW r0 = new X.FLW
            r0.<init>(r2)
            X.AnonymousClass0fU.A00(r0, r10)
            A05(r10, r6, r4)
            X.2eS.A01(r10)
            r0 = 2131239077(0x7f0820a5, float:1.809445E38)
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            r10.setBackground(r0)
            int r0 = X.2Yu.A0E(r11)
            int r0 = r11.getColor(r0)
            r10.setTextColor(r0)
            return r10
        L_0x01d1:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r11)
            r3 = 2131628356(0x7f0e1144, float:1.8884002E38)
            android.view.ViewGroup r1 = r6.A02
            r0 = 0
            android.view.View r10 = r5.inflate(r3, r1, r0)
            goto L_0x019e
        L_0x01e0:
            java.lang.String r8 = "post"
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0015
            java.util.Map r0 = r6.A07
            java.lang.Object r1 = r0.get(r8)
            java.util.Queue r1 = (java.util.Queue) r1
            if (r1 == 0) goto L_0x022c
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x022c
            java.lang.Object r10 = r1.poll()
            android.view.View r10 = (android.view.View) r10
        L_0x01fe:
            r10.getClass()
            r0 = 2131429303(0x7f0b07b7, float:1.8480275E38)
            android.view.View r1 = r10.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r1.setTag(r8)
            java.lang.String r0 = r2.Air()
            r1.setText((java.lang.String) r0)
            X.FLV r0 = new X.FLV
            r0.<init>(r2)
            X.AnonymousClass0fU.A00(r0, r1)
            A05(r10, r6, r4)
        L_0x021f:
            r0 = 2131432007(0x7f0b1247, float:1.848576E38)
            android.view.View r1 = r10.requireViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            return r10
        L_0x022c:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r11)
            r3 = 2131628358(0x7f0e1146, float:1.8884006E38)
            android.view.ViewGroup r1 = r6.A02
            r0 = 0
            android.view.View r10 = r5.inflate(r3, r1, r0)
            goto L_0x01fe
        L_0x023b:
            java.lang.String r0 = "shop"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.719 r2 = (X.AnonymousClass719) r2
            android.view.View r10 = A01(r11, r7, r6, r2, r4)
            r0 = 2131429303(0x7f0b07b7, float:1.8480275E38)
            android.view.View r1 = r10.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            X.WBT r0 = new X.WBT
            r0.<init>(r1, r2)
            r1.addOnLayoutChangeListener(r0)
            return r10
        L_0x025b:
            java.lang.String r0 = "ai_message"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.FgP r2 = (X.C50664FgP) r2
            android.view.View r10 = A01(r11, r7, r6, r2, r4)
            r0 = 2131429303(0x7f0b07b7, float:1.8480275E38)
            android.view.View r1 = r10.requireViewById(r0)
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            X.FZh r0 = new X.FZh
            r0.<init>(r1)
            r2.A00 = r0
            X.FN5 r0 = new X.FN5
            r0.<init>(r1, r2)
            X.AnonymousClass0fU.A00(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3250270t.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.6xJ, X.70u, X.70x, com.instagram.profile.intf.UserDetailEntryInfo, com.instagram.user.model.User, java.lang.String, java.lang.String, java.lang.String, int):android.view.View");
    }

    public static View A01(Context context, UserSession userSession, C3250370u r7, C3250670x r8, int i) {
        View inflate;
        Queue queue = (Queue) r7.A07.get("generic");
        if (queue != null && !queue.isEmpty()) {
            inflate = (View) queue.poll();
        } else if (182.A06(0Tu.A05, userSession, 36322697336269156L)) {
            inflate = 2Su.A00(LayoutInflater.from(context), (ViewGroup.LayoutParams) null, r7.A02, R.layout.profile_header_user_actions_generic_button);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.profile_header_user_actions_generic_button, r7.A02, false);
        }
        inflate.getClass();
        IgdsButton igdsButton = (IgdsButton) inflate.requireViewById(R.id.button_container);
        igdsButton.setTag("generic");
        Integer BEK = r8.BEK();
        if (BEK != null) {
            igdsButton.A02(C273084lx.START, BEK.intValue());
            igdsButton.setIconPadding(context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        }
        igdsButton.setText(r8.Air());
        AnonymousClass0fU.A00(new AnonymousClass71C(r8), igdsButton);
        igdsButton.setOnLongClickListener(new AnonymousClass71D(r8));
        A05(inflate, r7, i);
        inflate.requireViewById(R.id.dot_badge).setVisibility(8);
        return inflate;
    }

    public static View A02(ViewGroup viewGroup, UserSession userSession) {
        View inflate;
        0lp A00 = 0lq.A00("ProfileUserActionsViewBinder.newView");
        try {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            if (182.A06(0Tu.A05, userSession, 36322697336793448L)) {
                inflate = 2Su.A00(LayoutInflater.from(context), (ViewGroup.LayoutParams) null, viewGroup, R.layout.profile_header_user_actions_row);
            } else {
                inflate = from.inflate(R.layout.profile_header_user_actions_row, viewGroup, false);
            }
            inflate.setTag(new C3250370u(inflate, false));
            A00.close();
            return inflate;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public static FollowChainingButton A03(Context context, UserSession userSession, C322496vv r11, C323326xJ r12, C3250370u r13, User user) {
        View inflate;
        FollowChainingButton followChainingButton;
        C320196rw r0;
        Queue queue = (Queue) r13.A07.get("chaining");
        if (queue == null || queue.isEmpty()) {
            if (182.A06(0Tu.A05, userSession, 36323474730134703L)) {
                inflate = 2Su.A01(LayoutInflater.from(context), (ViewGroup.LayoutParams) null, r13.A02, R.layout.profile_header_chaining_icon, false, true);
            } else {
                inflate = LayoutInflater.from(context).inflate(R.layout.profile_header_chaining_icon, r13.A02, false);
            }
            followChainingButton = (FollowChainingButton) inflate;
            followChainingButton.setCustomButtonStyle(new C320186rv(2Yu.A0H(context, R.attr.secondaryButtonSelector), 2Yu.A0H(context, R.attr.secondaryButtonSelector), 2Yu.A0H(context, R.attr.igds_color_primary_text), 2Yu.A0H(context, R.attr.igds_color_primary_text)));
        } else {
            followChainingButton = (FollowChainingButton) queue.poll();
        }
        followChainingButton.getClass();
        followChainingButton.setTag("chaining");
        followChainingButton.A01(r11, true);
        if (r11 == C322496vv.Loading) {
            r0 = null;
        } else {
            r0 = new C320196rw(r12);
        }
        AnonymousClass0fU.A00(r0, followChainingButton);
        if (2R8.A04(userSession, user)) {
            followChainingButton.setContentDescription(context.getString(2131960850));
        }
        return followChainingButton;
    }

    public static void A05(View view, C3250370u r4, int i) {
        LinearLayout.LayoutParams layoutParams;
        if (view.getLayoutParams() == null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams = layoutParams2;
        } else {
            layoutParams = view.getLayoutParams();
        }
        Object obj = r4.A08.get(Integer.valueOf(i));
        obj.getClass();
        layoutParams.width = ((Number) obj).intValue();
        view.setLayoutParams(layoutParams);
    }
}
