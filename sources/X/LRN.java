package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

public final class LRN {
    public final QP5 A00;
    public final LRO A01;

    public static final C60775Jr6 A01(LRN lrn, Integer num, Integer num2) {
        return A00(lrn, (Boolean) null, (Boolean) null, num, num2, (Long) null, (String) null, (String) null, (List) null);
    }

    public final void A02(Long l, String str, String str2, boolean z) {
        Integer num;
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TG.A1N(str, str2);
        if (z) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A01;
        }
        LRO.A01(A00(this, (Boolean) null, (Boolean) null, num, AnonymousClass05K.A0N, l, str3, str4, (List) null), this);
    }

    public final void A03(List list) {
        C60775Jr6 A002 = A00(this, (Boolean) null, (Boolean) null, AnonymousClass05K.A01, (Integer) null, (Long) null, (String) null, (String) null, list);
        LRO lro = this.A01;
        String str = this.A00.A03;
        AnonymousClass7TG.A1N(str, A002);
        0Aj A0e = AnonymousClass7TE.A0e(lro.A02, "client_load_appreciationfeed_init");
        if (A0e.isSampled()) {
            JTU.A0t(LRO.A00(A0e, lro, Dbg.A00(), str), A0e, A002);
            A0e.Cgf();
        }
    }

    public /* synthetic */ LRN(QP5 qp5, AnonymousClass0iw r4, UserSession userSession) {
        LRO lro = new LRO(AnonymousClass0kN.A01(r4, userSession));
        this.A00 = qp5;
        this.A01 = lro;
    }

    public static final C60775Jr6 A00(LRN lrn, Boolean bool, Boolean bool2, Integer num, Integer num2, Long l, String str, String str2, List list) {
        String str3;
        String str4;
        switch (num.intValue()) {
            case 0:
                str3 = "appreciation_gift_awareness";
                break;
            case 1:
                str3 = "appreciation_feed";
                break;
            case 2:
                str3 = "appreciation_feed_onboarding";
                break;
            case 3:
                str3 = "appreciation_feed_overflow_menu";
                break;
            case 4:
                str3 = "appreciation_feed_disclaimer";
                break;
            default:
                str3 = "facebook_banner";
                break;
        }
        QP5 qp5 = lrn.A00;
        String str5 = qp5.A02;
        String str6 = qp5.A00;
        String str7 = qp5.A01;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str4 = "unlike";
                    break;
                case 2:
                    str4 = "filter";
                    break;
                case 3:
                    str4 = "profile";
                    break;
                case 4:
                    str4 = C273654mx.A00(870);
                    break;
                case 5:
                    str4 = Pxd.A00(96);
                    break;
                case 6:
                    str4 = "dismiss";
                    break;
                case 7:
                    str4 = "not_now";
                    break;
                case 8:
                    str4 = "story";
                    break;
                case 9:
                    str4 = "block_user";
                    break;
                case 10:
                    str4 = "unblock_user";
                    break;
                case 11:
                    str4 = C273654mx.A00(937);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str4 = "exit";
                    break;
                case 13:
                    str4 = "learn_more";
                    break;
                default:
                    str4 = "like";
                    break;
            }
        } else {
            str4 = null;
        }
        AnonymousClass7TG.A1U(str5, str6, str7);
        0bb r2 = new 0bb();
        r2.A06("view_name", str3);
        r2.A06("media_id", str5);
        r2.A06("receiver_id", str6);
        r2.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        if (str4 != null && C51966G9m.A1X(str4)) {
            r2.A06("target_name", str4);
        }
        if (bool != null) {
            r2.A03("has_next_page", Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            r2.A03("is_receiver_onboarded", Boolean.valueOf(bool2.booleanValue()));
        }
        if (list != null) {
            r2.A07("displayed_transaction_ids", list);
        }
        if (str != null) {
            r2.A06(Pxd.A00(44), str);
        }
        if (str2 != null) {
            r2.A06("sender_id", str2);
        }
        if (l != null) {
            r2.A06("selected_filter_gift_id", String.valueOf(l.longValue()));
        }
        return r2;
    }
}
