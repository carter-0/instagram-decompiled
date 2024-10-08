package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.EAc  reason: case insensitive filesystem */
public final class C47616EAc extends C231632rz {
    public final AnonymousClass0iw A00;
    public final 1Xj A01;
    public final C323316xI A02;
    public final User A03;
    public final boolean A04 = true;

    public C47616EAc(AnonymousClass0iw r2, 1Xj r3, C323316xI r4, User user) {
        this.A02 = r4;
        this.A03 = user;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r10 != null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r12, android.view.View r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r11 = this;
            r8 = r14
            r0 = -208388260(0xfffffffff3943f5c, float:-2.3490754E31)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.AnonymousClass7TG.A1O(r13, r14)
            java.lang.Object r0 = r13.getTag()
            boolean r0 = r0 instanceof X.C49502Ewh
            if (r0 == 0) goto L_0x0067
            java.lang.Object r3 = r13.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileLinkViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.Ewh r3 = (X.C49502Ewh) r3
            X.Drw r8 = (X.C47181Drw) r8
            com.instagram.user.model.User r9 = r11.A03
            X.6xI r10 = r11.A02
            X.0iw r6 = r11.A00
            X.1Xj r7 = r11.A01
            X.AnonymousClass7TG.A1N(r3, r8)
            r5 = 4
            X.0qQ.A0B(r6, r5)
            if (r9 == 0) goto L_0x00cc
            com.instagram.igds.components.textcell.IgdsListCell r4 = r3.A01
            java.lang.String r0 = r8.A03
            r4.A0I(r0)
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x0045
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0045
            r4.A0H(r1)
        L_0x0045:
            android.view.View r3 = r3.A00
            android.content.Context r1 = r3.getContext()
            int r0 = r8.A01
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x0056
            r4.A09(r0)
        L_0x0056:
            if (r10 == 0) goto L_0x0060
        L_0x0058:
            X.FOw r4 = new X.FOw
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass0fU.A00(r4, r3)
        L_0x0060:
            r0 = 1142640530(0x441b4f92, float:621.2433)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0067:
            java.lang.Object r0 = r13.getTag()
            boolean r0 = r0 instanceof X.C49637Ezu
            if (r0 == 0) goto L_0x0060
            java.lang.Object r4 = r13.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.profile.bindergroup.ProfileLinkViewBinder.MultipleLinkHolder"
            X.0qQ.A0C(r4, r0)
            X.Ezu r4 = (X.C49637Ezu) r4
            X.Drw r8 = (X.C47181Drw) r8
            com.instagram.user.model.User r9 = r11.A03
            X.6xI r10 = r11.A02
            X.0iw r6 = r11.A00
            X.1Xj r7 = r11.A01
            r5 = 0
            X.0qQ.A0B(r4, r5)
            r3 = 1
            X.AnonymousClass7TF.A1D(r8, r3, r6)
            if (r9 == 0) goto L_0x00d3
            android.widget.TextView r1 = r4.A04
            java.lang.String r0 = r8.A03
            r1.setText(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r3)
            r1.setTypeface(r0)
            java.lang.String r1 = r8.A05
            if (r1 == 0) goto L_0x00ae
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ae
            android.widget.TextView r0 = r4.A03
            r0.setText(r1)
            r0.setVisibility(r5)
        L_0x00ae:
            android.view.View r3 = r4.A00
            android.content.Context r1 = r3.getContext()
            int r0 = r8.A01
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            if (r1 == 0) goto L_0x00c1
            android.widget.ImageView r0 = r4.A01
            r0.setImageDrawable(r1)
        L_0x00c1:
            android.widget.ImageView r1 = r4.A02
            r0 = 8
            r1.setVisibility(r0)
            if (r10 == 0) goto L_0x0060
            r5 = 5
            goto L_0x0058
        L_0x00cc:
            java.lang.String r0 = "Cannot bind links options with a Null User."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00d3:
            java.lang.String r0 = "Cannot bind links options with a Null User."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47616EAc.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Object ewh;
        int A042 = DbX.A04(viewGroup, -1151578932);
        boolean z = this.A04;
        LayoutInflater A0D = DbV.A0D(viewGroup);
        int i2 = R.layout.layout_edit_link_row;
        if (!z) {
            i2 = R.layout.layout_profile_link_row;
        }
        View inflate = A0D.inflate(i2, viewGroup, false);
        if (z) {
            0qQ.A0A(inflate);
            ewh = new C49637Ezu(inflate);
        } else {
            0qQ.A0A(inflate);
            ewh = new C49502Ewh(inflate);
        }
        inflate.setTag(ewh);
        AnonymousClass0fD.A0A(-1989085833, A042);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
