package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class CUF {
    public static final C11009S5g A00(BSm bSm) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        BSm bSm2 = bSm;
        ImmutableList A06 = bSm2.A06(BSl.class, "auth_factors_groups", -202156019);
        0qQ.A07(A06);
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            C250663lr A0V = C41845B3m.A0V(it);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = C41845B3m.A0X(A0V, BSk.class, "factors", 1, -1189570828).iterator();
            while (it2.hasNext()) {
                C250663lr A0V2 = C41845B3m.A0V(it2);
                C250663lr reinterpretIfFulfillsType = A0V2.reinterpretIfFulfillsType(1, "PAYFBPayBIOAuthFactor", C42145BSs.class, 561485201);
                if (reinterpretIfFulfillsType != null) {
                    C8925RFt rFt = (C8925RFt) reinterpretIfFulfillsType.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt != null) {
                        A1C2.add(new C11027S6f((C45888D9m) null, (String) null, (String) null, (String) null, (String) null, (String) null, rFt.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType2 = A0V2.reinterpretIfFulfillsType(2, "PAYFBPayPINAuthFactor", BXF.class, -185049991);
                if (reinterpretIfFulfillsType2 != null) {
                    C8925RFt rFt2 = (C8925RFt) reinterpretIfFulfillsType2.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt2 != null) {
                        A1C2.add(new C11027S6f((C45888D9m) null, (String) null, (String) null, (String) null, (String) null, (String) null, rFt2.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType3 = A0V2.reinterpretIfFulfillsType(3, "PAYFBPayCSCAuthFactor", C42147BSu.class, 1343275932);
                if (reinterpretIfFulfillsType3 != null) {
                    C8925RFt rFt3 = (C8925RFt) reinterpretIfFulfillsType3.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt3 != null) {
                        A1C2.add(new C11027S6f((C45888D9m) null, (String) null, reinterpretIfFulfillsType3.A08("cred_id"), (String) null, (String) null, reinterpretIfFulfillsType3.A09(DialogModule.KEY_TITLE), rFt3.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType4 = A0V2.reinterpretIfFulfillsType(5, "PAYFBPayPayPalAuthFactor", BXI.class, -2095216796);
                if (reinterpretIfFulfillsType4 != null) {
                    C8925RFt rFt4 = (C8925RFt) reinterpretIfFulfillsType4.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt4 != null) {
                        String name = rFt4.name();
                        String A08 = reinterpretIfFulfillsType4.A08("cred_id");
                        String A0A = reinterpretIfFulfillsType4.A0A("hidden_email");
                        XRD xrd = (XRD) reinterpretIfFulfillsType4.getOptionalEnumField(5, "billing_agreement_type", XRD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        if (xrd != null) {
                            A1C2.add(new C11027S6f((C45888D9m) null, reinterpretIfFulfillsType4.A0B("connect_url"), A08, reinterpretIfFulfillsType4.A09("email"), A0A, (String) null, name, xrd.name(), (String) null, (String) null));
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType5 = A0V2.reinterpretIfFulfillsType(0, "PAYFBPayTrustedDeviceAuthFactor", C42270BXn.class, 683090785);
                if (reinterpretIfFulfillsType5 != null) {
                    C8925RFt rFt5 = (C8925RFt) reinterpretIfFulfillsType5.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt5 != null) {
                        A1C2.add(new C11027S6f((C45888D9m) null, (String) null, (String) null, (String) null, (String) null, (String) null, rFt5.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType6 = A0V2.reinterpretIfFulfillsType(7, "PAYFBPay3DSAuthFactor", C42265BXi.class, 1468523178);
                if (reinterpretIfFulfillsType6 != null) {
                    C8925RFt rFt6 = (C8925RFt) reinterpretIfFulfillsType6.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt6 != null) {
                        A1C2.add(new C11027S6f((C45888D9m) null, (String) null, (String) null, (String) null, (String) null, (String) null, rFt6.name(), (String) null, reinterpretIfFulfillsType6.A08("nonce"), reinterpretIfFulfillsType6.A09("url")));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                C250663lr reinterpretIfFulfillsType7 = A0V2.reinterpretIfFulfillsType(4, "PAYFBPaySDCAuthFactor", BXV.class, 1477488599);
                if (reinterpretIfFulfillsType7 != null) {
                    C8925RFt rFt7 = (C8925RFt) reinterpretIfFulfillsType7.getOptionalEnumField(0, "auth_factor_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (rFt7 != null) {
                        String name2 = rFt7.name();
                        String A082 = reinterpretIfFulfillsType7.A08("cred_id");
                        String A09 = reinterpretIfFulfillsType7.A09(DialogModule.KEY_TITLE);
                        Class<BXU> cls = BXU.class;
                        C250663lr optionalTreeField = reinterpretIfFulfillsType7.getOptionalTreeField(3, "auth_amount", cls, 635435091);
                        String str2 = null;
                        if (optionalTreeField != null) {
                            str = optionalTreeField.A08("currency");
                        } else {
                            str = null;
                        }
                        C250663lr optionalTreeField2 = reinterpretIfFulfillsType7.getOptionalTreeField(3, "auth_amount", cls, 635435091);
                        if (optionalTreeField2 != null) {
                            str2 = optionalTreeField2.A07("amount");
                        }
                        A1C2.add(new C11027S6f(new C45888D9m(str, str2), (String) null, A082, (String) null, (String) null, A09, name2, (String) null, (String) null, (String) null));
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
            }
            A1C.add(new S6A(A0V.A00("num_required_factors"), A0V.getCoercedBooleanField(0, "allow_user_select"), A1C2));
        }
        return new C11009S5g(A1C, bSm2.getCoercedIntField(1, "num_required_groups"));
    }
}
