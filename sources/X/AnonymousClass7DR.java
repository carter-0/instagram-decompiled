package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;

/* renamed from: X.7DR  reason: invalid class name */
public abstract class AnonymousClass7DR {
    public final AnonymousClass7DA A00;
    public final AnonymousClass7DB A01;
    public final AnonymousClass7DD A02;
    public final AnonymousClass7DH A03;
    public final AnonymousClass7D6 A04;
    public final AnonymousClass7DO A05;
    public final AnonymousClass7DK A06;
    public final AnonymousClass7DC A07;
    public final AnonymousClass7DN A08;
    public final AnonymousClass7DE A09;
    public final AnonymousClass7DI A0A;
    public final AnonymousClass7DJ A0B;
    public final AnonymousClass7D9 A0C;
    public final AnonymousClass7DF A0D;
    public final AnonymousClass7D1 A0E;
    public final AnonymousClass7DL A0F;
    public final AnonymousClass7D3 A0G;
    public final AnonymousClass7DG A0H;
    public final AnonymousClass7DM A0I;
    public final AnonymousClass7D8 A0J;
    public final AnonymousClass7D4 A0K;
    public final AnonymousClass7D7 A0L;
    public final boolean A0M;

    public final AnonymousClass7EZ A00(ViewGroup viewGroup, C328217Dy r53, C328137Dq r54, C328127Do r55, C328007Db r56) {
        C328227Dz r48;
        AnonymousClass7EA r23;
        AnonymousClass7ED r10;
        AnonymousClass7EG r22;
        AnonymousClass7EI r21;
        AnonymousClass7EJ r20;
        AnonymousClass7EK r19;
        AnonymousClass7EL r18;
        AnonymousClass7EM r17;
        AnonymousClass7EN r16;
        AnonymousClass7EO r15;
        AnonymousClass7EP r9;
        AnonymousClass7EQ r8;
        AnonymousClass7ER r7;
        AnonymousClass7ES r6;
        AnonymousClass7EU r5;
        AnonymousClass7EV r4;
        AnonymousClass7EW r3;
        AnonymousClass7EX r1;
        View view;
        View view2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 4);
        AnonymousClass7D4 r12 = this.A0K;
        AnonymousClass7EY r0 = null;
        if (r12 != null) {
            r48 = r12.A00(viewGroup2);
        } else {
            r48 = null;
        }
        AnonymousClass7D6 r14 = this.A04;
        if (r14 != null) {
            r23 = new AnonymousClass7EA(new C71662eb((ViewStub) viewGroup2.findViewById(R.id.direct_reactions_pill_stub)), r14.A00);
        } else {
            r23 = null;
        }
        if (this.A0L != null) {
            View findViewById = viewGroup2.findViewById(R.id.sticker_reaction_pill);
            r10 = null;
            if (findViewById != null) {
                r10 = new AnonymousClass7ED(2b1.A01(findViewById, false, false));
            }
        } else {
            r10 = null;
        }
        AnonymousClass7D8 r2 = this.A0J;
        if (r2 != null) {
            r22 = new AnonymousClass7EG(new C71662eb((ViewStub) viewGroup2.findViewById(R.id.direct_comments_pill_stub)), r2.A00);
        } else {
            r22 = null;
        }
        AnonymousClass7D9 r62 = this.A0C;
        if (r62 != null) {
            View findViewById2 = viewGroup2.findViewById(R.id.message_header_label_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub6 = (ViewStub) findViewById2;
            } else {
                viewStub6 = null;
            }
            r21 = new AnonymousClass7EI(r62.A00, r62.A01, new C71662eb(viewStub6), r62.A02);
        } else {
            r21 = null;
        }
        AnonymousClass7DA r24 = this.A00;
        if (r24 != null) {
            View requireViewById = viewGroup2.requireViewById(R.id.message_footer_label);
            0qQ.A07(requireViewById);
            r20 = new AnonymousClass7EJ(r24.A00, new C71662eb((ViewStub) requireViewById), r24.A01);
        } else {
            r20 = null;
        }
        AnonymousClass7DB r42 = this.A01;
        if (r42 != null) {
            View findViewById3 = viewGroup2.findViewById(R.id.forwarding_shortcut_button);
            if (findViewById3 instanceof ViewStub) {
                viewStub5 = (ViewStub) findViewById3;
            } else {
                viewStub5 = null;
            }
            r19 = new AnonymousClass7EK(new C71662eb(viewStub5), r42.A00);
        } else {
            r19 = null;
        }
        AnonymousClass7DC r43 = this.A07;
        if (r43 != null) {
            View requireViewById2 = viewGroup2.requireViewById(R.id.camera_reply_shortcut_stub);
            0qQ.A07(requireViewById2);
            r18 = new AnonymousClass7EL(2b1.A01(requireViewById2, false, false), r43.A00);
        } else {
            r18 = null;
        }
        AnonymousClass7DD r63 = this.A02;
        if (r63 != null) {
            View requireViewById3 = viewGroup2.requireViewById(R.id.share_to_story_shortcut_stub);
            0qQ.A07(requireViewById3);
            r17 = new AnonymousClass7EM(r63.A00, r63.A01, 2b1.A01(requireViewById3, false, false), r63.A02);
        } else {
            r17 = null;
        }
        AnonymousClass7DE r44 = this.A09;
        if (r44 != null) {
            View findViewById4 = viewGroup2.findViewById(R.id.save_to_collection_shortcut_stub);
            if (findViewById4 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById4;
            } else {
                viewStub4 = null;
            }
            r16 = new AnonymousClass7EN(new C71662eb(viewStub4), r44.A00);
        } else {
            r16 = null;
        }
        AnonymousClass7DF r45 = this.A0D;
        if (r45 != null) {
            View findViewById5 = viewGroup2.findViewById(R.id.message_info_shortcut_stub);
            if (findViewById5 instanceof ViewStub) {
                viewStub3 = (ViewStub) findViewById5;
            } else {
                viewStub3 = null;
            }
            r15 = new AnonymousClass7EO(r45.A00, new C71662eb(viewStub3), r45.A01);
        } else {
            r15 = null;
        }
        AnonymousClass7DG r52 = this.A0H;
        if (r52 != null) {
            View findViewById6 = viewGroup2.findViewById(R.id.shared_stack_creation_shortcut_button);
            if (findViewById6 instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById6;
            } else {
                viewStub2 = null;
            }
            r9 = new AnonymousClass7EP(r52.A00, r52.A01, new C71662eb(viewStub2), r52.A02);
        } else {
            r9 = null;
        }
        AnonymousClass7DH r46 = this.A03;
        if (r46 != null) {
            View findViewById7 = viewGroup2.findViewById(R.id.three_dot_shortcut_stub);
            if (findViewById7 instanceof ViewStub) {
                viewStub = (ViewStub) findViewById7;
            } else {
                viewStub = null;
            }
            r8 = new AnonymousClass7EQ(r46.A00, new C71662eb(viewStub), r46.A01);
        } else {
            r8 = null;
        }
        if (this.A0A != null) {
            View requireViewById4 = viewGroup2.requireViewById(R.id.message_debug_indicator);
            0qQ.A07(requireViewById4);
            ViewStub viewStub7 = (ViewStub) requireViewById4;
            if (viewStub7 == null) {
                viewStub7 = null;
            }
            r7 = new AnonymousClass7ER(new C71662eb(viewStub7));
        } else {
            r7 = null;
        }
        AnonymousClass7DJ r47 = this.A0B;
        if (r47 != null) {
            View requireViewById5 = viewGroup2.requireViewById(R.id.message_feedback_reactions);
            0qQ.A07(requireViewById5);
            r6 = new AnonymousClass7ES(r47.A00, 2b1.A01(requireViewById5, false, false), r47.A01);
        } else {
            r6 = null;
        }
        if (this.A06 != null) {
            View requireViewById6 = viewGroup2.requireViewById(R.id.bulk_selector);
            0qQ.A07(requireViewById6);
            r5 = new AnonymousClass7EU(new C71662eb((ViewStub) requireViewById6));
        } else {
            r5 = null;
        }
        AnonymousClass7DL r32 = this.A0F;
        if (r32 != null) {
            View requireViewById7 = viewGroup2.requireViewById(R.id.receiver_fetch_message_debug_indicator);
            0qQ.A07(requireViewById7);
            r4 = new AnonymousClass7EV(new C71662eb((ViewStub) requireViewById7), r32.A00);
        } else {
            r4 = null;
        }
        AnonymousClass7DM r13 = this.A0I;
        if (r13 != null) {
            View requireViewById8 = viewGroup2.requireViewById(R.id.subscribe_shortcut_stub);
            0qQ.A07(requireViewById8);
            r3 = new AnonymousClass7EW(r13.A00, 2b1.A01(requireViewById8, false, false), r13.A01);
        } else {
            r3 = null;
        }
        AnonymousClass7DN r25 = this.A08;
        if (r25 != null) {
            View requireViewById9 = viewGroup2.requireViewById(R.id.clips_stacks_shortcut_stub);
            0qQ.A07(requireViewById9);
            r1 = new AnonymousClass7EX(2b1.A01(requireViewById9, false, false), r25.A00);
        } else {
            r1 = null;
        }
        if (r14 != null) {
            view = viewGroup2.requireViewById(R.id.message_reactions_pill_placeholder);
        } else {
            view = null;
        }
        if (this.A0M) {
            view2 = ((ViewStub) viewGroup2.requireViewById(R.id.message_context_line_stub)).inflate();
        } else {
            view2 = null;
        }
        AnonymousClass7DO r26 = this.A05;
        if (r26 != null) {
            View requireViewById10 = viewGroup2.requireViewById(R.id.edit_response_shortcut_stub);
            0qQ.A07(requireViewById10);
            r0 = new AnonymousClass7EY(2b1.A01(requireViewById10, false, false), r26.A00);
        }
        return new AnonymousClass7EZ(view, view2, r0, r5, r18, r1, r16, r53, r7, r6, r20, r19, r21, r15, r54, r4, r55, r9, r17, r3, r8, r56, r22, r48, r23, r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass7EZ r13, X.C328607Fl r14) {
        /*
            r12 = this;
            r5 = 0
            r11 = 1
            X.0qQ.A0B(r14, r11)
            X.7Dy r4 = r13.A07
            android.view.View r3 = r4.A00()
            android.graphics.drawable.Drawable r0 = r14.A01
            r3.setBackground(r0)
            X.7Do r2 = r13.A0H
            if (r2 == 0) goto L_0x001d
            X.7D3 r1 = r12.A0G
            if (r1 == 0) goto L_0x001d
            X.7Fg r0 = r14.A0I
            r1.ADp(r2, r0)
        L_0x001d:
            X.7Rk r6 = r14.A0G
            X.7D1 r1 = r12.A0E
            X.7Dq r2 = r13.A0F
            X.7G6 r0 = new X.7G6
            r0.<init>(r13, r4)
            r1.A00(r0, r2, r6)
            X.7D6 r10 = r12.A04
            r6 = 8
            if (r10 == 0) goto L_0x005f
            X.7EA r9 = r13.A0P
            if (r9 == 0) goto L_0x005f
            X.79G r8 = r14.A0P
            android.view.View r7 = r13.A01
            if (r8 == 0) goto L_0x02aa
            boolean r0 = r8.A0I
            if (r0 != 0) goto L_0x02aa
            java.lang.String r2 = r8.A0F
            if (r2 == 0) goto L_0x004f
            X.7Wz r1 = r1.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.messagethread.environment.CanLogLocalSendSpeedPerfEvent"
            X.0qQ.A0C(r1, r0)
            X.7TJ r1 = (X.AnonymousClass7TJ) r1
            r1.CjC(r2, r11)
        L_0x004f:
            r10.ADp(r8, r9)
            if (r7 == 0) goto L_0x0057
            r7.setVisibility(r6)
        L_0x0057:
            X.7EE r1 = r13.A09
            android.view.View r0 = r9.BJd()
            r1.A00 = r0
        L_0x005f:
            X.7D4 r0 = r12.A0K
            if (r0 == 0) goto L_0x007c
            X.7Dz r7 = r13.A0O
            if (r7 == 0) goto L_0x007c
            X.7A9 r2 = r14.A0O
            android.view.View r1 = r13.A01
            if (r2 == 0) goto L_0x0284
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0284
            X.0qQ.A0B(r7, r5)
            r7.A01(r2)
            if (r1 == 0) goto L_0x007c
            r1.setVisibility(r6)
        L_0x007c:
            X.7D7 r0 = r12.A0L
            if (r0 == 0) goto L_0x008d
            X.7ED r1 = r13.A0Q
            if (r1 == 0) goto L_0x008d
            X.7Fh r0 = r14.A0Q
            if (r0 == 0) goto L_0x008d
            X.3oV r0 = r1.A00
            r0.getView()
        L_0x008d:
            X.7D8 r0 = r12.A0J
            if (r0 == 0) goto L_0x009c
            X.7EG r2 = r13.A0N
            if (r2 == 0) goto L_0x009c
            X.7AA r0 = r14.A0N
            if (r0 == 0) goto L_0x0278
            r2.A00(r0)
        L_0x009c:
            X.7D9 r0 = r12.A0C
            if (r0 == 0) goto L_0x00ab
            X.7EI r1 = r13.A0D
            if (r1 == 0) goto L_0x00ab
            X.73b r0 = r14.A0E
            if (r0 == 0) goto L_0x0273
            r1.A01(r0)
        L_0x00ab:
            boolean r0 = r14.A0V
            if (r0 == 0) goto L_0x00ba
            r1 = r3
            X.7Dn r1 = (X.C328117Dn) r1
            X.7G8 r0 = new X.7G8
            r0.<init>(r13, r4)
            r1.setOffsetListener(r0)
        L_0x00ba:
            X.7DH r0 = r12.A03
            r6 = 1
            if (r0 == 0) goto L_0x0270
            X.7EQ r1 = r13.A0L
            if (r1 == 0) goto L_0x0270
            X.NYV r0 = r14.A0L
            if (r0 == 0) goto L_0x026d
            r1.A01(r0)
            r4 = 1
        L_0x00cb:
            X.7DD r0 = r12.A02
            if (r0 == 0) goto L_0x026a
            X.7EM r2 = r13.A0J
            if (r2 == 0) goto L_0x026a
            X.9Ix r1 = r14.A03
            if (r4 == 0) goto L_0x00db
            boolean r0 = r14.A0U
            if (r0 == 0) goto L_0x0264
        L_0x00db:
            if (r1 == 0) goto L_0x0264
            X.0qQ.A0B(r2, r5)
            r2.A01(r1)
        L_0x00e3:
            X.7DB r0 = r12.A01
            if (r0 == 0) goto L_0x00f8
            X.7EK r2 = r13.A0C
            if (r2 == 0) goto L_0x00f8
            X.77i r1 = r14.A0D
            if (r6 == 0) goto L_0x00f3
            boolean r0 = r14.A0U
            if (r0 == 0) goto L_0x025b
        L_0x00f3:
            if (r1 == 0) goto L_0x025b
            r2.A00(r1)
        L_0x00f8:
            X.7DE r0 = r12.A09
            if (r0 == 0) goto L_0x0107
            X.7EN r1 = r13.A06
            if (r1 == 0) goto L_0x0107
            X.76V r0 = r14.A09
            if (r0 == 0) goto L_0x0252
            r1.A00(r0)
        L_0x0107:
            X.7DF r0 = r12.A0D
            if (r0 == 0) goto L_0x0116
            X.7EO r1 = r13.A0E
            if (r1 == 0) goto L_0x0116
            X.7AC r0 = r14.A0F
            if (r0 == 0) goto L_0x024d
            r1.A01(r0)
        L_0x0116:
            X.7DG r0 = r12.A0H
            if (r0 == 0) goto L_0x0125
            X.7EP r2 = r13.A0I
            if (r2 == 0) goto L_0x0125
            X.N8H r0 = r14.A0J
            if (r0 == 0) goto L_0x0241
            r2.A00(r0)
        L_0x0125:
            X.7DA r0 = r12.A00
            if (r0 == 0) goto L_0x0134
            X.7EJ r1 = r13.A0B
            if (r1 == 0) goto L_0x0134
            X.75x r0 = r14.A0C
            if (r0 == 0) goto L_0x0238
            r1.A00(r0)
        L_0x0134:
            X.7ER r1 = r13.A08
            X.7DI r0 = r12.A0A
            if (r0 == 0) goto L_0x0143
            if (r1 == 0) goto L_0x0143
            X.7AB r0 = r14.A0B
            if (r0 == 0) goto L_0x022f
            r1.A00(r0)
        L_0x0143:
            X.7EV r1 = r13.A0G
            X.7DL r0 = r12.A0F
            if (r0 == 0) goto L_0x0152
            if (r1 == 0) goto L_0x0152
            X.7AF r0 = r14.A0H
            if (r0 == 0) goto L_0x0226
            r1.A01(r0)
        L_0x0152:
            X.7ES r2 = r13.A0A
            X.7DJ r0 = r12.A0B
            if (r0 == 0) goto L_0x0164
            if (r2 == 0) goto L_0x0164
            android.view.View r1 = r13.itemView
            X.7GA r0 = new X.7GA
            r0.<init>(r12, r14, r2)
            r1.post(r0)
        L_0x0164:
            X.7DM r0 = r12.A0I
            if (r0 == 0) goto L_0x0173
            X.7EW r1 = r13.A0K
            if (r1 == 0) goto L_0x0173
            X.N8L r0 = r14.A0K
            if (r0 == 0) goto L_0x0221
            r1.A01(r0)
        L_0x0173:
            X.7DC r0 = r12.A07
            if (r0 == 0) goto L_0x0182
            X.7EL r1 = r13.A04
            if (r1 == 0) goto L_0x0182
            X.7AD r0 = r14.A07
            if (r0 == 0) goto L_0x021c
            r1.A02(r0)
        L_0x0182:
            X.7EU r2 = r13.A03
            X.7DK r1 = r12.A06
            if (r1 == 0) goto L_0x0191
            if (r2 == 0) goto L_0x0191
            X.7AE r0 = r14.A06
            if (r0 == 0) goto L_0x0213
            r1.ADp(r2, r0)
        L_0x0191:
            X.7DN r2 = r12.A08
            if (r2 == 0) goto L_0x01a0
            X.7EX r1 = r13.A05
            if (r1 == 0) goto L_0x01a0
            X.N8M r0 = r14.A08
            if (r0 == 0) goto L_0x01fd
            r2.ADp(r1, r0)
        L_0x01a0:
            X.7DO r0 = r12.A05
            if (r0 == 0) goto L_0x01af
            X.7EY r1 = r13.A02
            if (r1 == 0) goto L_0x01af
            X.N8I r0 = r14.A05
            if (r0 == 0) goto L_0x01e7
            r1.A00(r0)
        L_0x01af:
            android.view.View r0 = r13.A00
            if (r0 == 0) goto L_0x01c2
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L_0x01c2
            int r0 = r14.A00
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
        L_0x01c2:
            X.N2Q r0 = r14.A0A
            if (r0 == 0) goto L_0x01d0
            java.util.Set r1 = r0.A00
            if (r1 == 0) goto L_0x01d0
            r0 = 2131431819(0x7f0b118b, float:1.8485378E38)
            r3.setTag(r0, r1)
        L_0x01d0:
            X.7AG r4 = r14.A0M
            if (r4 == 0) goto L_0x01e6
            java.lang.String r3 = r4.A0B
            if (r3 == 0) goto L_0x01e6
            com.instagram.common.session.UserSession r0 = r14.A04
            X.7I3 r2 = new X.7I3
            r2.<init>(r0)
            java.lang.String r1 = r14.A0R
            java.lang.String r0 = r4.A05
            r2.A0C(r1, r0, r3)
        L_0x01e6:
            return
        L_0x01e7:
            X.3oV r1 = r1.A00
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x01af
            android.view.View r1 = r1.getView()
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x01af
        L_0x01fd:
            X.3oV r1 = r1.A00
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x01a0
            android.view.View r1 = r1.getView()
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x01a0
        L_0x0213:
            X.2eb r1 = r2.A00
            r0 = 8
            r1.A03(r0)
            goto L_0x0191
        L_0x021c:
            r1.A00()
            goto L_0x0182
        L_0x0221:
            r1.A00()
            goto L_0x0173
        L_0x0226:
            X.2eb r1 = r1.A00
            r0 = 8
            r1.A03(r0)
            goto L_0x0152
        L_0x022f:
            X.2eb r1 = r1.A00
            r0 = 8
            r1.A03(r0)
            goto L_0x0143
        L_0x0238:
            X.2eb r1 = r1.A01
            r0 = 8
            r1.A03(r0)
            goto L_0x0134
        L_0x0241:
            X.2eb r1 = r2.A03
            r0 = 8
            r1.A03(r0)
            r0 = 0
            r2.A00 = r0
            goto L_0x0125
        L_0x024d:
            r1.A00()
            goto L_0x0116
        L_0x0252:
            X.2eb r1 = r1.A00
            r0 = 8
            r1.A03(r0)
            goto L_0x0107
        L_0x025b:
            X.2eb r1 = r2.A00
            r0 = 8
            r1.A03(r0)
            goto L_0x00f8
        L_0x0264:
            X.0qQ.A0B(r2, r5)
            r2.A00()
        L_0x026a:
            r6 = r4
            goto L_0x00e3
        L_0x026d:
            r1.A00()
        L_0x0270:
            r4 = 0
            goto L_0x00cb
        L_0x0273:
            r1.A00()
            goto L_0x00ab
        L_0x0278:
            X.2eb r1 = r2.A06
            r0 = 8
            r1.A03(r0)
            r0 = 0
            r2.A05 = r0
            goto L_0x009c
        L_0x0284:
            r7.A00()
            X.79G r0 = r14.A0P
            if (r0 != 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x0290
            r6 = 0
        L_0x0290:
            r1.setVisibility(r6)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.content.Context r0 = r1.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165304(0x7f070078, float:1.7944821E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            goto L_0x007c
        L_0x02aa:
            r9.A02()
            X.7A9 r0 = r14.A0O
            if (r0 != 0) goto L_0x005f
            if (r7 == 0) goto L_0x005f
            r0 = 8
            if (r8 == 0) goto L_0x02b8
            r0 = 0
        L_0x02b8:
            r7.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.height = r0
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DR.A01(X.7EZ, X.7Fl):void");
    }

    public AnonymousClass7DR(AnonymousClass7DO r2, AnonymousClass7DK r3, AnonymousClass7DC r4, AnonymousClass7DN r5, AnonymousClass7DE r6, AnonymousClass7DI r7, AnonymousClass7DJ r8, AnonymousClass7DA r9, AnonymousClass7DB r10, AnonymousClass7D9 r11, AnonymousClass7DF r12, AnonymousClass7D1 r13, AnonymousClass7DL r14, AnonymousClass7D3 r15, AnonymousClass7DG r16, AnonymousClass7DD r17, AnonymousClass7DM r18, AnonymousClass7DH r19, AnonymousClass7D8 r20, AnonymousClass7D4 r21, AnonymousClass7D6 r22, AnonymousClass7D7 r23, boolean z) {
        this.A0E = r13;
        this.A0G = r15;
        this.A0K = r21;
        this.A04 = r22;
        this.A0L = r23;
        this.A0J = r20;
        this.A0C = r11;
        this.A00 = r9;
        this.A01 = r10;
        this.A07 = r4;
        this.A02 = r17;
        this.A09 = r6;
        this.A0D = r12;
        this.A0H = r16;
        this.A03 = r19;
        this.A0A = r7;
        this.A0B = r8;
        this.A06 = r3;
        this.A0F = r14;
        this.A0I = r18;
        this.A08 = r5;
        this.A05 = r2;
        this.A0M = z;
    }
}
