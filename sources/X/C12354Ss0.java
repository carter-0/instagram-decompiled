package X;

import android.content.Context;
import android.graphics.Point;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;

/* renamed from: X.Ss0  reason: case insensitive filesystem */
public final class C12354Ss0 implements C13781Tgw {
    public Point A00;
    public final UserSession A01;
    public final AnonymousClass3Q2 A02;
    public final C10497RtC A03;
    public final C14279TtC A04;

    public final C13861Tih ALL(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C344557s3 r19, C345557ti r20, C7232Q0d q0d, C11354SOn sOn, MediaComposition mediaComposition, C7334Q4k q4k, Integer num) {
        0qQ.A0B(context, 0);
        EGLContext eGLContext2 = eGLContext;
        C11354SOn sOn2 = sOn;
        C51974G9v.A1M(sOn2, num, eGLContext2);
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLSurface eGLSurface2 = eGLSurface;
        C51972G9s.A1E(eGLDisplay2, eGLSurface2);
        Point point = new Point(sOn2.A0C, sOn2.A0A);
        this.A00 = point;
        C10497RtC rtC = this.A03;
        VideoFilter videoFilter = rtC.A00;
        VideoFilter videoFilter2 = rtC.A01;
        C14279TtC ttC = this.A04;
        UserSession userSession = this.A01;
        C59783JYc A012 = C59784JYd.A01(point, this.A02);
        Point point2 = this.A00;
        return new C12351Srx(context, eGLContext2, eGLDisplay2, eGLSurface2, userSession, videoFilter2, videoFilter, ttC, A012, point2.x, point2.y);
    }

    public final boolean CK7() {
        return false;
    }

    public final /* synthetic */ EGLContext BtT() {
        return null;
    }

    public C12354Ss0(Point point, UserSession userSession, AnonymousClass3Q2 r3, C10497RtC rtC, C14279TtC ttC) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = point;
        this.A03 = rtC;
        this.A04 = ttC;
    }
}
