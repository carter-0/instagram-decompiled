package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Iterator;

/* renamed from: X.Ue3  reason: case insensitive filesystem */
public final class C15514Ue3 extends C231632rz {
    public final C15390Ubt A00;

    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r1 <= 0) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r18, android.view.View r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            r17 = this;
            r3 = r19
            r4 = r21
            r13 = r20
            r0 = 424270885(0x1949dc25, float:1.0435914E-23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r9 = 1
            int r8 = X.DbW.A02(r9, r3, r13)
            r1 = r18
            if (r18 == 0) goto L_0x013c
            if (r1 == r9) goto L_0x0132
            r5 = r17
            if (r1 == r8) goto L_0x005a
            r0 = 3
            if (r1 != r0) goto L_0x0152
            X.WWJ r13 = (X.WWJ) r13
            X.Ubt r7 = r5.A00
            X.0qQ.A0B(r13, r9)
            X.0qQ.A0B(r7, r8)
            java.lang.Object r6 = r3.getTag()
            if (r6 == 0) goto L_0x014d
            X.VTV r6 = (X.VTV) r6
            java.lang.Integer r5 = r13.A00
            X.0qQ.A07(r5)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A01
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r5 != r4) goto L_0x0057
            X.3uy r0 = X.C255943uy.LOADING
        L_0x003e:
            r1.setLoadingStatus(r0)
            android.widget.TextView r1 = r6.A00
            r0 = 0
            if (r5 != r4) goto L_0x0048
            r0 = 8
        L_0x0048:
            r1.setVisibility(r0)
            r0 = 65
            X.WBD.A00(r3, r0, r13, r7)
        L_0x0050:
            r0 = -70763(0xfffffffffffeeb95, float:NaN)
        L_0x0053:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0057:
            X.3uy r0 = X.C255943uy.SUCCESS
            goto L_0x003e
        L_0x005a:
            if (r21 == 0) goto L_0x0167
            X.V3W r4 = (X.V3W) r4
            X.VTT r13 = (X.VTT) r13
            X.Ubt r1 = r5.A00
            java.lang.String r0 = r4.A01
            r16 = r0
            java.lang.String r11 = r4.A00
            r7 = 0
            X.0qQ.A0B(r13, r9)
            X.0qQ.A0B(r1, r8)
            X.VWp r12 = r13.A00
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L_0x0162
            X.VbV r3 = (X.C17639VbV) r3
            android.widget.ImageView r6 = r3.A02
            java.lang.Integer r4 = r13.A01
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r0 = 2131238009(0x7f081c79, float:1.8092285E38)
            if (r4 != r10) goto L_0x0087
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
        L_0x0087:
            r6.setImageResource(r0)
            android.widget.TextView r5 = r3.A04
            java.lang.String r0 = r12.A02
            r5.setText(r0)
            java.lang.Integer r0 = r12.A00
            int r15 = X.AnonymousClass7TG.A0A(r0)
            android.widget.TextView r14 = r3.A05
            android.content.res.Resources r4 = r14.getResources()
            r0 = 2131820863(0x7f11013f, float:1.9274453E38)
            java.lang.String r0 = X.DbY.A0d(r4, r15, r0)
            r14.setText(r0)
            android.view.View r4 = r3.A00
            r0 = 59
            X.WB4.A00(r4, r12, r1, r13, r0)
            java.lang.Integer r0 = r12.A00
            if (r0 == 0) goto L_0x00b9
            int r1 = r0.intValue()
            r0 = 1
            if (r1 > 0) goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            boolean r0 = X.C66581MXm.A1a(r0)
            if (r0 != 0) goto L_0x0118
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
        L_0x00c2:
            android.content.Context r1 = r4.getContext()
            int r0 = X.C51968G9o.A04(r1)
            int r12 = X.DbV.A01(r1)
            r6.setColorFilter(r0)
            r5.setTextColor(r0)
            X.3oV r11 = r3.A06
            r0 = 8
            r11.setVisibility(r0)
            android.widget.ImageView r4 = r3.A03
            r4.setVisibility(r0)
            android.widget.CheckBox r3 = r3.A01
            r3.setVisibility(r0)
            int r1 = r13.intValue()
            r0 = 1
            if (r1 == r8) goto L_0x010b
            if (r1 == r7) goto L_0x0101
            if (r1 == r9) goto L_0x0101
            r0 = 3
            if (r1 != r0) goto L_0x015c
            r4.setVisibility(r7)
            r6.setColorFilter(r12)
            r5.setTextColor(r12)
        L_0x00fc:
            r0 = -190909288(0xfffffffff49ef498, float:-1.0074998E32)
            goto L_0x0053
        L_0x0101:
            if (r13 == r10) goto L_0x0104
            r0 = 0
        L_0x0104:
            r3.setChecked(r0)
            r3.setVisibility(r7)
            goto L_0x00fc
        L_0x010b:
            r11.setVisibility(r7)
            android.view.View r0 = r11.getView()
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = (com.instagram.ui.widget.spinner.SpinnerImageView) r0
            X.DbS.A1T(r0)
            goto L_0x00fc
        L_0x0118:
            java.lang.String r1 = r12.A01
            r0 = r16
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0124
            r13 = r10
            goto L_0x00c2
        L_0x0124:
            java.lang.String r0 = r12.A01
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x012f
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            goto L_0x00c2
        L_0x012f:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x00c2
        L_0x0132:
            r0 = 2131969836(0x7f13472c, float:1.9576606E38)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r0)
            goto L_0x0050
        L_0x013c:
            java.lang.String r13 = (java.lang.String) r13
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r13)
            X.U2z r0 = new X.U2z
            r0.<init>()
            r3.setAccessibilityDelegate(r0)
            goto L_0x0050
        L_0x014d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0152:
            java.lang.String r0 = "Unexpected view type: "
            java.lang.IllegalStateException r1 = X.DbW.A0b(r0, r1)
            r0 = 2101297758(0x7d3f425e, float:1.5889197E37)
            goto L_0x016e
        L_0x015c:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0162:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0167:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -219259500(0xfffffffff2ee5d94, float:-9.442632E30)
        L_0x016e:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15514Ue3.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        WWJ wwj = (WWJ) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r6, wwj);
        0qQ.A0B(obj2, 2);
        r6.A7V(0, wwj.A03, (Object) null);
        if (C13988Tno.A1a(wwj.A04)) {
            r6.A7U(A1U ? 1 : 0);
        } else {
            Iterator A0h = JTQ.A0h(wwj.A04);
            while (A0h.hasNext()) {
                C17462VWp vWp = (C17462VWp) A0h.next();
                0qQ.A0A(vWp);
                Integer num = wwj.A01;
                0qQ.A07(num);
                r6.A7V(2, new VTT(vWp, num), obj2);
            }
        }
        if (wwj.A05) {
            r6.A7U(3);
        }
    }

    public C15514Ue3(C15390Ubt ubt) {
        this.A00 = ubt;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        boolean z;
        LayoutInflater layoutInflater;
        int i2;
        View A0D;
        Object vbV;
        int A03 = AnonymousClass0fD.A03(-1985342992);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            z = false;
            layoutInflater = DbV.A0D(viewGroup);
            i2 = R.layout.catalog_section_title_layout;
            A0D = DbT.A0D(layoutInflater, viewGroup, i2, z);
        } else if (i != 1) {
            if (i == 2) {
                A0D = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.catalog_row_layout, false);
                vbV = new C17639VbV(A0D);
            } else if (i == 3) {
                A0D = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.product_source_load_more, false);
                vbV = new VTV(A0D);
            } else {
                IllegalStateException A0b = DbW.A0b("Unexpected view type: ", i);
                AnonymousClass0fD.A0A(-1036550754, A03);
                throw A0b;
            }
            A0D.setTag(vbV);
        } else {
            z = false;
            layoutInflater = DbV.A0D(viewGroup);
            i2 = R.layout.catalog_text_layout;
            A0D = DbT.A0D(layoutInflater, viewGroup, i2, z);
        }
        AnonymousClass0fD.A0A(212247825, A03);
        return A0D;
    }
}
