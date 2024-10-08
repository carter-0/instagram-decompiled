package X;

/* renamed from: X.A0d  reason: case insensitive filesystem */
public abstract class C39561A0d {
    public static final AnonymousClass40G A00(C2604745u r5, String str) {
        float f = r5.A00.getFloat(002.A0T(C273654mx.A00(1334), str, '_'), -1.0f);
        if (f == -1.0f) {
            return new AnonymousClass40G(Float.valueOf(f), "dwell time not found in shared prefs", false);
        }
        return new AnonymousClass40G(Float.valueOf(f), (String) null, true);
    }
}
