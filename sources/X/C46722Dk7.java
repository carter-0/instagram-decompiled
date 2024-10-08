package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dk7  reason: case insensitive filesystem */
public abstract class C46722Dk7 extends PopupWindow implements C252203oj {
    public static final C71392co A0U = C71392co.A01();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 2cs A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final Activity A0G;
    public final Rect A0H;
    public final ViewParent A0I;
    public final LinearLayout A0J;
    public final ConstraintLayout A0K;
    public final AnonymousClass0iw A0L;
    public final UserSession A0M;
    public final 1Xj A0N;
    public final User A0O;
    public final Integer A0P;
    public final String A0Q;
    public final List A0R = AnonymousClass7TE.A1C();
    public final boolean A0S;
    public final View A0T;

    public final void A01(int i) {
        if (i > 4) {
            i = 4;
        }
        ViewGroup.LayoutParams layoutParams = this.A0J.getLayoutParams();
        Activity activity = this.A0G;
        layoutParams.width = ((int) (((float) i) * activity.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size))) + ((int) (((float) (i - 1)) * DbX.A00(activity))) + ((int) (activity.getResources().getDimension(R.dimen.account_discovery_bottom_gap) * 2.0f));
    }

    public final void A03(Rect rect, ViewParent viewParent) {
        List list;
        ConstraintLayout constraintLayout;
        float f;
        float f2;
        boolean A1U = AnonymousClass7TF.A1U(0, rect, viewParent);
        if (!this.A07) {
            if (this instanceof EKD) {
                list = ((EKD) this).A01;
            } else {
                list = ((EKE) this).A01;
            }
            if (list.size() != 0) {
                Activity activity = this.A0G;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    2cs A022 = C61340me.A00().A02();
                    this.A05 = A022;
                    C71392co r0 = A0U;
                    A022.A06 = A1U;
                    A022.A09(r0);
                    A022.A05(0.0d);
                    viewParent.requestDisallowInterceptTouchEvent(A1U);
                    int i = rect.top;
                    int height = rect.height();
                    Integer num = this.A0P;
                    if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N) {
                        constraintLayout = this.A0K;
                        f = ((float) i) - ((float) this.A0E);
                        f2 = (float) height;
                    } else {
                        constraintLayout = this.A0K;
                        f = ((float) i) - ((float) this.A0E);
                        f2 = activity.getResources().getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
                    }
                    constraintLayout.setY(f - f2);
                    this.A00 = constraintLayout.getY() - activity.getResources().getDimension(R.dimen.asset_picker_static_sticker_last_row_padding);
                    int color = activity.getColor(R.color.black_50_transparent);
                    this.A04 = 2db.A00(activity);
                    this.A02 = color;
                    int color2 = activity.getColor(R.color.black_50_transparent);
                    this.A03 = AnonymousClass2uJ.A00(activity);
                    this.A01 = color2;
                    AnonymousClass2S0.A01.A03();
                    showAtLocation(activity.findViewById(16908290), 0, 0, 0);
                    2cs r02 = this.A05;
                    if (r02 != null) {
                        r02.A0A(this);
                        2cs r03 = this.A05;
                        if (r03 != null) {
                            r03.A05(0.0d);
                            2cs r04 = this.A05;
                            if (r04 != null) {
                                r04.A03();
                                constraintLayout.setPivotX((float) rect.left);
                                constraintLayout.setPivotY(((float) constraintLayout.getLayoutParams().height) / 2.0f);
                                return;
                            }
                        }
                    }
                    0qQ.A0F("spring");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
    }

    public final void DmC(2cs r9) {
        0qQ.A0B(r9, 0);
        if (r9.A01 == 0.0d) {
            dismiss();
            return;
        }
        for (F2Y f2y : this.A0R) {
            FEY fey = f2y.A02;
            if (AnonymousClass7TF.A1Q((fey.A00 > 0.0f ? 1 : (fey.A00 == 0.0f ? 0 : -1))) && fey.A01 == 0.0f) {
                int[] iArr = new int[2];
                fey.A07.getLocationInWindow(iArr);
                fey.A00 = (float) iArr[0];
                fey.A01 = (float) iArr[1];
            }
            if (fey.A02 == 0.0f && fey.A03 == 0.0f) {
                int[] iArr2 = new int[2];
                fey.A09.getLocationInWindow(iArr2);
                fey.A02 = (float) iArr2[0];
                fey.A03 = (float) iArr2[1];
            }
        }
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.7hH] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.7hH] */
    public final void DmE(2cs r7) {
        int i;
        int i2;
        0qQ.A0B(r7, 0);
        float f = (float) r7.A09.A00;
        double d = r7.A01;
        if (d == 0.0d || d == 1.0d) {
            Integer num = this.A0P;
            if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) {
                int i3 = this.A04;
                if (!(i3 == 255 || (i2 = this.A02) == 255)) {
                    2db.A02(this.A0G, DbW.A04(new Object().evaluate(f, Integer.valueOf(i3), Integer.valueOf(i2)), "null cannot be cast to non-null type kotlin.Int"));
                }
                int i4 = this.A03;
                if (!(i4 == 255 || (i = this.A01) == 255)) {
                    AnonymousClass2uJ.A04(this.A0G, DbW.A04(new Object().evaluate(f, Integer.valueOf(i4), Integer.valueOf(i)), "null cannot be cast to non-null type kotlin.Int"));
                }
            }
            this.A0T.setAlpha(f);
            if (!(num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N)) {
                float dimension = this.A0G.getResources().getDimension(R.dimen.abc_list_item_height_material);
                float f2 = this.A00;
                this.A0K.setY(f2 - ((f2 - (f2 - dimension)) * f));
            }
            ConstraintLayout constraintLayout = this.A0K;
            constraintLayout.setAlpha(f);
            constraintLayout.setScaleX(f);
            constraintLayout.setScaleY(f);
        }
    }

    public final void A00() {
        if (this instanceof EKD) {
            Dbb.A1O(this.A0M, new EHN(this, 4));
            return;
        }
        EKE eke = (EKE) this;
        List list = eke.A01;
        list.clear();
        List A022 = eke.A00.A02();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A022) {
            if (!0qQ.A0K(((C49890FBq) next).A08, "add_content_note")) {
                A1C.add(next);
            }
        }
        list.addAll(00k.A0d(A1C, 4));
        eke.A01(list.size());
        eke.A03(eke.A0H, eke.A0I);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: com.instagram.api.schemas.SocialContextType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: com.instagram.api.schemas.SocialContextType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.6o8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: com.instagram.api.schemas.SocialContextType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(long r37) {
        /*
            r36 = this;
            r1 = r36
            boolean r0 = r1 instanceof X.EKD
            if (r0 == 0) goto L_0x0345
            r3 = r1
            X.EKD r3 = (X.EKD) r3
            java.util.List r0 = r3.A0R
            java.util.Iterator r1 = r0.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r4 = r1.next()
            r0 = r4
            X.F2Y r0 = (X.F2Y) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x000f
        L_0x0021:
            X.F2Y r4 = (X.F2Y) r4
            r15 = r37
            if (r4 == 0) goto L_0x007e
            X.FEY r1 = r4.A02
            boolean r0 = r1 instanceof X.EKC
            if (r0 == 0) goto L_0x033a
            X.EKC r1 = (X.EKC) r1
            com.instagram.model.direct.DirectShareTarget r0 = r1.A02
            java.lang.String r1 = r0.A0A()
        L_0x0035:
            X.Dk7 r0 = r4.A04
            com.instagram.user.model.User r0 = r0.A0O
            if (r0 == 0) goto L_0x0337
            java.lang.String r0 = r0.getUsername()
        L_0x003f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0145
            com.instagram.common.session.UserSession r5 = r3.A0M
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315846863294052(0x81051200010e64, double:3.02962601630051E-306)
            boolean r0 = X.DbY.A1Z(r2, r5, r0)
            if (r0 == 0) goto L_0x0145
            X.2FW r2 = X.2FW.A1D
            X.1as r0 = X.1as.A04
            X.1ap r1 = r0.A02
            X.0iw r0 = r3.A0L
            X.F3w r2 = r1.A07(r0, r5, r2)
            X.1Xj r0 = r3.A0N
            if (r0 == 0) goto L_0x0372
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0372
            r2.A06(r0)
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r3.A0G
            X.37D r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x007e
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r2.A00()
            r1.A0J(r0)
        L_0x007e:
            com.instagram.common.session.UserSession r6 = r3.A0M
            X.0iw r0 = r3.A0L
            X.0wc r14 = X.AnonymousClass0kN.A01(r0, r6)
            double r0 = (double) r15
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r4
            X.1Xj r5 = r3.A0N
            r12 = 0
            if (r5 == 0) goto L_0x0142
            java.lang.String r11 = r5.A2n()
        L_0x0096:
            r10 = 0
            X.0qQ.A0B(r6, r10)
            X.2xG r4 = X.C234202xG.A00
            java.lang.Class<X.2xH> r2 = X.C234212xH.class
            r6.A01(r2, r4)
            java.lang.String r9 = r3.A0Q
            if (r11 != 0) goto L_0x00a7
            java.lang.String r11 = ""
        L_0x00a7:
            com.instagram.user.model.User r2 = r3.A0O
            if (r2 == 0) goto L_0x013f
            java.lang.String r8 = r2.getId()
        L_0x00af:
            if (r5 == 0) goto L_0x013b
            java.lang.String r7 = X.DbT.A0x(r5)
            X.1iA r2 = r5.BR7()
            java.lang.String r6 = r2.name()
            X.1Xy r2 = r5.A0C
            java.lang.String r5 = r2.BIl()
        L_0x00c3:
            java.lang.String r4 = r3.A06
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x0139
            long r2 = r3.A00
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L_0x00cf:
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r15
            long r2 = java.lang.Math.round(r0)
            double r0 = (double) r2
            double r0 = r0 / r15
            X.0qQ.A0B(r9, r10)
            java.lang.String r2 = "direct_reshare_quick_send_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r14, r2)
            boolean r3 = r2.isSampled()
            if (r3 == 0) goto L_0x0138
            X.DbS.A1N(r2, r9)
            r9 = 2
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r3 = "quick_send_version"
            r2.A9F(r3, r9)
            java.lang.String r3 = "media_id"
            r2.AAJ(r3, r11)
            java.lang.String r3 = "author_id"
            r2.AAJ(r3, r8)
            java.lang.String r3 = "ranking_info_token"
            r2.AAJ(r3, r7)
            java.lang.String r3 = "num_active_now"
            r2.A9F(r3, r13)
            java.lang.String r3 = "num_groups"
            r2.A9F(r3, r12)
            java.lang.String r3 = "inventory_source"
            r2.AAJ(r3, r5)
            java.lang.String r3 = "media_type"
            r2.AAJ(r3, r6)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "dwell_time_s"
            r2.A8D(r0, r1)
            java.lang.String r0 = "ranking_request_id"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "message_id"
            r2.AAJ(r0, r12)
            java.lang.String r0 = "open_thread_id"
            r2.AAJ(r0, r12)
            java.lang.String r0 = "type"
            r2.AAJ(r0, r12)
            X.DbX.A1L(r2)
        L_0x0138:
            return
        L_0x0139:
            r13 = r12
            goto L_0x00cf
        L_0x013b:
            r7 = r12
            r6 = r12
            r5 = r12
            goto L_0x00c3
        L_0x013f:
            r8 = r12
            goto L_0x00af
        L_0x0142:
            r11 = r12
            goto L_0x0096
        L_0x0145:
            java.lang.Object r2 = r4.A00()
            r0 = 372(0x174, float:5.21E-43)
            java.lang.String r9 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r2, r9)
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            X.OZA r0 = X.OZA.A00
            com.instagram.common.session.UserSession r1 = r3.A0M
            boolean r8 = r0.A01(r1, r2)
            X.Mew r0 = r3.A02
            X.7Z7 r17 = r0.A00(r2)
            java.lang.Integer r0 = r3.A0P
            int r5 = r0.intValue()
            r0 = 1
            if (r5 == r0) goto L_0x0244
            r0 = 0
            if (r5 == r0) goto L_0x0244
            r0 = 2
            if (r5 == r0) goto L_0x0244
            r0 = 3
            if (r5 != r0) goto L_0x0377
            X.1Xj r0 = r3.A0N
            if (r0 == 0) goto L_0x01c6
            boolean r6 = r0.A5G()
            if (r6 != 0) goto L_0x025b
            boolean r6 = r0.CcK()
            if (r6 != 0) goto L_0x025b
            X.0Tu r10 = X.0Tu.A05
            r6 = 36327597893761574(0x810fc200003a26, double:3.037057415285773E-306)
            boolean r6 = X.182.A06(r10, r1, r6)
            r25 = 0
            if (r6 == 0) goto L_0x019f
            int r6 = r3.A0D
            X.1Xj r6 = r0.A1c(r6)
            if (r6 == 0) goto L_0x019f
            java.lang.String r25 = r6.getId()
        L_0x019f:
            X.0iw r6 = r3.A0L
            java.lang.String r11 = r6.getModuleName()
            r18 = 0
        L_0x01a7:
            r10 = 0
            java.lang.String r7 = ""
            X.9cP r6 = new X.9cP
            r6.<init>(r11, r7, r8, r10)
            r19 = r18
            r20 = r6
            r21 = r0
            r22 = r2
            r23 = r18
            r24 = r18
            r17.EM1(r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x01be:
            android.app.Activity r6 = r3.A0G
            r2 = 2131973117(0x7f1353fd, float:1.958326E38)
            X.C59689JTv.A07(r6, r2)
        L_0x01c6:
            java.lang.Object r11 = r4.A00()
            X.0qQ.A0C(r11, r9)
            com.instagram.model.direct.DirectShareTarget r11 = (com.instagram.model.direct.DirectShareTarget) r11
            int r4 = r4.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r13 = -1
            if (r2 == 0) goto L_0x01da
            int r13 = r4 + -1
        L_0x01da:
            r2 = 3
            if (r5 == r2) goto L_0x0241
            java.lang.String r14 = "feed_start"
        L_0x01df:
            boolean r12 = r3.A08
            X.3mS r4 = X.C251033mS.A00(r1)
            X.3mO r2 = X.C250993mO.A01(r1)
            X.0qQ.A07(r2)
            boolean r17 = r2.A0A(r11, r4)
            X.0iw r5 = r3.A0L
            X.3t2 r2 = X.DbS.A0c(r11)
            boolean r35 = X.C69965Nv5.A00(r1, r2)
            java.lang.String r10 = "sent"
            r2 = 3830(0xef6, float:5.367E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r2)
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.String r8 = "action"
            java.lang.String r7 = "source"
            r2 = 11
            X.0qQ.A0B(r5, r2)
            r2 = 0
            if (r0 == 0) goto L_0x029b
            boolean r6 = r0.CcK()
            if (r6 == 0) goto L_0x029b
            r22 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r9
            r27 = r2
            r28 = r2
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r9
            r34 = r4
            r19 = r1
            r20 = r0
            r21 = r11
            r17 = r5
            r18 = r2
            X.C3265677h.A0G(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x007e
        L_0x0241:
            java.lang.String r14 = "clips_viewer"
            goto L_0x01df
        L_0x0244:
            X.1Xj r0 = r3.A0N
            if (r0 == 0) goto L_0x01c6
            X.AnonymousClass7TG.A1N(r1, r2)
            X.2Ep r6 = X.OZA.A00(r1, r2)
            boolean r6 = X.C308556Us.A0M(r1, r6)
            if (r6 == 0) goto L_0x0276
            boolean r6 = r0.A5G()
            if (r6 == 0) goto L_0x0276
        L_0x025b:
            r18 = 0
            X.0iw r6 = r3.A0L
            java.lang.String r23 = r6.getModuleName()
            java.lang.String r24 = "quick_send_pop_up"
            r19 = r18
            r20 = r0
            r21 = r2
            r22 = r18
            r25 = r18
            r26 = r8
            r17.ELV(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01be
        L_0x0276:
            r18 = 0
            X.0Tu r10 = X.0Tu.A05
            r6 = 36327597893761574(0x810fc200003a26, double:3.037057415285773E-306)
            boolean r6 = X.182.A06(r10, r1, r6)
            r25 = 0
            if (r6 == 0) goto L_0x0293
            int r6 = r3.A0D
            X.1Xj r6 = r0.A1c(r6)
            if (r6 == 0) goto L_0x0293
            java.lang.String r25 = r6.getId()
        L_0x0293:
            X.0iw r6 = r3.A0L
            java.lang.String r11 = r6.getModuleName()
            goto L_0x01a7
        L_0x029b:
            r4 = 663(0x297, float:9.29E-43)
            java.lang.String r4 = X.C273654mx.A00(r4)
            X.0xI r6 = X.0xI.A00(r5, r4)
            int r4 = (int) r15
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "press_duration"
            r6.A08(r5, r4)
            r6.A0C(r8, r10)
            r6.A0C(r7, r9)
            java.lang.String r4 = "entry_point"
            r6.A0C(r4, r14)
            if (r0 == 0) goto L_0x0335
            java.lang.String r5 = r0.Bi3()
            java.lang.String r2 = r0.A2n()
            X.1iA r4 = r0.BR7()
            int r4 = r4.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "m_t"
            if (r7 == 0) goto L_0x02d5
            r6.A08(r7, r4)
        L_0x02d5:
            X.1iA r4 = r0.BR7()
            int r4 = r4.A00
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "media_type"
            if (r7 == 0) goto L_0x02e6
            r6.A08(r7, r4)
        L_0x02e6:
            X.1Xy r0 = r0.A0C
            java.lang.String r4 = r0.BIl()
            java.lang.String r0 = "inventory_source"
            if (r4 == 0) goto L_0x02f3
            r6.A0C(r0, r4)
        L_0x02f3:
            if (r35 != 0) goto L_0x02fa
            java.lang.String r0 = "media_id"
            r6.A0C(r0, r2)
        L_0x02fa:
            java.lang.String r0 = "author_id"
            r6.A0C(r0, r5)
            java.util.ArrayList r2 = r11.A0B()
            java.lang.String r0 = "recipient_ids"
            r6.A0D(r0, r2)
            X.3t2 r2 = X.DbS.A0c(r11)
            boolean r0 = r2 instanceof X.C254763t0
            if (r0 == 0) goto L_0x0319
            X.3t0 r2 = (X.C254763t0) r2
            java.lang.String r2 = r2.A00
            java.lang.String r0 = "thread_id"
            r6.A0C(r0, r2)
        L_0x0319:
            r0 = -1
            if (r13 == r0) goto L_0x0325
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.String r0 = "position"
            r6.A08(r2, r0)
        L_0x0325:
            if (r12 == 0) goto L_0x0330
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "is_active_recipient"
            r6.A09(r0, r2)
        L_0x0330:
            X.DbU.A1R(r6, r1)
            goto L_0x007e
        L_0x0335:
            r5 = r2
            goto L_0x02f3
        L_0x0337:
            r0 = 0
            goto L_0x003f
        L_0x033a:
            X.EKB r1 = (X.EKB) r1
            X.FBq r0 = r1.A01
            java.lang.String r1 = r0.A08
            X.0qQ.A07(r1)
            goto L_0x0035
        L_0x0345:
            java.util.List r0 = r1.A0R
            java.util.Iterator r3 = r0.iterator()
        L_0x034b:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x0370
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.F2Y r0 = (X.F2Y) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x034b
        L_0x035d:
            X.F2Y r1 = (X.F2Y) r1
            if (r1 == 0) goto L_0x0138
            java.lang.Object r1 = r1.A00()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.sharesheetactions.DirectShareSheetAction"
            X.0qQ.A0C(r1, r0)
            X.FBq r1 = (X.C49890FBq) r1
            r1.A06(r2)
            return
        L_0x0370:
            r1 = r2
            goto L_0x035d
        L_0x0372:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0377:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46722Dk7.A02(long):void");
    }

    public final void DmB(2cs r6) {
        List list;
        2HZ r0;
        if (!this.A07) {
            if (this instanceof EKD) {
                list = ((EKD) this).A01;
            } else {
                list = ((EKE) this).A01;
            }
            int i = new int[]{list.size(), 4}[0];
            if (4 < i) {
                i = 4;
            }
            if (C48874Ela.A00(this.A0P)) {
                r0 = new 2HZ(i, 1, -1);
            } else {
                r0 = new 2HY(1, i);
            }
            int i2 = r0.A00;
            int i3 = r0.A01;
            int i4 = r0.A02;
            if (i4 > 0) {
                if (i2 > i3) {
                    return;
                }
            } else if (i4 >= 0 || i3 > i2) {
                return;
            }
            while (true) {
                this.A0R.add(new F2Y(this, i2));
                if (i2 != i3) {
                    i2 += i4;
                } else {
                    return;
                }
            }
        }
    }

    public C46722Dk7(Activity activity, Rect rect, ViewParent viewParent, AnonymousClass0iw r9, UserSession userSession, 1Xj r11, Integer num, int i, long j) {
        User user;
        String str;
        int A012;
        this.A0G = activity;
        this.A0M = userSession;
        this.A0N = r11;
        this.A0P = num;
        this.A0F = j;
        this.A0L = r9;
        this.A0H = rect;
        this.A0I = viewParent;
        this.A0D = i;
        this.A0A = activity.getResources().getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A0B = activity.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0C = DbU.A00(activity, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A09 = DbU.A00(activity, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A04 = 255;
        this.A02 = 255;
        this.A03 = 255;
        this.A01 = 255;
        if (r11 != null) {
            user = r11.A2A(userSession);
        } else {
            user = null;
        }
        this.A0O = user;
        this.A0S = 2Ek.A00(user);
        if (num.intValue() != 3) {
            str = "feed_start";
        } else {
            str = "clips_viewer";
        }
        this.A0Q = str;
        setContentView(LayoutInflater.from(activity).inflate(182.A06(0Tu.A05, userSession, 36326837684549668L) ? R.layout.quick_send_external : R.layout.quick_send_v2, (ViewGroup) null));
        setHeight(-1);
        setWidth(-1);
        this.A0J = (LinearLayout) getContentView().findViewById(R.id.quick_send_popup_window);
        this.A0K = (ConstraintLayout) getContentView().findViewById(R.id.quick_send_popup_container);
        this.A0T = getContentView().findViewById(R.id.background_dimmer);
        if (C226122ff.A03()) {
            A012 = C226122ff.A01();
        } else {
            A012 = 2db.A01(activity);
        }
        this.A0E = A012;
    }

    public final void dismiss() {
        super.dismiss();
        this.A0R.clear();
        this.A0I.requestDisallowInterceptTouchEvent(false);
        2cs r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("spring");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A00();
        }
    }
}
