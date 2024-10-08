package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.AcF  reason: case insensitive filesystem */
public final class C40444AcF implements B1U {
    public AnonymousClass1MK A00;
    public final 1NK A01;

    public final void BNe(C317966o8 r14, C62320sa r15, 0sP r16) {
        C62320sa r12 = r15;
        0qQ.A0B(r15, 2);
        C317966o8 r10 = r14;
        ImmutableList A02 = r14.A02();
        int i = 0;
        if (A02 == null || A02.isEmpty()) {
            r15.invoke();
        }
        this.A00 = new C40254AXs(1, new TreeMap(), this, r10, r16, r12);
        ImmutableList A022 = r14.A02();
        if (A022 != null) {
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                1OO A0J = this.A01.A0J(new SimpleImageUrl(((C39638A3c) next).A00), (String) null);
                A0J.A08 = Integer.valueOf(i);
                A0J.A02(this.A00);
                A0J.A01();
                i = i2;
            }
        }
    }

    public /* synthetic */ C40444AcF(1NK r3, DefaultConstructorMarker defaultConstructorMarker, int i) {
        1NK A002 = 1NK.A00();
        0qQ.A0B(A002, 1);
        this.A01 = A002;
    }

    public C40444AcF() {
        1NK A002 = 1NK.A00();
        0qQ.A0B(A002, 1);
        this.A01 = A002;
    }
}
