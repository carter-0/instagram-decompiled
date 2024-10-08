package X;

import java.security.SecureRandom;

/* renamed from: X.VdG  reason: case insensitive filesystem */
public final class C17747VdG {
    public final AnonymousClass59G A00(C16479UvZ uvZ, long j) {
        char c;
        long nextLong = new SecureRandom().nextLong();
        C16479UvZ uvZ2 = uvZ;
        if (uvZ2 instanceof C14962UHa) {
            c = 3;
        } else if (uvZ2 instanceof UHZ) {
            c = 20;
        } else if (uvZ2 instanceof UHY) {
            c = '@';
        } else {
            c = 8;
        }
        long j2 = (1 << c) - 1;
        long j3 = nextLong & j2;
        long nextLong2 = new SecureRandom().nextLong() & j2;
        long j4 = (j3 ^ nextLong2) ^ j;
        return new AnonymousClass59G(new C18750Vzl(uvZ2, j3, nextLong2), new C18750Vzl(uvZ2, nextLong2, j4), new C18750Vzl(uvZ2, j4, j3));
    }
}
