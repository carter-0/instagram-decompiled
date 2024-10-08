package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AVm  reason: case insensitive filesystem */
public final class C40197AVm implements B2V {
    public C366048o6 A00;
    public C344207rU A01;
    public C40140ATg A02;
    public AnonymousClass9W6 A03;
    public final Context A04;
    public final UserSession A05;

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        MediaEffect mediaEffect;
        FilterModel A002;
        String str;
        List unmodifiableList;
        List list;
        List<A4L> unmodifiableList2;
        FilterModel filterModel;
        SIO sio;
        C41828B2j b2j2 = b2j;
        boolean A1U = AnonymousClass7TF.A1U(0, b2j2, sOn);
        MediaComposition mediaComposition2 = mediaComposition;
        AnonymousClass7TG.A0w(2, q4k, mediaComposition2, map);
        C344477rv BQ7 = b2j2.BQ7();
        0qQ.A07(BQ7);
        int i5 = i3;
        int i6 = i4;
        BQ7.FLA(0, i, i2, false, i5, i6);
        List list2 = (List) mediaComposition2.A00.get(C266714aE.VIDEO);
        boolean z = false;
        if (list2 == null || (sio = (SIO) list2.get(0)) == null) {
            mediaEffect = null;
        } else {
            mediaEffect = sio.A01;
        }
        if (mediaEffect instanceof C64445Lc0) {
            AnonymousClass3Q2 r9 = ((C64445Lc0) mediaEffect).A00;
            Context context = this.A04;
            UserSession userSession = this.A05;
            C266864aT r0 = r9.A1K;
            if (r0 != null) {
                A002 = AEQ.A01(userSession, r0);
            } else {
                A002 = ADO.A00.A00(context, userSession, r9);
            }
            List list3 = r9.A1i.A03;
            if (!(list3 == null || (unmodifiableList = Collections.unmodifiableList(list3)) == null || (list = r9.A1i.A02) == null || (unmodifiableList2 = Collections.unmodifiableList(list)) == null)) {
                ArrayList A0r = AnonymousClass7TG.A0r(unmodifiableList);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    AnonymousClass7TE.A1Y(A0r, TimeUnit.MILLISECONDS.toMicros((long) AnonymousClass7TG.A0F(it)));
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (A4L a4l : unmodifiableList2) {
                    A1C.add(00k.A0w(a4l.A00));
                }
                if ((A002 instanceof FilterChain) && (filterModel = (FilterModel) ((FilterChain) A002).A01.get(17)) != null) {
                    C366048o6 r02 = this.A00;
                    if (r02 != null) {
                        r02.A05.A00.add(new C39704A5u(filterModel, A0r, A1C));
                    } else {
                        str = "igluMediaGraph";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            List A003 = C367508qr.A00(r9, i5, i6);
            AnonymousClass9W6 r03 = this.A03;
            if (r03 != null) {
                AnonymousClass9W6.A01(BQ7, r9, r03, A003);
                C344207rU r04 = this.A01;
                if (r04 != null) {
                    C344207rU.A00(A002, r04);
                    CameraAREffect cameraAREffect = r9.A10;
                    1X6 r17 = 1X6.A00;
                    if (r17 != null) {
                        C344207rU r05 = this.A01;
                        if (r05 != null) {
                            C368528sn A004 = r17.A00(context, (View) null, r05, userSession, A1U, false);
                            A004.A0C((C365408n3) null, (C344557s3) null);
                            A004.A0B();
                            A004.A0D(cameraAREffect);
                            C344207rU r1 = this.A01;
                            if (r1 != null) {
                                C366438ov r06 = (C366438ov) r1.A02(C366438ov.A00);
                                if (cameraAREffect != null) {
                                    z = true;
                                }
                                ((C366428ou) r06).A00.A00 = Boolean.valueOf(z);
                            }
                        }
                    } else {
                        str = "instance";
                    }
                }
                str = "cameraService";
            } else {
                str = "regionTrackingOverlayMediaGraph";
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        return A1U;
    }

    public final C41828B2j AMn(EGLContext eGLContext, Handler handler, C344497rx r34, C344557s3 r35, C11354SOn sOn, C7334Q4k q4k, Object obj) {
        String str;
        EGLContext eGLContext2 = eGLContext;
        C344497rx r1 = r34;
        Object obj2 = obj;
        AnonymousClass7TG.A0w(1, eGLContext2, obj2, r1);
        AR5 ar5 = new AR5(r1, 3);
        Context context = this.A04;
        UserSession userSession = this.A05;
        C344407ro r7 = new C344407ro();
        C343897qz r21 = new C343897qz();
        C368708tC r20 = new C368708tC();
        Integer num = null;
        Handler handler2 = null;
        Handler handler3 = handler;
        if (handler != null) {
            handler2 = handler3;
        }
        Context context2 = context;
        C344767sO A002 = C344787sQ.A00(context2, handler2, (C344807sS) null, r7, r20, r21, true, true, false, true, false, true, false, false);
        0Tu r8 = 0Tu.A05;
        boolean A06 = 182.A06(r8, userSession, 36319476111187379L);
        if (A06) {
            AnonymousClass7TG.A1H(0wj.A01, "IgStoriesArFrameLiteRendererCallback");
        }
        UserSession userSession2 = userSession;
        this.A00 = C365968ny.A01(context2, userSession2, "IgStoriesArFrameLiteRendererCallback", true, A06, true, false);
        this.A03 = new AnonymousClass9W6(context, r7, C365968ny.A01(context2, userSession2, "IgStoriesArFrameLiteRendererCallback", true, false, true, false), userSession);
        0qg.A01();
        if (0qg.A00(context, false) >= 182.A01(r8, userSession, 36601646872400146L) * 1048576 && 182.A06(r8, userSession, 36320171895431246L)) {
            num = AnonymousClass9TI.A01(r8, userSession);
        }
        this.A02 = new C40140ATg(r7);
        A00().A05 = true;
        A00().A0D.A03 = true;
        A00().A01(C391129sO.LAYOUT, new C382359dZ(r7, true));
        A00().A01(C391129sO.EFFECT, A002);
        if (num != null) {
            A00().A01(C391129sO.FILTER_PREPROCESS, C365968ny.A02(context, userSession, num));
        }
        C40140ATg A003 = A00();
        C391129sO r12 = C391129sO.FILTER;
        C366048o6 r0 = this.A00;
        if (r0 != null) {
            A003.A01(r12, r0);
            C40140ATg A004 = A00();
            C391129sO r13 = C391129sO.OVERLAY;
            AnonymousClass9W6 r02 = this.A03;
            if (r02 != null) {
                A004.A01(r13, r02);
                C344587s6 r14 = new C344587s6(obj2, 3);
                C344557s3 r03 = r35;
                if (r35 != null) {
                    r14.A0A(r03, 1);
                } else {
                    r14.A09(eGLContext2, 1);
                }
                C343647qZ r5 = new C343647qZ("instagram_post_capture");
                r5.A02(C343767ql.A00, A002);
                r5.A02(C343737qi.A0E, A00());
                r5.A02(C343677qc.A00, userSession);
                r5.A02(C366138oF.A00, true);
                r5.A02(C343737qi.A0I, handler3);
                C343647qZ.A01(r5, ar5, r14, obj2);
                r5.A02(C343737qi.A08, true);
                C344207rU A005 = AAI.A00(context, r5);
                this.A01 = A005;
                return new AVo(A005);
            }
            str = "regionTrackingOverlayMediaGraph";
        } else {
            str = "igluMediaGraph";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C344777sP Blt() {
        return null;
    }

    public final C40140ATg A00() {
        C40140ATg aTg = this.A02;
        if (aTg != null) {
            return aTg;
        }
        0qQ.A0F("compositeMediaGraph");
        throw AnonymousClass00P.createAndThrow();
    }

    public C40197AVm(Context context, UserSession userSession) {
        this.A04 = context;
        this.A05 = userSession;
    }
}
