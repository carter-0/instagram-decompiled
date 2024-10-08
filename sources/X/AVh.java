package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;
import java.util.Map;

public final class AVh implements B2V {
    public C366048o6 A00;
    public C344207rU A01;
    public C40140ATg A02;
    public final Context A03;
    public final UserSession A04;

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        String str;
        SIO sio;
        boolean A1U = AnonymousClass7TF.A1U(0, b2j, sOn);
        AnonymousClass7TG.A0w(2, q4k, mediaComposition, map);
        C344477rv BQ7 = b2j.BQ7();
        0qQ.A07(BQ7);
        BQ7.FLA(0, i, i2, false, i3, i4);
        List list = (List) mediaComposition.A00.get(C266714aE.VIDEO);
        MediaEffect mediaEffect = null;
        if (!(list == null || (sio = (SIO) list.get(0)) == null)) {
            mediaEffect = sio.A01;
        }
        if (mediaEffect instanceof C64445Lc0) {
            FilterGroupModel filterGroupModel = ((C64445Lc0) mediaEffect).A00.A1D;
            if (filterGroupModel != null) {
                FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
                C344207rU r0 = this.A01;
                if (r0 != null) {
                    C344207rU.A00(filterChain, r0);
                    1X6 r3 = 1X6.A00;
                    if (r3 != null) {
                        Context context = this.A03;
                        UserSession userSession = this.A04;
                        C344207rU r6 = this.A01;
                        if (r6 != null) {
                            r3.A00(context, (View) null, r6, userSession, A1U, false).A0B();
                        }
                    } else {
                        str = "instance";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                str = "cameraService";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0y();
        }
        return A1U;
    }

    public final C41828B2j AMn(EGLContext eGLContext, Handler handler, C344497rx r25, C344557s3 r26, C11354SOn sOn, C7334Q4k q4k, Object obj) {
        String str;
        EGLContext eGLContext2 = eGLContext;
        C344497rx r1 = r25;
        Object obj2 = obj;
        AnonymousClass7TG.A0w(1, eGLContext2, obj2, r1);
        AR5 ar5 = new AR5(r1, 2);
        Context context = this.A03;
        UserSession userSession = this.A04;
        0Tu r11 = 0Tu.A05;
        boolean A06 = 182.A06(r11, userSession, 36318183327668184L);
        C344407ro r7 = new C344407ro();
        C365998o1 A002 = C365998o1.A00(context, 182.A06(r11, userSession, 36316254885122235L));
        this.A00 = new C366048o6(C365968ny.A00(userSession), A002, new AnonymousClass800(false), (C364708lr) null, -1, A06, 0tS.A4E.A00().A0a(), false, true, true);
        C40140ATg aTg = new C40140ATg(r7);
        this.A02 = aTg;
        aTg.A05 = true;
        aTg.A0D.A03 = true;
        if (!A06) {
            aTg.A01(C391129sO.LAYOUT, new C382359dZ(r7, true));
        }
        C40140ATg aTg2 = this.A02;
        if (aTg2 != null) {
            C391129sO r12 = C391129sO.FILTER;
            C366048o6 r0 = this.A00;
            if (r0 != null) {
                aTg2.A01(r12, r0);
                C344587s6 r112 = new C344587s6(obj2, 3);
                C344557s3 r02 = r26;
                if (r26 != null) {
                    r112.A0A(r02, 1);
                } else {
                    r112.A09(eGLContext2, 1);
                }
                C343647qZ r72 = new C343647qZ("instagram_post_capture");
                C343667qb r13 = C343737qi.A0E;
                C40140ATg aTg3 = this.A02;
                if (aTg3 != null) {
                    r72.A02(r13, aTg3);
                    r72.A02(C343677qc.A00, userSession);
                    r72.A02(C366138oF.A00, false);
                    r72.A02(C343737qi.A0I, handler);
                    r72.A02(C343737qi.A01, false);
                    r72.A02(C343737qi.A0F, ar5);
                    r72.A02(C343737qi.A03, r112);
                    r72.A02(C343737qi.A02, obj2);
                    C343647qZ.A00(r72, C343737qi.A08, true);
                    C344207rU A003 = AAI.A00(context, r72);
                    this.A01 = A003;
                    return new AVo(A003);
                }
            } else {
                str = "igluMediaGraph";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        str = "compositeMediaGraph";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C344777sP Blt() {
        return null;
    }

    public AVh(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }
}
