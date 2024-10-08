package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.archive.intf.ArchivePendingUpload;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.creation.capture.quickcapture.recipientpicker.GroupProfileStoryRecipient;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.K7n  reason: case insensitive filesystem */
public final class C61438K7n extends AnonymousClass4DH implements C273414mX, C51906G7a, MTR, B1R {
    public static final CallerContext A0M = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "PrivateStoryShareSheetFragment";
    public AnonymousClass8BA A00;
    public MTT A01;
    public IngestSessionShim A02;
    public K9G A03;
    public C65634LxB A04;
    public C363008it A05;
    public String A06;
    public boolean A07;
    public C2355930l A08;
    public LOS A09;
    public IgdsButton A0A;
    public PendingRecipient A0B;
    public C351998Bg A0C;
    public C367188qK A0D;
    public C357128Wq A0E;
    public ArrayList A0F;
    public boolean A0G;
    public boolean A0H;
    public final 1wn A0I = C64698LgT.A00(this, 10);
    public final AnonymousClass0eM A0J = C227642jf.A02(this);
    public final C262224Cq A0K = DbY.A0r(AnonymousClass12T.A00, 763);
    public final 1wn A0L = C64698LgT.A00(this, 9);

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0203, code lost:
        if (r1.intValue() <= 1) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1.A06() == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r26, X.C61438K7n r27, X.C61002Juy r28, com.instagram.pendingmedia.model.UserStoryTarget r29, java.lang.String r30, java.lang.String r31, boolean r32) {
        /*
            r3 = 1
            r0 = 0
            r6 = r27
            if (r32 == 0) goto L_0x001b
            X.8it r1 = r6.A05
            if (r1 != 0) goto L_0x0014
            java.lang.String r0 = "shareToFBController"
        L_0x000c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            boolean r1 = r1.A06()
            r15 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r15 = 0
        L_0x001c:
            A06(r6, r3)
            X.3Q2 r1 = A00(r6)
            if (r1 == 0) goto L_0x0048
            java.util.List r4 = r1.A4b
            java.util.List r1 = r1.A4g
            android.util.Pair r7 = X.C59895JbK.A04(r4, r1)
            java.lang.Object r2 = r7.first
            java.util.List r2 = (java.util.List) r2
            r1 = 191(0xbf, float:2.68E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x004f
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r6)
            X.FYu r1 = X.C48796EkJ.A00(r1)
            r1.A03()
        L_0x0048:
            X.LOS r5 = r6.A09
            if (r5 != 0) goto L_0x0234
            java.lang.String r0 = "shareHelper"
            goto L_0x000c
        L_0x004f:
            java.lang.String r5 = "Required value was null."
            java.lang.Object r2 = r7.first
            java.util.List r2 = (java.util.List) r2
            r1 = 82
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x013b
            X.3WT r1 = X.AnonymousClass3WT.JOIN_CHAT
            X.3ui r1 = X.AnonymousClass497.A00(r1, r4)
            if (r1 == 0) goto L_0x0264
            X.WaH r3 = r1.A0A()
            if (r3 == 0) goto L_0x025f
            boolean r1 = r3.A07()
            if (r1 == 0) goto L_0x00c9
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r6)
            X.6gx r11 = X.C313746gw.A00(r1)
            int r8 = r3.A00()
            java.lang.String r7 = r3.A02()
            X.UOB r1 = r3.A00
            java.lang.String r5 = r1.A0L
            java.lang.String r10 = r1.A0F
            java.lang.String r9 = r1.A0I
            X.1Ln r4 = X.DbT.A0J(r11)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x00c9
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            if (r10 == 0) goto L_0x00a2
            java.lang.String r1 = "entrypoint"
            r2.put(r1, r10)
        L_0x00a2:
            if (r7 == 0) goto L_0x00af
            if (r9 == 0) goto L_0x00af
            r1 = 368(0x170, float:5.16E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.put(r1, r9)
        L_0x00af:
            X.DbW.A17(r4, r11)
            r1 = 3819(0xeeb, float:5.352E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DbV.A1M(r4, r1)
            java.lang.String r1 = "share_button"
            r4.A0p(r1)
            java.lang.String r1 = "story_share_sheet"
            java.lang.Long r1 = X.DbZ.A0b(r4, r1, r7, r5, r8)
            X.JTQ.A1C(r4, r1, r2)
        L_0x00c9:
            X.UOB r1 = r3.A00
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = r1.A03
            if (r2 != 0) goto L_0x00d1
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
        L_0x00d1:
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = com.instagram.reels.chat.model.ChatStickerChannelType.DISCOVERABLE
            if (r2 != r1) goto L_0x0048
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r6)
            X.FYv r9 = X.C69866NtU.A00(r1)
            java.lang.String r7 = r3.A02()
            X.UOB r1 = r3.A00
            java.lang.String r5 = r1.A0L
            java.lang.String r8 = r1.A0F
            java.lang.String r2 = r1.A0I
            X.0wc r1 = r9.A02
            X.1Ln r4 = X.1Ln.A0F(r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0048
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            if (r8 == 0) goto L_0x0100
            java.lang.String r1 = "entrypoint"
            r3.put(r1, r8)
        L_0x0100:
            if (r7 == 0) goto L_0x010d
            if (r2 == 0) goto L_0x010d
            r1 = 368(0x170, float:5.16E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.put(r1, r2)
        L_0x010d:
            long r1 = r9.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.A0h(r1)
            r1 = 3820(0xeec, float:5.353E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DbV.A1M(r4, r1)
            java.lang.String r1 = "share_button"
            r4.A0p(r1)
            java.lang.String r1 = "story_share_sheet"
            X.Dba.A1E(r4, r1)
            r4.A0s(r7)
            java.lang.Long r1 = X.DbZ.A0d(r5)
            r4.A0i(r1)
        L_0x0133:
            r4.A0w(r3)
            r4.Cgf()
            goto L_0x0048
        L_0x013b:
            java.lang.Object r2 = r7.first
            java.util.List r2 = (java.util.List) r2
            r1 = 84
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x01db
            X.3WT r1 = X.AnonymousClass3WT.MESSAGE_SHARE
            X.3ui r1 = X.AnonymousClass497.A00(r1, r4)
            if (r1 == 0) goto L_0x026e
            X.8D7 r3 = r1.A13
            if (r3 == 0) goto L_0x0269
            X.UOB r1 = r3.A0E
            if (r1 == 0) goto L_0x015f
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = r1.A03
            if (r2 != 0) goto L_0x0161
        L_0x015f:
            com.instagram.reels.chat.model.ChatStickerChannelType r2 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
        L_0x0161:
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            if (r2 != r1) goto L_0x0048
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r6)
            X.6gx r11 = X.C313746gw.A00(r1)
            int r9 = r3.A00()
            X.UOB r1 = r3.A0E
            if (r1 == 0) goto L_0x0179
            java.lang.String r8 = r1.A0K
            if (r8 != 0) goto L_0x017b
        L_0x0179:
            java.lang.String r8 = ""
        L_0x017b:
            if (r1 == 0) goto L_0x01d9
            java.lang.String r7 = r1.A0L
        L_0x017f:
            java.lang.String r5 = r3.A07
            java.lang.String r2 = r3.A06
            java.lang.String r12 = r3.A09
            boolean r10 = r3.A0A
            X.1Ln r4 = X.DbT.A0J(r11)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0048
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "mid"
            r3.put(r1, r5)
            java.lang.String r1 = "user_type"
            r3.put(r1, r12)
            if (r10 == 0) goto L_0x01d2
            java.lang.String r10 = "daily_prompt"
        L_0x01a3:
            java.lang.String r1 = "share_type"
            r3.put(r1, r10)
            X.DbW.A17(r4, r11)
            r1 = 381(0x17d, float:5.34E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.DbV.A1M(r4, r1)
            java.lang.String r1 = "share_button"
            r4.A0p(r1)
            java.lang.String r1 = "story"
            java.lang.Long r1 = X.DbZ.A0b(r4, r1, r8, r7, r9)
            r4.A0i(r1)
            java.lang.String r1 = "item_id"
            r4.A0R(r1, r5)
            r1 = 111(0x6f, float:1.56E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r4.A0R(r1, r2)
            goto L_0x0133
        L_0x01d2:
            r1 = 648(0x288, float:9.08E-43)
            java.lang.String r10 = X.AnonymousClass000.A00(r1)
            goto L_0x01a3
        L_0x01d9:
            r7 = 0
            goto L_0x017f
        L_0x01db:
            java.lang.Object r2 = r7.first
            java.util.List r2 = (java.util.List) r2
            r1 = 67
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0048
            X.3WT r1 = X.AnonymousClass3WT.CHALLENGE_CHAT
            X.3ui r1 = X.AnonymousClass497.A00(r1, r4)
            if (r1 == 0) goto L_0x0273
            X.LwN r10 = r1.A0w
            if (r10 == 0) goto L_0x0048
            X.UNV r2 = r10.A00
            java.lang.Integer r1 = r10.A02
            if (r1 == 0) goto L_0x0205
            int r1 = r1.intValue()
            r25 = 1
            if (r1 > r3) goto L_0x0207
        L_0x0205:
            r25 = 0
        L_0x0207:
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r6)
            X.OyR r16 = X.C69869NtX.A00(r1)
            java.lang.String r9 = r2.A07
            java.lang.String r8 = r2.A06
            java.lang.Integer r7 = r2.A02
            java.lang.String r5 = r2.A03
            java.lang.String r4 = r10.A07
            java.lang.String r3 = r10.A03
            java.lang.String r2 = r10.A05
            java.lang.String r1 = r10.A08
            r17 = r7
            r18 = r9
            r19 = r8
            r20 = r5
            r21 = r4
            r22 = r3
            r23 = r2
            r24 = r1
            r16.A05(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0048
        L_0x0234:
            com.instagram.common.session.UserSession r7 = X.JTP.A0R(r6)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r8 = r6.A02
            if (r8 != 0) goto L_0x0240
            java.lang.String r0 = "ingestSession"
            goto L_0x000c
        L_0x0240:
            X.8BA r1 = r6.A00
            if (r1 == 0) goto L_0x025d
            java.util.HashMap r14 = r1.A0W()
        L_0x0248:
            X.8BA r1 = r6.A00
            if (r1 == 0) goto L_0x024e
            java.lang.Integer r0 = r1.A0S
        L_0x024e:
            r6 = r26
            r9 = r28
            r10 = r29
            r12 = r30
            r13 = r31
            r11 = r0
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x025d:
            r14 = r0
            goto L_0x0248
        L_0x025f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0264:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0269:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x026e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0273:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61438K7n.A02(android.content.Context, X.K7n, X.Juy, com.instagram.pendingmedia.model.UserStoryTarget, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A08(C62571Ki2 ki2) {
        0qQ.A0B(ki2, 0);
        K9G k9g = this.A03;
        if (k9g == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        k9g.A00 = ki2;
        A05(this);
        A01();
    }

    public final void CwM(List list, boolean z) {
    }

    public final void Cyf() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0017: MOVE  (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void D6g() {
        /*
            r2 = this;
            r0 = 1
            r2.A0G = r0
            X.LxB r0 = r2.A04
            if (r0 != 0) goto L_0x000f
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000f:
            X.K7n r0 = r0.A05
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x0024
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x0024
            X.7Pu r1 = r1.A02
            if (r1 == 0) goto L_0x0024
            r0 = 0
            r1.A0L(r0)
            return
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61438K7n.D6g():void");
    }

    public final void DIS(boolean z, String str) {
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final void DkC(String str, boolean z) {
        String str2;
        A08(C62571Ki2.HALL_PASS);
        this.A07 = true;
        LOS los = this.A09;
        if (los == null) {
            str2 = "shareHelper";
        } else {
            Context A052 = DbT.A05(requireContext());
            AnonymousClass0eM r2 = this.A0J;
            UserSession A0l = AnonymousClass7TE.A0l(r2);
            IngestSessionShim ingestSessionShim = this.A02;
            if (ingestSessionShim == null) {
                str2 = "ingestSession";
            } else {
                0qQ.A0B(A0l, 1);
                AnonymousClass3Q2 A032 = 28K.A00(A0l).A03(AnonymousClass7TE.A19(ingestSessionShim.A00, 0));
                if (A032 != null) {
                    A032.A0U(AnonymousClass3QO.HALLPASS);
                    A032.A31 = str;
                    A032.A56 = z;
                }
                los.A00(A052, A0l, ingestSessionShim, C61002Juy.A0A, UserStoryTarget.A06, (Integer) null, (String) null, (String) null, (Map) null, false);
                DbX.A0R(r2).A00(new Object());
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Ere(List list) {
        C62571Ki2 ki2;
        String str;
        0qQ.A0B(list, 0);
        if (list.size() != 1 || !((AudienceListViewModel) list.get(0)).A05) {
            ki2 = C62571Ki2.AUDIENCE_LISTS;
        } else {
            ki2 = C62571Ki2.CLOSE_FRIENDS;
        }
        A08(ki2);
        this.A07 = true;
        LOS los = this.A09;
        if (los == null) {
            str = "shareHelper";
        } else {
            Context A052 = DbT.A05(requireContext());
            UserSession A0R = JTP.A0R(this);
            IngestSessionShim ingestSessionShim = this.A02;
            if (ingestSessionShim == null) {
                str = "ingestSession";
            } else {
                los.A01(A052, A0R, ingestSessionShim, list);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "private_stories_share_sheet";
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.8Wp, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsButton A0b = DbU.A0b(view, R.id.share_story_button);
        this.A0A = A0b;
        if (A0b == null) {
            str = "shareButton";
        } else {
            LY4.A01(A0b, 0, this);
            RecyclerView A0c = JTR.A0c(view, R.id.recycler_view);
            DbT.A16(requireContext(), A0c, R.color.fds_transparent);
            DbY.A16(this, A0c);
            K9G k9g = this.A03;
            str = "adapter";
            if (k9g != null) {
                A0c.setAdapter(k9g);
                K9G k9g2 = this.A03;
                if (k9g2 != null) {
                    if (k9g2.A00 == C62571Ki2.CLOSE_FRIENDS) {
                        C64029LJs.A01(JTP.A0R(this), "close_friend_sharesheet_impression", "share_sheet", (String) null);
                    }
                    A05(this);
                    A01();
                    1Yl A002 = C357108Wn.A00();
                    UserSession A0R = JTP.A0R(this);
                    C357108Wn.A00();
                    this.A0E = A002.A00(DbU.A0D(view, R.id.warning_nudge), this, A0R, new Object(), new M17(this, 0));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A01() {
        String str;
        IgdsButton igdsButton;
        int i;
        K9G k9g = this.A03;
        if (k9g == null) {
            str = "adapter";
        } else {
            str = "shareButton";
            if (k9g.A00 == C62571Ki2.CLOSE_FRIENDS) {
                C2355930l r0 = this.A08;
                if (r0 == null) {
                    str = "closeFriendsController";
                } else if (C63112Krf.A00(r0.A01) <= 0) {
                    igdsButton = this.A0A;
                    if (igdsButton != null) {
                        i = 2131969778;
                        igdsButton.setText(i);
                        A06(this, this.A0H);
                        return;
                    }
                }
            }
            igdsButton = this.A0A;
            if (igdsButton != null) {
                i = 2131973441;
                igdsButton.setText(i);
                A06(this, this.A0H);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C61438K7n k7n) {
        String str;
        AnonymousClass8BA r0;
        AnonymousClass8VT r02;
        IngestSessionShim ingestSessionShim = k7n.A02;
        if (ingestSessionShim == null) {
            str = "ingestSession";
        } else {
            List list = ingestSessionShim.A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3Q2 A0M2 = JTQ.A0M(JTP.A0R(k7n), AnonymousClass7TE.A18(it));
                if (A0M2 != null) {
                    A1C.add(A0M2);
                }
            }
            Iterator it2 = A1C.iterator();
            while (true) {
                str = "adapter";
                if (it2.hasNext()) {
                    AnonymousClass3Q2 A0m = JTO.A0m(it2);
                    if (A0m != null && AnonymousClass7TE.A1b(A0m.A4b)) {
                        ArrayList A1C2 = AnonymousClass7TE.A1C();
                        Iterator it3 = A0m.A4b.iterator();
                        while (it3.hasNext()) {
                            C255783ui A0o = JTO.A0o(it3);
                            AnonymousClass3WT r1 = A0o.A11;
                            if (r1 != AnonymousClass3WT.MENTION) {
                                if (r1 == AnonymousClass3WT.GROUP_MENTION) {
                                    C387339m3 A0C2 = A0o.A0C();
                                    if (A0C2 != null) {
                                        Iterator it4 = A0C2.A05.iterator();
                                        while (it4.hasNext()) {
                                            DbY.A1W(A1C2, it4);
                                        }
                                    }
                                } else if (r1 != AnonymousClass3WT.MENTION_RESHARE) {
                                }
                            }
                            User user = A0o.A1B;
                            if (user != null) {
                                DbU.A1V(user, A1C2);
                            }
                        }
                        if (DbT.A1b(A1C2)) {
                            AnonymousClass8OY.A00(JTP.A0R(k7n)).A01(A0m.A3t, A1C2);
                        }
                    }
                    K9G k9g = k7n.A03;
                    if (k9g == null) {
                        break;
                    }
                    C62571Ki2 ki2 = k9g.A00;
                    if (ki2 == C62571Ki2.MY_WEEK) {
                        r02 = C64133LPh.A01(002.A0R("myWeek:", DbX.A0l(AnonymousClass0t1.A01, k7n.A0J).getId()), (String) null, Ki3.DIRECT_RECIPIENT_PICKER.A00, true);
                    } else if (ki2 == C62571Ki2.HIGHLIGHTS) {
                        r02 = AnonymousClass8VR.A00(JTP.A0R(k7n)).A00;
                    }
                    A0m.A1Y = r02;
                } else {
                    K9G k9g2 = k7n.A03;
                    if (k9g2 != null) {
                        C62571Ki2 ki22 = k9g2.A00;
                        C62571Ki2 ki23 = C62571Ki2.CLOSE_FRIENDS;
                        boolean z = false;
                        if (ki22 == ki23) {
                            C2355930l r12 = k7n.A08;
                            if (r12 == null) {
                                str = "closeFriendsController";
                            } else if (C63112Krf.A00(r12.A01) <= 0) {
                                C65634LxB lxB = k7n.A04;
                                if (lxB == null) {
                                    str = "delegate";
                                } else {
                                    AnonymousClass8BA r13 = k7n.A00;
                                    if (r13 != null) {
                                        z = !AnonymousClass8BA.A0L(r13);
                                    }
                                    lxB.A02(z);
                                    return;
                                }
                            }
                        }
                        K9G k9g3 = k7n.A03;
                        if (k9g3 != null) {
                            if (k9g3.A00 == C62571Ki2.EXCLUSIVE_STORY && (!(A1C instanceof Collection) || !A1C.isEmpty())) {
                                Iterator it5 = A1C.iterator();
                                while (it5.hasNext()) {
                                    if (C271404in.A0E(JTO.A0m(it5).A4b)) {
                                        FGM.A04(JTP.A0R(k7n), k7n.requireContext());
                                        return;
                                    }
                                }
                            }
                            K9G k9g4 = k7n.A03;
                            if (k9g4 != null) {
                                if (k9g4.A00 != C62571Ki2.YOUR_STORY || k7n.A0E == null || !AnonymousClass7TE.A1b(A1C)) {
                                    K9G k9g5 = k7n.A03;
                                    if (k9g5 != null) {
                                        if (k9g5.A00 == ki23 && (r0 = k7n.A00) != null && (!AnonymousClass8BA.A0L(r0))) {
                                            C363008it r03 = k7n.A05;
                                            if (r03 == null) {
                                                str = "shareToFBController";
                                            } else {
                                                if (r03.A06()) {
                                                    C64029LJs.A01(JTP.A0R(k7n), AnonymousClass000.A00(1702), "share_sheet", (String) null);
                                                }
                                                C64029LJs.A01(JTP.A0R(k7n), AnonymousClass000.A00(3777), "share_sheet", (String) null);
                                            }
                                        }
                                        k7n.A07 = true;
                                        A04(k7n);
                                        return;
                                    }
                                } else {
                                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                                    Iterator it6 = A1C.iterator();
                                    while (it6.hasNext()) {
                                        List<C282705Ek> list2 = JTO.A0m(it6).A4h;
                                        ArrayList A1C4 = AnonymousClass7TE.A1C();
                                        for (C282705Ek r04 : list2) {
                                            String str2 = r04.A09;
                                            if (str2 != null) {
                                                A1C4.add(str2);
                                            }
                                        }
                                        018.A16(A1C4, A1C3);
                                    }
                                    C357128Wq r14 = k7n.A0E;
                                    str = "offensiveContentWarningController";
                                    if (r14 != null) {
                                        if (A1C3.isEmpty()) {
                                            A1C3 = 0sr.A1L(new String[]{""});
                                        }
                                        r14.A07(A1C3);
                                        C357128Wq r05 = k7n.A0E;
                                        if (r05 != null) {
                                            r05.A04();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(C61438K7n k7n, boolean z) {
        k7n.A0H = z;
        IgdsButton igdsButton = k7n.A0A;
        if (igdsButton != null) {
            igdsButton.setLoading(z);
            IgdsButton igdsButton2 = k7n.A0A;
            if (igdsButton2 != null) {
                igdsButton2.setEnabled(!z);
                return;
            }
        }
        0qQ.A0F("shareButton");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [com.instagram.pendingmedia.model.GroupProfileUserStoryTarget, java.lang.Object, com.instagram.pendingmedia.model.UserStoryTarget] */
    public final UserStoryTarget A07() {
        K9G k9g = this.A03;
        if (k9g == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        switch (k9g.A00.ordinal()) {
            case 0:
                break;
            case 1:
                return UserStoryTarget.A02;
            case 2:
                return UserStoryTarget.A03;
            case 3:
            case 4:
                PendingRecipient pendingRecipient = this.A0B;
                if (pendingRecipient != null) {
                    ? obj = new Object();
                    obj.A01 = "GROUP_PROFILE";
                    obj.A00 = pendingRecipient;
                    return obj;
                }
                break;
            case 5:
            case 9:
                return UserStoryTarget.A07;
            case 6:
                return UserStoryTarget.A09;
            case 7:
            case 10:
                return UserStoryTarget.A06;
            case 8:
                return UserStoryTarget.A08;
            default:
                throw AnonymousClass7TE.A1K();
        }
        return UserStoryTarget.A01;
    }

    public final void Cyc() {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        K9G k9g = this.A03;
        Integer num = null;
        if (k9g == null) {
            str = "adapter";
        } else {
            C62571Ki2 ki2 = k9g.A00;
            if (ki2 == C62571Ki2.YOUR_STORY || ki2 == C62571Ki2.CLOSE_FRIENDS) {
                1Av A0h = DbX.A0h(this.A0J);
                int i = ki2.A00;
                0xY A0p = AnonymousClass7TE.A0p(A0h);
                A0p.E5Z("private_story_share_sheet_story_target", i);
                A0p.apply();
            }
            if (this.A01 != null) {
                Intent A092 = DbS.A09();
                A092.putExtra(AnonymousClass000.A00(2212), ki2.A00);
                C363008it r0 = this.A05;
                if (r0 == null) {
                    str = "shareToFBController";
                } else {
                    A092.putExtra(AnonymousClass000.A00(25), r0.A06());
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add(A07());
                    AnonymousClass3Q2 A002 = A00(this);
                    Intent putExtra = A092.putExtra(AnonymousClass000.A00(2737), this.A07);
                    IngestSessionShim ingestSessionShim = this.A02;
                    if (ingestSessionShim == null) {
                        str = "ingestSession";
                    } else {
                        Intent putStringArrayListExtra = putExtra.putExtra("bundle_extra_ingest_session", ingestSessionShim).putExtra(AnonymousClass000.A00(2653), this.A0G).putStringArrayListExtra(AnonymousClass000.A00(480), this.A0F);
                        LOS los = this.A09;
                        if (los == null) {
                            str = "shareHelper";
                        } else {
                            Intent putExtra2 = putStringArrayListExtra.putParcelableArrayListExtra(AnonymousClass000.A00(2736), los.A00.A04(MXS.class)).putExtra("bundle_extra_user_story_targets", A1C);
                            if (A002 != null) {
                                l = DbS.A0j(A002.A0H);
                            } else {
                                l = null;
                            }
                            Intent putExtra3 = putExtra2.putExtra(AnonymousClass000.A00(730), l);
                            if (A002 != null) {
                                l2 = DbS.A0j(A002.A0G);
                            } else {
                                l2 = null;
                            }
                            Intent putExtra4 = putExtra3.putExtra(AnonymousClass000.A00(729), l2);
                            if (A002 != null) {
                                l3 = DbS.A0j(A002.A0S);
                            } else {
                                l3 = null;
                            }
                            Intent putExtra5 = putExtra4.putExtra(AnonymousClass000.A00(1913), l3);
                            if (A002 != null) {
                                l4 = DbS.A0j(A002.A0R);
                            } else {
                                l4 = null;
                            }
                            Intent putExtra6 = putExtra5.putExtra(AnonymousClass000.A00(1912), l4);
                            if (A002 != null) {
                                num = Integer.valueOf(A002.A08);
                            }
                            putExtra6.putExtra("exif_orientation", num);
                            MTT mtt = this.A01;
                            if (mtt != null) {
                                mtt.DkH(A092, this.A07);
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public static final AnonymousClass3Q2 A00(C61438K7n k7n) {
        PendingMediaStore A002 = 28K.A00(JTP.A0R(k7n));
        IngestSessionShim ingestSessionShim = k7n.A02;
        if (ingestSessionShim != null) {
            return A002.A03((String) AnonymousClass7TE.A13(ingestSessionShim.A00));
        }
        0qQ.A0F("ingestSession");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C61438K7n r13) {
        /*
            X.0rm r2 = X.C51965G9l.A11()
            X.Juy r4 = X.C61002Juy.A03
            r2.A00 = r4
            r9 = r13
            X.3Q2 r5 = A00(r13)
            android.content.Context r0 = r13.getContext()
            if (r0 == 0) goto L_0x00ca
            android.content.Context r8 = r0.getApplicationContext()
            if (r8 == 0) goto L_0x00ca
            r1 = 1
            r10 = 0
            if (r5 == 0) goto L_0x0033
            java.lang.String r11 = r5.A0I()
            java.lang.String r10 = X.C2373637i.A01(r5)
            X.K9G r0 = r13.A03
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "adapter"
        L_0x002b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            r11 = r10
            goto L_0x004d
        L_0x0035:
            X.Ki2 r0 = r0.A00
            int r3 = r0.ordinal()
            if (r3 == r1) goto L_0x0085
            r0 = 2
            if (r3 == r0) goto L_0x007d
            r0 = 8
            if (r3 != r0) goto L_0x004d
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            r5.A0U(r0)
            X.Juy r0 = X.C61002Juy.A0B
        L_0x004b:
            r2.A00 = r0
        L_0x004d:
            com.instagram.pendingmedia.model.UserStoryTarget r7 = r13.A07()
            java.lang.Object r6 = r2.A00
            java.lang.String r3 = r4.toString()
            java.lang.Object r0 = r2.A00
            boolean r3 = X.Dba.A1X(r0, r3)
            X.8BA r0 = r13.A00
            if (r0 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass8BA.A0L(r0)
            r13 = r0 ^ 1
        L_0x0067:
            r12 = 3
            X.Ixx r5 = new X.Ixx
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            A06(r9, r1)
            if (r13 == 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00bc
            X.8qK r3 = r9.A0D
            if (r3 != 0) goto L_0x008d
            java.lang.String r0 = "clNoticeManager"
            goto L_0x002b
        L_0x007b:
            r13 = 0
            goto L_0x0067
        L_0x007d:
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            r5.A0U(r0)
            X.Juy r0 = X.C61002Juy.A07
            goto L_0x004b
        L_0x0085:
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            r5.A0U(r0)
            X.Juy r0 = X.C61002Juy.A05
            goto L_0x004b
        L_0x008d:
            androidx.fragment.app.FragmentActivity r4 = r9.requireActivity()
            com.instagram.common.session.UserSession r1 = X.JTP.A0R(r9)
            X.818 r0 = X.AnonymousClass818.IG_STORY_SHARE_SHEET_SHARE_BUTTON
            X.LEO r1 = X.C63435Kwv.A00(r4, r0, r1)
            r1.A0A = r11
            android.content.Context r0 = r9.requireContext()
            r1.A00 = r0
            X.MBh r0 = new X.MBh
            r0.<init>(r5)
            r1.A05 = r0
            r1.A01 = r9
            X.Lxh r4 = new X.Lxh
            r5 = r8
            r6 = r9
            r8 = r11
            r9 = r10
            r10 = r2
            r11 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0 = 0
            r3.A01(r0, r1, r4)
            return
        L_0x00bc:
            java.lang.Object r0 = r2.A00
            X.Juy r0 = (X.C61002Juy) r0
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r7
            r5 = r11
            r6 = r10
            r7 = r13
            A02(r1, r2, r3, r4, r5, r6, r7)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61438K7n.A04(X.K7n):void");
    }

    /* JADX WARNING: type inference failed for: r0v54, types: [X.6wo, java.lang.Object] */
    public static final void A05(C61438K7n k7n) {
        boolean z;
        C231642s0 r0;
        AnonymousClass3Q2 A002 = A00(k7n);
        boolean z2 = false;
        if (A002 != null) {
            List list = A002.A4b;
            0qQ.A0B(list, 0);
            z = AnonymousClass7TF.A1V(AnonymousClass497.A00(AnonymousClass3WT.JOIN_CHAT, list));
        } else {
            z = false;
        }
        K9G k9g = k7n.A03;
        Integer num = null;
        if (k9g == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        boolean z3 = !z;
        AnonymousClass8BA r02 = k7n.A00;
        if (r02 != null) {
            z2 = !AnonymousClass8BA.A0L(r02);
        }
        AnonymousClass8BA r03 = k7n.A00;
        if (r03 != null) {
            num = r03.A0S;
        }
        k9g.clear();
        UserSession userSession = k9g.A01;
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, userSession, 36319901312425678L);
        boolean A063 = 182.A06(0Tu.A06, userSession, 36321675134051968L);
        if (A063) {
            k9g.addModel(new C46448DfA(2131973441), new Object(), k9g.A0C);
        }
        k9g.addModel(new C64789Li5(num, AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.YOUR_STORY), z2), k9g.A0B);
        if (z3 && (!A062 || 182.A06(r4, userSession, 36319901313605338L))) {
            k9g.addModel(new C64775Lhr(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.CLOSE_FRIENDS), z2), k9g.A04);
        }
        boolean z4 = true;
        0qQ.A0B(userSession, 0);
        if (182.A06(r4, userSession, 36322289314637869L) && 182.A06(r4, userSession, 36322289314768943L)) {
            boolean A1W = AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.MY_WEEK);
            if (!C323036wp.A00(new Object(), userSession).A01().A02 && !A1W) {
                z4 = false;
            }
            k9g.addModel(new C64778Lhu(A1W, z4), k9g.A0A);
        }
        if (A062 && !182.A06(r4, userSession, 36319901313605338L)) {
            k9g.addModel(new C64774Lhq(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.AUDIENCE_LISTS), C346667vY.A00(userSession).A00), k9g.A02);
        }
        if (C318996ps.A01() && C318996ps.A00().A05(userSession)) {
            k9g.addModel(new C64777Lht(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.OPAL), userSession), k9g.A08);
        }
        FY1 fy1 = null;
        if (AnonymousClass37B.A01(userSession, true) && !182.A06(r4, userSession, 36320313630073067L)) {
            if (182.A06(r4, userSession, 36320313630007530L)) {
                r0 = k9g.A03;
            } else {
                fy1 = new FY1(AnonymousClass7TE.A0q(userSession).getInt(AnonymousClass000.A00(3207), 0));
                r0 = k9g.A06;
            }
            k9g.addModel(fy1, r0);
        }
        if (182.A06(r4, userSession, 36318415253674097L)) {
            k9g.addModel(Boolean.valueOf(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.HIGHLIGHTS)), k9g.A09);
        }
        boolean A003 = AnonymousClass2o2.A00(userSession);
        if (A063) {
            if (A003) {
                k9g.addModel(Boolean.valueOf(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.EXCLUSIVE_STORY)), k9g.A05);
            }
            k9g.addModel(new C46448DfA(2131969779), new Object(), k9g.A0C);
        } else if (A003) {
            k9g.addModel(Boolean.valueOf(AnonymousClass7TF.A1W(k9g.A00, C62571Ki2.EXCLUSIVE_STORY)), k9g.A05);
        }
        k9g.addModel((Object) null, k9g.A07);
        k9g.notifyDataSetChangedSmart();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0039: MOVE  (r1v1 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v0 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 529959155(0x1f9688f3, float:6.3754035E-20)
            if (r4 != r0) goto L_0x0044
            r0 = -1
            if (r5 != r0) goto L_0x0044
            r2 = 0
            if (r6 == 0) goto L_0x002f
            r0 = 480(0x1e0, float:6.73E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x002f
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
        L_0x001e:
            r3.A0F = r0
            r0 = 1
            r3.A07 = r0
            X.LxB r0 = r3.A04
            if (r0 != 0) goto L_0x0031
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002f:
            r0 = r2
            goto L_0x001e
        L_0x0031:
            X.K7n r0 = r0.A05
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x004b
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x004b
            X.7Pu r0 = r1.A02
            if (r0 == 0) goto L_0x004b
            r0.A0L(r2)
        L_0x0044:
            A05(r3)
            r3.A01()
            return
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61438K7n.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        C62571Ki2 ki2;
        IllegalStateException illegalStateException;
        int i;
        int i2;
        int A022 = AnonymousClass0fD.A02(288245288);
        C61438K7n.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r15 = this.A0J;
        GroupProfileStoryRecipient groupProfileStoryRecipient = null;
        this.A05 = LJr.A01(AnonymousClass7TE.A0l(r15), (C358118aO) null);
        UserSession A0l = AnonymousClass7TE.A0l(r15);
        0qQ.A0B(A0l, 0);
        this.A0C = new C351998Bg(A0l);
        C363008it r1 = this.A05;
        if (r1 != null) {
            boolean z = false;
            r1.A04(requireArguments.getBoolean(AnonymousClass000.A00(25), false));
            C363008it r12 = this.A05;
            if (r12 != null) {
                r12.A00 = new C65632Lx9(this, 0);
                this.A08 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(r15));
                this.A02 = (IngestSessionShim) C320236s2.A00(requireArguments, IngestSessionShim.class, AnonymousClass000.A00(59));
                IngestSessionShim ingestSessionShim = (IngestSessionShim) requireArguments.getParcelable(AnonymousClass000.A00(223));
                ArchivePendingUpload archivePendingUpload = (ArchivePendingUpload) C320236s2.A00(requireArguments, ArchivePendingUpload.class, AnonymousClass000.A00(135));
                requireArguments.getBoolean(AnonymousClass000.A00(2214), true);
                UserSession A0l2 = AnonymousClass7TE.A0l(r15);
                FragmentActivity requireActivity = requireActivity();
                IngestSessionShim ingestSessionShim2 = this.A02;
                String str = "ingestSession";
                if (ingestSessionShim2 != null) {
                    C363008it r13 = this.A05;
                    if (r13 != null) {
                        C351998Bg r122 = this.A0C;
                        if (r122 != null) {
                            C2355930l r3 = this.A08;
                            if (r3 == null) {
                                str = "closeFriendsController";
                            } else {
                                IngestSessionShim ingestSessionShim3 = ingestSessionShim2;
                                IngestSessionShim ingestSessionShim4 = ingestSessionShim;
                                ArchivePendingUpload archivePendingUpload2 = archivePendingUpload;
                                C2355930l r22 = r3;
                                this.A04 = new C65634LxB(requireActivity, archivePendingUpload2, r22, A0l2, ingestSessionShim3, ingestSessionShim4, this, A00(this), r122, r13, new C66295MMe(this, 28), requireArguments.getBoolean(AnonymousClass000.A00(2211)));
                                PendingRecipient pendingRecipient = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(4087));
                                this.A0B = pendingRecipient;
                                if (pendingRecipient == null) {
                                    if (!182.A06(0Tu.A05, DbT.A0X(r15), 36319901312425678L) && !AnonymousClass37B.A01(AnonymousClass7TE.A0l(r15), true)) {
                                        int i3 = 0;
                                        int i4 = DbX.A0h(r15).A01.getInt("private_story_share_sheet_story_target", 0);
                                        C62571Ki2[] values = C62571Ki2.values();
                                        int length = values.length;
                                        while (true) {
                                            if (i3 >= length) {
                                                ki2 = C62571Ki2.YOUR_STORY;
                                                break;
                                            }
                                            ki2 = values[i3];
                                            if (ki2.A00 == i4) {
                                                break;
                                            }
                                            i3++;
                                        }
                                    } else {
                                        ki2 = C62571Ki2.YOUR_STORY;
                                    }
                                } else if (pendingRecipient.A0Y) {
                                    ki2 = C62571Ki2.OPAL;
                                } else {
                                    ki2 = C62571Ki2.TARGET_GROUP_PROFILE;
                                    17i A0u = JTR.A0u(r15);
                                    PendingRecipient pendingRecipient2 = this.A0B;
                                    if (pendingRecipient2 != null) {
                                        User A023 = A0u.A02(pendingRecipient2.getId());
                                        PendingRecipient pendingRecipient3 = this.A0B;
                                        if (pendingRecipient3 != null) {
                                            if (A023 != null) {
                                                z = AnonymousClass7TF.A1Y(A023.A0K(), true);
                                                Integer B6v = A023.A03.B6v();
                                                if (B6v != null) {
                                                    i2 = B6v.intValue();
                                                    groupProfileStoryRecipient = new GroupProfileStoryRecipient(pendingRecipient3, i2, z);
                                                }
                                            }
                                            i2 = 0;
                                            groupProfileStoryRecipient = new GroupProfileStoryRecipient(pendingRecipient3, i2, z);
                                        } else {
                                            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                            i = 622606539;
                                        }
                                    } else {
                                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                        i = 843397700;
                                    }
                                    AnonymousClass0fD.A09(i, A022);
                                    throw illegalStateException;
                                }
                                Context requireContext = requireContext();
                                UserSession A0l3 = AnonymousClass7TE.A0l(r15);
                                C363008it r4 = this.A05;
                                if (r4 != null) {
                                    C351998Bg r32 = this.A0C;
                                    if (r32 != null) {
                                        C65634LxB lxB = this.A04;
                                        if (lxB == null) {
                                            str = "delegate";
                                        } else {
                                            this.A03 = new K9G(requireContext, this, A0l3, groupProfileStoryRecipient, lxB, ki2, r32, r4);
                                            this.A09 = new LOS(new C66295MMe(this, 29));
                                            setModuleNameV2("private_stories_share_sheet");
                                            this.A0D = new C367188qK(AnonymousClass7TE.A0l(r15));
                                            DbX.A0R(r15).A01(this.A0L, C64640LfS.class);
                                            LOS los = this.A09;
                                            if (los == null) {
                                                str = "shareHelper";
                                            } else {
                                                UserSession A0l4 = AnonymousClass7TE.A0l(r15);
                                                IngestSessionShim ingestSessionShim5 = this.A02;
                                                if (ingestSessionShim5 != null) {
                                                    if (182.A06(DbS.A0J(A0l4, 0), A0l4, 36320876270396323L)) {
                                                        Iterator it = ingestSessionShim5.A00.iterator();
                                                        while (it.hasNext()) {
                                                            AnonymousClass3Q2 A0M2 = JTQ.A0M(A0l4, AnonymousClass7TE.A18(it));
                                                            if (A0M2 != null) {
                                                                if (A0M2.A1G == 1iA.A0Q) {
                                                                    A0M2.A19 = new L6G(A0l4, los, A0M2);
                                                                } else {
                                                                    1ua.A0G.A01(C51966G9m.A0P(A0l4), A0l4).A0I(A0M2, false, false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    AnonymousClass0fD.A09(-176333397, A022);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F("shareToFBCloseFriendsController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("shareToFBController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-132984195);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_private_story_share_sheet, viewGroup, false);
        AnonymousClass0fD.A09(607526598, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2043612751);
        super.onDestroyView();
        1Ng A0R = DbX.A0R(this.A0J);
        A0R.A02(this.A0L, C64640LfS.class);
        A0R.A02(this.A0I, C61149Jy0.class);
        AnonymousClass0fD.A09(1126475757, A022);
    }

    public final void EcH(MTT mtt) {
        this.A01 = mtt;
    }
}
