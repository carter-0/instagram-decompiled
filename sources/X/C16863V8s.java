package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1;
import com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.V8s  reason: case insensitive filesystem */
public abstract class C16863V8s {
    /* JADX WARNING: type inference failed for: r2v3, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v31, types: [X.0rm, java.lang.Object] */
    public static final C16521UwQ A00(C307896Rx r40, AnonymousClass6Tm r41) {
        C19018WGu wGu;
        Throwable th;
        boolean z;
        boolean z2;
        Boolean bool;
        W04 w04 = W04.A0A;
        if (w04 == null) {
            w04 = new W04();
            W04.A0A = w04;
        }
        C307896Rx r26 = r40;
        UserSession A0W = DbX.A0W(r26);
        VLB vlb = new VLB(A0W);
        02m r5 = 02m.A0p;
        0qQ.A07(r5);
        C17843Vgw vgw = C17843Vgw.A03;
        if (vgw == null) {
            vgw = new C17843Vgw();
            C17843Vgw.A03 = vgw;
        }
        IgCdlProviderBuilder A00 = C62981KpX.A00(vlb, A0W);
        C307786Rm r0 = r26.A03;
        if (r0 != null) {
            Context context = r0.A00;
            Context context2 = context;
            CommonCdlProviderHolder A002 = C62976KpS.A00(context, A00);
            AnonymousClass19S A02 = 19E.A02(AnonymousClass12T.A00.A04);
            LDN ldn = new LDN(vlb, A0W, A02);
            0qQ.A0B(A0W, 0);
            VQO vqo = VQO.A01;
            if (vqo == null) {
                vqo = new VQO(A0W);
                VQO.A01 = vqo;
            }
            0qQ.A0B(vgw, 3);
            0qQ.A0B(A002, 5);
            0qQ.A0B(A00, 6);
            0qQ.A0B(vqo, 7);
            w04.A00 = vlb;
            w04.A06 = vgw;
            w04.A07 = r5;
            w04.A02 = A002;
            w04.A04 = A00;
            w04.A08 = A02;
            w04.A05 = ldn;
            C16773V5g v5g = C19018WGu.A06;
            C18609Vv2 A003 = C18609Vv2.A06.A00(vqo);
            Object obj = null;
            synchronized (v5g) {
                0qQ.A0B(A003, 0);
                wGu = C19018WGu.A05;
                if (wGu == null) {
                    wGu = new C19018WGu(context2, A003);
                    C19018WGu.A05 = wGu;
                }
            }
            w04.A01 = wGu;
            ? obj2 = new Object();
            C18073Vl1 vl1 = new C18073Vl1(new C61072JwA(231937012, 2, 1), r5);
            try {
                int i = vl1.A01;
                int i2 = vl1.A00;
                QuickPerformanceLogger quickPerformanceLogger = VJT.A00;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerStart(i, i2);
                    AnonymousClass6Tm r14 = r41;
                    obj2.A00 = DbW.A0P(r14, 4);
                    VLB vlb2 = w04.A00;
                    if (vlb2 == null) {
                        0qQ.A0F("avatarEmbodimentSupport");
                        th = AnonymousClass00P.createAndThrow();
                    } else {
                        if (!182.A06(0Tu.A05, vlb2.A00, 36317672225510844L)) {
                            vl1.A04("LOAD_ACTION_NOT_ENABLED", 4);
                            W04.A01(w04, r26, (C277014uI) obj2.A00, "load_live_editor_not_enabled");
                            return C16521UwQ.LOAD_LIVE_EDITOR_NOT_ENABLED;
                        }
                        List list = r14.A00;
                        UL7 ul7 = new UL7((Map) list.get(7));
                        if (!w04.A03(ul7)) {
                            vl1.A04("NETWORK_NOT_SUPPORTED", 4);
                            W04.A01(w04, r26, (C277014uI) obj2.A00, "network_type_not_supported");
                        }
                        String A0t = DbU.A0t(list, 0);
                        Map map = (Map) list.get(1);
                        ? obj3 = new Object();
                        obj3.A00 = DbU.A0t(list, 2);
                        Object obj4 = list.get(3);
                        0qQ.A0C(obj4, "null cannot be cast to non-null type kotlin.Number");
                        double A004 = JTO.A00(obj4);
                        Boolean bool2 = (Boolean) list.get(5);
                        if (bool2 != null) {
                            z = bool2.booleanValue();
                        } else {
                            z = false;
                        }
                        String A0t2 = DbU.A0t(list, 6);
                        Map map2 = (Map) list.get(8);
                        Object obj5 = list.get(9);
                        0qQ.A0C(obj5, AnonymousClass000.A00(39));
                        boolean A1a = AnonymousClass7TE.A1a(obj5);
                        String A10 = DbT.A10(C16772V5f.A00());
                        if (map2 != null) {
                            obj = map2.get("pinAvatar");
                        }
                        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                            z2 = false;
                        } else {
                            z2 = bool.booleanValue();
                        }
                        C53368Gms A01 = w04.A09.A01(map2, 1G7.A00());
                        String str = (String) obj3.A00;
                        vl1.A03(TraceFieldType.RequestID, A10);
                        int i3 = 1;
                        vl1.A03("isAvatarConfigEmpty", Integer.valueOf(DbW.A1a(map) ? 1 : 0));
                        if (str != null) {
                            i3 = 0;
                        }
                        vl1.A03("isEffectConfigEmpty", Integer.valueOf(i3));
                        if (str != null) {
                            vl1.A03("effectId", str);
                        }
                        vl1.A03(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, Double.valueOf(A004));
                        1Eo.A05(new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, w04, obj2, r26, vl1), new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(context2, ul7, w04, vl1, ldn, A01, r26, A0t, A0t2, A10, map, (AnonymousClass4D7) null, obj3, obj2, A02, A004, A1a, z, z2), A02);
                        return C16521UwQ.SUCCESS;
                    }
                } else {
                    th = new C16686V1p();
                }
                throw th;
            } catch (ClassCastException e) {
                0KC.A0C("CommonBloksActionHelper", AnonymousClass7TG.A0m(e, "Cannot cast argument received. Error: ", new StringBuilder()));
                vl1.A05(3);
                W04.A01(w04, r26, (C277014uI) obj2.A00, "class_cast_error");
                return C16521UwQ.CLASS_CAST_ERROR;
            } catch (Exception e2) {
                0KC.A0C("CommonBloksActionHelper", AnonymousClass7TG.A0m(e2, "Unknown exception. Error: ", new StringBuilder()));
                vl1.A05(3);
                W04.A01(w04, r26, (C277014uI) obj2.A00, "unknown_error");
                return C16521UwQ.UNKNOWN_ERROR;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }
}
