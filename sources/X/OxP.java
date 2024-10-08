package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import java.math.BigInteger;

public final /* synthetic */ class OxP implements AnonymousClass67Q {
    public final /* synthetic */ NAL A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ BigInteger A08;

    public /* synthetic */ OxP(NAL nal, ImmutableList immutableList, Long l, Long l2, Long l3, String str, String str2, String str3, BigInteger bigInteger) {
        this.A00 = nal;
        this.A05 = str;
        this.A02 = l;
        this.A06 = str2;
        this.A08 = bigInteger;
        this.A07 = str3;
        this.A03 = l2;
        this.A04 = l3;
        this.A01 = immutableList;
    }

    public final void Eyr(AnonymousClass67Z r15) {
        NAL nal = this.A00;
        String str = this.A05;
        Long l = this.A02;
        String str2 = this.A06;
        BigInteger bigInteger = this.A08;
        String str3 = this.A07;
        Long l2 = this.A03;
        Long l3 = this.A04;
        ImmutableList immutableList = this.A01;
        MYb mYb = MYb.A0M;
        long longValue = l.longValue();
        long longValue2 = l3.longValue();
        C71722Opg A002 = C71722Opg.A00(r15, 67);
        AnonymousClass68L ASa = nal.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, A002);
        C66582MXn.A1E(ASa, new C71703OpN(A0J, nal, bigInteger, l2, immutableList, str, str2, str3, longValue, longValue2), A0J);
    }
}
