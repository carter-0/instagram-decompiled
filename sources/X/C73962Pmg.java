package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;
import java.util.Map;

/* renamed from: X.Pmg  reason: case insensitive filesystem */
public final class C73962Pmg extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            NAZ naz = (NAZ) obj2;
            0qQ.A0B(naz, 0);
            Map map = (Map) this.A04;
            Integer valueOf = Integer.valueOf(this.A01);
            List list = (List) this.A03;
            String str = this.A05;
            if (str == null) {
                str = "";
            }
            AnonymousClass7BV r2 = (AnonymousClass7BV) this.A02;
            int i2 = 0;
            if (r2 != null) {
                i = r2.A01;
                i2 = r2.A00;
            } else {
                i = 0;
            }
            InstamadilloLoggingContext instamadilloLoggingContext = new InstamadilloLoggingContext(str, i, i2);
            AnonymousClass68L A0I = C66581MXm.A0I(naz);
            MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
            int A002 = C3030067a.A00(A0G);
            TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramReverb", "loadMessageListForThreads");
            if (!A0I.EJd(new C71683Op2(naz, A0G, instamadilloLoggingContext, valueOf, list, map, A002))) {
                A0G.cancel(false);
                C3030067a.A02(A002);
                C3030067a.A03(A012, "MailboxInstagramReverb", "loadMessageListForThreads");
            }
            PlatformLogger.platformEventLog(5);
            return A0G;
        }
        1Ln r6 = (1Ln) obj2;
        0qQ.A0B(r6, 0);
        r6.A0X(0);
        r6.A0R("creation_session_id", this.A03.toString());
        r6.A0M((C69503Nml) this.A02, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r6.A0O("is_e2ee", false);
        r6.A0Y(this.A01);
        C66580MXl.A1L(r6, C69834Nsw.A00((Integer) this.A04));
        r6.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A05);
        r6.A0M(XSV.A02, "thread_type");
        r6.A0Z(36);
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73962Pmg(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A04 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A05 = str;
        this.A02 = obj3;
    }
}
