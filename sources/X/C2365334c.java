package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.34c  reason: invalid class name and case insensitive filesystem */
public final class C2365334c {
    public Parcelable A00;
    public C249403jg A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public int A04;
    public Reel A05;
    public C275804ry A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final C2365834h A0C;
    public final Context A0D;
    public final C229402nK A0E;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2365334c(android.app.Activity r16, android.content.Context r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.AnonymousClass34Y r20, X.C230242pG r21) {
        /*
            r15 = this;
            r14 = 1
            r15.<init>()
            r9 = r19
            r15.A0B = r9
            r8 = r18
            r15.A0A = r8
            r7 = r17
            r15.A0D = r7
            X.1NN r4 = X.1NM.A00(r9)
            android.content.res.Resources r5 = r7.getResources()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322044501108637(0x810ab50001279d, double:3.033545427410338E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r3 = 0
            if (r0 == 0) goto L_0x00cc
            X.34d r6 = new X.34d
            r6.<init>(r7, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r6.A06 = r0
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A01 = r0
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = r5.getDimensionPixelSize(r1)
            r6.A04 = r0
            int r1 = r5.getDimensionPixelSize(r1)
            r0 = 0
            if (r1 < 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            X.02V.A05(r0)
            r6.A02 = r1
        L_0x004e:
            X.34e r11 = new X.34e
            r11.<init>(r6)
        L_0x0053:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            X.34h r6 = new X.34h
            r10 = r20
            r12 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A0C = r6
            r0 = 36322044501764004(0x810ab5000b27a4, double:3.033545427824795E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0078
            X.2sE r1 = new X.2sE
            r1.<init>(r7)
            r6.A06 = r1
            r0 = 7
            r1.A00 = r0
            r1.A00()
        L_0x0078:
            r0 = 36323646523845982(0x810c2a00002d5e, double:3.034558553040263E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x0092
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            r1 = r16
            X.0qQ.A0A(r1)
            r0 = 23602528(0x1682560, float:4.2638485E-38)
            X.2nK r3 = new X.2nK
            r3.<init>(r1, r8, r9, r0)
        L_0x0092:
            r15.A0E = r3
            com.instagram.common.session.UserSession r3 = r4.A00
            r0 = 36320313630335215(0x810922001120ef, double:3.032450817763569E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r15.A09 = r0
            r0 = 36320313630400752(0x810922001220f0, double:3.032450817805015E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r15.A07 = r0
            r0 = 36320313631645948(0x810922002520fc, double:3.032450818592482E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r15.A08 = r0
            X.0Tu r2 = X.0Tu.A06
            r0 = 36329973010678158(0x8111eb0000418e, double:3.038559448787649E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00cb
            X.4ry r0 = new X.4ry
            r0.<init>(r6)
            r15.A06 = r0
        L_0x00cb:
            return
        L_0x00cc:
            boolean r0 = X.1NN.A00(r4)
            if (r0 == 0) goto L_0x00f4
            X.34d r6 = new X.34d
            r6.<init>(r7, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A06 = r0
            r0 = 36322044501174174(0x810ab50002279e, double:3.033545427451784E-306)
            boolean r1 = X.182.A06(r2, r9, r0)
            r0 = 2131165244(0x7f07003c, float:1.79447E38)
            if (r1 == 0) goto L_0x00ec
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
        L_0x00ec:
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A01 = r0
            goto L_0x004e
        L_0x00f4:
            int r1 = X.0nA.A05(r7)
            r0 = 667(0x29b, float:9.35E-43)
            if (r1 >= r0) goto L_0x0119
            X.34d r6 = new X.34d
            r6.<init>(r7, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A06 = r0
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A01 = r0
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A03 = r0
            goto L_0x004e
        L_0x0119:
            X.0eM r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0159
            X.34d r6 = new X.34d
            r6.<init>(r7, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A06 = r0
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A03 = r0
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r1 = r5.getDimensionPixelSize(r0)
            r0 = 0
            if (r1 < 0) goto L_0x0147
            r0 = 1
        L_0x0147:
            X.02V.A05(r0)
            r6.A02 = r1
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A04 = r0
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            goto L_0x00ec
        L_0x0159:
            X.0eM r0 = r4.A03
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x019a
            X.34d r6 = new X.34d
            r6.<init>(r7, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A06 = r0
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A03 = r0
            r0 = 2131165351(0x7f0700a7, float:1.7944917E38)
            int r1 = r5.getDimensionPixelSize(r0)
            r0 = 0
            if (r1 < 0) goto L_0x0187
            r0 = 1
        L_0x0187:
            X.02V.A05(r0)
            r6.A02 = r1
            r0 = 2131165206(0x7f070016, float:1.7944623E38)
            int r0 = r5.getDimensionPixelSize(r0)
            r6.A04 = r0
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            goto L_0x00ec
        L_0x019a:
            r11 = r3
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365334c.<init>(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.34Y, X.2pG):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r0 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        r7.A05 = (com.instagram.model.reels.Reel) r5.Bkf(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r7 = this;
            r0 = 0
            r7.A05 = r0
            r3 = 0
            r7.A04 = r3
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            if (r0 == 0) goto L_0x007c
            X.3pI r4 = r0.A0D
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            if (r4 == 0) goto L_0x0080
            int r2 = r4.A1a()
        L_0x0014:
            X.34h r5 = r7.A0C
            int r0 = r5.getItemCount()
            if (r2 >= r0) goto L_0x0063
            if (r2 < 0) goto L_0x007d
            int r0 = r5.getItemCount()
            if (r2 >= r0) goto L_0x007d
            java.lang.Object r6 = r5.Bkf(r2)
            com.instagram.model.reels.Reel r6 = (com.instagram.model.reels.Reel) r6
            if (r6 == 0) goto L_0x007d
            X.1Ns r0 = r6.A0W
            if (r0 == 0) goto L_0x0048
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r7.A0B
            com.instagram.user.model.User r1 = r1.A01(r0)
            X.1Ns r0 = r6.A0W
            X.0qQ.A0A(r0)
            com.instagram.user.model.User r0 = r0.CCd()
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            boolean r0 = r6.A1Y
            if (r0 != 0) goto L_0x0059
            com.instagram.common.session.UserSession r0 = r7.A0B
            boolean r0 = r6.A16(r0)
            if (r0 != 0) goto L_0x0059
            boolean r0 = r6.A1V
            if (r0 == 0) goto L_0x005b
        L_0x0059:
            if (r1 == 0) goto L_0x007d
        L_0x005b:
            java.lang.Object r0 = r5.Bkf(r2)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            r7.A05 = r0
        L_0x0063:
            int r0 = r4.A1c()
            if (r2 >= r0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView r0 = r7.A03
            X.0qQ.A0A(r0)
            X.3kE r0 = r0.A0X(r2, r3)
            if (r0 == 0) goto L_0x007c
            android.view.View r0 = r0.itemView
            int r0 = r0.getLeft()
            r7.A04 = r0
        L_0x007c:
            return
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0080:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365334c.A05():void");
    }

    public final void A08(C228102kn r4) {
        0qQ.A0B(r4, 0);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C249403jg r1 = this.A01;
            if (r1 == null) {
                r1 = new C238323Bk(this.A0B, r4);
                this.A01 = r1;
            }
            recyclerView.A16(r1);
            if (!r4.A0R.isEmpty()) {
                C249403jg r12 = this.A01;
                if (r12 == null) {
                    r12 = new C238323Bk(this.A0B, r4);
                    this.A01 = r12;
                }
                recyclerView.A15(r12);
            }
        }
    }

    public final void A09(C228102kn r5, boolean z) {
        LinearLayoutManager linearLayoutManager;
        int A1b;
        0qQ.A0B(r5, 0);
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            C249403jg r1 = this.A01;
            if (r1 == null) {
                r1 = new C238323Bk(this.A0B, r5);
                this.A01 = r1;
            }
            recyclerView.A16(r1);
            if (z) {
                if (182.A06(0Tu.A05, 1NM.A00(this.A0B).A00, 36317577735050598L)) {
                    int size = A02().size();
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null && (linearLayoutManager = (LinearLayoutManager) recyclerView2.A0D) != null && (A1b = linearLayoutManager.A1b()) != -1) {
                        A07((A1b - size) + 1);
                    }
                }
            }
        }
    }

    public final C249703kE A00(Reel reel) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null || reel == null) {
            return null;
        }
        return recyclerView.A0W(this.A0C.CMG(reel));
    }

    public final Reel A01(String str) {
        AnonymousClass3BT r0 = (AnonymousClass3BT) this.A0C.A02.get(str);
        if (r0 != null) {
            return r0.A03;
        }
        return null;
    }

    public final List A02() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.A0D) == null) {
            List emptyList = Collections.emptyList();
            0qQ.A07(emptyList);
            return emptyList;
        }
        int A1b = linearLayoutManager.A1b();
        List list = this.A0C.A04;
        0qQ.A07(list);
        ArrayList arrayList = new ArrayList();
        int min = Math.min(A1b, list.size());
        for (int A1a = linearLayoutManager.A1a(); A1a < min; A1a++) {
            Object obj = list.get(A1a);
            0qQ.A07(obj);
            Reel reel = ((AnonymousClass3BT) obj).A03;
            if (!reel.A0a()) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public final void A03() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        Context context = this.A0D;
        RecyclerView recyclerView5 = new RecyclerView(context, (AttributeSet) null);
        this.A03 = recyclerView5;
        UserSession userSession = this.A0B;
        AnonymousClass3B1.A00(context, recyclerView5, userSession);
        if (182.A06(0Tu.A05, userSession, 36323045229144851L) && (recyclerView4 = this.A03) != null) {
            recyclerView4.setItemAnimator((AnonymousClass3AS) null);
        }
        RecyclerView recyclerView6 = this.A03;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(this.A0C);
        }
        RecyclerView recyclerView7 = this.A03;
        if (recyclerView7 != null) {
            recyclerView7.setContentDescription("reels_tray_container");
        }
        C229402nK r1 = this.A0E;
        if (!(r1 == null || (recyclerView3 = this.A03) == null)) {
            recyclerView3.A15(r1);
        }
        if (this.A09) {
            RecyclerView recyclerView8 = new RecyclerView(context, (AttributeSet) null);
            this.A02 = recyclerView8;
            AnonymousClass3B1.A00(context, recyclerView8, userSession);
            RecyclerView recyclerView9 = this.A02;
            if (recyclerView9 != null) {
                recyclerView9.setAdapter(this.A0C);
                recyclerView9.setContentDescription("reels_tray_container");
            }
        }
        if (this.A07 && this.A08) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            RecyclerView recyclerView10 = this.A03;
            if (recyclerView10 != null) {
                recyclerView10.A11(new C46857DmZ(this, dimensionPixelSize));
                recyclerView10.setClipToPadding(false);
                recyclerView10.setClipChildren(false);
                recyclerView10.setPaddingRelative(dimensionPixelSize, 0, 0, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMarginStart(-dimensionPixelSize);
                recyclerView10.setLayoutParams(marginLayoutParams);
            }
        }
        if (182.A06(0Tu.A06, userSession, 36329973010678158L) && (recyclerView2 = this.A03) != null) {
            C275814rz r2 = new C275814rz(recyclerView2.getContext(), recyclerView2, this);
            Drawable drawable = recyclerView2.getContext().getDrawable(R.drawable.highlight_divider_drawable);
            if (drawable != null) {
                r2.A01 = drawable;
            }
            recyclerView2.A11(r2);
        }
        C275804ry r12 = this.A06;
        if (r12 != null && (recyclerView = this.A03) != null) {
            recyclerView.A15(r12);
        }
    }

    public final void A04() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            C252553pI r0 = recyclerView2.A0D;
            if (r0 != null) {
                this.A00 = r0.A1M();
                RecyclerView recyclerView3 = this.A03;
                0qQ.A0A(recyclerView3);
                recyclerView3.setAdapter((2Rw) null);
                C229402nK r1 = this.A0E;
                if (r1 != null) {
                    RecyclerView recyclerView4 = this.A03;
                    0qQ.A0A(recyclerView4);
                    recyclerView4.A16(r1);
                }
                this.A03 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        RecyclerView recyclerView5 = this.A02;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter((2Rw) null);
        }
        this.A02 = null;
        C275804ry r12 = this.A06;
        if (r12 != null && (recyclerView = this.A03) != null) {
            recyclerView.A16(r12);
        }
    }

    public final void A06() {
        Reel reel = this.A05;
        if (reel == null) {
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                recyclerView.A0o(0);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.A03;
        if (recyclerView2 != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.A0D;
            C2365834h r0 = this.A0C;
            0qQ.A0A(reel);
            int CMG = r0.CMG(reel);
            int i = this.A04;
            if (i != 0) {
                if (linearLayoutManager != null) {
                    linearLayoutManager.A1p(CMG, i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            } else if (linearLayoutManager != null) {
                linearLayoutManager.A1O(CMG);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A07(int i) {
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null && recyclerView.A0D != null) {
            C14790U9f u9f = new C14790U9f(this.A0D, this.A0B);
            u9f.A00 = i;
            C252553pI r0 = recyclerView.A0D;
            0qQ.A0A(r0);
            r0.A0t(u9f);
        }
    }
}
