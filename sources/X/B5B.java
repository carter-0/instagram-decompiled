package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;

public final class B5B implements 2IR {
    public final C267324bN A00;
    public final C62320sa A01;
    public final C62320sa A02;

    public final void onFailure(Throwable th) {
        1Xj r0;
        C267324bN r02 = this.A00;
        if (r02 != null && (r0 = r02.A02) != null) {
            r0.A0c.A08 = false;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr A0U;
        ImmutableList requiredCompactedTreeListField;
        ImmutableList immutableList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C62320sa r0;
        1Xj r02;
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        C250663lr A04;
        C250663lr A042;
        C250663lr optionalTreeField3;
        C250663lr A022;
        C250663lr optionalTreeField4;
        C250663lr optionalTreeField5;
        C250663lr optionalTreeField6;
        C250663lr optionalTreeField7;
        C250663lr optionalTreeField8;
        1Xj r03;
        AnonymousClass3JD r1 = (AnonymousClass3JD) obj;
        C267324bN r12 = this.A00;
        if (!(r12 == null || (r03 = r12.A02) == null)) {
            r03.A0c.A08 = false;
        }
        String str8 = null;
        if (r1 != null && (A0U = C41845B3m.A0U(r1)) != null && (requiredCompactedTreeListField = A0U.getRequiredCompactedTreeListField(0, "xfb_aymt_instagram_graphql_channel_tip(input:$input)", Bn4.class, -1715174050)) != null && !requiredCompactedTreeListField.isEmpty()) {
            C250663lr r5 = (C250663lr) requiredCompactedTreeListField.get(0);
            if (r5 != null) {
                immutableList = r5.getRequiredCompactedTreeListField(5, "specs", Bn3.class, -985398079);
            } else {
                immutableList = null;
            }
            C250663lr r52 = (C250663lr) requiredCompactedTreeListField.get(0);
            if (r52 == null || (optionalTreeField7 = r52.getOptionalTreeField(4, "event_metadata", C42928Bmw.class, -1885460272)) == null || (optionalTreeField8 = optionalTreeField7.getOptionalTreeField(0, "logging_meta_data", C42927Bmv.class, -133124398)) == null) {
                str = null;
            } else {
                str = optionalTreeField8.getOptionalStringField(0, "tip_stage");
            }
            C250663lr r53 = (C250663lr) requiredCompactedTreeListField.get(0);
            if (r53 == null || (optionalTreeField5 = r53.getOptionalTreeField(4, "event_metadata", C42928Bmw.class, -1885460272)) == null || (optionalTreeField6 = optionalTreeField5.getOptionalTreeField(0, "logging_meta_data", C42927Bmv.class, -133124398)) == null) {
                str2 = null;
            } else {
                str2 = optionalTreeField6.A08("metric_name");
            }
            C250663lr r13 = (C250663lr) requiredCompactedTreeListField.get(0);
            if (r13 != null) {
                str3 = r13.getOptionalStringField(0, "tip_id");
            } else {
                str3 = null;
            }
            C250663lr r14 = (C250663lr) requiredCompactedTreeListField.get(0);
            if (r14 != null) {
                str4 = r14.A0A("channel_id");
            } else {
                str4 = null;
            }
            if (immutableList != null && !immutableList.isEmpty()) {
                C250663lr r4 = (C250663lr) immutableList.get(0);
                if (r4 == null || (A022 = r4.A02(Bn2.class, DialogModule.KEY_TITLE, -107419088)) == null || (optionalTreeField4 = A022.getOptionalTreeField(0, "text", Bn1.class, -288131805)) == null) {
                    str5 = null;
                } else {
                    str5 = optionalTreeField4.getOptionalStringField(0, "text");
                }
                C250663lr r42 = (C250663lr) immutableList.get(0);
                if (r42 == null || (A042 = r42.A04(C42930Bmy.class, "action", -1010586163)) == null || (optionalTreeField3 = A042.getOptionalTreeField(0, AnonymousClass000.A00(378), C42929Bmx.class, -492808006)) == null) {
                    str6 = null;
                } else {
                    str6 = C41845B3m.A0l(optionalTreeField3, 0);
                }
                C250663lr r142 = (C250663lr) immutableList.get(0);
                if (r142 == null || (A04 = r142.A04(C42930Bmy.class, "action", -1010586163)) == null) {
                    str7 = null;
                } else {
                    str7 = A04.A08(AnonymousClass000.A00(319));
                }
                C250663lr r143 = (C250663lr) immutableList.get(0);
                if (!(r143 == null || (optionalTreeField = r143.getOptionalTreeField(0, "image", Bn0.class, -1842743307)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "primary_cta_icon", C42931Bmz.class, -1860563462)) == null)) {
                    str8 = optionalTreeField2.getOptionalStringField(0, "uri");
                }
                if (!(r12 == null || (r02 = r12.A02) == null)) {
                    AnonymousClass1i4 r15 = r02.A0c;
                    r15.A07 = str5;
                    r15.A04 = str6;
                    r15.A01 = str7;
                    r15.A06 = str;
                    r15.A03 = str2;
                    r15.A05 = str3;
                    r15.A00 = str4;
                    r15.A02 = str8;
                    r15.A09 = true;
                }
                if (0qQ.A0K(((C250663lr) requiredCompactedTreeListField.get(0)).A08("tip_name"), "instagram_insights_reels_golden_window_tip")) {
                    r0 = this.A02;
                } else {
                    r0 = this.A01;
                }
                r0.invoke();
            }
        }
    }

    public B5B(C267324bN r1, C62320sa r2, C62320sa r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
