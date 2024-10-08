package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

public abstract class SPz {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r8 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.SR4 A00(X.C8286QnS r12) {
        /*
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.lang.String r10 = r12.A05
            java.lang.String r11 = r12.A04
            X.RuV r4 = r12.A01
            X.RuV r5 = r12.A02
            X.RGC r0 = r12.A03
            if (r0 == 0) goto L_0x001b
            int r0 = r0.ordinal()
            java.lang.Integer r8 = X.C66580MXl.A0q()
            switch(r0) {
                case 3: goto L_0x002c;
                case 4: goto L_0x001c;
                case 5: goto L_0x0043;
                case 8: goto L_0x002f;
                case 10: goto L_0x0038;
                case 11: goto L_0x0035;
                case 13: goto L_0x001c;
                case 20: goto L_0x003a;
                case 24: goto L_0x0040;
                case 25: goto L_0x003c;
                case 26: goto L_0x003e;
                case 30: goto L_0x0032;
                default: goto L_0x001b;
            }
        L_0x001b:
            r8 = 0
        L_0x001c:
            r2 = 0
            com.facebookpay.common.models.ErrorDialogContent r1 = new com.facebookpay.common.models.ErrorDialogContent
            r3 = r2
            r6 = r2
            r7 = r2
            r9 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.SR4 r0 = new X.SR4
            r0.<init>(r1)
            return r0
        L_0x002c:
            r0 = 13
            goto L_0x0044
        L_0x002f:
            r0 = 15
            goto L_0x0044
        L_0x0032:
            r0 = 9
            goto L_0x0044
        L_0x0035:
            r0 = 14
            goto L_0x0044
        L_0x0038:
            r0 = 1
            goto L_0x0044
        L_0x003a:
            r0 = 0
            goto L_0x0044
        L_0x003c:
            r0 = 5
            goto L_0x0044
        L_0x003e:
            r0 = 6
            goto L_0x0044
        L_0x0040:
            r0 = 8
            goto L_0x0044
        L_0x0043:
            r0 = 7
        L_0x0044:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPz.A00(X.QnS):X.SR4");
    }

    public static final C8286QnS A03(QVG qvg) {
        C8937RGf rGf;
        C10576RuV ruV;
        C10576RuV ruV2;
        C250663lr A01;
        C250663lr A012;
        int coercedIntField = qvg.getCoercedIntField(0, TraceFieldType.ErrorCode);
        String A0B = qvg.A0B("error_title");
        String str = "";
        if (A0B == null) {
            A0B = str;
        }
        String A0C = qvg.A0C(TraceFieldType.Error);
        if (A0C == null) {
            A0C = str;
        }
        C250663lr optionalTreeField = qvg.getOptionalTreeField(6, AnonymousClass000.A00(182), BXY.class, -66327375);
        if (optionalTreeField == null || (A012 = optionalTreeField.A01(BTL.class, 396921940)) == null) {
            rGf = C8937RGf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            ruV = new C10576RuV(rGf, str, (String) null);
        } else {
            String A07 = A012.A07("label");
            if (A07 == null) {
                A07 = str;
            }
            rGf = C8937RGf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            C8937RGf rGf2 = (C8937RGf) A012.getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, rGf);
            if (rGf2 == null) {
                rGf2 = rGf;
            }
            ruV = new C10576RuV(rGf2, A07, A012.A08("link"));
        }
        C250663lr optionalTreeField2 = qvg.getOptionalTreeField(7, "secondary_cta", BXZ.class, 1038307219);
        if (optionalTreeField2 == null || (A01 = optionalTreeField2.A01(BTL.class, 396921940)) == null) {
            ruV2 = null;
        } else {
            String A072 = A01.A07("label");
            if (A072 != null) {
                str = A072;
            }
            C8937RGf rGf3 = (C8937RGf) A01.getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, rGf);
            if (rGf3 == null) {
                rGf3 = rGf;
            }
            ruV2 = new C10576RuV(rGf3, str, A01.A08("link"));
        }
        qvg.getOptionalStringField(8, "extra_data");
        return new C8286QnS(ruV, ruV2, (RGC) qvg.getOptionalEnumField(2, "error_form_field_id", RGC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), A0B, A0C, coercedIntField);
    }

    public static final C8286QnS A01(QXQ qxq) {
        QXP A0E;
        C250663lr A02;
        QVG A0S;
        if (qxq == null || (A0E = qxq.A0E()) == null || (A02 = A0E.A02(C7665QSg.class, "error", -2135041227)) == null || (A0S = Pxj.A0S(A02)) == null) {
            return null;
        }
        return A03(A0S);
    }

    public static final C8286QnS A02(C7682QSx qSx) {
        C250663lr A03;
        ImmutableList A06;
        C250663lr r4;
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        QVG qvg;
        if (qSx == null || (A03 = qSx.A03(C7681QSw.class, "handle_checkout_event(input:$input)", 891167727)) == null || (A06 = A03.A06(C7680QSv.class, "payment_details_updates", 1472614057)) == null || (r4 = (C250663lr) A06.get(0)) == null || (optionalTreeField = r4.getOptionalTreeField(3, "error", C7676QSr.class, -1166680740)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "user_facing_error", C7675QSq.class, 1873846051)) == null || (qvg = (QVG) optionalTreeField2.reinterpretRequired(0, QVG.class, 736683160)) == null) {
            return null;
        }
        return A03(qvg);
    }
}
