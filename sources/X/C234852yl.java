package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2yl  reason: invalid class name and case insensitive filesystem */
public final class C234852yl implements C250603lj {
    public final Rect A00;
    public final Rect A01;
    public final UserSession A02;
    public final C234842yk A03;
    public final C234832yj A04;
    public final List A05;
    public final boolean A06;
    public final Map A07;

    public C234852yl(UserSession userSession, C234842yk r4, C234832yj r5) {
        this();
        this.A05 = new ArrayList();
        this.A00 = new Rect();
        this.A01 = new Rect();
        this.A02 = userSession;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = true;
    }

    private void A00(Object obj, Object obj2, String str, double d, double d2, int i, long j) {
        Object obj3 = obj;
        long j2 = j;
        Object obj4 = obj2;
        1Xj r3 = (1Xj) obj3;
        String A0F = C231122qu.A0F(this.A02, r3);
        A0F.getClass();
        int i2 = i;
        String str2 = str;
        String A0u = 002.A0u(Integer.toHexString(A0F.hashCode()), r3.getId(), str2, Integer.toString(i2));
        if (d2 < d) {
            Map map = this.A07;
            if (!map.containsKey(A0u)) {
                map.put(A0u, new C2817259e(this, obj3, j2, ((AnonymousClass3W1) obj4).A0o()));
                return;
            }
        }
        if (d2 >= d) {
            Map map2 = this.A07;
            if (map2.containsKey(A0u)) {
                C2817259e r6 = (C2817259e) map2.get(A0u);
                boolean z = r6.A02;
                C234842yk r10 = this.A03;
                C232852uY r8 = r10.A01;
                AnonymousClass4DU r9 = r10.A02;
                UserSession userSession = r8.A00;
                C254523sc A042 = C254513sb.A04(r3, r9, "viewability");
                A042.A0G(userSession, r3);
                A042.A01 = ((double) (j - r6.A00)) / 1000.0d;
                A042.A7R = str2;
                A042.A0U = i2;
                A042.A1Y = Boolean.valueOf(z);
                C232862uZ.A01(A042);
                C233822wX.A0I(r10.A00, A042, r9, AnonymousClass05K.A01);
                map2.remove(A0u);
            }
        }
    }

    public final void ATF(AnonymousClass30Y r33, C252093oY r34) {
        int i;
        int i2;
        C252093oY r1 = r34;
        long BlK = r1.BlK();
        AnonymousClass30Y r2 = r33;
        Object obj = r2.A03;
        1Xj r4 = (1Xj) obj;
        Object obj2 = r2.A04;
        AnonymousClass3W1 r11 = (AnonymousClass3W1) obj2;
        Rect rect = this.A00;
        r1.B9a(rect, r2);
        float height = (float) rect.height();
        C234832yj r7 = this.A04;
        HashMap hashMap = r7.A0D;
        Number number = (Number) hashMap.get(r4.getId());
        if (number == null) {
            Context context = r7.A08;
            UserSession userSession = r7.A09;
            AnonymousClass4DU r5 = r7.A0A;
            Context context2 = context;
            AnonymousClass3YW r20 = new AnonymousClass3YW(context2, userSession, r4, r11, r5.getModuleName(), true);
            int A0l = r7.A06 + ((int) (r7.A01 / r4.A0l()));
            if (1sx.A0Q(r4, r11.A03)) {
                i = r7.A03;
            } else {
                i = 0;
            }
            int i3 = A0l + i + r7.A07;
            1Xj r15 = r4;
            if (1sx.A0L(r4, r11.A03)) {
                if (r4.A5D()) {
                    r15 = r4.A1c(r11.A03);
                }
                0Pl r13 = r7.A0C;
                r15.getClass();
                C247733gp A1U = r15.A1U();
                A1U.getClass();
                i2 = r13.A0B(context, A1U, 2Yu.A0F(context, R.attr.textColorBoldLink)).getHeight();
            } else {
                i2 = 0;
            }
            int i4 = i3 + i2;
            int i5 = 0;
            if (r20.A03) {
                0Pl r16 = r7.A0C;
                C247733gp A002 = r20.A00();
                int i6 = r20.A04;
                Layout A0C = r16.A0C(context2, A002, r7.A0B, i6, false, false, false, 1sx.A0I(r20.A00(), 0));
                C234832yj.A00(A0C, r7);
                i5 = A0C.getHeight() + r7.A05;
            }
            int i7 = i4 + i5;
            int i8 = 0;
            if (r20.A07) {
                for (C247733gp A0C2 : Collections.unmodifiableList(r20.A02)) {
                    0Pl r152 = r7.A0C;
                    int i9 = r20.A04;
                    Layout A0C3 = r152.A0C(context2, A0C2, r7.A0B, i9, false, false, false, false);
                    C234832yj.A00(A0C3, r7);
                    i8 += A0C3.getHeight() + r7.A05;
                }
            }
            int i10 = i7 + i8;
            int i11 = 0;
            if (r20.A08) {
                int i12 = r7.A00;
                if (i12 == 0) {
                    i12 = r7.A02;
                }
                i11 = r7.A05 + i12;
            }
            int i13 = i10 + i11;
            int i14 = 0;
            if ((r4.A0C.CEg() != null && r4.A0C.CEg().intValue() > 0) || r4.A0v() > 0) {
                int i15 = r7.A00;
                if (i15 == 0) {
                    i15 = r7.A02;
                }
                i14 = i15 + r7.A05;
            }
            int i16 = i13 + i14 + r7.A04;
            if (r7.A0E) {
                C254523sc A012 = C233822wX.A01((C270594gz) null, r4, r5, "viewability_test");
                A012.A0L = i16;
                C233822wX.A0H(userSession, A012, r5);
            }
            number = Integer.valueOf(i16);
            hashMap.put(r4.getId(), number);
        }
        float intValue = (float) number.intValue();
        float f = height / intValue;
        if (this.A06) {
            List<Rect> list = this.A05;
            r1.B9b(r2, list);
            Rect rect2 = this.A01;
            r1.CFR(rect2);
            float f2 = 0.0f;
            for (Rect rect3 : list) {
                f2 += (float) (rect3.width() * rect3.height());
            }
            f = f2 / (((float) rect2.width()) * intValue);
        }
        Object obj3 = obj;
        Object obj4 = obj2;
        double d = (double) f;
        A00(obj3, obj4, "feed_unit", d, 0.0d, 0, BlK);
        if (C231122qu.A0U(this.A02, r4)) {
            A00(obj3, obj4, "feed_unit", d, 0.5d, 50, BlK);
            A00(obj3, obj4, "feed_unit", d, 0.99d, 100, BlK);
            r1.B9a(rect, r2);
            float height2 = (float) rect.height();
            Rect rect4 = this.A01;
            r1.CFR(rect4);
            double height3 = (double) (height2 / ((float) rect4.height()));
            A00(obj3, obj4, "viewport", height3, 0.5d, 50, BlK);
            A00(obj3, obj4, "viewport", height3, 0.99d, 100, BlK);
        }
    }

    public C234852yl() {
        this.A07 = new HashMap();
    }
}
