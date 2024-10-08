package X;

import android.util.LruCache;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7a4  reason: invalid class name */
public final class AnonymousClass7a4 extends AnonymousClass0T0 {
    public final LruCache A00;
    public final List A01;
    public final List A02;

    public AnonymousClass7a4() {
        this((LruCache) null, (List) null, (List) null, (DefaultConstructorMarker) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7a4) {
                AnonymousClass7a4 r5 = (AnonymousClass7a4) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public /* synthetic */ AnonymousClass7a4(LruCache lruCache, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LruCache lruCache2 = new LruCache(100);
        this.A02 = arrayList;
        this.A01 = arrayList2;
        this.A00 = lruCache2;
    }

    public final List A00() {
        List<N4G> list = this.A02;
        if (!list.isEmpty()) {
            try {
                ArrayList arrayList = new ArrayList();
                for (N4G n4g : list) {
                    StringWriter stringWriter = new StringWriter();
                    17W A0K = AnonymousClass7TF.A0K(stringWriter);
                    A0K.A0P(AnonymousClass000.A00(69), n4g.A00);
                    String str = n4g.A01;
                    if (str != null) {
                        A0K.A0R(AnonymousClass000.A00(704), str);
                    }
                    A0K.A0Z();
                    A0K.close();
                    arrayList.add(stringWriter.toString());
                }
                return arrayList;
            } catch (IOException unused) {
                0wb.A01.Ew0(AnonymousClass000.A00(885), AnonymousClass000.A00(2277));
            }
        }
        return 0sn.A00;
    }

    public final void A01(String str) {
        C381459bn r0 = (C381459bn) this.A00.get(str);
        List list = this.A02;
        int i = r0.A00;
        String str2 = r0.A01;
        list.add(new N4G(i, str2, 3));
        List list2 = this.A01;
        0qQ.A0B(str2, 2);
        list2.add(new BE2(str2, i, false));
    }
}
