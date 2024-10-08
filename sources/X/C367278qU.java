package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

/* renamed from: X.8qU  reason: invalid class name and case insensitive filesystem */
public abstract class C367278qU {
    public static final AnonymousClass9ID A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        2D6 A00 = 2D5.A00(userSession);
        boolean A03 = C363388je.A03(C363388je.A00(userSession).A00(CallerContext.A01("CLNoticeManager")));
        boolean z = false;
        if (0eE.A00(userSession).A00().A0N() == AnonymousClass05K.A01) {
            z = true;
        }
        return new AnonymousClass9ID(0, z, A03, C363018iu.A00(userSession), C363558jv.A00(userSession), C367288qV.A06(userSession), A00.A0C(), C367258qS.A00(userSession));
    }

    public static final LGS A01(UserSession userSession, C368368sV r13, C367198qL r14, String str) {
        C62632Kj3 kj3;
        C62675Kkb kkb;
        0qQ.A0B(str, 1);
        0qQ.A0B(r14, 3);
        2DQ r8 = 2DQ.A0Z;
        if (r13.getOptionalEnumField(2, "variant", r8) == 2DQ.A0Q) {
            0KC.A0C("CLNoticeManager", 002.A0R(str, ": No available notice variant"));
            r14.A03(2);
            return null;
        }
        EnumEntries enumEntries = C62632Kj3.A01;
        2DQ optionalEnumField = r13.getOptionalEnumField(2, "variant", r8);
        C62632Kj3[] values = C62632Kj3.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                kj3 = null;
                break;
            }
            kj3 = values[i];
            if (kj3.A00 == optionalEnumField) {
                break;
            }
            i++;
        }
        if (kj3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported notice variant: ");
            sb.append(optionalEnumField);
            sb.append('.');
            0KC.A0C("NoticeVariant", sb.toString());
            0KC.A0C("CLNoticeManager", "Unexpected Failure: Unsupported notice variant on the client");
            Enum optionalEnumField2 = r13.getOptionalEnumField(2, "variant", r8);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unmapped_variant:");
            sb2.append(optionalEnumField2);
            r14.A01(TraceFieldType.FailureReason, sb2.toString());
            r14.A03(3);
            return null;
        }
        ImmutableList requiredCompactedEnumListField = r13.getRequiredCompactedEnumListField(3, "client_rules", C62634Kj5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField);
        ArrayList arrayList = new ArrayList(0Yv.A1E(requiredCompactedEnumListField, 10));
        Iterator it = requiredCompactedEnumListField.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C62675Kkb kkb2 = C62675Kkb.A0G;
            0qQ.A0A(next);
            0qQ.A0B(next, 0);
            C62675Kkb[] values2 = C62675Kkb.values();
            int length2 = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    kkb = C62675Kkb.A0G;
                    break;
                }
                kkb = values2[i2];
                if (kkb.A00 == next) {
                    break;
                }
                i2++;
            }
            arrayList.add(kkb);
        }
        r13.getOptionalStringField(4, "bloks_app_id");
        LGS A01 = kj3.A01(userSession, r13.A0B("bloks_app_id"), arrayList);
        r14.A01("notice_variant", A01.A03());
        r14.A03(2);
        return A01;
    }

    public static final boolean A02(AnonymousClass818 r15, C376569Im r16, UserSession userSession, C367198qL r18, LGS lgs, String str) {
        String str2;
        C62675Kkb kkb;
        boolean A03;
        String str3;
        C62634Kj5 kj5;
        0qQ.A0B(r15, 2);
        Iterator it = lgs.A04().iterator();
        do {
            C367198qL r4 = r18;
            UserSession userSession2 = userSession;
            if (it.hasNext()) {
                kkb = (C62675Kkb) it.next();
                C376569Im r0 = r16;
                A03 = kkb.A03(r0, userSession2);
                String A00 = C368298sO.A00(r15);
                String A032 = lgs.A03();
                if (!A03) {
                    str3 = kkb.A02(r0, userSession2);
                } else {
                    str3 = null;
                }
                0wc A02 = AnonymousClass0kN.A02(userSession2);
                0Aj A002 = A02.A00(A02.A00, "cxp_notice_client_rule");
                if (!(!A002.isSampled() || A00 == null || A032 == null || (kj5 = kkb.A00) == null)) {
                    A002.AAJ("client_session_id", str);
                    A002.AAJ("entrypoint", A00);
                    A002.AAJ("variant", A032);
                    A002.AAJ("rule", kj5.toString());
                    A002.A7p("rule_result", Boolean.valueOf(A03));
                    A002.AAJ("reason", str3);
                    A002.Cgf();
                    continue;
                }
            } else if (C367998ru.A03(r15, lgs.A01(), userSession2)) {
                return true;
            } else {
                0KC.A0C("NoticeVariantConfig", "Failed Eligibility: Shared Config Checks");
                if (r18 != null) {
                    str2 = "impression_cooldown";
                }
                return false;
            }
            r4.A01(TraceFieldType.FailureReason, str2);
            return false;
        } while (A03);
        StringBuilder sb = new StringBuilder();
        sb.append("Failed Eligibility Rule: ");
        sb.append(kkb);
        0KC.A0C("NoticeVariantConfig", sb.toString());
        if (r18 != null) {
            String valueOf = String.valueOf(kkb.A00);
            0qQ.A0B(valueOf, 0);
            str2 = 002.A0R("failed_eligibility_rule:", valueOf);
            r4.A01(TraceFieldType.FailureReason, str2);
        }
        return false;
    }
}
