package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;

/* renamed from: X.KFv  reason: case insensitive filesystem */
public final class C61645KFv extends C232222tE {
    public View A00;
    public final Context A01;
    public final K8H A02;
    public final AnonymousClass0iw A03;
    public final boolean A04;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r32, X.C249703kE r33) {
        /*
            r31 = this;
            r6 = r33
            r7 = r32
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r7 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r7
            X.JpG r6 = (X.C60669JpG) r6
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r7, r6)
            r0 = r31
            android.content.Context r13 = r0.A01
            X.0iw r9 = r0.A03
            X.K8H r3 = r0.A02
            boolean r2 = r0.A04
            X.0qQ.A0B(r13, r5)
            int r10 = X.C51970G9q.A08(r4, r9, r3)
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0120
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x0120
            com.instagram.common.ui.base.IgTextView r1 = r6.A05
            r0 = 0
            r1.setTypeface(r0, r5)
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x002f:
            X.JTS.A0u(r13, r1, r0)
            java.lang.String r0 = r7.A02
            r1.setText(r0)
            r0 = 28
            X.LY8.A00(r1, r0, r3, r7)
            com.instagram.common.ui.base.IgTextView r11 = r6.A06
            android.content.res.Resources r8 = r13.getResources()
            r1 = 2131820564(0x7f110014, float:1.9273847E38)
            int r0 = r7.A00
            java.lang.String r0 = X.DbY.A0d(r8, r0, r1)
            r11.setText(r0)
            com.instagram.common.ui.base.IgLinearLayout r1 = r6.A01
            r0 = 29
            X.LY8.A00(r1, r0, r3, r7)
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x00e8
            java.util.List r8 = r7.A03
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00e8
            r0 = 84
            int r0 = X.DbS.A02(r13, r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r6.A02
            java.lang.String r23 = r9.getModuleName()
            java.lang.Integer r16 = X.AnonymousClass05K.A01
            r9 = 54
            float r12 = X.0nA.A04(r13, r9)
            float r9 = (float) r0
            float r12 = r12 / r9
            int r11 = X.DbS.A02(r13, r10)
            int r9 = X.2Yu.A02(r13)
            int r10 = r13.getColor(r9)
            java.lang.Float r15 = java.lang.Float.valueOf(r12)
            r9 = 2
            java.lang.Integer r17 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r10)
            r14 = 0
            r19 = r14
            r21 = r14
            r22 = r14
            r24 = r8
            r25 = r0
            r26 = r5
            r27 = r4
            r28 = r5
            r29 = r4
            r30 = r5
            X.3b0 r0 = X.C244283aw.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x00ad:
            r1.setImageDrawable(r0)
            r0 = 27
            X.LY8.A00(r1, r0, r3, r7)
            android.view.ViewGroup r1 = r6.A00
            r0 = 5
            X.LYA.A01(r1, r6, r3, r7, r0)
            if (r2 == 0) goto L_0x012e
            com.instagram.igds.components.checkbox.IgdsCheckBox r1 = r6.A07
            r1.setVisibility(r5)
            int r0 = X.2Yu.A0D(r13)
            android.graphics.drawable.StateListDrawable r0 = X.AnonymousClass3JT.A07(r13, r0)
            r1.setBackground(r0)
            boolean r0 = r7.A04
            r1.setChecked(r0)
            java.util.List r2 = r3.A0E
            if (r0 == 0) goto L_0x00dd
            r2.add(r7)
        L_0x00d9:
            X.K8H.A00(r3)
            return
        L_0x00dd:
            r1 = 12
            X.J6O r0 = new X.J6O
            r0.<init>(r7, r1)
            X.018.A1A(r2, r0)
            goto L_0x00d9
        L_0x00e8:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r6.A02
            android.graphics.drawable.shapes.OvalShape r0 = new android.graphics.drawable.shapes.OvalShape
            r0.<init>()
            android.graphics.drawable.ShapeDrawable r9 = new android.graphics.drawable.ShapeDrawable
            r9.<init>(r0)
            android.graphics.Paint r8 = r9.getPaint()
            r0 = -1
            r8.setColor(r0)
            X.AnonymousClass7TE.A1Q(r8)
            r8.setAntiAlias(r4)
            r0 = 2130970179(0x7f040643, float:1.754906E38)
            int r8 = X.2Yu.A0H(r13, r0)
            r4 = 2131231422(0x7f0802be, float:1.8078925E38)
            android.graphics.Paint r0 = X.AnonymousClass3JT.A00
            int r0 = r13.getColor(r8)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r13, r4, r0)
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[]{r9, r0}
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r4)
            goto L_0x00ad
        L_0x0120:
            com.instagram.common.ui.base.IgTextView r1 = r6.A05
            android.graphics.Typeface r0 = X.AnonymousClass7TG.A0N(r13)
            r1.setTypeface(r0)
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x002f
        L_0x012e:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A04
            r0.setVisibility(r5)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61645KFv.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return AudienceListViewModel.class;
    }

    public C61645KFv(Context context, K8H k8h, AnonymousClass0iw r3, boolean z) {
        this.A01 = context;
        this.A03 = r3;
        this.A02 = k8h;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_audience_list_row_item, false);
        this.A00 = A0D;
        return new C60669JpG(A0D);
    }
}
