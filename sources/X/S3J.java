package X;

import com.facebook.papaya.client.transport.ITransport;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class S3J {
    public final ITransport A00;
    public final C10777Rxw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final List A08;

    public S3J(ITransport iTransport, C10777Rxw rxw, UserSession userSession, String str, String str2, List list, List list2, List list3, boolean z) {
        DbW.A1N(list, 3, list3);
        0qQ.A0B(rxw, 8);
        this.A02 = userSession;
        this.A07 = z;
        this.A06 = list;
        this.A05 = list2;
        this.A08 = list3;
        this.A00 = iTransport;
        this.A01 = rxw;
        this.A04 = str;
        this.A03 = str2;
    }

    public final ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(this.A06);
        builder.addAll(this.A05);
        builder.addAll(this.A08);
        return DbZ.A0K(builder);
    }
}
