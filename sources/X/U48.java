package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class U48 extends BaseAdapter {
    public int A00;
    public VZH A01;
    public final int A02 = R.layout.promote_title_body_bottom_sheet_view;
    public final UserSession A03;
    public final List A04;

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 2
            X.0qQ.A0B(r9, r0)
            r3 = 0
            if (r8 != 0) goto L_0x00fd
            android.view.LayoutInflater r1 = X.DbV.A0D(r9)
            int r0 = r6.A02
            android.view.View r1 = X.DbT.A0D(r1, r9, r0, r3)
            X.VZH r0 = new X.VZH
            r0.<init>(r1)
            r6.A01 = r0
            r1.setTag(r0)
        L_0x001b:
            java.util.List r0 = r6.A04
            java.lang.Object r2 = r0.get(r7)
            com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel r2 = (com.instagram.business.promote.viewmodel.PromoteBottomSheetSlideCardViewModel) r2
            java.lang.String r1 = r2.A07
            java.lang.String r5 = "viewHolder"
            if (r1 == 0) goto L_0x0032
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A04
            r0.setText(r1)
        L_0x0032:
            java.lang.CharSequence r1 = r2.A03
            r4 = 8
            X.VZH r0 = r6.A01
            if (r1 == 0) goto L_0x00f4
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A01
            r0.setText(r1)
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A01
            r0.setVisibility(r3)
        L_0x004a:
            java.lang.String r1 = r2.A04
            X.VZH r0 = r6.A01
            if (r1 == 0) goto L_0x00eb
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A02
            r0.setText(r1)
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r1 = r0.A02
            android.view.View$OnClickListener r0 = r2.A00
            X.AnonymousClass0fU.A00(r0, r1)
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A02
            r0.setVisibility(r3)
        L_0x006b:
            java.lang.String r1 = r2.A05
            X.VZH r0 = r6.A01
            if (r1 == 0) goto L_0x00e3
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A03
            r0.setText(r1)
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r1 = r0.A03
            android.view.View$OnClickListener r0 = r2.A01
            X.AnonymousClass0fU.A00(r0, r1)
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A03
            r0.setVisibility(r3)
        L_0x008c:
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x010c
            java.lang.String r0 = "education_reach_new_people"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cf
            com.instagram.common.session.UserSession r4 = r6.A03
            X.0qQ.A0B(r4, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00cf
            android.content.res.Resources r1 = X.DbU.A05(r9)
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            int r2 = r1.getDimensionPixelSize(r0)
            X.VZH r1 = r6.A01
            if (r1 == 0) goto L_0x010e
            android.widget.TextView r0 = r1.A01
            r0.setPadding(r3, r2, r3, r3)
            android.widget.TextView r0 = r1.A02
            r0.setPadding(r3, r2, r3, r3)
            android.widget.TextView r0 = r1.A03
            r0.setPadding(r3, r2, r3, r3)
        L_0x00c8:
            X.VZH r0 = r6.A01
            if (r0 == 0) goto L_0x010e
            android.view.View r0 = r0.A00
            return r0
        L_0x00cf:
            X.VZH r1 = r6.A01
            if (r1 == 0) goto L_0x010e
            android.widget.TextView r0 = r1.A01
            r0.setPadding(r3, r3, r3, r3)
            android.widget.TextView r0 = r1.A02
            r0.setPadding(r3, r3, r3, r3)
            android.widget.TextView r0 = r1.A03
            r0.setPadding(r3, r3, r3, r3)
            goto L_0x00c8
        L_0x00e3:
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A03
            r0.setVisibility(r4)
            goto L_0x008c
        L_0x00eb:
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A02
            r0.setVisibility(r4)
            goto L_0x006b
        L_0x00f4:
            if (r0 == 0) goto L_0x010e
            android.widget.TextView r0 = r0.A01
            r0.setVisibility(r4)
            goto L_0x004a
        L_0x00fd:
            java.lang.Object r1 = r8.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.business.promote.adapter.PromoteBottomSheetSlideCardPageAdapter.ViewHolder"
            X.0qQ.A0C(r1, r0)
            X.VZH r1 = (X.VZH) r1
            r6.A01 = r1
            goto L_0x001b
        L_0x010c:
            java.lang.String r5 = "promoteComponentValue"
        L_0x010e:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U48.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final int getCount() {
        return this.A04.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A04.get(i);
    }

    public U48(ViewGroup viewGroup, UserSession userSession, List list) {
        int i;
        this.A04 = list;
        this.A03 = userSession;
        DisplayMetrics displayMetrics = DbU.A05(viewGroup).getDisplayMetrics();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            View view = getView(i2, (View) null, viewGroup);
            if (view.requireViewById(R.id.placeholder).getVisibility() == 0) {
                this.A00 = -1;
                break;
            }
            C13990Tnq.A0u(view, displayMetrics.widthPixels, AnonymousClass972.MUTABLE_FLAG_MASK, 0);
            if (this.A00 < view.getMeasuredHeight()) {
                i = view.getMeasuredHeight();
            } else {
                i = this.A00;
            }
            this.A00 = i;
            i2++;
        }
        JTP.A14(viewGroup, -1, this.A00);
    }
}
