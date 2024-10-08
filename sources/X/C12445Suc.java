package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Suc  reason: case insensitive filesystem */
public final class C12445Suc implements C269114eb {
    public HashMap A00;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.Suc, java.lang.Object] */
    public static C12445Suc A00(C12445Suc suc, C12445Suc suc2) {
        HashMap hashMap;
        HashMap hashMap2;
        if (suc == null || (hashMap = suc.A00) == null || hashMap.isEmpty()) {
            return suc2;
        }
        if (suc2 == null || (hashMap2 = suc2.A00) == null || hashMap2.isEmpty()) {
            return suc;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0t = AnonymousClass7TF.A0t(hashMap2);
        while (A0t.hasNext()) {
            Annotation annotation = (Annotation) A0t.next();
            A1E.put(annotation.annotationType(), annotation);
        }
        Iterator A0t2 = AnonymousClass7TF.A0t(suc.A00);
        while (A0t2.hasNext()) {
            Annotation annotation2 = (Annotation) A0t2.next();
            A1E.put(annotation2.annotationType(), annotation2);
        }
        ? obj = new Object();
        obj.A00 = A1E;
        return obj;
    }

    public final Annotation AXK(Class cls) {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public final boolean CKL(Class[] clsArr) {
        if (this.A00 == null) {
            return false;
        }
        int i = 0;
        while (!this.A00.containsKey(clsArr[i])) {
            i++;
            if (i >= 8) {
                return false;
            }
        }
        return true;
    }

    public final int size() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public final String toString() {
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }
}
