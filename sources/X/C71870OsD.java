package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.instagram.aistudio.logging.AiStudioLoggingData;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.OsD  reason: case insensitive filesystem */
public final class C71870OsD implements AnonymousClass0iw, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "MessageActionsController";
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public LinearLayout A0B;
    public PopupWindow A0C;
    public C70741OJm A0D;
    public C74501Pvv A0E;
    public C71085Ob8 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final int A0M;
    public final int A0N;
    public final Activity A0O;
    public final UserSession A0P;
    public final OMT A0Q;
    public final C70452O7d A0R;
    public final MessageActionsViewModel A0S;
    public final C254783t2 A0T;
    public final C254743sy A0U;
    public final AnonymousClass37D A0V;
    public final AnonymousClass0eK A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public final String getModuleName() {
        return "direct_message_actions_fragment";
    }

    public static int A00(Context context, C71870OsD osD) {
        MessageActionsViewModel messageActionsViewModel = osD.A0S;
        PointF pointF = messageActionsViewModel.A04;
        pointF.getClass();
        int dimensionPixelSize = ((int) pointF.y) - context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        if (messageActionsViewModel.A0U) {
            Rect rect = messageActionsViewModel.A05;
            int A012 = DbY.A01(context);
            C74501Pvv pvv = osD.A0E;
            if (!(rect == null || pvv == null)) {
                int i = rect.top - A012;
                int A002 = dimensionPixelSize - ((int) 0nA.A00(context, (float) 182.A01(0Tu.A05, osD.A0P, 36597966085622852L)));
                if (A002 > i) {
                    dimensionPixelSize = A002;
                }
                int i2 = (osD.A02 - dimensionPixelSize) - A012;
                if (i2 < 0) {
                    dimensionPixelSize -= Math.abs(i2);
                }
            }
        }
        return Math.min((0nA.A0D(context).y - AnonymousClass2uJ.A00) - DbY.A01(context), dimensionPixelSize) - osD.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3.A0E != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.content.res.Resources r6, X.C71870OsD r7) {
        /*
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r3 = r7.A0S
            java.lang.String r0 = r3.A0E
            if (r0 == 0) goto L_0x0060
            android.graphics.Rect r0 = r3.A05
            if (r0 == 0) goto L_0x005e
            int r6 = r0.left
        L_0x000c:
            android.app.Activity r1 = r7.A0O
            r0 = 2131435207(0x7f0b1ec7, float:1.849225E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 2131435220(0x7f0b1ed4, float:1.8492276E38)
            android.view.View r2 = r1.findViewById(r0)
            androidx.slidingpanelayout.widget.SlidingPaneLayout r2 = (androidx.slidingpanelayout.widget.SlidingPaneLayout) r2
            boolean r0 = r3.A0Y
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r3.A0E
            r0 = 1
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            boolean r0 = X.C66581MXm.A1a(r0)
            if (r0 != 0) goto L_0x005d
            if (r2 == 0) goto L_0x005d
            if (r7 == 0) goto L_0x005d
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x005d
            android.graphics.RectF r0 = X.0nA.A01
            r1 = 0
            r0 = 2
            int[] r5 = new int[r0]
            r7.getLocationInWindow(r5)
            r2 = r5[r1]
            float r4 = (float) r2
            r1 = 1
            r0 = r5[r1]
            float r3 = (float) r0
            int r0 = r7.getMeasuredWidth()
            int r2 = r2 + r0
            float r2 = (float) r2
            r1 = r5[r1]
            int r0 = r7.getMeasuredHeight()
            int r1 = r1 + r0
            float r1 = (float) r1
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r4, r3, r2, r1)
            float r0 = r0.right
            int r0 = (int) r0
            int r6 = r6 + r0
        L_0x005d:
            return r6
        L_0x005e:
            r6 = 0
            goto L_0x000c
        L_0x0060:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x006c
            r1 = 2131165339(0x7f07009b, float:1.7944892E38)
        L_0x0067:
            int r6 = r6.getDimensionPixelSize(r1)
            goto L_0x000c
        L_0x006c:
            boolean r0 = r3.A0Y
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            boolean r0 = X.C66581MXm.A1a(r0)
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
            if (r0 == 0) goto L_0x0067
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71870OsD.A01(android.content.res.Resources, X.OsD):int");
    }

    public static void A02(LongPressActionData longPressActionData, C71870OsD osD, String str) {
        String str2;
        AnonymousClass3U9 A0a2;
        C254703su BRz;
        AnonymousClass7AG r0;
        C254743sy r7 = osD.A0U;
        DirectThreadKey A042 = C66647MaG.A04(r7);
        if (A042 == null || (BRz = 2L2.A00(osD.A0P).BRz(A042, osD.A0S.A08.A01)) == null || (r0 = BRz.A0Q) == null) {
            str2 = null;
        } else {
            str2 = C63238Ktj.A00(r0.A06);
        }
        OMT omt = osD.A0Q;
        MessageActionsViewModel messageActionsViewModel = osD.A0S;
        String A002 = LIt.A00(longPressActionData.A03);
        AiStudioLoggingData aiStudioLoggingData = messageActionsViewModel.A06;
        UserSession userSession = osD.A0P;
        0qQ.A0B(userSession, 1);
        XSV xsv = null;
        if (!(A042 == null || (A0a2 = C66582MXn.A0a(userSession, A042)) == null)) {
            xsv = OP1.A00(A0a2);
        }
        omt.A00(xsv, aiStudioLoggingData, messageActionsViewModel, r7, A002, str, str2);
    }

    public static void A03(C71870OsD osD) {
        osD.A0B.getClass();
        osD.A0G = true;
        C294975nL A0F2 = JTP.A0b(osD.A0B).A0F(true);
        float f = osD.A00;
        A0F2.A0T(f, ((float) C66582MXn.A01(osD.A0O)) + f + ((float) AnonymousClass2uJ.A00));
        A0F2.A05 = new PQI(osD, 2);
        A0F2.A0H();
        PopupWindow popupWindow = osD.A0C;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        C71085Ob8 ob8 = osD.A0F;
        if (ob8 != null) {
            ob8.A03();
        }
        C74501Pvv pvv = osD.A0E;
        if (pvv != null) {
            pvv.D9I();
        }
        View view = osD.A08;
        if (osD.A0H && view != null) {
            C51972G9s.A0I(view).withEndAction(new C73221PYz(view, osD));
        }
    }

    public final void A04() {
        FrameLayout frameLayout = this.A0A;
        if (frameLayout != null) {
            Activity activity = this.A0O;
            int min = Math.min(activity.getResources().getDimensionPixelSize(R.dimen.emoji_reaction_creation_tray_max_width), AnonymousClass0nB.A01(activity) - (DbY.A01(activity) * 2));
            int i = 1;
            if (this.A0S.A0W) {
                min = activity.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
                i = 8388611;
            }
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(min, -2, i));
        }
    }

    public C71870OsD(Activity activity, UserSession userSession, C70452O7d o7d, C74501Pvv pvv, MessageActionsViewModel messageActionsViewModel, C254783t2 r8, C254743sy r9, AnonymousClass37D r10, AnonymousClass0eK r11, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        this.A0O = activity;
        this.A0P = userSession;
        this.A0R = o7d;
        this.A0E = pvv;
        this.A0W = r11;
        this.A00 = f;
        this.A0N = i;
        this.A0S = messageActionsViewModel;
        this.A05 = i2;
        this.A0U = r9;
        this.A0X = z;
        this.A0a = z2;
        this.A0Y = z3;
        this.A0b = z4;
        this.A0T = r8;
        this.A0M = i3;
        this.A0V = r10;
        this.A0Q = new OMT(userSession);
        if (Build.VERSION.SDK_INT >= 30) {
            this.A00 = 0.0f;
            z5 = true;
        } else {
            z5 = false;
        }
        this.A0Z = z5;
    }

    public final boolean onBackPressed() {
        A03(this);
        return true;
    }
}
