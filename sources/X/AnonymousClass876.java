package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.876  reason: invalid class name */
public final class AnonymousClass876 extends BaseAdapter implements AnonymousClass877 {
    public int A00;
    public int A01;
    public C342277oK A02;
    public C3508686r A03;
    public AnonymousClass8DT A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final List A08 = new ArrayList();
    public final FrameLayout.LayoutParams A09;
    public final AnonymousClass0iw A0A;
    public final UserSession A0B;
    public final AnonymousClass874 A0C;
    public final AnonymousClass878 A0D;
    public final Map A0E;

    public AnonymousClass876(Context context, AnonymousClass0iw r4, UserSession userSession, AnonymousClass874 r6) {
        0qQ.A0B(userSession, 4);
        this.A0A = r4;
        this.A0C = r6;
        this.A0B = userSession;
        this.A0D = new AnonymousClass878(context, userSession, "DialAdapter");
        this.A0E = new HashMap();
        this.A01 = -1;
        this.A00 = -1;
        int A002 = AnonymousClass879.A00(context);
        this.A09 = new FrameLayout.LayoutParams(A002, A002);
    }

    public final void A03(int i) {
        A05((String) null, i, false, false, false);
    }

    public final void A06(List list) {
        0qQ.A0B(list, 0);
        for (Object obj : list) {
            if (obj == null) {
                throw new RuntimeException("dial element is null");
            }
        }
        List list2 = this.A08;
        list2.clear();
        list2.addAll(list);
        int i = this.A01;
        if (i < 0) {
            i = 0;
        }
        this.A01 = i;
        int i2 = this.A00;
        if (i2 < 0) {
            i2 = 0;
        }
        this.A00 = i2;
        0fE.A00(this, 2126952210);
    }

    public final void DBg(AnonymousClass87G r9, int i) {
        int i2 = i;
        boolean z = false;
        if (Math.abs(this.A01 - i) == 2) {
            z = true;
        }
        A05((String) null, i2, true, true, z);
    }

    public final int A00(String str) {
        int i = 0;
        for (Object next : this.A08) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            } else if (0qQ.A0K(((AnonymousClass87G) next).getId(), str)) {
                return i;
            } else {
                i = i2;
            }
        }
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final AnonymousClass87G A01() {
        if (A07(this.A01)) {
            return (AnonymousClass87G) this.A08.get(this.A01);
        }
        return null;
    }

    public final void A04(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            AnonymousClass87G A022 = A02(i);
            if (A022 == null) {
                0kD.A0I("DialAdapter", new NullPointerException(002.A0O("Dial element is null at mPagedToPosition: ", this.A00)), 0Yt.A0E());
                return;
            }
            this.A0C.DMG(A022, i);
            C3508686r r0 = this.A03;
            if (r0 != null) {
                r0.DMG(A022, i);
            } else {
                0kD.A0I("DialAdapter", new NullPointerException(002.A0O("DialElementSelectedListener is null at position: ", i)), 0Yt.A0E());
            }
        }
    }

    public final void A05(String str, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (z || i != this.A01) {
            int i2 = this.A01;
            this.A01 = i;
            if (A07(i2)) {
                this.A0C.DBk(A02(i2), i2, z2);
                z4 = true;
            } else {
                z4 = false;
            }
            if (A07(i)) {
                if (!z3 || !z) {
                    A04(i);
                }
                AnonymousClass87G A022 = A02(i);
                this.A0C.DBi(A022, str, i, z2);
                C3508686r r0 = this.A03;
                if (r0 != null) {
                    r0.DBi(A022, str, i, false);
                } else {
                    0kD.A0I("DialAdapter", new NullPointerException(002.A0O("DialElementSelectedListener is null at position: ", i)), 0Yt.A0E());
                }
            } else {
                0kD.A0I("DialAdapter", new NullPointerException(002.A0O("New selected mPosition is invalid newPosition=", i)), 0Yt.A0E());
                if (!z4) {
                    return;
                }
            }
            0fE.A00(this, -1118398906);
        }
    }

    public final boolean A07(int i) {
        if (i < 0 || i >= this.A08.size()) {
            return false;
        }
        return true;
    }

    public final int getCount() {
        return this.A08.size();
    }

    public final Object getItem(int i) {
        return this.A08.get(i);
    }

    public final long getItemId(int i) {
        String id = ((AnonymousClass87G) this.A08.get(i)).getId();
        0qQ.A07(id);
        Map map = this.A0E;
        Number number = (Number) map.get(id);
        if (number == null) {
            number = Long.valueOf((long) map.size());
            map.put(id, number);
        }
        return number.longValue();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 2);
        if (view == null) {
            AnonymousClass874 r4 = this.A0C;
            C342277oK r3 = this.A02;
            view2 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.dial_effect_picker_element, viewGroup2, false);
            0qQ.A0A(view2);
            view2.setTag(new C370978xN(view2, r3, r4));
            view2.setLayoutParams(this.A09);
        }
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.dial.DialElementViewHolder");
        int i2 = i;
        Object item = getItem(i2);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.camera.effect.models.DialElement");
        AnonymousClass878 r32 = this.A0D;
        r32.A01((AnonymousClass87G) item, this.A0A, this, (C370978xN) tag, this.A04, i2, this.A01, this.A06, this.A05, false, this.A07);
        return view2;
    }

    public final AnonymousClass87G A02(int i) {
        if (A07(i)) {
            return (AnonymousClass87G) this.A08.get(i);
        }
        return null;
    }
}
