package X;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Phj  reason: case insensitive filesystem */
public final class C73670Phj extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73670Phj(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new C55980Hql((ComponentActivity) this.A01, this.A02);
            case 1:
                C66603MYp mYp = (C66603MYp) this.A01;
                String str = this.A02;
                QuickPerformanceLogger quickPerformanceLogger = mYp.A04;
                if (!quickPerformanceLogger.isMarkerOn(729361873)) {
                    mYp.A00++;
                    quickPerformanceLogger.markerStart(729361873, false);
                    quickPerformanceLogger.markerAnnotate(729361873, TraceFieldType.HostName, str);
                    quickPerformanceLogger.markerAnnotate(729361873, C273654mx.A00(3262), mYp.A00);
                    quickPerformanceLogger.markerAnnotate(729361873, "start_network_state", C61970qY.A0E(mYp.A02));
                    break;
                }
                break;
            case 2:
                0KC.A0C("MultiInstanceManager", 002.A0R("Failed to login background account ", this.A02));
                C66957Mfq.A00((C66957Mfq) this.A01);
                break;
            case 3:
            case 13:
                return ((TreeJNI) this.A01).getOptionalBooleanList(this.A02);
            case 4:
            case 14:
                return ((TreeJNI) this.A01).getOptionalDoubleList(this.A02);
            case 5:
            case 7:
                C250663lr r1 = (C250663lr) this.A01;
                return r1.coerceList(r1.getOptionalStringList(this.A02));
            case 6:
            case 15:
                return ((TreeJNI) this.A01).getOptionalIntList(this.A02);
            case 8:
            case 16:
                return ((TreeJNI) this.A01).getOptionalStringList(this.A02);
            case 9:
            case 17:
                return ((TreeJNI) this.A01).getOptionalTimeList(this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return ((TreeJNI) this.A01).getOptionalBooleanValue(this.A02);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return ((TreeJNI) this.A01).getOptionalDoubleValue(this.A02);
            case 19:
                return ((TreeJNI) this.A01).getOptionalIntValue(this.A02);
            case 21:
                return ((TreeJNI) this.A01).getOptionalTimeValue(this.A02);
            case 22:
                return ((TreeJNI) this.A01).getBooleanList(this.A02);
            case 23:
                return ((TreeJNI) this.A01).getDoubleList(this.A02);
            case 24:
                return ((TreeJNI) this.A01).getIntList(this.A02);
            case 25:
                return ((TreeJNI) this.A01).getStringList(this.A02);
            case 26:
                return ((TreeJNI) this.A01).getTimeList(this.A02);
            case 27:
                String stringValue = ((TreeJNI) this.A01).getStringValue(this.A02);
                DbS.A1Y(stringValue);
                return stringValue;
            case 28:
                String str2 = this.A02;
                String A0r = DbS.A0r(str2, OUs.A01);
                if (A0r != null) {
                    str2 = A0r;
                }
                C69678Nq0 nq0 = (C69678Nq0) OUs.A02.remove(str2);
                if (nq0 != null) {
                    int A0M = AnonymousClass7TE.A0M(this.A01);
                    if (A0M == 0) {
                        nq0.A03();
                    } else if (A0M == 1) {
                        nq0.A01();
                    } else if (A0M == 2) {
                        nq0.A02();
                    } else if (A0M == 3) {
                        nq0.A00();
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                01W r6 = OUs.A03;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : r6) {
                    if (00p.A0k((String) next, 002.A0C(str2, '$'), false)) {
                        A1C.add(next);
                    }
                }
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    Activity A002 = OUl.A00.A00(A18);
                    if (A002 != null) {
                        A002.finish();
                    }
                    r6.remove(A18);
                }
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                String str3 = this.A02;
                0KC.A0P("proxy_service", "onClientAddress %s", new Object[]{str3});
                ((C11768SgE) this.A01).A02 = C51967G9n.A0q(str3, 0, 00l.A05(str3, ':', C66581MXm.A04(str3) - 1));
                break;
            case 30:
                String str4 = this.A02;
                0KC.A0P("proxy_service", "onClientRegion %s", new Object[]{str4});
                ((C11768SgE) this.A01).A03 = str4;
                break;
            case 31:
                C12411Sto A0g = C51965G9l.A0g();
                QDM qdm = (QDM) this.A01;
                LoggingContext loggingContext = qdm.A0R;
                String str5 = this.A02;
                SEB A03 = qdm.A0S.A03();
                LinkedHashMap A1H = AnonymousClass7TE.A1H();
                SUU.A0A(A03, A1H);
                A0g.A0b(loggingContext, str5, A1H);
                break;
            case 32:
                return new C229072mn(this.A02, (long) 182.A00(0Tu.A05, (0lg) this.A01, 37163424299811102L));
            case 33:
            case 34:
                ((W15) this.A01).A00.DJX(this.A02);
                break;
            case 35:
            case 39:
                ((0sP) this.A01).invoke(this.A02);
                break;
            case 36:
                ((KX0) this.A01).A07(this.A02);
                break;
            case 37:
                ((0sL) this.A01).invoke("example_dialogue", this.A02);
                break;
            case 38:
                C61386K5e k5e = (C61386K5e) this.A01;
                String A0R = 002.A0R(182.A04(0Tu.A05, DbY.A0R(k5e.A01), 36887025976476395L), this.A02);
                String str6 = (String) ((C60315JjI) k5e.A02.getValue()).A0I.getValue();
                1Ln A003 = LTH.A00((LTH) k5e.A00.getValue());
                if (DbT.A1Y(A003)) {
                    A003.A0l("settings_knowledge_get_link_button_clicked");
                    A003.A0j(DbZ.A0d(str6));
                    A003.Cgf();
                }
                Intent A09 = DbS.A09();
                A09.setAction("android.intent.action.SEND");
                A09.putExtra("android.intent.extra.TEXT", A0R);
                A09.setType("text/plain");
                0kR.A0D(k5e.requireContext(), Intent.createChooser(A09, (CharSequence) null));
                break;
            case 40:
                AnonymousClass7TN r0 = (AnonymousClass7TN) this.A01;
                r0.A02.markPointWithEditor(r0.A00, "message_sent").addPointData("message_type", this.A02).pointEditingCompleted();
                break;
            case Seq.NULL_REFNUM:
                UserSession userSession = (UserSession) this.A01;
                String str7 = this.A02;
                if (str7 == null) {
                    str7 = C2818159r.A01();
                }
                return new C64824Lik(userSession, str7);
            case Seq.RefTracker.REF_OFFSET:
                String str8 = this.A02;
                if (str8 != null) {
                    C51965G9l.A1W(this.A01, str8);
                    break;
                }
                break;
            case 43:
                ((C22331Xzg) this.A01).Djw(this.A02, (String) null, (String) null);
                break;
            case 44:
                ((C22331Xzg) this.A01).Dk0(this.A02, (String) null, (String) null);
                break;
            case 45:
                ((C299665vd) this.A01).DOq(this.A02);
                break;
            case 46:
            case 48:
                ((C299665vd) this.A01).DDe(this.A02);
                break;
            case 47:
                ((C299635va) this.A01).CqA(this.A02);
                break;
            case 49:
                ((C299665vd) this.A01).Dfl(this.A02);
                break;
            default:
                return ((TreeJNI) this.A01).getStringValue(this.A02);
        }
        return C60340gF.A00;
    }
}
