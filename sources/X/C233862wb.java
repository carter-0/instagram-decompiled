package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2wb  reason: invalid class name and case insensitive filesystem */
public final class C233862wb implements C233072uu {
    public int A00 = -1;
    public long A01 = -1;
    public C54046GyV A02;
    public 1Xj A03;
    public AnonymousClass3W1 A04;
    public Integer A05;
    public String A06 = "";
    public final C233072uu A07;

    public final void CsF(int i) {
    }

    public final void D67() {
    }

    public final C268314dB Dlz(Integer num, List list) {
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        C54046GyV gyV = this.A02;
        String str = "afiResponse";
        if (gyV != null) {
            C53263GlB glB = gyV.A01;
            if (glB == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
            } else {
                if (glB.A02) {
                    C233072uu r5 = this.A07;
                    int i = this.A00;
                    if (i >= 0) {
                        C57282IVr iVr = new C57282IVr(glB);
                        iVr.A00 = i;
                        iVr.A05 = this.A06;
                        iVr.A02 = this.A03;
                        iVr.A03 = this.A04;
                        Integer num3 = this.A05;
                        str = "afiTriggerSource";
                        if (num3 != null) {
                            iVr.A04 = num3;
                            if (num3 == AnonymousClass05K.A0C) {
                                iVr.A01 = this.A01;
                            }
                            1Xg r4 = new 1Xg(iVr, 1UQ.A06, iVr.getId());
                            AnonymousClass3PG r3 = AnonymousClass3PG.NETWORK;
                            C233462vl r7 = new C233462vl((C67241sS) null, (C233492vo) null, (String) null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
                            r7.A0B(i + 1);
                            String A002 = AnonymousClass1FM.A00();
                            AnonymousClass1FM.A00();
                            r5.Dlz(num2, 0sr.A1M(new AnonymousClass4EB[]{new AnonymousClass4EB(new AnonymousClass9J8(1FI.A0M, A002), r4, r3, r7)}));
                        }
                    } else {
                        throw new IllegalArgumentException("AFI seed ad position is negative");
                    }
                }
                0sn r1 = 0sn.A00;
                return new C268314dB(r1, r1);
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Map Bk0() {
        return new LinkedHashMap();
    }

    public final /* synthetic */ C268314dB Dm0(Integer num, Integer num2, List list) {
        throw new UnsupportedOperationException(C273654mx.A00(11));
    }

    public C233862wb(C233072uu r3) {
        this.A07 = r3;
    }
}
