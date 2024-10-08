package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8vS  reason: invalid class name and case insensitive filesystem */
public class C369868vS extends C268694dq implements C41816B1w {
    public final C306386Ly A00;
    public final C306386Ly A01;
    public final int A02;
    public final UserSession A03;
    public final List A04;

    public C369868vS(Context context, UserSession userSession, CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(charSequence, 3);
        0qQ.A0B(charSequence2, 4);
        this.A03 = userSession;
        this.A02 = i3;
        C306386Ly r5 = new C306386Ly(context, i);
        this.A01 = r5;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        r5.A0K(alignment);
        r5.A0A((float) i2);
        r5.A0F(-1);
        C306386Ly r1 = new C306386Ly(context, i);
        this.A00 = r1;
        r1.A0K(alignment);
        r1.A0A((float) i4);
        r1.A0F(-1);
        this.A01.A0M(charSequence);
        this.A00.A0M(charSequence2);
        Collections.addAll(arrayList, new C306386Ly[]{r5, r1});
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A00.draw(canvas);
    }

    public final List A07() {
        return this.A04;
    }

    public final int BRc() {
        ArrayList arrayList = new ArrayList();
        Spannable spannable = this.A00.A0F;
        0qQ.A07(spannable);
        for (AnonymousClass91P add : (AnonymousClass91P[]) C263324Kh.A06(spannable, AnonymousClass91P.class)) {
            arrayList.add(add);
        }
        return arrayList.size();
    }

    public final List BRk() {
        ArrayList arrayList = new ArrayList();
        C306386Ly r3 = this.A00;
        Spannable spannable = r3.A0F;
        0qQ.A07(spannable);
        int length = ((AnonymousClass91P[]) C263324Kh.A06(spannable, AnonymousClass91P.class)).length;
        for (int i = 0; i < length; i++) {
            arrayList.add(r3.A0F.toString());
        }
        17i A002 = 17h.A00(this.A03);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = A002.A02.get(it.next());
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final int getIntrinsicHeight() {
        return this.A01.A06 + this.A02 + this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.A01.A0A, this.A00.A0A);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        C306386Ly r5 = this.A01;
        int i6 = r5.A0A / 2;
        r5.setBounds(i5 - i6, i2, i6 + i5, r5.A06 + i2);
        C306386Ly r4 = this.A00;
        int i7 = r4.A0A / 2;
        int i8 = r5.A06 + i2 + this.A02;
        r4.setBounds(i5 - i7, i8, i5 + i7, r4.A06 + i8);
    }
}
