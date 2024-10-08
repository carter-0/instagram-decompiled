package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AVl  reason: case insensitive filesystem */
public final class C40196AVl implements B2V {
    public C344207rU A00;
    public C40140ATg A01;
    public AnonymousClass9W6 A02;
    public final boolean A03;
    public final Context A04;
    public final UserSession A05;

    public final boolean AJ5(C11354SOn sOn, MediaComposition mediaComposition, C41828B2j b2j, C7334Q4k q4k, Map map, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        MediaEffect mediaEffect;
        FilterModel A002;
        String str;
        C41828B2j b2j2 = b2j;
        boolean A1U = AnonymousClass7TF.A1U(0, b2j2, sOn);
        MediaComposition mediaComposition2 = mediaComposition;
        C7334Q4k q4k2 = q4k;
        AnonymousClass7TG.A0w(2, q4k2, mediaComposition2, map);
        C344477rv BQ7 = b2j2.BQ7();
        0qQ.A07(BQ7);
        C344697sH BQ8 = BQ7.BQ8();
        C266714aE r5 = C266714aE.VIDEO;
        HashMap A07 = mediaComposition2.A07(r5);
        if (A07 != null) {
            Iterator it = A07.keySet().iterator();
            while (true) {
                i5 = i3;
                i6 = i4;
                if (!it.hasNext()) {
                    break;
                }
                Number number = (Number) it.next();
                0qQ.A0A(number);
                C346277uu r3 = (C346277uu) BQ8.BHM(number.intValue());
                r3.A07 = false;
                r3.A00(new AnonymousClass800(A1U), i5, i6);
            }
            List list = (List) mediaComposition2.A00.get(r5);
            if (list != null) {
                C40140ATg A003 = A00();
                Context context = this.A04;
                boolean z = true;
                C393199w3.A00(context, BQ7, new C368708tC(), A003, q4k2, list, false);
                C40140ATg A004 = A00();
                C344567s4 r52 = A004.A02;
                if (r52 != null) {
                    r52.A00.post(new C40976AmM(r52, A004));
                }
                BQ7.FLA(0, i5, i6, false, i5, i6);
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (((SIO) next).A01 instanceof C64445Lc0) {
                        A1C.add(next);
                    }
                }
                SIO sio = (SIO) 00k.A0J(A1C);
                if (sio != null) {
                    mediaEffect = sio.A01;
                } else {
                    mediaEffect = null;
                }
                0qQ.A0C(mediaEffect, "null cannot be cast to non-null type com.facebook.videolite.instagram.onecamera.PendingMediaEffect");
                C64445Lc0 lc0 = (C64445Lc0) mediaEffect;
                if (lc0 != null) {
                    AnonymousClass3Q2 r6 = lc0.A00;
                    UserSession userSession = this.A05;
                    C266864aT r0 = r6.A1K;
                    if (r0 != null) {
                        A002 = AEQ.A01(userSession, r0);
                    } else {
                        A002 = ADO.A00.A00(context, userSession, r6);
                    }
                    List A005 = C367508qr.A00(r6, i5, i6);
                    AnonymousClass9W6 r02 = this.A02;
                    if (r02 != null) {
                        AnonymousClass9W6.A01(BQ7, r6, r02, A005);
                        C344207rU r03 = this.A00;
                        if (r03 != null) {
                            C344207rU.A00(A002, r03);
                            CameraAREffect cameraAREffect = r6.A10;
                            1X6 r12 = 1X6.A00;
                            if (r12 != null) {
                                C344207rU r04 = this.A00;
                                if (r04 != null) {
                                    C368528sn A006 = r12.A00(context, (View) null, r04, userSession, A1U, false);
                                    A006.A0C((C365408n3) null, (C344557s3) null);
                                    A006.A0B();
                                    A006.A0D(cameraAREffect);
                                    C344207rU r1 = this.A00;
                                    if (r1 != null) {
                                        C366438ov r05 = (C366438ov) r1.A02(C366438ov.A00);
                                        if (cameraAREffect == null) {
                                            z = false;
                                        }
                                        ((C366428ou) r05).A00.A00 = Boolean.valueOf(z);
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
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final C41828B2j AMn(EGLContext eGLContext, Handler handler, C344497rx r33, C344557s3 r34, C11354SOn sOn, C7334Q4k q4k, Object obj) {
        EGLContext eGLContext2 = eGLContext;
        C344497rx r0 = r33;
        Object obj2 = obj;
        AnonymousClass7TG.A0w(1, eGLContext2, obj2, r0);
        AR5 ar5 = new AR5(r0, 1);
        Context context = this.A04;
        UserSession userSession = this.A05;
        C344407ro r4 = new C344407ro();
        C343897qz r21 = new C343897qz();
        C368708tC r20 = new C368708tC();
        Handler handler2 = null;
        int i = 1;
        boolean z = this.A03;
        Handler handler3 = handler;
        if (handler != null) {
            handler2 = handler3;
        }
        Context context2 = context;
        C344767sO A002 = C344787sQ.A00(context2, handler2, (C344807sS) null, r4, r20, r21, true, z, false, false, false, true, false, false);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36319476111056305L);
        if (A06) {
            AnonymousClass7TG.A1H(0wj.A01, "IgArFrameLiteRendererCallback");
        }
        UserSession userSession2 = userSession;
        C366048o6 A012 = C365968ny.A01(context2, userSession2, "IgArFrameLiteRendererCallback", z, A06, true, false);
        this.A02 = new AnonymousClass9W6(context, r4, C365968ny.A01(context2, userSession2, "IgArFrameLiteRendererCallback", true, false, true, false), userSession);
        this.A01 = new C40140ATg(r4);
        A00().A05 = true;
        A00().A0D.A03 = true;
        A00().A01(C391129sO.EFFECT, A002);
        A00().A01(C391129sO.FILTER, A012);
        C40140ATg A003 = A00();
        C391129sO r2 = C391129sO.OVERLAY;
        AnonymousClass9W6 r1 = this.A02;
        if (r1 != null) {
            A003.A01(r2, r1);
            C344587s6 r12 = new C344587s6(obj2, 3);
            C344557s3 r42 = r34;
            if (r34 != null) {
                int Apq = r42.Apq();
                if ((Apq & 32) != 0) {
                    i = C392929vc.A00(r42, 33);
                    if ((Apq & 8192) != 0) {
                        i |= 8192;
                    }
                }
                r12.A0A(r42, i);
            } else {
                r12.A09(eGLContext2, 1);
            }
            C343647qZ r22 = new C343647qZ("instagram_post_capture_transcoder");
            r22.A02(C343767ql.A00, A002);
            r22.A02(C343737qi.A0E, A00());
            r22.A02(C343677qc.A00, userSession);
            r22.A02(C366138oF.A00, true);
            r22.A02(C343737qi.A0I, handler3);
            C343647qZ.A01(r22, ar5, r12, obj2);
            r22.A02(C343737qi.A0G, 3);
            r22.A02(C343737qi.A08, true);
            C344207rU A004 = AAI.A00(context, r22);
            this.A00 = A004;
            return new AVo(A004);
        }
        0qQ.A0F("regionTrackingOverlayMediaGraph");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C344777sP Blt() {
        return null;
    }

    public final C40140ATg A00() {
        C40140ATg aTg = this.A01;
        if (aTg != null) {
            return aTg;
        }
        0qQ.A0F("stitchGraph");
        throw AnonymousClass00P.createAndThrow();
    }

    public C40196AVl(UserSession userSession, Context context, boolean z) {
        this.A04 = context;
        this.A05 = userSession;
        this.A03 = z;
    }
}
