package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PfS  reason: case insensitive filesystem */
public final class C73560PfS extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73560PfS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, String str, String str2, String str3, String str4, AnonymousClass4D7 r14, int i, boolean z) {
        super(2, r14);
        this.A02 = i;
        this.A05 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A0C = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A09 = obj5;
        this.A0B = str4;
        this.A0F = z;
        this.A08 = obj6;
        this.A06 = obj7;
        this.A0A = obj8;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.PfS, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r20) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        String str3;
        Object obj6;
        String str4;
        boolean z;
        Object obj7;
        Object obj8;
        Object obj9;
        int i;
        AnonymousClass4D7 r15 = r20;
        if (this.A02 != 0) {
            obj4 = this.A05;
            obj2 = this.A07;
            obj3 = this.A03;
            obj5 = this.A04;
            str = this.A0C;
            str2 = this.A0E;
            str3 = this.A0D;
            obj6 = this.A09;
            str4 = this.A0B;
            z = this.A0F;
            obj7 = this.A08;
            obj8 = this.A06;
            obj9 = this.A0A;
            i = 1;
        } else {
            obj2 = this.A07;
            obj3 = this.A03;
            obj4 = this.A05;
            obj5 = this.A04;
            str = this.A0C;
            str2 = this.A0E;
            str3 = this.A0D;
            obj6 = this.A09;
            str4 = this.A0B;
            z = this.A0F;
            obj7 = this.A08;
            obj8 = this.A06;
            obj9 = this.A0A;
            i = 0;
        }
        ? pfS = new C73560PfS(obj4, obj2, obj3, obj5, obj6, obj7, obj8, obj9, str, str2, str3, str4, r15, i, z);
        pfS.A01 = obj;
        return pfS;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.PfS, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A02;
        Object obj2 = 1Hj.A02;
        int i2 = this.A00;
        if (i == 0) {
            if (i2 != 0) {
                0eS.A00(obj);
            } else {
                0eS.A00(obj);
                MQ0 mq0 = (MQ0) this.A01;
                if (mq0 == null || mq0.equals(C59702JUj.A00)) {
                    long j = P9I.A04;
                    this.A00 = 1;
                    if (C241603Pv.A02(this, j) == obj2) {
                        return obj2;
                    }
                } else if (!C59678JTj.A02(mq0)) {
                    if (C59678JTj.A01(1, mq0)) {
                        OMU omu = (OMU) this.A07;
                        if (omu != null) {
                            omu.A00();
                        }
                        C53363Gmn gmn = (C53363Gmn) ((C59678JTj) mq0).A01;
                        if (gmn.A03 == AnonymousClass05K.A0C) {
                            P9I p9i = (P9I) this.A04;
                            long j2 = P9I.A04;
                            C270634h3 r7 = new C270634h3(ClipsViewerSource.BLEND, p9i.A01);
                            String str = this.A0C;
                            r7.A1C = str;
                            String str2 = gmn.A04;
                            r7.A0g = str2;
                            String str3 = this.A0E;
                            r7.A1E = str3;
                            AtomicBoolean atomicBoolean = 1Xj.A0i;
                            r7.A1I = 1Xv.A06(str);
                            r7.A0h = this.A0D;
                            r7.A0n = p9i.A00.requireContext().getString(2131953832);
                            String str4 = this.A0B;
                            boolean z = this.A0F;
                            String str5 = str4;
                            P9I.A00(r7, p9i, omu, (C333517Zg) this.A08, (DirectThreadKey) this.A06, (MessageIdentifier) this.A09, (MsysThreadId) this.A0A, str, str5, str3, str2, z, true);
                            19E.A05((CancellationException) null, (C262224Cq) this.A05);
                        }
                        DbS.A1U(this.A03);
                        19E.A05((CancellationException) null, (C262224Cq) this.A05);
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
            }
            OMU omu2 = (OMU) this.A07;
            if (omu2 != null) {
                omu2.A00();
            }
            DbS.A1U(this.A03);
            19E.A05((CancellationException) null, (C262224Cq) this.A05);
        } else if (i2 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            Object obj3 = this.A01;
            AnonymousClass0Ud r11 = ((C62031KWh) this.A05).A04;
            Object obj4 = this.A03;
            Object obj5 = this.A04;
            String str6 = this.A0C;
            String str7 = this.A0E;
            String str8 = this.A0D;
            Object obj6 = this.A09;
            String str9 = this.A0B;
            boolean z2 = this.A0F;
            Object obj7 = this.A08;
            String str10 = str6;
            String str11 = str7;
            Object obj8 = this.A06;
            Object obj9 = this.A0A;
            Object obj10 = obj6;
            Object obj11 = obj7;
            Object obj12 = obj4;
            Object obj13 = obj5;
            Object obj14 = obj3;
            C73560PfS pfS = new C73560PfS(obj14, this.A07, obj12, obj13, obj10, obj11, obj8, obj9, str10, str11, str8, str9, (AnonymousClass4D7) null, 0, z2);
            this.A00 = 1;
            if (AnonymousClass11O.A00(this, pfS, r11) == obj2) {
                return obj2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C73560PfS) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
