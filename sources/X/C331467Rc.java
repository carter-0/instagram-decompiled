package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7Rc  reason: invalid class name and case insensitive filesystem */
public final class C331467Rc implements AnonymousClass7D2 {
    public final AnonymousClass7XR A00;
    public final AnonymousClass7VY A01;
    public final AnonymousClass7VZ A02;
    public final AnonymousClass7DZ A03;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_video_call_item, viewGroup, false);
        0qQ.A0A(inflate);
        C66828MdM mdM = new C66828MdM(inflate, this.A01, this.A02, (C333107Xr) this.A00);
        this.A03.A00(mdM);
        return mdM;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A03.A01(r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: android.widget.TextView} */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r9, X.AnonymousClass7FW r10) {
        /*
            r8 = this;
            X.MdM r9 = (X.C66828MdM) r9
            X.Mds r10 = (X.C66859Mds) r10
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r2 = 1
            X.0qQ.A0B(r10, r2)
            X.7FE r3 = r10.A03
            android.view.View r1 = r9.A02
            X.0eM r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x00b4
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r7 = 1
            X.C3265577g.A06(r0, r1, r3, r2)
            X.7L2 r5 = r3.A03
            int r6 = X.AnonymousClass7FB.A01(r5, r4)
            android.widget.TextView r1 = r9.A05
            java.lang.String r0 = r10.A08
            r1.setText(r0)
            r1.setTextColor(r6)
            java.lang.String r0 = r10.A07
            android.widget.TextView r1 = r9.A03
            if (r0 == 0) goto L_0x00ae
            r1.setText(r0)
            r1.setTextColor(r6)
            r1.setVisibility(r4)
        L_0x003d:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x005f
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x008b
            X.1QG r0 = X.1QE.A0E()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x008b
            com.instagram.igds.components.button.IgdsButton r3 = r9.A08
            java.lang.String r0 = r10.A05
            r3.setText((java.lang.String) r0)
            X.Ohr r0 = new X.Ohr
            r0.<init>(r9)
        L_0x0059:
            X.AnonymousClass0fU.A00(r0, r3)
            r3.setVisibility(r4)
        L_0x005f:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r9.A07
            android.graphics.drawable.Drawable r0 = r10.A01
            r1.setImageDrawable(r0)
            int r0 = r10.A00
            r1.setBackgroundColor(r0)
            X.7FU r0 = r10.A00
            X.7FR r0 = r0.BOV()
            boolean r0 = r0.A0X
            X.3NM r1 = r9.A06
            if (r0 == 0) goto L_0x0081
            r1.A01 = r2
        L_0x0079:
            r9.A00 = r10
            X.7DZ r0 = r8.A03
            r0.A02(r9, r10)
            return
        L_0x0081:
            java.lang.Integer r0 = r10.A04
            if (r0 != 0) goto L_0x0086
            r7 = 0
        L_0x0086:
            r0 = r7 ^ 1
            r1.A01 = r0
            goto L_0x0079
        L_0x008b:
            android.widget.TextView r3 = r9.A04
            java.lang.String r0 = r10.A05
            r3.setText(r0)
            r3.setTextColor(r6)
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r0 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x00a8
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x00a8
            X.7Kx r0 = r5.A04
            int r0 = r0.A0P
            r1.setColor(r0)
        L_0x00a8:
            X.Ohs r0 = new X.Ohs
            r0.<init>(r9)
            goto L_0x0059
        L_0x00ae:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x003d
        L_0x00b4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331467Rc.ADp(X.7Db, X.7FW):void");
    }

    public C331467Rc(AnonymousClass7XR r4, AnonymousClass7VY r5, AnonymousClass7VZ r6, AnonymousClass9HC r7) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
        List singletonList = Collections.singletonList(C3259074q.A00(new AnonymousClass7DX((AnonymousClass7XN) r4), new C331477Rd(), r4, r7));
        0qQ.A07(singletonList);
        this.A03 = new AnonymousClass7DZ(singletonList);
    }
}
