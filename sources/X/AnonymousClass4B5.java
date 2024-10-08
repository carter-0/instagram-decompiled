package X;

import java.util.Comparator;

/* renamed from: X.4B5  reason: invalid class name */
public final class AnonymousClass4B5 implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        C254703su r10 = (C254703su) obj;
        C254703su r11 = (C254703su) obj2;
        long A0D = r10.A0D();
        if (r10.A1P != null) {
            j = r10.C7c();
        } else {
            j = 0;
        }
        long A0D2 = r11.A0D();
        if (r11.A1P != null) {
            j2 = r11.C7c();
        } else {
            j2 = 0;
        }
        if (A0D != A0D2) {
            return (A0D > A0D2 ? 1 : (A0D == A0D2 ? 0 : -1));
        }
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
