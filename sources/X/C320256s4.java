package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* renamed from: X.6s4  reason: invalid class name and case insensitive filesystem */
public final class C320256s4 {
    public int A00;
    public boolean A01;
    public final int A02;
    public final View A03;
    public final AnonymousClass0iw A04;
    public final C359098c0 A05;
    public final int A06;
    public final FrameLayout A07;
    public final FrameLayout A08;
    public final FrameLayout A09;
    public final C71392co A0A = C71392co.A04(70.0d, 6.0d);
    public final C54320H7p A0B;
    public final C54320H7p A0C;
    public final C54320H7p A0D;

    public C320256s4(View.OnClickListener onClickListener, View view, AnonymousClass0iw r14, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A04 = r14;
        this.A03 = view;
        this.A05 = C359088bz.A00(userSession);
        Context context = view.getContext();
        0qQ.A07(context);
        int A012 = (int) (((float) AnonymousClass0nB.A01(context)) * 0.3f);
        this.A02 = A012;
        this.A06 = (int) (((float) A012) * 0.5f);
        View requireViewById = view.requireViewById(R.id.first_image);
        0qQ.A07(requireViewById);
        FrameLayout frameLayout = (FrameLayout) requireViewById;
        this.A07 = frameLayout;
        View requireViewById2 = view.requireViewById(R.id.second_image);
        0qQ.A07(requireViewById2);
        FrameLayout frameLayout2 = (FrameLayout) requireViewById2;
        this.A08 = frameLayout2;
        View requireViewById3 = view.requireViewById(R.id.third_image);
        0qQ.A07(requireViewById3);
        FrameLayout frameLayout3 = (FrameLayout) requireViewById3;
        this.A09 = frameLayout3;
        C54320H7p h7p = new C54320H7p(context, A012);
        this.A0B = h7p;
        C54320H7p h7p2 = new C54320H7p(context, A012);
        this.A0C = h7p2;
        C54320H7p h7p3 = new C54320H7p(context, A012);
        this.A0D = h7p3;
        A01(frameLayout, h7p, 0);
        A01(frameLayout2, h7p2, 1);
        A01(frameLayout3, h7p3, 2);
        AnonymousClass0fU.A00(onClickListener, view);
    }

    public final void A02(L51 l51) {
        0qQ.A0B(l51, 0);
        List list = l51.A01;
        this.A00 = l51.A00;
        boolean z = !list.isEmpty();
        View view = this.A03;
        if (z) {
            boolean z2 = false;
            if (view.getVisibility() == 0) {
                z2 = true;
            }
            view.setVisibility(0);
            0nA.A0f(view, this.A06);
            A00(this.A07, this.A0B, list, 0);
            A00(this.A08, this.A0C, list, 1);
            A00(this.A09, this.A0D, list, 2);
            this.A01 = true;
            if (!z2) {
                this.A05.A03(this.A00);
                return;
            }
            return;
        }
        view.setVisibility(8);
        this.A01 = false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.H7p, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.widget.FrameLayout r4, X.C54320H7p r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.A02
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r4.setPivotX(r1)
            r4.setPivotY(r1)
            int r2 = r6 % 2
            float r1 = (float) r6
            r0 = 1090519040(0x41000000, float:8.0)
            if (r2 != 0) goto L_0x0018
            int r0 = r6 + 1
            float r1 = (float) r0
            r0 = -1056964608(0xffffffffc1000000, float:-8.0)
        L_0x0018:
            float r1 = r1 * r0
            r4.setRotation(r1)
            r4.removeAllViews()
            r4.addView(r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r0)
            int r0 = r5.A00
            X.0nA.A0f(r5, r0)
            X.0nA.A0V(r5, r0)
            X.I7E.A06(r5, r0)
            android.content.Context r1 = r5.getContext()
            r0 = 2131099948(0x7f06012c, float:1.7812264E38)
            int r0 = r1.getColor(r0)
            r5.setBackgroundColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320256s4.A01(android.widget.FrameLayout, X.H7p, int):void");
    }

    public final void A03(boolean z) {
        int i;
        int i2;
        if (this.A01) {
            if (z) {
                i = this.A06;
                i2 = 0;
            } else {
                i = 0;
                i2 = 8;
            }
            View view = this.A03;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0G();
            A012.A0R((float) view.getWidth(), (float) i);
            A012.A04 = 0;
            A012.A03 = i2;
            A012.A0F(!z).A0E(this.A0A).A0H();
            if (z) {
                this.A05.A03(this.A00);
            }
        }
    }

    private final void A00(View view, IgImageView igImageView, List list, int i) {
        if (i < list.size()) {
            view.setVisibility(0);
            ExtendedImageUrl A1m = ((1Xj) list.get(i)).A1m(this.A02);
            if (A1m != null) {
                igImageView.setUrl(A1m, this.A04);
            } else {
                igImageView.A09();
            }
        } else {
            view.setVisibility(8);
        }
    }
}
