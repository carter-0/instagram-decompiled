package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pc2  reason: case insensitive filesystem */
public final class C73405Pc2 implements Runnable {
    public final /* synthetic */ C61062Jw0 A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C73405Pc2(C61062Jw0 jw0, ImmutableList immutableList, UserSession userSession, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A01 = immutableList;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = jw0;
        this.A05 = str3;
    }

    public final void run() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A02);
        ImmutableList immutableList = this.A01;
        A002.A00(new C71915Osx(this.A00, this.A04, this.A03, this.A05, immutableList));
    }
}
