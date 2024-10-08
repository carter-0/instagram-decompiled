package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;

/* renamed from: X.NxW  reason: case insensitive filesystem */
public abstract class C70116NxW {
    public static final MsysThreadSubtype A00(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return MsysThreadSubtype.Standard.A00;
            }
            if (intValue == 2) {
                return MsysThreadSubtype.DualSendShadow.A00;
            }
            if (intValue == 3) {
                return MsysThreadSubtype.BtvCompanion.A00;
            }
            if (intValue == 4) {
                return MsysThreadSubtype.BlendDualSend.A00;
            }
            if (intValue == 5) {
                return MsysThreadSubtype.BlendDualSendNoNetwork.A00;
            }
        }
        return new MsysThreadSubtype.Unknown(num);
    }
}
