package X;

import com.google.common.collect.ImmutableList;
import java.math.BigInteger;

/* renamed from: X.OvO  reason: case insensitive filesystem */
public final /* synthetic */ class C72049OvO implements AnonymousClass68Z {
    public final /* synthetic */ ImmutableList A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ BigInteger A07;

    public /* synthetic */ C72049OvO(ImmutableList immutableList, Long l, Long l2, Long l3, String str, String str2, String str3, BigInteger bigInteger) {
        this.A04 = str;
        this.A01 = l;
        this.A05 = str2;
        this.A07 = bigInteger;
        this.A06 = str3;
        this.A02 = l2;
        this.A03 = l3;
        this.A00 = immutableList;
    }

    public final Object apply(Object obj) {
        String str = this.A04;
        Long l = this.A01;
        String str2 = this.A05;
        BigInteger bigInteger = this.A07;
        String str3 = this.A06;
        Long l2 = this.A02;
        Long l3 = this.A03;
        ImmutableList immutableList = this.A00;
        MYb mYb = MYb.A0M;
        return 1aU.A07(new OxP((NAL) obj, immutableList, l, l2, l3, str, str2, str3, bigInteger), AnonymousClass6F9.A00("send_report"));
    }
}
