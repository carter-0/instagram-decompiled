package X;

import com.facebook.proxygen.TraceFieldType;

public abstract class VFY {
    public static final void A00(C17589Vah vah, String str, String str2, String str3, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(vah.A00, vah.A05), "ig_fb_xposting_deep_deletion_event");
        A0e.A7p("contains_deep_deletion", JTP.A0g(A0e, TraceFieldType.AdhocEventName, str, z));
        A0e.A7p("is_story_not_null", Boolean.valueOf(vah.A04));
        A0e.A7p("is_fb_account_hard_linked", Boolean.valueOf(vah.A03));
        A0e.A7p("is_experiment_enabled", AnonymousClass7TE.A0v());
        A0e.AAJ(C46367Ddj.A01(9, 10, 65), vah.A01);
        A0e.AAJ(TraceFieldType.FailureReason, str3);
        A0e.AAJ("surface", str2);
        A0e.A7p("is_dating", Boolean.valueOf(vah.A02));
        A0e.AAJ("xposting_status", (String) null);
        A0e.Cgf();
    }
}
