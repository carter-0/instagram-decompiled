package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Ps  reason: invalid class name and case insensitive filesystem */
public final class C378419Ps implements AnonymousClass8k3 {
    public final /* synthetic */ C363528js A00;
    public final /* synthetic */ String A01;

    public C378419Ps(C363528js r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void DED() {
        C363528js.A02(this.A00, AnonymousClass05K.A01, this.A01);
    }

    public final void DoU(C363628k5 r15) {
        C250663lr r4;
        C363528js r6 = this.A00;
        String str = this.A01;
        Integer num = AnonymousClass05K.A01;
        C363528js.A03(r6, num, str);
        C295855p1 r8 = C295855p1.FB;
        if (r15 != null) {
            r4 = r15.A03(C295865p2.class, "xcxp_unified_crossposting_configs_root(configs_request:$configs_request)", 144118627);
        } else {
            r4 = null;
        }
        C295875p3 r7 = null;
        if (r4 != null) {
            Class<C295875p3> cls = C295875p3.class;
            if (r4.A06(cls, "account_linking_configs", -1116170300) != null) {
                C249803kO it = r4.A06(cls, "account_linking_configs", -1116170300).iterator();
                0qQ.A07(it);
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C295875p3 r3 = (C295875p3) it.next();
                    if (r3.getOptionalEnumField(2, "destination_app", C295855p1.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r8) {
                        r7 = r3;
                        break;
                    }
                }
            }
        }
        C295915p7 A012 = C363528js.A01(C295905p6.FEED, r7);
        if (A012 != null) {
            r6.A02.A02(num, str, A012.getCoercedBooleanField(1, "is_auto_crosspost_enabled"));
        }
        C295905p6 r82 = C295905p6.STORY;
        C295915p7 A013 = C363528js.A01(r82, r7);
        if (A013 != null) {
            r6.A03.A03(A013, num, str);
        }
        if (r7 != null) {
            C249803kO it2 = r7.getRequiredCompactedTreeListField(1, "close_friends_xpost_settings", C295895p5.class, -1588117046).iterator();
            0qQ.A07(it2);
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C295915p7 r2 = (C295915p7) ((C250663lr) it2.next()).reinterpretRequired(0, C295915p7.class, -986182339);
                0qQ.A07(r2);
                if (r2.getOptionalEnumField(0, "source_surface", C295905p6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r82) {
                    r6.A03.A03(r2, num, str);
                    break;
                }
            }
        }
        C295915p7 A014 = C363528js.A01(C295905p6.REELS, r7);
        if (A014 != null) {
            UserSession userSession = r6.A01;
            boolean coercedBooleanField = A014.getCoercedBooleanField(1, "is_auto_crosspost_enabled");
            AnonymousClass9Q7.A03(userSession, str, "server_setting_fetch_success_not_null", String.valueOf(coercedBooleanField), C378169Ot.A01(num), C367288qV.A06(userSession));
            C367288qV.A0A(userSession, str, coercedBooleanField, false);
        }
    }
}
