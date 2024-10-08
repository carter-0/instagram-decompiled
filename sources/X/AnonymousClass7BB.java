package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7BB  reason: invalid class name */
public abstract class AnonymousClass7BB extends C232232tF {
    public final AnonymousClass7BA A00;
    public final AnonymousClass7D2 A01;
    public final AnonymousClass7D2 A02;

    /* renamed from: A00 */
    public final AnonymousClass7AS createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C328007Db r43;
        AnonymousClass7ES r17;
        AnonymousClass7ER r7;
        AnonymousClass7EO r6;
        AnonymousClass7EK r5;
        AnonymousClass7EM r4;
        AnonymousClass7EL r1;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass7BA r13 = this.A00;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C328007Db ANK = this.A02.ANK(layoutInflater2, viewGroup2);
        AnonymousClass7D2 r0 = this.A01;
        if (r0 != null) {
            r43 = r0.ANK(layoutInflater2, viewGroup2);
        } else {
            r43 = null;
        }
        0qQ.A0B(viewGroup2, 0);
        0qQ.A0B(layoutInflater2, 1);
        0qQ.A0B(ANK, 2);
        View inflate = layoutInflater2.inflate(R.layout.context_reply_decorated_root, viewGroup2, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout");
        ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout = (ObservableVerticalOffsetConstraintLayout) inflate;
        View BJd = ANK.BJd();
        observableVerticalOffsetConstraintLayout.addView(BJd, BJd.getLayoutParams());
        if (r43 != null) {
            View BJd2 = r43.BJd();
            View requireViewById = observableVerticalOffsetConstraintLayout.requireViewById(R.id.context_reply_context_message_stub);
            0qQ.A07(requireViewById);
            View inflate2 = ((ViewStub) requireViewById).inflate();
            0qQ.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup3 = (ViewGroup) inflate2;
            if (BJd2 != null) {
                layoutParams = BJd2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            viewGroup3.addView(BJd2, layoutParams);
        }
        View requireViewById2 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_content_shortcut_buttons_container_stub);
        0qQ.A07(requireViewById2);
        View inflate3 = ((ViewStub) requireViewById2).inflate();
        0qQ.A0C(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
        AnonymousClass7D1 r02 = r13.A09;
        C328137Dq r03 = new C328137Dq(observableVerticalOffsetConstraintLayout, r02.A00, r02.A02);
        C328007Db A002 = AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0B);
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.direct.messagethread.senderavatar.SenderAvatarViewHolder");
        C328127Do r9 = (C328127Do) A002;
        C328227Dz r22 = (C328227Dz) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0E);
        AnonymousClass7EA r21 = (AnonymousClass7EA) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0F);
        AnonymousClass7ED r20 = (AnonymousClass7ED) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0G);
        AnonymousClass7EG r19 = (AnonymousClass7EG) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0D);
        AnonymousClass7EJ r18 = (AnonymousClass7EJ) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A06);
        AnonymousClass7DJ r2 = r13.A05;
        if (r2 != null) {
            View requireViewById3 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_feedback_reactions);
            0qQ.A07(requireViewById3);
            r17 = new AnonymousClass7ES(r2.A00, 2b1.A01(requireViewById3, false, false), r2.A01);
        } else {
            r17 = null;
        }
        AnonymousClass7EU r15 = (AnonymousClass7EU) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A00);
        AnonymousClass7EV r14 = (AnonymousClass7EV) AnonymousClass7AQ.A00(layoutInflater2, observableVerticalOffsetConstraintLayout, r13.A0A);
        View requireViewById4 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_context_line_stub);
        0qQ.A07(requireViewById4);
        ViewStub viewStub3 = (ViewStub) requireViewById4;
        View requireViewById5 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_reactions_pill_placeholder);
        0qQ.A07(requireViewById5);
        AnonymousClass7B9 r04 = r13.A02;
        Context context = r04.A00;
        AnonymousClass7XM r23 = r04.A01;
        IgTextView findViewById = observableVerticalOffsetConstraintLayout.findViewById(R.id.direct_context_reply_context_info_text_view);
        0qQ.A07(findViewById);
        AnonymousClass7AR r05 = new AnonymousClass7AR(context, findViewById, r23);
        if (r13.A03 != null) {
            0qQ.A0B(inflate3, 0);
            View requireViewById6 = inflate3.requireViewById(R.id.message_debug_indicator);
            0qQ.A07(requireViewById6);
            ViewStub viewStub4 = (ViewStub) requireViewById6;
            if (viewStub4 == null) {
                viewStub4 = null;
            }
            r7 = new AnonymousClass7ER(new C71662eb(viewStub4));
        } else {
            r7 = null;
        }
        AnonymousClass7DF r3 = r13.A08;
        if (r3 != null) {
            0qQ.A0B(inflate3, 0);
            View findViewById2 = inflate3.findViewById(R.id.message_info_shortcut_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById2;
            } else {
                viewStub2 = null;
            }
            r6 = new AnonymousClass7EO(r3.A00, new C71662eb(viewStub2), r3.A01);
        } else {
            r6 = null;
        }
        AnonymousClass7DB r32 = r13.A07;
        if (r32 != null) {
            0qQ.A0B(inflate3, 0);
            View findViewById3 = inflate3.findViewById(R.id.forwarding_shortcut_button);
            if (findViewById3 instanceof ViewStub) {
                viewStub = (ViewStub) findViewById3;
            } else {
                viewStub = null;
            }
            r5 = new AnonymousClass7EK(new C71662eb(viewStub), r32.A00);
        } else {
            r5 = null;
        }
        AnonymousClass7DD r12 = r13.A0C;
        if (r12 != null) {
            0qQ.A0B(inflate3, 0);
            View requireViewById7 = inflate3.requireViewById(R.id.share_to_story_shortcut_stub);
            0qQ.A07(requireViewById7);
            C252063oV A012 = 2b1.A01(requireViewById7, false, false);
            C333107Xr r26 = r12.A02;
            r4 = new AnonymousClass7EM(r12.A00, r12.A01, A012, r26);
        } else {
            r4 = null;
        }
        AnonymousClass7DC r16 = r13.A01;
        if (r16 != null) {
            0qQ.A0B(inflate3, 0);
            View requireViewById8 = inflate3.requireViewById(R.id.camera_reply_shortcut_stub);
            0qQ.A07(requireViewById8);
            r1 = new AnonymousClass7EL(2b1.A01(requireViewById8, false, false), r16.A00);
        } else {
            r1 = null;
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View findViewById4 = observableVerticalOffsetConstraintLayout.findViewById(R.id.direct_reactions_pill_spacer);
        0qQ.A07(findViewById4);
        View inflate4 = viewStub3.inflate();
        0qQ.A07(inflate4);
        return new AnonymousClass7AS(inflate4, requireViewById5, (Space) findViewById4, observableVerticalOffsetConstraintLayout, r15, r1, r05, r7, r17, r18, r5, r6, r03, r14, r9, r4, ANK, r43, r19, r22, r21, r20);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0270, code lost:
        if (r13.A05 == false) goto L_0x0272;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0510  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0187  */
    /* renamed from: A01 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(X.C232262tL r47, X.AnonymousClass7AT r48) {
        /*
            r46 = this;
            r5 = r46
            r0 = r48
            r4 = r47
            X.7D2 r3 = r5.A02
            X.7Db r2 = r0.A01
            X.79P r4 = (X.AnonymousClass79P) r4
            X.7FW r1 = r4.BmF()
            r3.ADp(r2, r1)
            X.7D2 r3 = r5.A01
            if (r3 == 0) goto L_0x0024
            X.7Db r2 = r0.A00
            if (r2 == 0) goto L_0x0024
            X.7FW r1 = r4.Aqu()
            if (r1 == 0) goto L_0x0024
            r3.ADp(r2, r1)
        L_0x0024:
            X.7BA r3 = r5.A00
            X.7Fm r1 = r4.Ar3()
            X.7AS r0 = (X.AnonymousClass7AS) r0
            X.77t r1 = (X.C3266877t) r1
            r4 = 0
            X.0qQ.A0B(r0, r4)
            r23 = 1
            r2 = r23
            X.0qQ.A0B(r1, r2)
            boolean r2 = r1.A0R
            r22 = r2
            r11 = 8
            r6 = 0
            X.7Db r2 = r0.A00
            r21 = r2
            if (r22 == 0) goto L_0x0558
            if (r2 == 0) goto L_0x0051
            android.view.View r2 = r21.BJd()
            if (r2 == 0) goto L_0x0051
            r2.setVisibility(r4)
        L_0x0051:
            X.7Rk r8 = r1.A0C
            if (r8 == 0) goto L_0x0061
            X.7D1 r7 = r3.A09
            X.7Dq r5 = r0.A0D
            X.MaU r2 = new X.MaU
            r2.<init>(r0)
            r7.A00(r2, r5, r8)
        L_0x0061:
            com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout r2 = r0.A03
            r45 = r2
            X.77s r2 = r1.A06
            X.0eM r2 = r2.A00
            java.lang.Object r5 = r2.getValue()
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r2 = r45
            r2.setBackground(r5)
            X.7D3 r5 = r3.A0B
            X.7Do r12 = r0.A0F
            X.7Fg r2 = r1.A0E
            r44 = r2
            r5.ADp(r12, r2)
            X.7D4 r2 = r3.A0E
            if (r2 == 0) goto L_0x00c9
            X.7Dz r9 = r0.A0I
            if (r9 == 0) goto L_0x00c9
            X.7A9 r8 = r1.A0H
            if (r8 == 0) goto L_0x00c9
            android.view.View r5 = r0.A01
            X.79G r2 = r1.A0I
            if (r2 != 0) goto L_0x00ad
            boolean r2 = r8.A08
            if (r2 == 0) goto L_0x0553
            r5.setVisibility(r4)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r5 = r2.getResources()
            r2 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r2 = r5.getDimensionPixelSize(r2)
            r7.height = r2
        L_0x00ad:
            X.0qQ.A0B(r9, r4)
            r9.A01(r8)
            android.view.View r7 = r9.A04
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r7, r2)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            boolean r5 = r1.A0N
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == 0) goto L_0x00c6
            r2 = 8388613(0x800005, float:1.175495E-38)
        L_0x00c6:
            r7.setGravity(r2)
        L_0x00c9:
            X.7D6 r10 = r3.A0F
            if (r10 == 0) goto L_0x00fa
            X.7EA r9 = r0.A0J
            if (r9 == 0) goto L_0x00fa
            X.79G r8 = r1.A0I
            if (r8 == 0) goto L_0x00fa
            android.view.View r5 = r0.A01
            X.7A9 r2 = r1.A0H
            if (r2 != 0) goto L_0x00f7
            boolean r2 = r8.A0I
            if (r2 == 0) goto L_0x054e
            r5.setVisibility(r4)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            android.content.res.Resources r5 = r2.getResources()
            r2 = 2131165248(0x7f070040, float:1.7944708E38)
            int r2 = r5.getDimensionPixelSize(r2)
            r7.height = r2
        L_0x00f7:
            r10.ADp(r8, r9)
        L_0x00fa:
            X.7D7 r2 = r3.A0G
            if (r2 == 0) goto L_0x010b
            X.7ED r5 = r0.A0K
            if (r5 == 0) goto L_0x010b
            X.7Fh r2 = r1.A0J
            if (r2 == 0) goto L_0x010b
            X.3oV r2 = r5.A00
            r2.getView()
        L_0x010b:
            X.7D8 r2 = r3.A0D
            if (r2 == 0) goto L_0x011a
            X.7EG r5 = r0.A0H
            if (r5 == 0) goto L_0x011a
            X.7AA r2 = r1.A0G
            if (r2 == 0) goto L_0x011a
            r5.A00(r2)
        L_0x011a:
            X.7DA r2 = r3.A06
            if (r2 == 0) goto L_0x0129
            X.7EJ r5 = r0.A0A
            if (r5 == 0) goto L_0x0129
            X.75x r2 = r1.A09
            if (r2 == 0) goto L_0x0547
            r5.A00(r2)
        L_0x0129:
            boolean r2 = r1.A0M
            if (r2 == 0) goto L_0x0136
            X.77u r5 = new X.77u
            r5.<init>(r0)
            r2 = r45
            r2.A00 = r5
        L_0x0136:
            X.77r r5 = r1.A07
            java.lang.CharSequence r2 = r5.A04
            if (r2 == 0) goto L_0x053b
            int r2 = r2.length()
            if (r2 == 0) goto L_0x053b
            X.7AR r9 = r0.A06
            X.0qQ.A0B(r9, r4)
            r9.A00(r5)
        L_0x014a:
            X.7DI r2 = r3.A03
            if (r2 == 0) goto L_0x0537
            X.7ER r5 = r0.A07
            if (r5 == 0) goto L_0x0537
            X.7AB r2 = r1.A08
            if (r2 == 0) goto L_0x0532
            r5.A00(r2)
            r17 = 1
        L_0x015b:
            X.7DL r2 = r3.A0A
            if (r2 == 0) goto L_0x016a
            X.7EV r5 = r0.A0E
            if (r5 == 0) goto L_0x016a
            X.7AF r2 = r1.A0D
            if (r2 == 0) goto L_0x052b
            r5.A01(r2)
        L_0x016a:
            X.7DF r2 = r3.A08
            if (r2 == 0) goto L_0x0527
            X.7EO r5 = r0.A0C
            if (r5 == 0) goto L_0x0527
            X.7AC r2 = r1.A0B
            if (r2 == 0) goto L_0x0524
            r5.A01(r2)
            r16 = 1
        L_0x017b:
            X.7DD r2 = r3.A0C
            if (r2 == 0) goto L_0x0521
            X.7EM r5 = r0.A0G
            if (r5 == 0) goto L_0x0521
            X.9Ix r2 = r1.A02
            if (r2 == 0) goto L_0x051e
            r5.A01(r2)
            r15 = 1
        L_0x018b:
            X.7DB r2 = r3.A07
            if (r2 == 0) goto L_0x051b
            X.7EK r5 = r0.A0B
            if (r5 == 0) goto L_0x051b
            if (r15 == 0) goto L_0x0199
            boolean r2 = r1.A0P
            if (r2 == 0) goto L_0x0516
        L_0x0199:
            X.77i r2 = r1.A0A
            if (r2 == 0) goto L_0x0516
            r5.A00(r2)
            r14 = 1
        L_0x01a1:
            X.7DC r2 = r3.A01
            if (r2 == 0) goto L_0x0513
            X.7EL r5 = r0.A05
            if (r5 == 0) goto L_0x0513
            X.7AD r2 = r1.A05
            if (r2 == 0) goto L_0x0510
            r5.A02(r2)
            r13 = 1
        L_0x01b1:
            X.7DJ r2 = r3.A05
            if (r2 == 0) goto L_0x01c0
            X.7ES r5 = r0.A09
            if (r5 == 0) goto L_0x01c0
            X.9Ix r2 = r1.A01
            if (r2 == 0) goto L_0x0503
            r5.A01(r2)
        L_0x01c0:
            X.7DK r7 = r3.A00
            if (r7 == 0) goto L_0x01cf
            X.7EU r5 = r0.A04
            if (r5 == 0) goto L_0x01cf
            X.7AE r2 = r1.A04
            if (r2 == 0) goto L_0x04fc
            r7.ADp(r5, r2)
        L_0x01cf:
            r10 = 5
            boolean[] r8 = new boolean[r10]
            r8[r4] = r17
            r8[r23] = r16
            r2 = 2
            r8[r2] = r14
            r5 = 3
            r8[r5] = r15
            r7 = 4
            r8[r7] = r13
            r20 = 0
        L_0x01e1:
            boolean r2 = r8[r6]
            if (r2 == 0) goto L_0x01e7
            int r20 = r20 + 1
        L_0x01e7:
            int r6 = r6 + 1
            if (r6 < r10) goto L_0x01e1
            X.4gb r2 = new X.4gb
            r2.<init>()
            r6 = r45
            r2.A0I(r6)
            X.7Dz r13 = r0.A0I
            if (r13 == 0) goto L_0x04dc
            X.7EA r10 = r0.A0J
            if (r10 == 0) goto L_0x04dc
            X.7EG r6 = r0.A0H
            r19 = r6
            if (r6 == 0) goto L_0x04dc
            X.7EJ r6 = r0.A0A
            r18 = r6
            if (r6 == 0) goto L_0x04dc
            X.7EU r6 = r0.A04
            r16 = r6
            if (r6 == 0) goto L_0x04dc
            X.7ES r8 = r0.A09
            if (r8 == 0) goto L_0x04dc
            android.content.Context r6 = r45.getContext()
            X.0qQ.A07(r6)
            X.7Db r14 = r0.A01
            r43 = r14
            android.view.View r14 = r43.BJd()
            int r15 = r14.getId()
            android.view.View r12 = r12.BJd()
            int r17 = r12.getId()
            android.view.View r12 = r13.A04
            int r28 = r12.getId()
            android.view.View r12 = r0.A01
            int r29 = r12.getId()
            android.view.View r10 = r10.BJd()
            int r30 = r10.getId()
            android.view.View r10 = r19.BJd()
            int r31 = r10.getId()
            android.view.View r10 = r18.BJd()
            int r14 = r10.getId()
            android.view.View r10 = r16.BJd()
            int r16 = r10.getId()
            X.3oV r8 = r8.A07
            android.view.View r8 = r8.getView()
            int r12 = r8.getId()
            boolean r8 = r1.A0N
            r18 = r8
            X.7AA r13 = r1.A0G
            if (r13 == 0) goto L_0x0272
            boolean r8 = r13.A05
            r34 = 1
            if (r8 != 0) goto L_0x0274
        L_0x0272:
            r34 = 0
        L_0x0274:
            X.79G r8 = r1.A0I
            r10 = r8
            X.7A9 r8 = r1.A0H
            java.util.ArrayList r26 = X.AnonymousClass7GD.A00(r13, r8, r10)
            r35 = r2
            r36 = r15
            r37 = r30
            r38 = r29
            r39 = r28
            r40 = r31
            r41 = r14
            r42 = r18
            X.C3267077v.A03(r35, r36, r37, r38, r39, r40, r41, r42)
            r2.A0C(r14, r7, r12, r5)
            r2.A0C(r12, r5, r14, r7)
            r2.A0C(r12, r7, r4, r7)
            r8 = 6
            r2.A0C(r12, r8, r15, r8)
            r8 = r17
            X.C3267077v.A01(r6, r2, r15, r8)
            r24 = r6
            r25 = r2
            r27 = r15
            r32 = r4
            r33 = r18
            X.C3267077v.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = r16
            X.C3267077v.A00(r6, r2, r8)
        L_0x02b4:
            r8 = r44
            X.7Ff r10 = r8.A01
            X.7GB r8 = X.AnonymousClass7GB.A00
            boolean r8 = X.0qQ.A0K(r10, r8)
            if (r8 == 0) goto L_0x02c8
            X.7AE r8 = r1.A04
            if (r8 == 0) goto L_0x04d8
            int r8 = r8.A00
            if (r8 != 0) goto L_0x04d8
        L_0x02c8:
            r19 = 1
        L_0x02ca:
            android.view.View r8 = r43.BJd()
            int r13 = r8.getId()
            if (r21 == 0) goto L_0x046b
            android.view.View r8 = r0.A00
            int r18 = r8.getId()
            com.instagram.common.ui.base.IgTextView r8 = r9.A01
            int r12 = r8.getId()
            boolean r8 = r1.A0N
            r17 = r8
            boolean r8 = r1.A0O
            r30 = r8
            boolean r8 = r3.A0H
            r16 = 0
            if (r8 == 0) goto L_0x02f0
            r16 = 1
        L_0x02f0:
            r10 = 2131430772(0x7f0b0d74, float:1.8483254E38)
            if (r22 == 0) goto L_0x0467
            android.content.res.Resources r9 = r6.getResources()
            r8 = 2131165190(0x7f070006, float:1.794459E38)
            int r29 = r9.getDimensionPixelOffset(r8)
        L_0x0300:
            r2.A0C(r12, r5, r4, r5)
            r24 = r2
            r25 = r10
            r26 = r5
            r27 = r12
            r28 = r7
            r24.A0E(r25, r26, r27, r28, r29)
            r8 = r18
            r2.A0C(r8, r5, r10, r5)
            r2.A0C(r8, r7, r10, r7)
            r25 = r13
            r27 = r10
            r24.A0E(r25, r26, r27, r28, r29)
            r9 = 6
            r2.A09(r13, r9)
            r8 = 7
            r2.A09(r13, r8)
            r2.A09(r10, r9)
            r2.A09(r10, r8)
            r14 = r18
            r2.A09(r14, r9)
            r2.A09(r14, r8)
            r2.A09(r12, r9)
            r2.A09(r12, r8)
            r14 = r30
            int r15 = X.AnonymousClass7PV.A00(r6, r14)
            X.6rh r14 = X.C270354gb.A02(r2, r10)
            X.6rk r14 = r14.A03
            r14.A0u = r15
            r14 = r30
            int r15 = X.AnonymousClass7PV.A00(r6, r14)
            X.6rh r14 = X.C270354gb.A02(r2, r13)
            X.6rk r14 = r14.A03
            r14.A0u = r15
            android.content.res.Resources r15 = r6.getResources()
            r14 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r29 = r15.getDimensionPixelOffset(r14)
            if (r17 == 0) goto L_0x041c
            r14 = 2130969135(0x7f04022f, float:1.7546943E38)
            int r30 = X.2Yu.A0G(r6, r14)
            r2.A0C(r12, r8, r10, r8)
            r25 = r10
            r26 = r8
            r27 = r18
            r28 = r9
            r24.A0E(r25, r26, r27, r28, r29)
            r25 = r2
            r26 = r18
            r27 = r8
            r28 = r4
            r29 = r8
            r25.A0E(r26, r27, r28, r29, r30)
            r26 = r13
            r25.A0E(r26, r27, r28, r29, r30)
        L_0x038b:
            if (r20 <= 0) goto L_0x03c5
            r4 = r21
            boolean r4 = r4 instanceof X.C3263876o
            if (r4 != 0) goto L_0x039d
            boolean r4 = r1.A0Q
            if (r4 == 0) goto L_0x0413
            r8 = r23
            r4 = r20
            if (r4 <= r8) goto L_0x0413
        L_0x039d:
            r9 = 2131430772(0x7f0b0d74, float:1.8483254E38)
        L_0x03a0:
            r8 = 2131436190(0x7f0b229e, float:1.8494243E38)
            r2.A0C(r8, r5, r9, r5)
            r2.A0C(r8, r7, r9, r7)
            android.content.res.Resources r5 = r6.getResources()
            r4 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r19 = r5.getDimensionPixelOffset(r4)
            r16 = 6
            r18 = 7
            if (r17 == 0) goto L_0x03be
            r16 = 7
            r18 = 6
        L_0x03be:
            r14 = r2
            r15 = r8
            r17 = r9
            r14.A0E(r15, r16, r17, r18, r19)
        L_0x03c5:
            r4 = r45
            r2.A0G(r4)
            X.0qQ.A07(r6)
            r2 = 10
            float r2 = X.0nA.A04(r6, r2)
            int r4 = (int) r2
            android.widget.Space r2 = r0.A02
            X.AnonymousClass7GC.A00(r2, r4)
            X.7EA r2 = r0.A0J
            if (r2 == 0) goto L_0x03e5
            X.7EE r4 = r0.A08
            android.view.View r2 = r2.BJd()
            r4.A00 = r2
        L_0x03e5:
            boolean r2 = r3.A0H
            android.view.View r0 = r0.A00
            if (r2 == 0) goto L_0x040f
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            int r0 = r1.A00
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x03f8:
            X.7AG r4 = r1.A0F
            if (r4 == 0) goto L_0x040e
            java.lang.String r3 = r4.A0B
            if (r3 == 0) goto L_0x040e
            com.instagram.common.session.UserSession r0 = r1.A03
            X.7I3 r2 = new X.7I3
            r2.<init>(r0)
            java.lang.String r1 = r1.A0K
            java.lang.String r0 = r4.A05
            r2.A0C(r1, r0, r3)
        L_0x040e:
            return
        L_0x040f:
            r0.setVisibility(r11)
            goto L_0x03f8
        L_0x0413:
            android.view.View r4 = r43.BJd()
            int r9 = r4.getId()
            goto L_0x03a0
        L_0x041c:
            r2.A0C(r12, r9, r10, r9)
            r2.A0C(r12, r8, r4, r8)
            r2.A0B(r12, r4)
            if (r19 == 0) goto L_0x045b
            r12 = 2130968699(0x7f04007b, float:1.754606E38)
            int r35 = X.2Yu.A0G(r6, r12)
        L_0x042e:
            r30 = r2
            if (r16 == 0) goto L_0x044f
            r31 = r18
            r32 = r9
            r33 = r4
            r34 = r9
            r30.A0E(r31, r32, r33, r34, r35)
            r25 = r10
            r26 = r9
            r27 = r18
            r28 = r8
            r24.A0E(r25, r26, r27, r28, r29)
        L_0x0448:
            r31 = r13
            r30.A0E(r31, r32, r33, r34, r35)
            goto L_0x038b
        L_0x044f:
            r31 = r10
            r32 = r9
            r33 = r4
            r34 = r9
            r30.A0E(r31, r32, r33, r34, r35)
            goto L_0x0448
        L_0x045b:
            android.content.res.Resources r12 = r6.getResources()
            r14 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r35 = r12.getDimensionPixelSize(r14)
            goto L_0x042e
        L_0x0467:
            r29 = 0
            goto L_0x0300
        L_0x046b:
            com.instagram.common.ui.base.IgTextView r8 = r9.A01
            int r9 = r8.getId()
            boolean r8 = r1.A0N
            r17 = r8
            if (r22 == 0) goto L_0x04d5
            android.content.res.Resources r10 = r6.getResources()
            r8 = 2131165190(0x7f070006, float:1.794459E38)
            int r29 = r10.getDimensionPixelOffset(r8)
        L_0x0482:
            r2.A0C(r9, r5, r4, r5)
            r24 = r2
            r25 = r13
            r26 = r5
            r27 = r9
            r28 = r7
            r24.A0E(r25, r26, r27, r28, r29)
            r8 = 6
            r2.A09(r13, r8)
            r8 = 7
            r2.A09(r13, r8)
            r8 = 6
            r2.A09(r9, r8)
            r8 = 7
            r2.A09(r9, r8)
            if (r17 == 0) goto L_0x04bd
            r8 = 2130969135(0x7f04022f, float:1.7546943E38)
            int r29 = X.2Yu.A0G(r6, r8)
            r26 = 7
        L_0x04ad:
            r25 = r9
            r27 = r4
            r28 = r26
            r24.A0E(r25, r26, r27, r28, r29)
            r25 = r13
            r24.A0E(r25, r26, r27, r28, r29)
            goto L_0x038b
        L_0x04bd:
            if (r19 == 0) goto L_0x04c9
            r8 = 2130968699(0x7f04007b, float:1.754606E38)
            int r29 = X.2Yu.A0G(r6, r8)
        L_0x04c6:
            r26 = 6
            goto L_0x04ad
        L_0x04c9:
            android.content.res.Resources r10 = r6.getResources()
            r8 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r29 = r10.getDimensionPixelSize(r8)
            goto L_0x04c6
        L_0x04d5:
            r29 = 0
            goto L_0x0482
        L_0x04d8:
            r19 = 0
            goto L_0x02ca
        L_0x04dc:
            android.content.Context r6 = r45.getContext()
            X.0qQ.A07(r6)
            X.7Db r8 = r0.A01
            r43 = r8
            android.view.View r8 = r43.BJd()
            int r10 = r8.getId()
            android.view.View r8 = r12.BJd()
            int r8 = r8.getId()
            X.C3267077v.A01(r6, r2, r10, r8)
            goto L_0x02b4
        L_0x04fc:
            X.2eb r2 = r5.A00
            r2.A03(r11)
            goto L_0x01cf
        L_0x0503:
            X.7Rl r2 = new X.7Rl
            r2.<init>(r5)
            X.11Z.A02(r2)
            r2 = 0
            r5.A02 = r2
            goto L_0x01c0
        L_0x0510:
            r5.A00()
        L_0x0513:
            r13 = 0
            goto L_0x01b1
        L_0x0516:
            X.2eb r2 = r5.A00
            r2.A03(r11)
        L_0x051b:
            r14 = 0
            goto L_0x01a1
        L_0x051e:
            r5.A00()
        L_0x0521:
            r15 = 0
            goto L_0x018b
        L_0x0524:
            r5.A00()
        L_0x0527:
            r16 = 0
            goto L_0x017b
        L_0x052b:
            X.2eb r2 = r5.A00
            r2.A03(r11)
            goto L_0x016a
        L_0x0532:
            X.2eb r2 = r5.A00
            r2.A03(r11)
        L_0x0537:
            r17 = 0
            goto L_0x015b
        L_0x053b:
            X.7AR r9 = r0.A06
            X.0qQ.A0B(r9, r4)
            com.instagram.common.ui.base.IgTextView r2 = r9.A01
            r2.setVisibility(r11)
            goto L_0x014a
        L_0x0547:
            X.2eb r2 = r5.A01
            r2.A03(r11)
            goto L_0x0129
        L_0x054e:
            r5.setVisibility(r11)
            goto L_0x00f7
        L_0x0553:
            r5.setVisibility(r11)
            goto L_0x00ad
        L_0x0558:
            if (r2 == 0) goto L_0x0051
            android.view.View r2 = r21.BJd()
            if (r2 == 0) goto L_0x0051
            r2.setVisibility(r11)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BB.bind(X.2tL, X.7AT):void");
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r6) {
        AnonymousClass7EV r0;
        AnonymousClass7EU r02;
        AnonymousClass7ES r1;
        AnonymousClass7EO r03;
        AnonymousClass7ER r04;
        AnonymousClass7EG r4;
        AnonymousClass7EA r05;
        C328227Dz r06;
        C328007Db r07;
        AnonymousClass7AT r62 = (AnonymousClass7AT) r6;
        this.A02.FIP(r62.A01);
        AnonymousClass7D2 r12 = this.A01;
        if (!(r12 == null || (r07 = r62.A00) == null)) {
            r12.FIP(r07);
        }
        AnonymousClass7BA r3 = this.A00;
        AnonymousClass7AS r63 = (AnonymousClass7AS) r62;
        0qQ.A0B(r63, 0);
        C328137Dq r13 = r63.A0D;
        r13.A0A.A01();
        r13.A06 = null;
        if (!(r3.A0E == null || (r06 = r63.A0I) == null)) {
            r06.A00();
        }
        if (!(r3.A0F == null || (r05 = r63.A0J) == null)) {
            r05.A02();
        }
        if (!(r3.A0D == null || (r4 = r63.A0H) == null)) {
            r4.A06.A03(8);
            r4.A05 = null;
        }
        if (!(r3.A03 == null || (r04 = r63.A07) == null)) {
            r04.A00.A03(8);
        }
        if (!(r3.A08 == null || (r03 = r63.A0C) == null)) {
            r03.A00();
        }
        if (!(r3.A05 == null || (r1 = r63.A09) == null)) {
            11Z.A02(new C331557Rl(r1));
            r1.A02 = null;
        }
        if (!(r3.A00 == null || (r02 = r63.A04) == null)) {
            r02.A00.A03(8);
        }
        if (!(r3.A0A == null || (r0 = r63.A0E) == null)) {
            r0.A00.A03(8);
        }
        r63.A08.A00 = null;
    }

    public AnonymousClass7BB(AnonymousClass7BA r1, AnonymousClass7D2 r2, AnonymousClass7D2 r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }
}
