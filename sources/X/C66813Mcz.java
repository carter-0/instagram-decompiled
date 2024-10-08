package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Mcz  reason: case insensitive filesystem */
public final class C66813Mcz {
    public long A00 = -1;
    public XSV A01;
    public N1C A02;
    public C70487O8m A03;
    public final 0wc A04;
    public final UserSession A05;

    public final void A01(XSV xsv, C69354Njt njt, String str, long j) {
        DbZ.A0t(0, str, xsv, njt);
        A02(xsv, new C70487O8m(njt.name()), str, j);
    }

    public static final void A00(C69476NmK nmK, C66813Mcz mcz) {
        String str;
        UserSession userSession = mcz.A05;
        0Tu r4 = 0Tu.A06;
        if (182.A06(r4, userSession, 2342153998469562775L) && mcz.A02 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(mcz.A04, "ufix_ig_proactive_warnings_event");
            if (A0e.isSampled()) {
                N1C n1c = mcz.A02;
                if (n1c == null) {
                    0qQ.A0F("eventCore");
                } else {
                    A0e.AAK(n1c, "core");
                    0bb r6 = new 0bb();
                    r6.A01(nmK, "event");
                    r6.A05(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.valueOf(mcz.A00));
                    XSV xsv = mcz.A01;
                    if (xsv == null) {
                        0qQ.A0F("threadType");
                    } else {
                        r6.A01(xsv, "thread_type");
                        r6.A00.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 1);
                        C70487O8m o8m = mcz.A03;
                        if (o8m == null) {
                            0qQ.A0F("flowTypeHolder");
                        } else {
                            r6.A06("flow_type", o8m.A00);
                            A0e.AAK(r6, "ig_proactive_warning");
                            A0e.Cgf();
                        }
                    }
                }
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (182.A06(r4, userSession, 36310989255803286L)) {
            0Aj A0e2 = AnonymousClass7TE.A0e(mcz.A04, "safety_notices_logs");
            if (A0e2.isSampled()) {
                try {
                    C69428NlY valueOf = C69428NlY.valueOf(nmK.toString());
                    XSV xsv2 = mcz.A01;
                    if (xsv2 == null) {
                        0qQ.A0F("threadType");
                    } else {
                        XSO valueOf2 = XSO.valueOf(xsv2.toString());
                        C70487O8m o8m2 = mcz.A03;
                        if (o8m2 == null) {
                            0qQ.A0F("flowTypeHolder");
                        } else {
                            C69429NlZ valueOf3 = C69429NlZ.valueOf(AnonymousClass7TF.A0k(o8m2.A00));
                            A0e2.A8M(valueOf, TraceFieldType.AdhocEventName);
                            C66580MXl.A1J(A0e2, String.valueOf(mcz.A00));
                            A0e2.A8M(valueOf2, "thread_type");
                            DbS.A1N(A0e2, "banner");
                            A0e2.A8M(valueOf3, "problem_area");
                            A0e2.Cgf();
                            return;
                        }
                    }
                    throw AnonymousClass00P.createAndThrow();
                } catch (IllegalArgumentException e) {
                    e = e;
                    str = "Unable to create log due to IllegalArgumentException";
                    0KC.A0F("ProactiveWarningBannerLogger", str, e);
                } catch (NullPointerException e2) {
                    e = e2;
                    str = "Unable to create log due to NullPointerException";
                    0KC.A0F("ProactiveWarningBannerLogger", str, e);
                }
            }
        }
    }

    public C66813Mcz(AnonymousClass0iw r3, UserSession userSession) {
        this.A05 = userSession;
        this.A04 = AnonymousClass0kN.A01(r3, userSession);
    }

    public final void A02(XSV xsv, C70487O8m o8m, String str, long j) {
        AnonymousClass7TG.A1Q(xsv, o8m);
        this.A00 = JTS.A06(AnonymousClass7TE.A10(str));
        this.A01 = xsv;
        this.A03 = o8m;
        0bb r2 = new 0bb();
        r2.A06(Py2.A00(), AnonymousClass7TF.A0c());
        r2.A01(C21123XFn.EXECUTION_DONE, "event_step");
        r2.A01(C67612Mqk.PROACTIVE_WARNING, "event_source");
        r2.A05("target_user_id", Long.valueOf(j));
        this.A02 = r2;
    }
}
