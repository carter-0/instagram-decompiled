package X;

/* renamed from: X.Tvx  reason: case insensitive filesystem */
public abstract class C14428Tvx {
    public static final void A01(0wc r1, String str, String str2, String str3, String str4) {
        AnonymousClass7TF.A1C(r1, 0, str3);
        0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_search_meta_ai_entrypoint_tapped");
        if (A0e.isSampled()) {
            C13988Tno.A1E(A0e, "search_session_id", str2, str3);
            C51965G9l.A1K(A0e, str);
            A0e.AAJ("serp_session_id", str4);
            A0e.Cgf();
        }
    }

    public static final void A00(0wc r1, String str, String str2, String str3, String str4) {
        0Aj A0e = AnonymousClass7TE.A0e(r1, "instagram_search_meta_ai_entrypoint_impression");
        if (A0e.isSampled()) {
            C13988Tno.A1E(A0e, "search_session_id", str2, str3);
            C51965G9l.A1K(A0e, str);
            A0e.AAJ("serp_session_id", str4);
            A0e.Cgf();
        }
    }

    public static final void A02(0wc r2, String str, String str2, String str3, String str4, long j, long j2) {
        0Aj A0e = AnonymousClass7TE.A0e(r2, "ig_search_meta_ai_bottomsheet_open_succeed");
        if (A0e.isSampled()) {
            A0e.AAJ("entrypoint", str2);
            C51965G9l.A1K(A0e, str);
            C13988Tno.A1E(A0e, "search_session_id", str3, str4);
            A0e.A9F(C273654mx.A00(616), Long.valueOf(j));
            A0e.A9F("bottomsheet_launched_timestamp", Long.valueOf(j2));
            A0e.Cgf();
        }
    }

    public static final void A03(0wc r1, String str, String str2, String str3, String str4, long j, long j2) {
        String str5;
        AnonymousClass7TG.A1N(r1, str);
        switch (str2.hashCode()) {
            case -1678116978:
                if (str2.equals("core_search_serp_meta_ai_icon")) {
                    str5 = "ig_search_serp_donut";
                    break;
                } else {
                    return;
                }
            case -1288313125:
                if (str2.equals(C273654mx.A00(631))) {
                    str5 = "ig_search_nullstate_airplane_send";
                    break;
                } else {
                    return;
                }
            case -798508124:
                if (str2.equals("explore_meta_ai_bottom_sheet_qp_primary_button")) {
                    str5 = "ig_search_qp_explore_meta_ai_bottom_sheet_qp_primary_button";
                    break;
                } else {
                    return;
                }
            case 390440423:
                if (str2.equals(C273654mx.A00(260))) {
                    str5 = "ig_search_nullstate_recent";
                    break;
                } else {
                    return;
                }
            case 414604585:
                if (str2.equals(C273654mx.A00(630))) {
                    str5 = "ig_search_nullstate_cloud";
                    break;
                } else {
                    return;
                }
            case 493490245:
                if (str2.equals(C273654mx.A00(635))) {
                    str5 = "ig_search_typeahead_donut";
                    break;
                } else {
                    return;
                }
            case 1035397145:
                if (str2.equals("explore_meta_ai_bottom_sheet_qp_suggestion")) {
                    str5 = "ig_search_qp_explore_meta_ai_bottom_sheet_qp_suggestion";
                    break;
                } else {
                    return;
                }
            case 1098362142:
                if (str2.equals(C273654mx.A00(634))) {
                    str5 = "ig_search_typeahead_airplane_send";
                    break;
                } else {
                    return;
                }
            case 1169646015:
                if (str2.equals(C273654mx.A00(633))) {
                    str5 = "ig_search_typeahead_keyboard_send";
                    break;
                } else {
                    return;
                }
            case 1713156226:
                if (str2.equals(C273654mx.A00(632))) {
                    str5 = "ig_search_nullstate_donut";
                    break;
                } else {
                    return;
                }
            case 2095642643:
                if (str2.equals(C273654mx.A00(636))) {
                    str5 = "ig_search_typeahead_suggestion";
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        A02(r1, str, str5, str3, str4, j, j2);
    }
}
