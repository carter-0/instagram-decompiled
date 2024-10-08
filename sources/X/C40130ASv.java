package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.ASv  reason: case insensitive filesystem */
public final class C40130ASv implements AnonymousClass2Kv {
    public final /* synthetic */ C357058Wh A00;
    public final /* synthetic */ 0sP A01;

    public C40130ASv(C357058Wh r1, 0sP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r7) {
        C250663lr r3;
        C250663lr optionalTreeField;
        C250663lr r1;
        String A09;
        if (r7 != null && (r3 = (C250663lr) r7.Bny()) != null && (optionalTreeField = r3.getOptionalTreeField(0, "validate_ig_story_interactive_elements_for_ads_eligibility(input:$input)", BYO.class, 1824841834)) != null && !optionalTreeField.getCoercedBooleanField(0, "is_eligible")) {
            ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(1, "error_data", BYN.class, -1947349466);
            0qQ.A07(requiredCompactedTreeListField);
            if (AnonymousClass7TE.A1b(requiredCompactedTreeListField) && (r1 = (C250663lr) 00k.A0O(requiredCompactedTreeListField, 0)) != null && (A09 = r1.A09(AnonymousClass000.A00(146))) != null) {
                0sP r12 = this.A01;
                C357058Wh r0 = this.A00;
                r12.invoke(A09);
                27r A012 = 27p.A01(r0.A04);
                0Aj A0e = AnonymousClass7TE.A0e(A012.A01, AnonymousClass000.A00(1430));
                if (A012.A0P() && A0e.isSampled()) {
                    AnonymousClass7TH.A0W(A0e, A012);
                    AnonymousClass283 r32 = A012.A04;
                    A0e.AAJ("camera_session_id", r32.A0L);
                    AnonymousClass7TE.A1W(A0e, "entity_type", 32);
                    AnonymousClass7TH.A0U(A0e);
                    A0e.A8M(C59725JVj.POST_CAPTURE, "surface");
                    A0e.AAJ("composition_str_id", r32.A0M);
                    A0e.A8M(r32.A0A, "composition_media_type");
                    A0e.AAe(AnonymousClass000.A00(1154), Arrays.asList(new C347027w9[]{C347027w9.ADS_MODE_STICKER}));
                    AnonymousClass7TH.A0V(A0e);
                }
            }
        }
    }
}
