package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.UeE  reason: case insensitive filesystem */
public final class C15525UeE extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C17784Vfv A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15525UeE(AnonymousClass0iw r1, C17784Vfv vfv) {
        this.A00 = r1;
        this.A01 = vfv;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1374547160);
        0qQ.A0B(obj, 2);
        if (i == 0) {
            C17503VYh vYh = (C17503VYh) obj;
            AnonymousClass0iw r8 = this.A00;
            C17784Vfv vfv = this.A01;
            0qQ.A0B(vYh, 1);
            AnonymousClass7TF.A1C(r8, 2, vfv);
            Object tag = view.getTag();
            if (tag != null) {
                C17595Van van = (C17595Van) tag;
                ImageUrl imageUrl = vYh.A00;
                0qQ.A07(imageUrl);
                String str = vYh.A03;
                0qQ.A07(str);
                String str2 = null;
                String str3 = vYh.A01;
                van.A05.setUrl(imageUrl, r8);
                van.A03.setText(str);
                if (!(str3 == null || str3.length() == 0)) {
                    str2 = str3;
                }
                TextView textView = van.A02;
                int i2 = 8;
                if (str2 != null) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                textView.setText(str2);
                van.A00.setVisibility(8);
                van.A04.setVisibility(DbW.A00(vfv.A00(vYh) ? 1 : 0));
                View view2 = van.A01;
                float f = 0.3f;
                if (vfv.A00(vYh)) {
                    f = 1.0f;
                }
                view2.setAlpha(f);
                WBD.A00(view2, 64, vfv, vYh);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass0fD.A0A(1856122870, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 989717910);
        if (i == 0) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.brand_row_layout, false);
            A0A.setTag(new C17595Van(A0A));
            AnonymousClass0fD.A0A(1823356280, A04);
            return A0A;
        }
        IllegalStateException A0b = DbW.A0b("Unexpected view type: ", i);
        AnonymousClass0fD.A0A(-554187798, A04);
        throw A0b;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
