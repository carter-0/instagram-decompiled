package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.TzI  reason: case insensitive filesystem */
public final class C14611TzI extends BaseAdapter {
    public static boolean A06;
    public C250973mM A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final ReelDashboardFragment A05;

    public final long getItemId(int i) {
        return 0;
    }

    public C14611TzI(AnonymousClass0iw r4, UserSession userSession, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A04 = userSession;
        this.A02 = i;
        this.A01 = (int) (((float) i) / 0.5625f);
        this.A03 = r4;
        this.A05 = reelDashboardFragment;
        A06 = AnonymousClass7TF.A0R(0Tu.A05, userSession, 36322521242413288L).booleanValue();
    }

    public static void A00(VTC vtc, int i, int i2) {
        if (!A06) {
            Drawable drawable = vtc.A01.getContext().getDrawable(R.drawable.filter_shadow);
            Rect rect = new Rect();
            drawable.getPadding(rect);
            View view = vtc.A00;
            ViewGroup.MarginLayoutParams A0D = DbS.A0D(view);
            int i3 = rect.left;
            int i4 = rect.right;
            A0D.width = i + i3 + i4;
            int i5 = rect.top;
            int i6 = rect.bottom;
            A0D.height = i2 + i5 + i6;
            A0D.topMargin = (int) (((float) (i6 - i5)) / 2.0f);
            A0D.setMarginStart(JTO.A04((float) (i4 - i3), 2.0f));
            view.setLayoutParams(A0D);
            view.setBackground(drawable);
        }
    }

    public final int getCount() {
        int size;
        C250973mM r2 = this.A00;
        if (r2 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 0);
            size = C250973mM.A00(userSession, r2).size();
        }
        C250973mM r0 = this.A00;
        UserSession userSession2 = this.A04;
        int i = 0;
        if (r0 != null) {
            Reel reel = r0.A0H;
            if (!reel.A0i() && !C14610TzH.A01(userSession2, reel) && !reel.A0g()) {
                i = 1;
            }
        }
        return size + i;
    }

    public final Object getItem(int i) {
        int size;
        C250973mM r1 = this.A00;
        if (r1 == null) {
            size = 0;
        } else {
            size = C13989Tnp.A0v(this.A04, r1).size();
        }
        if (i >= size) {
            return null;
        }
        C250973mM r12 = this.A00;
        r12.getClass();
        return C13989Tnp.A0v(this.A04, r12).get(i);
    }

    public final int getItemViewType(int i) {
        int size;
        C250973mM r2 = this.A00;
        if (r2 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A04;
            0qQ.A0B(userSession, 0);
            size = C250973mM.A00(userSession, r2).size();
        }
        if (i < size) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            int r0 = r11.getItemViewType(r12)
            if (r0 == 0) goto L_0x004a
            if (r13 != 0) goto L_0x0044
            com.instagram.common.session.UserSession r3 = r11.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322521242413288(0x810b24000028e8, double:3.0338469205310826E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            boolean r3 = r0.booleanValue()
            r2 = 0
            android.view.LayoutInflater r1 = X.DbV.A0D(r14)
            r0 = 2131627165(0x7f0e0c9d, float:1.8881587E38)
            if (r3 == 0) goto L_0x0026
            r0 = 2131627166(0x7f0e0c9e, float:1.8881589E38)
        L_0x0026:
            android.view.View r13 = r1.inflate(r0, r14, r2)
            r0 = r13
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.UpQ r3 = new X.UpQ
            r3.<init>(r0)
            int r2 = r11.A02
            int r1 = r11.A01
            android.widget.FrameLayout r0 = r3.A01
            X.C66580MXl.A1C(r0, r2)
            X.C66580MXl.A1B(r0, r1)
            A00(r3, r2, r1)
            r13.setTag(r3)
        L_0x0044:
            r0 = 11
            X.WB1.A00(r13, r11, r12, r0)
            return r13
        L_0x004a:
            r5 = 0
            if (r13 != 0) goto L_0x0074
            android.view.LayoutInflater r1 = X.DbV.A0D(r14)
            r0 = 2131627167(0x7f0e0c9f, float:1.888159E38)
            android.view.View r13 = r1.inflate(r0, r14, r5)
            r1 = r13
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            com.instagram.common.session.UserSession r0 = r11.A04
            X.UpR r3 = new X.UpR
            r3.<init>(r1, r0)
            int r2 = r11.A02
            int r1 = r11.A01
            android.widget.FrameLayout r0 = r3.A01
            X.C66580MXl.A1C(r0, r2)
            X.C66580MXl.A1B(r0, r1)
            A00(r3, r2, r1)
            r13.setTag(r3)
        L_0x0074:
            java.lang.Object r6 = X.DbT.A0o(r13)
            X.UpR r6 = (X.C16140UpR) r6
            java.lang.Object r7 = r11.getItem(r12)
            r7.getClass()
            X.3uh r7 = (X.C255773uh) r7
            r0 = 10
            X.WB1.A00(r13, r11, r12, r0)
            boolean r0 = r7.A16()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x011a
            int r0 = r11.A02
            com.instagram.common.typedurl.ImageUrl r3 = r7.A07(r0)
            if (r3 == 0) goto L_0x011a
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A02
            long r0 = r7.A02()
            r2.A05 = r0
            X.0iw r0 = r11.A03
            r2.setUrl(r3, r0)
        L_0x00a5:
            android.widget.TextView r2 = r6.A01
            int r0 = r7.A01()
            X.C13988Tno.A15(r2, r0)
            android.graphics.drawable.Drawable r0 = r6.A00
            r8 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            r1 = 2
            X.Tzv r0 = new X.Tzv
            r0.<init>(r1)
            r13.setOnTouchListener(r0)
            android.content.Context r4 = r14.getContext()
            X.4gK r0 = r7.A0d
            r3 = 4
            if (r0 == 0) goto L_0x00fb
            X.3Q2 r0 = r0.A00
            boolean r0 = r0.A0n()
            if (r0 != 0) goto L_0x00fb
            r0 = 2131239734(0x7f082336, float:1.8095783E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            android.widget.FrameLayout r1 = r6.A01
        L_0x00d7:
            r1.setForeground(r0)
            r2.setVisibility(r3)
        L_0x00dd:
            boolean r0 = r7.A0n()
            if (r0 == 0) goto L_0x00e6
            r2.setVisibility(r3)
        L_0x00e6:
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r1 != r0) goto L_0x0120
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A03
            android.graphics.drawable.LayerDrawable r0 = X.C346697vb.A00(r4)
            r1.setImageDrawable(r0)
            r1.setVisibility(r5)
            return r13
        L_0x00fb:
            boolean r0 = r7.A1H()
            android.widget.FrameLayout r1 = r6.A01
            if (r0 == 0) goto L_0x010b
            r0 = 2131239734(0x7f082336, float:1.8095783E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            goto L_0x00d7
        L_0x010b:
            r1.setForeground(r8)
            int r0 = r7.A01()
            int r0 = X.JTQ.A00(r0)
            r2.setVisibility(r0)
            goto L_0x00dd
        L_0x011a:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A02
            r0.A09()
            goto L_0x00a5
        L_0x0120:
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CUSTOM
            if (r1 != r0) goto L_0x0135
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A03
            X.0qQ.A0B(r4, r5)
            android.graphics.drawable.LayerDrawable r5 = X.C346697vb.A00(r4)
        L_0x0131:
            r3.setImageDrawable(r5)
            return r13
        L_0x0135:
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r1 != r0) goto L_0x0172
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A03
            X.0qQ.A0B(r4, r5)
            r0 = 2130970209(0x7f040661, float:1.7549122E38)
            int r0 = X.AnonymousClass7TF.A03(r4, r0)
            android.graphics.drawable.ShapeDrawable r2 = X.C346697vb.A05(r0)
            r1 = 2131238471(0x7f081e47, float:1.8093222E38)
            r0 = 2131100348(0x7f0602bc, float:1.7813075E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A06(r4, r1, r0)
            r6 = 1
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r2, r0}
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r5.<init>(r0)
            r0 = 16
            float r0 = X.0nA.A04(r4, r0)
            int r7 = X.AnonymousClass1GB.A01(r0)
            r8 = r7
            r9 = r7
            r10 = r7
            r5.setLayerInset(r6, r7, r8, r9, r10)
            goto L_0x0131
        L_0x0172:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14611TzI.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
