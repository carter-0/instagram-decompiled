package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Map;

/* renamed from: X.LEr  reason: case insensitive filesystem */
public final class C63949LEr {
    public final AnonymousClass3Q2 A00;
    public final C2373837k A01;

    public final void A00(String str, long j, String str2) {
        0qQ.A0B(str, 0);
        C2373837k r4 = this.A01;
        AnonymousClass3Q2 r3 = this.A00;
        C2373737j r42 = (C2373737j) r4;
        0xI A002 = C2373737j.A00((AnonymousClass0iw) null, r3, r42, "segment_upload_job_resume");
        A002.A0C(Pxd.A00(913), str);
        A002.A0B("duration_in_ms", Long.valueOf(j));
        A002.A0C("error_message", str2);
        C2373737j.A06(A002, r3.A6J, r42);
    }

    public final void A01(String str, Throwable th) {
        Map A07;
        C2373837k r7 = this.A01;
        AnonymousClass3Q2 r9 = this.A00;
        C2373737j r72 = (C2373737j) r7;
        C2373737j.A0B(r9, r72, "upload_video_cancel", str);
        0Aj A0e = AnonymousClass7TE.A0e(r72.A01, "ig_media_upload_cancel");
        Throwable th2 = th;
        if (A0e.isSampled()) {
            Context context = r72.A00;
            UserSession userSession = r72.A02;
            C59907JbW jbW = new C59907JbW(context, userSession, r9);
            JTS.A1B(A0e, jbW.A02);
            C59908JbX.A05(A0e, jbW, "connection", C61970qY.A08(jbW.A00));
            C59908JbX.A02(A0e, userSession, r9, jbW);
            A0e.AAJ("target_surface", C59906JbV.A03(userSession, r9, (ShareType) null, true));
            A0e.AAJ("ingest_type", jbW.A0I());
            C59908JbX.A03(A0e, jbW);
            A0e.A9F("duration_ms", jbW.A08());
            A0e.A9F("file_size_bytes", jbW.A09());
            C59908JbX.A04(A0e, jbW, jbW.A0E(), "original_file_size_bytes");
            A0e.A9F(AnonymousClass000.A00(729), jbW.A0F());
            A0e.A9F(AnonymousClass000.A00(730), jbW.A0G());
            A0e.AAJ("reason", str);
            A0e.AAJ("error_message", str);
            A0e.A9H("exception_data", C63375Kvw.A00(th));
            if (r9.A5D) {
                A07 = null;
            } else {
                A07 = jbW.A07();
            }
            JTS.A1C(A0e, A07);
            if (r9.A5p) {
                A0e.A7p(AnonymousClass000.A00(4985), true);
            }
            A0e.Cgf();
        }
        if (th != null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(r9.A1G);
            r72.Cji((AnonymousClass55S) null, r9, AnonymousClass7TF.A0l("_UPLOAD_CANCEL", A1A), "", th2);
        }
        C59968Jcd.A01((0xI) null, r9, th);
        r72.Cjm(r9, "ig_media_upload_cancel", (String) null);
    }

    public C63949LEr(AnonymousClass3Q2 r1, C2373837k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
