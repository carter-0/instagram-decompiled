package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* renamed from: X.AVr  reason: case insensitive filesystem */
public final class C40201AVr implements C13781Tgw {
    public EGLContext A00 = null;
    public Object A01 = null;
    public AnonymousClass9Tu A02;
    public final C393179w1 A03;
    public final AGo A04;

    public final boolean CK7() {
        return true;
    }

    public final C13861Tih ALL(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C344557s3 r16, C345557ti r17, C7232Q0d q0d, C11354SOn sOn, MediaComposition mediaComposition, C7334Q4k q4k, Integer num) {
        MediaComposition mediaComposition2 = mediaComposition;
        mediaComposition2.getClass();
        Context context2 = context;
        EGLContext eGLContext2 = eGLContext;
        C344557s3 r4 = r16;
        C345557ti r5 = r17;
        C11354SOn sOn2 = sOn;
        AnonymousClass9Tu r1 = new AnonymousClass9Tu(context2, eGLContext2, r4, r5, sOn2, mediaComposition2, this.A04, q4k, this.A01);
        this.A02 = r1;
        if (this.A03 != null) {
            r1.A0G.BQ8();
        }
        return this.A02;
    }

    public final EGLContext BtT() {
        return this.A00;
    }

    public C40201AVr(C393179w1 r2, AGo aGo) {
        this.A04 = aGo;
        this.A03 = r2;
    }

    public C40201AVr(AGo aGo) {
        this.A04 = aGo;
        this.A03 = null;
    }
}
