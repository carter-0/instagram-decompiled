package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.util.List;
import java.util.Set;

public abstract class I4U {
    public static final int[] A0B = new int[2];
    public final C56500HzW A00;
    public final Integer A01;
    public final Object A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final ViewGroup A08;
    public final I4U A09;
    public final Set A0A;

    public I4U(ViewGroup viewGroup, I4U i4u, C56500HzW hzW, Integer num, Object obj) {
        this.A00 = hzW;
        this.A09 = i4u;
        this.A08 = viewGroup;
        this.A02 = obj;
        this.A01 = num;
        0eO r3 = 0eO.A02;
        this.A06 = AnonymousClass0eN.A00(r3, new TTN(this, 9));
        this.A04 = AnonymousClass0eN.A00(r3, new TTN(this, 7));
        this.A05 = AnonymousClass0eN.A00(r3, new TTN(this, 8));
        this.A07 = AnonymousClass0eN.A00(r3, new TTN(this, 10));
        this.A0A = C51967G9n.A0t(new String[]{"DecorView", "LinearLayout", "FrameLayout", "GenericDraweeView", C273654mx.A00(496), "Row", "Column", "Image", "Text", "LithoView", "LithoRecyclerView", "WrapComponent", "DebugComponent", "FbLinearLayout", "FbMeasureBlockingFrameLayout", "FbSwipeRefreshLayout", "TouchInterceptorFrameLayout", "BetterRecyclerView"}, 0);
    }

    public static final I4U A00(RFM rfm, I4U i4u) {
        if (rfm == i4u.A06.getValue()) {
            return i4u;
        }
        I4U A012 = i4u.A01();
        if (A012 != null) {
            return A00(rfm, A012);
        }
        return null;
    }

    public final I4U A01() {
        if (this instanceof C53225GkZ) {
            return ((C53225GkZ) this).A01;
        }
        return this.A09;
    }

    public final String A02() {
        String str;
        View view = (View) this.A02;
        String str2 = (String) view.getTag(R.id.view_tag_native_id);
        if (str2 != null) {
            return str2;
        }
        try {
            str = 002.A0E(DbU.A05(view).getResourceEntryName(view.getId()), '(', ')');
        } catch (Exception unused) {
            str = "";
        }
        return 002.A0R(C51968G9o.A16(view), str);
    }
}
