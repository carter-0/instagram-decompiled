package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.VjX  reason: case insensitive filesystem */
public final class C17995VjX {
    public C15009UJj A00;
    public C15010UJn A01;
    public VLN A02;
    public C17308VQn A03;
    public final C17655Vbl A04;

    public final VLN A00() {
        VLN vln = this.A02;
        if (vln != null) {
            return vln;
        }
        C15009UJj uJj = this.A00;
        if (uJj == null) {
            C17655Vbl vbl = this.A04;
            uJj = new C15009UJj(vbl.A00, vbl.A03, vbl.A05);
            this.A00 = uJj;
        }
        VLN vln2 = new VLN(uJj);
        this.A02 = vln2;
        return vln2;
    }

    public final C17308VQn A01() {
        C17308VQn vQn = this.A03;
        if (vQn != null) {
            return vQn;
        }
        C15010UJn uJn = this.A01;
        if (uJn == null) {
            uJn = null;
            try {
                Constructor<?> constructor = Class.forName("com.facebook.imagepipeline.memory.NativeMemoryChunkPool").getConstructor(new Class[]{AnonymousClass1Jg.class, C17405VUk.class, X9i.class});
                C17655Vbl vbl = this.A04;
                C15010UJn uJn2 = (C15010UJn) constructor.newInstance(new Object[]{vbl.A00, vbl.A02, vbl.A04});
                this.A01 = uJn2;
                uJn = uJn2;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                0I1.A05("PoolFactory", "", e);
                this.A01 = null;
            }
        }
        String A0O = 002.A0O("failed to get pool for chunk type: ", 0);
        if (uJn != null) {
            C17308VQn vQn2 = new C17308VQn(A00(), uJn);
            this.A03 = vQn2;
            return vQn2;
        }
        throw new NullPointerException(String.valueOf(A0O));
    }

    public C17995VjX(C17655Vbl vbl) {
        this.A04 = vbl;
    }
}
