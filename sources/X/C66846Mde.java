package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;

/* renamed from: X.Mde  reason: case insensitive filesystem */
public final class C66846Mde extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7BV A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66846Mde(AnonymousClass7BV r2, Long l, String str, String str2, List list, List list2, int i) {
        super(1);
        this.A04 = str;
        this.A02 = l;
        this.A00 = i;
        this.A06 = list;
        this.A05 = list2;
        this.A03 = str2;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        NAZ naz = (NAZ) obj;
        0qQ.A0B(naz, 0);
        String str = this.A04;
        Long l = this.A02;
        int i2 = this.A00;
        List list = this.A06;
        List list2 = this.A05;
        String str2 = this.A03;
        if (str2 == null) {
            str2 = "";
        }
        AnonymousClass7BV r2 = this.A01;
        int i3 = 0;
        if (r2 != null) {
            i = r2.A01;
            i3 = r2.A00;
        } else {
            i = 0;
        }
        InstamadilloLoggingContext instamadilloLoggingContext = new InstamadilloLoggingContext(str2, i, i3);
        AnonymousClass68L A0I = C66581MXm.A0I(naz);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramReverb", "loadMessageList");
        if (!A0I.EJd(new C66844Mdc(naz, A0G, instamadilloLoggingContext, l, str, list, list2, A002, i2))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramReverb", "loadMessageList");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }
}
