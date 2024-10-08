package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.Map;

public final class W2M {
    public AnonymousClass6ST A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final Reel A06;
    public final User A07;
    public final String A08;
    public final boolean A09;

    public final void A05(Ki3 ki3) {
        Reel reel = this.A06;
        UserSession userSession = this.A05;
        if (reel.A0z(userSession)) {
            A00(this, ki3);
            return;
        }
        Activity activity = this.A01;
        AnonymousClass6ST r2 = new AnonymousClass6ST(activity, true);
        this.A00 = r2;
        r2.A00(activity.getResources().getString(2131963421));
        AnonymousClass0fN.A00(r2);
        1OP r0 = 1OP.$redex_init_class;
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(userSession);
        A002.A02(AnonymousClass3BU.ON_TAP, reel.getId(), this.A04.getModuleName(), (Map) null);
        A002.A05(new C19480WaS(this, ki3), reel.getId(), (String) null, false);
    }

    public static final void A00(W2M w2m, Ki3 ki3) {
        Bundle bundle = new Bundle();
        bundle.putString("edit_highlights_reel_id", w2m.A06.getId());
        bundle.putBoolean("archive_multi_select_mode", true);
        bundle.putSerializable("highlight_management_source", ki3);
        Activity activity = w2m.A01;
        new AnonymousClass6W8(activity, bundle, w2m.A05, ModalActivity.class, "manage_highlights").A0A(activity, 201);
    }

    public static final void A01(W2M w2m, Reel reel) {
        1ap r2 = 1as.A04.A02;
        UserSession userSession = w2m.A05;
        2FW r0 = 2FW.A1e;
        AnonymousClass0iw r5 = w2m.A04;
        C49731F3w A072 = r2.A07(r5, userSession, r0);
        1Xj r02 = reel.A0A(userSession, 0).A0b;
        if (r02 != null) {
            String id = r02.getId();
            if (id != null) {
                A072.A06(id);
                AnonymousClass4DU r1 = w2m.A03;
                0qQ.A0C(r1, C66579MXk.A00(2));
                A072.A04(r1);
                Bundle bundle = A072.A07;
                bundle.putInt(C273654mx.A00(20), 0);
                bundle.putString(C273654mx.A00(108), JTP.A0r(reel));
                bundle.putString(C273654mx.A00(476), DbX.A0t(reel.A0P));
                String moduleName = r5.getModuleName();
                0qQ.A0B(moduleName, 0);
                bundle.putString(C273654mx.A00(214), moduleName);
                DirectShareSheetFragment A002 = A072.A00();
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01(w2m.A01);
                if (A012 != null) {
                    A012.A0J(A002);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(C46498Dg1 dg1) {
        if (this.A06.A09 != HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY) {
            dg1.A0C(AnonymousClass7TE.A16(dg1.A00, 2131961512), new C18887WAz(this, 32));
        }
    }

    private final void A03(C46498Dg1 dg1, boolean z) {
        Reel reel = this.A06;
        UserSession userSession = this.A05;
        if (reel.A1a) {
            Iterator it = reel.A0O(userSession).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C255773uh) it.next()).A1g()) {
                        break;
                    }
                } else if (!z) {
                    return;
                }
            }
        }
        dg1.A0C(AnonymousClass7TE.A16(dg1.A00, 2131973099), new C18887WAz(this, 35));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021b, code lost:
        if (r13.A06.A0l() != false) goto L_0x021d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C21047XBo r14, java.lang.Integer r15) {
        /*
            r13 = this;
            androidx.fragment.app.Fragment r6 = r13.A03
            boolean r0 = r6.isResumed()
            if (r0 == 0) goto L_0x004d
            android.content.Context r10 = r13.A02
            com.instagram.common.session.UserSession r5 = r13.A05
            X.Dg1 r4 = new X.Dg1
            r4.<init>(r10, r5)
            int r0 = r15.intValue()
            r7 = 1
            r9 = 0
            if (r0 == r9) goto L_0x0215
            if (r0 == r7) goto L_0x004e
            android.content.Context r1 = r4.A00
            r0 = 2131975841(0x7f135ea1, float:1.9588786E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r1 = 3
            X.WB4 r0 = new X.WB4
            r0.<init>(r1, r4, r14, r13)
            r4.A0C(r2, r0)
            r13.A02(r4)
        L_0x0030:
            android.content.Context r1 = r4.A00
            r0 = 2131957592(0x7f131758, float:1.9551772E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r4, r14, r13)
        L_0x003f:
            r4.A0C(r2, r1)
        L_0x0042:
            java.util.List r0 = r4.A09
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x004d
            X.C13988Tno.A0r(r10, r4)
        L_0x004d:
            return
        L_0x004e:
            com.instagram.model.reels.Reel r3 = r13.A06
            boolean r0 = r3.A0p()
            if (r0 == 0) goto L_0x006d
            com.instagram.model.reels.ReelType r1 = r3.A0P
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A0d
            if (r1 == r0) goto L_0x0042
            android.content.Context r1 = r4.A00
            r0 = 2131974692(0x7f135a24, float:1.9586455E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 17
            X.WBH r1 = new X.WBH
            r1.<init>((int) r0, (java.lang.Object) r14, (java.lang.Object) r13)
            goto L_0x003f
        L_0x006d:
            boolean r0 = r3.A0l()
            if (r0 == 0) goto L_0x00b5
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x00b5
            com.instagram.user.model.User r0 = r3.A0D()
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.A2J()
            if (r0 != r7) goto L_0x00a8
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322289314637869(0x810aee0007282d, double:3.0337002484720094E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00a3
            android.content.Context r1 = r4.A00
            r0 = 2131969885(0x7f13475d, float:1.9576705E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r1 = 29
            X.WAz r0 = new X.WAz
            r0.<init>(r14, r1)
            r4.A0C(r2, r0)
        L_0x00a3:
            r13.A03(r4, r7)
            goto L_0x021d
        L_0x00a8:
            android.content.Context r1 = r4.A00
            r0 = 2131973867(0x7f1356eb, float:1.9584782E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 31
            goto L_0x0228
        L_0x00b5:
            boolean r0 = r3.A1a
            r12 = 0
            if (r0 != 0) goto L_0x00cc
            X.1Ns r0 = r3.A0W
            if (r0 == 0) goto L_0x00cd
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x00cd
            java.lang.Integer r1 = r0.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x00cd
        L_0x00cc:
            r12 = 1
        L_0x00cd:
            boolean r8 = r13.A09
            if (r8 == 0) goto L_0x0189
            r13.A02(r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329019529051887(0x81110d00113eef, double:3.0379564631678326E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00f4
            android.content.Context r1 = r4.A00
            r0 = 2131953142(0x7f1305f6, float:1.9542747E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            r1 = 16
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r14, (java.lang.Object) r13)
            r4.A0C(r7, r0)
        L_0x00f4:
            android.content.Context r7 = r4.A00
            r0 = 2131957592(0x7f131758, float:1.9551772E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r7, r0)
            r1 = 2
            X.WB4 r0 = new X.WB4
            r0.<init>(r1, r4, r14, r13)
            r4.A0C(r11, r0)
            boolean r0 = X.C278764xU.A00(r5)
            if (r0 == 0) goto L_0x012c
            r0 = 36329019527937762(0x81110d00003ee2, double:3.0379564624632555E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x012c
            boolean r0 = r3.A1M
            if (r0 != 0) goto L_0x012c
            r0 = 2131952301(0x7f1302ad, float:1.954104E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r7, r0)
            r1 = 36
            X.WAz r0 = new X.WAz
            r0.<init>(r14, r1)
            r4.A0C(r11, r0)
        L_0x012c:
            boolean r0 = X.C278764xU.A00(r5)
            if (r0 == 0) goto L_0x0152
            r0 = 36329019527937762(0x81110d00003ee2, double:3.0379564624632555E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0152
            boolean r0 = r3.A1M
            if (r0 == 0) goto L_0x0152
            r0 = 2131972062(0x7f134fde, float:1.958112E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r7, r0)
            r1 = 37
            X.WAz r0 = new X.WAz
            r0.<init>(r14, r1)
            r4.A0C(r11, r0)
        L_0x0152:
            r0 = 36329019529117424(0x81110d00123ef0, double:3.0379564632092785E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x016e
            r0 = 2131963445(0x7f132e35, float:1.9563644E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r7, r0)
            r1 = 33
            X.WAz r0 = new X.WAz
            r0.<init>(r13, r1)
            r4.A0C(r11, r0)
        L_0x016e:
            r0 = 36319884132556485(0x8108be00011ec5, double:3.032179201638851E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0189
            r0 = 2131952384(0x7f130300, float:1.954121E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r7, r0)
            r1 = 7
            X.FP6 r0 = new X.FP6
            r0.<init>((X.W2M) r13, (int) r1)
            r4.A0C(r2, r0)
        L_0x0189:
            r13.A03(r4, r9)
            if (r12 == 0) goto L_0x01f9
            android.content.Context r2 = r4.A00
            r0 = 2131956749(0x7f13140d, float:1.9550062E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r2, r0)
            r1 = 6
            X.FP6 r0 = new X.FP6
            r0.<init>((X.W2M) r13, (int) r1)
            r4.A0C(r7, r0)
            r0 = 2
            java.lang.String r11 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r6, r11)
            r9 = r6
            X.0iw r9 = (X.AnonymousClass0iw) r9
            java.lang.String r1 = r3.getId()
            r0 = 5139(0x1413, float:7.201E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "copy_link"
            X.C22031Xty.A0E(r9, r5, r1, r7, r0)
            boolean r0 = X.C14290TtO.A00(r5)
            if (r0 == 0) goto L_0x01dd
            r0 = 2131971010(0x7f134bc2, float:1.9578987E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r2, r0)
            r1 = 9
            X.FP6 r0 = new X.FP6
            r0.<init>((X.W2M) r13, (int) r1)
            r4.A0C(r2, r0)
            X.0qQ.A0C(r6, r11)
            java.lang.String r1 = r3.getId()
            java.lang.String r0 = "qr_code"
            X.C22031Xty.A0E(r9, r5, r1, r7, r0)
        L_0x01dd:
            java.lang.String r2 = r13.A08
            r1 = 8
            X.FP6 r0 = new X.FP6
            r0.<init>((X.W2M) r13, (int) r1)
            r4.A0C(r2, r0)
            X.0qQ.A0C(r6, r11)
            java.lang.String r1 = r3.getId()
            r0 = 405(0x195, float:5.68E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.C22031Xty.A0E(r9, r5, r1, r7, r0)
        L_0x01f9:
            if (r8 != 0) goto L_0x0042
            X.3Hq r0 = r3.A0L
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x0042
            android.content.Context r1 = r4.A00
            r0 = 2131972204(0x7f13506c, float:1.9581409E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 34
            X.WAz r1 = new X.WAz
            r1.<init>(r13, r0)
            goto L_0x003f
        L_0x0215:
            com.instagram.model.reels.Reel r0 = r13.A06
            boolean r0 = r0.A0l()
            if (r0 == 0) goto L_0x0030
        L_0x021d:
            android.content.Context r1 = r4.A00
            r0 = 2131963381(0x7f132df5, float:1.9563514E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 30
        L_0x0228:
            X.WAz r1 = new X.WAz
            r1.<init>(r14, r0)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2M.A04(X.XBo, java.lang.Integer):void");
    }

    public W2M(Activity activity, Fragment fragment, AnonymousClass0iw r5, UserSession userSession, Reel reel) {
        C51974G9v.A1P(userSession, activity, fragment, r5);
        this.A05 = userSession;
        this.A01 = activity;
        this.A03 = fragment;
        this.A04 = r5;
        this.A06 = reel;
        this.A09 = reel.A1a;
        this.A02 = fragment.requireContext();
        1Ns r0 = reel.A0W;
        if (r0 != null) {
            User CCd = r0.CCd();
            if (CCd != null) {
                this.A07 = CCd;
                this.A08 = AnonymousClass7TF.A0d(activity.getResources(), 2131973529);
                return;
            }
            throw new IllegalStateException("user is null");
        }
        throw new IllegalStateException("owner is null");
    }
}
