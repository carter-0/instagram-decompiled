package X;

import android.util.Log;

/* renamed from: X.SdB  reason: case insensitive filesystem */
public final class C11608SdB implements 02U {
    public final 02U A00;
    public final C13542TcE A01;
    public final C13544TcG A02;

    public final Object A7A() {
        Object A7A = this.A00.A7A();
        if (A7A == null) {
            A7A = this.A01.ALD();
            Log.isLoggable("FactoryPools", 2);
        }
        if (A7A instanceof C13543TcF) {
            ((C13543TcF) A7A).CDi().A00 = false;
        }
        return A7A;
    }

    public final boolean ECR(Object obj) {
        if (obj instanceof C13543TcF) {
            ((C13543TcF) obj).CDi().A00 = true;
        }
        this.A02.EHt(obj);
        return this.A00.ECR(obj);
    }

    public C11608SdB(02U r1, C13542TcE tcE, C13544TcG tcG) {
        this.A00 = r1;
        this.A01 = tcE;
        this.A02 = tcG;
    }
}
