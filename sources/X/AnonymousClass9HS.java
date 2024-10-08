package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9HS  reason: invalid class name */
public final class AnonymousClass9HS extends AnonymousClass9HT {
    public static int A0F = 1;
    public Boolean A00 = null;
    public Boolean A01;
    public final C2366634p A02;
    public final C2366634p A03;
    public final C2366634p A04;
    public final C2366634p A05;
    public final C2366634p A06;
    public final C2366634p A07;
    public final C2366634p A08;
    public final C254923tH A09;
    public final AnonymousClass0eM A0A;
    public final boolean A0B;
    public final C254783t2 A0C;
    public final Boolean A0D;
    public final boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9HS(UserSession userSession, C254923tH r11, C254783t2 r12, Boolean bool, boolean z, boolean z2, boolean z3) {
        super(userSession, "messages", 31784972, z, true);
        0qQ.A0B(r11, 4);
        this.A09 = r11;
        this.A0C = r12;
        this.A0D = bool;
        this.A0E = z2;
        this.A0B = z3;
        this.A02 = A02("inflate_composer");
        this.A05 = A02("on_create_direct_thread_toggle_fragment");
        this.A06 = A02("on_create_view_direct_thread_toggle_fragment");
        this.A04 = A02("on_create_direct_thread_data_view_model");
        this.A07 = A02("on_view_created_direct_thread_toggle_fragment");
        this.A08 = A02("thread_loaded");
        this.A03 = A02("initial_resnapshot");
        this.A0A = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LX(this, 31));
    }

    public final void A05() {
        super.A05();
        if (this.A09 == C254923tH.ACT) {
            A0K("is_tangerine", this.A0E);
            A0K("has_linked_open_thread_id", false);
        }
        Boolean bool = this.A0D;
        if (bool != null) {
            A0K("has_instantiated", bool.booleanValue());
        }
        Boolean bool2 = this.A01;
        if (bool2 != null) {
            A0K("message_matching_success", bool2.booleanValue());
        }
        Boolean bool3 = this.A00;
        if (bool3 != null) {
            A0K("is_group", bool3.booleanValue());
        }
        int i = A0F;
        A0F = i + 1;
        A0G("count_since_cold_start", i);
    }
}
