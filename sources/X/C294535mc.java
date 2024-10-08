package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* renamed from: X.5mc  reason: invalid class name and case insensitive filesystem */
public final class C294535mc {
    public static volatile C294535mc A02;
    public final 1QP A00;
    public final UserSession A01;

    public final void A03(C72695PFz pFz, Reel reel) {
        String str;
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            long A002 = A00(id);
            1iA r5 = pFz.A01;
            boolean z = reel.A1a;
            1QP r4 = this.A00;
            r4.flowAnnotate(A002, "is_incomplete_media", true);
            r4.flowAnnotate(A002, "self_story", z);
            if (r5 != null) {
                str = r5.name();
            } else {
                str = null;
            }
            r4.flowAnnotate(A002, "media_type", str);
        }
    }

    public final void A0C(Reel reel, C255773uh r12) {
        Integer num;
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            long A002 = A00(id);
            UserSession userSession = this.A01;
            int indexOf = reel.A0O(userSession).indexOf(r12);
            if (r12.CcK()) {
                num = AnonymousClass05K.A01;
            } else if (r12.A1P()) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A00;
            }
            1iA A0C = r12.A0C();
            r12.A0m();
            boolean z = reel.A1a;
            1QP r5 = this.A00;
            r5.flowAnnotate(A002, "is_materialized", true);
            r5.flowAnnotate(A002, "segment_type", AnonymousClass6VF.A00(num));
            r5.flowAnnotate(A002, "reel_type", reel.A0H(userSession));
            r5.flowAnnotate(A002, "self_story", z);
            if (A0C != null) {
                r5.flowAnnotate(A002, "media_type", A0C.name());
            }
            if (indexOf != -1) {
                r5.flowAnnotate(A002, "segment_position", indexOf);
            }
        }
    }

    public final void A0D(AnonymousClass3BT r10, String str) {
        0qQ.A0B(r10, 0);
        if (A02(this)) {
            Reel reel = r10.A03;
            String id = reel.getId();
            0qQ.A07(id);
            long A002 = A00(id);
            1QP r7 = this.A00;
            r7.flowStart(A002, new UserFlowConfig("TRAY", true));
            if (A02(this)) {
                String id2 = reel.getId();
                0qQ.A07(id2);
                long A003 = A00(id2);
                r7.flowAnnotate(A003, "is_add_to_story", reel.A0a());
                r7.flowAnnotate(A003, "is_nux_reel", reel.A1P);
                r7.flowAnnotate(A003, "is_roll_call_empty_state_pog", reel.A0o());
                r7.flowAnnotate(A003, "is_roll_call_pog", reel.getId().equals("election:rollcall_v2"));
                Integer num = reel.A0e;
                if (num != null) {
                    r7.flowAnnotate(A003, "reel_media_count", num.intValue());
                }
                r7.flowAnnotate(A003, "has_failed_pending_media", reel.A0Z());
                r7.flowAnnotate(A003, "has_permanently_failed_pending_media", r10.A02());
                UserSession userSession = this.A01;
                r7.flowAnnotate(A003, "has_media_flagged_by_rights_manager", r10.A05(userSession));
                r7.flowAnnotate(A003, "is_empty", r10.A06(userSession));
                r7.flowAnnotate(A003, "is_muted", reel.A1Y);
                r7.flowAnnotate(A003, "is_broadcast_reel", reel.A0d());
                r7.flowAnnotate(A003, "is_co_broadcast_reel", r10.A03());
                r7.flowAnnotate(A003, "is_live_question_and_answer", reel.A0j());
                r7.flowAnnotate(A003, "is_highlight_reel", reel.A0i());
                r7.flowAnnotate(A003, "is_suggested_highlight_reel", reel.A0p());
                boolean z = false;
                if (reel.A0P == ReelType.A0Q) {
                    z = true;
                }
                r7.flowAnnotate(A003, "is_highlight_rewind_reel", z);
            }
            r7.flowAnnotate(A002, "reel_tray_item_view_type", str);
        }
    }

    private final long A00(String str) {
        return this.A00.generateFlowId(17309598, String.valueOf(str).hashCode());
    }

    public static final boolean A02(C294535mc r3) {
        return 182.A06(0Tu.A05, r3.A01, 36324939309003254L);
    }

    public C294535mc(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public static final Long A01(C294535mc r3, String str) {
        long A002 = r3.A00(str);
        if (!r3.A00.isOngoingFlow(A002)) {
            return null;
        }
        return Long.valueOf(A002);
    }

    public final void A04(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            long A002 = A00(id);
            boolean z = reel.A1a;
            1QP r4 = this.A00;
            r4.flowAnnotate(A002, "is_self_without_story", true);
            r4.flowAnnotate(A002, "self_story", z);
        }
    }

    public final void A05(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            long A002 = A00(id);
            boolean z = reel.A1a;
            1QP r4 = this.A00;
            r4.flowAnnotate(A002, AnonymousClass000.A00(3464), true);
            r4.flowAnnotate(A002, "self_story", z);
        }
    }

    public final void A06(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_avatar_view");
            }
        }
    }

    public final void A07(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_item_preview");
            }
        }
    }

    public final void A08(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_label");
            }
        }
    }

    public final void A09(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_muted_state");
            }
        }
    }

    public final void A0A(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_seen_state_and_self_pog_text");
            }
        }
    }

    public final void A0B(Reel reel) {
        if (A02(this)) {
            String id = reel.getId();
            0qQ.A07(id);
            Long A012 = A01(this, id);
            if (A012 != null) {
                this.A00.flowMarkPoint(A012.longValue(), "bind_tap_listener");
            }
        }
    }
}
